package kc;

import java.util.List;

/* renamed from: kc.a  reason: case insensitive filesystem */
final class C9972a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f75046a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f75047b;

    C9972a(String str, List<String> list) {
        if (str != null) {
            this.f75046a = str;
            if (list != null) {
                this.f75047b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public List<String> b() {
        return this.f75047b;
    }

    public String c() {
        return this.f75046a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f75046a.equals(lVar.c()) && this.f75047b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f75046a.hashCode() ^ 1000003) * 1000003) ^ this.f75047b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f75046a + ", usedDates=" + this.f75047b + "}";
    }
}
