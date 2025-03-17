package j9;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f54097a;

    private c(String str) {
        if (str != null) {
            this.f54097a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static c b(String str) {
        return new c(str);
    }

    public String a() {
        return this.f54097a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f54097a.equals(((c) obj).f54097a);
    }

    public int hashCode() {
        return this.f54097a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f54097a + "\"}";
    }
}
