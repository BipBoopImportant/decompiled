package e3;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.j;
import androidx.lifecycle.i0;
import iH.C17356c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8948l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "Lx4/l;", "navBackStackEntry", "Landroidx/lifecycle/i0$c;", "b", "(Landroid/content/Context;Lx4/l;)Landroidx/lifecycle/i0$c;", "delegateFactory", "a", "(Landroid/content/Context;Landroidx/lifecycle/i0$c;)Landroidx/lifecycle/i0$c;", "hilt-navigation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final i0.c a(Context context, i0.c cVar) {
        C17542s.j(context, "context");
        C17542s.j(cVar, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof j) {
                i0.c a10 = C17356c.a((j) context, cVar);
                C17542s.i(a10, "createInternal(\n        … */ delegateFactory\n    )");
                return a10;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C17542s.i(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }

    public static final i0.c b(Context context, C8948l lVar) {
        C17542s.j(context, "context");
        C17542s.j(lVar, "navBackStackEntry");
        return a(context, lVar.getDefaultViewModelProviderFactory());
    }
}
