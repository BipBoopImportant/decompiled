package com.google.firebase.crashlytics.ndk;

import Nb.h;
import Tb.F;
import com.google.firebase.crashlytics.ndk.f;
import java.io.File;

class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final f f68263a;

    g(f fVar) {
        this.f68263a = fVar;
    }

    public File a() {
        return this.f68263a.f68252f;
    }

    public F.a b() {
        f.c cVar = this.f68263a.f68247a;
        if (cVar != null) {
            return cVar.f68262b;
        }
        return null;
    }

    public File c() {
        return this.f68263a.f68247a.f68261a;
    }

    public File d() {
        return this.f68263a.f68249c;
    }

    public File e() {
        return this.f68263a.f68251e;
    }

    public File f() {
        return this.f68263a.f68253g;
    }

    public File g() {
        return this.f68263a.f68250d;
    }
}
