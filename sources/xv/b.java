package Xv;

import IC.C13023e;
import IC.C13026h;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.P;
import U0.o1;
import XH.C16807N;
import XH.y;
import Yv.C6733a;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fn.C11275a;
import fn.C11277c;
import kD.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14761c;
import nI.C17631a;
import nI.p;
import uK.C18146a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u001c8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u0013\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006'²\u0006\f\u0010%\u001a\u00020\u00168\nX\u0002²\u0006\u000e\u0010&\u001a\u00020\n8\n@\nX\u0002"}, d2 = {"LXv/b;", "Lbw/a;", "Lzv/b;", "analytics", "LlD/c;", "getProfileFlowUseCase", "LYv/a;", "getAddToListEventFlowUseCase", "<init>", "(Lzv/b;LlD/c;LYv/a;)V", "", "selected", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(ZLandroidx/compose/ui/d;LU0/m;I)V", "b", "()V", "a", "Lzv/b;", "LTJ/g;", "LkD/j;", "LTJ/g;", "profileFlow", "LYv/a$a;", "c", "addToListEventFlow", "", "Ljava/lang/String;", "()Ljava/lang/String;", "route", "", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "typeSafeRoute", "profile", "showHeartAnimation", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements bw.a {

    /* renamed from: a  reason: collision with root package name */
    private final zv.b f40801a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<j> f40802b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16532g<C6733a.C0694a> f40803c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40804d = "membership";

    /* renamed from: e  reason: collision with root package name */
    private final Object f40805e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.presentation.MembershipNavigationTabImpl$Icon$1$1", f = "MembershipNavigationTabImpl.kt", l = {56}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f40807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f40808e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Xv.b$a$a  reason: collision with other inner class name */
        static final class C0680a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f40809a;

            C0680a(C4899r0<Boolean> r0Var) {
                this.f40809a = r0Var;
            }

            /* renamed from: c */
            public final Object emit(C6733a.C0694a aVar, C17164e<? super C16807N> eVar) {
                b.h(this.f40809a, true);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f40807d = bVar;
            this.f40808e = r0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f40807d, this.f40808e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40806c;
            if (i10 == 0) {
                y.b(obj);
                C16532g k10 = this.f40807d.f40803c;
                C0680a aVar = new C0680a(this.f40808e);
                this.f40806c = 1;
                if (k10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public b(zv.b bVar, C14761c cVar, C6733a aVar) {
        C17542s.j(bVar, "analytics");
        C17542s.j(cVar, "getProfileFlowUseCase");
        C17542s.j(aVar, "getAddToListEventFlowUseCase");
        this.f40801a = bVar;
        this.f40802b = cVar.invoke();
        this.f40803c = aVar.invoke();
    }

    private static final j f(A1<? extends j> a12) {
        return (j) a12.getValue();
    }

    private static final boolean g(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void h(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C4899r0 r0Var) {
        h(r0Var, false);
        return C16807N.f139792a;
    }

    public String a() {
        return this.f40804d;
    }

    public void b() {
        this.f40801a.h();
    }

    public Object c() {
        return this.f40805e;
    }

    public void d(boolean z10, d dVar, C4889m mVar, int i10) {
        C4889m mVar2 = mVar;
        int i11 = i10;
        d dVar2 = dVar;
        C17542s.j(dVar, "modifier");
        mVar.W(-1344464109);
        if (C4895p.J()) {
            C4895p.S(-1344464109, i11, -1, "com.ingka.ikea.membership.impl.presentation.MembershipNavigationTabImpl.Icon (MembershipNavigationTabImpl.kt:40)");
        }
        A1<j> b10 = j3.a.b(this.f40802b, j.b.f128644a, (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 14);
        if (f(b10) instanceof j.c) {
            mVar.W(-1372201203);
            C11277c.b(C18146a.f148013D8, C13026h.a(Oo.b.f84392H4), dVar, (C11275a) null, mVar, (C13023e.f110931a << 3) | ((i11 << 3) & 896), 8);
            mVar.P();
        } else {
            mVar.W(-1371907974);
            mVar.W(-44254225);
            Object D10 = mVar.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                mVar.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            mVar.P();
            C16532g<C6733a.C0694a> gVar = this.f40803c;
            mVar.W(-44251379);
            boolean F10 = mVar.F(this);
            Object D11 = mVar.D();
            if (F10 || D11 == aVar.a()) {
                D11 = new a(this, r0Var, (C17164e<? super a>) null);
                mVar.u(D11);
            }
            mVar.P();
            P.g(gVar, (p) D11, mVar, 0);
            String a10 = c.c(f(b10));
            boolean b11 = c.d(f(b10));
            boolean g10 = g(r0Var);
            mVar.W(-44239381);
            Object D12 = mVar.D();
            if (D12 == aVar.a()) {
                D12 = new a(r0Var);
                mVar.u(D12);
            }
            mVar.P();
            Bv.r.j(a10, b11, z10, g10, (C17631a) D12, (d) null, mVar, ((i11 << 6) & 896) | 24576, 32);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
