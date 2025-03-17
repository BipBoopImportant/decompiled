package androidx.camera.core.impl;

import C.C4391e0;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f16958a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f16959b = new LinkedHashMap();

    private interface a {
        boolean a(b bVar);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final X0 f16960a;

        /* renamed from: b  reason: collision with root package name */
        private final o1<?> f16961b;

        /* renamed from: c  reason: collision with root package name */
        private final c1 f16962c;

        /* renamed from: d  reason: collision with root package name */
        private final List<p1.b> f16963d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f16964e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16965f = false;

        b(X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
            this.f16960a = x02;
            this.f16961b = o1Var;
            this.f16962c = c1Var;
            this.f16963d = list;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f16965f;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f16964e;
        }

        public List<p1.b> c() {
            return this.f16963d;
        }

        public X0 d() {
            return this.f16960a;
        }

        public c1 e() {
            return this.f16962c;
        }

        public o1<?> f() {
            return this.f16961b;
        }

        /* access modifiers changed from: package-private */
        public void g(boolean z10) {
            this.f16965f = z10;
        }

        /* access modifiers changed from: package-private */
        public void h(boolean z10) {
            this.f16964e = z10;
        }

        public String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.f16960a + ", mUseCaseConfig=" + this.f16961b + ", mStreamSpec=" + this.f16962c + ", mCaptureTypes=" + this.f16963d + ", mAttached=" + this.f16964e + ", mActive=" + this.f16965f + '}';
        }
    }

    public n1(String str) {
        this.f16958a = str;
    }

    private b k(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        b bVar = this.f16959b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(x02, o1Var, c1Var, list);
        this.f16959b.put(str, bVar2);
        return bVar2;
    }

    private Collection<X0> l(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f16959b.entrySet()) {
            if (aVar == null || aVar.a((b) next.getValue())) {
                arrayList.add(((b) next.getValue()).d());
            }
        }
        return arrayList;
    }

    private Collection<o1<?>> m(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f16959b.entrySet()) {
            if (aVar == null || aVar.a((b) next.getValue())) {
                arrayList.add(((b) next.getValue()).f());
            }
        }
        return arrayList;
    }

    private Collection<b> n(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f16959b.entrySet()) {
            if (aVar == null || aVar.a((b) next.getValue())) {
                arrayList.add((b) next.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean p(b bVar) {
        return bVar.a() && bVar.b();
    }

    public X0.h e() {
        X0.h hVar = new X0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f16959b.entrySet()) {
            b bVar = (b) next.getValue();
            if (bVar.a() && bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) next.getKey());
            }
        }
        C4391e0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f16958a);
        return hVar;
    }

    public Collection<X0> f() {
        return Collections.unmodifiableCollection(l(new m1()));
    }

    public X0.h g() {
        X0.h hVar = new X0.h();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f16959b.entrySet()) {
            b bVar = (b) next.getValue();
            if (bVar.b()) {
                hVar.b(bVar.d());
                arrayList.add((String) next.getKey());
            }
        }
        C4391e0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f16958a);
        return hVar;
    }

    public Collection<X0> h() {
        return Collections.unmodifiableCollection(l(new k1()));
    }

    public Collection<o1<?>> i() {
        return Collections.unmodifiableCollection(m(new l1()));
    }

    public Collection<b> j() {
        return Collections.unmodifiableCollection(n(new j1()));
    }

    public boolean o(String str) {
        if (!this.f16959b.containsKey(str)) {
            return false;
        }
        return this.f16959b.get(str).b();
    }

    public void t(String str) {
        this.f16959b.remove(str);
    }

    public void u(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        k(str, x02, o1Var, c1Var, list).g(true);
    }

    public void v(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        k(str, x02, o1Var, c1Var, list).h(true);
        y(str, x02, o1Var, c1Var, list);
    }

    public void w(String str) {
        if (this.f16959b.containsKey(str)) {
            b bVar = this.f16959b.get(str);
            bVar.h(false);
            if (!bVar.a()) {
                this.f16959b.remove(str);
            }
        }
    }

    public void x(String str) {
        if (this.f16959b.containsKey(str)) {
            b bVar = this.f16959b.get(str);
            bVar.g(false);
            if (!bVar.b()) {
                this.f16959b.remove(str);
            }
        }
    }

    public void y(String str, X0 x02, o1<?> o1Var, c1 c1Var, List<p1.b> list) {
        if (this.f16959b.containsKey(str)) {
            b bVar = new b(x02, o1Var, c1Var, list);
            b bVar2 = this.f16959b.get(str);
            bVar.h(bVar2.b());
            bVar.g(bVar2.a());
            this.f16959b.put(str, bVar);
        }
    }
}
