package H0;

import B0.C4369m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"LH0/A;", "", "LB0/m;", "handle", "Lo1/g;", "position", "LH0/z;", "anchor", "", "visible", "<init>", "(LB0/m;JLH0/z;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LB0/m;", "getHandle", "()LB0/m;", "b", "J", "getPosition-F1C5BW0", "()J", "c", "LH0/z;", "getAnchor", "()LH0/z;", "d", "Z", "getVisible", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final C4369m f6683a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6684b;

    /* renamed from: c  reason: collision with root package name */
    private final z f6685c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6686d;

    public /* synthetic */ A(C4369m mVar, long j10, z zVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, j10, zVar, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f6683a == a10.f6683a && C5667g.j(this.f6684b, a10.f6684b) && this.f6685c == a10.f6685c && this.f6686d == a10.f6686d;
    }

    public int hashCode() {
        return (((((this.f6683a.hashCode() * 31) + C5667g.o(this.f6684b)) * 31) + this.f6685c.hashCode()) * 31) + Boolean.hashCode(this.f6686d);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f6683a + ", position=" + C5667g.t(this.f6684b) + ", anchor=" + this.f6685c + ", visible=" + this.f6686d + ')';
    }

    private A(C4369m mVar, long j10, z zVar, boolean z10) {
        this.f6683a = mVar;
        this.f6684b = j10;
        this.f6685c = zVar;
        this.f6686d = z10;
    }
}
