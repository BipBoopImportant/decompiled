package ha;

import Kb.w;
import android.content.Context;
import com.google.android.datatransport.cct.a;
import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import j9.d;
import j9.i;
import j9.j;
import l9.u;
import mc.C10036b;

public final class B8 implements C8037i8 {

    /* renamed from: a  reason: collision with root package name */
    private C10036b f51815a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b f51816b;

    /* renamed from: c  reason: collision with root package name */
    private final C8057k8 f51817c;

    public B8(Context context, C8057k8 k8Var) {
        this.f51817c = k8Var;
        a aVar = a.f47794g;
        u.f(context);
        j h10 = u.c().h(aVar);
        if (aVar.a().contains(c.b(FeatureVariable.JSON_TYPE))) {
            this.f51815a = new w(new C8196y8(h10));
        }
        this.f51816b = new w(new C8206z8(h10));
    }

    static d b(C8057k8 k8Var, C8027h8 h8Var) {
        int a10 = k8Var.a();
        return h8Var.zza() != 0 ? d.f(h8Var.b(a10, false)) : d.h(h8Var.b(a10, false));
    }

    public final void a(C8027h8 h8Var) {
        if (this.f51817c.a() == 0) {
            C10036b bVar = this.f51815a;
            if (bVar != null) {
                ((i) bVar.get()).b(b(this.f51817c, h8Var));
                return;
            }
            return;
        }
        ((i) this.f51816b.get()).b(b(this.f51817c, h8Var));
    }
}
