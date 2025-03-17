package Sn;

import Nn.E;
import Nn.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"LSn/d;", "", "LNn/E;", "psp", "", "apiUrl", "sessionId", "iopgId", "gatewayMerchantId", "<init>", "(LNn/E;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "checkoutId", "LNn/H;", "b", "(Ljava/lang/String;)LNn/H;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/E;", "()LNn/E;", "Ljava/lang/String;", "getApiUrl", "c", "getSessionId", "d", "getIopgId", "e", "getGatewayMerchantId", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final E f87246a;

    /* renamed from: b  reason: collision with root package name */
    private final String f87247b;

    /* renamed from: c  reason: collision with root package name */
    private final String f87248c;

    /* renamed from: d  reason: collision with root package name */
    private final String f87249d;

    /* renamed from: e  reason: collision with root package name */
    private final String f87250e;

    public d(E e10, String str, String str2, String str3, String str4) {
        C17542s.j(e10, "psp");
        C17542s.j(str, "apiUrl");
        C17542s.j(str2, "sessionId");
        C17542s.j(str3, "iopgId");
        this.f87246a = e10;
        this.f87247b = str;
        this.f87248c = str2;
        this.f87249d = str3;
        this.f87250e = str4;
    }

    public final E a() {
        return this.f87246a;
    }

    public final H b(String str) {
        C17542s.j(str, "checkoutId");
        return new H(str, this.f87246a, this.f87247b, this.f87248c, this.f87249d, this.f87250e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f87246a == dVar.f87246a && C17542s.e(this.f87247b, dVar.f87247b) && C17542s.e(this.f87248c, dVar.f87248c) && C17542s.e(this.f87249d, dVar.f87249d) && C17542s.e(this.f87250e, dVar.f87250e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f87246a.hashCode() * 31) + this.f87247b.hashCode()) * 31) + this.f87248c.hashCode()) * 31) + this.f87249d.hashCode()) * 31;
        String str = this.f87250e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        E e10 = this.f87246a;
        String str = this.f87247b;
        String str2 = this.f87248c;
        String str3 = this.f87249d;
        String str4 = this.f87250e;
        return "PspSessionApiData(psp=" + e10 + ", apiUrl=" + str + ", sessionId=" + str2 + ", iopgId=" + str3 + ", gatewayMerchantId=" + str4 + ")";
    }
}
