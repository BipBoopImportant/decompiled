package Rh;

import Ph.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class a implements X4.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f63204a;

    /* renamed from: b  reason: collision with root package name */
    public final ScrollView f63205b;

    /* renamed from: c  reason: collision with root package name */
    public final b f63206c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f63207d;

    private a(ConstraintLayout constraintLayout, ScrollView scrollView, b bVar, FrameLayout frameLayout) {
        this.f63204a = constraintLayout;
        this.f63205b = scrollView;
        this.f63206c = bVar;
        this.f63207d = frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = Ph.b.f62813g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Rh.a a(android.view.View r4) {
        /*
            int r0 = Ph.b.f62809c
            android.view.View r1 = X4.b.a(r4, r0)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            if (r1 == 0) goto L_0x0029
            int r0 = Ph.b.f62813g
            android.view.View r2 = X4.b.a(r4, r0)
            if (r2 == 0) goto L_0x0029
            Rh.b r0 = Rh.b.a(r2)
            int r2 = Ph.b.f62830x
            android.view.View r3 = X4.b.a(r4, r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r3 == 0) goto L_0x0028
            Rh.a r2 = new Rh.a
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2.<init>(r4, r1, r0, r3)
            return r2
        L_0x0028:
            r0 = r2
        L_0x0029:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.a.a(android.view.View):Rh.a");
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(c.f62833a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f63204a;
    }
}
