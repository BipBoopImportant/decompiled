package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010(\u001a\u00020\f8\u0010XD¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b#\u0010\u001c¨\u0006)"}, d2 = {"Lm0/n;", "Lm0/q;", "", "v1", "v2", "<init>", "(FF)V", "LXH/N;", "d", "()V", "h", "()Lm0/n;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "b", "g", "setV2$animation_core_release", "c", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.n  reason: case insensitive filesystem */
public final class C5556n extends C5562q {

    /* renamed from: a  reason: collision with root package name */
    private float f25856a;

    /* renamed from: b  reason: collision with root package name */
    private float f25857b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25858c = 2;

    public C5556n(float f10, float f11) {
        super((DefaultConstructorMarker) null);
        this.f25856a = f10;
        this.f25857b = f11;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f25856a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f25857b;
    }

    public int b() {
        return this.f25858c;
    }

    public void d() {
        this.f25856a = 0.0f;
        this.f25857b = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f25856a = f10;
        } else if (i10 == 1) {
            this.f25857b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5556n) {
            C5556n nVar = (C5556n) obj;
            return nVar.f25856a == this.f25856a && nVar.f25857b == this.f25857b;
        }
    }

    public final float f() {
        return this.f25856a;
    }

    public final float g() {
        return this.f25857b;
    }

    /* renamed from: h */
    public C5556n c() {
        return new C5556n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f25856a) * 31) + Float.hashCode(this.f25857b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f25856a + ", v2 = " + this.f25857b;
    }
}
