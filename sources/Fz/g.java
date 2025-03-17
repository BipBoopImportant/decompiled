package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110121a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialButton f110122b;

    /* renamed from: c  reason: collision with root package name */
    public final MaterialButton f110123c;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f110124d;

    /* renamed from: e  reason: collision with root package name */
    public final View f110125e;

    private g(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, RecyclerView recyclerView, View view) {
        this.f110121a = constraintLayout;
        this.f110122b = materialButton;
        this.f110123c = materialButton2;
        this.f110124d = recyclerView;
        this.f110125e = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = Ez.c.f109594n1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.g a(android.view.View r8) {
        /*
            int r0 = Ez.c.f109525M
            android.view.View r1 = X4.b.a(r8, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L_0x0033
            int r0 = Ez.c.f109527N
            android.view.View r1 = X4.b.a(r8, r0)
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            if (r5 == 0) goto L_0x0033
            int r0 = Ez.c.f109564d1
            android.view.View r1 = X4.b.a(r8, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0033
            int r0 = Ez.c.f109594n1
            android.view.View r7 = X4.b.a(r8, r0)
            if (r7 == 0) goto L_0x0033
            Fz.g r0 = new Fz.g
            r3 = r8
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0033:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.g.a(android.view.View):Fz.g");
    }

    public static g c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109639g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110121a;
    }
}
