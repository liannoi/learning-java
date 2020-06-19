package org.itstep.hometask.application.storage.authors.queries;

import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.itstep.hometask.application.storage.authors.models.AuthorsListViewModel;
import org.itstep.hometask.infrastructure.notifications.Notificator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public final class AuthorsListQuery extends Notificator {
    public AuthorsListQuery(OkHttpClient client, Gson gson) {
        super(client, gson);
    }

    @Override
    public void onResponse(@NotNull Call call, @NotNull Response response) {
        System.out.println("\nOperation: GetAll");
        print(tryGetResult(response));
        super.onResponse(call, response);
    }

    private void print(@NotNull AuthorsListViewModel viewModel) {
        System.out.println("Result:\n");
        viewModel.getAuthors().parallelStream().forEach(System.out::println);
        System.out.println();
    }

    @Nullable
    private AuthorsListViewModel tryGetResult(@NotNull Response response) {
        try {
            return gson.fromJson(response.body().string(), AuthorsListViewModel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO: Replace with throw exception.
        return null;
    }
}
