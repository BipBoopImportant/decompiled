package vk;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import IC.C13026h;
import J1.j;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import L1.i;
import N1.P;
import O0.S0;
import O0.T0;
import O0.V;
import Op.C10828d;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.H2;
import SC.K0;
import SC.K2;
import SC.L2;
import SC.M;
import SC.N;
import SC.U1;
import SC.V1;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.k;
import YH.C16877v;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5749w0;
import p1.i1;
import pk.l;
import pk.s;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import tK.C18013d;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aá\u0001\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0001\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001am\u0010!\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0002*\u00020\u001aH\u0000¢\u0006\u0004\b#\u0010\u001c\u001a3\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b'\u0010(\u001a'\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001dH\u0003¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b.\u0010/\u001ae\u00109\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b9\u0010:\u001a\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=\u001a;\u0010>\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00022\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0003¢\u0006\u0004\b>\u0010?\u001aC\u0010C\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\bC\u0010D\u001a\u001f\u0010G\u001a\u00020\b2\u0006\u0010A\u001a\u00020@2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bG\u0010H\u001aE\u0010N\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I062\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020@2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\bN\u0010O\u001a?\u0010Q\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010L\u001a\u00020@2\u0006\u0010P\u001a\u00020@2\u0006\u0010)\u001a\u00020\u001dH\u0003¢\u0006\u0004\bQ\u0010R\u001aO\u0010S\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0006\u0010L\u001a\u00020@2\u0006\u0010P\u001a\u00020@2\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0003¢\u0006\u0004\bS\u0010T\u001aK\u0010W\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u001a2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\bW\u0010X\u001aA\u0010Z\u001a\u00020\b2\u0006\u0010U\u001a\u00020Y2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0003¢\u0006\u0004\bZ\u0010[\u001a\u0017\u0010\\\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\\\u0010]¨\u0006^²\u0006\u000e\u0010K\u001a\u00020\u00028\n@\nX\u0002"}, d2 = {"Lpk/l;", "item", "", "inStoreModeEnabled", "Lpk/s$o;", "wayfindingProductData", "expandedWidth", "Lkotlin/Function1;", "LXH/N;", "onQuantityChangeClick", "onFindItemClick", "Lkotlin/Function0;", "onItemOptionsClick", "onRemoveClick", "onNotifyWhenInStockClick", "onCheckStockInOtherStoresClick", "onEnergyLabelClick", "onItemClick", "onSeeAlternativesClick", "Landroidx/compose/ui/d;", "modifier", "drawDivider", "H", "(Lpk/l;ZLpk/s$o;ZLnI/l;LnI/l;LnI/a;LnI/l;LnI/a;LnI/l;LnI/a;LnI/l;LnI/a;Landroidx/compose/ui/d;ZLU0/m;III)V", "W", "(Lpk/l;Lpk/s$o;ZLnI/l;LnI/l;LnI/a;LnI/a;LnI/l;LnI/a;LnI/a;LU0/m;I)V", "Lpk/l$a;", "z0", "(Lpk/l$a;)Z", "", "productName", "q0", "(Ljava/lang/String;LU0/m;I)V", "Q", "(Lpk/l;Lpk/s$o;ZLnI/a;LnI/l;LnI/l;LnI/a;LU0/m;I)V", "y0", "productHasDetails", "imageUrl", "name", "U", "(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "itemNo", "aisle", "bin", "d0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "O", "(Landroidx/compose/ui/d;LU0/m;II)V", "description", "Lpk/p;", "price", "isDiscontinued", "isOnlineSellable", "familyAndRegularPriceSameSize", "LKJ/c;", "LIC/e;", "ecoFees", "h0", "(Ljava/lang/String;Ljava/lang/String;Lpk/p;ZZZLKJ/c;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LOp/d$l;", "w0", "()LOp/d$l;", "x0", "(Lpk/p;ZZLKJ/c;LU0/m;I)LKJ/c;", "", "quantity", "wayfindingAvailable", "A", "(ZIZLnI/a;LnI/a;LU0/m;I)V", "LTC/b;", "textStyle", "f0", "(ILTC/b;LU0/m;I)V", "Lpk/l$b;", "items", "isExpanded", "parentQuantity", "onClick", "C", "(LKJ/c;ZILandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "totalPackages", "F", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;LU0/m;I)V", "j0", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "availability", "onNotifyMeClick", "l0", "(Lpk/l$a;LnI/a;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "Lpk/l$a$c;", "M", "(Lpk/l$a$c;LnI/a;LnI/a;LnI/a;LU0/m;I)V", "o0", "(Lpk/l$a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.r0  reason: case insensitive filesystem */
public final class C12169r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$a */
    static final class a implements q<l0.e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104910a;

        a(C17631a<C16807N> aVar) {
            this.f104910a = aVar;
        }

        public final void a(l0.e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(1544308396, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ActionButtons.<anonymous>.<anonymous> (ListProductItem.kt:560)");
            }
            F0.b(C18146a.f148086I6, j.b(ik.c.f98332a, mVar, 0), (androidx.compose.ui.d) null, false, H0.Secondary, G0.Small, (m) null, false, this.f104910a, mVar, 221184, 204);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((l0.e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<l.b> f104911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f104912b;

        b(C15987c<l.b> cVar, int i10) {
            this.f104911a = cVar;
            this.f104912b = i10;
        }

        public final void a(C4889m mVar, int i10) {
            float f10;
            d.a aVar;
            int i11;
            C4889m mVar2 = mVar;
            int i12 = i10;
            if ((i12 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1715246221, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ChildItemsSection.<anonymous> (ListProductItem.kt:612)");
                }
                androidx.compose.ui.d a10 = C5116k1.a(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), "child_products_expanded_content");
                C15987c<l.b> cVar = this.f104911a;
                int i13 = this.f104912b;
                I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a12 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, a10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, a11, aVar2.c());
                F1.c(a14, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                mVar2.W(-1573607365);
                int i14 = 0;
                for (T next : cVar) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C16877v.x();
                    }
                    l.b bVar = (l.b) next;
                    d.a aVar3 = androidx.compose.ui.d.f18749a;
                    float f11 = (float) 16;
                    C5844O.a(J.i(aVar3, c2.h.B(f11)), mVar2, 6);
                    String c10 = bVar.a().c();
                    String b11 = bVar.a().b();
                    if (c10 == null || b11 == null) {
                        f10 = f11;
                        aVar = aVar3;
                        i11 = i14;
                        mVar2.W(-1739478205);
                        C12169r0.F(bVar.d(), bVar.b(), bVar.e(), i13, bVar.f(), bVar.c(), mVar, 0);
                        mVar.P();
                    } else {
                        mVar2.W(-1739947111);
                        String str = c10;
                        f10 = f11;
                        aVar = aVar3;
                        i11 = i14;
                        C12169r0.j0(bVar.d(), bVar.b(), bVar.e(), i13, bVar.f(), bVar.c(), str, b11, mVar, 0);
                        mVar.P();
                    }
                    mVar2.W(-1573572442);
                    if (i11 < C16877v.p(cVar)) {
                        C5844O.a(J.i(aVar, c2.h.B(f10)), mVar2, 6);
                        C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                    }
                    mVar.P();
                    i14 = i15;
                }
                mVar.P();
                mVar.x();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductItemKt$ListProductItem$1$1$1$1", f = "ListProductItem.kt", l = {140}, m = "invokeSuspend")
    /* renamed from: vk.r0$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S0 f104914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(S0 s02, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f104914d = s02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f104914d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104913c;
            if (i10 == 0) {
                y.b(obj);
                S0 s02 = this.f104914d;
                T0 t02 = T0.Settled;
                this.f104913c = 1;
                if (s02.f(t02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductItemKt$ListProductItem$2$1", f = "ListProductItem.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: vk.r0$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S0 f104916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(S0 s02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f104916d = s02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f104916d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104915c;
            if (i10 == 0) {
                y.b(obj);
                S0 s02 = this.f104916d;
                this.f104915c = 1;
                if (s02.e(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$e */
    static final class e implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.o f104918b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f104919c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f104920d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<s.o, C16807N> f104921e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104922f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104923g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f104924h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104925i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104926j;

        e(l lVar, s.o oVar, boolean z10, C17642l<? super l, C16807N> lVar2, C17642l<? super s.o, C16807N> lVar3, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super l, C16807N> lVar4, C17631a<C16807N> aVar3, C17631a<C16807N> aVar4) {
            this.f104917a = lVar;
            this.f104918b = oVar;
            this.f104919c = z10;
            this.f104920d = lVar2;
            this.f104921e = lVar3;
            this.f104922f = aVar;
            this.f104923g = aVar2;
            this.f104924h = lVar4;
            this.f104925i = aVar3;
            this.f104926j = aVar4;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(m10, "$this$ListItemSwipeToDismiss");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1100454586, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductItem.<anonymous>.<anonymous>.<anonymous> (ListProductItem.kt:170)");
                }
                C12169r0.W(this.f104917a, this.f104918b, this.f104919c, this.f104920d, this.f104921e, this.f104922f, this.f104923g, this.f104924h, this.f104925i, this.f104926j, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$f */
    static final class f implements r<C5842M, T0, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f104927a;

        f(l lVar) {
            this.f104927a = lVar;
        }

        public final void a(C5842M m10, T0 t02, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$ListItemSwipeToDismiss");
            C17542s.j(t02, "it");
            if ((i10 & 129) != 128 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(421839028, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductItem.<anonymous>.<anonymous>.<anonymous> (ListProductItem.kt:184)");
                }
                String k10 = this.f104927a.k();
                if (k10 == null) {
                    k10 = "";
                }
                C12169r0.q0(k10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5842M) obj, (T0) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"vk/r0$g", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$g */
    public static final class g implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f104928a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ S0 f104929b;

        public g(Q q10, S0 s02) {
            this.f104928a = q10;
            this.f104929b = s02;
        }

        public void b() {
            QJ.F0 unused = C16314k.d(this.f104928a, (C17168i) null, (T) null, new c(this.f104929b, (C17164e<? super c>) null), 3, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vk.r0$h */
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f104930a;

        static {
            int[] iArr = new int[T0.values().length];
            try {
                iArr[T0.EndToStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f104930a = iArr;
        }
    }

    private static final void A(boolean z10, int i10, boolean z11, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i11) {
        int i12;
        C17631a<C16807N> aVar3 = aVar2;
        int i13 = i11;
        C4889m k10 = mVar.k(-1831404176);
        if ((i13 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i13;
        } else {
            boolean z12 = z10;
            i12 = i13;
        }
        if ((i13 & 48) == 0) {
            i12 |= k10.d(i10) ? 32 : 16;
        } else {
            int i14 = i10;
        }
        boolean z13 = z11;
        if ((i13 & 384) == 0) {
            i12 |= k10.b(z13) ? 256 : 128;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i13 & 3072) == 0) {
            i12 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i13 & 24576) == 0) {
            i12 |= k10.F(aVar3) ? 16384 : 8192;
        }
        if ((i12 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1831404176, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ActionButtons (ListProductItem.kt:547)");
            }
            C5437c.C0386c i15 = C5437c.f24302a.i();
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            I b10 = G.b(C5073d.f18068a.f(), i15, k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar5);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar6.a();
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
            F1.c(a12, b10, aVar6.c());
            F1.c(a12, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b11 = aVar6.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar6.d());
            C5843N n10 = C5843N.f28726a;
            SC.L.b(String.valueOf(i10), (androidx.compose.ui.d) null, z10, N.Secondary, M.Small, false, Integer.valueOf(C18146a.f148021E1), K0.TRAILING, (m) null, aVar, k10, ((i12 << 6) & 896) | 12610560 | ((i12 << 18) & 1879048192), 290);
            C5844O.a(C5842M.e(n10, aVar5, 1.0f, false, 2, (Object) null), k10, 0);
            l0.d.f(n10, z11, (androidx.compose.ui.d) null, androidx.compose.animation.g.o((m0.N) null, 0.0f, 3, (Object) null), androidx.compose.animation.g.q((m0.N) null, 0.0f, 3, (Object) null), (String) null, c1.c.e(1544308396, true, new a(aVar3), k10, 54), k10, 1600518 | ((i12 >> 3) & 112), 18);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12150h0(z10, i10, z11, aVar, aVar2, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(boolean z10, int i10, boolean z11, C17631a aVar, C17631a aVar2, int i11, C4889m mVar, int i12) {
        A(z10, i10, z11, aVar, aVar2, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void C(KJ.C15987c<pk.l.b> r24, boolean r25, int r26, androidx.compose.ui.d r27, nI.C17631a<XH.C16807N> r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r24
            r3 = r26
            r5 = r28
            r6 = r30
            r0 = 258224417(0xf643121, float:1.125073E-29)
            r2 = r29
            U0.m r2 = r2.k(r0)
            r4 = r31 & 1
            if (r4 == 0) goto L_0x0018
            r4 = r6 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r6 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r2.V(r1)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r6
            goto L_0x0028
        L_0x0027:
            r4 = r6
        L_0x0028:
            r7 = r31 & 2
            r8 = 16
            if (r7 == 0) goto L_0x0033
            r4 = r4 | 48
            r13 = r25
            goto L_0x0044
        L_0x0033:
            r7 = r6 & 48
            r13 = r25
            if (r7 != 0) goto L_0x0044
            boolean r7 = r2.b(r13)
            if (r7 == 0) goto L_0x0042
            r7 = 32
            goto L_0x0043
        L_0x0042:
            r7 = r8
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r31 & 4
            if (r7 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r7 = r6 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005b
            boolean r7 = r2.d(r3)
            if (r7 == 0) goto L_0x0058
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r7
        L_0x005b:
            r7 = r31 & 8
            if (r7 == 0) goto L_0x0064
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0061:
            r9 = r27
            goto L_0x0076
        L_0x0064:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0061
            r9 = r27
            boolean r10 = r2.V(r9)
            if (r10 == 0) goto L_0x0073
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r4 = r4 | r10
        L_0x0076:
            r10 = r31 & 16
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x007f
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008e
        L_0x007f:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x008e
            boolean r10 = r2.F(r5)
            if (r10 == 0) goto L_0x008b
            r10 = r11
            goto L_0x008d
        L_0x008b:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x008d:
            r4 = r4 | r10
        L_0x008e:
            r10 = r4 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r10 != r12) goto L_0x00a1
            boolean r10 = r2.l()
            if (r10 != 0) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            r2.L()
            r4 = r9
            goto L_0x0164
        L_0x00a1:
            if (r7 == 0) goto L_0x00a7
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r12 = r7
            goto L_0x00a8
        L_0x00a7:
            r12 = r9
        L_0x00a8:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00b4
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ChildItemsSection (ListProductItem.kt:597)"
            U0.C4895p.S(r0, r4, r7, r9)
        L_0x00b4:
            java.util.Iterator r0 = r24.iterator()
            r7 = 0
            r9 = r7
        L_0x00ba:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x00d1
            java.lang.Object r10 = r0.next()
            pk.l$b r10 = (pk.l.b) r10
            int r14 = r10.e()
            int r10 = r10.f()
            int r14 = r14 * r10
            int r9 = r9 + r14
            goto L_0x00ba
        L_0x00d1:
            int r9 = r9 * r3
            int r0 = Oo.b.f84841y1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r0 = J1.j.c(r0, r9, r2, r7)
            float r8 = (float) r8
            float r16 = c2.h.B(r8)
            SC.r r20 = SC.r.Small
            tK.e r8 = tK.C18014e.f147445a
            float r8 = r8.b()
            tK.v r9 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r9 = r9.a(r2, r10)
            long r9 = r9.m0()
            tK.d r14 = tK.C18013d.f147437a
            A0.f r14 = r14.e()
            androidx.compose.ui.d r9 = n0.C5599e.g(r12, r8, r9, r14)
            r8 = 1904489796(0x71843544, float:1.3093253E30)
            r2.W(r8)
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r4
            r10 = 1
            if (r8 != r11) goto L_0x0111
            r7 = r10
        L_0x0111:
            java.lang.Object r8 = r2.D()
            if (r7 != 0) goto L_0x011f
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0127
        L_0x011f:
            vk.b0 r8 = new vk.b0
            r8.<init>(r5)
            r2.u(r8)
        L_0x0127:
            nI.l r8 = (nI.C17642l) r8
            r2.P()
            vk.r0$b r7 = new vk.r0$b
            r7.<init>(r1, r3)
            r11 = 54
            r14 = 1715246221(0x663c948d, float:2.226363E23)
            c1.a r19 = c1.c.e(r14, r10, r7, r2, r11)
            int r4 = r4 << 12
            r7 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r7
            r7 = 907542528(0x36180000, float:2.2649765E-6)
            r21 = r4 | r7
            r22 = 384(0x180, float:5.38E-43)
            r23 = 3224(0xc98, float:4.518E-42)
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r7 = r0
            r0 = r12
            r12 = r25
            r13 = r20
            r20 = r2
            SC.C13627q.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0163
            U0.C4895p.R()
        L_0x0163:
            r4 = r0
        L_0x0164:
            U0.Y0 r8 = r2.n()
            if (r8 == 0) goto L_0x017f
            vk.d0 r9 = new vk.d0
            r0 = r9
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.C(KJ.c, boolean, int, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17631a aVar, boolean z10) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C15987c cVar, boolean z10, int i10, androidx.compose.ui.d dVar, C17631a aVar, int i11, int i12, C4889m mVar, int i13) {
        C(cVar, z10, i10, dVar, aVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void F(String str, String str2, int i10, int i11, int i12, String str3, C4889m mVar, int i13) {
        int i14;
        String str4 = str;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        String str5 = str3;
        int i18 = i13;
        C4889m k10 = mVar.k(1219849447);
        if ((i18 & 6) == 0) {
            i14 = (k10.V(str4) ? 4 : 2) | i18;
        } else {
            i14 = i18;
        }
        String str6 = str2;
        if ((i18 & 48) == 0) {
            i14 |= k10.V(str6) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i14 |= k10.d(i15) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i14 |= k10.d(i16) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i18 & 24576) == 0) {
            i14 |= k10.d(i17) ? 16384 : 8192;
        }
        if ((196608 & i18) == 0) {
            i14 |= k10.V(str5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i19 = i14;
        if ((74899 & i19) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1219849447, i19, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.FullServeChildProduct (ListProductItem.kt:659)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
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
            I b11 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, aVar);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            androidx.compose.ui.d e12 = C5842M.e(C5843N.f28726a, aVar, 1.0f, false, 2, (Object) null);
            I a17 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, e12);
            C17631a<C4504g> a19 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, a17, aVar3.c());
            F1.c(a20, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b13);
            }
            F1.c(a20, e13, aVar3.d());
            int i20 = i19;
            C4889m mVar2 = k10;
            C13607l.j((i15 * i16) + "x " + str4, C13679b.C2857b.c.f116685a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            C13607l.j(str2, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, ((i20 >> 3) & 14) | 48, 0, 262140);
            k10.x();
            C5844O.a(J.y(aVar, c2.h.B((float) 4)), k10, 6);
            I a21 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a22 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            androidx.compose.ui.d e14 = androidx.compose.ui.c.e(k10, aVar);
            C17631a<C4504g> a23 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a23);
            } else {
                k10.t();
            }
            C4889m a24 = F1.a(k10);
            F1.c(a24, a21, aVar3.c());
            F1.c(a24, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b14 = aVar3.b();
            if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.w(Integer.valueOf(a22), b14);
            }
            F1.c(a24, e14, aVar3.d());
            U1.b(il.g.f98371a.a(str5), (androidx.compose.ui.d) null, j.b(Oo.b.f84567Z, k10, 0), V1.Emphasised, k10, 3072, 2);
            k10.x();
            k10.x();
            k10.W(-1553815719);
            if (i17 > 1) {
                C5844O.a(J.i(aVar, c2.h.B((float) 8)), k10, 6);
                f0(i17, C13679b.a.c.f116681a, k10, ((i20 >> 12) & 14) | 48);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12152i0(str, str2, i10, i11, i12, str3, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G(String str, String str2, int i10, int i11, int i12, String str3, int i13, C4889m mVar, int i14) {
        F(str, str2, i10, i11, i12, str3, mVar, M0.a(i13 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void H(pk.l r38, boolean r39, pk.s.o r40, boolean r41, nI.C17642l<? super pk.l, XH.C16807N> r42, nI.C17642l<? super pk.s.o, XH.C16807N> r43, nI.C17631a<XH.C16807N> r44, nI.C17642l<? super pk.l, XH.C16807N> r45, nI.C17631a<XH.C16807N> r46, nI.C17642l<? super pk.l, XH.C16807N> r47, nI.C17631a<XH.C16807N> r48, nI.C17642l<? super pk.l, XH.C16807N> r49, nI.C17631a<XH.C16807N> r50, androidx.compose.ui.d r51, boolean r52, U0.C4889m r53, int r54, int r55, int r56) {
        /*
            r12 = r38
            r13 = r39
            r14 = r42
            r15 = r43
            r11 = r44
            r10 = r45
            r9 = r46
            r8 = r47
            r7 = r48
            r6 = r49
            r5 = r50
            r4 = r54
            r3 = r55
            r2 = r56
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r21 = 16
            java.lang.String r1 = "item"
            kotlin.jvm.internal.C17542s.j(r12, r1)
            java.lang.String r1 = "onQuantityChangeClick"
            kotlin.jvm.internal.C17542s.j(r14, r1)
            java.lang.String r1 = "onFindItemClick"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            java.lang.String r1 = "onItemOptionsClick"
            kotlin.jvm.internal.C17542s.j(r11, r1)
            java.lang.String r1 = "onRemoveClick"
            kotlin.jvm.internal.C17542s.j(r10, r1)
            java.lang.String r1 = "onNotifyWhenInStockClick"
            kotlin.jvm.internal.C17542s.j(r9, r1)
            java.lang.String r1 = "onCheckStockInOtherStoresClick"
            kotlin.jvm.internal.C17542s.j(r8, r1)
            java.lang.String r1 = "onEnergyLabelClick"
            kotlin.jvm.internal.C17542s.j(r7, r1)
            java.lang.String r1 = "onItemClick"
            kotlin.jvm.internal.C17542s.j(r6, r1)
            java.lang.String r1 = "onSeeAlternativesClick"
            kotlin.jvm.internal.C17542s.j(r5, r1)
            r1 = -523981075(0xffffffffe0c4aeed, float:-1.13380205E20)
            r0 = r53
            U0.m r0 = r0.k(r1)
            r1 = 1
            r24 = r2 & 1
            r25 = 2
            r26 = 4
            r22 = 6
            if (r24 == 0) goto L_0x006b
            r24 = r4 | 6
            goto L_0x007f
        L_0x006b:
            r24 = r4 & 6
            if (r24 != 0) goto L_0x007d
            boolean r24 = r0.F(r12)
            if (r24 == 0) goto L_0x0078
            r24 = r26
            goto L_0x007a
        L_0x0078:
            r24 = r25
        L_0x007a:
            r24 = r4 | r24
            goto L_0x007f
        L_0x007d:
            r24 = r4
        L_0x007f:
            r27 = r2 & 2
            if (r27 == 0) goto L_0x0088
            r24 = r24 | 48
        L_0x0085:
            r1 = r24
            goto L_0x009a
        L_0x0088:
            r27 = r4 & 48
            if (r27 != 0) goto L_0x0085
            boolean r27 = r0.b(r13)
            if (r27 == 0) goto L_0x0095
            r27 = 32
            goto L_0x0097
        L_0x0095:
            r27 = r21
        L_0x0097:
            r24 = r24 | r27
            goto L_0x0085
        L_0x009a:
            r24 = r2 & 4
            if (r24 == 0) goto L_0x00a3
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00a0:
            r13 = r40
            goto L_0x00b6
        L_0x00a3:
            r13 = r4 & 384(0x180, float:5.38E-43)
            if (r13 != 0) goto L_0x00a0
            r13 = r40
            boolean r24 = r0.V(r13)
            if (r24 == 0) goto L_0x00b2
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x00b4
        L_0x00b2:
            r24 = 128(0x80, float:1.794E-43)
        L_0x00b4:
            r1 = r1 | r24
        L_0x00b6:
            r24 = r2 & 8
            if (r24 == 0) goto L_0x00bf
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00bc:
            r13 = r41
            goto L_0x00d2
        L_0x00bf:
            r13 = r4 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x00bc
            r13 = r41
            boolean r24 = r0.b(r13)
            if (r24 == 0) goto L_0x00ce
            r24 = 2048(0x800, float:2.87E-42)
            goto L_0x00d0
        L_0x00ce:
            r24 = 1024(0x400, float:1.435E-42)
        L_0x00d0:
            r1 = r1 | r24
        L_0x00d2:
            r24 = r2 & 16
            if (r24 == 0) goto L_0x00db
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00d8:
            r13 = 32
            goto L_0x00ec
        L_0x00db:
            r13 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x00d8
            boolean r13 = r0.F(r14)
            if (r13 == 0) goto L_0x00e8
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ea
        L_0x00e8:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00ea:
            r1 = r1 | r13
            goto L_0x00d8
        L_0x00ec:
            r24 = r2 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r24 == 0) goto L_0x00f4
        L_0x00f2:
            r1 = r1 | r13
            goto L_0x0103
        L_0x00f4:
            r13 = r13 & r4
            if (r13 != 0) goto L_0x0103
            boolean r13 = r0.F(r15)
            if (r13 == 0) goto L_0x0100
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00f2
        L_0x0100:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00f2
        L_0x0103:
            r13 = r2 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r13 == 0) goto L_0x010e
            r1 = r1 | r24
        L_0x010b:
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x011f
        L_0x010e:
            r13 = r4 & r24
            if (r13 != 0) goto L_0x010b
            boolean r13 = r0.F(r11)
            if (r13 == 0) goto L_0x011b
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x011d
        L_0x011b:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x011d:
            r1 = r1 | r13
            goto L_0x010b
        L_0x011f:
            r11 = r2 & 128(0x80, float:1.794E-43)
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x012a
            r1 = r1 | r24
        L_0x0127:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x013b
        L_0x012a:
            r11 = r4 & r24
            if (r11 != 0) goto L_0x0127
            boolean r11 = r0.F(r10)
            if (r11 == 0) goto L_0x0137
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0139
        L_0x0137:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L_0x0139:
            r1 = r1 | r11
            goto L_0x0127
        L_0x013b:
            r13 = r2 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0142
            r1 = r1 | r17
            goto L_0x0152
        L_0x0142:
            r13 = r4 & r17
            if (r13 != 0) goto L_0x0152
            boolean r13 = r0.F(r9)
            if (r13 == 0) goto L_0x014f
            r13 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0151
        L_0x014f:
            r13 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0151:
            r1 = r1 | r13
        L_0x0152:
            r13 = r2 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x015b
            r1 = r1 | r16
        L_0x0158:
            r13 = 1024(0x400, float:1.435E-42)
            goto L_0x016c
        L_0x015b:
            r13 = r4 & r16
            if (r13 != 0) goto L_0x0158
            boolean r13 = r0.F(r8)
            if (r13 == 0) goto L_0x0168
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x016a
        L_0x0168:
            r13 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x016a:
            r1 = r1 | r13
            goto L_0x0158
        L_0x016c:
            r11 = r2 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0176
            r11 = 6
            r17 = r3 | 6
        L_0x0173:
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0189
        L_0x0176:
            r11 = 6
            r17 = r3 & 6
            if (r17 != 0) goto L_0x0186
            boolean r11 = r0.F(r7)
            if (r11 == 0) goto L_0x0183
            r25 = r26
        L_0x0183:
            r17 = r3 | r25
            goto L_0x0173
        L_0x0186:
            r17 = r3
            goto L_0x0173
        L_0x0189:
            r13 = r2 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0192
            r17 = r17 | 48
        L_0x018f:
            r13 = r17
            goto L_0x01a1
        L_0x0192:
            r13 = r3 & 48
            if (r13 != 0) goto L_0x018f
            boolean r13 = r0.F(r6)
            if (r13 == 0) goto L_0x019e
            r21 = 32
        L_0x019e:
            r17 = r17 | r21
            goto L_0x018f
        L_0x01a1:
            r11 = r2 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01aa
            r13 = r13 | 384(0x180, float:5.38E-43)
        L_0x01a7:
            r11 = 8192(0x2000, float:1.14794E-41)
            goto L_0x01bc
        L_0x01aa:
            r11 = r3 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x01a7
            boolean r11 = r0.F(r5)
            if (r11 == 0) goto L_0x01b7
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x01b9
        L_0x01b7:
            r16 = 128(0x80, float:1.794E-43)
        L_0x01b9:
            r13 = r13 | r16
            goto L_0x01a7
        L_0x01bc:
            r4 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01c7
            r13 = r13 | 3072(0xc00, float:4.305E-42)
        L_0x01c2:
            r11 = r51
        L_0x01c4:
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01db
        L_0x01c7:
            r11 = r3 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x01c2
            r11 = r51
            boolean r16 = r0.V(r11)
            if (r16 == 0) goto L_0x01d6
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x01d8
        L_0x01d6:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x01d8:
            r13 = r13 | r20
            goto L_0x01c4
        L_0x01db:
            r7 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x01e4
            r13 = r13 | 24576(0x6000, float:3.4438E-41)
        L_0x01e1:
            r5 = r52
            goto L_0x01f7
        L_0x01e4:
            r5 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x01e1
            r5 = r52
            boolean r16 = r0.b(r5)
            if (r16 == 0) goto L_0x01f3
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01f5
        L_0x01f3:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x01f5:
            r13 = r13 | r19
        L_0x01f7:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r1 & r16
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0217
            r2 = r13 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r3) goto L_0x0217
            boolean r2 = r0.l()
            if (r2 != 0) goto L_0x020e
            goto L_0x0217
        L_0x020e:
            r0.L()
            r14 = r0
            r15 = r5
            r16 = r11
            goto L_0x0541
        L_0x0217:
            if (r4 == 0) goto L_0x021e
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x0220
        L_0x021e:
            r16 = r11
        L_0x0220:
            if (r7 == 0) goto L_0x0225
            r17 = 1
            goto L_0x0227
        L_0x0225:
            r17 = r5
        L_0x0227:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0235
            java.lang.String r2 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ListProductItem (ListProductItem.kt:116)"
            r3 = -523981075(0xffffffffe0c4aeed, float:-1.13380205E20)
            U0.C4895p.S(r3, r1, r13, r2)
        L_0x0235:
            r2 = -349960842(0xffffffffeb240576, float:-1.9828962E26)
            r0.W(r2)
            java.lang.Object r2 = r0.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x024f
            vk.Q r2 = new vk.Q
            r2.<init>()
            r0.u(r2)
        L_0x024f:
            r25 = r2
            nI.l r25 = (nI.C17642l) r25
            r0.P()
            r27 = 384(0x180, float:5.38E-43)
            r28 = 3
            r23 = 0
            r24 = 0
            r26 = r0
            O0.S0 r11 = O0.R0.c(r23, r24, r25, r26, r27, r28)
            java.lang.Object r2 = r0.D()
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x027d
            dI.j r2 = dI.C17169j.f142968a
            QJ.Q r2 = U0.P.k(r2, r0)
            U0.B r4 = new U0.B
            r4.<init>(r2)
            r0.u(r4)
            r2 = r4
        L_0x027d:
            U0.B r2 = (U0.B) r2
            QJ.Q r2 = r2.a()
            O0.T0 r4 = r11.b()
            r5 = -349954076(0xffffffffeb241fe4, float:-1.9841443E26)
            r0.W(r5)
            boolean r5 = r0.F(r11)
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r1 & r7
            r7 = 8388608(0x800000, float:1.17549435E-38)
            if (r8 != r7) goto L_0x029b
            r7 = 1
            goto L_0x029c
        L_0x029b:
            r7 = 0
        L_0x029c:
            r5 = r5 | r7
            boolean r7 = r0.F(r12)
            r5 = r5 | r7
            boolean r7 = r0.F(r2)
            r5 = r5 | r7
            java.lang.Object r7 = r0.D()
            if (r5 != 0) goto L_0x02b3
            java.lang.Object r5 = r3.a()
            if (r7 != r5) goto L_0x02bb
        L_0x02b3:
            vk.c0 r7 = new vk.c0
            r7.<init>(r11, r10, r12, r2)
            r0.u(r7)
        L_0x02bb:
            nI.l r7 = (nI.C17642l) r7
            r0.P()
            r2 = 0
            U0.P.c(r4, r7, r0, r2)
            r2 = -349933577(0xffffffffeb246ff7, float:-1.9879257E26)
            r0.W(r2)
            U0.I0 r2 = androidx.compose.ui.platform.C5135u0.a()
            java.lang.Object r2 = r0.Q(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x030c
            O0.T0 r2 = r11.b()
            O0.T0 r4 = O0.T0.EndToStart
            if (r2 != r4) goto L_0x030c
            XH.N r2 = XH.C16807N.f139792a
            r4 = -349930266(0xffffffffeb247ce6, float:-1.9885365E26)
            r0.W(r4)
            boolean r4 = r0.F(r11)
            java.lang.Object r5 = r0.D()
            if (r4 != 0) goto L_0x02fa
            java.lang.Object r4 = r3.a()
            if (r5 != r4) goto L_0x0303
        L_0x02fa:
            vk.r0$d r5 = new vk.r0$d
            r4 = 0
            r5.<init>(r11, r4)
            r0.u(r5)
        L_0x0303:
            nI.p r5 = (nI.p) r5
            r0.P()
            r4 = 6
            U0.P.g(r2, r5, r0, r4)
        L_0x030c:
            r0.P()
            int r2 = ik.c.f98310B
            java.lang.String r4 = r38.k()
            if (r4 != 0) goto L_0x0319
            java.lang.String r4 = ""
        L_0x0319:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 0
            java.lang.String r26 = J1.j.c(r2, r4, r0, r5)
            r2 = -349925709(0xffffffffeb248eb3, float:-1.9893771E26)
            r0.W(r2)
            r2 = r13 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r2 != r4) goto L_0x0330
            r2 = 1
            goto L_0x0331
        L_0x0330:
            r2 = 0
        L_0x0331:
            boolean r4 = r0.F(r12)
            r2 = r2 | r4
            java.lang.Object r4 = r0.D()
            if (r2 != 0) goto L_0x0342
            java.lang.Object r2 = r3.a()
            if (r4 != r2) goto L_0x034a
        L_0x0342:
            vk.j0 r4 = new vk.j0
            r4.<init>(r6, r12)
            r0.u(r4)
        L_0x034a:
            r28 = r4
            nI.a r28 = (nI.C17631a) r28
            r0.P()
            r29 = 5
            r30 = 0
            r25 = 0
            r27 = 0
            r24 = r16
            androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r3 = "clickable_content"
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r5 = r4.k()
            r7 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r0, r7)
            int r5 = U0.C4883j.a(r0, r7)
            U0.y r7 = r0.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r0, r2)
            G1.g$a r8 = G1.C4504g.f6515W
            nI.a r6 = r8.a()
            U0.f r19 = r0.m()
            if (r19 != 0) goto L_0x0391
            U0.C4883j.c()
        L_0x0391:
            r0.I()
            boolean r19 = r0.i()
            if (r19 == 0) goto L_0x039e
            r0.p(r6)
            goto L_0x03a1
        L_0x039e:
            r0.t()
        L_0x03a1:
            U0.m r6 = U0.F1.a(r0)
            nI.p r9 = r8.c()
            U0.F1.c(r6, r3, r9)
            nI.p r3 = r8.e()
            U0.F1.c(r6, r7, r3)
            nI.p r3 = r8.b()
            boolean r7 = r6.i()
            if (r7 != 0) goto L_0x03cb
            java.lang.Object r7 = r6.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x03d9
        L_0x03cb:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.u(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.w(r5, r3)
        L_0x03d9:
            nI.p r3 = r8.d()
            U0.F1.c(r6, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            i1.c r2 = r4.o()
            r3 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r3)
            int r3 = U0.C4883j.a(r0, r3)
            U0.y r4 = r0.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r0, r9)
            nI.a r6 = r8.a()
            U0.f r7 = r0.m()
            if (r7 != 0) goto L_0x0406
            U0.C4883j.c()
        L_0x0406:
            r0.I()
            boolean r7 = r0.i()
            if (r7 == 0) goto L_0x0413
            r0.p(r6)
            goto L_0x0416
        L_0x0413:
            r0.t()
        L_0x0416:
            U0.m r6 = U0.F1.a(r0)
            nI.p r7 = r8.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r8.e()
            U0.F1.c(r6, r4, r2)
            nI.p r2 = r8.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0440
            java.lang.Object r4 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r4 != 0) goto L_0x044e
        L_0x0440:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x044e:
            nI.p r2 = r8.d()
            U0.F1.c(r6, r5, r2)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            r8 = r39
            r2 = 1
            if (r8 != r2) goto L_0x04c1
            r1 = 1770374628(0x6985c5e4, float:2.0215206E25)
            r0.W(r1)
            java.lang.String r1 = "swipeable_content"
            androidx.compose.ui.d r29 = androidx.compose.ui.platform.C5116k1.a(r9, r1)
            vl.a r23 = vl.C12186a.NONE
            vk.r0$e r13 = new vk.r0$e
            r7 = r0
            r0 = r13
            r6 = r2
            r5 = 54
            r1 = r38
            r2 = r40
            r3 = r41
            r4 = r42
            r14 = r5
            r5 = r43
            r15 = r6
            r6 = r44
            r51 = r11
            r11 = r7
            r7 = r46
            r8 = r47
            r35 = r9
            r9 = r50
            r10 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1100454586(0x41979aba, float:18.95055)
            c1.a r27 = c1.c.e(r0, r15, r13, r11, r14)
            vk.r0$f r0 = new vk.r0$f
            r0.<init>(r12)
            r1 = 421839028(0x1924c0b4, float:8.517517E-24)
            c1.a r28 = c1.c.e(r1, r15, r0, r11, r14)
            int r0 = O0.S0.f9996d
            int r0 = r0 << 9
            r1 = 1794486(0x1b61b6, float:2.51461E-39)
            r33 = r0 | r1
            r34 = 384(0x180, float:5.38E-43)
            r24 = 0
            r25 = 1
            r30 = 0
            r31 = 0
            r26 = r51
            r32 = r11
            vl.e.d(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r11.P()
            r14 = r11
            goto L_0x0514
        L_0x04c1:
            r11 = r0
            r35 = r9
            r0 = 1771813059(0x699bb8c3, float:2.3532002E25)
            r11.W(r0)
            r0 = r1 & 14
            int r2 = r1 >> 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r0 = r0 | r2
            r2 = 6
            int r1 = r1 >> r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r2
            r0 = r0 | r1
            int r1 = r13 << 18
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r0 = r0 | r1
            int r1 = r13 << 27
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r1 = r1 & r2
            r13 = r0 | r1
            r0 = r38
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r46
            r7 = r47
            r8 = r50
            r9 = r48
            r10 = r11
            r14 = r11
            r11 = r13
            W(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r14.P()
        L_0x0514:
            r14.x()
            r0 = -1868974797(0xffffffff9099b533, float:-6.062704E-29)
            r14.W(r0)
            if (r17 == 0) goto L_0x0530
            java.lang.String r0 = "bottom_divider"
            r1 = r35
            androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r1, r0)
            r7 = 6
            r8 = 6
            r3 = 0
            r4 = 0
            r6 = r14
            SC.C13643u0.c(r2, r3, r4, r6, r7, r8)
        L_0x0530:
            r14.P()
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x053f
            U0.C4895p.R()
        L_0x053f:
            r15 = r17
        L_0x0541:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x057a
            vk.k0 r13 = new vk.k0
            r0 = r13
            r1 = r38
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r12 = r49
            r36 = r13
            r13 = r50
            r37 = r14
            r14 = r16
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.a(r1)
        L_0x057a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.H(pk.l, boolean, pk.s$o, boolean, nI.l, nI.l, nI.a, nI.l, nI.a, nI.l, nI.a, nI.l, nI.a, androidx.compose.ui.d, boolean, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float I(float f10) {
        return f10 * 0.5f;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(l lVar, boolean z10, s.o oVar, boolean z11, C17642l lVar2, C17642l lVar3, C17631a aVar, C17642l lVar4, C17631a aVar2, C17642l lVar5, C17631a aVar3, C17642l lVar6, C17631a aVar4, androidx.compose.ui.d dVar, boolean z12, int i10, int i11, int i12, C4889m mVar, int i13) {
        H(lVar, z10, oVar, z11, lVar2, lVar3, aVar, lVar4, aVar2, lVar5, aVar3, lVar6, aVar4, dVar, z12, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L K(S0 s02, C17642l lVar, l lVar2, Q q10, U0.M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        if (h.f104930a[s02.b().ordinal()] == 1) {
            lVar.invoke(lVar2);
        }
        return new g(q10, s02);
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17642l lVar, l lVar2) {
        lVar.invoke(lVar2);
        return C16807N.f139792a;
    }

    private static final void M(l.a.c cVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10;
        C4889m k10 = mVar.k(533764287);
        if ((i15 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i15;
        } else {
            l.a.c cVar2 = cVar;
            i11 = i15;
        }
        C17631a<C16807N> aVar4 = aVar;
        if ((i15 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        C17631a<C16807N> aVar5 = aVar2;
        if ((i15 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        C17631a<C16807N> aVar6 = aVar3;
        if ((i15 & 3072) == 0) {
            i11 |= k10.F(aVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i16 = i11;
        if ((i16 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(533764287, i16, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.OutOfStockAvailability (ListProductItem.kt:774)");
            }
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar8 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar8.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar7);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar9.a();
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
            F1.c(a13, a10, aVar9.c());
            F1.c(a13, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar9.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-860919495);
            if (cVar.g()) {
                float f10 = (float) 12;
                C5844O.a(J.i(aVar7, c2.h.B(f10)), k10, 6);
                i13 = 0;
                i12 = i16;
                SC.L.b(j.b(Oo.b.f84388H0, k10, 0), D.k(J.h(aVar7, 0.0f, 1, (Object) null), c2.h.B(f10), 0.0f, 2, (Object) null), false, N.Secondary, M.Small, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i16 << 24) & 1879048192) | 27696, 484);
            } else {
                i13 = 0;
                i12 = i16;
            }
            k10.P();
            k10.W(-860902720);
            if (cVar.f()) {
                C5844O.a(J.i(aVar7, c2.h.B((float) 8)), k10, 6);
                i14 = 12;
                SC.L.b(j.b(ik.c.f98330V, k10, i13), D.k(J.h(aVar7, 0.0f, 1, (Object) null), c2.h.B((float) 12), 0.0f, 2, (Object) null), false, N.Secondary, M.Small, false, (Integer) null, (K0) null, (m) null, aVar2, k10, ((i12 << 21) & 1879048192) | 27696, 484);
            } else {
                i14 = 12;
            }
            k10.P();
            if (cVar.d()) {
                k10.W(-917620961);
                float f11 = (float) i14;
                C5844O.a(J.i(aVar7, c2.h.B(f11)), k10, 6);
                C13643u0.c(D.k(J.h(aVar7, 0.0f, 1, (Object) null), c2.h.B(f11), 0.0f, 2, (Object) null), 0.0f, 0, k10, 6, 6);
                androidx.compose.ui.d k11 = D.k(androidx.compose.foundation.d.d(J.h(aVar7, 0.0f, 1, (Object) null), false, (String) null, (i) null, aVar3, 7, (Object) null), c2.h.B(f11), 0.0f, 2, (Object) null);
                I a14 = C5080k.a(dVar.g(), aVar8.k(), k10, 0);
                int a15 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, k11);
                C17631a<C4504g> a16 = aVar9.a();
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
                F1.c(a17, a14, aVar9.c());
                F1.c(a17, s11, aVar9.e());
                p<C4504g, Integer, C16807N> b11 = aVar9.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b11);
                }
                F1.c(a17, e11, aVar9.d());
                C5844O.a(J.i(aVar7, c2.h.B((float) 18)), k10, 6);
                I b12 = G.b(dVar.f(), aVar8.i(), k10, 48);
                int a18 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, aVar7);
                C17631a<C4504g> a19 = aVar9.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a19);
                } else {
                    k10.t();
                }
                C4889m a20 = F1.a(k10);
                F1.c(a20, b12, aVar9.c());
                F1.c(a20, s12, aVar9.e());
                p<C4504g, Integer, C16807N> b13 = aVar9.b();
                if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                    a20.u(Integer.valueOf(a18));
                    a20.w(Integer.valueOf(a18), b13);
                }
                F1.c(a20, e12, aVar9.d());
                C5843N n10 = C5843N.f28726a;
                K2.d(j.b(ik.c.f98329U, k10, 0), L2.Available, (androidx.compose.ui.d) null, false, k10, 48, 12);
                C5844O.a(J.y(aVar7, c2.h.B((float) 8)), k10, 6);
                C5583F.a(J1.e.c(C18146a.f148111K1, k10, 0), (String) null, (androidx.compose.ui.d) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(k10, C18030v.f147665b).H0(), 0, 2, (Object) null), k10, 48, 60);
                k10.x();
                C5844O.a(J.i(aVar7, c2.h.B(f11)), k10, 6);
                k10.x();
                k10.P();
            } else {
                k10.W(-916430964);
                C5844O.a(J.i(aVar7, c2.h.B((float) i14)), k10, 6);
                k10.P();
            }
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12148g0(cVar, aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N N(l.a.c cVar, C17631a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        M(cVar, aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void O(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-588131843);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-588131843, i12, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductDataLoadingSkeleton (ListProductItem.kt:445)");
            }
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, dVar);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar2 = androidx.compose.ui.d.f18749a;
            float f10 = (float) 24;
            androidx.compose.ui.d v10 = J.v(aVar2, c2.h.B((float) 128), c2.h.B(f10));
            C18013d dVar2 = C18013d.f147437a;
            H2.b(m1.e.a(v10, dVar2.e()), false, k10, 0, 2);
            float f11 = (float) 4;
            C5844O.a(J.i(aVar2, c2.h.B(f11)), k10, 6);
            H2.b(m1.e.a(J.v(aVar2, c2.h.B((float) 96), c2.h.B(f10)), dVar2.e()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, c2.h.B(f11)), k10, 6);
            H2.b(m1.e.a(J.v(aVar2, c2.h.B((float) 64), c2.h.B(f10)), dVar2.e()), false, k10, 0, 2);
            C5844O.a(J.i(aVar2, c2.h.B(f11)), k10, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12162n0(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        O(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void Q(pk.l r28, pk.s.o r29, boolean r30, nI.C17631a<XH.C16807N> r31, nI.C17642l<? super pk.l, XH.C16807N> r32, nI.C17642l<? super pk.s.o, XH.C16807N> r33, nI.C17631a<XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r32
            r6 = r33
            r8 = r36
            r0 = -465683526(0xffffffffe43e3bba, float:-1.403674E22)
            r4 = r35
            U0.m r4 = r4.k(r0)
            r7 = 6
            r9 = r8 & 6
            if (r9 != 0) goto L_0x0025
            boolean r9 = r4.F(r1)
            if (r9 == 0) goto L_0x0022
            r9 = 4
            goto L_0x0023
        L_0x0022:
            r9 = 2
        L_0x0023:
            r9 = r9 | r8
            goto L_0x0026
        L_0x0025:
            r9 = r8
        L_0x0026:
            r10 = r8 & 48
            if (r10 != 0) goto L_0x0036
            boolean r10 = r4.V(r2)
            if (r10 == 0) goto L_0x0033
            r10 = 32
            goto L_0x0035
        L_0x0033:
            r10 = 16
        L_0x0035:
            r9 = r9 | r10
        L_0x0036:
            r10 = r8 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0046
            boolean r10 = r4.b(r3)
            if (r10 == 0) goto L_0x0043
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r9 = r9 | r10
        L_0x0046:
            r10 = r8 & 3072(0xc00, float:4.305E-42)
            r13 = r31
            if (r10 != 0) goto L_0x0058
            boolean r10 = r4.F(r13)
            if (r10 == 0) goto L_0x0055
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r9 = r9 | r10
        L_0x0058:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0068
            boolean r10 = r4.F(r5)
            if (r10 == 0) goto L_0x0065
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r9 = r9 | r10
        L_0x0068:
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 & r8
            if (r10 != 0) goto L_0x0079
            boolean r10 = r4.F(r6)
            if (r10 == 0) goto L_0x0076
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0078
        L_0x0076:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x0078:
            r9 = r9 | r10
        L_0x0079:
            r10 = 1572864(0x180000, float:2.204052E-39)
            r10 = r10 & r8
            if (r10 != 0) goto L_0x008e
            r10 = r34
            boolean r16 = r4.F(r10)
            if (r16 == 0) goto L_0x0089
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x008b
        L_0x0089:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x008b:
            r9 = r9 | r16
            goto L_0x0090
        L_0x008e:
            r10 = r34
        L_0x0090:
            r16 = 599187(0x92493, float:8.3964E-40)
            r11 = r9 & r16
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r11 != r12) goto L_0x00a6
            boolean r11 = r4.l()
            if (r11 != 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            r4.L()
            goto L_0x03ed
        L_0x00a6:
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x00b2
            r11 = -1
            java.lang.String r12 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductDetails (ListProductItem.kt:324)"
            U0.C4895p.S(r0, r9, r11, r12)
        L_0x00b2:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r11 = 0
            r12 = 0
            r7 = 1
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.h(r0, r11, r7, r12)
            androidx.compose.foundation.layout.d r23 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r12 = r23.f()
            i1.c$a r24 = i1.C5437c.f24302a
            i1.c$c r7 = r24.l()
            r15 = 0
            E1.I r7 = androidx.compose.foundation.layout.G.b(r12, r7, r4, r15)
            int r12 = U0.C4883j.a(r4, r15)
            U0.y r14 = r4.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r4, r11)
            G1.g$a r25 = G1.C4504g.f6515W
            nI.a r15 = r25.a()
            U0.f r17 = r4.m()
            if (r17 != 0) goto L_0x00e7
            U0.C4883j.c()
        L_0x00e7:
            r4.I()
            boolean r17 = r4.i()
            if (r17 == 0) goto L_0x00f4
            r4.p(r15)
            goto L_0x00f7
        L_0x00f4:
            r4.t()
        L_0x00f7:
            U0.m r15 = U0.F1.a(r4)
            nI.p r8 = r25.c()
            U0.F1.c(r15, r7, r8)
            nI.p r7 = r25.e()
            U0.F1.c(r15, r14, r7)
            nI.p r7 = r25.b()
            boolean r8 = r15.i()
            if (r8 != 0) goto L_0x0121
            java.lang.Object r8 = r15.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x012f
        L_0x0121:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r15.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r15.w(r8, r7)
        L_0x012f:
            nI.p r7 = r25.d()
            U0.F1.c(r15, r11, r7)
            s0.N r7 = s0.C5843N.f28726a
            java.lang.String r8 = r28.i()
            java.lang.String r11 = r28.k()
            java.lang.String r26 = ""
            if (r11 != 0) goto L_0x0146
            r11 = r26
        L_0x0146:
            java.lang.String r12 = r28.k()
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            if (r3 == 0) goto L_0x0157
            r14 = 1050253722(0x3e99999a, float:0.3)
        L_0x0154:
            r19 = r14
            goto L_0x015b
        L_0x0157:
            r14 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x0154
        L_0x015b:
            r21 = 2
            r22 = 0
            r20 = 0
            r17 = r7
            r18 = r0
            androidx.compose.ui.d r14 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            r15 = 0
            r17 = 0
            r27 = r9
            r9 = r12
            r10 = r8
            r8 = 131072(0x20000, float:1.83671E-40)
            r8 = 16384(0x4000, float:2.2959E-41)
            r12 = r14
            r13 = r4
            r14 = r15
            r8 = 16
            r15 = r17
            U(r9, r10, r11, r12, r13, r14, r15)
            float r8 = (float) r8
            float r9 = c2.h.B(r8)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.y(r0, r9)
            r10 = 6
            s0.C5844O.a(r9, r4, r10)
            r19 = 1065353216(0x3f800000, float:1.0)
            r17 = r7
            androidx.compose.ui.d r9 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d$m r10 = r23.g()
            i1.c$b r11 = r24.k()
            r12 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r11, r4, r12)
            int r11 = U0.C4883j.a(r4, r12)
            U0.y r12 = r4.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r4, r9)
            nI.a r13 = r25.a()
            U0.f r14 = r4.m()
            if (r14 != 0) goto L_0x01b9
            U0.C4883j.c()
        L_0x01b9:
            r4.I()
            boolean r14 = r4.i()
            if (r14 == 0) goto L_0x01c6
            r4.p(r13)
            goto L_0x01c9
        L_0x01c6:
            r4.t()
        L_0x01c9:
            U0.m r13 = U0.F1.a(r4)
            nI.p r14 = r25.c()
            U0.F1.c(r13, r10, r14)
            nI.p r10 = r25.e()
            U0.F1.c(r13, r12, r10)
            nI.p r10 = r25.b()
            boolean r12 = r13.i()
            if (r12 != 0) goto L_0x01f3
            java.lang.Object r12 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r14)
            if (r12 != 0) goto L_0x0201
        L_0x01f3:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13.u(r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13.w(r11, r10)
        L_0x0201:
            nI.p r10 = r25.d()
            U0.F1.c(r13, r9, r10)
            s0.h r9 = s0.C5862h.f28810a
            androidx.compose.foundation.layout.d$e r9 = r23.f()
            i1.c$c r10 = r24.l()
            r11 = 0
            E1.I r9 = androidx.compose.foundation.layout.G.b(r9, r10, r4, r11)
            int r10 = U0.C4883j.a(r4, r11)
            U0.y r11 = r4.s()
            androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r4, r0)
            nI.a r13 = r25.a()
            U0.f r14 = r4.m()
            if (r14 != 0) goto L_0x0230
            U0.C4883j.c()
        L_0x0230:
            r4.I()
            boolean r14 = r4.i()
            if (r14 == 0) goto L_0x023d
            r4.p(r13)
            goto L_0x0240
        L_0x023d:
            r4.t()
        L_0x0240:
            U0.m r13 = U0.F1.a(r4)
            nI.p r14 = r25.c()
            U0.F1.c(r13, r9, r14)
            nI.p r9 = r25.e()
            U0.F1.c(r13, r11, r9)
            nI.p r9 = r25.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x026a
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0278
        L_0x026a:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.w(r10, r9)
        L_0x0278:
            nI.p r9 = r25.d()
            U0.F1.c(r13, r12, r9)
            java.lang.String r9 = r28.k()
            if (r9 == 0) goto L_0x02d9
            r9 = 1832868442(0x6d3f5a5a, float:3.701304E27)
            r4.W(r9)
            java.lang.String r9 = r28.k()
            java.lang.String r10 = r28.f()
            pk.p r11 = r28.l()
            boolean r12 = r28.o()
            boolean r13 = r28.d()
            KJ.c r14 = r28.g()
            KJ.f r15 = KJ.C15985a.l(r14)
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r7
            r18 = r0
            androidx.compose.ui.d r7 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            java.lang.String r14 = "product_price_data"
            androidx.compose.ui.d r17 = androidx.compose.ui.platform.C5116k1.a(r7, r14)
            boolean r14 = r28.h()
            int r7 = IC.C13023e.f110931a
            int r7 = r7 << 18
            int r16 = r27 << 3
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r16 & r18
            r19 = r7 | r16
            r16 = r34
            r18 = r4
            h0(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.P()
            r15 = 0
            goto L_0x02fc
        L_0x02d9:
            r9 = 1833603111(0x6d4a9027, float:3.91814E27)
            r4.W(r9)
            r21 = 2
            r22 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r17 = r7
            r18 = r0
            androidx.compose.ui.d r7 = s0.C5842M.e(r17, r18, r19, r20, r21, r22)
            java.lang.String r9 = "product_data_loading"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r7, r9)
            r15 = 0
            O(r7, r4, r15, r15)
            r4.P()
        L_0x02fc:
            int r9 = uK.C18146a.f148098J3
            int r7 = ik.c.f98333b
            java.lang.String r10 = r28.k()
            if (r10 != 0) goto L_0x0307
            goto L_0x0309
        L_0x0307:
            r26 = r10
        L_0x0309:
            java.lang.Object[] r10 = new java.lang.Object[]{r26}
            java.lang.String r10 = J1.j.c(r7, r10, r4, r15)
            SC.H0 r13 = SC.H0.Tertiary
            float r7 = c2.h.B(r8)
            r11 = -20
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.A.b(r0, r7, r11)
            SC.G0 r14 = SC.G0.Small
            int r7 = r27 << 15
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r12
            r12 = 221568(0x36180, float:3.10483E-40)
            r19 = r7 | r12
            r20 = 200(0xc8, float:2.8E-43)
            r12 = 0
            r7 = 0
            r16 = 0
            r21 = r15
            r15 = r7
            r17 = r31
            r18 = r4
            SC.F0.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.x()
            float r7 = c2.h.B(r8)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r7)
            r7 = 6
            s0.C5844O.a(r0, r4, r7)
            java.lang.String r0 = r28.k()
            if (r0 == 0) goto L_0x0355
            r9 = 1
            goto L_0x0357
        L_0x0355:
            r9 = r21
        L_0x0357:
            int r10 = r28.m()
            if (r2 == 0) goto L_0x0369
            pk.l$a r0 = r28.c()
            boolean r0 = y0(r0)
            if (r0 == 0) goto L_0x0369
            r11 = 1
            goto L_0x036b
        L_0x0369:
            r11 = r21
        L_0x036b:
            r0 = 1693829402(0x64f5c91a, float:3.6271546E22)
            r4.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r27 & r0
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r7) goto L_0x037c
            r15 = 1
            goto L_0x037e
        L_0x037c:
            r15 = r21
        L_0x037e:
            boolean r0 = r4.F(r1)
            r0 = r0 | r15
            java.lang.Object r7 = r4.D()
            if (r0 != 0) goto L_0x0391
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x0399
        L_0x0391:
            vk.W r7 = new vk.W
            r7.<init>(r5, r1)
            r4.u(r7)
        L_0x0399:
            r12 = r7
            nI.a r12 = (nI.C17631a) r12
            r4.P()
            r0 = 1693831562(0x64f5d18a, float:3.627641E22)
            r4.W(r0)
            r0 = r27 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r0 != r7) goto L_0x03ad
            r15 = 1
            goto L_0x03af
        L_0x03ad:
            r15 = r21
        L_0x03af:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r27 & r0
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r7) goto L_0x03b9
            r7 = 1
            goto L_0x03bb
        L_0x03b9:
            r7 = r21
        L_0x03bb:
            r0 = r15 | r7
            java.lang.Object r7 = r4.D()
            if (r0 != 0) goto L_0x03cb
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x03d3
        L_0x03cb:
            vk.X r7 = new vk.X
            r7.<init>(r2, r6)
            r4.u(r7)
        L_0x03d3:
            r13 = r7
            nI.a r13 = (nI.C17631a) r13
            r4.P()
            r15 = 0
            r14 = r4
            A(r9, r10, r11, r12, r13, r14, r15)
            r4.x()
            r4.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03ed
            U0.C4895p.R()
        L_0x03ed:
            U0.Y0 r9 = r4.n()
            if (r9 == 0) goto L_0x040c
            vk.Y r10 = new vk.Y
            r0 = r10
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x040c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.Q(pk.l, pk.s$o, boolean, nI.a, nI.l, nI.l, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17642l lVar, l lVar2) {
        lVar.invoke(lVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(s.o oVar, C17642l lVar) {
        if (oVar != null) {
            lVar.invoke(oVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(l lVar, s.o oVar, boolean z10, C17631a aVar, C17642l lVar2, C17642l lVar3, C17631a aVar2, int i10, C4889m mVar, int i11) {
        Q(lVar, oVar, z10, aVar, lVar2, lVar3, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void U(boolean r24, java.lang.String r25, java.lang.String r26, androidx.compose.ui.d r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r24
            r2 = r25
            r0 = r26
            r15 = r29
            java.lang.String r3 = "name"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 1090397637(0x40fe25c5, float:7.9421105)
            r4 = r28
            U0.m r14 = r4.k(r3)
            r4 = r30 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001e
            r4 = r15 | 6
            goto L_0x002e
        L_0x001e:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x002d
            boolean r4 = r14.b(r1)
            if (r4 == 0) goto L_0x002a
            r4 = 4
            goto L_0x002b
        L_0x002a:
            r4 = r5
        L_0x002b:
            r4 = r4 | r15
            goto L_0x002e
        L_0x002d:
            r4 = r15
        L_0x002e:
            r6 = r30 & 2
            if (r6 == 0) goto L_0x0035
            r4 = r4 | 48
            goto L_0x0045
        L_0x0035:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0045
            boolean r6 = r14.V(r2)
            if (r6 == 0) goto L_0x0042
            r6 = 32
            goto L_0x0044
        L_0x0042:
            r6 = 16
        L_0x0044:
            r4 = r4 | r6
        L_0x0045:
            r6 = r30 & 4
            if (r6 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x004c:
            r6 = r15 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x005c
            boolean r6 = r14.V(r0)
            if (r6 == 0) goto L_0x0059
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r6
        L_0x005c:
            r6 = r30 & 8
            if (r6 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r7 = r27
            goto L_0x0077
        L_0x0065:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0062
            r7 = r27
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x0074
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r4 = r4 | r8
        L_0x0077:
            r8 = r4 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x008b
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r14.L()
            r4 = r7
            r8 = r14
            goto L_0x014a
        L_0x008b:
            if (r6 == 0) goto L_0x0091
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r13 = r6
            goto L_0x0092
        L_0x0091:
            r13 = r7
        L_0x0092:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x009e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductImage (ListProductItem.kt:390)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x009e:
            r3 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            if (r1 == 0) goto L_0x011f
            r8 = 1838949589(0x6d9c24d5, float:6.0405236E27)
            r14.W(r8)
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            A0.f r8 = A0.g.e(r8)
            if (r2 != 0) goto L_0x00ba
            java.lang.String r9 = ""
            goto L_0x00bb
        L_0x00ba:
            r9 = r2
        L_0x00bb:
            LC.b$b r10 = new LC.b$b
            gs.h$a r11 = gs.h.a.XXXS
            r10.<init>(r11)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.C5074e.b(r13, r6, r7, r5, r3)
            androidx.compose.ui.d r16 = m1.e.a(r3, r8)
            tK.v r3 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r14, r5)
            long r17 = r3.F0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            E1.k$a r3 = E1.C4478k.f5915a
            E1.k r8 = r3.a()
            int r3 = r4 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r4
            int r4 = LC.C13178b.C2734b.f111820b
            int r4 = r4 << 9
            r16 = r3 | r4
            r17 = 0
            r18 = 4048(0xfd0, float:5.672E-42)
            r7 = 0
            r11 = 0
            r12 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r3 = r9
            r4 = r26
            r6 = r10
            r9 = r11
            r10 = r12
            r11 = r19
            r12 = r20
            r23 = r13
            r13 = r21
            r27 = r14
            r14 = r22
            r15 = r27
            LC.h.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r27.P()
            r8 = r27
            r4 = r23
            goto L_0x0141
        L_0x011f:
            r23 = r13
            r27 = r14
            r4 = 1839413225(0x6da337e9, float:6.314206E27)
            r8 = r27
            r8.W(r4)
            r4 = r23
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.C5074e.b(r4, r6, r7, r5, r3)
            tK.d r6 = tK.C18013d.f147437a
            A0.f r6 = r6.e()
            androidx.compose.ui.d r3 = m1.e.a(r3, r6)
            SC.H2.b(r3, r7, r8, r7, r5)
            r8.P()
        L_0x0141:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x014a
            U0.C4895p.R()
        L_0x014a:
            U0.Y0 r7 = r8.n()
            if (r7 == 0) goto L_0x0163
            vk.o0 r8 = new vk.o0
            r0 = r8
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r29
            r6 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.U(boolean, java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N V(boolean z10, String str, String str2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        U(z10, str, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void W(pk.l r27, pk.s.o r28, boolean r29, nI.C17642l<? super pk.l, XH.C16807N> r30, nI.C17642l<? super pk.s.o, XH.C16807N> r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, nI.C17642l<? super pk.l, XH.C16807N> r34, nI.C17631a<XH.C16807N> r35, nI.C17631a<XH.C16807N> r36, U0.C4889m r37, int r38) {
        /*
            r9 = r27
            r10 = r34
            r11 = r38
            r12 = 48
            r0 = -1515543165(0xffffffffa5aaa583, float:-2.9602454E-16)
            r1 = r37
            U0.m r13 = r1.k(r0)
            r14 = 6
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0021
            boolean r1 = r13.F(r9)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            r1 = r1 | r11
            goto L_0x0022
        L_0x0021:
            r1 = r11
        L_0x0022:
            r3 = r11 & 48
            r8 = r28
            if (r3 != 0) goto L_0x0034
            boolean r3 = r13.V(r8)
            if (r3 == 0) goto L_0x0031
            r3 = 32
            goto L_0x0033
        L_0x0031:
            r3 = 16
        L_0x0033:
            r1 = r1 | r3
        L_0x0034:
            r3 = r11 & 384(0x180, float:5.38E-43)
            r7 = r29
            if (r3 != 0) goto L_0x0046
            boolean r3 = r13.b(r7)
            if (r3 == 0) goto L_0x0043
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0045
        L_0x0043:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0045:
            r1 = r1 | r3
        L_0x0046:
            r3 = r11 & 3072(0xc00, float:4.305E-42)
            r6 = r30
            if (r3 != 0) goto L_0x0058
            boolean r3 = r13.F(r6)
            if (r3 == 0) goto L_0x0055
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r1 = r1 | r3
        L_0x0058:
            r3 = r11 & 24576(0x6000, float:3.4438E-41)
            r5 = r31
            if (r3 != 0) goto L_0x006a
            boolean r3 = r13.F(r5)
            if (r3 == 0) goto L_0x0067
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0069
        L_0x0067:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0069:
            r1 = r1 | r3
        L_0x006a:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r11
            if (r3 != 0) goto L_0x007f
            r3 = r32
            boolean r16 = r13.F(r3)
            if (r16 == 0) goto L_0x007a
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007c
        L_0x007a:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x007c:
            r1 = r1 | r16
            goto L_0x0081
        L_0x007f:
            r3 = r32
        L_0x0081:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r11 & r16
            r12 = r33
            if (r16 != 0) goto L_0x0096
            boolean r17 = r13.F(r12)
            if (r17 == 0) goto L_0x0092
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0094
        L_0x0092:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x0094:
            r1 = r1 | r17
        L_0x0096:
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r17 = r11 & r17
            if (r17 != 0) goto L_0x00a9
            boolean r17 = r13.F(r10)
            if (r17 == 0) goto L_0x00a5
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00a7
        L_0x00a5:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00a7:
            r1 = r1 | r17
        L_0x00a9:
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r17 = r11 & r17
            r15 = r35
            if (r17 != 0) goto L_0x00be
            boolean r18 = r13.F(r15)
            if (r18 == 0) goto L_0x00ba
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00bc
        L_0x00ba:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00bc:
            r1 = r1 | r18
        L_0x00be:
            r18 = 805306368(0x30000000, float:4.656613E-10)
            r18 = r11 & r18
            r14 = r36
            if (r18 != 0) goto L_0x00d3
            boolean r19 = r13.F(r14)
            if (r19 == 0) goto L_0x00cf
            r19 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00d1
        L_0x00cf:
            r19 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00d1:
            r1 = r1 | r19
        L_0x00d3:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r1 & r19
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r2) goto L_0x00e9
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x00e4
            goto L_0x00e9
        L_0x00e4:
            r13.L()
            goto L_0x0366
        L_0x00e9:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00f5
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductItemContent (ListProductItem.kt:227)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x00f5:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r13, r2)
            long r22 = r0.k0()
            r25 = 2
            r26 = 0
            r24 = 0
            r21 = r4
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r21, r22, r24, r25, r26)
            r2 = 24
            float r2 = (float) r2
            float r3 = c2.h.B(r2)
            r21 = r2
            r2 = 0
            r5 = 0
            r6 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r0, r3, r2, r6, r5)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$b r3 = r3.k()
            r6 = 0
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r13, r6)
            int r3 = U0.C4883j.a(r13, r6)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r6 = r19.a()
            U0.f r23 = r13.m()
            if (r23 != 0) goto L_0x014b
            U0.C4883j.c()
        L_0x014b:
            r13.I()
            boolean r23 = r13.i()
            if (r23 == 0) goto L_0x0158
            r13.p(r6)
            goto L_0x015b
        L_0x0158:
            r13.t()
        L_0x015b:
            U0.m r6 = U0.F1.a(r13)
            nI.p r7 = r19.c()
            U0.F1.c(r6, r2, r7)
            nI.p r2 = r19.e()
            U0.F1.c(r6, r5, r2)
            nI.p r2 = r19.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x0185
            java.lang.Object r5 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x0193
        L_0x0185:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r2)
        L_0x0193:
            nI.p r2 = r19.d()
            U0.F1.c(r6, r0, r2)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 32
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r4, r0)
            r2 = 6
            s0.C5844O.a(r0, r13, r2)
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            int r3 = r1 >> 6
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 << 3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r1 >> 9
            r3 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r3
            r19 = r0 | r2
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r3 = r32
            r7 = r4
            r4 = r30
            r5 = r31
            r11 = 0
            r6 = r36
            r11 = r7
            r7 = r13
            r8 = r19
            Q(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            float r0 = c2.h.B(r21)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r11, r0)
            r1 = 6
            s0.C5844O.a(r0, r13, r1)
            r0 = 347737102(0x14ba0c0e, float:1.8785955E-26)
            r13.W(r0)
            java.lang.String r0 = r27.k()
            r8 = 1
            if (r0 == 0) goto L_0x0248
            pk.l$a r1 = r27.c()
            r0 = 347743596(0x14ba256c, float:1.879596E-26)
            r13.W(r0)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r20 & r0
            r2 = 8388608(0x800000, float:1.17549435E-38)
            if (r0 != r2) goto L_0x020a
            r6 = r8
            goto L_0x020b
        L_0x020a:
            r6 = 0
        L_0x020b:
            boolean r0 = r13.F(r9)
            r0 = r0 | r6
            java.lang.Object r2 = r13.D()
            if (r0 != 0) goto L_0x021e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0226
        L_0x021e:
            vk.S r2 = new vk.S
            r2.<init>(r10, r9)
            r13.u(r2)
        L_0x0226:
            r3 = r2
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            java.lang.String r0 = "stock_info"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r11, r0)
            int r0 = r20 >> 15
            r2 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r7 = r2 | r0
            r0 = 0
            r2 = r33
            r4 = r35
            r6 = r13
            r9 = r8
            r8 = r0
            l0(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0249
        L_0x0248:
            r9 = r8
        L_0x0249:
            r13.P()
            KJ.c r0 = r27.e()
            int r0 = r0.size()
            if (r0 <= r9) goto L_0x02e2
            r0 = -2104551105(0xffffffff828f193f, float:-2.1026452E-37)
            r13.W(r0)
            pk.l$a r0 = r27.c()
            boolean r0 = z0(r0)
            if (r0 == 0) goto L_0x02de
            float r0 = c2.h.B(r21)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r11, r0)
            r1 = 6
            s0.C5844O.a(r0, r13, r1)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 347758393(0x14ba5f39, float:1.8818759E-26)
            r13.W(r0)
            java.lang.Object r0 = r13.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r2 = r8.a()
            if (r0 != r2) goto L_0x028f
            vk.T r0 = new vk.T
            r0.<init>()
            r13.u(r0)
        L_0x028f:
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r13.P()
            r6 = 3072(0xc00, float:4.305E-42)
            r7 = 6
            r2 = 0
            r3 = 0
            r5 = r13
            java.lang.Object r0 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            U0.r0 r0 = (U0.C4899r0) r0
            KJ.c r1 = r27.e()
            boolean r2 = Z(r0)
            int r3 = r27.m()
            java.lang.String r4 = "child_products_section"
            androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r11, r4)
            r5 = 347765852(0x14ba7c5c, float:1.8830252E-26)
            r13.W(r5)
            boolean r5 = r13.V(r0)
            java.lang.Object r6 = r13.D()
            if (r5 != 0) goto L_0x02c9
            java.lang.Object r5 = r8.a()
            if (r6 != r5) goto L_0x02d1
        L_0x02c9:
            vk.U r6 = new vk.U
            r6.<init>(r0)
            r13.u(r6)
        L_0x02d1:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r13.P()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 0
            r6 = r13
            C(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x02de:
            r13.P()
            goto L_0x034e
        L_0x02e2:
            r0 = -2103967313(0xffffffff829801af, float:-2.233536E-37)
            r13.W(r0)
            pk.l$a r0 = r27.c()
            java.lang.String r0 = r0.c()
            pk.l$a r1 = r27.c()
            java.lang.String r1 = r1.b()
            if (r0 == 0) goto L_0x02fe
            if (r1 == 0) goto L_0x02fe
            r6 = r9
            goto L_0x02ff
        L_0x02fe:
            r6 = 0
        L_0x02ff:
            r2 = 347776846(0x14baa74e, float:1.884719E-26)
            r13.W(r2)
            if (r6 == 0) goto L_0x0321
            float r2 = c2.h.B(r21)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r11, r2)
            r3 = 6
            s0.C5844O.a(r2, r13, r3)
            java.lang.String r2 = r27.j()
            kotlin.jvm.internal.C17542s.g(r1)
            kotlin.jvm.internal.C17542s.g(r0)
            r3 = 0
            d0(r2, r1, r0, r13, r3)
        L_0x0321:
            r13.P()
            int r0 = r27.n()
            if (r0 <= r9) goto L_0x034b
            if (r6 == 0) goto L_0x0334
            r0 = 16
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            goto L_0x0338
        L_0x0334:
            float r0 = c2.h.B(r21)
        L_0x0338:
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r11, r0)
            r1 = 0
            s0.C5844O.a(r0, r13, r1)
            int r0 = r27.n()
            TC.b$a$b r1 = TC.C13679b.a.C2856b.f116680a
            r2 = 48
            f0(r0, r1, r13, r2)
        L_0x034b:
            r13.P()
        L_0x034e:
            float r0 = c2.h.B(r21)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r11, r0)
            r1 = 6
            s0.C5844O.a(r0, r13, r1)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0366
            U0.C4895p.R()
        L_0x0366:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x038c
            vk.V r11 = new vk.V
            r0 = r11
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r12 = r11
            r11 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.a(r12)
        L_0x038c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.W(pk.l, pk.s$o, boolean, nI.l, nI.l, nI.a, nI.a, nI.l, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C17642l lVar, l lVar2) {
        lVar.invoke(lVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 Y() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean Z(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void a0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C4899r0 r0Var) {
        a0(r0Var, !Z(r0Var));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(l lVar, s.o oVar, boolean z10, C17642l lVar2, C17642l lVar3, C17631a aVar, C17631a aVar2, C17642l lVar4, C17631a aVar3, C17631a aVar4, int i10, C4889m mVar, int i11) {
        W(lVar, oVar, z10, lVar2, lVar3, aVar, aVar2, lVar4, aVar3, aVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void d0(String str, String str2, String str3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i12 = i10;
        C4889m k10 = mVar.k(-1440694561);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str5) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(str6) ? 256 : 128;
        }
        int i13 = i11;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1440694561, i13, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductLocation (ListProductItem.kt:417)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            C5073d dVar = C5073d.f18068a;
            C5073d.e f10 = dVar.f();
            C5437c.a aVar2 = C5437c.f24302a;
            I b10 = G.b(f10, aVar2.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
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
            F1.c(a12, b10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            androidx.compose.ui.d e11 = C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null);
            I a13 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, e11);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, a13, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e12, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            C13607l.j(j.b(Oo.b.f84567Z, k10, 0), C13679b.a.c.f116681a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262140);
            C5844O.a(J.i(aVar, c2.h.B((float) 8)), k10, 6);
            U1.b(il.g.f98371a.a(str4), (androidx.compose.ui.d) null, (String) null, (V1) null, k10, 0, 14);
            k10.x();
            C5844O.a(J.y(aVar, c2.h.B((float) 4)), k10, 6);
            androidx.compose.ui.d c10 = n10.c(aVar, aVar2.a());
            I b13 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a17 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, c10);
            C17631a<C4504g> a18 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a18);
            } else {
                k10.t();
            }
            C4889m a19 = F1.a(k10);
            F1.c(a19, b13, aVar3.c());
            F1.c(a19, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b14 = aVar3.b();
            if (a19.i() || !C17542s.e(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.w(Integer.valueOf(a17), b14);
            }
            F1.c(a19, e13, aVar3.d());
            String b15 = j.b(Oo.b.f84537W, k10, 0);
            d.a aVar4 = aVar;
            V1 v12 = V1.Subtle;
            mVar2 = k10;
            U1.b(str2, (androidx.compose.ui.d) null, b15, v12, k10, ((i13 >> 3) & 14) | 3072, 2);
            C5844O.a(J.y(aVar4, c2.h.B((float) 12)), mVar2, 6);
            U1.b(str3, (androidx.compose.ui.d) null, j.b(Oo.b.f84780s4, mVar2, 0), v12, mVar2, ((i13 >> 6) & 14) | 3072, 2);
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C12144e0(str4, str5, str6, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(String str, String str2, String str3, int i10, C4889m mVar, int i11) {
        d0(str, str2, str3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f0(int i10, C13679b bVar, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13 = i10;
        C13679b bVar2 = bVar;
        C17542s.j(bVar2, "textStyle");
        C4889m k10 = mVar.k(1610563474);
        if ((i11 & 6) == 0) {
            i12 = i11 | (k10.d(i13) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.V(bVar2) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1610563474, i14, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductPackagesLabel (ListProductItem.kt:574)");
            }
            C5437c.C0386c i15 = C5437c.f24302a.i();
            d.a aVar = androidx.compose.ui.d.f18749a;
            I b10 = G.b(C5073d.f18068a.f(), i15, k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            C5583F.a(J1.e.c(C18146a.f148220R5, k10, 0), (String) null, J.t(aVar, c2.h.B((float) 18)), (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(C5749w0.f27365b, C18030v.f147664a.a(k10, C18030v.f147665b).H0(), 0, 2, (Object) null), k10, 432, 56);
            C5844O.a(J.y(aVar, c2.h.B((float) 8)), k10, 6);
            mVar2 = k10;
            C13607l.j(j.c(ik.c.f98340i, new Object[]{Integer.valueOf(i10)}, k10, 0), bVar, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, i14 & 112, 0, 262140);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C12160m0(i13, bVar, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g0(int i10, C13679b bVar, int i11, C4889m mVar, int i12) {
        f0(i10, bVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h0(java.lang.String r28, java.lang.String r29, pk.p r30, boolean r31, boolean r32, boolean r33, KJ.C15987c<? extends IC.C13023e> r34, nI.C17631a<XH.C16807N> r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r34
            r11 = r35
            r10 = r38
            r9 = r39
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "description"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "price"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "ecoFees"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "onEnergyLabelClick"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -1583824126(0xffffffffa198c302, float:-1.0351539E-18)
            r1 = r37
            U0.m r8 = r1.k(r0)
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0037
            r1 = r10 | 6
            goto L_0x0047
        L_0x0037:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0046
            boolean r1 = r8.V(r12)
            if (r1 == 0) goto L_0x0043
            r1 = 4
            goto L_0x0044
        L_0x0043:
            r1 = 2
        L_0x0044:
            r1 = r1 | r10
            goto L_0x0047
        L_0x0046:
            r1 = r10
        L_0x0047:
            r2 = r9 & 2
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 48
            goto L_0x005e
        L_0x004e:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x005e
            boolean r2 = r8.V(r13)
            if (r2 == 0) goto L_0x005b
            r2 = 32
            goto L_0x005d
        L_0x005b:
            r2 = 16
        L_0x005d:
            r1 = r1 | r2
        L_0x005e:
            r2 = r9 & 4
            if (r2 == 0) goto L_0x0065
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0065:
            r2 = r10 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0075
            boolean r2 = r8.F(r14)
            if (r2 == 0) goto L_0x0072
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r1 = r1 | r2
        L_0x0075:
            r2 = r9 & 8
            if (r2 == 0) goto L_0x007e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r7 = r31
            goto L_0x0090
        L_0x007e:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r7 = r31
            if (r2 != 0) goto L_0x0090
            boolean r2 = r8.b(r7)
            if (r2 == 0) goto L_0x008d
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x008f:
            r1 = r1 | r2
        L_0x0090:
            r2 = r9 & 16
            if (r2 == 0) goto L_0x0099
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r6 = r32
            goto L_0x00ab
        L_0x0099:
            r2 = r10 & 24576(0x6000, float:3.4438E-41)
            r6 = r32
            if (r2 != 0) goto L_0x00ab
            boolean r2 = r8.b(r6)
            if (r2 == 0) goto L_0x00a8
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00aa
        L_0x00a8:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x00aa:
            r1 = r1 | r2
        L_0x00ab:
            r2 = r9 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x00b5
            r1 = r1 | r3
            r5 = r33
            goto L_0x00c7
        L_0x00b5:
            r2 = r10 & r3
            r5 = r33
            if (r2 != 0) goto L_0x00c7
            boolean r2 = r8.b(r5)
            if (r2 == 0) goto L_0x00c4
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r1 = r1 | r2
        L_0x00c7:
            r2 = r9 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00cf
            r1 = r1 | r3
            goto L_0x00e9
        L_0x00cf:
            r2 = r10 & r3
            if (r2 != 0) goto L_0x00e9
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x00dd
            boolean r2 = r8.V(r15)
            goto L_0x00e1
        L_0x00dd:
            boolean r2 = r8.F(r15)
        L_0x00e1:
            if (r2 == 0) goto L_0x00e6
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e8
        L_0x00e6:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00e8:
            r1 = r1 | r2
        L_0x00e9:
            r2 = r9 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00f1
            r1 = r1 | r3
            goto L_0x0101
        L_0x00f1:
            r2 = r10 & r3
            if (r2 != 0) goto L_0x0101
            boolean r2 = r8.F(r11)
            if (r2 == 0) goto L_0x00fe
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r1 = r1 | r2
        L_0x0101:
            r2 = r9 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x010c
            r1 = r1 | r3
        L_0x0108:
            r3 = r36
        L_0x010a:
            r4 = r1
            goto L_0x011e
        L_0x010c:
            r3 = r3 & r10
            if (r3 != 0) goto L_0x0108
            r3 = r36
            boolean r4 = r8.V(r3)
            if (r4 == 0) goto L_0x011a
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r1 = r1 | r4
            goto L_0x010a
        L_0x011e:
            r1 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r1 & r4
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x0136
            boolean r0 = r8.l()
            if (r0 != 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            r8.L()
            r9 = r3
            r18 = r8
            goto L_0x01fe
        L_0x0136:
            if (r2 == 0) goto L_0x013d
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r17 = r0
            goto L_0x013f
        L_0x013d:
            r17 = r3
        L_0x013f:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014e
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.ProductPrice (ListProductItem.kt:479)"
            r2 = -1583824126(0xffffffffa198c302, float:-1.0351539E-18)
            U0.C4895p.S(r2, r4, r0, r1)
        L_0x014e:
            Op.d$k r0 = r30.c()
            r16 = 0
            if (r0 == 0) goto L_0x015e
            Op.d$i r1 = new Op.d$i
            r1.<init>(r0)
            r18 = r1
            goto L_0x0160
        L_0x015e:
            r18 = r16
        L_0x0160:
            Op.d$l r0 = r30.d()
            if (r0 != 0) goto L_0x016a
            Op.d$l r0 = w0()
        L_0x016a:
            r19 = r0
            Op.d$c r20 = r30.b()
            int r0 = r4 >> 6
            r0 = r0 & 1022(0x3fe, float:1.432E-42)
            int r1 = IC.C13023e.f110931a
            int r1 = r1 << 9
            r0 = r0 | r1
            int r3 = r4 >> 9
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            r21 = r0 | r1
            r0 = r30
            r1 = r31
            r2 = r32
            r22 = r3
            r3 = r34
            r23 = r4
            r4 = r8
            r5 = r21
            KJ.c r21 = x0(r0, r1, r2, r3, r4, r5)
            Op.d$h r24 = new Op.d$h
            r2 = 0
            r5 = 0
            r25 = 0
            r26 = 18
            r27 = 0
            r0 = r24
            r1 = r18
            r3 = r28
            r4 = r29
            r6 = r19
            r7 = r20
            r18 = r8
            r8 = r21
            r9 = r25
            r10 = r26
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            Op.d$l r0 = r30.d()
            if (r0 == 0) goto L_0x01c1
            Op.i1 r0 = r30.a()
            r1 = r0
            goto L_0x01c3
        L_0x01c1:
            r1 = r16
        L_0x01c3:
            SC.Q1$b r8 = new SC.Q1$b
            SC.P1 r3 = SC.P1.Small
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r22
            r0 = r0 & 896(0x380, float:1.256E-42)
            int r2 = r23 >> 12
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = SC.Q1.b.f115896e
            int r2 = r2 << 15
            r7 = r0 | r2
            r9 = 0
            r0 = r24
            r2 = r33
            r3 = r35
            r4 = r17
            r5 = r8
            r6 = r18
            r8 = r9
            Op.F.g(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01fc
            U0.C4895p.R()
        L_0x01fc:
            r9 = r17
        L_0x01fe:
            U0.Y0 r11 = r18.n()
            if (r11 == 0) goto L_0x0223
            vk.l0 r10 = new vk.l0
            r0 = r10
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r12 = r10
            r10 = r38
            r13 = r11
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.a(r12)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.h0(java.lang.String, java.lang.String, pk.p, boolean, boolean, boolean, KJ.c, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(String str, String str2, pk.p pVar, boolean z10, boolean z11, boolean z12, C15987c cVar, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        h0(str, str2, pVar, z10, z11, z12, cVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j0(String str, String str2, int i10, int i11, int i12, String str3, String str4, String str5, C4889m mVar, int i13) {
        int i14;
        String str6 = str;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        String str7 = str3;
        int i18 = i13;
        C4889m k10 = mVar.k(20210244);
        if ((i18 & 6) == 0) {
            i14 = (k10.V(str6) ? 4 : 2) | i18;
        } else {
            i14 = i18;
        }
        String str8 = str2;
        if ((i18 & 48) == 0) {
            i14 |= k10.V(str8) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i14 |= k10.d(i15) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i14 |= k10.d(i16) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i18 & 24576) == 0) {
            i14 |= k10.d(i17) ? 16384 : 8192;
        }
        if ((196608 & i18) == 0) {
            i14 |= k10.V(str7) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        String str9 = str4;
        if ((1572864 & i18) == 0) {
            i14 |= k10.V(str9) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        String str10 = str5;
        if ((12582912 & i18) == 0) {
            i14 |= k10.V(str10) ? 8388608 : 4194304;
        }
        if ((4793491 & i14) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(20210244, i14, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.SelfServeChildProduct (ListProductItem.kt:692)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
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
            I b11 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, aVar);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            androidx.compose.ui.d e12 = C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null);
            I a17 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, e12);
            C17631a<C4504g> a19 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, a17, aVar3.c());
            F1.c(a20, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b13);
            }
            F1.c(a20, e13, aVar3.d());
            C4889m mVar2 = k10;
            C13607l.j((i15 * i16) + "x " + str6, C13679b.C2857b.c.f116685a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
            C13607l.j(str2, C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, ((i14 >> 3) & 14) | 48, 0, 262140);
            C5844O.a(J.i(aVar, c2.h.B((float) 8)), k10, 6);
            U1.b(il.g.f98371a.a(str7), (androidx.compose.ui.d) null, (String) null, (V1) null, k10, 0, 14);
            k10.x();
            C5844O.a(J.y(aVar, c2.h.B((float) 4)), k10, 6);
            androidx.compose.ui.d c10 = n10.c(aVar, aVar2.a());
            I b14 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a21 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            androidx.compose.ui.d e14 = androidx.compose.ui.c.e(k10, c10);
            C17631a<C4504g> a22 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a22);
            } else {
                k10.t();
            }
            C4889m a23 = F1.a(k10);
            F1.c(a23, b14, aVar3.c());
            F1.c(a23, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b15 = aVar3.b();
            if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.w(Integer.valueOf(a21), b15);
            }
            F1.c(a23, e14, aVar3.d());
            String b16 = j.b(Oo.b.f84537W, k10, 0);
            V1 v12 = V1.Subtle;
            U1.b(str5, (androidx.compose.ui.d) null, b16, v12, k10, ((i14 >> 21) & 14) | 3072, 2);
            float f10 = (float) 12;
            C5844O.a(J.y(aVar, c2.h.B(f10)), k10, 6);
            float f11 = f10;
            U1.b(str4, (androidx.compose.ui.d) null, j.b(Oo.b.f84780s4, k10, 0), v12, k10, ((i14 >> 18) & 14) | 3072, 2);
            k10.x();
            k10.x();
            k10.W(-649634083);
            if (i17 > 1) {
                C5844O.a(J.i(aVar, c2.h.B(f11)), k10, 6);
                f0(i17, C13679b.a.c.f116681a, k10, ((i14 >> 12) & 14) | 48);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12146f0(str, str2, i10, i11, i12, str3, str4, str5, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(String str, String str2, int i10, int i11, int i12, String str3, String str4, String str5, int i13, C4889m mVar, int i14) {
        j0(str, str2, i10, i11, i12, str3, str4, str5, mVar, M0.a(i13 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l0(pk.l.a r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, nI.C17631a<XH.C16807N> r38, androidx.compose.ui.d r39, U0.C4889m r40, int r41, int r42) {
        /*
            r1 = r35
            r6 = r41
            r0 = 8
            r2 = 16
            r3 = 4
            r4 = 48
            r5 = 6
            r7 = 1022197659(0x3ced7f9b, float:0.028991511)
            r8 = r40
            U0.m r15 = r8.k(r7)
            r8 = 1
            r9 = r42 & 1
            r10 = 2
            if (r9 == 0) goto L_0x001e
            r9 = r6 | 6
            goto L_0x002e
        L_0x001e:
            r9 = r6 & 6
            if (r9 != 0) goto L_0x002d
            boolean r9 = r15.V(r1)
            if (r9 == 0) goto L_0x002a
            r9 = r3
            goto L_0x002b
        L_0x002a:
            r9 = r10
        L_0x002b:
            r9 = r9 | r6
            goto L_0x002e
        L_0x002d:
            r9 = r6
        L_0x002e:
            r11 = r42 & 2
            if (r11 == 0) goto L_0x0036
            r9 = r9 | r4
            r13 = r36
            goto L_0x0047
        L_0x0036:
            r11 = r6 & 48
            r13 = r36
            if (r11 != 0) goto L_0x0047
            boolean r11 = r15.F(r13)
            if (r11 == 0) goto L_0x0045
            r11 = 32
            goto L_0x0046
        L_0x0045:
            r11 = r2
        L_0x0046:
            r9 = r9 | r11
        L_0x0047:
            r3 = r42 & 4
            if (r3 == 0) goto L_0x0050
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004d:
            r3 = r37
            goto L_0x0062
        L_0x0050:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004d
            r3 = r37
            boolean r11 = r15.F(r3)
            if (r11 == 0) goto L_0x005f
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r9 = r9 | r11
        L_0x0062:
            r11 = r42 & 8
            if (r11 == 0) goto L_0x006b
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            r14 = r38
            goto L_0x007d
        L_0x006b:
            r11 = r6 & 3072(0xc00, float:4.305E-42)
            r14 = r38
            if (r11 != 0) goto L_0x007d
            boolean r11 = r15.F(r14)
            if (r11 == 0) goto L_0x007a
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r9 = r9 | r11
        L_0x007d:
            r2 = r42 & 16
            if (r2 == 0) goto L_0x0087
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r11 = r39
        L_0x0085:
            r12 = r9
            goto L_0x009a
        L_0x0087:
            r11 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x0083
            r11 = r39
            boolean r12 = r15.V(r11)
            if (r12 == 0) goto L_0x0096
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r9 = r9 | r12
            goto L_0x0085
        L_0x009a:
            r9 = r12 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r5) goto L_0x00ae
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            r15.L()
            r5 = r11
            r7 = r15
            goto L_0x02ca
        L_0x00ae:
            if (r2 == 0) goto L_0x00b4
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r5 = r2
            goto L_0x00b5
        L_0x00b4:
            r5 = r11
        L_0x00b5:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00c1
            r2 = -1
            java.lang.String r9 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.StockAvailability (ListProductItem.kt:730)"
            U0.C4895p.S(r7, r12, r2, r9)
        L_0x00c1:
            boolean r2 = r1 instanceof pk.l.a.C2375a
            if (r2 == 0) goto L_0x00ea
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00ce
            U0.C4895p.R()
        L_0x00ce:
            U0.Y0 r8 = r15.n()
            if (r8 == 0) goto L_0x00e9
            vk.Z r9 = new vk.Z
            r0 = r9
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r6 = r41
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x00e9:
            return
        L_0x00ea:
            r2 = 0
            r7 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r5, r2, r8, r7)
            tK.e r9 = tK.C18014e.f147445a
            float r9 = r9.b()
            tK.v r11 = tK.C18030v.f147664a
            int r0 = tK.C18030v.f147665b
            tK.h r0 = r11.a(r15, r0)
            r39 = r5
            long r4 = r0.m0()
            tK.d r0 = tK.C18013d.f147437a
            A0.f r0 = r0.e()
            androidx.compose.ui.d r17 = n0.C5599e.g(r8, r9, r4, r0)
            r0 = 12
            float r0 = (float) r0
            float r19 = c2.h.B(r0)
            r22 = 13
            r23 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r5.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r11 = r9.k()
            r2 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r11, r15, r2)
            int r11 = U0.C4883j.a(r15, r2)
            U0.y r2 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r7 = r19.a()
            U0.f r21 = r15.m()
            if (r21 != 0) goto L_0x014f
            U0.C4883j.c()
        L_0x014f:
            r15.I()
            boolean r21 = r15.i()
            if (r21 == 0) goto L_0x015c
            r15.p(r7)
            goto L_0x015f
        L_0x015c:
            r15.t()
        L_0x015f:
            U0.m r7 = U0.F1.a(r15)
            nI.p r10 = r19.c()
            U0.F1.c(r7, r8, r10)
            nI.p r8 = r19.e()
            U0.F1.c(r7, r2, r8)
            nI.p r2 = r19.b()
            boolean r8 = r7.i()
            if (r8 != 0) goto L_0x0189
            java.lang.Object r8 = r7.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0197
        L_0x0189:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r7.w(r8, r2)
        L_0x0197:
            nI.p r2 = r19.d()
            U0.F1.c(r7, r4, r2)
            s0.h r2 = s0.C5862h.f28810a
            i1.c$c r2 = r9.i()
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            float r7 = c2.h.B(r0)
            r8 = 2
            r9 = 0
            r10 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.k(r4, r7, r9, r8, r10)
            androidx.compose.foundation.layout.d$e r5 = r5.f()
            r8 = 48
            E1.I r2 = androidx.compose.foundation.layout.G.b(r5, r2, r15, r8)
            r5 = 0
            int r8 = U0.C4883j.a(r15, r5)
            U0.y r5 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r7)
            nI.a r9 = r19.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x01d5
            U0.C4883j.c()
        L_0x01d5:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x01e2
            r15.p(r9)
            goto L_0x01e5
        L_0x01e2:
            r15.t()
        L_0x01e5:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r19.c()
            U0.F1.c(r9, r2, r10)
            nI.p r2 = r19.e()
            U0.F1.c(r9, r5, r2)
            nI.p r2 = r19.b()
            boolean r5 = r9.i()
            if (r5 != 0) goto L_0x020f
            java.lang.Object r5 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r10)
            if (r5 != 0) goto L_0x021d
        L_0x020f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9.w(r5, r2)
        L_0x021d:
            nI.p r2 = r19.d()
            U0.F1.c(r9, r7, r2)
            s0.N r2 = s0.C5843N.f28726a
            r2 = r12 & 14
            o0(r1, r15, r2)
            r2 = 8
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.y(r4, r2)
            r5 = 6
            s0.C5844O.a(r2, r15, r5)
            IC.e r2 = r35.l()
            int r5 = IC.C13023e.f110931a
            java.lang.String r2 = r2.a(r15, r5)
            r5 = 0
            N1.d r8 = IC.C13021c.b(r2, r15, r5)
            TC.b$a$b r9 = TC.C13679b.a.C2856b.f116680a
            r33 = 0
            r34 = 524284(0x7fffc, float:7.34678E-40)
            r10 = 0
            r16 = 0
            r2 = r12
            r11 = r16
            r13 = r16
            r5 = 0
            r7 = r15
            r15 = r5
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 48
            r31 = r7
            SC.C13607l.h(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7.x()
            boolean r5 = r1 instanceof pk.l.a.c
            if (r5 == 0) goto L_0x02a7
            r0 = -1475077779(0xffffffffa814196d, float:-8.221164E-15)
            r7.W(r0)
            r8 = r1
            pk.l$a$c r8 = (pk.l.a.c) r8
            r0 = r2 & 112(0x70, float:1.57E-43)
            int r4 = r2 >> 3
            r4 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            int r2 = r2 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r13 = r0 | r2
            r9 = r36
            r10 = r38
            r11 = r37
            r12 = r7
            M(r8, r9, r10, r11, r12, r13)
            r7.P()
            goto L_0x02bc
        L_0x02a7:
            r2 = -1474778629(0xffffffffa818a9fb, float:-8.474554E-15)
            r7.W(r2)
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r4, r0)
            r2 = 6
            s0.C5844O.a(r0, r7, r2)
            r7.P()
        L_0x02bc:
            r7.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02c8
            U0.C4895p.R()
        L_0x02c8:
            r5 = r39
        L_0x02ca:
            U0.Y0 r8 = r7.n()
            if (r8 == 0) goto L_0x02e5
            vk.a0 r9 = new vk.a0
            r0 = r9
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r6 = r41
            r7 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.C12169r0.l0(pk.l$a, nI.a, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m0(l.a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l0(aVar, aVar2, aVar3, aVar4, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n0(l.a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        l0(aVar, aVar2, aVar3, aVar4, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void o0(l.a aVar, C4889m mVar, int i10) {
        int i11;
        L2 l22;
        C17542s.j(aVar, "availability");
        C4889m k10 = mVar.k(-1487468358);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1487468358, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.StockInfoImage (ListProductItem.kt:835)");
            }
            if (aVar instanceof l.a.C2375a) {
                l22 = L2.Available;
            } else if (aVar instanceof l.a.b) {
                l22 = ((l.a.b) aVar).d() ? L2.Indeterminate : L2.Unavailable;
            } else if (aVar instanceof l.a.c) {
                l22 = L2.Unavailable;
            } else if (aVar instanceof l.a.d) {
                l22 = L2.Low;
            } else if (aVar instanceof l.a.e) {
                l22 = L2.Indeterminate;
            } else {
                throw new t();
            }
            K2.c(l22, (androidx.compose.ui.d) null, false, k10, 0, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12166p0(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p0(l.a aVar, int i10, C4889m mVar, int i11) {
        o0(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void q0(String str, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(2088189182);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2088189182, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.SwipeableProductBackground (ListProductItem.kt:292)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d d10 = J.d(J.h(aVar, 0.0f, 1, (Object) null), 0.0f, 1, (Object) null);
            C18030v vVar = C18030v.f147664a;
            int i12 = C18030v.f147665b;
            androidx.compose.ui.d i13 = D.i(androidx.compose.foundation.b.d(d10, vVar.a(k10, i12).H(), (i1) null, 2, (Object) null), c2.h.B((float) 16));
            C5437c.a aVar2 = C5437c.f24302a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i13);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
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
            F1.c(a12, h10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar3.d());
            V.a(J1.e.c(C18146a.f148257Tc, k10, 0), context.getString(ik.c.f98336e, new Object[]{str}), C5116k1.a(C5079j.f18125a.a(aVar, aVar2.f()), "remove_icon"), vVar.a(k10, i12).k0(), k10, 0, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12168q0(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r0(String str, int i10, C4889m mVar, int i11) {
        q0(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final C10828d.l w0() {
        return new C10828d.l.f(new C10828d.l.e((qx.c) null, new qx.c("", (String) null), C16877v.n(), (String) null));
    }

    private static final C15987c<C13023e> x0(pk.p pVar, boolean z10, boolean z11, C15987c<? extends C13023e> cVar, C4889m mVar, int i10) {
        mVar.W(1710878349);
        if (C4895p.J()) {
            C4895p.S(1710878349, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.formatAddons (ListProductItem.kt:526)");
        }
        List c10 = C16877v.c();
        for (C13023e add : cVar) {
            c10.add(add);
        }
        if (z10) {
            c10.add(C13026h.a(ik.c.f98351t));
            C15990f l10 = C15985a.l(c10);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return l10;
        }
        List<C13023e> e10 = pVar.e();
        if (e10 != null) {
            c10.addAll(e10);
        }
        C13023e f10 = pVar.f();
        if (f10 != null) {
            c10.add(f10);
        }
        mVar.W(805444412);
        if (!z11) {
            c10.add(C13026h.c(j.b(Oo.b.f84364E6, mVar, 0)));
        }
        mVar.P();
        C15990f l11 = C15985a.l(C16877v.a(c10));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return l11;
    }

    public static final boolean y0(l.a aVar) {
        C17542s.j(aVar, "<this>");
        return (aVar instanceof l.a.C2375a) || (aVar instanceof l.a.d);
    }

    private static final boolean z0(l.a aVar) {
        return !(aVar instanceof l.a.c);
    }
}
