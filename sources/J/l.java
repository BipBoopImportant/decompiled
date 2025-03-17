package J;

import G.a;
import G.c;
import G.d;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f8785a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8786b;

    /* renamed from: c  reason: collision with root package name */
    private final Rational f8787c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8788d;

    l(I i10, Rational rational) {
        this.f8785a = i10.c();
        this.f8786b = i10.f();
        this.f8787c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f8788d = z10;
    }

    private static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational next : k.k(list)) {
            if (a.a(size, next)) {
                return next;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(C5046s0 s0Var, List<Size> list) {
        if (s0Var.y()) {
            return k.n(s0Var.B(), this.f8788d);
        }
        Size d10 = d(s0Var);
        if (d10 != null) {
            return b(d10, list);
        }
        return null;
    }

    private Size d(C5046s0 s0Var) {
        return a(s0Var.N((Size) null), s0Var.E(0), this.f8786b, this.f8785a);
    }

    private static boolean e(int i10, int i11, int i12) {
        int a10 = c.a(c.b(i10), i12, 1 == i11);
        return a10 == 90 || a10 == 270;
    }

    /* access modifiers changed from: package-private */
    public List<Size> f(List<Size> list, o1<?> o1Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, new d(true));
        ArrayList arrayList2 = new ArrayList();
        C5046s0 s0Var = (C5046s0) o1Var;
        Size i10 = s0Var.i((Size) null);
        Size size = (Size) arrayList.get(0);
        if (i10 == null || N.d.c(size) < N.d.c(i10)) {
            i10 = size;
        }
        Size d10 = d(s0Var);
        Size size2 = N.d.f9159c;
        int c10 = N.d.c(size2);
        if (N.d.c(i10) < c10) {
            size2 = N.d.f9157a;
        } else if (d10 != null && N.d.c(d10) < c10) {
            size2 = d10;
        }
        for (Size size3 : arrayList) {
            if (N.d.c(size3) <= N.d.c(i10) && N.d.c(size3) >= N.d.c(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (!arrayList2.isEmpty()) {
            Rational c11 = c(s0Var, arrayList2);
            if (d10 == null) {
                d10 = s0Var.J((Size) null);
            }
            ArrayList arrayList3 = new ArrayList();
            new HashMap();
            if (c11 == null) {
                arrayList3.addAll(arrayList2);
                if (d10 != null) {
                    k.q(arrayList3, d10, true);
                }
            } else {
                Map<Rational, List<Size>> o10 = k.o(arrayList2);
                if (d10 != null) {
                    for (Rational rational : o10.keySet()) {
                        k.q(o10.get(rational), d10, true);
                    }
                }
                ArrayList<Rational> arrayList4 = new ArrayList<>(o10.keySet());
                Collections.sort(arrayList4, new a.C0050a(c11, this.f8787c));
                for (Rational rational2 : arrayList4) {
                    for (Size size4 : o10.get(rational2)) {
                        if (!arrayList3.contains(size4)) {
                            arrayList3.add(size4);
                        }
                    }
                }
            }
            return arrayList3;
        }
        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + i10 + "\ninitial size list: " + arrayList);
    }
}
