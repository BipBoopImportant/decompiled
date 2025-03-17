package com.google.firebase.perf.network;

import Bc.g;
import Fc.k;
import GK.C15774B;
import GK.C15776D;
import GK.C15786e;
import GK.C15787f;
import GK.C15803v;
import com.google.firebase.perf.util.l;
import java.io.IOException;

public class d implements C15787f {

    /* renamed from: a  reason: collision with root package name */
    private final C15787f f68617a;

    /* renamed from: b  reason: collision with root package name */
    private final g f68618b;

    /* renamed from: c  reason: collision with root package name */
    private final l f68619c;

    /* renamed from: d  reason: collision with root package name */
    private final long f68620d;

    public d(C15787f fVar, k kVar, l lVar, long j10) {
        this.f68617a = fVar;
        this.f68618b = g.c(kVar);
        this.f68620d = j10;
        this.f68619c = lVar;
    }

    public void c(C15786e eVar, IOException iOException) {
        C15774B t10 = eVar.t();
        if (t10 != null) {
            C15803v k10 = t10.k();
            if (k10 != null) {
                this.f68618b.t(k10.v().toString());
            }
            if (t10.h() != null) {
                this.f68618b.j(t10.h());
            }
        }
        this.f68618b.n(this.f68620d);
        this.f68618b.r(this.f68619c.c());
        Dc.d.d(this.f68618b);
        this.f68617a.c(eVar, iOException);
    }

    public void e(C15786e eVar, C15776D d10) {
        C15776D d11 = d10;
        FirebasePerfOkHttpClient.a(d11, this.f68618b, this.f68620d, this.f68619c.c());
        this.f68617a.e(eVar, d10);
    }
}
