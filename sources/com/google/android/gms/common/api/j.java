package com.google.android.gms.common.api;

import H9.C6544s;
import K9.C6620s;

public final class j {
    public static <R extends n> i<R> a(R r10, g gVar) {
        C6620s.m(r10, "Result must not be null");
        C6620s.b(!r10.i().E0(), "Status code must not be SUCCESS");
        t tVar = new t(gVar, r10);
        tVar.f(r10);
        return tVar;
    }

    public static i<Status> b(Status status, g gVar) {
        C6620s.m(status, "Result must not be null");
        C6544s sVar = new C6544s(gVar);
        sVar.f(status);
        return sVar;
    }
}
