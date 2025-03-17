package androidx.lifecycle;

import GJ.C15768k;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l3.e;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/k0;", "viewModelStoreOwner", "LXH/N;", "b", "(Landroid/view/View;Landroidx/lifecycle/k0;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/k0;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<View, View> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f22332c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C17542s.j(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/lifecycle/k0;", "a", "(Landroid/view/View;)Landroidx/lifecycle/k0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<View, k0> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f22333c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final k0 invoke(View view) {
            C17542s.j(view, "view");
            Object tag = view.getTag(e.f25489a);
            if (tag instanceof k0) {
                return (k0) tag;
            }
            return null;
        }
    }

    public static final k0 a(View view) {
        C17542s.j(view, "<this>");
        return (k0) C15768k.L(C15768k.T(C15768k.q(view, a.f22332c), b.f22333c));
    }

    public static final void b(View view, k0 k0Var) {
        C17542s.j(view, "<this>");
        view.setTag(e.f25489a, k0Var);
    }
}
