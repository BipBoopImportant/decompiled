package D6;

import C6.a;
import C6.d;
import E6.b;
import android.graphics.Path;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.C8990g;

public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34533a;

    /* renamed from: b  reason: collision with root package name */
    private final Path.FillType f34534b;

    /* renamed from: c  reason: collision with root package name */
    private final String f34535c;

    /* renamed from: d  reason: collision with root package name */
    private final a f34536d;

    /* renamed from: e  reason: collision with root package name */
    private final d f34537e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f34538f;

    public p(String str, boolean z10, Path.FillType fillType, a aVar, d dVar, boolean z11) {
        this.f34535c = str;
        this.f34533a = z10;
        this.f34534b = fillType;
        this.f34536d = aVar;
        this.f34537e = dVar;
        this.f34538f = z11;
    }

    public C8986c a(o oVar, C8927i iVar, b bVar) {
        return new C8990g(oVar, bVar, this);
    }

    public a b() {
        return this.f34536d;
    }

    public Path.FillType c() {
        return this.f34534b;
    }

    public String d() {
        return this.f34535c;
    }

    public d e() {
        return this.f34537e;
    }

    public boolean f() {
        return this.f34538f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f34533a + '}';
    }
}
