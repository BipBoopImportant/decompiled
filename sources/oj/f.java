package oj;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import oj.C11680a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Loj/f;", "Loj/b;", "", "packageCount", "Loj/a$a;", "analyticsEvent", "<init>", "(ILoj/a$a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "h", "b", "Loj/a$a;", "g", "()Loj/a$a;", "", "c", "J", "f", "()J", "stableId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C11681b {

    /* renamed from: a  reason: collision with root package name */
    private final int f100416a;

    /* renamed from: b  reason: collision with root package name */
    private final C11680a.C2338a f100417b;

    /* renamed from: c  reason: collision with root package name */
    private final long f100418c;

    public f(int i10, C11680a.C2338a aVar) {
        C17542s.j(aVar, "analyticsEvent");
        this.f100416a = i10;
        this.f100417b = aVar;
        Integer valueOf = Integer.valueOf(i10);
        U u10 = new U(3);
        u10.a(P.b(f.class));
        u10.a(valueOf);
        u10.b(new Object[0]);
        this.f100418c = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f100416a == fVar.f100416a && C17542s.e(this.f100417b, fVar.f100417b);
    }

    public long f() {
        return this.f100418c;
    }

    public final C11680a.C2338a g() {
        return this.f100417b;
    }

    public final int h() {
        return this.f100416a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f100416a) * 31) + this.f100417b.hashCode();
    }

    public String toString() {
        int i10 = this.f100416a;
        C11680a.C2338a aVar = this.f100417b;
        return "MultiPackageModel(packageCount=" + i10 + ", analyticsEvent=" + aVar + ")";
    }
}
