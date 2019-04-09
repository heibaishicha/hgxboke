package com.hgx.hgxboke_ui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hgx.hgxboke_ui.feign.BokeFeign;
import com.hgx.my_boke_api.boke.entity.BokeVo;
import com.hgx.my_boke_api.boke.result.ResponseResult;

@Controller
public class BokeController {
	
	@Autowired
	private BokeFeign bokeFeign;
	
	/**
	 * 关于我
	 * @return
	 */
	@RequestMapping("about_me")
	public String aboutMe(){
		return "about_me";
	}
	
	/**
	 * 主页,查询出最新的10条博客
	 * @return
	 */
	@RequestMapping("index")
	public String index(HttpServletRequest request){
		ResponseResult<List<BokeVo>> result = bokeFeign.findRecentBokes();
		if("200".equals(result.getCode())){
			request.setAttribute("data", result.getData());
		}
		return "index";
	}
	
	/**
	 * 博客列表
	 * @param request
	 * @return
	 */
	@RequestMapping("list")
	public String pageList(HttpServletRequest request){
		
		
		return "list";
	}
	
	/**
	 * 收藏记录
	 * @return
	 */
	@RequestMapping("mark")
	public String bookMarkListPage(){
		
		return "book_mark";
	}
	
	/**
	 * 跳转到写博客页面
	 * @return
	 */
	@RequestMapping("write")
	public String toWriteBokeJsp(){
		return "write_boke";
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("boke_info")
	public String bokeInfo(HttpServletRequest request){
		return "info";
	}
}
