package wK;

import L1.i;
import N1.E;
import N1.Y;
import O0.C4756u0;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import XH.C16807N;
import XH.t;
import Y1.k;
import Y1.o;
import Y1.s;
import YH.C16877v;
import androidx.compose.foundation.selection.c;
import androidx.compose.ui.d;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5584G;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p1.g1;
import r0.m;
import r1.g;
import tK.C18017h;
import tK.C18029u;
import tK.C18030v;
import wK.C18454q4;
import zK.C18756a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010 \u001a\u00020\u0019*\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J9\u0010#\u001a\u00020\u0019*\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010'\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010%R\u0014\u0010)\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010/R\u0017\u00101\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b(\u0010/R\u0017\u00102\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b+\u0010/¨\u00063"}, d2 = {"LwK/D4;", "", "<init>", "()V", "LwK/q4;", "control", "", "h", "(LwK/q4;)Z", "a", "enabled", "LwK/H4;", "variant", "LwK/p4;", "k", "(ZLwK/H4;LU0/m;I)LwK/p4;", "LwK/G4;", "size", "Lc2/h;", "j", "(LwK/G4;)F", "i", "LwK/C;", "b", "(LwK/G4;)LwK/C;", "Landroidx/compose/ui/d;", "Lkotlin/Function0;", "LXH/N;", "onClick", "trailingControl", "Lr0/m;", "interactionSource", "c", "(Landroidx/compose/ui/d;LnI/a;LwK/q4;Lr0/m;Z)Landroidx/compose/ui/d;", "hover", "g", "(Landroidx/compose/ui/d;LnI/a;LwK/q4;ZZ)Landroidx/compose/ui/d;", "F", "SmallMinHeight", "MediumMinHeight", "d", "LargeMinHeight", "", "e", "Ljava/util/List;", "NavigationalControls", "f", "()F", "keyboardBorderSize", "IconSize", "ImageSize", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class D4 {

    /* renamed from: a  reason: collision with root package name */
    public static final D4 f149397a = new D4();

    /* renamed from: b  reason: collision with root package name */
    private static final float f149398b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f149399c = h.B((float) 72);

    /* renamed from: d  reason: collision with root package name */
    private static final float f149400d = h.B((float) 88);

    /* renamed from: e  reason: collision with root package name */
    private static final List<C18454q4> f149401e = C16877v.q(C18454q4.a.f151427b, C18454q4.c.f151429b, C18454q4.d.f151430b, C18454q4.f.f151432b);

    /* renamed from: f  reason: collision with root package name */
    private static final float f149402f = h.B((float) 6);

    /* renamed from: g  reason: collision with root package name */
    private static final float f149403g = h.B((float) 24);

    /* renamed from: h  reason: collision with root package name */
    private static final float f149404h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149405a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                wK.G4[] r0 = wK.G4.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.G4 r1 = wK.G4.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.G4 r1 = wK.G4.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.G4 r1 = wK.G4.Large     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f149405a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.D4.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<d, C4889m, Integer, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f149406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18454q4 f149407b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f149408c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f149409d;

        b(C17631a<C16807N> aVar, C18454q4 q4Var, m mVar, boolean z10) {
            this.f149406a = aVar;
            this.f149407b = q4Var;
            this.f149408c = mVar;
            this.f149409d = z10;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17631a aVar, boolean z10) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17631a aVar, boolean z10) {
            aVar.invoke();
            return C16807N.f139792a;
        }

        public final d c(d dVar, C4889m mVar, int i10) {
            d dVar2;
            C17542s.j(dVar, "$this$composed");
            mVar.W(466575177);
            if (C4895p.J()) {
                C4895p.S(466575177, i10, -1, "net.ikea.skapa.ui.components.ListViewItemProps.clickableModifier.<anonymous> (ListViewItem.kt:595)");
            }
            if (this.f149406a != null) {
                C18454q4 q4Var = this.f149407b;
                if (q4Var instanceof C18454q4.b) {
                    mVar.W(-1085699706);
                    boolean a10 = ((C18454q4.b) this.f149407b).a();
                    m mVar2 = this.f149408c;
                    boolean z10 = this.f149409d;
                    i h10 = i.h(i.f8936b.b());
                    mVar.W(-1085690304);
                    boolean V10 = mVar.V(this.f149406a);
                    C17631a<C16807N> aVar = this.f149406a;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new E4(aVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    dVar2 = c.a(dVar, a10, mVar2, (C5584G) null, z10, h10, (C17642l) D10);
                    mVar.P();
                } else if (q4Var instanceof C18454q4.h) {
                    mVar.W(-1085686239);
                    mVar.P();
                    dVar2 = androidx.compose.foundation.selection.a.a(dVar, ((C18454q4.h) this.f149407b).a(), this.f149408c, (C5584G) null, this.f149409d, i.h(i.f8936b.e()), this.f149406a);
                } else if (q4Var instanceof C18454q4.i) {
                    mVar.W(703851004);
                    boolean a11 = ((C18454q4.i) this.f149407b).a();
                    m mVar3 = this.f149408c;
                    boolean z11 = this.f149409d;
                    i h11 = i.h(i.f8936b.f());
                    mVar.W(-1085662112);
                    boolean V11 = mVar.V(this.f149406a);
                    C17631a<C16807N> aVar2 = this.f149406a;
                    Object D11 = mVar.D();
                    if (V11 || D11 == C4889m.f14007a.a()) {
                        D11 = new F4(aVar2);
                        mVar.u(D11);
                    }
                    mVar.P();
                    dVar2 = c.a(dVar, a11, mVar3, (C5584G) null, z11, h11, (C17642l) D11);
                    mVar.P();
                } else if ((q4Var instanceof C18454q4.a) || C17542s.e(q4Var, C18454q4.c.f151429b) || C17542s.e(q4Var, C18454q4.d.f151430b) || C17542s.e(q4Var, C18454q4.f.f151432b)) {
                    mVar.W(704468803);
                    mVar.P();
                    dVar2 = androidx.compose.foundation.d.b(dVar, this.f149408c, (C5584G) null, this.f149409d, (String) null, (i) null, this.f149406a, 24, (Object) null);
                } else {
                    mVar.W(704762528);
                    mVar.P();
                    d dVar3 = dVar;
                    dVar2 = androidx.compose.foundation.d.b(dVar3, this.f149408c, C4756u0.c(false, 0.0f, 0, 7, (Object) null), this.f149409d, (String) null, (i) null, this.f149406a, 24, (Object) null);
                }
            } else {
                dVar2 = dVar;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return dVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float f10 = (float) 48;
        f149398b = h.B(f10);
        f149404h = h.B(f10);
    }

    private D4() {
    }

    public final boolean a(C18454q4 q4Var) {
        C17542s.j(q4Var, "control");
        return (q4Var instanceof C18454q4.b) || (q4Var instanceof C18454q4.h) || (q4Var instanceof C18454q4.i);
    }

    public final C18234C b(G4 g42) {
        C17542s.j(g42, "size");
        int i10 = a.f149405a[g42.ordinal()];
        if (i10 == 1) {
            return C18234C.XSmall;
        }
        if (i10 == 2) {
            return C18234C.Small;
        }
        if (i10 == 3) {
            return C18234C.Medium;
        }
        throw new t();
    }

    public final d c(d dVar, C17631a<C16807N> aVar, C18454q4 q4Var, m mVar, boolean z10) {
        C17542s.j(dVar, "<this>");
        C17542s.j(q4Var, "trailingControl");
        C17542s.j(mVar, "interactionSource");
        return androidx.compose.ui.c.c(dVar, (C17642l) null, new b(aVar, q4Var, mVar, z10), 1, (Object) null);
    }

    public final float d() {
        return f149403g;
    }

    public final float e() {
        return f149404h;
    }

    public final float f() {
        return f149402f;
    }

    public final d g(d dVar, C17631a<C16807N> aVar, C18454q4 q4Var, boolean z10, boolean z11) {
        C17542s.j(dVar, "<this>");
        C17542s.j(q4Var, "trailingControl");
        return aVar != null ? (h(q4Var) || a(q4Var)) ? C18756a.i(dVar, z10, z11) : dVar : dVar;
    }

    public final boolean h(C18454q4 q4Var) {
        C17542s.j(q4Var, "control");
        return f149401e.contains(q4Var);
    }

    public final float i(G4 g42) {
        C17542s.j(g42, "size");
        int i10 = a.f149405a[g42.ordinal()];
        if (i10 == 1) {
            return C18029u.f147649a.j();
        }
        if (i10 == 2) {
            return C18029u.f147649a.l();
        }
        if (i10 == 3) {
            return C18029u.f147649a.c();
        }
        throw new t();
    }

    public final float j(G4 g42) {
        C17542s.j(g42, "size");
        int i10 = a.f149405a[g42.ordinal()];
        if (i10 == 1) {
            return f149398b;
        }
        if (i10 == 2) {
            return f149399c;
        }
        if (i10 == 3) {
            return f149400d;
        }
        throw new t();
    }

    public final C18442p4 k(boolean z10, H4 h42, C4889m mVar, int i10) {
        H4 h43 = h42;
        C4889m mVar2 = mVar;
        C17542s.j(h43, "variant");
        mVar2.W(881289490);
        if (C4895p.J()) {
            C4895p.S(881289490, i10, -1, "net.ikea.skapa.ui.components.ListViewItemProps.style (ListViewItem.kt:561)");
        }
        C18030v vVar = C18030v.f147664a;
        int i11 = C18030v.f147665b;
        C18017h a10 = vVar.a(mVar2, i11);
        C18442p4 p4Var = new C18442p4(Y.c(vVar.b(mVar2, i11).c().e(), z10 ? a10.G0() : a10.K(), 0, h43 == H4.Emphasised ? C.f13316b.a() : C.f13316b.c(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777210, (Object) null), Y.c(vVar.b(mVar2, i11).a().b(), z10 ? a10.H0() : a10.K(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (Y1.q) null, (E) null, (Y1.h) null, 0, 0, (s) null, 16777214, (Object) null));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return p4Var;
    }
}
