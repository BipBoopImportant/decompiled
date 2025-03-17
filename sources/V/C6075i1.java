package v;

import C.C4391e0;
import C.C4417z;
import H2.i;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import w.B;
import x.C6224d;
import x.C6227g;

/* renamed from: v.i1  reason: case insensitive filesystem */
final class C6075i1 {

    /* renamed from: a  reason: collision with root package name */
    private final B f30585a;

    /* renamed from: b  reason: collision with root package name */
    private final C6227g f30586b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30587c;

    /* renamed from: v.i1$a */
    static final class a {
        static C4417z a(B b10) {
            Long l10 = (Long) b10.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return C6224d.b(l10.longValue());
            }
            return null;
        }
    }

    C6075i1(B b10) {
        this.f30585a = b10;
        this.f30586b = C6227g.a(b10);
        int[] iArr = (int[]) b10.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f30587c = z10;
    }

    private static boolean a(C4417z zVar, C4417z zVar2) {
        i.j(zVar2.e(), "Fully specified range is not actually fully specified.");
        if (zVar.b() == 2 && zVar2.b() == 1) {
            return false;
        }
        if (zVar.b() == 2 || zVar.b() == 0 || zVar.b() == zVar2.b()) {
            return zVar.a() == 0 || zVar.a() == zVar2.a();
        }
        return false;
    }

    private static boolean b(C4417z zVar, C4417z zVar2, Set<C4417z> set) {
        if (set.contains(zVar2)) {
            return a(zVar, zVar2);
        }
        C4391e0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", new Object[]{zVar, zVar2}));
        return false;
    }

    private static C4417z c(C4417z zVar, Collection<C4417z> collection, Set<C4417z> set) {
        if (zVar.b() == 1) {
            return null;
        }
        for (C4417z next : collection) {
            i.h(next, "Fully specified DynamicRange cannot be null.");
            int b10 = next.b();
            i.j(next.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (b10 != 1 && b(zVar, next, set)) {
                return next;
            }
        }
        return null;
    }

    private static boolean e(C4417z zVar) {
        return Objects.equals(zVar, C4417z.f5464c);
    }

    private static boolean f(C4417z zVar) {
        return zVar.b() == 2 || (zVar.b() != 0 && zVar.a() == 0) || (zVar.b() == 0 && zVar.a() != 0);
    }

    private C4417z h(C4417z zVar, Set<C4417z> set, Set<C4417z> set2, Set<C4417z> set3, String str) {
        C4417z zVar2;
        if (!zVar.e()) {
            int b10 = zVar.b();
            int a10 = zVar.a();
            if (b10 == 1 && a10 == 0) {
                C4417z zVar3 = C4417z.f5465d;
                if (set.contains(zVar3)) {
                    return zVar3;
                }
                return null;
            }
            C4417z c10 = c(zVar, set2, set);
            if (c10 != null) {
                C4391e0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", new Object[]{str, zVar, c10}));
                return c10;
            }
            C4417z c11 = c(zVar, set3, set);
            if (c11 != null) {
                C4391e0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", new Object[]{str, zVar, c11}));
                return c11;
            }
            C4417z zVar4 = C4417z.f5465d;
            if (b(zVar, zVar4, set)) {
                C4391e0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", new Object[]{str, zVar, zVar4}));
                return zVar4;
            }
            if (b10 == 2 && (a10 == 10 || a10 == 0)) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (Build.VERSION.SDK_INT >= 33) {
                    zVar2 = a.a(this.f30585a);
                    if (zVar2 != null) {
                        linkedHashSet.add(zVar2);
                    }
                } else {
                    zVar2 = null;
                }
                linkedHashSet.add(C4417z.f5467f);
                C4417z c12 = c(zVar, linkedHashSet, set);
                if (c12 != null) {
                    C4391e0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", new Object[]{str, c12.equals(zVar2) ? "recommended" : "required", zVar, c12}));
                    return c12;
                }
            }
            for (C4417z next : set) {
                i.j(next.e(), "Candidate dynamic range must be fully specified.");
                if (!next.equals(C4417z.f5465d) && a(zVar, next)) {
                    C4391e0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", new Object[]{str, zVar, next}));
                    return next;
                }
            }
            return null;
        } else if (set.contains(zVar)) {
            return zVar;
        } else {
            return null;
        }
    }

    private C4417z i(Set<C4417z> set, Set<C4417z> set2, Set<C4417z> set3, o1<?> o1Var, Set<C4417z> set4) {
        C4417z G10 = o1Var.G();
        C4417z h10 = h(G10, set4, set2, set3, o1Var.P());
        if (h10 != null) {
            j(set4, h10, this.f30586b);
            return h10;
        }
        throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", new Object[]{o1Var.P(), G10, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)}));
    }

    private static void j(Set<C4417z> set, C4417z zVar, C6227g gVar) {
        i.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C4417z> b10 = gVar.b(zVar);
        if (!b10.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            set.retainAll(b10);
            if (set.isEmpty()) {
                throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", new Object[]{zVar, TextUtils.join("\n  ", b10), TextUtils.join("\n  ", hashSet)}));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f30587c;
    }

    /* access modifiers changed from: package-private */
    public Map<o1<?>, C4417z> g(List<C5010a> list, List<o1<?>> list2, List<Integer> list3) {
        LinkedHashSet<C4417z> linkedHashSet = new LinkedHashSet<>();
        for (C5010a c10 : list) {
            linkedHashSet.add(c10.c());
        }
        Set<C4417z> c11 = this.f30586b.c();
        HashSet hashSet = new HashSet(c11);
        for (C4417z j10 : linkedHashSet) {
            j(hashSet, j10, this.f30586b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Integer intValue : list3) {
            o1 o1Var = list2.get(intValue.intValue());
            C4417z G10 = o1Var.G();
            if (e(G10)) {
                arrayList3.add(o1Var);
            } else if (f(G10)) {
                arrayList2.add(o1Var);
            } else {
                arrayList.add(o1Var);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<o1> arrayList4 = new ArrayList<>();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (o1 o1Var2 : arrayList4) {
            C4417z i10 = i(c11, linkedHashSet, linkedHashSet2, o1Var2, hashSet);
            hashMap.put(o1Var2, i10);
            if (!linkedHashSet.contains(i10)) {
                linkedHashSet2.add(i10);
            }
        }
        return hashMap;
    }
}
