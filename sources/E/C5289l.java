package e;

import QJ.Q;
import TJ.C16532g;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.y;
import android.annotation.SuppressLint;
import androidx.activity.C4987b;
import androidx.activity.w;
import androidx.activity.z;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aC\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006.\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\nX\u0002"}, d2 = {"", "enabled", "Lkotlin/Function2;", "LTJ/g;", "Landroidx/activity/b;", "LdI/e;", "LXH/N;", "", "onBack", "a", "(ZLnI/p;LU0/m;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.l  reason: case insensitive filesystem */
public final class C5289l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$2$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e.l$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f23188c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5288k f23189d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f23190e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5288k kVar, boolean z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f23189d = kVar;
            this.f23190e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f23189d, this.f23190e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f23188c == 0) {
                y.b(obj);
                this.f23189d.b(this.f23190e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.l$b */
    static final class b extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f23191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f23192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5288k f23193e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/l$b$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e.l$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5288k f23194a;

            public a(C5288k kVar) {
                this.f23194a = kVar;
            }

            public void b() {
                this.f23194a.remove();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w wVar, C5221y yVar, C5288k kVar) {
            super(1);
            this.f23191c = wVar;
            this.f23192d = yVar;
            this.f23193e = kVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f23191c.i(this.f23192d, this.f23193e);
            return new a(this.f23193e);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.l$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f23195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C16532g<C4987b>, C17164e<C16807N>, Object> f23196d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f23197e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f23198f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, p<C16532g<C4987b>, ? super C17164e<C16807N>, ? extends Object> pVar, int i10, int i11) {
            super(2);
            this.f23195c = z10;
            this.f23196d = pVar;
            this.f23197e = i10;
            this.f23198f = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5289l.a(this.f23195c, this.f23196d, mVar, M0.a(this.f23197e | 1), this.f23198f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @SuppressLint({"RememberReturnType"})
    public static final void a(boolean z10, p<C16532g<C4987b>, ? super C17164e<C16807N>, ? extends Object> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-642000585);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            boolean z11 = true;
            if (i13 != 0) {
                z10 = true;
            }
            if (C4895p.J()) {
                C4895p.S(-642000585, i12, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            A1<T> q10 = p1.q(pVar, k10, (i12 >> 3) & 14);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new C5288k(z10, a10, b(q10));
                k10.u(D11);
            }
            C5288k kVar = (C5288k) D11;
            boolean V10 = k10.V(b(q10)) | k10.V(a10);
            Object D12 = k10.D();
            if (V10 || D12 == aVar.a()) {
                kVar.a(b(q10));
                kVar.c(a10);
                k10.u(C16807N.f139792a);
            }
            Boolean valueOf = Boolean.valueOf(z10);
            boolean F10 = k10.F(kVar);
            int i14 = i12 & 14;
            if (i14 != 4) {
                z11 = false;
            }
            boolean z12 = F10 | z11;
            Object D13 = k10.D();
            if (z12 || D13 == aVar.a()) {
                D13 = new a(kVar, z10, (C17164e<? super a>) null);
                k10.u(D13);
            }
            P.g(valueOf, (p) D13, k10, i14);
            z a11 = C5285h.f23168a.a(k10, 6);
            if (a11 != null) {
                w onBackPressedDispatcher = a11.getOnBackPressedDispatcher();
                C5221y yVar = (C5221y) k10.Q(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean F11 = k10.F(onBackPressedDispatcher) | k10.F(yVar) | k10.F(kVar);
                Object D14 = k10.D();
                if (F11 || D14 == aVar.a()) {
                    D14 = new b(onBackPressedDispatcher, yVar, kVar);
                    k10.u(D14);
                }
                P.b(yVar, onBackPressedDispatcher, (C17642l) D14, k10, 0);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(z10, pVar, i10, i11));
        }
    }

    private static final p<C16532g<C4987b>, C17164e<C16807N>, Object> b(A1<? extends p<C16532g<C4987b>, ? super C17164e<C16807N>, ? extends Object>> a12) {
        return (p) a12.getValue();
    }
}
