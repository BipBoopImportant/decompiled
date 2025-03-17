package com.google.firebase.remoteconfig.internal;

import Ic.k;
import Ic.m;

public class v implements k {

    /* renamed from: a  reason: collision with root package name */
    private final long f68843a;

    /* renamed from: b  reason: collision with root package name */
    private final int f68844b;

    /* renamed from: c  reason: collision with root package name */
    private final m f68845c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f68846a;

        /* renamed from: b  reason: collision with root package name */
        private int f68847b;

        /* renamed from: c  reason: collision with root package name */
        private m f68848c;

        public v a() {
            return new v(this.f68846a, this.f68847b, this.f68848c);
        }

        /* access modifiers changed from: package-private */
        public b b(m mVar) {
            this.f68848c = mVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public b c(int i10) {
            this.f68847b = i10;
            return this;
        }

        public b d(long j10) {
            this.f68846a = j10;
            return this;
        }

        private b() {
        }
    }

    static b b() {
        return new b();
    }

    public int a() {
        return this.f68844b;
    }

    private v(long j10, int i10, m mVar) {
        this.f68843a = j10;
        this.f68844b = i10;
        this.f68845c = mVar;
    }
}
