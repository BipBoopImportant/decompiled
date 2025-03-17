package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.h  reason: case insensitive filesystem */
final class C5024h extends C5039o0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16913a;

    C5024h(Object obj) {
        if (obj != null) {
            this.f16913a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public Object b() {
        return this.f16913a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5039o0) {
            return this.f16913a.equals(((C5039o0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16913a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f16913a + "}";
    }
}
