package a9;

import G8.g;
import HJ.C15854t;
import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.d6  reason: case insensitive filesystem */
public final class C6812d6 extends C17544u implements C17642l<View, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6876l6 f42515c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6812d6(C6876l6 l6Var) {
        super(1);
        this.f42515c = l6Var;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        C17542s.j(view, "it");
        this.f42515c.getClass();
        boolean z10 = false;
        if (C6876l6.e(view)) {
            this.f42515c.getClass();
            C17542s.j(view, "view");
            if (!(view instanceof WebView) && !g.h(view, "NavigationMenuView") && !C15854t.W("javaClass", "androidx.viewpager2.widget.ViewPager2", false, 2, (Object) null)) {
                this.f42515c.getClass();
                if (!C6876l6.d(view)) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
