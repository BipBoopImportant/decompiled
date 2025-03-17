package s0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0017"}, d2 = {"Ls0/x;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "d", "c", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.x  reason: case insensitive filesystem */
public final class C5878x {

    /* renamed from: a  reason: collision with root package name */
    private final int f28852a;

    /* renamed from: b  reason: collision with root package name */
    private final int f28853b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28854c;

    /* renamed from: d  reason: collision with root package name */
    private final int f28855d;

    public C5878x(int i10, int i11, int i12, int i13) {
        this.f28852a = i10;
        this.f28853b = i11;
        this.f28854c = i12;
        this.f28855d = i13;
    }

    public final int a() {
        return this.f28855d;
    }

    public final int b() {
        return this.f28852a;
    }

    public final int c() {
        return this.f28854c;
    }

    public final int d() {
        return this.f28853b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5878x)) {
            return false;
        }
        C5878x xVar = (C5878x) obj;
        return this.f28852a == xVar.f28852a && this.f28853b == xVar.f28853b && this.f28854c == xVar.f28854c && this.f28855d == xVar.f28855d;
    }

    public int hashCode() {
        return (((((this.f28852a * 31) + this.f28853b) * 31) + this.f28854c) * 31) + this.f28855d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f28852a + ", top=" + this.f28853b + ", right=" + this.f28854c + ", bottom=" + this.f28855d + ')';
    }
}
