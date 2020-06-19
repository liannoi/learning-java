package org.itstep.hometask.infrastructure.services;

import com.google.gson.Gson;
import okhttp3.*;
import org.itstep.hometask.application.common.interfaces.ApiService;
import org.itstep.hometask.infrastructure.notifications.Notificator;

public abstract class AbstractApiService<TModel, TListModel> implements ApiService<TModel, TListModel> {
    protected OkHttpClient client;
    protected String endpoint;
    protected Gson gson;

    protected AbstractApiService(OkHttpClient client, Gson gson) {
        this.client = client;
        this.gson = gson;
    }

    @Override
    public void create(TModel model) {
        create(model, new Notificator(client, gson));
    }

    protected void create(TModel model, Callback callback) {
        client.newCall(new Request.Builder()
                .url(endpoint)
                .post(RequestBody.create(gson.toJson(model), MediaType.parse("application/json")))
                .build()
        ).enqueue(callback);
    }
}
