package D6;

import C6.h;
import E6.b;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;

public class r implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34542a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34543b;

    /* renamed from: c  reason: collision with root package name */
    private final h f34544c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34545d;

    public r(String str, int i10, h hVar, boolean z10) {
        this.f34542a = str;
        this.f34543b = i10;
        this.f34544c = hVar;
        this.f34545d = z10;
    }

    public C8986c a(o oVar, C8927i iVar, b bVar) {
        return new y6.r(oVar, bVar, this);
    }

    public String b() {
        return this.f34542a;
    }

    public h c() {
        return this.f34544c;
    }

    public boolean d() {
        return this.f34545d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f34542a + ", index=" + this.f34543b + '}';
    }
}
