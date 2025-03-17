package Bv;

import L1.i;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import UC.C13721b;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import n0.C5584G;
import nI.C17631a;
import nI.p;
import o1.C5673m;
import p1.p1;
import r0.j;
import r0.m;
import r0.o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\u000e\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "LBv/g;", "state", "d", "(Landroidx/compose/ui/d;LBv/g;)Landroidx/compose/ui/d;", "Lkotlin/Function0;", "LXH/N;", "onClick", "LQJ/Q;", "scope", "Lr0/m;", "interactionSource", "Ln0/G;", "focusIndication", "g", "(LnI/a;LQJ/Q;Lr0/m;Ln0/G;LU0/m;II)LBv/g;", "onClickLambda", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.common.JumpOnClickModifierKt$rememberJumpAnimationState$2$1", f = "JumpOnClickModifier.kt", l = {80}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f33498d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6402g f33499e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f33500f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bv.l$a$a  reason: collision with other inner class name */
        static final class C0514a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C6402g f33501a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ A1<C17631a<C16807N>> f33502b;

            C0514a(C6402g gVar, A1<? extends C17631a<C16807N>> a12) {
                this.f33501a = gVar;
                this.f33502b = a12;
            }

            /* renamed from: c */
            public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
                if (jVar instanceof o.b) {
                    this.f33501a.g();
                } else if (jVar instanceof o.c) {
                    this.f33501a.h(l.h(this.f33502b));
                } else if (jVar instanceof o.a) {
                    this.f33501a.f();
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C6402g gVar, A1<? extends C17631a<C16807N>> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33498d = mVar;
            this.f33499e = gVar;
            this.f33500f = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33498d, this.f33499e, this.f33500f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33497c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<j> c10 = this.f33498d.c();
                C0514a aVar = new C0514a(this.f33499e, this.f33500f);
                this.f33497c = 1;
                if (c10.collect(aVar, this) == f10) {
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

    public static final d d(d dVar, C6402g gVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(gVar, "state");
        return dVar.s(b.a(androidx.compose.foundation.d.b(d.f18749a, gVar.b(), gVar.a(), false, (String) null, (i) null, new C6405j(), 28, (Object) null), new C6406k(gVar)));
    }

    /* access modifiers changed from: private */
    public static final C16807N e() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C6402g gVar, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.L0(p1.a(0.5f, 1.0f));
        cVar.m(gVar.c().m().floatValue());
        cVar.e(gVar.d().m().floatValue() * C5673m.i(cVar.b()));
        return C16807N.f139792a;
    }

    public static final C6402g g(C17631a<C16807N> aVar, Q q10, m mVar, C5584G g10, C4889m mVar2, int i10, int i11) {
        C17542s.j(aVar, "onClick");
        mVar2.W(1078743447);
        if ((i11 & 2) != 0) {
            Object D10 = mVar2.D();
            if (D10 == C4889m.f14007a.a()) {
                B b10 = new B(P.k(C17169j.f142968a, mVar2));
                mVar2.u(b10);
                D10 = b10;
            }
            q10 = ((B) D10).a();
        }
        if ((i11 & 4) != 0) {
            mVar2.W(-97337677);
            Object D11 = mVar2.D();
            if (D11 == C4889m.f14007a.a()) {
                D11 = r0.l.a();
                mVar2.u(D11);
            }
            mVar = (m) D11;
            mVar2.P();
        }
        boolean z10 = false;
        if ((i11 & 8) != 0) {
            g10 = C13721b.a(mVar2, 0);
        }
        if (C4895p.J()) {
            C4895p.S(1078743447, i10, -1, "com.ingka.ikea.membership.impl.compose.common.rememberJumpAnimationState (JumpOnClickModifier.kt:68)");
        }
        mVar2.W(-97332527);
        int i12 = (i10 & 896) ^ 384;
        boolean V10 = mVar2.V(q10) | ((i12 > 256 && mVar2.V(mVar)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && mVar2.V(g10)) || (i10 & 3072) == 2048);
        Object D12 = mVar2.D();
        if (V10 || D12 == C4889m.f14007a.a()) {
            D12 = new C6402g(mVar, g10, q10);
            mVar2.u(D12);
        }
        C6402g gVar = (C6402g) D12;
        mVar2.P();
        A1<T> q11 = U0.p1.q(aVar, mVar2, i10 & 14);
        mVar2.W(-97322058);
        if ((i12 > 256 && mVar2.V(mVar)) || (i10 & 384) == 256) {
            z10 = true;
        }
        boolean V11 = mVar2.V(gVar) | z10 | mVar2.V(q11);
        Object D13 = mVar2.D();
        if (V11 || D13 == C4889m.f14007a.a()) {
            D13 = new a(mVar, gVar, q11, (C17164e<? super a>) null);
            mVar2.u(D13);
        }
        mVar2.P();
        P.g(mVar, (p) D13, mVar2, (i10 >> 6) & 14);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar2.P();
        return gVar;
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> h(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }
}
