package D6;

import C6.b;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.u;

public class t implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34558a;

    /* renamed from: b  reason: collision with root package name */
    private final a f34559b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34560c;

    /* renamed from: d  reason: collision with root package name */
    private final b f34561d;

    /* renamed from: e  reason: collision with root package name */
    private final b f34562e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f34563f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, b bVar, b bVar2, b bVar3, boolean z10) {
        this.f34558a = str;
        this.f34559b = aVar;
        this.f34560c = bVar;
        this.f34561d = bVar2;
        this.f34562e = bVar3;
        this.f34563f = z10;
    }

    public C8986c a(o oVar, C8927i iVar, E6.b bVar) {
        return new u(bVar, this);
    }

    public b b() {
        return this.f34561d;
    }

    public String c() {
        return this.f34558a;
    }

    public b d() {
        return this.f34562e;
    }

    public b e() {
        return this.f34560c;
    }

    public a f() {
        return this.f34559b;
    }

    public boolean g() {
        return this.f34563f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f34560c + ", end: " + this.f34561d + ", offset: " + this.f34562e + "}";
    }
}
