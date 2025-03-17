package uo;

import HJ.C15854t;
import Nn.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Luo/e;", "", "", "fiscalCodeValue", "idType", "idValue", "countryCode", "", "isValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "LNn/w;", "b", "()LNn/w;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFiscalCodeValue", "getIdType", "c", "getIdValue", "d", "getCountryCode", "e", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f103971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103972b;

    /* renamed from: c  reason: collision with root package name */
    private final String f103973c;

    /* renamed from: d  reason: collision with root package name */
    private final String f103974d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f103975e;

    public e(String str, String str2, String str3, String str4, boolean z10) {
        C17542s.j(str3, "idValue");
        this.f103971a = str;
        this.f103972b = str2;
        this.f103973c = str3;
        this.f103974d = str4;
        this.f103975e = z10;
    }

    public final boolean a() {
        return this.f103975e;
    }

    public final w b() {
        if (this.f103972b == null) {
            return null;
        }
        String str = this.f103971a;
        return (str == null || C15854t.v0(str)) ? new w.b(this.f103972b, this.f103973c, this.f103974d) : new w.a(this.f103971a, this.f103972b, this.f103973c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f103971a, eVar.f103971a) && C17542s.e(this.f103972b, eVar.f103972b) && C17542s.e(this.f103973c, eVar.f103973c) && C17542s.e(this.f103974d, eVar.f103974d) && this.f103975e == eVar.f103975e;
    }

    public int hashCode() {
        String str = this.f103971a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f103972b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f103973c.hashCode()) * 31;
        String str3 = this.f103974d;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f103975e);
    }

    public String toString() {
        String str = this.f103971a;
        String str2 = this.f103972b;
        String str3 = this.f103973c;
        String str4 = this.f103974d;
        boolean z10 = this.f103975e;
        return "TaxIdSelectionState(fiscalCodeValue=" + str + ", idType=" + str2 + ", idValue=" + str3 + ", countryCode=" + str4 + ", isValid=" + z10 + ")";
    }
}
