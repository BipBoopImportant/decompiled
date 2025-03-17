package com.squareup.picasso;

import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15785d;
import WK.N;
import android.net.NetworkInfo;
import com.adjust.sdk.Constants;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;

class r extends y {

    /* renamed from: a  reason: collision with root package name */
    private final j f122588a;

    /* renamed from: b  reason: collision with root package name */
    private final A f122589b;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        final int f122590a;

        /* renamed from: b  reason: collision with root package name */
        final int f122591b;

        b(int i10, int i11) {
            super("HTTP " + i10);
            this.f122590a = i10;
            this.f122591b = i11;
        }
    }

    r(j jVar, A a10) {
        this.f122588a = jVar;
        this.f122589b = a10;
    }

    private static C15774B j(w wVar, int i10) {
        C15785d dVar;
        if (i10 == 0) {
            dVar = null;
        } else if (q.a(i10)) {
            dVar = C15785d.f134887p;
        } else {
            C15785d.a aVar = new C15785d.a();
            if (!q.b(i10)) {
                aVar.e();
            }
            if (!q.j(i10)) {
                aVar.f();
            }
            dVar = aVar.a();
        }
        C15774B.a n10 = new C15774B.a().n(wVar.f122638d.toString());
        if (dVar != null) {
            n10.c(dVar);
        }
        return n10.b();
    }

    public boolean c(w wVar) {
        String scheme = wVar.f122638d.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return 2;
    }

    public y.a f(w wVar, int i10) {
        C15776D a10 = this.f122588a.a(j(wVar, i10));
        C15777E c10 = a10.c();
        if (a10.e1()) {
            t.e eVar = a10.e() == null ? t.e.NETWORK : t.e.DISK;
            if (eVar == t.e.DISK && c10.g() == 0) {
                c10.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == t.e.NETWORK && c10.g() > 0) {
                this.f122589b.f(c10.g());
            }
            return new y.a((N) c10.k3(), eVar);
        }
        c10.close();
        throw new b(a10.g(), wVar.f122637c);
    }

    /* access modifiers changed from: package-private */
    public boolean h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return true;
    }
}
