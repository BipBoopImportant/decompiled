package vt;

import IC.C13023e;
import IC.C13026h;
import It.C10749l;
import It.C10750m;
import It.q;
import KJ.C15985a;
import S1.C4820m;
import U0.C4889m;
import U0.C4895p;
import U0.Y0;
import XH.C16807N;
import androidx.compose.animation.g;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import l0.i;
import m0.C5548j;
import m0.M;
import m0.y0;
import nI.C17642l;
import nI.p;
import nI.r;
import p1.C5747v0;
import tK.C18025p;
import ut.w0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\r\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LIt/m;", "appbar", "", "showTitle", "useDarkIcons", "Lp1/v0;", "backgroundColor", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "c", "(LIt/m;ZZJLnI/l;LnI/l;LU0/m;I)V", "Lm0/y0;", "", "a", "Lm0/y0;", "AnimationSpec", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M0 {

    /* renamed from: a  reason: collision with root package name */
    private static final y0<Float> f105506a = C5548j.j(220, 0, M.e(), 2, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements C17642l<C5747v0, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105507a = new a();

        a() {
        }

        public final Object a(long j10) {
            return C5747v0.k(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C5747v0) obj).y());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<C5507b, C5747v0, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f105508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13023e f105509b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C10750m f105510c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<q, C16807N> f105511d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105512e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C13023e f105513a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10750m f105514b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<q, C16807N> f105515c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<C10749l, C16807N> f105516d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f105517e;

            a(C13023e eVar, C10750m mVar, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, long j10) {
                this.f105513a = eVar;
                this.f105514b = mVar;
                this.f105515c = lVar;
                this.f105516d = lVar2;
                this.f105517e = j10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-28230748, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.TopAppBar.<anonymous>.<anonymous> (TopAppBar.kt:42)");
                    }
                    w0.c(this.f105513a.a(mVar, C13023e.f110931a), C15985a.l(this.f105514b.a()), this.f105515c, this.f105516d, this.f105517e, mVar, 0, 0);
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

        b(boolean z10, C13023e eVar, C10750m mVar, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105508a = z10;
            this.f105509b = eVar;
            this.f105510c = mVar;
            this.f105511d = lVar;
            this.f105512e = lVar2;
        }

        public final void a(C5507b bVar, long j10, C4889m mVar, int i10) {
            C17542s.j(bVar, "$this$AnimatedContent");
            if (C4895p.J()) {
                C4895p.S(-951155160, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.TopAppBar.<anonymous> (TopAppBar.kt:41)");
            }
            C18025p.e(this.f105508a, (C4820m) null, c.e(-28230748, true, new a(this.f105509b, this.f105510c, this.f105511d, this.f105512e, j10), mVar, 54), mVar, 384, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, ((C5747v0) obj2).y(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void c(C10750m mVar, boolean z10, boolean z11, long j10, C17642l<? super q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, C4889m mVar2, int i10) {
        int i11;
        C4889m mVar3;
        C10750m mVar4 = mVar;
        boolean z12 = z10;
        C17642l<? super q, C16807N> lVar3 = lVar;
        C17642l<? super C10749l, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(mVar4, "appbar");
        C17542s.j(lVar3, "action");
        C17542s.j(lVar4, "analyticsAction");
        C4889m k10 = mVar2.k(-1298426966);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(mVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z12) ? 32 : 16;
        }
        boolean z13 = z11;
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z13) ? 256 : 128;
        }
        long j11 = j10;
        if ((i12 & 3072) == 0) {
            i11 |= k10.e(j11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i13 = i11;
        if ((74899 & i13) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1298426966, i13, -1, "com.ingka.ikea.instore.impl.composables.storeselected.TopAppBar (TopAppBar.kt:33)");
            }
            C13023e b10 = mVar.b();
            if (!z12) {
                b10 = null;
            }
            if (b10 == null) {
                b10 = C13026h.c("");
            }
            C13023e eVar = b10;
            C5747v0 k11 = C5747v0.k(j10);
            k10.W(1348146779);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new K0();
                k10.u(D10);
            }
            C17642l lVar5 = (C17642l) D10;
            k10.P();
            k10.W(1348145668);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = a.f105507a;
                k10.u(D11);
            }
            k10.P();
            b bVar = r0;
            b bVar2 = new b(z11, eVar, mVar, lVar, lVar2);
            mVar3 = k10;
            androidx.compose.animation.a.a(k11, (d) null, lVar5, (C5437c) null, "TopAppBar content transition", (C17642l) D11, c.e(-951155160, true, bVar, k10, 54), mVar3, ((i13 >> 9) & 14) | 1794432, 10);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar3 = k10;
        }
        Y0 n10 = mVar3.n();
        if (n10 != null) {
            n10.a(new L0(mVar, z10, z11, j10, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final i d(androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$AnimatedContent");
        y0<Float> y0Var = f105506a;
        return androidx.compose.animation.a.e(g.o(y0Var, 0.0f, 2, (Object) null), g.q(y0Var, 0.0f, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C10750m mVar, boolean z10, boolean z11, long j10, C17642l lVar, C17642l lVar2, int i10, C4889m mVar2, int i11) {
        c(mVar, z10, z11, j10, lVar, lVar2, mVar2, U0.M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
