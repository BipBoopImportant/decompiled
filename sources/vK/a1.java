package vk;

import O0.J0;
import O0.L0;
import O0.N0;
import QJ.Q;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpk/s$i$a;", "result", "LO0/L0;", "snackbarHostState", "Lkotlin/Function1;", "", "LXH/N;", "onUndoClicked", "Lkotlin/Function0;", "onDismiss", "c", "(Lpk/s$i$a;LO0/L0;LnI/l;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.RemoveItemContentKt$RemoveItemContent$2$1", f = "RemoveItemContent.kt", l = {30}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f104715c;

        /* renamed from: d  reason: collision with root package name */
        Object f104716d;

        /* renamed from: e  reason: collision with root package name */
        int f104717e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s.i.a f104718f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L0 f104719g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f104720h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104721i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f104722j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vk.a1$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C2490a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f104723a;

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
                    f104723a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vk.a1.a.C2490a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s.i.a aVar, L0 l02, Context context, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104718f = aVar;
            this.f104719g = l02;
            this.f104720h = context;
            this.f104721i = aVar2;
            this.f104722j = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104718f, this.f104719g, this.f104720h, this.f104721i, this.f104722j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104717e;
            if (i10 == 0) {
                y.b(obj);
                s.i.a aVar = this.f104718f;
                if (aVar != null) {
                    L0 l02 = this.f104719g;
                    Context context = this.f104720h;
                    int i11 = Oo.b.f84752p9;
                    Object[] objArr = {aVar.a()};
                    String string = context.getString(i11, objArr);
                    C17542s.i(string, "getString(...)");
                    String string2 = this.f104720h.getString(Oo.b.f84838x8);
                    J0 j02 = J0.Short;
                    this.f104715c = string;
                    this.f104716d = objArr;
                    this.f104717e = 1;
                    obj = L0.f(l02, string, string2, false, j02, this, 4, (Object) null);
                    if (obj == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                Object[] objArr2 = (Object[]) this.f104716d;
                String str = (String) this.f104715c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = C2490a.f104723a[((N0) obj).ordinal()];
            if (i12 == 1) {
                this.f104721i.invoke();
            } else if (i12 == 2) {
                this.f104722j.invoke(this.f104718f.b());
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"vk/a1$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a f104724a;

        public b(C17631a aVar) {
            this.f104724a = aVar;
        }

        public void b() {
            this.f104724a.invoke();
        }
    }

    public static final void c(s.i.a aVar, L0 l02, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        s.i.a aVar3 = aVar;
        L0 l03 = l02;
        C17642l<? super String, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(l03, "snackbarHostState");
        C17542s.j(lVar2, "onUndoClicked");
        C17542s.j(aVar4, "onDismiss");
        C4889m k10 = mVar.k(597733851);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(l03) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(597733851, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.RemoveItemContent (RemoveItemContent.kt:22)");
            }
            C16807N n10 = C16807N.f139792a;
            k10.W(814006017);
            int i13 = i11 & 7168;
            boolean z10 = true;
            boolean z11 = i13 == 2048;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new Y0(aVar4);
                k10.u(D10);
            }
            k10.P();
            P.c(n10, (C17642l) D10, k10, 6);
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(814009964);
            int i14 = i11 & 14;
            boolean F10 = (i14 == 4) | ((i11 & 112) == 32) | k10.F(context) | (i13 == 2048);
            if ((i11 & 896) != 256) {
                z10 = false;
            }
            boolean z12 = F10 | z10;
            Object D11 = k10.D();
            if (z12 || D11 == C4889m.f14007a.a()) {
                a aVar5 = new a(aVar, l02, context, aVar2, lVar, (C17164e<? super a>) null);
                k10.u(aVar5);
                D11 = aVar5;
            }
            k10.P();
            P.g(aVar3, (p) D11, k10, i14);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new Z0(aVar, l02, lVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final L d(C17631a aVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        return new b(aVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(s.i.a aVar, L0 l02, C17642l lVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        c(aVar, l02, lVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
