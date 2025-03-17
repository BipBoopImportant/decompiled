package ia;

/* renamed from: ia.o5  reason: case insensitive filesystem */
final class C8324o5 extends C8351s5 {

    /* renamed from: a  reason: collision with root package name */
    private final String f53750a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f53751b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53752c;

    /* synthetic */ C8324o5(String str, boolean z10, int i10, C8310m5 m5Var) {
        this.f53750a = str;
        this.f53751b = z10;
        this.f53752c = i10;
    }

    public final int a() {
        return this.f53752c;
    }

    public final String b() {
        return this.f53750a;
    }

    public final boolean c() {
        return this.f53751b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8351s5) {
            C8351s5 s5Var = (C8351s5) obj;
            return this.f53750a.equals(s5Var.b()) && this.f53751b == s5Var.c() && this.f53752c == s5Var.a();
        }
    }

    public final int hashCode() {
        return ((((this.f53750a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f53751b ? 1237 : 1231)) * 1000003) ^ this.f53752c;
    }

    public final String toString() {
        String str = this.f53750a;
        boolean z10 = this.f53751b;
        int i10 = this.f53752c;
        return "MLKitLoggingOptions{libraryName=" + str + ", enableFirelog=" + z10 + ", firelogEventType=" + i10 + "}";
    }
}
