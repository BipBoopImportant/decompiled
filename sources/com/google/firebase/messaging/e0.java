package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class e0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f68418a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f68419b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68420c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ I f68421d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ D f68422e;

    public /* synthetic */ e0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, I i10, D d10) {
        this.f68418a = context;
        this.f68419b = scheduledExecutorService;
        this.f68420c = firebaseMessaging;
        this.f68421d = i10;
        this.f68422e = d10;
    }

    public final Object call() {
        return f0.i(this.f68418a, this.f68419b, this.f68420c, this.f68421d, this.f68422e);
    }
}
