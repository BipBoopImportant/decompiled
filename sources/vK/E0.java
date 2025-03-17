package vk;

import O0.F0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pk.l;
import pk.s;

@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0001\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001aS\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aS\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\u001a/\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aG\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003¢\u0006\u0004\b#\u0010$\u001a!\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b%\u0010&\u001a7\u0010*\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "open", "LO0/F0;", "sheetState", "expandedWidth", "Lpk/l;", "listProduct", "Lpk/s$o;", "wayfindingProductData", "Lkotlin/Function0;", "LXH/N;", "onCloseClick", "Lkotlin/Function1;", "onNavigateClick", "onItemClick", "", "onEnergyLabelClick", "onDismissed", "Landroidx/compose/ui/d;", "modifier", "n", "(ZLO0/F0;ZLpk/l;Lpk/s$o;LnI/a;LnI/l;LnI/l;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;III)V", "j", "(ZLpk/l;Lpk/s$o;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "wayfindingAvailable", "w", "(Lpk/l;ZLnI/a;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "l", "s", "(Lpk/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "itemNo", "Lpk/l$a;", "availability", "", "totalPackages", "q", "(Ljava/lang/String;Lpk/l$a;ZILandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "y", "(Lpk/l$a;Landroidx/compose/ui/d;LU0/m;II)V", "department", "bin", "aisle", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class E0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f104486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f104487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ s.o f104488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f104489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f104490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<s.o, C16807N> f104491f;

        a(boolean z10, l lVar, s.o oVar, C17642l<? super l, C16807N> lVar2, C17642l<? super String, C16807N> lVar3, C17642l<? super s.o, C16807N> lVar4) {
            this.f104486a = z10;
            this.f104487b = lVar;
            this.f104488c = oVar;
            this.f104489d = lVar2;
            this.f104490e = lVar3;
            this.f104491f = lVar4;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, l lVar2) {
            lVar.invoke(lVar2);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C17642l lVar, l lVar2) {
            lVar.invoke(lVar2.j());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(s.o oVar, C17642l lVar) {
            if (oVar != null) {
                lVar.invoke(oVar);
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(U0.C4889m r12, int r13) {
            /*
                r11 = this;
                r0 = r13 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r12.L()
                goto L_0x00cd
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductModal.<anonymous> (ListProductModal.kt:76)"
                r2 = 1413775207(0x54447f67, float:3.37580419E12)
                U0.C4895p.S(r2, r13, r0, r1)
            L_0x0020:
                boolean r3 = r11.f104486a
                pk.l r4 = r11.f104487b
                pk.s$o r5 = r11.f104488c
                r13 = -174399263(0xfffffffff59ae0e1, float:-3.9266348E32)
                r12.W(r13)
                nI.l<pk.l, XH.N> r13 = r11.f104489d
                boolean r13 = r12.V(r13)
                pk.l r0 = r11.f104487b
                boolean r0 = r12.F(r0)
                r13 = r13 | r0
                nI.l<pk.l, XH.N> r0 = r11.f104489d
                pk.l r1 = r11.f104487b
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x004b
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x0053
            L_0x004b:
                vk.B0 r2 = new vk.B0
                r2.<init>(r0, r1)
                r12.u(r2)
            L_0x0053:
                r6 = r2
                nI.a r6 = (nI.C17631a) r6
                r12.P()
                r13 = -174397105(0xfffffffff59ae94f, float:-3.9274696E32)
                r12.W(r13)
                nI.l<java.lang.String, XH.N> r13 = r11.f104490e
                boolean r13 = r12.V(r13)
                pk.l r0 = r11.f104487b
                boolean r0 = r12.F(r0)
                r13 = r13 | r0
                nI.l<java.lang.String, XH.N> r0 = r11.f104490e
                pk.l r1 = r11.f104487b
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x007e
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x0086
            L_0x007e:
                vk.C0 r2 = new vk.C0
                r2.<init>(r0, r1)
                r12.u(r2)
            L_0x0086:
                r7 = r2
                nI.a r7 = (nI.C17631a) r7
                r12.P()
                r13 = -174401772(0xfffffffff59ad714, float:-3.925664E32)
                r12.W(r13)
                pk.s$o r13 = r11.f104488c
                boolean r13 = r12.V(r13)
                nI.l<pk.s$o, XH.N> r0 = r11.f104491f
                boolean r0 = r12.V(r0)
                r13 = r13 | r0
                pk.s$o r0 = r11.f104488c
                nI.l<pk.s$o, XH.N> r1 = r11.f104491f
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x00b1
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x00b9
            L_0x00b1:
                vk.D0 r2 = new vk.D0
                r2.<init>(r0, r1)
                r12.u(r2)
            L_0x00b9:
                r8 = r2
                nI.a r8 = (nI.C17631a) r8
                r12.P()
                r10 = 0
                r9 = r12
                vk.E0.j(r3, r4, r5, r6, r7, r8, r9, r10)
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x00cd
                U0.C4895p.R()
            L_0x00cd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vk.E0.a.e(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            e((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void j(boolean z10, l lVar, s.o oVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        s.o oVar2 = oVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-118323400);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        } else {
            l lVar2 = lVar;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(oVar2) ? 256 : 128;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<C16807N> aVar5 = aVar2;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar5) ? 16384 : 8192;
        }
        C17631a<C16807N> aVar6 = aVar3;
        if ((i12 & ImageMetadata.EDGE_MODE) == 0) {
            i11 |= k10.F(aVar6) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-118323400, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.Content (ListProductModal.kt:108)");
            }
            boolean z12 = oVar2 != null && C12169r0.y0(lVar.c());
            if (z11) {
                k10.W(-1428021917);
                int i13 = i11 >> 3;
                l(lVar, z12, aVar, aVar2, aVar3, C5116k1.a(D.k(d.f18749a, h.B((float) 24), 0.0f, 2, (Object) null), "expanded_width_content"), k10, (i13 & 57344) | (i13 & 14) | ImageMetadata.EDGE_MODE | (i13 & 896) | (i13 & 7168), 0);
                k10.P();
            } else {
                k10.W(-1427589529);
                int i14 = i11 >> 3;
                w(lVar, z12, aVar, aVar2, aVar3, C5116k1.a(d.f18749a, "small_width_content"), k10, (i14 & 14) | ImageMetadata.EDGE_MODE | (i14 & 896) | (i14 & 7168) | (i14 & 57344), 0);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12175u0(z10, lVar, oVar, aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(boolean z10, l lVar, s.o oVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        j(z10, lVar, oVar, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l(pk.l r31, boolean r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, nI.C17631a<XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r7 = r38
            r0 = 16
            r1 = 32
            r2 = 4
            r3 = 6
            r4 = 1210133477(0x48212be5, float:165039.58)
            r5 = r37
            U0.m r5 = r5.k(r4)
            r6 = r39 & 1
            r8 = 2
            if (r6 == 0) goto L_0x001c
            r6 = r7 | 6
            r9 = r6
            r6 = r31
            goto L_0x0030
        L_0x001c:
            r6 = r7 & 6
            if (r6 != 0) goto L_0x002d
            r6 = r31
            boolean r9 = r5.F(r6)
            if (r9 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002b
        L_0x002a:
            r9 = r8
        L_0x002b:
            r9 = r9 | r7
            goto L_0x0030
        L_0x002d:
            r6 = r31
            r9 = r7
        L_0x0030:
            r10 = r39 & 2
            if (r10 == 0) goto L_0x0039
            r9 = r9 | 48
            r15 = r32
            goto L_0x0049
        L_0x0039:
            r10 = r7 & 48
            r15 = r32
            if (r10 != 0) goto L_0x0049
            boolean r10 = r5.b(r15)
            if (r10 == 0) goto L_0x0047
            r10 = r1
            goto L_0x0048
        L_0x0047:
            r10 = r0
        L_0x0048:
            r9 = r9 | r10
        L_0x0049:
            r2 = r39 & 4
            if (r2 == 0) goto L_0x0052
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r2 = r33
            goto L_0x0064
        L_0x0052:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004f
            r2 = r33
            boolean r10 = r5.F(r2)
            if (r10 == 0) goto L_0x0061
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r9 = r9 | r10
        L_0x0064:
            r10 = r39 & 8
            if (r10 == 0) goto L_0x006d
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r14 = r34
            goto L_0x007f
        L_0x006d:
            r10 = r7 & 3072(0xc00, float:4.305E-42)
            r14 = r34
            if (r10 != 0) goto L_0x007f
            boolean r10 = r5.F(r14)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r9 = r9 | r10
        L_0x007f:
            r0 = r39 & 16
            if (r0 == 0) goto L_0x0088
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r0 = r35
            goto L_0x009a
        L_0x0088:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0085
            r0 = r35
            boolean r10 = r5.F(r0)
            if (r10 == 0) goto L_0x0097
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r9 = r9 | r10
        L_0x009a:
            r1 = r39 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x00a5
            r9 = r9 | r10
        L_0x00a1:
            r10 = r36
        L_0x00a3:
            r13 = r9
            goto L_0x00b7
        L_0x00a5:
            r10 = r10 & r7
            if (r10 != 0) goto L_0x00a1
            r10 = r36
            boolean r11 = r5.V(r10)
            if (r11 == 0) goto L_0x00b3
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r9 = r9 | r11
            goto L_0x00a3
        L_0x00b7:
            r9 = 74899(0x12493, float:1.04956E-40)
            r9 = r9 & r13
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r11) goto L_0x00cc
            boolean r9 = r5.l()
            if (r9 != 0) goto L_0x00c7
            goto L_0x00cc
        L_0x00c7:
            r5.L()
            goto L_0x0285
        L_0x00cc:
            if (r1 == 0) goto L_0x00d1
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x00d2
        L_0x00d1:
            r1 = r10
        L_0x00d2:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00de
            r9 = -1
            java.lang.String r10 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ExpandedWidthContent (ListProductModal.kt:179)"
            U0.C4895p.S(r4, r13, r9, r10)
        L_0x00de:
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r4.g()
            i1.c$a r10 = i1.C5437c.f24302a
            i1.c$b r11 = r10.k()
            r12 = 0
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r11, r5, r12)
            int r11 = U0.C4883j.a(r5, r12)
            U0.y r3 = r5.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r5, r1)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r17 = r5.m()
            if (r17 != 0) goto L_0x010a
            U0.C4883j.c()
        L_0x010a:
            r5.I()
            boolean r17 = r5.i()
            if (r17 == 0) goto L_0x0117
            r5.p(r12)
            goto L_0x011a
        L_0x0117:
            r5.t()
        L_0x011a:
            U0.m r12 = U0.F1.a(r5)
            nI.p r0 = r16.c()
            U0.F1.c(r12, r9, r0)
            nI.p r0 = r16.e()
            U0.F1.c(r12, r3, r0)
            nI.p r0 = r16.b()
            boolean r3 = r12.i()
            if (r3 != 0) goto L_0x0144
            java.lang.Object r3 = r12.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r9)
            if (r3 != 0) goto L_0x0152
        L_0x0144:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r12.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r12.w(r3, r0)
        L_0x0152:
            nI.p r0 = r16.d()
            U0.F1.c(r12, r8, r0)
            s0.h r0 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d$e r3 = r4.f()
            i1.c$c r4 = r10.l()
            r8 = 0
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r4, r5, r8)
            int r4 = U0.C4883j.a(r5, r8)
            U0.y r8 = r5.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r5, r0)
            nI.a r10 = r16.a()
            U0.f r11 = r5.m()
            if (r11 != 0) goto L_0x0183
            U0.C4883j.c()
        L_0x0183:
            r5.I()
            boolean r11 = r5.i()
            if (r11 == 0) goto L_0x0190
            r5.p(r10)
            goto L_0x0193
        L_0x0190:
            r5.t()
        L_0x0193:
            U0.m r10 = U0.F1.a(r5)
            nI.p r11 = r16.c()
            U0.F1.c(r10, r3, r11)
            nI.p r3 = r16.e()
            U0.F1.c(r10, r8, r3)
            nI.p r3 = r16.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x01bd
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x01cb
        L_0x01bd:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r10.u(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10.w(r4, r3)
        L_0x01cb:
            nI.p r3 = r16.d()
            U0.F1.c(r10, r9, r3)
            s0.N r3 = s0.C5843N.f28726a
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r3
            r18 = r0
            androidx.compose.ui.d r16 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            int r4 = ik.c.f98309A
            java.lang.String r8 = r31.k()
            if (r8 != 0) goto L_0x01ee
            java.lang.String r8 = ""
        L_0x01ee:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            r9 = 0
            java.lang.String r18 = J1.j.c(r4, r8, r5, r9)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = r33
            androidx.compose.ui.d r4 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r8 = 24
            float r12 = (float) r8
            float r8 = c2.h.B(r12)
            r9 = 0
            r10 = 0
            r11 = 2
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.k(r4, r8, r9, r11, r10)
            r4 = r13 & 14
            r8 = 6
            int r9 = r13 >> 6
            r8 = r9 & 112(0x70, float:1.57E-43)
            r4 = r4 | r8
            r16 = 0
            r8 = r31
            r9 = r34
            r11 = r5
            r23 = r12
            r12 = r4
            r4 = r13
            r13 = r16
            s(r8, r9, r10, r11, r12, r13)
            java.lang.String r8 = r31.j()
            pk.l$a r9 = r31.c()
            int r11 = r31.n()
            r21 = 2
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r3
            r18 = r0
            androidx.compose.ui.d r24 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            float r27 = c2.h.B(r23)
            r29 = 11
            r30 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.D.m(r24, r25, r26, r27, r28, r29, r30)
            int r3 = r4 << 3
            r4 = 459648(0x70380, float:6.44104E-40)
            r3 = r3 & r4
            r10 = r32
            r13 = r35
            r14 = r5
            r15 = r3
            q(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5.x()
            r3 = 36
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r3)
            r3 = 6
            s0.C5844O.a(r0, r5, r3)
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0284
            U0.C4895p.R()
        L_0x0284:
            r10 = r1
        L_0x0285:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x02a3
            vk.v0 r11 = new vk.v0
            r0 = r11
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r10
            r7 = r38
            r8 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r11)
        L_0x02a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.l(pk.l, boolean, nI.a, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(l lVar, boolean z10, C17631a aVar, C17631a aVar2, C17631a aVar3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        l(lVar, z10, aVar, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(boolean r25, O0.F0 r26, boolean r27, pk.l r28, pk.s.o r29, nI.C17631a<XH.C16807N> r30, nI.C17642l<? super pk.s.o, XH.C16807N> r31, nI.C17642l<? super pk.l, XH.C16807N> r32, nI.C17642l<? super java.lang.String, XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, androidx.compose.ui.d r35, U0.C4889m r36, int r37, int r38, int r39) {
        /*
            r15 = r26
            r14 = r28
            r13 = r30
            r12 = r31
            r11 = r32
            r10 = r33
            r9 = r34
            r8 = r37
            r7 = r39
            java.lang.String r0 = "sheetState"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onCloseClick"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "onNavigateClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onItemClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onEnergyLabelClick"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onDismissed"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -564826519(0xffffffffde556e69, float:-3.84483631E18)
            r1 = r36
            U0.m r6 = r1.k(r0)
            r1 = r7 & 1
            if (r1 == 0) goto L_0x0042
            r1 = r8 | 6
            r5 = r25
            goto L_0x0054
        L_0x0042:
            r1 = r8 & 6
            r5 = r25
            if (r1 != 0) goto L_0x0053
            boolean r1 = r6.b(r5)
            if (r1 == 0) goto L_0x0050
            r1 = 4
            goto L_0x0051
        L_0x0050:
            r1 = 2
        L_0x0051:
            r1 = r1 | r8
            goto L_0x0054
        L_0x0053:
            r1 = r8
        L_0x0054:
            r4 = r7 & 2
            if (r4 == 0) goto L_0x005b
            r1 = r1 | 48
            goto L_0x006b
        L_0x005b:
            r4 = r8 & 48
            if (r4 != 0) goto L_0x006b
            boolean r4 = r6.V(r15)
            if (r4 == 0) goto L_0x0068
            r4 = 32
            goto L_0x006a
        L_0x0068:
            r4 = 16
        L_0x006a:
            r1 = r1 | r4
        L_0x006b:
            r4 = r7 & 4
            if (r4 == 0) goto L_0x0074
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0071:
            r4 = r27
            goto L_0x0087
        L_0x0074:
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0071
            r4 = r27
            boolean r16 = r6.b(r4)
            if (r16 == 0) goto L_0x0083
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0085
        L_0x0083:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0085:
            r1 = r1 | r16
        L_0x0087:
            r16 = r7 & 8
            if (r16 == 0) goto L_0x008e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009e
        L_0x008e:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x009e
            boolean r2 = r6.F(r14)
            if (r2 == 0) goto L_0x009b
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x009d
        L_0x009b:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x009d:
            r1 = r1 | r2
        L_0x009e:
            r2 = r7 & 16
            if (r2 == 0) goto L_0x00a7
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00a4:
            r2 = r29
            goto L_0x00ba
        L_0x00a7:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x00a4
            r2 = r29
            boolean r16 = r6.V(r2)
            if (r16 == 0) goto L_0x00b6
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b8
        L_0x00b6:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00b8:
            r1 = r1 | r16
        L_0x00ba:
            r16 = r7 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00c3
            r1 = r1 | r17
            goto L_0x00d4
        L_0x00c3:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00d4
            boolean r16 = r6.F(r13)
            if (r16 == 0) goto L_0x00d0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d2
        L_0x00d0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00d2:
            r1 = r1 | r16
        L_0x00d4:
            r16 = r7 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00dd
            r1 = r1 | r17
            goto L_0x00ee
        L_0x00dd:
            r16 = r8 & r17
            if (r16 != 0) goto L_0x00ee
            boolean r16 = r6.F(r12)
            if (r16 == 0) goto L_0x00ea
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ec
        L_0x00ea:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ec:
            r1 = r1 | r16
        L_0x00ee:
            r0 = r7 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00f7
            r1 = r1 | r17
            goto L_0x0107
        L_0x00f7:
            r0 = r8 & r17
            if (r0 != 0) goto L_0x0107
            boolean r0 = r6.F(r11)
            if (r0 == 0) goto L_0x0104
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r1 = r1 | r0
        L_0x0107:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0110
            r1 = r1 | r17
            goto L_0x0120
        L_0x0110:
            r0 = r8 & r17
            if (r0 != 0) goto L_0x0120
            boolean r0 = r6.F(r10)
            if (r0 == 0) goto L_0x011d
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011f
        L_0x011d:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011f:
            r1 = r1 | r0
        L_0x0120:
            r0 = r7 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0129
            r1 = r1 | r17
            goto L_0x0139
        L_0x0129:
            r0 = r8 & r17
            if (r0 != 0) goto L_0x0139
            boolean r0 = r6.F(r9)
            if (r0 == 0) goto L_0x0136
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0138
        L_0x0136:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0138:
            r1 = r1 | r0
        L_0x0139:
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0144
            r17 = r38 | 6
            r3 = r35
            r7 = r17
            goto L_0x015c
        L_0x0144:
            r17 = r38 & 6
            r3 = r35
            if (r17 != 0) goto L_0x015a
            boolean r18 = r6.V(r3)
            if (r18 == 0) goto L_0x0153
            r18 = 4
            goto L_0x0155
        L_0x0153:
            r18 = 2
        L_0x0155:
            r18 = r38 | r18
            r7 = r18
            goto L_0x015c
        L_0x015a:
            r7 = r38
        L_0x015c:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r1 & r18
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x017b
            r2 = r7 & 3
            r3 = 2
            if (r2 != r3) goto L_0x017b
            boolean r2 = r6.l()
            if (r2 != 0) goto L_0x0172
            goto L_0x017b
        L_0x0172:
            r6.L()
            r11 = r35
            r16 = r6
            goto L_0x0251
        L_0x017b:
            if (r0 == 0) goto L_0x0182
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r17 = r0
            goto L_0x0184
        L_0x0182:
            r17 = r35
        L_0x0184:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductModal (ListProductModal.kt:70)"
            r2 = -564826519(0xffffffffde556e69, float:-3.84483631E18)
            U0.C4895p.S(r2, r1, r7, r0)
        L_0x0192:
            if (r14 != 0) goto L_0x01cf
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x019d
            U0.C4895p.R()
        L_0x019d:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x01ce
            vk.s0 r6 = new vk.s0
            r0 = r6
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r15 = r6
            r6 = r30
            r14 = r7
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r17
            r12 = r37
            r13 = r38
            r19 = r14
            r14 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r19
            r0.a(r15)
        L_0x01ce:
            return
        L_0x01cf:
            SC.x1$b r8 = new SC.x1$b
            SC.y1 r0 = new SC.y1
            int r2 = uK.C18146a.f148097J2
            int r3 = Oo.b.f84665i
            r9 = 0
            java.lang.String r3 = J1.j.b(r3, r6, r9)
            r0.<init>(r2, r3, r13)
            r2 = 0
            r8.<init>(r2, r0, r2)
            s0.T$a r0 = s0.C5848T.f28733a
            r2 = 6
            s0.T r16 = s0.a0.b(r0, r6, r2)
            vk.E0$a r9 = new vk.E0$a
            r0 = r9
            r18 = r1
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r33
            r15 = r6
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 1413775207(0x54447f67, float:3.37580419E12)
            r2 = 1
            c1.a r19 = c1.c.e(r1, r2, r9, r15, r0)
            r0 = r18 & 14
            int r1 = SC.C13656x1.b.f116494d
            int r1 = r1 << 3
            r0 = r0 | r1
            int r1 = r18 >> 21
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            int r1 = r7 << 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            int r2 = r18 << 9
            r1 = r1 & r2
            r18 = r0 | r1
            r20 = 6
            r21 = 480(0x1e0, float:6.73E-43)
            r5 = 0
            r6 = 0
            r22 = 0
            r9 = 0
            r0 = r25
            r1 = r8
            r2 = r34
            r3 = r17
            r4 = r26
            r7 = r22
            r10 = r16
            r11 = r19
            r12 = r15
            r13 = r18
            r14 = r20
            r16 = r15
            r15 = r21
            SC.J.c(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x024f
            U0.C4895p.R()
        L_0x024f:
            r11 = r17
        L_0x0251:
            U0.Y0 r15 = r16.n()
            if (r15 == 0) goto L_0x027e
            vk.t0 r14 = new vk.t0
            r0 = r14
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r12 = r37
            r13 = r38
            r24 = r14
            r14 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r24
            r15.a(r0)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.n(boolean, O0.F0, boolean, pk.l, pk.s$o, nI.a, nI.l, nI.l, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(boolean z10, F0 f02, boolean z11, l lVar, s.o oVar, C17631a aVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17631a aVar2, d dVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        n(z10, f02, z11, lVar, oVar, aVar, lVar2, lVar3, lVar4, aVar2, dVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(boolean z10, F0 f02, boolean z11, l lVar, s.o oVar, C17631a aVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17631a aVar2, d dVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        n(z10, f02, z11, lVar, oVar, aVar, lVar2, lVar3, lVar4, aVar2, dVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(java.lang.String r39, pk.l.a r40, boolean r41, int r42, androidx.compose.ui.d r43, nI.C17631a<XH.C16807N> r44, U0.C4889m r45, int r46, int r47) {
        /*
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r7 = r46
            r0 = 8
            r5 = 32
            r6 = 16
            r8 = 4
            r9 = 48
            r10 = 6
            r11 = 266136780(0xfdceccc, float:2.1784886E-29)
            r12 = r45
            U0.m r15 = r12.k(r11)
            r14 = 1
            r12 = r47 & 1
            r13 = 2
            if (r12 == 0) goto L_0x0026
            r12 = r7 | 6
            goto L_0x0036
        L_0x0026:
            r12 = r7 & 6
            if (r12 != 0) goto L_0x0035
            boolean r12 = r15.V(r1)
            if (r12 == 0) goto L_0x0032
            r12 = r8
            goto L_0x0033
        L_0x0032:
            r12 = r13
        L_0x0033:
            r12 = r12 | r7
            goto L_0x0036
        L_0x0035:
            r12 = r7
        L_0x0036:
            r16 = r47 & 2
            if (r16 == 0) goto L_0x003c
            r12 = r12 | r9
            goto L_0x004d
        L_0x003c:
            r16 = r7 & 48
            if (r16 != 0) goto L_0x004d
            boolean r16 = r15.V(r2)
            if (r16 == 0) goto L_0x0049
            r16 = r5
            goto L_0x004b
        L_0x0049:
            r16 = r6
        L_0x004b:
            r12 = r12 | r16
        L_0x004d:
            r8 = r47 & 4
            if (r8 == 0) goto L_0x0054
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r8 = r7 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0064
            boolean r8 = r15.b(r3)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r12 = r12 | r8
        L_0x0064:
            r8 = r47 & 8
            if (r8 == 0) goto L_0x006b
            r12 = r12 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r8 = r7 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x007b
            boolean r8 = r15.d(r4)
            if (r8 == 0) goto L_0x0078
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r12 = r12 | r8
        L_0x007b:
            r8 = r47 & 16
            if (r8 == 0) goto L_0x0084
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r14 = r43
            goto L_0x0097
        L_0x0084:
            r14 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0081
            r14 = r43
            boolean r16 = r15.V(r14)
            if (r16 == 0) goto L_0x0093
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r12 = r12 | r16
        L_0x0097:
            r5 = r47 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00a2
            r12 = r12 | r16
        L_0x009f:
            r5 = r44
            goto L_0x00b5
        L_0x00a2:
            r5 = r7 & r16
            if (r5 != 0) goto L_0x009f
            r5 = r44
            boolean r16 = r15.F(r5)
            if (r16 == 0) goto L_0x00b1
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r12 = r12 | r16
        L_0x00b5:
            r16 = 74899(0x12493, float:1.04956E-40)
            r0 = r12 & r16
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r9) goto L_0x00cd
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x00c6
            goto L_0x00cd
        L_0x00c6:
            r15.L()
            r5 = r14
            r10 = r15
            goto L_0x036f
        L_0x00cd:
            if (r8 == 0) goto L_0x00d2
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00d3
        L_0x00d2:
            r0 = r14
        L_0x00d3:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00df
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductAvailability (ListProductModal.kt:255)"
            U0.C4895p.S(r11, r12, r8, r9)
        L_0x00df:
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r8.g()
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c$b r14 = r11.k()
            r10 = 0
            E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r14, r15, r10)
            int r14 = U0.C4883j.a(r15, r10)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r13 = r19.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x010b
            U0.C4883j.c()
        L_0x010b:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0118
            r15.p(r13)
            goto L_0x011b
        L_0x0118:
            r15.t()
        L_0x011b:
            U0.m r13 = U0.F1.a(r15)
            r38 = r0
            nI.p r0 = r19.c()
            U0.F1.c(r13, r9, r0)
            nI.p r0 = r19.e()
            U0.F1.c(r13, r10, r0)
            nI.p r0 = r19.b()
            boolean r9 = r13.i()
            if (r9 != 0) goto L_0x0147
            java.lang.Object r9 = r13.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 != 0) goto L_0x0155
        L_0x0147:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r13.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r13.w(r9, r0)
        L_0x0155:
            nI.p r0 = r19.d()
            U0.F1.c(r13, r6, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = r12 >> 3
            r0 = r0 & 14
            r6 = 0
            r9 = 2
            y(r2, r6, r15, r0, r9)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r9 = 16
            float r9 = (float) r9
            float r10 = c2.h.B(r9)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.i(r0, r10)
            r13 = 6
            s0.C5844O.a(r10, r15, r13)
            androidx.compose.foundation.layout.d$e r10 = r8.f()
            i1.c$c r13 = r11.l()
            r14 = 0
            E1.I r10 = androidx.compose.foundation.layout.G.b(r10, r13, r15, r14)
            int r13 = U0.C4883j.a(r15, r14)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r0)
            nI.a r2 = r19.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x019e
            U0.C4883j.c()
        L_0x019e:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x01ab
            r15.p(r2)
            goto L_0x01ae
        L_0x01ab:
            r15.t()
        L_0x01ae:
            U0.m r2 = U0.F1.a(r15)
            nI.p r5 = r19.c()
            U0.F1.c(r2, r10, r5)
            nI.p r5 = r19.e()
            U0.F1.c(r2, r14, r5)
            nI.p r5 = r19.b()
            boolean r10 = r2.i()
            if (r10 != 0) goto L_0x01d8
            java.lang.Object r10 = r2.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x01e6
        L_0x01d8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r2.u(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r2.w(r10, r5)
        L_0x01e6:
            nI.p r5 = r19.d()
            U0.F1.c(r2, r6, r5)
            s0.N r20 = s0.C5843N.f28726a
            java.lang.String r2 = r40.a()
            java.lang.String r13 = r40.c()
            java.lang.String r14 = r40.b()
            r24 = 2
            r25 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r21 = r0
            androidx.compose.ui.d r5 = s0.C5842M.e(r20, r21, r22, r23, r24, r25)
            r17 = 0
            r18 = 0
            r6 = r12
            r12 = r2
            r2 = 1
            r10 = r15
            r15 = r5
            r16 = r10
            u(r12, r13, r14, r15, r16, r17, r18)
            r5 = 48
            float r12 = (float) r5
            float r5 = c2.h.B(r12)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r0, r5)
            r12 = 6
            s0.C5844O.a(r5, r10, r12)
            androidx.compose.foundation.layout.d$m r5 = r8.g()
            i1.c$b r8 = r11.k()
            r11 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r8, r10, r11)
            int r8 = U0.C4883j.a(r10, r11)
            U0.y r11 = r10.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r10, r0)
            nI.a r13 = r19.a()
            U0.f r14 = r10.m()
            if (r14 != 0) goto L_0x024c
            U0.C4883j.c()
        L_0x024c:
            r10.I()
            boolean r14 = r10.i()
            if (r14 == 0) goto L_0x0259
            r10.p(r13)
            goto L_0x025c
        L_0x0259:
            r10.t()
        L_0x025c:
            U0.m r13 = U0.F1.a(r10)
            nI.p r14 = r19.c()
            U0.F1.c(r13, r5, r14)
            nI.p r5 = r19.e()
            U0.F1.c(r13, r11, r5)
            nI.p r5 = r19.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x0286
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0294
        L_0x0286:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r13.u(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13.w(r8, r5)
        L_0x0294:
            nI.p r5 = r19.d()
            U0.F1.c(r13, r12, r5)
            int r5 = Oo.b.f84567Z
            r8 = 0
            java.lang.String r12 = J1.j.b(r5, r10, r8)
            TC.b$a$c r5 = TC.C13679b.a.c.f116681a
            r13 = r5
            r36 = 0
            r37 = 262140(0x3fffc, float:3.67336E-40)
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 48
            r34 = r10
            SC.C13607l.j(r12, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r0, r8)
            r11 = 6
            s0.C5844O.a(r8, r10, r11)
            il.g r8 = il.g.f98371a
            java.lang.String r12 = r8.a(r1)
            r17 = 0
            r18 = 14
            r13 = 0
            r15 = 0
            r16 = r10
            SC.U1.b(r12, r13, r14, r15, r16, r17, r18)
            r10.x()
            r10.x()
            r8 = -538687040(0xffffffffdfe449c0, float:-3.289978E19)
            r10.W(r8)
            if (r4 <= r2) goto L_0x0314
            float r8 = c2.h.B(r9)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.i(r0, r8)
            r9 = 6
            s0.C5844O.a(r8, r10, r9)
            int r8 = r6 >> 9
            r8 = r8 & 14
            r9 = 48
            r8 = r8 | r9
            vk.C12169r0.f0(r4, r5, r10, r8)
        L_0x0314:
            r10.P()
            r5 = -538679356(0xffffffffdfe467c4, float:-3.2916678E19)
            r10.W(r5)
            if (r3 == 0) goto L_0x035e
            r5 = 24
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r0, r5)
            r8 = 6
            s0.C5844O.a(r5, r10, r8)
            int r5 = ik.c.f98312D
            r8 = 0
            java.lang.String r12 = J1.j.b(r5, r10, r8)
            SC.N r15 = SC.N.Secondary
            int r5 = uK.C18146a.f148086I6
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.h(r0, r8, r2, r9)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r5)
            int r0 = r6 << 12
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r0 = r0 | 3120(0xc30, float:4.372E-42)
            r24 = 436(0x1b4, float:6.11E-43)
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = r44
            r22 = r10
            r23 = r0
            SC.L.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x035e:
            r10.P()
            r10.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x036d
            U0.C4895p.R()
        L_0x036d:
            r5 = r38
        L_0x036f:
            U0.Y0 r9 = r10.n()
            if (r9 == 0) goto L_0x038c
            vk.x0 r10 = new vk.x0
            r0 = r10
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r6 = r44
            r7 = r46
            r8 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x038c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.q(java.lang.String, pk.l$a, boolean, int, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(String str, l.a aVar, boolean z10, int i10, d dVar, C17631a aVar2, int i11, int i12, C4889m mVar, int i13) {
        q(str, aVar, z10, i10, dVar, aVar2, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void s(pk.l r22, nI.C17631a<XH.C16807N> r23, androidx.compose.ui.d r24, U0.C4889m r25, int r26, int r27) {
        /*
            r4 = r26
            r0 = 79613976(0x4bed018, float:4.485989E-36)
            r1 = r25
            U0.m r1 = r1.k(r0)
            r2 = r27 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r4 | 6
            r3 = r2
            r2 = r22
            goto L_0x0029
        L_0x0015:
            r2 = r4 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r22
            boolean r3 = r1.F(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r4
            goto L_0x0029
        L_0x0026:
            r2 = r22
            r3 = r4
        L_0x0029:
            r5 = r27 & 2
            r12 = 16
            if (r5 == 0) goto L_0x0034
            r3 = r3 | 48
            r15 = r23
            goto L_0x0045
        L_0x0034:
            r5 = r4 & 48
            r15 = r23
            if (r5 != 0) goto L_0x0045
            boolean r5 = r1.F(r15)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0044
        L_0x0043:
            r5 = r12
        L_0x0044:
            r3 = r3 | r5
        L_0x0045:
            r5 = r27 & 4
            if (r5 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r6 = r24
            goto L_0x0060
        L_0x004e:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004b
            r6 = r24
            boolean r7 = r1.V(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r7
        L_0x0060:
            r7 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0073
            boolean r7 = r1.l()
            if (r7 != 0) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            r1.L()
            r3 = r6
            goto L_0x01c5
        L_0x0073:
            if (r5 == 0) goto L_0x0079
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x007a
        L_0x0079:
            r14 = r6
        L_0x007a:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0086
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductDetails (ListProductModal.kt:216)"
            U0.C4895p.S(r0, r3, r5, r6)
        L_0x0086:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r0 = r0.f()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$c r5 = r5.l()
            r13 = 0
            E1.I r0 = androidx.compose.foundation.layout.G.b(r0, r5, r1, r13)
            int r5 = U0.C4883j.a(r1, r13)
            U0.y r6 = r1.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r1, r14)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r9 = r8.a()
            U0.f r10 = r1.m()
            if (r10 != 0) goto L_0x00b2
            U0.C4883j.c()
        L_0x00b2:
            r1.I()
            boolean r10 = r1.i()
            if (r10 == 0) goto L_0x00bf
            r1.p(r9)
            goto L_0x00c2
        L_0x00bf:
            r1.t()
        L_0x00c2:
            U0.m r9 = U0.F1.a(r1)
            nI.p r10 = r8.c()
            U0.F1.c(r9, r0, r10)
            nI.p r0 = r8.e()
            U0.F1.c(r9, r6, r0)
            nI.p r0 = r8.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x00ec
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x00fa
        L_0x00ec:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r0)
        L_0x00fa:
            nI.p r0 = r8.d()
            U0.F1.c(r9, r7, r0)
            s0.N r0 = s0.C5843N.f28726a
            java.lang.String r5 = r22.k()
            if (r5 == 0) goto L_0x010b
            r5 = 1
            goto L_0x010c
        L_0x010b:
            r5 = r13
        L_0x010c:
            java.lang.String r6 = r22.i()
            java.lang.String r7 = r22.k()
            if (r7 != 0) goto L_0x0118
            java.lang.String r7 = ""
        L_0x0118:
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 0
            r16 = r0
            r17 = r11
            androidx.compose.ui.d r8 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r10 = 0
            r16 = 0
            r9 = r1
            r13 = r11
            r11 = r16
            vk.C12169r0.U(r5, r6, r7, r8, r9, r10, r11)
            float r5 = (float) r12
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r13, r5)
            r6 = 6
            s0.C5844O.a(r5, r1, r6)
            java.lang.String r5 = r22.k()
            if (r5 == 0) goto L_0x0196
            r5 = 173334389(0xa54df75, float:1.0249456E-32)
            r1.W(r5)
            java.lang.String r5 = r22.k()
            java.lang.String r6 = r22.f()
            pk.p r7 = r22.l()
            boolean r8 = r22.o()
            boolean r9 = r22.d()
            KJ.c r10 = r22.g()
            KJ.f r11 = KJ.C15985a.l(r10)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r0
            r17 = r13
            androidx.compose.ui.d r13 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            boolean r10 = r22.h()
            int r0 = IC.C13023e.f110931a
            int r0 = r0 << 18
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            int r3 = r3 << 18
            r3 = r3 & r12
            r0 = r0 | r3
            r16 = 0
            r12 = r23
            r3 = r14
            r14 = r1
            r15 = r0
            vk.C12169r0.h0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.P()
            goto L_0x01b9
        L_0x0196:
            r3 = r14
            r5 = 173916507(0xa5dc15b, float:1.0677129E-32)
            r1.W(r5)
            r19 = 2
            r20 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r15 = r0
            r16 = r13
            androidx.compose.ui.d r0 = s0.C5842M.e(r15, r16, r17, r18, r19, r20)
            java.lang.String r5 = "loading_state"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r5)
            r5 = 0
            vk.C12169r0.O(r0, r1, r5, r5)
            r1.P()
        L_0x01b9:
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01c5
            U0.C4895p.R()
        L_0x01c5:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01dc
            vk.y0 r7 = new vk.y0
            r0 = r7
            r1 = r22
            r2 = r23
            r4 = r26
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.s(pk.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(l lVar, C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        s(lVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void u(java.lang.String r39, java.lang.String r40, java.lang.String r41, androidx.compose.ui.d r42, U0.C4889m r43, int r44, int r45) {
        /*
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r44
            r0 = 8
            r1 = 2
            r2 = 4
            r3 = 6
            r4 = -946091438(0xffffffffc79bca52, float:-79764.64)
            r5 = r43
            U0.m r6 = r5.k(r4)
            r5 = r45 & 1
            if (r5 == 0) goto L_0x001d
            r5 = r10 | 6
            goto L_0x002d
        L_0x001d:
            r5 = r10 & 6
            if (r5 != 0) goto L_0x002c
            boolean r5 = r6.V(r7)
            if (r5 == 0) goto L_0x0029
            r5 = r2
            goto L_0x002a
        L_0x0029:
            r5 = r1
        L_0x002a:
            r5 = r5 | r10
            goto L_0x002d
        L_0x002c:
            r5 = r10
        L_0x002d:
            r1 = r45 & 2
            if (r1 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0044
        L_0x0034:
            r1 = r10 & 48
            if (r1 != 0) goto L_0x0044
            boolean r1 = r6.V(r8)
            if (r1 == 0) goto L_0x0041
            r1 = 32
            goto L_0x0043
        L_0x0041:
            r1 = 16
        L_0x0043:
            r5 = r5 | r1
        L_0x0044:
            r1 = r45 & 4
            if (r1 == 0) goto L_0x004b
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x005b
            boolean r1 = r6.V(r9)
            if (r1 == 0) goto L_0x0058
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r1 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r1
        L_0x005b:
            r1 = r45 & 8
            if (r1 == 0) goto L_0x0064
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r2 = r42
            goto L_0x0076
        L_0x0064:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0061
            r2 = r42
            boolean r11 = r6.V(r2)
            if (r11 == 0) goto L_0x0073
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r5 = r5 | r11
        L_0x0076:
            r11 = r5 & 1171(0x493, float:1.641E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r11 != r12) goto L_0x008a
            boolean r11 = r6.l()
            if (r11 != 0) goto L_0x0083
            goto L_0x008a
        L_0x0083:
            r6.L()
            r4 = r2
            r2 = r6
            goto L_0x027c
        L_0x008a:
            if (r1 == 0) goto L_0x008f
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r2 = r1
        L_0x008f:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x009b
            r1 = -1
            java.lang.String r11 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductLocation (ListProductModal.kt:330)"
            U0.C4895p.S(r4, r5, r1, r11)
        L_0x009b:
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r11 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r4, r6, r11)
            int r4 = U0.C4883j.a(r6, r11)
            U0.y r12 = r6.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r6, r2)
            G1.g$a r14 = G1.C4504g.f6515W
            nI.a r15 = r14.a()
            U0.f r16 = r6.m()
            if (r16 != 0) goto L_0x00c7
            U0.C4883j.c()
        L_0x00c7:
            r6.I()
            boolean r16 = r6.i()
            if (r16 == 0) goto L_0x00d4
            r6.p(r15)
            goto L_0x00d7
        L_0x00d4:
            r6.t()
        L_0x00d7:
            U0.m r15 = U0.F1.a(r6)
            nI.p r3 = r14.c()
            U0.F1.c(r15, r1, r3)
            nI.p r1 = r14.e()
            U0.F1.c(r15, r12, r1)
            nI.p r1 = r14.b()
            boolean r3 = r15.i()
            if (r3 != 0) goto L_0x0101
            java.lang.Object r3 = r15.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r12)
            if (r3 != 0) goto L_0x010f
        L_0x0101:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15.w(r3, r1)
        L_0x010f:
            nI.p r1 = r14.d()
            U0.F1.c(r15, r13, r1)
            s0.h r1 = s0.C5862h.f28810a
            if (r8 == 0) goto L_0x018e
            if (r9 == 0) goto L_0x018e
            r0 = -413945943(0xffffffffe753afa9, float:-9.996597E23)
            r6.W(r0)
            int r0 = ik.c.f98315G
            int r1 = ik.c.f98316H
            java.lang.String r1 = J1.j.b(r1, r6, r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = J1.j.c(r0, r1, r6, r11)
            int r1 = ik.c.f98316H
            java.lang.String r1 = J1.j.b(r1, r6, r11)
            N1.G r3 = new N1.G
            r11 = r3
            S1.C$a r4 = S1.C.f13316b
            S1.C r16 = r4.a()
            r32 = 65531(0xfffb, float:9.1828E-41)
            r33 = 0
            r12 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r11.<init>(r12, r14, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33)
            N1.d r11 = IC.C13021c.e(r0, r1, r3)
            TC.b$a$b r12 = TC.C13679b.a.C2856b.f116680a
            r36 = 0
            r37 = 524284(0x7fffc, float:7.34678E-40)
            r13 = 0
            r16 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r35 = 48
            r34 = r6
            SC.C13607l.h(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r6.P()
            r38 = r2
            r2 = r6
            goto L_0x026e
        L_0x018e:
            if (r7 == 0) goto L_0x01f2
            r1 = -413219799(0xffffffffe75ec429, float:-1.0519839E24)
            r6.W(r1)
            int r1 = ik.c.f98311C
            java.lang.String r11 = J1.j.b(r1, r6, r11)
            TC.b$a$c r12 = TC.C13679b.a.c.f116681a
            r35 = 0
            r36 = 262140(0x3fffc, float:3.67336E-40)
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 48
            r33 = r6
            SC.C13607l.j(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r1, r0)
            r1 = 6
            s0.C5844O.a(r0, r6, r1)
            SC.V1 r3 = SC.V1.Subtle
            r0 = r5 & 14
            r5 = r0 | 3072(0xc00, float:4.305E-42)
            r11 = 6
            r1 = 0
            r4 = 0
            r0 = r39
            r38 = r2
            r2 = r4
            r4 = r6
            r14 = r6
            r6 = r11
            SC.U1.b(r0, r1, r2, r3, r4, r5, r6)
            r14.P()
            r2 = r14
            goto L_0x026e
        L_0x01f2:
            r38 = r2
            r14 = r6
            r0 = -412745530(0xffffffffe76600c6, float:-1.08615856E24)
            r14.W(r0)
            int r0 = ik.c.f98313E
            int r1 = ik.c.f98314F
            java.lang.String r1 = J1.j.b(r1, r14, r11)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = J1.j.c(r0, r1, r14, r11)
            int r1 = ik.c.f98314F
            java.lang.String r1 = J1.j.b(r1, r14, r11)
            N1.G r2 = new N1.G
            r15 = r2
            S1.C$a r3 = S1.C.f13316b
            S1.C r20 = r3.a()
            r36 = 65531(0xfffb, float:9.1828E-41)
            r37 = 0
            r16 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r15.<init>(r16, r18, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r32, r33, r34, r35, r36, r37)
            N1.d r11 = IC.C13021c.e(r0, r1, r2)
            TC.b$a$b r12 = TC.C13679b.a.C2856b.f116680a
            r36 = 0
            r37 = 524284(0x7fffc, float:7.34678E-40)
            r13 = 0
            r0 = 0
            r2 = r14
            r14 = r0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r35 = 48
            r34 = r2
            SC.C13607l.h(r11, r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r2.P()
        L_0x026e:
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x027a
            U0.C4895p.R()
        L_0x027a:
            r4 = r38
        L_0x027c:
            U0.Y0 r11 = r2.n()
            if (r11 == 0) goto L_0x0295
            vk.A0 r12 = new vk.A0
            r0 = r12
            r1 = r39
            r2 = r40
            r3 = r41
            r5 = r44
            r6 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.a(r12)
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.u(java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, String str2, String str3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        u(str, str2, str3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(pk.l r30, boolean r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, androidx.compose.ui.d r35, U0.C4889m r36, int r37, int r38) {
        /*
            r7 = r37
            r0 = 32
            r1 = 16
            r2 = 4
            r3 = 6
            r4 = -649521257(0xffffffffd9491797, float:-3.53765048E15)
            r5 = r36
            U0.m r5 = r5.k(r4)
            r6 = 1
            r8 = r38 & 1
            r15 = 2
            if (r8 == 0) goto L_0x001c
            r8 = r7 | 6
            r14 = r30
            goto L_0x002e
        L_0x001c:
            r8 = r7 & 6
            r14 = r30
            if (r8 != 0) goto L_0x002d
            boolean r8 = r5.F(r14)
            if (r8 == 0) goto L_0x002a
            r8 = r2
            goto L_0x002b
        L_0x002a:
            r8 = r15
        L_0x002b:
            r8 = r8 | r7
            goto L_0x002e
        L_0x002d:
            r8 = r7
        L_0x002e:
            r9 = r38 & 2
            if (r9 == 0) goto L_0x0037
            r8 = r8 | 48
            r13 = r31
            goto L_0x0047
        L_0x0037:
            r9 = r7 & 48
            r13 = r31
            if (r9 != 0) goto L_0x0047
            boolean r9 = r5.b(r13)
            if (r9 == 0) goto L_0x0045
            r9 = r0
            goto L_0x0046
        L_0x0045:
            r9 = r1
        L_0x0046:
            r8 = r8 | r9
        L_0x0047:
            r2 = r38 & 4
            if (r2 == 0) goto L_0x0050
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r2 = r32
            goto L_0x0062
        L_0x0050:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004d
            r2 = r32
            boolean r9 = r5.F(r2)
            if (r9 == 0) goto L_0x005f
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r8 = r8 | r9
        L_0x0062:
            r9 = r38 & 8
            if (r9 == 0) goto L_0x006b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            r12 = r33
            goto L_0x007d
        L_0x006b:
            r9 = r7 & 3072(0xc00, float:4.305E-42)
            r12 = r33
            if (r9 != 0) goto L_0x007d
            boolean r9 = r5.F(r12)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r8 = r8 | r9
        L_0x007d:
            r9 = r38 & 16
            if (r9 == 0) goto L_0x0086
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            r11 = r34
            goto L_0x0098
        L_0x0086:
            r9 = r7 & 24576(0x6000, float:3.4438E-41)
            r11 = r34
            if (r9 != 0) goto L_0x0098
            boolean r9 = r5.F(r11)
            if (r9 == 0) goto L_0x0095
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r8 = r8 | r9
        L_0x0098:
            r9 = r38 & 32
            r10 = 196608(0x30000, float:2.75506E-40)
            if (r9 == 0) goto L_0x00a2
            r8 = r8 | r10
        L_0x009f:
            r10 = r35
            goto L_0x00b4
        L_0x00a2:
            r10 = r10 & r7
            if (r10 != 0) goto L_0x009f
            r10 = r35
            boolean r16 = r5.V(r10)
            if (r16 == 0) goto L_0x00b0
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r8 = r8 | r16
        L_0x00b4:
            r16 = 74899(0x12493, float:1.04956E-40)
            r0 = r8 & r16
            r3 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r3) goto L_0x00cb
            boolean r0 = r5.l()
            if (r0 != 0) goto L_0x00c5
            goto L_0x00cb
        L_0x00c5:
            r5.L()
            r6 = r10
            goto L_0x0219
        L_0x00cb:
            if (r9 == 0) goto L_0x00d0
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00d1
        L_0x00d0:
            r0 = r10
        L_0x00d1:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00dd
            r3 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.SmallWidthContent (ListProductModal.kt:142)"
            U0.C4895p.S(r4, r8, r3, r9)
        L_0x00dd:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r5, r9)
            int r4 = U0.C4883j.a(r5, r9)
            U0.y r9 = r5.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r5, r0)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r1 = r16.a()
            U0.f r17 = r5.m()
            if (r17 != 0) goto L_0x0109
            U0.C4883j.c()
        L_0x0109:
            r5.I()
            boolean r17 = r5.i()
            if (r17 == 0) goto L_0x0116
            r5.p(r1)
            goto L_0x0119
        L_0x0116:
            r5.t()
        L_0x0119:
            U0.m r1 = U0.F1.a(r5)
            nI.p r15 = r16.c()
            U0.F1.c(r1, r3, r15)
            nI.p r3 = r16.e()
            U0.F1.c(r1, r9, r3)
            nI.p r3 = r16.b()
            boolean r9 = r1.i()
            if (r9 != 0) goto L_0x0143
            java.lang.Object r9 = r1.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x0151
        L_0x0143:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r1.u(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.w(r4, r3)
        L_0x0151:
            nI.p r3 = r16.d()
            U0.F1.c(r1, r10, r3)
            s0.h r1 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r1, r3, r6, r4)
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = r32
            androidx.compose.ui.d r9 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            r10 = 24
            float r15 = (float) r10
            float r10 = c2.h.B(r15)
            r6 = 2
            androidx.compose.ui.d r23 = androidx.compose.foundation.layout.D.k(r9, r10, r3, r6, r4)
            r6 = 16
            float r6 = (float) r6
            float r27 = c2.h.B(r6)
            r28 = 7
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r23, r24, r25, r26, r27, r28, r29)
            r9 = r8 & 14
            r17 = 6
            int r18 = r8 >> 6
            r17 = r18 & 112(0x70, float:1.57E-43)
            r17 = r9 | r17
            r18 = 0
            r19 = r8
            r8 = r30
            r9 = r33
            r11 = r5
            r12 = r17
            r13 = r18
            s(r8, r9, r10, r11, r12, r13)
            r8 = 1
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r1, r3, r8, r4)
            float r9 = c2.h.B(r15)
            r10 = 2
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.k(r8, r9, r3, r10, r4)
            r13 = 6
            r16 = 6
            r9 = 0
            r10 = 0
            r12 = r5
            r14 = r16
            SC.C13643u0.c(r8, r9, r10, r12, r13, r14)
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.i(r1, r6)
            r8 = 6
            s0.C5844O.a(r6, r5, r8)
            java.lang.String r8 = r30.j()
            pk.l$a r9 = r30.c()
            int r11 = r30.n()
            float r6 = c2.h.B(r15)
            r10 = 2
            androidx.compose.ui.d r12 = androidx.compose.foundation.layout.D.k(r1, r6, r3, r10, r4)
            int r3 = r19 << 3
            r4 = r3 & 896(0x380, float:1.256E-42)
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r6 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            r15 = r4 | r3
            r16 = 0
            r10 = r31
            r13 = r34
            r14 = r5
            q(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 32
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r1, r3)
            r3 = 6
            s0.C5844O.a(r1, r5, r3)
            r5.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0218
            U0.C4895p.R()
        L_0x0218:
            r6 = r0
        L_0x0219:
            U0.Y0 r9 = r5.n()
            if (r9 == 0) goto L_0x0236
            vk.w0 r10 = new vk.w0
            r0 = r10
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r7 = r37
            r8 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.w(pk.l, boolean, nI.a, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(l lVar, boolean z10, C17631a aVar, C17631a aVar2, C17631a aVar3, d dVar, int i10, int i11, C4889m mVar, int i12) {
        w(lVar, z10, aVar, aVar2, aVar3, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void y(pk.l.a r36, androidx.compose.ui.d r37, U0.C4889m r38, int r39, int r40) {
        /*
            r0 = r36
            r1 = r39
            r2 = r40
            r3 = 2
            r4 = 48
            r5 = 6
            r6 = 768429071(0x2dcd4c0f, float:2.3339579E-11)
            r7 = r38
            U0.m r15 = r7.k(r6)
            r7 = r2 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r1 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r1 & 6
            if (r7 != 0) goto L_0x0029
            boolean r7 = r15.V(r0)
            if (r7 == 0) goto L_0x0026
            r7 = 4
            goto L_0x0027
        L_0x0026:
            r7 = r3
        L_0x0027:
            r7 = r7 | r1
            goto L_0x002a
        L_0x0029:
            r7 = r1
        L_0x002a:
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0031
            r7 = r7 | r4
        L_0x002e:
            r8 = r37
            goto L_0x0043
        L_0x0031:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x002e
            r8 = r37
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0040
            r9 = 32
            goto L_0x0042
        L_0x0040:
            r9 = 16
        L_0x0042:
            r7 = r7 | r9
        L_0x0043:
            r9 = r7 & 19
            r10 = 18
            if (r9 != r10) goto L_0x0057
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            r15.L()
            r3 = r8
            r5 = r15
            goto L_0x0239
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x005d
        L_0x005c:
            r3 = r8
        L_0x005d:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0069
            r8 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.StockAvailability (ListProductModal.kt:300)"
            U0.C4895p.S(r6, r7, r8, r9)
        L_0x0069:
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r6.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r10 = r9.k()
            r12 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r10, r15, r12)
            int r10 = U0.C4883j.a(r15, r12)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r14 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0095
            U0.C4883j.c()
        L_0x0095:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00a2
            r15.p(r14)
            goto L_0x00a5
        L_0x00a2:
            r15.t()
        L_0x00a5:
            U0.m r14 = U0.F1.a(r15)
            nI.p r5 = r16.c()
            U0.F1.c(r14, r8, r5)
            nI.p r5 = r16.e()
            U0.F1.c(r14, r11, r5)
            nI.p r5 = r16.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x00cf
            java.lang.Object r8 = r14.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x00dd
        L_0x00cf:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r14.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r14.w(r8, r5)
        L_0x00dd:
            nI.p r5 = r16.d()
            U0.F1.c(r14, r13, r5)
            s0.h r5 = s0.C5862h.f28810a
            i1.c$c r5 = r9.i()
            androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d$e r6 = r6.f()
            E1.I r4 = androidx.compose.foundation.layout.G.b(r6, r5, r15, r4)
            int r5 = U0.C4883j.a(r15, r12)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r14)
            nI.a r9 = r16.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x010d
            U0.C4883j.c()
        L_0x010d:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x011a
            r15.p(r9)
            goto L_0x011d
        L_0x011a:
            r15.t()
        L_0x011d:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r16.c()
            U0.F1.c(r9, r4, r10)
            nI.p r4 = r16.e()
            U0.F1.c(r9, r6, r4)
            nI.p r4 = r16.b()
            boolean r6 = r9.i()
            if (r6 != 0) goto L_0x0147
            java.lang.Object r6 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x0155
        L_0x0147:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.w(r5, r4)
        L_0x0155:
            nI.p r4 = r16.d()
            U0.F1.c(r9, r8, r4)
            s0.N r4 = s0.C5843N.f28726a
            r4 = r7 & 14
            vk.C12169r0.o0(r0, r15, r4)
            r4 = 8
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.y(r14, r4)
            r5 = 6
            s0.C5844O.a(r4, r15, r5)
            IC.e r4 = r36.l()
            int r5 = IC.C13023e.f110931a
            java.lang.String r4 = r4.a(r15, r5)
            N1.d r7 = IC.C13021c.b(r4, r15, r12)
            TC.b$a$b r4 = TC.C13679b.a.C2856b.f116680a
            r8 = r4
            tK.v r6 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.h r9 = r6.a(r15, r13)
            long r10 = r9.G0()
            r32 = 0
            r33 = 524276(0x7fff4, float:7.34667E-40)
            r9 = 0
            r16 = 0
            r34 = r13
            r12 = r16
            r16 = 0
            r35 = r14
            r14 = r16
            r37 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 48
            r30 = r37
            SC.C13607l.h(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r37.x()
            r7 = -879429057(0xffffffffcb94fa3f, float:-1.9526782E7)
            r8 = r37
            r8.W(r7)
            boolean r7 = r0 instanceof pk.l.a.c
            if (r7 == 0) goto L_0x01da
            r7 = r0
            pk.l$a$c r7 = (pk.l.a.c) r7
            IC.e r7 = r7.e()
            if (r7 != 0) goto L_0x01dc
        L_0x01da:
            r5 = r8
            goto L_0x022a
        L_0x01dc:
            r9 = 4
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            r10 = r35
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.i(r10, r9)
            r10 = 6
            s0.C5844O.a(r9, r8, r10)
            java.lang.String r5 = r7.a(r8, r5)
            r7 = 0
            N1.d r7 = IC.C13021c.b(r5, r8, r7)
            r5 = r34
            tK.h r5 = r6.a(r8, r5)
            long r10 = r5.G0()
            r32 = 0
            r33 = 524276(0x7fff4, float:7.34667E-40)
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 48
            r5 = r8
            r8 = r4
            r30 = r5
            SC.C13607l.h(r7, r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x022a:
            r5.P()
            r5.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0239
            U0.C4895p.R()
        L_0x0239:
            U0.Y0 r4 = r5.n()
            if (r4 == 0) goto L_0x0247
            vk.z0 r5 = new vk.z0
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.E0.y(pk.l$a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N z(l.a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        y(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
