package tx;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import sx.C15050a;
import sx.C15051b;
import wx.c;
import wx.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ltx/y;", "Ltx/z;", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "Lwx/c;", "valueHolder", "LXH/N;", "c", "(Lwx/c;)V", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "textView", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y extends z {

    /* renamed from: e  reason: collision with root package name */
    private final TextView f131249e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(View view) {
        super(view);
        C17542s.j(view, "rootView");
        View findViewById = view.findViewById(C15051b.f131004b);
        C17542s.i(findViewById, "findViewById(...)");
        this.f131249e = (TextView) findViewById;
    }

    public void c(c cVar) {
        String str;
        C17542s.j(cVar, "valueHolder");
        TextView textView = this.f131249e;
        e eVar = cVar instanceof e ? (e) cVar : null;
        if (eVar == null || (str = eVar.d()) == null) {
            str = "";
        }
        textView.setText(str);
        this.itemView.setBackgroundResource(cVar.a() ? C15050a.f131002a : C10027d.f75275f);
    }
}
