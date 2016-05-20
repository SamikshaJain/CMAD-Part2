package com.smartblogger.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.converters.TimestampConverter;

@Indexes(
	    @Index(value = "text", fields = @Field("text"))
	)
@Embedded("comments")
public class Comment {
	@Id
	private int  commentid;
	private String text;
	private TimestampConverter commentTime;
	private ObjectId userid;
	public int getCommentid() {
		return commentid;
	}
	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public TimestampConverter getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(TimestampConverter commentTime) {
		this.commentTime = commentTime;
	}
	public ObjectId getUserid() {
		return userid;
	}
	public void setUserid(ObjectId userid) {
		this.userid = userid;
	}

	
}
