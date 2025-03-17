package Hj;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"LHj/a;", "LHj/x;", "", "barcode", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", "getMessage", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hj.a  reason: case insensitive filesystem */
public final class C10720a extends x {

    /* renamed from: b  reason: collision with root package name */
    private final String f81274b;

    /* renamed from: c  reason: collision with root package name */
    private final String f81275c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10720a(String str, String str2) {
        super(str2, (DefaultConstructorMarker) null);
        C17542s.j(str, "barcode");
        C17542s.j(str2, "message");
        this.f81274b = str;
        this.f81275c = str2;
    }

    public final String a() {
        return this.f81274b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10720a)) {
            return false;
        }
        C10720a aVar = (C10720a) obj;
        return C17542s.e(this.f81274b, aVar.f81274b) && C17542s.e(this.f81275c, aVar.f81275c);
    }

    public String getMessage() {
        return this.f81275c;
    }

    public int hashCode() {
        return (this.f81274b.hashCode() * 31) + this.f81275c.hashCode();
    }

    public String toString() {
        String str = this.f81274b;
        String str2 = this.f81275c;
        return "InvalidBarcodeException(barcode=" + str + ", message=" + str2 + ")";
    }
}
