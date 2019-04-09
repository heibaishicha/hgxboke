package com.hgx.my_boke_api.boke.entity;

import java.io.Serializable;

/**
 * 收藏的博客实体
 * @author hgx
 *
 */
public class MarkBokeVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String markId;
	private String sourceFrom;
	private String internetAddress;
	private String markDescript;
	public MarkBokeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarkBokeVo(String markId, String sourceFrom, String internetAddress,
			String markDescript) {
		super();
		this.markId = markId;
		this.sourceFrom = sourceFrom;
		this.internetAddress = internetAddress;
		this.markDescript = markDescript;
	}
	public String getMarkId() {
		return markId;
	}
	public void setMarkId(String markId) {
		this.markId = markId;
	}
	public String getSourceFrom() {
		return sourceFrom;
	}
	public void setSourceFrom(String sourceFrom) {
		this.sourceFrom = sourceFrom;
	}
	public String getInternetAddress() {
		return internetAddress;
	}
	public void setInternetAddress(String internetAddress) {
		this.internetAddress = internetAddress;
	}
	public String getMarkDescript() {
		return markDescript;
	}
	public void setMarkDescript(String markDescript) {
		this.markDescript = markDescript;
	}
	@Override
	public String toString() {
		return "MarkBokeVo [markId=" + markId + ", sourceFrom=" + sourceFrom
				+ ", internetAddress=" + internetAddress + ", markDescript="
				+ markDescript + "]";
	}

	
}
