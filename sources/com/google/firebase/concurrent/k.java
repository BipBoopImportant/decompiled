package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f68212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f68213b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f68214c;

    public /* synthetic */ k(o oVar, Callable callable, p.b bVar) {
        this.f68212a = oVar;
        this.f68213b = callable;
        this.f68214c = bVar;
    }

    public final Object call() {
        return this.f68212a.r(this.f68213b, this.f68214c);
    }
}
