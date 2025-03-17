package com.contentsquare.android.sdk;

import D8.c;
import F8.g;
import G8.u;
import TJ.C16505B;
import TJ.C16521S;
import a9.C0;
import a9.C6783a1;
import a9.C6786a4;
import a9.C6801c3;
import a9.C6808d2;
import a9.C6822f0;
import a9.C6849i3;
import a9.C6854j0;
import a9.C6856j2;
import a9.C6892n6;
import a9.C6897o3;
import a9.C6905p3;
import a9.C6908p6;
import a9.C6949v0;
import a9.C6976y3;
import a9.E4;
import a9.G1;
import a9.G4;
import a9.H;
import a9.M0;
import a9.O3;
import a9.P2;
import a9.Q1;
import a9.Q3;
import a9.T;
import a9.U2;
import a9.X2;
import a9.Y;
import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.O;
import c8.C7102a;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import com.contentsquare.android.sdk.C7134k0;
import java.util.HashSet;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import u8.C8886a;
import w8.C8933a;

public final class D {

    /* renamed from: e  reason: collision with root package name */
    public static final c f46936e = new c("CsClientModeModule");

    /* renamed from: f  reason: collision with root package name */
    public static D f46937f;

    /* renamed from: a  reason: collision with root package name */
    public final com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a f46938a;

    /* renamed from: b  reason: collision with root package name */
    public final E4 f46939b;

    /* renamed from: c  reason: collision with root package name */
    public final C7102a f46940c;

    /* renamed from: d  reason: collision with root package name */
    public final C7161y f46941d;

    public static final class a {
        public static D a(Application application) {
            C17542s.j(application, "application");
            if (D.f46937f == null) {
                D.f46937f = new D(application);
                D.f46936e.f("CsClientModeModule singleton is now initialized.");
            }
            D d10 = D.f46937f;
            C17542s.g(d10);
            return d10;
        }
    }

    public /* synthetic */ class b extends C17540p implements C17631a<C8933a> {
        public b(C6849i3 i3Var) {
            super(0, i3Var, C6849i3.class, "get", "get()Lcom/contentsquare/android/core/communication/compose/ComposeInterface;", 0);
        }

        public final Object invoke() {
            ((C6849i3) this.receiver).getClass();
            return (C8933a) C6976y3.f42973c.getValue();
        }
    }

