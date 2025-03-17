package rG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LrG/c;", "", "", "id", "", "message", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rG.c  reason: case insensitive filesystem */
public final class C17849c {

    /* renamed from: a  reason: collision with root package name */
    private final long f146660a;

    /* renamed from: b  reason: collision with root package name */
    private final String f146661b;

    public C17849c(long j10, String str) {
        C17542s.j(str, "message");
        this.f146660a = j10;
        this.f146661b = str;
    }

    public final long a() {
        return this.f146660a;
    }

    public final String b() {
        return this.f146661b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17849c)) {
            return false;
        }
        C17849c cVar = (C17849c) obj;
        return this.f146660a == cVar.f146660a && C17542s.e(this.f146661b, cVar.f146661b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f146660a) * 31) + this.f146661b.hashCode();
    }

    public String toString() {
        long j10 = this.f146660a;
        String str = this.f146661b;
        return "UserMessage(id=" + j10 + ", message=" + str + ")";
    }
}
