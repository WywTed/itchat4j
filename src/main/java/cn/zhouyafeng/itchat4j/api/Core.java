package cn.zhouyafeng.itchat4j.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.zhouyafeng.itchat4j.api.dto.Contact;
import cn.zhouyafeng.itchat4j.api.dto.Member;
import cn.zhouyafeng.itchat4j.beans.BaseMsg;
import cn.zhouyafeng.itchat4j.utils.MyHttpClient;
import cn.zhouyafeng.itchat4j.utils.enums.parameters.BaseParaEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * 核心存储类，全局只保存一份，单例模式
 * 
 * @author https://github.com/yaphone
 * @date 创建时间：2017年4月23日 下午2:33:56
 * @version 1.0
 *
 */

@Getter
@Setter
public class Core {

	private static volatile Core instance;

	private Core() {}

	public static Core getInstance() {
		if (instance == null) {
			synchronized (Core.class) {
				instance = new Core();
			}
		}
		return instance;
	}

	boolean alive = false;
	private int memberCount = 0;

	private String indexUrl;

	private String userName;
	private String nickName;
	private List<BaseMsg> msgList = new ArrayList<BaseMsg>();

	
	
	private WxapiDataHandler apiDataHandler;
	
	private Contact userSelf; // 登陆账号自身信息
	private List<Contact> memberList = new ArrayList<>(); // 好友+群聊+公众号+特殊账号
	private List<Contact> contactList = new ArrayList<>();// 好友
	private List<Contact> groupList = new ArrayList<>();; // 群
	
	private Map<String, List<Member>> groupMemeberMap = new HashMap<>(); // 群聊成员字典 String, JSONArray
	
	private List<Contact> publicUsersList = new ArrayList<>();;// 公众号／服务号
	private List<Contact> specialUsersList = new ArrayList<>();;// 特殊账号
	private List<String> groupIdList = new ArrayList<String>(); // 群ID列表
	private List<String> groupNickNameList = new ArrayList<String>(); // 群NickName列表

	private Map<String, Contact> userInfoMap = new HashMap<>();

	Map<String, Object> loginInfo = new HashMap<String, Object>();
//	 CloseableHttpClient httpClient = HttpClients.createDefault();
	MyHttpClient myHttpClient = MyHttpClient.getInstance();
	String uuid = null;

	boolean useHotReload = false;
	String hotReloadDir = "itchat.pkl";
	int receivingRetryCount = 5;

	private long lastNormalRetcodeTime; // 最后一次收到正常retcode的时间，秒为单位

	/**
	 * 请求参数
	 */
	public Map<String, Object> getParamMap() {
		return new HashMap<String, Object>(1) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				Map<String, String> map = new HashMap<String, String>();
				for (BaseParaEnum baseRequest : BaseParaEnum.values()) {
					map.put(baseRequest.para(), getLoginInfo().get(baseRequest.value()).toString());
				}
				put("BaseRequest", map);
			}
		};
	}

	public boolean isAlive() {
		return alive;
	}

}
