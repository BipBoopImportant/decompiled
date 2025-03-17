package pK;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"LpK/c;", "", "LpK/f;", "userOffset", "LpK/g;", "userZoom", "Lo1/g;", "lastCentroid", "<init>", "(JFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JFJ)LpK/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "b", "F", "d", "()F", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.c  reason: case insensitive filesystem */
public final class C17758c {

    /* renamed from: a  reason: collision with root package name */
    private final long f146365a;

    /* renamed from: b  reason: collision with root package name */
    private final float f146366b;

    /* renamed from: c  reason: collision with root package name */
    private final long f146367c;

    public /* synthetic */ C17758c(long j10, float f10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, f10, j11);
    }

    public final C17758c a(long j10, float f10, long j11) {
        return new C17758c(j10, f10, j11, (DefaultConstructorMarker) null);
    }

    public final long b() {
        return this.f146367c;
    }

    public final long c() {
        return this.f146365a;
    }

    public final float d() {
        return this.f146366b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17758c)) {
            return false;
        }
        C17758c cVar = (C17758c) obj;
        return C17761f.b(this.f146365a, cVar.f146365a) && C17762g.b(this.f146366b, cVar.f146366b) && C5667g.j(this.f146367c, cVar.f146367c);
    }

    public int hashCode() {
        return (((C17761f.c(this.f146365a) * 31) + C17762g.c(this.f146366b)) * 31) + C5667g.o(this.f146367c);
    }

    public String toString() {
        String e10 = C17761f.e(this.f146365a);
        String d10 = C17762g.d(this.f146366b);
        String t10 = C5667g.t(this.f146367c);
        return "GestureState(userOffset=" + e10 + ", userZoom=" + d10 + ", lastCentroid=" + t10 + ")";
    }

    private C17758c(long j10, float f10, long j11) {
        this.f146365a = j10;
        this.f146366b = f10;
        this.f146367c = j11;
    }
}
