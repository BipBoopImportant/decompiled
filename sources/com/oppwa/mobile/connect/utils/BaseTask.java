package com.oppwa.mobile.connect.utils;

import java.util.concurrent.Callable;

public abstract class BaseTask<T> implements Callable<T> {
    public T call() {
        return null;
    }

    public void onError(Exception exc) {
        exc.printStackTrace();
    }

    public void onPostExecute(T t10) {
    }
}
