package b8;

import D8.c;
import E8.b;
import U8.a;
import a9.C6784a2;
import a9.C6799c1;
import a9.C6913q3;
import a9.D4;
import a9.H1;
import a9.U6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.sdk.C;
import com.contentsquare.android.sdk.C0;
import com.contentsquare.android.sdk.C7113a;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.C7155v;
import com.contentsquare.android.sdk.G;
import com.contentsquare.android.sdk.H;
import com.contentsquare.android.sdk.H0;
import com.contentsquare.android.sdk.L0;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import l8.C8538b;
import l8.C8539c;
import l8.C8542f;
import u8.C8886a;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final c f45523a = new c("Contentsquare");

    public i() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    public static void a(Context context, C6799c1 c1Var) {
        Activity activity;
        E8.c f10 = C8886a.g(context).f();
        f10.h(b.IS_OPT_OUT, false);
        f10.h(b.FORGET_ME, false);
        X8.b.j((Application) context.getApplicationContext()).r().a();
        if (!(X8.c.c() == null || (activity = ContentsquareModule.c(context).d().f42433a.get()) == null)) {
            C b10 = X8.c.c().b();
            b10.getClass();
            C17542s.j(activity, "activity");
            C.b(activity, b10.f46932r, b10.f46918d);
        }
        X8.b j10 = X8.b.j((Application) context.getApplicationContext());
        j10.l().a();
        j10.c().p();
        C6784a2.f42434a.getClass();
        for (Map.Entry<WebView, H> value : C6784a2.f42440g.entrySet()) {
            H h10 = (H) value.getValue();
            if (h10.b()) {
                h10.f46989g.a();
            }
        }
        a.f40370a.e("opt_in");
        String a10 = c1Var.a();
        if (a10 != null) {
            f45523a.j("Opt-in successful. User ID: ".concat(a10));
        } else {
            f45523a.j("Opt-in failed. User ID: UNKNOWN");
        }
    }

    public static void b(MotionEvent motionEvent, C6799c1 c1Var) {
        if (X8.b.i() != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            D4 d42 = (D4) X8.b.i().h();
            d42.getClass();
            C17542s.j(obtain, "event");
            if (d42.f41965i) {
                c cVar = d42.f41963g;
                cVar.f("consumeAndRecycle() called with event [" + obtain + ']');
                ViewGroup viewGroup = d42.f41964h.get();
                if (viewGroup != null) {
                    d42.f41958b.b(obtain, viewGroup);
                }
                obtain.recycle();
            }
        }
    }

    public static void c(String str, long j10, C6799c1 c1Var) {
        C8538b bVar = new C8538b(str, j10);
        G g10 = c1Var.f42476a;
        g10.getClass();
        C17542s.j(bVar, "dynamicVarLongValidator");
        C7133k d10 = g10.f46981k.d();
        C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
        H0.a aVar = (H0.a) C7133k.b(d10, 19);
        String b10 = bVar.b();
        C17542s.j(b10, "key");
        aVar.f46998l = b10;
        aVar.f46997k = bVar.c();
        g10.f46973c.a(aVar);
    }

    public static void d(String str, C6799c1 c1Var) {
        C17542s.j(str, "screenName");
        C0.a(new C6913q3(str, (C8537a[]) null, false, (Long) null, 14));
    }

    public static void e(String str, String str2, C6799c1 c1Var) {
        C8539c cVar = new C8539c(str, str2);
        G g10 = c1Var.f42476a;
        g10.getClass();
        C17542s.j(cVar, "dynamicVarStringValidator");
        C7133k d10 = g10.f46981k.d();
        C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
        L0.a aVar = (L0.a) C7133k.b(d10, 18);
        String b10 = cVar.b();
        C17542s.j(b10, "key");
        aVar.f47039l = b10;
        String c10 = cVar.c();
        C17542s.j(c10, "value");
        aVar.f47038k = c10;
        g10.f46973c.a(aVar);
    }

    public static void f(C8542f fVar, C6799c1 c1Var) {
        G g10 = c1Var.f42476a;
        g10.getClass();
        C17542s.j(fVar, "transaction");
        C7133k d10 = g10.f46981k.d();
        C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
        C7155v.a aVar = (C7155v.a) C7133k.b(d10, 16);
        try {
            aVar.b(fVar);
            g10.f46973c.a(aVar);
        } catch (IllegalArgumentException e10) {
            c cVar = g10.f46978h;
            H1.a(cVar, "Transaction not registered: " + e10, e10);
        }
    }

    public static void g(Context context, C6799c1 c1Var) {
        C0.f46934b.clear();
        C8886a.g(context).f().h(b.IS_OPT_OUT, true);
        c1Var.f42477b.b();
        f45523a.j("Opting out");
        X8.b j10 = X8.b.j((Application) context.getApplicationContext());
        j10.l().a();
        j10.c().q();
        C6784a2.f42434a.getClass();
        for (Map.Entry<WebView, H> value : C6784a2.f42440g.entrySet()) {
            ((H) value.getValue()).f46989g.h();
        }
    }

    public static void i(MotionEvent motionEvent) {
        c cVar = f45523a;
        cVar.f("CS_API, consumeEvent with event " + motionEvent);
        a.f40370a.e("consume_event");
        U6.f42329a.a(new g(motionEvent));
    }

    public static void j(Context context) {
        f45523a.f("CS_API, optIn");
        U6.f42329a.a(new C7078c(context));
    }

    public static void k(Context context) {
        f45523a.f("CS_API, optOut");
        a.f40370a.e("opt_out");
        U6.f42329a.a(new C7077b(context));
    }

    public static void l(String str) {
        c cVar = f45523a;
        cVar.f("CS_API, screenName = " + str);
        a.f40370a.e("send_screen_name");
        U6.f42329a.a(new h(str));
    }

    public static void m(String str, long j10) {
        c cVar = f45523a;
        cVar.f("CS_API send, with key = " + str + ", value(long) = " + j10);
        a.f40370a.e("send_dynamic_var");
        U6.f42329a.a(new d(str, j10));
    }

    public static void n(String str, String str2) {
        c cVar = f45523a;
        cVar.f("CS_API send, with key = " + str + ", value(string) = " + str2);
        a.f40370a.e("send_dynamic_var");
        U6.f42329a.a(new e(str, str2));
    }

    public static void o(C8542f fVar) {
        c cVar = f45523a;
        cVar.f("CS_API, send with transaction = " + fVar);
        a.f40370a.e("send_transaction");
        U6.f42329a.a(new f(fVar));
    }

    public static void p(Context context) {
        U6 u62 = U6.f42329a;
        U6.f42331c = true;
        C7113a.b(context);
        a.f40370a.e("start");
        u62.a(new C7076a(context));
    }
}
