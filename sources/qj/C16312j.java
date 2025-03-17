package QJ;

import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aN\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "LdI/i;", "context", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "a", "(LdI/i;LnI/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: QJ.j  reason: case insensitive filesystem */
final /* synthetic */ class C16312j {
    public static final <T> T a(C17168i iVar, p<? super Q, ? super C17164e<? super T>, ? extends Object> pVar) {
        C17168i iVar2;
        C16323o0 o0Var;
        Thread currentThread = Thread.currentThread();
        C17165f fVar = (C17165f) iVar.get(C17165f.f142966s0);
        if (fVar == null) {
            o0Var = e1.f137624a.b();
            iVar2 = C16293K.j(C16342y0.f137687a, iVar.plus(o0Var));
        } else {
            C16323o0 o0Var2 = null;
            C16323o0 o0Var3 = fVar instanceof C16323o0 ? (C16323o0) fVar : null;
            if (o0Var3 != null) {
                if (o0Var3.k1()) {
                    o0Var2 = o0Var3;
                }
                if (o0Var2 != null) {
                    o0Var = o0Var2;
                    iVar2 = C16293K.j(C16342y0.f137687a, iVar);
                }
            }
            o0Var = e1.f137624a.a();
            iVar2 = C16293K.j(C16342y0.f137687a, iVar);
        }
        C16306g gVar = new C16306g(iVar2, currentThread, o0Var);
        gVar.e1(T.DEFAULT, gVar, pVar);
        return gVar.f1();
    }

    public static /* synthetic */ Object b(C17168i iVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        return C16310i.e(iVar, pVar);
    }
}
