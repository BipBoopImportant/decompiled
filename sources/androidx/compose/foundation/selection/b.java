package androidx.compose.foundation.selection;

import G1.x0;
import L1.i;
import L1.v;
import L1.x;
import XH.C16807N;
import androidx.compose.foundation.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/selection/b;", "Landroidx/compose/foundation/e;", "", "selected", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "enabled", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d3", "(ZLr0/m;Ln0/I;ZLL1/i;LnI/a;)V", "LL1/x;", "O2", "(LL1/x;)V", "J", "Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b extends e {

    /* renamed from: J  reason: collision with root package name */
    private boolean f18488J;

    public /* synthetic */ b(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, mVar, i10, z11, iVar, aVar);
    }

    public void O2(x xVar) {
        v.m0(xVar, this.f18488J);
    }

    public final void d3(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17631a<C16807N> aVar) {
        if (this.f18488J != z10) {
            this.f18488J = z10;
            x0.b(this);
        }
        super.c3(mVar, i10, z11, (String) null, iVar, aVar);
    }

    private b(boolean z10, m mVar, C5586I i10, boolean z11, i iVar, C17631a<C16807N> aVar) {
        super(mVar, i10, z11, (String) null, iVar, aVar, (DefaultConstructorMarker) null);
        this.f18488J = z10;
    }
}
