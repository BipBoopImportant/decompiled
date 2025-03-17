package Eg;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJH\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"LEg/a;", "", "LCg/a;", "selectedRating", "", "", "questionsInput", "", "isSent", "hasValidInput", "<init>", "(LCg/a;Ljava/util/Map;ZZ)V", "a", "(LCg/a;Ljava/util/Map;ZZ)LEg/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LCg/a;", "e", "()LCg/a;", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "Z", "f", "()Z", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Cg.a f60216a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f60217b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60218c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f60219d;

    public a() {
        this((Cg.a) null, (Map) null, false, false, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ a b(a aVar, Cg.a aVar2, Map<String, String> map, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar2 = aVar.f60216a;
        }
        if ((i10 & 2) != 0) {
            map = aVar.f60217b;
        }
        if ((i10 & 4) != 0) {
            z10 = aVar.f60218c;
        }
        if ((i10 & 8) != 0) {
            z11 = aVar.f60219d;
        }
        return aVar.a(aVar2, map, z10, z11);
    }

    public final a a(Cg.a aVar, Map<String, String> map, boolean z10, boolean z11) {
        return new a(aVar, map, z10, z11);
    }

    public final boolean c() {
        return this.f60219d;
    }

    public final Map<String, String> d() {
        return this.f60217b;
    }

    public final Cg.a e() {
        return this.f60216a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f60216a, aVar.f60216a) && C17542s.e(this.f60217b, aVar.f60217b) && this.f60218c == aVar.f60218c && this.f60219d == aVar.f60219d;
    }

    public final boolean f() {
        return this.f60218c;
    }

    public int hashCode() {
        Cg.a aVar = this.f60216a;
        int i10 = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        Map<String, String> map = this.f60217b;
        if (map != null) {
            i10 = map.hashCode();
        }
        return ((((hashCode + i10) * 31) + Boolean.hashCode(this.f60218c)) * 31) + Boolean.hashCode(this.f60219d);
    }

    public String toString() {
        Cg.a aVar = this.f60216a;
        Map<String, String> map = this.f60217b;
        boolean z10 = this.f60218c;
        boolean z11 = this.f60219d;
        return "RatingState(selectedRating=" + aVar + ", questionsInput=" + map + ", isSent=" + z10 + ", hasValidInput=" + z11 + ")";
    }

    public a(Cg.a aVar, Map<String, String> map, boolean z10, boolean z11) {
        this.f60216a = aVar;
        this.f60217b = map;
        this.f60218c = z10;
        this.f60219d = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Cg.a aVar, Map map, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? true : z11);
    }
}
