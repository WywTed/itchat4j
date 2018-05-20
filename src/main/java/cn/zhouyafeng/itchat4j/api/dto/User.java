package cn.zhouyafeng.itchat4j.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	Integer AppAccountFlag;//0
	Integer CountactFlag;//0
	Integer HeadImagFlag;//1
	String HeadImgUrl;
	Integer HideInputBarFlag;//0
	String NickName;
	String PYInitial;
	String PYQuanPin;
	String RemarkName;
	String RemarkPYInitial;
	String RemarkPYQuanPin;
	Integer sex;//1
	String Signature;
	Integer SnsFlag;//49
	Integer StarFriend;//0
	Long Uin;//
	String UserName;//@3c23f7a2e1143c0727b67e2da8b7b0e37264c1643826b910df425d942da195d1
	Integer VerifyFlag;//0
	Integer WebWxPluginSwitch;//0
}
