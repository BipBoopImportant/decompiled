package vt;

import E1.C4488v;
import E1.C4489w;
import E1.I;
import G1.C4504g;
import Gt.f;
import It.B;
import It.C;
import It.C10749l;
import It.q;
import KJ.C15987c;
import L1.i;
import L1.v;
import L1.x;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import c2.n;
import c2.o;
import c2.r;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.e;
import m0.C5525D;
import m0.C5548j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import o1.C5668h;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import r1.C5817c;
import t0.C5938c;
import tt.C11991a;
import ut.L;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a]\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a]\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001aS\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aO\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010#\u001a\u00020\u0005*\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*¨\u0006.²\u0006\u000e\u0010,\u001a\u00020+8\n@\nX\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u0002²\u0006\u000e\u0010'\u001a\u00020%8\n@\nX\u0002²\u0006\f\u0010-\u001a\u00020(8\nX\u0002"}, d2 = {"Lt0/x;", "LIt/B$c;", "state", "", "isExpandedWidth", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "Lo1/g;", "shortcutCarouselPosition", "F", "(Lt0/x;LIt/B$c;ZLandroidx/compose/ui/d;LnI/l;LnI/l;LnI/l;)V", "k", "(LIt/B$c;LnI/l;LnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "v", "LGt/f;", "storeDetails", "LGt/d;", "popularTimesData", "A", "(LGt/f;LGt/d;LnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "LKJ/c;", "LIt/C;", "shortcuts", "y", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "Lp1/v0;", "color", "", "width", "H", "(Landroidx/compose/ui/d;JF)Landroidx/compose/ui/d;", "", "storeHeaderHeight", "shortcutCarouselHeight", "Li1/c$c;", "G", "(II)Li1/c$c;", "Lc2/h;", "height", "alignment", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vt.k  reason: case insensitive filesystem */
public final class C12247k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.k$a */
    static final class a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B.c f105616a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105617b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105618c;

        a(B.c cVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105616a = cVar;
            this.f105617b = lVar;
            this.f105618c = lVar2;
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(343012603, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.BackLayerPortrait.<anonymous>.<anonymous>.<anonymous> (BackLayerContent.kt:223)");
            }
            C12247k.y(this.f105616a.f().b(), this.f105617b, D.m(androidx.compose.ui.d.f18749a, 0.0f, h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), this.f105618c, mVar, 384, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.k$b */
    static final class b implements q<androidx.compose.ui.d, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C> f105619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105620b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105621c;

        b(C15987c<? extends C> cVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105619a = cVar;
            this.f105620b = lVar;
            this.f105621c = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C c10, C17642l lVar, C17642l lVar2) {
            c10.a(lVar, lVar2);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(androidx.compose.ui.d r12, U0.C4889m r13, int r14) {
            /*
                r11 = this;
                java.lang.String r0 = "childModifier"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                r0 = r14 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r13.V(r12)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r14 = r14 | r0
            L_0x0013:
                r0 = r14 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0024
                boolean r0 = r13.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0024
            L_0x0020:
                r13.L()
                goto L_0x0091
            L_0x0024:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0033
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutsCarousel.<anonymous> (BackLayerContent.kt:282)"
                r2 = 2006998123(0x77a05c6b, float:6.505015E33)
                U0.C4895p.S(r2, r14, r0, r1)
            L_0x0033:
                KJ.c<It.C> r0 = r11.f105619a
                nI.l<It.q, XH.N> r1 = r11.f105620b
                nI.l<It.l, XH.N> r2 = r11.f105621c
                java.util.Iterator r0 = r0.iterator()
            L_0x003d:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0088
                java.lang.Object r3 = r0.next()
                r4 = r3
                It.C r4 = (It.C) r4
                r3 = -120469275(0xfffffffff8d1c8e5, float:-3.403952E34)
                r13.W(r3)
                boolean r3 = r13.F(r4)
                boolean r5 = r13.V(r1)
                r3 = r3 | r5
                boolean r5 = r13.V(r2)
                r3 = r3 | r5
                java.lang.Object r5 = r13.D()
                if (r3 != 0) goto L_0x006c
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r5 != r3) goto L_0x0074
            L_0x006c:
                vt.l r5 = new vt.l
                r5.<init>(r4, r1, r2)
                r13.u(r5)
            L_0x0074:
                r7 = r5
                nI.a r7 = (nI.C17631a) r7
                r13.P()
                int r3 = r14 << 6
                r3 = r3 & 896(0x380, float:1.256E-42)
                r9 = r3 | 48
                r10 = 0
                r5 = 1
                r6 = r12
                r8 = r13
                vt.Z.d(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x003d
            L_0x0088:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0091
                U0.C4895p.R()
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12247k.b.b(androidx.compose.ui.d, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((androidx.compose.ui.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.k$c */
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f105623b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Gt.d f105624c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105625d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105626e;

        c(androidx.compose.ui.d dVar, f fVar, Gt.d dVar2, C17642l<? super C10749l, C16807N> lVar, C17642l<? super It.q, C16807N> lVar2) {
            this.f105622a = dVar;
            this.f105623b = fVar;
            this.f105624c = dVar2;
            this.f105625d = lVar;
            this.f105626e = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, C17642l lVar2) {
            lVar.invoke(new C10749l.j(C11991a.C2461a.CHANGE_STORE_BUTTON));
            lVar2.invoke(q.x.f82408a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, C17642l lVar2, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C10749l.C1615l(C11991a.f.OPENING_HOURS_HEADER));
            lVar2.invoke(new q.E(str));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(U0.C4889m r10, int r11) {
            /*
                r9 = this;
                r0 = r11 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r10.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r10.L()
                goto L_0x00a8
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.instore.impl.composables.storeselected.StoreHeader.<anonymous> (BackLayerContent.kt:244)"
                r2 = -1371626617(0xffffffffae3ea387, float:-4.334624E-11)
                U0.C4895p.S(r2, r11, r0, r1)
            L_0x0020:
                androidx.compose.ui.d r11 = r9.f105622a
                androidx.compose.ui.d r11 = TC.e.i(r11)
                java.lang.String r0 = "store_selected_store_header"
                androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r11, r0)
                Gt.f r1 = r9.f105623b
                Gt.d r2 = r9.f105624c
                r11 = 1189026801(0x46df1bf1, float:28557.97)
                r10.W(r11)
                nI.l<It.l, XH.N> r11 = r9.f105625d
                boolean r11 = r10.V(r11)
                nI.l<It.q, XH.N> r0 = r9.f105626e
                boolean r0 = r10.V(r0)
                r11 = r11 | r0
                nI.l<It.l, XH.N> r0 = r9.f105625d
                nI.l<It.q, XH.N> r3 = r9.f105626e
                java.lang.Object r4 = r10.D()
                if (r11 != 0) goto L_0x0055
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r4 != r11) goto L_0x005d
            L_0x0055:
                vt.m r4 = new vt.m
                r4.<init>(r0, r3)
                r10.u(r4)
            L_0x005d:
                r3 = r4
                nI.a r3 = (nI.C17631a) r3
                r10.P()
                r11 = 1189039055(0x46df4bcf, float:28581.904)
                r10.W(r11)
                nI.l<It.l, XH.N> r11 = r9.f105625d
                boolean r11 = r10.V(r11)
                nI.l<It.q, XH.N> r0 = r9.f105626e
                boolean r0 = r10.V(r0)
                r11 = r11 | r0
                nI.l<It.l, XH.N> r0 = r9.f105625d
                nI.l<It.q, XH.N> r4 = r9.f105626e
                java.lang.Object r6 = r10.D()
                if (r11 != 0) goto L_0x0088
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r6 != r11) goto L_0x0090
            L_0x0088:
                vt.n r6 = new vt.n
                r6.<init>(r0, r4)
                r10.u(r6)
            L_0x0090:
                r4 = r6
                nI.l r4 = (nI.C17642l) r4
                r10.P()
                int r11 = IC.C13023e.f110931a
                int r7 = r11 << 3
                r8 = 0
                r6 = r10
                ut.J0.m(r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x00a8
                U0.C4895p.R()
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12247k.c.c(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.k$d */
    static final class d implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f105627a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B.c f105629c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105630d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105631e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C5667g, C16807N> f105632f;

        d(boolean z10, androidx.compose.ui.d dVar, B.c cVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3) {
            this.f105627a = z10;
            this.f105628b = dVar;
            this.f105629c = cVar;
            this.f105630d = lVar;
            this.f105631e = lVar2;
            this.f105632f = lVar3;
        }

        private static final float i(C4899r0<h> r0Var) {
            return r0Var.getValue().G();
        }

        /* access modifiers changed from: private */
        public static final n j(C4899r0 r0Var, c2.d dVar) {
            C17542s.j(dVar, "$this$offset");
            return n.b(o.a(0, dVar.K0(i(r0Var))));
        }

        /* access modifiers changed from: private */
        public static final C16807N k() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(x xVar) {
            C17542s.j(xVar, "$this$semantics");
            v.z(xVar);
            return C16807N.f139792a;
        }

        private static final void n(C4899r0<h> r0Var, float f10) {
            r0Var.setValue(h.m(f10));
        }

        /* access modifiers changed from: private */
        public static final C16807N p(c2.d dVar, C4899r0 r0Var, r rVar) {
            n(r0Var, dVar.H(r.g(rVar.k())));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(c2.d dVar, C4899r0 r0Var, r rVar) {
            n(r0Var, dVar.H(r.g(rVar.k())));
            return C16807N.f139792a;
        }

        public final void h(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-66375946, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.backLayerContent.<anonymous> (BackLayerContent.kt:75)");
                }
                c2.d dVar = (c2.d) mVar2.Q(C5100f0.e());
                boolean z10 = this.f105627a;
                androidx.compose.ui.d dVar2 = this.f105628b;
                B.c cVar2 = this.f105629c;
                C17642l<It.q, C16807N> lVar = this.f105630d;
                C17642l<C10749l, C16807N> lVar2 = this.f105631e;
                C17642l<C5667g, C16807N> lVar3 = this.f105632f;
                d.a aVar = androidx.compose.ui.d.f18749a;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar2.d());
                C5079j jVar = C5079j.f18125a;
                mVar2.W(-385934665);
                Object D10 = mVar.D();
                C4889m.a aVar3 = C4889m.f14007a;
                if (D10 == aVar3.a()) {
                    D10 = u1.e(h.m(h.B((float) 0)), (o1) null, 2, (Object) null);
                    mVar2.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                if (z10) {
                    mVar2.W(921034628);
                    mVar2.W(-385927111);
                    boolean V10 = mVar2.V(dVar);
                    Object D11 = mVar.D();
                    if (V10 || D11 == aVar3.a()) {
                        D11 = new C12254o(dVar, r0Var);
                        mVar2.u(D11);
                    }
                    mVar.P();
                    C12247k.k(cVar2, lVar, lVar2, g.a(dVar2, (C17642l) D11), lVar3, mVar, 0, 0);
                    mVar.P();
                } else if (!z10) {
                    mVar2.W(921517174);
                    mVar2.W(-385910751);
                    boolean V11 = mVar2.V(dVar);
                    Object D12 = mVar.D();
                    if (V11 || D12 == aVar3.a()) {
                        D12 = new C12255p(dVar, r0Var);
                        mVar2.u(D12);
                    }
                    mVar.P();
                    C12247k.v(cVar2, lVar, lVar2, androidx.compose.animation.f.b(g.a(dVar2, (C17642l) D12), C5548j.j(900, 0, (C5525D) null, 6, (Object) null), (p) null, 2, (Object) null), lVar3, mVar, 0, 0);
                    mVar.P();
                } else {
                    mVar2.W(-385932114);
                    mVar.P();
                    throw new t();
                }
                androidx.compose.ui.d i12 = J.i(J.h(aVar, 0.0f, 1, (Object) null), i(r0Var));
                mVar2.W(-385881534);
                Object D13 = mVar.D();
                if (D13 == aVar3.a()) {
                    D13 = new C12256q(r0Var);
                    mVar2.u(D13);
                }
                mVar.P();
                androidx.compose.ui.d a13 = A.a(i12, (C17642l) D13);
                mVar2.W(-385878920);
                Object D14 = mVar.D();
                if (D14 == aVar3.a()) {
                    D14 = new C12257r();
                    mVar2.u(D14);
                }
                mVar.P();
                androidx.compose.ui.d d10 = androidx.compose.foundation.d.d(a13, false, (String) null, (i) null, (C17631a) D14, 6, (Object) null);
                mVar2.W(-385877764);
                Object D15 = mVar.D();
                if (D15 == aVar3.a()) {
                    D15 = new C12258s();
                    mVar2.u(D15);
                }
                mVar.P();
                C5077h.a(L1.o.d(d10, false, (C17642l) D15, 1, (Object) null), mVar2, 0);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            h((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void A(Gt.f r17, Gt.d r18, nI.C17642l<? super It.q, XH.C16807N> r19, androidx.compose.ui.d r20, nI.C17642l<? super It.C10749l, XH.C16807N> r21, U0.C4889m r22, int r23, int r24) {
        /*
            r6 = r18
            r7 = r23
            r0 = 2073662219(0x7b99930b, float:1.5948076E36)
            r1 = r22
            U0.m r14 = r1.k(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r7 | 6
            r15 = r17
            goto L_0x0028
        L_0x0016:
            r1 = r7 & 6
            r15 = r17
            if (r1 != 0) goto L_0x0027
            boolean r1 = r14.F(r15)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r7
            goto L_0x0028
        L_0x0027:
            r1 = r7
        L_0x0028:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x0048
        L_0x002f:
            r2 = r7 & 48
            if (r2 != 0) goto L_0x0048
            r2 = r7 & 64
            if (r2 != 0) goto L_0x003c
            boolean r2 = r14.V(r6)
            goto L_0x0040
        L_0x003c:
            boolean r2 = r14.F(r6)
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2 = 32
            goto L_0x0047
        L_0x0045:
            r2 = 16
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x0051
            r1 = r1 | 384(0x180, float:5.38E-43)
            r13 = r19
            goto L_0x0063
        L_0x0051:
            r2 = r7 & 384(0x180, float:5.38E-43)
            r13 = r19
            if (r2 != 0) goto L_0x0063
            boolean r2 = r14.F(r13)
            if (r2 == 0) goto L_0x0060
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r2
        L_0x0063:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r3 = r20
            goto L_0x007e
        L_0x006c:
            r3 = r7 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0069
            r3 = r20
            boolean r4 = r14.V(r3)
            if (r4 == 0) goto L_0x007b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r1 = r1 | r4
        L_0x007e:
            r4 = r24 & 16
            if (r4 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r12 = r21
            goto L_0x0099
        L_0x0087:
            r4 = r7 & 24576(0x6000, float:3.4438E-41)
            r12 = r21
            if (r4 != 0) goto L_0x0099
            boolean r4 = r14.F(r12)
            if (r4 == 0) goto L_0x0096
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r4
        L_0x0099:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r5) goto L_0x00ab
            boolean r4 = r14.l()
            if (r4 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r14.L()
            r4 = r3
            goto L_0x00f0
        L_0x00ab:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x00b4
        L_0x00b2:
            r16 = r3
        L_0x00b4:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00c0
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.instore.impl.composables.storeselected.StoreHeader (BackLayerContent.kt:242)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00c0:
            vt.k$c r8 = new vt.k$c
            r0 = r8
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r21
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = -1371626617(0xffffffffae3ea387, float:-4.334624E-11)
            r2 = 1
            c1.a r10 = c1.c.e(r1, r2, r8, r14, r0)
            r0 = 390(0x186, float:5.47E-43)
            r1 = 2
            r8 = 0
            r9 = 0
            r11 = r14
            r12 = r0
            r13 = r1
            tK.C18025p.e(r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ee
            U0.C4895p.R()
        L_0x00ee:
            r4 = r16
        L_0x00f0:
            U0.Y0 r8 = r14.n()
            if (r8 == 0) goto L_0x010b
            vt.j r9 = new vt.j
            r0 = r9
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12247k.A(Gt.f, Gt.d, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N B(f fVar, Gt.d dVar, C17642l lVar, androidx.compose.ui.d dVar2, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        A(fVar, dVar, lVar, dVar2, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void F(t0.x xVar, B.c cVar, boolean z10, androidx.compose.ui.d dVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, C17642l<? super C5667g, C16807N> lVar3) {
        C17542s.j(xVar, "<this>");
        C17542s.j(cVar, "state");
        C17542s.j(dVar, "modifier");
        C17542s.j(lVar, "action");
        C17542s.j(lVar2, "analyticsAction");
        C17542s.j(lVar3, "shortcutCarouselPosition");
        t0.x.i(xVar, (Object) null, (Object) null, c1.c.c(-66375946, true, new d(z10, dVar, cVar, lVar, lVar2, lVar3)), 3, (Object) null);
    }

    private static final C5437c.C0386c G(int i10, int i11) {
        C5437c.a aVar = C5437c.f24302a;
        C5437c.C0386c i12 = aVar.i();
        if (i10 < i11) {
            i12 = null;
        }
        return i12 == null ? aVar.l() : i12;
    }

    private static final androidx.compose.ui.d H(androidx.compose.ui.d dVar, long j10, float f10) {
        return androidx.compose.ui.draw.b.d(dVar, new C12241h(C5728l0.a.g(C5728l0.f27325b, C16877v.q(C5747v0.k(C5747v0.f27350b.h()), C5747v0.k(j10)), C5668h.a(f10, Float.POSITIVE_INFINITY), C5668h.a(0.0f, Float.POSITIVE_INFINITY), 0, 8, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C5728l0 l0Var, C5817c cVar) {
        C17542s.j(cVar, "$this$drawWithContent");
        cVar.V1();
        r1.f.M0(cVar, l0Var, 0, 0, 0.0f, (r1.g) null, (C5749w0) null, 0, 126, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(It.B.c r35, nI.C17642l<? super It.q, XH.C16807N> r36, nI.C17642l<? super It.C10749l, XH.C16807N> r37, androidx.compose.ui.d r38, nI.C17642l<? super o1.C5667g, XH.C16807N> r39, U0.C4889m r40, int r41, int r42) {
        /*
            r5 = r39
            r6 = r41
            r0 = -2144127129(0xffffffff80333767, float:-4.703485E-39)
            r1 = r40
            U0.m r1 = r1.k(r0)
            r2 = r42 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r6 | 6
            r3 = r2
            r2 = r35
            goto L_0x002b
        L_0x0017:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r35
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r6
            goto L_0x002b
        L_0x0028:
            r2 = r35
            r3 = r6
        L_0x002b:
            r4 = r42 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r36
            goto L_0x0046
        L_0x0034:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r36
            boolean r8 = r1.F(r4)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r3 = r3 | r8
        L_0x0046:
            r8 = r42 & 4
            if (r8 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
            r15 = r37
            goto L_0x0061
        L_0x004f:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r15 = r37
            if (r8 != 0) goto L_0x0061
            boolean r8 = r1.F(r15)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r8
        L_0x0061:
            r8 = r42 & 8
            if (r8 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r38
            goto L_0x007c
        L_0x006a:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r38
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r10
        L_0x007c:
            r10 = r42 & 16
            if (r10 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0083:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0093
            boolean r10 = r1.F(r5)
            if (r10 == 0) goto L_0x0090
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r3 = r3 | r10
        L_0x0093:
            r10 = r3 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r11) goto L_0x00a6
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            r1.L()
            r4 = r9
            goto L_0x02f7
        L_0x00a6:
            if (r8 == 0) goto L_0x00ac
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r13 = r8
            goto L_0x00ad
        L_0x00ac:
            r13 = r9
        L_0x00ad:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00b9
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.instore.impl.composables.storeselected.BackLayerLandscape (BackLayerContent.kt:131)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x00b9:
            It.p r0 = r35.f()
            U0.I0 r8 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r8 = r1.Q(r8)
            r12 = r8
            c2.d r12 = (c2.d) r12
            r8 = 24
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            float r11 = r12.H1(r8)
            r8 = -70194885(0xfffffffffbd0e93b, float:-2.1694564E36)
            r1.W(r8)
            java.lang.Object r8 = r1.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r9 = r16.a()
            r10 = 0
            if (r8 != r9) goto L_0x00ed
            U0.o0 r8 = U0.C4877g1.a(r10)
            r1.u(r8)
        L_0x00ed:
            U0.o0 r8 = (U0.C4894o0) r8
            r1.P()
            r9 = -70192709(0xfffffffffbd0f1bb, float:-2.1698012E36)
            r1.W(r9)
            java.lang.Object r9 = r1.D()
            java.lang.Object r14 = r16.a()
            if (r9 != r14) goto L_0x0109
            U0.o0 r9 = U0.C4877g1.a(r10)
            r1.u(r9)
        L_0x0109:
            r14 = r9
            U0.o0 r14 = (U0.C4894o0) r14
            r1.P()
            r9 = -70190877(0xfffffffffbd0f8e3, float:-2.1700915E36)
            r1.W(r9)
            java.lang.Object r9 = r1.D()
            java.lang.Object r10 = r16.a()
            if (r9 != r10) goto L_0x012b
            vt.c r9 = new vt.c
            r9.<init>(r8, r14)
            U0.A1 r9 = U0.p1.e(r9)
            r1.u(r9)
        L_0x012b:
            U0.A1 r9 = (U0.A1) r9
            r1.P()
            r10 = 12
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            r7 = 0
            r2 = 0
            r24 = r14
            r14 = 1
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.J.h(r13, r7, r14, r2)
            tK.v r2 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r19 = r2.a(r1, r7)
            long r19 = r19.B0()
            r22 = 2
            r23 = 0
            r21 = 0
            androidx.compose.ui.d r18 = androidx.compose.foundation.b.d(r18, r19, r21, r22, r23)
            r14 = 32
            float r14 = (float) r14
            float r21 = c2.h.B(r14)
            r22 = 5
            r14 = 0
            r20 = 0
            r17 = r18
            r18 = r14
            r19 = r10
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            i1.c$c r9 = u(r9)
            androidx.compose.foundation.layout.d r17 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r4 = r17.f()
            r6 = 0
            E1.I r4 = androidx.compose.foundation.layout.G.b(r4, r9, r1, r6)
            int r9 = U0.C4883j.a(r1, r6)
            U0.y r6 = r1.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r1, r14)
            G1.g$a r17 = G1.C4504g.f6515W
            r18 = r7
            nI.a r7 = r17.a()
            U0.f r19 = r1.m()
            if (r19 != 0) goto L_0x0198
            U0.C4883j.c()
        L_0x0198:
            r1.I()
            boolean r19 = r1.i()
            if (r19 == 0) goto L_0x01a5
            r1.p(r7)
            goto L_0x01a8
        L_0x01a5:
            r1.t()
        L_0x01a8:
            U0.m r7 = U0.F1.a(r1)
            r19 = r10
            nI.p r10 = r17.c()
            U0.F1.c(r7, r4, r10)
            nI.p r4 = r17.e()
            U0.F1.c(r7, r6, r4)
            nI.p r4 = r17.b()
            boolean r6 = r7.i()
            if (r6 != 0) goto L_0x01d4
            java.lang.Object r6 = r7.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x01e2
        L_0x01d4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7.w(r6, r4)
        L_0x01e2:
            nI.p r4 = r17.d()
            U0.F1.c(r7, r14, r4)
            s0.N r4 = s0.C5843N.f28726a
            Gt.f r7 = r0.c()
            Gt.d r0 = r0.a()
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r29 = 2
            r30 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r25 = r4
            r26 = r6
            androidx.compose.ui.d r9 = s0.C5842M.e(r25, r26, r27, r28, r29, r30)
            r10 = -2035016386(0xffffffff86b41d3e, float:-6.775144E-35)
            r1.W(r10)
            java.lang.Object r10 = r1.D()
            java.lang.Object r14 = r16.a()
            if (r10 != r14) goto L_0x021d
            vt.d r10 = new vt.d
            r10.<init>(r8)
            r1.u(r10)
        L_0x021d:
            nI.l r10 = (nI.C17642l) r10
            r1.P()
            androidx.compose.ui.d r10 = androidx.compose.ui.layout.g.a(r9, r10)
            int r8 = IC.C13023e.f110931a
            int r8 = r8 << 3
            int r14 = r3 << 3
            r9 = r14 & 896(0x380, float:1.256E-42)
            r8 = r8 | r9
            int r9 = r3 << 6
            r17 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r17
            r20 = r8 | r9
            r21 = 0
            r9 = r18
            r8 = r0
            r0 = r9
            r9 = r36
            r31 = r19
            r18 = 0
            r32 = r11
            r11 = r37
            r33 = r12
            r12 = r1
            r19 = r13
            r13 = r20
            r34 = r14
            r15 = r24
            r20 = 1
            r14 = r21
            A(r7, r8, r9, r10, r11, r12, r13, r14)
            It.p r7 = r35.f()
            KJ.c r7 = r7.b()
            r29 = 2
            r30 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r25 = r4
            r26 = r6
            androidx.compose.ui.d r4 = s0.C5842M.e(r25, r26, r27, r28, r29, r30)
            r6 = -2035005821(0xffffffff86b44683, float:-6.781208E-35)
            r1.W(r6)
            java.lang.Object r6 = r1.D()
            java.lang.Object r8 = r16.a()
            if (r6 != r8) goto L_0x028a
            vt.e r6 = new vt.e
            r6.<init>(r15)
            r1.u(r6)
        L_0x028a:
            nI.l r6 = (nI.C17642l) r6
            r1.P()
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.g.a(r4, r6)
            tK.h r0 = r2.a(r1, r0)
            long r8 = r0.B0()
            r0 = r32
            androidx.compose.ui.d r0 = H(r4, r8, r0)
            r2 = -2034997091(0xffffffff86b4689d, float:-6.786219E-35)
            r1.W(r2)
            r8 = r33
            boolean r2 = r1.V(r8)
            r4 = r3 & r17
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r4 != r6) goto L_0x02b6
            r10 = r20
            goto L_0x02b8
        L_0x02b6:
            r10 = r18
        L_0x02b8:
            r2 = r2 | r10
            java.lang.Object r4 = r1.D()
            if (r2 != 0) goto L_0x02c5
            java.lang.Object r2 = r16.a()
            if (r4 != r2) goto L_0x02cf
        L_0x02c5:
            vt.f r4 = new vt.f
            r2 = r31
            r4.<init>(r8, r5, r2)
            r1.u(r4)
        L_0x02cf:
            nI.l r4 = (nI.C17642l) r4
            r1.P()
            androidx.compose.ui.d r9 = androidx.compose.ui.layout.e.a(r0, r4)
            r0 = r3 & 112(0x70, float:1.57E-43)
            r2 = r34
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r12 = r0 | r2
            r13 = 0
            r8 = r36
            r10 = r37
            r11 = r1
            y(r7, r8, r9, r10, r11, r12, r13)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02f5
            U0.C4895p.R()
        L_0x02f5:
            r4 = r19
        L_0x02f7:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x0312
            vt.g r9 = new vt.g
            r0 = r9
            r1 = r35
            r2 = r36
            r3 = r37
            r5 = r39
            r6 = r41
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12247k.k(It.B$c, nI.l, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C4894o0 o0Var, r rVar) {
        q(o0Var, r.g(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C4894o0 o0Var, r rVar) {
        s(o0Var, r.g(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(c2.d dVar, C17642l lVar, float f10, C4488v vVar) {
        C17542s.j(vVar, "it");
        long e10 = C4489w.e(vVar);
        lVar.invoke(C5667g.d(C5667g.g(e10, 0.0f, C5667g.n(e10) + ((float) dVar.K0(f10)), 1, (Object) null)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(B.c cVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        k(cVar, lVar, lVar2, dVar, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final int p(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void q(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final int r(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void s(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C5437c.C0386c t(C4894o0 o0Var, C4894o0 o0Var2) {
        return G(p(o0Var), r(o0Var2));
    }

    private static final C5437c.C0386c u(A1<? extends C5437c.C0386c> a12) {
        return (C5437c.C0386c) a12.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(It.B.c r28, nI.C17642l<? super It.q, XH.C16807N> r29, nI.C17642l<? super It.C10749l, XH.C16807N> r30, androidx.compose.ui.d r31, nI.C17642l<? super o1.C5667g, XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r28
            r10 = r29
            r11 = r30
            r12 = r32
            r13 = r34
            r0 = 16
            r2 = 4
            r14 = 6
            r3 = 2020259151(0x786ab54f, float:1.9041794E34)
            r4 = r33
            U0.m r15 = r4.k(r3)
            r9 = 1
            r4 = r35 & 1
            r8 = 2
            if (r4 == 0) goto L_0x0020
            r4 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r4 = r13 & 6
            if (r4 != 0) goto L_0x002f
            boolean r4 = r15.F(r1)
            if (r4 == 0) goto L_0x002c
            r4 = r2
            goto L_0x002d
        L_0x002c:
            r4 = r8
        L_0x002d:
            r4 = r4 | r13
            goto L_0x0030
        L_0x002f:
            r4 = r13
        L_0x0030:
            r5 = r35 & 2
            r6 = 32
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x0047
        L_0x0039:
            r5 = r13 & 48
            if (r5 != 0) goto L_0x0047
            boolean r5 = r15.F(r10)
            if (r5 == 0) goto L_0x0045
            r5 = r6
            goto L_0x0046
        L_0x0045:
            r5 = r0
        L_0x0046:
            r4 = r4 | r5
        L_0x0047:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x004e
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x005e
            boolean r2 = r15.F(r11)
            if (r2 == 0) goto L_0x005b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r2
        L_0x005e:
            r2 = r35 & 8
            if (r2 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r5 = r31
            goto L_0x0079
        L_0x0067:
            r5 = r13 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0064
            r5 = r31
            boolean r7 = r15.V(r5)
            if (r7 == 0) goto L_0x0076
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r7
        L_0x0079:
            r0 = r35 & 16
            if (r0 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r0 = r4
            goto L_0x0092
        L_0x0081:
            r0 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x007f
            boolean r0 = r15.F(r12)
            if (r0 == 0) goto L_0x008e
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r0
            goto L_0x007f
        L_0x0092:
            r4 = r0 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r7) goto L_0x00a6
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x009f
            goto L_0x00a6
        L_0x009f:
            r15.L()
            r4 = r5
            r2 = r15
            goto L_0x02a9
        L_0x00a6:
            if (r2 == 0) goto L_0x00ac
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r7 = r2
            goto L_0x00ad
        L_0x00ac:
            r7 = r5
        L_0x00ad:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00b9
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.instore.impl.composables.storeselected.BackLayerPortrait (BackLayerContent.kt:191)"
            U0.C4895p.S(r3, r0, r2, r4)
        L_0x00b9:
            It.p r2 = r28.f()
            U0.I0 r3 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r3 = r15.Q(r3)
            r5 = r3
            c2.d r5 = (c2.d) r5
            r3 = 12
            float r3 = (float) r3
            float r4 = c2.h.B(r3)
            r3 = 0
            r31 = r5
            r5 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r7, r3, r9, r5)
            tK.v r3 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r15, r5)
            long r17 = r3.B0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            float r3 = (float) r6
            float r20 = c2.h.B(r3)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r18 = r4
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c r6 = r5.o()
            r9 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r9)
            int r17 = U0.C4883j.a(r15, r9)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r14 = r19.a()
            U0.f r21 = r15.m()
            if (r21 != 0) goto L_0x0126
            U0.C4883j.c()
        L_0x0126:
            r15.I()
            boolean r21 = r15.i()
            if (r21 == 0) goto L_0x0133
            r15.p(r14)
            goto L_0x0136
        L_0x0133:
            r15.t()
        L_0x0136:
            U0.m r14 = U0.F1.a(r15)
            nI.p r9 = r19.c()
            U0.F1.c(r14, r6, r9)
            nI.p r6 = r19.e()
            U0.F1.c(r14, r8, r6)
            nI.p r6 = r19.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x0160
            java.lang.Object r8 = r14.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 != 0) goto L_0x016e
        L_0x0160:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r14.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            r14.w(r8, r6)
        L_0x016e:
            nI.p r6 = r19.d()
            U0.F1.c(r14, r3, r6)
            androidx.compose.foundation.layout.j r3 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$b r5 = r5.k()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r15, r9)
            int r5 = U0.C4883j.a(r15, r9)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r14)
            nI.a r9 = r19.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x01a1
            U0.C4883j.c()
        L_0x01a1:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x01ae
            r15.p(r9)
            goto L_0x01b1
        L_0x01ae:
            r15.t()
        L_0x01b1:
            U0.m r9 = U0.F1.a(r15)
            r17 = r4
            nI.p r4 = r19.c()
            U0.F1.c(r9, r3, r4)
            nI.p r3 = r19.e()
            U0.F1.c(r9, r6, r3)
            nI.p r3 = r19.b()
            boolean r4 = r9.i()
            if (r4 != 0) goto L_0x01dd
            java.lang.Object r4 = r9.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x01eb
        L_0x01dd:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9.w(r4, r3)
        L_0x01eb:
            nI.p r3 = r19.d()
            U0.F1.c(r9, r8, r3)
            s0.h r19 = s0.C5862h.f28810a
            Gt.f r3 = r2.c()
            Gt.d r4 = r2.a()
            int r2 = IC.C13023e.f110931a
            int r2 = r2 << 3
            int r5 = r0 << 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r2 = r2 | r5
            r5 = 6
            int r6 = r0 << 6
            r22 = 57344(0xe000, float:8.0356E-41)
            r5 = r6 & r22
            r8 = r2 | r5
            r9 = 8
            r5 = 0
            r2 = r3
            r6 = 0
            r3 = r4
            r25 = r17
            r4 = r29
            r26 = r31
            r6 = r30
            r27 = r7
            r7 = r15
            r13 = 1
            A(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = r28.l()
            r16 = r2 ^ 1
            r2 = -2000413538(0xffffffff88c41c9e, float:-1.1803049E-33)
            r15.W(r2)
            r3 = r26
            boolean r2 = r15.V(r3)
            r0 = r0 & r22
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r4) goto L_0x023e
            r9 = r13
            goto L_0x023f
        L_0x023e:
            r9 = 0
        L_0x023f:
            r0 = r2 | r9
            java.lang.Object r2 = r15.D()
            if (r0 != 0) goto L_0x024f
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0259
        L_0x024f:
            vt.a r2 = new vt.a
            r0 = r25
            r2.<init>(r3, r12, r0)
            r15.u(r2)
        L_0x0259:
            nI.l r2 = (nI.C17642l) r2
            r15.P()
            androidx.compose.ui.d r17 = androidx.compose.ui.layout.e.a(r14, r2)
            r0 = 900(0x384, float:1.261E-42)
            r2 = 0
            r3 = 0
            r4 = 6
            m0.y0 r5 = m0.C5548j.j(r0, r3, r2, r4, r2)
            r6 = 2
            r7 = 0
            androidx.compose.animation.i r18 = androidx.compose.animation.g.o(r5, r7, r6, r2)
            m0.y0 r0 = m0.C5548j.j(r0, r3, r2, r4, r2)
            androidx.compose.animation.k r0 = androidx.compose.animation.g.q(r0, r7, r6, r2)
            vt.k$a r2 = new vt.k$a
            r2.<init>(r1, r10, r11)
            r3 = 54
            r4 = 343012603(0x1471f4fb, float:1.22157045E-26)
            c1.a r21 = c1.c.e(r4, r13, r2, r15, r3)
            r23 = 1797126(0x1b6c06, float:2.51831E-39)
            r24 = 0
            java.lang.String r20 = "shortcut carousel animation"
            r2 = r15
            r15 = r19
            r19 = r0
            r22 = r2
            l0.d.e(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.x()
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a7
            U0.C4895p.R()
        L_0x02a7:
            r4 = r27
        L_0x02a9:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x02c4
            vt.b r9 = new vt.b
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r32
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12247k.v(It.B$c, nI.l, nI.l, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N w(c2.d dVar, C17642l lVar, float f10, C4488v vVar) {
        C17542s.j(vVar, "it");
        long e10 = C4489w.e(vVar);
        lVar.invoke(C5667g.d(C5667g.g(e10, 0.0f, C5667g.n(e10) + ((float) dVar.K0(f10)), 1, (Object) null)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(B.c cVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        v(cVar, lVar, lVar2, dVar, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(C15987c<? extends C> cVar, C17642l<? super It.q, C16807N> lVar, androidx.compose.ui.d dVar, C17642l<? super C10749l, C16807N> lVar2, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(424131024);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? k10.V(cVar) : k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(lVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(424131024, i12, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ShortcutsCarousel (BackLayerContent.kt:276)");
            }
            L.b(false, C5116k1.a(dVar, "store_selected_shortcuts_carousel"), D.c(h.B((float) 12), 0.0f, 2, (Object) null), c1.c.e(2006998123, true, new b(cVar, lVar, lVar2), k10, 54), k10, 3462, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12243i(cVar, lVar, dVar2, lVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C15987c cVar, C17642l lVar, androidx.compose.ui.d dVar, C17642l lVar2, int i10, int i11, C4889m mVar, int i12) {
        y(cVar, lVar, dVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
