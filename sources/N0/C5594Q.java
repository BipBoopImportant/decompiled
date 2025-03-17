package n0;

import androidx.compose.foundation.layout.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.C5751x0;
import s0.C5834E;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ln0/Q;", "", "Lp1/v0;", "glowColor", "Ls0/E;", "drawPadding", "<init>", "(JLs0/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "Ls0/E;", "()Ls0/E;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.Q  reason: case insensitive filesystem */
public final class C5594Q {

    /* renamed from: a  reason: collision with root package name */
    private final long f26380a;

    /* renamed from: b  reason: collision with root package name */
    private final C5834E f26381b;

    public /* synthetic */ C5594Q(long j10, C5834E e10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, e10);
    }

    public final C5834E a() {
        return this.f26381b;
    }

    public final long b() {
        return this.f26380a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C5594Q.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C5594Q q10 = (C5594Q) obj;
        return C5747v0.q(this.f26380a, q10.f26380a) && C17542s.e(this.f26381b, q10.f26381b);
    }

    public int hashCode() {
        return (C5747v0.w(this.f26380a) * 31) + this.f26381b.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + C5747v0.x(this.f26380a) + ", drawPadding=" + this.f26381b + ')';
    }

    private C5594Q(long j10, C5834E e10) {
        this.f26380a = j10;
        this.f26381b = e10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5594Q(long j10, C5834E e10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C5751x0.d(4284900966L) : j10, (i10 & 2) != 0 ? D.c(0.0f, 0.0f, 3, (Object) null) : e10, (DefaultConstructorMarker) null);
    }
}
