package EH;

import HJ.C15854t;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LEH/i;", "", "", "name", "value", "", "escapeValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "()Ljava/lang/String;", "b", "toString", "Ljava/lang/String;", "c", "d", "Z", "getEscapeValue", "()Z", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.i  reason: case insensitive filesystem */
public final class C15624i {

    /* renamed from: a  reason: collision with root package name */
    private final String f134027a;

    /* renamed from: b  reason: collision with root package name */
    private final String f134028b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f134029c;

    public C15624i(String str, String str2, boolean z10) {
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
        this.f134027a = str;
        this.f134028b = str2;
        this.f134029c = z10;
    }

    public final String a() {
        return this.f134027a;
    }

    public final String b() {
        return this.f134028b;
    }

    public final String c() {
        return this.f134027a;
    }

    public final String d() {
        return this.f134028b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15624i) {
            C15624i iVar = (C15624i) obj;
            return C15854t.H(iVar.f134027a, this.f134027a, true) && C15854t.H(iVar.f134028b, this.f134028b, true);
        }
    }

    public int hashCode() {
        String str = this.f134027a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f134028b.toLowerCase(locale);
        C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f134027a + ", value=" + this.f134028b + ", escapeValue=" + this.f134029c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15624i(String str, String str2) {
        this(str, str2, false);
        C17542s.j(str, "name");
        C17542s.j(str2, "value");
    }
}
