package T8;

import QJ.F0;
import QJ.T;
import a9.C6847i1;
import a9.C6887n1;
import a9.D6;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT8/a;", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
public final class a implements C5205h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6887n1 f40128a;

    public a(C6887n1 n1Var) {
        this.f40128a = n1Var;
    }

    public final void onStop(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onStop(yVar);
        C6887n1 n1Var = this.f40128a;
        n1Var.getClass();
        if (D6.a(C8886a.f56874d.a(), "log_monitoring")) {
            F0 unused = C16314k.d(n1Var.f42727c, (C17168i) null, (T) null, new C6847i1(n1Var, (C17164e<? super C6847i1>) null), 3, (Object) null);
        }
    }
}
