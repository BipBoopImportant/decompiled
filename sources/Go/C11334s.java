package go;

import IC.C13023e;
import KJ.C15987c;
import Op.C10828d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0019\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b$\u0010#¨\u0006("}, d2 = {"Lgo/s;", "", "", "id", "productName", "productDescription", "LOp/d$d;", "image", "LIC/e;", "quantityText", "LKJ/c;", "LOp/d$f;", "availability", "splitDeliveryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LOp/d$d;LIC/e;LKJ/c;LIC/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "d", "c", "LOp/d$d;", "()LOp/d$d;", "e", "LIC/e;", "()LIC/e;", "f", "LKJ/c;", "()LKJ/c;", "g", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.s  reason: case insensitive filesystem */
public final class C11334s {

    /* renamed from: h  reason: collision with root package name */
    public static final int f97891h = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f97892a;

    /* renamed from: b  reason: collision with root package name */
    private final String f97893b;

    /* renamed from: c  reason: collision with root package name */
    private final String f97894c;

    /* renamed from: d  reason: collision with root package name */
    private final C10828d.C1720d f97895d;

    /* renamed from: e  reason: collision with root package name */
    private final C13023e f97896e;

    /* renamed from: f  reason: collision with root package name */
    private final C15987c<C10828d.f> f97897f;

    /* renamed from: g  reason: collision with root package name */
    private final C13023e f97898g;

    public C11334s(String str, String str2, String str3, C10828d.C1720d dVar, C13023e eVar, C15987c<C10828d.f> cVar, C13023e eVar2) {
        C17542s.j(str, "id");
        C17542s.j(str2, "productName");
        C17542s.j(str3, "productDescription");
        C17542s.j(dVar, "image");
        C17542s.j(cVar, "availability");
        this.f97892a = str;
        this.f97893b = str2;
        this.f97894c = str3;
        this.f97895d = dVar;
        this.f97896e = eVar;
        this.f97897f = cVar;
        this.f97898g = eVar2;
    }

    public final C15987c<C10828d.f> a() {
        return this.f97897f;
    }

    public final C10828d.C1720d b() {
        return this.f97895d;
    }

    public final String c() {
        return this.f97894c;
    }

    public final String d() {
        return this.f97893b;
    }

    public final C13023e e() {
        return this.f97896e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11334s)) {
            return false;
        }
        C11334s sVar = (C11334s) obj;
        return C17542s.e(this.f97892a, sVar.f97892a) && C17542s.e(this.f97893b, sVar.f97893b) && C17542s.e(this.f97894c, sVar.f97894c) && C17542s.e(this.f97895d, sVar.f97895d) && C17542s.e(this.f97896e, sVar.f97896e) && C17542s.e(this.f97897f, sVar.f97897f) && C17542s.e(this.f97898g, sVar.f97898g);
    }

    public final C13023e f() {
        return this.f97898g;
    }

    public int hashCode() {
        int hashCode = ((((((this.f97892a.hashCode() * 31) + this.f97893b.hashCode()) * 31) + this.f97894c.hashCode()) * 31) + this.f97895d.hashCode()) * 31;
        C13023e eVar = this.f97896e;
        int i10 = 0;
        int hashCode2 = (((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f97897f.hashCode()) * 31;
        C13023e eVar2 = this.f97898g;
        if (eVar2 != null) {
            i10 = eVar2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f97892a;
        String str2 = this.f97893b;
        String str3 = this.f97894c;
        C10828d.C1720d dVar = this.f97895d;
        C13023e eVar = this.f97896e;
        C15987c<C10828d.f> cVar = this.f97897f;
        C13023e eVar2 = this.f97898g;
        return "CheckoutProductUiState(id=" + str + ", productName=" + str2 + ", productDescription=" + str3 + ", image=" + dVar + ", quantityText=" + eVar + ", availability=" + cVar + ", splitDeliveryText=" + eVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11334s(String str, String str2, String str3, C10828d.C1720d dVar, C13023e eVar, C15987c cVar, C13023e eVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, dVar, eVar, cVar, (i10 & 64) != 0 ? null : eVar2);
    }
}
