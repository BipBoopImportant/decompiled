package P4;

import GJ.C15768k;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "LP4/f;", "owner", "LXH/N;", "b", "(Landroid/view/View;LP4/f;)V", "a", "(Landroid/view/View;)LP4/f;", "savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "view", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<View, View> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f39382c = new a();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "LP4/f;", "a", "(Landroid/view/View;)LP4/f;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<View, f> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f39383c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final f invoke(View view) {
            C17542s.j(view, "view");
            Object tag = view.getTag(a.f39366a);
            if (tag instanceof f) {
                return (f) tag;
            }
            return null;
        }
    }

    public static final f a(View view) {
        C17542s.j(view, "<this>");
        return (f) C15768k.L(C15768k.T(C15768k.q(view, a.f39382c), b.f39383c));
    }

    public static final void b(View view, f fVar) {
        C17542s.j(view, "<this>");
        view.setTag(a.f39366a, fVar);
    }
}
