package QJ;

import WJ.C16747h;
import WJ.C16748i;
import WJ.K;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "LQJ/f0;", "", "mode", "LXH/N;", "a", "(LQJ/f0;I)V", "LdI/e;", "delegate", "", "undispatched", "d", "(LQJ/f0;LdI/e;Z)V", "e", "(LQJ/f0;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.g0  reason: case insensitive filesystem */
public final class C16307g0 {
    public static final <T> void a(C16305f0<? super T> f0Var, int i10) {
        C17164e<? super T> b10 = f0Var.b();
        boolean z10 = i10 == 4;
        if (z10 || !(b10 instanceof C16747h) || b(i10) != b(f0Var.f137629c)) {
            d(f0Var, b10, z10);
            return;
        }
        C16747h hVar = (C16747h) b10;
        M m10 = hVar.f139551d;
        C17168i context = hVar.getContext();
        if (C16748i.d(m10, context)) {
            C16748i.c(m10, context, f0Var);
        } else {
            e(f0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(C16305f0<? super T> f0Var, C17164e<? super T> eVar, boolean z10) {
        Object f10;
        Object i10 = f0Var.i();
        Throwable e10 = f0Var.e(i10);
        if (e10 != null) {
            x.a aVar = x.f139812b;
            f10 = y.a(e10);
        } else {
            x.a aVar2 = x.f139812b;
            f10 = f0Var.f(i10);
        }
        Object b10 = x.b(f10);
        if (z10) {
            C17542s.h(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C16747h hVar = (C16747h) eVar;
            C17164e<T> eVar2 = hVar.f139552e;
            Object obj = hVar.f139554g;
            C17168i context = eVar2.getContext();
            Object i11 = K.i(context, obj);
            o1<?> m10 = i11 != K.f139530a ? C16293K.m(eVar2, context, i11) : null;
            try {
                hVar.f139552e.resumeWith(b10);
                C16807N n10 = C16807N.f139792a;
            } finally {
                if (m10 == null || m10.g1()) {
                    K.f(context, i11);
                }
            }
        } else {
            eVar.resumeWith(b10);
        }
    }

    private static final void e(C16305f0<?> f0Var) {
        C16323o0 b10 = e1.f137624a.b();
        if (b10.Y0()) {
            b10.S0(f0Var);
            return;
        }
        b10.W0(true);
        try {
            d(f0Var, f0Var.b(), true);
            do {
            } while (b10.h1());
        } catch (Throwable th2) {
            b10.P0(true);
            throw th2;
        }
        b10.P0(true);
    }
}
