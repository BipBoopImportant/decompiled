package Dw;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LDw/a;", "", "", "salesOrderId", "", "updatedAt", "LDw/e;", "timeSlot", "", "totalPrice", "<init>", "(Ljava/lang/String;JLDw/e;Ljava/lang/Double;)V", "a", "(Ljava/lang/String;JLDw/e;Ljava/lang/Double;)LDw/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "J", "f", "()J", "LDw/e;", "d", "()LDw/e;", "Ljava/lang/Double;", "e", "()Ljava/lang/Double;", "ongoinginstoreordersrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dw.a  reason: case insensitive filesystem */
public final class C12792a {

    /* renamed from: a  reason: collision with root package name */
    private final String f109087a;

    /* renamed from: b  reason: collision with root package name */
    private final long f109088b;

    /* renamed from: c  reason: collision with root package name */
    private final e f109089c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f109090d;

    public C12792a(String str, long j10, e eVar, Double d10) {
        C17542s.j(str, "salesOrderId");
        C17542s.j(eVar, "timeSlot");
        this.f109087a = str;
        this.f109088b = j10;
        this.f109089c = eVar;
        this.f109090d = d10;
    }

    public static /* synthetic */ C12792a b(C12792a aVar, String str, long j10, e eVar, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f109087a;
        }
        if ((i10 & 2) != 0) {
            j10 = aVar.f109088b;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            eVar = aVar.f109089c;
        }
        e eVar2 = eVar;
        if ((i10 & 8) != 0) {
            d10 = aVar.f109090d;
        }
        return aVar.a(str, j11, eVar2, d10);
    }

    public final C12792a a(String str, long j10, e eVar, Double d10) {
        C17542s.j(str, "salesOrderId");
        C17542s.j(eVar, "timeSlot");
        return new C12792a(str, j10, eVar, d10);
    }

    public final String c() {
        return this.f109087a;
    }

    public final e d() {
        return this.f109089c;
    }

    public final Double e() {
        return this.f109090d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12792a)) {
            return false;
        }
        C12792a aVar = (C12792a) obj;
        return C17542s.e(this.f109087a, aVar.f109087a) && this.f109088b == aVar.f109088b && C17542s.e(this.f109089c, aVar.f109089c) && C17542s.e(this.f109090d, aVar.f109090d);
    }

    public final long f() {
        return this.f109088b;
    }

    public int hashCode() {
        int hashCode = ((((this.f109087a.hashCode() * 31) + Long.hashCode(this.f109088b)) * 31) + this.f109089c.hashCode()) * 31;
        Double d10 = this.f109090d;
        return hashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        String str = this.f109087a;
        long j10 = this.f109088b;
        e eVar = this.f109089c;
        Double d10 = this.f109090d;
        return "OngoingInStoreOrder(salesOrderId=" + str + ", updatedAt=" + j10 + ", timeSlot=" + eVar + ", totalPrice=" + d10 + ")";
    }
}
