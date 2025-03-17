package U8;

import F8.g;
import G8.h;
import QJ.F0;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import a9.C6795b5;
import a9.C6818e4;
import a9.C6821f;
import a9.C6858j4;
import a9.C6881m3;
import a9.C6895o1;
import a9.C6929s4;
import a9.C6973y0;
import a9.I;
import a9.M5;
import a9.P4;
import a9.R4;
import a9.Z5;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.O;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import com.contentsquare.android.internal.core.telemetry.event.ApiUsageEvent;
import com.contentsquare.android.internal.features.initialize.ContentsquareModule;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import u8.C8886a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b \u0010!R!\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b%\u0010&R!\u0010+\u001a\b\u0012\u0004\u0012\u00020(0#8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010&R(\u00103\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010-\u0012\u0004\b2\u0010\u0003\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001048@@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010<¨\u0006>"}, d2 = {"LU8/a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "LXH/N;", "k", "(Landroid/app/Application;)V", "T", "", "name", "value", "d", "(Ljava/lang/String;Ljava/lang/Object;)V", "key", "m", "(Ljava/lang/String;)V", "n", "apiName", "e", "(Ljava/lang/String;)LXH/N;", "l", "b", "Landroid/app/Application;", "LG8/h;", "c", "LXH/o;", "g", "()LG8/h;", "fileStorageUtil", "La9/y0;", "i", "()La9/y0;", "staticCollector", "", "La9/j3;", "getAgents", "()Ljava/util/List;", "agents", "La9/Z5;", "f", "getSubscribers", "subscribers", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "h", "()Landroidx/lifecycle/y;", "setLifecycleOwner$library_release", "(Landroidx/lifecycle/y;)V", "getLifecycleOwner$library_release$annotations", "lifecycleOwner", "La9/j4;", "La9/j4;", "j", "()La9/j4;", "setTelemetryManager$library_release", "(La9/j4;)V", "telemetryManager", "Lu8/a;", "()Lu8/a;", "coreModule", "library_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40370a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static Application f40371b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16824o f40372c = C16825p.b(b.f40379c);

    /* renamed from: d  reason: collision with root package name */
    private static final C16824o f40373d = C16825p.b(c.f40380c);

    /* renamed from: e  reason: collision with root package name */
    private static final C16824o f40374e = C16825p.b(C0663a.f40378c);

    /* renamed from: f  reason: collision with root package name */
    private static final C16824o f40375f = C16825p.b(d.f40381c);

    /* renamed from: g  reason: collision with root package name */
    private static C5221y f40376g = O.f22160i.a();

    /* renamed from: h  reason: collision with root package name */
    private static C6858j4 f40377h;

    /* renamed from: U8.a$a  reason: collision with other inner class name */
    public static final class C0663a extends C17544u implements C17631a<List<? extends C6895o1>> {

        /* renamed from: c  reason: collision with root package name */
        public static final C0663a f40378c = new C0663a();

        public C0663a() {
            super(0);
        }

        public final Object invoke() {
            I i10 = new I();
            a aVar = a.f40370a;
            h c10 = aVar.g();
            Application a10 = a.f40371b;
            Application application = null;
            if (a10 == null) {
                C17542s.z("application");
                a10 = null;
            }
            Context applicationContext = a10.getApplicationContext();
            C17542s.i(applicationContext, "application.applicationContext");
            C6895o1 o1Var = new C6895o1(i10, new M5(c10, applicationContext, "cpu"));
            P4 p42 = new P4();
            h c11 = aVar.g();
            Application a11 = a.f40371b;
            if (a11 == null) {
                C17542s.z("application");
            } else {
                application = a11;
            }
            Context applicationContext2 = application.getApplicationContext();
            C17542s.i(applicationContext2, "application.applicationContext");
            return C16877v.q(o1Var, new C6895o1(p42, new M5(c11, applicationContext2, "ram")));
        }
    }

    public static final class b extends C17544u implements C17631a<h> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f40379c = new b();

        public b() {
            super(0);
        }

        public final Object invoke() {
            return new h();
        }
    }

    public static final class c extends C17544u implements C17631a<C6973y0> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f40380c = new c();

        public c() {
            super(0);
        }

        public final Object invoke() {
            a aVar = a.f40370a;
            g d10 = aVar.f().d();
            JsonConfig.ProjectConfiguration b10 = aVar.f().c().b();
            Application a10 = a.f40371b;
            Application application = null;
            if (a10 == null) {
                C17542s.z("application");
                a10 = null;
            }
            ClassLoader classLoader = a10.getClassLoader();
            C17542s.i(classLoader, "application.classLoader");
            C6881m3 m3Var = new C6881m3(classLoader);
            Application a11 = a.f40371b;
            if (a11 == null) {
                C17542s.z("application");
            } else {
                application = a11;
            }
            return new C6973y0(d10, b10, m3Var, application);
        }
    }

    public static final class d extends C17544u implements C17631a<List<? extends Z5>> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f40381c = new d();

        public d() {
            super(0);
        }

        public final Object invoke() {
            a aVar = a.f40370a;
            return C16877v.q(new C6795b5(aVar.f().d(), aVar.f().c()), new C6818e4(aVar.f().d(), aVar.f().c()));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"U8/a$e", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class e implements C5205h {
        public final void onStop(C5221y yVar) {
            C17542s.j(yVar, "owner");
            if (ContentsquareModule.b() == null) {
                a aVar = a.f40370a;
                E8.c f10 = aVar.f().f();
                E8.b bVar = E8.b.TELEMETRY_IS_FORCED_REPORT_SENT;
                if (!f10.b(bVar, false)) {
                    C6858j4 j10 = aVar.j();
                    if (!(j10 == null || j10.f42636q == 2)) {
                        j10.f42636q = 2;
                        F0 unused = C16314k.d(j10.f42633n, (C17168i) null, (T) null, new C6929s4(j10, (C17164e<? super C6929s4>) null), 3, (Object) null);
                    }
                    aVar.f().f().h(bVar, true);
                }
            }
            a.f40370a.h().getLifecycle().g(this);
        }
    }

    private a() {
    }

    /* access modifiers changed from: private */
    public final C8886a f() {
        C8886a.C0914a aVar = C8886a.f56874d;
        Application application = f40371b;
        if (application == null) {
            C17542s.z("application");
            application = null;
        }
        return aVar.b(application);
    }

    /* access modifiers changed from: private */
    public final h g() {
        return (h) f40372c.getValue();
    }

    private final C6973y0 i() {
        return (C6973y0) f40373d.getValue();
    }

    public final <T> void d(String str, T t10) {
        C17542s.j(str, "name");
        C17542s.j(t10, "value");
        C6858j4 j10 = j();
        if (j10 != null) {
            j10.d("custom." + str, t10);
        }
    }

    public final C16807N e(String str) {
        C17542s.j(str, "apiName");
        C6858j4 j10 = j();
        if (j10 == null) {
            return null;
        }
        C17542s.j(str, "name");
        j10.f42624e.b(new ApiUsageEvent(str, 1));
        return C16807N.f139792a;
    }

    public final C5221y h() {
        return f40376g;
    }

    public final C6858j4 j() {
        C6858j4 j4Var;
        C6858j4 j4Var2 = f40377h;
        if (j4Var2 != null) {
            return j4Var2;
        }
        Application application = f40371b;
        if (application != null) {
            j4Var = new C6858j4(application, f().f(), O.f22160i.a(), new R4(f().f(), f().d()), i(), f().d(), f().c());
        } else {
            j4Var = null;
        }
        f40377h = j4Var;
        return j4Var;
    }

    public final void k(Application application) {
        C17542s.j(application, "application");
        f40371b = application;
        C6858j4 j10 = j();
        if (j10 != null) {
            j10.b();
        }
    }

    public final void l(Application application) {
        C17542s.j(application, "application");
        f40371b = application;
        C6858j4 j10 = j();
        if (j10 != null) {
            j10.e();
        }
        C6858j4 j11 = j();
        if (j11 != null) {
            Boolean bool = Boolean.TRUE;
            C17542s.j("is_heap_started", "key");
            C17542s.j(bool, "value");
            C6973y0 y0Var = j11.f42627h;
            y0Var.getClass();
            C17542s.j("is_heap_started", "key");
            C17542s.j(bool, "value");
            y0Var.f42965e.put("is_heap_started", bool);
        }
        f40376g.getLifecycle().c(new e());
    }

    public final void m(String str) {
        C17542s.j(str, "key");
        C6858j4 j10 = j();
        if (j10 != null) {
            C17542s.j(str, "key");
            C6821f.a(j10.f42625f, str);
        }
    }

    public final void n(String str) {
        C17542s.j(str, "key");
        C6858j4 j10 = j();
        if (j10 != null) {
            C17542s.j(str, "key");
            C6821f.b(j10.f42625f, str);
        }
    }
}
