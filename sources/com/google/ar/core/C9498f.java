package com.google.ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.dependencies.i;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.f  reason: case insensitive filesystem */
final class C9498f extends i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f67757a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C9500h f67758b;

    C9498f(C9500h hVar, AtomicBoolean atomicBoolean) {
        this.f67757a = atomicBoolean;
        this.f67758b = hVar;
    }

    public final void b(Bundle bundle) {
        if (!this.f67757a.getAndSet(true)) {
            int i10 = bundle.getInt("error.code", -100);
            int i11 = bundle.getInt("install.status", 0);
            if (i11 == 4) {
                this.f67758b.f67762b.a(W.COMPLETED);
            } else if (i10 != 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
                sb2.append("requestInstall = ");
                sb2.append(i10);
                sb2.append(", launching fullscreen.");
                Log.w("ARCore-InstallService", sb2.toString());
                C9500h hVar = this.f67758b;
                hVar.f67763c.i(hVar.f67761a, hVar.f67762b);
            } else if (bundle.containsKey("resolution.intent")) {
                C9500h hVar2 = this.f67758b;
                hVar2.f67763c.j(hVar2.f67761a, bundle, hVar2.f67762b);
            } else if (i11 != 10) {
                switch (i11) {
                    case 1:
                    case 2:
                    case 3:
                        this.f67758b.f67762b.a(W.ACCEPTED);
                        return;
                    case 4:
                        this.f67758b.f67762b.a(W.COMPLETED);
                        return;
                    case 5:
                        C9500h hVar3 = this.f67758b;
                        hVar3.f67762b.b(new FatalException("Unexpected FAILED install status without error."));
                        return;
                    case 6:
                        this.f67758b.f67762b.a(W.CANCELLED);
                        return;
                    default:
                        C9500h hVar4 = this.f67758b;
                        hVar4.f67762b.b(new FatalException(O.b((byte) 27, i11, "Unexpected install status: ")));
                        return;
                }
            } else {
                C9500h hVar5 = this.f67758b;
                hVar5.f67762b.b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
            }
        }
    }

    public final void c(Bundle bundle) {
    }
}
