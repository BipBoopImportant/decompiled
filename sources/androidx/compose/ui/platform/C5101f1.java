package androidx.compose.ui.platform;

import L1.l;
import L1.p;
import j0.C5459o;
import j0.F;
import j0.r;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/f1;", "", "LL1/p;", "semanticsNode", "Lj0/o;", "Landroidx/compose/ui/platform/g1;", "currentSemanticsNodes", "<init>", "(LL1/p;Lj0/o;)V", "LL1/l;", "a", "LL1/l;", "b", "()LL1/l;", "unmergedConfig", "Lj0/F;", "Lj0/F;", "()Lj0/F;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.f1  reason: case insensitive filesystem */
public final class C5101f1 {

    /* renamed from: a  reason: collision with root package name */
    private final l f19495a;

    /* renamed from: b  reason: collision with root package name */
    private final F f19496b = r.b();

    public C5101f1(p pVar, C5459o<C5104g1> oVar) {
        this.f19495a = pVar.w();
        List<p> t10 = pVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar2 = t10.get(i10);
            if (oVar.a(pVar2.o())) {
                this.f19496b.f(pVar2.o());
            }
        }
    }

    public final F a() {
        return this.f19496b;
    }

    public final l b() {
        return this.f19495a;
    }
}
