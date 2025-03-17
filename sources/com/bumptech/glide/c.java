package com.bumptech.glide;

import E7.k;
import F7.d;
import F7.j;
import G7.a;
import G7.h;
import G7.i;
import R7.o;
import U7.f;
import U7.g;
import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import j0.C5445a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f46476a = new C5445a();

    /* renamed from: b  reason: collision with root package name */
    private final e.a f46477b = new e.a();

    /* renamed from: c  reason: collision with root package name */
    private k f46478c;

    /* renamed from: d  reason: collision with root package name */
    private d f46479d;

    /* renamed from: e  reason: collision with root package name */
    private F7.b f46480e;

    /* renamed from: f  reason: collision with root package name */
    private h f46481f;

    /* renamed from: g  reason: collision with root package name */
    private H7.a f46482g;

    /* renamed from: h  reason: collision with root package name */
    private H7.a f46483h;

    /* renamed from: i  reason: collision with root package name */
    private a.C0573a f46484i;

    /* renamed from: j  reason: collision with root package name */
    private i f46485j;

    /* renamed from: k  reason: collision with root package name */
    private R7.c f46486k;

    /* renamed from: l  reason: collision with root package name */
    private int f46487l = 4;

    /* renamed from: m  reason: collision with root package name */
    private b.a f46488m = new a();

    /* renamed from: n  reason: collision with root package name */
    private o.b f46489n;

    /* renamed from: o  reason: collision with root package name */
    private H7.a f46490o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46491p;

    /* renamed from: q  reason: collision with root package name */
    private List<f<Object>> f46492q;

    class a implements b.a {
        a() {
        }

        public g g() {
            return new g();
        }
    }

    static final class b {
        b() {
        }
    }

    /* renamed from: com.bumptech.glide.c$c  reason: collision with other inner class name */
    public static final class C0809c {
    }

    /* access modifiers changed from: package-private */
    public b a(Context context, List<S7.b> list, S7.a aVar) {
        Context context2 = context;
        if (this.f46482g == null) {
            this.f46482g = H7.a.h();
        }
        if (this.f46483h == null) {
            this.f46483h = H7.a.f();
        }
        if (this.f46490o == null) {
            this.f46490o = H7.a.d();
        }
        if (this.f46485j == null) {
            this.f46485j = new i.a(context2).a();
        }
        if (this.f46486k == null) {
            this.f46486k = new R7.e();
        }
        if (this.f46479d == null) {
            int b10 = this.f46485j.b();
            if (b10 > 0) {
                this.f46479d = new j((long) b10);
            } else {
                this.f46479d = new F7.e();
            }
        }
        if (this.f46480e == null) {
            this.f46480e = new F7.i(this.f46485j.a());
        }
        if (this.f46481f == null) {
            this.f46481f = new G7.g((long) this.f46485j.d());
        }
        if (this.f46484i == null) {
            this.f46484i = new G7.f(context2);
        }
        if (this.f46478c == null) {
            this.f46478c = new k(this.f46481f, this.f46484i, this.f46483h, this.f46482g, H7.a.i(), this.f46490o, this.f46491p);
        }
        List<f<Object>> list2 = this.f46492q;
        if (list2 == null) {
            this.f46492q = Collections.emptyList();
        } else {
            this.f46492q = Collections.unmodifiableList(list2);
        }
        e b11 = this.f46477b.b();
        return new b(context, this.f46478c, this.f46481f, this.f46479d, this.f46480e, new o(this.f46489n), this.f46486k, this.f46487l, this.f46488m, this.f46476a, this.f46492q, list, aVar, b11);
    }

    public c b(a.C0573a aVar) {
        this.f46484i = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(o.b bVar) {
        this.f46489n = bVar;
    }
}
