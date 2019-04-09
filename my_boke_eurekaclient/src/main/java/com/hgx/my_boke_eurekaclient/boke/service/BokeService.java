package com.hgx.my_boke_eurekaclient.boke.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hgx.my_boke_api.boke.entity.BokeVo;
import com.hgx.my_boke_eurekaclient.boke.dao.BokeDao;

@Transactional
@Service
public class BokeService {

	@Autowired
	private BokeDao bokeDao;
	
	/**
	 * 查询出最新的10条博客
	 * @return
	 */
	public List<BokeVo> findRecentBokes(){
		return bokeDao.findRecentBokes();
	}
}
