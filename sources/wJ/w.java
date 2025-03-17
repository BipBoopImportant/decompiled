package WJ;

import QJ.O;
import XH.C16807N;
import XH.C16816g;
import dI.C17168i;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, d2 = {"E", "Lkotlin/Function1;", "LXH/N;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "LWJ/S;", "undeliveredElementException", "b", "(LnI/l;Ljava/lang/Object;LWJ/S;)LWJ/S;", "LdI/i;", "context", "a", "(LnI/l;Ljava/lang/Object;LdI/i;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w {
    public static final <E> void a(C17642l<? super E, C16807N> lVar, E e10, C17168i iVar) {
        S b10 = b(lVar, e10, (S) null);
        if (b10 != null) {
            O.a(iVar, b10);
        }
    }

    public static final <E> S b(C17642l<? super E, C16807N> lVar, E e10, S s10) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (s10 == null || s10.getCause() == th2) {
                return new S("Exception in undelivered element handler for " + e10, th2);
            }
            C16816g.a(s10, th2);
        }
        return s10;
    }

    public static /* synthetic */ S c(C17642l lVar, Object obj, S s10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return b(lVar, obj, s10);
    }
}
