package wh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lwh/c;", "", "", "itemNo", "", "itemQuantity", "uom", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.c  reason: case insensitive filesystem */
public final class C10372c {

    /* renamed from: a  reason: collision with root package name */
    private final String f77663a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77664b;

    /* renamed from: c  reason: collision with root package name */
    private final String f77665c;

    public C10372c(String str, int i10, String str2) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "uom");
        this.f77663a = str;
        this.f77664b = i10;
        this.f77665c = str2;
    }

    public final String a() {
        return this.f77663a;
    }

    public final int b() {
        return this.f77664b;
    }

    public final String c() {
        return this.f77665c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10372c)) {
            return false;
        }
        C10372c cVar = (C10372c) obj;
        return C17542s.e(this.f77663a, cVar.f77663a) && this.f77664b == cVar.f77664b && C17542s.e(this.f77665c, cVar.f77665c);
    }

    public int hashCode() {
        return (((this.f77663a.hashCode() * 31) + Integer.hashCode(this.f77664b)) * 31) + this.f77665c.hashCode();
    }

    public String toString() {
        String str = this.f77663a;
        int i10 = this.f77664b;
        String str2 = this.f77665c;
        return "CartInputItem(itemNo=" + str + ", itemQuantity=" + i10 + ", uom=" + str2 + ")";
    }
}
