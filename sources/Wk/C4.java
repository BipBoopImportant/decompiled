package wK;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import L1.i;
import L1.o;
import L1.x;
import N1.P;
import N1.Y;
import O0.C4756u0;
import O0.V;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5747v0;
import p1.C5749w0;
import r0.m;
import s0.C5842M;
import s0.C5844O;
import s0.C5862h;
import sK.C17950a;
import t1.C5942c;
import tK.C18029u;
import wK.C18454q4;
import wK.C18466r4;

@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0001\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a§\u0001\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a³\u0001\u0010 \u001a\u00020\u000b2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b \u0010!\u001a£\u0001\u0010\"\u001a\u00020\u000b2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\"\u0010#\u001aI\u0010$\u001a\u00020\u000b*\u00020\u001d2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b$\u0010%\u001a+\u0010&\u001a\u00020\u000b*\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b&\u0010'\u001a/\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b+\u0010,¨\u00062²\u0006\f\u0010-\u001a\u00020\u00138\nX\u0002²\u0006\f\u0010.\u001a\u00020\u00138\nX\u0002²\u0006\f\u0010/\u001a\u00020\u00138\nX\u0002²\u0006\f\u00100\u001a\u00020\u000f8\nX\u0002²\u0006\f\u00101\u001a\u00020\u000f8\nX\u0002"}, d2 = {"", "title", "Landroidx/compose/ui/d;", "modifier", "description", "LwK/r4;", "leadingImage", "LwK/q4;", "trailingControl", "quantityLabel", "Lkotlin/Function0;", "LXH/N;", "addons", "LwK/G4;", "size", "Lc2/h;", "contentHorizontalPadding", "LwK/H4;", "textStyle", "", "enabled", "Lr0/m;", "interactionSource", "onClick", "k", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/String;LwK/r4;LwK/q4;Ljava/lang/String;LnI/p;LwK/G4;FLwK/H4;ZLr0/m;LnI/a;LU0/m;III)V", "l", "(Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/String;LwK/r4;LwK/q4;LnI/p;LnI/p;LwK/G4;FLwK/H4;ZLr0/m;LnI/a;LU0/m;III)V", "Lkotlin/Function1;", "Ls0/M;", "leading", "trailing", "m", "(LnI/p;Landroidx/compose/ui/d;LnI/p;LnI/q;LnI/q;LnI/p;LwK/G4;FZLr0/m;LnI/a;LU0/m;III)V", "p", "(LnI/p;Landroidx/compose/ui/d;LnI/p;LnI/q;LnI/q;LnI/p;LwK/G4;FZLr0/m;LU0/m;II)V", "n", "(Ls0/M;LnI/p;LnI/p;LnI/p;LwK/G4;LU0/m;I)V", "t", "(Ls0/M;LwK/r4;LwK/G4;ZLU0/m;I)V", "control", "Lp1/v0;", "tint", "v", "(LwK/q4;JZLr0/m;LU0/m;I)V", "hover", "pressed", "focused", "minHeight", "verticalPadding", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C4 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<androidx.compose.ui.d, C17631a<? extends C16807N>, C4889m, Integer, androidx.compose.ui.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f149316a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f149317b;

        a(m mVar, boolean z10) {
            this.f149316a = mVar;
            this.f149317b = z10;
        }

        public final androidx.compose.ui.d a(androidx.compose.ui.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "$this$thenCheckNull");
            C17542s.j(aVar, "it");
            mVar.W(-1711297018);
            if (C4895p.J()) {
                C4895p.S(-1711297018, i10, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:220)");
            }
            androidx.compose.ui.d b10 = androidx.compose.foundation.d.b(androidx.compose.ui.d.f18749a, this.f149316a, C4756u0.c(false, 0.0f, 0, 7, (Object) null), this.f149317b, (String) null, (i) null, aVar, 24, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return b10;
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((androidx.compose.ui.d) obj, (C17631a) obj2, (C4889m) obj3, ((Number) obj4).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18442p4 f149319b;

        b(String str, C18442p4 p4Var) {
            this.f149318a = str;
            this.f149319b = p4Var;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1788949319, i11, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:92)");
                }
                String str = this.f149318a;
                if (str != null && !C15854t.v0(str)) {
                    d1.b(this.f149318a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, this.f149319b.a(), mVar, 0, 0, 65534);
                }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Y f149321b;

        c(String str, Y y10) {
            this.f149320a = str;
            this.f149321b = y10;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1980578018, i11, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:156)");
                }
                d1.b(this.f149320a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, this.f149321b, mVar, 0, 0, 65534);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18442p4 f149323b;

        d(String str, C18442p4 p4Var) {
            this.f149322a = str;
            this.f149323b = p4Var;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2132255140, i11, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:161)");
                }
                String str = this.f149322a;
                if (str != null && !C15854t.v0(str)) {
                    d1.b(this.f149322a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, this.f149323b.a(), mVar, 0, 0, 65534);
                }
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18466r4 f149324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G4 f149325b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f149326c;

        e(C18466r4 r4Var, G4 g42, boolean z10) {
            this.f149324a = r4Var;
            this.f149325b = g42;
            this.f149326c = z10;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$ListViewItemImpl");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(m10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(969305939, i10, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:165)");
                }
                C4.t(m10, this.f149324a, this.f149325b, this.f149326c, mVar, i10 & 14);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f149327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18454q4 f149328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18442p4 f149329c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f149330d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f149331e;

        f(p<? super C4889m, ? super Integer, C16807N> pVar, C18454q4 q4Var, C18442p4 p4Var, boolean z10, m mVar) {
            this.f149327a = pVar;
            this.f149328b = q4Var;
            this.f149329c = p4Var;
            this.f149330d = z10;
            this.f149331e = mVar;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$ListViewItemImpl");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(893467378, i10, -1, "net.ikea.skapa.ui.components.ListViewItem.<anonymous> (ListViewItem.kt:167)");
                }
                p<C4889m, Integer, C16807N> pVar = this.f149327a;
                mVar.W(1273360302);
                if (pVar != null) {
                    pVar.invoke(mVar, 0);
                    C16807N n10 = C16807N.f139792a;
                }
                mVar.P();
                C4.v(this.f149328b, this.f149329c.b().h(), this.f149330d, this.f149331e, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(String str, androidx.compose.ui.d dVar, String str2, C18466r4 r4Var, C18454q4 q4Var, String str3, p pVar, G4 g42, float f10, H4 h42, boolean z10, m mVar, C17631a aVar, int i10, int i11, int i12, C4889m mVar2, int i13) {
        k(str, dVar, str2, r4Var, q4Var, str3, pVar, g42, f10, h42, z10, mVar, aVar, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final boolean B(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean C(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean D(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N E(String str, androidx.compose.ui.d dVar, String str2, C18466r4 r4Var, C18454q4 q4Var, p pVar, p pVar2, G4 g42, float f10, H4 h42, boolean z10, m mVar, C17631a aVar, int i10, int i11, int i12, C4889m mVar2, int i13) {
        l(str, dVar, str2, r4Var, q4Var, pVar, pVar2, g42, f10, h42, z10, mVar, aVar, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(p pVar, androidx.compose.ui.d dVar, p pVar2, q qVar, q qVar2, p pVar3, G4 g42, float f10, boolean z10, m mVar, C17631a aVar, int i10, int i11, int i12, C4889m mVar2, int i13) {
        m(pVar, dVar, pVar2, qVar, qVar2, pVar3, g42, f10, z10, mVar, aVar, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: r0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(java.lang.String r30, androidx.compose.ui.d r31, java.lang.String r32, wK.C18466r4 r33, wK.C18454q4 r34, java.lang.String r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, wK.G4 r37, float r38, wK.H4 r39, boolean r40, r0.m r41, nI.C17631a<XH.C16807N> r42, U0.C4889m r43, int r44, int r45, int r46) {
        /*
            r13 = r30
            r12 = r35
            r11 = r44
            r10 = r45
            r9 = r46
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 1144334559(0x443528df, float:724.6386)
            r1 = r43
            U0.m r8 = r1.k(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r11 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r8.V(r13)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r11
            goto L_0x002f
        L_0x002e:
            r1 = r11
        L_0x002f:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x0038
            r1 = r1 | 48
        L_0x0035:
            r7 = r31
            goto L_0x004a
        L_0x0038:
            r7 = r11 & 48
            if (r7 != 0) goto L_0x0035
            r7 = r31
            boolean r14 = r8.V(r7)
            if (r14 == 0) goto L_0x0047
            r14 = 32
            goto L_0x0049
        L_0x0047:
            r14 = 16
        L_0x0049:
            r1 = r1 | r14
        L_0x004a:
            r14 = r9 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r2 = r32
            goto L_0x0068
        L_0x0055:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0052
            r2 = r32
            boolean r17 = r8.V(r2)
            if (r17 == 0) goto L_0x0064
            r17 = r16
            goto L_0x0066
        L_0x0064:
            r17 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r17
        L_0x0068:
            r17 = r9 & 8
            if (r17 == 0) goto L_0x0071
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006e:
            r3 = r33
            goto L_0x0084
        L_0x0071:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x006e
            r3 = r33
            boolean r19 = r8.V(r3)
            if (r19 == 0) goto L_0x0080
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r1 = r1 | r19
        L_0x0084:
            r19 = r9 & 16
            if (r19 == 0) goto L_0x008d
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x008a:
            r5 = r34
            goto L_0x00a0
        L_0x008d:
            r5 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x008a
            r5 = r34
            boolean r21 = r8.V(r5)
            if (r21 == 0) goto L_0x009c
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r1 = r1 | r21
        L_0x00a0:
            r21 = r9 & 32
            r22 = 196608(0x30000, float:2.75506E-40)
            if (r21 == 0) goto L_0x00a9
            r1 = r1 | r22
            goto L_0x00ba
        L_0x00a9:
            r21 = r11 & r22
            if (r21 != 0) goto L_0x00ba
            boolean r21 = r8.V(r12)
            if (r21 == 0) goto L_0x00b6
            r21 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r21 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r1 = r1 | r21
        L_0x00ba:
            r21 = r9 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r21 == 0) goto L_0x00c5
            r1 = r1 | r23
            r6 = r36
            goto L_0x00d8
        L_0x00c5:
            r23 = r11 & r23
            r6 = r36
            if (r23 != 0) goto L_0x00d8
            boolean r24 = r8.F(r6)
            if (r24 == 0) goto L_0x00d4
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r24
        L_0x00d8:
            r15 = r9 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 == 0) goto L_0x00e3
            r1 = r1 | r25
            r0 = r37
            goto L_0x00f6
        L_0x00e3:
            r25 = r11 & r25
            r0 = r37
            if (r25 != 0) goto L_0x00f6
            boolean r26 = r8.V(r0)
            if (r26 == 0) goto L_0x00f2
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r26
        L_0x00f6:
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = r11 & r26
            if (r26 != 0) goto L_0x0112
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010b
            r0 = r38
            boolean r26 = r8.c(r0)
            if (r26 == 0) goto L_0x010d
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010b:
            r0 = r38
        L_0x010d:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r1 = r1 | r26
            goto L_0x0114
        L_0x0112:
            r0 = r38
        L_0x0114:
            r0 = r9 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011f
            r1 = r1 | r26
            r2 = r39
            goto L_0x0132
        L_0x011f:
            r26 = r11 & r26
            r2 = r39
            if (r26 != 0) goto L_0x0132
            boolean r26 = r8.V(r2)
            if (r26 == 0) goto L_0x012e
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r1 = r1 | r26
        L_0x0132:
            r2 = r9 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x013b
            r18 = r10 | 6
            r3 = r40
            goto L_0x0151
        L_0x013b:
            r26 = r10 & 6
            r3 = r40
            if (r26 != 0) goto L_0x014f
            boolean r26 = r8.b(r3)
            if (r26 == 0) goto L_0x014a
            r18 = 4
            goto L_0x014c
        L_0x014a:
            r18 = 2
        L_0x014c:
            r18 = r10 | r18
            goto L_0x0151
        L_0x014f:
            r18 = r10
        L_0x0151:
            r3 = r9 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x015a
            r18 = r18 | 48
        L_0x0157:
            r5 = r18
            goto L_0x016e
        L_0x015a:
            r26 = r10 & 48
            r5 = r41
            if (r26 != 0) goto L_0x0157
            boolean r26 = r8.V(r5)
            if (r26 == 0) goto L_0x0169
            r20 = 32
            goto L_0x016b
        L_0x0169:
            r20 = 16
        L_0x016b:
            r18 = r18 | r20
            goto L_0x0157
        L_0x016e:
            r6 = r9 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0177
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0174:
            r6 = r42
            goto L_0x0188
        L_0x0177:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0174
            r6 = r42
            boolean r18 = r8.F(r6)
            if (r18 == 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0186:
            r5 = r5 | r16
        L_0x0188:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r1 & r16
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x01ba
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x01ba
            boolean r6 = r8.l()
            if (r6 != 0) goto L_0x019f
            goto L_0x01ba
        L_0x019f:
            r8.L()
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r7 = r36
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r25 = r8
            r8 = r37
            goto L_0x0304
        L_0x01ba:
            r8.G()
            r6 = r11 & 1
            if (r6 == 0) goto L_0x01e9
            boolean r6 = r8.O()
            if (r6 == 0) goto L_0x01c8
            goto L_0x01e9
        L_0x01c8:
            r8.L()
            r0 = r9 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d3
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r0
        L_0x01d3:
            r17 = r31
            r19 = r32
            r20 = r33
            r21 = r34
            r23 = r36
            r24 = r37
            r26 = r38
            r7 = r39
            r6 = r40
            r27 = r41
            goto L_0x026c
        L_0x01e9:
            if (r4 == 0) goto L_0x01ee
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01f0
        L_0x01ee:
            r4 = r31
        L_0x01f0:
            r6 = 0
            if (r14 == 0) goto L_0x01f5
            r14 = r6
            goto L_0x01f7
        L_0x01f5:
            r14 = r32
        L_0x01f7:
            if (r17 == 0) goto L_0x01fc
            wK.r4$d r16 = wK.C18466r4.d.f151502b
            goto L_0x01fe
        L_0x01fc:
            r16 = r33
        L_0x01fe:
            if (r19 == 0) goto L_0x0203
            wK.q4$g r17 = wK.C18454q4.g.f151433b
            goto L_0x0205
        L_0x0203:
            r17 = r34
        L_0x0205:
            if (r21 == 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r6 = r36
        L_0x020a:
            if (r15 == 0) goto L_0x020f
            wK.G4 r15 = wK.G4.Medium
            goto L_0x0211
        L_0x020f:
            r15 = r37
        L_0x0211:
            r7 = r9 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x0221
            tK.u r7 = tK.C18029u.f147649a
            float r7 = r7.d()
            r19 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r19
            goto L_0x0223
        L_0x0221:
            r7 = r38
        L_0x0223:
            if (r0 == 0) goto L_0x0228
            wK.H4 r0 = wK.H4.Regular
            goto L_0x022a
        L_0x0228:
            r0 = r39
        L_0x022a:
            if (r2 == 0) goto L_0x022e
            r2 = 1
            goto L_0x0230
        L_0x022e:
            r2 = r40
        L_0x0230:
            if (r3 == 0) goto L_0x0267
            r3 = -794354898(0xffffffffd0a71b2e, float:-2.24286106E10)
            r8.W(r3)
            java.lang.Object r3 = r8.D()
            U0.m$a r19 = U0.C4889m.f14007a
            r31 = r0
            java.lang.Object r0 = r19.a()
            if (r3 != r0) goto L_0x024d
            r0.m r3 = r0.l.a()
            r8.u(r3)
        L_0x024d:
            r0 = r3
            r0.m r0 = (r0.m) r0
            r8.P()
            r27 = r0
        L_0x0255:
            r23 = r6
            r26 = r7
            r19 = r14
            r24 = r15
            r20 = r16
            r21 = r17
            r7 = r31
            r6 = r2
            r17 = r4
            goto L_0x026c
        L_0x0267:
            r31 = r0
            r27 = r41
            goto L_0x0255
        L_0x026c:
            r8.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x027d
            java.lang.String r0 = "net.ikea.skapa.ui.components.ListViewItem (ListViewItem.kt:83)"
            r2 = 1144334559(0x443528df, float:724.6386)
            U0.C4895p.S(r2, r1, r5, r0)
        L_0x027d:
            wK.D4 r0 = wK.D4.f149397a
            r2 = r5 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            int r3 = r1 >> 24
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            wK.p4 r0 = r0.k(r6, r7, r8, r2)
            wK.C4$b r2 = new wK.C4$b
            r2.<init>(r12, r0)
            r0 = 54
            r3 = 1788949319(0x6aa13347, float:9.74396E25)
            r4 = 1
            c1.a r0 = c1.c.e(r3, r4, r2, r8, r0)
            r2 = r5
            r5 = r0
            r0 = r1 & 14
            r0 = r0 | r22
            r3 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r1
            r0 = r0 | r3
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r3
            r14 = r0 | r1
            r15 = r2 & 1022(0x3fe, float:1.432E-42)
            r16 = 0
            r0 = r30
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r18 = r6
            r6 = r23
            r22 = r7
            r7 = r24
            r25 = r8
            r8 = r26
            r9 = r22
            r10 = r18
            r11 = r27
            r12 = r42
            r13 = r25
            l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02f0
            U0.C4895p.R()
        L_0x02f0:
            r2 = r17
            r11 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r10 = r22
            r7 = r23
            r8 = r24
            r9 = r26
            r12 = r27
        L_0x0304:
            U0.Y0 r15 = r25.n()
            if (r15 == 0) goto L_0x0327
            wK.t4 r14 = new wK.t4
            r0 = r14
            r1 = r30
            r6 = r35
            r13 = r42
            r28 = r14
            r14 = r44
            r29 = r15
            r15 = r45
            r16 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r28
            r0 = r29
            r0.a(r1)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C4.k(java.lang.String, androidx.compose.ui.d, java.lang.String, wK.r4, wK.q4, java.lang.String, nI.p, wK.G4, float, wK.H4, boolean, r0.m, nI.a, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(java.lang.String r51, androidx.compose.ui.d r52, java.lang.String r53, wK.C18466r4 r54, wK.C18454q4 r55, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r56, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r57, wK.G4 r58, float r59, wK.H4 r60, boolean r61, r0.m r62, nI.C17631a<XH.C16807N> r63, U0.C4889m r64, int r65, int r66, int r67) {
        /*
            r1 = r51
            r14 = r65
            r15 = r66
            r13 = r67
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -1793065631(0xffffffff951ffd61, float:-3.2309675E-26)
            r2 = r64
            U0.m r2 = r2.k(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x001d
            r3 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.V(r1)
            if (r3 == 0) goto L_0x0029
            r3 = 4
            goto L_0x002a
        L_0x0029:
            r3 = 2
        L_0x002a:
            r3 = r3 | r14
            goto L_0x002d
        L_0x002c:
            r3 = r14
        L_0x002d:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r9 = r52
            goto L_0x0048
        L_0x0036:
            r9 = r14 & 48
            if (r9 != 0) goto L_0x0033
            r9 = r52
            boolean r10 = r2.V(r9)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r3 = r3 | r10
        L_0x0048:
            r10 = r13 & 4
            if (r10 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r4 = r53
            goto L_0x0064
        L_0x0051:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004e
            r4 = r53
            boolean r16 = r2.V(r4)
            if (r16 == 0) goto L_0x0060
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r16
        L_0x0064:
            r16 = r13 & 8
            if (r16 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r5 = r54
            goto L_0x0080
        L_0x006d:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x006a
            r5 = r54
            boolean r18 = r2.V(r5)
            if (r18 == 0) goto L_0x007c
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r18
        L_0x0080:
            r18 = r13 & 16
            if (r18 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r7 = r55
            goto L_0x009c
        L_0x0089:
            r7 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0086
            r7 = r55
            boolean r20 = r2.V(r7)
            if (r20 == 0) goto L_0x0098
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009a
        L_0x0098:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x009a:
            r3 = r3 | r20
        L_0x009c:
            r20 = r13 & 32
            r21 = 196608(0x30000, float:2.75506E-40)
            if (r20 == 0) goto L_0x00a7
            r3 = r3 | r21
            r8 = r56
            goto L_0x00ba
        L_0x00a7:
            r21 = r14 & r21
            r8 = r56
            if (r21 != 0) goto L_0x00ba
            boolean r22 = r2.F(r8)
            if (r22 == 0) goto L_0x00b6
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r22
        L_0x00ba:
            r22 = r13 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r22 == 0) goto L_0x00c5
            r3 = r3 | r23
            r11 = r57
            goto L_0x00d8
        L_0x00c5:
            r23 = r14 & r23
            r11 = r57
            if (r23 != 0) goto L_0x00d8
            boolean r24 = r2.F(r11)
            if (r24 == 0) goto L_0x00d4
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r3 = r3 | r24
        L_0x00d8:
            r12 = r13 & 128(0x80, float:1.794E-43)
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            if (r12 == 0) goto L_0x00e3
            r3 = r3 | r25
            r0 = r58
            goto L_0x00f6
        L_0x00e3:
            r25 = r14 & r25
            r0 = r58
            if (r25 != 0) goto L_0x00f6
            boolean r26 = r2.V(r0)
            if (r26 == 0) goto L_0x00f2
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r3 = r3 | r26
        L_0x00f6:
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x0112
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x010b
            r0 = r59
            boolean r26 = r2.c(r0)
            if (r26 == 0) goto L_0x010d
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010b:
            r0 = r59
        L_0x010d:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r3 = r3 | r26
            goto L_0x0114
        L_0x0112:
            r0 = r59
        L_0x0114:
            r0 = r13 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x011f
            r3 = r3 | r26
            r4 = r60
            goto L_0x0132
        L_0x011f:
            r26 = r14 & r26
            r4 = r60
            if (r26 != 0) goto L_0x0132
            boolean r26 = r2.V(r4)
            if (r26 == 0) goto L_0x012e
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r3 = r3 | r26
        L_0x0132:
            r4 = r13 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x013b
            r17 = r15 | 6
            r5 = r61
            goto L_0x0151
        L_0x013b:
            r26 = r15 & 6
            r5 = r61
            if (r26 != 0) goto L_0x014f
            boolean r26 = r2.b(r5)
            if (r26 == 0) goto L_0x014a
            r17 = 4
            goto L_0x014c
        L_0x014a:
            r17 = 2
        L_0x014c:
            r17 = r15 | r17
            goto L_0x0151
        L_0x014f:
            r17 = r15
        L_0x0151:
            r5 = r13 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x015a
            r17 = r17 | 48
        L_0x0157:
            r7 = r17
            goto L_0x016e
        L_0x015a:
            r26 = r15 & 48
            r7 = r62
            if (r26 != 0) goto L_0x0157
            boolean r26 = r2.V(r7)
            if (r26 == 0) goto L_0x0169
            r19 = 32
            goto L_0x016b
        L_0x0169:
            r19 = 16
        L_0x016b:
            r17 = r17 | r19
            goto L_0x0157
        L_0x016e:
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0177
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0174:
            r8 = r63
            goto L_0x018a
        L_0x0177:
            r8 = r15 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0174
            r8 = r63
            boolean r17 = r2.F(r8)
            if (r17 == 0) goto L_0x0186
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0188
        L_0x0186:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0188:
            r7 = r7 | r23
        L_0x018a:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r3 & r17
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x01bb
            r8 = r7 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x01bb
            boolean r8 = r2.l()
            if (r8 != 0) goto L_0x01a1
            goto L_0x01bb
        L_0x01a1:
            r2.L()
            r3 = r52
            r10 = r53
            r4 = r54
            r5 = r55
            r6 = r56
            r8 = r58
            r9 = r59
            r12 = r61
            r13 = r62
            r7 = r11
            r11 = r60
            goto L_0x03ad
        L_0x01bb:
            r2.G()
            r8 = r14 & 1
            if (r8 == 0) goto L_0x01ec
            boolean r8 = r2.O()
            if (r8 == 0) goto L_0x01c9
            goto L_0x01ec
        L_0x01c9:
            r2.L()
            r0 = r13 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01d4
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r0
        L_0x01d4:
            r6 = r52
            r10 = r53
            r0 = r54
            r4 = r56
            r12 = r59
            r5 = r60
            r9 = r61
            r13 = r62
            r14 = r3
            r8 = r11
            r3 = r55
            r11 = r58
            goto L_0x026f
        L_0x01ec:
            if (r6 == 0) goto L_0x01f1
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            goto L_0x01f3
        L_0x01f1:
            r6 = r52
        L_0x01f3:
            r8 = 0
            if (r10 == 0) goto L_0x01f8
            r10 = r8
            goto L_0x01fa
        L_0x01f8:
            r10 = r53
        L_0x01fa:
            if (r16 == 0) goto L_0x01ff
            wK.r4$d r16 = wK.C18466r4.d.f151502b
            goto L_0x0201
        L_0x01ff:
            r16 = r54
        L_0x0201:
            if (r18 == 0) goto L_0x0206
            wK.q4$g r17 = wK.C18454q4.g.f151433b
            goto L_0x0208
        L_0x0206:
            r17 = r55
        L_0x0208:
            if (r20 == 0) goto L_0x020d
            r18 = r8
            goto L_0x020f
        L_0x020d:
            r18 = r56
        L_0x020f:
            if (r22 == 0) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r8 = r11
        L_0x0213:
            if (r12 == 0) goto L_0x0218
            wK.G4 r11 = wK.G4.Medium
            goto L_0x021a
        L_0x0218:
            r11 = r58
        L_0x021a:
            r12 = r13 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x022a
            tK.u r12 = tK.C18029u.f147649a
            float r12 = r12.d()
            r19 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r19
            goto L_0x022c
        L_0x022a:
            r12 = r59
        L_0x022c:
            if (r0 == 0) goto L_0x0231
            wK.H4 r0 = wK.H4.Regular
            goto L_0x0233
        L_0x0231:
            r0 = r60
        L_0x0233:
            if (r4 == 0) goto L_0x0237
            r4 = 1
            goto L_0x0239
        L_0x0237:
            r4 = r61
        L_0x0239:
            if (r5 == 0) goto L_0x0264
            r5 = -794257810(0xffffffffd0a8966e, float:-2.26274468E10)
            r2.W(r5)
            java.lang.Object r5 = r2.D()
            U0.m$a r19 = U0.C4889m.f14007a
            java.lang.Object r9 = r19.a()
            if (r5 != r9) goto L_0x0254
            r0.m r5 = r0.l.a()
            r2.u(r5)
        L_0x0254:
            r0.m r5 = (r0.m) r5
            r2.P()
            r14 = r3
            r9 = r4
            r13 = r5
            r3 = r17
            r4 = r18
            r5 = r0
            r0 = r16
            goto L_0x026f
        L_0x0264:
            r13 = r62
            r5 = r0
            r14 = r3
            r9 = r4
            r0 = r16
            r3 = r17
            r4 = r18
        L_0x026f:
            r2.y()
            boolean r16 = U0.C4895p.J()
            if (r16 == 0) goto L_0x0283
            java.lang.String r15 = "net.ikea.skapa.ui.components.ListViewItem (ListViewItem.kt:145)"
            r58 = r12
            r12 = -1793065631(0xffffffff951ffd61, float:-3.2309675E-26)
            U0.C4895p.S(r12, r14, r7, r15)
            goto L_0x0285
        L_0x0283:
            r58 = r12
        L_0x0285:
            wK.D4 r12 = wK.D4.f149397a
            r15 = r7 & 14
            r15 = r15 | 384(0x180, float:5.38E-43)
            int r16 = r14 >> 24
            r16 = r16 & 112(0x70, float:1.57E-43)
            r15 = r15 | r16
            wK.p4 r15 = r12.k(r9, r5, r2, r15)
            int r16 = r7 >> 3
            r59 = r5
            r5 = r16 & 14
            U0.A1 r16 = r0.i.a(r13, r2, r5)
            U0.A1 r17 = r0.p.a(r13, r2, r5)
            U0.A1 r5 = r0.C5814f.a(r13, r2, r5)
            boolean r18 = r12.h(r3)
            if (r18 == 0) goto L_0x0303
            boolean r18 = B(r16)
            if (r18 != 0) goto L_0x02bf
            boolean r17 = C(r17)
            if (r17 != 0) goto L_0x02bf
            boolean r5 = D(r5)
            if (r5 == 0) goto L_0x0303
        L_0x02bf:
            N1.Y r17 = r15.b()
            Y1.k$a r5 = Y1.k.f14792b
            Y1.k r34 = r5.d()
            r47 = 16773119(0xffefff, float:2.3504146E-38)
            r48 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            N1.Y r5 = N1.Y.c(r17, r18, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48)
        L_0x0300:
            r60 = r8
            goto L_0x0308
        L_0x0303:
            N1.Y r5 = r15.b()
            goto L_0x0300
        L_0x0308:
            wK.C4$c r8 = new wK.C4$c
            r8.<init>(r1, r5)
            r5 = -1980578018(0xffffffff89f2c71e, float:-5.844663E-33)
            r1 = 54
            r17 = r7
            r7 = 1
            c1.a r5 = c1.c.e(r5, r7, r8, r2, r1)
            r52 = r12
            r53 = r6
            r54 = r63
            r55 = r3
            r56 = r13
            r57 = r9
            androidx.compose.ui.d r7 = r52.c(r53, r54, r55, r56, r57)
            boolean r8 = B(r16)
            r53 = r7
            r56 = r8
            androidx.compose.ui.d r7 = r52.g(r53, r54, r55, r56, r57)
            wK.C4$d r8 = new wK.C4$d
            r8.<init>(r10, r15)
            r12 = -2132255140(0xffffffff80e85e5c, float:-2.1339685E-38)
            r61 = r6
            r6 = 1
            c1.a r18 = c1.c.e(r12, r6, r8, r2, r1)
            wK.C4$e r8 = new wK.C4$e
            r8.<init>(r0, r11, r9)
            r12 = 969305939(0x39c66f53, float:3.7848446E-4)
            c1.a r19 = c1.c.e(r12, r6, r8, r2, r1)
            wK.C4$f r8 = new wK.C4$f
            r52 = r8
            r53 = r4
            r54 = r3
            r55 = r15
            r56 = r9
            r57 = r13
            r52.<init>(r53, r54, r55, r56, r57)
            r12 = 893467378(0x35413af2, float:7.198388E-7)
            c1.a r20 = c1.c.e(r12, r6, r8, r2, r1)
            int r1 = r14 >> 3
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r1
            r6 = r6 | 28038(0x6d86, float:3.929E-41)
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r1
            r6 = r6 | r8
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r8
            r1 = r1 | r6
            int r6 = r17 << 24
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r8 = r8 & r6
            r1 = r1 | r8
            r8 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r8
            r27 = r1 | r6
            r28 = 0
            r16 = r5
            r17 = r7
            r21 = r60
            r22 = r11
            r23 = r58
            r24 = r9
            r25 = r13
            r26 = r2
            p(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x03a0
            U0.C4895p.R()
        L_0x03a0:
            r7 = r60
            r5 = r3
            r6 = r4
            r12 = r9
            r8 = r11
            r9 = r58
            r11 = r59
            r3 = r61
            r4 = r0
        L_0x03ad:
            U0.Y0 r15 = r2.n()
            if (r15 == 0) goto L_0x03d3
            wK.u4 r14 = new wK.u4
            r0 = r14
            r1 = r51
            r2 = r3
            r3 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r63
            r49 = r14
            r14 = r65
            r50 = r15
            r15 = r66
            r16 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r49
            r0 = r50
            r0.a(r1)
        L_0x03d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C4.l(java.lang.String, androidx.compose.ui.d, java.lang.String, wK.r4, wK.q4, nI.p, nI.p, wK.G4, float, wK.H4, boolean, r0.m, nI.a, U0.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: r0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, androidx.compose.ui.d r30, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r31, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r32, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r33, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r34, wK.G4 r35, float r36, boolean r37, r0.m r38, nI.C17631a<XH.C16807N> r39, U0.C4889m r40, int r41, int r42, int r43) {
        /*
            r13 = r29
            r14 = r39
            r15 = r41
            r12 = r43
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -447950933(0xffffffffe54ccfab, float:-6.0449598E22)
            r1 = r40
            U0.m r11 = r1.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001d
            r1 = r15 | 6
            goto L_0x002d
        L_0x001d:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002c
            boolean r1 = r11.F(r13)
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r15
            goto L_0x002d
        L_0x002c:
            r1 = r15
        L_0x002d:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x0036
            r1 = r1 | 48
        L_0x0033:
            r5 = r30
            goto L_0x0048
        L_0x0036:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r30
            boolean r6 = r11.V(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r1 = r1 | r6
        L_0x0048:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r7 = r31
            goto L_0x0063
        L_0x0051:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004e
            r7 = r31
            boolean r8 = r11.F(r7)
            if (r8 == 0) goto L_0x0060
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r8
        L_0x0063:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r9 = r32
            goto L_0x007e
        L_0x006c:
            r9 = r15 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0069
            r9 = r32
            boolean r10 = r11.F(r9)
            if (r10 == 0) goto L_0x007b
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r10
        L_0x007e:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0084:
            r2 = r33
            goto L_0x009a
        L_0x0087:
            r2 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0084
            r2 = r33
            boolean r16 = r11.F(r2)
            if (r16 == 0) goto L_0x0096
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r16
        L_0x009a:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r1 = r1 | r17
            r0 = r34
            goto L_0x00b8
        L_0x00a5:
            r17 = r15 & r17
            r0 = r34
            if (r17 != 0) goto L_0x00b8
            boolean r18 = r11.F(r0)
            if (r18 == 0) goto L_0x00b4
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r1 = r1 | r18
        L_0x00b8:
            r18 = r12 & 64
            r19 = 1572864(0x180000, float:2.204052E-39)
            if (r18 == 0) goto L_0x00c3
            r1 = r1 | r19
            r3 = r35
            goto L_0x00d6
        L_0x00c3:
            r19 = r15 & r19
            r3 = r35
            if (r19 != 0) goto L_0x00d6
            boolean r20 = r11.V(r3)
            if (r20 == 0) goto L_0x00d2
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d4
        L_0x00d2:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00d4:
            r1 = r1 | r20
        L_0x00d6:
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r15 & r20
            if (r20 != 0) goto L_0x00f2
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00eb
            r0 = r36
            boolean r20 = r11.c(r0)
            if (r20 == 0) goto L_0x00ed
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ef
        L_0x00eb:
            r0 = r36
        L_0x00ed:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ef:
            r1 = r1 | r20
            goto L_0x00f4
        L_0x00f2:
            r0 = r36
        L_0x00f4:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00ff
            r1 = r1 | r20
            r2 = r37
            goto L_0x0112
        L_0x00ff:
            r20 = r15 & r20
            r2 = r37
            if (r20 != 0) goto L_0x0112
            boolean r20 = r11.b(r2)
            if (r20 == 0) goto L_0x010e
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0110
        L_0x010e:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0110:
            r1 = r1 | r20
        L_0x0112:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r20 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x011d
            r1 = r1 | r20
            r3 = r38
            goto L_0x0130
        L_0x011d:
            r20 = r15 & r20
            r3 = r38
            if (r20 != 0) goto L_0x0130
            boolean r20 = r11.V(r3)
            if (r20 == 0) goto L_0x012c
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012e
        L_0x012c:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012e:
            r1 = r1 | r20
        L_0x0130:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0137
            r3 = r42 | 6
            goto L_0x0149
        L_0x0137:
            r3 = r42 & 6
            if (r3 != 0) goto L_0x0147
            boolean r3 = r11.F(r14)
            if (r3 == 0) goto L_0x0143
            r3 = 4
            goto L_0x0144
        L_0x0143:
            r3 = 2
        L_0x0144:
            r3 = r42 | r3
            goto L_0x0149
        L_0x0147:
            r3 = r42
        L_0x0149:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r1 & r20
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x0177
            r5 = r3 & 3
            r7 = 2
            if (r5 != r7) goto L_0x0177
            boolean r5 = r11.l()
            if (r5 != 0) goto L_0x015f
            goto L_0x0177
        L_0x015f:
            r11.L()
            r2 = r30
            r3 = r31
            r5 = r33
            r6 = r34
            r7 = r35
            r8 = r36
            r10 = r38
            r4 = r9
            r27 = r11
            r9 = r37
            goto L_0x028d
        L_0x0177:
            r11.G()
            r5 = r15 & 1
            r7 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r5 == 0) goto L_0x01a4
            boolean r5 = r11.O()
            if (r5 == 0) goto L_0x0188
            goto L_0x01a4
        L_0x0188:
            r11.L()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0190
            r1 = r1 & r7
        L_0x0190:
            r10 = r30
            r16 = r31
            r19 = r33
            r20 = r34
            r21 = r35
            r22 = r36
            r8 = r38
            r18 = r9
            r9 = r37
            goto L_0x0226
        L_0x01a4:
            if (r4 == 0) goto L_0x01a9
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01ab
        L_0x01a9:
            r4 = r30
        L_0x01ab:
            r5 = 0
            if (r6 == 0) goto L_0x01b0
            r6 = r5
            goto L_0x01b2
        L_0x01b0:
            r6 = r31
        L_0x01b2:
            if (r8 == 0) goto L_0x01b5
            r9 = r5
        L_0x01b5:
            if (r10 == 0) goto L_0x01b9
            r8 = r5
            goto L_0x01bb
        L_0x01b9:
            r8 = r33
        L_0x01bb:
            if (r16 == 0) goto L_0x01be
            goto L_0x01c0
        L_0x01be:
            r5 = r34
        L_0x01c0:
            if (r18 == 0) goto L_0x01c5
            wK.G4 r10 = wK.G4.Medium
            goto L_0x01c7
        L_0x01c5:
            r10 = r35
        L_0x01c7:
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x01d7
            tK.u r7 = tK.C18029u.f147649a
            float r7 = r7.d()
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r16
            goto L_0x01d9
        L_0x01d7:
            r7 = r36
        L_0x01d9:
            if (r0 == 0) goto L_0x01dd
            r0 = 1
            goto L_0x01df
        L_0x01dd:
            r0 = r37
        L_0x01df:
            if (r2 == 0) goto L_0x0213
            r2 = -794142866(0xffffffffd0aa576e, float:-2.28628521E10)
            r11.W(r2)
            java.lang.Object r2 = r11.D()
            U0.m$a r16 = U0.C4889m.f14007a
            r30 = r0
            java.lang.Object r0 = r16.a()
            if (r2 != r0) goto L_0x01fc
            r0.m r2 = r0.l.a()
            r11.u(r2)
        L_0x01fc:
            r0 = r2
            r0.m r0 = (r0.m) r0
            r11.P()
            r20 = r5
            r16 = r6
            r22 = r7
            r19 = r8
            r18 = r9
            r21 = r10
            r9 = r30
            r8 = r0
        L_0x0211:
            r10 = r4
            goto L_0x0226
        L_0x0213:
            r30 = r0
            r20 = r5
            r16 = r6
            r22 = r7
            r19 = r8
            r18 = r9
            r21 = r10
            r9 = r30
            r8 = r38
            goto L_0x0211
        L_0x0226:
            r11.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0237
            java.lang.String r0 = "net.ikea.skapa.ui.components.ListViewItem (ListViewItem.kt:217)"
            r2 = -447950933(0xffffffffe54ccfab, float:-6.0449598E22)
            U0.C4895p.S(r2, r1, r3, r0)
        L_0x0237:
            wK.C4$a r0 = new wK.C4$a
            r0.<init>(r8, r9)
            int r2 = r1 >> 3
            r2 = r2 & 14
            int r3 = r3 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            androidx.compose.ui.d r2 = vK.C18205e.g(r10, r14, r0, r11, r2)
            r0 = 2147483534(0x7fffff8e, float:NaN)
            r17 = r1 & r0
            r23 = 0
            r0 = r29
            r1 = r2
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r24 = r8
            r8 = r9
            r25 = r9
            r9 = r24
            r26 = r10
            r10 = r11
            r27 = r11
            r11 = r17
            r12 = r23
            p(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x027b
            U0.C4895p.R()
        L_0x027b:
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r10 = r24
            r9 = r25
            r2 = r26
        L_0x028d:
            U0.Y0 r12 = r27.n()
            if (r12 == 0) goto L_0x02ad
            wK.s4 r11 = new wK.s4
            r0 = r11
            r1 = r29
            r13 = r11
            r11 = r39
            r14 = r12
            r12 = r41
            r15 = r13
            r13 = r42
            r28 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r28
            r0.a(r15)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C4.m(nI.p, androidx.compose.ui.d, nI.p, nI.q, nI.q, nI.p, wK.G4, float, boolean, r0.m, nI.a, U0.m, int, int, int):void");
    }

    private static final void n(C5842M m10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, p<? super C4889m, ? super Integer, C16807N> pVar3, G4 g42, C4889m mVar, int i10) {
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar5 = pVar2;
        p<? super C4889m, ? super Integer, C16807N> pVar6 = pVar3;
        G4 g43 = g42;
        int i12 = i10;
        C4889m k10 = mVar.k(-596608646);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(m10) ? 4 : 2) | i12;
        } else {
            C5842M m11 = m10;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(g43) ? 16384 : 8192;
        }
        int i13 = i11;
        if ((i13 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-596608646, i13, -1, "net.ikea.skapa.ui.components.ListViewItemContent (ListViewItem.kt:276)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d e10 = C5842M.e(m10, aVar, 1.0f, false, 2, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, e10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            pVar4.invoke(k10, Integer.valueOf((i13 >> 3) & 14));
            k10.W(-775632056);
            if (g43 != G4.Small) {
                k10.W(-775630247);
                if (pVar5 != null) {
                    pVar5.invoke(k10, Integer.valueOf((i13 >> 6) & 14));
                }
                k10.P();
                if (pVar6 != null) {
                    C5844O.a(J.i(aVar, C18029u.f147649a.f()), k10, 0);
                    pVar6.invoke(k10, Integer.valueOf((i13 >> 9) & 14));
                }
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new B4(m10, pVar, pVar2, pVar3, g42, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C5842M m10, p pVar, p pVar2, p pVar3, G4 g42, int i10, C4889m mVar, int i11) {
        n(m10, pVar, pVar2, pVar3, g42, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, androidx.compose.ui.d r25, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r26, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r27, nI.q<? super s0.C5842M, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r28, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r29, wK.G4 r30, float r31, boolean r32, r0.m r33, U0.C4889m r34, int r35, int r36) {
        /*
            r11 = r35
            r12 = r36
            r0 = -1780563593(0xffffffff95dec177, float:-8.997032E-26)
            r1 = r34
            U0.m r1 = r1.k(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            r4 = r2
            r2 = r24
            goto L_0x002b
        L_0x0017:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r24
            boolean r4 = r1.F(r2)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r11
            goto L_0x002b
        L_0x0028:
            r2 = r24
            r4 = r11
        L_0x002b:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r25
            goto L_0x0046
        L_0x0034:
            r6 = r11 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r25
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x004f
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r26
            goto L_0x0061
        L_0x004f:
            r8 = r11 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004c
            r8 = r26
            boolean r9 = r1.F(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r4 = r4 | r9
        L_0x0061:
            r9 = r12 & 8
            if (r9 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r27
            goto L_0x007c
        L_0x006a:
            r10 = r11 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0067
            r10 = r27
            boolean r13 = r1.F(r10)
            if (r13 == 0) goto L_0x0079
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r13
        L_0x007c:
            r13 = r12 & 16
            if (r13 == 0) goto L_0x0085
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r28
            goto L_0x0097
        L_0x0085:
            r14 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0082
            r14 = r28
            boolean r15 = r1.F(r14)
            if (r15 == 0) goto L_0x0094
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r4 = r4 | r15
        L_0x0097:
            r15 = r12 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r15 == 0) goto L_0x00a2
            r4 = r4 | r16
            r3 = r29
            goto L_0x00b5
        L_0x00a2:
            r16 = r11 & r16
            r3 = r29
            if (r16 != 0) goto L_0x00b5
            boolean r16 = r1.F(r3)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r4 = r4 | r16
        L_0x00b5:
            r16 = r12 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00c0
            r4 = r4 | r17
            r0 = r30
            goto L_0x00d3
        L_0x00c0:
            r17 = r11 & r17
            r0 = r30
            if (r17 != 0) goto L_0x00d3
            boolean r18 = r1.V(r0)
            if (r18 == 0) goto L_0x00cf
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r4 = r4 | r18
        L_0x00d3:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = r11 & r18
            if (r18 != 0) goto L_0x00ef
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00e8
            r0 = r31
            boolean r18 = r1.c(r0)
            if (r18 == 0) goto L_0x00ea
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00e8:
            r0 = r31
        L_0x00ea:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r4 = r4 | r18
            goto L_0x00f1
        L_0x00ef:
            r0 = r31
        L_0x00f1:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r18 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x00fc
            r4 = r4 | r18
            r2 = r32
            goto L_0x010f
        L_0x00fc:
            r18 = r11 & r18
            r2 = r32
            if (r18 != 0) goto L_0x010f
            boolean r18 = r1.b(r2)
            if (r18 == 0) goto L_0x010b
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010d
        L_0x010b:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010d:
            r4 = r4 | r18
        L_0x010f:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r18 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x011a
            r4 = r4 | r18
            r3 = r33
            goto L_0x012d
        L_0x011a:
            r18 = r11 & r18
            r3 = r33
            if (r18 != 0) goto L_0x012d
            boolean r18 = r1.V(r3)
            if (r18 == 0) goto L_0x0129
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012b
        L_0x0129:
            r18 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012b:
            r4 = r4 | r18
        L_0x012d:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r4 & r18
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r6) goto L_0x0152
            boolean r3 = r1.l()
            if (r3 != 0) goto L_0x013e
            goto L_0x0152
        L_0x013e:
            r1.L()
            r2 = r25
            r6 = r29
            r7 = r30
            r9 = r32
            r3 = r8
            r4 = r10
            r5 = r14
            r8 = r31
            r10 = r33
            goto L_0x033c
        L_0x0152:
            r1.G()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0178
            boolean r3 = r1.O()
            if (r3 == 0) goto L_0x0160
            goto L_0x0178
        L_0x0160:
            r1.L()
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016b
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r0
        L_0x016b:
            r3 = r25
            r5 = r29
            r7 = r30
            r9 = r31
            r0 = r32
        L_0x0175:
            r2 = r33
            goto L_0x01cc
        L_0x0178:
            if (r5 == 0) goto L_0x017d
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x017f
        L_0x017d:
            r3 = r25
        L_0x017f:
            if (r7 == 0) goto L_0x0182
            r8 = 0
        L_0x0182:
            if (r9 == 0) goto L_0x0185
            r10 = 0
        L_0x0185:
            if (r13 == 0) goto L_0x0188
            r14 = 0
        L_0x0188:
            if (r15 == 0) goto L_0x018c
            r5 = 0
            goto L_0x018e
        L_0x018c:
            r5 = r29
        L_0x018e:
            if (r16 == 0) goto L_0x0193
            wK.G4 r7 = wK.G4.Medium
            goto L_0x0195
        L_0x0193:
            r7 = r30
        L_0x0195:
            r9 = r12 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01a4
            tK.u r9 = tK.C18029u.f147649a
            float r9 = r9.d()
            r13 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r4 = r4 & r13
            goto L_0x01a6
        L_0x01a4:
            r9 = r31
        L_0x01a6:
            if (r0 == 0) goto L_0x01aa
            r0 = 1
            goto L_0x01ac
        L_0x01aa:
            r0 = r32
        L_0x01ac:
            if (r2 == 0) goto L_0x0175
            r2 = 1976430510(0x75cdefae, float:5.221104E32)
            r1.W(r2)
            java.lang.Object r2 = r1.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r2 != r13) goto L_0x01c7
            r0.m r2 = r0.l.a()
            r1.u(r2)
        L_0x01c7:
            r0.m r2 = (r0.m) r2
            r1.P()
        L_0x01cc:
            r1.y()
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x01de
            r13 = -1
            java.lang.String r15 = "net.ikea.skapa.ui.components.ListViewItemImpl (ListViewItem.kt:250)"
            r6 = -1780563593(0xffffffff95dec177, float:-8.997032E-26)
            U0.C4895p.S(r6, r4, r13, r15)
        L_0x01de:
            wK.D4 r6 = wK.D4.f149397a
            float r13 = r6.j(r7)
            c2.h r13 = c2.h.m(r13)
            r15 = 0
            U0.A1 r13 = U0.p1.q(r13, r1, r15)
            float r17 = r6.i(r7)
            c2.h r11 = c2.h.m(r17)
            U0.A1 r11 = U0.p1.q(r11, r1, r15)
            int r17 = r4 >> 27
            r15 = r17 & 14
            U0.A1 r15 = r0.C5814f.a(r2, r1, r15)
            float r6 = r6.f()
            int r6 = c2.h.v(r9, r6)
            r17 = r2
            if (r6 < 0) goto L_0x020f
            r6 = 1
            goto L_0x0210
        L_0x020f:
            r6 = 0
        L_0x0210:
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            tK.u r19 = tK.C18029u.f147649a
            float r12 = r19.a()
            androidx.compose.foundation.layout.d$f r2 = r2.n(r12)
            i1.c$a r12 = i1.C5437c.f24302a
            i1.c$c r12 = r12.i()
            r19 = 44
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r3
            r26 = r15
            r27 = r0
            r28 = r21
            r29 = r22
            r30 = r6
            r31 = r23
            r32 = r19
            r33 = r20
            androidx.compose.ui.d r6 = zK.C18756a.d(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r15 = 0
            r32 = r0
            r33 = r3
            r0 = 0
            r3 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r6, r15, r3, r0)
            float r6 = q(r13)
            r13 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.n(r3, r6, r15, r13, r0)
            float r3 = r(r11)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.j(r0, r9, r3)
            r3 = 48
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r12, r1, r3)
            r3 = 0
            int r3 = U0.C4883j.a(r1, r3)
            U0.y r6 = r1.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r1, r0)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r13 = r1.m()
            if (r13 != 0) goto L_0x0280
            U0.C4883j.c()
        L_0x0280:
            r1.I()
            boolean r13 = r1.i()
            if (r13 == 0) goto L_0x028d
            r1.p(r12)
            goto L_0x0290
        L_0x028d:
            r1.t()
        L_0x0290:
            U0.m r12 = U0.F1.a(r1)
            nI.p r13 = r11.c()
            U0.F1.c(r12, r2, r13)
            nI.p r2 = r11.e()
            U0.F1.c(r12, r6, r2)
            nI.p r2 = r11.b()
            boolean r6 = r12.i()
            if (r6 != 0) goto L_0x02ba
            java.lang.Object r6 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r13)
            if (r6 != 0) goto L_0x02c8
        L_0x02ba:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r12.u(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.w(r3, r2)
        L_0x02c8:
            nI.p r2 = r11.d()
            U0.F1.c(r12, r0, r2)
            s0.N r0 = s0.C5843N.f28726a
            r2 = 1427179058(0x55110632, float:9.9659872E12)
            r1.W(r2)
            r2 = 6
            if (r10 != 0) goto L_0x02db
            goto L_0x02e7
        L_0x02db:
            int r3 = r4 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.invoke(r0, r1, r3)
        L_0x02e7:
            r1.P()
            int r3 = r4 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r2
            r6 = r4 & 896(0x380, float:1.256E-42)
            r3 = r3 | r6
            int r6 = r4 >> 6
            r11 = r6 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            r3 = r3 | r6
            r25 = r0
            r26 = r24
            r27 = r8
            r28 = r5
            r29 = r7
            r30 = r1
            r31 = r3
            n(r25, r26, r27, r28, r29, r30, r31)
            r3 = 1427182034(0x551111d2, float:9.9691077E12)
            r1.W(r3)
            if (r14 != 0) goto L_0x0316
            goto L_0x0322
        L_0x0316:
            int r3 = r4 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.invoke(r0, r1, r2)
        L_0x0322:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0331
            U0.C4895p.R()
        L_0x0331:
            r2 = r33
            r6 = r5
            r3 = r8
            r8 = r9
            r4 = r10
            r5 = r14
            r10 = r17
            r9 = r32
        L_0x033c:
            U0.Y0 r13 = r1.n()
            if (r13 == 0) goto L_0x0351
            wK.v4 r14 = new wK.v4
            r0 = r14
            r1 = r24
            r11 = r35
            r12 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0351:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C4.p(nI.p, androidx.compose.ui.d, nI.p, nI.q, nI.q, nI.p, wK.G4, float, boolean, r0.m, U0.m, int, int):void");
    }

    private static final float q(A1<h> a12) {
        return a12.getValue().G();
    }

    private static final float r(A1<h> a12) {
        return a12.getValue().G();
    }

    /* access modifiers changed from: private */
    public static final C16807N s(p pVar, androidx.compose.ui.d dVar, p pVar2, q qVar, q qVar2, p pVar3, G4 g42, float f10, boolean z10, m mVar, int i10, int i11, C4889m mVar2, int i12) {
        p(pVar, dVar, pVar2, qVar, qVar2, pVar3, g42, f10, z10, mVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void t(C5842M m10, C18466r4 r4Var, G4 g42, boolean z10, C4889m mVar, int i10) {
        int i11;
        C5842M m11 = m10;
        C18466r4 r4Var2 = r4Var;
        G4 g43 = g42;
        int i12 = i10;
        C17542s.j(m11, "<this>");
        C17542s.j(r4Var2, "leadingImage");
        C17542s.j(g43, "size");
        C4889m k10 = mVar.k(354720327);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(m11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(r4Var2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(g43) ? 256 : 128;
        }
        boolean z11 = z10;
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(354720327, i11, -1, "net.ikea.skapa.ui.components.ListViewItemLeading (ListViewItem.kt:291)");
            }
            boolean z12 = r4Var2 instanceof C18466r4.c;
            if (!z12 || g43 != G4.Small) {
                if (r4Var2 instanceof C18466r4.b) {
                    k10.W(498342367);
                    C18466r4.b bVar = (C18466r4.b) r4Var2;
                    C5942c c10 = J1.e.c(bVar.c(), k10, 0);
                    String b10 = bVar.b();
                    C5747v0 d10 = bVar.d();
                    long y10 = d10 != null ? d10.y() : C5747v0.f27350b.i();
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    D4 d42 = D4.f149397a;
                    V.a(c10, b10, m11.c(J.p(aVar, d42.d(), d42.d()), bVar.a()), y10, k10, 0, 0);
                    k10.P();
                } else if (r4Var2 instanceof C18466r4.e) {
                    k10.W(-1230836692);
                    C18466r4.e eVar = (C18466r4.e) r4Var2;
                    C18264a6.b(eVar.b(), eVar.a(), (androidx.compose.ui.d) null, g43 == G4.Small ? C18300d6.Small : C18300d6.Medium, k10, 0, 4);
                    k10.P();
                } else if (z12) {
                    k10.W(499049198);
                    C18466r4.c cVar = (C18466r4.c) r4Var2;
                    C5942c b11 = cVar.b();
                    String a10 = cVar.a();
                    d.a aVar2 = androidx.compose.ui.d.f18749a;
                    D4 d43 = D4.f149397a;
                    C5583F.a(b11, a10, m11.c(J.p(aVar2, d43.e(), d43.e()), C5437c.f24302a.i()), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, 0, 120);
                    k10.P();
                } else if (r4Var2 instanceof C18466r4.a) {
                    k10.W(499395282);
                    C18466r4.a aVar3 = (C18466r4.a) r4Var2;
                    C18232A.f(aVar3.b(), (String) null, (androidx.compose.ui.d) null, aVar3.a(), false, D4.f149397a.b(g43), z10, (m) null, (C17631a<C16807N>) null, k10, ((i11 << 9) & 3670016) | 24624, 388);
                    k10.P();
                } else if (C17542s.e(r4Var2, C18466r4.d.f151502b)) {
                    k10.W(-1230805853);
                    k10.P();
                } else {
                    k10.W(-1230851231);
                    k10.P();
                    throw new t();
                }
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("Images are only supported in Medium and Large list view items");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18526w4(m10, r4Var, g42, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C5842M m10, C18466r4 r4Var, G4 g42, boolean z10, int i10, C4889m mVar, int i11) {
        t(m10, r4Var, g42, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void v(C18454q4 q4Var, long j10, boolean z10, m mVar, C4889m mVar2, int i10) {
        int i11;
        C18454q4 q4Var2 = q4Var;
        int i12 = i10;
        C4889m k10 = mVar2.k(1406369491);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(q4Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.e(j10) ? 32 : 16;
        } else {
            long j11 = j10;
        }
        boolean z11 = z10;
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        m mVar3 = mVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(mVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1406369491, i11, -1, "net.ikea.skapa.ui.components.ListViewItemTrailing (ListViewItem.kt:339)");
            }
            if (q4Var2 instanceof C18454q4.b) {
                k10.W(757093928);
                boolean a10 = ((C18454q4.b) q4Var2).a();
                C18451q1 q1Var = C18451q1.Subtle;
                d.a aVar = androidx.compose.ui.d.f18749a;
                k10.W(1409903942);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C18538x4();
                    k10.u(D10);
                }
                k10.P();
                C18415n1.p(a10, o.a(aVar, (C17642l) D10), z10, q1Var, mVar, (C17642l<? super Boolean, C16807N>) null, k10, ((i11 << 3) & 57344) | 199680 | (i11 & 896), 0);
                k10.P();
            } else if (q4Var2 instanceof C18454q4.h) {
                k10.W(757420978);
                boolean a11 = ((C18454q4.h) q4Var2).a();
                C18386k8 k8Var = C18386k8.Subtle;
                d.a aVar2 = androidx.compose.ui.d.f18749a;
                k10.W(1409916166);
                Object D11 = k10.D();
                if (D11 == C4889m.f14007a.a()) {
                    D11 = new C18549y4();
                    k10.u(D11);
                }
                k10.P();
                C18350h8.D(a11, o.a(aVar2, (C17642l) D11), z10, k8Var, mVar, (C17631a<C16807N>) null, k10, 199680 | (i11 & 896) | ((i11 << 3) & 57344), 0);
                k10.P();
            } else if (q4Var2 instanceof C18454q4.i) {
                k10.W(757793164);
                boolean a12 = ((C18454q4.i) q4Var2).a();
                C18352ha haVar = C18352ha.Subtle;
                d.a aVar3 = androidx.compose.ui.d.f18749a;
                k10.W(1409926374);
                Object D12 = k10.D();
                if (D12 == C4889m.f14007a.a()) {
                    D12 = new C18560z4();
                    k10.u(D12);
                }
                k10.P();
                C18328fa.n(a12, o.a(aVar3, (C17642l) D12), z10, haVar, mVar, (C17642l<? super Boolean, C16807N>) null, k10, 199680 | (i11 & 896) | ((i11 << 3) & 57344), 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.a.f151427b)) {
                k10.W(1409928276);
                V.a(J1.e.c(C17950a.f147170s, k10, 0), (String) null, J.o(androidx.compose.ui.d.f18749a, D4.f149397a.d()), j10, k10, ((i11 << 6) & 7168) | 432, 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.c.f151429b)) {
                k10.W(1409936310);
                V.a(J1.e.c(C17950a.f147171t, k10, 0), (String) null, J.o(androidx.compose.ui.d.f18749a, D4.f149397a.d()), j10, k10, ((i11 << 6) & 7168) | 432, 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.d.f151430b)) {
                k10.W(1409944572);
                V.a(J1.e.c(C17950a.f147172u, k10, 0), (String) null, J.o(androidx.compose.ui.d.f18749a, D4.f149397a.d()), j10, k10, ((i11 << 6) & 7168) | 432, 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.f.f151432b)) {
                k10.W(1409952855);
                V.a(J1.e.c(C17950a.f147174w, k10, 0), (String) null, J.o(androidx.compose.ui.d.f18749a, D4.f149397a.d()), j10, k10, ((i11 << 6) & 7168) | 432, 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.e.f151431b)) {
                k10.W(1409960883);
                V.a(J1.e.c(C17950a.f147173v, k10, 0), (String) null, J.o(androidx.compose.ui.d.f18749a, D4.f149397a.d()), j10, k10, ((i11 << 6) & 7168) | 432, 0);
                k10.P();
            } else if (C17542s.e(q4Var2, C18454q4.g.f151433b)) {
                k10.W(1409968583);
                k10.P();
            } else {
                k10.W(1409895832);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new A4(q4Var, j10, z10, mVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C18454q4 q4Var, long j10, boolean z10, m mVar, int i10, C4889m mVar2, int i11) {
        v(q4Var, j10, z10, mVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
