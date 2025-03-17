package O0;

import A1.K;
import A1.U;
import E1.I;
import G1.C4504g;
import L1.v;
import L1.x;
import Q0.t;
import Q0.u;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.C5267b;
import dI.C17164e;
import dI.C17168i;
import e2.C5295b;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.C5530a;
import m0.C5534c;
import m0.C5546i;
import m0.C5554m;
import m0.y0;
import n0.C5603i;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5673m;
import p0.G;
import p1.C5749w0;
import p1.i1;
import p1.p1;
import s0.C5848T;
import s0.C5852X;
import s0.C5857c;
import s0.C5861g;
import tI.C17978n;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a°\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aÐ\u0001\u0010#\u001a\u00020\u0001*\u00020\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001b\u0010'\u001a\u00020\u001c*\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010)\u001a\u00020\u001c*\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010(\u001a/\u0010.\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020*2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020*0\u0015H\u0007¢\u0006\u0004\b.\u0010/\u001a0\u00102\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u00101\u001a\u00020*H\u0003ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u0014\u00105\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00104\"\u0014\u00106\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00104\"\u0014\u00109\u001a\u0002078\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00108\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;²\u0006\f\u0010:\u001a\u00020\u001c8\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "LO0/F0;", "sheetState", "Lc2/h;", "sheetMaxWidth", "Lp1/i1;", "shape", "Lp1/v0;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Ls0/T;", "contentWindowInsets", "LO0/f0;", "properties", "Lkotlin/Function1;", "Ls0/g;", "content", "a", "(LnI/a;Landroidx/compose/ui/d;LO0/F0;FLp1/i1;JJFJLnI/p;LnI/p;LO0/f0;LnI/q;LU0/m;III)V", "Ls0/c;", "Lm0/a;", "", "Lm0/m;", "predictiveBackProgress", "LQJ/Q;", "scope", "animateToDismiss", "settleToDismiss", "b", "(Ls0/c;Lm0/a;LQJ/Q;LnI/a;LnI/l;Landroidx/compose/ui/d;LO0/F0;FLp1/i1;JJFLnI/p;LnI/p;LnI/q;LU0/m;III)V", "Landroidx/compose/ui/graphics/c;", "progress", "j", "(Landroidx/compose/ui/graphics/c;F)F", "k", "", "skipPartiallyExpanded", "LO0/G0;", "confirmValueChange", "l", "(ZLnI/l;LU0/m;II)LO0/F0;", "color", "visible", "c", "(JLnI/a;ZLU0/m;I)V", "F", "PredictiveBackMaxScaleXDistance", "PredictiveBackMaxScaleYDistance", "Landroidx/compose/ui/graphics/f;", "J", "PredictiveBackChildTransformOrigin", "alpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.e0  reason: case insensitive filesystem */
public final class C4725e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f10634a = c2.h.B((float) 48);

    /* renamed from: b  reason: collision with root package name */
    private static final float f10635b = c2.h.B((float) 24);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f10636c = p1.a(0.5f, 0.0f);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$a */
    static final class a extends C17544u implements nI.p<C4889m, Integer, C5848T> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10637c = new a();

        a() {
            super(2);
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(58488196);
            if (C4895p.J()) {
                C4895p.S(58488196, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
            }
            C5848T h10 = C4732i.f10831a.h(mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$b */
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f10639d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f10640e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10641f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: O0.e0$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10642c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5530a<Float, C5554m> f10643d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5530a<Float, C5554m> aVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f10643d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f10643d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10642c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a<Float, C5554m> aVar = this.f10643d;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                    this.f10642c = 1;
                    if (C5530a.f(aVar, d10, (C5546i) null, (Object) null, (C17642l) null, this, 14, (Object) null) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.kt", l = {162}, m = "invokeSuspend")
        /* renamed from: O0.e0$b$b  reason: collision with other inner class name */
        static final class C0159b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10644c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f10645d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0159b(F0 f02, C17164e<? super C0159b> eVar) {
                super(2, eVar);
                this.f10645d = f02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0159b(this.f10645d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0159b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10644c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f10645d;
                    this.f10644c = 1;
                    if (f02.m(this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", f = "ModalBottomSheet.kt", l = {164}, m = "invokeSuspend")
        /* renamed from: O0.e0$b$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10646c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f10647d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(F0 f02, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f10647d = f02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f10647d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10646c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f10647d;
                    this.f10646c = 1;
                    if (f02.k(this) == f10) {
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$b$d */
        static final class d extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10648c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C17631a<C16807N> aVar) {
                super(1);
                this.f10648c = aVar;
            }

            public final void a(Throwable th2) {
                this.f10648c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(F0 f02, Q q10, C5530a<Float, C5554m> aVar, C17631a<C16807N> aVar2) {
            super(0);
            this.f10638c = f02;
            this.f10639d = q10;
            this.f10640e = aVar;
            this.f10641f = aVar2;
        }

        public final void invoke() {
            if (this.f10638c.e() != G0.Expanded || !this.f10638c.g()) {
                C16314k.d(this.f10639d, (C17168i) null, (T) null, new c(this.f10638c, (C17164e<? super c>) null), 3, (Object) null).s(new d(this.f10641f));
                return;
            }
            F0 unused = C16314k.d(this.f10639d, (C17168i) null, (T) null, new a(this.f10640e, (C17164e<? super a>) null), 3, (Object) null);
            F0 unused2 = C16314k.d(this.f10639d, (C17168i) null, (T) null, new C0159b(this.f10638c, (C17164e<? super C0159b>) null), 3, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$c */
    static final class c extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10649c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10650d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f10651e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f10652f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Q f10653g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f10654h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10655i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10656j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i1 f10657k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f10658l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10659m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ float f10660n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f10661o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C5848T> f10662p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ nI.q<C5861g, C4889m, Integer, C16807N> f10663q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$c$a */
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f10664c = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.A0(xVar, true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(long j10, C17631a<C16807N> aVar, F0 f02, C5530a<Float, C5554m> aVar2, Q q10, C17642l<? super Float, C16807N> lVar, androidx.compose.ui.d dVar, float f10, i1 i1Var, long j11, long j12, float f11, nI.p<? super C4889m, ? super Integer, C16807N> pVar, nI.p<? super C4889m, ? super Integer, ? extends C5848T> pVar2, nI.q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10649c = j10;
            this.f10650d = aVar;
            this.f10651e = f02;
            this.f10652f = aVar2;
            this.f10653g = q10;
            this.f10654h = lVar;
            this.f10655i = dVar;
            this.f10656j = f10;
            this.f10657k = i1Var;
            this.f10658l = j11;
            this.f10659m = j12;
            this.f10660n = f11;
            this.f10661o = pVar;
            this.f10662p = pVar2;
            this.f10663q = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-314673510, i11, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                }
                androidx.compose.ui.d d10 = L1.o.d(C5852X.b(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null)), false, a.f10664c, 1, (Object) null);
                long j10 = this.f10649c;
                C17631a<C16807N> aVar = this.f10650d;
                F0 f02 = this.f10651e;
                C5530a<Float, C5554m> aVar2 = this.f10652f;
                Q q10 = this.f10653g;
                C17642l<Float, C16807N> lVar = this.f10654h;
                androidx.compose.ui.d dVar = this.f10655i;
                float f10 = this.f10656j;
                i1 i1Var = this.f10657k;
                long j11 = j10;
                long j12 = this.f10658l;
                long j13 = this.f10659m;
                float f11 = this.f10660n;
                nI.p<C4889m, Integer, C16807N> pVar = this.f10661o;
                long j14 = j13;
                nI.p<C4889m, Integer, C5848T> pVar2 = this.f10662p;
                nI.q<C5861g, C4889m, Integer, C16807N> qVar = this.f10663q;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, d10);
                C4504g.a aVar3 = C4504g.f6515W;
                nI.p<C4889m, Integer, C16807N> pVar3 = pVar;
                C17631a<C4504g> a11 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                i1 i1Var2 = i1Var;
                F1.c(a12, h10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                C4725e0.c(j11, aVar, f02.j() != G0.Hidden, mVar, 0);
                C4725e0.b(jVar, aVar2, q10, aVar, lVar, dVar, f02, f10, i1Var2, j12, j14, f11, pVar3, pVar2, qVar, mVar, 6 | (C5530a.f25673m << 3), 0, 0);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {194}, m = "invokeSuspend")
    /* renamed from: O0.e0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f10665c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f10666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f10666d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f10666d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f10665c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f10666d;
                this.f10665c = 1;
                if (f02.p(this) == f10) {
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$e */
    static final class e extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10668d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f10669e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f10670f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i1 f10671g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f10672h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ long f10673i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10674j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f10675k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f10676l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C5848T> f10677m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C4727f0 f10678n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ nI.q<C5861g, C4889m, Integer, C16807N> f10679o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f10680p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f10681q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f10682r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17631a<C16807N> aVar, androidx.compose.ui.d dVar, F0 f02, float f10, i1 i1Var, long j10, long j11, float f11, long j12, nI.p<? super C4889m, ? super Integer, C16807N> pVar, nI.p<? super C4889m, ? super Integer, ? extends C5848T> pVar2, C4727f0 f0Var, nI.q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11, int i12) {
            super(2);
            this.f10667c = aVar;
            this.f10668d = dVar;
            this.f10669e = f02;
            this.f10670f = f10;
            this.f10671g = i1Var;
            this.f10672h = j10;
            this.f10673i = j11;
            this.f10674j = f11;
            this.f10675k = j12;
            this.f10676l = pVar;
            this.f10677m = pVar2;
            this.f10678n = f0Var;
            this.f10679o = qVar;
            this.f10680p = i10;
            this.f10681q = i11;
            this.f10682r = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C17631a<C16807N> aVar = this.f10667c;
            C17631a<C16807N> aVar2 = aVar;
            C4725e0.a(aVar2, this.f10668d, this.f10669e, this.f10670f, this.f10671g, this.f10672h, this.f10673i, this.f10674j, this.f10675k, this.f10676l, this.f10677m, this.f10678n, this.f10679o, mVar2, M0.a(this.f10680p | 1), M0.a(this.f10681q), this.f10682r);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$f */
    static final class f extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10683c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Q f10684d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10685e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {138}, m = "invokeSuspend")
        /* renamed from: O0.e0$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10686c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f10687d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(F0 f02, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f10687d = f02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f10687d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10686c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f10687d;
                    this.f10686c = 1;
                    if (f02.k(this) == f10) {
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$f$b */
        static final class b extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ F0 f10688c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10689d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(F0 f02, C17631a<C16807N> aVar) {
                super(1);
                this.f10688c = f02;
                this.f10689d = aVar;
            }

            public final void a(Throwable th2) {
                if (!this.f10688c.l()) {
                    this.f10689d.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(F0 f02, Q q10, C17631a<C16807N> aVar) {
            super(0);
            this.f10683c = f02;
            this.f10684d = q10;
            this.f10685e = aVar;
        }

        public final void invoke() {
            if (this.f10683c.d().r().invoke(G0.Hidden).booleanValue()) {
                C16314k.d(this.f10684d, (C17168i) null, (T) null, new a(this.f10683c, (C17164e<? super a>) null), 3, (Object) null).s(new b(this.f10683c, this.f10685e));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$g */
    static final class g extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f10690c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f10691d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10692e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {148}, m = "invokeSuspend")
        /* renamed from: O0.e0$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f10693c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f10694d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f10695e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(F0 f02, float f10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f10694d = f02;
                this.f10695e = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f10694d, this.f10695e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f10693c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f10694d;
                    float f11 = this.f10695e;
                    this.f10693c = 1;
                    if (f02.o(f11, this) == f10) {
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

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$g$b */
        static final class b extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ F0 f10696c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10697d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(F0 f02, C17631a<C16807N> aVar) {
                super(1);
                this.f10696c = f02;
                this.f10697d = aVar;
            }

            public final void a(Throwable th2) {
                if (!this.f10696c.l()) {
                    this.f10697d.invoke();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Q q10, F0 f02, C17631a<C16807N> aVar) {
            super(1);
            this.f10690c = q10;
            this.f10691d = f02;
            this.f10692e = aVar;
        }

        public final void a(float f10) {
            C16314k.d(this.f10690c, (C17168i) null, (T) null, new a(this.f10691d, f10, (C17164e<? super a>) null), 3, (Object) null).s(new b(this.f10691d, this.f10692e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$h */
    static final class h extends C17544u implements nI.p<C4889m, Integer, C5848T> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f10698c = new h();

        h() {
            super(2);
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(-11444670);
            if (C4895p.J()) {
                C4895p.S(-11444670, i10, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
            }
            C5848T h10 = C4732i.f10831a.h(mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return h10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc2/r;", "sheetSize", "Lc2/b;", "constraints", "LXH/v;", "LQ0/g;", "LO0/G0;", "a", "(JJ)LXH/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$i */
    static final class i extends C17544u implements nI.p<c2.r, C5267b, XH.v<? extends Q0.g<G0>, ? extends G0>> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10699c;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.e0$i$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10700a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    O0.G0[] r0 = O0.G0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.G0 r1 = O0.G0.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.G0 r1 = O0.G0.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    O0.G0 r1 = O0.G0.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f10700a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: O0.C4725e0.i.a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQ0/h;", "LO0/G0;", "LXH/N;", "a", "(LQ0/h;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$i$b */
        static final class b extends C17544u implements C17642l<Q0.h<G0>, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f10701c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f10702d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ F0 f10703e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(float f10, long j10, F0 f02) {
                super(1);
                this.f10701c = f10;
                this.f10702d = j10;
                this.f10703e = f02;
            }

            public final void a(Q0.h<G0> hVar) {
                hVar.a(G0.Hidden, this.f10701c);
                if (((float) c2.r.g(this.f10702d)) > this.f10701c / ((float) 2) && !this.f10703e.i()) {
                    hVar.a(G0.PartiallyExpanded, this.f10701c / 2.0f);
                }
                if (c2.r.g(this.f10702d) != 0) {
                    hVar.a(G0.Expanded, Math.max(0.0f, this.f10701c - ((float) c2.r.g(this.f10702d))));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Q0.h) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(F0 f02) {
            super(2);
            this.f10699c = f02;
        }

        public final XH.v<Q0.g<G0>, G0> a(long j10, long j11) {
            G0 g02;
            Q0.g a10 = androidx.compose.material3.internal.b.a(new b((float) C5267b.k(j11), j10, this.f10699c));
            int i10 = a.f10700a[this.f10699c.d().x().ordinal()];
            if (i10 == 1) {
                g02 = G0.Hidden;
            } else if (i10 == 2 || i10 == 3) {
                g02 = G0.PartiallyExpanded;
                if (!a10.d(g02)) {
                    g02 = G0.Expanded;
                    if (!a10.d(g02)) {
                        g02 = G0.Hidden;
                    }
                }
            } else {
                throw new t();
            }
            return C16796C.a(a10, g02);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((c2.r) obj).k(), ((C5267b) obj2).r());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "it", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: O0.e0$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f10704c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ float f10705d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f10706e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C17642l<? super Float, C16807N> lVar, C17164e<? super j> eVar) {
            super(3, eVar);
            this.f10706e = lVar;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            j jVar = new j(this.f10706e, eVar);
            jVar.f10705d = f10;
            return jVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f10704c == 0) {
                y.b(obj);
                this.f10706e.invoke(kotlin.coroutines.jvm.internal.b.d(this.f10705d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$k */
    static final class k extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f10707c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.f10707c = str;
        }

        public final void a(x xVar) {
            v.j0(xVar, this.f10707c);
            v.B0(xVar, 0.0f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$l */
    static final class l extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f10708c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f10709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(F0 f02, C5530a<Float, C5554m> aVar) {
            super(1);
            this.f10708c = f02;
            this.f10709d = aVar;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            float w10 = this.f10708c.d().w();
            float i10 = C5673m.i(cVar.b());
            if (!Float.isNaN(w10) && !Float.isNaN(i10) && i10 != 0.0f) {
                float floatValue = this.f10709d.m().floatValue();
                cVar.g(C4725e0.j(cVar, floatValue));
                cVar.m(C4725e0.k(cVar, floatValue));
                cVar.L0(p1.a(0.5f, (w10 + i10) / i10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$m */
    static final class m extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C5848T> f10710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f10711d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f10712e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F0 f10713f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10714g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Q f10715h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ nI.q<C5861g, C4889m, Integer, C16807N> f10716i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$m$a */
        static final class a extends C17544u implements C17642l<androidx.compose.ui.graphics.c, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5530a<Float, C5554m> f10717c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5530a<Float, C5554m> aVar) {
                super(1);
                this.f10717c = aVar;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                float floatValue = this.f10717c.m().floatValue();
                float g10 = C4725e0.j(cVar, floatValue);
                float h10 = C4725e0.k(cVar, floatValue);
                cVar.m(h10 == 0.0f ? 1.0f : g10 / h10);
                cVar.L0(C4725e0.f10636c);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$m$b */
        static final class b extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ F0 f10718c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f10719d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f10720e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f10721f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10722g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Q f10723h;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.e0$m$b$a */
            static final class a extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C17631a<C16807N> f10724c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(C17631a<C16807N> aVar) {
                    super(0);
                    this.f10724c = aVar;
                }

                public final Boolean invoke() {
                    this.f10724c.invoke();
                    return Boolean.TRUE;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.e0$m$b$b  reason: collision with other inner class name */
            static final class C0160b extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ F0 f10725c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Q f10726d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ F0 f10727e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", f = "ModalBottomSheet.kt", l = {321}, m = "invokeSuspend")
                /* renamed from: O0.e0$m$b$b$a */
                static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f10728c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ F0 f10729d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(F0 f02, C17164e<? super a> eVar) {
                        super(2, eVar);
                        this.f10729d = f02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new a(this.f10729d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f10728c;
                        if (i10 == 0) {
                            y.b(obj);
                            F0 f02 = this.f10729d;
                            this.f10728c = 1;
                            if (f02.c(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0160b(F0 f02, Q q10, F0 f03) {
                    super(0);
                    this.f10725c = f02;
                    this.f10726d = q10;
                    this.f10727e = f03;
                }

                public final Boolean invoke() {
                    if (this.f10725c.d().r().invoke(G0.Expanded).booleanValue()) {
                        F0 unused = C16314k.d(this.f10726d, (C17168i) null, (T) null, new a(this.f10727e, (C17164e<? super a>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: O0.e0$m$b$c */
            static final class c extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ F0 f10730c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Q f10731d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", f = "ModalBottomSheet.kt", l = {330}, m = "invokeSuspend")
                /* renamed from: O0.e0$m$b$c$a */
                static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f10732c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ F0 f10733d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(F0 f02, C17164e<? super a> eVar) {
                        super(2, eVar);
                        this.f10733d = f02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new a(this.f10733d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f10732c;
                        if (i10 == 0) {
                            y.b(obj);
                            F0 f02 = this.f10733d;
                            this.f10732c = 1;
                            if (f02.m(this) == f10) {
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

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(F0 f02, Q q10) {
                    super(0);
                    this.f10730c = f02;
                    this.f10731d = q10;
                }

                public final Boolean invoke() {
                    if (this.f10730c.d().r().invoke(G0.PartiallyExpanded).booleanValue()) {
                        F0 unused = C16314k.d(this.f10731d, (C17168i) null, (T) null, new a(this.f10730c, (C17164e<? super a>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(F0 f02, String str, String str2, String str3, C17631a<C16807N> aVar, Q q10) {
                super(1);
                this.f10718c = f02;
                this.f10719d = str;
                this.f10720e = str2;
                this.f10721f = str3;
                this.f10722g = aVar;
                this.f10723h = q10;
            }

            public final void a(x xVar) {
                F0 f02 = this.f10718c;
                String str = this.f10719d;
                String str2 = this.f10720e;
                String str3 = this.f10721f;
                C17631a<C16807N> aVar = this.f10722g;
                Q q10 = this.f10723h;
                v.m(xVar, str, new a(aVar));
                if (f02.e() == G0.PartiallyExpanded) {
                    v.p(xVar, str2, new C0160b(f02, q10, f02));
                } else if (f02.g()) {
                    v.e(xVar, str3, new c(f02, q10));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(nI.p<? super C4889m, ? super Integer, ? extends C5848T> pVar, C5530a<Float, C5554m> aVar, nI.p<? super C4889m, ? super Integer, C16807N> pVar2, F0 f02, C17631a<C16807N> aVar2, Q q10, nI.q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f10710c = pVar;
            this.f10711d = aVar;
            this.f10712e = pVar2;
            this.f10713f = f02;
            this.f10714g = aVar2;
            this.f10715h = q10;
            this.f10716i = qVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0143, code lost:
            if (r7 == U0.C4889m.f14007a.a()) goto L_0x0145;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(U0.C4889m r19, int r20) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r2 & 3
                r4 = 2
                if (r3 != r4) goto L_0x0017
                boolean r3 = r19.l()
                if (r3 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r19.L()
                goto L_0x01e8
            L_0x0017:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x0026
                r3 = -1
                java.lang.String r4 = "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)"
                r5 = -692668920(0xffffffffd6b6b608, float:-1.00446467E14)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x0026:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r3 = 0
                r4 = 0
                r5 = 1
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r2, r3, r5, r4)
                nI.p<U0.m, java.lang.Integer, s0.T> r4 = r0.f10710c
                r6 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                java.lang.Object r4 = r4.invoke(r1, r7)
                s0.T r4 = (s0.C5848T) r4
                androidx.compose.ui.d r3 = s0.C5851W.d(r3, r4)
                m0.a<java.lang.Float, m0.m> r4 = r0.f10711d
                boolean r4 = r1.F(r4)
                m0.a<java.lang.Float, m0.m> r7 = r0.f10711d
                java.lang.Object r8 = r19.D()
                if (r4 != 0) goto L_0x0056
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r8 != r4) goto L_0x005e
            L_0x0056:
                O0.e0$m$a r8 = new O0.e0$m$a
                r8.<init>(r7)
                r1.u(r8)
            L_0x005e:
                nI.l r8 = (nI.C17642l) r8
                androidx.compose.ui.d r3 = androidx.compose.ui.graphics.b.a(r3, r8)
                nI.p<U0.m, java.lang.Integer, XH.N> r4 = r0.f10712e
                O0.F0 r8 = r0.f10713f
                nI.a<XH.N> r12 = r0.f10714g
                QJ.Q r13 = r0.f10715h
                nI.q<s0.g, U0.m, java.lang.Integer, XH.N> r14 = r0.f10716i
                androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r7 = r7.g()
                i1.c$a r15 = i1.C5437c.f24302a
                i1.c$b r9 = r15.k()
                E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r1, r6)
                int r9 = U0.C4883j.a(r1, r6)
                U0.y r10 = r19.s()
                androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r1, r3)
                G1.g$a r16 = G1.C4504g.f6515W
                nI.a r11 = r16.a()
                U0.f r17 = r19.m()
                if (r17 != 0) goto L_0x0099
                U0.C4883j.c()
            L_0x0099:
                r19.I()
                boolean r17 = r19.i()
                if (r17 == 0) goto L_0x00a6
                r1.p(r11)
                goto L_0x00a9
            L_0x00a6:
                r19.t()
            L_0x00a9:
                U0.m r11 = U0.F1.a(r19)
                nI.p r5 = r16.c()
                U0.F1.c(r11, r7, r5)
                nI.p r5 = r16.e()
                U0.F1.c(r11, r10, r5)
                nI.p r5 = r16.b()
                boolean r7 = r11.i()
                if (r7 != 0) goto L_0x00d3
                java.lang.Object r7 = r11.D()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r10)
                if (r7 != 0) goto L_0x00e1
            L_0x00d3:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r11.u(r7)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r11.w(r7, r5)
            L_0x00e1:
                nI.p r5 = r16.d()
                U0.F1.c(r11, r3, r5)
                s0.h r3 = s0.C5862h.f28810a
                r5 = -1636564008(0xffffffff9e7403d8, float:-1.2918047E-20)
                r1.W(r5)
                if (r4 == 0) goto L_0x01d1
                Q0.t$a r5 = Q0.t.f12046a
                int r5 = O0.C4749q0.f11443a
                int r5 = Q0.t.a(r5)
                java.lang.String r11 = Q0.u.a(r5, r1, r6)
                int r5 = O0.C4749q0.f11444b
                int r5 = Q0.t.a(r5)
                java.lang.String r9 = Q0.u.a(r5, r1, r6)
                int r5 = O0.C4749q0.f11446d
                int r5 = Q0.t.a(r5)
                java.lang.String r10 = Q0.u.a(r5, r1, r6)
                i1.c$b r5 = r15.g()
                androidx.compose.ui.d r2 = r3.b(r2, r5)
                boolean r5 = r1.V(r8)
                boolean r7 = r1.V(r9)
                r5 = r5 | r7
                boolean r7 = r1.V(r12)
                r5 = r5 | r7
                boolean r7 = r1.V(r10)
                r5 = r5 | r7
                boolean r7 = r1.F(r13)
                r5 = r5 | r7
                boolean r7 = r1.V(r11)
                r5 = r5 | r7
                java.lang.Object r7 = r19.D()
                if (r5 != 0) goto L_0x0145
                U0.m$a r5 = U0.C4889m.f14007a
                java.lang.Object r5 = r5.a()
                if (r7 != r5) goto L_0x014e
            L_0x0145:
                O0.e0$m$b r5 = new O0.e0$m$b
                r7 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13)
                r1.u(r5)
            L_0x014e:
                nI.l r7 = (nI.C17642l) r7
                r5 = 1
                androidx.compose.ui.d r2 = L1.o.c(r2, r5, r7)
                i1.c r5 = r15.o()
                E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r6)
                int r7 = U0.C4883j.a(r1, r6)
                U0.y r8 = r19.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
                nI.a r9 = r16.a()
                U0.f r10 = r19.m()
                if (r10 != 0) goto L_0x0176
                U0.C4883j.c()
            L_0x0176:
                r19.I()
                boolean r10 = r19.i()
                if (r10 == 0) goto L_0x0183
                r1.p(r9)
                goto L_0x0186
            L_0x0183:
                r19.t()
            L_0x0186:
                U0.m r9 = U0.F1.a(r19)
                nI.p r10 = r16.c()
                U0.F1.c(r9, r5, r10)
                nI.p r5 = r16.e()
                U0.F1.c(r9, r8, r5)
                nI.p r5 = r16.b()
                boolean r8 = r9.i()
                if (r8 != 0) goto L_0x01b0
                java.lang.Object r8 = r9.D()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
                if (r8 != 0) goto L_0x01be
            L_0x01b0:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9.u(r8)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9.w(r7, r5)
            L_0x01be:
                nI.p r5 = r16.d()
                U0.F1.c(r9, r2, r5)
                androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r4.invoke(r1, r2)
                r19.x()
            L_0x01d1:
                r19.P()
                r2 = 6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r14.invoke(r3, r1, r2)
                r19.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x01e8
                U0.C4895p.R()
            L_0x01e8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.C4725e0.m.a(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$n */
    static final class n extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5857c f10734c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f10735d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f10736e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10737f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f10738g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f10739h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ F0 f10740i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f10741j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i1 f10742k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f10743l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f10744m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ float f10745n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C16807N> f10746o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ nI.p<C4889m, Integer, C5848T> f10747p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ nI.q<C5861g, C4889m, Integer, C16807N> f10748q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f10749r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f10750s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f10751t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C5857c cVar, C5530a<Float, C5554m> aVar, Q q10, C17631a<C16807N> aVar2, C17642l<? super Float, C16807N> lVar, androidx.compose.ui.d dVar, F0 f02, float f10, i1 i1Var, long j10, long j11, float f11, nI.p<? super C4889m, ? super Integer, C16807N> pVar, nI.p<? super C4889m, ? super Integer, ? extends C5848T> pVar2, nI.q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, int i10, int i11, int i12) {
            super(2);
            this.f10734c = cVar;
            this.f10735d = aVar;
            this.f10736e = q10;
            this.f10737f = aVar2;
            this.f10738g = lVar;
            this.f10739h = dVar;
            this.f10740i = f02;
            this.f10741j = f10;
            this.f10742k = i1Var;
            this.f10743l = j10;
            this.f10744m = j11;
            this.f10745n = f11;
            this.f10746o = pVar;
            this.f10747p = pVar2;
            this.f10748q = qVar;
            this.f10749r = i10;
            this.f10750s = i11;
            this.f10751t = i12;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            C5857c cVar = this.f10734c;
            C5857c cVar2 = cVar;
            C4725e0.b(cVar2, this.f10735d, this.f10736e, this.f10737f, this.f10738g, this.f10739h, this.f10740i, this.f10741j, this.f10742k, this.f10743l, this.f10744m, this.f10745n, this.f10746o, this.f10747p, this.f10748q, mVar2, M0.a(this.f10749r | 1), M0.a(this.f10750s), this.f10751t);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$o */
    static final class o extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10752c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<Float> f10753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(long j10, A1<Float> a12) {
            super(1);
            this.f10752c = j10;
            this.f10753d = a12;
        }

        public final void a(r1.f fVar) {
            r1.f.q1(fVar, this.f10752c, 0, 0, C17978n.l(C4725e0.d(this.f10753d), 0.0f, 1.0f), (r1.g) null, (C5749w0) null, 0, 118, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$p */
    static final class p extends C17544u implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f10754c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10755d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f10756e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f10757f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(long j10, C17631a<C16807N> aVar, boolean z10, int i10) {
            super(2);
            this.f10754c = j10;
            this.f10755d = aVar;
            this.f10756e = z10;
            this.f10757f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C4725e0.c(this.f10754c, this.f10755d, this.f10756e, mVar, M0.a(this.f10757f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/K;", "LXH/N;", "<anonymous>", "(LA1/K;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.kt", l = {415}, m = "invokeSuspend")
    /* renamed from: O0.e0$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<K, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f10758c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f10759d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10760e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: O0.e0$q$a */
        static final class a extends C17544u implements C17642l<C5667g, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10761c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(1);
                this.f10761c = aVar;
            }

            public final void a(long j10) {
                this.f10761c.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C5667g) obj).v());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(C17631a<C16807N> aVar, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f10760e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            q qVar = new q(this.f10760e, eVar);
            qVar.f10759d = obj;
            return qVar;
        }

        /* renamed from: i */
        public final Object invoke(K k10, C17164e<? super C16807N> eVar) {
            return ((q) create(k10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f10758c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f10760e);
                this.f10758c = 1;
                if (G.j((K) this.f10759d, (C17642l) null, (C17642l) null, (nI.q) null, aVar, this, 7, (Object) null) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.e0$r */
    static final class r extends C17544u implements C17642l<x, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f10762c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f10763d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O0.e0$r$a */
        static final class a extends C17544u implements C17631a<Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f10764c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar) {
                super(0);
                this.f10764c = aVar;
            }

            public final Boolean invoke() {
                this.f10764c.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(String str, C17631a<C16807N> aVar) {
            super(1);
            this.f10762c = str;
            this.f10763d = aVar;
        }

        public final void a(x xVar) {
            v.B0(xVar, 1.0f);
            v.d0(xVar, this.f10762c);
            v.B(xVar, (String) null, new a(this.f10763d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((x) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O0.e0$s */
    static final class s extends C17544u implements C17642l<G0, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final s f10765c = new s();

        s() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G0 g02) {
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0464  */
    /* JADX WARNING: Removed duplicated region for block: B:294:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(nI.C17631a<XH.C16807N> r46, androidx.compose.ui.d r47, O0.F0 r48, float r49, p1.i1 r50, long r51, long r53, float r55, long r56, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r58, nI.p<? super U0.C4889m, ? super java.lang.Integer, ? extends s0.C5848T> r59, O0.C4727f0 r60, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r61, U0.C4889m r62, int r63, int r64, int r65) {
        /*
            r1 = r46
            r15 = r63
            r14 = r64
            r13 = r65
            r0 = 2132719801(0x7f1eb8b9, float:2.1097716E38)
            r2 = r62
            U0.m r2 = r2.k(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r15 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.F(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r15
            goto L_0x0028
        L_0x0027:
            r3 = r15
        L_0x0028:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0031
            r3 = r3 | 48
        L_0x002e:
            r9 = r47
            goto L_0x0043
        L_0x0031:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x002e
            r9 = r47
            boolean r10 = r2.V(r9)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r3 = r3 | r10
        L_0x0043:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005d
            r10 = r13 & 4
            if (r10 != 0) goto L_0x0056
            r10 = r48
            boolean r16 = r2.V(r10)
            if (r16 == 0) goto L_0x0058
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r10 = r48
        L_0x0058:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r16
            goto L_0x005f
        L_0x005d:
            r10 = r48
        L_0x005f:
            r16 = r13 & 8
            if (r16 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r7 = r49
            goto L_0x007b
        L_0x0068:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r49
            boolean r17 = r2.c(r7)
            if (r17 == 0) goto L_0x0077
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r17
        L_0x007b:
            r8 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0095
            r8 = r13 & 16
            if (r8 != 0) goto L_0x008e
            r8 = r50
            boolean r18 = r2.V(r8)
            if (r18 == 0) goto L_0x0090
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x008e:
            r8 = r50
        L_0x0090:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r18
            goto L_0x0097
        L_0x0095:
            r8 = r50
        L_0x0097:
            r18 = 196608(0x30000, float:2.75506E-40)
            r18 = r15 & r18
            if (r18 != 0) goto L_0x00b1
            r18 = r13 & 32
            r4 = r51
            if (r18 != 0) goto L_0x00ac
            boolean r20 = r2.e(r4)
            if (r20 == 0) goto L_0x00ac
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r20
            goto L_0x00b3
        L_0x00b1:
            r4 = r51
        L_0x00b3:
            r20 = 1572864(0x180000, float:2.204052E-39)
            r20 = r15 & r20
            if (r20 != 0) goto L_0x00cd
            r20 = r13 & 64
            r11 = r53
            if (r20 != 0) goto L_0x00c8
            boolean r22 = r2.e(r11)
            if (r22 == 0) goto L_0x00c8
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r22
            goto L_0x00cf
        L_0x00cd:
            r11 = r53
        L_0x00cf:
            r0 = r13 & 128(0x80, float:1.794E-43)
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r3 = r3 | r23
            r4 = r55
            goto L_0x00ec
        L_0x00da:
            r23 = r15 & r23
            r4 = r55
            if (r23 != 0) goto L_0x00ec
            boolean r5 = r2.c(r4)
            if (r5 == 0) goto L_0x00e9
            r5 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r3 = r3 | r5
        L_0x00ec:
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 & r15
            if (r5 != 0) goto L_0x0107
            r5 = r13 & 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0100
            r4 = r56
            boolean r23 = r2.e(r4)
            if (r23 == 0) goto L_0x0102
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0104
        L_0x0100:
            r4 = r56
        L_0x0102:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0104:
            r3 = r3 | r23
            goto L_0x0109
        L_0x0107:
            r4 = r56
        L_0x0109:
            r4 = r13 & 512(0x200, float:7.175E-43)
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0113
            r3 = r3 | r5
        L_0x0110:
            r5 = r58
            goto L_0x0125
        L_0x0113:
            r5 = r5 & r15
            if (r5 != 0) goto L_0x0110
            r5 = r58
            boolean r23 = r2.F(r5)
            if (r23 == 0) goto L_0x0121
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0121:
            r23 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0123:
            r3 = r3 | r23
        L_0x0125:
            r23 = r14 & 6
            if (r23 != 0) goto L_0x013f
            r5 = r13 & 1024(0x400, float:1.435E-42)
            if (r5 != 0) goto L_0x0138
            r5 = r59
            boolean r23 = r2.F(r5)
            if (r23 == 0) goto L_0x013a
            r23 = 4
            goto L_0x013c
        L_0x0138:
            r5 = r59
        L_0x013a:
            r23 = 2
        L_0x013c:
            r23 = r14 | r23
            goto L_0x0143
        L_0x013f:
            r5 = r59
            r23 = r14
        L_0x0143:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x014c
            r23 = r23 | 48
        L_0x0149:
            r7 = r23
            goto L_0x0160
        L_0x014c:
            r24 = r14 & 48
            r7 = r60
            if (r24 != 0) goto L_0x0149
            boolean r24 = r2.V(r7)
            if (r24 == 0) goto L_0x015b
            r17 = 32
            goto L_0x015d
        L_0x015b:
            r17 = 16
        L_0x015d:
            r23 = r23 | r17
            goto L_0x0149
        L_0x0160:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0169
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0166:
            r8 = r61
            goto L_0x017c
        L_0x0169:
            r8 = r14 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0166
            r8 = r61
            boolean r17 = r2.F(r8)
            if (r17 == 0) goto L_0x0178
            r20 = 256(0x100, float:3.59E-43)
            goto L_0x017a
        L_0x0178:
            r20 = 128(0x80, float:1.794E-43)
        L_0x017a:
            r7 = r7 | r20
        L_0x017c:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r3 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x01ab
            r8 = r7 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x01ab
            boolean r8 = r2.l()
            if (r8 != 0) goto L_0x0193
            goto L_0x01ab
        L_0x0193:
            r2.L()
            r3 = r47
            r4 = r49
            r5 = r50
            r6 = r51
            r42 = r58
            r14 = r59
            r15 = r60
            r8 = r11
            r11 = r55
            r12 = r56
            goto L_0x045e
        L_0x01ab:
            r2.G()
            r8 = r15 & 1
            r9 = 0
            if (r8 == 0) goto L_0x01ff
            boolean r8 = r2.O()
            if (r8 == 0) goto L_0x01ba
            goto L_0x01ff
        L_0x01ba:
            r2.L()
            r0 = r13 & 4
            if (r0 == 0) goto L_0x01c3
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01c3:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x01cb
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r0
        L_0x01cb:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x01d3
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x01d3:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x01db
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x01db:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01e3
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x01e3:
            r0 = r13 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x01e9
            r7 = r7 & -15
        L_0x01e9:
            r0 = r47
            r4 = r50
            r8 = r51
            r5 = r55
            r42 = r58
            r43 = r59
            r44 = r60
            r13 = r3
            r14 = r7
            r3 = r49
            r6 = r56
            goto L_0x02c8
        L_0x01ff:
            if (r6 == 0) goto L_0x0204
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x0206
        L_0x0204:
            r6 = r47
        L_0x0206:
            r8 = r13 & 4
            if (r8 == 0) goto L_0x0213
            r8 = 3
            r10 = 0
            O0.F0 r8 = l(r9, r10, r2, r9, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0214
        L_0x0213:
            r8 = r10
        L_0x0214:
            if (r16 == 0) goto L_0x021d
            O0.i r10 = O0.C4732i.f10831a
            float r10 = r10.f()
            goto L_0x021f
        L_0x021d:
            r10 = r49
        L_0x021f:
            r16 = r13 & 16
            if (r16 == 0) goto L_0x0232
            O0.i r9 = O0.C4732i.f10831a
            r47 = r6
            r6 = 6
            p1.i1 r9 = r9.d(r2, r6)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r20
            goto L_0x0237
        L_0x0232:
            r47 = r6
            r6 = 6
            r9 = r50
        L_0x0237:
            r20 = r13 & 32
            r48 = r8
            if (r20 == 0) goto L_0x024c
            O0.i r8 = O0.C4732i.f10831a
            long r23 = r8.b(r2, r6)
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r6
            r49 = r9
            r8 = r23
            goto L_0x0250
        L_0x024c:
            r49 = r9
            r8 = r51
        L_0x0250:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0260
            int r6 = r3 >> 15
            r6 = r6 & 14
            long r11 = O0.C4755u.c(r8, r2, r6)
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r6
        L_0x0260:
            if (r0 == 0) goto L_0x0269
            r0 = 0
            float r6 = (float) r0
            float r6 = c2.h.B(r6)
            goto L_0x026c
        L_0x0269:
            r0 = 0
            r6 = r55
        L_0x026c:
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x027f
            O0.i r0 = O0.C4732i.f10831a
            r50 = r6
            r6 = 6
            long r23 = r0.e(r2, r6)
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r0 = r0 & r3
            r3 = r0
            goto L_0x0283
        L_0x027f:
            r50 = r6
            r23 = r56
        L_0x0283:
            if (r4 == 0) goto L_0x028c
            O0.y r0 = O0.C4763y.f11658a
            nI.p r0 = r0.a()
            goto L_0x028e
        L_0x028c:
            r0 = r58
        L_0x028e:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0297
            O0.e0$a r4 = O0.C4725e0.a.f10637c
            r7 = r7 & -15
            goto L_0x0299
        L_0x0297:
            r4 = r59
        L_0x0299:
            if (r5 == 0) goto L_0x02b5
            O0.d0 r5 = O0.C4723d0.f10494a
            O0.f0 r5 = r5.a()
            r42 = r0
            r13 = r3
            r43 = r4
            r44 = r5
            r14 = r7
            r3 = r10
            r6 = r23
            r0 = r47
            r10 = r48
            r4 = r49
            r5 = r50
            goto L_0x02c8
        L_0x02b5:
            r5 = r50
            r44 = r60
            r42 = r0
            r13 = r3
            r43 = r4
            r14 = r7
            r3 = r10
            r6 = r23
            r0 = r47
            r10 = r48
            r4 = r49
        L_0x02c8:
            r2.y()
            boolean r23 = U0.C4895p.J()
            if (r23 == 0) goto L_0x02dc
            java.lang.String r15 = "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)"
            r53 = r5
            r5 = 2132719801(0x7f1eb8b9, float:2.1097716E38)
            U0.C4895p.S(r5, r13, r14, r15)
            goto L_0x02de
        L_0x02dc:
            r53 = r5
        L_0x02de:
            java.lang.Object r5 = r2.D()
            U0.m$a r15 = U0.C4889m.f14007a
            r22 = r14
            java.lang.Object r14 = r15.a()
            if (r5 != r14) goto L_0x02fb
            dI.j r5 = dI.C17169j.f142968a
            QJ.Q r5 = U0.P.k(r5, r2)
            U0.B r14 = new U0.B
            r14.<init>(r5)
            r2.u(r14)
            r5 = r14
        L_0x02fb:
            U0.B r5 = (U0.B) r5
            QJ.Q r5 = r5.a()
            r14 = r13 & 896(0x380, float:1.256E-42)
            r14 = r14 ^ 384(0x180, float:5.38E-43)
            r54 = r11
            r12 = 256(0x100, float:3.59E-43)
            if (r14 <= r12) goto L_0x0311
            boolean r21 = r2.V(r10)
            if (r21 != 0) goto L_0x0315
        L_0x0311:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != r12) goto L_0x0317
        L_0x0315:
            r11 = 1
            goto L_0x0318
        L_0x0317:
            r11 = 0
        L_0x0318:
            boolean r12 = r2.F(r5)
            r11 = r11 | r12
            r12 = r13 & 14
            r57 = r8
            r8 = 4
            if (r12 != r8) goto L_0x0326
            r8 = 1
            goto L_0x0327
        L_0x0326:
            r8 = 0
        L_0x0327:
            r8 = r8 | r11
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x0334
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x033c
        L_0x0334:
            O0.e0$f r9 = new O0.e0$f
            r9.<init>(r10, r5, r1)
            r2.u(r9)
        L_0x033c:
            r26 = r9
            nI.a r26 = (nI.C17631a) r26
            boolean r8 = r2.F(r5)
            r9 = 256(0x100, float:3.59E-43)
            if (r14 <= r9) goto L_0x034e
            boolean r11 = r2.V(r10)
            if (r11 != 0) goto L_0x0352
        L_0x034e:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != r9) goto L_0x0354
        L_0x0352:
            r9 = 1
            goto L_0x0355
        L_0x0354:
            r9 = 0
        L_0x0355:
            r8 = r8 | r9
            r9 = 4
            if (r12 != r9) goto L_0x035b
            r9 = 1
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            r8 = r8 | r9
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x0369
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x0371
        L_0x0369:
            O0.e0$g r9 = new O0.e0$g
            r9.<init>(r5, r10, r1)
            r2.u(r9)
        L_0x0371:
            r30 = r9
            nI.l r30 = (nI.C17642l) r30
            java.lang.Object r8 = r2.D()
            java.lang.Object r9 = r15.a()
            if (r8 != r9) goto L_0x038d
            r8 = 0
            r9 = 0
            r59 = r4
            r4 = 0
            r11 = 2
            m0.a r8 = m0.C5532b.b(r8, r9, r11, r4)
            r2.u(r8)
            goto L_0x038f
        L_0x038d:
            r59 = r4
        L_0x038f:
            r4 = r8
            m0.a r4 = (m0.C5530a) r4
            r8 = 256(0x100, float:3.59E-43)
            if (r14 <= r8) goto L_0x039c
            boolean r9 = r2.V(r10)
            if (r9 != 0) goto L_0x03a0
        L_0x039c:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != r8) goto L_0x03a2
        L_0x03a0:
            r8 = 1
            goto L_0x03a3
        L_0x03a2:
            r8 = 0
        L_0x03a3:
            boolean r9 = r2.F(r5)
            r8 = r8 | r9
            boolean r9 = r2.F(r4)
            r8 = r8 | r9
            r9 = 4
            if (r12 != r9) goto L_0x03b2
            r9 = 1
            goto L_0x03b3
        L_0x03b2:
            r9 = 0
        L_0x03b3:
            r8 = r8 | r9
            java.lang.Object r9 = r2.D()
            if (r8 != 0) goto L_0x03c0
            java.lang.Object r8 = r15.a()
            if (r9 != r8) goto L_0x03c8
        L_0x03c0:
            O0.e0$b r9 = new O0.e0$b
            r9.<init>(r10, r5, r4, r1)
            r2.u(r9)
        L_0x03c8:
            r8 = r9
            nI.a r8 = (nI.C17631a) r8
            O0.e0$c r9 = new O0.e0$c
            r23 = r9
            r24 = r6
            r27 = r10
            r28 = r4
            r29 = r5
            r31 = r0
            r32 = r3
            r33 = r59
            r34 = r57
            r36 = r54
            r38 = r53
            r39 = r42
            r40 = r43
            r41 = r61
            r23.<init>(r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41)
            r5 = 54
            r11 = -314673510(0xffffffffed3e769a, float:-3.6840958E27)
            r12 = 1
            c1.a r5 = c1.c.e(r11, r12, r9, r2, r5)
            r9 = r22 & 112(0x70, float:1.57E-43)
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            int r11 = m0.C5530a.f25673m
            r18 = 6
            int r11 = r11 << 6
            r9 = r9 | r11
            r47 = r8
            r48 = r44
            r49 = r4
            r50 = r5
            r51 = r2
            r52 = r9
            androidx.compose.material3.c.a(r47, r48, r49, r50, r51, r52)
            boolean r4 = r10.f()
            if (r4 == 0) goto L_0x0446
            r4 = 256(0x100, float:3.59E-43)
            if (r14 <= r4) goto L_0x0420
            boolean r5 = r2.V(r10)
            if (r5 != 0) goto L_0x0424
        L_0x0420:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != r4) goto L_0x0426
        L_0x0424:
            r9 = r12
            goto L_0x0427
        L_0x0426:
            r9 = 0
        L_0x0427:
            java.lang.Object r4 = r2.D()
            if (r9 != 0) goto L_0x0433
            java.lang.Object r5 = r15.a()
            if (r4 != r5) goto L_0x043c
        L_0x0433:
            O0.e0$d r4 = new O0.e0$d
            r5 = 0
            r4.<init>(r10, r5)
            r2.u(r4)
        L_0x043c:
            nI.p r4 = (nI.p) r4
            r5 = 6
            int r5 = r13 >> 6
            r5 = r5 & 14
            U0.P.g(r10, r4, r2, r5)
        L_0x0446:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x044f
            U0.C4895p.R()
        L_0x044f:
            r11 = r53
            r8 = r54
            r5 = r59
            r4 = r3
            r12 = r6
            r14 = r43
            r15 = r44
            r6 = r57
            r3 = r0
        L_0x045e:
            U0.Y0 r2 = r2.n()
            if (r2 == 0) goto L_0x0484
            O0.e0$e r0 = new O0.e0$e
            r47 = r0
            r1 = r46
            r45 = r2
            r2 = r3
            r3 = r10
            r10 = r11
            r11 = r12
            r13 = r42
            r16 = r61
            r17 = r63
            r18 = r64
            r19 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r1 = r47
            r0 = r45
            r0.a(r1)
        L_0x0484:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4725e0.a(nI.a, androidx.compose.ui.d, O0.F0, float, p1.i1, long, long, float, long, nI.p, nI.p, O0.f0, nI.q, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: nI.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: O0.e0$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v18, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(s0.C5857c r48, m0.C5530a<java.lang.Float, m0.C5554m> r49, QJ.Q r50, nI.C17631a<XH.C16807N> r51, nI.C17642l<? super java.lang.Float, XH.C16807N> r52, androidx.compose.ui.d r53, O0.F0 r54, float r55, p1.i1 r56, long r57, long r59, float r61, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r62, nI.p<? super U0.C4889m, ? super java.lang.Integer, ? extends s0.C5848T> r63, nI.q<? super s0.C5861g, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r64, U0.C4889m r65, int r66, int r67, int r68) {
        /*
            r1 = r48
            r2 = r49
            r5 = r52
            r15 = r66
            r14 = r67
            r12 = r68
            r4 = 196608(0x30000, float:2.75506E-40)
            r9 = 16
            r10 = 1
            r13 = 128(0x80, float:1.794E-43)
            r0 = 32
            r3 = 6
            r6 = -1676960531(0xffffffff9c0b9ced, float:-4.6194064E-22)
            r7 = r65
            U0.m r7 = r7.k(r6)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = r12 & r20
            r21 = 4
            r6 = 2
            if (r20 == 0) goto L_0x002b
            r20 = r15 | 6
            goto L_0x003f
        L_0x002b:
            r20 = r15 & 6
            if (r20 != 0) goto L_0x003d
            boolean r20 = r7.V(r1)
            if (r20 == 0) goto L_0x0038
            r20 = r21
            goto L_0x003a
        L_0x0038:
            r20 = r6
        L_0x003a:
            r20 = r15 | r20
            goto L_0x003f
        L_0x003d:
            r20 = r15
        L_0x003f:
            r23 = r12 & 1
            if (r23 == 0) goto L_0x0048
            r20 = r20 | 48
        L_0x0045:
            r10 = r20
            goto L_0x0063
        L_0x0048:
            r23 = r15 & 48
            if (r23 != 0) goto L_0x0045
            r23 = r15 & 64
            if (r23 != 0) goto L_0x0055
            boolean r23 = r7.V(r2)
            goto L_0x0059
        L_0x0055:
            boolean r23 = r7.F(r2)
        L_0x0059:
            if (r23 == 0) goto L_0x005e
            r23 = r0
            goto L_0x0060
        L_0x005e:
            r23 = r9
        L_0x0060:
            r20 = r20 | r23
            goto L_0x0045
        L_0x0063:
            r20 = r12 & 2
            if (r20 == 0) goto L_0x006c
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0069:
            r6 = r50
            goto L_0x007f
        L_0x006c:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0069
            r6 = r50
            boolean r20 = r7.F(r6)
            if (r20 == 0) goto L_0x007b
            r20 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r20 = r13
        L_0x007d:
            r10 = r10 | r20
        L_0x007f:
            r20 = r12 & 4
            if (r20 == 0) goto L_0x0088
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0085:
            r8 = r51
            goto L_0x009b
        L_0x0088:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0085
            r8 = r51
            boolean r24 = r7.F(r8)
            if (r24 == 0) goto L_0x0097
            r24 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r24 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r10 = r10 | r24
        L_0x009b:
            r24 = r12 & 8
            if (r24 == 0) goto L_0x00a2
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a2:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r7.F(r5)
            if (r3 == 0) goto L_0x00af
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r10 = r10 | r3
        L_0x00b2:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x00ba
            r10 = r10 | r4
        L_0x00b7:
            r4 = r53
            goto L_0x00cc
        L_0x00ba:
            r4 = r4 & r15
            if (r4 != 0) goto L_0x00b7
            r4 = r53
            boolean r26 = r7.V(r4)
            if (r26 == 0) goto L_0x00c8
            r26 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r26 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r10 = r10 | r26
        L_0x00cc:
            r26 = 1572864(0x180000, float:2.204052E-39)
            r27 = r15 & r26
            if (r27 != 0) goto L_0x00e6
            r27 = r12 & 32
            r9 = r54
            if (r27 != 0) goto L_0x00e1
            boolean r29 = r7.V(r9)
            if (r29 == 0) goto L_0x00e1
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r10 = r10 | r29
            goto L_0x00e8
        L_0x00e6:
            r9 = r54
        L_0x00e8:
            r29 = r12 & 64
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r29 == 0) goto L_0x00f3
            r10 = r10 | r30
            r0 = r55
            goto L_0x0106
        L_0x00f3:
            r31 = r15 & r30
            r0 = r55
            if (r31 != 0) goto L_0x0106
            boolean r32 = r7.c(r0)
            if (r32 == 0) goto L_0x0102
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0104
        L_0x0102:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0104:
            r10 = r10 | r32
        L_0x0106:
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0122
            r11 = r12 & 128(0x80, float:1.794E-43)
            if (r11 != 0) goto L_0x011b
            r11 = r56
            boolean r33 = r7.V(r11)
            if (r33 == 0) goto L_0x011d
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011f
        L_0x011b:
            r11 = r56
        L_0x011d:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011f:
            r10 = r10 | r33
            goto L_0x0124
        L_0x0122:
            r11 = r56
        L_0x0124:
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r33 = r15 & r33
            if (r33 != 0) goto L_0x0140
            r13 = 256(0x100, float:3.59E-43)
            r0 = r12 & 256(0x100, float:3.59E-43)
            r8 = r57
            if (r0 != 0) goto L_0x013b
            boolean r0 = r7.e(r8)
            if (r0 == 0) goto L_0x013b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013d
        L_0x013b:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013d:
            r10 = r10 | r0
        L_0x013e:
            r0 = 6
            goto L_0x0143
        L_0x0140:
            r8 = r57
            goto L_0x013e
        L_0x0143:
            r13 = r14 & 6
            if (r13 != 0) goto L_0x015b
            r0 = r12 & 512(0x200, float:7.175E-43)
            r8 = r59
            if (r0 != 0) goto L_0x0154
            boolean r0 = r7.e(r8)
            if (r0 == 0) goto L_0x0154
            goto L_0x0156
        L_0x0154:
            r21 = 2
        L_0x0156:
            r0 = r14 | r21
        L_0x0158:
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x015f
        L_0x015b:
            r8 = r59
            r0 = r14
            goto L_0x0158
        L_0x015f:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x016a
            r0 = r0 | 48
            r13 = r61
        L_0x0167:
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x017e
        L_0x016a:
            r20 = r14 & 48
            r13 = r61
            if (r20 != 0) goto L_0x0167
            boolean r21 = r7.c(r13)
            if (r21 == 0) goto L_0x0179
            r28 = 32
            goto L_0x017b
        L_0x0179:
            r28 = 16
        L_0x017b:
            r0 = r0 | r28
            goto L_0x0167
        L_0x017e:
            r8 = r12 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0187
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0184:
            r9 = r62
            goto L_0x019a
        L_0x0187:
            r9 = r14 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0184
            r9 = r62
            boolean r19 = r7.F(r9)
            if (r19 == 0) goto L_0x0196
            r19 = 256(0x100, float:3.59E-43)
            goto L_0x0198
        L_0x0196:
            r19 = 128(0x80, float:1.794E-43)
        L_0x0198:
            r0 = r0 | r19
        L_0x019a:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x01b6
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01ad
            r6 = r63
            boolean r21 = r7.F(r6)
            if (r21 == 0) goto L_0x01af
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x01b1
        L_0x01ad:
            r6 = r63
        L_0x01af:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x01b1:
            r0 = r0 | r19
        L_0x01b3:
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01b9
        L_0x01b6:
            r6 = r63
            goto L_0x01b3
        L_0x01b9:
            r9 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x01c2
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x01bf:
            r9 = r64
            goto L_0x01d1
        L_0x01c2:
            r9 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x01bf
            r9 = r64
            boolean r18 = r7.F(r9)
            if (r18 == 0) goto L_0x01d0
            r6 = 16384(0x4000, float:2.2959E-41)
        L_0x01d0:
            r0 = r0 | r6
        L_0x01d1:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r10
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r9) goto L_0x01fc
            r6 = r0 & 9363(0x2493, float:1.312E-41)
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r6 != r9) goto L_0x01fc
            boolean r6 = r7.l()
            if (r6 != 0) goto L_0x01e7
            goto L_0x01fc
        L_0x01e7:
            r7.L()
            r6 = r53
            r8 = r54
            r19 = r55
            r15 = r62
            r16 = r63
            r9 = r11
            r14 = r13
            r10 = r57
            r12 = r59
            goto L_0x049d
        L_0x01fc:
            r7.G()
            r6 = 1
            r9 = r15 & 1
            r6 = 0
            if (r9 == 0) goto L_0x0249
            boolean r9 = r7.O()
            if (r9 == 0) goto L_0x020c
            goto L_0x0249
        L_0x020c:
            r7.L()
            r3 = 32
            r4 = r12 & 32
            if (r4 == 0) goto L_0x0219
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r3
        L_0x0219:
            r3 = 128(0x80, float:1.794E-43)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x0222
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r10 = r10 & r3
        L_0x0222:
            r3 = 256(0x100, float:3.59E-43)
            r3 = r3 & r12
            if (r3 == 0) goto L_0x022b
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r10 = r10 & r3
        L_0x022b:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0231
            r0 = r0 & -15
        L_0x0231:
            r3 = r12 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0237
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0237:
            r3 = r54
            r4 = r55
            r33 = r59
            r6 = r62
            r8 = r63
            r12 = r0
            r14 = r10
            r0 = r53
            r9 = r57
            goto L_0x02ea
        L_0x0249:
            if (r3 == 0) goto L_0x0250
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
        L_0x024d:
            r9 = 32
            goto L_0x0253
        L_0x0250:
            r3 = r53
            goto L_0x024d
        L_0x0253:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x0264
            r9 = 3
            r53 = r3
            r3 = 0
            O0.F0 r9 = l(r6, r3, r7, r6, r9)
            r3 = -3670017(0xffffffffffc7ffff, float:NaN)
            r10 = r10 & r3
            goto L_0x0268
        L_0x0264:
            r53 = r3
            r9 = r54
        L_0x0268:
            if (r29 == 0) goto L_0x0273
            O0.i r3 = O0.C4732i.f10831a
            float r3 = r3.f()
        L_0x0270:
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x0276
        L_0x0273:
            r3 = r55
            goto L_0x0270
        L_0x0276:
            r6 = r6 & r12
            if (r6 == 0) goto L_0x0286
            O0.i r6 = O0.C4732i.f10831a
            r11 = 6
            p1.i1 r6 = r6.d(r7, r11)
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r10 = r10 & r16
            r11 = r6
        L_0x0286:
            r6 = 256(0x100, float:3.59E-43)
            r6 = r6 & r12
            if (r6 == 0) goto L_0x029e
            O0.i r6 = O0.C4732i.f10831a
            r54 = r3
            r3 = 6
            long r19 = r6.b(r7, r3)
            r3 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r10
            r6 = r3
            r55 = r9
            r9 = r19
            goto L_0x02a5
        L_0x029e:
            r54 = r3
            r55 = r9
            r6 = r10
            r9 = r57
        L_0x02a5:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x02b4
            int r3 = r6 >> 27
            r3 = r3 & 14
            long r19 = O0.C4755u.c(r9, r7, r3)
            r0 = r0 & -15
            goto L_0x02b6
        L_0x02b4:
            r19 = r59
        L_0x02b6:
            if (r4 == 0) goto L_0x02bf
            O0.i r3 = O0.C4732i.f10831a
            float r3 = r3.c()
            r13 = r3
        L_0x02bf:
            if (r8 == 0) goto L_0x02c8
            O0.y r3 = O0.C4763y.f11658a
            nI.p r3 = r3.b()
            goto L_0x02ca
        L_0x02c8:
            r3 = r62
        L_0x02ca:
            r4 = r12 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x02df
            O0.e0$h r4 = O0.C4725e0.h.f10698c
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            r12 = r0
            r8 = r4
            r14 = r6
            r33 = r19
            r0 = r53
            r4 = r54
        L_0x02db:
            r6 = r3
            r3 = r55
            goto L_0x02ea
        L_0x02df:
            r4 = r54
            r8 = r63
            r12 = r0
            r14 = r6
            r33 = r19
            r0 = r53
            goto L_0x02db
        L_0x02ea:
            r7.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x02fe
            java.lang.String r15 = "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)"
            r61 = r13
            r13 = -1676960531(0xffffffff9c0b9ced, float:-4.6194064E-22)
            U0.C4895p.S(r13, r14, r12, r15)
            goto L_0x0300
        L_0x02fe:
            r61 = r13
        L_0x0300:
            Q0.t$a r13 = Q0.t.f12046a
            int r13 = O0.C4749q0.f11447e
            int r13 = Q0.t.a(r13)
            r15 = 0
            java.lang.String r13 = Q0.u.a(r13, r7, r15)
            i1.c$a r15 = i1.C5437c.f24302a
            i1.c r15 = r15.m()
            androidx.compose.ui.d r15 = r1.a(r0, r15)
            r16 = r0
            r0 = 0
            r62 = r9
            r1 = 0
            r9 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.A(r15, r0, r4, r9, r1)
            r10 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r10, r9, r1)
            r1 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r14
            r1 = r1 ^ r26
            r9 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r9) goto L_0x0336
            boolean r10 = r7.V(r3)
            if (r10 != 0) goto L_0x033a
        L_0x0336:
            r10 = r14 & r26
            if (r10 != r9) goto L_0x033c
        L_0x033a:
            r9 = 1
            goto L_0x033d
        L_0x033c:
            r9 = 0
        L_0x033d:
            java.lang.Object r10 = r7.D()
            if (r9 != 0) goto L_0x034b
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0354
        L_0x034b:
            p0.v r9 = p0.v.Vertical
            z1.a r10 = O0.E0.a(r3, r9, r5)
            r7.u(r10)
        L_0x0354:
            z1.a r10 = (z1.C6271a) r10
            r9 = 2
            r15 = 0
            androidx.compose.ui.d r0 = androidx.compose.ui.input.nestedscroll.a.b(r0, r10, r15, r9, r15)
            Q0.e r9 = r3.d()
            p0.v r10 = p0.v.Vertical
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r15) goto L_0x036c
            boolean r19 = r7.V(r3)
            if (r19 != 0) goto L_0x036f
        L_0x036c:
            r19 = r4
            goto L_0x0372
        L_0x036f:
            r19 = r4
            goto L_0x0376
        L_0x0372:
            r4 = r14 & r26
            if (r4 != r15) goto L_0x0378
        L_0x0376:
            r4 = 1
            goto L_0x0379
        L_0x0378:
            r4 = 0
        L_0x0379:
            java.lang.Object r15 = r7.D()
            if (r4 != 0) goto L_0x0387
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r15 != r4) goto L_0x038f
        L_0x0387:
            O0.e0$i r15 = new O0.e0$i
            r15.<init>(r3)
            r7.u(r15)
        L_0x038f:
            nI.p r15 = (nI.p) r15
            androidx.compose.ui.d r35 = androidx.compose.material3.internal.b.h(r0, r9, r10, r15)
            Q0.e r0 = r3.d()
            p0.r r36 = r0.u()
            boolean r38 = r3.l()
            Q0.e r0 = r3.d()
            boolean r40 = r0.y()
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r14
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r4) goto L_0x03b3
            r0 = 1
            goto L_0x03b4
        L_0x03b3:
            r0 = 0
        L_0x03b4:
            java.lang.Object r4 = r7.D()
            if (r0 != 0) goto L_0x03c2
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x03cb
        L_0x03c2:
            O0.e0$j r4 = new O0.e0$j
            r0 = 0
            r4.<init>(r5, r0)
            r7.u(r4)
        L_0x03cb:
            r42 = r4
            nI.q r42 = (nI.q) r42
            r44 = 168(0xa8, float:2.35E-43)
            r45 = 0
            r39 = 0
            r41 = 0
            r43 = 0
            r37 = r10
            androidx.compose.ui.d r0 = p0.q.h(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r4 = r7.V(r13)
            java.lang.Object r9 = r7.D()
            if (r4 != 0) goto L_0x03f1
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r9 != r4) goto L_0x03f9
        L_0x03f1:
            O0.e0$k r9 = new O0.e0$k
            r9.<init>(r13)
            r7.u(r9)
        L_0x03f9:
            nI.l r9 = (nI.C17642l) r9
            r4 = 0
            r10 = 0
            r13 = 1
            androidx.compose.ui.d r0 = L1.o.d(r0, r10, r9, r13, r4)
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r4) goto L_0x040c
            boolean r1 = r7.V(r3)
            if (r1 != 0) goto L_0x0410
        L_0x040c:
            r1 = r14 & r26
            if (r1 != r4) goto L_0x0412
        L_0x0410:
            r1 = 1
            goto L_0x0413
        L_0x0412:
            r1 = r10
        L_0x0413:
            r4 = r14 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r4 == r9) goto L_0x0423
            r4 = r14 & 64
            if (r4 == 0) goto L_0x0424
            boolean r4 = r7.F(r2)
            if (r4 == 0) goto L_0x0424
        L_0x0423:
            r10 = 1
        L_0x0424:
            r1 = r1 | r10
            java.lang.Object r4 = r7.D()
            if (r1 != 0) goto L_0x0433
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x043b
        L_0x0433:
            O0.e0$l r4 = new O0.e0$l
            r4.<init>(r3, r2)
            r7.u(r4)
        L_0x043b:
            nI.l r4 = (nI.C17642l) r4
            androidx.compose.ui.d r20 = androidx.compose.ui.graphics.b.a(r0, r4)
            O0.e0$m r0 = new O0.e0$m
            r53 = r0
            r54 = r8
            r55 = r49
            r56 = r6
            r57 = r3
            r58 = r51
            r59 = r50
            r60 = r64
            r53.<init>(r54, r55, r56, r57, r58, r59, r60)
            r1 = 54
            r4 = -692668920(0xffffffffd6b6b608, float:-1.00446467E14)
            r9 = 1
            c1.a r29 = c1.c.e(r4, r9, r0, r7, r1)
            int r0 = r14 >> 21
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r30
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r12 << 9
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r31 = r0 | r1
            r32 = 96
            r27 = 0
            r28 = 0
            r21 = r11
            r22 = r62
            r24 = r33
            r26 = r61
            r30 = r7
            O0.P0.a(r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0490
            U0.C4895p.R()
        L_0x0490:
            r14 = r61
            r15 = r6
            r9 = r11
            r6 = r16
            r12 = r33
            r10 = r62
            r16 = r8
            r8 = r3
        L_0x049d:
            U0.Y0 r7 = r7.n()
            if (r7 == 0) goto L_0x04c9
            O0.e0$n r4 = new O0.e0$n
            r0 = r4
            r1 = r48
            r2 = r49
            r3 = r50
            r46 = r4
            r4 = r51
            r5 = r52
            r47 = r7
            r7 = r8
            r8 = r19
            r17 = r64
            r18 = r66
            r19 = r67
            r20 = r68
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20)
            r1 = r46
            r0 = r47
            r0.a(r1)
        L_0x04c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.C4725e0.b(s0.c, m0.a, QJ.Q, nI.a, nI.l, androidx.compose.ui.d, O0.F0, float, p1.i1, long, long, float, nI.p, nI.p, nI.q, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void c(long j10, C17631a<C16807N> aVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        androidx.compose.ui.d dVar;
        long j11 = j10;
        C17631a<C16807N> aVar2 = aVar;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(951870469);
        if ((i12 & 6) == 0) {
            i11 = (k10.e(j11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(951870469, i13, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j11 != 16) {
                int i14 = i13;
                A1<Float> d10 = C5534c.d(z11 ? 1.0f : 0.0f, new y0(0, 0, (C5525D) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (C17642l<? super Float, C16807N>) null, k10, 48, 28);
                t.a aVar3 = Q0.t.f12046a;
                String a10 = u.a(Q0.t.a(i1.j.f24368b), k10, 0);
                k10.W(-1785653838);
                boolean z12 = true;
                if (z11) {
                    d.a aVar4 = androidx.compose.ui.d.f18749a;
                    int i15 = i14 & 112;
                    boolean z13 = i15 == 32;
                    Object D10 = k10.D();
                    if (z13 || D10 == C4889m.f14007a.a()) {
                        D10 = new q(aVar2, (C17164e<? super q>) null);
                        k10.u(D10);
                    }
                    androidx.compose.ui.d d11 = U.d(aVar4, aVar2, (nI.p) D10);
                    boolean V10 = k10.V(a10) | (i15 == 32);
                    Object D11 = k10.D();
                    if (V10 || D11 == C4889m.f14007a.a()) {
                        D11 = new r(a10, aVar2);
                        k10.u(D11);
                    }
                    dVar = L1.o.c(d11, true, (C17642l) D11);
                } else {
                    dVar = androidx.compose.ui.d.f18749a;
                }
                k10.P();
                androidx.compose.ui.d s10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null).s(dVar);
                if ((i14 & 14) != 4) {
                    z12 = false;
                }
                boolean V11 = k10.V(d10) | z12;
                Object D12 = k10.D();
                if (V11 || D12 == C4889m.f14007a.a()) {
                    D12 = new o(j11, d10);
                    k10.u(D12);
                }
                C5603i.a(s10, (C17642l) D12, k10, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(j10, aVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final float d(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final float j(androidx.compose.ui.graphics.c cVar, float f10) {
        float l10 = C5673m.l(cVar.b());
        if (Float.isNaN(l10) || l10 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C5295b.b(0.0f, Math.min(cVar.H1(f10634a), l10), f10) / l10);
    }

    /* access modifiers changed from: private */
    public static final float k(androidx.compose.ui.graphics.c cVar, float f10) {
        float i10 = C5673m.i(cVar.b());
        if (Float.isNaN(i10) || i10 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (C5295b.b(0.0f, Math.min(cVar.H1(f10635b), i10), f10) / i10);
    }

    public static final F0 l(boolean z10, C17642l<? super G0, Boolean> lVar, C4889m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            lVar = s.f10765c;
        }
        C17642l<? super G0, Boolean> lVar2 = lVar;
        if (C4895p.J()) {
            C4895p.S(-778250030, i10, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        F0 d10 = E0.d(z11, lVar2, G0.Hidden, false, mVar, (i10 & 14) | 384 | (i10 & 112), 8);
        if (C4895p.J()) {
            C4895p.R();
        }
        return d10;
    }
}
