package org.itstep.hometask;

import org.itstep.hometask.application.common.interfaces.ApiService;
import org.itstep.hometask.application.storage.authors.models.AuthorModel;
import org.itstep.hometask.application.storage.authors.models.AuthorsListViewModel;
import org.itstep.hometask.infrastructure.injections.Predictor;
import org.itstep.hometask.infrastructure.mocks.AuthorsMocker;

public class Main {
    public static void main(String[] args) {
        ApiService<AuthorModel, AuthorsListViewModel> authorsService = new Predictor().authorsService();
        authorsService.create(new AuthorsMocker().mock());
        authorsService.get();
    }
}
