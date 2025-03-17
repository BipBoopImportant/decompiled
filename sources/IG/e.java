package Ig;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import zr.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"LIg/e;", "", "", "requestId", "", "pageStartIndex", "Lkotlin/Function0;", "Lzr/d;", "filter", "total", "<init>", "(Ljava/lang/String;ILnI/a;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Ljava/lang/String;ILnI/a;I)LIg/e;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "e", "b", "I", "d", "c", "LnI/a;", "()LnI/a;", "f", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f61062a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61063b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<d> f61064c;

    /* renamed from: d  reason: collision with root package name */
    private final int f61065d;

    public e(String str, int i10, C17631a<d> aVar, int i11) {
        C17542s.j(str, "requestId");
        C17542s.j(aVar, "filter");
        this.f61062a = str;
        this.f61063b = i10;
        this.f61064c = aVar;
        this.f61065d = i11;
    }

    public static /* synthetic */ e b(e eVar, String str, int i10, C17631a<d> aVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = eVar.f61062a;
        }
        if ((i12 & 2) != 0) {
            i10 = eVar.f61063b;
        }
        if ((i12 & 4) != 0) {
            aVar = eVar.f61064c;
        }
        if ((i12 & 8) != 0) {
            i11 = eVar.f61065d;
        }
        return eVar.a(str, i10, aVar, i11);
    }

    public final e a(String str, int i10, C17631a<d> aVar, int i11) {
        C17542s.j(str, "requestId");
        C17542s.j(aVar, "filter");
        return new e(str, i10, aVar, i11);
    }

    public final C17631a<d> c() {
        return this.f61064c;
    }

    public final int d() {
        return this.f61063b;
    }

    public final String e() {
        return this.f61062a;
    }

    public boolean equals(Object obj) {
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null && eVar.f61063b == this.f61063b) {
            e eVar2 = (e) obj;
            return C17542s.e(eVar2.f61064c.invoke(), this.f61064c.invoke()) && eVar2.f61065d == this.f61065d;
        }
    }

    public final int f() {
        return this.f61065d;
    }

    public int hashCode() {
        return (((this.f61063b * 31) + this.f61064c.hashCode()) * 31) + this.f61065d;
    }

    public String toString() {
        String str = this.f61062a;
        int i10 = this.f61063b;
        C17631a<d> aVar = this.f61064c;
        int i11 = this.f61065d;
        return "InspirePagingKey(requestId=" + str + ", pageStartIndex=" + i10 + ", filter=" + aVar + ", total=" + i11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i10, C17631a aVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, aVar, (i12 & 8) != 0 ? 0 : i11);
    }
}
