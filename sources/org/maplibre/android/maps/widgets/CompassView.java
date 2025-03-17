package org.maplibre.android.maps.widgets;

import I2.C4600b0;
import I2.C4618k0;
import I2.C4622m0;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.maplibre.android.maps.o;

public final class CompassView extends ImageView implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private float f146037a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f146038b = true;

    /* renamed from: c  reason: collision with root package name */
    private C4618k0 f146039c;

    /* renamed from: d  reason: collision with root package name */
    private o.g f146040d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f146041e = false;

    class a extends C4622m0 {
        a() {
        }

        public void b(View view) {
            CompassView.this.setLayerType(0, (Paint) null);
            CompassView.this.setVisibility(4);
            CompassView.this.h();
        }
    }

    public CompassView(Context context) {
        super(context);
        b(context);
    }

    private void b(Context context) {
        setEnabled(false);
        int i10 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new ViewGroup.LayoutParams(i10, i10));
    }

    private void g() {
        if (this.f146041e) {
            this.f146040d.b();
        }
    }

    public void a(boolean z10) {
        this.f146038b = z10;
    }

    public void c(o.g gVar) {
        this.f146040d = gVar;
    }

    public void d(boolean z10) {
        this.f146041e = z10;
    }

    public boolean e() {
        return ((double) Math.abs(this.f146037a)) >= 359.0d || ((double) Math.abs(this.f146037a)) <= 1.0d;
    }

    public boolean f() {
        return this.f146038b && e();
    }

    public Drawable getCompassImage() {
        return getDrawable();
    }

    public void h() {
        C4618k0 k0Var = this.f146039c;
        if (k0Var != null) {
            k0Var.c();
        }
        this.f146039c = null;
    }

    public void i(double d10) {
        this.f146037a = (float) d10;
        if (isEnabled()) {
            if (!f()) {
                h();
                setAlpha(1.0f);
                setVisibility(0);
                g();
                setRotation(this.f146037a);
            } else if (getVisibility() != 4 && this.f146039c == null) {
                postDelayed(this, 500);
            }
        }
    }

    public void run() {
        if (f()) {
            this.f146040d.a();
            h();
            setLayerType(2, (Paint) null);
            C4618k0 f10 = C4600b0.e(this).b(0.0f).f(500);
            this.f146039c = f10;
            f10.h(new a());
        }
    }

    public void setCompassImage(Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10 || f()) {
            h();
            setAlpha(0.0f);
            setVisibility(4);
            return;
        }
        h();
        setAlpha(1.0f);
        setVisibility(0);
        i((double) this.f146037a);
    }
}
