package org.itstep.hometask.application.common.interfaces;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import org.itstep.hometask.application.storage.authors.AuthorsService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface Resolvable {
    @NotNull
    @Contract(" -> new")
    AuthorsService authorsService();

    @NotNull
    @Contract(" -> new")
    Gson gson();

    @NotNull
    @Contract(" -> new")
    OkHttpClient httpClient();
}
