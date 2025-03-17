package p2;

import h2.C5413c;
import h2.C5419i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q2.i;
import q2.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private HashSet<d> f27394a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f27395b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27396c;

    /* renamed from: d  reason: collision with root package name */
    public final e f27397d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27398e;

    /* renamed from: f  reason: collision with root package name */
    public d f27399f;

    /* renamed from: g  reason: collision with root package name */
    public int f27400g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f27401h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    C5419i f27402i;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f27397d = eVar;
        this.f27398e = aVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            q();
            return true;
        } else if (!z10 && !p(dVar)) {
            return false;
        } else {
            this.f27399f = dVar;
            if (dVar.f27394a == null) {
                dVar.f27394a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f27399f.f27394a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f27400g = i10;
            this.f27401h = i11;
            return true;
        }
    }

    public void c(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f27394a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                i.a(it.next().f27397d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f27394a;
    }

    public int e() {
        if (!this.f27396c) {
            return 0;
        }
        return this.f27395b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = r3.f27399f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int f() {
        /*
            r3 = this;
            p2.e r0 = r3.f27397d
            int r0 = r0.X()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f27401h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0021
            p2.d r0 = r3.f27399f
            if (r0 == 0) goto L_0x0021
            p2.e r0 = r0.f27397d
            int r0 = r0.X()
            if (r0 != r1) goto L_0x0021
            int r0 = r3.f27401h
            return r0
        L_0x0021:
            int r0 = r3.f27400g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.f():int");
    }

    public final d g() {
        switch (this.f27398e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.f27397d.f27430Q;
            case 2:
                return this.f27397d.f27431R;
            case 3:
                return this.f27397d.f27428O;
            case 4:
                return this.f27397d.f27429P;
            default:
                throw new AssertionError(this.f27398e.name());
        }
    }

    public e h() {
        return this.f27397d;
    }

    public C5419i i() {
        return this.f27402i;
    }

    public d j() {
        return this.f27399f;
    }

    public a k() {
        return this.f27398e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f27394a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f27394a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f27396c;
    }

    public boolean o() {
        return this.f27399f != null;
    }

    public boolean p(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        a k10 = dVar.k();
        a aVar = this.f27398e;
        if (k10 == aVar) {
            return aVar != a.BASELINE || (dVar.h().b0() && h().b0());
        }
        switch (aVar.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z11 = k10 == a.LEFT || k10 == a.RIGHT;
                if (!(dVar.h() instanceof h)) {
                    return z11;
                }
                if (z11 || k10 == a.CENTER_X) {
                    z10 = true;
                }
                return z10;
            case 2:
            case 4:
                boolean z12 = k10 == a.TOP || k10 == a.BOTTOM;
                if (!(dVar.h() instanceof h)) {
                    return z12;
                }
                if (z12 || k10 == a.CENTER_Y) {
                    z10 = true;
                }
                return z10;
            case 5:
                return (k10 == a.LEFT || k10 == a.RIGHT) ? false : true;
            case 6:
                return (k10 == a.BASELINE || k10 == a.CENTER_X || k10 == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f27398e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f27399f;
        if (!(dVar == null || (hashSet = dVar.f27394a) == null)) {
            hashSet.remove(this);
            if (this.f27399f.f27394a.size() == 0) {
                this.f27399f.f27394a = null;
            }
        }
        this.f27394a = null;
        this.f27399f = null;
        this.f27400g = 0;
        this.f27401h = Integer.MIN_VALUE;
        this.f27396c = false;
        this.f27395b = 0;
    }

    public void r() {
        this.f27396c = false;
        this.f27395b = 0;
    }

    public void s(C5413c cVar) {
        C5419i iVar = this.f27402i;
        if (iVar == null) {
            this.f27402i = new C5419i(C5419i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.n();
        }
    }

    public void t(int i10) {
        this.f27395b = i10;
        this.f27396c = true;
    }

    public String toString() {
        return this.f27397d.t() + ":" + this.f27398e.toString();
    }

    public void u(int i10) {
        if (o()) {
            this.f27401h = i10;
        }
    }
}
