package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebwxbatchgetcontactResponse extends BaseResponse{

	private Integer Count;
	private List<Contact> ContactList;
}
