package com.javaweb.tzhu.entity;

public class Comment {
private Integer commentld;
private Integer orderld;
private Integer customerld;
private String customerComment;
private String commentTime;
private String adminComment;

    public Comment() {
    }

    public Comment(Integer commentld, Integer orderld, Integer customerld, String customerComment, String commentTime, String adminComment) {
        this.commentld = commentld;
        this.orderld = orderld;
        this.customerld = customerld;
        this.customerComment = customerComment;
        this.commentTime = commentTime;
        this.adminComment = adminComment;
    }

    public Integer getCommentld() {
        return commentld;
    }

    public void setCommentld(Integer commentld) {
        this.commentld = commentld;
    }

    public Integer getOrderld() {
        return orderld;
    }

    public void setOrderld(Integer orderld) {
        this.orderld = orderld;
    }

    public Integer getCustomerld() {
        return customerld;
    }

    public void setCustomerld(Integer customerld) {
        this.customerld = customerld;
    }

    public String getCustomerComment() {
        return customerComment;
    }

    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getAdminComment() {
        return adminComment;
    }

    public void setAdminComment(String adminComment) {
        this.adminComment = adminComment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentld=" + commentld +
                ", orderld=" + orderld +
                ", customerld=" + customerld +
                ", customerComment='" + customerComment + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", adminComment='" + adminComment + '\'' +
                '}';
    }
}
