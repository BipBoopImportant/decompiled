package androidx.compose.material3;

import E1.I;
import G1.C4504g;
import L1.o;
import L1.v;
import L1.x;
import O0.C4727f0;
import QJ.Q;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import U0.r;
import XH.C16807N;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5100f0;
import androidx.recyclerview.widget.RecyclerView;
import c2.t;
import dI.C17169j;
import f1.C5301c;
import f1.C5309k;
import i1.C5437c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.C5530a;
import m0.C5554m;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u0002"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "LO0/f0;", "properties", "Lm0/a;", "", "Lm0/m;", "predictiveBackProgress", "content", "a", "(LnI/a;LO0/f0;Lm0/a;LnI/p;LU0/m;I)V", "Landroid/view/View;", "", "e", "(Landroid/view/View;)Z", "Landroidx/compose/ui/window/r;", "isSecureFlagSetOnParent", "f", "(Landroidx/compose/ui/window/r;Z)Z", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18674c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/material3/c$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.c$a$a  reason: collision with other inner class name */
        public static final class C0283a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f18675a;

            public C0283a(b bVar) {
                this.f18675a = bVar;
            }

            public void b() {
                this.f18675a.dismiss();
                this.f18675a.g();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.f18674c = bVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f18674c.show();
            return new C0283a(this.f18674c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f18677d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4727f0 f18678e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ t f18679f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b bVar, C17631a<C16807N> aVar, C4727f0 f0Var, t tVar) {
            super(0);
            this.f18676c = bVar;
            this.f18677d = aVar;
            this.f18678e = f0Var;
            this.f18679f = tVar;
        }

        public final void invoke() {
            this.f18676c.k(this.f18677d, this.f18678e, this.f18679f);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.c$c  reason: collision with other inner class name */
    static final class C0284c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f18680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4727f0 f18681d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5530a<Float, C5554m> f18682e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f18683f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f18684g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0284c(C17631a<C16807N> aVar, C4727f0 f0Var, C5530a<Float, C5554m> aVar2, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f18680c = aVar;
            this.f18681d = f0Var;
            this.f18682e = aVar2;
            this.f18683f = pVar;
            this.f18684g = i10;
        }

        public final void a(C4889m mVar, int i10) {
            c.a(this.f18680c, this.f18681d, this.f18682e, this.f18683f, mVar, M0.a(this.f18684g | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<p<C4889m, Integer, C16807N>> f18685c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f18686c = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.k(xVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
            super(2);
            this.f18685c = a12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1560960657, i10, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:296)");
                }
                androidx.compose.ui.d d10 = o.d(androidx.compose.ui.d.f18749a, false, a.f18686c, 1, (Object) null);
                A1<p<C4889m, Integer, C16807N>> a12 = this.f18685c;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, d10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, h10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a10))) {
                    a13.u(Integer.valueOf(a10));
                    a13.w(Integer.valueOf(a10), b10);
                }
                F1.c(a13, e10, aVar.d());
                C5079j jVar = C5079j.f18125a;
                c.b(a12).invoke(mVar, 0);
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<UUID> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f18687c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18688a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.ui.window.r[] r0 = androidx.compose.ui.window.r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.window.r r1 = androidx.compose.ui.window.r.SecureOff     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.window.r r1 = androidx.compose.ui.window.r.SecureOn     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.window.r r1 = androidx.compose.ui.window.r.Inherit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f18688a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.c.f.<clinit>():void");
        }
    }

    public static final void a(C17631a<C16807N> aVar, C4727f0 f0Var, C5530a<Float, C5554m> aVar2, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        boolean z10;
        C17631a<C16807N> aVar3 = aVar;
        C4727f0 f0Var2 = f0Var;
        C5530a<Float, C5554m> aVar4 = aVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1254951810);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(f0Var2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= (i12 & 512) == 0 ? k10.V(aVar4) : k10.F(aVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1254951810, i13, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:272)");
            }
            View view = (View) k10.Q(AndroidCompositionLocals_androidKt.k());
            r d10 = C4883j.d(k10, 0);
            A1<T> q10 = p1.q(pVar2, k10, (i13 >> 9) & 14);
            r rVar = d10;
            t tVar = (t) k10.Q(C5100f0.k());
            c2.d dVar = (c2.d) k10.Q(C5100f0.e());
            int i14 = i13;
            UUID uuid = (UUID) C5301c.e(new Object[0], (C5309k) null, (String) null, e.f18687c, k10, 3072, 6);
            Object D10 = k10.D();
            C4889m.a aVar5 = C4889m.f14007a;
            if (D10 == aVar5.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            boolean a11 = C5607m.a(k10, 0);
            boolean V10 = k10.V(view) | k10.V(dVar);
            Object D11 = k10.D();
            if (V10 || D11 == aVar5.a()) {
                b bVar = r0;
                z10 = true;
                b bVar2 = new b(aVar, f0Var, view, tVar, dVar, uuid, aVar2, a10, a11);
                bVar.h(rVar, c1.c.c(-1560960657, true, new d(q10)));
                k10.u(bVar);
                D11 = bVar;
            } else {
                z10 = true;
            }
            b bVar3 = (b) D11;
            boolean F10 = k10.F(bVar3);
            Object D12 = k10.D();
            if (F10 || D12 == aVar5.a()) {
                D12 = new a(bVar3);
                k10.u(D12);
            }
            P.c(bVar3, (C17642l) D12, k10, 0);
            t tVar2 = tVar;
            boolean F11 = k10.F(bVar3) | ((i14 & 14) == 4 ? z10 : false) | ((i14 & 112) == 32 ? z10 : false) | k10.V(tVar2);
            Object D13 = k10.D();
            if (F11 || D13 == aVar5.a()) {
                D13 = new b(bVar3, aVar3, f0Var2, tVar2);
                k10.u(D13);
            }
            P.i((C17631a) D13, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C0284c(aVar, f0Var, aVar2, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final p<C4889m, Integer, C16807N> b(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
        return (p) a12.getValue();
    }

    public static final boolean e(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    public static final boolean f(androidx.compose.ui.window.r rVar, boolean z10) {
        int i10 = f.f18688a[rVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new XH.t();
    }
}
