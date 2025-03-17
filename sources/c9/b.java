package C9;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f33777a = 1;

    public b a(Object obj) {
        this.f33777a = (this.f33777a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f33777a;
    }

    public final b c(boolean z10) {
        this.f33777a = (this.f33777a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
