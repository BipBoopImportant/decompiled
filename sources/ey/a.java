package Ey;

import By.C12672k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.navigation.NavigationView;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final NavigationView f109482a;

    /* renamed from: b  reason: collision with root package name */
    public final NavigationView f109483b;

    private a(NavigationView navigationView, NavigationView navigationView2) {
        this.f109482a = navigationView;
        this.f109483b = navigationView2;
    }

    public static a a(View view) {
        if (view != null) {
            NavigationView navigationView = (NavigationView) view;
            return new a(navigationView, navigationView);
        }
        throw new NullPointerException("rootView");
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C12672k.f108237a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public NavigationView getRoot() {
        return this.f109482a;
    }
}
