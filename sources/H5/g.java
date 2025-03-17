package H5;

import E5.e;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"LH5/g;", "LH5/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "LE5/e;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLE5/e;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "Z", "c", "()Z", "LE5/e;", "()LE5/e;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f36413a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f36414b;

    /* renamed from: c  reason: collision with root package name */
    private final e f36415c;

    public g(Drawable drawable, boolean z10, e eVar) {
        super((DefaultConstructorMarker) null);
        this.f36413a = drawable;
        this.f36414b = z10;
        this.f36415c = eVar;
    }

    public final e a() {
        return this.f36415c;
    }

    public final Drawable b() {
        return this.f36413a;
    }

    public final boolean c() {
        return this.f36414b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return C17542s.e(this.f36413a, gVar.f36413a) && this.f36414b == gVar.f36414b && this.f36415c == gVar.f36415c;
        }
    }

    public int hashCode() {
        return (((this.f36413a.hashCode() * 31) + Boolean.hashCode(this.f36414b)) * 31) + this.f36415c.hashCode();
    }
}
