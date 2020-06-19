package org.itstep.hometask.application.storage.authors;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.itstep.hometask.application.ApplicationDefaults;
import org.itstep.hometask.application.storage.authors.models.AuthorModel;
import org.itstep.hometask.application.storage.authors.models.AuthorsListViewModel;
import org.itstep.hometask.application.storage.authors.notifications.AuthorCreated;
import org.itstep.hometask.application.storage.authors.queries.AuthorsListQuery;
import org.itstep.hometask.infrastructure.services.AbstractApiService;

public final class AuthorsService extends AbstractApiService<AuthorModel, AuthorsListViewModel> {
    public AuthorsService(OkHttpClient client, Gson gson) {
        super(client, gson);
        endpoint = ApplicationDefaults.AUTHORS_ENDPOINT;
    }

    @Override
    public void get() {
        client.newCall(new Request.Builder().url(endpoint).build()).enqueue(new AuthorsListQuery(client, gson));
    }

    @Override
    public void create(AuthorModel authorModel) {
        super.create(authorModel, new AuthorCreated(client, gson));
    }

    @Override
    public void get(int id) {
    }
}
