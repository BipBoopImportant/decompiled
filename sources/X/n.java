package x;

import H2.i;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

class n extends m {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final OutputConfiguration f31534a;

        /* renamed from: b  reason: collision with root package name */
        long f31535b = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f31534a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f31534a, aVar.f31534a) && this.f31535b == aVar.f31535b;
        }

        public int hashCode() {
            int hashCode = this.f31534a.hashCode() ^ 31;
            return Long.hashCode(this.f31535b) ^ ((hashCode << 5) - hashCode);
        }
    }

    n(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static n k(OutputConfiguration outputConfiguration) {
        return new n(new a(outputConfiguration));
    }

    public void c(long j10) {
        ((a) this.f31536a).f31535b = j10;
    }

    public void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }

    public String e() {
        return null;
    }

    public Object h() {
        i.a(this.f31536a instanceof a);
        return ((a) this.f31536a).f31534a;
    }

    n(Object obj) {
        super(obj);
    }
}
