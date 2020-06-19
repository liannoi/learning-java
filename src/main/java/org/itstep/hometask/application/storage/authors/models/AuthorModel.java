package org.itstep.hometask.application.storage.authors.models;

import com.google.gson.annotations.SerializedName;

public class AuthorModel {
    @SerializedName("authorId")
    private int authorId;

    @SerializedName("authorName")
    private String authorName;

    @SerializedName("authorLastName")
    private String authorLastName;

    public AuthorModel(String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }

    public AuthorModel(int authorId, String authorName, String authorLastName) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return "AuthorModel{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                '}';
    }
}