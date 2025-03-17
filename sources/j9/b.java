package j9;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54096a;

    b(Integer num) {
        this.f54096a = num;
    }

    public Integer a() {
        return this.f54096a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f54096a;
        Integer a10 = ((g) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public int hashCode() {
        Integer num = this.f54096a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f54096a + "}";
    }
}
