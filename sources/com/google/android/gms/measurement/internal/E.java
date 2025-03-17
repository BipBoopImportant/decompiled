package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.e;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class E extends C7664p3 {

    /* renamed from: c  reason: collision with root package name */
    private long f49581c;

    /* renamed from: d  reason: collision with root package name */
    private String f49582d;

    E(P2 p22) {
        super(p22);
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.f49581c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f49582d = lowerCase + "-" + lowerCase2;
        return false;
    }

    public final long s() {
        m();
        return this.f49581c;
    }

    public final String t() {
        m();
        return this.f49582d;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
