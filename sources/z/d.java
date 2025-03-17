package Z;

import C.C4391e0;
import C.C4417z;
import C.G0;
import H2.l;
import a0.i0;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.h1;
import b0.C5252b;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.Objects;

public class d implements l<i0> {

    /* renamed from: g  reason: collision with root package name */
    private static final Size f14896g = new Size(SceneLayout.kCurrent3DVersion, 720);

    /* renamed from: h  reason: collision with root package name */
    private static final Range<Integer> f14897h = new Range<>(1, 60);

    /* renamed from: a  reason: collision with root package name */
    private final String f14898a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f14899b;

    /* renamed from: c  reason: collision with root package name */
    private final V.i0 f14900c;

    /* renamed from: d  reason: collision with root package name */
    private final Size f14901d;

    /* renamed from: e  reason: collision with root package name */
    private final C4417z f14902e;

    /* renamed from: f  reason: collision with root package name */
    private final Range<Integer> f14903f;

    public d(String str, h1 h1Var, V.i0 i0Var, Size size, C4417z zVar, Range<Integer> range) {
        this.f14898a = str;
        this.f14899b = h1Var;
        this.f14900c = i0Var;
        this.f14901d = size;
        this.f14902e = zVar;
        this.f14903f = range;
    }

    private int b() {
        Range<Integer> range = this.f14903f;
        Range<Integer> range2 = G0.f5198p;
        int intValue = !Objects.equals(range, range2) ? f14897h.clamp(this.f14903f.getUpper()).intValue() : 30;
        C4391e0.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", new Object[]{Integer.valueOf(intValue), Objects.equals(this.f14903f, range2) ? this.f14903f : "<UNSPECIFIED>"}));
        return intValue;
    }

    /* renamed from: a */
    public i0 get() {
        int b10 = b();
        C4391e0.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + b10 + "fps");
        Range<Integer> c10 = this.f14900c.c();
        C4391e0.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int a10 = this.f14902e.a();
        int width = this.f14901d.getWidth();
        Size size = f14896g;
        int e10 = c.e(14000000, a10, 8, b10, 30, width, size.getWidth(), this.f14901d.getHeight(), size.getHeight(), c10);
        int a11 = C5252b.a(this.f14898a, this.f14902e);
        return i0.d().h(this.f14898a).g(this.f14899b).j(this.f14901d).b(e10).e(b10).i(a11).d(c.b(this.f14898a, a11)).a();
    }
}
