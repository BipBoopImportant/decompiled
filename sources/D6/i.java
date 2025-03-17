package D6;

import C6.d;
import C6.h;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final a f34500a;

    /* renamed from: b  reason: collision with root package name */
    private final h f34501b;

    /* renamed from: c  reason: collision with root package name */
    private final d f34502c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34503d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, h hVar, d dVar, boolean z10) {
        this.f34500a = aVar;
        this.f34501b = hVar;
        this.f34502c = dVar;
        this.f34503d = z10;
    }

    public a a() {
        return this.f34500a;
    }

    public h b() {
        return this.f34501b;
    }

    public d c() {
        return this.f34502c;
    }

    public boolean d() {
        return this.f34503d;
    }
}
