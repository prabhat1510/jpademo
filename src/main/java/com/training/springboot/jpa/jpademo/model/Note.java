package com.training.springboot.jpa.jpademo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value= {"createdAt","modifiedAt"},allowGetters=true)
public class Note implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String content;
	@Column(nullable= false,updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
	@Column(nullable= false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date modifiedAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
}
