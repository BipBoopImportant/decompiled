package x;

import C.C4417z;
import H2.i;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x.C6227g;

class h implements C6227g.a {

    /* renamed from: a  reason: collision with root package name */
    private final DynamicRangeProfiles f31525a;

    h(Object obj) {
        this.f31525a = (DynamicRangeProfiles) obj;
    }

    private Long d(C4417z zVar) {
        return C6224d.a(zVar, this.f31525a);
    }

    private static Set<C4417z> e(Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        for (Long longValue : set) {
            hashSet.add(f(longValue.longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static C4417z f(long j10) {
        C4417z b10 = C6224d.b(j10);
        return (C4417z) i.h(b10, "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    public DynamicRangeProfiles a() {
        return this.f31525a;
    }

    public Set<C4417z> b() {
        return e(this.f31525a.getSupportedProfiles());
    }

    public Set<C4417z> c(C4417z zVar) {
        Long d10 = d(zVar);
        boolean z10 = d10 != null;
        i.b(z10, "DynamicRange is not supported: " + zVar);
        return e(this.f31525a.getProfileCaptureRequestConstraints(d10.longValue()));
    }
}
