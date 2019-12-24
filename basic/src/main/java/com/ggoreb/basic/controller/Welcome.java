package com.ggoreb.basic.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {
	
	@GetMapping("/welcome")
//	@RequestMapping("/welcome")
	//                   HTML Template 에게 넘겨줄 데이터
//	public String welcome(Model model) {
	public Map<String, Object> welcome() {
		Map<String, Object> result = new HashMap<>();
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
//		model.addAttribute("key1", list);
		result.put("key1", list);
		
		Map<String, Object> map = new HashMap<>();
		map.put("a", "value a");
		map.put("b", "value b");
//		model.addAttribute("key2", map);
		result.put("key2", map);
		return result;
	}
}








