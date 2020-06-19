package org.itstep.hometask.application.common.interfaces;

public interface ApiService<TModel, TListModel> {
    void get();

    void create(TModel model);

    void get(int id);
}
