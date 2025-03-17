package xx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, d2 = {"Lxx/a;", "", "", "isOnlineSellable", "", "deliveryCalculationDisclaimer", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xx.a  reason: case insensitive filesystem */
public final class C15269a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f132051a;

    /* renamed from: b  reason: collision with root package name */
    private final String f132052b;

    public C15269a(boolean z10, String str) {
        this.f132051a = z10;
        this.f132052b = str;
    }

    public final String a() {
        return this.f132052b;
    }

    public final boolean b() {
        return this.f132051a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15269a)) {
            return false;
        }
        C15269a aVar = (C15269a) obj;
        return this.f132051a == aVar.f132051a && C17542s.e(this.f132052b, aVar.f132052b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f132051a) * 31;
        String str = this.f132052b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z10 = this.f132051a;
        String str = this.f132052b;
        return "AddToCartData(isOnlineSellable=" + z10 + ", deliveryCalculationDisclaimer=" + str + ")";
    }
}
