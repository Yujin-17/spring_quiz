package com.quiz.lesson01;

public class NoticeBoard {
	
	private String title;
	private String user;
	private String content;		// private로 되어있는 필드는 getter, setter가 꼭 필요하다!
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
