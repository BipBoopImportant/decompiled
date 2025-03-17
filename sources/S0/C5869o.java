package s0;

import c2.d;
import c2.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Ls0/o;", "Ls0/T;", "", "leftVal", "topVal", "rightVal", "bottomVal", "<init>", "(IIII)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.o  reason: case insensitive filesystem */
final class C5869o implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final int f28829b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28830c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28831d;

    /* renamed from: e  reason: collision with root package name */
    private final int f28832e;

    public C5869o(int i10, int i11, int i12, int i13) {
        this.f28829b = i10;
        this.f28830c = i11;
        this.f28831d = i12;
        this.f28832e = i13;
    }

    public int a(d dVar) {
        return this.f28830c;
    }

    public int b(d dVar) {
        return this.f28832e;
    }

    public int c(d dVar, t tVar) {
        return this.f28829b;
    }

    public int d(d dVar, t tVar) {
        return this.f28831d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5869o)) {
            return false;
        }
        C5869o oVar = (C5869o) obj;
        return this.f28829b == oVar.f28829b && this.f28830c == oVar.f28830c && this.f28831d == oVar.f28831d && this.f28832e == oVar.f28832e;
    }

    public int hashCode() {
        return (((((this.f28829b * 31) + this.f28830c) * 31) + this.f28831d) * 31) + this.f28832e;
    }

    public String toString() {
        return "Insets(left=" + this.f28829b + ", top=" + this.f28830c + ", right=" + this.f28831d + ", bottom=" + this.f28832e + ')';
    }
}
