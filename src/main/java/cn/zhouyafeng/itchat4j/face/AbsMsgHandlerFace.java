package cn.zhouyafeng.itchat4j.face;

import cn.zhouyafeng.itchat4j.beans.BaseMsg;

public class AbsMsgHandlerFace implements IMsgHandlerFace{

	@Override
	public String textMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public String picMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public String voiceMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public String viedoMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public String nameCardMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public void sysMsgHandle(BaseMsg msg) {
		
	}

	@Override
	public String verifyAddFriendMsgHandle(BaseMsg msg) {
		return null;
	}

	@Override
	public String mediaMsgHandle(BaseMsg msg) {
		return null;
	}

}
