package zi;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lzi/a;", "", "", "title", "message", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zi.a  reason: case insensitive filesystem */
public final class C12518a {

    /* renamed from: a  reason: collision with root package name */
    private final int f107358a;

    /* renamed from: b  reason: collision with root package name */
    private final int f107359b;

    public C12518a(int i10, int i11) {
        this.f107358a = i10;
        this.f107359b = i11;
    }

    public final int a() {
        return this.f107359b;
    }

    public final int b() {
        return this.f107358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12518a)) {
            return false;
        }
        C12518a aVar = (C12518a) obj;
        return this.f107358a == aVar.f107358a && this.f107359b == aVar.f107359b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f107358a) * 31) + Integer.hashCode(this.f107359b);
    }

    public String toString() {
        int i10 = this.f107358a;
        int i11 = this.f107359b;
        return "DeliveryStatusError(title=" + i10 + ", message=" + i11 + ")";
    }
}