    public D(Application application) {
        Application application2 = application;
        ContentsquareModule c10 = ContentsquareModule.c(application);
        C17542s.i(c10, "getInstance(application)");
        C8886a b10 = C8886a.f56874d.b(application2);
        C16505B a10 = C16521S.a(C7134k0.c.f47476a);
        Object systemService = application2.getSystemService("window");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        C6783a1 d10 = c10.d();
        C17542s.i(d10, "csModule.liveActivityProvider");
        com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a aVar = new com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a(a10, application2, (WindowManager) systemService, d10);
        this.f46938a = aVar;
        E4 e42 = new E4(application2, aVar, b10.f(), new C6786a4());
        this.f46939b = e42;
        X8.b j10 = X8.b.j(application);
        C17542s.i(j10, "getInstance(application)");
        C5221y a11 = O.f22160i.a();
        C6783a1 d11 = c10.d();
        C17542s.i(d11, "csModule.liveActivityProvider");
        this.f46940c = new C7102a(e42, application2, a11, d11);
        C6854j0 j0Var = new C6854j0(new C6949v0());
        M0 t10 = j10.t();
        C17542s.i(t10, "csAppModule.webViewAssetCache");
        E e10 = new E(j0Var, new H(t10));
        g d12 = b10.d();
        u p10 = j10.p();
        C17542s.i(p10, "csAppModule.threadExecutor");
        C7132j0 j0Var2 = new C7132j0(d12, new U(p10, a10, b10.f(), new Q1(b10.d())), b10.f(), b10.c());
        C6849i3 i3Var = new C6849i3();
        C6808d2 d2Var = new C6808d2();
        HashSet<Class<? extends Activity>> hashSet = G1.f42014a;
        C6822f0 f0Var = new C6822f0(i3Var);
        C6822f0 f0Var2 = new C6822f0(d2Var);
        C6892n6 n6Var = new C6892n6(i3Var);
        C6892n6 n6Var2 = new C6892n6(d2Var);
        C6822f0 f0Var3 = f0Var2;
        C6783a1 d13 = c10.d();
        C17542s.i(d13, "csModule.liveActivityProvider");
        C7120d0 d0Var = new C7120d0(e10, a10, f0Var, new Q3(d13));
        C6908p6 h10 = j10.h();
        C17542s.i(h10, "csAppModule.gesturesInterceptor");
        C6892n6 n6Var3 = n6Var2;
        C7137m mVar = r6;
        String str = "csAppModule.gesturesInterceptor";
        C6808d2 d2Var2 = d2Var;
        C7137m mVar2 = new C7137m(d0Var, a10, j0Var2, h10, n6Var);
        O3 o32 = new O3();
        U2 u22 = new U2();
        P2 p22 = new P2(u22);
        G4 g42 = new G4();
        C6801c3 c3Var = new C6801c3();
        C6783a1 d14 = c10.d();
        C17542s.i(d14, "csModule.liveActivityProvider");
        Q3 q32 = new Q3(d14);
        C6908p6 h11 = j10.h();
        C17542s.i(h11, str);
        C6908p6 p6Var = h11;
        C16505B b11 = a10;
        C8886a aVar2 = b10;
        E e11 = e10;
        O3 o33 = o32;
        C6849i3 i3Var2 = i3Var;
        X8.b bVar = j10;
        C6908p6 p6Var2 = p6Var;
        C7132j0 j0Var3 = j0Var2;
        String str2 = "csModule.liveActivityProvider";
        C7160x0 x0Var = new C7160x0(b11, p22, e10, f0Var3, q32, j0Var2, p6Var2, g42, c3Var, n6Var3);
        X0 x02 = new X0(x0Var, new l1(), u22);
        C6783a1 d15 = c10.d();
        C17542s.i(d15, str2);
        Q3 q33 = new Q3(d15);
        C6908p6 h12 = bVar.h();
        C17542s.i(h12, str);
        E e12 = e11;
        C6822f0 f0Var4 = f0Var3;
        C7132j0 j0Var4 = j0Var3;
        C6892n6 n6Var4 = n6Var3;
        X0 x03 = x02;
        O3 o34 = o33;
        C7141n1 n1Var = new C7141n1(new C7143o0(b11, e12, f0Var4, q33, j0Var4, h12, n6Var4, new C6905p3(), new C6897o3()), new C7129i(), o34, aVar2.f());
        C6783a1 d16 = c10.d();
        C17542s.i(d16, str2);
        Q3 q34 = new Q3(d16);
        C6908p6 h13 = bVar.h();
        C17542s.i(h13, str);
        C16505B b12 = a10;
        C7141n1 n1Var2 = n1Var;
        O3 o35 = o34;
        C7116b0 b0Var = new C7116b0(b12, e12, f0Var4, q34, j0Var4, h13, n6Var4, g42, c3Var);
        C6783a1 d17 = c10.d();
        C17542s.i(d17, str2);
        Q3 q35 = new Q3(d17);
        C6908p6 h14 = bVar.h();
        C17542s.i(h14, str);
        P p11 = r6;
        P p12 = new P(b12, e12, f0Var4, q35, j0Var4, h14, new C6905p3(), new C6897o3(), d2Var2);
        X2 x22 = new X2(b0Var, o35);
        C6856j2 j2Var = new C6856j2(p11, o35, aVar2.f());
        b bVar2 = new b(i3Var2);
        E0 g10 = bVar.g();
        C17542s.i(g10, "csAppModule.gestureStorage");
        C7150s0 s0Var = new C7150s0(bVar2, g10, new T(new C0()));
        Y y10 = new Y(mVar);
        C6908p6 h15 = bVar.h();
        C17542s.i(h15, str);
        this.f46941d = new C7161y(y10, x03, n1Var2, x22, j2Var, h15, s0Var, e42, a10, o35);
    }

    public static final boolean a(View view) {
        return false;
    }
}
