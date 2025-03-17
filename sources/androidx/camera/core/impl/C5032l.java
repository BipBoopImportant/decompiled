package androidx.camera.core.impl;

import androidx.camera.core.impl.b1;

/* renamed from: androidx.camera.core.impl.l  reason: case insensitive filesystem */
final class C5032l extends b1.a {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f16940a;

    C5032l(Throwable th2) {
        if (th2 != null) {
            this.f16940a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }

    public Throwable a() {
        return this.f16940a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1.a) {
            return this.f16940a.equals(((b1.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f16940a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f16940a + "}";
    }
}
