package Sb;

import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LSb/c;", "", "", "sessionId", "", "timestamp", "", "additionalCustomKeys", "<init>", "(Ljava/lang/String;JLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f63271a;

    /* renamed from: b  reason: collision with root package name */
    private final long f63272b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f63273c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(String str, long j10) {
        this(str, j10, (Map) null, 4, (DefaultConstructorMarker) null);
        C17542s.j(str, "sessionId");
    }

    public final Map<String, String> a() {
        return this.f63273c;
    }

    public final String b() {
        return this.f63271a;
    }

    public final long c() {
        return this.f63272b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f63271a, cVar.f63271a) && this.f63272b == cVar.f63272b && C17542s.e(this.f63273c, cVar.f63273c);
    }

    public int hashCode() {
        return (((this.f63271a.hashCode() * 31) + Long.hashCode(this.f63272b)) * 31) + this.f63273c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f63271a + ", timestamp=" + this.f63272b + ", additionalCustomKeys=" + this.f63273c + ')';
    }

    public c(String str, long j10, Map<String, String> map) {
        C17542s.j(str, "sessionId");
        C17542s.j(map, "additionalCustomKeys");
        this.f63271a = str;
        this.f63272b = j10;
        this.f63273c = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? X.j() : map);
    }
}
