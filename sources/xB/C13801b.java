package XB;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006#"}, d2 = {"LXB/b;", "", "", "title", "description", "imageUrl", "", "firstTimeShown", "LKJ/c;", "LXB/a;", "availableInfoItems", "unavailableInfoItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLKJ/c;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "Z", "()Z", "e", "LKJ/c;", "()LKJ/c;", "g", "showInfoServiceItems", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XB.b  reason: case insensitive filesystem */
public final class C13801b {

    /* renamed from: a  reason: collision with root package name */
    private final String f117768a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117769b;

    /* renamed from: c  reason: collision with root package name */
    private final String f117770c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f117771d;

    /* renamed from: e  reason: collision with root package name */
    private final C15987c<C13800a> f117772e;

    /* renamed from: f  reason: collision with root package name */
    private final C15987c<C13800a> f117773f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f117774g;

    public C13801b(String str, String str2, String str3, boolean z10, C15987c<C13800a> cVar, C15987c<C13800a> cVar2) {
        C17542s.j(cVar, "availableInfoItems");
        C17542s.j(cVar2, "unavailableInfoItems");
        this.f117768a = str;
        this.f117769b = str2;
        this.f117770c = str3;
        this.f117771d = z10;
        this.f117772e = cVar;
        this.f117773f = cVar2;
        this.f117774g = !cVar.isEmpty() || !cVar2.isEmpty();
    }

    public final C15987c<C13800a> a() {
        return this.f117772e;
    }

    public final String b() {
        return this.f117769b;
    }

    public final boolean c() {
        return this.f117771d;
    }

    public final String d() {
        return this.f117770c;
    }

    public final boolean e() {
        return this.f117774g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13801b)) {
            return false;
        }
        C13801b bVar = (C13801b) obj;
        return C17542s.e(this.f117768a, bVar.f117768a) && C17542s.e(this.f117769b, bVar.f117769b) && C17542s.e(this.f117770c, bVar.f117770c) && this.f117771d == bVar.f117771d && C17542s.e(this.f117772e, bVar.f117772e) && C17542s.e(this.f117773f, bVar.f117773f);
    }

    public final String f() {
        return this.f117768a;
    }

    public final C15987c<C13800a> g() {
        return this.f117773f;
    }

    public int hashCode() {
        String str = this.f117768a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117769b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117770c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f117771d)) * 31) + this.f117772e.hashCode()) * 31) + this.f117773f.hashCode();
    }

    public String toString() {
        String str = this.f117768a;
        String str2 = this.f117769b;
        String str3 = this.f117770c;
        boolean z10 = this.f117771d;
        C15987c<C13800a> cVar = this.f117772e;
        C15987c<C13800a> cVar2 = this.f117773f;
        return "SmallStoreDetailsUiModel(title=" + str + ", description=" + str2 + ", imageUrl=" + str3 + ", firstTimeShown=" + z10 + ", availableInfoItems=" + cVar + ", unavailableInfoItems=" + cVar2 + ")";
    }
}
