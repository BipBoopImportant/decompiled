package ha;

/* renamed from: ha.g8  reason: case insensitive filesystem */
final class C8017g8 extends C8057k8 {

    /* renamed from: a  reason: collision with root package name */
    private final String f52548a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f52549b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52550c;

    /* synthetic */ C8017g8(String str, boolean z10, int i10, C8007f8 f8Var) {
        this.f52548a = str;
        this.f52549b = z10;
        this.f52550c = i10;
    }

    public final int a() {
        return this.f52550c;
    }

    public final String b() {
        return this.f52548a;
    }

    public final boolean c() {
        return this.f52549b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8057k8) {
            C8057k8 k8Var = (C8057k8) obj;
            return this.f52548a.equals(k8Var.b()) && this.f52549b == k8Var.c() && this.f52550c == k8Var.a();
        }
    }

    public final int hashCode() {
        return ((((this.f52548a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f52549b ? 1237 : 1231)) * 1000003) ^ this.f52550c;
    }

    public final String toString() {
        String str = this.f52548a;
        boolean z10 = this.f52549b;
        int i10 = this.f52550c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z10 + ", firelogEventType=" + i10 + "}";
    }
}
