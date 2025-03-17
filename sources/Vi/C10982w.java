package Vi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"LVi/w;", "", "", "name", "description", "imageUrl", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.w  reason: case insensitive filesystem */
public final class C10982w {

    /* renamed from: a  reason: collision with root package name */
    private final String f88647a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88648b;

    /* renamed from: c  reason: collision with root package name */
    private final String f88649c;

    /* renamed from: d  reason: collision with root package name */
    private final int f88650d;

    public C10982w(String str, String str2, String str3, int i10) {
        C17542s.j(str, "name");
        C17542s.j(str2, "description");
        C17542s.j(str3, "imageUrl");
        this.f88647a = str;
        this.f88648b = str2;
        this.f88649c = str3;
        this.f88650d = i10;
    }

    public final String a() {
        return this.f88648b;
    }

    public final String b() {
        return this.f88649c;
    }

    public final String c() {
        return this.f88647a;
    }

    public final int d() {
        return this.f88650d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10982w)) {
            return false;
        }
        C10982w wVar = (C10982w) obj;
        return C17542s.e(this.f88647a, wVar.f88647a) && C17542s.e(this.f88648b, wVar.f88648b) && C17542s.e(this.f88649c, wVar.f88649c) && this.f88650d == wVar.f88650d;
    }

    public int hashCode() {
        return (((((this.f88647a.hashCode() * 31) + this.f88648b.hashCode()) * 31) + this.f88649c.hashCode()) * 31) + Integer.hashCode(this.f88650d);
    }

    public String toString() {
        String str = this.f88647a;
        String str2 = this.f88648b;
        String str3 = this.f88649c;
        int i10 = this.f88650d;
        return "ConfirmQuantityProductCardModel(name=" + str + ", description=" + str2 + ", imageUrl=" + str3 + ", quantity=" + i10 + ")";
    }
}
