package v;

import C.C4417z;
import G.d;
import H2.i;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w.B;
import w.C6172g;
import w.O;
import z.C6269f;
import z.t;
import z.x;

final class O1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<d1> f30336a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<d1> f30337b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<d1> f30338c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<d1> f30339d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Map<b, List<d1>> f30340e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final List<d1> f30341f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<d1> f30342g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<d1> f30343h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final String f30344i;

    /* renamed from: j  reason: collision with root package name */
    private final C6064f f30345j;

    /* renamed from: k  reason: collision with root package name */
    private final B f30346k;

    /* renamed from: l  reason: collision with root package name */
    private final C6269f f30347l;

    /* renamed from: m  reason: collision with root package name */
    private final int f30348m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f30349n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30350o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f30351p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f30352q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f30353r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f30354s;

    /* renamed from: t  reason: collision with root package name */
    f1 f30355t;

    /* renamed from: u  reason: collision with root package name */
    List<Integer> f30356u;

    /* renamed from: v  reason: collision with root package name */
    private final C6072h1 f30357v;

    /* renamed from: w  reason: collision with root package name */
    private final x f30358w;

    /* renamed from: x  reason: collision with root package name */
    private final t f30359x;

    /* renamed from: y  reason: collision with root package name */
    private final C6075i1 f30360y;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    static abstract class b {
        b() {
        }

        static b e(int i10, int i11, boolean z10, boolean z11) {
            return new C6061e(i10, i11, z10, z11);
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract boolean c();

        /* access modifiers changed from: package-private */
        public abstract boolean d();
    }

    O1(Context context, String str, O o10, C6064f fVar) {
        this.f30349n = false;
        this.f30350o = false;
        this.f30351p = false;
        this.f30352q = false;
        this.f30353r = false;
        this.f30354s = false;
        this.f30356u = new ArrayList();
        this.f30358w = new x();
        this.f30359x = new t();
        String str2 = (String) i.g(str);
        this.f30344i = str2;
        this.f30345j = (C6064f) i.g(fVar);
        this.f30347l = new C6269f();
        this.f30357v = C6072h1.c(context);
        try {
            B c10 = o10.c(str2);
            this.f30346k = c10;
            Integer num = (Integer) c10.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f30348m = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) c10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 3) {
                        this.f30349n = true;
                    } else if (i10 == 6) {
                        this.f30350o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i10 == 16) {
                        this.f30353r = true;
                    }
                }
            }
            C6075i1 i1Var = new C6075i1(this.f30346k);
            this.f30360y = i1Var;
            k();
            if (this.f30353r) {
                n();
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f30351p = hasSystemFeature;
            if (hasSystemFeature) {
                h();
            }
            if (i1Var.d()) {
                g();
            }
            if (J()) {
                m();
            }
            boolean h10 = M1.h(this.f30346k);
            this.f30352q = h10;
            if (h10) {
                j();
            }
            boolean a10 = g2.a(this.f30346k);
            this.f30354s = a10;
            if (a10) {
                i();
            }
            l();
            b();
        } catch (C6172g e10) {
            throw R0.a(e10);
        }
    }

    private List<d1> B(b bVar) {
        if (this.f30340e.containsKey(bVar)) {
            return this.f30340e.get(bVar);
        }
        List<d1> arrayList = new ArrayList<>();
        if (bVar.d()) {
            if (bVar.a() == 0) {
                arrayList.addAll(this.f30342g);
            }
        } else if (bVar.b() == 8) {
            int a10 = bVar.a();
            if (a10 == 1) {
                arrayList = this.f30338c;
            } else if (a10 != 2) {
                arrayList.addAll(bVar.c() ? this.f30339d : this.f30336a);
            } else {
                arrayList.addAll(this.f30337b);
                arrayList.addAll(this.f30336a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f30341f);
        }
        this.f30340e.put(bVar, arrayList);
        return arrayList;
    }

    private Pair<List<e1>, Integer> C(int i10, List<C5010a> list, List<Size> list2, List<o1<?>> list3, List<Integer> list4, int i11, Map<Integer, C5010a> map, Map<Integer, o1<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (C5010a next : list) {
            arrayList.add(next.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), next);
            }
        }
        for (int i12 = 0; i12 < list2.size(); i12++) {
            Size size = list2.get(i12);
            o1 o1Var = list3.get(list4.get(i12).intValue());
            int m10 = o1Var.m();
            arrayList.add(e1.h(i10, m10, size, F(m10)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), o1Var);
            }
            i11 = E(i11, o1Var.m(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i11));
    }

    private Range<Integer> D(List<C5010a> list, List<o1<?>> list2, List<Integer> list3) {
        Range<Integer> range = null;
        for (C5010a h10 : list) {
            range = G(h10.h(), range);
        }
        for (Integer intValue : list3) {
            range = G(list2.get(intValue.intValue()).x((Range<Integer>) null), range);
        }
        return range;
    }

    private int E(int i10, int i11, Size size) {
        return Math.min(i10, q(this.f30346k, i11, size));
    }

    private Range<Integer> G(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> H(List<o1<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (o1<?> A10 : list) {
            int A11 = A10.A(0);
            if (!arrayList2.contains(Integer.valueOf(A11))) {
                arrayList2.add(Integer.valueOf(A11));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            for (o1 next : list) {
                if (intValue2 == next.A(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(next)));
                }
            }
        }
        return arrayList;
    }

    private static boolean I(List<C5010a> list, Map<o1<?>, List<Size>> map) {
        for (C5010a d10 : list) {
            if (d10.d() == 4101) {
                return true;
            }
        }
        for (o1<?> m10 : map.keySet()) {
            if (m10.m() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean J() {
        int[] b10 = this.f30346k.b().b();
        if (b10 == null) {
            return false;
        }
        for (int i10 : b10) {
            if (i10 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean K(b bVar, List<C5010a> list, Map<o1<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (C5010a g10 : list) {
            arrayList.add(g10.g());
        }
        d dVar = new d();
        for (o1 next : map.keySet()) {
            List list2 = map.get(next);
            boolean z10 = list2 != null && !list2.isEmpty();
            i.b(z10, "No available output size is found for " + next + ".");
            int m10 = next.m();
            arrayList.add(e1.h(bVar.a(), m10, (Size) Collections.min(list2, dVar), F(m10)));
        }
        return c(bVar, arrayList);
    }

    private void L() {
        this.f30357v.g();
        if (this.f30355t == null) {
            l();
            return;
        }
        this.f30355t = f1.a(this.f30355t.b(), this.f30355t.j(), this.f30357v.f(), this.f30355t.h(), this.f30355t.f(), this.f30355t.d(), this.f30355t.l());
    }

    private void N(Map<Integer, Size> map, int i10) {
        Size r10 = r(this.f30346k.b().d(), i10, true);
        if (r10 != null) {
            map.put(Integer.valueOf(i10), r10);
        }
    }

    private void O(Map<Integer, Size> map, Size size, int i10) {
        if (this.f30351p) {
            Size r10 = r(this.f30346k.b().d(), i10, false);
            Integer valueOf = Integer.valueOf(i10);
            if (r10 != null) {
                size = (Size) Collections.min(Arrays.asList(new Size[]{size, r10}), new d());
            }
            map.put(valueOf, size);
        }
    }

    private void P(Map<Integer, Size> map, int i10) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT >= 31 && this.f30353r && (streamConfigurationMap = (StreamConfigurationMap) this.f30346k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
            map.put(Integer.valueOf(i10), r(streamConfigurationMap, i10, true));
        }
    }

    private void b() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Range<java.lang.Integer> d(android.util.Range<java.lang.Integer> r8, android.util.Range<java.lang.Integer> r9, android.util.Range<java.lang.Integer> r10) {
        /*
            android.util.Range r0 = r9.intersect(r8)
            int r0 = v(r0)
            double r0 = (double) r0
            android.util.Range r8 = r10.intersect(r8)
            int r8 = v(r8)
            double r2 = (double) r8
            int r8 = v(r10)
            double r4 = (double) r8
            double r4 = r2 / r4
            int r8 = v(r9)
            double r6 = (double) r8
            double r6 = r0 / r6
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r8 <= 0) goto L_0x002f
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x002e
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0058
        L_0x002e:
            return r10
        L_0x002f:
            if (r8 != 0) goto L_0x004f
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0036
            return r10
        L_0x0036:
            if (r8 != 0) goto L_0x0058
            java.lang.Comparable r8 = r10.getLower()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Comparable r0 = r9.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r8 <= r0) goto L_0x0058
            return r10
        L_0x004f:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x0058
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0058
            return r10
        L_0x0058:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v.O1.d(android.util.Range, android.util.Range, android.util.Range):android.util.Range");
    }

    private b e(int i10, Map<o1<?>, C4417z> map, boolean z10, boolean z11) {
        int z12 = z(map);
        if (i10 != 0 && z11) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", new Object[]{this.f30344i, K.a(i10)}));
        } else if (i10 == 0 || z12 != 10) {
            return b.e(i10, z12, z10, z11);
        } else {
            throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", new Object[]{this.f30344i, K.a(i10)}));
        }
    }

    private Map<o1<?>, List<Size>> f(Map<o1<?>, List<Size>> map, b bVar, Range<Integer> range) {
        HashMap hashMap = new HashMap();
        for (o1 next : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            for (Size size : map.get(next)) {
                int m10 = next.m();
                e1.a c10 = e1.h(bVar.a(), m10, size, F(m10)).c();
                int q10 = range != null ? q(this.f30346k, m10, size) : Integer.MAX_VALUE;
                Set set = (Set) hashMap2.get(c10);
                if (set == null) {
                    set = new HashSet();
                    hashMap2.put(c10, set);
                }
                if (!set.contains(Integer.valueOf(q10))) {
                    arrayList.add(size);
                    set.add(Integer.valueOf(q10));
                }
            }
            hashMap.put(next, arrayList);
        }
        return hashMap;
    }

    private void g() {
        this.f30341f.addAll(C6126z1.b());
    }

    private void h() {
        this.f30338c.addAll(C6126z1.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f30339d.addAll(C6126z1.i());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f30343h.addAll(C6126z1.k());
        }
    }

    private void k() {
        this.f30336a.addAll(C6126z1.a(this.f30348m, this.f30349n, this.f30350o));
        this.f30336a.addAll(this.f30347l.a(this.f30344i));
    }

    private void l() {
        this.f30355t = f1.a(N.d.f9159c, new HashMap(), this.f30357v.f(), new HashMap(), w(), new HashMap(), new HashMap());
    }

    private void m() {
        this.f30342g.addAll(C6126z1.l());
    }

    private void n() {
        this.f30337b.addAll(C6126z1.m());
    }

    private List<List<Size>> o(List<List<Size>> list) {
        int i10 = 1;
        for (List<Size> size : list) {
            i10 *= size.size();
        }
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new ArrayList());
            }
            int size2 = i10 / list.get(0).size();
            int i12 = i10;
            for (int i13 = 0; i13 < list.size(); i13++) {
                List list2 = list.get(i13);
                for (int i14 = 0; i14 < i10; i14++) {
                    ((List) arrayList.get(i14)).add((Size) list2.get((i14 % i12) / size2));
                }
                if (i13 < list.size() - 1) {
                    i12 = size2;
                    size2 /= list.get(i13 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    private Range<Integer> p(Range<Integer> range, int i10) {
        if (range != null) {
            Range<Integer> range2 = c1.f16864a;
            if (!range.equals(range2)) {
                Range<Integer>[] rangeArr = (Range[]) this.f30346k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return range2;
                }
                Range range3 = new Range(Integer.valueOf(Math.min(range.getLower().intValue(), i10)), Integer.valueOf(Math.min(range.getUpper().intValue(), i10)));
                int i11 = 0;
                for (Range<Integer> range4 : rangeArr) {
                    if (i10 >= range4.getLower().intValue()) {
                        if (range2.equals(c1.f16864a)) {
                            range2 = range4;
                        }
                        if (range4.equals(range3)) {
                            return range4;
                        }
                        try {
                            int v10 = v(range4.intersect(range3));
                            if (i11 == 0) {
                                i11 = v10;
                            } else {
                                if (v10 >= i11) {
                                    range2 = d(range3, range2, range4);
                                    i11 = v(range3.intersect(range2));
                                }
                                range4 = range2;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (i11 == 0) {
                                if (u(range4, range3) >= u(range2, range3)) {
                                    if (u(range4, range3) == u(range2, range3)) {
                                        if (range4.getLower().intValue() <= range2.getUpper().intValue() && v(range4) >= v(range2)) {
                                        }
                                    }
                                }
                            }
                        }
                        range2 = range4;
                    }
                }
                return range2;
            }
        }
        return c1.f16864a;
    }

    static int q(B b10, int i10, Size size) {
        try {
            return (int) (1.0E9d / ((double) ((StreamConfigurationMap) b10.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i10, size)));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Size r(android.hardware.camera2.params.StreamConfigurationMap r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 34
            if (r5 != r0) goto L_0x000b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r4.getOutputSizes(r0)
            goto L_0x000f
        L_0x000b:
            android.util.Size[] r0 = r4.getOutputSizes(r5)
        L_0x000f:
            if (r0 == 0) goto L_0x004b
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            goto L_0x004b
        L_0x0015:
            G.d r1 = new G.d
            r1.<init>()
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = N.d.f9157a
            if (r6 == 0) goto L_0x003c
            android.util.Size[] r4 = v.O1.a.a(r4, r5)
            if (r4 == 0) goto L_0x003c
            int r5 = r4.length
            if (r5 <= 0) goto L_0x003c
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.Object r4 = java.util.Collections.max(r4, r1)
            r2 = r4
            android.util.Size r2 = (android.util.Size) r2
        L_0x003c:
            android.util.Size[] r4 = new android.util.Size[]{r0, r2}
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.Object r4 = java.util.Collections.max(r4, r1)
            android.util.Size r4 = (android.util.Size) r4
            return r4
        L_0x004b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.O1.r(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    private int s(List<C5010a> list) {
        int i10 = Integer.MAX_VALUE;
        for (C5010a next : list) {
            i10 = E(i10, next.d(), next.f());
        }
        return i10;
    }

    private static int u(Range<Integer> range, Range<Integer> range2) {
        i.j(!range.contains(range2.getUpper()) && !range.contains(range2.getLower()), "Ranges must not intersect");
        return range.getLower().intValue() > range2.getUpper().intValue() ? range.getLower().intValue() - range2.getUpper().intValue() : range2.getLower().intValue() - range.getUpper().intValue();
    }

    private static int v(Range<Integer> range) {
        return (range.getUpper().intValue() - range.getLower().intValue()) + 1;
    }

    private Size w() {
        try {
            int parseInt = Integer.parseInt(this.f30344i);
            CamcorderProfile a10 = this.f30345j.b(parseInt, 1) ? this.f30345j.a(parseInt, 1) : null;
            return a10 != null ? new Size(a10.videoFrameWidth, a10.videoFrameHeight) : x(parseInt);
        } catch (NumberFormatException unused) {
            return y();
        }
    }

    private Size x(int i10) {
        Size size = N.d.f9160d;
        CamcorderProfile a10 = this.f30345j.b(i10, 10) ? this.f30345j.a(i10, 10) : this.f30345j.b(i10, 8) ? this.f30345j.a(i10, 8) : this.f30345j.b(i10, 12) ? this.f30345j.a(i10, 12) : this.f30345j.b(i10, 6) ? this.f30345j.a(i10, 6) : this.f30345j.b(i10, 5) ? this.f30345j.a(i10, 5) : this.f30345j.b(i10, 4) ? this.f30345j.a(i10, 4) : null;
        return a10 != null ? new Size(a10.videoFrameWidth, a10.videoFrameHeight) : size;
    }

    private Size y() {
        Size[] outputSizes = this.f30346k.b().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return N.d.f9160d;
        }
        Arrays.sort(outputSizes, new d(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = N.d.f9162f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return N.d.f9160d;
    }

    private static int z(Map<o1<?>, C4417z> map) {
        for (C4417z a10 : map.values()) {
            if (a10.a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* access modifiers changed from: package-private */
    public Pair<Map<o1<?>, c1>, Map<C5010a, c1>> A(int i10, List<C5010a> list, Map<o1<?>, List<Size>> map, boolean z10, boolean z11) {
        List<Integer> list2;
        int i11;
        Range<Integer> range;
        HashMap hashMap;
        HashMap hashMap2;
        Map<o1<?>, C4417z> map2;
        String str;
        String str2;
        List<e1> list3;
        HashMap hashMap3;
        HashMap hashMap4;
        String str3;
        String str4;
        HashMap hashMap5;
        HashMap hashMap6;
        List list4;
        List list5;
        HashMap hashMap7;
        int i12;
        int i13;
        int i14;
        String str5;
        List<C5010a> list6 = list;
        Map<o1<?>, List<Size>> map3 = map;
        L();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> H10 = H(arrayList);
        Map<o1<?>, C4417z> g10 = this.f30360y.g(list6, arrayList, H10);
        b e10 = e(i10, g10, z10, I(list, map));
        boolean K10 = K(e10, list6, map3);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (K10) {
            Range<Integer> D10 = D(list6, arrayList, H10);
            Map<o1<?>, List<Size>> f10 = f(map3, e10, D10);
            ArrayList arrayList2 = new ArrayList();
            for (Integer intValue : H10) {
                o1 o1Var = (o1) arrayList.get(intValue.intValue());
                arrayList2.add(a(f10.get(o1Var), o1Var.m()));
            }
            List<List<Size>> o10 = o(arrayList2);
            HashMap hashMap8 = new HashMap();
            HashMap hashMap9 = new HashMap();
            HashMap hashMap10 = new HashMap();
            HashMap hashMap11 = new HashMap();
            boolean d10 = M1.d(list6, arrayList);
            int s10 = s(list6);
            HashMap hashMap12 = hashMap11;
            Range<Integer> range2 = null;
            if (!this.f30352q || d10) {
                hashMap3 = hashMap10;
                hashMap2 = hashMap9;
                hashMap = hashMap8;
                range = D10;
                list2 = H10;
                map2 = g10;
                i11 = s10;
                str2 = str8;
                str = str7;
                hashMap4 = hashMap12;
                list3 = null;
            } else {
                Iterator<List<Size>> it = o10.iterator();
                List<e1> list7 = null;
                while (true) {
                    if (!it.hasNext()) {
                        hashMap2 = hashMap9;
                        hashMap = hashMap8;
                        range = D10;
                        list2 = H10;
                        map2 = g10;
                        i11 = s10;
                        str2 = str8;
                        str = str7;
                        str5 = str6;
                        hashMap4 = hashMap12;
                        hashMap3 = hashMap10;
                        break;
                    }
                    HashMap hashMap13 = hashMap12;
                    HashMap hashMap14 = hashMap10;
                    hashMap2 = hashMap9;
                    hashMap = hashMap8;
                    map2 = g10;
                    range = D10;
                    str2 = str8;
                    int i15 = s10;
                    i11 = s10;
                    str = str7;
                    list2 = H10;
                    str5 = str6;
                    list7 = t(e10, (List) C(i10, list, it.next(), arrayList, H10, i15, hashMap14, hashMap13).first);
                    hashMap3 = hashMap14;
                    hashMap4 = hashMap13;
                    if (list7 != null && !M1.a(hashMap3, hashMap4, list7)) {
                        list7 = null;
                    }
                    if (list7 != null) {
                        if (M1.c(this.f30346k, list7)) {
                            break;
                        }
                        list7 = null;
                    }
                    hashMap3.clear();
                    hashMap4.clear();
                    hashMap12 = hashMap4;
                    hashMap10 = hashMap3;
                    str6 = str5;
                    str8 = str2;
                    str7 = str;
                    g10 = map2;
                    hashMap9 = hashMap2;
                    hashMap8 = hashMap;
                    D10 = range;
                    s10 = i11;
                    H10 = list2;
                }
                if (list7 != null || K10) {
                    list3 = list7;
                } else {
                    throw new IllegalArgumentException(str2 + this.f30344i + str5 + list6 + str + arrayList);
                }
            }
            Iterator<List<Size>> it2 = o10.iterator();
            int i16 = Integer.MAX_VALUE;
            int i17 = Integer.MAX_VALUE;
            boolean z12 = false;
            boolean z13 = false;
            List list8 = null;
            List list9 = null;
            while (true) {
                if (!it2.hasNext()) {
                    int i18 = i16;
                    int i19 = i17;
                    str3 = str2;
                    str4 = str;
                    hashMap5 = hashMap4;
                    hashMap6 = hashMap3;
                    list4 = list8;
                    list5 = list9;
                    break;
                }
                List next = it2.next();
                int i20 = i16;
                int i21 = i17;
                str4 = str;
                hashMap5 = hashMap4;
                str3 = str2;
                hashMap6 = hashMap3;
                Pair<List<e1>, Integer> C10 = C(i10, list, next, arrayList, list2, i11, (Map<Integer, C5010a>) null, (Map<Integer, o1<?>>) null);
                List list10 = (List) C10.first;
                i17 = ((Integer) C10.second).intValue();
                int i22 = i11;
                boolean z14 = range == null || i22 <= i17 || i17 >= range.getLower().intValue();
                if (z12 || !c(e10, list10)) {
                    i12 = i21;
                    i13 = Integer.MAX_VALUE;
                } else {
                    i12 = i21;
                    i13 = Integer.MAX_VALUE;
                    if (i12 == Integer.MAX_VALUE || i12 < i17) {
                        i12 = i17;
                        list8 = next;
                    }
                    if (z14) {
                        if (z13) {
                            list5 = list9;
                            list4 = next;
                            i16 = i20;
                            break;
                        }
                        z12 = true;
                        i12 = i17;
                        list8 = next;
                    }
                }
                if (list3 == null || z13 || t(e10, list10) == null) {
                    i14 = i20;
                } else {
                    i14 = i20;
                    if (i14 == i13 || i14 < i17) {
                        i14 = i17;
                        list9 = next;
                    }
                    if (!z14) {
                        continue;
                    } else if (z12) {
                        i16 = i17;
                        i17 = i12;
                        list4 = list8;
                        list5 = next;
                        break;
                    } else {
                        z13 = true;
                        i14 = i17;
                        list9 = next;
                    }
                }
                i11 = i22;
                i17 = i12;
                hashMap3 = hashMap6;
                hashMap4 = hashMap5;
                str2 = str3;
                str = str4;
                int i23 = i13;
                i16 = i14;
            }
            if (list4 != null) {
                if (range != null) {
                    range2 = p(range, i17);
                }
                Range<Integer> range3 = range2;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    o1 o1Var2 = (o1) it3.next();
                    List<Integer> list11 = list2;
                    Map<o1<?>, C4417z> map4 = map2;
                    Iterator it4 = it3;
                    c1.a f11 = c1.a((Size) list4.get(list11.indexOf(Integer.valueOf(arrayList.indexOf(o1Var2))))).b((C4417z) i.g(map4.get(o1Var2))).d(M1.e(o1Var2)).f(z11);
                    if (range3 != null) {
                        f11.c(range3);
                    }
                    hashMap2.put(o1Var2, f11.a());
                    it3 = it4;
                    list2 = list11;
                    map2 = map4;
                    range3 = range3;
                }
                HashMap hashMap15 = hashMap2;
                if (list3 != null && i17 == i16 && list4.size() == list5.size()) {
                    int i24 = 0;
                    while (true) {
                        if (i24 >= list4.size()) {
                            hashMap7 = hashMap;
                            if (!M1.k(this.f30346k, list6, hashMap15, hashMap7)) {
                                M1.l(hashMap15, hashMap7, hashMap6, hashMap5, list3);
                            }
                        } else if (!((Size) list4.get(i24)).equals(list5.get(i24))) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                    return new Pair<>(hashMap15, hashMap7);
                }
                hashMap7 = hashMap;
                return new Pair<>(hashMap15, hashMap7);
            }
            throw new IllegalArgumentException(str3 + this.f30344i + " and Hardware level: " + this.f30348m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list6 + str4 + arrayList);
        }
        throw new IllegalArgumentException(str8 + this.f30344i + str6 + list6 + str7 + arrayList);
    }

    /* access modifiers changed from: package-private */
    public f1 F(int i10) {
        if (!this.f30356u.contains(Integer.valueOf(i10))) {
            O(this.f30355t.j(), N.d.f9161e, i10);
            O(this.f30355t.h(), N.d.f9163g, i10);
            N(this.f30355t.d(), i10);
            P(this.f30355t.l(), i10);
            this.f30356u.add(Integer.valueOf(i10));
        }
        return this.f30355t;
    }

    /* access modifiers changed from: package-private */
    public e1 M(int i10, int i11, Size size) {
        return e1.h(i10, i11, size, F(i11));
    }

    /* access modifiers changed from: package-private */
    public List<Size> a(List<Size> list, int i10) {
        Rational rational;
        int a10 = this.f30358w.a(this.f30344i, this.f30346k);
        if (a10 == 0) {
            rational = G.a.f6042a;
        } else if (a10 == 1) {
            rational = G.a.f6044c;
        } else if (a10 != 2) {
            rational = null;
        } else {
            Size c10 = F(256).c(256);
            rational = new Rational(c10.getWidth(), c10.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size next : list) {
                if (G.a.a(next, rational)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f30359x.a(e1.e(i10), list);
    }

    /* access modifiers changed from: package-private */
    public boolean c(b bVar, List<e1> list) {
        boolean z10 = false;
        for (d1 d10 : B(bVar)) {
            if (d10.d(list) != null) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public List<e1> t(b bVar, List<e1> list) {
        if (!M1.n(bVar)) {
            return null;
        }
        for (d1 d10 : this.f30343h) {
            List<e1> d11 = d10.d(list);
            if (d11 != null) {
                return d11;
            }
        }
        return null;
    }
}
