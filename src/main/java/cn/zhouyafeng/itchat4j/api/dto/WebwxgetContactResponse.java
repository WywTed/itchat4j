package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class WebwxgetContactResponse  extends BaseResponse{
	private Integer MemberCount;
	private List<Contact> MemberList;
	private Long Seq;
}
