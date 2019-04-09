package com.hgx.hgxboke_ui.commons;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {

	private int cpage;//当前页数
	private int pageNums;//总页数 
	private int total;//总条数
	private int pageSize;//一页多少条
	private List<T> data = new ArrayList<T>();//查询的数据
	public PageResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageResult(int cpage, int pageNums, int total, int pageSize,
			List<T> data) {
		super();
		this.cpage = cpage;
		this.pageNums = pageNums;
		this.total = total;
		this.pageSize = pageSize;
		this.data = data;
	}
	public int getCpage() {
		return cpage;
	}
	public void setCpage(int cpage) {
		this.cpage = cpage;
	}
	public int getPageNums() {
		return total%pageSize==0?total/pageSize:((total/pageSize)+1);
	}
	public void setPageNums(int pageNums) {
		this.pageNums = pageNums;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PageResult [cpage=" + cpage + ", pageNums=" + pageNums
				+ ", total=" + total + ", pageSize=" + pageSize + ", data="
				+ data + "]";
	}
	
	
	
}
