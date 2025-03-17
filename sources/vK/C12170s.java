package vk;

import J1.j;
import Oo.b;
import QJ.Q;
import SC.C13651w0;
import SC.W1;
import SC.Z1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.window.h;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import ik.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import pk.s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpk/s$e;", "deleteListResult", "Lkotlin/Function0;", "LXH/N;", "onDeleteListClick", "onDismissed", "onListDeleted", "b", "(Lpk/s$e;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.s  reason: case insensitive filesystem */
public final class C12170s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.DeleteListContentKt$DeleteListContent$1$1", f = "DeleteListContent.kt", l = {}, m = "invokeSuspend")
    /* renamed from: vk.s$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104932c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s.e f104933d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104934e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(s.e eVar, C17631a<C16807N> aVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f104933d = eVar;
            this.f104934e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104933d, this.f104934e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f104932c == 0) {
                y.b(obj);
                if (this.f104933d instanceof s.e.c) {
                    this.f104934e.invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void b(s.e eVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z10;
        int i12;
        s.e eVar2 = eVar;
        C17631a<C16807N> aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i13 = i10;
        C17542s.j(aVar4, "onDeleteListClick");
        C17542s.j(aVar5, "onDismissed");
        C17542s.j(aVar6, "onListDeleted");
        C4889m k10 = mVar.k(-557002432);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(eVar2) : k10.F(eVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(aVar6) ? 2048 : 1024;
        }
        int i14 = i11;
        if ((i14 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-557002432, i14, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.DeleteListContent (DeleteListContent.kt:21)");
            }
            if (eVar2 instanceof s.e.a) {
                k10.W(1720376180);
                Z1.d(j.b(b.f84853z3, k10, 0), new W1(j.b(b.f84616d5, k10, 0), aVar5), aVar2, (d) null, (h) null, C12149h.f104791a.a(), k10, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | (i14 & 896), 24);
                k10.P();
                mVar2 = k10;
                i12 = i14;
                z10 = false;
            } else {
                int i15 = i14;
                if (eVar2 instanceof s.e.b) {
                    k10.W(1720388653);
                    String b10 = j.b(c.f98320L, k10, 0);
                    W1 w12 = new W1(j.b(c.f98318J, k10, 0), aVar4);
                    W1 w13 = new W1(j.b(b.f84492R4, k10, 0), aVar5);
                    p<C4889m, Integer, C16807N> b11 = C12149h.f104791a.b();
                    int i16 = W1.f116045c;
                    int i17 = i15;
                    i12 = i17;
                    z10 = false;
                    C4889m mVar3 = k10;
                    Z1.c(b10, w12, w13, aVar2, (d) null, (C13651w0) null, (h) null, b11, k10, (i16 << 6) | (i16 << 3) | 12582912 | ((i17 << 3) & 7168), 112);
                    mVar3.P();
                    mVar2 = mVar3;
                } else {
                    C4889m mVar4 = k10;
                    i12 = i15;
                    z10 = false;
                    if (C17542s.e(eVar2, s.e.c.f101078a)) {
                        mVar2 = mVar4;
                        mVar2.W(1720406762);
                        mVar2.P();
                    } else {
                        mVar2 = mVar4;
                        if (eVar2 == null) {
                            mVar2.W(1720407434);
                            mVar2.P();
                        } else {
                            mVar2.W(1720374828);
                            mVar2.P();
                            throw new t();
                        }
                    }
                }
            }
            mVar2.W(1720409071);
            int i18 = i12 & 14;
            boolean z11 = true;
            boolean z12 = (i18 == 4 || ((i12 & 8) != 0 && mVar2.F(eVar2))) ? true : z10;
            if ((i12 & 7168) != 2048) {
                z11 = z10;
            }
            boolean z13 = z12 | z11;
            Object D10 = mVar2.D();
            if (z13 || D10 == C4889m.f14007a.a()) {
                D10 = new a(eVar2, aVar6, (C17164e<? super a>) null);
                mVar2.u(D10);
            }
            mVar2.P();
            P.g(eVar2, (p) D10, mVar2, i18);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new r(eVar, aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.e eVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        b(eVar, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
