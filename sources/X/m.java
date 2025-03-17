package x;

import H2.i;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

class m extends l {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final OutputConfiguration f31531a;

        /* renamed from: b  reason: collision with root package name */
        String f31532b;

        /* renamed from: c  reason: collision with root package name */
        long f31533c = 1;

        a(OutputConfiguration outputConfiguration) {
            this.f31531a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f31531a, aVar.f31531a) && this.f31533c == aVar.f31533c && Objects.equals(this.f31532b, aVar.f31532b);
        }

        public int hashCode() {
            int hashCode = this.f31531a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            String str = this.f31532b;
            int hashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f31533c) ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    m(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    static m j(OutputConfiguration outputConfiguration) {
        return new m(new a(outputConfiguration));
    }

    public void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    public void c(long j10) {
        ((a) this.f31536a).f31533c = j10;
    }

    public void d(String str) {
        ((a) this.f31536a).f31532b = str;
    }

    public String e() {
        return ((a) this.f31536a).f31532b;
    }

    public void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }

    public Object h() {
        i.a(this.f31536a instanceof a);
        return ((a) this.f31536a).f31531a;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    m(Object obj) {
        super(obj);
    }
}
