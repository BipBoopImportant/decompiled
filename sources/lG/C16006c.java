package LG;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"LLG/c;", "", "", "imageRes", "contentDescriptionRes", "rating", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LG.c  reason: case insensitive filesystem */
public final class C16006c {

    /* renamed from: a  reason: collision with root package name */
    private final int f136025a;

    /* renamed from: b  reason: collision with root package name */
    private final int f136026b;

    /* renamed from: c  reason: collision with root package name */
    private final int f136027c;

    public C16006c(int i10, int i11, int i12) {
        this.f136025a = i10;
        this.f136026b = i11;
        this.f136027c = i12;
    }

    public final int a() {
        return this.f136026b;
    }

    public final int b() {
        return this.f136025a;
    }

    public final int c() {
        return this.f136027c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16006c)) {
            return false;
        }
        C16006c cVar = (C16006c) obj;
        return this.f136025a == cVar.f136025a && this.f136026b == cVar.f136026b && this.f136027c == cVar.f136027c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f136025a) * 31) + Integer.hashCode(this.f136026b)) * 31) + Integer.hashCode(this.f136027c);
    }

    public String toString() {
        int i10 = this.f136025a;
        int i11 = this.f136026b;
        int i12 = this.f136027c;
        return "SmileIcon(imageRes=" + i10 + ", contentDescriptionRes=" + i11 + ", rating=" + i12 + ")";
    }
}
