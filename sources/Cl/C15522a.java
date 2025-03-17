package CL;

import CL.d;
import CL.g;
import CL.l;
import CL.m;
import CL.o;
import CL.p;
import android.content.Context;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: CL.a  reason: case insensitive filesystem */
public class C15522a {

    /* renamed from: a  reason: collision with root package name */
    private final List<Set<Integer>> f133573a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f133574b;

    /* renamed from: c  reason: collision with root package name */
    private final o f133575c;

    /* renamed from: d  reason: collision with root package name */
    private final p f133576d;

    /* renamed from: e  reason: collision with root package name */
    private final l f133577e;

    /* renamed from: f  reason: collision with root package name */
    private final m f133578f;

    /* renamed from: g  reason: collision with root package name */
    private final g f133579g;

    /* renamed from: h  reason: collision with root package name */
    private final d f133580h;

    /* renamed from: i  reason: collision with root package name */
    private final n f133581i;

    public C15522a(Context context) {
        this(context, true);
    }

    private void g() {
        for (b next : this.f133574b) {
            if (next instanceof f) {
                ((f) next).v(k.f133635d);
            }
            if (next instanceof p) {
                ((p) next).L(k.f133633b);
            }
            if (next instanceof m) {
                m mVar = (m) next;
                mVar.H(k.f133634c);
                mVar.F(20.0f);
            }
            if (next instanceof n) {
                n nVar = (n) next;
                nVar.H(k.f133634c);
                nVar.F(20.0f);
            }
            if (next instanceof g) {
                g gVar = (g) next;
                gVar.z(k.f133632a);
                gVar.A(150);
            }
            if (next instanceof l) {
                ((l) next).H(15.3f);
            }
        }
    }

    public List<b> a() {
        return this.f133574b;
    }

    public d b() {
        return this.f133580h;
    }

    public List<Set<Integer>> c() {
        return this.f133573a;
    }

    public l d() {
        return this.f133577e;
    }

    public m e() {
        return this.f133578f;
    }

    public p f() {
        return this.f133576d;
    }

    public boolean h(MotionEvent motionEvent) {
        boolean z10 = false;
        for (b g10 : this.f133574b) {
            if (g10.g(motionEvent)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void i(d.a aVar) {
        this.f133580h.i(aVar);
    }

    public void j(g.a aVar) {
        this.f133579g.i(aVar);
    }

    public void k(List<Set<Integer>> list) {
        this.f133573a.clear();
        this.f133573a.addAll(list);
    }

    @SafeVarargs
    public final void l(Set<Integer>... setArr) {
        k(Arrays.asList(setArr));
    }

    public void m(l.a aVar) {
        this.f133577e.i(aVar);
    }

    public void n(m.a aVar) {
        this.f133578f.i(aVar);
    }

    public void o(o.c cVar) {
        this.f133575c.i(cVar);
    }

    public void p(p.c cVar) {
        this.f133576d.i(cVar);
    }

    public C15522a(Context context, boolean z10) {
        this(context, new ArrayList(), z10);
    }

    public C15522a(Context context, List<Set<Integer>> list, boolean z10) {
        ArrayList arrayList = new ArrayList();
        this.f133573a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f133574b = arrayList2;
        arrayList.addAll(list);
        l lVar = new l(context, this);
        this.f133577e = lVar;
        p pVar = new p(context, this);
        this.f133576d = pVar;
        m mVar = new m(context, this);
        this.f133578f = mVar;
        n nVar = new n(context, this);
        this.f133581i = nVar;
        g gVar = new g(context, this);
        this.f133579g = gVar;
        d dVar = new d(context, this);
        this.f133580h = dVar;
        o oVar = new o(context, this);
        this.f133575c = oVar;
        arrayList2.add(lVar);
        arrayList2.add(pVar);
        arrayList2.add(mVar);
        arrayList2.add(nVar);
        arrayList2.add(gVar);
        arrayList2.add(dVar);
        arrayList2.add(oVar);
        if (z10) {
            g();
        }
    }
}
