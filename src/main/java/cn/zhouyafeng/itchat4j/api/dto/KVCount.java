package cn.zhouyafeng.itchat4j.api.dto;

import java.util.List;

import cn.zhouyafeng.itchat4j.api.dto.WebwxinitResponse.KV;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KVCount {
	Integer Count;
	List<KV> list;
}
