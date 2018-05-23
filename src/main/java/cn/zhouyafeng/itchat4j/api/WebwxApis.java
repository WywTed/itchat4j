package cn.zhouyafeng.itchat4j.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

import cn.zhouyafeng.itchat4j.api.dto.Contact;
import cn.zhouyafeng.itchat4j.api.dto.WebwxgetContactResponse;
import cn.zhouyafeng.itchat4j.utils.Config;
import cn.zhouyafeng.itchat4j.utils.MyHttpClient;
import cn.zhouyafeng.itchat4j.utils.enums.StorageLoginInfoEnum;
import cn.zhouyafeng.itchat4j.utils.enums.URLEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * web wx apis: scrab from https://wx2.qq.com/
 * @author huhu
 *
 */
@Slf4j
public class WebwxApis {
	
	private static Core core = Core.getInstance();
	private static MyHttpClient httpClient = core.getMyHttpClient();

	
	/**
	 * 发送消息
	 * @param msgType
	 * @param fromUser
	 * @param toUser
	 */
	public static void sendMsg(int msgType, String fromUser, String toUser) {
		
	}

	/**
	 * TODO: 1. 网络请求使用 连接池 
	 * Map<String, Object> paramMap = core.getParamMap();
	 * 
	 * 
	 */
	
	public static Core getContacts(String fromUser, Map<String, Object> paramMap) {
		String url = String.format(URLEnum.WEB_WX_GET_CONTACT.getUrl(),
				core.getLoginInfo().get(StorageLoginInfoEnum.url.getKey()));
		
		HttpEntity entity = httpClient.doPost(url, JSON.toJSONString(paramMap));
		try {
			String result = EntityUtils.toString(entity, Consts.UTF_8);
			WebwxgetContactResponse response = JSON.parseObject(result, WebwxgetContactResponse.class);
			// TODO : 判断网络请求是否正常 
			core.setMemberCount(response.getMemberCount());
			List<Contact> contacts = response.getMemberList();
			// 查看seq是否为0，0表示好友列表已全部获取完毕，若大于0，则表示好友列表未获取完毕，当前的字节数（断点续传）
			// 循环获取seq直到为0，即获取全部好友列表 ==0：好友获取完毕 >0：好友未获取完毕，此时seq为已获取的字节数
			List<BasicNameValuePair> params;
			Long seq = response.getSeq() == null ? 0L : response.getSeq();
			while (seq > 0) {
				params = new ArrayList<BasicNameValuePair>();
				params.add(new BasicNameValuePair("r", String.valueOf(System.currentTimeMillis())));
				params.add(new BasicNameValuePair("seq", String.valueOf(seq)));
				entity = httpClient.doGet(url, params, false, null);
				result = EntityUtils.toString(entity, Consts.UTF_8);
				response = JSON.parseObject(result, WebwxgetContactResponse.class);
				seq = response.getSeq() == null ? 0L : response.getSeq();
				contacts.addAll(response.getMemberList());
			}
			core.setMemberCount(contacts.size());
			if(contacts == null || contacts.isEmpty()) {
				return core;
			}
			for(Contact contact : contacts) {
				if((contact.getVerifyFlag() & 8) != 0) {
					// 公众号/服务号 TODO: 改变 core 中 存储类型 ，改为 实际对象而非 jsonobject
					core.getPublicUsersList().add(contact);
				} else if (Config.API_SPECIAL_USER.contains(contact.getUserName())) { // 特殊账号
					core.getSpecialUsersList().add(contact);
				} else if (contact.getUserName().indexOf("@@") != -1) { // 群聊
					if (!core.getGroupIdList().contains(contact.getUserName())) {
						core.getGroupNickNameList().add(contact.getNickName());
						core.getGroupIdList().add(contact.getUserName());
						core.getGroupList().add(contact);
					}
				} else if (contact.getUserName().equals(core.getUserSelf().getUserName())) { // 自己
					core.getContactList().remove(contact);
				} else { // 普通联系人
					core.getContactList().add(contact);
				}
			}
			return core;
		} catch (Exception e) {
			log.error(ExceptionUtils.getStackTrace(e));
		}
		return core;
	}
	
}
