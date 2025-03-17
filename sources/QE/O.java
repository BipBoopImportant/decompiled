package QE;

import OE.C13318j;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class O implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f114416a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f114417b;

    /* renamed from: c  reason: collision with root package name */
    public final View f114418c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f114419d;

    /* renamed from: e  reason: collision with root package name */
    public final FloatingActionButton f114420e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f114421f;

    /* renamed from: g  reason: collision with root package name */
    public final Guideline f114422g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f114423h;

    private O(ConstraintLayout constraintLayout, FrameLayout frameLayout, View view, ImageButton imageButton, FloatingActionButton floatingActionButton, TextView textView, Guideline guideline, ImageView imageView) {
        this.f114416a = constraintLayout;
        this.f114417b = frameLayout;
        this.f114418c = view;
        this.f114419d = imageButton;
        this.f114420e = floatingActionButton;
        this.f114421f = textView;
        this.f114422g = guideline;
        this.f114423h = imageView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = OE.C13317i.f113000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static QE.O a(android.view.View r11) {
        /*
            int r0 = OE.C13317i.f112995c
            android.view.View r1 = X4.b.a(r11, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x0054
            int r0 = OE.C13317i.f113000d
            android.view.View r5 = X4.b.a(r11, r0)
            if (r5 == 0) goto L_0x0054
            int r0 = OE.C13317i.f113005e
            android.view.View r1 = X4.b.a(r11, r0)
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            if (r6 == 0) goto L_0x0054
            int r0 = OE.C13317i.f113025i
            android.view.View r1 = X4.b.a(r11, r0)
            r7 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r7 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r7
            if (r7 == 0) goto L_0x0054
            int r0 = OE.C13317i.f113030j
            android.view.View r1 = X4.b.a(r11, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0054
            int r0 = OE.C13317i.f112890C0
            android.view.View r1 = X4.b.a(r11, r0)
            r9 = r1
            androidx.constraintlayout.widget.Guideline r9 = (androidx.constraintlayout.widget.Guideline) r9
            if (r9 == 0) goto L_0x0054
            int r0 = OE.C13317i.f112934N0
            android.view.View r1 = X4.b.a(r11, r0)
            r10 = r1
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            if (r10 == 0) goto L_0x0054
            QE.O r0 = new QE.O
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0054:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QE.O.a(android.view.View):QE.O");
    }

    public static O c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113117M, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f114416a;
    }
}
