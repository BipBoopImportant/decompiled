package l2;

public class e extends C5519c {

    /* renamed from: f  reason: collision with root package name */
    float f25470f;

    public e(char[] cArr) {
        super(cArr);
        this.f25470f = Float.NaN;
    }

    public static C5519c L(char[] cArr) {
        return new e(cArr);
    }

    /* access modifiers changed from: protected */
    public String K() {
        float p10 = p();
        int i10 = (int) p10;
        if (((float) i10) == p10) {
            return "" + i10;
        }
        return "" + p10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        float p10 = p();
        float p11 = ((e) obj).p();
        return (Float.isNaN(p10) && Float.isNaN(p11)) || p10 == p11;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        float f10 = this.f25470f;
        return hashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public float p() {
        if (Float.isNaN(this.f25470f) && C()) {
            this.f25470f = Float.parseFloat(j());
        }
        return this.f25470f;
    }

    public int r() {
        if (Float.isNaN(this.f25470f) && C()) {
            this.f25470f = (float) Integer.parseInt(j());
        }
        return (int) this.f25470f;
    }

    public e(float f10) {
        super((char[]) null);
        this.f25470f = f10;
    }
}
