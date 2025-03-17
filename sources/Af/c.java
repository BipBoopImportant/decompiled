package af;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10027d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Laf/c;", "", "", "headerImageRes", "titleRes", "bodyRes", "learnMoreRes", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "c", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f65289a;

    /* renamed from: b  reason: collision with root package name */
    private final int f65290b;

    /* renamed from: c  reason: collision with root package name */
    private final int f65291c;

    /* renamed from: d  reason: collision with root package name */
    private final int f65292d;

    public c() {
        this(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    public final int a() {
        return this.f65291c;
    }

    public final int b() {
        return this.f65289a;
    }

    public final int c() {
        return this.f65292d;
    }

    public final int d() {
        return this.f65290b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f65289a == cVar.f65289a && this.f65290b == cVar.f65290b && this.f65291c == cVar.f65291c && this.f65292d == cVar.f65292d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f65289a) * 31) + Integer.hashCode(this.f65290b)) * 31) + Integer.hashCode(this.f65291c)) * 31) + Integer.hashCode(this.f65292d);
    }

    public String toString() {
        int i10 = this.f65289a;
        int i11 = this.f65290b;
        int i12 = this.f65291c;
        int i13 = this.f65292d;
        return "DataControlsHeaderDelegateModel(headerImageRes=" + i10 + ", titleRes=" + i11 + ", bodyRes=" + i12 + ", learnMoreRes=" + i13 + ")";
    }

    public c(int i10, int i11, int i12, int i13) {
        this.f65289a = i10;
        this.f65290b = i11;
        this.f65291c = i12;
        this.f65292d = i13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C10027d.f75273d : i10, (i14 & 2) != 0 ? We.c.f64720b : i11, (i14 & 4) != 0 ? We.c.f64726h : i12, (i14 & 8) != 0 ? -1 : i13);
    }
}
