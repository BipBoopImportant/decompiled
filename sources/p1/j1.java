package p1;

import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lp1/j1;", "Lp1/l0;", "Lp1/v0;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lo1/m;", "size", "Lp1/S0;", "p", "", "alpha", "LXH/N;", "a", "(JLp1/S0;F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "b", "()J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j1 extends C5728l0 {

    /* renamed from: c  reason: collision with root package name */
    private final long f27316c;

    public /* synthetic */ j1(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public void a(long j10, S0 s02, float f10) {
        long j11;
        s02.d(1.0f);
        if (f10 == 1.0f) {
            j11 = this.f27316c;
        } else {
            long j12 = this.f27316c;
            j11 = C5747v0.o(j12, C5747v0.r(j12) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        }
        s02.j(j11);
        if (s02.r() != null) {
            s02.p((Shader) null);
        }
    }

    public final long b() {
        return this.f27316c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && C5747v0.q(this.f27316c, ((j1) obj).f27316c);
    }

    public int hashCode() {
        return C5747v0.w(this.f27316c);
    }

    public String toString() {
        return "SolidColor(value=" + C5747v0.x(this.f27316c) + ')';
    }

    private j1(long j10) {
        super((DefaultConstructorMarker) null);
        this.f27316c = j10;
    }
}
