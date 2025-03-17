package l0;

import androidx.compose.ui.graphics.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.N;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Ll0/t;", "", "", "scale", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lm0/N;", "animationSpec", "<init>", "(FJLm0/N;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "J", "c", "()J", "Lm0/N;", "()Lm0/N;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final float f25434a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25435b;

    /* renamed from: c  reason: collision with root package name */
    private final N<Float> f25436c;

    public /* synthetic */ t(float f10, long j10, N n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, n10);
    }

    public final N<Float> a() {
        return this.f25436c;
    }

    public final float b() {
        return this.f25434a;
    }

    public final long c() {
        return this.f25435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f25434a, tVar.f25434a) == 0 && f.e(this.f25435b, tVar.f25435b) && C17542s.e(this.f25436c, tVar.f25436c);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f25434a) * 31) + f.h(this.f25435b)) * 31) + this.f25436c.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.f25434a + ", transformOrigin=" + f.i(this.f25435b) + ", animationSpec=" + this.f25436c + ')';
    }

    private t(float f10, long j10, N<Float> n10) {
        this.f25434a = f10;
        this.f25435b = j10;
        this.f25436c = n10;
    }
}
