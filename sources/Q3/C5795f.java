package q3;

/* renamed from: q3.f  reason: case insensitive filesystem */
public final class C5795f {

    /* renamed from: a  reason: collision with root package name */
    public final int f28126a;

    /* renamed from: b  reason: collision with root package name */
    public final float f28127b;

    public C5795f(int i10, float f10) {
        this.f28126a = i10;
        this.f28127b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5795f.class != obj.getClass()) {
            return false;
        }
        C5795f fVar = (C5795f) obj;
        return this.f28126a == fVar.f28126a && Float.compare(fVar.f28127b, this.f28127b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f28126a) * 31) + Float.floatToIntBits(this.f28127b);
    }
}
