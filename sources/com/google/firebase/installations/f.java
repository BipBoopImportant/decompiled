package com.google.firebase.installations;

import pc.d;
import xa.C8972m;

class f implements h {

    /* renamed from: a  reason: collision with root package name */
    final C8972m<String> f68292a;

    public f(C8972m<String> mVar) {
        this.f68292a = mVar;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f68292a.e(dVar.d());
        return true;
    }
}
