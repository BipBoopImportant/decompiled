package B0;

import android.view.KeyEvent;
import kotlin.Metadata;
import y1.C6253a;
import y1.C6256d;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"LB0/u;", "a", "LB0/u;", "()LB0/u;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B0.w  reason: case insensitive filesystem */
public final class C4378w {

    /* renamed from: a  reason: collision with root package name */
    private static final C4376u f5146a = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"B0/w$a", "LB0/u;", "Ly1/b;", "event", "LB0/s;", "a", "(Landroid/view/KeyEvent;)LB0/s;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B0.w$a */
    public static final class a implements C4376u {
        a() {
        }

        public C4374s a(KeyEvent keyEvent) {
            C4374s sVar = null;
            if (C6256d.g(keyEvent) && C6256d.d(keyEvent)) {
                long a10 = C6256d.a(keyEvent);
                F f10 = F.f4544a;
                if (C6253a.t(a10, f10.i())) {
                    sVar = C4374s.SELECT_LINE_LEFT;
                } else if (C6253a.t(a10, f10.j())) {
                    sVar = C4374s.SELECT_LINE_RIGHT;
                } else if (C6253a.t(a10, f10.k())) {
                    sVar = C4374s.SELECT_HOME;
                } else if (C6253a.t(a10, f10.h())) {
                    sVar = C4374s.SELECT_END;
                }
            } else if (C6256d.d(keyEvent)) {
                long a11 = C6256d.a(keyEvent);
                F f11 = F.f4544a;
                if (C6253a.t(a11, f11.i())) {
                    sVar = C4374s.LINE_LEFT;
                } else if (C6253a.t(a11, f11.j())) {
                    sVar = C4374s.LINE_RIGHT;
                } else if (C6253a.t(a11, f11.k())) {
                    sVar = C4374s.HOME;
                } else if (C6253a.t(a11, f11.h())) {
                    sVar = C4374s.END;
                }
            }
            return sVar == null ? C4377v.b().a(keyEvent) : sVar;
        }
    }

    public static final C4376u a() {
        return f5146a;
    }
}
