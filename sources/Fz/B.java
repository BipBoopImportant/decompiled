package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;

public final class B implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f110048a;

    /* renamed from: b  reason: collision with root package name */
    public final CameraPreview f110049b;

    /* renamed from: c  reason: collision with root package name */
    public final CameraPreviewOverlay f110050c;

    /* renamed from: d  reason: collision with root package name */
    public final ComposeView f110051d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageButton f110052e;

    /* renamed from: f  reason: collision with root package name */
    public final Guideline f110053f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageButton f110054g;

    /* renamed from: h  reason: collision with root package name */
    public final Button f110055h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageFilterView f110056i;

    /* renamed from: j  reason: collision with root package name */
    public final FrameLayout f110057j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f110058k;

    /* renamed from: l  reason: collision with root package name */
    public final View f110059l;

    private B(CoordinatorLayout coordinatorLayout, CameraPreview cameraPreview, CameraPreviewOverlay cameraPreviewOverlay, ComposeView composeView, ImageButton imageButton, Guideline guideline, ImageButton imageButton2, Button button, ImageFilterView imageFilterView, FrameLayout frameLayout, TextView textView, View view) {
        this.f110048a = coordinatorLayout;
        this.f110049b = cameraPreview;
        this.f110050c = cameraPreviewOverlay;
        this.f110051d = composeView;
        this.f110052e = imageButton;
        this.f110053f = guideline;
        this.f110054g = imageButton2;
        this.f110055h = button;
        this.f110056i = imageFilterView;
        this.f110057j = frameLayout;
        this.f110058k = textView;
        this.f110059l = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        r0 = Ez.c.f109621w1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.B a(android.view.View r15) {
        /*
            int r0 = Ez.c.f109529O
            android.view.View r1 = X4.b.a(r15, r0)
            r4 = r1
            com.ingka.ikea.app.scannerbase.googlevision.CameraPreview r4 = (com.ingka.ikea.app.scannerbase.googlevision.CameraPreview) r4
            if (r4 == 0) goto L_0x0080
            int r0 = Ez.c.f109531P
            android.view.View r1 = X4.b.a(r15, r0)
            r5 = r1
            com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay r5 = (com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay) r5
            if (r5 == 0) goto L_0x0080
            int r0 = Ez.c.f109535R
            android.view.View r1 = X4.b.a(r15, r0)
            r6 = r1
            androidx.compose.ui.platform.ComposeView r6 = (androidx.compose.ui.platform.ComposeView) r6
            if (r6 == 0) goto L_0x0080
            int r0 = Ez.c.f109545W
            android.view.View r1 = X4.b.a(r15, r0)
            r7 = r1
            android.widget.ImageButton r7 = (android.widget.ImageButton) r7
            if (r7 == 0) goto L_0x0080
            int r0 = Ez.c.f109590m0
            android.view.View r1 = X4.b.a(r15, r0)
            r8 = r1
            androidx.constraintlayout.widget.Guideline r8 = (androidx.constraintlayout.widget.Guideline) r8
            if (r8 == 0) goto L_0x0080
            int r0 = Ez.c.f109599p0
            android.view.View r1 = X4.b.a(r15, r0)
            r9 = r1
            android.widget.ImageButton r9 = (android.widget.ImageButton) r9
            if (r9 == 0) goto L_0x0080
            int r0 = Ez.c.f109516H0
            android.view.View r1 = X4.b.a(r15, r0)
            r10 = r1
            android.widget.Button r10 = (android.widget.Button) r10
            if (r10 == 0) goto L_0x0080
            int r0 = Ez.c.f109579i1
            android.view.View r1 = X4.b.a(r15, r0)
            r11 = r1
            androidx.constraintlayout.utils.widget.ImageFilterView r11 = (androidx.constraintlayout.utils.widget.ImageFilterView) r11
            if (r11 == 0) goto L_0x0080
            int r0 = Ez.c.f109582j1
            android.view.View r1 = X4.b.a(r15, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x0080
            int r0 = Ez.c.f109585k1
            android.view.View r1 = X4.b.a(r15, r0)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x0080
            int r0 = Ez.c.f109621w1
            android.view.View r14 = X4.b.a(r15, r0)
            if (r14 == 0) goto L_0x0080
            Fz.B r0 = new Fz.B
            r3 = r15
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0080:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fz.B.a(android.view.View):Fz.B");
    }

    public static B c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static B d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109631C, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f110048a;
    }
}
