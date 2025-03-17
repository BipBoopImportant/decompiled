package ga;

final class H extends K {

    /* renamed from: a  reason: collision with root package name */
    private final String f51359a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51360b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51361c;

    /* synthetic */ H(String str, boolean z10, int i10, G g10) {
        this.f51359a = str;
        this.f51360b = z10;
        this.f51361c = i10;
    }

    public final int a() {
        return this.f51361c;
    }

    public final String b() {
        return this.f51359a;
    }

    public final boolean c() {
        return this.f51360b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            return this.f51359a.equals(k10.b()) && this.f51360b == k10.c() && this.f51361c == k10.a();
        }
    }

    public final int hashCode() {
        return ((((this.f51359a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f51360b ? 1237 : 1231)) * 1000003) ^ this.f51361c;
    }

    public final String toString() {
        String str = this.f51359a;
        boolean z10 = this.f51360b;
        int i10 = this.f51361c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z10 + ", firelogEventType=" + i10 + "}";
    }
}
