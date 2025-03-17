package kD;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\"\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0014\u0010!¨\u0006#"}, d2 = {"LkD/o;", "", "", "icmId", "LkD/o$a;", "type", "LkD/h;", "profile", "name", "<init>", "(Ljava/lang/String;LkD/o$a;LkD/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getIcmId", "b", "LkD/o$a;", "c", "()LkD/o$a;", "LkD/h;", "()LkD/h;", "d", "getName", "e", "Z", "()Z", "hasFamilyPrivileges", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f128650a;

    /* renamed from: b  reason: collision with root package name */
    private final a f128651b;

    /* renamed from: c  reason: collision with root package name */
    private final h f128652c;

    /* renamed from: d  reason: collision with root package name */
    private final String f128653d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f128654e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LkD/o$a;", "", "<init>", "(Ljava/lang/String;I)V", "GUEST", "REGULAR", "FAMILY", "useraccount_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        GUEST,
        REGULAR,
        FAMILY;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public o(String str, a aVar, h hVar, String str2) {
        C17542s.j(aVar, "type");
        this.f128650a = str;
        this.f128651b = aVar;
        this.f128652c = hVar;
        this.f128653d = str2;
        this.f128654e = aVar == a.FAMILY;
    }

    public final boolean a() {
        return this.f128654e;
    }

    public final h b() {
        return this.f128652c;
    }

    public final a c() {
        return this.f128651b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f128650a, oVar.f128650a) && this.f128651b == oVar.f128651b && C17542s.e(this.f128652c, oVar.f128652c) && C17542s.e(this.f128653d, oVar.f128653d);
    }

    public int hashCode() {
        String str = this.f128650a;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f128651b.hashCode()) * 31;
        h hVar = this.f128652c;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.f128653d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f128650a;
        a aVar = this.f128651b;
        h hVar = this.f128652c;
        String str2 = this.f128653d;
        return "UserInfo(icmId=" + str + ", type=" + aVar + ", profile=" + hVar + ", name=" + str2 + ")";
    }
}
