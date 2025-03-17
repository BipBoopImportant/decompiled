package m3;

import U0.C4889m;
import U0.C4895p;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import uI.C18055d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "LuI/d;", "modelClass", "Landroidx/lifecycle/k0;", "viewModelStoreOwner", "", "key", "Landroidx/lifecycle/i0$c;", "factory", "Ll3/a;", "extras", "b", "(LuI/d;Landroidx/lifecycle/k0;Ljava/lang/String;Landroidx/lifecycle/i0$c;Ll3/a;LU0/m;II)Landroidx/lifecycle/f0;", "a", "(Landroidx/lifecycle/k0;LuI/d;Ljava/lang/String;Landroidx/lifecycle/i0$c;Ll3/a;)Landroidx/lifecycle/f0;", "lifecycle-viewmodel-compose_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
final /* synthetic */ class d {
    public static final <VM extends f0> VM a(k0 k0Var, C18055d<VM> dVar, String str, i0.c cVar, a aVar) {
        C17542s.j(k0Var, "<this>");
        C17542s.j(dVar, "modelClass");
        C17542s.j(aVar, "extras");
        i0 a10 = cVar != null ? i0.f22291b.a(k0Var.getViewModelStore(), cVar, aVar) : k0Var instanceof C5212o ? i0.f22291b.a(k0Var.getViewModelStore(), ((C5212o) k0Var).getDefaultViewModelProviderFactory(), aVar) : i0.b.c(i0.f22291b, k0Var, (i0.c) null, (a) null, 6, (Object) null);
        return str != null ? a10.c(str, dVar) : a10.d(dVar);
    }

    public static final <VM extends f0> VM b(C18055d<VM> dVar, k0 k0Var, String str, i0.c cVar, a aVar, C4889m mVar, int i10, int i11) {
        C17542s.j(dVar, "modelClass");
        mVar.C(1673618944);
        if ((i11 & 2) == 0 || (k0Var = a.f26247a.a(mVar, 6)) != null) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                cVar = null;
            }
            if ((i11 & 16) != 0) {
                aVar = k0Var instanceof C5212o ? ((C5212o) k0Var).getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
            }
            if (C4895p.J()) {
                C4895p.S(1673618944, i10, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
            }
            VM a10 = c.a(k0Var, dVar, str, cVar, aVar);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.U();
            return a10;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
