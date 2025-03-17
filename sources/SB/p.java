package Sb;

import Qb.C9251i;
import Rb.f;
import Tb.F;
import Wb.g;
import d0.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f63319a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final f f63320b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f63321c;

    /* renamed from: d  reason: collision with root package name */
    private final a f63322d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    private final a f63323e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    private final k f63324f = new k(128);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicMarkableReference<String> f63325g = new AtomicMarkableReference<>((Object) null, false);

    private class a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicMarkableReference<e> f63326a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<Runnable> f63327b = new AtomicReference<>((Object) null);

        /* renamed from: c  reason: collision with root package name */
        private final boolean f63328c;

        public a(boolean z10) {
            this.f63328c = z10;
            this.f63326a = new AtomicMarkableReference<>(new e(64, z10 ? 8192 : 1024), false);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f63327b.set((Object) null);
            e();
        }

        private void d() {
            o oVar = new o(this);
            if (i.a(this.f63327b, (Object) null, oVar)) {
                p.this.f63320b.f63182b.f(oVar);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.f63326a.isMarked()) {
                        map = this.f63326a.getReference().a();
                        AtomicMarkableReference<e> atomicMarkableReference = this.f63326a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            if (map != null) {
                p.this.f63319a.r(p.this.f63321c, map, this.f63328c);
            }
        }

        public Map<String, String> b() {
            return this.f63326a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.f63326a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<e> atomicMarkableReference = this.f63326a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
    }

    public p(String str, g gVar, f fVar) {
        this.f63321c = str;
        this.f63319a = new g(gVar);
        this.f63320b = fVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(String str, Map map, List list) {
        if (j() != null) {
            this.f63319a.t(str, j());
        }
        if (!map.isEmpty()) {
            this.f63319a.q(str, map);
        }
        if (!list.isEmpty()) {
            this.f63319a.s(str, list);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(List list) {
        this.f63319a.s(this.f63321c, list);
    }

    public static p m(String str, g gVar, f fVar) {
        g gVar2 = new g(gVar);
        p pVar = new p(str, gVar, fVar);
        pVar.f63322d.f63326a.getReference().e(gVar2.i(str, false));
        pVar.f63323e.f63326a.getReference().e(gVar2.i(str, true));
        pVar.f63325g.set(gVar2.k(str), false);
        pVar.f63324f.c(gVar2.j(str));
        return pVar;
    }

    public static String n(String str, g gVar) {
        return new g(gVar).k(str);
    }

    /* access modifiers changed from: private */
    public void o() {
        boolean z10;
        String str;
        synchronized (this.f63325g) {
            try {
                z10 = false;
                if (this.f63325g.isMarked()) {
                    str = j();
                    this.f63325g.set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f63319a.t(this.f63321c, str);
        }
    }

    public Map<String, String> g(Map<String, String> map) {
        if (map.isEmpty()) {
            return this.f63322d.b();
        }
        HashMap hashMap = new HashMap(this.f63322d.b());
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            String c10 = e.c((String) next.getKey(), 1024);
            if (hashMap.size() < 64 || hashMap.containsKey(c10)) {
                hashMap.put(c10, e.c((String) next.getValue(), 1024));
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            Nb.g f10 = Nb.g.f();
            f10.k("Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: " + 1024);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Map<String, String> h() {
        return this.f63323e.b();
    }

    public List<F.e.d.C1109e> i() {
        return this.f63324f.a();
    }

    public String j() {
        return this.f63325g.getReference();
    }

    public boolean p(String str, String str2) {
        return this.f63322d.f(str, str2);
    }

    public boolean q(String str, String str2) {
        return this.f63323e.f(str, str2);
    }

    public void r(String str) {
        synchronized (this.f63321c) {
            this.f63321c = str;
            this.f63320b.f63182b.f(new l(this, str, this.f63322d.b(), this.f63324f.b()));
        }
    }

    public void s(String str) {
        String c10 = e.c(str, 1024);
        synchronized (this.f63325g) {
            try {
                if (!C9251i.y(c10, this.f63325g.getReference())) {
                    this.f63325g.set(c10, true);
                    this.f63320b.f63182b.f(new m(this));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public boolean t(List<j> list) {
        synchronized (this.f63324f) {
            try {
                if (!this.f63324f.c(list)) {
                    return false;
                }
                this.f63320b.f63182b.f(new n(this, this.f63324f.b()));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
