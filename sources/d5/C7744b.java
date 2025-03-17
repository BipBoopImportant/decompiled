package d5;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Ld5/b;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "rect", "(Landroid/graphics/Rect;)V", "f", "()Landroid/graphics/Rect;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "b", "c", "getRight", "d", "getBottom", "width", "height", "e", "()Z", "isZero", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d5.b  reason: case insensitive filesystem */
public final class C7744b {

    /* renamed from: a  reason: collision with root package name */
    private final int f50724a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50725b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50726c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50727d;

    public C7744b(int i10, int i11, int i12, int i13) {
        this.f50724a = i10;
        this.f50725b = i11;
        this.f50726c = i12;
        this.f50727d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i10 + ", right: " + i12).toString());
        } else if (i11 > i13) {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i11 + ", bottom: " + i13).toString());
        }
    }

    public final int a() {
        return this.f50727d - this.f50725b;
    }

    public final int b() {
        return this.f50724a;
    }

    public final int c() {
        return this.f50725b;
    }

    public final int d() {
        return this.f50726c - this.f50724a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C7744b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C7744b bVar = (C7744b) obj;
        return this.f50724a == bVar.f50724a && this.f50725b == bVar.f50725b && this.f50726c == bVar.f50726c && this.f50727d == bVar.f50727d;
    }

    public final Rect f() {
        return new Rect(this.f50724a, this.f50725b, this.f50726c, this.f50727d);
    }

    public int hashCode() {
        return (((((this.f50724a * 31) + this.f50725b) * 31) + this.f50726c) * 31) + this.f50727d;
    }

    public String toString() {
        return C7744b.class.getSimpleName() + " { [" + this.f50724a + ',' + this.f50725b + ',' + this.f50726c + ',' + this.f50727d + "] }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7744b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        C17542s.j(rect, "rect");
    }
}
