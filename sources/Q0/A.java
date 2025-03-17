package Q0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.C5548j;
import m0.M;
import m0.N;
import m0.v0;
import nI.q;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/v0$b;", "LQ0/l;", "Lm0/N;", "", "a", "(Lm0/v0$b;LU0/m;I)Lm0/N;"}, k = 3, mv = {1, 8, 0})
public final class A extends C17544u implements q<v0.b<l>, C4889m, Integer, N<Float>> {

    /* renamed from: c  reason: collision with root package name */
    public static final A f11928c = new A();

    public A() {
        super(3);
    }

    public final N<Float> a(v0.b<l> bVar, C4889m mVar, int i10) {
        mVar.W(-1154662212);
        if (C4895p.J()) {
            C4895p.S(-1154662212, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
        }
        l lVar = l.Focused;
        l lVar2 = l.UnfocusedEmpty;
        N<Float> j10 = bVar.h(lVar, lVar2) ? C5548j.j(67, 0, M.e(), 2, (Object) null) : (bVar.h(lVar2, lVar) || bVar.h(l.UnfocusedNotEmpty, lVar2)) ? C5548j.i(83, 67, M.e()) : C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((v0.b) obj, (C4889m) obj2, ((Number) obj3).intValue());
    }
}
