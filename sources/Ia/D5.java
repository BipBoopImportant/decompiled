package ia;

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

public final class D5 implements C8338q5 {

    /* renamed from: a  reason: collision with root package name */
    private C10036b f53224a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b f53225b;

    /* renamed from: c  reason: collision with root package name */
    private final C8351s5 f53226c;

    public D5(Context context, C8351s5 s5Var) {
        this.f53226c = s5Var;
        a aVar = a.f47794g;
        u.f(context);
        j h10 = u.c().h(aVar);
        if (aVar.a().contains(c.b(FeatureVariable.JSON_TYPE))) {
            this.f53224a = new w(new A5(h10));
        }
        this.f53225b = new w(new B5(h10));
    }

    static d b(C8351s5 s5Var, C8331p5 p5Var) {
        return d.h(p5Var.c(s5Var.a(), false));
    }

    public final void a(C8331p5 p5Var) {
        if (this.f53226c.a() == 0) {
            C10036b bVar = this.f53224a;
            if (bVar != null) {
                ((i) bVar.get()).b(b(this.f53226c, p5Var));
                return;
            }
            return;
        }
        ((i) this.f53225b.get()).b(b(this.f53226c, p5Var));
    }
}
