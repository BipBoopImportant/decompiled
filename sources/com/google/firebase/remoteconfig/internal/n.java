package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.d;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f68784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f68785b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f68786c;

    public /* synthetic */ n(d dVar, String str, g gVar) {
        this.f68784a = dVar;
        this.f68785b = str;
        this.f68786c = gVar;
    }

    public final void run() {
        this.f68784a.accept(this.f68785b, this.f68786c);
    }
}
