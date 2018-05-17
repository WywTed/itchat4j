package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WxcreatchatroomResponse extends BaseResponse{

	private String BlackList;
	private String ChatRoomName;
	private Integer MemberCount;
	List<Member> MemberList;
	private String PYInitial;
	private String QuanPin;
	private String Topic;
	
}
