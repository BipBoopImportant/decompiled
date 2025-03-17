package androidx.compose.ui.focus;

import G1.V;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5635o;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "LG1/V;", "Landroidx/compose/ui/focus/c;", "Lkotlin/Function1;", "Ln1/o;", "LXH/N;", "onFocusChanged", "<init>", "(LnI/l;)V", "c", "()Landroidx/compose/ui/focus/c;", "node", "f", "(Landroidx/compose/ui/focus/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/l;", "getOnFocusChanged", "()LnI/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusChangedElement extends V<c> {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C5635o, C16807N> f18799d;

    public FocusChangedElement(C17642l<? super C5635o, C16807N> lVar) {
        this.f18799d = lVar;
    }

    /* renamed from: c */
    public c a() {
        return new c(this.f18799d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && C17542s.e(this.f18799d, ((FocusChangedElement) obj).f18799d);
    }

    /* renamed from: f */
    public void b(c cVar) {
        cVar.C2(this.f18799d);
    }

    public int hashCode() {
        return this.f18799d.hashCode();
    }

    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f18799d + ')';
    }
}
