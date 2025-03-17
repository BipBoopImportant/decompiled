package g6;

import T5.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg6/o;", "", "", "url", "method", "Lg6/n;", "headers", "Lg6/p;", "body", "LT5/l;", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lg6/n;Lg6/p;LT5/l;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "c", "Lg6/n;", "()Lg6/n;", "Lg6/p;", "()Lg6/p;", "e", "LT5/l;", "getExtras", "()LT5/l;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.o  reason: case insensitive filesystem */
public final class C7887o {

    /* renamed from: a  reason: collision with root package name */
    private final String f51330a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51331b;

    /* renamed from: c  reason: collision with root package name */
    private final C7886n f51332c;

    /* renamed from: d  reason: collision with root package name */
    private final C7888p f51333d;

    /* renamed from: e  reason: collision with root package name */
    private final l f51334e;

    public C7887o(String str, String str2, C7886n nVar, C7888p pVar, l lVar) {
        this.f51330a = str;
        this.f51331b = str2;
        this.f51332c = nVar;
        this.f51333d = pVar;
        this.f51334e = lVar;
    }

    public final C7888p a() {
        return this.f51333d;
    }

    public final C7886n b() {
        return this.f51332c;
    }

    public final String c() {
        return this.f51331b;
    }

    public final String d() {
        return this.f51330a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7887o)) {
            return false;
        }
        C7887o oVar = (C7887o) obj;
        return C17542s.e(this.f51330a, oVar.f51330a) && C17542s.e(this.f51331b, oVar.f51331b) && C17542s.e(this.f51332c, oVar.f51332c) && C17542s.e(this.f51333d, oVar.f51333d) && C17542s.e(this.f51334e, oVar.f51334e);
    }

    public int hashCode() {
        int hashCode = ((((this.f51330a.hashCode() * 31) + this.f51331b.hashCode()) * 31) + this.f51332c.hashCode()) * 31;
        C7888p pVar = this.f51333d;
        return ((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + this.f51334e.hashCode();
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f51330a + ", method=" + this.f51331b + ", headers=" + this.f51332c + ", body=" + this.f51333d + ", extras=" + this.f51334e + ')';
    }
}
