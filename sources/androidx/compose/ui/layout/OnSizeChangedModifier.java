package androidx.compose.ui.layout;

import G1.V;
import XH.C16807N;
import c2.r;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "LG1/V;", "Landroidx/compose/ui/layout/h;", "Lkotlin/Function1;", "Lc2/r;", "LXH/N;", "onSizeChanged", "<init>", "(LnI/l;)V", "c", "()Landroidx/compose/ui/layout/h;", "node", "f", "(Landroidx/compose/ui/layout/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnSizeChangedModifier extends V<h> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<r, C16807N> f18988d;

    public OnSizeChangedModifier(C17642l<? super r, C16807N> lVar) {
        this.f18988d = lVar;
    }

    /* renamed from: c */
    public h a() {
        return new h(this.f18988d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        return this.f18988d == ((OnSizeChangedModifier) obj).f18988d;
    }

    /* renamed from: f */
    public void b(h hVar) {
        hVar.C2(this.f18988d);
    }

    public int hashCode() {
        return this.f18988d.hashCode();
    }
}
