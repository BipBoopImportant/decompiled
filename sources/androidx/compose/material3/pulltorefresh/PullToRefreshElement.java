package androidx.compose.material3.pulltorefresh;

import G1.V;
import R0.d;
import R0.e;
import XH.C16807N;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0004\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b%\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "LG1/V;", "LR0/d;", "", "isRefreshing", "Lkotlin/Function0;", "LXH/N;", "onRefresh", "enabled", "LR0/e;", "state", "Lc2/h;", "threshold", "<init>", "(ZLnI/a;ZLR0/e;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()LR0/d;", "node", "f", "(LR0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "()Z", "e", "LnI/a;", "getOnRefresh", "()LnI/a;", "getEnabled", "g", "LR0/e;", "getState", "()LR0/e;", "h", "F", "getThreshold-D9Ej5fM", "()F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshElement extends V<d> {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18738d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C16807N> f18739e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f18740f;

    /* renamed from: g  reason: collision with root package name */
    private final e f18741g;

    /* renamed from: h  reason: collision with root package name */
    private final float f18742h;

    public /* synthetic */ PullToRefreshElement(boolean z10, C17631a aVar, boolean z11, e eVar, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, aVar, z11, eVar, f10);
    }

    /* renamed from: c */
    public d a() {
        return new d(this.f18738d, this.f18739e, this.f18740f, this.f18741g, this.f18742h, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f18738d == pullToRefreshElement.f18738d && C17542s.e(this.f18739e, pullToRefreshElement.f18739e) && this.f18740f == pullToRefreshElement.f18740f && C17542s.e(this.f18741g, pullToRefreshElement.f18741g) && h.D(this.f18742h, pullToRefreshElement.f18742h);
    }

    /* renamed from: f */
    public void b(d dVar) {
        dVar.b3(this.f18739e);
        dVar.a3(this.f18740f);
        dVar.d3(this.f18741g);
        dVar.e3(this.f18742h);
        boolean X22 = dVar.X2();
        boolean z10 = this.f18738d;
        if (X22 != z10) {
            dVar.c3(z10);
            dVar.g3();
        }
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f18738d) * 31) + this.f18739e.hashCode()) * 31) + Boolean.hashCode(this.f18740f)) * 31) + this.f18741g.hashCode()) * 31) + h.E(this.f18742h);
    }

    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.f18738d + ", onRefresh=" + this.f18739e + ", enabled=" + this.f18740f + ", state=" + this.f18741g + ", threshold=" + h.F(this.f18742h) + ')';
    }

    private PullToRefreshElement(boolean z10, C17631a<C16807N> aVar, boolean z11, e eVar, float f10) {
        this.f18738d = z10;
        this.f18739e = aVar;
        this.f18740f = z11;
        this.f18741g = eVar;
        this.f18742h = f10;
    }
}
