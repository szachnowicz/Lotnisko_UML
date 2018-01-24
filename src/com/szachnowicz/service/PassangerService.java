package com.szachnowicz.service;

import fit.ColumnFixture;

import java.util.HashMap;
import java.util.Map;

public class PassangerService {

    private String name;
    private int id;
    private int passLimit;

    public PassangerService() {
        passLimit = 5;
    }

    public Map<Integer, String> map = new HashMap<>();

    public String addPassanger() {
        if (!map.containsKey(id) || count() <= passLimit) {
            map.put(id, name);
            return "Dodano";
        } else {
            return "bład";
        }
    }

    public int count() {
        return map.size();
    }

    public boolean isFull() {
        return count() >= passLimit;
    }

    /// standardowe getery i setery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
