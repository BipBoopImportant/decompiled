package N5;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LN5/f;", "LN5/i;", "Landroid/graphics/drawable/Drawable;", "drawable", "LN5/h;", "request", "", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;LN5/h;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "b", "LN5/h;", "()LN5/h;", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f38988a;

    /* renamed from: b  reason: collision with root package name */
    private final h f38989b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f38990c;

    public f(Drawable drawable, h hVar, Throwable th2) {
        super((DefaultConstructorMarker) null);
        this.f38988a = drawable;
        this.f38989b = hVar;
        this.f38990c = th2;
    }

    public Drawable a() {
        return this.f38988a;
    }

    public h b() {
        return this.f38989b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return C17542s.e(a(), fVar.a()) && C17542s.e(b(), fVar.b()) && C17542s.e(this.f38990c, fVar.f38990c);
        }
    }

    public int hashCode() {
        Drawable a10 = a();
        return ((((a10 != null ? a10.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f38990c.hashCode();
    }
}
