package cn.zhouyafeng.itchat4j.api.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class WebwxsendmsgResponse extends BaseResponse {
	
	/**
	 * Ret: 1204, 
	 */
	

	private String LocalID;
	private String MsgID;
	
}
