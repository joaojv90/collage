package com.cybertools.college.controller;

public interface DAOLogin <T> {

    boolean login(T t);
    boolean register(T t);
}
