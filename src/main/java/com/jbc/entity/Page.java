package com.jbc.entity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.annotation.JSONField;

public class Page {
	@JSONField(serialize = false)
	private int start;
	@JSONField(serialize = false)
	private int length;
	private int draw;
	private int recordsTotal;
	private int recordsFiltered;
	private List<?> data = new ArrayList<>();

	public Page() {

	}

	public Page(int totalCount, List<?> data) {
		super();
		this.recordsTotal = totalCount;
		this.recordsFiltered = totalCount;
		this.data = data;

	}

	public Page(HttpServletRequest request) {
		try {
			this.start = Integer.parseInt(request.getParameter("start"));
		} catch (Exception e) {
			this.start = 0;
		}
		try {
			this.length = Integer.parseInt(request.getParameter("length"));
		} catch (Exception e) {
			this.length = 10;
		}
		try {
			this.draw = Integer.parseInt(request.getParameter("draw"));
		} catch (Exception e) {
			this.draw = 1;
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public int getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
