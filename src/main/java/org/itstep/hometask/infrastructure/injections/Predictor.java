package org.itstep.hometask.infrastructure.injections;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import org.itstep.hometask.application.common.interfaces.Resolvable;
import org.itstep.hometask.application.storage.authors.AuthorsService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Acronym for "Primitive Dependency Injector" (PRimitivE Dependency InjeCTOR).
 */
public final class Predictor implements Resolvable {
    @Override
    @NotNull
    @Contract(" -> new")
    public AuthorsService authorsService() {
        return new AuthorsService(httpClient(), gson());
    }

    @Override
    @NotNull
    @Contract(" -> new")
    public Gson gson() {
        return new Gson();
    }

    @Override
    @NotNull
    @Contract(" -> new")
    public OkHttpClient httpClient() {
        return new OkHttpClient();
    }
}
