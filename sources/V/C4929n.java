package V;

import N.d;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: V.n  reason: case insensitive filesystem */
class C4929n {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<C4927l, Range<Integer>> f14469b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, Rational> f14470c;

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, List<Size>> f14471a = new HashMap();

    /* renamed from: V.n$a */
    static abstract class a {
        a() {
        }

        static a c(C4927l lVar, int i10) {
            return new C4920e(lVar, i10);
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract C4927l b();
    }

    static {
        HashMap hashMap = new HashMap();
        f14469b = hashMap;
        hashMap.put(C4927l.f14462d, Range.create(2160, 4319));
        hashMap.put(C4927l.f14461c, Range.create(1080, 1439));
        hashMap.put(C4927l.f14460b, Range.create(720, 1079));
        hashMap.put(C4927l.f14459a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f14470c = hashMap2;
        hashMap2.put(0, G.a.f6042a);
        hashMap2.put(1, G.a.f6044c);
    }

    C4929n(List<Size> list, Map<C4927l, Size> map) {
        for (C4927l next : f14469b.keySet()) {
            this.f14471a.put(a.c(next, -1), new ArrayList());
            for (Integer intValue : f14470c.keySet()) {
                this.f14471a.put(a.c(next, intValue.intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        i(map);
    }

    private void b(Map<C4927l, Size> map) {
        for (Map.Entry next : map.entrySet()) {
            List<Size> f10 = f((C4927l) next.getKey(), -1);
            Objects.requireNonNull(f10);
            f10.add((Size) next.getValue());
        }
    }

    private void c(List<Size> list) {
        Integer d10;
        for (Size next : list) {
            C4927l e10 = e(next);
            if (!(e10 == null || (d10 = d(next)) == null)) {
                List<Size> f10 = f(e10, d10.intValue());
                Objects.requireNonNull(f10);
                f10.add(next);
            }
        }
    }

    private static Integer d(Size size) {
        for (Map.Entry next : f14470c.entrySet()) {
            if (G.a.b(size, (Rational) next.getValue(), d.f9158b)) {
                return (Integer) next.getKey();
            }
        }
        return null;
    }

    private static C4927l e(Size size) {
        for (Map.Entry next : f14469b.entrySet()) {
            if (((Range) next.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                return (C4927l) next.getKey();
            }
        }
        return null;
    }

    private List<Size> f(C4927l lVar, int i10) {
        return this.f14471a.get(a.c(lVar, i10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int h(int i10, Size size, Size size2) {
        return Math.abs(d.c(size) - i10) - Math.abs(d.c(size2) - i10);
    }

    private void i(Map<C4927l, Size> map) {
        for (Map.Entry next : this.f14471a.entrySet()) {
            Size size = map.get(((a) next.getKey()).b());
            if (size != null) {
                Collections.sort((List) next.getValue(), new C4928m(d.c(size)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<Size> g(C4927l lVar, int i10) {
        ArrayList arrayList;
        List<Size> f10 = f(lVar, i10);
        if (f10 == null) {
            arrayList = new ArrayList(0);
        }
        return arrayList;
    }
}
