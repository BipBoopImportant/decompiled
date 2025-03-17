package p1;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lp1/a1;", "Lp1/e1;", "", "Lp1/v0;", "colors", "", "stops", "Lo1/g;", "center", "radius", "Lp1/m1;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lo1/m;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Ljava/util/List;", "f", "g", "J", "h", "F", "i", "I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a1 extends e1 {

    /* renamed from: e  reason: collision with root package name */
    private final List<C5747v0> f27269e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Float> f27270f;

    /* renamed from: g  reason: collision with root package name */
    private final long f27271g;

    /* renamed from: h  reason: collision with root package name */
    private final float f27272h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27273i;

    public /* synthetic */ a1(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    public Shader b(long j10) {
        float f10;
        float f11;
        if (C5668h.d(this.f27271g)) {
            long b10 = C5674n.b(j10);
            f11 = C5667g.m(b10);
            f10 = C5667g.n(b10);
        } else {
            f11 = C5667g.m(this.f27271g) == Float.POSITIVE_INFINITY ? C5673m.l(j10) : C5667g.m(this.f27271g);
            f10 = C5667g.n(this.f27271g) == Float.POSITIVE_INFINITY ? C5673m.i(j10) : C5667g.n(this.f27271g);
        }
        List<C5747v0> list = this.f27269e;
        List<Float> list2 = this.f27270f;
        long a10 = C5668h.a(f11, f10);
        float f12 = this.f27272h;
        return f1.c(a10, f12 == Float.POSITIVE_INFINITY ? C5673m.k(j10) / ((float) 2) : f12, list, list2, this.f27273i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return C17542s.e(this.f27269e, a1Var.f27269e) && C17542s.e(this.f27270f, a1Var.f27270f) && C5667g.j(this.f27271g, a1Var.f27271g) && this.f27272h == a1Var.f27272h && m1.h(this.f27273i, a1Var.f27273i);
    }

    public int hashCode() {
        int hashCode = this.f27269e.hashCode() * 31;
        List<Float> list = this.f27270f;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + C5667g.o(this.f27271g)) * 31) + Float.hashCode(this.f27272h)) * 31) + m1.i(this.f27273i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (C5668h.c(this.f27271g)) {
            str = "center=" + C5667g.t(this.f27271g) + ", ";
        } else {
            str = str2;
        }
        float f10 = this.f27272h;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + this.f27272h + ", ";
        }
        return "RadialGradient(colors=" + this.f27269e + ", stops=" + this.f27270f + ", " + str + str2 + "tileMode=" + m1.j(this.f27273i) + ')';
    }

    private a1(List<C5747v0> list, List<Float> list2, long j10, float f10, int i10) {
        this.f27269e = list;
        this.f27270f = list2;
        this.f27271g = j10;
        this.f27272h = f10;
        this.f27273i = i10;
    }
}
