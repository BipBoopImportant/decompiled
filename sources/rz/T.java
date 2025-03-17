package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrz/T;", "", "", "itemNo", "text", "imageUrl", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T {

    /* renamed from: a  reason: collision with root package name */
    private final String f130770a;

    /* renamed from: b  reason: collision with root package name */
    private final String f130771b;

    /* renamed from: c  reason: collision with root package name */
    private final String f130772c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f130773d;

    public T(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "text");
        C17542s.j(str3, "imageUrl");
        this.f130770a = str;
        this.f130771b = str2;
        this.f130772c = str3;
        this.f130773d = z10;
    }

    public final String a() {
        return this.f130772c;
    }

    public final String b() {
        return this.f130770a;
    }

    public final String c() {
        return this.f130771b;
    }

    public final boolean d() {
        return this.f130773d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        return C17542s.e(this.f130770a, t10.f130770a) && C17542s.e(this.f130771b, t10.f130771b) && C17542s.e(this.f130772c, t10.f130772c) && this.f130773d == t10.f130773d;
    }

    public int hashCode() {
        return (((((this.f130770a.hashCode() * 31) + this.f130771b.hashCode()) * 31) + this.f130772c.hashCode()) * 31) + Boolean.hashCode(this.f130773d);
    }

    public String toString() {
        String str = this.f130770a;
        String str2 = this.f130771b;
        String str3 = this.f130772c;
        boolean z10 = this.f130773d;
        return "ShopAndGoOptionValue(itemNo=" + str + ", text=" + str2 + ", imageUrl=" + str3 + ", isSelected=" + z10 + ")";
    }
}
