package E1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"LE1/n;", "LE1/k;", "", "value", "<init>", "(F)V", "Lo1/m;", "srcSize", "dstSize", "LE1/h0;", "a", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getValue", "()F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.n  reason: case insensitive filesystem */
public final class C4481n implements C4478k {

    /* renamed from: b  reason: collision with root package name */
    private final float f5947b;

    public C4481n(float f10) {
        this.f5947b = f10;
    }

    public long a(long j10, long j11) {
        float f10 = this.f5947b;
        return i0.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4481n) && Float.compare(this.f5947b, ((C4481n) obj).f5947b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f5947b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f5947b + ')';
    }
}
