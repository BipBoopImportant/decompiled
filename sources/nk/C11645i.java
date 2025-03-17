package nk;

import A0.f;
import A0.g;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import Op.K;
import Op.c1;
import Op.d1;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.j;
import m0.N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import pk.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import t0.C5934A;
import t0.C5935B;
import tK.C18030v;
import uk.A1;
import uk.B1;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aÁ\u0001\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpk/s$d;", "complementListCarousel", "", "expandedWidth", "Lkotlin/Function1;", "", "LXH/N;", "onItemClicked", "Luk/B1;", "onAddToFavouriteClicked", "onColorInfoClicked", "onEnergyLabelClick", "Lcom/ingka/ikea/core/model/Link;", "onLinkClicked", "Luk/A1;", "onInspirationCarouselSeen", "l", "(Lpk/s$d;ZLnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;I)V", "listId", "LOp/d1;", "prominentProduct", "LKJ/c;", "products", "Landroidx/compose/ui/d;", "modifier", "Lt0/A;", "lazyListState", "g", "(Ljava/lang/String;LOp/d1;LKJ/c;ZLnI/l;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;Landroidx/compose/ui/d;Lt0/A;LU0/m;III)V", "n", "(Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nk.i  reason: case insensitive filesystem */
public final class C11645i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: nk.i$a */
    static final class a implements q<s.d, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f99862a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f99863b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<B1, C16807N> f99864c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f99865d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f99866e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Link, C16807N> f99867f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<A1, C16807N> f99868g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5934A f99869h;

        a(boolean z10, C17642l<? super String, C16807N> lVar, C17642l<? super B1, C16807N> lVar2, C17642l<? super String, C16807N> lVar3, C17642l<? super String, C16807N> lVar4, C17642l<? super Link, C16807N> lVar5, C17642l<? super A1, C16807N> lVar6, C5934A a10) {
            this.f99862a = z10;
            this.f99863b = lVar;
            this.f99864c = lVar2;
            this.f99865d = lVar3;
            this.f99866e = lVar4;
            this.f99867f = lVar5;
            this.f99868g = lVar6;
            this.f99869h = a10;
        }

        public final void a(s.d dVar, C4889m mVar, int i10) {
            int i11;
            s.d dVar2 = dVar;
            C4889m mVar2 = mVar;
            C17542s.j(dVar2, "state");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? mVar2.V(dVar2) : mVar2.F(dVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(140563773, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.ComplementListCarousel.<anonymous> (ComplementListCarousel.kt:72)");
                }
                if (dVar2 instanceof s.d.a) {
                    mVar2.W(-199248916);
                    s.d.a aVar = (s.d.a) dVar2;
                    C11645i.g(aVar.b(), aVar.d(), aVar.c(), this.f99862a, this.f99863b, this.f99864c, this.f99865d, this.f99866e, this.f99867f, this.f99868g, C5116k1.a(d.f18749a, "complement_list_carousel_content"), this.f99869h, mVar, 0, 6, 0);
                    mVar.P();
                } else if (C17542s.e(dVar2, s.d.b.f101074a)) {
                    mVar.W(-1668972471);
                    mVar.P();
                } else {
                    C4889m mVar3 = mVar;
                    if (C17542s.e(dVar2, s.d.c.f101075a)) {
                        mVar3.W(-1668970696);
                        C11645i.n(C5116k1.a(d.f18749a, "complement_list_carousel_loading"), mVar3, 6, 0);
                        mVar.P();
                    } else {
                        mVar3.W(-1668997129);
                        mVar.P();
                        throw new t();
                    }
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
            a((s.d) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: nk.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: nk.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v34, resolved type: nk.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v35, resolved type: nk.e} */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x035b, code lost:
        if (r14 == U0.C4889m.f14007a.a()) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03eb, code lost:
        if (r5 == U0.C4889m.f14007a.a()) goto L_0x03ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.String r47, Op.d1 r48, KJ.C15987c<Op.d1> r49, boolean r50, nI.C17642l<? super java.lang.String, XH.C16807N> r51, nI.C17642l<? super uk.B1, XH.C16807N> r52, nI.C17642l<? super java.lang.String, XH.C16807N> r53, nI.C17642l<? super java.lang.String, XH.C16807N> r54, nI.C17642l<? super com.ingka.ikea.core.model.Link, XH.C16807N> r55, nI.C17642l<? super uk.A1, XH.C16807N> r56, androidx.compose.ui.d r57, t0.C5934A r58, U0.C4889m r59, int r60, int r61, int r62) {
        /*
            r1 = r47
            r11 = r49
            r12 = r50
            r13 = r56
            r14 = r60
            r15 = r62
            r0 = 216529164(0xce7f90c, float:3.5741075E-31)
            r2 = r59
            U0.m r10 = r2.k(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x001c
            r2 = r14 | 6
            goto L_0x002c
        L_0x001c:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x002b
            boolean r2 = r10.V(r1)
            if (r2 == 0) goto L_0x0028
            r2 = 4
            goto L_0x0029
        L_0x0028:
            r2 = 2
        L_0x0029:
            r2 = r2 | r14
            goto L_0x002c
        L_0x002b:
            r2 = r14
        L_0x002c:
            r5 = r15 & 2
            if (r5 == 0) goto L_0x0035
            r2 = r2 | 48
            r9 = r48
            goto L_0x0047
        L_0x0035:
            r5 = r14 & 48
            r9 = r48
            if (r5 != 0) goto L_0x0047
            boolean r5 = r10.V(r9)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r2 = r2 | r5
        L_0x0047:
            r5 = r15 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005e
        L_0x004e:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005e
            boolean r5 = r10.V(r11)
            if (r5 == 0) goto L_0x005b
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r5
        L_0x005e:
            r5 = r15 & 8
            if (r5 == 0) goto L_0x0065
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0065:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0075
            boolean r5 = r10.b(r12)
            if (r5 == 0) goto L_0x0072
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r2 = r2 | r5
        L_0x0075:
            r5 = r15 & 16
            if (r5 == 0) goto L_0x007e
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r5 = r51
            goto L_0x0091
        L_0x007e:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x007b
            r5 = r51
            boolean r16 = r10.F(r5)
            if (r16 == 0) goto L_0x008d
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r2 = r2 | r16
        L_0x0091:
            r16 = r15 & 32
            if (r16 == 0) goto L_0x009c
            r16 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r16
            r6 = r52
            goto L_0x00b1
        L_0x009c:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r14 & r16
            r6 = r52
            if (r16 != 0) goto L_0x00b1
            boolean r16 = r10.F(r6)
            if (r16 == 0) goto L_0x00ad
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00af
        L_0x00ad:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00af:
            r2 = r2 | r16
        L_0x00b1:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00bc
            r16 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r16
            r6 = r53
            goto L_0x00d1
        L_0x00bc:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r14 & r16
            r6 = r53
            if (r16 != 0) goto L_0x00d1
            boolean r16 = r10.F(r6)
            if (r16 == 0) goto L_0x00cd
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r2 = r2 | r16
        L_0x00d1:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00db
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
        L_0x00d8:
            r3 = r54
            goto L_0x00ef
        L_0x00db:
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x00d8
            r3 = r54
            boolean r16 = r10.F(r3)
            if (r16 == 0) goto L_0x00eb
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r2 = r2 | r16
        L_0x00ef:
            r7 = r15 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00f9
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r7
        L_0x00f6:
            r7 = r55
            goto L_0x010d
        L_0x00f9:
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x00f6
            r7 = r55
            boolean r17 = r10.F(r7)
            if (r17 == 0) goto L_0x0109
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r2 = r2 | r17
        L_0x010d:
            r8 = r15 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x0115
            r8 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0113:
            r2 = r2 | r8
            goto L_0x0126
        L_0x0115:
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0126
            boolean r8 = r10.F(r13)
            if (r8 == 0) goto L_0x0123
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0113
        L_0x0123:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0113
        L_0x0126:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0131
            r17 = r61 | 6
            r4 = r57
            r18 = r17
            goto L_0x0147
        L_0x0131:
            r17 = r61 & 6
            r4 = r57
            if (r17 != 0) goto L_0x0145
            boolean r18 = r10.V(r4)
            if (r18 == 0) goto L_0x0140
            r18 = 4
            goto L_0x0142
        L_0x0140:
            r18 = 2
        L_0x0142:
            r18 = r61 | r18
            goto L_0x0147
        L_0x0145:
            r18 = r61
        L_0x0147:
            r19 = r61 & 48
            if (r19 != 0) goto L_0x0161
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x015a
            r0 = r58
            boolean r20 = r10.V(r0)
            if (r20 == 0) goto L_0x015c
            r20 = 32
            goto L_0x015e
        L_0x015a:
            r0 = r58
        L_0x015c:
            r20 = 16
        L_0x015e:
            r18 = r18 | r20
            goto L_0x0163
        L_0x0161:
            r0 = r58
        L_0x0163:
            r20 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r2 & r20
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0183
            r0 = r18 & 19
            r3 = 18
            if (r0 != r3) goto L_0x0183
            boolean r0 = r10.l()
            if (r0 != 0) goto L_0x017a
            goto L_0x0183
        L_0x017a:
            r10.L()
            r12 = r58
            r11 = r4
            r14 = r10
            goto L_0x046e
        L_0x0183:
            r10.G()
            r0 = r14 & 1
            r3 = 0
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r10.O()
            if (r0 == 0) goto L_0x0192
            goto L_0x01a1
        L_0x0192:
            r10.L()
            r0 = r15 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x019b
            r18 = r18 & -113(0xffffffffffffff8f, float:NaN)
        L_0x019b:
            r42 = r58
            r0 = r4
        L_0x019e:
            r4 = r18
            goto L_0x01b8
        L_0x01a1:
            if (r8 == 0) goto L_0x01a6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x01a7
        L_0x01a6:
            r0 = r4
        L_0x01a7:
            r4 = r15 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x01b5
            r4 = 3
            t0.A r4 = t0.C5935B.c(r3, r3, r10, r3, r4)
            r18 = r18 & -113(0xffffffffffffff8f, float:NaN)
            r42 = r4
            goto L_0x019e
        L_0x01b5:
            r42 = r58
            goto L_0x019e
        L_0x01b8:
            r10.y()
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x01c9
            java.lang.String r8 = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.Carousel (ComplementListCarousel.kt:112)"
            r3 = 216529164(0xce7f90c, float:3.5741075E-31)
            U0.C4895p.S(r3, r2, r4, r8)
        L_0x01c9:
            r3 = -563761744(0xffffffffde65adb0, float:-4.13751943E18)
            r10.W(r3)
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r2
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 != r8) goto L_0x01d8
            r3 = 1
            goto L_0x01d9
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            r8 = r2 & 14
            r7 = 4
            if (r8 != r7) goto L_0x01e0
            r7 = 1
            goto L_0x01e1
        L_0x01e0:
            r7 = 0
        L_0x01e1:
            r3 = r3 | r7
            r7 = r2 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != r8) goto L_0x01ea
            r7 = 1
            goto L_0x01eb
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            r3 = r3 | r7
            java.lang.Object r7 = r10.D()
            if (r3 != 0) goto L_0x01fa
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x0202
        L_0x01fa:
            nk.d r7 = new nk.d
            r7.<init>(r13, r1, r11)
            r10.u(r7)
        L_0x0202:
            nI.a r7 = (nI.C17631a) r7
            r10.P()
            r8 = 0
            r3 = 0
            r6 = 1
            pl.d.d(r8, r7, r10, r3, r6)
            tK.v r7 = tK.C18030v.f147664a
            int r3 = tK.C18030v.f147665b
            tK.h r16 = r7.a(r10, r3)
            long r21 = r16.k0()
            r24 = 2
            r25 = 0
            r23 = 0
            r20 = r0
            androidx.compose.ui.d r6 = androidx.compose.foundation.b.d(r20, r21, r23, r24, r25)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r16.g()
            i1.c$a r16 = i1.C5437c.f24302a
            r43 = r0
            i1.c$b r0 = r16.k()
            r1 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r8, r0, r10, r1)
            int r8 = U0.C4883j.a(r10, r1)
            U0.y r1 = r10.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r10, r6)
            G1.g$a r16 = G1.C4504g.f6515W
            r44 = r3
            nI.a r3 = r16.a()
            U0.f r17 = r10.m()
            if (r17 != 0) goto L_0x0255
            U0.C4883j.c()
        L_0x0255:
            r10.I()
            boolean r17 = r10.i()
            if (r17 == 0) goto L_0x0262
            r10.p(r3)
            goto L_0x0265
        L_0x0262:
            r10.t()
        L_0x0265:
            U0.m r3 = U0.F1.a(r10)
            nI.p r5 = r16.c()
            U0.F1.c(r3, r0, r5)
            nI.p r0 = r16.e()
            U0.F1.c(r3, r1, r0)
            nI.p r0 = r16.b()
            boolean r1 = r3.i()
            if (r1 != 0) goto L_0x028f
            java.lang.Object r1 = r3.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r5)
            if (r1 != 0) goto L_0x029d
        L_0x028f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r3.u(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r3.w(r1, r0)
        L_0x029d:
            nI.p r0 = r16.d()
            U0.F1.c(r3, r6, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r1 = ik.c.f98349r
            r3 = 0
            java.lang.String r16 = J1.j.b(r1, r10, r3)
            TC.b$b$e r17 = TC.C13679b.C2857b.e.f116687a
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r18 = TC.e.i(r1)
            r40 = 0
            r41 = 262136(0x3fff8, float:3.67331E-40)
            r19 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r10
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r3 = 32
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r1, r3)
            r8 = 6
            s0.C5844O.a(r3, r10, r8)
            r3 = 0
            float r5 = (float) r3
            float r5 = c2.h.B(r5)
            s0.E r5 = androidx.compose.foundation.layout.D.a(r5)
            r6 = 24
            float r6 = (float) r6
            float r3 = c2.h.B(r6)
            r8 = 0
            r34 = r7
            r7 = 2
            r9 = 0
            s0.E r23 = androidx.compose.foundation.layout.D.c(r3, r8, r7, r9)
            LC.b$b r3 = new LC.b$b
            gs.h$a r7 = gs.h.a.L
            r3.<init>(r7)
            r24 = r12 ^ 1
            r7 = -1798972036(0xffffffff94c5dd7c, float:-1.9979277E-26)
            r10.W(r7)
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r2
            r8 = 8388608(0x800000, float:1.17549435E-38)
            if (r7 != r8) goto L_0x0320
            r8 = 1
            goto L_0x0321
        L_0x0320:
            r8 = 0
        L_0x0321:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r9 = r2 & r16
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r9 != r11) goto L_0x032b
            r11 = 1
            goto L_0x032c
        L_0x032b:
            r11 = 0
        L_0x032c:
            r8 = r8 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r2
            r12 = 131072(0x20000, float:1.83671E-40)
            if (r11 != r12) goto L_0x0336
            r12 = 1
            goto L_0x0337
        L_0x0336:
            r12 = 0
        L_0x0337:
            r8 = r8 | r12
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r2
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L_0x0342
            r13 = 1
            goto L_0x0343
        L_0x0342:
            r13 = 0
        L_0x0343:
            r8 = r8 | r13
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r13 & r2
            r14 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 != r14) goto L_0x034d
            r14 = 1
            goto L_0x034e
        L_0x034d:
            r14 = 0
        L_0x034e:
            r8 = r8 | r14
            java.lang.Object r14 = r10.D()
            if (r8 != 0) goto L_0x035d
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r14 != r8) goto L_0x0373
        L_0x035d:
            nk.e r14 = new nk.e
            r16 = r14
            r17 = r0
            r18 = r54
            r19 = r53
            r20 = r52
            r21 = r51
            r22 = r55
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r10.u(r14)
        L_0x0373:
            r17 = r14
            nI.l r17 = (nI.C17642l) r17
            r10.P()
            int r8 = r2 >> 3
            r8 = r8 & 14
            r14 = 14156160(0xd80180, float:1.9837005E-38)
            r8 = r8 | r14
            int r14 = LC.C13178b.C2734b.f111820b
            int r14 = r14 << 15
            r30 = r8 | r14
            r31 = 0
            r32 = 7704(0x1e18, float:1.0796E-41)
            r18 = 1
            r19 = 0
            r20 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r16 = r48
            r21 = r3
            r22 = r5
            r29 = r10
            Op.C10872z0.y0(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            float r3 = c2.h.B(r6)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r1, r3)
            r5 = 6
            s0.C5844O.a(r3, r10, r5)
            r3 = -1798919777(0xffffffff94c6a99f, float:-2.0059795E-26)
            r10.W(r3)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            if (r7 != r3) goto L_0x03bf
            r3 = 1
        L_0x03bc:
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x03c1
        L_0x03bf:
            r3 = 0
            goto L_0x03bc
        L_0x03c1:
            if (r9 != r5) goto L_0x03c5
            r5 = 1
            goto L_0x03c6
        L_0x03c5:
            r5 = 0
        L_0x03c6:
            r3 = r3 | r5
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r11 != r5) goto L_0x03cd
            r5 = 1
            goto L_0x03ce
        L_0x03cd:
            r5 = 0
        L_0x03ce:
            r3 = r3 | r5
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r5) goto L_0x03d5
            r5 = 1
            goto L_0x03d6
        L_0x03d5:
            r5 = 0
        L_0x03d6:
            r3 = r3 | r5
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 != r5) goto L_0x03dd
            r5 = 1
            goto L_0x03de
        L_0x03dd:
            r5 = 0
        L_0x03de:
            r3 = r3 | r5
            java.lang.Object r5 = r10.D()
            if (r3 != 0) goto L_0x03ed
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x0403
        L_0x03ed:
            nk.f r5 = new nk.f
            r16 = r5
            r17 = r0
            r18 = r54
            r19 = r53
            r20 = r52
            r21 = r51
            r22 = r55
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r10.u(r5)
        L_0x0403:
            r3 = r5
            nI.l r3 = (nI.C17642l) r3
            r10.P()
            r0 = 6
            int r2 = r2 >> r0
            r2 = r2 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            int r4 = r4 << r0
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r9 = r2 | r4
            r11 = 36
            r4 = 0
            r7 = 1
            r8 = 0
            r2 = r49
            r13 = r44
            r12 = 0
            r5 = r42
            r16 = r6
            r14 = 1
            r6 = r7
            r0 = r34
            r7 = r8
            r12 = 6
            r8 = r10
            r14 = r10
            r10 = r11
            Op.K.g(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r2 = c2.h.B(r16)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r1, r2)
            s0.C5844O.a(r2, r14, r12)
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r2, r3, r4)
            r2 = 12
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r1, r2)
            tK.h r0 = r0.a(r14, r13)
            long r4 = r0.l0()
            r7 = 2
            r8 = 0
            r6 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r3, r4, r6, r7, r8)
            r1 = 0
            s0.C5844O.a(r0, r14, r1)
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x046a
            U0.C4895p.R()
        L_0x046a:
            r12 = r42
            r11 = r43
        L_0x046e:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x049f
            nk.g r13 = new nk.g
            r0 = r13
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r50
            r5 = r51
            r6 = r52
            r7 = r53
            r8 = r54
            r9 = r55
            r10 = r56
            r45 = r13
            r13 = r60
            r46 = r14
            r14 = r61
            r15 = r62
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r45
            r0 = r46
            r0.a(r1)
        L_0x049f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.C11645i.g(java.lang.String, Op.d1, KJ.c, boolean, nI.l, nI.l, nI.l, nI.l, nI.l, nI.l, androidx.compose.ui.d, t0.A, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C5861g gVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, c1 c1Var) {
        C17542s.j(c1Var, "it");
        if (c1Var instanceof c1.a) {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported event: " + c1Var);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unsupported event: " + c1Var, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ComplementListCarousel";
                }
                bVar.a(eVar, str2, false, illegalStateException, str);
            }
        } else if (c1Var instanceof c1.b) {
            lVar.invoke(((c1.b) c1Var).a());
        } else if (c1Var instanceof c1.c) {
            lVar2.invoke(((c1.c) c1Var).a());
        } else if (c1Var instanceof c1.d) {
            c1.d dVar = (c1.d) c1Var;
            lVar3.invoke(new B1(dVar.a(), dVar.b(), Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_CONTEXTUAL_IMAGE));
        } else if (c1Var instanceof c1.e) {
            lVar4.invoke(((c1.e) c1Var).a());
        } else if (c1Var instanceof c1.f) {
            lVar5.invoke(((c1.f) c1Var).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C5861g gVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, c1 c1Var) {
        C17542s.j(c1Var, "it");
        if (c1Var instanceof c1.a) {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported event: " + c1Var);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unsupported event: " + c1Var, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ComplementListCarousel";
                }
                bVar.a(eVar, str2, false, illegalStateException, str);
            }
        } else if (c1Var instanceof c1.b) {
            lVar.invoke(((c1.b) c1Var).a());
        } else if (c1Var instanceof c1.c) {
            lVar2.invoke(((c1.c) c1Var).a());
        } else if (c1Var instanceof c1.d) {
            c1.d dVar = (c1.d) c1Var;
            lVar3.invoke(new B1(dVar.a(), dVar.b(), Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_COMPLIMENT_CAROUSEL));
        } else if (c1Var instanceof c1.e) {
            lVar4.invoke(((c1.e) c1Var).a());
        } else if (c1Var instanceof c1.f) {
            lVar5.invoke(((c1.f) c1Var).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(String str, d1 d1Var, C15987c cVar, boolean z10, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, C17642l lVar6, d dVar, C5934A a10, int i10, int i11, int i12, C4889m mVar, int i13) {
        g(str, d1Var, cVar, z10, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, dVar, a10, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, String str, C15987c cVar) {
        ArrayList arrayList = new ArrayList(C16877v.y(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1) it.next()).p().f());
        }
        lVar.invoke(new A1(str, C15985a.h(arrayList), Interaction$Component.SHOPPING_LIST_DETAILS_INSPIRATION_COMPLIMENT_CAROUSEL));
        return C16807N.f139792a;
    }

    public static final void l(s.d dVar, boolean z10, C17642l<? super String, C16807N> lVar, C17642l<? super B1, C16807N> lVar2, C17642l<? super String, C16807N> lVar3, C17642l<? super String, C16807N> lVar4, C17642l<? super Link, C16807N> lVar5, C17642l<? super A1, C16807N> lVar6, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        s.d dVar2 = dVar;
        C17642l<? super String, C16807N> lVar7 = lVar;
        C17642l<? super B1, C16807N> lVar8 = lVar2;
        C17642l<? super String, C16807N> lVar9 = lVar3;
        C17642l<? super String, C16807N> lVar10 = lVar4;
        C17642l<? super Link, C16807N> lVar11 = lVar5;
        C17642l<? super A1, C16807N> lVar12 = lVar6;
        int i12 = i10;
        C17542s.j(dVar2, "complementListCarousel");
        C17542s.j(lVar7, "onItemClicked");
        C17542s.j(lVar8, "onAddToFavouriteClicked");
        C17542s.j(lVar9, "onColorInfoClicked");
        C17542s.j(lVar10, "onEnergyLabelClick");
        C17542s.j(lVar11, "onLinkClicked");
        C17542s.j(lVar12, "onInspirationCarouselSeen");
        C4889m k10 = mVar.k(-1730042452);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(dVar2) : k10.F(dVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        boolean z11 = z10;
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar7) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar8) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar9) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(lVar11) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar12) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((4793491 & i13) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1730042452, i13, -1, "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.ComplementListCarousel (ComplementListCarousel.kt:66)");
            }
            C4889m mVar3 = k10;
            mVar2 = mVar3;
            j.a(dVar, (d) null, (N<Float>) null, "complement list carousel", c.e(140563773, true, new a(z10, lVar, lVar2, lVar4, lVar3, lVar5, lVar6, C5935B.c(0, 0, k10, 0, 3)), mVar3, 54), mVar3, (i13 & 14) | 27648, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11639c(dVar, z10, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m(s.d dVar, boolean z10, C17642l lVar, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, C17642l lVar6, int i10, C4889m mVar, int i11) {
        l(dVar, z10, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void n(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1017737940);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1017737940, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ui.LoadingSkeleton (ComplementListCarousel.kt:208)");
            }
            d d10 = b.d(aVar, C18030v.f147664a.a(k10, C18030v.f147665b).k0(), (i1) null, 2, (Object) null);
            C5073d dVar3 = C5073d.f18068a;
            C5073d.m g10 = dVar3.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, d10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar4 = d.f18749a;
            float f10 = (float) 16;
            C5844O.a(J.i(aVar4, h.B(f10)), k10, 6);
            float f11 = (float) 24;
            H2.b(TC.e.i(J.g(J.i(aVar4, h.B(f11)), 0.7f)), false, k10, 0, 2);
            float f12 = (float) 32;
            C5844O.a(J.i(aVar4, h.B(f12)), k10, 6);
            f e11 = g.e(h.B((float) 4));
            float f13 = (float) 8;
            H2.b(m1.e.a(C5074e.b(D.m(aVar4, 0.0f, 0.0f, 0.0f, h.B(f13), 7, (Object) null), 1.25f, false, 2, (Object) null), e11), false, k10, 0, 2);
            C5844O.a(J.i(aVar4, h.B(f11)), k10, 6);
            C5073d.f n10 = dVar3.n(h.B(f13));
            d i16 = TC.e.i(aVar4);
            I a14 = C5080k.a(n10, aVar2.k(), k10, 6);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e12 = androidx.compose.ui.c.e(k10, i16);
            C17631a<C4504g> a16 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e12, aVar3.d());
            H2.b(m1.e.a(J.v(aVar4, h.B((float) 100), h.B(f10)), e11), false, k10, 0, 2);
            H2.b(m1.e.a(J.v(aVar4, h.B((float) 150), h.B(f10)), e11), false, k10, 0, 2);
            H2.b(m1.e.a(J.v(aVar4, h.B((float) 80), h.B(f11)), e11), false, k10, 0, 2);
            k10.x();
            C5844O.a(J.i(aVar4, h.B(f12)), k10, 6);
            K.e(true, D.i(aVar4, h.B(f13)), 0, false, k10, 54, 12);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C11644h(dVar2, i10, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o(d dVar, int i10, int i11, C4889m mVar, int i12) {
        n(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
