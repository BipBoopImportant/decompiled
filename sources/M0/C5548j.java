package m0;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5531a0;
import nI.C17642l;

@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a@\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a1\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b*\u0010+\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"T", "Lm0/q;", "V", "Lm0/z0;", "data", "b", "(Lm0/z0;Ljava/lang/Object;)Lm0/q;", "", "durationMillis", "delayMillis", "Lm0/D;", "easing", "Lm0/y0;", "i", "(IILm0/D;)Lm0/y0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "Lm0/o0;", "g", "(FFLjava/lang/Object;)Lm0/o0;", "Lkotlin/Function1;", "Lm0/a0$b;", "LXH/N;", "init", "Lm0/a0;", "f", "(LnI/l;)Lm0/a0;", "Lm0/C;", "animation", "Lm0/i0;", "repeatMode", "Lm0/r0;", "initialStartOffset", "Lm0/V;", "d", "(Lm0/C;Lm0/i0;J)Lm0/V;", "Lm0/i;", "animationSpec", "", "startDelayNanos", "c", "(Lm0/i;J)Lm0/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.j  reason: case insensitive filesystem */
public final class C5548j {
    /* access modifiers changed from: private */
    public static final <T, V extends C5562q> V b(z0<T, V> z0Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return (C5562q) z0Var.a().invoke(t10);
    }

    public static final <T> C5546i<T> c(C5546i<T> iVar, long j10) {
        return new C5561p0(iVar, j10);
    }

    public static final <T> V<T> d(C5524C<T> c10, C5547i0 i0Var, long j10) {
        return new V(c10, i0Var, j10, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ V e(C5524C c10, C5547i0 i0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i0Var = C5547i0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = r0.c(0, 0, 2, (DefaultConstructorMarker) null);
        }
        return d(c10, i0Var, j10);
    }

    public static final <T> C5531a0<T> f(C17642l<? super C5531a0.b<T>, C16807N> lVar) {
        C5531a0.b bVar = new C5531a0.b();
        lVar.invoke(bVar);
        return new C5531a0<>(bVar);
    }

    public static final <T> C5559o0<T> g(float f10, float f11, T t10) {
        return new C5559o0<>(f10, f11, t10);
    }

    public static /* synthetic */ C5559o0 h(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return g(f10, f11, obj);
    }

    public static final <T> y0<T> i(int i10, int i11, C5525D d10) {
        return new y0<>(i10, i11, d10);
    }

    public static /* synthetic */ y0 j(int i10, int i11, C5525D d10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            d10 = M.d();
        }
        return i(i10, i11, d10);
    }
}
