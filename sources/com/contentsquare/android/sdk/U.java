package com.contentsquare.android.sdk;

import C8.d;
import E8.c;
import G8.u;
import TJ.C16505B;
import XH.x;
import XH.y;
import a9.C6912q2;
import a9.H1;
import a9.Q1;
import com.contentsquare.android.sdk.C7134k0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final u f47156a;

    /* renamed from: b  reason: collision with root package name */
    public final C16505B<C7134k0> f47157b;

    /* renamed from: c  reason: collision with root package name */
    public final c f47158c;

    /* renamed from: d  reason: collision with root package name */
    public final Q1 f47159d;

    /* renamed from: e  reason: collision with root package name */
    public final C8.a f47160e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final O f47161a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47162b;

        public a(O o10, String str) {
            C17542s.j(o10, "screenCapture");
            C17542s.j(str, "servicePath");
            this.f47161a = o10;
            this.f47162b = str;
        }
    }

    public final class b implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final a f47163a;

        /* renamed from: b  reason: collision with root package name */
        public final C8.a f47164b;

        /* renamed from: c  reason: collision with root package name */
        public final c f47165c;

        /* renamed from: d  reason: collision with root package name */
        public final D8.c f47166d = new D8.c("ScreenRecordProcessorRunnable");

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ U f47167e;

        public b(U u10, a aVar, C8.a aVar2, c cVar) {
            C17542s.j(aVar, "processingData");
            C17542s.j(aVar2, "httpConnection");
            C17542s.j(cVar, "preferencesStore");
            this.f47167e = u10;
            this.f47163a = aVar;
            this.f47164b = aVar2;
            this.f47165c = cVar;
        }

        public final Object call() {
            Object obj;
            Throwable e10;
            List<C7153u> list;
            a aVar = this.f47163a;
            C6912q2 q2Var = aVar.f47161a.f47065n;
            d dVar = null;
            String str = q2Var != null ? q2Var.f42806b : null;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            boolean z10 = false;
            boolean b10 = this.f47165c.b(E8.b.CLIENT_MODE_SCREENGRAPH_OPTIMIZATION_MODE, false);
            Q1 q12 = this.f47167e.f47159d;
            O o10 = aVar.f47161a;
            q12.getClass();
            C17542s.j(o10, "screenCapture");
            o10.f47052a = q12.f42224a.r(o10.f47052a);
            o10.f47053b = q12.f42224a.r(o10.f47053b);
            C6912q2 q2Var2 = o10.f47065n;
            if (!(q2Var2 == null || (list = q2Var2.f42808d) == null)) {
                for (C7153u a10 : list) {
                    q12.a(a10);
                }
            }
            O o11 = aVar.f47161a;
            try {
                x.a aVar2 = x.f139812b;
                obj = x.b(o11.a(b10));
            } catch (Throwable th2) {
                x.a aVar3 = x.f139812b;
                obj = x.b(y.a(th2));
            }
            if (x.g(obj) && (e10 = x.e(obj)) != null) {
                D8.c cVar = this.f47166d;
                String message = e10.getMessage();
                if (message != null) {
                    str2 = message;
                }
                cVar.i(e10, str2);
            }
            if (x.g(obj)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null) {
                try {
                    C8.a aVar4 = this.f47164b;
                    String str3 = aVar.f47162b;
                    String jSONObject2 = jSONObject.toString();
                    C17542s.i(jSONObject2, "serializedScreenObject.toString()");
                    dVar = C8.a.g(aVar4, str3, jSONObject2, (Map) null, 4, (Object) null);
                } catch (OutOfMemoryError e11) {
                    H1.a(this.f47166d, "Failed to sent the screengraph data to the following service path: " + aVar.f47162b, e11);
                    U u10 = this.f47167e;
                    C7134k0.b.f fVar = C7134k0.b.f.f47475a;
                    u10.getClass();
                    C17542s.j(fVar, "reason");
                    C17542s.j(str, "screenName");
                    u10.f47157b.a(new C7134k0.a(fVar, str));
                }
                if (dVar != null) {
                    if (dVar.p()) {
                        this.f47167e.f47157b.a(new C7134k0.h(str));
                        z10 = true;
                    } else {
                        Throwable d10 = dVar.d();
                        String str4 = "Failed to sent the screengraph data to the following service path: " + aVar.f47162b;
                        D8.c cVar2 = this.f47166d;
                        if (d10 == null) {
                            cVar2.h(str4);
                        } else {
                            H1.a(cVar2, str4, d10);
                        }
                        U u11 = this.f47167e;
                        C7134k0.b.c cVar3 = C7134k0.b.c.f47472a;
                        u11.getClass();
                        C17542s.j(cVar3, "reason");
                        C17542s.j(str, "screenName");
                        u11.f47157b.a(new C7134k0.a(cVar3, str));
                    }
                }
            } else {
                U u12 = this.f47167e;
                C7134k0.b.e eVar = C7134k0.b.e.f47474a;
                u12.getClass();
                C17542s.j(eVar, "reason");
                C17542s.j(str, "screenName");
                u12.f47157b.a(new C7134k0.a(eVar, str));
                this.f47166d.h("Problems serializing the ScreenCapture object");
            }
            return Boolean.valueOf(z10);
        }
    }

    public U(u uVar, C16505B b10, c cVar, Q1 q12) {
        C8.a aVar = new C8.a();
        C17542s.j(uVar, "executorService");
        C17542s.j(b10, "snapshotStateFlow");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(q12, "screenCaptureConverter");
        C17542s.j(aVar, "httpConnection");
        this.f47156a = uVar;
        this.f47157b = b10;
        this.f47158c = cVar;
        this.f47159d = q12;
        this.f47160e = aVar;
    }
}
