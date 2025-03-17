package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.C7546x;

final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f50556a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7546x f50557b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ DynamiteClearcutLogger f50558c;

    a(DynamiteClearcutLogger dynamiteClearcutLogger, int i10, C7546x xVar) {
        this.f50558c = dynamiteClearcutLogger;
        this.f50556a = i10;
        this.f50557b = xVar;
    }

    public final void run() {
        this.f50558c.zzc.zza(this.f50556a, this.f50557b);
    }
}
