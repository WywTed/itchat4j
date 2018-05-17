package cn.zhouyafeng.itchat4j.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	Integer AttrStatus;//0
	String DisplayName;
	String KeyWord;
	Integer MemberStatus;//0
	String NickName;
	String PYInitial;//
	String PYQuanPin;//
	String RemarkPYInitial;
	String RemarkPYQuanPin;
	Long Uin;
	String UserName;
}
