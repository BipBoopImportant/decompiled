package N2;

import I2.C4610g0;
import I2.C4612h0;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"(\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "LN2/b;", "listener", "LXH/N;", "a", "(Landroid/view/View;LN2/b;)V", "g", "b", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "c", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "e", "(Landroid/view/View;)Z", "h", "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "LN2/c;", "d", "(Landroid/view/View;)LN2/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f9517a = d.f9521b;

    /* renamed from: b  reason: collision with root package name */
    private static final int f9518b = d.f9520a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, b bVar) {
        C17542s.j(view, "<this>");
        C17542s.j(bVar, "listener");
        d(view).a(bVar);
    }

    public static final void b(View view) {
        C17542s.j(view, "<this>");
        for (View d10 : C4612h0.a(view)) {
            d(d10).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "<this>");
        for (View d10 : C4610g0.b(viewGroup)) {
            d(d10).b();
        }
    }

    private static final c d(View view) {
        int i10 = f9517a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean e(View view) {
        C17542s.j(view, "<this>");
        Object tag = view.getTag(f9518b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        C17542s.j(view, "<this>");
        for (ViewParent next : C4612h0.b(view)) {
            if ((next instanceof View) && e((View) next)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(View view, b bVar) {
        C17542s.j(view, "<this>");
        C17542s.j(bVar, "listener");
        d(view).c(bVar);
    }

    public static final void h(View view, boolean z10) {
        C17542s.j(view, "<this>");
        view.setTag(f9518b, Boolean.valueOf(z10));
    }
}
