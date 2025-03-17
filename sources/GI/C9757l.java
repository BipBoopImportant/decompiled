package gi;

import IC.C13023e;
import Lu.i;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001a\u0010\u000e¨\u0006#"}, d2 = {"Lgi/l;", "", "LIC/e;", "text", "", "boldPart", "LLu/i$a;", "icon", "Lgi/l$a;", "type", "division", "<init>", "(LIC/e;Ljava/lang/String;LLu/i$a;Lgi/l$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "d", "()LIC/e;", "b", "Ljava/lang/String;", "c", "LLu/i$a;", "()LLu/i$a;", "Lgi/l$a;", "getType", "()Lgi/l$a;", "e", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.l  reason: case insensitive filesystem */
public final class C9757l {

    /* renamed from: f  reason: collision with root package name */
    public static final int f73431f = (i.a.f83372a | C13023e.f110931a);

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f73432a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73433b;

    /* renamed from: c  reason: collision with root package name */
    private final i.a f73434c;

    /* renamed from: d  reason: collision with root package name */
    private final a f73435d;

    /* renamed from: e  reason: collision with root package name */
    private final String f73436e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lgi/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY", "SALES", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gi.l$a */
    public enum a {
        DISPLAY,
        SALES;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public C9757l(C13023e eVar, String str, i.a aVar, a aVar2, String str2) {
        C17542s.j(eVar, "text");
        C17542s.j(str, "boldPart");
        C17542s.j(aVar2, "type");
        C17542s.j(str2, "division");
        this.f73432a = eVar;
        this.f73433b = str;
        this.f73434c = aVar;
        this.f73435d = aVar2;
        this.f73436e = str2;
    }

    public final String a() {
        return this.f73433b;
    }

    public final String b() {
        return this.f73436e;
    }

    public final i.a c() {
        return this.f73434c;
    }

    public final C13023e d() {
        return this.f73432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9757l)) {
            return false;
        }
        C9757l lVar = (C9757l) obj;
        return C17542s.e(this.f73432a, lVar.f73432a) && C17542s.e(this.f73433b, lVar.f73433b) && C17542s.e(this.f73434c, lVar.f73434c) && this.f73435d == lVar.f73435d && C17542s.e(this.f73436e, lVar.f73436e);
    }

    public int hashCode() {
        int hashCode = ((this.f73432a.hashCode() * 31) + this.f73433b.hashCode()) * 31;
        i.a aVar = this.f73434c;
        return ((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f73435d.hashCode()) * 31) + this.f73436e.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f73432a;
        String str = this.f73433b;
        i.a aVar = this.f73434c;
        a aVar2 = this.f73435d;
        String str2 = this.f73436e;
        return "InStoreNavigationModel(text=" + eVar + ", boldPart=" + str + ", icon=" + aVar + ", type=" + aVar2 + ", division=" + str2 + ")";
    }
}
