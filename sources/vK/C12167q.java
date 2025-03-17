package vk;

import J1.j;
import O0.J0;
import O0.L0;
import O0.N0;
import QJ.Q;
import SC.W1;
import SC.Z1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.h;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pk.s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpk/s$a;", "result", "LO0/L0;", "snackbarHostState", "Lkotlin/Function0;", "LXH/N;", "onDismissed", "onViewCartClicked", "c", "(Lpk/s$a;LO0/L0;LnI/a;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.q  reason: case insensitive filesystem */
public final class C12167q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.CopyAllItemsToCartContentKt$CopyAllItemsToCartContent$2$1", f = "CopyAllItemsToCartContent.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: vk.q$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f104893c;

        /* renamed from: d  reason: collision with root package name */
        int f104894d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ s.a f104895e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L0 f104896f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Context f104897g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104898h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104899i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vk.q$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2491a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f104900a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r1 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f104900a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vk.C12167q.a.C2491a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s.a aVar, L0 l02, Context context, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104895e = aVar;
            this.f104896f = l02;
            this.f104897g = context;
            this.f104898h = aVar2;
            this.f104899i = aVar3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104895e, this.f104896f, this.f104897g, this.f104898h, this.f104899i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104894d;
            if (i10 == 0) {
                y.b(obj);
                s.a aVar = this.f104895e;
                if (aVar instanceof s.a.b) {
                    L0 l02 = this.f104896f;
                    String b10 = ((s.a.b) aVar).a().b(this.f104897g);
                    String string = this.f104897g.getString(Oo.b.f84642f9);
                    this.f104893c = aVar;
                    this.f104894d = 1;
                    obj = L0.f(l02, b10, string, false, (J0) null, this, 12, (Object) null);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    if (!(aVar instanceof s.a.C2376a) && aVar != null) {
                        throw new t();
                    }
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                s.a aVar2 = (s.a) this.f104893c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = C2491a.f104900a[((N0) obj).ordinal()];
            if (i11 == 1) {
                this.f104898h.invoke();
            } else if (i11 == 2) {
                this.f104899i.invoke();
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"vk/q$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.q$b */
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f104901a;

        public b(C17631a aVar) {
            this.f104901a = aVar;
        }

        public void b() {
            this.f104901a.invoke();
        }
    }

    public static final void c(s.a aVar, L0 l02, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        s.a aVar4 = aVar;
        L0 l03 = l02;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C17542s.j(l03, "snackbarHostState");
        C17542s.j(aVar5, "onDismissed");
        C17542s.j(aVar6, "onViewCartClicked");
        C4889m k10 = mVar.k(-1312497527);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(aVar4) : k10.F(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(l03) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar6) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1312497527, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.CopyAllItemsToCartContent (CopyAllItemsToCartContent.kt:24)");
            }
            C16807N n10 = C16807N.f139792a;
            k10.W(214393899);
            int i13 = i11 & 896;
            boolean z10 = i13 == 256;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12163o(aVar5);
                k10.u(D10);
            }
            k10.P();
            P.c(n10, (C17642l) D10, k10, 6);
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(214398013);
            int i14 = i11 & 14;
            boolean F10 = (i14 == 4 || ((i11 & 8) != 0 && k10.F(aVar4))) | ((i11 & 112) == 32) | k10.F(context) | (i13 == 256) | ((i11 & 7168) == 2048);
            Object D11 = k10.D();
            if (F10 || D11 == C4889m.f14007a.a()) {
                a aVar7 = r0;
                a aVar8 = new a(aVar, l02, context, aVar2, aVar3, (C17164e<? super a>) null);
                k10.u(aVar7);
                D11 = aVar7;
            }
            k10.P();
            P.g(aVar4, (p) D11, k10, i14);
            if (aVar4 instanceof s.a.C2376a) {
                mVar2 = k10;
                Z1.d(j.b(Oo.b.f84853z3, k10, 0), new W1(j.b(Oo.b.f84616d5, k10, 0), aVar5), aVar2, (d) null, (h) null, C12147g.f104783a.a(), mVar2, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | i13, 24);
            } else {
                mVar2 = k10;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C12165p(aVar, l02, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final L d(C17631a aVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new b(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(s.a aVar, L0 l02, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        c(aVar, l02, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
