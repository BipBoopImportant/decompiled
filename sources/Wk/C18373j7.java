package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"LwK/j7;", "", "LN1/Y;", "integerTextStyle", "decimalTextStyle", "subscriptTextStyle", "currencyTextStyle", "<init>", "(LN1/Y;LN1/Y;LN1/Y;LN1/Y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/Y;", "c", "()LN1/Y;", "b", "d", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.j7  reason: case insensitive filesystem */
public final class C18373j7 {

    /* renamed from: a  reason: collision with root package name */
    private final Y f151091a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f151092b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f151093c;

    /* renamed from: d  reason: collision with root package name */
    private final Y f151094d;

    public C18373j7(Y y10, Y y11, Y y12, Y y13) {
        C17542s.j(y10, "integerTextStyle");
        C17542s.j(y11, "decimalTextStyle");
        C17542s.j(y12, "subscriptTextStyle");
        C17542s.j(y13, "currencyTextStyle");
        this.f151091a = y10;
        this.f151092b = y11;
        this.f151093c = y12;
        this.f151094d = y13;
    }

    public final Y a() {
        return this.f151094d;
    }

    public final Y b() {
        return this.f151092b;
    }

    public final Y c() {
        return this.f151091a;
    }

    public final Y d() {
        return this.f151093c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18373j7)) {
            return false;
        }
        C18373j7 j7Var = (C18373j7) obj;
        return C17542s.e(this.f151091a, j7Var.f151091a) && C17542s.e(this.f151092b, j7Var.f151092b) && C17542s.e(this.f151093c, j7Var.f151093c) && C17542s.e(this.f151094d, j7Var.f151094d);
    }

    public int hashCode() {
        return (((((this.f151091a.hashCode() * 31) + this.f151092b.hashCode()) * 31) + this.f151093c.hashCode()) * 31) + this.f151094d.hashCode();
    }

    public String toString() {
        Y y10 = this.f151091a;
        Y y11 = this.f151092b;
        Y y12 = this.f151093c;
        Y y13 = this.f151094d;
        return "PriceStyle(integerTextStyle=" + y10 + ", decimalTextStyle=" + y11 + ", subscriptTextStyle=" + y12 + ", currencyTextStyle=" + y13 + ")";
    }
}
