package H0;

import L1.w;
import Y1.i;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Lo1/g;", "position", "a", "(J)J", "", "isStartHandle", "LY1/i;", "direction", "handlesCrossed", "f", "(ZLY1/i;Z)Z", "areHandlesCrossed", "e", "(LY1/i;Z)Z", "Lc2/h;", "F", "c", "()F", "HandleWidth", "b", "HandleHeight", "LL1/w;", "LH0/A;", "LL1/w;", "d", "()LL1/w;", "SelectionHandleInfoKey", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class B {

    /* renamed from: a  reason: collision with root package name */
    private static final float f6687a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f6688b;

    /* renamed from: c  reason: collision with root package name */
    private static final w<A> f6689c = new w<>("SelectionHandleInfo", (p) null, 2, (DefaultConstructorMarker) null);

    static {
        float f10 = (float) 25;
        f6687a = h.B(f10);
        f6688b = h.B(f10);
    }

    public static final long a(long j10) {
        return C5668h.a(C5667g.m(j10), C5667g.n(j10) - 1.0f);
    }

    public static final float b() {
        return f6688b;
    }

    public static final float c() {
        return f6687a;
    }

    public static final w<A> d() {
        return f6689c;
    }

    public static final boolean e(i iVar, boolean z10) {
        return (iVar == i.Ltr && !z10) || (iVar == i.Rtl && z10);
    }

    public static final boolean f(boolean z10, i iVar, boolean z11) {
        return z10 ? e(iVar, z11) : !e(iVar, z11);
    }
}
