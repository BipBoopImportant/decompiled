package com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay;

import QJ.C16311i0;
import QJ.F0;
import QJ.S;
import QJ.T;
import a9.E4;
import a9.O3;
import a9.X;
import a9.Z4;
import android.app.Application;
import android.content.Intent;
import android.view.View;
import bK.C17052a;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity;
import com.contentsquare.android.sdk.C7142o;
import com.contentsquare.android.sdk.C7145p0;
import com.contentsquare.android.sdk.C7161y;
import com.contentsquare.android.sdk.X0;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.p;

public final class d implements a.C0812a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OverlayService f46657a;

    public /* synthetic */ class a extends C17540p implements p<C7145p0, C17164e<? super Boolean>, Object> {
        public a(a aVar) {
            super(2, aVar, a.class, "showSnapshotDialog", "showSnapshotDialog(Lcom/contentsquare/android/analytics/internal/features/clientmode/screencapture/screenrecorder/SnapshotConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) this.receiver).b((C7145p0) obj, (C17164e) obj2);
        }
    }

    public d(OverlayService overlayService) {
        this.f46657a = overlayService;
    }

    public final void a() {
        C7161y yVar = this.f46657a.f46619b;
        if (yVar == null) {
            C17542s.z("viewModel");
            yVar = null;
        }
        C17052a.C3460a.b(yVar.f47726j.f42175a, (Object) null, 1, (Object) null);
        yVar.f47718b.f47213c.f42318a.set(true);
    }

    public final void b() {
        C7161y yVar = this.f46657a.f46619b;
        if (yVar == null) {
            C17542s.z("viewModel");
            yVar = null;
        }
        E4 e42 = yVar.f47724h;
        e42.getClass();
        int i10 = SettingsActivity.f46658B;
        Application application = e42.f41980a;
        C17542s.h(application, "null cannot be cast to non-null type android.content.Context");
        C17542s.j(application, "context");
        Intent intent = new Intent(application, SettingsActivity.class);
        intent.addFlags(268435456);
        application.startActivity(intent);
    }

    public final void c() {
        C7161y yVar = this.f46657a.f46619b;
        if (yVar == null) {
            C17542s.z("viewModel");
            yVar = null;
        }
        a aVar = this.f46657a.f46620c;
        if (aVar == null) {
            C17542s.z("overlayLayoutManager");
            aVar = null;
        }
        a aVar2 = new a(aVar);
        yVar.getClass();
        C17542s.j(aVar2, "setUp");
        F0 unused = C16314k.d(S.a(yVar.f47727k.plus(C16311i0.c())), (C17168i) null, (T) null, new C7142o(yVar, aVar2, (C17164e) null), 3, (Object) null);
    }

    public final void d() {
        C7161y yVar = this.f46657a.f46619b;
        a aVar = null;
        if (yVar == null) {
            C17542s.z("viewModel");
            yVar = null;
        }
        J0.i(yVar.f47727k, (CancellationException) null, 1, (Object) null);
        X0 x02 = yVar.f47718b;
        x02.f47213c.f42318a.set(false);
        x02.f47215e = null;
        F0 unused = C16314k.d(S.a(C16311i0.c()), (C17168i) null, (T) null, new Z4(x02, (C17164e<? super Z4>) null), 3, (Object) null);
        a aVar2 = this.f46657a.f46620c;
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            C17542s.z("overlayLayoutManager");
        }
        View a10 = aVar.a();
        if (a10 != null) {
            a10.setVisibility(0);
        }
    }

    public final void e() {
        C7161y yVar = this.f46657a.f46619b;
        if (yVar == null) {
            C17542s.z("viewModel");
            yVar = null;
        }
        O3 o32 = yVar.f47726j;
        o32.getClass();
        try {
            C17052a.C3460a.c(o32.f42175a, (Object) null, 1, (Object) null);
        } catch (IllegalStateException unused) {
        }
        F0 unused2 = C16314k.d(S.a(yVar.f47727k), (C17168i) null, (T) null, new X(yVar, (C17164e<? super X>) null), 3, (Object) null);
    }
}
