package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7459z2;
import java.util.Map;
import sa.X;

public final class M5 {

    /* renamed from: a  reason: collision with root package name */
    private long f49836a;

    /* renamed from: b  reason: collision with root package name */
    private C7459z2 f49837b;

    /* renamed from: c  reason: collision with root package name */
    private String f49838c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f49839d;

    /* renamed from: e  reason: collision with root package name */
    private X f49840e;

    /* renamed from: f  reason: collision with root package name */
    private long f49841f;

    public final long a() {
        return this.f49836a;
    }

    public final C7693t5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry next : this.f49839d.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        return new C7693t5(this.f49836a, this.f49837b.l(), this.f49838c, bundle, this.f49840e.zza(), this.f49841f);
    }

    public final C7735z5 c() {
        return new C7735z5(this.f49838c, this.f49839d, this.f49840e);
    }

    public final C7459z2 d() {
        return this.f49837b;
    }

    public final String e() {
        return this.f49838c;
    }

    private M5(long j10, C7459z2 z2Var, String str, Map<String, String> map, X x10, long j11, long j12) {
        this.f49836a = j10;
        this.f49837b = z2Var;
        this.f49838c = str;
        this.f49839d = map;
        this.f49840e = x10;
        this.f49841f = j12;
    }
}
