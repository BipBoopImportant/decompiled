package androidx.camera.core.impl;

import C.C4391e0;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.a0  reason: case insensitive filesystem */
public class C5011a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<C5051v> f16834a = Collections.unmodifiableSet(EnumSet.of(C5051v.PASSIVE_FOCUSED, C5051v.PASSIVE_NOT_FOCUSED, C5051v.LOCKED_FOCUSED, C5051v.LOCKED_NOT_FOCUSED));

    /* renamed from: b  reason: collision with root package name */
    private static final Set<C5055x> f16835b = Collections.unmodifiableSet(EnumSet.of(C5055x.CONVERGED, C5055x.UNKNOWN));

    /* renamed from: c  reason: collision with root package name */
    private static final Set<C5047t> f16836c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<C5047t> f16837d;

    static {
        C5047t tVar = C5047t.CONVERGED;
        C5047t tVar2 = C5047t.FLASH_REQUIRED;
        C5047t tVar3 = C5047t.UNKNOWN;
        Set<C5047t> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(tVar, tVar2, tVar3));
        f16836c = unmodifiableSet;
        EnumSet<C5047t> copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(tVar2);
        copyOf.remove(tVar3);
        f16837d = Collections.unmodifiableSet(copyOf);
    }

    public static boolean a(C5059z zVar, boolean z10) {
        boolean z11 = zVar.j() == C5049u.OFF || zVar.j() == C5049u.UNKNOWN || f16834a.contains(zVar.h());
        boolean z12 = zVar.g() == C5045s.OFF;
        boolean z13 = !z10 ? z12 || f16836c.contains(zVar.k()) : z12 || f16837d.contains(zVar.k());
        boolean z14 = zVar.e() == C5053w.OFF || f16835b.contains(zVar.i());
        C4391e0.a("ConvergenceUtils", "checkCaptureResult, AE=" + zVar.k() + " AF =" + zVar.h() + " AWB=" + zVar.i());
        return z11 && z13 && z14;
    }
}
