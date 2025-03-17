package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import y2.C6260a;

/* renamed from: k.a  reason: case insensitive filesystem */
public class C5487a extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f24976a;

    public C5487a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f24976a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f24976a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f24976a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f24976a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f24976a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f24976a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f24976a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f24976a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f24976a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f24976a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f24976a.getPadding(rect);
    }

    public int[] getState() {
        return this.f24976a.getState();
    }

    public Region getTransparentRegion() {
        return this.f24976a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C6260a.h(this.f24976a);
    }

    public boolean isStateful() {
        return this.f24976a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f24976a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f24976a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f24976a.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f24976a.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        C6260a.j(this.f24976a, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f24976a.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24976a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f24976a.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f24976a.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        C6260a.k(this.f24976a, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        C6260a.l(this.f24976a, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f24976a.setState(iArr);
    }

    public void setTint(int i10) {
        C6260a.n(this.f24976a, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        C6260a.o(this.f24976a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C6260a.p(this.f24976a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f24976a.setVisible(z10, z11);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
