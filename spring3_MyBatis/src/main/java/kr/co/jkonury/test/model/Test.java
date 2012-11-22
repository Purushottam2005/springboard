package kr.co.jkonury.test.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Test {
	private int id;
	private String title;
	private String content;
	private String rmYn;
	private String regDate;
	private String rmDate;
	private int inquiryCount;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public Test(int id, String title, String content, String rmYn,
			String regDate, String rmDate, int inquiryCount) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.rmYn = rmYn;
		this.regDate = regDate;
		this.rmDate = rmDate;
		this.inquiryCount = inquiryCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRmYn() {
		return rmYn;
	}

	public void setRmYn(String rmYn) {
		this.rmYn = rmYn;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRmDate() {
		return rmDate;
	}

	public void setRmDate(String rmDate) {
		this.rmDate = rmDate;
	}

	public int getInquiryCount() {
		return inquiryCount;
	}

	public void setInquiryCount(int inquiryCount) {
		this.inquiryCount = inquiryCount;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
