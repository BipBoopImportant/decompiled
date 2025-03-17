package B;

import C.C4408p;
import H2.i;
import androidx.camera.core.impl.I;
import v.C6030H0;
import v.C6042T;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private C6042T f4474a;

    /* renamed from: b  reason: collision with root package name */
    private C6030H0 f4475b;

    public h(C6042T t10) {
        this.f4474a = t10;
    }

    public static h a(C4408p pVar) {
        if (pVar instanceof C6030H0) {
            return ((C6030H0) pVar).r();
        }
        I a10 = ((I) pVar).a();
        i.b(a10 instanceof C6042T, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C6042T) a10).r();
    }

    public String b() {
        C6030H0 h02 = this.f4475b;
        return h02 != null ? h02.d() : this.f4474a.d();
    }
}
