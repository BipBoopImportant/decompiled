package bB;

import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import np.C11664a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b'\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b!\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b.\u00101R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b2\u00101R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00101R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00107¨\u00068"}, d2 = {"LbB/e;", "", "", "itemNo", "itemType", "", "quantity", "LbB/c;", "product", "", "Lnp/a;", "environmentalFees", "LbB/d;", "salesPrices", "LbB/a;", "articles", "", "onlineSellable", "isCommunicatedOnline", "isBreathtakingItem", "isNewItem", "numberOfPackages", "Ljava/time/Instant;", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILbB/c;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZZZILjava/time/Instant;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "I", "h", "LbB/c;", "g", "()LbB/c;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "i", "Z", "()Z", "l", "j", "k", "m", "Ljava/time/Instant;", "()Ljava/time/Instant;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f118895a;

    /* renamed from: b  reason: collision with root package name */
    private final String f118896b;

    /* renamed from: c  reason: collision with root package name */
    private final int f118897c;

    /* renamed from: d  reason: collision with root package name */
    private final c f118898d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C11664a> f118899e;

    /* renamed from: f  reason: collision with root package name */
    private final List<d> f118900f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C13999a> f118901g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f118902h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f118903i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f118904j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f118905k;

    /* renamed from: l  reason: collision with root package name */
    private final int f118906l;

    /* renamed from: m  reason: collision with root package name */
    private final Instant f118907m;

    public e(String str, String str2, int i10, c cVar, List<C11664a> list, List<d> list2, List<C13999a> list3, boolean z10, boolean z11, boolean z12, boolean z13, int i11, Instant instant) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(list, "environmentalFees");
        C17542s.j(list2, "salesPrices");
        C17542s.j(list3, "articles");
        C17542s.j(instant, "updatedAt");
        this.f118895a = str;
        this.f118896b = str2;
        this.f118897c = i10;
        this.f118898d = cVar;
        this.f118899e = list;
        this.f118900f = list2;
        this.f118901g = list3;
        this.f118902h = z10;
        this.f118903i = z11;
        this.f118904j = z12;
        this.f118905k = z13;
        this.f118906l = i11;
        this.f118907m = instant;
    }

    public final List<C13999a> a() {
        return this.f118901g;
    }

    public final List<C11664a> b() {
        return this.f118899e;
    }

    public final String c() {
        return this.f118895a;
    }

    public final String d() {
        return this.f118896b;
    }

    public final int e() {
        return this.f118906l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f118895a, eVar.f118895a) && C17542s.e(this.f118896b, eVar.f118896b) && this.f118897c == eVar.f118897c && C17542s.e(this.f118898d, eVar.f118898d) && C17542s.e(this.f118899e, eVar.f118899e) && C17542s.e(this.f118900f, eVar.f118900f) && C17542s.e(this.f118901g, eVar.f118901g) && this.f118902h == eVar.f118902h && this.f118903i == eVar.f118903i && this.f118904j == eVar.f118904j && this.f118905k == eVar.f118905k && this.f118906l == eVar.f118906l && C17542s.e(this.f118907m, eVar.f118907m);
    }

    public final boolean f() {
        return this.f118902h;
    }

    public final c g() {
        return this.f118898d;
    }

    public final int h() {
        return this.f118897c;
    }

    public int hashCode() {
        int hashCode = ((((this.f118895a.hashCode() * 31) + this.f118896b.hashCode()) * 31) + Integer.hashCode(this.f118897c)) * 31;
        c cVar = this.f118898d;
        return ((((((((((((((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f118899e.hashCode()) * 31) + this.f118900f.hashCode()) * 31) + this.f118901g.hashCode()) * 31) + Boolean.hashCode(this.f118902h)) * 31) + Boolean.hashCode(this.f118903i)) * 31) + Boolean.hashCode(this.f118904j)) * 31) + Boolean.hashCode(this.f118905k)) * 31) + Integer.hashCode(this.f118906l)) * 31) + this.f118907m.hashCode();
    }

    public final List<d> i() {
        return this.f118900f;
    }

    public final Instant j() {
        return this.f118907m;
    }

    public final boolean k() {
        return this.f118904j;
    }

    public final boolean l() {
        return this.f118903i;
    }

    public final boolean m() {
        return this.f118905k;
    }

    public String toString() {
        String str = this.f118895a;
        String str2 = this.f118896b;
        int i10 = this.f118897c;
        c cVar = this.f118898d;
        List<C11664a> list = this.f118899e;
        List<d> list2 = this.f118900f;
        List<C13999a> list3 = this.f118901g;
        boolean z10 = this.f118902h;
        boolean z11 = this.f118903i;
        boolean z12 = this.f118904j;
        boolean z13 = this.f118905k;
        int i11 = this.f118906l;
        Instant instant = this.f118907m;
        return "ShoppingListItemRemoteModel(itemNo=" + str + ", itemType=" + str2 + ", quantity=" + i10 + ", product=" + cVar + ", environmentalFees=" + list + ", salesPrices=" + list2 + ", articles=" + list3 + ", onlineSellable=" + z10 + ", isCommunicatedOnline=" + z11 + ", isBreathtakingItem=" + z12 + ", isNewItem=" + z13 + ", numberOfPackages=" + i11 + ", updatedAt=" + instant + ")";
    }
}
