package a9;

import D8.c;
import H2.j;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.contentsquare.android.sdk.C7164z0;
import kotlin.jvm.internal.C17542s;

public final class Z3 {

    /* renamed from: e  reason: collision with root package name */
    public static Z3 f42414e;

    /* renamed from: a  reason: collision with root package name */
    public final C7164z0 f42415a;

    /* renamed from: b  reason: collision with root package name */
    public String f42416b;

    /* renamed from: c  reason: collision with root package name */
    public C6969x4 f42417c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42418d = new c("BridgeEventProcessor");

    public Z3() {
        T t10 = new T(G1.f42019f);
        C17542s.j(t10, "touchTargetDetector");
        C7164z0 z0Var = new C7164z0(t10, 62);
        this.f42415a = z0Var;
    }

    public final void a(Activity activity, String str) {
        c cVar = this.f42418d;
        cVar.f("findView: " + str);
        this.f42417c = null;
        Window window = activity.getWindow();
        if (window != null) {
            j<View> jVar = G1.f42019f;
            Y3 y32 = new Y3(this, str);
            C17542s.j(y32, "processor");
            C17542s.j(jVar, "viewFilter");
            new D0(y32, jVar).a((ViewGroup) window.getDecorView());
        }
    }

    public final /* synthetic */ void b(String str, View view) {
        if (view.getClass().getName().contains(str)) {
            this.f42417c = new C6969x4(view);
        }
    }
}
