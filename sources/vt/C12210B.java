package vt;

import A0.g;
import E1.I;
import G1.C4504g;
import It.C10749l;
import It.C10752o;
import It.q;
import KJ.C15987c;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16796C;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5843N;
import s0.C5844O;
import tK.C18030v;
import tt.C11991a;
import x0.v;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u000f\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aW\u0010\u0011\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aW\u0010\u0013\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0012\u001a)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aQ\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LKJ/c;", "LIt/o;", "cards", "", "storeId", "", "isExpandedWidth", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "Landroidx/compose/ui/d;", "modifier", "m", "(LKJ/c;Ljava/lang/String;ZLnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "o", "(LKJ/c;Ljava/lang/String;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "q", "", "pageCount", "currentPage", "t", "(IILandroidx/compose/ui/d;LU0/m;II)V", "item", "i", "(LIt/o;Ljava/lang/String;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LIt/o$a;", "LXH/v;", "w", "(LIt/o$a;Ljava/lang/String;)LXH/v;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vt.B  reason: case insensitive filesystem */
public final class C12210B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.B$a */
    static final class a implements q<d, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C10752o> f105370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f105371b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105373d;

        a(C15987c<? extends C10752o> cVar, String str, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105370a = cVar;
            this.f105371b = str;
            this.f105372c = lVar;
            this.f105373d = lVar2;
        }

        public final void a(d dVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "childModifier");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(dVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(780177921, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCardsExpandedWidth.<anonymous> (ContextualCards.kt:96)");
                }
                C15987c<C10752o> cVar = this.f105370a;
                String str = this.f105371b;
                C17642l<It.q, C16807N> lVar = this.f105372c;
                C17642l<C10749l, C16807N> lVar2 = this.f105373d;
                for (C10752o v10 : cVar) {
                    C12210B.i(v10, str, lVar, lVar2, dVar, mVar, (i10 << 12) & 57344, 0);
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
            a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.B$b */
    static final class b implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C10752o> f105374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f105375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105377d;

        b(C15987c<? extends C10752o> cVar, String str, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105374a = cVar;
            this.f105375b = str;
            this.f105376c = lVar;
            this.f105377d = lVar2;
        }

        public final void a(v vVar, int i10, C4889m mVar, int i11) {
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(-25328406, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCardsSmallWidth.<anonymous>.<anonymous> (ContextualCards.kt:126)");
            }
            C12210B.i(this.f105374a.get(i10), this.f105375b, this.f105376c, this.f105377d, J.k(d.f18749a, h.B((float) 216), 0.0f, 2, (Object) null), mVar, 24576, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(It.C10752o r15, java.lang.String r16, nI.C17642l<? super It.q, XH.C16807N> r17, nI.C17642l<? super It.C10749l, XH.C16807N> r18, androidx.compose.ui.d r19, U0.C4889m r20, int r21, int r22) {
        /*
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r21
            r0 = -2146867626(0xffffffff80096656, float:-8.6323E-40)
            r5 = r20
            U0.m r5 = r5.k(r0)
            r7 = r22 & 1
            if (r7 == 0) goto L_0x0019
            r7 = r6 | 6
            goto L_0x0032
        L_0x0019:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0031
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0026
            boolean r7 = r5.V(r15)
            goto L_0x002a
        L_0x0026:
            boolean r7 = r5.F(r15)
        L_0x002a:
            if (r7 == 0) goto L_0x002e
            r7 = 4
            goto L_0x002f
        L_0x002e:
            r7 = 2
        L_0x002f:
            r7 = r7 | r6
            goto L_0x0032
        L_0x0031:
            r7 = r6
        L_0x0032:
            r8 = r22 & 2
            r9 = 32
            if (r8 == 0) goto L_0x003b
            r7 = r7 | 48
            goto L_0x004a
        L_0x003b:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004a
            boolean r8 = r5.V(r2)
            if (r8 == 0) goto L_0x0047
            r8 = r9
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r7 = r7 | r8
        L_0x004a:
            r8 = r22 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0053
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0053:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0062
            boolean r8 = r5.F(r3)
            if (r8 == 0) goto L_0x005f
            r8 = r10
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r7 = r7 | r8
        L_0x0062:
            r8 = r22 & 8
            r11 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x006b
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006b:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007a
            boolean r8 = r5.F(r4)
            if (r8 == 0) goto L_0x0077
            r8 = r11
            goto L_0x0079
        L_0x0077:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r7 = r7 | r8
        L_0x007a:
            r8 = r22 & 16
            if (r8 == 0) goto L_0x0083
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r12 = r19
            goto L_0x0095
        L_0x0083:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0080
            r12 = r19
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x0092
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r7 = r7 | r13
        L_0x0095:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00a7
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r5.L()
            goto L_0x016f
        L_0x00a7:
            if (r8 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r13 = r8
            goto L_0x00ae
        L_0x00ad:
            r13 = r12
        L_0x00ae:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00ba
            r8 = -1
            java.lang.String r12 = "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCardItem (ContextualCards.kt:182)"
            U0.C4895p.S(r0, r7, r8, r12)
        L_0x00ba:
            boolean r0 = r1 instanceof It.C10752o.a
            r8 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0110
            r0 = -2122654769(0xffffffff817adbcf, float:-4.6075453E-38)
            r5.W(r0)
            r0 = r1
            It.o$a r0 = (It.C10752o.a) r0
            XH.v r9 = w(r0, r2)
            r14 = 1594101922(0x5f0410a2, float:9.516284E18)
            r5.W(r14)
            r14 = r7 & 896(0x380, float:1.256E-42)
            if (r14 != r10) goto L_0x00d9
            r10 = r12
            goto L_0x00da
        L_0x00d9:
            r10 = r8
        L_0x00da:
            boolean r14 = r5.F(r9)
            r10 = r10 | r14
            r14 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != r11) goto L_0x00e4
            r8 = r12
        L_0x00e4:
            r8 = r8 | r10
            java.lang.Object r10 = r5.D()
            if (r8 != 0) goto L_0x00f3
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x00fb
        L_0x00f3:
            vt.x r10 = new vt.x
            r10.<init>(r3, r9, r4)
            r5.u(r10)
        L_0x00fb:
            r8 = r10
            nI.l r8 = (nI.C17642l) r8
            r5.P()
            int r7 = r7 >> 6
            r11 = r7 & 896(0x380, float:1.256E-42)
            r12 = 0
            r7 = r0
            r9 = r13
            r10 = r5
            yt.j.d(r7, r8, r9, r10, r11, r12)
            r5.P()
            goto L_0x0165
        L_0x0110:
            boolean r0 = r1 instanceof It.C10752o.b
            if (r0 == 0) goto L_0x018b
            r0 = -2122210012(0xffffffff8181a524, float:-4.762408E-38)
            r5.W(r0)
            r0 = r1
            It.o$b r0 = (It.C10752o.b) r0
            r14 = 1594113603(0x5f043e43, float:9.529128E18)
            r5.W(r14)
            r14 = r7 & 896(0x380, float:1.256E-42)
            if (r14 != r10) goto L_0x0129
            r10 = r12
            goto L_0x012a
        L_0x0129:
            r10 = r8
        L_0x012a:
            r14 = r7 & 112(0x70, float:1.57E-43)
            if (r14 != r9) goto L_0x0130
            r9 = r12
            goto L_0x0131
        L_0x0130:
            r9 = r8
        L_0x0131:
            r9 = r9 | r10
            r10 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != r11) goto L_0x0137
            r8 = r12
        L_0x0137:
            r8 = r8 | r9
            java.lang.Object r9 = r5.D()
            if (r8 != 0) goto L_0x0146
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x014e
        L_0x0146:
            vt.y r9 = new vt.y
            r9.<init>(r3, r2, r4)
            r5.u(r9)
        L_0x014e:
            nI.l r9 = (nI.C17642l) r9
            r5.P()
            int r8 = IC.C13023e.f110931a
            int r7 = r7 >> 9
            r7 = r7 & 112(0x70, float:1.57E-43)
            r11 = r8 | r7
            r12 = 0
            r7 = r0
            r8 = r13
            r10 = r5
            vt.C12252m0.f(r7, r8, r9, r10, r11, r12)
            r5.P()
        L_0x0165:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016e
            U0.C4895p.R()
        L_0x016e:
            r12 = r13
        L_0x016f:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x018a
            vt.z r9 = new vt.z
            r0 = r9
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r12
            r6 = r21
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x018a:
            return
        L_0x018b:
            r0 = 1594093422(0x5f03ef6e, float:9.506938E18)
            r5.W(r0)
            r5.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12210B.i(It.o, java.lang.String, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, XH.v vVar, C17642l lVar2, String str) {
        C17542s.j(str, "it");
        lVar.invoke(vVar.c());
        lVar2.invoke(vVar.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, String str, C17642l lVar2, String str2) {
        C17542s.j(str2, "it");
        lVar.invoke(new q.p(str, str2));
        lVar2.invoke(new C10749l.f(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C10752o oVar, String str, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(oVar, str, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(KJ.C15987c<? extends It.C10752o> r40, java.lang.String r41, boolean r42, nI.C17642l<? super It.q, XH.C16807N> r43, nI.C17642l<? super It.C10749l, XH.C16807N> r44, androidx.compose.ui.d r45, U0.C4889m r46, int r47, int r48) {
        /*
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r47
            r0 = 16
            r1 = 32
            r2 = 2
            r3 = 4
            java.lang.String r4 = "cards"
            kotlin.jvm.internal.C17542s.j(r8, r4)
            java.lang.String r4 = "storeId"
            kotlin.jvm.internal.C17542s.j(r9, r4)
            java.lang.String r4 = "action"
            kotlin.jvm.internal.C17542s.j(r11, r4)
            java.lang.String r4 = "analyticsAction"
            kotlin.jvm.internal.C17542s.j(r12, r4)
            r4 = 1579462557(0x5e24af9d, float:2.96671904E18)
            r5 = r46
            U0.m r7 = r5.k(r4)
            r5 = 1
            r6 = r48 & 1
            if (r6 == 0) goto L_0x0037
            r6 = r13 | 6
            goto L_0x0050
        L_0x0037:
            r6 = r13 & 6
            if (r6 != 0) goto L_0x004f
            r6 = r13 & 8
            if (r6 != 0) goto L_0x0044
            boolean r6 = r7.V(r8)
            goto L_0x0048
        L_0x0044:
            boolean r6 = r7.F(r8)
        L_0x0048:
            if (r6 == 0) goto L_0x004c
            r6 = r3
            goto L_0x004d
        L_0x004c:
            r6 = r2
        L_0x004d:
            r6 = r6 | r13
            goto L_0x0050
        L_0x004f:
            r6 = r13
        L_0x0050:
            r2 = r48 & 2
            if (r2 == 0) goto L_0x0057
            r6 = r6 | 48
            goto L_0x0065
        L_0x0057:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0065
            boolean r2 = r7.V(r9)
            if (r2 == 0) goto L_0x0063
            r2 = r1
            goto L_0x0064
        L_0x0063:
            r2 = r0
        L_0x0064:
            r6 = r6 | r2
        L_0x0065:
            r2 = r48 & 4
            if (r2 == 0) goto L_0x006c
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x007c
        L_0x006c:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x007c
            boolean r2 = r7.b(r10)
            if (r2 == 0) goto L_0x0079
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x007b
        L_0x0079:
            r2 = 128(0x80, float:1.794E-43)
        L_0x007b:
            r6 = r6 | r2
        L_0x007c:
            r2 = r48 & 8
            if (r2 == 0) goto L_0x0083
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0093
        L_0x0083:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0093
            boolean r2 = r7.F(r11)
            if (r2 == 0) goto L_0x0090
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0090:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0092:
            r6 = r6 | r2
        L_0x0093:
            r0 = r48 & 16
            if (r0 == 0) goto L_0x009a
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00aa
        L_0x009a:
            r0 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r7.F(r12)
            if (r0 == 0) goto L_0x00a7
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r6 = r6 | r0
        L_0x00aa:
            r0 = r48 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x00b4
            r6 = r6 | r1
        L_0x00b1:
            r1 = r45
            goto L_0x00c5
        L_0x00b4:
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00b1
            r1 = r45
            boolean r2 = r7.V(r1)
            if (r2 == 0) goto L_0x00c2
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r6 = r6 | r2
        L_0x00c5:
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r6
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r3) goto L_0x00dc
            boolean r2 = r7.l()
            if (r2 != 0) goto L_0x00d5
            goto L_0x00dc
        L_0x00d5:
            r7.L()
            r6 = r1
            r14 = r7
            goto L_0x0232
        L_0x00dc:
            if (r0 == 0) goto L_0x00e2
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r3 = r0
            goto L_0x00e3
        L_0x00e2:
            r3 = r1
        L_0x00e3:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ef
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCards (ContextualCards.kt:54)"
            U0.C4895p.S(r4, r6, r0, r1)
        L_0x00ef:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r1 = i1.C5437c.f24302a
            i1.c$b r1 = r1.k()
            r2 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r1, r7, r2)
            int r1 = U0.C4883j.a(r7, r2)
            U0.y r4 = r7.s()
            androidx.compose.ui.d r14 = androidx.compose.ui.c.e(r7, r3)
            G1.g$a r15 = G1.C4504g.f6515W
            nI.a r5 = r15.a()
            U0.f r16 = r7.m()
            if (r16 != 0) goto L_0x011b
            U0.C4883j.c()
        L_0x011b:
            r7.I()
            boolean r16 = r7.i()
            if (r16 == 0) goto L_0x0128
            r7.p(r5)
            goto L_0x012b
        L_0x0128:
            r7.t()
        L_0x012b:
            U0.m r5 = U0.F1.a(r7)
            nI.p r2 = r15.c()
            U0.F1.c(r5, r0, r2)
            nI.p r0 = r15.e()
            U0.F1.c(r5, r4, r0)
            nI.p r0 = r15.b()
            boolean r2 = r5.i()
            if (r2 != 0) goto L_0x0155
            java.lang.Object r2 = r5.D()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r4)
            if (r2 != 0) goto L_0x0163
        L_0x0155:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.u(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.w(r1, r0)
        L_0x0163:
            nI.p r0 = r15.d()
            U0.F1.c(r5, r14, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = st.c.f102799q
            r1 = 0
            java.lang.String r14 = J1.j.b(r0, r7, r1)
            TC.b$b$e r15 = TC.C13679b.C2857b.e.f116687a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r1 = 0
            r2 = 0
            r4 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r0, r1, r4, r2)
            androidx.compose.ui.d r16 = TC.e.i(r1)
            r1 = 24
            float r1 = (float) r1
            float r20 = c2.h.B(r1)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r38 = 0
            r39 = 262136(0x3fff8, float:3.67331E-40)
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 48
            r36 = r7
            SC.C13607l.j(r14, r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            if (r10 == 0) goto L_0x01f4
            r1 = -1127842620(0xffffffffbcc67cc4, float:-0.024229415)
            r7.W(r1)
            java.lang.String r1 = "expanded_width_content"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            r0 = r6 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r6 >> 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | r1
            r14 = 0
            r0 = r40
            r1 = r41
            r2 = r43
            r15 = r3
            r3 = r44
            r5 = r7
            r45 = r7
            r7 = r14
            o(r0, r1, r2, r3, r4, r5, r6, r7)
            r45.P()
            r14 = r45
            goto L_0x0225
        L_0x01f4:
            r15 = r3
            r45 = r7
            r1 = -1127529334(0xffffffffbccb448a, float:-0.024812955)
            r14 = r45
            r14.W(r1)
            java.lang.String r1 = "small_width_content"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
            r0 = r6 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r6 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r6 >> 3
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r0 | r1
            r7 = 0
            r0 = r40
            r1 = r41
            r2 = r43
            r3 = r44
            r5 = r14
            q(r0, r1, r2, r3, r4, r5, r6, r7)
            r14.P()
        L_0x0225:
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0231
            U0.C4895p.R()
        L_0x0231:
            r6 = r15
        L_0x0232:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x024f
            vt.t r15 = new vt.t
            r0 = r15
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r7 = r47
            r8 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.a(r15)
        L_0x024f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12210B.m(KJ.c, java.lang.String, boolean, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C15987c cVar, String str, boolean z10, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        m(cVar, str, z10, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void o(KJ.C15987c<? extends It.C10752o> r18, java.lang.String r19, nI.C17642l<? super It.q, XH.C16807N> r20, nI.C17642l<? super It.C10749l, XH.C16807N> r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r6 = r24
            r0 = -1133704388(0xffffffffbc6d0b3c, float:-0.0144680105)
            r5 = r23
            U0.m r5 = r5.k(r0)
            r7 = r25 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x0033
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0032
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0027
            boolean r7 = r5.V(r1)
            goto L_0x002b
        L_0x0027:
            boolean r7 = r5.F(r1)
        L_0x002b:
            if (r7 == 0) goto L_0x002f
            r7 = 4
            goto L_0x0030
        L_0x002f:
            r7 = 2
        L_0x0030:
            r7 = r7 | r6
            goto L_0x0033
        L_0x0032:
            r7 = r6
        L_0x0033:
            r8 = r25 & 2
            r9 = 32
            if (r8 == 0) goto L_0x003c
            r7 = r7 | 48
            goto L_0x004b
        L_0x003c:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004b
            boolean r8 = r5.V(r2)
            if (r8 == 0) goto L_0x0048
            r8 = r9
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r7 = r7 | r8
        L_0x004b:
            r8 = r25 & 4
            if (r8 == 0) goto L_0x0052
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0062
            boolean r8 = r5.F(r3)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r7 = r7 | r8
        L_0x0062:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x0069
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0079
        L_0x0069:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0079
            boolean r8 = r5.F(r4)
            if (r8 == 0) goto L_0x0076
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r7 = r7 | r8
        L_0x0079:
            r8 = r25 & 16
            if (r8 == 0) goto L_0x0082
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x007f:
            r10 = r22
            goto L_0x0094
        L_0x0082:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007f
            r10 = r22
            boolean r11 = r5.V(r10)
            if (r11 == 0) goto L_0x0091
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r7 = r7 | r11
        L_0x0094:
            r11 = r7 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a5
            boolean r11 = r5.l()
            if (r11 != 0) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            r5.L()
            goto L_0x00ee
        L_0x00a5:
            if (r8 == 0) goto L_0x00ac
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r17 = r8
            goto L_0x00ae
        L_0x00ac:
            r17 = r10
        L_0x00ae:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00ba
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCardsExpandedWidth (ContextualCards.kt:91)"
            U0.C4895p.S(r0, r7, r8, r10)
        L_0x00ba:
            float r0 = (float) r9
            float r14 = c2.h.B(r0)
            r15 = 7
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r10 = r17
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r10, r11, r12, r13, r14, r15, r16)
            vt.B$a r0 = new vt.B$a
            r0.<init>(r1, r2, r3, r4)
            r7 = 54
            r9 = 780177921(0x2e809201, float:5.8467016E-11)
            r10 = 1
            c1.a r10 = c1.c.e(r9, r10, r0, r5, r7)
            r12 = 3078(0xc06, float:4.313E-42)
            r13 = 4
            r7 = 1
            r9 = 0
            r11 = r5
            ut.L.b(r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ec
            U0.C4895p.R()
        L_0x00ec:
            r10 = r17
        L_0x00ee:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x010a
            vt.w r9 = new vt.w
            r0 = r9
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r10
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12210B.o(KJ.c, java.lang.String, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C15987c cVar, String str, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(cVar, str, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(KJ.C15987c<? extends It.C10752o> r29, java.lang.String r30, nI.C17642l<? super It.q, XH.C16807N> r31, nI.C17642l<? super It.C10749l, XH.C16807N> r32, androidx.compose.ui.d r33, U0.C4889m r34, int r35, int r36) {
        /*
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r6 = r35
            r0 = -67843326(0xfffffffffbf4cb02, float:-2.5420758E36)
            r5 = r34
            U0.m r5 = r5.k(r0)
            r7 = r36 & 1
            r13 = 2
            r8 = 4
            if (r7 == 0) goto L_0x001c
            r7 = r6 | 6
            goto L_0x0035
        L_0x001c:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0034
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0029
            boolean r7 = r5.V(r1)
            goto L_0x002d
        L_0x0029:
            boolean r7 = r5.F(r1)
        L_0x002d:
            if (r7 == 0) goto L_0x0031
            r7 = r8
            goto L_0x0032
        L_0x0031:
            r7 = r13
        L_0x0032:
            r7 = r7 | r6
            goto L_0x0035
        L_0x0034:
            r7 = r6
        L_0x0035:
            r9 = r36 & 2
            if (r9 == 0) goto L_0x003c
            r7 = r7 | 48
            goto L_0x004c
        L_0x003c:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x004c
            boolean r9 = r5.V(r2)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0049:
            r9 = 16
        L_0x004b:
            r7 = r7 | r9
        L_0x004c:
            r9 = r36 & 4
            if (r9 == 0) goto L_0x0053
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0063
            boolean r9 = r5.F(r3)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r7 = r7 | r9
        L_0x0063:
            r9 = r36 & 8
            if (r9 == 0) goto L_0x006a
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007a
            boolean r9 = r5.F(r4)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r7 = r7 | r9
        L_0x007a:
            r9 = r36 & 16
            if (r9 == 0) goto L_0x0083
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r10 = r33
            goto L_0x0095
        L_0x0083:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0080
            r10 = r33
            boolean r11 = r5.V(r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r7 = r7 | r11
        L_0x0095:
            r11 = r7 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a7
            boolean r11 = r5.l()
            if (r11 != 0) goto L_0x00a2
            goto L_0x00a7
        L_0x00a2:
            r5.L()
            goto L_0x0211
        L_0x00a7:
            if (r9 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r14 = r9
            goto L_0x00ae
        L_0x00ad:
            r14 = r10
        L_0x00ae:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00ba
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.instore.impl.composables.storeselected.ContextualCardsSmallWidth (ContextualCards.kt:116)"
            U0.C4895p.S(r0, r7, r9, r10)
        L_0x00ba:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r25 = i1.C5437c.f24302a
            i1.c$b r9 = r25.k()
            r10 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r9, r5, r10)
            int r9 = U0.C4883j.a(r5, r10)
            U0.y r11 = r5.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r5, r14)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r10 = r16.a()
            U0.f r17 = r5.m()
            if (r17 != 0) goto L_0x00e6
            U0.C4883j.c()
        L_0x00e6:
            r5.I()
            boolean r17 = r5.i()
            if (r17 == 0) goto L_0x00f3
            r5.p(r10)
            goto L_0x00f6
        L_0x00f3:
            r5.t()
        L_0x00f6:
            U0.m r10 = U0.F1.a(r5)
            nI.p r15 = r16.c()
            U0.F1.c(r10, r0, r15)
            nI.p r0 = r16.e()
            U0.F1.c(r10, r11, r0)
            nI.p r0 = r16.b()
            boolean r11 = r10.i()
            if (r11 != 0) goto L_0x0120
            java.lang.Object r11 = r10.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
            if (r11 != 0) goto L_0x012e
        L_0x0120:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r10.u(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.w(r9, r0)
        L_0x012e:
            nI.p r0 = r16.d()
            U0.F1.c(r10, r12, r0)
            s0.h r0 = s0.C5862h.f28810a
            r9 = 1176005449(0x46186b49, float:9754.821)
            r5.W(r9)
            r9 = r7 & 14
            r15 = 1
            if (r9 == r8) goto L_0x014f
            r7 = r7 & 8
            if (r7 == 0) goto L_0x014d
            boolean r7 = r5.F(r1)
            if (r7 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r10 = 0
            goto L_0x0150
        L_0x014f:
            r10 = r15
        L_0x0150:
            java.lang.Object r7 = r5.D()
            if (r10 != 0) goto L_0x015e
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0166
        L_0x015e:
            vt.u r7 = new vt.u
            r7.<init>(r1)
            r5.u(r7)
        L_0x0166:
            r9 = r7
            nI.a r9 = (nI.C17631a) r9
            r5.P()
            r11 = 0
            r12 = 3
            r7 = 0
            r8 = 0
            r10 = r5
            x0.C r26 = x0.C6231D.k(r7, r8, r9, r10, r11, r12)
            r7 = r26
            r8 = 24
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            r9 = 0
            r10 = 0
            s0.E r9 = androidx.compose.foundation.layout.D.c(r8, r9, r13, r10)
            r8 = 12
            float r13 = (float) r8
            float r12 = c2.h.B(r13)
            vt.B$b r8 = new vt.B$b
            r8.<init>(r1, r2, r3, r4)
            r10 = 54
            r11 = -25328406(0xfffffffffe7d84ea, float:-8.4246203E37)
            c1.a r20 = c1.c.e(r11, r15, r8, r5, r10)
            r23 = 3072(0xc00, float:4.305E-42)
            r24 = 8154(0x1fda, float:1.1426E-41)
            r8 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r27 = r13
            r13 = r16
            r28 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 196992(0x30180, float:2.76045E-40)
            r21 = r5
            x0.m.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = 1176021334(0x4618a956, float:9770.334)
            r5.W(r7)
            int r7 = r29.size()
            r13 = 6
            r8 = 1
            if (r7 <= r8) goto L_0x01f0
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            float r8 = c2.h.B(r27)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r7, r8)
            s0.C5844O.a(r8, r5, r13)
            int r8 = r26.G()
            int r9 = r26.v()
            i1.c$b r10 = r25.g()
            androidx.compose.ui.d r0 = r0.b(r7, r10)
            r11 = 0
            r12 = 0
            r7 = r8
            r8 = r9
            r9 = r0
            r10 = r5
            t(r7, r8, r9, r10, r11, r12)
        L_0x01f0:
            r5.P()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r7 = 32
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r7)
            s0.C5844O.a(r0, r5, r13)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x020f
            U0.C4895p.R()
        L_0x020f:
            r10 = r28
        L_0x0211:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x022d
            vt.v r9 = new vt.v
            r0 = r9
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r10
            r6 = r35
            r7 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x022d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.C12210B.q(KJ.c, java.lang.String, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int r(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C15987c cVar, String str, C17642l lVar, C17642l lVar2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        q(cVar, str, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void t(int i10, int i11, d dVar, C4889m mVar, int i12, int i13) {
        int i14;
        long j10;
        C4889m k10 = mVar.k(-1406955326);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (k10.d(i10) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((2 & i13) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= k10.d(i11) ? 32 : 16;
        }
        int i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i14 & 147) != 146 || !k10.l()) {
            if (i15 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1406955326, i14, -1, "com.ingka.ikea.instore.impl.composables.storeselected.PageIndicator (ContextualCards.kt:151)");
            }
            I b10 = G.b(C5073d.f18068a.b(), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, dVar);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            k10.W(-1338523134);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i16 == i11) {
                    k10.W(605555379);
                    j10 = C18030v.f147664a.a(k10, C18030v.f147665b).p0();
                    k10.P();
                } else {
                    k10.W(605618867);
                    j10 = C18030v.f147664a.a(k10, C18030v.f147665b).m0();
                    k10.P();
                }
                d.a aVar2 = d.f18749a;
                C5077h.a(androidx.compose.foundation.b.c(J.t(aVar2, h.B((float) 6)), j10, g.h()), k10, 0);
                k10.W(-1338511302);
                if (i16 < i10 - 1) {
                    C5844O.a(J.y(aVar2, h.B((float) 8)), k10, 6);
                }
                k10.P();
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12209A(i10, i11, dVar2, i12, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, int i11, d dVar, int i12, int i13, C4889m mVar, int i14) {
        t(i10, i11, dVar, mVar, M0.a(i12 | 1), i13);
        return C16807N.f139792a;
    }

    private static final XH.v<It.q, C10749l> w(C10752o.a aVar, String str) {
        return C16796C.a(new q.i(aVar.b()), new C10749l.i(aVar.a(), true, C11991a.d.CONTEXTUAL_CARD, str));
    }
}
