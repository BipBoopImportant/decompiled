package op;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0017\u0010\u000e¨\u0006 "}, d2 = {"Lop/i;", "", "", "text", "", "count", "", "selected", "itemNo", "itemType", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Z", "d", "()Z", "getItemType", "f", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.i  reason: case insensitive filesystem */
public final class C11698i {

    /* renamed from: a  reason: collision with root package name */
    private final String f100641a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f100642b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f100643c;

    /* renamed from: d  reason: collision with root package name */
    private final String f100644d;

    /* renamed from: e  reason: collision with root package name */
    private final String f100645e;

    /* renamed from: f  reason: collision with root package name */
    private final String f100646f;

    public C11698i(String str, Integer num, boolean z10, String str2, String str3, String str4) {
        C17542s.j(str, "text");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        C17542s.j(str4, "imageUrl");
        this.f100641a = str;
        this.f100642b = num;
        this.f100643c = z10;
        this.f100644d = str2;
        this.f100645e = str3;
        this.f100646f = str4;
    }

    public final Integer a() {
        return this.f100642b;
    }

    public final String b() {
        return this.f100646f;
    }

    public final String c() {
        return this.f100644d;
    }

    public final boolean d() {
        return this.f100643c;
    }

    public final String e() {
        return this.f100641a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11698i)) {
            return false;
        }
        C11698i iVar = (C11698i) obj;
        return C17542s.e(this.f100641a, iVar.f100641a) && C17542s.e(this.f100642b, iVar.f100642b) && this.f100643c == iVar.f100643c && C17542s.e(this.f100644d, iVar.f100644d) && C17542s.e(this.f100645e, iVar.f100645e) && C17542s.e(this.f100646f, iVar.f100646f);
    }

    public int hashCode() {
        int hashCode = this.f100641a.hashCode() * 31;
        Integer num = this.f100642b;
        return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f100643c)) * 31) + this.f100644d.hashCode()) * 31) + this.f100645e.hashCode()) * 31) + this.f100646f.hashCode();
    }

    public String toString() {
        String str = this.f100641a;
        Integer num = this.f100642b;
        boolean z10 = this.f100643c;
        String str2 = this.f100644d;
        String str3 = this.f100645e;
        String str4 = this.f100646f;
        return "ProductDetailValues(text=" + str + ", count=" + num + ", selected=" + z10 + ", itemNo=" + str2 + ", itemType=" + str3 + ", imageUrl=" + str4 + ")";
    }
}
