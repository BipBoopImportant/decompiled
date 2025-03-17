package x4;

import GJ.C15768k;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lx4/H;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lx4/o;", "b", "(Landroid/view/View;)Lx4/o;", "controller", "LXH/N;", "e", "(Landroid/view/View;Lx4/o;)V", "c", "d", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public static final H f57452a = new H();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<View, View> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f57453c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final View invoke(View view) {
            C17542s.j(view, "it");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lx4/o;", "a", "(Landroid/view/View;)Lx4/o;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<View, C8951o> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f57454c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final C8951o invoke(View view) {
            C17542s.j(view, "it");
            return H.f57452a.d(view);
        }
    }

    private H() {
    }

    public static final C8951o b(View view) {
        C17542s.j(view, "view");
        C8951o c10 = f57452a.c(view);
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final C8951o c(View view) {
        return (C8951o) C15768k.L(C15768k.T(C15768k.q(view, a.f57453c), b.f57454c));
    }

    /* access modifiers changed from: private */
    public final C8951o d(View view) {
        Object tag = view.getTag(M.f57472a);
        if (tag instanceof WeakReference) {
            return (C8951o) ((WeakReference) tag).get();
        }
        if (tag instanceof C8951o) {
            return (C8951o) tag;
        }
        return null;
    }

    public static final void e(View view, C8951o oVar) {
        C17542s.j(view, "view");
        view.setTag(M.f57472a, oVar);
    }
}
