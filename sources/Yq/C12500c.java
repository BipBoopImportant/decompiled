package yq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"Lyq/c;", "", "", "id", "", "event", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yq.c  reason: case insensitive filesystem */
public final class C12500c {

    /* renamed from: a  reason: collision with root package name */
    private final long f107210a;

    /* renamed from: b  reason: collision with root package name */
    private final String f107211b;

    public C12500c(long j10, String str) {
        C17542s.j(str, "event");
        this.f107210a = j10;
        this.f107211b = str;
    }

    public final String a() {
        return this.f107211b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12500c)) {
            return false;
        }
        C12500c cVar = (C12500c) obj;
        return this.f107210a == cVar.f107210a && C17542s.e(this.f107211b, cVar.f107211b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f107210a) * 31) + this.f107211b.hashCode();
    }

    public String toString() {
        long j10 = this.f107210a;
        String str = this.f107211b;
        return "Events(id=" + j10 + ", event=" + str + ")";
    }
}
