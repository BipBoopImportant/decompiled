package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010.\u001a\u00020\u000e8\u0010XD¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b%\u0010\u001e¨\u0006/"}, d2 = {"Lm0/p;", "Lm0/q;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "LXH/N;", "d", "()V", "j", "()Lm0/p;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "b", "g", "setV2$animation_core_release", "c", "h", "setV3$animation_core_release", "i", "setV4$animation_core_release", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.p  reason: case insensitive filesystem */
public final class C5560p extends C5562q {

    /* renamed from: a  reason: collision with root package name */
    private float f25867a;

    /* renamed from: b  reason: collision with root package name */
    private float f25868b;

    /* renamed from: c  reason: collision with root package name */
    private float f25869c;

    /* renamed from: d  reason: collision with root package name */
    private float f25870d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25871e = 4;

    public C5560p(float f10, float f11, float f12, float f13) {
        super((DefaultConstructorMarker) null);
        this.f25867a = f10;
        this.f25868b = f11;
        this.f25869c = f12;
        this.f25870d = f13;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f25867a;
        }
        if (i10 == 1) {
            return this.f25868b;
        }
        if (i10 == 2) {
            return this.f25869c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f25870d;
    }

    public int b() {
        return this.f25871e;
    }

    public void d() {
        this.f25867a = 0.0f;
        this.f25868b = 0.0f;
        this.f25869c = 0.0f;
        this.f25870d = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f25867a = f10;
        } else if (i10 == 1) {
            this.f25868b = f10;
        } else if (i10 == 2) {
            this.f25869c = f10;
        } else if (i10 == 3) {
            this.f25870d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5560p) {
            C5560p pVar = (C5560p) obj;
            return pVar.f25867a == this.f25867a && pVar.f25868b == this.f25868b && pVar.f25869c == this.f25869c && pVar.f25870d == this.f25870d;
        }
    }

    public final float f() {
        return this.f25867a;
    }

    public final float g() {
        return this.f25868b;
    }

    public final float h() {
        return this.f25869c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f25867a) * 31) + Float.hashCode(this.f25868b)) * 31) + Float.hashCode(this.f25869c)) * 31) + Float.hashCode(this.f25870d);
    }

    public final float i() {
        return this.f25870d;
    }

    /* renamed from: j */
    public C5560p c() {
        return new C5560p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f25867a + ", v2 = " + this.f25868b + ", v3 = " + this.f25869c + ", v4 = " + this.f25870d;
    }
}
