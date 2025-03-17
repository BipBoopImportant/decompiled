package Vd;

import Sd.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f64512a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f64513b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f64514c;

    /* renamed from: d  reason: collision with root package name */
    public final FullScreenProgressView f64515d;

    /* renamed from: e  reason: collision with root package name */
    public final HorizontalProgressView f64516e;

    /* renamed from: f  reason: collision with root package name */
    public final View f64517f;

    private b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, FullScreenProgressView fullScreenProgressView, HorizontalProgressView horizontalProgressView, View view) {
        this.f64512a = constraintLayout;
        this.f64513b = constraintLayout2;
        this.f64514c = recyclerView;
        this.f64515d = fullScreenProgressView;
        this.f64516e = horizontalProgressView;
        this.f64517f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        r0 = jC.C14618e.f127860a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Vd.b a(android.view.View r7) {
        /*
            r2 = r7
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            int r0 = Sd.c.f63341f
            android.view.View r1 = X4.b.a(r7, r0)
            r3 = r1
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            if (r3 == 0) goto L_0x0034
            int r0 = Sd.c.f63342g
            android.view.View r1 = X4.b.a(r7, r0)
            r4 = r1
            com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView r4 = (com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView) r4
            if (r4 == 0) goto L_0x0034
            int r0 = Sd.c.f63343h
            android.view.View r1 = X4.b.a(r7, r0)
            r5 = r1
            com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView r5 = (com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView) r5
            if (r5 == 0) goto L_0x0034
            int r0 = jC.C14618e.f127860a
            android.view.View r6 = X4.b.a(r7, r0)
            if (r6 == 0) goto L_0x0034
            Vd.b r7 = new Vd.b
            r0 = r7
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x0034:
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r7 = r7.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Vd.b.a(android.view.View):Vd.b");
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f63350b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f64512a;
    }
}
