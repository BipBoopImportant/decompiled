package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.sugarcube.app.base.data.source.CatalogRepository;
import w4.D;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f43101a;

    /* renamed from: b  reason: collision with root package name */
    private float f43102b;

    /* renamed from: c  reason: collision with root package name */
    private int f43103c = 0;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f43104a;

        /* renamed from: b  reason: collision with root package name */
        private float f43105b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f43106c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43107d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f43104a = f10;
            this.f43105b = f11;
            this.f43106c = z10;
            if (!this.f43107d) {
                this.f43107d = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f43107d = false;
            b unused = AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, D.f57040a, 0, 0);
            try {
                this.f43103c = obtainStyledAttributes.getInt(D.f57042b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f43101a = new c();
    }

    public int getResizeMode() {
        return this.f43103c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f43102b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = (float) measuredWidth;
            float f13 = (float) measuredHeight;
            float f14 = f12 / f13;
            float f15 = (this.f43102b / f14) - 1.0f;
            if (Math.abs(f15) <= 0.01f) {
                this.f43101a.a(this.f43102b, f14, false);
                return;
            }
            int i12 = this.f43103c;
            if (i12 != 0) {
                if (i12 == 1) {
                    f11 = this.f43102b;
                } else if (i12 != 2) {
                    if (i12 == 4) {
                        if (f15 > 0.0f) {
                            f10 = this.f43102b;
                        } else {
                            f11 = this.f43102b;
                        }
                    }
                    this.f43101a.a(this.f43102b, f14, true);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(measuredHeight, CatalogRepository.FETCH_FLAG_SDB));
                } else {
                    f10 = this.f43102b;
                }
                measuredHeight = (int) (f12 / f11);
                this.f43101a.a(this.f43102b, f14, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(measuredHeight, CatalogRepository.FETCH_FLAG_SDB));
            } else if (f15 > 0.0f) {
                f11 = this.f43102b;
                measuredHeight = (int) (f12 / f11);
                this.f43101a.a(this.f43102b, f14, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(measuredHeight, CatalogRepository.FETCH_FLAG_SDB));
            } else {
                f10 = this.f43102b;
            }
            measuredWidth = (int) (f13 * f10);
            this.f43101a.a(this.f43102b, f14, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(measuredHeight, CatalogRepository.FETCH_FLAG_SDB));
        }
    }

    public void setAspectRatio(float f10) {
        if (this.f43102b != f10) {
            this.f43102b = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i10) {
        if (this.f43103c != i10) {
            this.f43103c = i10;
            requestLayout();
        }
    }
}
