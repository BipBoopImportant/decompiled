package t3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jb.f;
import kb.C9967v;

/* renamed from: t3.c  reason: case insensitive filesystem */
public final class C5952c {
    public static <T> C9967v<T> a(f<Bundle, T> fVar, List<Bundle> list) {
        C9967v.a t10 = C9967v.t();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(fVar.apply((Bundle) C5950a.e(list.get(i10))));
        }
        return t10.k();
    }

    public static <T> ArrayList<Bundle> b(Collection<T> collection, f<T, Bundle> fVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (T apply : collection) {
            arrayList.add(fVar.apply(apply));
        }
        return arrayList;
    }
}
