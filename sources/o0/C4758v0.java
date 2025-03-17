package O0;

import G1.C4507j;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import p1.C5747v0;
import p1.C5753y0;
import r0.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"LO0/v0;", "Ln0/I;", "", "bounded", "Lc2/h;", "radius", "Lp1/y0;", "colorProducer", "Lp1/v0;", "color", "<init>", "(ZFLp1/y0;J)V", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/k;", "interactionSource", "LG1/j;", "a", "(Lr0/k;)LG1/j;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "F", "c", "Lp1/y0;", "d", "J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.v0  reason: case insensitive filesystem */
final class C4758v0 implements C5586I {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11548a;

    /* renamed from: b  reason: collision with root package name */
    private final float f11549b;

    /* renamed from: c  reason: collision with root package name */
    private final C5753y0 f11550c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final long f11551d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/v0;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O0.v0$a */
    static final class a implements C5753y0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4758v0 f11552a;

        a(C4758v0 v0Var) {
            this.f11552a = v0Var;
        }

        public final long a() {
            return this.f11552a.f11551d;
        }
    }

    public /* synthetic */ C4758v0(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    public C4507j a(k kVar) {
        C5753y0 y0Var = this.f11550c;
        if (y0Var == null) {
            y0Var = new a(this);
        }
        return new F(kVar, this.f11548a, this.f11549b, y0Var, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4758v0)) {
            return false;
        }
        C4758v0 v0Var = (C4758v0) obj;
        if (this.f11548a == v0Var.f11548a && h.D(this.f11549b, v0Var.f11549b) && C17542s.e(this.f11550c, v0Var.f11550c)) {
            return C5747v0.q(this.f11551d, v0Var.f11551d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f11548a) * 31) + h.E(this.f11549b)) * 31;
        C5753y0 y0Var = this.f11550c;
        return ((hashCode + (y0Var != null ? y0Var.hashCode() : 0)) * 31) + C5747v0.w(this.f11551d);
    }

    private C4758v0(boolean z10, float f10, C5753y0 y0Var, long j10) {
        this.f11548a = z10;
        this.f11549b = f10;
        this.f11550c = y0Var;
        this.f11551d = j10;
    }

    private C4758v0(boolean z10, float f10, long j10) {
        this(z10, f10, (C5753y0) null, j10);
    }
}
