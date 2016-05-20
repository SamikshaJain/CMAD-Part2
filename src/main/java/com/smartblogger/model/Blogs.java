package com.smartblogger.model;


import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;
import org.mongodb.morphia.converters.TimestampConverter;


@Entity("blog")
@Indexes(
    @Index(value = "tag", fields = @Field("tag"))
)
public class Blogs {
	@Id
    private ObjectId blogid;
	private String title;
	private String content;
	private TimestampConverter createTime;
	private TimestampConverter lastupdateTime;
	private long viewCount;
	private ObjectId userid;
	@Embedded 
	private List<Comment> comments;
	public ObjectId getBlogid() {
		return blogid;
	}
	public void setBlogid(ObjectId blogid) {
		this.blogid = blogid;
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
	public TimestampConverter getCreateTime() {
		return createTime;
	}
	public void setCreateTime(TimestampConverter createTime) {
		this.createTime = createTime;
	}
	public TimestampConverter getLastupdateTime() {
		return lastupdateTime;
	}
	public void setLastupdateTime(TimestampConverter lastupdateTime) {
		this.lastupdateTime = lastupdateTime;
	}
	public long getViewCount() {
		return viewCount;
	}
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}
	public ObjectId getUserid() {
		return userid;
	}
	public void setUserid(ObjectId userid) {
		this.userid = userid;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
    
    
    
}
