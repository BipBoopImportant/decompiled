package UJ;

import SJ.C16428d;
import TJ.C16532g;
import TJ.C16533h;
import WJ.K;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "LTJ/g;", "LUJ/e;", "b", "(LTJ/g;)LUJ/e;", "LTJ/h;", "LdI/i;", "emitContext", "e", "(LTJ/h;LdI/i;)LTJ/h;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "LdI/e;", "block", "c", "(LdI/i;Ljava/lang/Object;Ljava/lang/Object;LnI/p;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.f  reason: case insensitive filesystem */
public final class C16613f {
    public static final <T> C16612e<T> b(C16532g<? extends T> gVar) {
        C16612e<T> eVar = gVar instanceof C16612e ? (C16612e) gVar : null;
        return eVar == null ? new C16615h(gVar, (C17168i) null, 0, (C16428d) null, 14, (DefaultConstructorMarker) null) : eVar;
    }

    /* JADX INFO: finally extract failed */
    public static final <T, V> Object c(C17168i iVar, V v10, Object obj, p<? super V, ? super C17164e<? super T>, ? extends Object> pVar, C17164e<? super T> eVar) {
        Object i10 = K.i(iVar, obj);
        try {
            C16605A a10 = new C16605A(eVar, iVar);
            Object d10 = !(pVar instanceof a) ? C17187b.d(pVar, v10, a10) : ((p) W.g(pVar, 2)).invoke(v10, a10);
            K.f(iVar, i10);
            if (d10 == C17187b.f()) {
                h.c(eVar);
            }
            return d10;
        } catch (Throwable th2) {
            K.f(iVar, i10);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(C17168i iVar, Object obj, Object obj2, p pVar, C17164e eVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = K.g(iVar);
        }
        return c(iVar, obj, obj2, pVar, eVar);
    }

    /* access modifiers changed from: private */
    public static final <T> C16533h<T> e(C16533h<? super T> hVar, C17168i iVar) {
        return ((hVar instanceof C16633z) || (hVar instanceof C16626s)) ? hVar : new C16607C(hVar, iVar);
    }
}
