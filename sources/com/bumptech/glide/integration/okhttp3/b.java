package com.bumptech.glide.integration.okhttp3;

import C7.i;
import GK.C15786e;
import GK.z;
import I7.h;
import I7.o;
import I7.p;
import I7.s;
import java.io.InputStream;

public class b implements o<h, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final C15786e.a f46518a;

    public static class a implements p<h, InputStream> {

        /* renamed from: b  reason: collision with root package name */
        private static volatile C15786e.a f46519b;

        /* renamed from: a  reason: collision with root package name */
        private final C15786e.a f46520a;

        public a() {
            this(a());
        }

        private static C15786e.a a() {
            if (f46519b == null) {
                synchronized (a.class) {
                    try {
                        if (f46519b == null) {
                            f46519b = new z();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return f46519b;
        }

        public o<h, InputStream> d(s sVar) {
            return new b(this.f46520a);
        }

        public void teardown() {
        }

        public a(C15786e.a aVar) {
            this.f46520a = aVar;
        }
    }

    public b(C15786e.a aVar) {
        this.f46518a = aVar;
    }

    /* renamed from: c */
    public o.a<InputStream> b(h hVar, int i10, int i11, i iVar) {
        return new o.a<>(hVar, new B7.a(this.f46518a, hVar));
    }

    /* renamed from: d */
    public boolean a(h hVar) {
        return true;
    }
}
