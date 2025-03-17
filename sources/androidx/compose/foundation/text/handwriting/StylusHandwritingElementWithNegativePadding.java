package androidx.compose.foundation.text.handwriting;

import C0.b;
import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "LG1/V;", "LC0/b;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(LnI/a;)V", "c", "()LC0/b;", "node", "LXH/N;", "f", "(LC0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/a;", "getOnHandwritingSlopExceeded", "()LnI/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StylusHandwritingElementWithNegativePadding extends V<b> {

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<Boolean> f18506d;

    public StylusHandwritingElementWithNegativePadding(C17631a<Boolean> aVar) {
        this.f18506d = aVar;
    }

    /* renamed from: c */
    public b a() {
        return new b(this.f18506d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && C17542s.e(this.f18506d, ((StylusHandwritingElementWithNegativePadding) obj).f18506d);
    }

    /* renamed from: f */
    public void b(b bVar) {
        bVar.K2(this.f18506d);
    }

    public int hashCode() {
        return this.f18506d.hashCode();
    }

    public String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f18506d + ')';
    }
}
