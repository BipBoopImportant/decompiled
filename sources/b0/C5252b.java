package b0;

import C.C4417z;
import H2.i;
import androidx.camera.core.impl.C5031k0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: b0.b  reason: case insensitive filesystem */
public class C5252b {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f22933a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f22934b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Integer, Integer> f22935c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Integer, Integer> f22936d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Map<C4417z, Integer>> f22937e;

    static {
        HashMap hashMap = new HashMap();
        f22933a = hashMap;
        HashMap hashMap2 = new HashMap();
        f22934b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f22935c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f22936d = hashMap4;
        HashMap hashMap5 = new HashMap();
        f22937e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(new Integer[]{8, 10})));
        hashMap2.put(0, new HashSet(Arrays.asList(new Integer[]{0, 1, 2, 3, 4})));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{1, 2, 3, 4})));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        C4417z zVar = C4417z.f5465d;
        hashMap6.put(zVar, 1);
        C4417z zVar2 = C4417z.f5467f;
        hashMap6.put(zVar2, 2);
        C4417z zVar3 = C4417z.f5468g;
        Integer valueOf = Integer.valueOf(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        hashMap6.put(zVar3, valueOf);
        C4417z zVar4 = C4417z.f5469h;
        hashMap6.put(zVar4, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(zVar, 1);
        hashMap7.put(zVar2, 2);
        hashMap7.put(zVar3, valueOf);
        hashMap7.put(zVar4, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(zVar, 1);
        hashMap8.put(zVar2, 4);
        hashMap8.put(zVar3, valueOf);
        hashMap8.put(zVar4, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(C4417z.f5470i, 256);
        hashMap9.put(C4417z.f5471j, 512);
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static int a(String str, C4417z zVar) {
        Integer num;
        Map map = f22937e.get(str);
        if (map == null || (num = (Integer) map.get(zVar)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static Set<Integer> b(C4417z zVar) {
        Set<Integer> set = f22933a.get(Integer.valueOf(zVar.a()));
        return set == null ? Collections.emptySet() : set;
    }

    public static Set<Integer> c(C4417z zVar) {
        Set<Integer> set = f22934b.get(Integer.valueOf(zVar.b()));
        return set == null ? Collections.emptySet() : set;
    }

    private static boolean d(int i10, C4417z zVar) {
        Set set = f22933a.get(Integer.valueOf(zVar.a()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    private static boolean e(int i10, C4417z zVar) {
        Set set = f22934b.get(Integer.valueOf(zVar.b()));
        return set != null && set.contains(Integer.valueOf(i10));
    }

    public static boolean f(C5031k0.c cVar, C4417z zVar) {
        return d(cVar.b(), zVar) && e(cVar.g(), zVar);
    }

    public static int g(int i10) {
        Map<Integer, Integer> map = f22935c;
        i.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i10) {
        Map<Integer, Integer> map = f22936d;
        i.a(map.containsKey(Integer.valueOf(i10)));
        Integer num = map.get(Integer.valueOf(i10));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
