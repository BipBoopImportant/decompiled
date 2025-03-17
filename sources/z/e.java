package Z;

import C.C4391e0;
import C.C4417z;
import C.G0;
import H2.l;
import a0.i0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.h1;
import java.util.Objects;

public class e implements l<i0> {

    /* renamed from: a  reason: collision with root package name */
    private final String f14904a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f14905b;

    /* renamed from: c  reason: collision with root package name */
    private final V.i0 f14906c;

    /* renamed from: d  reason: collision with root package name */
    private final Size f14907d;

    /* renamed from: e  reason: collision with root package name */
    private final C5031k0.c f14908e;

    /* renamed from: f  reason: collision with root package name */
    private final C4417z f14909f;

    /* renamed from: g  reason: collision with root package name */
    private final Range<Integer> f14910g;

    public e(String str, h1 h1Var, V.i0 i0Var, Size size, C5031k0.c cVar, C4417z zVar, Range<Integer> range) {
        this.f14904a = str;
        this.f14905b = h1Var;
        this.f14906c = i0Var;
        this.f14907d = size;
        this.f14908e = cVar;
        this.f14909f = zVar;
        this.f14910g = range;
    }

    private int b() {
        int f10 = this.f14908e.f();
        Range<Integer> range = this.f14910g;
        Range<Integer> range2 = G0.f5198p;
        int intValue = !Objects.equals(range, range2) ? this.f14910g.clamp(Integer.valueOf(f10)).intValue() : f10;
        C4391e0.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", new Object[]{Integer.valueOf(intValue), Integer.valueOf(f10), Objects.equals(this.f14910g, range2) ? this.f14910g : "<UNSPECIFIED>"}));
        return intValue;
    }

    /* renamed from: a */
    public i0 get() {
        int b10 = b();
        C4391e0.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + b10 + "fps");
        Range<Integer> c10 = this.f14906c.c();
        C4391e0.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int e10 = c.e(this.f14908e.c(), this.f14909f.a(), this.f14908e.b(), b10, this.f14908e.f(), this.f14907d.getWidth(), this.f14908e.k(), this.f14907d.getHeight(), this.f14908e.h(), c10);
        int j10 = this.f14908e.j();
        return i0.d().h(this.f14904a).g(this.f14905b).j(this.f14907d).b(e10).e(b10).i(j10).d(c.b(this.f14904a, j10)).a();
    }
}
