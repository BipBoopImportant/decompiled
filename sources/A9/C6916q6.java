package a9;

import D8.c;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.contentsquare.android.api.bridge.flutter.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k8.C8466b;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.q6  reason: case insensitive filesystem */
public final class C6916q6 implements ViewTreeObserver.OnPreDrawListener, f, C8466b {

    /* renamed from: a  reason: collision with root package name */
    public final c f42818a;

    /* renamed from: b  reason: collision with root package name */
    public I6 f42819b;

    /* renamed from: c  reason: collision with root package name */
    public C6860j6 f42820c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f42821d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<Window> f42822e = new WeakReference<>((Object) null);

    public C6916q6() {
        c cVar = new c("OnDrawObserver");
        C17542s.j(cVar, "logger");
        this.f42818a = cVar;
    }

    public final void a() {
        onPreDraw();
        this.f42818a.f("onFlutterSrEvent called.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ViewTreeObserver b() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.view.Window> r0 = r3.f42822e
            java.lang.Object r0 = r0.get()
            android.view.Window r0 = (android.view.Window) r0
            r1 = 0
            if (r0 == 0) goto L_0x001a
            android.view.View r0 = r0.getDecorView()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 != 0) goto L_0x001b
            D8.c r0 = r3.f42818a
            java.lang.String r2 = "Cannot get decor view from activity."
            r0.f(r2)
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x002a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            if (r0 == 0) goto L_0x002a
            boolean r2 = r0.isAlive()
            if (r2 == 0) goto L_0x002a
            r1 = r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6916q6.b():android.view.ViewTreeObserver");
    }

    public final boolean onPreDraw() {
        try {
            C6860j6 j6Var = this.f42820c;
            C6860j6 j6Var2 = null;
            if (j6Var == null) {
                C17542s.z("onDrawListener");
                j6Var = null;
            }
            j6Var.setWindow(this.f42822e);
            I6 i62 = this.f42819b;
            if (i62 == null) {
                C17542s.z("throttleOperator");
                i62 = null;
            }
            C6860j6 j6Var3 = this.f42820c;
            if (j6Var3 != null) {
                j6Var2 = j6Var3;
            } else {
                C17542s.z("onDrawListener");
            }
            i62.getClass();
            C17542s.j(j6Var2, "runnable");
            i62.a(j6Var2, i62.f42074c);
            Window window = this.f42822e.get();
            if (window == null) {
                return true;
            }
            Iterator it = this.f42821d.iterator();
            while (it.hasNext()) {
                ((G6) it.next()).a(window);
            }
            return true;
        } catch (Exception e10) {
            H1.a(this.f42818a, "Something went wrong with onPreDraw.", e10);
            return true;
        }
    }
}
