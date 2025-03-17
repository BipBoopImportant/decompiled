package P7;

import C7.m;
import P7.g;
import Y7.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.b;
import java.nio.ByteBuffer;
import java.util.List;

public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f39396a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f39397b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39398c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39399d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39400e;

    /* renamed from: f  reason: collision with root package name */
    private int f39401f;

    /* renamed from: g  reason: collision with root package name */
    private int f39402g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39403h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f39404i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f39405j;

    /* renamed from: k  reason: collision with root package name */
    private List<b> f39406k;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final g f39407a;

        a(g gVar) {
            this.f39407a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, A7.a aVar, m<Bitmap> mVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i10, i11, mVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f39405j == null) {
            this.f39405j = new Rect();
        }
        return this.f39405j;
    }

    private Paint h() {
        if (this.f39404i == null) {
            this.f39404i = new Paint(2);
        }
        return this.f39404i;
    }

    private void j() {
        List<b> list = this.f39406k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f39406k.get(i10).b(this);
            }
        }
    }

    private void l() {
        this.f39401f = 0;
    }

    private void n() {
        k.a(!this.f39399d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f39396a.f39407a.f() == 1) {
            invalidateSelf();
        } else if (!this.f39397b) {
            this.f39397b = true;
            this.f39396a.f39407a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f39397b = false;
        this.f39396a.f39407a.s(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f39401f++;
        }
        int i10 = this.f39402g;
        if (i10 != -1 && this.f39401f >= i10) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.f39396a.f39407a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.f39399d) {
            if (this.f39403h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.f39403h = false;
            }
            canvas.drawBitmap(this.f39396a.f39407a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.f39396a.f39407a.e();
    }

    public int f() {
        return this.f39396a.f39407a.f();
    }

    public int g() {
        return this.f39396a.f39407a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f39396a;
    }

    public int getIntrinsicHeight() {
        return this.f39396a.f39407a.h();
    }

    public int getIntrinsicWidth() {
        return this.f39396a.f39407a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f39396a.f39407a.j();
    }

    public boolean isRunning() {
        return this.f39397b;
    }

    public void k() {
        this.f39399d = true;
        this.f39396a.f39407a.a();
    }

    public void m(m<Bitmap> mVar, Bitmap bitmap) {
        this.f39396a.f39407a.o(mVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f39403h = true;
    }

    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f39399d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f39400e = z10;
        if (!z10) {
            o();
        } else if (this.f39398c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    public void start() {
        this.f39398c = true;
        l();
        if (this.f39400e) {
            n();
        }
    }

    public void stop() {
        this.f39398c = false;
        o();
    }

    c(a aVar) {
        this.f39400e = true;
        this.f39402g = -1;
        this.f39396a = (a) k.d(aVar);
    }
}
