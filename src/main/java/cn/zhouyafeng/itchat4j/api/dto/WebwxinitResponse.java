package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebwxinitResponse extends BaseResponse{

	
	private String ChatSet;
	private String ClickReportInterval;
	private Long ClientVersion;
	private Integer Count;
	private Integer GrayScale;
	private Integer InviteStartCount;
	private Integer MPSubscribeMsgCount;
	private Long SystemTime;
	private List<MPSubscribeMsg> MPSubscribeMsgList;
	private List<Contact> ContactList; 
	private User User;
	private String SKey; // @crypt_872d76b3_9fef3c78594328656ac6c039109b4a68
	private KVCount syncKey;
	
	@Getter
	@Setter
	class MPSubscribeMsg{
		
	}
}
