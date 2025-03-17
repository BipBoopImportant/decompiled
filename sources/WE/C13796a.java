package WE;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LWE/a;", "", "", "postalCode", "preferredStore", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WE.a  reason: case insensitive filesystem */
public final class C13796a {

    /* renamed from: a  reason: collision with root package name */
    private final String f117676a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117677b;

    public C13796a(String str, String str2) {
        this.f117676a = str;
        this.f117677b = str2;
    }

    public final String a() {
        return this.f117676a;
    }

    public final String b() {
        return this.f117677b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13796a)) {
            return false;
        }
        C13796a aVar = (C13796a) obj;
        return C17542s.e(this.f117676a, aVar.f117676a) && C17542s.e(this.f117677b, aVar.f117677b);
    }

    public int hashCode() {
        String str = this.f117676a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117677b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f117676a;
        String str2 = this.f117677b;
        return "UserInformation(postalCode=" + str + ", preferredStore=" + str2 + ")";
    }
}
