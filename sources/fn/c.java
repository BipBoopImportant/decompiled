package Fn;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LFn/c;", "", "", "code", "description", "LFn/c$a;", "nonValidReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;LFn/c$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LFn/c$a;", "()LFn/c$a;", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f80973a;

    /* renamed from: b  reason: collision with root package name */
    private final String f80974b;

    /* renamed from: c  reason: collision with root package name */
    private final a f80975c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LFn/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "EXPIRED", "NOT_STARTED", "REDEEMED", "INVALID", "INVALID_CONTEXT", "FAMILY_ONLY", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        EXPIRED,
        NOT_STARTED,
        REDEEMED,
        INVALID,
        INVALID_CONTEXT,
        FAMILY_ONLY;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public c(String str, String str2, a aVar) {
        C17542s.j(str, "code");
        this.f80973a = str;
        this.f80974b = str2;
        this.f80975c = aVar;
    }

    public final String a() {
        return this.f80973a;
    }

    public final String b() {
        return this.f80974b;
    }

    public final a c() {
        return this.f80975c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f80973a, cVar.f80973a) && C17542s.e(this.f80974b, cVar.f80974b) && this.f80975c == cVar.f80975c;
    }

    public int hashCode() {
        int hashCode = this.f80973a.hashCode() * 31;
        String str = this.f80974b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f80975c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f80973a;
        String str2 = this.f80974b;
        a aVar = this.f80975c;
        return "CaasDiscountCode(code=" + str + ", description=" + str2 + ", nonValidReason=" + aVar + ")";
    }
}
