package org.itstep.hometask.infrastructure.notifications;

import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Notificator implements Callback {
    private final OkHttpClient client;
    protected Gson gson;

    public Notificator(OkHttpClient client, Gson gson) {
        this.client = client;
        this.gson = gson;
    }

    @Override
    public void onFailure(@NotNull Call call, @NotNull IOException e) {
        System.out.println(e.getMessage());
    }

    @Override
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        System.out.println("Code: " + response.code());
        stop();
    }

    protected void stop() {
        client.dispatcher().executorService().shutdown();
    }
}
