package Mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LMc/y;", "", "", "sessionId", "firstSessionId", "", "sessionIndex", "", "sessionStartTimestampUs", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "J", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final String f61866a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61867b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61868c;

    /* renamed from: d  reason: collision with root package name */
    private final long f61869d;

    public y(String str, String str2, int i10, long j10) {
        C17542s.j(str, "sessionId");
        C17542s.j(str2, "firstSessionId");
        this.f61866a = str;
        this.f61867b = str2;
        this.f61868c = i10;
        this.f61869d = j10;
    }

    public final String a() {
        return this.f61867b;
    }

    public final String b() {
        return this.f61866a;
    }

    public final int c() {
        return this.f61868c;
    }

    public final long d() {
        return this.f61869d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return C17542s.e(this.f61866a, yVar.f61866a) && C17542s.e(this.f61867b, yVar.f61867b) && this.f61868c == yVar.f61868c && this.f61869d == yVar.f61869d;
    }

    public int hashCode() {
        return (((((this.f61866a.hashCode() * 31) + this.f61867b.hashCode()) * 31) + Integer.hashCode(this.f61868c)) * 31) + Long.hashCode(this.f61869d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f61866a + ", firstSessionId=" + this.f61867b + ", sessionIndex=" + this.f61868c + ", sessionStartTimestampUs=" + this.f61869d + ')';
    }
}
