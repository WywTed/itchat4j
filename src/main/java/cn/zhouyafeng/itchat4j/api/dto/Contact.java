package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
	String Alias;
	Integer AppAccountFlag;//0
	Integer AttrStatus;//0
	Integer ChatRoomId;//0
	String City;
	String ContactFlag;//2
	String DisplayName;
	String EncryChatRoomId;//
	String HeadImgUrl;
	Integer HideInputBarFlag;
	Integer IsOwner;
	Integer MemberCount;
	String KeyWord;
	List<Member> MemberList;
	String NickName;
	Long OwnerUin;
	String PYInitial;// WJCSZS
	String PYQuanPin;//wenjianchuanshuzhushou
	String Province;
	String RemarkName;
	String RemarkPYInitial;
	String RemarkPYQuanPin;
	Integer sex;//0
	String Signature;
	Integer SnsFlag;//0
	Integer StarFriend;//0
	Integer Statues;//0
	Long Uin;
	Long UinFriend;
	String UserName;//filehelper
	Integer VerifyFlag;//0
}
