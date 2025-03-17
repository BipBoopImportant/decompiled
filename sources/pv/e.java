package Pv;

import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import s0.C5880z;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0013"}, d2 = {"LPv/e;", "", "<init>", "()V", "Lc2/h;", "b", "F", "()F", "MinWidth", "c", "MinHeight", "Landroidx/compose/ui/d;", "d", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "PortraitModifier", "e", "a", "LandscapeModifier", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f39487a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final float f39488b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f39489c;

    /* renamed from: d  reason: collision with root package name */
    private static final d f39490d;

    /* renamed from: e  reason: collision with root package name */
    private static final d f39491e;

    static {
        float B10 = h.B((float) 328);
        f39488b = B10;
        float B11 = h.B((float) 188);
        f39489c = B11;
        d.a aVar = d.f18749a;
        d x10 = J.x(aVar, B10, B11, 0.0f, 0.0f, 12, (Object) null);
        C5880z zVar = C5880z.Max;
        f39490d = x.a(x10, zVar);
        f39491e = x.a(J.y(J.x(aVar, 0.0f, B11, 0.0f, 0.0f, 13, (Object) null), B10), zVar);
    }

    private e() {
    }

    public final d a() {
        return f39491e;
    }

    public final float b() {
        return f39488b;
    }

    public final d c() {
        return f39490d;
    }
}
