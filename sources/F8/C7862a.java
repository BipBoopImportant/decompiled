package f8;

import QJ.C16311i0;
import QJ.F0;
import QJ.S;
import QJ.T;
import a9.Z4;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import com.contentsquare.android.sdk.C7161y;
import com.contentsquare.android.sdk.X0;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf8/a;", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: f8.a  reason: case insensitive filesystem */
public final class C7862a implements C5205h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C7161y f51206a;

    public C7862a(C7161y yVar) {
        this.f51206a = yVar;
    }

    public final void onStop(C5221y yVar) {
        C17542s.j(yVar, "owner");
        yVar.getLifecycle().g(this);
        C7161y yVar2 = this.f51206a;
        J0.i(yVar2.f47727k, (CancellationException) null, 1, (Object) null);
        X0 x02 = yVar2.f47718b;
        x02.f47213c.f42318a.set(false);
        x02.f47215e = null;
        F0 unused = C16314k.d(S.a(C16311i0.c()), (C17168i) null, (T) null, new Z4(x02, (C17164e<? super Z4>) null), 3, (Object) null);
    }
}
