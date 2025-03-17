package wo;

import Do.a;
import IC.C13023e;
import IC.C13026h;
import XH.t;
import Yn.P;
import Yn.o0;
import ho.b;
import ho.g;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rv.C11849b;
import uK.C18146a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJL\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lwo/d;", "Lwo/c;", "<init>", "()V", "LYn/P;", "", "hasDeliveryOptions", "allDeliveryOptionsUnavailable", "LYn/o0$a;", "c", "(LYn/P;ZZ)LYn/o0$a;", "", "d", "(LYn/P;)I", "", "Lho/b;", "isInclTax", "", "price", "e", "(Ljava/util/List;ZLjava/lang/Double;)Z", "method", "", "overrideDeliveryDetailsString", "LIC/e;", "b", "(LYn/P;Ljava/lang/String;)LIC/e;", "deliveryMethod", "deliveryOptions", "showTotalExclTaxInCartAndCheckout", "LDo/a;", "checkoutStep", "selectedDeliveryMethod", "LYn/o0;", "a", "(LYn/P;Ljava/util/List;ZLDo/a;LYn/P;Ljava/lang/String;)LYn/o0;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wo.d  reason: case insensitive filesystem */
public final class C12293d implements C12292c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wo.d$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f105925a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Yn.P[] r0 = Yn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yn.P r1 = Yn.P.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Yn.P r1 = Yn.P.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f105925a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wo.C12293d.a.<clinit>():void");
        }
    }

    private final C13023e b(P p10, String str) {
        if (str != null && str.length() != 0) {
            return C13026h.c(str);
        }
        int i10 = a.f105925a[p10.ordinal()];
        if (i10 == 1) {
            return C13026h.a(C11849b.f102200J1);
        }
        if (i10 == 2) {
            return C13026h.a(C11849b.f102184F1);
        }
        throw new t();
    }

    private final o0.a c(P p10, boolean z10, boolean z11) {
        if (!z10) {
            return new o0.a.C1917a(C13026h.a(d(p10)));
        }
        if (!z10 || !z11) {
            return null;
        }
        return o0.a.b.f89504a;
    }

    private final int d(P p10) {
        int i10 = a.f105925a[p10.ordinal()];
        if (i10 == 1) {
            return C11849b.f102248V1;
        }
        if (i10 == 2) {
            return C11849b.f102244U1;
        }
        throw new t();
    }

    private final boolean e(List<? extends b> list, boolean z10, Double d10) {
        Iterable<b> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (b e10 : iterable) {
            if (!C17542s.b(e10.e(Boolean.valueOf(z10)), d10)) {
                return true;
            }
        }
        return false;
    }

    public o0 a(P p10, List<? extends b> list, boolean z10, Do.a aVar, P p11, String str) {
        P p12;
        boolean z11;
        int i10;
        C13023e a10;
        P p13 = p10;
        List<? extends b> list2 = list;
        C17542s.j(p13, "deliveryMethod");
        C17542s.j(aVar, "checkoutStep");
        Double a11 = list2 != null ? g.a(list2, !z10) : null;
        boolean z12 = false;
        boolean e10 = list2 != null ? e(list2, !z10, a11) : false;
        Collection collection = list2;
        boolean z13 = !(collection == null || collection.isEmpty());
        if (list2 != null) {
            z11 = g.b(list);
            p12 = p11;
        } else {
            p12 = p11;
            z11 = false;
        }
        if (p12 == p13 && aVar.a() >= a.g.f79841a.a()) {
            z12 = true;
        }
        int[] iArr = a.f105925a;
        int i11 = iArr[p10.ordinal()];
        if (i11 == 1) {
            i10 = C18146a.f148385c3;
        } else if (i11 == 2) {
            i10 = C18146a.f148352a2;
        } else {
            throw new t();
        }
        o0.a c10 = c(p13, z13, z11);
        C13023e b10 = b(p13, str);
        int i12 = iArr[p10.ordinal()];
        if (i12 == 1) {
            a10 = C13026h.a(C11849b.f102196I1);
        } else if (i12 == 2) {
            a10 = C13026h.a(C11849b.f102180E1);
        } else {
            throw new t();
        }
        return new o0(p10, z12, z13, i10, a10, b10, str, a11, e10, c10);
    }
}
