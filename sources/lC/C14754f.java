package lC;

import I2.C4626o0;
import I2.b1;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import android.content.Context;
import android.view.View;
import android.view.Window;
import jC.C14615b;
import jC.C14616c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u001b\"\u0004\b\u0012\u0010\u001cR$\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u0015\u0010\u001c¨\u0006 "}, d2 = {"LlC/f;", "LlC/d;", "Landroid/view/View;", "view", "Landroid/view/Window;", "window", "<init>", "(Landroid/view/View;Landroid/view/Window;)V", "", "isLight", "LjC/b$d;", "g", "(Ljava/lang/Boolean;)LjC/b$d;", "LjC/b;", "h", "(LjC/b;)Z", "a", "Landroid/view/View;", "b", "Landroid/view/Window;", "LI2/b1;", "c", "LXH/o;", "f", "()LI2/b1;", "controller", "color", "()LjC/b;", "(LjC/b;)V", "statusBar", "getNavigationBar", "navigationBar", "systemui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lC.f  reason: case insensitive filesystem */
public final class C14754f implements C14752d {

    /* renamed from: a  reason: collision with root package name */
    private final View f128908a;

    /* renamed from: b  reason: collision with root package name */
    private final Window f128909b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f128910c = C16825p.b(new C14753e(this));

    public C14754f(View view, Window window) {
        C17542s.j(view, "view");
        this.f128908a = view;
        this.f128909b = window;
    }

    /* access modifiers changed from: private */
    public static final b1 e(C14754f fVar) {
        Window window = fVar.f128909b;
        if (window != null) {
            return C4626o0.a(window, fVar.f128908a);
        }
        return null;
    }

    private final b1 f() {
        return (b1) this.f128910c.getValue();
    }

    private final C14615b.d g(Boolean bool) {
        if (bool == null || C17542s.e(bool, Boolean.TRUE)) {
            return C14615b.C3152b.f127857b;
        }
        if (C17542s.e(bool, Boolean.FALSE)) {
            return C14615b.c.f127858b;
        }
        throw new t();
    }

    private final boolean h(C14615b bVar) {
        Context context = this.f128908a.getContext();
        C17542s.i(context, "getContext(...)");
        C14615b.d b10 = C14616c.b(bVar, context);
        if (C17542s.e(b10, C14615b.C3152b.f127857b)) {
            return true;
        }
        if (C17542s.e(b10, C14615b.c.f127858b)) {
            return false;
        }
        throw new t();
    }

    public C14615b a() {
        b1 f10 = f();
        return g(f10 != null ? Boolean.valueOf(f10.b()) : null);
    }

    public void b(C14615b bVar) {
        C17542s.j(bVar, "color");
        b1 f10 = f();
        if (f10 != null) {
            f10.d(h(bVar));
        }
    }

    public void c(C14615b bVar) {
        C17542s.j(bVar, "color");
        b1 f10 = f();
        if (f10 != null) {
            f10.c(h(bVar));
        }
    }
}
