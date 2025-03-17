package BD;

import GD.C12928a;
import GD.C12929b;
import GD.C12930c;
import GD.C12935h;
import GD.k;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.J;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.i;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.v;
import p1.C5728l0;
import p1.C5747v0;
import p1.C5749w0;
import r1.C5817c;
import r1.f;
import r1.g;
import s0.C5857c;
import t1.C5942c;
import xD.C15210g;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ak\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aY\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00070\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lp0/v;", "orientation", "LGD/k$b$e;", "model", "", "showBackOfCard", "Lkotlin/Function0;", "LXH/N;", "requestCardFlip", "Lkotlin/Function1;", "LGD/h;", "onEvent", "onReadyStateChanged", "Landroidx/compose/ui/d;", "modifier", "isLoading", "f", "(Lp0/v;LGD/k$b$e;ZLnI/a;LnI/l;LnI/l;Landroidx/compose/ui/d;ZLU0/m;II)V", "LGD/b;", "header", "Lt1/c;", "qrPainter", "isExpired", "LGD/a;", "background", "onCardDetailsClicked", "Lgs/e$c;", "onImageStateChanged", "j", "(LGD/b;Lt1/c;ZZLGD/a;Lp0/v;LnI/a;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "onBackClick", "LGD/c;", "onCardInfoClick", "onRemoveClick", "h", "(LGD/k$b$e;Lp0/v;LnI/a;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lp1/v0;", "color", "Lp1/l0;", "o", "(Lp0/v;J)Lp1/l0;", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b.e f107965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5942c f107966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f107967c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f107968d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f107969e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107970f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f107971g;

        a(k.b.e eVar, C5942c cVar, boolean z10, v vVar, C17642l<? super C12935h, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super Boolean, C16807N> lVar2) {
            this.f107965a = eVar;
            this.f107966b = cVar;
            this.f107967c = z10;
            this.f107968d = vVar;
            this.f107969e = lVar;
            this.f107970f = aVar;
            this.f107971g = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, k.b.e eVar, C17631a aVar) {
            lVar.invoke(new C12935h.d.a(eVar));
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, e.c cVar) {
            C17542s.j(cVar, "it");
            lVar.invoke(Boolean.valueOf(!(cVar instanceof e.c.C2193c)));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5857c r13, U0.C4889m r14, int r15) {
            /*
                r12 = this;
                java.lang.String r0 = "$this$FlippableCard"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                r13 = r15 & 17
                r0 = 16
                if (r13 != r0) goto L_0x0017
                boolean r13 = r14.l()
                if (r13 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r14.L()
                goto L_0x00be
            L_0x0017:
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x0026
                r13 = -1
                java.lang.String r0 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCard.<anonymous> (RefundCard.kt:66)"
                r1 = -11393381(0xffffffffff52269b, float:-2.7933833E38)
                U0.C4895p.S(r1, r15, r13, r0)
            L_0x0026:
                GD.k$b$e r13 = r12.f107965a
                GD.b r0 = r13.i()
                t1.c r1 = r12.f107966b
                GD.k$b$e r13 = r12.f107965a
                GD.k$b$g r13 = r13.j()
                boolean r2 = r13 instanceof GD.k.b.g.C2651b
                boolean r3 = r12.f107967c
                GD.k$b$e r13 = r12.f107965a
                GD.a r4 = r13.g()
                p0.v r5 = r12.f107968d
                r13 = 1816706368(0x6c48bd40, float:9.707155E26)
                r14.W(r13)
                nI.l<GD.h, XH.N> r13 = r12.f107969e
                boolean r13 = r14.V(r13)
                GD.k$b$e r15 = r12.f107965a
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                nI.a<XH.N> r15 = r12.f107970f
                boolean r15 = r14.V(r15)
                r13 = r13 | r15
                nI.l<GD.h, XH.N> r15 = r12.f107969e
                GD.k$b$e r6 = r12.f107965a
                nI.a<XH.N> r7 = r12.f107970f
                java.lang.Object r8 = r14.D()
                if (r13 != 0) goto L_0x006e
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r8 != r13) goto L_0x0076
            L_0x006e:
                BD.V r8 = new BD.V
                r8.<init>(r15, r6, r7)
                r14.u(r8)
            L_0x0076:
                r6 = r8
                nI.a r6 = (nI.C17631a) r6
                r14.P()
                r13 = 1816711611(0x6c48d1bb, float:9.7110235E26)
                r14.W(r13)
                nI.l<java.lang.Boolean, XH.N> r13 = r12.f107971g
                boolean r13 = r14.V(r13)
                nI.l<java.lang.Boolean, XH.N> r15 = r12.f107971g
                java.lang.Object r7 = r14.D()
                if (r13 != 0) goto L_0x0098
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r7 != r13) goto L_0x00a0
            L_0x0098:
                BD.W r7 = new BD.W
                r7.<init>(r15)
                r14.u(r7)
            L_0x00a0:
                nI.l r7 = (nI.C17642l) r7
                r14.P()
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                r15 = 1
                r8 = 0
                r9 = 0
                androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.f(r13, r9, r15, r8)
                r10 = 100663296(0x6000000, float:2.4074124E-35)
                r11 = 0
                r9 = r14
                BD.X.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                boolean r13 = U0.C4895p.J()
                if (r13 == 0) goto L_0x00be
                U0.C4895p.R()
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BD.X.a.c(s0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.b.e f107972a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f107973b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f107974c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C12935h, C16807N> f107975d;

        b(k.b.e eVar, v vVar, C17631a<C16807N> aVar, C17642l<? super C12935h, C16807N> lVar) {
            this.f107972a = eVar;
            this.f107973b = vVar;
            this.f107974c = aVar;
            this.f107975d = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, C12930c cVar) {
            C17542s.j(cVar, "it");
            lVar.invoke(new C12935h.b(cVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, k.b.e eVar, C17631a aVar) {
            lVar.invoke(new C12935h.c.C2648c(eVar));
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(s0.C5857c r12, U0.C4889m r13, int r14) {
            /*
                r11 = this;
                java.lang.String r0 = "$this$FlippableCard"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                r12 = r14 & 17
                r0 = 16
                if (r12 != r0) goto L_0x0017
                boolean r12 = r13.l()
                if (r12 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r13.L()
                goto L_0x00aa
            L_0x0017:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0026
                r12 = -1
                java.lang.String r0 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCard.<anonymous> (RefundCard.kt:82)"
                r1 = -2097236196(0xffffffff82feb71c, float:-3.7427045E-37)
                U0.C4895p.S(r1, r14, r12, r0)
            L_0x0026:
                GD.k$b$e r2 = r11.f107972a
                p0.v r3 = r11.f107973b
                nI.a<XH.N> r4 = r11.f107974c
                r12 = 1816722536(0x6c48fc68, float:9.719085E26)
                r13.W(r12)
                nI.l<GD.h, XH.N> r12 = r11.f107975d
                boolean r12 = r13.V(r12)
                nI.l<GD.h, XH.N> r14 = r11.f107975d
                java.lang.Object r0 = r13.D()
                if (r12 != 0) goto L_0x0048
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r0 != r12) goto L_0x0050
            L_0x0048:
                BD.Y r0 = new BD.Y
                r0.<init>(r14)
                r13.u(r0)
            L_0x0050:
                r5 = r0
                nI.l r5 = (nI.C17642l) r5
                r13.P()
                r12 = 1816724919(0x6c4905b7, float:9.720843E26)
                r13.W(r12)
                nI.l<GD.h, XH.N> r12 = r11.f107975d
                boolean r12 = r13.V(r12)
                GD.k$b$e r14 = r11.f107972a
                boolean r14 = r13.V(r14)
                r12 = r12 | r14
                nI.a<XH.N> r14 = r11.f107974c
                boolean r14 = r13.V(r14)
                r12 = r12 | r14
                nI.l<GD.h, XH.N> r14 = r11.f107975d
                GD.k$b$e r0 = r11.f107972a
                nI.a<XH.N> r1 = r11.f107974c
                java.lang.Object r6 = r13.D()
                if (r12 != 0) goto L_0x0084
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r6 != r12) goto L_0x008c
            L_0x0084:
                BD.Z r6 = new BD.Z
                r6.<init>(r14, r0, r1)
                r13.u(r6)
            L_0x008c:
                nI.a r6 = (nI.C17631a) r6
                r13.P()
                androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                r14 = 1
                r0 = 0
                r1 = 0
                androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.f(r12, r1, r14, r0)
                r9 = 196608(0x30000, float:2.75506E-40)
                r10 = 0
                r8 = r13
                BD.X.h(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x00aa
                U0.C4895p.R()
            L_0x00aa:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BD.X.b.c(s0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5857c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f107976a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5942c f107977b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f107978a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5942c f107979b;

            a(boolean z10, C5942c cVar) {
                this.f107978a = z10;
                this.f107979b = cVar;
            }

            public final void a(C5857c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$QrCodeContainer");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1349787145, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCardFront.<anonymous>.<anonymous>.<anonymous> (RefundCard.kt:137)");
                    }
                    if (this.f107978a) {
                        mVar.W(901803729);
                        C15210g.b(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), mVar, 6, 0);
                        mVar.P();
                    } else {
                        mVar.W(901890002);
                        xD.k.d(this.f107979b, J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), mVar, 48, 0);
                        mVar.P();
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        c(boolean z10, C5942c cVar) {
            this.f107976a = z10;
            this.f107977b = cVar;
        }

        public final void a(C5857c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$CardFrontScaffold");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1044337383, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCardFront.<anonymous>.<anonymous> (RefundCard.kt:136)");
                }
                xD.k.f((androidx.compose.ui.d) null, c1.c.e(-1349787145, true, new a(this.f107976a, this.f107977b), mVar, 54), mVar, 48, 1);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f107980a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                p0.v[] r0 = p0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.v r1 = p0.v.Vertical     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.v r1 = p0.v.Horizontal     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f107980a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BD.X.d.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(p0.v r20, GD.k.b.e r21, boolean r22, nI.C17631a<XH.C16807N> r23, nI.C17642l<? super GD.C12935h, XH.C16807N> r24, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r25, androidx.compose.ui.d r26, boolean r27, U0.C4889m r28, int r29, int r30) {
        /*
            r10 = r20
            r11 = r21
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r29
            r9 = r30
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "requestCardFlip"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onReadyStateChanged"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -552985980(0xffffffffdf0a1a84, float:-9.951411E18)
            r1 = r28
            U0.m r8 = r1.k(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0037
            r1 = r15 | 6
            goto L_0x0047
        L_0x0037:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.V(r10)
            if (r1 == 0) goto L_0x0043
            r1 = 4
            goto L_0x0044
        L_0x0043:
            r1 = 2
        L_0x0044:
            r1 = r1 | r15
            goto L_0x0047
        L_0x0046:
            r1 = r15
        L_0x0047:
            r2 = r9 & 2
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005e
        L_0x004e:
            r2 = r15 & 48
            if (r2 != 0) goto L_0x005e
            boolean r2 = r8.V(r11)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x0067
            r1 = r1 | 384(0x180, float:5.38E-43)
            r7 = r22
            goto L_0x0079
        L_0x0067:
            r2 = r15 & 384(0x180, float:5.38E-43)
            r7 = r22
            if (r2 != 0) goto L_0x0079
            boolean r2 = r8.b(r7)
            if (r2 == 0) goto L_0x0076
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0078
        L_0x0076:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0078:
            r1 = r1 | r2
        L_0x0079:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x0080
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0090
        L_0x0080:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0090
            boolean r2 = r8.F(r12)
            if (r2 == 0) goto L_0x008d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r1 = r1 | r2
        L_0x0090:
            r2 = r9 & 16
            if (r2 == 0) goto L_0x0097
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a7
        L_0x0097:
            r2 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a7
            boolean r2 = r8.F(r13)
            if (r2 == 0) goto L_0x00a4
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r2
        L_0x00a7:
            r2 = r9 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00af
            r1 = r1 | r3
            goto L_0x00bf
        L_0x00af:
            r2 = r15 & r3
            if (r2 != 0) goto L_0x00bf
            boolean r2 = r8.F(r14)
            if (r2 == 0) goto L_0x00bc
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r1 = r1 | r2
        L_0x00bf:
            r2 = r9 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00c9
            r1 = r1 | r3
        L_0x00c6:
            r3 = r26
            goto L_0x00da
        L_0x00c9:
            r3 = r3 & r15
            if (r3 != 0) goto L_0x00c6
            r3 = r26
            boolean r4 = r8.V(r3)
            if (r4 == 0) goto L_0x00d7
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r1 = r1 | r4
        L_0x00da:
            r4 = r9 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00e5
            r1 = r1 | r5
        L_0x00e1:
            r5 = r27
        L_0x00e3:
            r6 = r1
            goto L_0x00f7
        L_0x00e5:
            r5 = r5 & r15
            if (r5 != 0) goto L_0x00e1
            r5 = r27
            boolean r6 = r8.b(r5)
            if (r6 == 0) goto L_0x00f3
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f5
        L_0x00f3:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f5:
            r1 = r1 | r6
            goto L_0x00e3
        L_0x00f7:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r6
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x0110
            boolean r0 = r8.l()
            if (r0 != 0) goto L_0x0107
            goto L_0x0110
        L_0x0107:
            r8.L()
            r7 = r3
            r19 = r8
            r8 = r5
            goto L_0x0196
        L_0x0110:
            if (r2 == 0) goto L_0x0117
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r17 = r0
            goto L_0x0119
        L_0x0117:
            r17 = r3
        L_0x0119:
            r0 = 0
            if (r4 == 0) goto L_0x011f
            r18 = r0
            goto L_0x0121
        L_0x011f:
            r18 = r5
        L_0x0121:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0130
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCard (RefundCard.kt:58)"
            r3 = -552985980(0xffffffffdf0a1a84, float:-9.951411E18)
            U0.C4895p.S(r3, r6, r1, r2)
        L_0x0130:
            GD.k$b$g r1 = r21.j()
            t1.c r2 = CD.e.d(r1, r8, r0)
            BD.X$a r5 = new BD.X$a
            r0 = r5
            r1 = r21
            r3 = r18
            r4 = r20
            r9 = r5
            r5 = r24
            r16 = r6
            r6 = r23
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -11393381(0xffffffffff52269b, float:-2.7933833E38)
            r1 = 1
            r2 = 54
            c1.a r3 = c1.c.e(r0, r1, r9, r8, r2)
            BD.X$b r0 = new BD.X$b
            r0.<init>(r11, r10, r12, r13)
            r4 = -2097236196(0xffffffff82feb71c, float:-3.7427045E-37)
            c1.a r4 = c1.c.e(r4, r1, r0, r8, r2)
            r0 = r16 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            int r1 = r16 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            int r2 = r16 >> 6
            r1 = r1 & r2
            r9 = r0 | r1
            r16 = 32
            r5 = 0
            r0 = r20
            r1 = r22
            r2 = r3
            r3 = r4
            r4 = r17
            r7 = r8
            r19 = r8
            r8 = r9
            r9 = r16
            zD.p.j(r0, r1, r2, r3, r4, r5, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0192
            U0.C4895p.R()
        L_0x0192:
            r7 = r17
            r8 = r18
        L_0x0196:
            U0.Y0 r9 = r19.n()
            if (r9 == 0) goto L_0x01b7
            BD.P r6 = new BD.P
            r0 = r6
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r11 = r6
            r6 = r25
            r12 = r9
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.a(r11)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.X.f(p0.v, GD.k$b$e, boolean, nI.a, nI.l, nI.l, androidx.compose.ui.d, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(v vVar, k.b.e eVar, boolean z10, C17631a aVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, boolean z11, int i10, int i11, C4889m mVar, int i12) {
        f(vVar, eVar, z10, aVar, lVar, lVar2, dVar, z11, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(GD.k.b.e r19, p0.v r20, nI.C17631a<XH.C16807N> r21, nI.C17642l<? super GD.C12930c, XH.C16807N> r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r7 = r26
            r0 = -401772508(0xffffffffe80d7024, float:-2.6716892E24)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r7 | 6
            r3 = r2
            r2 = r19
            goto L_0x0029
        L_0x0015:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r19
            boolean r3 = r1.V(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r7
            goto L_0x0029
        L_0x0026:
            r2 = r19
            r3 = r7
        L_0x0029:
            r4 = r27 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r20
            goto L_0x0044
        L_0x0032:
            r4 = r7 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r20
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r21
            goto L_0x005f
        L_0x004d:
            r5 = r7 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r21
            boolean r6 = r1.F(r5)
            if (r6 == 0) goto L_0x005c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r6
        L_0x005f:
            r6 = r27 & 8
            if (r6 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r6 = r22
            goto L_0x007a
        L_0x0068:
            r6 = r7 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r22
            boolean r8 = r1.F(r6)
            if (r8 == 0) goto L_0x0077
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r8
        L_0x007a:
            r8 = r27 & 16
            if (r8 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r15 = r23
            goto L_0x0095
        L_0x0083:
            r8 = r7 & 24576(0x6000, float:3.4438E-41)
            r15 = r23
            if (r8 != 0) goto L_0x0095
            boolean r8 = r1.F(r15)
            if (r8 == 0) goto L_0x0092
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r8
        L_0x0095:
            r8 = r27 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r8 == 0) goto L_0x009f
            r3 = r3 | r9
        L_0x009c:
            r9 = r24
            goto L_0x00b0
        L_0x009f:
            r9 = r9 & r7
            if (r9 != 0) goto L_0x009c
            r9 = r24
            boolean r10 = r1.V(r9)
            if (r10 == 0) goto L_0x00ad
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r3 = r3 | r10
        L_0x00b0:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r3
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00c4
            boolean r10 = r1.l()
            if (r10 != 0) goto L_0x00c0
            goto L_0x00c4
        L_0x00c0:
            r1.L()
            goto L_0x0103
        L_0x00c4:
            if (r8 == 0) goto L_0x00cb
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r18 = r8
            goto L_0x00cd
        L_0x00cb:
            r18 = r9
        L_0x00cd:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00d9
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCardBack (RefundCard.kt:158)"
            U0.C4895p.S(r0, r3, r8, r9)
        L_0x00d9:
            GD.b r8 = r19.i()
            KJ.c r9 = r19.h()
            int r0 = r3 << 3
            r3 = 4194176(0x3fff80, float:5.877292E-39)
            r16 = r0 & r3
            r17 = 0
            r10 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r18
            r15 = r1
            CD.c.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0101
            U0.C4895p.R()
        L_0x0101:
            r9 = r18
        L_0x0103:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x0121
            BD.T r11 = new BD.T
            r0 = r11
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r9
            r7 = r26
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.X.h(GD.k$b$e, p0.v, nI.a, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(k.b.e eVar, v vVar, C17631a aVar, C17642l lVar, C17631a aVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(eVar, vVar, aVar, lVar, aVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(GD.C12929b r33, t1.C5942c r34, boolean r35, boolean r36, GD.C12928a r37, p0.v r38, nI.C17631a<XH.C16807N> r39, nI.C17642l<? super gs.e.c, XH.C16807N> r40, androidx.compose.ui.d r41, U0.C4889m r42, int r43, int r44) {
        /*
            r14 = r33
            r15 = r34
            r13 = r35
            r12 = r37
            r11 = r38
            r10 = r39
            r8 = r40
            r9 = r43
            r6 = r44
            java.lang.String r0 = "header"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "qrPainter"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "background"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onCardDetailsClicked"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onImageStateChanged"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = 766149298(0x2daa82b2, float:1.9384803E-11)
            r1 = r42
            U0.m r7 = r1.k(r0)
            r1 = r6 & 1
            if (r1 == 0) goto L_0x0040
            r1 = r9 | 6
            goto L_0x0050
        L_0x0040:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x004f
            boolean r1 = r7.V(r14)
            if (r1 == 0) goto L_0x004c
            r1 = 4
            goto L_0x004d
        L_0x004c:
            r1 = 2
        L_0x004d:
            r1 = r1 | r9
            goto L_0x0050
        L_0x004f:
            r1 = r9
        L_0x0050:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0057
            r1 = r1 | 48
            goto L_0x0067
        L_0x0057:
            r2 = r9 & 48
            if (r2 != 0) goto L_0x0067
            boolean r2 = r7.F(r15)
            if (r2 == 0) goto L_0x0064
            r2 = 32
            goto L_0x0066
        L_0x0064:
            r2 = 16
        L_0x0066:
            r1 = r1 | r2
        L_0x0067:
            r2 = r6 & 4
            if (r2 == 0) goto L_0x006e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x007e
        L_0x006e:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007e
            boolean r2 = r7.b(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007d:
            r1 = r1 | r2
        L_0x007e:
            r2 = r6 & 8
            if (r2 == 0) goto L_0x0087
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r5 = r36
            goto L_0x0099
        L_0x0087:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            r5 = r36
            if (r2 != 0) goto L_0x0099
            boolean r2 = r7.b(r5)
            if (r2 == 0) goto L_0x0096
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0098
        L_0x0096:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0098:
            r1 = r1 | r2
        L_0x0099:
            r2 = r6 & 16
            if (r2 == 0) goto L_0x00a0
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b0
        L_0x00a0:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b0
            boolean r2 = r7.V(r12)
            if (r2 == 0) goto L_0x00ad
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00af
        L_0x00ad:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00af:
            r1 = r1 | r2
        L_0x00b0:
            r2 = r6 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b8
            r1 = r1 | r4
            goto L_0x00c8
        L_0x00b8:
            r2 = r9 & r4
            if (r2 != 0) goto L_0x00c8
            boolean r2 = r7.V(r11)
            if (r2 == 0) goto L_0x00c5
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r1 = r1 | r2
        L_0x00c8:
            r2 = r6 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00d0
            r1 = r1 | r4
            goto L_0x00e0
        L_0x00d0:
            r2 = r9 & r4
            if (r2 != 0) goto L_0x00e0
            boolean r2 = r7.F(r10)
            if (r2 == 0) goto L_0x00dd
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00df
        L_0x00dd:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00df:
            r1 = r1 | r2
        L_0x00e0:
            r2 = r6 & 128(0x80, float:1.794E-43)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00e8
            r1 = r1 | r4
            goto L_0x00f8
        L_0x00e8:
            r2 = r9 & r4
            if (r2 != 0) goto L_0x00f8
            boolean r2 = r7.F(r8)
            if (r2 == 0) goto L_0x00f5
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r1 = r1 | r2
        L_0x00f8:
            r2 = r6 & 256(0x100, float:3.59E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0102
            r1 = r1 | r4
        L_0x00ff:
            r4 = r41
            goto L_0x0114
        L_0x0102:
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00ff
            r4 = r41
            boolean r16 = r7.V(r4)
            if (r16 == 0) goto L_0x0110
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r16
        L_0x0114:
            r16 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r1 & r16
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r0) goto L_0x012d
            boolean r0 = r7.l()
            if (r0 != 0) goto L_0x0125
            goto L_0x012d
        L_0x0125:
            r7.L()
            r9 = r4
            r24 = r7
            goto L_0x028a
        L_0x012d:
            if (r2 == 0) goto L_0x0132
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r4 = r0
        L_0x0132:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0141
            r0 = -1
            java.lang.String r2 = "com.ingka.ikea.wallet.impl.compose.card.prepaid.RefundCardFront (RefundCard.kt:109)"
            r3 = 766149298(0x2daa82b2, float:1.9384803E-11)
            U0.C4895p.S(r3, r1, r0, r2)
        L_0x0141:
            r0 = 0
            tK.h r2 = SC.C13575d.a(r7, r0)
            long r2 = r2.x0()
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c r5 = r16.o()
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r0)
            int r16 = U0.C4883j.a(r7, r0)
            U0.y r0 = r7.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r7, r4)
            G1.g$a r17 = G1.C4504g.f6515W
            r32 = r4
            nI.a r4 = r17.a()
            U0.f r18 = r7.m()
            if (r18 != 0) goto L_0x0171
            U0.C4883j.c()
        L_0x0171:
            r7.I()
            boolean r18 = r7.i()
            if (r18 == 0) goto L_0x017e
            r7.p(r4)
            goto L_0x0181
        L_0x017e:
            r7.t()
        L_0x0181:
            U0.m r4 = U0.F1.a(r7)
            nI.p r8 = r17.c()
            U0.F1.c(r4, r5, r8)
            nI.p r5 = r17.e()
            U0.F1.c(r4, r0, r5)
            nI.p r0 = r17.b()
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x01ab
            java.lang.Object r5 = r4.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x01b9
        L_0x01ab:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r4.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r4.w(r5, r0)
        L_0x01b9:
            nI.p r0 = r17.d()
            U0.F1.c(r4, r6, r0)
            androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
            com.ingka.ikea.core.model.Image r4 = KD.C13143a.a(r37, r38)
            java.lang.String r16 = r4.getUrl()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "WalletTestTags-BackgroundImage"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            androidx.compose.ui.d r0 = r0.e(r5)
            r5 = 1535055957(0x5b7f1855, float:7.1802872E16)
            r7.W(r5)
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r1
            r6 = 1
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r5 != r8) goto L_0x01e6
            r5 = r6
            goto L_0x01e7
        L_0x01e6:
            r5 = 0
        L_0x01e7:
            boolean r8 = r7.e(r2)
            r5 = r5 | r8
            java.lang.Object r8 = r7.D()
            if (r5 != 0) goto L_0x01fa
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r8 != r5) goto L_0x0202
        L_0x01fa:
            BD.Q r8 = new BD.Q
            r8.<init>(r11, r2)
            r7.u(r8)
        L_0x0202:
            nI.l r8 = (nI.C17642l) r8
            r7.P()
            androidx.compose.ui.d r18 = androidx.compose.ui.draw.b.c(r0, r8)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r1
            r2 = 805306416(0x30000030, float:4.6566395E-10)
            r29 = r0 | r2
            r30 = 0
            r31 = 3448(0xd78, float:4.832E-42)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r40
            r28 = r7
            LC.h.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = 0
            r2 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r4, r0, r6, r2)
            BD.X$c r0 = new BD.X$c
            r0.<init>(r13, r15)
            r3 = 54
            r4 = 1044337383(0x3e3f52e7, float:0.18683968)
            c1.a r16 = c1.c.e(r4, r6, r0, r7, r3)
            r0 = r1 & 14
            r3 = 100663680(0x6000180, float:2.4075226E-35)
            r0 = r0 | r3
            int r3 = r1 >> 12
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 >> 6
            r1 = r1 & r3
            r17 = r0 | r1
            r18 = 224(0xe0, float:3.14E-43)
            r5 = 0
            r19 = 0
            r21 = 0
            r0 = r33
            r1 = r38
            r3 = r36
            r23 = r32
            r4 = r39
            r24 = r7
            r6 = r19
            r8 = r21
            r10 = r16
            r11 = r24
            r12 = r17
            r13 = r18
            zD.i.d(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13)
            r24.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0288
            U0.C4895p.R()
        L_0x0288:
            r9 = r23
        L_0x028a:
            U0.Y0 r12 = r24.n()
            if (r12 == 0) goto L_0x02ad
            BD.S r13 = new BD.S
            r0 = r13
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r10 = r43
            r11 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x02ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: BD.X.j(GD.b, t1.c, boolean, boolean, GD.a, p0.v, nI.a, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final i k(v vVar, long j10, m1.d dVar) {
        C17542s.j(dVar, "$this$drawWithCache");
        return dVar.p(new U(o(vVar, j10)));
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C5728l0 l0Var, C5817c cVar) {
        C17542s.j(cVar, "$this$onDrawWithContent");
        cVar.V1();
        f.M0(cVar, l0Var, 0, 0, 0.0f, (g) null, (C5749w0) null, 0, 126, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C12929b bVar, C5942c cVar, boolean z10, boolean z11, C12928a aVar, v vVar, C17631a aVar2, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(bVar, cVar, z10, z11, aVar, vVar, aVar2, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final C5728l0 o(v vVar, long j10) {
        C17542s.j(vVar, "orientation");
        long o10 = C5747v0.o(j10, 0.8f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        long o11 = C5747v0.o(j10, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        int i10 = d.f107980a[vVar.ordinal()];
        if (i10 == 1) {
            return C5728l0.a.m(C5728l0.f27325b, new XH.v[]{C16796C.a(Float.valueOf(0.0f), C5747v0.k(o10)), C16796C.a(Float.valueOf(1.0f), C5747v0.k(o11))}, 0.0f, 0.0f, 0, 14, (Object) null);
        } else if (i10 == 2) {
            return C5728l0.a.d(C5728l0.f27325b, new XH.v[]{C16796C.a(Float.valueOf(0.0f), C5747v0.k(o10)), C16796C.a(Float.valueOf(1.0f), C5747v0.k(o11))}, 0.0f, 0.0f, 0, 14, (Object) null);
        } else {
            throw new t();
        }
    }
}
