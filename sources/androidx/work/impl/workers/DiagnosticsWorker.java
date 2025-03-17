package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C7054x;
import androidx.work.C7055y;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l5.O;
import s5.C8716B;
import s5.C8728j;
import s5.C8733o;
import s5.C8739u;
import s5.v;
import v5.C8890a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/x$a;", "b", "()Landroidx/work/x$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C17542s.j(context, "context");
        C17542s.j(workerParameters, "parameters");
    }

    public C7054x.a b() {
        O r10 = O.r(getApplicationContext());
        C17542s.i(r10, "getInstance(applicationContext)");
        WorkDatabase w10 = r10.w();
        C17542s.i(w10, "workManager.workDatabase");
        v f10 = w10.f();
        C8733o d10 = w10.d();
        C8716B g10 = w10.g();
        C8728j c10 = w10.c();
        List<C8739u> c11 = f10.c(r10.p().a().a() - TimeUnit.DAYS.toMillis(1));
        List<C8739u> y10 = f10.y();
        List<C8739u> n10 = f10.n(200);
        if (!c11.isEmpty()) {
            C7055y.e().f(C8890a.f56902a, "Recently completed work:\n\n");
            C7055y.e().f(C8890a.f56902a, C8890a.d(d10, g10, c10, c11));
        }
        if (!y10.isEmpty()) {
            C7055y.e().f(C8890a.f56902a, "Running work:\n\n");
            C7055y.e().f(C8890a.f56902a, C8890a.d(d10, g10, c10, y10));
        }
        if (!n10.isEmpty()) {
            C7055y.e().f(C8890a.f56902a, "Enqueued work:\n\n");
            C7055y.e().f(C8890a.f56902a, C8890a.d(d10, g10, c10, n10));
        }
        C7054x.a c12 = C7054x.a.c();
        C17542s.i(c12, "success()");
        return c12;
    }
}
