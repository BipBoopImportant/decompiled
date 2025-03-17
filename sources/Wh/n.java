package wh;

import M6.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwh/n;", "", "", "deliveryId", "timeWindowId", "LM6/y;", "pickUpPointId", "Lwh/p;", "timeWindowCapabilities", "<init>", "(Ljava/lang/String;Ljava/lang/String;LM6/y;Lwh/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "LM6/y;", "()LM6/y;", "Lwh/p;", "()Lwh/p;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f77672a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77673b;

    /* renamed from: c  reason: collision with root package name */
    private final y<String> f77674c;

    /* renamed from: d  reason: collision with root package name */
    private final p f77675d;

    public n(String str, String str2, y<String> yVar, p pVar) {
        C17542s.j(str, "deliveryId");
        C17542s.j(str2, "timeWindowId");
        C17542s.j(yVar, "pickUpPointId");
        C17542s.j(pVar, "timeWindowCapabilities");
        this.f77672a = str;
        this.f77673b = str2;
        this.f77674c = yVar;
        this.f77675d = pVar;
    }

    public final String a() {
        return this.f77672a;
    }

    public final y<String> b() {
        return this.f77674c;
    }

    public final p c() {
        return this.f77675d;
    }

    public final String d() {
        return this.f77673b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f77672a, nVar.f77672a) && C17542s.e(this.f77673b, nVar.f77673b) && C17542s.e(this.f77674c, nVar.f77674c) && C17542s.e(this.f77675d, nVar.f77675d);
    }

    public int hashCode() {
        return (((((this.f77672a.hashCode() * 31) + this.f77673b.hashCode()) * 31) + this.f77674c.hashCode()) * 31) + this.f77675d.hashCode();
    }

    public String toString() {
        String str = this.f77672a;
        String str2 = this.f77673b;
        y<String> yVar = this.f77674c;
        p pVar = this.f77675d;
        return "SelectedDeliveryInput(deliveryId=" + str + ", timeWindowId=" + str2 + ", pickUpPointId=" + yVar + ", timeWindowCapabilities=" + pVar + ")";
    }
}
