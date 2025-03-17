package AF;

import QE.d0;
import XH.v;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LAF/a;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/d0;", "binding", "LXH/v;", "", "", "data", "<init>", "(LQE/d0;LXH/v;)V", "e", "LQE/d0;", "getBinding", "()LQE/d0;", "f", "LXH/v;", "getData", "()LXH/v;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.a  reason: case insensitive filesystem */
public final class C12581a extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final d0 f107691e;

    /* renamed from: f  reason: collision with root package name */
    private final v<String, Integer> f107692f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12581a(d0 d0Var, v<String, Integer> vVar) {
        super(d0Var.getRoot());
        C17542s.j(d0Var, "binding");
        this.f107691e = d0Var;
        this.f107692f = vVar;
        if (vVar != null) {
            d0Var.f114553c.setText(vVar.c());
            d0Var.f114552b.setImageResource(vVar.d().intValue());
        }
    }
}
