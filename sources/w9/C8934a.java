package w9;

import android.util.SparseArray;
import j9.f;
import java.util.HashMap;

/* renamed from: w9.a  reason: case insensitive filesystem */
public final class C8934a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<f> f57366a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<f, Integer> f57367b;

    static {
        HashMap<f, Integer> hashMap = new HashMap<>();
        f57367b = hashMap;
        hashMap.put(f.DEFAULT, 0);
        f57367b.put(f.VERY_LOW, 1);
        f57367b.put(f.HIGHEST, 2);
        for (f next : f57367b.keySet()) {
            f57366a.append(f57367b.get(next).intValue(), next);
        }
    }

    public static int a(f fVar) {
        Integer num = f57367b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i10) {
        f fVar = f57366a.get(i10);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
