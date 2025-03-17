package jC;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, d2 = {"LjC/f;", "", "Lp1/v0;", "system", "light", "dark", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f127861a;

    /* renamed from: b  reason: collision with root package name */
    private final long f127862b;

    /* renamed from: c  reason: collision with root package name */
    private final long f127863c;

    public /* synthetic */ f(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f127863c;
    }

    public final long b() {
        return this.f127862b;
    }

    public final long c() {
        return this.f127861a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C5747v0.q(this.f127861a, fVar.f127861a) && C5747v0.q(this.f127862b, fVar.f127862b) && C5747v0.q(this.f127863c, fVar.f127863c);
    }

    public int hashCode() {
        return (((C5747v0.w(this.f127861a) * 31) + C5747v0.w(this.f127862b)) * 31) + C5747v0.w(this.f127863c);
    }

    public String toString() {
        String x10 = C5747v0.x(this.f127861a);
        String x11 = C5747v0.x(this.f127862b);
        String x12 = C5747v0.x(this.f127863c);
        return "ScrimColors(system=" + x10 + ", light=" + x11 + ", dark=" + x12 + ")";
    }

    private f(long j10, long j11, long j12) {
        this.f127861a = j10;
        this.f127862b = j11;
        this.f127863c = j12;
    }
}
