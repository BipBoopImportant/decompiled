package QE;

import OE.C13318j;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: QE.k  reason: case insensitive filesystem */
public final class C13434k implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114621a;

    /* renamed from: b  reason: collision with root package name */
    public final FloatingActionButton f114622b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114623c;

    /* renamed from: d  reason: collision with root package name */
    public final View f114624d;

    private C13434k(ConstraintLayout constraintLayout, FloatingActionButton floatingActionButton, TextView textView, View view) {
        this.f114621a = constraintLayout;
        this.f114622b = floatingActionButton;
        this.f114623c = textView;
        this.f114624d = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = OE.C13317i.f112982Z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static QE.C13434k a(android.view.View r4) {
        /*
            int r0 = OE.C13317i.f113025i
            android.view.View r1 = X4.b.a(r4, r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            if (r1 == 0) goto L_0x0024
            int r0 = OE.C13317i.f113065q
            android.view.View r2 = X4.b.a(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0024
            int r0 = OE.C13317i.f112982Z0
            android.view.View r3 = X4.b.a(r4, r0)
            if (r3 == 0) goto L_0x0024
            QE.k r0 = new QE.k
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QE.C13434k.a(android.view.View):QE.k");
    }

    public static C13434k c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113145l, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114621a;
    }
}
