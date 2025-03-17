package androidx.swiperefreshlayout.widget;

import I2.C4600b0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

class CircleImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Animation.AnimationListener f44480a;

    /* renamed from: b  reason: collision with root package name */
    private int f44481b;

    /* renamed from: c  reason: collision with root package name */
    private int f44482c;

    private static class a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        private Paint f44483a = new Paint();

        /* renamed from: b  reason: collision with root package name */
        private int f44484b;

        /* renamed from: c  reason: collision with root package name */
        private CircleImageView f44485c;

        a(CircleImageView circleImageView, int i10) {
            this.f44485c = circleImageView;
            this.f44484b = i10;
            a((int) rect().width());
        }

        private void a(int i10) {
            float f10 = (float) (i10 / 2);
            this.f44483a.setShader(new RadialGradient(f10, f10, (float) this.f44484b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f44485c.getWidth() / 2;
            float f10 = (float) width;
            float height = (float) (this.f44485c.getHeight() / 2);
            canvas.drawCircle(f10, height, f10, this.f44483a);
            canvas.drawCircle(f10, height, (float) (width - this.f44484b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    CircleImageView(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f44481b = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(U4.a.f40170f);
        this.f44482c = obtainStyledAttributes.getColor(U4.a.f40171g, -328966);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C4600b0.x0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f44481b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f44481b, (float) i11, (float) i10, 503316480);
            int i12 = this.f44481b;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f44482c);
        C4600b0.t0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.f44480a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f44480a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f44480a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f44481b * 2), getMeasuredHeight() + (this.f44481b * 2));
        }
    }

    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f44482c = i10;
        }
    }
}
