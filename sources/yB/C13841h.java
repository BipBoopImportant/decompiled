package YB;

import A0.g;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.H2;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import WB.j;
import XB.C13801b;
import XH.C16807N;
import XH.v;
import Y1.f;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import cC.r;
import gC.C14508a;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001as\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a¥\u0001\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u001e\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00160\u00170\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aU\u0010\u001e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\nH\u0003¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LWB/j;", "storeData", "Lkotlin/Function1;", "LWB/g$a;", "LXH/N;", "onGetDirectionsClicked", "Lkotlin/Function0;", "onAllOpeningHoursClicked", "LWB/f;", "onStoreNameClicked", "", "onSmallStoreDetailsClicked", "isCompact", "Landroidx/compose/ui/d;", "modifier", "h", "(LWB/j;LnI/l;LnI/a;LnI/l;LnI/l;ZLandroidx/compose/ui/d;LU0/m;II)V", "", "storeName", "address", "LgC/a$a;", "openingHoursHeader", "LKJ/c;", "LXH/v;", "LIC/e;", "openingHours", "LXB/b;", "smallStoreDetailsUiModel", "n", "(Ljava/lang/String;Ljava/lang/String;LgC/a$a;LKJ/c;LnI/a;LnI/a;LnI/a;LnI/l;ZLXB/b;Landroidx/compose/ui/d;LU0/m;III)V", "p", "(LnI/a;Ljava/lang/String;LgC/a$a;ZLXB/b;LnI/l;LU0/m;I)V", "loading", "l", "(ZLU0/m;I)V", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: YB.h  reason: case insensitive filesystem */
public final class C13841h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YB.h$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f118039a;

        a(String str) {
            this.f118039a = str;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1551011370, i11, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDataContent.<anonymous>.<anonymous> (BottomSheetContent.kt:128)");
                }
                String str = this.f118039a;
                if (str != null) {
                    C13607l.j(str, C13679b.a.C2856b.f116680a, D.m(d.f18749a, 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 262136);
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
    /* renamed from: YB.h$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<v<C13023e, C15987c<C13023e>>> f118040a;

        b(C15987c<? extends v<? extends C13023e, ? extends C15987c<? extends C13023e>>> cVar) {
            this.f118040a = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1439426945, i10, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDataContent.<anonymous>.<anonymous> (BottomSheetContent.kt:152)");
                }
                float f10 = (float) 16;
                C5844O.a(J.i(d.f18749a, h.B(f10)), mVar, 6);
                for (v vVar : this.f118040a) {
                    String a10 = ((C13023e) vVar.c()).a(mVar, C13023e.f110931a);
                    mVar.W(525012999);
                    Iterable<C13023e> iterable = (Iterable) vVar.d();
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (C13023e a11 : iterable) {
                        arrayList.add(a11.a(mVar, C13023e.f110931a));
                    }
                    mVar.P();
                    r.S(a10, C15985a.h(arrayList), (d) null, mVar, 0, 4);
                    C5844O.a(J.i(d.f18749a, h.B(f10)), mVar, 6);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(WB.j r24, nI.C17642l<? super WB.C13775g.a, XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, nI.C17642l<? super WB.C13774f, XH.C16807N> r27, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r28, boolean r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r24
            r2 = r25
            r0 = r26
            r15 = r27
            r14 = r28
            r13 = r32
            java.lang.String r3 = "storeData"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "onGetDirectionsClicked"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            java.lang.String r3 = "onAllOpeningHoursClicked"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "onStoreNameClicked"
            kotlin.jvm.internal.C17542s.j(r15, r3)
            java.lang.String r3 = "onSmallStoreDetailsClicked"
            kotlin.jvm.internal.C17542s.j(r14, r3)
            r3 = 1116872743(0x42922027, float:73.0628)
            r4 = r31
            U0.m r12 = r4.k(r3)
            r4 = r33 & 1
            r5 = 4
            if (r4 == 0) goto L_0x0036
            r4 = r13 | 6
            goto L_0x004f
        L_0x0036:
            r4 = r13 & 6
            if (r4 != 0) goto L_0x004e
            r4 = r13 & 8
            if (r4 != 0) goto L_0x0043
            boolean r4 = r12.V(r1)
            goto L_0x0047
        L_0x0043:
            boolean r4 = r12.F(r1)
        L_0x0047:
            if (r4 == 0) goto L_0x004b
            r4 = r5
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            r4 = r4 | r13
            goto L_0x004f
        L_0x004e:
            r4 = r13
        L_0x004f:
            r6 = r33 & 2
            r7 = 32
            if (r6 == 0) goto L_0x0058
            r4 = r4 | 48
            goto L_0x0067
        L_0x0058:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x0067
            boolean r6 = r12.F(r2)
            if (r6 == 0) goto L_0x0064
            r6 = r7
            goto L_0x0066
        L_0x0064:
            r6 = 16
        L_0x0066:
            r4 = r4 | r6
        L_0x0067:
            r6 = r33 & 4
            if (r6 == 0) goto L_0x006e
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x007e
        L_0x006e:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x007e
            boolean r6 = r12.F(r0)
            if (r6 == 0) goto L_0x007b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x007d:
            r4 = r4 | r6
        L_0x007e:
            r6 = r33 & 8
            if (r6 == 0) goto L_0x0085
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0095
        L_0x0085:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0095
            boolean r6 = r12.F(r15)
            if (r6 == 0) goto L_0x0092
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0094
        L_0x0092:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0094:
            r4 = r4 | r6
        L_0x0095:
            r6 = r33 & 16
            if (r6 == 0) goto L_0x009c
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00ac
        L_0x009c:
            r6 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x00ac
            boolean r6 = r12.F(r14)
            if (r6 == 0) goto L_0x00a9
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ab
        L_0x00a9:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00ab:
            r4 = r4 | r6
        L_0x00ac:
            r6 = r33 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00b6
            r4 = r4 | r9
            r11 = r29
            goto L_0x00c8
        L_0x00b6:
            r6 = r13 & r9
            r11 = r29
            if (r6 != 0) goto L_0x00c8
            boolean r6 = r12.b(r11)
            if (r6 == 0) goto L_0x00c5
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c7
        L_0x00c5:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00c7:
            r4 = r4 | r6
        L_0x00c8:
            r6 = r33 & 64
            r9 = 1572864(0x180000, float:2.204052E-39)
            if (r6 == 0) goto L_0x00d2
            r4 = r4 | r9
        L_0x00cf:
            r9 = r30
            goto L_0x00e3
        L_0x00d2:
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00cf
            r9 = r30
            boolean r10 = r12.V(r9)
            if (r10 == 0) goto L_0x00e0
            r10 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r10 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r4 = r4 | r10
        L_0x00e3:
            r10 = 599187(0x92493, float:8.3964E-40)
            r10 = r10 & r4
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r8) goto L_0x00fa
            boolean r8 = r12.l()
            if (r8 != 0) goto L_0x00f3
            goto L_0x00fa
        L_0x00f3:
            r12.L()
            r7 = r9
            r3 = r12
            goto L_0x0236
        L_0x00fa:
            if (r6 == 0) goto L_0x0101
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r18 = r6
            goto L_0x0103
        L_0x0101:
            r18 = r9
        L_0x0103:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x010f
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.BottomSheetContent (BottomSheetContent.kt:61)"
            U0.C4895p.S(r3, r4, r6, r8)
        L_0x010f:
            WB.j$c r3 = WB.j.c.f117544a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 != 0) goto L_0x011f
            WB.j$b r3 = WB.j.b.f117543a
            boolean r3 = kotlin.jvm.internal.C17542s.e(r1, r3)
            if (r3 == 0) goto L_0x0122
        L_0x011f:
            r3 = r12
            goto L_0x021c
        L_0x0122:
            boolean r3 = r1 instanceof WB.j.a
            if (r3 == 0) goto L_0x0209
            r3 = -119767682(0xfffffffff8dc7d7e, float:-3.577658E34)
            r12.W(r3)
            r3 = r1
            WB.j$a r3 = (WB.j.a) r3
            java.lang.String r8 = r3.f()
            gC.a$a r9 = r3.d()
            KJ.c r10 = r3.c()
            java.lang.String r16 = r3.a()
            XB.b r17 = r3.e()
            r3 = 1797261482(0x6b2008aa, float:1.9346905E26)
            r12.W(r3)
            r3 = r4 & 112(0x70, float:1.57E-43)
            r19 = 1
            if (r3 != r7) goto L_0x0152
            r3 = r19
            goto L_0x0153
        L_0x0152:
            r3 = 0
        L_0x0153:
            r7 = r4 & 14
            if (r7 == r5) goto L_0x0165
            r20 = r4 & 8
            if (r20 == 0) goto L_0x0162
            boolean r20 = r12.F(r1)
            if (r20 == 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r20 = 0
            goto L_0x0167
        L_0x0165:
            r20 = r19
        L_0x0167:
            r3 = r3 | r20
            java.lang.Object r6 = r12.D()
            if (r3 != 0) goto L_0x0177
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x017f
        L_0x0177:
            YB.a r6 = new YB.a
            r6.<init>(r2, r1)
            r12.u(r6)
        L_0x017f:
            r20 = r6
            nI.a r20 = (nI.C17631a) r20
            r12.P()
            r3 = 1797268029(0x6b20223d, float:1.9358982E26)
            r12.W(r3)
            r3 = r4 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 != r6) goto L_0x0195
            r3 = r19
            goto L_0x0196
        L_0x0195:
            r3 = 0
        L_0x0196:
            if (r7 == r5) goto L_0x01a5
            r5 = r4 & 8
            if (r5 == 0) goto L_0x01a3
            boolean r5 = r12.F(r1)
            if (r5 == 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r6 = 0
            goto L_0x01a7
        L_0x01a5:
            r6 = r19
        L_0x01a7:
            r3 = r3 | r6
            java.lang.Object r5 = r12.D()
            if (r3 != 0) goto L_0x01b6
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x01be
        L_0x01b6:
            YB.b r5 = new YB.b
            r5.<init>(r15, r1)
            r12.u(r5)
        L_0x01be:
            r19 = r5
            nI.a r19 = (nI.C17631a) r19
            r12.P()
            int r3 = gC.C14508a.C3116a.f127298d
            int r3 = r3 << 6
            int r5 = IC.C13023e.f110931a
            int r5 = r5 << 9
            r3 = r3 | r5
            int r5 = r4 << 9
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r5
            r3 = r3 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r5
            r3 = r3 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r5 = r5 & r6
            r21 = r3 | r5
            int r3 = r4 >> 18
            r22 = r3 & 14
            r23 = 0
            r3 = r8
            r4 = r16
            r5 = r9
            r6 = r10
            r7 = r20
            r8 = r26
            r9 = r19
            r10 = r28
            r11 = r29
            r31 = r12
            r12 = r17
            r13 = r18
            r14 = r31
            r15 = r21
            r16 = r22
            r17 = r23
            n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r31.P()
            r3 = r31
            goto L_0x022b
        L_0x0209:
            r31 = r12
            r0 = 1797241744(0x6b1fbb90, float:1.9310494E26)
            r3 = r31
            r3.W(r0)
            r3.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x021c:
            r4 = -119991068(0xfffffffff8d914e4, float:-3.5223504E34)
            r3.W(r4)
            boolean r4 = r1 instanceof WB.j.c
            r5 = 0
            l(r4, r3, r5)
            r3.P()
        L_0x022b:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0234
            U0.C4895p.R()
        L_0x0234:
            r7 = r18
        L_0x0236:
            U0.Y0 r10 = r3.n()
            if (r10 == 0) goto L_0x0255
            YB.c r11 = new YB.c
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r8 = r32
            r9 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x0255:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.C13841h.h(WB.j, nI.l, nI.a, nI.l, nI.l, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, WB.j jVar) {
        lVar.invoke(((j.a) jVar).b().b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, WB.j jVar) {
        lVar.invoke(((j.a) jVar).b().a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(WB.j jVar, C17642l lVar, C17631a aVar, C17642l lVar2, C17642l lVar3, boolean z10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(jVar, lVar, aVar, lVar2, lVar3, z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void l(boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1530974937);
        if ((i10 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1530974937, i11, -1, "com.ingka.ikea.storedetails.impl.map.presentation.ui.ContentLoadingSkeleton (BottomSheetContent.kt:243)");
            }
            d.a aVar = d.f18749a;
            d a10 = C5116k1.a(e.i(aVar), "BottomSheetContentLoadingOverlay");
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            float f10 = (float) 32;
            C5844O.a(J.i(aVar, h.B(f10)), k10, 6);
            float f11 = (float) 16;
            int i12 = (i11 << 3) & 112;
            H2.b(m1.e.a(J.g(J.i(aVar, h.B(f10)), 0.4f), g.e(h.B(f11))), z10, k10, i12, 0);
            C5844O.a(J.i(aVar, h.B(f11)), k10, 6);
            H2.b(m1.e.a(J.g(J.i(aVar, h.B((float) 24)), 0.6666667f), g.e(h.B((float) 12))), z10, k10, i12, 0);
            C5844O.a(C5861g.c(hVar, aVar, 1.0f, false, 2, (Object) null), k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13837d(z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(boolean z10, int i10, C4889m mVar, int i11) {
        l(z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void n(java.lang.String r52, java.lang.String r53, gC.C14508a.C3116a r54, KJ.C15987c<? extends XH.v<? extends IC.C13023e, ? extends KJ.C15987c<? extends IC.C13023e>>> r55, nI.C17631a<XH.C16807N> r56, nI.C17631a<XH.C16807N> r57, nI.C17631a<XH.C16807N> r58, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r59, boolean r60, XB.C13801b r61, androidx.compose.ui.d r62, U0.C4889m r63, int r64, int r65, int r66) {
        /*
            r2 = r53
            r11 = r54
            r12 = r55
            r13 = r64
            r14 = r66
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r3 = 1024(0x400, float:1.435E-42)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 256(0x100, float:3.59E-43)
            r6 = 32
            r7 = 16
            r15 = 6
            r8 = -1838200278(0xffffffff926f4a2a, float:-7.5506517E-28)
            r9 = r63
            U0.m r10 = r9.k(r8)
            r9 = 1
            r16 = r14 & 1
            r17 = 4
            r9 = 2
            if (r16 == 0) goto L_0x002d
            r16 = r13 | 6
            r0 = r52
            goto L_0x0043
        L_0x002d:
            r16 = r13 & 6
            r0 = r52
            if (r16 != 0) goto L_0x0041
            boolean r16 = r10.V(r0)
            if (r16 == 0) goto L_0x003c
            r16 = r17
            goto L_0x003e
        L_0x003c:
            r16 = r9
        L_0x003e:
            r16 = r13 | r16
            goto L_0x0043
        L_0x0041:
            r16 = r13
        L_0x0043:
            r18 = r14 & 2
            if (r18 == 0) goto L_0x004c
            r16 = r16 | 48
        L_0x0049:
            r8 = r16
            goto L_0x005e
        L_0x004c:
            r18 = r13 & 48
            if (r18 != 0) goto L_0x0049
            boolean r18 = r10.V(r2)
            if (r18 == 0) goto L_0x0059
            r18 = r6
            goto L_0x005b
        L_0x0059:
            r18 = r7
        L_0x005b:
            r16 = r16 | r18
            goto L_0x0049
        L_0x005e:
            r16 = r14 & 4
            if (r16 == 0) goto L_0x0065
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x007c
        L_0x0065:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x007c
            r9 = r13 & 512(0x200, float:7.175E-43)
            if (r9 != 0) goto L_0x0072
            boolean r9 = r10.V(r11)
            goto L_0x0076
        L_0x0072:
            boolean r9 = r10.F(r11)
        L_0x0076:
            if (r9 == 0) goto L_0x007a
            r9 = r5
            goto L_0x007b
        L_0x007a:
            r9 = r4
        L_0x007b:
            r8 = r8 | r9
        L_0x007c:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0083
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x009b
        L_0x0083:
            r9 = r13 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x009b
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L_0x0090
            boolean r9 = r10.V(r12)
            goto L_0x0094
        L_0x0090:
            boolean r9 = r10.F(r12)
        L_0x0094:
            if (r9 == 0) goto L_0x0099
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x009a
        L_0x0099:
            r9 = r3
        L_0x009a:
            r8 = r8 | r9
        L_0x009b:
            r9 = r14 & 16
            if (r9 == 0) goto L_0x00a4
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x00a1:
            r9 = r56
            goto L_0x00b7
        L_0x00a4:
            r9 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x00a1
            r9 = r56
            boolean r19 = r10.F(r9)
            if (r19 == 0) goto L_0x00b3
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b5
        L_0x00b3:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00b5:
            r8 = r8 | r19
        L_0x00b7:
            r6 = r6 & r14
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r6 == 0) goto L_0x00c1
            r8 = r8 | r19
        L_0x00be:
            r6 = r57
            goto L_0x00d4
        L_0x00c1:
            r6 = r13 & r19
            if (r6 != 0) goto L_0x00be
            r6 = r57
            boolean r19 = r10.F(r6)
            if (r19 == 0) goto L_0x00d0
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d2
        L_0x00d0:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00d2:
            r8 = r8 | r19
        L_0x00d4:
            r19 = r14 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00df
            r8 = r8 | r20
            r7 = r58
            goto L_0x00f2
        L_0x00df:
            r19 = r13 & r20
            r7 = r58
            if (r19 != 0) goto L_0x00f2
            boolean r20 = r10.F(r7)
            if (r20 == 0) goto L_0x00ee
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f0
        L_0x00ee:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00f0:
            r8 = r8 | r20
        L_0x00f2:
            r4 = r4 & r14
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r4 == 0) goto L_0x00fc
            r8 = r8 | r20
        L_0x00f9:
            r4 = r59
            goto L_0x010f
        L_0x00fc:
            r4 = r13 & r20
            if (r4 != 0) goto L_0x00f9
            r4 = r59
            boolean r20 = r10.F(r4)
            if (r20 == 0) goto L_0x010b
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r8 = r8 | r20
        L_0x010f:
            r5 = r5 & r14
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 == 0) goto L_0x0119
            r8 = r8 | r20
        L_0x0116:
            r5 = r60
            goto L_0x012c
        L_0x0119:
            r5 = r13 & r20
            if (r5 != 0) goto L_0x0116
            r5 = r60
            boolean r20 = r10.b(r5)
            if (r20 == 0) goto L_0x0128
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r8 = r8 | r20
        L_0x012c:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0135
            r8 = r8 | r1
            r15 = r61
        L_0x0133:
            r1 = r8
            goto L_0x0147
        L_0x0135:
            r1 = r1 & r13
            r15 = r61
            if (r1 != 0) goto L_0x0133
            boolean r1 = r10.V(r15)
            if (r1 == 0) goto L_0x0143
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r8 = r8 | r1
            goto L_0x0133
        L_0x0147:
            r3 = r3 & r14
            r8 = 6
            if (r3 == 0) goto L_0x0152
            r17 = r65 | 6
            r8 = r62
        L_0x014f:
            r0 = r17
            goto L_0x0166
        L_0x0152:
            r20 = r65 & 6
            r8 = r62
            if (r20 != 0) goto L_0x0164
            boolean r20 = r10.V(r8)
            if (r20 == 0) goto L_0x015f
            goto L_0x0161
        L_0x015f:
            r17 = 2
        L_0x0161:
            r17 = r65 | r17
            goto L_0x014f
        L_0x0164:
            r0 = r65
        L_0x0166:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r1 & r17
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r5) goto L_0x0184
            r4 = r0 & 3
            r5 = 2
            if (r4 != r5) goto L_0x0184
            boolean r4 = r10.l()
            if (r4 != 0) goto L_0x017c
            goto L_0x0184
        L_0x017c:
            r10.L()
            r50 = r8
            r11 = r10
            goto L_0x0349
        L_0x0184:
            if (r3 == 0) goto L_0x0189
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r8 = r3
        L_0x0189:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0197
            java.lang.String r3 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreDataContent (BottomSheetContent.kt:108)"
            r4 = -1838200278(0xffffffff926f4a2a, float:-7.5506517E-28)
            U0.C4895p.S(r4, r1, r0, r3)
        L_0x0197:
            java.lang.String r0 = "BottomSheetContentRoot"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r8, r0)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r5 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r10, r5)
            int r4 = U0.C4883j.a(r10, r5)
            U0.y r5 = r10.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r10, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r6 = r16.a()
            U0.f r17 = r10.m()
            if (r17 != 0) goto L_0x01c9
            U0.C4883j.c()
        L_0x01c9:
            r10.I()
            boolean r17 = r10.i()
            if (r17 == 0) goto L_0x01d6
            r10.p(r6)
            goto L_0x01d9
        L_0x01d6:
            r10.t()
        L_0x01d9:
            U0.m r6 = U0.F1.a(r10)
            nI.p r7 = r16.c()
            U0.F1.c(r6, r3, r7)
            nI.p r3 = r16.e()
            U0.F1.c(r6, r5, r3)
            nI.p r3 = r16.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x0203
            java.lang.Object r5 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x0211
        L_0x0203:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.w(r4, r3)
        L_0x0211:
            nI.p r3 = r16.d()
            U0.F1.c(r6, r0, r3)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r3 = 16
            float r7 = (float) r3
            float r3 = c2.h.B(r7)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r0, r3)
            r4 = 6
            s0.C5844O.a(r3, r10, r4)
            int r3 = r1 >> 18
            r3 = r3 & 14
            int r5 = r1 << 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r3 = r3 | r5
            int r5 = gC.C14508a.C3116a.f127298d
            int r5 = r5 << r4
            r3 = r3 | r5
            r4 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 | r4
            int r4 = r1 >> 15
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r5
            r3 = r3 | r4
            r4 = 6
            int r5 = r1 >> 6
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r5
            r16 = r3 | r4
            r3 = r58
            r4 = r52
            r6 = 0
            r5 = r54
            r11 = r6
            r6 = r60
            r35 = r7
            r7 = r61
            r50 = r8
            r8 = r59
            r9 = r10
            r11 = r10
            r10 = r16
            p(r3, r4, r5, r6, r7, r8, r9, r10)
            float r3 = c2.h.B(r35)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r0, r3)
            r4 = 6
            s0.C5844O.a(r3, r11, r4)
            int r3 = TB.C13677a.f116673n
            r4 = 0
            java.lang.String r16 = J1.j.b(r3, r11, r4)
            SC.b1$a r21 = SC.C13569b1.a.f116142b
            r38 = r21
            java.lang.String r3 = "BottomSheetContentDirectionsButton"
            androidx.compose.ui.d r18 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            YB.h$a r3 = new YB.h$a
            r3.<init>(r2)
            r4 = -1551011370(0xffffffffa38d71d6, float:-1.5335462E-17)
            r5 = 1
            r6 = 54
            c1.a r23 = c1.c.e(r4, r5, r3, r11, r6)
            int r3 = r1 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 12583296(0xc00180, float:1.7632953E-38)
            r3 = r3 | r4
            int r4 = SC.C13569b1.a.f116143c
            int r6 = r4 << 15
            r30 = r3 | r6
            r31 = 6
            r32 = 7000(0x1b58, float:9.809E-42)
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 0
            r17 = r56
            r29 = r11
            SC.C13585f1.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            float r3 = c2.h.B(r35)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r0, r3)
            r6 = 6
            s0.C5844O.a(r3, r11, r6)
            androidx.compose.ui.d r16 = TC.e.i(r0)
            r21 = 0
            r22 = 6
            r17 = 0
            r18 = 0
            r20 = r11
            SC.C13643u0.c(r16, r17, r18, r20, r21, r22)
            int r3 = TB.C13677a.f116677r
            r6 = 0
            java.lang.String r16 = J1.j.b(r3, r11, r6)
            SC.g1 r24 = SC.C13589g1.Large
            r41 = r24
            YB.h$b r3 = new YB.h$b
            r3.<init>(r12)
            r6 = -1439426945(0xffffffffaa34167f, float:-1.5995016E-13)
            r7 = 54
            c1.a r23 = c1.c.e(r6, r5, r3, r11, r7)
            r32 = 6780(0x1a7c, float:9.501E-42)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r30 = 113246256(0x6c00030, float:7.222265E-35)
            SC.C13585f1.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            int r3 = TB.C13677a.f116676q
            r5 = 0
            java.lang.String r33 = J1.j.b(r3, r11, r5)
            java.lang.String r3 = "BottomSheetContentOpeningHoursButton"
            androidx.compose.ui.d r35 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            YB.i r0 = YB.C13842i.f118041a
            nI.p r40 = r0.a()
            int r0 = r1 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 113246592(0x6c00180, float:7.2224577E-35)
            r0 = r0 | r1
            int r1 = r4 << 15
            r47 = r0 | r1
            r48 = 6
            r49 = 6744(0x1a58, float:9.45E-42)
            r36 = 0
            r37 = 0
            r39 = 0
            r42 = 0
            r43 = 1
            r44 = 0
            r45 = 0
            r34 = r57
            r46 = r11
            SC.C13585f1.c(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r11.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0349
            U0.C4895p.R()
        L_0x0349:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x037a
            YB.e r10 = new YB.e
            r0 = r10
            r1 = r52
            r2 = r53
            r3 = r54
            r4 = r55
            r5 = r56
            r6 = r57
            r7 = r58
            r8 = r59
            r9 = r60
            r12 = r10
            r10 = r61
            r15 = r11
            r11 = r50
            r51 = r12
            r12 = r64
            r13 = r65
            r14 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r51
            r15.a(r0)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.C13841h.n(java.lang.String, java.lang.String, gC.a$a, KJ.c, nI.a, nI.a, nI.a, nI.l, boolean, XB.b, androidx.compose.ui.d, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(String str, String str2, C14508a.C3116a aVar, C15987c cVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, C17642l lVar, boolean z10, C13801b bVar, d dVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        n(str, str2, aVar, cVar, aVar2, aVar3, aVar4, lVar, z10, bVar, dVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void p(nI.C17631a<XH.C16807N> r40, java.lang.String r41, gC.C14508a.C3116a r42, boolean r43, XB.C13801b r44, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r45, U0.C4889m r46, int r47) {
        /*
            r1 = r40
            r3 = r42
            r11 = r44
            r12 = r47
            r0 = -1854135730(0xffffffff917c224e, float:-1.9889866E-28)
            r2 = r46
            U0.m r2 = r2.k(r0)
            r4 = r12 & 6
            r5 = 4
            if (r4 != 0) goto L_0x0021
            boolean r4 = r2.F(r1)
            if (r4 == 0) goto L_0x001e
            r4 = r5
            goto L_0x001f
        L_0x001e:
            r4 = 2
        L_0x001f:
            r4 = r4 | r12
            goto L_0x0022
        L_0x0021:
            r4 = r12
        L_0x0022:
            r6 = r12 & 48
            r7 = 16
            r10 = r41
            if (r6 != 0) goto L_0x0035
            boolean r6 = r2.V(r10)
            if (r6 == 0) goto L_0x0033
            r6 = 32
            goto L_0x0034
        L_0x0033:
            r6 = r7
        L_0x0034:
            r4 = r4 | r6
        L_0x0035:
            r6 = r12 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004e
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r2.V(r3)
            goto L_0x0046
        L_0x0042:
            boolean r6 = r2.F(r3)
        L_0x0046:
            if (r6 == 0) goto L_0x004b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x004d
        L_0x004b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r4 = r4 | r6
        L_0x004e:
            r6 = r12 & 3072(0xc00, float:4.305E-42)
            r9 = r43
            if (r6 != 0) goto L_0x0060
            boolean r6 = r2.b(r9)
            if (r6 == 0) goto L_0x005d
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x005f
        L_0x005d:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x005f:
            r4 = r4 | r6
        L_0x0060:
            r6 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0070
            boolean r6 = r2.V(r11)
            if (r6 == 0) goto L_0x006d
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006f
        L_0x006d:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x006f:
            r4 = r4 | r6
        L_0x0070:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r12
            r8 = r45
            if (r6 != 0) goto L_0x0083
            boolean r6 = r2.F(r8)
            if (r6 == 0) goto L_0x0080
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0082
        L_0x0080:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x0082:
            r4 = r4 | r6
        L_0x0083:
            r6 = 74899(0x12493, float:1.04956E-40)
            r6 = r6 & r4
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r6 != r13) goto L_0x0098
            boolean r6 = r2.l()
            if (r6 != 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            r2.L()
            goto L_0x0376
        L_0x0098:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a4
            r6 = -1
            java.lang.String r13 = "com.ingka.ikea.storedetails.impl.map.presentation.ui.StoreNameAndOpeningHours (BottomSheetContent.kt:190)"
            U0.C4895p.S(r0, r4, r6, r13)
        L_0x00a4:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = 1882090332(0x702e6b5c, float:2.1592072E29)
            r2.W(r6)
            r6 = r4 & 14
            r15 = 0
            if (r6 != r5) goto L_0x00b3
            r6 = 1
            goto L_0x00b4
        L_0x00b3:
            r6 = r15
        L_0x00b4:
            java.lang.Object r14 = r2.D()
            if (r6 != 0) goto L_0x00c2
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r14 != r6) goto L_0x00ca
        L_0x00c2:
            YB.f r14 = new YB.f
            r14.<init>(r1)
            r2.u(r14)
        L_0x00ca:
            r18 = r14
            nI.a r18 = (nI.C17631a) r18
            r2.P()
            r19 = 7
            r20 = 0
            r6 = 0
            r16 = 0
            r17 = 0
            r14 = r0
            r5 = r15
            r15 = r6
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.ui.d r14 = TC.e.i(r6)
            float r6 = (float) r7
            float r16 = c2.h.B(r6)
            r19 = 13
            r15 = 0
            r17 = 0
            r18 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = "BottomSheetContentStoreName"
            androidx.compose.ui.d r6 = androidx.compose.ui.platform.C5116k1.a(r6, r7)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r14 = r7.g()
            i1.c$a r39 = i1.C5437c.f24302a
            i1.c$b r15 = r39.k()
            E1.I r14 = androidx.compose.foundation.layout.C5080k.a(r14, r15, r2, r5)
            int r15 = U0.C4883j.a(r2, r5)
            U0.y r5 = r2.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r2, r6)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r13 = r16.a()
            U0.f r18 = r2.m()
            if (r18 != 0) goto L_0x0126
            U0.C4883j.c()
        L_0x0126:
            r2.I()
            boolean r18 = r2.i()
            if (r18 == 0) goto L_0x0133
            r2.p(r13)
            goto L_0x0136
        L_0x0133:
            r2.t()
        L_0x0136:
            U0.m r13 = U0.F1.a(r2)
            nI.p r1 = r16.c()
            U0.F1.c(r13, r14, r1)
            nI.p r1 = r16.e()
            U0.F1.c(r13, r5, r1)
            nI.p r1 = r16.b()
            boolean r5 = r13.i()
            if (r5 != 0) goto L_0x0160
            java.lang.Object r5 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r14)
            if (r5 != 0) goto L_0x016e
        L_0x0160:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r13.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r13.w(r5, r1)
        L_0x016e:
            nI.p r1 = r16.d()
            U0.F1.c(r13, r6, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 0
            r5 = 0
            r6 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r0, r1, r6, r5)
            androidx.compose.foundation.layout.d$e r5 = r7.f()
            i1.c$c r6 = r39.l()
            r13 = 0
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r6, r2, r13)
            int r6 = U0.C4883j.a(r2, r13)
            U0.y r13 = r2.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r2, r1)
            nI.a r14 = r16.a()
            U0.f r15 = r2.m()
            if (r15 != 0) goto L_0x01a4
            U0.C4883j.c()
        L_0x01a4:
            r2.I()
            boolean r15 = r2.i()
            if (r15 == 0) goto L_0x01b1
            r2.p(r14)
            goto L_0x01b4
        L_0x01b1:
            r2.t()
        L_0x01b4:
            U0.m r14 = U0.F1.a(r2)
            nI.p r15 = r16.c()
            U0.F1.c(r14, r5, r15)
            nI.p r5 = r16.e()
            U0.F1.c(r14, r13, r5)
            nI.p r5 = r16.b()
            boolean r13 = r14.i()
            if (r13 != 0) goto L_0x01de
            java.lang.Object r13 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
            if (r13 != 0) goto L_0x01ec
        L_0x01de:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r14.u(r13)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r5)
        L_0x01ec:
            nI.p r5 = r16.d()
            U0.F1.c(r14, r1, r5)
            s0.N r1 = s0.C5843N.f28726a
            androidx.compose.foundation.layout.d$m r5 = r7.g()
            i1.c$b r6 = r39.k()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r2, r7)
            int r6 = U0.C4883j.a(r2, r7)
            U0.y r7 = r2.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r2, r0)
            nI.a r14 = r16.a()
            U0.f r15 = r2.m()
            if (r15 != 0) goto L_0x021b
            U0.C4883j.c()
        L_0x021b:
            r2.I()
            boolean r15 = r2.i()
            if (r15 == 0) goto L_0x0228
            r2.p(r14)
            goto L_0x022b
        L_0x0228:
            r2.t()
        L_0x022b:
            U0.m r14 = U0.F1.a(r2)
            nI.p r15 = r16.c()
            U0.F1.c(r14, r5, r15)
            nI.p r5 = r16.e()
            U0.F1.c(r14, r7, r5)
            nI.p r5 = r16.b()
            boolean r7 = r14.i()
            if (r7 != 0) goto L_0x0255
            java.lang.Object r7 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r15)
            if (r7 != 0) goto L_0x0263
        L_0x0255:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.w(r6, r5)
        L_0x0263:
            nI.p r5 = r16.d()
            U0.F1.c(r14, r13, r5)
            TC.b$b$a r14 = TC.C13679b.C2857b.a.f116683a
            int r5 = r4 >> 3
            r5 = r5 & 14
            r36 = r5 | 48
            r37 = 0
            r38 = 262140(0x3fffc, float:3.67336E-40)
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r13 = r41
            r35 = r2
            SC.C13607l.j(r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r5 = -1300252202(0xffffffffb27fb9d6, float:-1.4885208E-8)
            r2.W(r5)
            if (r3 != 0) goto L_0x02a6
            goto L_0x02ca
        L_0x02a6:
            r5 = 4
            float r5 = (float) r5
            float r16 = c2.h.B(r5)
            r19 = 13
            r20 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r14 = r0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = "BottomSheetContentOpeningHoursHeader"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            int r6 = gC.C14508a.C3116a.f127298d
            r6 = r6 | 48
            r7 = 0
            hC.C14528b.b(r3, r5, r2, r6, r7)
            XH.N r5 = XH.C16807N.f139792a
        L_0x02ca:
            r2.P()
            r2.x()
            r18 = 2
            r19 = 0
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r14 = r1
            r15 = r0
            androidx.compose.ui.d r5 = s0.C5842M.e(r14, r15, r16, r17, r18, r19)
            r6 = 0
            s0.C5844O.a(r5, r2, r6)
            int r5 = uK.C18146a.f148101J6
            t1.c r13 = J1.e.c(r5, r2, r6)
            int r5 = Oo.b.f84577a
            java.lang.Object[] r7 = new java.lang.Object[]{r41}
            java.lang.String r14 = J1.j.c(r5, r7, r2, r6)
            i1.c$c r5 = r39.i()
            androidx.compose.ui.d r15 = r1.c(r0, r5)
            tK.v r1 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r1 = r1.a(r2, r5)
            long r16 = r1.G0()
            r19 = 0
            r20 = 0
            r18 = r2
            O0.V.a(r13, r14, r15, r16, r18, r19, r20)
            r2.x()
            r1 = -55476762(0xfffffffffcb17de6, float:-7.3727205E36)
            r2.W(r1)
            r1 = 24
            if (r11 == 0) goto L_0x034b
            float r5 = (float) r1
            float r16 = c2.h.B(r5)
            r19 = 13
            r20 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r14 = r0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            int r5 = r4 >> 12
            r5 = r5 & 14
            r5 = r5 | 384(0x180, float:5.38E-43)
            int r4 = r4 >> 6
            r7 = r4 & 112(0x70, float:1.57E-43)
            r5 = r5 | r7
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r13 = r5 | r4
            r14 = 0
            r4 = r44
            r5 = r43
            r7 = r45
            r8 = r2
            r9 = r13
            r10 = r14
            YB.C13824H.v(r4, r5, r6, r7, r8, r9, r10)
        L_0x034b:
            r2.P()
            float r1 = (float) r1
            float r16 = c2.h.B(r1)
            r19 = 13
            r20 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r14 = r0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
            r9 = 6
            r10 = 6
            r5 = 0
            r6 = 0
            r8 = r2
            SC.C13643u0.c(r4, r5, r6, r8, r9, r10)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0376
            U0.C4895p.R()
        L_0x0376:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x0393
            YB.g r9 = new YB.g
            r0 = r9
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0393:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YB.C13841h.p(nI.a, java.lang.String, gC.a$a, boolean, XB.b, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17631a aVar, String str, C14508a.C3116a aVar2, boolean z10, C13801b bVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        p(aVar, str, aVar2, z10, bVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }
}
