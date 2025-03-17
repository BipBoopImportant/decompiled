package zK;

import E1.B;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import c2.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LzK/j;", "LE1/B;", "Lc2/h;", "width", "height", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "getWidth-D9Ej5fM", "()F", "e", "getHeight-D9Ej5fM", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.j  reason: case insensitive filesystem */
final class C18765j implements B {

    /* renamed from: d  reason: collision with root package name */
    private final float f152841d;

    /* renamed from: e  reason: collision with root package name */
    private final float f152842e;

    public /* synthetic */ C18765j(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* access modifiers changed from: private */
    public static final C16807N b(int i10, a0 a0Var, int i11, a0.a aVar) {
        C17542s.j(aVar, "$this$layout");
        a0.a.i(aVar, a0Var, (i10 - a0Var.E0()) / 2, (i11 - a0Var.z0()) / 2, 0.0f, 4, (Object) null);
        return C16807N.f139792a;
    }

    public boolean equals(Object obj) {
        C18765j jVar = obj instanceof C18765j ? (C18765j) obj : null;
        return jVar != null && h.D(this.f152842e, jVar.f152842e) && h.D(this.f152841d, jVar.f152841d);
    }

    public J h(K k10, H h10, long j10) {
        C17542s.j(k10, "$this$measure");
        C17542s.j(h10, "measurable");
        a0 i02 = h10.i0(j10);
        int max = Math.max(i02.E0(), k10.K0(this.f152841d));
        int max2 = Math.max(i02.z0(), k10.K0(this.f152842e));
        return K.v0(k10, max, max2, (Map) null, new C18764i(max, i02, max2), 4, (Object) null);
    }

    public int hashCode() {
        return ((713 + h.E(this.f152841d)) * 31) + h.E(this.f152842e);
    }

    private C18765j(float f10, float f11) {
        this.f152841d = f10;
        this.f152842e = f11;
    }
}
