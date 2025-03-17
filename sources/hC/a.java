package Hc;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f60741a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60742b;

    a(String str, String str2) {
        if (str != null) {
            this.f60741a = str;
            if (str2 != null) {
                this.f60742b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f60741a;
    }

    public String c() {
        return this.f60742b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f60741a.equals(fVar.b()) && this.f60742b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f60741a.hashCode() ^ 1000003) * 1000003) ^ this.f60742b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f60741a + ", version=" + this.f60742b + "}";
    }
}
