package e;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import androidx.activity.v;
import androidx.activity.w;
import androidx.activity.z;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u0002"}, d2 = {"", "enabled", "Lkotlin/Function0;", "LXH/N;", "onBack", "a", "(ZLnI/a;LU0/m;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.d  reason: case insensitive filesystem */
public final class C5281d {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.d$a */
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C0367d f23151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f23152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C0367d dVar, boolean z10) {
            super(0);
            this.f23151c = dVar;
            this.f23152d = z10;
        }

        public final void invoke() {
            this.f23151c.setEnabled(this.f23152d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: e.d$b */
    static final class b extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f23153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f23154d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C0367d f23155e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/d$b$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: e.d$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0367d f23156a;

            public a(C0367d dVar) {
                this.f23156a = dVar;
            }

            public void b() {
                this.f23156a.remove();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w wVar, C5221y yVar, C0367d dVar) {
            super(1);
            this.f23153c = wVar;
            this.f23154d = yVar;
            this.f23155e = dVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f23153c.i(this.f23154d, this.f23155e);
            return new a(this.f23155e);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.d$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f23157c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f23158d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f23159e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f23160f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, C17631a<C16807N> aVar, int i10, int i11) {
            super(2);
            this.f23157c = z10;
            this.f23158d = aVar;
            this.f23159e = i10;
            this.f23160f = i11;
        }

        public final void a(C4889m mVar, int i10) {
            C5281d.a(this.f23157c, this.f23158d, mVar, M0.a(this.f23159e | 1), this.f23160f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e/d$d", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: e.d$d  reason: collision with other inner class name */
    public static final class C0367d extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f23161b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0367d(boolean z10, A1<? extends C17631a<C16807N>> a12) {
            super(z10);
            this.f23161b = a12;
        }

        public void handleOnBackPressed() {
            C5281d.b(this.f23161b).invoke();
        }
    }

    public static final void a(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-361453782);
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
            i12 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            boolean z11 = true;
            if (i13 != 0) {
                z10 = true;
            }
            if (C4895p.J()) {
                C4895p.S(-361453782, i12, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            A1<T> q10 = p1.q(aVar, k10, (i12 >> 3) & 14);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = new C0367d(z10, q10);
                k10.u(D10);
            }
            C0367d dVar = (C0367d) D10;
            if ((i12 & 14) != 4) {
                z11 = false;
            }
            Object D11 = k10.D();
            if (z11 || D11 == aVar2.a()) {
                D11 = new a(dVar, z10);
                k10.u(D11);
            }
            P.i((C17631a) D11, k10, 0);
            z a10 = C5285h.f23168a.a(k10, 6);
            if (a10 != null) {
                w onBackPressedDispatcher = a10.getOnBackPressedDispatcher();
                C5221y yVar = (C5221y) k10.Q(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean F10 = k10.F(onBackPressedDispatcher) | k10.F(yVar);
                Object D12 = k10.D();
                if (F10 || D12 == aVar2.a()) {
                    D12 = new b(onBackPressedDispatcher, yVar, dVar);
                    k10.u(D12);
                }
                P.b(yVar, onBackPressedDispatcher, (C17642l) D12, k10, 0);
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
            n10.a(new c(z10, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> b(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }
}
