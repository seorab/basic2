package com.ggoreb.basic.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.ggoreb.basic.model.Member;

@Controller
public class HtmlController {
	@GetMapping("html/object")
	public String html() {
		return "html/string"; // 호출할 html 지정
	}

	@GetMapping("html/string")
	@ResponseBody
	public Member htmlObject() {
		Member member = new Member();
		member.setName("kim");
		return member;  // 호출할 html 없음 (url대로 파일 찾음)
	}

	@GetMapping("html/void")
	public void htmlVoid() {
	}

	@GetMapping("html/map")
	public Map<String, Object> htmlMap(Map<String, Object> map) {
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("aaa", 1234);
		return map2;
	}

	@GetMapping("html/model")
	public Model htmlModel(Model model) {
		return model;
	}

	@GetMapping("html/model_and_view")
	public ModelAndView htmlModel() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("html/model_and_view");
		return mav;
	}

}





