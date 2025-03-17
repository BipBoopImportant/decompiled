package com.google.android.gms.measurement;

import K9.C6620s;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C7691t3;
import com.google.android.gms.measurement.internal.P2;
import java.util.List;
import java.util.Map;

final class b extends AppMeasurement.a {

    /* renamed from: a  reason: collision with root package name */
    private final P2 f49514a;

    /* renamed from: b  reason: collision with root package name */
    private final C7691t3 f49515b;

    public b(P2 p22) {
        super();
        C6620s.l(p22);
        this.f49514a = p22;
        this.f49515b = p22.G();
    }

    public final void a(String str, String str2, Bundle bundle) {
        this.f49514a.G().i0(str, str2, bundle);
    }

    public final String b() {
        return this.f49515b.z0();
    }

    public final List<Bundle> c(String str, String str2) {
        return this.f49515b.F(str, str2);
    }

    public final void d(String str, String str2, Bundle bundle) {
        this.f49515b.X0(str, str2, bundle);
    }

    public final String e() {
        return this.f49515b.x0();
    }

    public final String f() {
        return this.f49515b.x0();
    }

    public final Map<String, Object> g(String str, String str2, boolean z10) {
        return this.f49515b.G(str, str2, z10);
    }

    public final long i() {
        return this.f49514a.M().N0();
    }

    public final void j(String str) {
        this.f49514a.x().C(str, this.f49514a.zzb().c());
    }

    public final void o(Bundle bundle) {
        this.f49515b.J(bundle);
    }

    public final int zza(String str) {
        return C7691t3.D(str);
    }

    public final void zzb(String str) {
        this.f49514a.x().y(str, this.f49514a.zzb().c());
    }

    public final String zzh() {
        return this.f49515b.y0();
    }
}
