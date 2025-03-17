package androidx.compose.foundation.layout;

import E1.L;
import G1.V;
import androidx.compose.foundation.layout.I;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineBlockElement;", "LG1/V;", "Landroidx/compose/foundation/layout/I$a;", "Lkotlin/Function1;", "LE1/L;", "", "block", "<init>", "(LnI/l;)V", "c", "()Landroidx/compose/foundation/layout/I$a;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/I$a;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "LnI/l;", "getBlock", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WithAlignmentLineBlockElement extends V<I.a> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<L, Integer> f18042d;

    public WithAlignmentLineBlockElement(C17642l<? super L, Integer> lVar) {
        this.f18042d = lVar;
    }

    /* renamed from: c */
    public I.a a() {
        return new I.a(this.f18042d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        if (withAlignmentLineBlockElement == null) {
            return false;
        }
        return this.f18042d == withAlignmentLineBlockElement.f18042d;
    }

    /* renamed from: f */
    public void b(I.a aVar) {
        aVar.C2(this.f18042d);
    }

    public int hashCode() {
        return this.f18042d.hashCode();
    }
}
