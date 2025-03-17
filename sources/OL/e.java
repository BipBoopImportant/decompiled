package ol;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.M;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lol/e;", "", "Lp1/v0;", "containerColor", "scrolledContainerColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "colorTransitionFraction", "a", "(FLU0/m;I)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "b", "getScrolledContainerColor-0d7_KjU", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f100523a;

    /* renamed from: b  reason: collision with root package name */
    private final long f100524b;

    public /* synthetic */ e(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a(float f10, C4889m mVar, int i10) {
        mVar.W(1278289731);
        if (C4895p.J()) {
            C4895p.S(1278289731, i10, -1, "com.ingka.ikea.app.uicomposables.FlexibleTopBarColors.containerColor (FlexibleTopBar.kt:205)");
        }
        long i11 = C5751x0.i(this.f100523a, this.f100524b, M.c().a(f10));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C5747v0.q(this.f100523a, eVar.f100523a) && C5747v0.q(this.f100524b, eVar.f100524b);
    }

    public int hashCode() {
        return (C5747v0.w(this.f100523a) * 31) + C5747v0.w(this.f100524b);
    }

    private e(long j10, long j11) {
        this.f100523a = j10;
        this.f100524b = j11;
    }
}
