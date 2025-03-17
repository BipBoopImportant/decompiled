package pu;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpu/b;", "", "", "storeId", "storeName", "", "usersCurrentSelectedStore", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "getUsersCurrentSelectedStore", "()Z", "instore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pu.b  reason: case insensitive filesystem */
public final class C11778b {

    /* renamed from: a  reason: collision with root package name */
    private final String f101379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f101380b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f101381c;

    public C11778b(String str, String str2, boolean z10) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "storeName");
        this.f101379a = str;
        this.f101380b = str2;
        this.f101381c = z10;
    }

    public final String a() {
        return this.f101379a;
    }

    public final String b() {
        return this.f101380b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11778b)) {
            return false;
        }
        C11778b bVar = (C11778b) obj;
        return C17542s.e(this.f101379a, bVar.f101379a) && C17542s.e(this.f101380b, bVar.f101380b) && this.f101381c == bVar.f101381c;
    }

    public int hashCode() {
        return (((this.f101379a.hashCode() * 31) + this.f101380b.hashCode()) * 31) + Boolean.hashCode(this.f101381c);
    }

    public String toString() {
        String str = this.f101379a;
        String str2 = this.f101380b;
        boolean z10 = this.f101381c;
        return "NearbyStore(storeId=" + str + ", storeName=" + str2 + ", usersCurrentSelectedStore=" + z10 + ")";
    }
}
