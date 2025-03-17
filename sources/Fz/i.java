package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

public final class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private final MaterialCardView f110130a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCardView f110131b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f110132c;

    /* renamed from: d  reason: collision with root package name */
    public final View f110133d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f110134e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f110135f;

    /* renamed from: g  reason: collision with root package name */
    public final z f110136g;

    private i(MaterialCardView materialCardView, MaterialCardView materialCardView2, TextView textView, View view, ImageView imageView, TextView textView2, z zVar) {
        this.f110130a = materialCardView;
        this.f110131b = materialCardView2;
        this.f110132c = textView;
        this.f110133d = view;
        this.f110134e = imageView;
        this.f110135f = textView2;
        this.f110136g = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = Ez.c.f109532P0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = Ez.c.f109540T0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.i a(android.view.View r8) {
        /*
            r2 = r8
            com.google.android.material.card.MaterialCardView r2 = (com.google.android.material.card.MaterialCardView) r2
            int r0 = Ez.c.f109528N0
            android.view.View r1 = X4.b.a(r8, r0)
            r3 = r1
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0040
            int r0 = Ez.c.f109532P0
            android.view.View r4 = X4.b.a(r8, r0)
            if (r4 == 0) goto L_0x0040
            int r0 = Ez.c.f109534Q0
            android.view.View r1 = X4.b.a(r8, r0)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L_0x0040
            int r0 = Ez.c.f109536R0
            android.view.View r1 = X4.b.a(r8, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0040
            int r0 = Ez.c.f109540T0
            android.view.View r1 = X4.b.a(r8, r0)
            if (r1 == 0) goto L_0x0040
            Fz.z r7 = Fz.z.a(r1)
            Fz.i r8 = new Fz.i
            r0 = r8
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0040:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.i.a(android.view.View):Fz.i");
    }

    public static i c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109641i, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public MaterialCardView getRoot() {
        return this.f110130a;
    }
}
