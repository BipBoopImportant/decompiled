package androidx.compose.foundation.selection;

import L1.i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.j;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5584G;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import r0.l;
import r0.m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/d;", "", "selected", "enabled", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "c", "(Landroidx/compose/ui/d;ZZLL1/i;LnI/a;)Landroidx/compose/ui/d;", "Lr0/m;", "interactionSource", "Ln0/G;", "indication", "a", "(Landroidx/compose/ui/d;ZLr0/m;Ln0/G;ZLL1/i;LnI/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.selection.a$a  reason: collision with other inner class name */
    static final class C0272a extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f18475c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18476d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f18477e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f18478f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0272a(boolean z10, boolean z11, i iVar, C17631a<C16807N> aVar) {
            super(3);
            this.f18475c = z10;
            this.f18476d = z11;
            this.f18477e = iVar;
            this.f18478f = aVar;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            m mVar2;
            mVar.W(-2124609672);
            if (C4895p.J()) {
                C4895p.S(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
            }
            C5584G g10 = (C5584G) mVar.Q(j.a());
            if (g10 instanceof C5586I) {
                mVar.W(-1412264498);
                mVar.P();
                mVar2 = null;
            } else {
                mVar.W(-1412156525);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = l.a();
                    mVar.u(D10);
                }
                mVar2 = (m) D10;
                mVar.P();
            }
            d a10 = a.a(d.f18749a, this.f18475c, mVar2, g10, this.f18476d, this.f18477e, this.f18478f);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f18479c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18480d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f18481e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f18482f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f18483g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5584G g10, boolean z10, boolean z11, i iVar, C17631a aVar) {
            super(3);
            this.f18479c = g10;
            this.f18480d = z10;
            this.f18481e = z11;
            this.f18482f = iVar;
            this.f18483g = aVar;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(-1525724089);
            if (C4895p.J()) {
                C4895p.S(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:375)");
            }
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = l.a();
                mVar.u(D10);
            }
            m mVar2 = (m) D10;
            d s10 = j.b(d.f18749a, mVar2, this.f18479c).s(new SelectableElement(this.f18480d, mVar2, (C5586I) null, this.f18481e, this.f18482f, this.f18483g, (DefaultConstructorMarker) null));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return s10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f18484c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18485d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f18486e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a f18487f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, i iVar, C17631a aVar) {
            super(1);
            this.f18484c = z10;
            this.f18485d = z11;
            this.f18486e = iVar;
            this.f18487f = aVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("selectable");
            v0Var.a().c("selected", Boolean.valueOf(this.f18484c));
            v0Var.a().c("enabled", Boolean.valueOf(this.f18485d));
            v0Var.a().c("role", this.f18486e);
            v0Var.a().c("onClick", this.f18487f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.selection.SelectableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.selection.SelectableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.selection.SelectableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.selection.SelectableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.d a(androidx.compose.ui.d r10, boolean r11, r0.m r12, n0.C5584G r13, boolean r14, L1.i r15, nI.C17631a<XH.C16807N> r16) {
        /*
            r2 = r12
            r1 = r13
            boolean r0 = r1 instanceof n0.C5586I
            if (r0 == 0) goto L_0x0018
            r3 = r1
            n0.I r3 = (n0.C5586I) r3
            androidx.compose.foundation.selection.SelectableElement r8 = new androidx.compose.foundation.selection.SelectableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0016:
            r0 = r10
            goto L_0x0059
        L_0x0018:
            if (r1 != 0) goto L_0x0029
            androidx.compose.foundation.selection.SelectableElement r8 = new androidx.compose.foundation.selection.SelectableElement
            r7 = 0
            r3 = 0
            r0 = r8
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0016
        L_0x0029:
            if (r2 == 0) goto L_0x0044
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = androidx.compose.foundation.j.b(r0, r12, r13)
            androidx.compose.foundation.selection.SelectableElement r9 = new androidx.compose.foundation.selection.SelectableElement
            r7 = 0
            r3 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d r8 = r8.s(r9)
            goto L_0x0016
        L_0x0044:
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.selection.a$b r7 = new androidx.compose.foundation.selection.a$b
            r0 = r7
            r1 = r13
            r2 = r11
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            androidx.compose.ui.d r8 = androidx.compose.ui.c.c(r6, r1, r7, r0, r1)
            goto L_0x0016
        L_0x0059:
            androidx.compose.ui.d r0 = r10.s(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.a.a(androidx.compose.ui.d, boolean, r0.m, n0.G, boolean, L1.i, nI.a):androidx.compose.ui.d");
    }

    public static /* synthetic */ d b(d dVar, boolean z10, m mVar, C5584G g10, boolean z11, i iVar, C17631a aVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            iVar = null;
        }
        return a(dVar, z10, mVar, g10, z12, iVar, aVar);
    }

    public static final d c(d dVar, boolean z10, boolean z11, i iVar, C17631a<C16807N> aVar) {
        return androidx.compose.ui.c.b(dVar, C5133t0.b() ? new c(z10, z11, iVar, aVar) : C5133t0.a(), new C0272a(z10, z11, iVar, aVar));
    }

    public static /* synthetic */ d d(d dVar, boolean z10, boolean z11, i iVar, C17631a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return c(dVar, z10, z11, iVar, aVar);
    }
}
