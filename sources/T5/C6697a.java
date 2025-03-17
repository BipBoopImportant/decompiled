package T5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r6.C8694b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"LT5/a;", "LT5/n;", "Landroid/graphics/Bitmap;", "bitmap", "", "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "LXH/N;", "c", "(Landroid/graphics/Canvas;)V", "a", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "b", "Z", "()Z", "", "()J", "size", "", "getWidth", "()I", "width", "getHeight", "height", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: T5.a  reason: case insensitive filesystem */
public final class C6697a implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f40022a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40023b;

    public C6697a(Bitmap bitmap, boolean z10) {
        this.f40022a = bitmap;
        this.f40023b = z10;
    }

    public long a() {
        return (long) C8694b.a(this.f40022a);
    }

    public boolean b() {
        return this.f40023b;
    }

    public void c(Canvas canvas) {
        canvas.drawBitmap(this.f40022a, 0.0f, 0.0f, (Paint) null);
    }

    public final Bitmap d() {
        return this.f40022a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6697a)) {
            return false;
        }
        C6697a aVar = (C6697a) obj;
        return C17542s.e(this.f40022a, aVar.f40022a) && this.f40023b == aVar.f40023b;
    }

    public int getHeight() {
        return this.f40022a.getHeight();
    }

    public int getWidth() {
        return this.f40022a.getWidth();
    }

    public int hashCode() {
        return (this.f40022a.hashCode() * 31) + Boolean.hashCode(this.f40023b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f40022a + ", shareable=" + this.f40023b + ')';
    }
}
