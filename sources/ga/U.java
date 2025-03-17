package ga;

import Kb.w;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import j9.j;
import l9.u;
import mc.C10036b;

public final class U implements I {

    /* renamed from: a  reason: collision with root package name */
    private C10036b f51380a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b f51381b;

    /* renamed from: c  reason: collision with root package name */
    private final K f51382c;

    public U(Context context, K k10) {
        this.f51382c = k10;
        a aVar = a.f47794g;
        u.f(context);
        j h10 = u.c().h(aVar);
        if (aVar.a().contains(c.b(FeatureVariable.JSON_TYPE))) {
            this.f51380a = new w(new Q(h10));
        }
        this.f51381b = new w(new S(h10));
    }
}
