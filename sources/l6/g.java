package l6;

import X5.C6723h;
import XH.C16814e;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import pI.C17752b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0014\u0010\u0010J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0010J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u0001H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0013J\u0019\u0010:\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010!J\u000f\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010FR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0016\u0010W\u001a\u00020P8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bV\u0010R¨\u0006X"}, d2 = {"Ll6/g;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroid/graphics/drawable/Animatable;", "child", "Ll6/f;", "scale", "<init>", "(Landroid/graphics/drawable/Drawable;Ll6/f;)V", "Landroid/graphics/Canvas;", "canvas", "LXH/N;", "draw", "(Landroid/graphics/Canvas;)V", "", "getAlpha", "()I", "alpha", "setAlpha", "(I)V", "getOpacity", "Landroid/graphics/ColorFilter;", "getColorFilter", "()Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "", "isStateful", "()Z", "", "state", "onStateChange", "([I)Z", "level", "onLevelChange", "(I)Z", "getIntrinsicWidth", "getIntrinsicHeight", "who", "Ljava/lang/Runnable;", "what", "unscheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "when", "scheduleDrawable", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V", "tintColor", "setTint", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "blendMode", "setTintBlendMode", "(Landroid/graphics/BlendMode;)V", "isRunning", "start", "()V", "stop", "a", "Landroid/graphics/drawable/Drawable;", "getChild", "()Landroid/graphics/drawable/Drawable;", "b", "Ll6/f;", "getScale", "()Ll6/f;", "", "c", "F", "childDx", "d", "childDy", "e", "childScale", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f54765a;

    /* renamed from: b  reason: collision with root package name */
    private final f f54766b;

    /* renamed from: c  reason: collision with root package name */
    private float f54767c;

    /* renamed from: d  reason: collision with root package name */
    private float f54768d;

    /* renamed from: e  reason: collision with root package name */
    private float f54769e = 1.0f;

    public g(Drawable drawable, f fVar) {
        this.f54765a = drawable;
        this.f54766b = fVar;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f54767c, this.f54768d);
            float f10 = this.f54769e;
            canvas.scale(f10, f10);
            this.f54765a.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public int getAlpha() {
        return this.f54765a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f54765a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f54765a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f54765a.getIntrinsicWidth();
    }

    @C16814e
    public int getOpacity() {
        return this.f54765a.getOpacity();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        Drawable drawable = this.f54765a;
        return (drawable instanceof Animatable) && ((Animatable) drawable).isRunning();
    }

    public boolean isStateful() {
        return this.f54765a.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int intrinsicWidth = this.f54765a.getIntrinsicWidth();
        int intrinsicHeight = this.f54765a.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f54765a.setBounds(rect);
            this.f54767c = 0.0f;
            this.f54768d = 0.0f;
            this.f54769e = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double d10 = C6723h.d(intrinsicWidth, intrinsicHeight, width, height, this.f54766b);
        double d11 = (double) 2;
        int d12 = C17752b.d((((double) width) - (((double) intrinsicWidth) * d10)) / d11);
        int d13 = C17752b.d((((double) height) - (((double) intrinsicHeight) * d10)) / d11);
        this.f54765a.setBounds(d12, d13, intrinsicWidth + d12, intrinsicHeight + d13);
        this.f54767c = (float) rect.left;
        this.f54768d = (float) rect.top;
        this.f54769e = (float) d10;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f54765a.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f54765a.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f54765a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54765a.setColorFilter(colorFilter);
    }

    public void setTint(int i10) {
        this.f54765a.setTint(i10);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.f54765a.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f54765a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f54765a.setTintMode(mode);
    }

    public void start() {
        Drawable drawable = this.f54765a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void stop() {
        Drawable drawable = this.f54765a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
