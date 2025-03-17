package vk;

import O0.J0;
import O0.L0;
import Oo.b;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpk/s$f;", "result", "LO0/L0;", "snackbarHostState", "Lkotlin/Function1;", "Lpk/s$f$b;", "LXH/N;", "onMoveItemBetweenLists", "Lkotlin/Function0;", "onClear", "b", "(Lpk/s$f;LO0/L0;LnI/l;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.MoveItemContentKt$MoveItemContent$1$1", f = "MoveItemContent.kt", l = {25, 39}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f104539c;

        /* renamed from: d  reason: collision with root package name */
        Object f104540d;

        /* renamed from: e  reason: collision with root package name */
        Object f104541e;

        /* renamed from: f  reason: collision with root package name */
        int f104542f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ s.f f104543g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ L0 f104544h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f104545i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<s.f.b, C16807N> f104546j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104547k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s.f fVar, L0 l02, Context context, C17642l<? super s.f.b, C16807N> lVar, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104543g = fVar;
            this.f104544h = l02;
            this.f104545i = context;
            this.f104546j = lVar;
            this.f104547k = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104543g, this.f104544h, this.f104545i, this.f104546j, this.f104547k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104542f;
            if (i10 == 0) {
                y.b(obj);
                s.f fVar = this.f104543g;
                if (fVar instanceof s.f.a) {
                    L0 l02 = this.f104544h;
                    Context context = this.f104545i;
                    int i11 = b.f84517U;
                    Object[] objArr = {((s.f.a) fVar).a(), ((s.f.a) this.f104543g).b()};
                    String string = context.getString(i11, objArr);
                    C17542s.i(string, "getString(...)");
                    this.f104539c = fVar;
                    this.f104540d = string;
                    this.f104541e = objArr;
                    this.f104542f = 1;
                    if (L0.f(l02, string, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                        return f10;
                    }
                } else if (fVar instanceof s.f.b) {
                    this.f104546j.invoke(fVar);
                    C16807N n10 = C16807N.f139792a;
                } else if (fVar instanceof s.f.c) {
                    L0 l03 = this.f104544h;
                    Context context2 = this.f104545i;
                    int i12 = b.f84752p9;
                    Object[] objArr2 = {((s.f.c) fVar).a()};
                    String string2 = context2.getString(i12, objArr2);
                    C17542s.i(string2, "getString(...)");
                    this.f104539c = fVar;
                    this.f104540d = string2;
                    this.f104541e = objArr2;
                    this.f104542f = 2;
                    if (L0.f(l03, string2, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                        return f10;
                    }
                } else if (fVar == null) {
                    C16807N n11 = C16807N.f139792a;
                } else {
                    throw new t();
                }
            } else if (i10 == 1 || i10 == 2) {
                Object[] objArr3 = (Object[]) this.f104541e;
                String str = (String) this.f104540d;
                s.f fVar2 = (s.f) this.f104539c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.f104543g != null) {
                this.f104547k.invoke();
            }
            return C16807N.f139792a;
        }
    }

    public static final void b(s.f fVar, L0 l02, C17642l<? super s.f.b, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        s.f fVar2 = fVar;
        L0 l03 = l02;
        C17642l<? super s.f.b, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(l03, "snackbarHostState");
        C17542s.j(lVar2, "onMoveItemBetweenLists");
        C17542s.j(aVar2, "onClear");
        C4889m k10 = mVar.k(1263852478);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(fVar2) : k10.F(fVar2) ? 4 : 2) | i12;
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
            i11 |= k10.F(aVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1263852478, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.MoveItemContent (MoveItemContent.kt:19)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(-1701153681);
            int i13 = i11 & 14;
            boolean z10 = true;
            boolean F10 = (i13 == 4 || ((i11 & 8) != 0 && k10.F(fVar2))) | ((i11 & 112) == 32) | k10.F(context) | ((i11 & 896) == 256);
            if ((i11 & 7168) != 2048) {
                z10 = false;
            }
            boolean z11 = z10 | F10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                a aVar3 = new a(fVar, l02, context, lVar, aVar, (C17164e<? super a>) null);
                k10.u(aVar3);
                D10 = aVar3;
            }
            k10.P();
            P.g(fVar2, (p) D10, k10, i13);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new H0(fVar, l02, lVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.f fVar, L0 l02, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(fVar, l02, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
