package androidx.compose.ui.layout;

import E1.C4488v;
import G1.V;
import XH.C16807N;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "LG1/V;", "Landroidx/compose/ui/layout/d;", "Lkotlin/Function1;", "LE1/v;", "LXH/N;", "onGloballyPositioned", "<init>", "(LnI/l;)V", "c", "()Landroidx/compose/ui/layout/d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "node", "f", "(Landroidx/compose/ui/layout/d;)V", "d", "LnI/l;", "getOnGloballyPositioned", "()LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnGloballyPositionedElement extends V<d> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C4488v, C16807N> f18986d;

    public OnGloballyPositionedElement(C17642l<? super C4488v, C16807N> lVar) {
        this.f18986d = lVar;
    }

    /* renamed from: c */
    public d a() {
        return new d(this.f18986d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return this.f18986d == ((OnGloballyPositionedElement) obj).f18986d;
    }

    /* renamed from: f */
    public void b(d dVar) {
        dVar.C2(this.f18986d);
    }

    public int hashCode() {
        return this.f18986d.hashCode();
    }
}
