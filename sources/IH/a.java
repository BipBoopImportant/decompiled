package Ih;

import Hh.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f61111a;

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f61112b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f61113c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f61114d;

    /* renamed from: e  reason: collision with root package name */
    public final FloatingActionButton f61115e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f61116f;

    /* renamed from: g  reason: collision with root package name */
    public final FloatingActionButton f61117g;

    /* renamed from: h  reason: collision with root package name */
    public final View f61118h;

    /* renamed from: i  reason: collision with root package name */
    public final MapView f61119i;

    /* renamed from: j  reason: collision with root package name */
    public final HorizontalProgressView f61120j;

    private a(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, FloatingActionButton floatingActionButton, RecyclerView recyclerView, FloatingActionButton floatingActionButton2, View view, MapView mapView, HorizontalProgressView horizontalProgressView) {
        this.f61111a = coordinatorLayout;
        this.f61112b = linearLayout;
        this.f61113c = imageView;
        this.f61114d = frameLayout;
        this.f61115e = floatingActionButton;
        this.f61116f = recyclerView;
        this.f61117g = floatingActionButton2;
        this.f61118h = view;
        this.f61119i = mapView;
        this.f61120j = horizontalProgressView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = Hh.b.f60988h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Ih.a a(android.view.View r13) {
        /*
            int r0 = Hh.b.f60981a
            android.view.View r1 = X4.b.a(r13, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x006a
            int r0 = Hh.b.f60982b
            android.view.View r1 = X4.b.a(r13, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x006a
            int r0 = Hh.b.f60983c
            android.view.View r1 = X4.b.a(r13, r0)
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x006a
            int r0 = Hh.b.f60984d
            android.view.View r1 = X4.b.a(r13, r0)
            r7 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r7
            if (r7 == 0) goto L_0x006a
            int r0 = Hh.b.f60985e
            android.view.View r1 = X4.b.a(r13, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x006a
            int r0 = Hh.b.f60986f
            android.view.View r1 = X4.b.a(r13, r0)
            r9 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r9 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r9
            if (r9 == 0) goto L_0x006a
            int r0 = Hh.b.f60988h
            android.view.View r10 = X4.b.a(r13, r0)
            if (r10 == 0) goto L_0x006a
            int r0 = Hh.b.f60989i
            android.view.View r1 = X4.b.a(r13, r0)
            r11 = r1
            com.google.android.gms.maps.MapView r11 = (com.google.android.gms.maps.MapView) r11
            if (r11 == 0) goto L_0x006a
            int r0 = Hh.b.f60990j
            android.view.View r1 = X4.b.a(r13, r0)
            r12 = r1
            com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView r12 = (com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView) r12
            if (r12 == 0) goto L_0x006a
            Ih.a r0 = new Ih.a
            r3 = r13
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006a:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.a.a(android.view.View):Ih.a");
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f60992a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f61111a;
    }
}
