package QE;

import OE.C13317i;
import X4.a;
import X4.b;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: QE.d  reason: case insensitive filesystem */
public final class C13427d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final AppBarLayout f114548a;

    /* renamed from: b  reason: collision with root package name */
    public final AppBarLayout f114549b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialToolbar f114550c;

    private C13427d(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, MaterialToolbar materialToolbar) {
        this.f114548a = appBarLayout;
        this.f114549b = appBarLayout2;
        this.f114550c = materialToolbar;
    }

    public static C13427d a(View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i10 = C13317i.f113044l3;
        MaterialToolbar materialToolbar = (MaterialToolbar) b.a(view, i10);
        if (materialToolbar != null) {
            return new C13427d(appBarLayout, appBarLayout, materialToolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    /* renamed from: b */
    public AppBarLayout getRoot() {
        return this.f114548a;
    }
}
