package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    final String f49566a;

    /* renamed from: b  reason: collision with root package name */
    final String f49567b;

    /* renamed from: c  reason: collision with root package name */
    final String f49568c;

    /* renamed from: d  reason: collision with root package name */
    final long f49569d;

    /* renamed from: e  reason: collision with root package name */
    final long f49570e;

    /* renamed from: f  reason: collision with root package name */
    final F f49571f;

    D(P2 p22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        F f10;
        C6620s.f(str2);
        C6620s.f(str3);
        this.f49566a = str2;
        this.f49567b = str3;
        this.f49568c = TextUtils.isEmpty(str) ? null : str;
        this.f49569d = j10;
        this.f49570e = j11;
        if (j11 != 0 && j11 > j10) {
            p22.f().J().b("Event created with reverse previous/current timestamps. appId", C7607h2.t(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            f10 = new F(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    p22.f().E().a("Param name can't be null");
                    it.remove();
                } else {
                    Object q02 = p22.M().q0(next, bundle2.get(next));
                    if (q02 == null) {
                        p22.f().J().b("Param value can't be null", p22.C().f(next));
                        it.remove();
                    } else {
                        p22.M().M(bundle2, next, q02);
                    }
                }
            }
            f10 = new F(bundle2);
        }
        this.f49571f = f10;
    }

    /* access modifiers changed from: package-private */
    public final D a(P2 p22, long j10) {
        return new D(p22, this.f49568c, this.f49566a, this.f49567b, this.f49569d, j10, this.f49571f);
    }

    public final String toString() {
        String str = this.f49566a;
        String str2 = this.f49567b;
        String valueOf = String.valueOf(this.f49571f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    private D(P2 p22, String str, String str2, String str3, long j10, long j11, F f10) {
        C6620s.f(str2);
        C6620s.f(str3);
        C6620s.l(f10);
        this.f49566a = str2;
        this.f49567b = str3;
        this.f49568c = TextUtils.isEmpty(str) ? null : str;
        this.f49569d = j10;
        this.f49570e = j11;
        if (j11 != 0 && j11 > j10) {
            p22.f().J().c("Event created with reverse previous/current timestamps. appId, name", C7607h2.t(str2), C7607h2.t(str3));
        }
        this.f49571f = f10;
    }
}
