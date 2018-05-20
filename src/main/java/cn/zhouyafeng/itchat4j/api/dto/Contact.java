package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contact {
	Long Uin;
	String UserName;//filehelper
	String NickName;
	String HeadImgUrl;
	Integer MemberCount;
	List<Member> MemberList;
	String RemarkName;
	Integer HideInputBarFlag;
	Integer sex;//0
	String Signature;
	Integer AppAccountFlag;//0
	Integer ChatRoomId;//0
	Integer VerifyFlag;//0
	Long OwnerUin;
	String PYInitial;// WJCSZS
	String PYQuanPin;//wenjianchuanshuzhushou
	String RemarkPYInitial;
	String RemarkPYQuanPin;
	Integer StarFriend;//0
	Integer Statues;//0
	Long AttrStatus;//0
	String City;
	String Alias;
	String ContactFlag;//2
	String DisplayName;
	String EncryChatRoomId;//
	Integer IsOwner;
	String KeyWord;
	String Province;
	Integer SnsFlag;//0
	Long UniFriend;
}
