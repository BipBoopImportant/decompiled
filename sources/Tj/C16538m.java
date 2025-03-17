package TJ;

import QJ.F0;
import SJ.C16428d;
import UJ.C16615h;
import UJ.C16624q;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "LTJ/g;", "", "capacity", "LSJ/d;", "onBufferOverflow", "a", "(LTJ/g;ILSJ/d;)LTJ/g;", "d", "(LTJ/g;)LTJ/g;", "LdI/i;", "context", "e", "(LTJ/g;LdI/i;)LTJ/g;", "LXH/N;", "c", "(LdI/i;)V", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.m  reason: case insensitive filesystem */
final /* synthetic */ class C16538m {
    public static final <T> C16532g<T> a(C16532g<? extends T> gVar, int i10, C16428d dVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        } else if (i10 != -1 || dVar == C16428d.SUSPEND) {
            if (i10 == -1) {
                dVar = C16428d.DROP_OLDEST;
                i10 = 0;
            }
            int i11 = i10;
            C16428d dVar2 = dVar;
            return gVar instanceof C16624q ? C16624q.a.a((C16624q) gVar, (C17168i) null, i11, dVar2, 1, (Object) null) : new C16615h(gVar, (C17168i) null, i11, dVar2, 2, (DefaultConstructorMarker) null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ C16532g b(C16532g gVar, int i10, C16428d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            dVar = C16428d.SUSPEND;
        }
        return C16534i.d(gVar, i10, dVar);
    }

    private static final void c(C17168i iVar) {
        if (iVar.get(F0.f137562d0) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
        }
    }

    public static final <T> C16532g<T> d(C16532g<? extends T> gVar) {
        return b(gVar, -1, (C16428d) null, 2, (Object) null);
    }

    public static final <T> C16532g<T> e(C16532g<? extends T> gVar, C17168i iVar) {
        c(iVar);
        return C17542s.e(iVar, C17169j.f142968a) ? gVar : gVar instanceof C16624q ? C16624q.a.a((C16624q) gVar, iVar, 0, (C16428d) null, 6, (Object) null) : new C16615h(gVar, iVar, 0, (C16428d) null, 12, (DefaultConstructorMarker) null);
    }
}
