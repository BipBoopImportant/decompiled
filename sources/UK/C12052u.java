package uk;

import IC.C13026h;
import MB.C13194a;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import android.content.Context;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import lm.c;
import lm.d;
import nI.C17631a;
import nI.C17642l;
import pk.C11724c;
import pk.g;
import pk.s;
import pk.v;
import uk.C12056w;
import x4.C8951o;
import zk.C12529b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aG\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u0002"}, d2 = {"Lzk/b;", "navigationContract", "", "shouldScrollToTop", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "onListDeleted", "onShouldScrollToTopConsumed", "Lkotlin/Function1;", "onScrollStateChanged", "Lpk/v;", "viewModel", "h", "(Lzk/b;ZLnI/a;LnI/a;LnI/a;LnI/l;Lpk/v;LU0/m;II)V", "", "productName", "itemNo", "", "quantity", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "Lx4/o;", "navController", "requestKey", "q", "(Ljava/lang/String;Ljava/lang/String;ILcom/ingka/ikea/analytics/Interaction$Component;Lx4/o;Ljava/lang/String;Lzk/b;)V", "Lpk/s;", "state", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uk.u  reason: case insensitive filesystem */
public final class C12052u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uk.u$a */
    /* synthetic */ class a extends C17540p implements C17642l<C11724c, C16807N> {
        a(Object obj) {
            super(1, obj, v.class, "onAction", "onAction(Lcom/ingka/ikea/app/shoppinglist/listdetails/presentation/ShoppingListDetailsContract$Action;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C11724c) obj);
            return C16807N.f139792a;
        }

        public final void t(C11724c cVar) {
            C17542s.j(cVar, "p0");
            ((v) this.receiver).t0(cVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uk.u$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f103771a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                sB.a$a[] r0 = sB.C15035a.C3239a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sB.a$a r1 = sB.C15035a.C3239a.ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sB.a$a r1 = sB.C15035a.C3239a.REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f103771a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uk.C12052u.b.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(zk.C12529b r27, boolean r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, nI.C17631a<XH.C16807N> r31, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r32, pk.v r33, U0.C4889m r34, int r35, int r36) {
        /*
            r9 = r27
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r35
            java.lang.String r0 = "navigationContract"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "onCloseClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onListDeleted"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onShouldScrollToTopConsumed"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onScrollStateChanged"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 230716108(0xdc072cc, float:1.186055E-30)
            r1 = r34
            U0.m r15 = r1.k(r0)
            r1 = r36 & 1
            r8 = 4
            if (r1 == 0) goto L_0x0036
            r1 = r14 | 6
            goto L_0x004f
        L_0x0036:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x004e
            r1 = r14 & 8
            if (r1 != 0) goto L_0x0043
            boolean r1 = r15.V(r9)
            goto L_0x0047
        L_0x0043:
            boolean r1 = r15.F(r9)
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            r1 = r8
            goto L_0x004c
        L_0x004b:
            r1 = 2
        L_0x004c:
            r1 = r1 | r14
            goto L_0x004f
        L_0x004e:
            r1 = r14
        L_0x004f:
            r2 = r36 & 2
            if (r2 == 0) goto L_0x0058
            r1 = r1 | 48
            r7 = r28
            goto L_0x006a
        L_0x0058:
            r2 = r14 & 48
            r7 = r28
            if (r2 != 0) goto L_0x006a
            boolean r2 = r15.b(r7)
            if (r2 == 0) goto L_0x0067
            r2 = 32
            goto L_0x0069
        L_0x0067:
            r2 = 16
        L_0x0069:
            r1 = r1 | r2
        L_0x006a:
            r2 = r36 & 4
            r6 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0073
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0082
        L_0x0073:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0082
            boolean r2 = r15.F(r10)
            if (r2 == 0) goto L_0x007f
            r2 = r6
            goto L_0x0081
        L_0x007f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r36 & 8
            r5 = 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x008b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008b:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x009a
            boolean r2 = r15.F(r11)
            if (r2 == 0) goto L_0x0097
            r2 = r5
            goto L_0x0099
        L_0x0097:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r1 = r1 | r2
        L_0x009a:
            r2 = r36 & 16
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x00a3
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a3:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00b2
            boolean r2 = r15.F(r12)
            if (r2 == 0) goto L_0x00af
            r2 = r4
            goto L_0x00b1
        L_0x00af:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r1 = r1 | r2
        L_0x00b2:
            r2 = r36 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00bb
            r1 = r1 | r16
            goto L_0x00cb
        L_0x00bb:
            r2 = r14 & r16
            if (r2 != 0) goto L_0x00cb
            boolean r2 = r15.F(r13)
            if (r2 == 0) goto L_0x00c8
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ca
        L_0x00c8:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00ca:
            r1 = r1 | r2
        L_0x00cb:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x00e8
            r2 = r36 & 64
            if (r2 != 0) goto L_0x00df
            r2 = r33
            boolean r16 = r15.F(r2)
            if (r16 == 0) goto L_0x00e1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00df:
            r2 = r33
        L_0x00e1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r1 = r1 | r16
        L_0x00e5:
            r16 = r1
            goto L_0x00eb
        L_0x00e8:
            r2 = r33
            goto L_0x00e5
        L_0x00eb:
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r16 & r1
            r3 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r3) goto L_0x0102
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x00fc
            goto L_0x0102
        L_0x00fc:
            r15.L()
            r7 = r2
            goto L_0x03be
        L_0x0102:
            r15.G()
            r1 = r14 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = 0
            if (r1 == 0) goto L_0x0121
            boolean r1 = r15.O()
            if (r1 == 0) goto L_0x0114
            goto L_0x0121
        L_0x0114:
            r15.L()
            r1 = r36 & 64
            if (r1 == 0) goto L_0x011d
            r16 = r16 & r17
        L_0x011d:
            r8 = r2
        L_0x011e:
            r7 = r16
            goto L_0x017c
        L_0x0121:
            r1 = r36 & 64
            if (r1 == 0) goto L_0x011d
            r1 = 1890788296(0x70b323c8, float:4.435286E29)
            r15.C(r1)
            m3.a r1 = m3.a.f26247a
            int r2 = m3.a.f26249c
            androidx.lifecycle.k0 r2 = r1.a(r15, r2)
            if (r2 == 0) goto L_0x0174
            androidx.lifecycle.i0$c r18 = f3.a.a(r2, r15, r3)
            r1 = 1729797275(0x671a9c9b, float:7.301333E23)
            r15.C(r1)
            boolean r1 = r2 instanceof androidx.lifecycle.C5212o
            if (r1 == 0) goto L_0x014d
            r1 = r2
            androidx.lifecycle.o r1 = (androidx.lifecycle.C5212o) r1
            l3.a r1 = r1.getDefaultViewModelCreationExtras()
        L_0x014a:
            r19 = r1
            goto L_0x0150
        L_0x014d:
            l3.a$a r1 = l3.a.C0407a.f25486b
            goto L_0x014a
        L_0x0150:
            r20 = 36936(0x9048, float:5.1758E-41)
            r21 = 0
            java.lang.Class<pk.v> r1 = pk.v.class
            r22 = 0
            r3 = r22
            r4 = r18
            r5 = r19
            r6 = r15
            r7 = r20
            r8 = r21
            androidx.lifecycle.f0 r1 = m3.c.b(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.U()
            r15.U()
            pk.v r1 = (pk.v) r1
            r16 = r16 & r17
            r8 = r1
            goto L_0x011e
        L_0x0174:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x017c:
            r15.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x018b
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.ShoppingListDetailsDestination (ShoppingListDetailsDestination.kt:46)"
            U0.C4895p.S(r0, r7, r1, r2)
        L_0x018b:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r15.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r15.Q(r1)
            android.content.Context r1 = (android.content.Context) r1
            android.app.Activity r1 = Xo.c.a(r1)
            if (r1 == 0) goto L_0x03de
            r6 = 0
            T0.c r16 = T0.a.a(r1, r15, r6)
            U0.I0 r1 = Vo.b.c()
            java.lang.Object r1 = r15.Q(r1)
            androidx.fragment.app.o r1 = (androidx.fragment.app.C5187o) r1
            x4.o r5 = androidx.navigation.fragment.a.a(r1)
            r1 = -615062162(0xffffffffdb56e56e, float:-6.0487906E16)
            r15.W(r1)
            java.lang.Object r1 = r15.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r2 = r17.a()
            if (r1 != r2) goto L_0x01d4
            x4.l r1 = r5.H()
            kotlin.jvm.internal.C17542s.g(r1)
            r15.u(r1)
        L_0x01d4:
            r4 = r1
            x4.l r4 = (x4.C8948l) r4
            r15.P()
            TJ.P r1 = r8.getState()
            r18 = 0
            r19 = 7
            r2 = 0
            r3 = 0
            r20 = 0
            r24 = r4
            r4 = r20
            r25 = r5
            r5 = r15
            r20 = r6
            r6 = r18
            r10 = r7
            r7 = r19
            U0.A1 r1 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            pk.s r18 = i(r1)
            r1 = -615054681(0xffffffffdb5702a7, float:-6.0520036E16)
            r15.W(r1)
            boolean r1 = r15.F(r8)
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x0212
            java.lang.Object r1 = r17.a()
            if (r2 != r1) goto L_0x021a
        L_0x0212:
            uk.u$a r2 = new uk.u$a
            r2.<init>(r8)
            r15.u(r2)
        L_0x021a:
            uI.h r2 = (uI.C18059h) r2
            r15.P()
            r19 = r2
            nI.l r19 = (nI.C17642l) r19
            r1 = -615042256(0xffffffffdb573330, float:-6.0573401E16)
            r15.W(r1)
            r7 = r25
            boolean r1 = r15.F(r7)
            r6 = r10 & 14
            r21 = 1
            r5 = 4
            if (r6 == r5) goto L_0x0244
            r2 = r10 & 8
            if (r2 == 0) goto L_0x0241
            boolean r2 = r15.F(r9)
            if (r2 == 0) goto L_0x0241
            goto L_0x0244
        L_0x0241:
            r3 = r20
            goto L_0x0246
        L_0x0244:
            r3 = r21
        L_0x0246:
            r1 = r1 | r3
            boolean r2 = r15.F(r8)
            r1 = r1 | r2
            r2 = r10 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x0255
            r3 = r21
            goto L_0x0257
        L_0x0255:
            r3 = r20
        L_0x0257:
            r1 = r1 | r3
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x0261
            r3 = r21
            goto L_0x0263
        L_0x0261:
            r3 = r20
        L_0x0263:
            r1 = r1 | r3
            boolean r2 = r15.F(r0)
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r10
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r3) goto L_0x0273
            r3 = r21
            goto L_0x0275
        L_0x0273:
            r3 = r20
        L_0x0275:
            r1 = r1 | r3
            r22 = 57344(0xe000, float:8.0356E-41)
            r2 = r10 & r22
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x0282
            r3 = r21
            goto L_0x0284
        L_0x0282:
            r3 = r20
        L_0x0284:
            r1 = r1 | r3
            java.lang.Object r2 = r15.D()
            if (r1 != 0) goto L_0x0297
            java.lang.Object r1 = r17.a()
            if (r2 != r1) goto L_0x0292
            goto L_0x0297
        L_0x0292:
            r13 = r6
            r26 = r7
            r12 = r8
            goto L_0x02b7
        L_0x0297:
            uk.n r4 = new uk.n
            r23 = r0
            r0 = r4
            r1 = r7
            r2 = r27
            r3 = r8
            r11 = r4
            r4 = r29
            r12 = r5
            r5 = r30
            r13 = r6
            r6 = r23
            r26 = r7
            r7 = r32
            r12 = r8
            r8 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.u(r11)
            r2 = r11
        L_0x02b7:
            r4 = r2
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            int r0 = r10 << 9
            r7 = r0 & r22
            r1 = r18
            r2 = r16
            r3 = r19
            r5 = r28
            r6 = r15
            uk.s1.b1(r1, r2, r3, r4, r5, r6, r7)
            r0 = -614740521(0xffffffffdb5bcdd7, float:-6.1869343E16)
            r15.W(r0)
            boolean r0 = r15.F(r12)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x02e3
            java.lang.Object r0 = r17.a()
            if (r1 != r0) goto L_0x02eb
        L_0x02e3:
            uk.o r1 = new uk.o
            r1.<init>(r12)
            r15.u(r1)
        L_0x02eb:
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            java.lang.String r0 = "list_picker_move_item"
            r2 = 48
            r3 = r24
            qw.l.c(r3, r0, r1, r15, r2)
            r0 = -614706601(0xffffffffdb5c5257, float:-6.2015028E16)
            r15.W(r0)
            boolean r0 = r15.F(r12)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x030f
            java.lang.Object r0 = r17.a()
            if (r1 != r0) goto L_0x0317
        L_0x030f:
            uk.p r1 = new uk.p
            r1.<init>(r12)
            r15.u(r1)
        L_0x0317:
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            java.lang.String r0 = "list_picker_add_remove"
            qw.l.c(r3, r0, r1, r15, r2)
            r0 = -614676880(0xffffffffdb5cc670, float:-6.2142679E16)
            r15.W(r0)
            r0 = 4
            if (r13 == r0) goto L_0x0338
            r0 = r10 & 8
            if (r0 == 0) goto L_0x0335
            boolean r0 = r15.F(r9)
            if (r0 == 0) goto L_0x0335
            goto L_0x0338
        L_0x0335:
            r0 = r26
            goto L_0x033b
        L_0x0338:
            r20 = r21
            goto L_0x0335
        L_0x033b:
            boolean r1 = r15.F(r0)
            r1 = r20 | r1
            boolean r4 = r15.F(r12)
            r1 = r1 | r4
            java.lang.Object r4 = r15.D()
            if (r1 != 0) goto L_0x0352
            java.lang.Object r1 = r17.a()
            if (r4 != r1) goto L_0x035a
        L_0x0352:
            uk.q r4 = new uk.q
            r4.<init>(r9, r0, r12)
            r15.u(r4)
        L_0x035a:
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            java.lang.String r0 = "BackInStockNotificationsRequestKey"
            qw.l.c(r3, r0, r4, r15, r2)
            r0 = -614648082(0xffffffffdb5d36ee, float:-6.2266366E16)
            r15.W(r0)
            boolean r0 = r15.F(r12)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x037a
            java.lang.Object r0 = r17.a()
            if (r1 != r0) goto L_0x0382
        L_0x037a:
            uk.r r1 = new uk.r
            r1.<init>(r12)
            r15.u(r1)
        L_0x0382:
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            java.lang.String r0 = "BackInStockExplanationFragmentRequestKey"
            qw.l.c(r3, r0, r1, r15, r2)
            r0 = -614633547(0xffffffffdb5d6fb5, float:-6.2328793E16)
            r15.W(r0)
            boolean r0 = r15.F(r12)
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x03a2
            java.lang.Object r0 = r17.a()
            if (r1 != r0) goto L_0x03aa
        L_0x03a2:
            uk.s r1 = new uk.s
            r1.<init>(r12)
            r15.u(r1)
        L_0x03aa:
            nI.l r1 = (nI.C17642l) r1
            r15.P()
            java.lang.String r0 = "ShoppingListDetails:selectInitialStore"
            qw.l.c(r3, r0, r1, r15, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03bd
            U0.C4895p.R()
        L_0x03bd:
            r7 = r12
        L_0x03be:
            U0.Y0 r10 = r15.n()
            if (r10 == 0) goto L_0x03dd
            uk.t r11 = new uk.t
            r0 = r11
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r8 = r35
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x03dd:
            return
        L_0x03de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.C12052u.h(zk.b, boolean, nI.a, nI.a, nI.a, nI.l, pk.v, U0.m, int, int):void");
    }

    private static final s i(A1<s> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C12529b bVar, C8951o oVar, v vVar, d dVar) {
        C17542s.j(dVar, "result");
        if (dVar instanceof d.a) {
            bVar.i(oVar, ((d.a) dVar).a(), (String) null);
        } else if (dVar instanceof d.b) {
            vVar.t0(new C11724c.x(C13026h.a(((d.b) dVar).a())));
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(v vVar, c cVar) {
        C17542s.j(cVar, "result");
        if (cVar instanceof c.a) {
            vVar.t0(new C11724c.v(((c.a) cVar).b()));
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N l(v vVar, C13194a.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof C13194a.b.C2743a) {
            vVar.t0(new C11724c.P(false));
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C12529b bVar, boolean z10, C17631a aVar, C17631a aVar2, C17631a aVar3, C17642l lVar, v vVar, int i10, int i11, C4889m mVar, int i12) {
        h(bVar, z10, aVar, aVar2, aVar3, lVar, vVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C8951o oVar, C12529b bVar, v vVar, C17631a aVar, C17631a aVar2, Context context, C17642l lVar, C17631a aVar3, C12056w wVar) {
        C17542s.j(wVar, "action");
        if (wVar instanceof C12056w.b) {
            C12056w.b bVar2 = (C12056w.b) wVar;
            q(bVar2.a().c(), bVar2.a().b(), 1, bVar2.a().a(), oVar, "list_picker_add_remove", bVar);
        } else if (wVar instanceof C12056w.c) {
            vVar.t0(new C11724c.C11727d(((C12056w.c) wVar).a().j()));
        } else if (C17542s.e(wVar, C12056w.d.f103793a)) {
            vVar.t0(C11724c.C11730g.f100923a);
            bVar.i(oVar, (String) null, (String) null);
        } else if (wVar instanceof C12056w.e) {
            C12056w.e eVar = (C12056w.e) wVar;
            vVar.t0(new C11724c.C11731h(eVar.a().j()));
            bVar.i(oVar, eVar.a().j(), (String) null);
        } else if (C17542s.e(wVar, C12056w.f.f103795a)) {
            aVar.invoke();
        } else if (wVar instanceof C12056w.g) {
            C12056w.g gVar = (C12056w.g) wVar;
            bVar.q(oVar, gVar.a().b(), gVar.a().a(), gVar.a().c(), gVar.b());
        } else if (C17542s.e(wVar, C12056w.h.f103798a)) {
            aVar2.invoke();
        } else if (wVar instanceof C12056w.i) {
            C12056w.i iVar = (C12056w.i) wVar;
            q(iVar.a().b(), iVar.a().a(), iVar.a().c(), Interaction$Component.SHOPPING_LIST_DETAILS, oVar, "list_picker_move_item", bVar);
        } else if (wVar instanceof C12056w.j) {
            bVar.c(oVar, ((C12056w.j) wVar).a());
        } else if (wVar instanceof C12056w.k) {
            bVar.b(oVar, ((C12056w.k) wVar).a(), context);
        } else if (wVar instanceof C12056w.l) {
            C12056w.l lVar2 = (C12056w.l) wVar;
            if (lVar2.a().b()) {
                vVar.t0(new C11724c.C11739p(lVar2.a().c(), lVar2.a().a()));
            }
            bVar.f(oVar, lVar2.a().c(), lVar2.a().a());
        } else if (wVar instanceof C12056w.m) {
            vVar.t0(new g(((C12056w.m) wVar).a().j()));
        } else if (C17542s.e(wVar, C12056w.n.f103804a)) {
            vVar.t0(C11724c.z.f100945a);
            bVar.n(oVar);
        } else if (C17542s.e(wVar, C12056w.p.f103806a)) {
            bVar.g(oVar);
        } else if (wVar instanceof C12056w.q) {
            lVar.invoke(Boolean.valueOf(((C12056w.q) wVar).a()));
        } else if (C17542s.e(wVar, C12056w.r.f103808a)) {
            vVar.t0(C11724c.K.f100903a);
            bVar.i(oVar, (String) null, "ShoppingListDetails:selectInitialStore");
        } else if (C17542s.e(wVar, C12056w.s.f103809a)) {
            vVar.t0(C11724c.N.f100906a);
        } else if (C17542s.e(wVar, C12056w.t.f103810a)) {
            bVar.d(oVar);
        } else if (C17542s.e(wVar, C12056w.u.f103811a)) {
            aVar3.invoke();
        } else if (wVar instanceof C12056w.v) {
            vVar.t0(new C11724c.P(((C12056w.v) wVar).a()));
        } else if (C17542s.e(wVar, C12056w.C2464w.f103813a)) {
            vVar.t0(C11724c.C11735l.f100928a);
            bVar.l(oVar);
        } else if (wVar instanceof C12056w.a) {
            vVar.t0(new C11724c.C11726b(((C12056w.a) wVar).a().j()));
        } else if (wVar instanceof C12056w.o) {
            vVar.t0(C11724c.A.f100892a);
        } else if (wVar instanceof C12006B) {
            vVar.t0(new C11724c.C2374c(((C12006B) wVar).a()));
        } else if (wVar instanceof C12007C) {
            vVar.t0(C11724c.C11738o.f100931a);
            bVar.o(oVar, ((C12007C) wVar).a());
        } else if (C17542s.e(wVar, C12008D.f103442a)) {
            vVar.t0(C11724c.J.f100902a);
        } else if (wVar instanceof C12060y) {
            vVar.t0(new C11724c.v(((C12060y) wVar).a().j()));
        } else if (wVar instanceof C12062z) {
            vVar.t0(C11724c.w.f100941a);
            C12062z zVar = (C12062z) wVar;
            bVar.k(oVar, zVar.a().a(), zVar.a().b(), zVar.a().c());
        } else if (wVar instanceof C12005A) {
            vVar.t0(C11724c.w.f100941a);
            C12005A a10 = (C12005A) wVar;
            bVar.m(oVar, a10.a().a(), a10.a().b(), a10.a().c(), a10.a().d());
        } else if (C17542s.e(wVar, C12058x.f103816a)) {
            vVar.t0(C11724c.w.f100941a);
        } else if (wVar instanceof E) {
            vVar.t0(C11724c.B.f100893a);
            E e10 = (E) wVar;
            bVar.e(oVar, e10.a().b(), e10.a().c(), e10.a().a());
        } else if (wVar instanceof F) {
            bVar.a(oVar, ((F) wVar).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(v vVar, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (!(bVar instanceof ListPickerNavigation.b.a)) {
            if (bVar instanceof ListPickerNavigation.b.d) {
                ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
                ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.w0(dVar.d());
                int i10 = b.f103771a[dVar.a().ordinal()];
                if (i10 == 1) {
                    vVar.t0(new C11724c.t(cVar.a(), dVar.b()));
                } else if (i10 == 2) {
                    String b10 = cVar.b();
                    if (b10 == null) {
                        b10 = "";
                    }
                    vVar.t0(new C11724c.s(b10));
                } else {
                    throw new t();
                }
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(v vVar, ListPickerNavigation.b bVar) {
        C11724c cVar;
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            int i10 = b.f103771a[dVar.a().ordinal()];
            String str = "";
            String str2 = null;
            if (i10 == 1) {
                ListPickerNavigation.b.c cVar2 = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                if (cVar2 != null) {
                    str2 = cVar2.b();
                }
                if (str2 != null) {
                    str = str2;
                }
                cVar = new C11724c.C11725a.C2372a(str, dVar.c(), dVar.b());
            } else if (i10 == 2) {
                ListPickerNavigation.b.c cVar3 = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                if (cVar3 != null) {
                    str2 = cVar3.b();
                }
                if (str2 != null) {
                    str = str2;
                }
                cVar = new C11724c.C11725a.b(str, dVar.c(), dVar.b());
            } else {
                throw new t();
            }
            vVar.t0(cVar);
        }
        return C16807N.f139792a;
    }

    private static final void q(String str, String str2, int i10, Interaction$Component interaction$Component, C8951o oVar, String str3, C12529b bVar) {
        bVar.p(oVar, str, str2, i10, str3, interaction$Component);
    }
}
