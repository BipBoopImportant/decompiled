package Hx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"LHx/b;", "", "", "itemNumber", "itemType", "name", "description", "", "quantity", "thumbnailUrl", "", "totalPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "I", "f", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f110740a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110741b;

    /* renamed from: c  reason: collision with root package name */
    private final String f110742c;

    /* renamed from: d  reason: collision with root package name */
    private final String f110743d;

    /* renamed from: e  reason: collision with root package name */
    private final int f110744e;

    /* renamed from: f  reason: collision with root package name */
    private final String f110745f;

    /* renamed from: g  reason: collision with root package name */
    private final Double f110746g;

    public b(String str, String str2, String str3, String str4, int i10, String str5, Double d10) {
        C17542s.j(str, "itemNumber");
        C17542s.j(str2, "itemType");
        C17542s.j(str3, "name");
        this.f110740a = str;
        this.f110741b = str2;
        this.f110742c = str3;
        this.f110743d = str4;
        this.f110744e = i10;
        this.f110745f = str5;
        this.f110746g = d10;
    }

    public final String a() {
        return this.f110743d;
    }

    public final String b() {
        return this.f110740a;
    }

    public final String c() {
        return this.f110741b;
    }

    public final String d() {
        return this.f110742c;
    }

    public final int e() {
        return this.f110744e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f110740a, bVar.f110740a) && C17542s.e(this.f110741b, bVar.f110741b) && C17542s.e(this.f110742c, bVar.f110742c) && C17542s.e(this.f110743d, bVar.f110743d) && this.f110744e == bVar.f110744e && C17542s.e(this.f110745f, bVar.f110745f) && C17542s.e(this.f110746g, bVar.f110746g);
    }

    public final String f() {
        return this.f110745f;
    }

    public final Double g() {
        return this.f110746g;
    }

    public int hashCode() {
        int hashCode = ((((this.f110740a.hashCode() * 31) + this.f110741b.hashCode()) * 31) + this.f110742c.hashCode()) * 31;
        String str = this.f110743d;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f110744e)) * 31;
        String str2 = this.f110745f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f110746g;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f110740a;
        String str2 = this.f110741b;
        String str3 = this.f110742c;
        String str4 = this.f110743d;
        int i10 = this.f110744e;
        String str5 = this.f110745f;
        Double d10 = this.f110746g;
        return "PurchaseArticle(itemNumber=" + str + ", itemType=" + str2 + ", name=" + str3 + ", description=" + str4 + ", quantity=" + i10 + ", thumbnailUrl=" + str5 + ", totalPrice=" + d10 + ")";
    }
}
