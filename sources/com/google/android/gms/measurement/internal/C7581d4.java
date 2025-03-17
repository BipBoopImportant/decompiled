package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.d4  reason: case insensitive filesystem */
final class C7581d4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f50107a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Uri f50108b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50109c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f50110d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7574c4 f50111e;

    C7581d4(C7574c4 c4Var, boolean z10, Uri uri, String str, String str2) {
        this.f50107a = z10;
        this.f50108b = uri;
        this.f50109c = str;
        this.f50110d = str2;
        this.f50111e = c4Var;
    }

    public final void run() {
        C7574c4.f(this.f50111e, this.f50107a, this.f50108b, this.f50109c, this.f50110d);
    }
}
