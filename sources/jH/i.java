package JH;

import HJ.C15854t;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJH/i;", "", "", "content", "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "I", "hash", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f135719a;

    /* renamed from: b  reason: collision with root package name */
    private final int f135720b;

    public i(String str) {
        C17542s.j(str, "content");
        this.f135719a = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.f135720b = lowerCase.hashCode();
    }

    public final String a() {
        return this.f135719a;
    }

    public boolean equals(Object obj) {
        String str;
        i iVar = obj instanceof i ? (i) obj : null;
        return (iVar == null || (str = iVar.f135719a) == null || !C15854t.H(str, this.f135719a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f135720b;
    }

    public String toString() {
        return this.f135719a;
    }
}
