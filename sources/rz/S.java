package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Lrz/S;", "", "", "barcode", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class S {

    /* renamed from: a  reason: collision with root package name */
    private final String f130768a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130769b;

    public S(String str, int i10) {
        C17542s.j(str, "barcode");
        this.f130768a = str;
        this.f130769b = i10;
    }

    public final String a() {
        return this.f130768a;
    }

    public final int b() {
        return this.f130769b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return C17542s.e(this.f130768a, s10.f130768a) && this.f130769b == s10.f130769b;
    }

    public int hashCode() {
        return (this.f130768a.hashCode() * 31) + Integer.hashCode(this.f130769b);
    }

    public String toString() {
        String str = this.f130768a;
        int i10 = this.f130769b;
        return "ShopAndGoItemReference(barcode=" + str + ", quantity=" + i10 + ")";
    }
}
