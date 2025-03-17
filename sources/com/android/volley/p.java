package com.android.volley;

import com.android.volley.b;

public class p<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f46245a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f46246b;

    /* renamed from: c  reason: collision with root package name */
    public final u f46247c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46248d;

    public interface a {
        void onErrorResponse(u uVar);
    }

    public interface b<T> {
        void onResponse(T t10);
    }

    private p(T t10, b.a aVar) {
        this.f46248d = false;
        this.f46245a = t10;
        this.f46246b = aVar;
        this.f46247c = null;
    }

    public static <T> p<T> a(u uVar) {
        return new p<>(uVar);
    }

    public static <T> p<T> c(T t10, b.a aVar) {
        return new p<>(t10, aVar);
    }

    public boolean b() {
        return this.f46247c == null;
    }

    private p(u uVar) {
        this.f46248d = false;
        this.f46245a = null;
        this.f46246b = null;
        this.f46247c = uVar;
    }
}
