package ml;

import XH.t;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ll.C11549a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0004X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0013\u0010\u001e¨\u0006 "}, d2 = {"Lml/a;", "Landroid/graphics/drawable/Drawable;", "", "skeletonColor", "Lll/a;", "shape", "<init>", "(ILll/a;)V", "Landroid/graphics/Canvas;", "canvas", "LXH/N;", "draw", "(Landroid/graphics/Canvas;)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "a", "I", "b", "Lll/a;", "Landroid/graphics/RectF;", "c", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "()Landroid/graphics/Paint;", "paint", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ml.a  reason: case insensitive filesystem */
public class C11578a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final int f99589a;

    /* renamed from: b  reason: collision with root package name */
    private final C11549a f99590b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f99591c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f99592d;

    public C11578a(int i10, C11549a aVar) {
        C17542s.j(aVar, "shape");
        this.f99589a = i10;
        this.f99590b = aVar;
        Paint paint = new Paint(1);
        paint.setColor(i10);
        paint.setStyle(Paint.Style.FILL);
        this.f99592d = paint;
    }

    /* access modifiers changed from: protected */
    public final Paint a() {
        return this.f99592d;
    }

    public void draw(Canvas canvas) {
        C17542s.j(canvas, "canvas");
        this.f99591c.set(getBounds());
        C11549a aVar = this.f99590b;
        if (aVar instanceof C11549a.b) {
            canvas.drawRect(this.f99591c, this.f99592d);
        } else if (aVar instanceof C11549a.c) {
            canvas.drawRoundRect(this.f99591c, ((C11549a.c) aVar).a(), ((C11549a.c) this.f99590b).a(), this.f99592d);
        } else if (aVar instanceof C11549a.C2252a) {
            float width = this.f99591c.width() * ((C11549a.C2252a) this.f99590b).d();
            RectF rectF = this.f99591c;
            rectF.right = rectF.left + width;
            Float b10 = ((C11549a.C2252a) this.f99590b).b();
            float floatValue = b10 != null ? b10.floatValue() : this.f99591c.height() * ((C11549a.C2252a) this.f99590b).c();
            if (((C11549a.C2252a) this.f99590b).a()) {
                float height = (this.f99591c.height() - floatValue) / ((float) 2);
                RectF rectF2 = this.f99591c;
                rectF2.top = height;
                rectF2.bottom = height + floatValue;
            } else {
                RectF rectF3 = this.f99591c;
                rectF3.bottom = rectF3.top + floatValue;
            }
            float height2 = this.f99591c.height() / 2.0f;
            canvas.drawRoundRect(this.f99591c, height2, height2, this.f99592d);
        } else {
            throw new t();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f99592d.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
