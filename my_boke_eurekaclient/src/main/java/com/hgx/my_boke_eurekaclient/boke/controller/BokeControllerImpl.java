package com.hgx.my_boke_eurekaclient.boke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hgx.my_boke_api.boke.controller.BokeController;
import com.hgx.my_boke_api.boke.entity.BokeVo;
import com.hgx.my_boke_api.boke.result.ResponseResult;
import com.hgx.my_boke_eurekaclient.boke.service.BokeService;

@RestController
public class BokeControllerImpl implements BokeController{
	
	@Autowired
	private BokeService bokeService;
	
	/**
	 * 获取最新 10条博客
	 */
	@Override
	public ResponseResult<List<BokeVo>> findRecentBokes() {
		ResponseResult<List<BokeVo>> result = new ResponseResult<List<BokeVo>>();
		try{
			List<BokeVo> bokes = bokeService.findRecentBokes();
			result.setCode("200");
			result.setData(bokes);
			result.setMessage("获取最新10条博客成功");
		}catch(Exception e){
			result.setCode("500");
			result.setMessage("获取最新10条博客失败");
		}
		return result;
	}

}
