package Rj;

import IC.C13023e;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LRj/c;", "LRj/g;", "LIC/e;", "uiText", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "g", "()LIC/e;", "", "b", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final int f86428c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f86429a;

    /* renamed from: b  reason: collision with root package name */
    private final long f86430b;

    public c(C13023e eVar) {
        C17542s.j(eVar, "uiText");
        this.f86429a = eVar;
        U u10 = new U(3);
        u10.a(P.b(c.class));
        u10.a(eVar);
        u10.b(new Object[0]);
        this.f86430b = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C17542s.e(this.f86429a, ((c) obj).f86429a);
    }

    public long f() {
        return this.f86430b;
    }

    public final C13023e g() {
        return this.f86429a;
    }

    public int hashCode() {
        return this.f86429a.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f86429a;
        return "Header(uiText=" + eVar + ")";
    }
}
