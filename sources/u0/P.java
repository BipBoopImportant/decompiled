package U0;

import QJ.C16283A;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.S;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.Arrays;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0010\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001a\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010\u001e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aK\u0010 \u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006*"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "effect", "i", "(LnI/a;LU0/m;I)V", "", "key1", "Lkotlin/Function1;", "LU0/M;", "LU0/L;", "c", "(Ljava/lang/Object;LnI/l;LU0/m;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;LnI/l;LU0/m;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LnI/l;LU0/m;I)V", "", "keys", "d", "([Ljava/lang/Object;LnI/l;LU0/m;I)V", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "block", "g", "(Ljava/lang/Object;LnI/p;LU0/m;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;LnI/p;LU0/m;I)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LnI/p;LU0/m;I)V", "h", "([Ljava/lang/Object;LnI/p;LU0/m;I)V", "LdI/i;", "coroutineContext", "LU0/m;", "composer", "k", "(LdI/i;LU0/m;)LQJ/Q;", "LU0/M;", "InternalDisposableEffectScope", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class P {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final M f13869a = new M();

    public static final void a(Object obj, Object obj2, Object obj3, C17642l<? super M, ? extends L> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:236)");
        }
        boolean V10 = mVar.V(obj) | mVar.V(obj2) | mVar.V(obj3);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new K(lVar);
            mVar.u(D10);
        }
        K k10 = (K) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void b(Object obj, Object obj2, C17642l<? super M, ? extends L> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean V10 = mVar.V(obj) | mVar.V(obj2);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new K(lVar);
            mVar.u(D10);
        }
        K k10 = (K) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void c(Object obj, C17642l<? super M, ? extends L> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean V10 = mVar.V(obj);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new K(lVar);
            mVar.u(D10);
        }
        K k10 = (K) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void d(Object[] objArr, C17642l<? super M, ? extends L> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean z10 = false;
        for (Object V10 : Arrays.copyOf(objArr, objArr.length)) {
            z10 |= mVar.V(V10);
        }
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            mVar.u(new K(lVar));
        }
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        C17168i r10 = mVar.r();
        boolean V10 = mVar.V(obj) | mVar.V(obj2) | mVar.V(obj3);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new C4867d0(r10, pVar);
            mVar.u(D10);
        }
        C4867d0 d0Var = (C4867d0) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void f(Object obj, Object obj2, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        C17168i r10 = mVar.r();
        boolean V10 = mVar.V(obj) | mVar.V(obj2);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new C4867d0(r10, pVar);
            mVar.u(D10);
        }
        C4867d0 d0Var = (C4867d0) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void g(Object obj, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        C17168i r10 = mVar.r();
        boolean V10 = mVar.V(obj);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new C4867d0(r10, pVar);
            mVar.u(D10);
        }
        C4867d0 d0Var = (C4867d0) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void h(Object[] objArr, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        C17168i r10 = mVar.r();
        boolean z10 = false;
        for (Object V10 : Arrays.copyOf(objArr, objArr.length)) {
            z10 |= mVar.V(V10);
        }
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            mVar.u(new C4867d0(r10, pVar));
        }
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final void i(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        mVar.f(aVar);
        if (C4895p.J()) {
            C4895p.R();
        }
    }

    public static final Q k(C17168i iVar, C4889m mVar) {
        F0.b bVar = F0.f137562d0;
        if (iVar.get(bVar) != null) {
            C16283A b10 = J0.b((F0) null, 1, (Object) null);
            b10.g(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return S.a(b10);
        }
        C17168i r10 = mVar.r();
        return S.a(r10.plus(I0.a((F0) r10.get(bVar))).plus(iVar));
    }
}
