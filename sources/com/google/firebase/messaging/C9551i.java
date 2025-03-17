package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* renamed from: com.google.firebase.messaging.i  reason: case insensitive filesystem */
public final /* synthetic */ class C9551i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f68454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f68455b;

    public /* synthetic */ C9551i(Context context, Intent intent) {
        this.f68454a = context;
        this.f68455b = intent;
    }

    public final Object call() {
        return Integer.valueOf(X.b().g(this.f68454a, this.f68455b));
    }
}
