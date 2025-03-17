package com.contentsquare.android.sdk;

import D8.c;
import E8.b;
import a9.C6838h0;
import a9.H2;
import a9.I0;
import a9.I2;
import a9.Y1;
import android.app.Application;
import com.contentsquare.android.sdk.S0;
import java.io.File;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

public final class Z {

    /* renamed from: f  reason: collision with root package name */
    public static final c f47252f = new c("GdprControllerImpl");

    /* renamed from: a  reason: collision with root package name */
    public final Y1 f47253a;

    /* renamed from: b  reason: collision with root package name */
    public final I0 f47254b;

    /* renamed from: c  reason: collision with root package name */
    public final C6838h0 f47255c;

    /* renamed from: d  reason: collision with root package name */
    public final G f47256d;

    /* renamed from: e  reason: collision with root package name */
    public final E8.c f47257e;

    public Z(Application application, Y1 y12, I0 i02, C6838h0 h0Var, G g10) {
        this.f47253a = y12;
        this.f47254b = i02;
        this.f47255c = h0Var;
        this.f47256d = g10;
        this.f47257e = C8886a.g(application).f();
    }

    public final void a() {
        Y1 y12 = this.f47253a;
        y12.f42400a.c(new File(y12.f42401b));
        f47252f.j("Wiped storage.");
    }

    public final void b() {
        c cVar = f47252f;
        cVar.f("GdprController, clearAndFlushAll");
        this.f47257e.p();
        this.f47255c.f42591a.o(b.SCHEDULED_APP_HIDE_EVENT, b.LAST_EVENT_TIMESTAMP, b.IS_HIDE_EVENT_PENDING);
        cVar.j("Wiped preferences.");
        G g10 = this.f47256d;
        H2 h22 = new H2(this);
        I2 i22 = new I2(this);
        g10.getClass();
        C17542s.j(h22, "onSuccess");
        C17542s.j(i22, "onError");
        C7151t tVar = g10.f46975e;
        tVar.getClass();
        C17542s.j(h22, "onSuccess");
        C17542s.j(i22, "onError");
        S0 s02 = tVar.f47629j;
        if (s02 != null) {
            tVar.f47620a.c();
            C17542s.j(h22, "onSuccess");
            C17542s.j(i22, "onError");
            C17542s.i(s02.f47142a.submit(new S0.a(s02, h22, i22)), "threadExecutor.submit(Di…able(onSuccess, onError))");
        }
    }
}
