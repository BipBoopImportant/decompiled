package wK;

import B0.C4373q;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import L1.v;
import L1.x;
import N1.C4669d;
import N1.E;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.g1;
import r0.m;
import r1.g;
import s0.C5842M;
import sK.C17950a;
import t1.C5942c;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0001\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0001\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006(²\u0006\f\u0010\"\u001a\u00020!8\nX\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u0002²\u0006\f\u0010%\u001a\u00020\u00078\nX\u0002²\u0006\u000e\u0010&\u001a\u00020\u00078\n@\nX\u0002²\u0006\u000e\u0010'\u001a\u00020\u00078\n@\nX\u0002"}, d2 = {"", "title", "Landroidx/compose/ui/d;", "modifier", "LwK/r4;", "leadingImage", "caption", "", "open", "LwK/l;", "size", "LwK/m;", "textStyle", "showDivider", "Lc2/h;", "horizontalPadding", "enabled", "Lr0/m;", "interactionSource", "Lkotlin/Function1;", "LXH/N;", "onClick", "Lkotlin/Function0;", "content", "i", "(Ljava/lang/String;Landroidx/compose/ui/d;LwK/r4;Ljava/lang/String;ZLwK/l;LwK/m;ZFZLr0/m;LnI/l;LnI/p;LU0/m;III)V", "LN1/d;", "annotatedCaption", "h", "(Ljava/lang/String;Landroidx/compose/ui/d;LwK/r4;LN1/d;ZLwK/l;LwK/m;ZFZLr0/m;LnI/l;LnI/p;LU0/m;III)V", "visible", "s", "(ZLwK/l;FLnI/p;LU0/m;I)V", "LwK/a;", "style", "", "rotate", "hover", "isExpanded", "isExpanded2", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.i  reason: case insensitive filesystem */
public final class C18353i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.i$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f150999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f151000b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C18257a> f151001c;

        a(String str, A1<Boolean> a12, A1<C18257a> a13) {
            this.f150999a = str;
            this.f151000b = a12;
            this.f151001c = a13;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-169593612, i11, -1, "net.ikea.skapa.ui.components.Accordion.<anonymous>.<anonymous> (Accordion.kt:239)");
                }
                d1.b(this.f150999a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, C18353i.n(this.f151000b) ? Y.c(C18353i.q(this.f151001c).b(), 0, 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, k.f14792b.d(), (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16773119, (Object) null) : C18353i.q(this.f151001c).b(), mVar, 0, 0, 65534);
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
    /* renamed from: wK.i$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18389l f151002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4669d f151003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C18257a> f151004c;

        b(C18389l lVar, C4669d dVar, A1<C18257a> a12) {
            this.f151002a = lVar;
            this.f151003b = dVar;
            this.f151004c = a12;
        }

        public final void a(C4889m mVar, int i10) {
            C4669d dVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(640926002, i11, -1, "net.ikea.skapa.ui.components.Accordion.<anonymous>.<anonymous> (Accordion.kt:264)");
                }
                if (!(this.f151002a == C18389l.Small || (dVar = this.f151003b) == null || C15854t.v0(dVar))) {
                    d1.c(this.f151003b, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (Map<String, C4373q>) null, (C17642l<? super P, C16807N>) null, C18353i.q(this.f151004c).a(), mVar, 0, 0, 131070);
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
    /* renamed from: wK.i$c */
    static final class c implements nI.q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18466r4 f151005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ G4 f151006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f151007c;

        c(C18466r4 r4Var, G4 g42, boolean z10) {
            this.f151005a = r4Var;
            this.f151006b = g42;
            this.f151007c = z10;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$ListViewItem");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(m10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2063511721, i10, -1, "net.ikea.skapa.ui.components.Accordion.<anonymous>.<anonymous> (Accordion.kt:268)");
                }
                C4.t(m10, this.f151005a, this.f151006b, this.f151007c, mVar, i10 & 14);
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
    /* renamed from: wK.i$d */
    static final class d implements nI.q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1<Float> f151008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<C18257a> f151009b;

        d(A1<Float> a12, A1<C18257a> a13) {
            this.f151008a = a12;
            this.f151009b = a13;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(A1 a12, androidx.compose.ui.graphics.c cVar) {
            C17542s.j(cVar, "$this$graphicsLayer");
            cVar.l(C18353i.r(a12));
            return C16807N.f139792a;
        }

        public final void b(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$ListViewItem");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(321287880, i10, -1, "net.ikea.skapa.ui.components.Accordion.<anonymous>.<anonymous> (Accordion.kt:270)");
                }
                C5942c c10 = J1.e.c(C17950a.f147152a, mVar, 0);
                d.a aVar = androidx.compose.ui.d.f18749a;
                mVar.W(-1760621461);
                boolean V10 = mVar.V(this.f151008a);
                A1<Float> a12 = this.f151008a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C18365j(a12);
                    mVar.u(D10);
                }
                mVar.P();
                V.a(c10, (String) null, androidx.compose.ui.graphics.b.a(aVar, (C17642l) D10), C18353i.q(this.f151009b).b().h(), mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.i$e */
    static final class e implements nI.q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f151010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18389l f151011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f151012c;

        e(float f10, C18389l lVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f151010a = f10;
            this.f151011b = lVar;
            this.f151012c = pVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-391918104, i10, -1, "net.ikea.skapa.ui.components.Content.<anonymous> (Accordion.kt:306)");
            }
            androidx.compose.ui.d h10 = D.h(D.k(androidx.compose.ui.d.f18749a, this.f151010a, 0.0f, 2, (Object) null), C18377k.f151115a.a(this.f151011b));
            p<C4889m, Integer, C16807N> pVar = this.f151012c;
            I h11 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(mVar, 0);
            C4912y s10 = mVar.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, h10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (mVar.m() == null) {
                C4883j.c();
            }
            mVar.I();
            if (mVar.i()) {
                mVar.p(a11);
            } else {
                mVar.t();
            }
            C4889m a12 = F1.a(mVar);
            F1.c(a12, h11, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            C5079j jVar = C5079j.f18125a;
            pVar.invoke(mVar, 0);
            mVar.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.i$f */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f151013a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                wK.l[] r0 = wK.C18389l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.l r1 = wK.C18389l.Small     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.l r1 = wK.C18389l.Medium     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.l r1 = wK.C18389l.Large     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f151013a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.C18353i.f.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(java.lang.String r47, androidx.compose.ui.d r48, wK.C18466r4 r49, N1.C4669d r50, boolean r51, wK.C18389l r52, wK.C18401m r53, boolean r54, float r55, boolean r56, r0.m r57, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r58, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r59, U0.C4889m r60, int r61, int r62, int r63) {
        /*
            r1 = r47
            r7 = r53
            r12 = r58
            r11 = r59
            r10 = r61
            r9 = r62
            r8 = r63
            r13 = 128(0x80, float:1.794E-43)
            r14 = 32
            r15 = 16
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "textStyle"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 2027162541(0x78d40bad, float:3.4406367E34)
            r3 = r60
            U0.m r3 = r3.k(r0)
            r0 = 1
            r20 = r8 & 1
            r21 = 4
            r0 = 2
            if (r20 == 0) goto L_0x003c
            r20 = r10 | 6
            goto L_0x0050
        L_0x003c:
            r20 = r10 & 6
            if (r20 != 0) goto L_0x004e
            boolean r20 = r3.V(r1)
            if (r20 == 0) goto L_0x0049
            r20 = r21
            goto L_0x004b
        L_0x0049:
            r20 = r0
        L_0x004b:
            r20 = r10 | r20
            goto L_0x0050
        L_0x004e:
            r20 = r10
        L_0x0050:
            r22 = r8 & 2
            if (r22 == 0) goto L_0x005b
            r20 = r20 | 48
            r0 = r48
        L_0x0058:
            r6 = r20
            goto L_0x006f
        L_0x005b:
            r23 = r10 & 48
            r0 = r48
            if (r23 != 0) goto L_0x0058
            boolean r23 = r3.V(r0)
            if (r23 == 0) goto L_0x006a
            r23 = r14
            goto L_0x006c
        L_0x006a:
            r23 = r15
        L_0x006c:
            r20 = r20 | r23
            goto L_0x0058
        L_0x006f:
            r20 = r8 & 4
            if (r20 == 0) goto L_0x0078
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0075:
            r5 = r49
            goto L_0x008b
        L_0x0078:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0075
            r5 = r49
            boolean r25 = r3.V(r5)
            if (r25 == 0) goto L_0x0087
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0089
        L_0x0087:
            r25 = r13
        L_0x0089:
            r6 = r6 | r25
        L_0x008b:
            r25 = r8 & 8
            if (r25 == 0) goto L_0x0094
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0091:
            r4 = r50
            goto L_0x00a7
        L_0x0094:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0091
            r4 = r50
            boolean r28 = r3.V(r4)
            if (r28 == 0) goto L_0x00a3
            r28 = 2048(0x800, float:2.87E-42)
            goto L_0x00a5
        L_0x00a3:
            r28 = 1024(0x400, float:1.435E-42)
        L_0x00a5:
            r6 = r6 | r28
        L_0x00a7:
            r28 = r8 & 16
            if (r28 == 0) goto L_0x00b0
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x00ad:
            r15 = r51
            goto L_0x00c3
        L_0x00b0:
            r15 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x00ad
            r15 = r51
            boolean r31 = r3.b(r15)
            if (r31 == 0) goto L_0x00bf
            r31 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c1
        L_0x00bf:
            r31 = 8192(0x2000, float:1.14794E-41)
        L_0x00c1:
            r6 = r6 | r31
        L_0x00c3:
            r31 = r8 & 32
            r32 = 196608(0x30000, float:2.75506E-40)
            if (r31 == 0) goto L_0x00ce
            r6 = r6 | r32
            r14 = r52
            goto L_0x00e1
        L_0x00ce:
            r32 = r10 & r32
            r14 = r52
            if (r32 != 0) goto L_0x00e1
            boolean r33 = r3.V(r14)
            if (r33 == 0) goto L_0x00dd
            r33 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00df
        L_0x00dd:
            r33 = 65536(0x10000, float:9.18355E-41)
        L_0x00df:
            r6 = r6 | r33
        L_0x00e1:
            r33 = r8 & 64
            r34 = 1572864(0x180000, float:2.204052E-39)
            if (r33 == 0) goto L_0x00ea
            r6 = r6 | r34
            goto L_0x00fb
        L_0x00ea:
            r33 = r10 & r34
            if (r33 != 0) goto L_0x00fb
            boolean r33 = r3.V(r7)
            if (r33 == 0) goto L_0x00f7
            r33 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f9
        L_0x00f7:
            r33 = 524288(0x80000, float:7.34684E-40)
        L_0x00f9:
            r6 = r6 | r33
        L_0x00fb:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x0106
            r6 = r6 | r34
            r13 = r54
            goto L_0x0119
        L_0x0106:
            r34 = r10 & r34
            r13 = r54
            if (r34 != 0) goto L_0x0119
            boolean r35 = r3.b(r13)
            if (r35 == 0) goto L_0x0115
            r35 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0117
        L_0x0115:
            r35 = 4194304(0x400000, float:5.877472E-39)
        L_0x0117:
            r6 = r6 | r35
        L_0x0119:
            r35 = 100663296(0x6000000, float:2.4074124E-35)
            r35 = r10 & r35
            if (r35 != 0) goto L_0x0134
            r0 = 256(0x100, float:3.59E-43)
            r4 = r8 & 256(0x100, float:3.59E-43)
            r0 = r55
            if (r4 != 0) goto L_0x0130
            boolean r4 = r3.c(r0)
            if (r4 == 0) goto L_0x0130
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0132
        L_0x0130:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0132:
            r6 = r6 | r4
            goto L_0x0136
        L_0x0134:
            r0 = r55
        L_0x0136:
            r4 = r8 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0141
        L_0x013c:
            r6 = r6 | r26
        L_0x013e:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0153
        L_0x0141:
            r26 = r10 & r26
            r0 = r56
            if (r26 != 0) goto L_0x013e
            boolean r26 = r3.b(r0)
            if (r26 == 0) goto L_0x0150
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013c
        L_0x0150:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x013c
        L_0x0153:
            r0 = r0 & r8
            if (r0 == 0) goto L_0x015b
            r21 = r9 | 6
        L_0x0158:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0170
        L_0x015b:
            r24 = r9 & 6
            r5 = r57
            if (r24 != 0) goto L_0x016d
            boolean r24 = r3.V(r5)
            if (r24 == 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r21 = 2
        L_0x016a:
            r21 = r9 | r21
            goto L_0x0158
        L_0x016d:
            r21 = r9
            goto L_0x0158
        L_0x0170:
            r5 = r5 & r8
            if (r5 == 0) goto L_0x0178
            r21 = r21 | 48
        L_0x0175:
            r5 = r21
            goto L_0x018a
        L_0x0178:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0175
            boolean r5 = r3.F(r12)
            if (r5 == 0) goto L_0x0185
            r29 = 32
            goto L_0x0187
        L_0x0185:
            r29 = 16
        L_0x0187:
            r21 = r21 | r29
            goto L_0x0175
        L_0x018a:
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0191
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x01a1
        L_0x0191:
            r13 = r9 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x01a1
            boolean r13 = r3.F(r11)
            if (r13 == 0) goto L_0x019e
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x01a0
        L_0x019e:
            r13 = 128(0x80, float:1.794E-43)
        L_0x01a0:
            r5 = r5 | r13
        L_0x01a1:
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r6
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r9) goto L_0x01cc
            r9 = r5 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r9 != r13) goto L_0x01cc
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x01b7
            goto L_0x01cc
        L_0x01b7:
            r3.L()
            r2 = r48
            r8 = r49
            r4 = r50
            r34 = r54
            r9 = r55
            r10 = r56
            r11 = r57
            r6 = r14
            r5 = r15
            goto L_0x04ae
        L_0x01cc:
            r3.G()
            r9 = 1
            r13 = r10 & 1
            if (r13 == 0) goto L_0x01fa
            boolean r13 = r3.O()
            if (r13 == 0) goto L_0x01db
            goto L_0x01fa
        L_0x01db:
            r3.L()
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x01e7
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r0
        L_0x01e7:
            r0 = r48
            r2 = r49
            r4 = r50
            r34 = r54
            r35 = r55
            r13 = r6
            r9 = r14
            r6 = r15
            r15 = r56
            r14 = r57
            goto L_0x0274
        L_0x01fa:
            if (r22 == 0) goto L_0x01ff
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            goto L_0x0201
        L_0x01ff:
            r13 = r48
        L_0x0201:
            if (r20 == 0) goto L_0x0206
            wK.r4$d r20 = wK.C18466r4.d.f151502b
            goto L_0x0208
        L_0x0206:
            r20 = r49
        L_0x0208:
            if (r25 == 0) goto L_0x020d
            r21 = 0
            goto L_0x020f
        L_0x020d:
            r21 = r50
        L_0x020f:
            if (r28 == 0) goto L_0x0212
            r15 = 0
        L_0x0212:
            if (r31 == 0) goto L_0x0216
            wK.l r14 = wK.C18389l.Medium
        L_0x0216:
            if (r2 == 0) goto L_0x021c
            r2 = 1
        L_0x0219:
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x021f
        L_0x021c:
            r2 = r54
            goto L_0x0219
        L_0x021f:
            r9 = r9 & r8
            if (r9 == 0) goto L_0x022e
            tK.u r9 = tK.C18029u.f147649a
            float r9 = r9.d()
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r18
            goto L_0x0230
        L_0x022e:
            r9 = r55
        L_0x0230:
            if (r4 == 0) goto L_0x0234
            r4 = 1
            goto L_0x0236
        L_0x0234:
            r4 = r56
        L_0x0236:
            if (r0 == 0) goto L_0x0267
            r0 = -2135074658(0xffffffff80bd589e, float:-1.7388699E-38)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r18 = U0.C4889m.f14007a
            r48 = r2
            java.lang.Object r2 = r18.a()
            if (r0 != r2) goto L_0x0253
            r0.m r0 = r0.l.a()
            r3.u(r0)
        L_0x0253:
            r0.m r0 = (r0.m) r0
            r3.P()
            r34 = r48
            r35 = r9
            r9 = r14
            r2 = r20
            r14 = r0
            r0 = r13
        L_0x0261:
            r13 = r6
            r6 = r15
            r15 = r4
            r4 = r21
            goto L_0x0274
        L_0x0267:
            r48 = r2
            r34 = r48
            r35 = r9
            r0 = r13
            r9 = r14
            r2 = r20
            r14 = r57
            goto L_0x0261
        L_0x0274:
            r3.y()
            boolean r18 = U0.C4895p.J()
            if (r18 == 0) goto L_0x0285
            java.lang.String r8 = "net.ikea.skapa.ui.components.Accordion (Accordion.kt:218)"
            r10 = 2027162541(0x78d40bad, float:3.4406367E34)
            U0.C4895p.S(r10, r13, r5, r8)
        L_0x0285:
            wK.k r8 = wK.C18377k.f151115a
            int r10 = r13 >> 18
            r11 = r10 & 14
            r11 = r11 | 384(0x180, float:5.38E-43)
            int r18 = r13 >> 24
            r18 = r18 & 112(0x70, float:1.57E-43)
            r11 = r11 | r18
            wK.a r11 = r8.d(r7, r15, r3, r11)
            r7 = 0
            U0.A1 r11 = U0.p1.q(r11, r3, r7)
            boolean r18 = vK.C18205e.f(r3, r7)
            if (r18 == 0) goto L_0x02a4
            r7 = -1
            goto L_0x02a5
        L_0x02a4:
            r7 = 1
        L_0x02a5:
            if (r6 == 0) goto L_0x02af
            r18 = 1127481344(0x43340000, float:180.0)
            float r7 = (float) r7
            float r7 = r7 * r18
        L_0x02ac:
            r19 = r7
            goto L_0x02b1
        L_0x02af:
            r7 = 0
            goto L_0x02ac
        L_0x02b1:
            m0.N r20 = r8.c()
            r25 = 3072(0xc00, float:4.305E-42)
            r26 = 20
            r21 = 0
            java.lang.String r22 = "Open accordion"
            r23 = 0
            r24 = r3
            U0.A1 r7 = m0.C5534c.d(r19, r20, r21, r22, r23, r24, r25, r26)
            int[] r8 = wK.C18353i.f.f151013a
            int r18 = r9.ordinal()
            r8 = r8[r18]
            r48 = r10
            r10 = 1
            if (r8 == r10) goto L_0x02e5
            r10 = 2
            if (r8 == r10) goto L_0x02e1
            r10 = 3
            if (r8 != r10) goto L_0x02db
            wK.G4 r8 = wK.G4.Large
            goto L_0x02e8
        L_0x02db:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x02e1:
            r10 = 3
            wK.G4 r8 = wK.G4.Medium
            goto L_0x02e8
        L_0x02e5:
            r10 = 3
            wK.G4 r8 = wK.G4.Small
        L_0x02e8:
            int r18 = r13 >> 3
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r10.g()
            i1.c$a r19 = i1.C5437c.f24302a
            r49 = r7
            i1.c$b r7 = r19.k()
            r50 = r2
            r2 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r10, r7, r3, r2)
            int r10 = U0.C4883j.a(r3, r2)
            U0.y r2 = r3.s()
            r25 = r8
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r3, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            r51 = r0
            nI.a r0 = r19.a()
            U0.f r20 = r3.m()
            if (r20 != 0) goto L_0x031e
            U0.C4883j.c()
        L_0x031e:
            r3.I()
            boolean r20 = r3.i()
            if (r20 == 0) goto L_0x032b
            r3.p(r0)
            goto L_0x032e
        L_0x032b:
            r3.t()
        L_0x032e:
            U0.m r0 = U0.F1.a(r3)
            r52 = r4
            nI.p r4 = r19.c()
            U0.F1.c(r0, r7, r4)
            nI.p r4 = r19.e()
            U0.F1.c(r0, r2, r4)
            nI.p r2 = r19.b()
            boolean r4 = r0.i()
            if (r4 != 0) goto L_0x035a
            java.lang.Object r4 = r0.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x0368
        L_0x035a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0.w(r4, r2)
        L_0x0368:
            nI.p r2 = r19.d()
            U0.F1.c(r0, r8, r2)
            s0.h r0 = s0.C5862h.f28810a
            r0 = -1789451224(0xffffffff95572428, float:-4.3447426E-26)
            r3.W(r0)
            if (r34 == 0) goto L_0x037d
            r0 = 0
            wK.C18547y2.d(r3, r0)
        L_0x037d:
            r3.P()
            r0 = r5 & 14
            U0.A1 r0 = r0.i.a(r14, r3, r0)
            androidx.compose.ui.d$a r36 = androidx.compose.ui.d.f18749a
            U0.I0 r2 = androidx.compose.foundation.j.a()
            java.lang.Object r2 = r3.Q(r2)
            r38 = r2
            n0.G r38 = (n0.C5584G) r38
            r2 = -1789434004(0xffffffff9557676c, float:-4.350049E-26)
            r3.W(r2)
            r2 = r5 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r2 != r4) goto L_0x03a2
            r4 = 1
            goto L_0x03a3
        L_0x03a2:
            r4 = 0
        L_0x03a3:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r13
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x03ad
            r8 = 1
            goto L_0x03ae
        L_0x03ad:
            r8 = 0
        L_0x03ae:
            r4 = r4 | r8
            java.lang.Object r8 = r3.D()
            if (r4 != 0) goto L_0x03bd
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r8 != r4) goto L_0x03c5
        L_0x03bd:
            wK.c r8 = new wK.c
            r8.<init>(r12, r6)
            r3.u(r8)
        L_0x03c5:
            r42 = r8
            nI.a r42 = (nI.C17631a) r42
            r3.P()
            r43 = 24
            r44 = 0
            r40 = 0
            r41 = 0
            r37 = r14
            r39 = r15
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.b(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            boolean r8 = n(r0)
            androidx.compose.ui.d r4 = zK.C18756a.i(r4, r8, r15)
            r8 = -1789429332(0xffffffff955779ac, float:-4.3514886E-26)
            r3.W(r8)
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x03f2
            r7 = 1
        L_0x03ef:
            r8 = 32
            goto L_0x03f4
        L_0x03f2:
            r7 = 0
            goto L_0x03ef
        L_0x03f4:
            if (r2 != r8) goto L_0x03f8
            r2 = 1
            goto L_0x03f9
        L_0x03f8:
            r2 = 0
        L_0x03f9:
            r2 = r2 | r7
            java.lang.Object r7 = r3.D()
            if (r2 != 0) goto L_0x0408
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x0410
        L_0x0408:
            wK.d r7 = new wK.d
            r7.<init>(r6, r12)
            r3.u(r7)
        L_0x0410:
            nI.l r7 = (nI.C17642l) r7
            r3.P()
            r2 = 1
            r8 = 0
            r10 = 0
            androidx.compose.ui.d r20 = L1.o.d(r4, r8, r7, r2, r10)
            wK.i$a r4 = new wK.i$a
            r4.<init>(r1, r0, r11)
            r0 = -169593612(0xfffffffff5e434f4, float:-5.785731E32)
            r7 = 54
            c1.a r19 = c1.c.e(r0, r2, r4, r3, r7)
            wK.i$b r0 = new wK.i$b
            r4 = r52
            r0.<init>(r9, r4, r11)
            r8 = 640926002(0x2633c132, float:6.236493E-16)
            c1.a r21 = c1.c.e(r8, r2, r0, r3, r7)
            wK.i$c r0 = new wK.i$c
            r8 = r50
            r10 = r25
            r0.<init>(r8, r10, r15)
            r1 = 2063511721(0x7afeb0a9, float:6.6121325E35)
            c1.a r22 = c1.c.e(r1, r2, r0, r3, r7)
            wK.i$d r0 = new wK.i$d
            r1 = r49
            r0.<init>(r1, r11)
            r1 = 321287880(0x132676c8, float:2.101071E-27)
            c1.a r23 = c1.c.e(r1, r2, r0, r3, r7)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r18 & r0
            r1 = 224646(0x36d86, float:3.14796E-40)
            r0 = r0 | r1
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r18 & r1
            r0 = r0 | r1
            int r1 = r5 << 27
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r31 = r0 | r1
            r32 = 6
            r33 = 0
            r24 = 0
            r29 = 0
            r26 = r35
            r27 = r15
            r28 = r14
            r30 = r3
            wK.C4.m(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            int r0 = r13 >> 12
            r0 = r0 & 126(0x7e, float:1.77E-43)
            r1 = r48
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = 3
            int r1 = r5 << 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r18 = r0 | r1
            r13 = r6
            r0 = r14
            r14 = r9
            r1 = r15
            r15 = r35
            r16 = r59
            r17 = r3
            s(r13, r14, r15, r16, r17, r18)
            r3.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x04a6
            U0.C4895p.R()
        L_0x04a6:
            r2 = r51
            r11 = r0
            r10 = r1
            r5 = r6
            r6 = r9
            r9 = r35
        L_0x04ae:
            U0.Y0 r15 = r3.n()
            if (r15 == 0) goto L_0x04d6
            wK.e r14 = new wK.e
            r0 = r14
            r1 = r47
            r3 = r8
            r7 = r53
            r8 = r34
            r12 = r58
            r13 = r59
            r45 = r14
            r14 = r61
            r46 = r15
            r15 = r62
            r16 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r45
            r0 = r46
            r0.a(r1)
        L_0x04d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18353i.h(java.lang.String, androidx.compose.ui.d, wK.r4, N1.d, boolean, wK.l, wK.m, boolean, float, boolean, r0.m, nI.l, nI.p, U0.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(java.lang.String r30, androidx.compose.ui.d r31, wK.C18466r4 r32, java.lang.String r33, boolean r34, wK.C18389l r35, wK.C18401m r36, boolean r37, float r38, boolean r39, r0.m r40, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r41, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r42, U0.C4889m r43, int r44, int r45, int r46) {
        /*
            r13 = r30
            r12 = r41
            r11 = r42
            r10 = r44
            r9 = r45
            r8 = r46
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -544778521(0xffffffffdf8756e7, float:-1.9504472E19)
            r1 = r43
            U0.m r7 = r1.k(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L_0x002b
            r1 = r10 | 6
            goto L_0x003b
        L_0x002b:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x003a
            boolean r1 = r7.V(r13)
            if (r1 == 0) goto L_0x0037
            r1 = 4
            goto L_0x0038
        L_0x0037:
            r1 = 2
        L_0x0038:
            r1 = r1 | r10
            goto L_0x003b
        L_0x003a:
            r1 = r10
        L_0x003b:
            r4 = r8 & 2
            if (r4 == 0) goto L_0x0044
            r1 = r1 | 48
        L_0x0041:
            r14 = r31
            goto L_0x0056
        L_0x0044:
            r14 = r10 & 48
            if (r14 != 0) goto L_0x0041
            r14 = r31
            boolean r15 = r7.V(r14)
            if (r15 == 0) goto L_0x0053
            r15 = 32
            goto L_0x0055
        L_0x0053:
            r15 = 16
        L_0x0055:
            r1 = r1 | r15
        L_0x0056:
            r15 = r8 & 4
            r16 = 128(0x80, float:1.794E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0063
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0060:
            r2 = r32
            goto L_0x0076
        L_0x0063:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0060
            r2 = r32
            boolean r18 = r7.V(r2)
            if (r18 == 0) goto L_0x0072
            r18 = r17
            goto L_0x0074
        L_0x0072:
            r18 = r16
        L_0x0074:
            r1 = r1 | r18
        L_0x0076:
            r18 = r8 & 8
            if (r18 == 0) goto L_0x007f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x007c:
            r3 = r33
            goto L_0x0092
        L_0x007f:
            r3 = r10 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007c
            r3 = r33
            boolean r20 = r7.V(r3)
            if (r20 == 0) goto L_0x008e
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x0090
        L_0x008e:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x0090:
            r1 = r1 | r20
        L_0x0092:
            r20 = r8 & 16
            if (r20 == 0) goto L_0x009b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0098:
            r5 = r34
            goto L_0x00ae
        L_0x009b:
            r5 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0098
            r5 = r34
            boolean r22 = r7.b(r5)
            if (r22 == 0) goto L_0x00aa
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ac
        L_0x00aa:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00ac:
            r1 = r1 | r22
        L_0x00ae:
            r22 = r8 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00b9
            r1 = r1 | r23
            r6 = r35
            goto L_0x00cc
        L_0x00b9:
            r23 = r10 & r23
            r6 = r35
            if (r23 != 0) goto L_0x00cc
            boolean r24 = r7.V(r6)
            if (r24 == 0) goto L_0x00c8
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r24
        L_0x00cc:
            r24 = r8 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00d7
            r1 = r1 | r25
            r0 = r36
            goto L_0x00ea
        L_0x00d7:
            r25 = r10 & r25
            r0 = r36
            if (r25 != 0) goto L_0x00ea
            boolean r26 = r7.V(r0)
            if (r26 == 0) goto L_0x00e6
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r1 = r1 | r26
        L_0x00ea:
            r0 = r8 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00f5
            r1 = r1 | r26
            r2 = r37
            goto L_0x0108
        L_0x00f5:
            r26 = r10 & r26
            r2 = r37
            if (r26 != 0) goto L_0x0108
            boolean r26 = r7.b(r2)
            if (r26 == 0) goto L_0x0104
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r26
        L_0x0108:
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r26 = r10 & r26
            if (r26 != 0) goto L_0x0124
            r2 = r8 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x011d
            r2 = r38
            boolean r26 = r7.c(r2)
            if (r26 == 0) goto L_0x011f
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0121
        L_0x011d:
            r2 = r38
        L_0x011f:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0121:
            r1 = r1 | r26
            goto L_0x0126
        L_0x0124:
            r2 = r38
        L_0x0126:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r26 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0131
            r1 = r1 | r26
            r3 = r39
            goto L_0x0144
        L_0x0131:
            r26 = r10 & r26
            r3 = r39
            if (r26 != 0) goto L_0x0144
            boolean r26 = r7.b(r3)
            if (r26 == 0) goto L_0x0140
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r1 = r1 | r26
        L_0x0144:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014d
            r19 = r9 | 6
            r5 = r40
            goto L_0x0163
        L_0x014d:
            r26 = r9 & 6
            r5 = r40
            if (r26 != 0) goto L_0x0161
            boolean r26 = r7.V(r5)
            if (r26 == 0) goto L_0x015c
            r19 = 4
            goto L_0x015e
        L_0x015c:
            r19 = 2
        L_0x015e:
            r19 = r9 | r19
            goto L_0x0163
        L_0x0161:
            r19 = r9
        L_0x0163:
            r5 = r8 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x016c
            r19 = r19 | 48
        L_0x0169:
            r5 = r19
            goto L_0x017e
        L_0x016c:
            r5 = r9 & 48
            if (r5 != 0) goto L_0x0169
            boolean r5 = r7.F(r12)
            if (r5 == 0) goto L_0x0179
            r5 = 32
            goto L_0x017b
        L_0x0179:
            r5 = 16
        L_0x017b:
            r19 = r19 | r5
            goto L_0x0169
        L_0x017e:
            r6 = r8 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0185
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0193
        L_0x0185:
            r6 = r9 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0193
            boolean r6 = r7.F(r11)
            if (r6 == 0) goto L_0x0191
            r16 = r17
        L_0x0191:
            r5 = r5 | r16
        L_0x0193:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r6 & r1
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r9) goto L_0x01c3
            r6 = r5 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x01c3
            boolean r6 = r7.l()
            if (r6 != 0) goto L_0x01a9
            goto L_0x01c3
        L_0x01a9:
            r7.L()
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r25 = r7
            r2 = r14
            r7 = r36
            goto L_0x02e1
        L_0x01c3:
            r7.G()
            r6 = r10 & 1
            r16 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r6 == 0) goto L_0x01f3
            boolean r6 = r7.O()
            if (r6 == 0) goto L_0x01d4
            goto L_0x01f3
        L_0x01d4:
            r7.L()
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x01dd
            r1 = r1 & r16
        L_0x01dd:
            r18 = r32
            r19 = r33
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r26 = r39
            r27 = r40
            r17 = r14
            goto L_0x0271
        L_0x01f3:
            if (r4 == 0) goto L_0x01f8
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01f9
        L_0x01f8:
            r4 = r14
        L_0x01f9:
            if (r15 == 0) goto L_0x01fe
            wK.r4$d r6 = wK.C18466r4.d.f151502b
            goto L_0x0200
        L_0x01fe:
            r6 = r32
        L_0x0200:
            if (r18 == 0) goto L_0x0204
            r14 = 0
            goto L_0x0206
        L_0x0204:
            r14 = r33
        L_0x0206:
            if (r20 == 0) goto L_0x020a
            r15 = 0
            goto L_0x020c
        L_0x020a:
            r15 = r34
        L_0x020c:
            if (r22 == 0) goto L_0x0211
            wK.l r17 = wK.C18389l.Medium
            goto L_0x0213
        L_0x0211:
            r17 = r35
        L_0x0213:
            if (r24 == 0) goto L_0x0218
            wK.m r18 = wK.C18401m.Emphasised
            goto L_0x021a
        L_0x0218:
            r18 = r36
        L_0x021a:
            r19 = 1
            if (r0 == 0) goto L_0x0221
            r0 = r19
            goto L_0x0223
        L_0x0221:
            r0 = r37
        L_0x0223:
            r9 = r8 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0230
            tK.u r9 = tK.C18029u.f147649a
            float r9 = r9.d()
            r1 = r1 & r16
            goto L_0x0232
        L_0x0230:
            r9 = r38
        L_0x0232:
            if (r2 == 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r19 = r39
        L_0x0237:
            if (r3 == 0) goto L_0x026c
            r2 = -2135271010(0xffffffff80ba599e, float:-1.7113551E-38)
            r7.W(r2)
            java.lang.Object r2 = r7.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0252
            r0.m r2 = r0.l.a()
            r7.u(r2)
        L_0x0252:
            r0.m r2 = (r0.m) r2
            r7.P()
            r23 = r0
            r27 = r2
        L_0x025b:
            r24 = r9
            r20 = r15
            r21 = r17
            r22 = r18
            r26 = r19
            r17 = r4
            r18 = r6
            r19 = r14
            goto L_0x0271
        L_0x026c:
            r27 = r40
            r23 = r0
            goto L_0x025b
        L_0x0271:
            r7.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = "net.ikea.skapa.ui.components.Accordion (Accordion.kt:93)"
            r2 = -544778521(0xffffffffdf8756e7, float:-1.9504472E19)
            U0.C4895p.S(r2, r1, r5, r0)
        L_0x0282:
            if (r19 == 0) goto L_0x029b
            N1.d r0 = new N1.d
            r2 = 6
            r3 = 0
            r4 = 0
            r6 = 0
            r31 = r0
            r32 = r19
            r33 = r4
            r34 = r6
            r35 = r2
            r36 = r3
            r31.<init>(r32, r33, r34, r35, r36)
            r3 = r0
            goto L_0x029c
        L_0x029b:
            r3 = 0
        L_0x029c:
            r0 = 2147476478(0x7fffe3fe, float:NaN)
            r14 = r1 & r0
            r15 = r5 & 1022(0x3fe, float:1.432E-42)
            r16 = 0
            r0 = r30
            r1 = r17
            r2 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            r25 = r7
            r7 = r23
            r8 = r24
            r9 = r26
            r10 = r27
            r11 = r41
            r12 = r42
            r13 = r25
            h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02cd
            U0.C4895p.R()
        L_0x02cd:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r26
            r11 = r27
        L_0x02e1:
            U0.Y0 r15 = r25.n()
            if (r15 == 0) goto L_0x0304
            wK.b r14 = new wK.b
            r0 = r14
            r1 = r30
            r12 = r41
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
        L_0x0304:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18353i.i(java.lang.String, androidx.compose.ui.d, wK.r4, java.lang.String, boolean, wK.l, wK.m, boolean, float, boolean, r0.m, nI.l, nI.p, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, boolean z10) {
        lVar.invoke(Boolean.valueOf(!z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(boolean z10, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        if (z10) {
            v.f(xVar, (String) null, new C18317f(lVar), 1, (Object) null);
        } else {
            v.q(xVar, (String) null, new C18329g(lVar), 1, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean l(C17642l lVar) {
        lVar.invoke(Boolean.FALSE);
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean m(C17642l lVar) {
        lVar.invoke(Boolean.TRUE);
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean n(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, androidx.compose.ui.d dVar, C18466r4 r4Var, C4669d dVar2, boolean z10, C18389l lVar, C18401m mVar, boolean z11, float f10, boolean z12, m mVar2, C17642l lVar2, p pVar, int i10, int i11, int i12, C4889m mVar3, int i13) {
        h(str, dVar, r4Var, dVar2, z10, lVar, mVar, z11, f10, z12, mVar2, lVar2, pVar, mVar3, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(String str, androidx.compose.ui.d dVar, C18466r4 r4Var, String str2, boolean z10, C18389l lVar, C18401m mVar, boolean z11, float f10, boolean z12, m mVar2, C17642l lVar2, p pVar, int i10, int i11, int i12, C4889m mVar3, int i13) {
        i(str, dVar, r4Var, str2, z10, lVar, mVar, z11, f10, z12, mVar2, lVar2, pVar, mVar3, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C18257a q(A1<C18257a> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final float r(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    private static final void s(boolean z10, C18389l lVar, float f10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C18389l lVar2 = lVar;
        float f11 = f10;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1433378240);
        boolean z11 = z10;
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.c(f11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1433378240, i11, -1, "net.ikea.skapa.ui.components.Content (Accordion.kt:294)");
            }
            C5437c.a aVar = C5437c.f24302a;
            C5437c.C0386c l10 = aVar.l();
            C18377k kVar = C18377k.f151115a;
            l0.d.g(z10, (androidx.compose.ui.d) null, androidx.compose.animation.g.m(kVar.b(), l10, false, (C17642l) null, 12, (Object) null).c(androidx.compose.animation.g.o(kVar.c(), 0.0f, 2, (Object) null)), androidx.compose.animation.g.A(kVar.b(), aVar.l(), false, (C17642l) null, 12, (Object) null).c(androidx.compose.animation.g.q(kVar.c(), 0.0f, 2, (Object) null)), (String) null, c1.c.e(-391918104, true, new e(f11, lVar2, pVar2), k10, 54), k10, (i11 & 14) | ImageMetadata.EDGE_MODE, 18);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18341h(z10, lVar, f10, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(boolean z10, C18389l lVar, float f10, p pVar, int i10, C4889m mVar, int i11) {
        s(z10, lVar, f10, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
