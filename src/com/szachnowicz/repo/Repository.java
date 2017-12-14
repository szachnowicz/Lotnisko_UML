package com.szachnowicz.repo;

import java.util.List;

public interface Repository<T> {

    void update(T item);

    void delete(T item);

    void addAll(List<T> itemList);

    void add(T item);
}


