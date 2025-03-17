package I0;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"LI0/t;", "LI0/g;", "Lp1/v0;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "LU0/A1;", "a", "(ZLU0/m;I)LU0/A1;", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "d", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I0.t  reason: case insensitive filesystem */
final class C4583t implements C4558g {

    /* renamed from: a  reason: collision with root package name */
    private final long f8361a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8362b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8363c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8364d;

    public /* synthetic */ C4583t(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public A1<C5747v0> a(boolean z10, C4889m mVar, int i10) {
        mVar.W(-655254499);
        if (C4895p.J()) {
            C4895p.S(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:587)");
        }
        A1<C5747v0> q10 = p1.q(C5747v0.k(z10 ? this.f8361a : this.f8363c), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q10;
    }

    public A1<C5747v0> b(boolean z10, C4889m mVar, int i10) {
        mVar.W(-2133647540);
        if (C4895p.J()) {
            C4895p.S(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:592)");
        }
        A1<C5747v0> q10 = p1.q(C5747v0.k(z10 ? this.f8362b : this.f8364d), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4583t.class != obj.getClass()) {
            return false;
        }
        C4583t tVar = (C4583t) obj;
        return C5747v0.q(this.f8361a, tVar.f8361a) && C5747v0.q(this.f8362b, tVar.f8362b) && C5747v0.q(this.f8363c, tVar.f8363c) && C5747v0.q(this.f8364d, tVar.f8364d);
    }

    public int hashCode() {
        return (((((C5747v0.w(this.f8361a) * 31) + C5747v0.w(this.f8362b)) * 31) + C5747v0.w(this.f8363c)) * 31) + C5747v0.w(this.f8364d);
    }

    private C4583t(long j10, long j11, long j12, long j13) {
        this.f8361a = j10;
        this.f8362b = j11;
        this.f8363c = j12;
        this.f8364d = j13;
    }
}
