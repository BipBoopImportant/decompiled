package androidx.camera.core.impl;

import ob.C10101e;

/* renamed from: androidx.camera.core.impl.f0  reason: case insensitive filesystem */
public final /* synthetic */ class C5021f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C10101e f16896a;

    public /* synthetic */ C5021f0(C10101e eVar) {
        this.f16896a = eVar;
    }

    public final void run() {
        this.f16896a.cancel(true);
    }
}
