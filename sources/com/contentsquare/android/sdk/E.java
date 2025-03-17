package com.contentsquare.android.sdk;

import D8.c;
import TJ.C16505B;
import YH.C16877v;
import a9.C6784a2;
import a9.C6839h1;
import a9.C6854j0;
import a9.C6912q2;
import a9.H;
import a9.L0;
import a9.N0;
import a9.W3;
import android.view.View;
import android.webkit.WebView;
import com.contentsquare.android.sdk.C7134k0;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;

public final class E implements com.contentsquare.android.api.bridge.flutter.b {

    /* renamed from: g  reason: collision with root package name */
    public static final WeakHashMap<View, com.contentsquare.android.api.bridge.flutter.a> f46944g = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final C6854j0 f46945a;

    /* renamed from: b  reason: collision with root package name */
    public final H f46946b;

    /* renamed from: c  reason: collision with root package name */
    public final c f46947c = new c("ExternalViewsProcessor");

    /* renamed from: d  reason: collision with root package name */
    public a f46948d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap<WebView, C7153u> f46949e = new WeakHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap<View, b> f46950f = new WeakHashMap<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final C6912q2 f46951a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46952b;

        /* renamed from: c  reason: collision with root package name */
        public final W3 f46953c;

        /* renamed from: d  reason: collision with root package name */
        public final C6839h1 f46954d;

        /* renamed from: e  reason: collision with root package name */
        public final C16505B<C7134k0> f46955e;

        public a(C6912q2 q2Var, String str, W3 w32, C6839h1 h1Var, C16505B<C7134k0> b10) {
            C17542s.j(q2Var, "screenGraph");
            C17542s.j(str, "screenshot");
            C17542s.j(w32, "result");
            C17542s.j(h1Var, "screenGraphCallbackListener");
            C17542s.j(b10, "snapshotStateFlow");
            this.f46951a = q2Var;
            this.f46952b = str;
            this.f46953c = w32;
            this.f46954d = h1Var;
            this.f46955e = b10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f46951a, aVar.f46951a) && C17542s.e(this.f46952b, aVar.f46952b) && C17542s.e(this.f46953c, aVar.f46953c) && C17542s.e(this.f46954d, aVar.f46954d) && C17542s.e(this.f46955e, aVar.f46955e);
        }

        public final int hashCode() {
            int hashCode = this.f46952b.hashCode();
            int hashCode2 = this.f46953c.hashCode();
            int hashCode3 = this.f46954d.hashCode();
            return this.f46955e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f46951a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Parameter(screenGraph=" + this.f46951a + ", screenshot=" + this.f46952b + ", result=" + this.f46953c + ", screenGraphCallbackListener=" + this.f46954d + ", snapshotStateFlow=" + this.f46955e + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C7153u f46956a;

        /* renamed from: b  reason: collision with root package name */
        public final com.contentsquare.android.api.bridge.flutter.a f46957b;

        public b(C7153u uVar, com.contentsquare.android.api.bridge.flutter.a aVar) {
            C17542s.j(uVar, "jsonView");
            this.f46956a = uVar;
            this.f46957b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f46956a, bVar.f46956a) && C17542s.e(this.f46957b, bVar.f46957b);
        }

        public final int hashCode() {
            int hashCode = this.f46956a.hashCode() * 31;
            com.contentsquare.android.api.bridge.flutter.a aVar = this.f46957b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "ViewFound(jsonView=" + this.f46956a + ", listener=" + this.f46957b + ')';
        }
    }

    public E(C6854j0 j0Var, H h10) {
        C17542s.j(j0Var, "pathDescriptor");
        C17542s.j(h10, "webViewDomUpdater");
        this.f46945a = j0Var;
        this.f46946b = h10;
    }

    public final void a() {
        a aVar = this.f46948d;
        a aVar2 = null;
        if (aVar == null) {
            C17542s.z("parameter");
            aVar = null;
        }
        aVar.f46955e.a(C7134k0.g.f47482a);
        a aVar3 = this.f46948d;
        if (aVar3 == null) {
            C17542s.z("parameter");
            aVar3 = null;
        }
        C6839h1 h1Var = aVar3.f46954d;
        a aVar4 = this.f46948d;
        if (aVar4 == null) {
            C17542s.z("parameter");
            aVar4 = null;
        }
        C6912q2 q2Var = aVar4.f46951a;
        a aVar5 = this.f46948d;
        if (aVar5 == null) {
            C17542s.z("parameter");
            aVar5 = null;
        }
        String str = aVar5.f46952b;
        a aVar6 = this.f46948d;
        if (aVar6 == null) {
            C17542s.z("parameter");
        } else {
            aVar2 = aVar6;
        }
        h1Var.a(q2Var, str, aVar2.f46953c.a());
    }

    public final void b(int i10) {
        this.f46949e.clear();
        if (i10 == 0) {
            a();
            return;
        }
        a aVar = this.f46948d;
        a aVar2 = null;
        if (aVar == null) {
            C17542s.z("parameter");
            aVar = null;
        }
        String str = aVar.f46951a.f42806b;
        a aVar3 = this.f46948d;
        if (aVar3 == null) {
            C17542s.z("parameter");
        } else {
            aVar2 = aVar3;
        }
        aVar2.f46954d.a(str);
    }

    public final void c(C6912q2 q2Var, String str, W3 w32, C6839h1 h1Var, C16505B<C7134k0> b10) {
        C17542s.j(q2Var, "screenGraph");
        C17542s.j(str, "screenshot");
        C17542s.j(w32, "result");
        C17542s.j(h1Var, "screenGraphCallbackListener");
        C17542s.j(b10, "snapshotStateFlow");
        this.f46948d = new a(q2Var, str, w32, h1Var, b10);
        e();
    }

    public final boolean d() {
        return !this.f46949e.isEmpty() || !this.f46950f.isEmpty();
    }

    public final void e() {
        if (!this.f46950f.isEmpty()) {
            Set<Map.Entry<View, b>> entrySet = this.f46950f.entrySet();
            C17542s.i(entrySet, "registeredViewsFound.entries");
            Object v02 = C16877v.v0(entrySet);
            C17542s.i(v02, "registeredViewsFound.entries.first()");
            Map.Entry entry = (Map.Entry) v02;
            com.contentsquare.android.api.bridge.flutter.a aVar = f46944g.get(entry.getKey());
            String a10 = this.f46945a.a((View) entry.getKey());
            if (aVar != null) {
                Object key = entry.getKey();
                C17542s.i(key, "viewFound.key");
                aVar.a((View) key, a10, this);
            }
        } else if (!this.f46949e.isEmpty()) {
            M m10 = new M();
            m10.f144346a = this.f46949e.size();
            M m11 = new M();
            for (Map.Entry next : this.f46949e.entrySet()) {
                WebView webView = (WebView) next.getKey();
                C7153u uVar = (C7153u) next.getValue();
                C6784a2 a2Var = C6784a2.f42434a;
                C17542s.i(webView, "webView");
                a2Var.getClass();
                C17542s.j(webView, "webView");
                H h10 = C6784a2.f42440g.get(webView);
                L0 l02 = h10 != null ? h10.f46989g : null;
                if (l02 != null) {
                    l02.d(new N0(this, uVar, m11, m10));
                } else {
                    int i10 = m10.f144346a - 1;
                    m10.f144346a = i10;
                    if (i10 == 0) {
                        b(m11.f144346a);
                    }
                }
            }
        } else {
            a();
        }
    }
}
