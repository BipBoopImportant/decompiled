package androidx.compose.foundation.selection;

import L1.i;
import U0.C4889m;
import U0.C4895p;
import androidx.compose.foundation.j;
import androidx.compose.ui.d;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aT\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/d;", "", "value", "Lr0/m;", "interactionSource", "Ln0/G;", "indication", "enabled", "LL1/i;", "role", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "a", "(Landroidx/compose/ui/d;ZLr0/m;Ln0/G;ZLL1/i;LnI/l;)Landroidx/compose/ui/d;", "LM1/a;", "state", "Lkotlin/Function0;", "onClick", "b", "(Landroidx/compose/ui/d;LM1/a;Lr0/m;Ln0/G;ZLL1/i;LnI/a;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f18489c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f18490d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f18491e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f18492f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f18493g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5584G g10, boolean z10, boolean z11, i iVar, C17642l lVar) {
            super(3);
            this.f18489c = g10;
            this.f18490d = z10;
            this.f18491e = z11;
            this.f18492f = iVar;
            this.f18493g = lVar;
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
            d s10 = j.b(d.f18749a, mVar2, this.f18489c).s(new ToggleableElement(this.f18490d, mVar2, (C5586I) null, this.f18491e, this.f18492f, this.f18493g, (DefaultConstructorMarker) null));
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f18494c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M1.a f18495d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f18496e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f18497f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f18498g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5584G g10, M1.a aVar, boolean z10, i iVar, C17631a aVar2) {
            super(3);
            this.f18494c = g10;
            this.f18495d = aVar;
            this.f18496e = z10;
            this.f18497f = iVar;
            this.f18498g = aVar2;
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
            d s10 = j.b(d.f18749a, mVar2, this.f18494c).s(new TriStateToggleableElement(this.f18495d, mVar2, (C5586I) null, this.f18496e, this.f18497f, this.f18498g, (DefaultConstructorMarker) null));
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.selection.ToggleableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.d a(androidx.compose.ui.d r10, boolean r11, r0.m r12, n0.C5584G r13, boolean r14, L1.i r15, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r16) {
        /*
            r2 = r12
            r1 = r13
            boolean r0 = r1 instanceof n0.C5586I
            if (r0 == 0) goto L_0x0018
            r3 = r1
            n0.I r3 = (n0.C5586I) r3
            androidx.compose.foundation.selection.ToggleableElement r8 = new androidx.compose.foundation.selection.ToggleableElement
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
            androidx.compose.foundation.selection.ToggleableElement r8 = new androidx.compose.foundation.selection.ToggleableElement
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
            androidx.compose.foundation.selection.ToggleableElement r9 = new androidx.compose.foundation.selection.ToggleableElement
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
            androidx.compose.foundation.selection.c$a r7 = new androidx.compose.foundation.selection.c$a
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.c.a(androidx.compose.ui.d, boolean, r0.m, n0.G, boolean, L1.i, nI.l):androidx.compose.ui.d");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.selection.TriStateToggleableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.d b(androidx.compose.ui.d r10, M1.a r11, r0.m r12, n0.C5584G r13, boolean r14, L1.i r15, nI.C17631a<XH.C16807N> r16) {
        /*
            r2 = r12
            r1 = r13
            boolean r0 = r1 instanceof n0.C5586I
            if (r0 == 0) goto L_0x0018
            r3 = r1
            n0.I r3 = (n0.C5586I) r3
            androidx.compose.foundation.selection.TriStateToggleableElement r8 = new androidx.compose.foundation.selection.TriStateToggleableElement
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
            androidx.compose.foundation.selection.TriStateToggleableElement r8 = new androidx.compose.foundation.selection.TriStateToggleableElement
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
            androidx.compose.foundation.selection.TriStateToggleableElement r9 = new androidx.compose.foundation.selection.TriStateToggleableElement
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
            androidx.compose.foundation.selection.c$b r7 = new androidx.compose.foundation.selection.c$b
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.selection.c.b(androidx.compose.ui.d, M1.a, r0.m, n0.G, boolean, L1.i, nI.a):androidx.compose.ui.d");
    }
}
