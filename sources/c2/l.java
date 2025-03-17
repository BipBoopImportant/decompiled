package c2;

import d2.C5274a;
import d2.C5275b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lc2/l;", "", "Lc2/h;", "Lc2/v;", "W", "(F)J", "q", "(J)F", "", "D1", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface l {
    float D1();

    long W(float f10) {
        C5275b bVar = C5275b.f23112a;
        if (!bVar.f(D1())) {
            return w.h(f10 / D1());
        }
        C5274a b10 = bVar.b(D1());
        return w.h(b10 != null ? b10.a(f10) : f10 / D1());
    }

    float q(long j10) {
        if (!x.g(v.g(j10), x.f23061b.b())) {
            m.b("Only Sp can convert to Px");
        }
        C5275b bVar = C5275b.f23112a;
        if (!bVar.f(D1())) {
            return h.B(v.h(j10) * D1());
        }
        C5274a b10 = bVar.b(D1());
        float h10 = v.h(j10);
        return h.B(b10 == null ? h10 * D1() : b10.b(h10));
    }
}
