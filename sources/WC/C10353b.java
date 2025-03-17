package wc;

import Fb.f;
import Fb.o;
import android.content.Context;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* renamed from: wc.b  reason: case insensitive filesystem */
public class C10353b {
    public C10353b(f fVar, o oVar, Executor executor) {
        Context k10 = fVar.k();
        a.g().O(k10);
        com.google.firebase.perf.application.a b10 = com.google.firebase.perf.application.a.b();
        b10.i(k10);
        b10.j(new C10357f());
        if (oVar != null) {
            AppStartTrace m10 = AppStartTrace.m();
            m10.x(k10);
            executor.execute(new AppStartTrace.c(m10));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
