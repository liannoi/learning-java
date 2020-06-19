package org.itstep.hometask.application.storage.authors.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AuthorsListViewModel {
    @SerializedName("authors")
    private List<AuthorModel> authors = null;

    public List<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorModel> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "AuthorsListViewModel{" +
                "authors=" + authors +
                '}';
    }
}
