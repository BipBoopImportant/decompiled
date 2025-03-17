package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005R\u001a\u0010#\u001a\u00020\u000b8\u0010XD¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lm0/m;", "Lm0/q;", "", "initVal", "<init>", "(F)V", "LXH/N;", "d", "()V", "g", "()Lm0/m;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", "F", "f", "()F", "setValue$animation_core_release", "b", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.m  reason: case insensitive filesystem */
public final class C5554m extends C5562q {

    /* renamed from: a  reason: collision with root package name */
    private float f25847a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25848b = 1;

    public C5554m(float f10) {
        super((DefaultConstructorMarker) null);
        this.f25847a = f10;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f25847a;
        }
        return 0.0f;
    }

    public int b() {
        return this.f25848b;
    }

    public void d() {
        this.f25847a = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f25847a = f10;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5554m) && ((C5554m) obj).f25847a == this.f25847a;
    }

    public final float f() {
        return this.f25847a;
    }

    /* renamed from: g */
    public C5554m c() {
        return new C5554m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f25847a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f25847a;
    }
}
