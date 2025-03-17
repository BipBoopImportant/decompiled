package k9;

import k9.C8484r;

/* renamed from: k9.h  reason: case insensitive filesystem */
final class C8474h extends C8484r {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54455a;

    /* renamed from: k9.h$b */
    static final class b extends C8484r.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f54456a;

        b() {
        }

        public C8484r a() {
            return new C8474h(this.f54456a);
        }

        public C8484r.a b(Integer num) {
            this.f54456a = num;
            return this;
        }
    }

    public Integer b() {
        return this.f54455a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8484r)) {
            return false;
        }
        Integer num = this.f54455a;
        Integer b10 = ((C8484r) obj).b();
        return num == null ? b10 == null : num.equals(b10);
    }

    public int hashCode() {
        Integer num = this.f54455a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f54455a + "}";
    }

    private C8474h(Integer num) {
        this.f54455a = num;
    }
}
