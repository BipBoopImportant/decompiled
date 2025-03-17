package com.bumptech.glide.load.data;

import com.bumptech.glide.g;

public interface d<T> {

    public interface a<T> {
        void c(Exception exc);

        void e(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    C7.a d();

    void f(g gVar, a<? super T> aVar);
}
