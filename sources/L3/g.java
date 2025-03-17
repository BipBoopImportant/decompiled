package l3;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n3.g;
import uI.C18055d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll3/g;", "", "Landroidx/lifecycle/j0;", "store", "Landroidx/lifecycle/i0$c;", "factory", "Ll3/a;", "extras", "<init>", "(Landroidx/lifecycle/j0;Landroidx/lifecycle/i0$c;Ll3/a;)V", "Landroidx/lifecycle/f0;", "T", "LuI/d;", "modelClass", "", "key", "a", "(LuI/d;Ljava/lang/String;)Landroidx/lifecycle/f0;", "Landroidx/lifecycle/j0;", "b", "Landroidx/lifecycle/i0$c;", "c", "Ll3/a;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f25492a;

    /* renamed from: b  reason: collision with root package name */
    private final i0.c f25493b;

    /* renamed from: c  reason: collision with root package name */
    private final a f25494c;

    public g(j0 j0Var, i0.c cVar, a aVar) {
        C17542s.j(j0Var, PlaceTypes.STORE);
        C17542s.j(cVar, "factory");
        C17542s.j(aVar, "extras");
        this.f25492a = j0Var;
        this.f25493b = cVar;
        this.f25494c = aVar;
    }

    public static /* synthetic */ f0 b(g gVar, C18055d dVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = n3.g.f26584a.e(dVar);
        }
        return gVar.a(dVar, str);
    }

    public final <T extends f0> T a(C18055d<T> dVar, String str) {
        C17542s.j(dVar, "modelClass");
        C17542s.j(str, "key");
        T b10 = this.f25492a.b(str);
        if (dVar.s(b10)) {
            i0.c cVar = this.f25493b;
            if (cVar instanceof i0.e) {
                C17542s.g(b10);
                ((i0.e) cVar).a(b10);
            }
            C17542s.h(b10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b10;
        }
        d dVar2 = new d(this.f25494c);
        dVar2.c(g.a.f26585a, str);
        T a10 = h.a(this.f25493b, dVar, dVar2);
        this.f25492a.d(str, a10);
        return a10;
    }
}
