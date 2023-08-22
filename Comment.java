package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Comment {
	@Id
	private long commentId;
	
	@Column(length = 500,  nullable = false)
	private String content; //he is working hard
	
	
	
	
	public long getCommentId() {
		return commentId;
	}




	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}




	public String getContent() {
		return content;
	}




	public void setContent(String content) {
		this.content = content;
	}



	@ManyToOne
	@JoinColumn(name = "userId")
	private Employee emp;




	public Employee getEmp() {
		return emp;
	}




	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
