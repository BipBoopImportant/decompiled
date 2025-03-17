package androidx.compose.foundation.lazy.layout;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import p0.v;
import v0.t;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "LG1/V;", "Landroidx/compose/foundation/lazy/layout/g;", "Lkotlin/Function0;", "Lv0/t;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Lp0/v;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(LnI/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Lp0/v;ZZ)V", "c", "()Landroidx/compose/foundation/lazy/layout/g;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/lazy/layout/g;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "LnI/a;", "getItemProviderLambda", "()LnI/a;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "getState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "Lp0/v;", "getOrientation", "()Lp0/v;", "g", "Z", "getUserScrollEnabled", "()Z", "h", "getReverseScrolling", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends V<g> {

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<t> f18285d;

    /* renamed from: e  reason: collision with root package name */
    private final LazyLayoutSemanticState f18286e;

    /* renamed from: f  reason: collision with root package name */
    private final v f18287f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18288g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f18289h;

    public LazyLayoutSemanticsModifier(C17631a<? extends t> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, v vVar, boolean z10, boolean z11) {
        this.f18285d = aVar;
        this.f18286e = lazyLayoutSemanticState;
        this.f18287f = vVar;
        this.f18288g = z10;
        this.f18289h = z11;
    }

    /* renamed from: c */
    public g a() {
        return new g(this.f18285d, this.f18286e, this.f18287f, this.f18288g, this.f18289h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f18285d == lazyLayoutSemanticsModifier.f18285d && C17542s.e(this.f18286e, lazyLayoutSemanticsModifier.f18286e) && this.f18287f == lazyLayoutSemanticsModifier.f18287f && this.f18288g == lazyLayoutSemanticsModifier.f18288g && this.f18289h == lazyLayoutSemanticsModifier.f18289h;
    }

    /* renamed from: f */
    public void b(g gVar) {
        gVar.G2(this.f18285d, this.f18286e, this.f18287f, this.f18288g, this.f18289h);
    }

    public int hashCode() {
        return (((((((this.f18285d.hashCode() * 31) + this.f18286e.hashCode()) * 31) + this.f18287f.hashCode()) * 31) + Boolean.hashCode(this.f18288g)) * 31) + Boolean.hashCode(this.f18289h);
    }
}
