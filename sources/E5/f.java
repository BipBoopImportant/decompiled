package E5;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LE5/f;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f34878a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34879b;

    public f(Drawable drawable, boolean z10) {
        this.f34878a = drawable;
        this.f34879b = z10;
    }

    public final Drawable a() {
        return this.f34878a;
    }

    public final boolean b() {
        return this.f34879b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return C17542s.e(this.f34878a, fVar.f34878a) && this.f34879b == fVar.f34879b;
        }
    }

    public int hashCode() {
        return (this.f34878a.hashCode() * 31) + Boolean.hashCode(this.f34879b);
    }
}
