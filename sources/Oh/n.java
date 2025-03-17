package oH;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LoH/n;", "", "LoH/m;", "paddings", "margins", "<init>", "(LoH/m;LoH/m;)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LoH/m;", "b", "()LoH/m;", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final m f145286a;

    /* renamed from: b  reason: collision with root package name */
    private final m f145287b;

    public n() {
        this((m) null, (m) null, 3, (DefaultConstructorMarker) null);
    }

    public final m a() {
        return this.f145287b;
    }

    public final m b() {
        return this.f145286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return C17542s.e(this.f145286a, nVar.f145286a) && C17542s.e(this.f145287b, nVar.f145287b);
    }

    public int hashCode() {
        return (this.f145286a.hashCode() * 31) + this.f145287b.hashCode();
    }

    public String toString() {
        m mVar = this.f145286a;
        m mVar2 = this.f145287b;
        return "ViewState(paddings=" + mVar + ", margins=" + mVar2 + ")";
    }

    public n(m mVar, m mVar2) {
        C17542s.j(mVar, "paddings");
        C17542s.j(mVar2, "margins");
        this.f145286a = mVar;
        this.f145287b = mVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(m mVar, m mVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? m.f145281f : mVar, (i10 & 2) != 0 ? m.f145281f : mVar2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(View view) {
        this(o.b(view), o.a(view));
        C17542s.j(view, "view");
    }
}
