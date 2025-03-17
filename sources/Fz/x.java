package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class x implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110215a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageButton f110216b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f110217c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f110218d;

    /* renamed from: e  reason: collision with root package name */
    public final RecyclerView f110219e;

    /* renamed from: f  reason: collision with root package name */
    public final FloatingActionButton f110220f;

    /* renamed from: g  reason: collision with root package name */
    public final CoordinatorLayout f110221g;

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f110222h;

    /* renamed from: i  reason: collision with root package name */
    public final u f110223i;

    private x(ConstraintLayout constraintLayout, ImageButton imageButton, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, FloatingActionButton floatingActionButton, CoordinatorLayout coordinatorLayout, RecyclerView recyclerView2, u uVar) {
        this.f110215a = constraintLayout;
        this.f110216b = imageButton;
        this.f110217c = linearLayout;
        this.f110218d = imageView;
        this.f110219e = recyclerView;
        this.f110220f = floatingActionButton;
        this.f110221g = coordinatorLayout;
        this.f110222h = recyclerView2;
        this.f110223i = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = Ez.c.f109508D0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.x a(android.view.View r12) {
        /*
            int r0 = Ez.c.f109556b
            android.view.View r1 = X4.b.a(r12, r0)
            r4 = r1
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            if (r4 == 0) goto L_0x0063
            int r0 = Ez.c.f109513G
            android.view.View r1 = X4.b.a(r12, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0063
            int r0 = Ez.c.f109515H
            android.view.View r1 = X4.b.a(r12, r0)
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0063
            int r0 = Ez.c.f109517I
            android.view.View r1 = X4.b.a(r12, r0)
            r7 = r1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = Ez.c.f109549Y
            android.view.View r1 = X4.b.a(r12, r0)
            r8 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r8 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r8
            if (r8 == 0) goto L_0x0063
            int r0 = Ez.c.f109560c0
            android.view.View r1 = X4.b.a(r12, r0)
            r9 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r9
            if (r9 == 0) goto L_0x0063
            int r0 = Ez.c.f109623x0
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = Ez.c.f109508D0
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0063
            Fz.u r11 = Fz.u.a(r1)
            Fz.x r0 = new Fz.x
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.x.a(android.view.View):Fz.x");
    }

    public static x c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static x d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109657y, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110215a;
    }
}
