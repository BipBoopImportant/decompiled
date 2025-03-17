package Yd;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LYd/w;", "LYd/a;", "", "addressId", "", "deletable", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f64964a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f64965b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(String str, boolean z10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "addressId");
        this.f64964a = str;
        this.f64965b = z10;
    }

    public final String a() {
        return this.f64964a;
    }

    public final boolean b() {
        return this.f64965b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return C17542s.e(this.f64964a, wVar.f64964a) && this.f64965b == wVar.f64965b;
    }

    public int hashCode() {
        return (this.f64964a.hashCode() * 31) + Boolean.hashCode(this.f64965b);
    }

    public String toString() {
        String str = this.f64964a;
        boolean z10 = this.f64965b;
        return "Edit(addressId=" + str + ", deletable=" + z10 + ")";
    }
}
