package SJ;

import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "LSJ/d;", "onBufferOverflow", "Lkotlin/Function1;", "LXH/N;", "onUndeliveredElement", "LSJ/j;", "a", "(ILSJ/d;LnI/l;)LSJ/j;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.m  reason: case insensitive filesystem */
public final class C16437m {
    public static final <E> C16434j<E> a(int i10, C16428d dVar, C17642l<? super E, C16807N> lVar) {
        C16434j<E> hVar;
        if (i10 == -2) {
            hVar = dVar == C16428d.SUSPEND ? new C16432h<>(C16434j.f138326e0.a(), lVar) : new C16445u<>(1, dVar, lVar);
        } else if (i10 != -1) {
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? dVar == C16428d.SUSPEND ? new C16432h(i10, lVar) : new C16445u(i10, dVar, lVar) : new C16432h(Integer.MAX_VALUE, lVar);
            }
            hVar = dVar == C16428d.SUSPEND ? new C16432h<>(0, lVar) : new C16445u<>(1, dVar, lVar);
        } else if (dVar == C16428d.SUSPEND) {
            return new C16445u(1, C16428d.DROP_OLDEST, lVar);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        return hVar;
    }

    public static /* synthetic */ C16434j b(int i10, C16428d dVar, C17642l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            dVar = C16428d.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, dVar, lVar);
    }
}
