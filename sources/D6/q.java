package D6;

import E6.b;
import com.airbnb.lottie.o;
import java.util.Arrays;
import java.util.List;
import w6.C8927i;
import y6.C8986c;
import y6.C8987d;

public class q implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34539a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f34540b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f34541c;

    public q(String str, List<c> list, boolean z10) {
        this.f34539a = str;
        this.f34540b = list;
        this.f34541c = z10;
    }

    public C8986c a(o oVar, C8927i iVar, b bVar) {
        return new C8987d(oVar, bVar, this, iVar);
    }

    public List<c> b() {
        return this.f34540b;
    }

    public String c() {
        return this.f34539a;
    }

    public boolean d() {
        return this.f34541c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f34539a + "' Shapes: " + Arrays.toString(this.f34540b.toArray()) + '}';
    }
}
