package tx;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sx.C15051b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ltx/d;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "textView", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tx.d  reason: case insensitive filesystem */
public final class C15097d extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final TextView f131223e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15097d(View view) {
        super(view);
        C17542s.j(view, "rootView");
        View findViewById = view.findViewById(C15051b.f131007e);
        C17542s.i(findViewById, "findViewById(...)");
        this.f131223e = (TextView) findViewById;
    }

    public final TextView c() {
        return this.f131223e;
    }
}
