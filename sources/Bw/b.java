package Bw;

import Bw.h;
import Bw.i;
import Bw.j;
import Il.a;
import KJ.C15985a;
import Mp.e;
import Op.B0;
import XH.t;
import YH.C16877v;
import YH.g0;
import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11521c;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0012\u001a\u00020\u0011*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010'¨\u0006("}, d2 = {"LBw/b;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "Lkp/c;", "LBw/j$a;", "b", "(Lkp/c;)LBw/j$a;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "", "itemNosInShoppingList", "", "prioritizeContextualImage", "allowOfferDaysLeft", "LBw/j$b;", "c", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;Ljava/util/Set;ZZ)LBw/j$b;", "LBw/i;", "LBw/j$d;", "e", "(LBw/i;)LBw/j$d;", "LBw/h;", "LBw/j$c;", "d", "(LBw/h;Ljava/util/Set;Z)LBw/j$c;", "LBw/j;", "currentState", "LBw/a;", "offerHubState", "recommendationsOnSaleState", "surpriseOffersState", "", "Lcw/b;", "commercialMessagesForCarousel", "a", "(LBw/j;Ljava/util/Set;LBw/a;LBw/h;LBw/i;Ljava/util/List;)LBw/j;", "LIl/a;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f108117a;

    public b(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f108117a = aVar;
    }

    private final j.a b(C11521c cVar) {
        if (cVar == null) {
            return null;
        }
        Iterable<Category> a10 = cVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (Category category : a10) {
            arrayList.add(new Category(category.a(), category.b(), category.d(), (String) null, 8, (DefaultConstructorMarker) null));
        }
        return new j.a(C15985a.h(arrayList));
    }

    private final j.b c(ProductCarousel productCarousel, Set<String> set, boolean z10, boolean z11) {
        String b10 = productCarousel.b();
        String d10 = productCarousel.d();
        String e10 = productCarousel.e();
        Iterable<ProductItem> c10 = productCarousel.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (ProductItem o10 : c10) {
            arrayList.add(B0.o(o10, C16877v.n(), set, this.f108117a.s(), this.f108117a.w(), false, true, false, z10, z11, 64, (Object) null));
        }
        return new j.b(b10, d10, e10, C15985a.h(arrayList));
    }

    private final j.c d(h hVar, Set<String> set, boolean z10) {
        if ((hVar instanceof h.b) || (hVar instanceof h.a)) {
            return null;
        }
        if (hVar instanceof h.c) {
            return j.c.b.f108177a;
        }
        if (hVar instanceof h.d) {
            ProductCarousel a10 = ((h.d) hVar).a();
            j.b f10 = a10 != null ? f(this, a10, set, z10, false, 4, (Object) null) : null;
            if (f10 == null) {
                return null;
            }
            return new j.c.a(f10);
        }
        throw new t();
    }

    private final j.d e(i iVar) {
        i iVar2 = iVar;
        if ((iVar2 instanceof i.b) || (iVar2 instanceof i.c)) {
            return j.d.b.f108189a;
        }
        if (iVar2 instanceof i.a) {
            return null;
        }
        if (iVar2 instanceof i.d) {
            i.d dVar = (i.d) iVar2;
            Iterable k12 = C16877v.k1(dVar.b().d(), 4);
            ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
            int i10 = 0;
            for (Object next : k12) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                arrayList.add(new j.d.a.C2583d(B0.o((ProductItem) next, C16877v.n(), g0.d(), this.f108117a.s(), false, false, false, false, true, false, 328, (Object) null), dVar.a().get(i10)));
                i10 = i11;
            }
            Iterable<e.b> c10 = dVar.b().c().c();
            ArrayList arrayList2 = new ArrayList(C16877v.y(c10, 10));
            for (e.b bVar : c10) {
                arrayList2.add(new j.d.a.b(bVar.a(), bVar.b(), bVar.c()));
            }
            if (arrayList.isEmpty() || arrayList2.isEmpty()) {
                return null;
            }
            return new j.d.a(C15985a.h(arrayList), new j.d.a.C2581a(dVar.b().c().a(), dVar.b().c().b(), C15985a.h(arrayList2)));
        }
        throw new t();
    }

    static /* synthetic */ j.b f(b bVar, ProductCarousel productCarousel, Set set, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return bVar.c(productCarousel, set, z10, z11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002e, code lost:
        r0 = r0.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Bw.j a(Bw.j r23, java.util.Set<java.lang.String> r24, Bw.C12661a r25, Bw.h r26, Bw.i r27, java.util.List<cw.b> r28) {
        /*
            r22 = this;
            r7 = r22
            r8 = r24
            r9 = r26
            r10 = r27
            r11 = r28
            java.lang.String r0 = "currentState"
            r12 = r23
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "itemNosInShoppingList"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "offerHubState"
            r13 = r25
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "recommendationsOnSaleState"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "commercialMessagesForCarousel"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            Mp.a r0 = r25.c()
            r14 = 0
            if (r0 == 0) goto L_0x003a
            kp.c r0 = r0.c()
            if (r0 == 0) goto L_0x003a
            Bw.j$a r0 = r7.b(r0)
            r15 = r0
            goto L_0x003b
        L_0x003a:
            r15 = r14
        L_0x003b:
            boolean r0 = r25.b()
            r6 = 1
            if (r0 != 0) goto L_0x0050
            boolean r0 = r25.d()
            if (r0 == 0) goto L_0x0049
            goto L_0x0050
        L_0x0049:
            Bw.j$c r0 = r7.d(r9, r8, r6)
            r16 = r0
            goto L_0x0052
        L_0x0050:
            r16 = r14
        L_0x0052:
            Mp.a r0 = r25.c()
            if (r0 == 0) goto L_0x0072
            com.ingka.ikea.core.model.product.ProductCarousel r1 = r0.d()
            if (r1 == 0) goto L_0x0072
            r5 = 6
            r17 = 0
            r3 = 0
            r4 = 0
            r0 = r22
            r2 = r24
            r18 = r6
            r6 = r17
            Bw.j$b r0 = f(r0, r1, r2, r3, r4, r5, r6)
            r17 = r0
            goto L_0x0076
        L_0x0072:
            r18 = r6
            r17 = r14
        L_0x0076:
            Mp.a r0 = r25.c()
            if (r0 == 0) goto L_0x0091
            com.ingka.ikea.core.model.product.ProductCarousel r1 = r0.a()
            if (r1 == 0) goto L_0x0091
            r5 = 2
            r6 = 0
            r3 = 0
            r4 = 1
            r0 = r22
            r2 = r24
            Bw.j$b r0 = f(r0, r1, r2, r3, r4, r5, r6)
            r19 = r0
            goto L_0x0093
        L_0x0091:
            r19 = r14
        L_0x0093:
            Mp.a r0 = r25.c()
            if (r0 == 0) goto L_0x00ac
            com.ingka.ikea.core.model.product.ProductCarousel r1 = r0.b()
            if (r1 == 0) goto L_0x00ac
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r22
            r2 = r24
            Bw.j$b r0 = f(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ad
        L_0x00ac:
            r0 = r14
        L_0x00ad:
            if (r10 == 0) goto L_0x00b4
            Bw.j$d r1 = r7.e(r10)
            goto L_0x00b5
        L_0x00b4:
            r1 = r14
        L_0x00b5:
            boolean r2 = r25.b()
            boolean r3 = r25.d()
            boolean r4 = r9 instanceof Bw.h.c
            if (r4 != 0) goto L_0x00c8
            boolean r4 = r10 instanceof Bw.i.c
            if (r4 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r4 = 0
            goto L_0x00ca
        L_0x00c8:
            r4 = r18
        L_0x00ca:
            r5 = r11
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r11 = r14
        L_0x00d5:
            if (r11 == 0) goto L_0x00e0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            KJ.c r5 = KJ.C15985a.h(r11)
            r18 = r5
            goto L_0x00e2
        L_0x00e0:
            r18 = r14
        L_0x00e2:
            r20 = 64
            r21 = 0
            r5 = 0
            r8 = r23
            r9 = r15
            r10 = r16
            r11 = r17
            r12 = r19
            r13 = r0
            r14 = r1
            r15 = r5
            r16 = r3
            r17 = r2
            r19 = r4
            Bw.j r0 = Bw.j.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bw.b.a(Bw.j, java.util.Set, Bw.a, Bw.h, Bw.i, java.util.List):Bw.j");
    }
}
