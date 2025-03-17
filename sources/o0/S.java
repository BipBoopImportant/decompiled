package O0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"LO0/S;", "", "Lp1/v0;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "(JJJJ)LO0/S;", "", "enabled", "a", "(Z)J", "b", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "e", "getDisabledContainerColor-0d7_KjU", "d", "getDisabledContentColor-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class S {

    /* renamed from: a  reason: collision with root package name */
    private final long f9991a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9992b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9993c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9994d;

    public /* synthetic */ S(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public static /* synthetic */ S d(S s10, long j10, long j11, long j12, long j13, int i10, Object obj) {
        S s11 = s10;
        return s10.c((i10 & 1) != 0 ? s11.f9991a : j10, (i10 & 2) != 0 ? s11.f9992b : j11, (i10 & 4) != 0 ? s11.f9993c : j12, (i10 & 8) != 0 ? s11.f9994d : j13);
    }

    public final long a(boolean z10) {
        return z10 ? this.f9991a : this.f9993c;
    }

    public final long b(boolean z10) {
        return z10 ? this.f9992b : this.f9994d;
    }

    public final S c(long j10, long j11, long j12, long j13) {
        return new S(j10 != 16 ? j10 : this.f9991a, j11 != 16 ? j11 : this.f9992b, j12 != 16 ? j12 : this.f9993c, j13 != 16 ? j13 : this.f9994d, (DefaultConstructorMarker) null);
    }

    public final long e() {
        return this.f9992b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return C5747v0.q(this.f9991a, s10.f9991a) && C5747v0.q(this.f9992b, s10.f9992b) && C5747v0.q(this.f9993c, s10.f9993c) && C5747v0.q(this.f9994d, s10.f9994d);
    }

    public int hashCode() {
        return (((((C5747v0.w(this.f9991a) * 31) + C5747v0.w(this.f9992b)) * 31) + C5747v0.w(this.f9993c)) * 31) + C5747v0.w(this.f9994d);
    }

    private S(long j10, long j11, long j12, long j13) {
        this.f9991a = j10;
        this.f9992b = j11;
        this.f9993c = j12;
        this.f9994d = j13;
    }
}
