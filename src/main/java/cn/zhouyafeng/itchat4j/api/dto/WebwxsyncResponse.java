package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebwxsyncResponse extends BaseResponse{

	private Integer AddMsgCount;
	private List<Msg> AddMsgList;
	private Integer ContinueFlag;
	private Integer DelContactCount;
	private List<Contact> DelContactList;
	private Integer ModChatRoomMemberCount;
	private List<ChatRoomMember> ModChatRoomMemberList;
	private Integer ModContactCount;
	private List<Contact> ModContactList;
	private Profile Profile;
	private String Skey;
	private KVCount SyncCheckKey;
	private KVCount syncKey;
	
	@Getter
	@Setter
	class Profile{
		String Alias;
		Buff BindEmail;
		Buff BindMobile;
		Integer BindUin;
		Integer BitFlag;
		Integer HeadImgUpdateFlag;
		String HeadImgUrl;
		String NickName;
		Integer PersonalCard;
		Integer Sex;
		Integer Status;
		String signature;
		Buff UserName;
		
	}
	
	@Getter
	@Setter
	class ChatRoomMember{
		
	}
	
	@Getter
	@Setter
	class Msg{
		AppInfo appInfo;
		Integer AppMsgType;//0
		String Content;//@31ef67b2c38336ddfa2c1216bdc5aeeddceeb1fc880d5b62713e2ff8d9c6ce6a:<br/>@2093119de1120d2023c519e1a52e420dacffa837f73002050e7c2ba7ede30187ad2c89c1afda4ecacb61545ba3eda7309597de04319f6d281a0683ad34f646741f3fa198c9028cec5a23cc4eee974282286205fceb89483e85c7da37246e75b35b1f5eb70a74a67c422221fe6303c07321bcd2427d964369ae6114cc75973e4f837e16911da10cc2cbaf4fef3964e06fec94df276fec5f4197c40cf031fc90b5a101cca6ccfffea02386128dffb8179a9c9cee610542b35e37914f59add7728e14901c564884905229464fed3e152136f46708915fc3d5492073b6af94e627af61cc259040ee38691d3c427c1bd298dc4dd106255ab7d42c913fcdf884120e4b114ab51849abbb87f8bc0bc6907883e2923e39ed14852431684968704c3458eaf343d28c7ebeb0bffe537a2764e4266df4fbc4c7b2fe68c37e2759d2a7fff59c8616f6aefe42916248719c6252a7e83a7ca490d8bb60905aa7a5c9590ac44422a0dd3f2e62061b5d71c1b7db2479c4c51508bdd65e2c60a16913066e5e774686b4b309d10901b0691cc62557179a1c48873ef9c13e125f9d1abeebebf89c42879b251509387bac9a0f4459bc65e07b6cef9368e1b58fdb9653ddd74a2f0c7504c1b14254f4da6da0394e00c711110026fde9b3507340920e275cee5ed0e4dca820574e00b6089ddff719d158463f434c137d5f6585377bc0400f54d11e16719041e020b23335c95492c7a9fbf3b662b88f3b29cfa5984714543b4773a03af31eade5d0bf21b863e56e283c0dbbf6b1460b950703afcc4299bf1fd51c0e1d8b4ebfcdcc9ce087cd64a462aeb47010c0a2a0b9c8cb2443636fff20146faa9c4032bdc25fe441a59fa78e24d93bdece9c6754ca137f32d47f25e6e99028a03351f60828f6c011249f6d3012189220aa8c0e9ae9f0df2116bd41e301f72e338e912ef1e3b2b66d20b459df715d8f48cf835b25458e40b6d252d56de0a8a3691c1fa4
		Long CreateTime;
		String EncryFileName;
		String FileName;
		String FileSize;
		Integer ForwardFlag;//0
		String FromUserName;//@@448341f91bc67760664fbe74c14acdf83b768bc08d178ad0530af75db07327a9
		Integer HasProductId;//0
		Integer ImgHeight;//120
		Integer ImgStatus;//2
		Integer ImgWidth;//68
		String MediaId;//
		String MsgId;//
		Integer MsgType;//3
		Long NewMsgId;//
		String OriContent;
		Integer PlayLength;//0
		RecommendInfo recommendInfo;
		Integer Status;
		Integer StatusNotifyCode;//0
		String StatusNotifyUserName;//
		Integer SubMsgType;//0
		String Ticket;
		String ToUserName;//@3c23f7a2e1143c0727b67e2da8b7b0e37264c1643826b910df425d942da195d1
		String Url;
		Integer VoiceLength;//0
		
	}
}
