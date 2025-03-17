package ga;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class L implements I {

    /* renamed from: a  reason: collision with root package name */
    final List f51362a;

    public L(Context context, K k10) {
        ArrayList arrayList = new ArrayList();
        this.f51362a = arrayList;
        if (k10.c()) {
            arrayList.add(new U(context, k10));
        }
    }
}
