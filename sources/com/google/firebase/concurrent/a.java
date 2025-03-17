package com.google.firebase.concurrent;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f68177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f68178b;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f68177a = bVar;
        this.f68178b = runnable;
    }

    public final void run() {
        this.f68177a.b(this.f68178b);
    }
}
