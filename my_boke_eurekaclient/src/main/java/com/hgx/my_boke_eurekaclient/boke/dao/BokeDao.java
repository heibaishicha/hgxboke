package com.hgx.my_boke_eurekaclient.boke.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hgx.my_boke_api.boke.entity.BokeVo;

@Repository
public interface BokeDao {
	
	/**
	 * 查询出最新的10条博客
	 * @return
	 */
	public List<BokeVo> findRecentBokes();
}
