package androidx.compose.ui.focus;

import G1.V;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/ui/focus/FocusOwnerImpl$modifier$2", "LG1/V;", "Landroidx/compose/ui/focus/FocusTargetNode;", "c", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOwnerImpl$modifier$2 extends V<FocusTargetNode> {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FocusOwnerImpl f18819d;

    FocusOwnerImpl$modifier$2(FocusOwnerImpl focusOwnerImpl) {
        this.f18819d = focusOwnerImpl;
    }

    /* renamed from: c */
    public FocusTargetNode a() {
        return this.f18819d.t();
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    /* renamed from: f */
    public void b(FocusTargetNode focusTargetNode) {
    }

    public int hashCode() {
        return this.f18819d.t().hashCode();
    }
}
