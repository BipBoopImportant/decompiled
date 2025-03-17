package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

public class e implements ViewTreeObserver.OnDrawListener {
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a  reason: collision with root package name */
    private final Handler f68657a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<View> f68658b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f68659c;

    private e(View view, Runnable runnable) {
        this.f68658b = new AtomicReference<>(view);
        this.f68659c = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void c(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new e(view, runnable));
    }

    public void onDraw() {
        View andSet = this.f68658b.getAndSet((Object) null);
        if (andSet != null) {
            andSet.getViewTreeObserver().addOnGlobalLayoutListener(new d(this, andSet));
            this.f68657a.postAtFrontOfQueue(this.f68659c);
        }
    }
}
