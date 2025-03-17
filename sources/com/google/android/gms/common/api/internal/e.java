package com.google.android.gms.common.api.internal;

import H9.C6534h;
import android.os.Bundle;

final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C6534h f48034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f48035b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f f48036c;

    e(f fVar, C6534h hVar, String str) {
        this.f48034a = hVar;
        this.f48035b = str;
        this.f48036c = fVar;
    }

    public final void run() {
        Bundle bundle;
        f fVar = this.f48036c;
        if (fVar.f48038b > 0) {
            C6534h hVar = this.f48034a;
            if (fVar.f48039c != null) {
                bundle = fVar.f48039c.getBundle(this.f48035b);
            } else {
                bundle = null;
            }
            hVar.f(bundle);
        }
        if (this.f48036c.f48038b >= 2) {
            this.f48034a.j();
        }
        if (this.f48036c.f48038b >= 3) {
            this.f48034a.h();
        }
        if (this.f48036c.f48038b >= 4) {
            this.f48034a.k();
        }
        if (this.f48036c.f48038b >= 5) {
            this.f48034a.g();
        }
    }
}
