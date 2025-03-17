package XJ;

import QJ.C16285C;
import QJ.C16301d0;
import QJ.M0;
import QJ.k1;
import WJ.K;
import WJ.z;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.p;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "LdI/e;", "", "receiver", "completion", "LXH/N;", "a", "(LnI/p;Ljava/lang/Object;LdI/e;)V", "LWJ/z;", "block", "b", "(LWJ/z;Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XJ.b  reason: case insensitive filesystem */
public final class C16833b {
    public static final <R, T> void a(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        C17168i context;
        Object i10;
        C17164e<? super T> a10 = h.a(eVar);
        try {
            context = a10.getContext();
            i10 = K.i(context, (Object) null);
            h.b(a10);
            Object d10 = !(pVar instanceof a) ? C17187b.d(pVar, r10, a10) : ((p) W.g(pVar, 2)).invoke(r10, a10);
            K.f(context, i10);
            if (d10 != C17187b.f()) {
                a10.resumeWith(x.b(d10));
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof C16301d0) {
                th = ((C16301d0) th).getCause();
            }
            x.a aVar = x.f139812b;
            a10.resumeWith(x.b(y.a(th)));
        }
    }

    public static final <T, R> Object b(z<? super T> zVar, R r10, p<? super R, ? super C17164e<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = !(pVar instanceof a) ? C17187b.d(pVar, r10, zVar) : ((p) W.g(pVar, 2)).invoke(r10, zVar);
        } catch (Throwable th2) {
            obj = new C16285C(th2, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C17187b.f()) {
            return C17187b.f();
        }
        Object F02 = zVar.F0(obj);
        if (F02 == M0.f137587b) {
            return C17187b.f();
        }
        zVar.f1();
        if (!(F02 instanceof C16285C)) {
            return M0.h(F02);
        }
        throw ((C16285C) F02).f137555a;
    }

    public static final <T, R> Object c(z<? super T> zVar, R r10, p<? super R, ? super C17164e<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = !(pVar instanceof a) ? C17187b.d(pVar, r10, zVar) : ((p) W.g(pVar, 2)).invoke(r10, zVar);
        } catch (Throwable th2) {
            obj = new C16285C(th2, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C17187b.f()) {
            return C17187b.f();
        }
        Object F02 = zVar.F0(obj);
        if (F02 == M0.f137587b) {
            return C17187b.f();
        }
        zVar.f1();
        if (F02 instanceof C16285C) {
            Throwable th3 = ((C16285C) F02).f137555a;
            if (!(th3 instanceof k1) || ((k1) th3).f137644a != zVar) {
                throw th3;
            } else if (obj instanceof C16285C) {
                throw ((C16285C) obj).f137555a;
            }
        } else {
            obj = M0.h(F02);
        }
        return obj;
    }
}
