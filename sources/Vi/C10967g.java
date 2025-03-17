package Vi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, d2 = {"LVi/g;", "", "", "code", "title", "description", "", "completed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.g  reason: case insensitive filesystem */
public final class C10967g {

    /* renamed from: a  reason: collision with root package name */
    private final String f88575a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88576b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88577c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f88578d;

    public C10967g(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "code");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
        this.f88575a = str;
        this.f88576b = str2;
        this.f88577c = str3;
        this.f88578d = z10;
    }

    public final String a() {
        return this.f88575a;
    }

    public final boolean b() {
        return this.f88578d;
    }

    public final String c() {
        return this.f88577c;
    }

    public final String d() {
        return this.f88576b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10967g)) {
            return false;
        }
        C10967g gVar = (C10967g) obj;
        return C17542s.e(this.f88575a, gVar.f88575a) && C17542s.e(this.f88576b, gVar.f88576b) && C17542s.e(this.f88577c, gVar.f88577c) && this.f88578d == gVar.f88578d;
    }

    public int hashCode() {
        return (((((this.f88575a.hashCode() * 31) + this.f88576b.hashCode()) * 31) + this.f88577c.hashCode()) * 31) + Boolean.hashCode(this.f88578d);
    }

    public String toString() {
        String str = this.f88575a;
        String str2 = this.f88576b;
        String str3 = this.f88577c;
        boolean z10 = this.f88578d;
        return "CheckoutQrCodeDelegateModel(code=" + str + ", title=" + str2 + ", description=" + str3 + ", completed=" + z10 + ")";
    }
}
