package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay;

public final class p implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CoordinatorLayout f110171a;

    /* renamed from: b  reason: collision with root package name */
    public final CameraPreview f110172b;

    /* renamed from: c  reason: collision with root package name */
    public final CameraPreviewOverlay f110173c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f110174d;

    /* renamed from: e  reason: collision with root package name */
    public final Guideline f110175e;

    /* renamed from: f  reason: collision with root package name */
    public final Button f110176f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f110177g;

    /* renamed from: h  reason: collision with root package name */
    public final View f110178h;

    private p(CoordinatorLayout coordinatorLayout, CameraPreview cameraPreview, CameraPreviewOverlay cameraPreviewOverlay, ImageButton imageButton, Guideline guideline, Button button, TextView textView, View view) {
        this.f110171a = coordinatorLayout;
        this.f110172b = cameraPreview;
        this.f110173c = cameraPreviewOverlay;
        this.f110174d = imageButton;
        this.f110175e = guideline;
        this.f110176f = button;
        this.f110177g = textView;
        this.f110178h = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = Ez.c.f109621w1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Fz.p a(android.view.View r11) {
        /*
            int r0 = Ez.c.f109529O
            android.view.View r1 = X4.b.a(r11, r0)
            r4 = r1
            com.ingka.ikea.app.scannerbase.googlevision.CameraPreview r4 = (com.ingka.ikea.app.scannerbase.googlevision.CameraPreview) r4
            if (r4 == 0) goto L_0x0054
            int r0 = Ez.c.f109531P
            android.view.View r1 = X4.b.a(r11, r0)
            r5 = r1
            com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay r5 = (com.ingka.ikea.app.scannerbase.googlevision.CameraPreviewOverlay) r5
            if (r5 == 0) goto L_0x0054
            int r0 = Ez.c.f109545W
            android.view.View r1 = X4.b.a(r11, r0)
            r6 = r1
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            if (r6 == 0) goto L_0x0054
            int r0 = Ez.c.f109590m0
            android.view.View r1 = X4.b.a(r11, r0)
            r7 = r1
            androidx.constraintlayout.widget.Guideline r7 = (androidx.constraintlayout.widget.Guideline) r7
            if (r7 == 0) goto L_0x0054
            int r0 = Ez.c.f109518I0
            android.view.View r1 = X4.b.a(r11, r0)
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            if (r8 == 0) goto L_0x0054
            int r0 = Ez.c.f109585k1
            android.view.View r1 = X4.b.a(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0054
            int r0 = Ez.c.f109621w1
            android.view.View r10 = X4.b.a(r11, r0)
            if (r10 == 0) goto L_0x0054
            Fz.p r0 = new Fz.p
            r3 = r11
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: Fz.p.a(android.view.View):Fz.p");
    }

    public static p c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static p d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109648p, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f110171a;
    }
}
