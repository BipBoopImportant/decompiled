package com.google.firebase.installations;

import pc.d;
import xa.C8972m;

class e implements h {

    /* renamed from: a  reason: collision with root package name */
    private final i f68290a;

    /* renamed from: b  reason: collision with root package name */
    private final C8972m<g> f68291b;

    public e(i iVar, C8972m<g> mVar) {
        this.f68290a = iVar;
        this.f68291b = mVar;
    }

    public boolean a(Exception exc) {
        this.f68291b.d(exc);
        return true;
    }

    public boolean b(d dVar) {
        if (!dVar.k() || this.f68290a.f(dVar)) {
            return false;
        }
        this.f68291b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
