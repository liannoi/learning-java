package org.itstep.hometask.infrastructure.mocks;

import org.itstep.hometask.application.common.interfaces.Mocker;
import org.itstep.hometask.application.storage.authors.models.AuthorModel;

import java.util.UUID;

public class AuthorsMocker implements Mocker<AuthorModel> {
    @Override
    public AuthorModel mock() {
        return new AuthorModel("Mock Item", UUID.randomUUID().toString());
    }
}
