package org.itstep.hometask.application.storage.authors.notifications;

import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.itstep.hometask.infrastructure.notifications.Notificator;
import org.jetbrains.annotations.NotNull;

public final class AuthorCreated extends Notificator {
    public AuthorCreated(OkHttpClient client, Gson gson) {
        super(client, gson);
    }

    @Override
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        System.out.println("\nOperation: Create");
        super.onResponse(call, response);
    }
}
