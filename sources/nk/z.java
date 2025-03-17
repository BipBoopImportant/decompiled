package nk;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import iB.C14549a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import pk.s;
import u0.C5968C;
import u0.C5972G;
import u0.C5979c;
import u0.C5991o;
import u0.C5993q;
import uk.A1;
import uk.B1;
import uk.C1;
import uk.C12006B;
import uk.C12007C;
import uk.C12008D;
import uk.C12056w;
import uk.D1;
import uk.E;
import uk.F;
import vk.C12134F;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu0/C;", "Lpk/s;", "state", "", "expandedWidth", "", "columns", "Lkotlin/Function1;", "Luk/w;", "LXH/N;", "onScreenAction", "e", "(Lu0/C;Lpk/s;ZILnI/l;)V", "Lpk/s$d;", "g", "(Lu0/C;Lpk/s$d;IZLnI/l;)V", "Lpk/s$d$a;", "i", "(Lu0/C;Lpk/s$d$a;ILnI/l;)V", "Lpk/s$h;", "k", "(Lu0/C;Lpk/s$h;ILnI/l;)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f99920a;

        a(C17642l<? super C12056w, C16807N> lVar) {
            this.f99920a = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C12008D.f103442a);
            return C16807N.f139792a;
        }

        public final void b(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(868803369, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.addInspirationItems.<anonymous> (ShoppingListInspirationUi.kt:46)");
                }
                mVar.W(-1179154523);
                boolean V10 = mVar.V(this.f99920a);
                C17642l<C12056w, C16807N> lVar = this.f99920a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new y(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                C11638b.b((C17631a) D10, (androidx.compose.ui.d) null, mVar, 0, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.d f99921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f99922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f99923c;

        b(s.d dVar, boolean z10, C17642l<? super C12056w, C16807N> lVar) {
            this.f99921a = dVar;
            this.f99922b = z10;
            this.f99923c = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C12056w.l(new C1(str, Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_COMPLIMENT_CAROUSEL, false)));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C17642l lVar, A1 a12) {
            C17542s.j(a12, "it");
            lVar.invoke(new C12006B(a12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C17642l lVar, B1 b12) {
            C17542s.j(b12, "it");
            lVar.invoke(new C12056w.b(b12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new F(str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C12056w.j(str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(C17642l lVar, Link link) {
            C17542s.j(link, "it");
            lVar.invoke(new C12056w.k(link));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(u0.C5991o r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r13 = r15 & 17
                r0 = 16
                if (r13 != r0) goto L_0x0017
                boolean r13 = r14.l()
                if (r13 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r14.L()
                goto L_0x0134
            L_0x0017:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0026
                r13 = -1
                java.lang.String r0 = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.complementListCarousel.<anonymous> (ShoppingListInspirationUi.kt:74)"
                r1 = -165192996(0xfffffffff6275adc, float:-8.4859026E32)
                U0.C4895p.S(r1, r15, r13, r0)
            L_0x0026:
                pk.s$d r2 = r12.f99921a
                boolean r3 = r12.f99922b
                r13 = 611055804(0x246bf8bc, float:5.1168188E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0046
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x004e
            L_0x0046:
                nk.A r0 = new nk.A
                r0.<init>(r15)
                r14.u(r0)
            L_0x004e:
                r4 = r0
                nI.l r4 = (nI.C17642l) r4
                r14.P()
                r13 = 611047144(0x246bd6e8, float:5.1139535E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0070
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x0078
            L_0x0070:
                nk.B r0 = new nk.B
                r0.<init>(r15)
                r14.u(r0)
            L_0x0078:
                r5 = r0
                nI.l r5 = (nI.C17642l) r5
                r14.P()
                r13 = 611067719(0x246c2747, float:5.1207612E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x009a
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00a2
            L_0x009a:
                nk.C r0 = new nk.C
                r0.<init>(r15)
                r14.u(r0)
            L_0x00a2:
                r6 = r0
                nI.l r6 = (nI.C17642l) r6
                r14.P()
                r13 = 611051432(0x246be7a8, float:5.1153723E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x00c4
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00cc
            L_0x00c4:
                nk.D r0 = new nk.D
                r0.<init>(r15)
                r14.u(r0)
            L_0x00cc:
                r7 = r0
                nI.l r7 = (nI.C17642l) r7
                r14.P()
                r13 = 611073793(0x246c3f01, float:5.122771E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x00ee
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00f6
            L_0x00ee:
                nk.E r0 = new nk.E
                r0.<init>(r15)
                r14.u(r0)
            L_0x00f6:
                r8 = r0
                nI.l r8 = (nI.C17642l) r8
                r14.P()
                r13 = 611078136(0x246c4ff8, float:5.124208E-17)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99923c
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99923c
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0118
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x0120
            L_0x0118:
                nk.F r0 = new nk.F
                r0.<init>(r15)
                r14.u(r0)
            L_0x0120:
                r9 = r0
                nI.l r9 = (nI.C17642l) r9
                r14.P()
                r11 = 0
                r10 = r14
                nk.C11645i.l(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0134
                U0.C4895p.R()
            L_0x0134:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk.z.b.i(u0.o, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.d.a f99924a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f99925b;

        c(s.d.a aVar, C17642l<? super C12056w, C16807N> lVar) {
            this.f99924a = aVar;
            this.f99925b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C12007C(str));
            return C16807N.f139792a;
        }

        public final void b(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1349868973, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.inspirationImages.<anonymous> (ShoppingListInspirationUi.kt:118)");
                }
                C15987c<C14549a> a10 = this.f99924a.a();
                mVar.W(1174449770);
                boolean V10 = mVar.V(this.f99925b);
                C17642l<C12056w, C16807N> lVar = this.f99925b;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C11633G(lVar);
                    mVar.u(D10);
                }
                mVar.P();
                C11650n.g(a10, (C17642l) D10, (androidx.compose.ui.d) null, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.h f99926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f99927b;

        d(s.h hVar, C17642l<? super C12056w, C16807N> lVar) {
            this.f99926a = hVar;
            this.f99927b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C17642l lVar, C1 c12) {
            C17542s.j(c12, "it");
            lVar.invoke(new C12056w.l(c12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C17642l lVar, Link link) {
            C17542s.j(link, "it");
            lVar.invoke(new C12056w.k(link));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C17642l lVar, A1 a12) {
            C17542s.j(a12, "it");
            lVar.invoke(new C12006B(a12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(C17642l lVar, D1 d12) {
            C17542s.j(d12, "it");
            lVar.invoke(new E(d12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new F(str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N s(C17642l lVar, B1 b12) {
            C17542s.j(b12, "it");
            lVar.invoke(new C12056w.b(b12));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N t(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C12056w.j(str));
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            j((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(u0.C5991o r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r13 = r15 & 17
                r0 = 16
                if (r13 != r0) goto L_0x0017
                boolean r13 = r14.l()
                if (r13 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r14.L()
                goto L_0x015c
            L_0x0017:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0026
                r13 = -1
                java.lang.String r0 = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.recommendedForYouCarousel.<anonymous> (ShoppingListInspirationUi.kt:137)"
                r1 = -1140815322(0xffffffffbc008a26, float:-0.007845437)
                U0.C4895p.S(r1, r15, r13, r0)
            L_0x0026:
                pk.s$h r2 = r12.f99926a
                r13 = -813117392(0xffffffffcf88d030, float:-4.5906903E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0044
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x004c
            L_0x0044:
                nk.H r0 = new nk.H
                r0.<init>(r15)
                r14.u(r0)
            L_0x004c:
                r3 = r0
                nI.l r3 = (nI.C17642l) r3
                r14.P()
                r13 = -813112568(0xffffffffcf88e308, float:-4.5931602E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x006e
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x0076
            L_0x006e:
                nk.I r0 = new nk.I
                r0.<init>(r15)
                r14.u(r0)
            L_0x0076:
                r4 = r0
                nI.l r4 = (nI.C17642l) r4
                r14.P()
                r13 = -813105968(0xffffffffcf88fcd0, float:-4.5965394E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0098
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00a0
            L_0x0098:
                nk.J r0 = new nk.J
                r0.<init>(r15)
                r14.u(r0)
            L_0x00a0:
                r5 = r0
                nI.l r5 = (nI.C17642l) r5
                r14.P()
                r13 = -813099567(0xffffffffcf8915d1, float:-4.5998167E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x00c2
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00ca
            L_0x00c2:
                nk.K r0 = new nk.K
                r0.<init>(r15)
                r14.u(r0)
            L_0x00ca:
                r6 = r0
                nI.l r6 = (nI.C17642l) r6
                r14.P()
                r13 = -813095279(0xffffffffcf892691, float:-4.6020122E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x00ec
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x00f4
            L_0x00ec:
                nk.L r0 = new nk.L
                r0.<init>(r15)
                r14.u(r0)
            L_0x00f4:
                r7 = r0
                nI.l r7 = (nI.C17642l) r7
                r14.P()
                r13 = -813091158(0xffffffffcf8936aa, float:-4.6041221E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0116
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x011e
            L_0x0116:
                nk.M r0 = new nk.M
                r0.<init>(r15)
                r14.u(r0)
            L_0x011e:
                r8 = r0
                nI.l r8 = (nI.C17642l) r8
                r14.P()
                r13 = -813086815(0xffffffffcf8947a1, float:-4.6063457E9)
                r14.W(r13)
                nI.l<uk.w, XH.N> r13 = r12.f99927b
                boolean r13 = r14.V(r13)
                nI.l<uk.w, XH.N> r15 = r12.f99927b
                java.lang.Object r0 = r14.D()
                if (r13 != 0) goto L_0x0140
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r0 != r13) goto L_0x0148
            L_0x0140:
                nk.N r0 = new nk.N
                r0.<init>(r15)
                r14.u(r0)
            L_0x0148:
                r9 = r0
                nI.l r9 = (nI.C17642l) r9
                r14.P()
                r11 = 0
                r10 = r14
                nk.t.k(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x015c
                U0.C4895p.R()
            L_0x015c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk.z.d.j(u0.o, U0.m, int):void");
        }
    }

    public static final void e(C5968C c10, s sVar, boolean z10, int i10, C17642l<? super C12056w, C16807N> lVar) {
        C17542s.j(c10, "<this>");
        C17542s.j(sVar, "state");
        C17542s.j(lVar, "onScreenAction");
        s.d g10 = sVar.g();
        if (g10 != null) {
            g(c10, g10, i10, z10, lVar);
            if (g10 instanceof s.d.a) {
                s.d.a aVar = (s.d.a) g10;
                if (!aVar.a().isEmpty()) {
                    i(c10, aVar, i10, lVar);
                }
            }
        }
        if ((sVar.g() instanceof s.d.b) || (sVar.w() instanceof s.h.b)) {
            C12134F.b bVar = C12134F.f104492b;
            c10.d(C12134F.n.f104507c.f104493a, new u(i10), "RecommendationsError", c1.c.c(868803369, true, new a(lVar)));
        }
        s.h w10 = sVar.w();
        if (w10 != null) {
            k(c10, w10, i10, lVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C5979c f(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void g(C5968C c10, s.d dVar, int i10, boolean z10, C17642l<? super C12056w, C16807N> lVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.c.f104495c.f104493a, new w(i10), "ComplementListCarousel", c1.c.c(-165192996, true, new b(dVar, z10, lVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c h(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void i(C5968C c10, s.d.a aVar, int i10, C17642l<? super C12056w, C16807N> lVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.f.f104499c.f104493a, new x(i10), "InspirationImages", c1.c.c(1349868973, true, new c(aVar, lVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c j(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void k(C5968C c10, s.h hVar, int i10, C17642l<? super C12056w, C16807N> lVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.o.f104508c.f104493a, new v(i10), "RecommendedForYouCarousel", c1.c.c(-1140815322, true, new d(hVar, lVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c l(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }
}
