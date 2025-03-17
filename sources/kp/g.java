package kp;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lkp/g;", "", "", "id", "title", "subTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f99054a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99055b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99056c;

    public g(String str, String str2, String str3) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        this.f99054a = str;
        this.f99055b = str2;
        this.f99056c = str3;
    }

    public final String a() {
        return this.f99054a;
    }

    public final String b() {
        return this.f99056c;
    }

    public final String c() {
        return this.f99055b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f99054a, gVar.f99054a) && C17542s.e(this.f99055b, gVar.f99055b) && C17542s.e(this.f99056c, gVar.f99056c);
    }

    public int hashCode() {
        int hashCode = ((this.f99054a.hashCode() * 31) + this.f99055b.hashCode()) * 31;
        String str = this.f99056c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f99054a;
        String str2 = this.f99055b;
        String str3 = this.f99056c;
        return "ProductCategory(id=" + str + ", title=" + str2 + ", subTitle=" + str3 + ")";
    }
}
