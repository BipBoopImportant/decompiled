package p7;

import a7.h;
import j7.C8409c;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lp7/s;", "La7/h;", "", "algorithm", "Ljava/security/NoSuchAlgorithmException;", "exception", "<init>", "(Ljava/lang/String;Ljava/security/NoSuchAlgorithmException;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAlgorithm", "b", "Ljava/security/NoSuchAlgorithmException;", "()Ljava/security/NoSuchAlgorithmException;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f55440a;

    /* renamed from: b  reason: collision with root package name */
    private final NoSuchAlgorithmException f55441b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(String str, NoSuchAlgorithmException noSuchAlgorithmException, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : noSuchAlgorithmException);
    }

    public NoSuchAlgorithmException a() {
        return this.f55441b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return C17542s.e(this.f55440a, sVar.f55440a) && C17542s.e(this.f55441b, sVar.f55441b);
    }

    public int hashCode() {
        int hashCode = this.f55440a.hashCode() * 31;
        NoSuchAlgorithmException noSuchAlgorithmException = this.f55441b;
        return hashCode + (noSuchAlgorithmException == null ? 0 : noSuchAlgorithmException.hashCode());
    }

    public String toString() {
        if (a() != null) {
            return "Unsupported signature algorithm " + this.f55440a + " with: " + C8409c.a(a());
        }
        return "Unsupported signature algorithm " + this.f55440a;
    }

    public s(String str, NoSuchAlgorithmException noSuchAlgorithmException) {
        C17542s.j(str, "algorithm");
        this.f55440a = str;
        this.f55441b = noSuchAlgorithmException;
    }
}
