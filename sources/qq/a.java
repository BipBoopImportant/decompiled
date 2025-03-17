package Qq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"LQq/a;", "", "", "title", "expiration", "", "amount", "LQq/d;", "expirationDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILQq/d;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "I", "LQq/d;", "()LQq/d;", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f86109a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86110b;

    /* renamed from: c  reason: collision with root package name */
    private final int f86111c;

    /* renamed from: d  reason: collision with root package name */
    private final d f86112d;

    public a(String str, String str2, int i10, d dVar) {
        C17542s.j(str, "title");
        C17542s.j(str2, "expiration");
        this.f86109a = str;
        this.f86110b = str2;
        this.f86111c = i10;
        this.f86112d = dVar;
    }

    public final int a() {
        return this.f86111c;
    }

    public final String b() {
        return this.f86110b;
    }

    public final d c() {
        return this.f86112d;
    }

    public final String d() {
        return this.f86109a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f86109a, aVar.f86109a) && C17542s.e(this.f86110b, aVar.f86110b) && this.f86111c == aVar.f86111c && C17542s.e(this.f86112d, aVar.f86112d);
    }

    public int hashCode() {
        int hashCode = ((((this.f86109a.hashCode() * 31) + this.f86110b.hashCode()) * 31) + Integer.hashCode(this.f86111c)) * 31;
        d dVar = this.f86112d;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        String str = this.f86109a;
        String str2 = this.f86110b;
        int i10 = this.f86111c;
        d dVar = this.f86112d;
        return "Balance(title=" + str + ", expiration=" + str2 + ", amount=" + i10 + ", expirationDetails=" + dVar + ")";
    }
}
