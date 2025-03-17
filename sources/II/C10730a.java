package Ii;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"LIi/a;", "", "", "pageNumber", "<init>", "(I)V", "a", "(I)LIi/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "b", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ii.a  reason: case insensitive filesystem */
public final class C10730a {

    /* renamed from: a  reason: collision with root package name */
    private final int f81749a;

    public C10730a(int i10) {
        this.f81749a = i10;
    }

    public final C10730a a(int i10) {
        return new C10730a(i10);
    }

    public final int b() {
        return this.f81749a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10730a) && this.f81749a == ((C10730a) obj).f81749a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f81749a);
    }

    public String toString() {
        int i10 = this.f81749a;
        return "RatingsPagingKey(pageNumber=" + i10 + ")";
    }
}
