package com.contentsquare.android.sdk;

import A8.b;
import E8.c;
import a9.N6;
import a9.W6;
import a9.Y4;
import com.contentsquare.android.core.features.config.model.JsonConfig;

public final class t1 implements N6, c.b {

    /* renamed from: a  reason: collision with root package name */
    public final D8.c f47633a = new D8.c("SdkManager");

    /* renamed from: b  reason: collision with root package name */
    public final b f47634b;

    /* renamed from: c  reason: collision with root package name */
    public final W6 f47635c;

    /* renamed from: d  reason: collision with root package name */
    public final c f47636d;

    /* renamed from: e  reason: collision with root package name */
    public a f47637e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47638f;

    public interface a {
    }

    public t1(b bVar, W6 w62, c cVar) {
        this.f47634b = bVar;
        this.f47635c = w62;
        this.f47636d = cVar;
        cVar.n(this);
        a();
    }

    public final void a() {
        D8.c cVar;
        String str;
        JsonConfig.ProjectConfiguration b10 = this.f47634b.b();
        if (b10 != null) {
            boolean z10 = false;
            if (!b10.m() || this.f47636d.a(E8.b.IS_OPT_OUT)) {
                c cVar2 = this.f47636d;
                E8.b bVar = E8.b.IS_OPT_OUT;
                if (cVar2.b(bVar, false)) {
                    this.f47633a.j("User consent status: Opted-out");
                } else if (b10.r()) {
                    if (!this.f47636d.a(bVar)) {
                        cVar = this.f47633a;
                        str = "User consent status: Opted-in by default";
                    } else {
                        cVar = this.f47633a;
                        str = "User consent status: Opted-in";
                    }
                    cVar.j(str);
                    if (this.f47636d.b(E8.b.PAUSE_TRACKING, false)) {
                        this.f47633a.j("Data collection has been paused with Contentsquare.stopTracking(). You can resume data collection by calling Contentsquare.resumeTracking()");
                    } else if (this.f47636d.b(E8.b.CLIENT_MODE_ACTIVATION_STATE, false)) {
                        this.f47633a.j("User is drawn for tracking: true (forced because CS InApp enabled)");
                        z10 = true;
                    } else {
                        W6 w62 = this.f47635c;
                        int n10 = (int) (((double) b10.n()) * ((double) 100));
                        c cVar3 = w62.f42370a;
                        E8.b bVar2 = E8.b.LAST_SEGMENT;
                        if (cVar3.d(bVar2, -1) != n10) {
                            w62.f42372c.getClass();
                            int nextInt = Y4.f42404a.nextInt(100);
                            w62.f42370a.j(bVar2, n10);
                            c cVar4 = w62.f42370a;
                            E8.b bVar3 = E8.b.IS_TRACKABLE;
                            if (nextInt < n10) {
                                z10 = true;
                            }
                            cVar4.h(bVar3, z10);
                        }
                        z10 = w62.f42370a.b(E8.b.IS_TRACKABLE, true);
                        w62.f42371b.f("segmentSize = " + n10 + ", isInAudience = " + z10);
                        D8.c cVar5 = this.f47633a;
                        StringBuilder sb2 = new StringBuilder("User is drawn for tracking: ");
                        sb2.append(z10);
                        cVar5.k(sb2.toString());
                    }
                }
            } else {
                this.f47633a.j("User consent status: Waiting for opt-in");
            }
            this.f47638f = z10;
            b(z10);
            this.f47636d.h(E8.b.TRACKING_ENABLE, this.f47638f);
        }
    }

    public final void b(boolean z10) {
        a aVar = this.f47637e;
        if (aVar != null) {
            G g10 = (G) aVar;
            if (z10) {
                g10.a();
            } else {
                g10.b();
            }
        }
    }

    public final void o(E8.b bVar) {
        if (bVar == E8.b.RAW_CONFIGURATION_AS_JSON) {
            a();
        }
    }
}
