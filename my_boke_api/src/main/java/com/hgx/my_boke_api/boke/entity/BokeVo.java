package com.hgx.my_boke_api.boke.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 博客实体
 * @author hgx
 *
 */
public class BokeVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bokeId;
	private String bokeTitle;
	private String bokeDescript;
	private String bokeHtmlText;
	private String bokeText;
	private String bokeCreateTime;
	private String bokeUpdateTime;
	private String bokeKeyword;
	private String bokeClass;
	private String bokeClassName;
	private String userId;
	private String nickname;
	public BokeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BokeVo(String bokeId, String bokeTitle, String bokeDescript,
			String bokeHtmlText, String bokeText, String bokeCreateTime,
			String bokeUpdateTime, String bokeKeyword, String bokeClass,
			String bokeClassName, String userId, String nickname) {
		super();
		this.bokeId = bokeId;
		this.bokeTitle = bokeTitle;
		this.bokeDescript = bokeDescript;
		this.bokeHtmlText = bokeHtmlText;
		this.bokeText = bokeText;
		this.bokeCreateTime = bokeCreateTime;
		this.bokeUpdateTime = bokeUpdateTime;
		this.bokeKeyword = bokeKeyword;
		this.bokeClass = bokeClass;
		this.bokeClassName = bokeClassName;
		this.userId = userId;
		this.nickname = nickname;
	}
	public String getBokeId() {
		return bokeId;
	}
	public void setBokeId(String bokeId) {
		this.bokeId = bokeId;
	}
	public String getBokeTitle() {
		return bokeTitle;
	}
	public void setBokeTitle(String bokeTitle) {
		this.bokeTitle = bokeTitle;
	}
	public String getBokeDescript() {
		return bokeDescript;
	}
	public void setBokeDescript(String bokeDescript) {
		this.bokeDescript = bokeDescript;
	}
	public String getBokeHtmlText() {
		return bokeHtmlText;
	}
	public void setBokeHtmlText(String bokeHtmlText) {
		this.bokeHtmlText = bokeHtmlText;
	}
	public String getBokeText() {
		return bokeText;
	}
	public void setBokeText(String bokeText) {
		this.bokeText = bokeText;
	}
	public String getBokeCreateTime() {
		return bokeCreateTime;
	}
	public void setBokeCreateTime(String bokeCreateTime) {
		this.bokeCreateTime = bokeCreateTime;
	}
	public String getBokeUpdateTime() {
		return bokeUpdateTime;
	}
	public void setBokeUpdateTime(String bokeUpdateTime) {
		this.bokeUpdateTime = bokeUpdateTime;
	}
	public String getBokeKeyword() {
		return bokeKeyword;
	}
	public void setBokeKeyword(String bokeKeyword) {
		this.bokeKeyword = bokeKeyword;
	}
	public String getBokeClass() {
		return bokeClass;
	}
	public void setBokeClass(String bokeClass) {
		this.bokeClass = bokeClass;
	}
	public String getBokeClassName() {
		return bokeClassName;
	}
	public void setBokeClassName(String bokeClassName) {
		this.bokeClassName = bokeClassName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "BokeVo [bokeId=" + bokeId + ", bokeTitle=" + bokeTitle
				+ ", bokeDescript=" + bokeDescript + ", bokeHtmlText="
				+ bokeHtmlText + ", bokeText=" + bokeText + ", bokeCreateTime="
				+ bokeCreateTime + ", bokeUpdateTime=" + bokeUpdateTime
				+ ", bokeKeyword=" + bokeKeyword + ", bokeClass=" + bokeClass
				+ ", bokeClassName=" + bokeClassName + ", userId=" + userId
				+ ", nickname=" + nickname + "]";
	}
	

}
