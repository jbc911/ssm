package com.jbc.entity;

import java.io.Serializable;

public class ScoreInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949356234521169253L;

	private Integer id;

	private String no;

	private String name;

	private Integer grade;

	private Integer clazz;

	private Double math;

	private Double english;

	private Double chinese;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no == null ? null : no.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getClazz() {
		return clazz;
	}

	public void setClazz(Integer clazz) {
		this.clazz = clazz;
	}

	public Double getMath() {
		return math;
	}

	public void setMath(Double math) {
		this.math = math;
	}

	public Double getEnglish() {
		return english;
	}

	public void setEnglish(Double english) {
		this.english = english;
	}

	public Double getChinese() {
		return chinese;
	}

	public void setChinese(Double chinese) {
		this.chinese = chinese;
	}
}