package x;

import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import java.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final c f31528a;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final InputConfiguration f31529a;

        a(Object obj) {
            this.f31529a = (InputConfiguration) obj;
        }

        public Object a() {
            return this.f31529a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Objects.equals(this.f31529a, ((c) obj).a());
        }

        public int hashCode() {
            return this.f31529a.hashCode();
        }

        public String toString() {
            return this.f31529a.toString();
        }
    }

    private static final class b extends a {
        b(Object obj) {
            super(obj);
        }
    }

    private interface c {
        Object a();
    }

    private j(c cVar) {
        this.f31528a = cVar;
    }

    public static j b(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new j(new b(obj)) : new j(new a(obj));
    }

    public Object a() {
        return this.f31528a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f31528a.equals(((j) obj).f31528a);
    }

    public int hashCode() {
        return this.f31528a.hashCode();
    }

    public String toString() {
        return this.f31528a.toString();
    }
}
