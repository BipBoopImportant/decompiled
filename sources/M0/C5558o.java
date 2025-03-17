package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010+\u001a\u00020\r8\u0010XD¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b$\u0010\u001d¨\u0006,"}, d2 = {"Lm0/o;", "Lm0/q;", "", "v1", "v2", "v3", "<init>", "(FFF)V", "LXH/N;", "d", "()V", "f", "()Lm0/o;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", "b", "getV2", "setV2$animation_core_release", "c", "getV3", "setV3$animation_core_release", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.o  reason: case insensitive filesystem */
public final class C5558o extends C5562q {

    /* renamed from: a  reason: collision with root package name */
    private float f25860a;

    /* renamed from: b  reason: collision with root package name */
    private float f25861b;

    /* renamed from: c  reason: collision with root package name */
    private float f25862c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25863d = 3;

    public C5558o(float f10, float f11, float f12) {
        super((DefaultConstructorMarker) null);
        this.f25860a = f10;
        this.f25861b = f11;
        this.f25862c = f12;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f25860a;
        }
        if (i10 == 1) {
            return this.f25861b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f25862c;
    }

    public int b() {
        return this.f25863d;
    }

    public void d() {
        this.f25860a = 0.0f;
        this.f25861b = 0.0f;
        this.f25862c = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f25860a = f10;
        } else if (i10 == 1) {
            this.f25861b = f10;
        } else if (i10 == 2) {
            this.f25862c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5558o) {
            C5558o oVar = (C5558o) obj;
            return oVar.f25860a == this.f25860a && oVar.f25861b == this.f25861b && oVar.f25862c == this.f25862c;
        }
    }

    /* renamed from: f */
    public C5558o c() {
        return new C5558o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f25860a) * 31) + Float.hashCode(this.f25861b)) * 31) + Float.hashCode(this.f25862c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f25860a + ", v2 = " + this.f25861b + ", v3 = " + this.f25862c;
    }
}
