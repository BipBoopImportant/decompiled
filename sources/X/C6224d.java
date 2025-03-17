package x;

import C.C4417z;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: x.d  reason: case insensitive filesystem */
public final class C6224d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Long, C4417z> f31522a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<C4417z, List<Long>> f31523b;

    static {
        HashMap hashMap = new HashMap();
        f31522a = hashMap;
        HashMap hashMap2 = new HashMap();
        f31523b = hashMap2;
        C4417z zVar = C4417z.f5465d;
        hashMap.put(1L, zVar);
        hashMap2.put(zVar, Collections.singletonList(1L));
        hashMap.put(2L, C4417z.f5467f);
        hashMap2.put((C4417z) hashMap.get(2L), Collections.singletonList(2L));
        C4417z zVar2 = C4417z.f5468g;
        hashMap.put(4L, zVar2);
        hashMap2.put(zVar2, Collections.singletonList(4L));
        C4417z zVar3 = C4417z.f5469h;
        hashMap.put(8L, zVar3);
        hashMap2.put(zVar3, Collections.singletonList(8L));
        List<Long> asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        for (Long put : asList) {
            f31522a.put(put, C4417z.f5470i);
        }
        f31523b.put(C4417z.f5470i, asList);
        List<Long> asList2 = Arrays.asList(new Long[]{1024L, 2048L, 256L, 512L});
        for (Long put2 : asList2) {
            f31522a.put(put2, C4417z.f5471j);
        }
        f31523b.put(C4417z.f5471j, asList2);
    }

    public static Long a(C4417z zVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f31523b.get(zVar);
        if (list == null) {
            return null;
        }
        Set a10 = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (a10.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static C4417z b(long j10) {
        return f31522a.get(Long.valueOf(j10));
    }
}
