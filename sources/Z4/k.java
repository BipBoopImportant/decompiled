package z4;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import f1.C5303e;
import j3.g;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.p;
import x4.C8948l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx4/l;", "Lf1/e;", "saveableStateHolder", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(Lx4/l;Lf1/e;LnI/p;LU0/m;I)V", "b", "(Lf1/e;LnI/p;LU0/m;I)V", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5303e f58249c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f58250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5303e eVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f58249c = eVar;
            this.f58250d = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-52928304, i10, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:51)");
                }
                k.b(this.f58249c, this.f58250d, mVar, 0);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8948l f58251c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5303e f58252d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f58253e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f58254f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C8948l lVar, C5303e eVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f58251c = lVar;
            this.f58252d = eVar;
            this.f58253e = pVar;
            this.f58254f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            k.a(this.f58251c, this.f58252d, this.f58253e, mVar, M0.a(this.f58254f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5303e f58255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f58256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58257e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5303e eVar, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f58255c = eVar;
            this.f58256d = pVar;
            this.f58257e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            k.b(this.f58255c, this.f58256d, mVar, M0.a(this.f58257e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(C8948l lVar, C5303e eVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1579360880);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1579360880, i11, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:45)");
            }
            C4910x.b(new J0[]{m3.a.f26247a.b(lVar), g.a().d(lVar), AndroidCompositionLocals_androidKt.j().d(lVar)}, c1.c.e(-52928304, true, new a(eVar, pVar), k10, 54), k10, J0.f13770i | 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(lVar, eVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void b(C5303e eVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1211832233);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(pVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1211832233, i12, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:56)");
            }
            k10.C(1729797275);
            k0 a10 = m3.a.f26247a.a(k10, 6);
            if (a10 != null) {
                f0 c10 = m3.c.c(P.b(C9009a.class), a10, (String) null, (i0.c) null, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, k10, 0, 0);
                k10.U();
                C9009a aVar = (C9009a) c10;
                aVar.E(new WeakReference(eVar));
                eVar.f(aVar.C(), pVar, k10, (i12 & 112) | ((i12 << 6) & 896));
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(eVar, pVar, i10));
        }
    }
}
