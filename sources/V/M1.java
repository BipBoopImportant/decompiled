package v;

import C.C4391e0;
import H2.i;
import S.j;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5043q0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u.C5965a;
import v.O1;
import w.B;

public final class M1 {

    /* renamed from: a  reason: collision with root package name */
    public static final X.a<Long> f30330a = X.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Long, Set<p1.b>> f30331b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Long, Set<p1.b>> f30332c;

    static {
        HashMap hashMap = new HashMap();
        f30331b = hashMap;
        HashMap hashMap2 = new HashMap();
        f30332c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            p1.b bVar = p1.b.PREVIEW;
            hashSet.add(bVar);
            p1.b bVar2 = p1.b.METERING_REPEATING;
            hashSet.add(bVar2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(p1.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            p1.b bVar3 = p1.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            p1.b bVar4 = p1.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map<Integer, C5010a> map, Map<Integer, o1<?>> map2, List<e1> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = list.get(i10).f();
            if (map.containsKey(Integer.valueOf(i10))) {
                C5010a aVar = map.get(Integer.valueOf(i10));
                if (!g(aVar.b().size() == 1 ? aVar.b().get(0) : p1.b.STREAM_SHARING, f10, aVar.b())) {
                    return false;
                }
            } else if (map2.containsKey(Integer.valueOf(i10))) {
                o1 o1Var = map2.get(Integer.valueOf(i10));
                if (!g(o1Var.getCaptureType(), f10, o1Var.getCaptureType() == p1.b.STREAM_SHARING ? ((j) o1Var).X() : Collections.emptyList())) {
                    return false;
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
        return true;
    }

    private static boolean b(Set<Long> set, Set<Long> set2) {
        for (Long contains : set2) {
            if (!set.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(B b10, List<e1> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) b10.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long valueOf : jArr) {
            hashSet.add(Long.valueOf(valueOf));
        }
        for (e1 f10 : list) {
            if (!hashSet.contains(Long.valueOf(f10.f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List<C5010a> list, List<o1<?>> list2) {
        for (C5010a next : list) {
            if (j(next.e(), next.b().get(0))) {
                return true;
            }
        }
        for (o1 next2 : list2) {
            if (j(next2, next2.getCaptureType())) {
                return true;
            }
        }
        return false;
    }

    public static C5965a e(o1<?> o1Var) {
        E0 b02 = E0.b0();
        X.a<Long> aVar = C5965a.f29560K;
        if (o1Var.b(aVar)) {
            b02.q(aVar, (Long) o1Var.a(aVar));
        }
        X.a<Boolean> aVar2 = o1.f16976D;
        if (o1Var.b(aVar2)) {
            b02.q(aVar2, (Boolean) o1Var.a(aVar2));
        }
        X.a<Integer> aVar3 = C5043q0.f16993J;
        if (o1Var.b(aVar3)) {
            b02.q(aVar3, (Integer) o1Var.a(aVar3));
        }
        X.a<Integer> aVar4 = C5044r0.f17008l;
        if (o1Var.b(aVar4)) {
            b02.q(aVar4, (Integer) o1Var.a(aVar4));
        }
        return new C5965a(b02);
    }

    private static X f(X x10, long j10) {
        X.a<Long> aVar = f30330a;
        if (x10.b(aVar) && ((Long) x10.a(aVar)).longValue() == j10) {
            return null;
        }
        E0 c02 = E0.c0(x10);
        c02.q(aVar, Long.valueOf(j10));
        return new C5965a(c02);
    }

    private static boolean g(p1.b bVar, long j10, List<p1.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar == p1.b.STREAM_SHARING) {
            Map<Long, Set<p1.b>> map = f30332c;
            if (!map.containsKey(Long.valueOf(j10))) {
                return false;
            }
            Set set = map.get(Long.valueOf(j10));
            if (list.size() != set.size()) {
                return false;
            }
            for (p1.b contains : list) {
                if (!set.contains(contains)) {
                    return false;
                }
            }
            return true;
        }
        Map<Long, Set<p1.b>> map2 = f30331b;
        return map2.containsKey(Long.valueOf(j10)) && map2.get(Long.valueOf(j10)).contains(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (long[]) r3.a(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(w.B r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 >= r1) goto L_0x0008
            return r2
        L_0x0008:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r3 = r3.a(r0)
            long[] r3 = (long[]) r3
            if (r3 == 0) goto L_0x001a
            int r3 = r3.length
            if (r3 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r3 = 1
            return r3
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.M1.h(w.B):boolean");
    }

    private static boolean i(List<C5010a> list, List<o1<?>> list2, Set<Long> set) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        Iterator<C5010a> it = list.iterator();
        if (it.hasNext()) {
            C5010a next = it.next();
            X e10 = next.e();
            X.a<Long> aVar = C5965a.f29560K;
            if (e10.b(aVar) && ((Long) next.e().a(aVar)).longValue() != 0) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z10 = false;
            z11 = false;
        }
        for (o1 next2 : list2) {
            X.a<Long> aVar2 = C5965a.f29560K;
            if (next2.b(aVar2)) {
                Long l10 = (Long) next2.a(aVar2);
                if (l10.longValue() != 0) {
                    if (z11) {
                        o();
                    }
                    hashSet.add(l10);
                    z10 = true;
                } else if (z10) {
                    o();
                }
            } else if (z10) {
                o();
            }
            z11 = true;
        }
        return !z11 && b(set, hashSet);
    }

    private static boolean j(X x10, p1.b bVar) {
        if (((Boolean) x10.g(o1.f16976D, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        X.a<Integer> aVar = C5043q0.f16993J;
        return x10.b(aVar) && b2.b(bVar, ((Integer) x10.a(aVar)).intValue()) == 5;
    }

    public static boolean k(B b10, List<C5010a> list, Map<o1<?>, c1> map, Map<C5010a, c1> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<o1> arrayList = new ArrayList<>(map.keySet());
        for (C5010a e10 : list) {
            i.g(e10.e());
        }
        for (o1 o1Var : arrayList) {
            i.g(((c1) i.g(map.get(o1Var))).d());
        }
        long[] jArr = (long[]) b10.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (!(jArr == null || jArr.length == 0)) {
            HashSet hashSet = new HashSet();
            for (long valueOf : jArr) {
                hashSet.add(Long.valueOf(valueOf));
            }
            if (i(list, arrayList, hashSet)) {
                for (C5010a next : list) {
                    X e11 = next.e();
                    X f10 = f(e11, ((Long) e11.a(C5965a.f29560K)).longValue());
                    if (f10 != null) {
                        map2.put(next, next.i(f10));
                    }
                }
                for (o1 o1Var2 : arrayList) {
                    c1 c1Var = map.get(o1Var2);
                    X d10 = c1Var.d();
                    X f11 = f(d10, ((Long) d10.a(C5965a.f29560K)).longValue());
                    if (f11 != null) {
                        map.put(o1Var2, c1Var.g().d(f11).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map<o1<?>, c1> map, Map<C5010a, c1> map2, Map<Integer, C5010a> map3, Map<Integer, o1<?>> map4, List<e1> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = list.get(i10).f();
            if (map3.containsKey(Integer.valueOf(i10))) {
                C5010a aVar = map3.get(Integer.valueOf(i10));
                X f11 = f(aVar.e(), f10);
                if (f11 != null) {
                    map2.put(aVar, aVar.i(f11));
                }
            } else if (map4.containsKey(Integer.valueOf(i10))) {
                o1 o1Var = map4.get(Integer.valueOf(i10));
                c1 c1Var = map.get(o1Var);
                X f12 = f(c1Var.d(), f10);
                if (f12 != null) {
                    map.put(o1Var, c1Var.g().d(f12).a());
                }
            } else {
                throw new AssertionError("SurfaceConfig does not map to any use case");
            }
        }
    }

    public static void m(Collection<X0> collection, Collection<o1<?>> collection2, Map<C5019e0, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (X0 next : collection) {
            X f10 = next.f();
            X.a<Long> aVar = f30330a;
            if (f10.b(aVar) && next.o().size() != 1) {
                C4391e0.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(next.o().size())}));
                return;
            } else if (next.f().b(aVar)) {
                int i10 = 0;
                for (X0 next2 : collection) {
                    if (((o1) arrayList.get(i10)).getCaptureType() == p1.b.METERING_REPEATING) {
                        i.j(!next2.o().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put(next2.o().get(0), 1L);
                    } else {
                        X f11 = next2.f();
                        X.a<Long> aVar2 = f30330a;
                        if (f11.b(aVar2) && !next2.o().isEmpty()) {
                            map.put(next2.o().get(0), (Long) next2.f().a(aVar2));
                        }
                    }
                    i10++;
                }
                return;
            }
        }
    }

    public static boolean n(O1.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
