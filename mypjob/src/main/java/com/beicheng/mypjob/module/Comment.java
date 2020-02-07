package com.beicheng.mypjob.module;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_comment")
public class Comment {

    @Id
    @GeneratedValue
    private long id;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
