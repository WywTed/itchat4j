package cn.zhouyafeng.itchat4j.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebwxsendmsgResponse extends BaseResponse {

	private String LocalID;
	private String MsgID;
	
}
