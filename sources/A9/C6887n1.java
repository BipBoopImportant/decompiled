package a9;

import D8.c;
import G8.h;
import HJ.C15854t;
import QJ.C16340x0;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.O;
import com.contentsquare.android.internal.core.logmonitor.processing.LogMessage;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kK.C17514c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import u8.C8886a;

/* renamed from: a9.n1  reason: case insensitive filesystem */
public final class C6887n1 {

    /* renamed from: a  reason: collision with root package name */
    public final C8.a f42725a;

    /* renamed from: b  reason: collision with root package name */
    public final C6950v1 f42726b;

    /* renamed from: c  reason: collision with root package name */
    public final Q f42727c;

    /* renamed from: d  reason: collision with root package name */
    public final c f42728d = new c("LogProcessor");

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f42729e = new AtomicInteger(0);

    @f(c = "com.contentsquare.android.internal.core.logmonitor.processing.LogProcessor$storeLog$1", f = "LogProcessor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: a9.n1$a */
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C6887n1 f42730c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LogMessage f42731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6887n1 n1Var, LogMessage logMessage, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f42730c = n1Var;
            this.f42731d = logMessage;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f42730c, this.f42731d, eVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            Q q10 = (Q) obj;
            return new a(this.f42730c, this.f42731d, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            y.b(obj);
            C6950v1 v1Var = this.f42730c.f42726b;
            LogMessage logMessage = this.f42731d;
            v1Var.getClass();
            C17542s.j(logMessage, "logMessage");
            try {
                StringBuilder sb2 = new StringBuilder();
                C17514c.a aVar = C17514c.f144280d;
                aVar.a();
                sb2.append(C15854t.Q(aVar.b(LogMessage.Companion.serializer(), logMessage), "\n", "", false, 4, (Object) null));
                sb2.append(10);
                String sb3 = sb2.toString();
                h hVar = v1Var.f42895b;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(v1Var.f42894a.getFilesDir().getAbsolutePath());
                String str = File.separator;
                sb4.append(str);
                sb4.append("cs");
                sb4.append(str);
                sb4.append(v1Var.f42897d);
                hVar.o(sb4.toString());
                v1Var.f42895b.t(v1Var.f42898e, sb3, true);
                c cVar = v1Var.f42896c;
                cVar.f("Store log on disk. : " + sb3);
            } catch (Throwable th2) {
                c cVar2 = v1Var.f42896c;
                cVar2.h("Failed to save log to file at path: " + v1Var.f42898e + " | error message: " + th2.getMessage());
            }
            if (this.f42730c.f42729e.incrementAndGet() >= 5) {
                C6887n1 n1Var = this.f42730c;
                n1Var.getClass();
                if (D6.a(C8886a.f56874d.a(), "log_monitoring")) {
                    F0 unused = C16314k.d(n1Var.f42727c, (C17168i) null, (T) null, new C6847i1(n1Var, (C17164e<? super C6847i1>) null), 3, (Object) null);
                }
            }
            C6950v1 v1Var2 = this.f42730c.f42726b;
            v1Var2.getClass();
            long j10 = 0;
            try {
                if (v1Var2.f42895b.e(v1Var2.f42898e).exists()) {
                    j10 = v1Var2.f42895b.j(v1Var2.f42898e);
                }
            } catch (Throwable th3) {
                c cVar3 = v1Var2.f42896c;
                cVar3.h("Failed to get lof file physical size: " + th3.getMessage());
            }
            if (j10 > 1048576) {
                this.f42730c.f42728d.f("The log file storage has reached max size limit. Clear all logs.");
                this.f42730c.f42726b.a();
            }
            return C16807N.f139792a;
        }
    }

    public C6887n1(C8.a aVar, C6950v1 v1Var) {
        C17542s.j(aVar, "httpConnection");
        C17542s.j(v1Var, "logStorage");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C17542s.i(newSingleThreadExecutor, "newSingleThreadExecutor()");
        Q a10 = S.a(C16340x0.c(newSingleThreadExecutor));
        C5221y a11 = O.f22160i.a();
        C17542s.j(aVar, "httpConnection");
        C17542s.j(v1Var, "logStorage");
        C17542s.j(a10, "coroutineScope");
        C17542s.j(a11, "lifeCycleOwner");
        this.f42725a = aVar;
        this.f42726b = v1Var;
        this.f42727c = a10;
        a11.getLifecycle().c(new T8.a(this));
    }

    public final void a(LogMessage logMessage) {
        C17542s.j(logMessage, "logMessage");
        if (D6.a(C8886a.f56874d.a(), "log_monitoring")) {
            F0 unused = C16314k.d(this.f42727c, (C17168i) null, (T) null, new a(this, logMessage, (C17164e<? super a>) null), 3, (Object) null);
        }
    }
}
