package p7;

import a7.h;
import j7.C8409c;
import java.security.InvalidKeyException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp7/n;", "La7/h;", "Ljava/security/InvalidKeyException;", "exception", "<init>", "(Ljava/security/InvalidKeyException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/InvalidKeyException;", "()Ljava/security/InvalidKeyException;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends h {

    /* renamed from: a  reason: collision with root package name */
    private final InvalidKeyException f55434a;

    public n(InvalidKeyException invalidKeyException) {
        C17542s.j(invalidKeyException, "exception");
        this.f55434a = invalidKeyException;
    }

    public InvalidKeyException a() {
        return this.f55434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && C17542s.e(this.f55434a, ((n) obj).f55434a);
    }

    public int hashCode() {
        return this.f55434a.hashCode();
    }

    public String toString() {
        return "Log's public key cannot be used with " + C8409c.a(a());
    }
}
