package S;

import C.C4391e0;
import G.d;
import G.q;
import J.k;
import R.c;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class b {

    /* renamed from: h  reason: collision with root package name */
    private static final double f12510h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a  reason: collision with root package name */
    private final Size f12511a;

    /* renamed from: b  reason: collision with root package name */
    private final Rational f12512b;

    /* renamed from: c  reason: collision with root package name */
    private final Rational f12513c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<o1<?>> f12514d;

    /* renamed from: e  reason: collision with root package name */
    private final k f12515e;

    /* renamed from: f  reason: collision with root package name */
    private final I f12516f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<o1<?>, List<Size>> f12517g;

    private static class a implements Comparator<Rational> {

        /* renamed from: a  reason: collision with root package name */
        private final Rational f12518a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f12519b;

        a(Rational rational, boolean z10) {
            this.f12518a = rational;
            this.f12519b = z10;
        }

        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            float a10 = b.c(rational, this.f12518a);
            float a11 = b.c(rational2, this.f12518a);
            return this.f12519b ? Float.compare(a11, a10) : Float.compare(a10, a11);
        }
    }

    b(J j10, Set<o1<?>> set) {
        this(q.m(j10.d().g()), j10.j(), set);
    }

    private static boolean A(Collection<Size> collection, Size size) {
        for (Size y10 : collection) {
            if (!y(y10, size)) {
                return true;
            }
        }
        return false;
    }

    private boolean B(Rational rational, Size size) {
        if (this.f12512b.equals(rational) || G.a.a(size, rational)) {
            return false;
        }
        return b(this.f12512b.floatValue(), rational.floatValue(), N(size).floatValue());
    }

    private boolean C(Size size, Size size2) {
        return B(N(size), size2);
    }

    private boolean D() {
        for (Size a10 : l()) {
            if (!G.a.a(a10, this.f12513c)) {
                return true;
            }
        }
        return false;
    }

    private static List<Size> E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private List<Size> G(List<Size> list, boolean z10) {
        Map<Rational, List<Size>> x10 = x(list);
        ArrayList<Rational> arrayList = new ArrayList<>(x10.keySet());
        K(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(G.a.f6044c) && !rational.equals(G.a.f6042a)) {
                List list2 = x10.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    private List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.f12512b, list, false));
        }
        arrayList.addAll(I(this.f12513c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            C4391e0.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        C4391e0.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private List<Size> I(Rational rational, List<Size> list, boolean z10) {
        List<Size> g10 = g(rational, list);
        L(g10);
        HashSet hashSet = new HashSet(g10);
        for (o1<?> v10 : this.f12514d) {
            List<Size> v11 = v(v10);
            if (!z10) {
                v11 = d(rational, v11);
            }
            if (v11.isEmpty()) {
                return new ArrayList();
            }
            g10 = f(v11, g10);
            hashSet.retainAll(p(v11, g10));
        }
        ArrayList arrayList = new ArrayList();
        for (Size next : g10) {
            if (!hashSet.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean J() {
        boolean z10;
        c C10;
        Iterator<o1<?>> it = this.f12514d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            o1 next = it.next();
            if (!next.S(false) && (next instanceof C5046s0) && (C10 = ((C5046s0) next).C((c) null)) != null) {
                z10 = true;
                if (C10.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    private void K(List<Rational> list) {
        Collections.sort(list, new a(M(this.f12511a), true));
    }

    static void L(List<Size> list) {
        Collections.sort(list, new d(true));
    }

    private static Rational M(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational N(Size size) {
        Rational rational = G.a.f6042a;
        if (G.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = G.a.f6044c;
        return G.a.a(size, rational2) ? rational2 : M(size);
    }

    private boolean b(float f10, float f11, float f12) {
        int i10;
        int i11 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
        if (i11 == 0 || f11 == f12) {
            return false;
        }
        return i11 > 0 ? f11 < f12 : i10 > 0;
    }

    /* access modifiers changed from: private */
    public static float c(Rational rational, Rational rational2) {
        float floatValue = rational.floatValue();
        float floatValue2 = rational2.floatValue();
        return floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
    }

    private List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size next : list) {
            if (!B(rational, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static List<Size> e(List<Size> list) {
        Rational rational;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size next : list) {
            Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it.next();
                if (G.a.a(next, rational)) {
                    break;
                }
            }
            if (rational != null) {
                Size size = (Size) hashMap.get(rational);
                Objects.requireNonNull(size);
                if (next.getHeight() <= size.getHeight() && next.getWidth() <= size.getWidth()) {
                    if (next.getWidth() == size.getWidth() && next.getHeight() == size.getHeight()) {
                    }
                }
            } else {
                rational = M(next);
            }
            arrayList.add(next);
            hashMap.put(rational, next);
        }
        return arrayList;
    }

    static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size next : list) {
            if (A(collection, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size next : list) {
            if (G.a.a(next, rational)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f12510h ? G.a.f6044c : G.a.f6042a;
    }

    private List<Size> i() {
        return this.f12516f.g(34);
    }

    private List<Size> j() {
        return this.f12516f.i(34);
    }

    private static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational M10 = M(size);
        if (rational.floatValue() == M10.floatValue()) {
            rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
        } else {
            if (rational.floatValue() > M10.floatValue()) {
                float f10 = (float) width;
                float floatValue = f10 / rational.floatValue();
                float f11 = (((float) height) - floatValue) / 2.0f;
                rectF2 = new RectF(0.0f, f11, f10, floatValue + f11);
            } else {
                float f12 = (float) height;
                float floatValue2 = rational.floatValue() * f12;
                float f13 = (((float) width) - floatValue2) / 2.0f;
                rectF2 = new RectF(f13, 0.0f, floatValue2 + f13, f12);
            }
            rectF = rectF2;
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    private Set<Size> l() {
        HashSet hashSet = new HashSet();
        for (o1<?> v10 : this.f12514d) {
            hashSet.addAll(v(v10));
        }
        return hashSet;
    }

    static Rect m(Size size, Size size2) {
        return k(M(size2), size);
    }

    private static Rational n(Rational rational) {
        Rational rational2 = G.a.f6042a;
        if (rational.equals(rational2)) {
            return G.a.f6044c;
        }
        if (rational.equals(G.a.f6044c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> E10 = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size next : E10) {
            if (z(collection, next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    private Pair<Rect, Size> t(Rect rect, o1<?> o1Var, boolean z10) {
        Size size;
        if (z10) {
            size = r(q.m(rect), o1Var);
        } else {
            Size m10 = q.m(rect);
            size = q(m10, o1Var);
            rect = m(m10, size);
        }
        return new Pair<>(rect, size);
    }

    private static Rational u(Size size) {
        Rational h10 = h(size);
        C4391e0.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + h10 + ".");
        return h10;
    }

    private List<Size> v(o1<?> o1Var) {
        if (!this.f12514d.contains(o1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + o1Var);
        } else if (this.f12517g.containsKey(o1Var)) {
            List<Size> list = this.f12517g.get(o1Var);
            Objects.requireNonNull(list);
            return list;
        } else {
            List<Size> e10 = e(this.f12515e.m(o1Var));
            this.f12517g.put(o1Var, e10);
            return e10;
        }
    }

    private static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair next : list) {
            if (((Integer) next.first).equals(34)) {
                return Arrays.asList((Size[]) next.second);
            }
        }
        return new ArrayList();
    }

    private Map<Rational, List<Size>> x(List<Size> list) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = G.a.f6042a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = G.a.f6044c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        for (Size next : list) {
            if (next.getHeight() > 0) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it.next();
                    if (G.a.a(next, rational3)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational M10 = M(next);
                    arrayList.add(M10);
                    hashMap.put(M10, list2);
                }
                list2.add(next);
            }
        }
        return hashMap;
    }

    static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static boolean z(Collection<Size> collection, Size size) {
        for (Size y10 : collection) {
            if (y(y10, size)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public List<Size> o(D0 d02) {
        List<Size> j10 = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(j10);
            arrayList.addAll(i());
            j10 = arrayList;
        }
        List list = (List) d02.g(C5046s0.f17017u, null);
        if (list != null) {
            j10 = w(list);
        }
        return H(j10);
    }

    /* access modifiers changed from: package-private */
    public Size q(Size size, o1<?> o1Var) {
        List<Size> v10 = v(o1Var);
        for (Size next : v10) {
            if (!C(size, next) && !y(next, size)) {
                return next;
            }
        }
        for (Size next2 : v10) {
            if (!y(next2, size)) {
                return next2;
            }
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public Size r(Size size, o1<?> o1Var) {
        for (Size m10 : v(o1Var)) {
            Size m11 = q.m(m(m10, size));
            if (!y(m11, size)) {
                return m11;
            }
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public Pair<Rect, Size> s(o1<?> o1Var, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (q.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        Pair<Rect, Size> t10 = t(rect, o1Var, z10);
        Rect rect2 = (Rect) t10.first;
        Size size = (Size) t10.second;
        if (z11) {
            size = q.o(size);
            rect2 = F(rect2);
        }
        return new Pair<>(rect2, size);
    }

    private b(Size size, I i10, Set<o1<?>> set) {
        this(size, i10, set, new k(i10, size));
    }

    b(Size size, I i10, Set<o1<?>> set, k kVar) {
        this.f12517g = new HashMap();
        this.f12511a = size;
        Rational u10 = u(size);
        this.f12512b = u10;
        this.f12513c = n(u10);
        this.f12516f = i10;
        this.f12514d = set;
        this.f12515e = kVar;
    }
}
