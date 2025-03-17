package Mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0019"}, d2 = {"LMi/f;", "", "", "displayValue", "", "value", "label", "<init>", "(Ljava/lang/String;FLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayValue", "b", "F", "()F", "c", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mi.f  reason: case insensitive filesystem */
public final class C10771f {

    /* renamed from: a  reason: collision with root package name */
    private final String f83388a;

    /* renamed from: b  reason: collision with root package name */
    private final float f83389b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83390c;

    public C10771f(String str, float f10, String str2) {
        C17542s.j(str, "displayValue");
        C17542s.j(str2, "label");
        this.f83388a = str;
        this.f83389b = f10;
        this.f83390c = str2;
    }

    public final String a() {
        return this.f83390c;
    }

    public final float b() {
        return this.f83389b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10771f)) {
            return false;
        }
        C10771f fVar = (C10771f) obj;
        return C17542s.e(this.f83388a, fVar.f83388a) && Float.compare(this.f83389b, fVar.f83389b) == 0 && C17542s.e(this.f83390c, fVar.f83390c);
    }

    public int hashCode() {
        return (((this.f83388a.hashCode() * 31) + Float.hashCode(this.f83389b)) * 31) + this.f83390c.hashCode();
    }

    public String toString() {
        String str = this.f83388a;
        float f10 = this.f83389b;
        String str2 = this.f83390c;
        return "ProductDetailedRating(displayValue=" + str + ", value=" + f10 + ", label=" + str2 + ")";
    }
}
