package k7;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m7.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Lk7/d;", "", "Lm7/c;", "tag", "", "headerLength", "dataLength", "<init>", "(Lm7/c;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm7/c;", "b", "()Lm7/c;", "I", "c", "getDataLength", "totalLength", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k7.d  reason: case insensitive filesystem */
public final class C8464d {

    /* renamed from: a  reason: collision with root package name */
    private final c f54299a;

    /* renamed from: b  reason: collision with root package name */
    private final int f54300b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54301c;

    public C8464d(c cVar, int i10, int i11) {
        C17542s.j(cVar, "tag");
        this.f54299a = cVar;
        this.f54300b = i10;
        this.f54301c = i11;
    }

    public final int a() {
        return this.f54300b;
    }

    public final c b() {
        return this.f54299a;
    }

    public final int c() {
        return this.f54300b + this.f54301c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8464d)) {
            return false;
        }
        C8464d dVar = (C8464d) obj;
        return C17542s.e(this.f54299a, dVar.f54299a) && this.f54300b == dVar.f54300b && this.f54301c == dVar.f54301c;
    }

    public int hashCode() {
        return (((this.f54299a.hashCode() * 31) + Integer.hashCode(this.f54300b)) * 31) + Integer.hashCode(this.f54301c);
    }

    public String toString() {
        return "ASN1Header(tag=" + this.f54299a + ", headerLength=" + this.f54300b + ", dataLength=" + this.f54301c + ')';
    }
}
