package com.contentsquare.android.sdk;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import a9.C6790b0;
import a9.C6976y3;
import a9.E6;
import a9.T;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import u8.C8886a;
import x8.C8957a;

public final class B implements C6790b0 {

    /* renamed from: a  reason: collision with root package name */
    public final T f46897a;

    /* renamed from: b  reason: collision with root package name */
    public final C16824o f46898b = C16825p.b(new c(this));

    /* renamed from: c  reason: collision with root package name */
    public v8.b f46899c;

    /* renamed from: d  reason: collision with root package name */
    public E6 f46900d;

    public static final class a extends C17544u implements C17631a<C8957a> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f46901c = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            ArrayList arrayList = C6976y3.f42972b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C8957a) {
                    arrayList2.add(next);
                }
            }
            return (C8957a) C16877v.y0(arrayList2);
        }
    }

    public static final class b extends C17544u implements C17631a<C7131j> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f46902c = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return C7131j.f47442k;
        }
    }

    public static final class c extends C17544u implements C17631a<C7164z0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ B f46903c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(B b10) {
            super(0);
            this.f46903c = b10;
        }

        public final Object invoke() {
            return new C7164z0(this.f46903c.f46897a, 62);
        }
    }

    public B(T t10) {
        C17542s.j(t10, "touchTargetDetector");
        this.f46897a = t10;
    }

    public final C7119d a(WebView webView, Activity activity) {
        C17542s.j(webView, "webView");
        C17542s.j(activity, "activity");
        X8.b i10 = X8.b.i();
        X8.c c10 = X8.c.c();
        if (i10 == null || c10 == null) {
            return null;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        F0 f02 = c10.g().f47017d;
        C7164z0 z0Var = (C7164z0) this.f46898b.getValue();
        O0 a10 = i10.a();
        C17542s.i(a10, "appModule.analyticsPipeline");
        C7133k d10 = i10.d();
        C17542s.i(d10, "appModule.eventsBuildersFactory");
        E6 e62 = this.f46900d;
        if (e62 == null) {
            v8.b b10 = b();
            if (b10 != null) {
                this.f46900d = new E6(b10);
            }
            e62 = this.f46900d;
        }
        E6 e63 = e62;
        C17542s.g(e63);
        v8.b b11 = b();
        C17542s.g(b11);
        return new C7119d(activity, handler, webView, f02, z0Var, a10, d10, e63, b11);
    }

    public final v8.b b() {
        E8.c f10;
        v8.b bVar = this.f46899c;
        if (bVar != null) {
            return bVar;
        }
        C8886a a10 = C8886a.f56874d.a();
        if (!(a10 == null || (f10 = a10.f()) == null)) {
            this.f46899c = new v8.b(f10);
        }
        return this.f46899c;
    }

    public final K a() {
        X8.b i10 = X8.b.i();
        if (i10 == null) {
            return null;
        }
        C7133k d10 = i10.d();
        C17542s.i(d10, "appModule.eventsBuildersFactory");
        a aVar = a.f46901c;
        b bVar = b.f46902c;
        E6 e62 = this.f46900d;
        if (e62 == null) {
            v8.b b10 = b();
            if (b10 != null) {
                this.f46900d = new E6(b10);
            }
            e62 = this.f46900d;
        }
        E6 e63 = e62;
        C17542s.g(e63);
        v8.b b11 = b();
        C17542s.g(b11);
        return new K(d10, aVar, bVar, e63, b11);
    }
}
