package x;

import H2.i;
import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

public class o extends n {
    o(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    static o l(OutputConfiguration outputConfiguration) {
        return new o(outputConfiguration);
    }

    public void a(long j10) {
        if (j10 != -1) {
            ((OutputConfiguration) h()).setStreamUseCase(j10);
        }
    }

    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    public void c(long j10) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j10);
    }

    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    public void g(int i10) {
        ((OutputConfiguration) h()).setMirrorMode(i10);
    }

    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    public Object h() {
        i.a(this.f31536a instanceof OutputConfiguration);
        return this.f31536a;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    o(Object obj) {
        super(obj);
    }
}
