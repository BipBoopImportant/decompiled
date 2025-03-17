package N3;

public final class K {

    /* renamed from: c  reason: collision with root package name */
    public static final K f38765c = new K(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f38766a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38767b;

    public K(long j10, long j11) {
        this.f38766a = j10;
        this.f38767b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        return this.f38766a == k10.f38766a && this.f38767b == k10.f38767b;
    }

    public int hashCode() {
        return (((int) this.f38766a) * 31) + ((int) this.f38767b);
    }

    public String toString() {
        return "[timeUs=" + this.f38766a + ", position=" + this.f38767b + "]";
    }
}
