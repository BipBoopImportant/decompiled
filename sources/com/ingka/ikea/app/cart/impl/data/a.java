package com.ingka.ikea.app.cart.impl.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0017B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/a;", "", "", "Lcom/ingka/ikea/app/cart/impl/data/a$b;", "proximityDiscounts", "Lcom/ingka/ikea/app/cart/impl/data/a$a;", "discounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getProximityDiscounts", "()Ljava/util/List;", "b", "getDiscounts", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f71830a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C1229a> f71831b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/a$a;", "", "", "message", "", "isFamilyOnly", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.cart.impl.data.a$a  reason: collision with other inner class name */
    public static final class C1229a {

        /* renamed from: a  reason: collision with root package name */
        private final String f71832a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f71833b;

        public C1229a(String str, boolean z10) {
            C17542s.j(str, "message");
            this.f71832a = str;
            this.f71833b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1229a)) {
                return false;
            }
            C1229a aVar = (C1229a) obj;
            return C17542s.e(this.f71832a, aVar.f71832a) && this.f71833b == aVar.f71833b;
        }

        public int hashCode() {
            return (this.f71832a.hashCode() * 31) + Boolean.hashCode(this.f71833b);
        }

        public String toString() {
            String str = this.f71832a;
            boolean z10 = this.f71833b;
            return "Discount(message=" + str + ", isFamilyOnly=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/a$b;", "", "", "message", "", "remainingAmount", "", "isFamilyOnly", "<init>", "(Ljava/lang/String;FZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "F", "getRemainingAmount", "()F", "c", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f71834a;

        /* renamed from: b  reason: collision with root package name */
        private final float f71835b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f71836c;

        public b(String str, float f10, boolean z10) {
            C17542s.j(str, "message");
            this.f71834a = str;
            this.f71835b = f10;
            this.f71836c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f71834a, bVar.f71834a) && Float.compare(this.f71835b, bVar.f71835b) == 0 && this.f71836c == bVar.f71836c;
        }

        public int hashCode() {
            return (((this.f71834a.hashCode() * 31) + Float.hashCode(this.f71835b)) * 31) + Boolean.hashCode(this.f71836c);
        }

        public String toString() {
            String str = this.f71834a;
            float f10 = this.f71835b;
            boolean z10 = this.f71836c;
            return "ProximityDiscount(message=" + str + ", remainingAmount=" + f10 + ", isFamilyOnly=" + z10 + ")";
        }
    }

    public a(List<b> list, List<C1229a> list2) {
        C17542s.j(list, "proximityDiscounts");
        C17542s.j(list2, "discounts");
        this.f71830a = list;
        this.f71831b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f71830a, aVar.f71830a) && C17542s.e(this.f71831b, aVar.f71831b);
    }

    public int hashCode() {
        return (this.f71830a.hashCode() * 31) + this.f71831b.hashCode();
    }

    public String toString() {
        List<b> list = this.f71830a;
        List<C1229a> list2 = this.f71831b;
        return "ProximityDiscounts(proximityDiscounts=" + list + ", discounts=" + list2 + ")";
    }
}
