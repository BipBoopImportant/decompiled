package androidx.compose.ui.layout;

import E1.C;
import E1.H;
import E1.J;
import E1.K;
import G1.V;
import c2.C5267b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "LG1/V;", "LE1/C;", "Lkotlin/Function3;", "LE1/K;", "LE1/H;", "Lc2/b;", "LE1/J;", "measure", "<init>", "(LnI/q;)V", "c", "()LE1/C;", "node", "LXH/N;", "f", "(LE1/C;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LnI/q;", "getMeasure", "()LnI/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutElement extends V<C> {

    /* renamed from: d  reason: collision with root package name */
    private final q<K, H, C5267b, J> f18984d;

    public LayoutElement(q<? super K, ? super H, ? super C5267b, ? extends J> qVar) {
        this.f18984d = qVar;
    }

    /* renamed from: c */
    public C a() {
        return new C(this.f18984d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && C17542s.e(this.f18984d, ((LayoutElement) obj).f18984d);
    }

    /* renamed from: f */
    public void b(C c10) {
        c10.C2(this.f18984d);
    }

    public int hashCode() {
        return this.f18984d.hashCode();
    }

    public String toString() {
        return "LayoutElement(measure=" + this.f18984d + ')';
    }
}
