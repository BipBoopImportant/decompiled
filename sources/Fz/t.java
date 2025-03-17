package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f110192a;

    /* renamed from: b  reason: collision with root package name */
    public final Barrier f110193b;

    /* renamed from: c  reason: collision with root package name */
    public final View f110194c;

    /* renamed from: d  reason: collision with root package name */
    public final AppCompatImageView f110195d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f110196e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatTextView f110197f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatTextView f110198g;

    private t(ConstraintLayout constraintLayout, Barrier barrier, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f110192a = constraintLayout;
        this.f110193b = barrier;
        this.f110194c = view;
        this.f110195d = appCompatImageView;
        this.f110196e = appCompatImageView2;
        this.f110197f = appCompatTextView;
        this.f110198g = appCompatTextView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = Ez.c.f109616v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.t a(android.view.View r10) {
        /*
            int r0 = Ez.c.f109613u
            android.view.View r1 = X4.b.a(r10, r0)
            r4 = r1
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            if (r4 == 0) goto L_0x0049
            int r0 = Ez.c.f109616v
            android.view.View r5 = X4.b.a(r10, r0)
            if (r5 == 0) goto L_0x0049
            int r0 = Ez.c.f109619w
            android.view.View r1 = X4.b.a(r10, r0)
            r6 = r1
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            if (r6 == 0) goto L_0x0049
            int r0 = Ez.c.f109622x
            android.view.View r1 = X4.b.a(r10, r0)
            r7 = r1
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            if (r7 == 0) goto L_0x0049
            int r0 = Ez.c.f109612t1
            android.view.View r1 = X4.b.a(r10, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x0049
            int r0 = Ez.c.f109615u1
            android.view.View r1 = X4.b.a(r10, r0)
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            if (r9 == 0) goto L_0x0049
            Fz.t r0 = new Fz.t
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.t.a(android.view.View):Fz.t");
    }

    public static t c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109654v, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110192a;
    }
}
