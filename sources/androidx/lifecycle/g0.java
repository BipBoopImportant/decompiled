package androidx.lifecycle;

import QJ.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n3.a;
import n3.b;
import n3.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Ln3/e;", "a", "Ln3/e;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/f0;", "LQJ/Q;", "(Landroidx/lifecycle/f0;)LQJ/Q;", "viewModelScope", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final e f22282a = new e();

    public static final Q a(f0 f0Var) {
        a aVar;
        C17542s.j(f0Var, "<this>");
        synchronized (f22282a) {
            aVar = (a) f0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                aVar = b.b();
                f0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar);
            }
        }
        return aVar;
    }
}
