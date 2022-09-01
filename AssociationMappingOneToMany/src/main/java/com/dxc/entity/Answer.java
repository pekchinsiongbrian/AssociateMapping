package com.dxc.entity;

import jakarta.persistence.*;

@Entity
@Table(name="answer")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String answerName;
	private String postedBy;
	public int getId() {
		return id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
}
