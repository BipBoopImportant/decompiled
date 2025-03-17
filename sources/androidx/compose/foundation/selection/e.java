package androidx.compose.foundation.selection;

import G1.x0;
import L1.i;
import L1.v;
import L1.x;
import M1.a;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import r0.m;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/selection/e;", "Landroidx/compose/foundation/e;", "LM1/a;", "state", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "LL1/i;", "role", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(LM1/a;Lr0/m;Ln0/I;ZLL1/i;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d3", "(LM1/a;Lr0/m;Ln0/I;ZLL1/i;LnI/a;)V", "LL1/x;", "O2", "(LL1/x;)V", "J", "LM1/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e extends androidx.compose.foundation.e {

    /* renamed from: J  reason: collision with root package name */
    private a f18505J;

    public /* synthetic */ e(a aVar, m mVar, C5586I i10, boolean z10, i iVar, C17631a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, mVar, i10, z10, iVar, aVar2);
    }

    public void O2(x xVar) {
        v.z0(xVar, this.f18505J);
    }

    public final void d3(a aVar, m mVar, C5586I i10, boolean z10, i iVar, C17631a<C16807N> aVar2) {
        if (this.f18505J != aVar) {
            this.f18505J = aVar;
            x0.b(this);
        }
        super.c3(mVar, i10, z10, (String) null, iVar, aVar2);
    }

    private e(a aVar, m mVar, C5586I i10, boolean z10, i iVar, C17631a<C16807N> aVar2) {
        super(mVar, i10, z10, (String) null, iVar, aVar2, (DefaultConstructorMarker) null);
        this.f18505J = aVar;
    }
}
