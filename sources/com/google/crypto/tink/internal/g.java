package com.google.crypto.tink.internal;

import Ab.b;
import Ab.c;
import java.util.concurrent.atomic.AtomicReference;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final g f67863b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final b f67864c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Ab.b> f67865a = new AtomicReference<>();

    private static class b implements Ab.b {
        private b() {
        }

        public b.a a(c cVar, String str, String str2) {
            return f.f67861a;
        }
    }

    public static g b() {
        return f67863b;
    }

    public Ab.b a() {
        Ab.b bVar = this.f67865a.get();
        return bVar == null ? f67864c : bVar;
    }
}
