package nn;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001a"}, d2 = {"Lnn/e;", "", "", "title", "imageUrl", "itemNo", "itemType", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "getItemType", "e", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nn.e  reason: case insensitive filesystem */
public final class C11659e {

    /* renamed from: a  reason: collision with root package name */
    private final String f99944a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99945b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99946c;

    /* renamed from: d  reason: collision with root package name */
    private final String f99947d;

    /* renamed from: e  reason: collision with root package name */
    private final String f99948e;

    public C11659e(String str, String str2, String str3, String str4, String str5) {
        C17542s.j(str, "title");
        C17542s.j(str2, "imageUrl");
        C17542s.j(str3, "itemNo");
        C17542s.j(str4, "itemType");
        C17542s.j(str5, "description");
        this.f99944a = str;
        this.f99945b = str2;
        this.f99946c = str3;
        this.f99947d = str4;
        this.f99948e = str5;
    }

    public final String a() {
        return this.f99948e;
    }

    public final String b() {
        return this.f99945b;
    }

    public final String c() {
        return this.f99946c;
    }

    public final String d() {
        return this.f99944a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11659e)) {
            return false;
        }
        C11659e eVar = (C11659e) obj;
        return C17542s.e(this.f99944a, eVar.f99944a) && C17542s.e(this.f99945b, eVar.f99945b) && C17542s.e(this.f99946c, eVar.f99946c) && C17542s.e(this.f99947d, eVar.f99947d) && C17542s.e(this.f99948e, eVar.f99948e);
    }

    public int hashCode() {
        return (((((((this.f99944a.hashCode() * 31) + this.f99945b.hashCode()) * 31) + this.f99946c.hashCode()) * 31) + this.f99947d.hashCode()) * 31) + this.f99948e.hashCode();
    }

    public String toString() {
        String str = this.f99944a;
        String str2 = this.f99945b;
        String str3 = this.f99946c;
        String str4 = this.f99947d;
        String str5 = this.f99948e;
        return "ProductInfo(title=" + str + ", imageUrl=" + str2 + ", itemNo=" + str3 + ", itemType=" + str4 + ", description=" + str5 + ")";
    }
}
