package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.g4  reason: case insensitive filesystem */
public final /* synthetic */ class C7602g4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C7609h4 f50148a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f50149b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Exception f50150c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ byte[] f50151d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Map f50152e;

    public /* synthetic */ C7602g4(C7609h4 h4Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f50148a = h4Var;
        this.f50149b = i10;
        this.f50150c = exc;
        this.f50151d = bArr;
        this.f50152e = map;
    }

    public final void run() {
        this.f50148a.f50170c.a(this.f50148a.f50171d, this.f50149b, this.f50150c, this.f50151d, this.f50152e);
    }
}
