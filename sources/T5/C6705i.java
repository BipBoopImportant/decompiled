package T5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r6.F;
import tI.C17978n;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"LT5/i;", "LT5/n;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "LXH/N;", "c", "(Landroid/graphics/Canvas;)V", "a", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "", "()J", "size", "", "getWidth", "()I", "width", "getHeight", "height", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: T5.i  reason: case insensitive filesystem */
public final class C6705i implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f40043a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f40044b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"LT5/i$a;", "", "", "a", "()J", "size", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: T5.i$a */
    public interface a {
        long a();
    }

    public C6705i(Drawable drawable, boolean z10) {
        this.f40043a = drawable;
        this.f40044b = z10;
    }

    public long a() {
        Drawable drawable = this.f40043a;
        return C17978n.f(drawable instanceof a ? ((a) drawable).a() : ((long) F.g(drawable)) * 4 * ((long) F.b(this.f40043a)), 0);
    }

    public boolean b() {
        return this.f40044b;
    }

    public void c(Canvas canvas) {
        this.f40043a.draw(canvas);
    }

    public final Drawable d() {
        return this.f40043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6705i)) {
            return false;
        }
        C6705i iVar = (C6705i) obj;
        return C17542s.e(this.f40043a, iVar.f40043a) && this.f40044b == iVar.f40044b;
    }

    public int getHeight() {
        return F.b(this.f40043a);
    }

    public int getWidth() {
        return F.g(this.f40043a);
    }

    public int hashCode() {
        return (this.f40043a.hashCode() * 31) + Boolean.hashCode(this.f40044b);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.f40043a + ", shareable=" + this.f40044b + ')';
    }
}
