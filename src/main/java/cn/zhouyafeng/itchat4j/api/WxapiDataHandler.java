package cn.zhouyafeng.itchat4j.api;

import java.util.List;

import cn.zhouyafeng.itchat4j.api.dto.Contact;

public interface WxapiDataHandler {

	void onGetContact(List<Contact> contact);
}
