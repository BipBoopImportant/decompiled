package androidx.compose.ui.focus;

import G1.C4508k;
import G1.G;
import W0.b;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/s;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "LG1/G;", "layoutNode", "LW0/b;", "b", "(LG1/G;)LW0/b;", "a", "", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class s implements Comparator<FocusTargetNode> {

    /* renamed from: a  reason: collision with root package name */
    public static final s f18875a = new s();

    private s() {
    }

    private final b<G> b(G g10) {
        b<G> bVar = new b<>(new G[16], 0);
        while (g10 != null) {
            bVar.a(0, g10);
            g10 = g10.q0();
        }
        return bVar;
    }

    /* renamed from: a */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i10 = 0;
        if (r.g(focusTargetNode) && r.g(focusTargetNode2)) {
            G m10 = C4508k.m(focusTargetNode);
            G m11 = C4508k.m(focusTargetNode2);
            if (C17542s.e(m10, m11)) {
                return 0;
            }
            b<G> b10 = b(m10);
            b<G> b11 = b(m11);
            int min = Math.min(b10.r() - 1, b11.r() - 1);
            if (min >= 0) {
                while (C17542s.e(b10.q()[i10], b11.q()[i10])) {
                    if (i10 != min) {
                        i10++;
                    }
                }
                return C17542s.l(((G) b10.q()[i10]).r0(), ((G) b11.q()[i10]).r0());
            }
            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
        } else if (r.g(focusTargetNode)) {
            return -1;
        } else {
            return r.g(focusTargetNode2) ? 1 : 0;
        }
    }
}
