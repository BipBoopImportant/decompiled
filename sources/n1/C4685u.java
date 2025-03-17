package N1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, d2 = {"LN1/u;", "", "LN1/v;", "intrinsics", "", "startIndex", "endIndex", "<init>", "(LN1/v;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/v;", "b", "()LN1/v;", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.u  reason: case insensitive filesystem */
public final class C4685u {

    /* renamed from: a  reason: collision with root package name */
    private final C4686v f9504a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9505b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9506c;

    public C4685u(C4686v vVar, int i10, int i11) {
        this.f9504a = vVar;
        this.f9505b = i10;
        this.f9506c = i11;
    }

    public final int a() {
        return this.f9506c;
    }

    public final C4686v b() {
        return this.f9504a;
    }

    public final int c() {
        return this.f9505b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4685u)) {
            return false;
        }
        C4685u uVar = (C4685u) obj;
        return C17542s.e(this.f9504a, uVar.f9504a) && this.f9505b == uVar.f9505b && this.f9506c == uVar.f9506c;
    }

    public int hashCode() {
        return (((this.f9504a.hashCode() * 31) + Integer.hashCode(this.f9505b)) * 31) + Integer.hashCode(this.f9506c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f9504a + ", startIndex=" + this.f9505b + ", endIndex=" + this.f9506c + ')';
    }
}
