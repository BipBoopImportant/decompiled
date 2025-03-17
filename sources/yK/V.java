package yk;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import gB.C14504f;
import kotlin.Metadata;
import nI.C17642l;
import vB.C15128a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LgB/f;", "shoppingListCardSize", "LvB/a;", "list", "", "expandedWidth", "Lkotlin/Function1;", "", "LXH/N;", "onListClicked", "d", "(LgB/f;LvB/a;ZLnI/l;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106344a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                gB.f[] r0 = gB.C14504f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gB.f r1 = gB.C14504f.COMPACT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                gB.f r1 = gB.C14504f.DEFAULT_CARD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106344a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yk.V.a.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(gB.C14504f r19, vB.C15128a r20, boolean r21, nI.C17642l<? super java.lang.String, XH.C16807N> r22, U0.C4889m r23, int r24) {
        /*
            r1 = r19
            r8 = r20
            r0 = r21
            r15 = r22
            r14 = r24
            java.lang.String r2 = "shoppingListCardSize"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "list"
            kotlin.jvm.internal.C17542s.j(r8, r2)
            java.lang.String r2 = "onListClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            r2 = -727238725(0xffffffffd4a737bb, float:-5.7455563E12)
            r3 = r23
            U0.m r13 = r3.k(r2)
            r3 = r14 & 6
            r4 = 2
            if (r3 != 0) goto L_0x0032
            boolean r3 = r13.V(r1)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r3 = r3 | r14
            goto L_0x0033
        L_0x0032:
            r3 = r14
        L_0x0033:
            r5 = r14 & 48
            r6 = 32
            if (r5 != 0) goto L_0x004d
            r5 = r14 & 64
            if (r5 != 0) goto L_0x0042
            boolean r5 = r13.V(r8)
            goto L_0x0046
        L_0x0042:
            boolean r5 = r13.F(r8)
        L_0x0046:
            if (r5 == 0) goto L_0x004a
            r5 = r6
            goto L_0x004c
        L_0x004a:
            r5 = 16
        L_0x004c:
            r3 = r3 | r5
        L_0x004d:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005d
            boolean r5 = r13.b(r0)
            if (r5 == 0) goto L_0x005a
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r3 = r3 | r5
        L_0x005d:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 != 0) goto L_0x006e
            boolean r5 = r13.F(r15)
            if (r5 == 0) goto L_0x006b
            r5 = r7
            goto L_0x006d
        L_0x006b:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r5
        L_0x006e:
            r5 = r3 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r5 != r9) goto L_0x0081
            boolean r5 = r13.l()
            if (r5 != 0) goto L_0x007b
            goto L_0x0081
        L_0x007b:
            r13.L()
            r2 = r13
            goto L_0x01ab
        L_0x0081:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x008d
            r5 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.lists.ui.ShoppingListItemCard (ShoppingListItemCard.kt:27)"
            U0.C4895p.S(r2, r3, r5, r9)
        L_0x008d:
            int[] r2 = yk.V.a.f106344a
            int r5 = r19.ordinal()
            r2 = r2[r5]
            r9 = 1
            if (r2 == r9) goto L_0x010b
            if (r2 != r4) goto L_0x00fc
            r2 = 45898286(0x2bc5a2e, float:2.7675878E-37)
            r13.W(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            java.lang.String r4 = "list_card"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r2, r4)
            r2 = -1938179018(0xffffffff8c79bc36, float:-1.92389E-31)
            r13.W(r2)
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != r7) goto L_0x00b4
            r2 = r9
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r7 = r3 & 112(0x70, float:1.57E-43)
            if (r7 == r6) goto L_0x00c6
            r6 = r3 & 64
            if (r6 == 0) goto L_0x00c4
            boolean r6 = r13.F(r8)
            if (r6 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r5 = 0
            goto L_0x00c7
        L_0x00c6:
            r5 = r9
        L_0x00c7:
            r2 = r2 | r5
            java.lang.Object r5 = r13.D()
            if (r2 != 0) goto L_0x00d6
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00de
        L_0x00d6:
            yk.T r5 = new yk.T
            r5.<init>(r15, r8)
            r13.u(r5)
        L_0x00de:
            nI.a r5 = (nI.C17631a) r5
            r13.P()
            int r2 = vB.C15128a.f131411g
            r2 = r2 | 48
            int r3 = r3 >> 3
            r3 = r3 & 14
            r6 = r2 | r3
            r7 = 0
            r2 = r20
            r3 = r4
            r4 = r5
            r5 = r13
            uB.C15112j.c(r2, r3, r4, r5, r6, r7)
            r13.P()
            r2 = r13
            goto L_0x01a2
        L_0x00fc:
            r0 = -1938205707(0xffffffff8c7953f5, float:-1.9207527E-31)
            r13.W(r0)
            r13.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x010b:
            r2 = 45207451(0x2b1cf9b, float:2.6126972E-37)
            r13.W(r2)
            java.lang.String r2 = r20.c()
            IC.e r4 = r20.e()
            int r10 = IC.C13023e.f110931a
            java.lang.String r10 = r4.a(r13, r10)
            KJ.c r4 = r20.d()
            boolean r4 = r4.isEmpty()
            r11 = r4 ^ 1
            java.lang.String r4 = r20.b()
            if (r4 != 0) goto L_0x0131
            java.lang.String r4 = ""
        L_0x0131:
            r12 = r4
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            java.lang.String r5 = "custom_list_card"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r4, r5)
            r5 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            if (r0 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r5 = 0
        L_0x0144:
            if (r5 == 0) goto L_0x014b
            float r5 = r5.floatValue()
            goto L_0x014d
        L_0x014b:
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x014d:
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.g(r4, r5)
            r5 = -1938194026(0xffffffff8c798196, float:-1.9221258E-31)
            r13.W(r5)
            r5 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != r7) goto L_0x015d
            r5 = r9
            goto L_0x015e
        L_0x015d:
            r5 = 0
        L_0x015e:
            r7 = r3 & 112(0x70, float:1.57E-43)
            if (r7 == r6) goto L_0x016e
            r6 = r3 & 64
            if (r6 == 0) goto L_0x016d
            boolean r6 = r13.F(r8)
            if (r6 == 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r9 = 0
        L_0x016e:
            r5 = r5 | r9
            java.lang.Object r6 = r13.D()
            if (r5 != 0) goto L_0x017d
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0185
        L_0x017d:
            yk.S r6 = new yk.S
            r6.<init>(r15, r8)
            r13.u(r6)
        L_0x0185:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r13.P()
            r6 = 57344(0xe000, float:8.0356E-41)
            int r3 = r3 << 6
            r17 = r3 & r6
            r18 = 0
            r9 = r2
            r2 = r13
            r13 = r21
            r14 = r4
            r15 = r5
            r16 = r2
            vk.C12145f.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.P()
        L_0x01a2:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01ab
            U0.C4895p.R()
        L_0x01ab:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x01c4
            yk.U r7 = new yk.U
            r0 = r7
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.V.d(gB.f, vB.a, boolean, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17642l lVar, C15128a aVar) {
        lVar.invoke(aVar.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, C15128a aVar) {
        lVar.invoke(aVar.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C14504f fVar, C15128a aVar, boolean z10, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(fVar, aVar, z10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
