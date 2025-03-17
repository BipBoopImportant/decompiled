package J;

import C.C4391e0;
import G.a;
import G.d;
import R.a;
import R.b;
import R.c;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final I f8780a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8781b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8782c;

    /* renamed from: d  reason: collision with root package name */
    private final Rational f8783d;

    /* renamed from: e  reason: collision with root package name */
    private final l f8784e;

    public k(I i10, Size size) {
        this.f8780a = i10;
        this.f8781b = i10.c();
        this.f8782c = i10.f();
        Rational h10 = size != null ? h(size) : i(i10);
        this.f8783d = h10;
        this.f8784e = new l(i10, h10);
    }

    private static LinkedHashMap<Rational, List<Size>> a(List<Size> list, a aVar, Rational rational) {
        return b(o(list), aVar, rational);
    }

    private static LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, a aVar, Rational rational) {
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational n10 = n(aVar.b(), z10);
        if (aVar.a() == 0) {
            Rational n11 = n(aVar.b(), z10);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational2 = (Rational) it.next();
                if (!rational2.equals(n11)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList, new a.C0050a(n10, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    private List<Size> c(List<Size> list, c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f8780a.g(i10));
        Collections.sort(arrayList, new d(true));
        return arrayList;
    }

    private static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int c10 = N.d.c(size);
        for (Rational rational : linkedHashMap.keySet()) {
            List<Size> list = linkedHashMap.get(rational);
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (N.d.c(size2) <= c10) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static List<Size> e(List<Size> list, b bVar, int i10, int i11, int i12) {
        if (bVar == null) {
            return list;
        }
        int b10 = G.c.b(i10);
        boolean z10 = true;
        if (i12 != 1) {
            z10 = false;
        }
        List<Size> a10 = bVar.a(new ArrayList(list), G.c.a(b10, i11, z10));
        if (list.containsAll(a10)) {
            return a10;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, R.d dVar) {
        if (dVar != null) {
            for (Rational rational : linkedHashMap.keySet()) {
                g(linkedHashMap.get(rational), dVar);
            }
        }
    }

    private static void g(List<Size> list, R.d dVar) {
        if (!list.isEmpty()) {
            int b10 = dVar.b();
            if (!dVar.equals(R.d.f12181c)) {
                Size a10 = dVar.a();
                if (b10 == 0) {
                    s(list, a10);
                } else if (b10 == 1) {
                    q(list, a10, true);
                } else if (b10 == 2) {
                    q(list, a10, false);
                } else if (b10 == 3) {
                    r(list, a10, true);
                } else if (b10 == 4) {
                    r(list, a10, false);
                }
            }
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(I i10) {
        List<Size> i11 = i10.i(256);
        if (i11.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(i11, new d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List<Size> j(List<Pair<Integer, Size[]>> list, int i10) {
        List<Size> l10 = l(list, i10);
        if (l10 == null) {
            l10 = this.f8780a.i(i10);
        }
        ArrayList arrayList = new ArrayList(l10);
        Collections.sort(arrayList, new d(true));
        if (arrayList.isEmpty()) {
            C4391e0.l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    static List<Rational> k(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G.a.f6042a);
        arrayList.add(G.a.f6044c);
        for (Size next : list) {
            Rational rational = new Rational(next.getWidth(), next.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (G.a.a(next, (Rational) it.next())) {
                            break;
                        }
                    } else {
                        arrayList.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Size> l(List<Pair<Integer, Size[]>> list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            Iterator<Pair<Integer, Size[]>> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair next = it.next();
                if (((Integer) next.first).intValue() == i10) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    static Rational n(int i10, boolean z10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return z10 ? G.a.f6042a : G.a.f6043b;
            }
            if (i10 == 1) {
                return z10 ? G.a.f6044c : G.a.f6045d;
            }
            C4391e0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        }
        return null;
    }

    static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap hashMap = new HashMap();
        for (Rational put : k(list)) {
            hashMap.put(put, new ArrayList());
        }
        for (Size next : list) {
            for (Rational rational : hashMap.keySet()) {
                if (G.a.a(next, rational)) {
                    ((List) hashMap.get(rational)).add(next);
                }
            }
        }
        return hashMap;
    }

    public static List<Size> p(c cVar, List<Size> list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap<Rational, List<Size>> a10 = a(list, cVar.b(), rational);
        if (size != null) {
            d(a10, size);
        }
        f(a10, cVar.d());
        ArrayList arrayList = new ArrayList();
        for (List<Size> it : a10.values()) {
            for (Size size2 : it) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return e(arrayList, cVar.c(), i10, i11, i12);
    }

    static void q(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void r(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void s(List<Size> list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    public List<Size> m(o1<?> o1Var) {
        C5046s0 s0Var = (C5046s0) o1Var;
        List<Size> H10 = s0Var.H((List<Size>) null);
        if (H10 != null) {
            return H10;
        }
        c C10 = s0Var.C((c) null);
        List<Size> j10 = j(s0Var.k((List<Pair<Integer, Size[]>>) null), o1Var.m());
        if (C10 == null) {
            return this.f8784e.f(j10, o1Var);
        }
        Size i10 = ((C5046s0) o1Var).i((Size) null);
        int E10 = s0Var.E(0);
        if (!o1Var.S(false)) {
            j10 = c(j10, C10, o1Var.m());
        }
        return p(s0Var.l(), j10, i10, E10, this.f8783d, this.f8781b, this.f8782c);
    }
}
