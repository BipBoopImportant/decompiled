package Vi;

import Fz.z;
import Oo.b;
import android.text.style.StyleSpan;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LFz/z;", "LVi/m0;", "viewModel", "LXH/N;", "a", "(LFz/z;LVi/m0;)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {
    public static final void a(z zVar, m0 m0Var) {
        C17542s.j(zVar, "<this>");
        C17542s.j(m0Var, "viewModel");
        TextView textView = zVar.f110234b;
        C17542s.i(textView, "quantityHint");
        textView.setVisibility(m0Var.c() ? 0 : 8);
        TextView textView2 = zVar.f110236d;
        String string = zVar.getRoot().getContext().getString(b.f84585a7, new Object[]{Integer.valueOf(m0Var.a())});
        C17542s.i(string, "getString(...)");
        textView2.setText(w0.a(string, String.valueOf(m0Var.a()), new StyleSpan(1)));
        zVar.f110235c.setImageResource(m0Var.b().b());
    }
}
