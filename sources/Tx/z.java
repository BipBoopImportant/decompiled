package tx;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wx.c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltx/z;", "Landroidx/recyclerview/widget/RecyclerView$G;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "Lwx/c;", "valueHolder", "LXH/N;", "c", "(Lwx/c;)V", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z extends RecyclerView.G {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(View view) {
        super(view);
        C17542s.j(view, "rootView");
    }

    public abstract void c(c cVar);
}
