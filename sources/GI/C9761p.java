package gi;

import GC.C12925g;
import IC.C13023e;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16534i;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import hi.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgi/p;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lhi/e;", "getPipAssemblyDetailsUseCase", "<init>", "(Landroidx/lifecycle/U;Lhi/e;)V", "", "m", "Ljava/lang/String;", "itemNumber", "LTJ/P;", "LGC/g;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.p  reason: case insensitive filesystem */
public final class C9761p extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final String f73446m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<C12925g> f73447n;

    public C9761p(U u10, e eVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "getPipAssemblyDetailsUseCase");
        Object f10 = u10.f("itemNo");
        if (f10 != null) {
            String str = (String) f10;
            this.f73446m = str;
            this.f73447n = C16534i.c0(eVar.a(str), g0.a(this), C16515L.a.b(C16515L.f138570a, 0, 0, 3, (Object) null), new C12925g(true, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C16519P<C12925g> m() {
        return this.f73447n;
    }
}
