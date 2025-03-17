package androidx.compose.foundation;

import G1.B0;
import G1.C0;
import L1.i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import n0.C5584G;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.C5679B;
import r0.l;
import r0.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0001\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0001*\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/d;", "", "enabled", "", "onClickLabel", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "c", "(Landroidx/compose/ui/d;ZLjava/lang/String;LL1/i;LnI/a;)Landroidx/compose/ui/d;", "Lr0/m;", "interactionSource", "Ln0/G;", "indication", "a", "(Landroidx/compose/ui/d;Lr0/m;Ln0/G;ZLjava/lang/String;LL1/i;LnI/a;)Landroidx/compose/ui/d;", "onLongClickLabel", "onLongClick", "onDoubleClick", "e", "(Landroidx/compose/ui/d;Lr0/m;Ln0/G;ZLjava/lang/String;LL1/i;Ljava/lang/String;LnI/a;LnI/a;LnI/a;)Landroidx/compose/ui/d;", "LG1/B0;", "g", "(LG1/B0;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17592c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f17593d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f17594e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f17595f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z10, String str, i iVar, C17631a<C16807N> aVar) {
            super(3);
            this.f17592c = z10;
            this.f17593d = str;
            this.f17594e = iVar;
            this.f17595f = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
            m mVar2;
            mVar.W(-756081143);
            if (C4895p.J()) {
                C4895p.S(-756081143, i10, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
            }
            C5584G g10 = (C5584G) mVar.Q(j.a());
            if (g10 instanceof C5586I) {
                mVar.W(617140216);
                mVar.P();
                mVar2 = null;
            } else {
                mVar.W(617248189);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = l.a();
                    mVar.u(D10);
                }
                mVar2 = (m) D10;
                mVar.P();
            }
            androidx.compose.ui.d a10 = d.a(androidx.compose.ui.d.f18749a, mVar2, g10, this.f17592c, this.f17593d, this.f17594e, this.f17595f);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f17596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f17597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f17598e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f17599f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f17600g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5584G g10, boolean z10, String str, i iVar, C17631a aVar) {
            super(3);
            this.f17596c = g10;
            this.f17597d = z10;
            this.f17598e = str;
            this.f17599f = iVar;
            this.f17600g = aVar;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
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
            androidx.compose.ui.d s10 = j.b(androidx.compose.ui.d.f18749a, mVar2, this.f17596c).s(new ClickableElement(mVar2, (C5586I) null, this.f17597d, this.f17598e, this.f17599f, this.f17600g, (DefaultConstructorMarker) null));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return s10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f17601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f17602d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f17603e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a f17604f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10, String str, i iVar, C17631a aVar) {
            super(1);
            this.f17601c = z10;
            this.f17602d = str;
            this.f17603e = iVar;
            this.f17604f = aVar;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("clickable");
            v0Var.a().c("enabled", Boolean.valueOf(this.f17601c));
            v0Var.a().c("onClickLabel", this.f17602d);
            v0Var.a().c("role", this.f17603e);
            v0Var.a().c("onClick", this.f17604f);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.d$d  reason: collision with other inner class name */
    public static final class C0247d extends C17544u implements q<androidx.compose.ui.d, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f17605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f17606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f17607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f17608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f17609g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f17610h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a f17611i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17631a f17612j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0247d(C5584G g10, boolean z10, String str, i iVar, C17631a aVar, String str2, C17631a aVar2, C17631a aVar3) {
            super(3);
            this.f17605c = g10;
            this.f17606d = z10;
            this.f17607e = str;
            this.f17608f = iVar;
            this.f17609g = aVar;
            this.f17610h = str2;
            this.f17611i = aVar2;
            this.f17612j = aVar3;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C4889m mVar, int i10) {
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
            androidx.compose.ui.d s10 = j.b(androidx.compose.ui.d.f18749a, mVar2, this.f17605c).s(new CombinedClickableElement(mVar2, (C5586I) null, this.f17606d, this.f17607e, this.f17608f, this.f17609g, this.f17610h, this.f17611i, this.f17612j, (DefaultConstructorMarker) null));
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return s10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/B0;", "node", "", "a", "(LG1/B0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<B0, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f17613c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(K k10) {
            super(1);
            this.f17613c = k10;
        }

        /* renamed from: a */
        public final Boolean invoke(B0 b02) {
            boolean z10;
            K k10 = this.f17613c;
            if (!k10.f144344a) {
                C17542s.h(b02, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                if (!((C5679B) b02).C2()) {
                    z10 = false;
                    k10.f144344a = z10;
                    return Boolean.valueOf(!this.f17613c.f144344a);
                }
            }
            z10 = true;
            k10.f144344a = z10;
            return Boolean.valueOf(!this.f17613c.f144344a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.ClickableElement} */
    /* JADX WARNING: type inference failed for: r8v4, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.d a(androidx.compose.ui.d r10, r0.m r11, n0.C5584G r12, boolean r13, java.lang.String r14, L1.i r15, nI.C17631a<XH.C16807N> r16) {
        /*
            r1 = r11
            r2 = r12
            boolean r0 = r2 instanceof n0.C5586I
            if (r0 == 0) goto L_0x0017
            n0.I r2 = (n0.C5586I) r2
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0015:
            r0 = r10
            goto L_0x0058
        L_0x0017:
            if (r2 != 0) goto L_0x0028
            androidx.compose.foundation.ClickableElement r8 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r8
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0015
        L_0x0028:
            if (r1 == 0) goto L_0x0043
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = androidx.compose.foundation.j.b(r0, r11, r12)
            androidx.compose.foundation.ClickableElement r9 = new androidx.compose.foundation.ClickableElement
            r7 = 0
            r2 = 0
            r0 = r9
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d r8 = r8.s(r9)
            goto L_0x0015
        L_0x0043:
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.d$b r7 = new androidx.compose.foundation.d$b
            r0 = r7
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 1
            r1 = 0
            androidx.compose.ui.d r8 = androidx.compose.ui.c.c(r6, r1, r7, r0, r1)
            goto L_0x0015
        L_0x0058:
            androidx.compose.ui.d r0 = r10.s(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.a(androidx.compose.ui.d, r0.m, n0.G, boolean, java.lang.String, L1.i, nI.a):androidx.compose.ui.d");
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, m mVar, C5584G g10, boolean z10, String str, i iVar, C17631a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return a(dVar, mVar, g10, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : iVar, aVar);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, boolean z10, String str, i iVar, C17631a<C16807N> aVar) {
        return androidx.compose.ui.c.b(dVar, C5133t0.b() ? new c(z10, str, iVar, aVar) : C5133t0.a(), new a(z10, str, iVar, aVar));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, boolean z10, String str, i iVar, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            iVar = null;
        }
        return c(dVar, z10, str, iVar, aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.ui.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: androidx.compose.foundation.CombinedClickableElement} */
    /* JADX WARNING: type inference failed for: r11v4, types: [androidx.compose.ui.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.d e(androidx.compose.ui.d r13, r0.m r14, n0.C5584G r15, boolean r16, java.lang.String r17, L1.i r18, java.lang.String r19, nI.C17631a<XH.C16807N> r20, nI.C17631a<XH.C16807N> r21, nI.C17631a<XH.C16807N> r22) {
        /*
            r1 = r14
            r2 = r15
            boolean r0 = r2 instanceof n0.C5586I
            if (r0 == 0) goto L_0x0021
            n0.I r2 = (n0.C5586I) r2
            androidx.compose.foundation.CombinedClickableElement r11 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r0 = r11
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x001e:
            r0 = r13
            goto L_0x007d
        L_0x0021:
            if (r2 != 0) goto L_0x003b
            androidx.compose.foundation.CombinedClickableElement r11 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r2 = 0
            r0 = r11
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001e
        L_0x003b:
            if (r1 == 0) goto L_0x005f
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r11 = androidx.compose.foundation.j.b(r0, r14, r15)
            androidx.compose.foundation.CombinedClickableElement r12 = new androidx.compose.foundation.CombinedClickableElement
            r10 = 0
            r2 = 0
            r0 = r12
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.d r11 = r11.s(r12)
            goto L_0x001e
        L_0x005f:
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.d$d r10 = new androidx.compose.foundation.d$d
            r0 = r10
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r22
            r6 = r19
            r7 = r20
            r8 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            androidx.compose.ui.d r11 = androidx.compose.ui.c.c(r9, r1, r10, r0, r1)
            goto L_0x001e
        L_0x007d:
            androidx.compose.ui.d r0 = r13.s(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.d.e(androidx.compose.ui.d, r0.m, n0.G, boolean, java.lang.String, L1.i, java.lang.String, nI.a, nI.a, nI.a):androidx.compose.ui.d");
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, m mVar, C5584G g10, boolean z10, String str, i iVar, String str2, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, Object obj) {
        int i11 = i10;
        return e(dVar, mVar, g10, (i11 & 4) != 0 ? true : z10, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : iVar, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : aVar, (i11 & 128) != 0 ? null : aVar2, aVar3);
    }

    public static final boolean g(B0 b02) {
        K k10 = new K();
        C0.c(b02, C5679B.f26787p, new e(k10));
        return k10.f144344a;
    }
}
