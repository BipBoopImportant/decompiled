package mF;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import XH.C16807N;
import android.content.res.Resources;
import android.net.Uri;
import c2.h;
import c2.r;
import iF.I;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nF.C14850a;
import nF.C14851b;
import nF.C14853d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LnF/b$b;", "carousel", "Lkotlin/Function1;", "LnF/a;", "LXH/N;", "onItemClicked", "Lkotlin/Function0;", "onButtonClicked", "Landroidx/compose/ui/d;", "modifier", "d", "(LnF/b$b;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mF.f  reason: case insensitive filesystem */
public final class C14798f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mF.f$a */
    static final class a implements C17642l<r, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c2.d f129407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4899r0<h> f129408b;

        a(c2.d dVar, C4899r0<h> r0Var) {
            this.f129407a = dVar;
            this.f129408b = r0Var;
        }

        public final void a(long j10) {
            float H10 = this.f129407a.H(r.g(j10));
            if (h.v(H10, this.f129408b.getValue().G()) > 0) {
                this.f129408b.setValue(h.m(H10));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).k());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mF.f$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14853d f129409a;

        b(C14853d dVar) {
            this.f129409a = dVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(492527973, i10, -1, "com.sugarcube.app.base.ui.compose.entrypoint.CarouselEntryPoint.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CarouselEntryPoint.kt:137)");
                }
                I.b(Uri.parse(this.f129409a.f()), (androidx.compose.ui.d) null, mVar, 0, 2);
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
    /* renamed from: mF.f$c */
    static final class c implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C14850a, C16807N> f129410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14850a f129411b;

        c(C17642l<? super C14850a, C16807N> lVar, C14850a aVar) {
            this.f129410a = lVar;
            this.f129411b = aVar;
        }

        public final void a() {
            this.f129410a.invoke(this.f129411b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: mF.f$d */
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f129412c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f129413d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p pVar, List list) {
            super(1);
            this.f129412c = pVar;
            this.f129413d = list;
        }

        public final Object a(int i10) {
            return this.f129412c.invoke(Integer.valueOf(i10), this.f129413d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: mF.f$e */
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f129414c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f129414c = list;
        }

        public final Object a(int i10) {
            this.f129414c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: mF.f$f  reason: collision with other inner class name */
    public static final class C3182f extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f129415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f129416d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0 f129417e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c2.d f129418f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Resources f129419g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l f129420h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3182f(List list, float f10, C4899r0 r0Var, c2.d dVar, Resources resources, C17642l lVar) {
            super(4);
            this.f129415c = list;
            this.f129416d = f10;
            this.f129417e = r0Var;
            this.f129418f = dVar;
            this.f129419g = resources;
            this.f129420h = lVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(t0.C5938c r35, int r36, U0.C4889m r37, int r38) {
            /*
                r34 = this;
                r0 = r34
                r1 = r36
                r14 = r37
                r2 = r38 & 6
                if (r2 != 0) goto L_0x0018
                r2 = r35
                boolean r2 = r14.V(r2)
                if (r2 == 0) goto L_0x0014
                r2 = 4
                goto L_0x0015
            L_0x0014:
                r2 = 2
            L_0x0015:
                r2 = r38 | r2
                goto L_0x001a
            L_0x0018:
                r2 = r38
            L_0x001a:
                r3 = r38 & 48
                if (r3 != 0) goto L_0x002a
                boolean r3 = r14.d(r1)
                if (r3 == 0) goto L_0x0027
                r3 = 32
                goto L_0x0029
            L_0x0027:
                r3 = 16
            L_0x0029:
                r2 = r2 | r3
            L_0x002a:
                r3 = r2 & 147(0x93, float:2.06E-43)
                r4 = 146(0x92, float:2.05E-43)
                if (r3 != r4) goto L_0x003c
                boolean r3 = r37.l()
                if (r3 != 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                r37.L()
                goto L_0x0202
            L_0x003c:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x004b
                r3 = -1
                java.lang.String r4 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"
                r5 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x004b:
                java.util.List r2 = r0.f129415c
                java.lang.Object r1 = r2.get(r1)
                r9 = r1
                nF.a r9 = (nF.C14850a) r9
                r1 = -1235560906(0xffffffffb65ad636, float:-3.2609219E-6)
                r14.W(r1)
                java.lang.String r15 = r9.f()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                float r2 = r0.f129416d
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r1, r2)
                U0.r0 r2 = r0.f129417e
                java.lang.Object r2 = r2.getValue()
                c2.h r2 = (c2.h) r2
                float r2 = r2.G()
                r3 = 0
                r4 = 1
                r10 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.b(r1, r3, r2, r4, r10)
                r2 = 514337377(0x1ea82a61, float:1.780522E-20)
                r14.W(r2)
                c2.d r2 = r0.f129418f
                boolean r2 = r14.V(r2)
                java.lang.Object r3 = r37.D()
                if (r2 != 0) goto L_0x0093
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x009f
            L_0x0093:
                mF.f$a r3 = new mF.f$a
                c2.d r2 = r0.f129418f
                U0.r0 r5 = r0.f129417e
                r3.<init>(r2, r5)
                r14.u(r3)
            L_0x009f:
                nI.l r3 = (nI.C17642l) r3
                r37.P()
                androidx.compose.ui.d r1 = androidx.compose.ui.layout.g.a(r1, r3)
                nF.d r2 = r9.b()
                if (r2 != 0) goto L_0x00b1
                java.lang.String r2 = "ARROW_BUTTON"
                goto L_0x00b3
            L_0x00b1:
                java.lang.String r2 = "ROOM_SHAPE_ICON"
            L_0x00b3:
                androidx.compose.ui.d r16 = androidx.compose.ui.platform.C5116k1.a(r1, r2)
                java.lang.String r20 = r9.a()
                nF.d r1 = r9.b()
                r2 = 514360403(0x1ea88453, float:1.784242E-20)
                r14.W(r2)
                if (r1 != 0) goto L_0x00ca
                r24 = r10
                goto L_0x00da
            L_0x00ca:
                mF.f$b r2 = new mF.f$b
                r2.<init>(r1)
                r1 = 54
                r3 = 492527973(0x1d5b6165, float:2.903476E-21)
                c1.a r1 = c1.c.e(r3, r4, r2, r14, r1)
                r24 = r1
            L_0x00da:
                r37.P()
                kF.p r25 = kF.C14720p.Emphasised
                kF.b r26 = kF.C14706b.PrimaryInverse
                kF.y r11 = new kF.y
                k6.h$a r1 = new k6.h$a
                U0.I0 r2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
                java.lang.Object r2 = r14.Q(r2)
                android.content.Context r2 = (android.content.Context) r2
                r1.<init>(r2)
                nF.d r2 = r9.d()
                java.lang.String r2 = r2.f()
                k6.h$a r1 = r1.e(r2)
                r2 = 320(0x140, float:4.48E-43)
                r3 = 240(0xf0, float:3.36E-43)
                l6.h r2 = l6.i.a(r2, r3)
                k6.h$a r1 = r1.p(r2)
                android.content.res.Resources r2 = r0.f129419g
                int r3 = OE.C13316h.f112851d
                android.graphics.drawable.Drawable r2 = w2.C6214h.e(r2, r3, r10)
                if (r2 == 0) goto L_0x0119
                T5.n r2 = T5.u.c(r2)
                goto L_0x011a
            L_0x0119:
                r2 = r10
            L_0x011a:
                k6.h$a r1 = r1.g(r2)
                android.content.res.Resources r2 = r0.f129419g
                nF.d r3 = r9.d()
                int r3 = r3.e()
                android.graphics.drawable.Drawable r2 = w2.C6214h.e(r2, r3, r10)
                if (r2 == 0) goto L_0x0133
                T5.n r2 = T5.u.c(r2)
                goto L_0x0134
            L_0x0133:
                r2 = r10
            L_0x0134:
                k6.h$a r1 = r1.k(r2)
                k6.h r1 = r1.c()
                r7 = 0
                r8 = 30
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = r37
                U5.e r2 = U5.t.a(r1, r2, r3, r4, r5, r6, r7, r8)
                nF.d r1 = r9.d()
                java.lang.String r3 = r1.d()
                r5 = 4
                r6 = 0
                r4 = 0
                r1 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                nF.d r1 = r9.d()
                boolean r1 = r1 instanceof nF.C14853d.b
                if (r1 == 0) goto L_0x0162
                r8 = r11
                goto L_0x0163
            L_0x0162:
                r8 = r10
            L_0x0163:
                nF.d r1 = r9.d()
                java.lang.String r28 = r1.f()
                nF.d r1 = r9.d()
                int r31 = r1.e()
                nF.d r1 = r9.d()
                java.lang.String r29 = r1.d()
                kF.P r1 = new kF.P
                r32 = 4
                r33 = 0
                r30 = 0
                r27 = r1
                r27.<init>(r28, r29, r30, r31, r32, r33)
                nF.d r2 = r9.d()
                boolean r2 = r2 instanceof nF.C14853d.c
                if (r2 == 0) goto L_0x0193
                r27 = r1
                goto L_0x0195
            L_0x0193:
                r27 = r10
            L_0x0195:
                tK.v r1 = tK.C18030v.f147664a
                int r2 = tK.C18030v.f147665b
                tK.h r1 = r1.a(r14, r2)
                long r28 = r1.k()
                r1 = 514421879(0x1ea97477, float:1.794174E-20)
                r14.W(r1)
                nI.l r1 = r0.f129420h
                boolean r1 = r14.V(r1)
                boolean r2 = r14.V(r9)
                r1 = r1 | r2
                java.lang.Object r2 = r37.D()
                if (r1 != 0) goto L_0x01c0
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x01ca
            L_0x01c0:
                mF.f$c r2 = new mF.f$c
                nI.l r1 = r0.f129420h
                r2.<init>(r1, r9)
                r14.u(r2)
            L_0x01ca:
                r19 = r2
                nI.a r19 = (nI.C17631a) r19
                r37.P()
                r22 = 27654(0x6c06, float:3.8752E-41)
                r23 = 35400(0x8a48, float:4.9606E-41)
                r4 = 0
                r7 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                r17 = 1
                r18 = 0
                r21 = 384(0x180, float:5.38E-43)
                r1 = r15
                r2 = r16
                r3 = r25
                r5 = r20
                r6 = r24
                r9 = r27
                r14 = r28
                r16 = r26
                r20 = r37
                kF.C14716l.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23)
                r37.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0202
                U0.C4895p.R()
            L_0x0202:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mF.C14798f.C3182f.a(t0.c, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: mF.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: mF.c} */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(nF.C14851b.C3193b r42, nI.C17642l<? super nF.C14850a, XH.C16807N> r43, nI.C17631a<XH.C16807N> r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r7 = r42
            r8 = r43
            r15 = r44
            r14 = r47
            r0 = 8
            r1 = 4
            java.lang.String r2 = "carousel"
            kotlin.jvm.internal.C17542s.j(r7, r2)
            java.lang.String r2 = "onItemClicked"
            kotlin.jvm.internal.C17542s.j(r8, r2)
            java.lang.String r2 = "onButtonClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = 1830869522(0x6d20da12, float:3.111327E27)
            r3 = r46
            U0.m r13 = r3.k(r2)
            r3 = 1
            r4 = r48 & 1
            r9 = 2
            if (r4 == 0) goto L_0x002c
            r4 = r14 | 6
            goto L_0x003c
        L_0x002c:
            r4 = r14 & 6
            if (r4 != 0) goto L_0x003b
            boolean r4 = r13.F(r7)
            if (r4 == 0) goto L_0x0038
            r4 = r1
            goto L_0x0039
        L_0x0038:
            r4 = r9
        L_0x0039:
            r4 = r4 | r14
            goto L_0x003c
        L_0x003b:
            r4 = r14
        L_0x003c:
            r5 = r48 & 2
            if (r5 == 0) goto L_0x0043
            r4 = r4 | 48
            goto L_0x0053
        L_0x0043:
            r5 = r14 & 48
            if (r5 != 0) goto L_0x0053
            boolean r5 = r13.F(r8)
            if (r5 == 0) goto L_0x0050
            r5 = 32
            goto L_0x0052
        L_0x0050:
            r5 = 16
        L_0x0052:
            r4 = r4 | r5
        L_0x0053:
            r1 = r48 & 4
            if (r1 == 0) goto L_0x005a
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x006a
            boolean r1 = r13.F(r15)
            if (r1 == 0) goto L_0x0067
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r4 = r4 | r1
        L_0x006a:
            r1 = r48 & 8
            if (r1 == 0) goto L_0x0074
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r5 = r45
        L_0x0072:
            r10 = r4
            goto L_0x0087
        L_0x0074:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0070
            r5 = r45
            boolean r10 = r13.V(r5)
            if (r10 == 0) goto L_0x0083
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r4 = r4 | r10
            goto L_0x0072
        L_0x0087:
            r4 = r10 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r4 != r11) goto L_0x009b
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x0094
            goto L_0x009b
        L_0x0094:
            r13.L()
            r4 = r5
            r0 = r13
            goto L_0x032c
        L_0x009b:
            if (r1 == 0) goto L_0x00a2
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r41 = r1
            goto L_0x00a4
        L_0x00a2:
            r41 = r5
        L_0x00a4:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00b0
            r1 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.compose.entrypoint.CarouselEntryPoint (CarouselEntryPoint.kt:67)"
            U0.C4895p.S(r2, r10, r1, r4)
        L_0x00b0:
            r1 = 24
            float r11 = (float) r1
            float r18 = c2.h.B(r11)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r41
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r4 = r2.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            r12 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5080k.a(r4, r5, r13, r12)
            int r5 = U0.C4883j.a(r13, r12)
            U0.y r6 = r13.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r0 = r16.a()
            U0.f r17 = r13.m()
            if (r17 != 0) goto L_0x00f3
            U0.C4883j.c()
        L_0x00f3:
            r13.I()
            boolean r17 = r13.i()
            if (r17 == 0) goto L_0x0100
            r13.p(r0)
            goto L_0x0103
        L_0x0100:
            r13.t()
        L_0x0103:
            U0.m r0 = U0.F1.a(r13)
            nI.p r3 = r16.c()
            U0.F1.c(r0, r4, r3)
            nI.p r3 = r16.e()
            U0.F1.c(r0, r6, r3)
            nI.p r3 = r16.b()
            boolean r4 = r0.i()
            if (r4 != 0) goto L_0x012d
            java.lang.Object r4 = r0.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x013b
        L_0x012d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.w(r4, r3)
        L_0x013b:
            nI.p r3 = r16.d()
            U0.F1.c(r0, r1, r3)
            s0.h r0 = s0.C5862h.f28810a
            java.lang.String r16 = r42.b()
            r0 = -849853929(0xffffffffcd584217, float:-2.2676312E8)
            r13.W(r0)
            if (r16 != 0) goto L_0x0151
            goto L_0x01a1
        L_0x0151:
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.w r0 = r0.b(r13, r1)
            tK.c r0 = r0.a()
            N1.Y r36 = r0.b()
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            tK.u r0 = tK.C18029u.f147649a
            float r18 = r0.d()
            float r20 = r0.d()
            r22 = 10
            r23 = 0
            r19 = 0
            r21 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            r39 = 0
            r40 = 65532(0xfffc, float:9.183E-41)
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r37 = r13
            O0.d1.b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            XH.N r0 = XH.C16807N.f139792a
        L_0x01a1:
            r13.P()
            java.lang.String r16 = r42.c()
            r0 = -849844931(0xffffffffcd58653d, float:-2.26907088E8)
            r13.W(r0)
            if (r16 != 0) goto L_0x01b1
            goto L_0x0201
        L_0x01b1:
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.w r0 = r0.b(r13, r1)
            tK.r r0 = r0.c()
            N1.Y r36 = r0.b()
            androidx.compose.ui.d$a r17 = androidx.compose.ui.d.f18749a
            tK.u r0 = tK.C18029u.f147649a
            float r18 = r0.d()
            float r20 = r0.d()
            r22 = 10
            r23 = 0
            r19 = 0
            r21 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            r39 = 0
            r40 = 65532(0xfffc, float:9.183E-41)
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r38 = 0
            r37 = r13
            O0.d1.b(r16, r17, r18, r20, r22, r23, r24, r25, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            XH.N r0 = XH.C16807N.f139792a
        L_0x0201:
            r13.P()
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r13.Q(r0)
            r4 = r0
            c2.d r4 = (c2.d) r4
            r0 = -849834568(0xffffffffcd588db8, float:-2.27072896E8)
            r13.W(r0)
            java.lang.Object r0 = r13.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r3 = r1.a()
            r6 = 0
            if (r0 != r3) goto L_0x0232
            float r0 = (float) r12
            float r0 = c2.h.B(r0)
            c2.h r0 = c2.h.m(r0)
            U0.r0 r0 = U0.u1.e(r0, r6, r9, r6)
            r13.u(r0)
        L_0x0232:
            r3 = r0
            U0.r0 r3 = (U0.C4899r0) r3
            r13.P()
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r0 = r13.Q(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            int r5 = r0.screenWidthDp
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            int r0 = r0.orientation
            if (r0 != r9) goto L_0x0257
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r5 = r5 * r0
            float r0 = c2.h.B(r5)
        L_0x0255:
            r5 = r0
            goto L_0x0260
        L_0x0257:
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r0
            float r0 = c2.h.B(r5)
            goto L_0x0255
        L_0x0260:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r13.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r0 = r0.getResources()
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            r9 = 0
            r8 = 1
            androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.h(r12, r9, r8, r6)
            float r15 = c2.h.B(r11)
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.k(r14, r9, r15, r8, r6)
            r14 = 8
            float r14 = (float) r14
            float r14 = c2.h.B(r14)
            androidx.compose.foundation.layout.d$f r20 = r2.n(r14)
            float r2 = c2.h.B(r11)
            r14 = 2
            s0.E r18 = androidx.compose.foundation.layout.D.c(r2, r9, r14, r6)
            r2 = -849805140(0xffffffffcd5900ac, float:-2.27543744E8)
            r13.W(r2)
            boolean r2 = r13.F(r7)
            boolean r14 = r13.c(r5)
            r2 = r2 | r14
            boolean r14 = r13.V(r4)
            r2 = r2 | r14
            boolean r14 = r13.F(r0)
            r2 = r2 | r14
            r14 = r10 & 112(0x70, float:1.57E-43)
            r15 = 32
            if (r14 != r15) goto L_0x02b2
            goto L_0x02b3
        L_0x02b2:
            r8 = 0
        L_0x02b3:
            r2 = r2 | r8
            java.lang.Object r8 = r13.D()
            if (r2 != 0) goto L_0x02c3
            java.lang.Object r1 = r1.a()
            if (r8 != r1) goto L_0x02c1
            goto L_0x02c3
        L_0x02c1:
            r14 = r6
            goto L_0x02d4
        L_0x02c3:
            mF.c r8 = new mF.c
            r14 = r0
            r0 = r8
            r1 = r42
            r2 = r5
            r5 = r14
            r14 = r6
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13.u(r8)
        L_0x02d4:
            r24 = r8
            nI.l r24 = (nI.C17642l) r24
            r13.P()
            r26 = 24966(0x6186, float:3.4985E-41)
            r27 = 234(0xea, float:3.28E-43)
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r13
            t0.C5937b.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.g(r12, r0)
            float r1 = c2.h.B(r11)
            r2 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r0, r1, r9, r2, r14)
            int r1 = OE.n.f113484x
            r2 = 0
            java.lang.String r9 = J1.j.b(r1, r13, r2)
            int r1 = r10 << 21
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r20 = r1 | 48
            r21 = 508(0x1fc, float:7.12E-43)
            r11 = 0
            r12 = 0
            r1 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r10 = r0
            r0 = r13
            r13 = r1
            r18 = r44
            r19 = r0
            wK.C18342h0.f(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x032a
            U0.C4895p.R()
        L_0x032a:
            r4 = r41
        L_0x032c:
            U0.Y0 r8 = r0.n()
            if (r8 == 0) goto L_0x0345
            mF.d r9 = new mF.d
            r0 = r9
            r1 = r42
            r2 = r43
            r3 = r44
            r5 = r47
            r6 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x0345:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mF.C14798f.d(nF.b$b, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C14851b.C3193b bVar, float f10, C4899r0 r0Var, c2.d dVar, Resources resources, C17642l lVar, x xVar) {
        x xVar2 = xVar;
        C17542s.j(xVar2, "$this$LazyRow");
        List<C14850a> a10 = bVar.a();
        xVar2.e(a10.size(), new d(new C14797e(), a10), new e(a10), c1.c.c(-1091073711, true, new C3182f(a10, f10, r0Var, dVar, resources, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object f(int i10, C14850a aVar) {
        C17542s.j(aVar, "<unused var>");
        return Integer.valueOf(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C14851b.C3193b bVar, C17642l lVar, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(bVar, lVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
