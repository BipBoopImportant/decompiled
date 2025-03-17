package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class h implements ViewTreeObserver.OnPreDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a  reason: collision with root package name */
    private final Handler f68663a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<View> f68664b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f68665c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f68666d;

    private h(View view, Runnable runnable, Runnable runnable2) {
        this.f68664b = new AtomicReference<>(view);
        this.f68665c = runnable;
        this.f68666d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new h(view, runnable, runnable2));
    }

    public boolean onPreDraw() {
        View andSet = this.f68664b.getAndSet((Object) null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f68663a.post(this.f68665c);
        this.f68663a.postAtFrontOfQueue(this.f68666d);
        return true;
    }
}
