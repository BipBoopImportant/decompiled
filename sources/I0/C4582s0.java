package I0;

import XH.C16814e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"LI0/s0;", "", "", "basis", "factorAtMin", "factorAtMax", "<init>", "(FFF)V", "overflow", "a", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "getBasis", "()F", "b", "getFactorAtMin", "c", "getFactorAtMax", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: I0.s0  reason: case insensitive filesystem */
public final class C4582s0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f8358a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8359b;

    /* renamed from: c  reason: collision with root package name */
    private final float f8360c;

    public C4582s0(float f10, float f11, float f12) {
        this.f8358a = f10;
        this.f8359b = f11;
        this.f8360c = f12;
    }

    public final float a(float f10) {
        float f11 = f10 < 0.0f ? this.f8359b : this.f8360c;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f8358a;
        float f13 = f10 / f12;
        if (f13 < -1.0f) {
            f13 = -1.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return (f12 / f11) * ((float) Math.sin((double) ((f13 * 3.1415927f) / ((float) 2))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4582s0)) {
            return false;
        }
        C4582s0 s0Var = (C4582s0) obj;
        return this.f8358a == s0Var.f8358a && this.f8359b == s0Var.f8359b && this.f8360c == s0Var.f8360c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f8358a) * 31) + Float.hashCode(this.f8359b)) * 31) + Float.hashCode(this.f8360c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f8358a + ", factorAtMin=" + this.f8359b + ", factorAtMax=" + this.f8360c + ')';
    }
}
