package com.hgx.my_boke_api.boke.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hgx.my_boke_api.boke.entity.BokeVo;
import com.hgx.my_boke_api.boke.result.ResponseResult;

public interface BokeController {
	@RequestMapping(value="recent/boke",method=RequestMethod.GET)
	public ResponseResult<List<BokeVo>> findRecentBokes();
}
