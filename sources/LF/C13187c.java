package LF;

import HJ.C15854t;
import QJ.Q;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.work.C7054x;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.core.analytics.IAnalyticsEngine;
import com.sugarcube.core.analytics.entities.LoggedInUser;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u000b#)\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0017J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\r8\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0-0,8\u0006¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b)\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002010,8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b4\u0010/¨\u00066"}, d2 = {"LLF/c;", "Lcom/sugarcube/core/analytics/IAnalyticsEngine;", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "<init>", "(Lcom/sugarcube/app/base/data/AnalyticsManager;)V", "LLF/a;", "event", "", "forceTrackInvoke", "LXH/N;", "b", "(LLF/a;Z)V", "", "log", "LLF/c$a;", "type", "", "exception", "d", "(Ljava/lang/String;LLF/c$a;Ljava/lang/Throwable;)V", "e", "g", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "i", "eventName", "", "", "properties", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/sugarcube/core/network/models/LoggedInUser;", "authState", "f", "(Lcom/sugarcube/core/network/models/LoggedInUser;)V", "a", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "Ljava/lang/String;", "TAG", "", "LLF/c$b;", "c", "Ljava/util/List;", "logs", "LTJ/A;", "", "LTJ/A;", "()LTJ/A;", "logsFlow", "LLF/c$c;", "LLF/c$c;", "state", "getStateFlow", "stateFlow", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: LF.c  reason: case insensitive filesystem */
public final class C13187c implements IAnalyticsEngine {

    /* renamed from: a  reason: collision with root package name */
    private final AnalyticsManager f111913a;

    /* renamed from: b  reason: collision with root package name */
    private final String f111914b = "UploadLogger";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f111915c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final C16504A<List<b>> f111916d = C16511H.b(1, 0, (C16428d) null, 6, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private C2738c f111917e = new C2738c((d) null, (String) null, (C7054x.a) null, (String) null, 15, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private final C16504A<C2738c> f111918f = C16511H.b(1, 0, (C16428d) null, 6, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LLF/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "Normal", "Warning", "Error", "Success", "Analytic", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LF.c$a */
    public enum a {
        Normal,
        Warning,
        Error,
        Success,
        Analytic;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LLF/c$b;", "", "LLF/c$a;", "type", "", "message", "", "exception", "<init>", "(LLF/c$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLF/c$a;", "getType", "()LLF/c$a;", "b", "Ljava/lang/String;", "getMessage", "c", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LF.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f111919a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111920b;

        /* renamed from: c  reason: collision with root package name */
        private final Throwable f111921c;

        public b(a aVar, String str, Throwable th2) {
            C17542s.j(aVar, "type");
            C17542s.j(str, "message");
            this.f111919a = aVar;
            this.f111920b = str;
            this.f111921c = th2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f111919a == bVar.f111919a && C17542s.e(this.f111920b, bVar.f111920b) && C17542s.e(this.f111921c, bVar.f111921c);
        }

        public int hashCode() {
            int hashCode = ((this.f111919a.hashCode() * 31) + this.f111920b.hashCode()) * 31;
            Throwable th2 = this.f111921c;
            return hashCode + (th2 == null ? 0 : th2.hashCode());
        }

        public String toString() {
            a aVar = this.f111919a;
            String str = this.f111920b;
            Throwable th2 = this.f111921c;
            return "UploadLog(type=" + aVar + ", message=" + str + ", exception=" + th2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(a aVar, String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, str, (i10 & 4) != 0 ? null : th2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"LLF/c$c;", "", "LLF/c$d;", "workerState", "", "workerId", "Landroidx/work/x$a;", "workerResult", "bucket", "<init>", "(LLF/c$d;Ljava/lang/String;Landroidx/work/x$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLF/c$d;", "getWorkerState", "()LLF/c$d;", "b", "Ljava/lang/String;", "getWorkerId", "c", "Landroidx/work/x$a;", "getWorkerResult", "()Landroidx/work/x$a;", "d", "getBucket", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LF.c$c  reason: collision with other inner class name */
    public static final class C2738c {

        /* renamed from: a  reason: collision with root package name */
        private final d f111922a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111923b;

        /* renamed from: c  reason: collision with root package name */
        private final C7054x.a f111924c;

        /* renamed from: d  reason: collision with root package name */
        private final String f111925d;

        public C2738c() {
            this((d) null, (String) null, (C7054x.a) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2738c)) {
                return false;
            }
            C2738c cVar = (C2738c) obj;
            return this.f111922a == cVar.f111922a && C17542s.e(this.f111923b, cVar.f111923b) && C17542s.e(this.f111924c, cVar.f111924c) && C17542s.e(this.f111925d, cVar.f111925d);
        }

        public int hashCode() {
            d dVar = this.f111922a;
            int i10 = 0;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            String str = this.f111923b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C7054x.a aVar = this.f111924c;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.f111925d;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            d dVar = this.f111922a;
            String str = this.f111923b;
            C7054x.a aVar = this.f111924c;
            String str2 = this.f111925d;
            return "UploadState(workerState=" + dVar + ", workerId=" + str + ", workerResult=" + aVar + ", bucket=" + str2 + ")";
        }

        public C2738c(d dVar, String str, C7054x.a aVar, String str2) {
            this.f111922a = dVar;
            this.f111923b = str;
            this.f111924c = aVar;
            this.f111925d = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2738c(d dVar, String str, C7054x.a aVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : dVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LLF/c$d;", "", "<init>", "(Ljava/lang/String;I)V", "Running", "Stopped", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: LF.c$d */
    public enum d {
        Running,
        Stopped;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.upload.events.UploadLogger$log$1$1", f = "UploadLog.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: LF.c$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111926c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13187c f111927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C13187c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f111927d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f111927d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f111926c;
            if (i10 == 0) {
                y.b(obj);
                C16504A<List<b>> c10 = this.f111927d.c();
                List t12 = C16877v.t1(this.f111927d.f111915c);
                this.f111926c = 1;
                if (c10.emit(t12, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C13187c(AnalyticsManager analyticsManager) {
        C17542s.j(analyticsManager, "analyticsManager");
        this.f111913a = analyticsManager;
    }

    public static /* synthetic */ void e(C13187c cVar, String str, a aVar, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.Normal;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        cVar.d(str, aVar, th2);
    }

    public static /* synthetic */ void h(C13187c cVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        cVar.g(str, th2);
    }

    public static /* synthetic */ void j(C13187c cVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        cVar.i(str, th2);
    }

    public void associateUser(LoggedInUser loggedInUser, boolean z10) {
        IAnalyticsEngine.DefaultImpls.associateUser(this, loggedInUser, z10);
    }

    public final void b(C13185a aVar, boolean z10) {
        C17542s.j(aVar, "event");
        Map<String, Object> b10 = aVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : b10.entrySet()) {
            if (next.getValue() != null) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        this.f111913a.track(aVar.a(), (HashMap<String, Object>) new HashMap(linkedHashMap), z10);
        e(this, "Event: " + aVar, (a) null, (Throwable) null, 6, (Object) null);
    }

    public final C16504A<List<b>> c() {
        return this.f111916d;
    }

    public final void d(String str, a aVar, Throwable th2) {
        C17542s.j(str, "log");
        C17542s.j(aVar, "type");
        synchronized (this.f111915c) {
            this.f111915c.add(new b(aVar, str, th2));
            Object unused = C16312j.b((C17168i) null, new e(this, (C17164e<? super e>) null), 1, (Object) null);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void disassociateUser() {
        IAnalyticsEngine.DefaultImpls.disassociateUser(this);
    }

    public final void f(com.sugarcube.core.network.models.LoggedInUser loggedInUser) {
        String str;
        List<b> list = this.f111915c;
        a aVar = a.Normal;
        if (loggedInUser != null) {
            str = "Logged In " + loggedInUser.getEmail();
        } else {
            str = "Not logged in";
        }
        list.add(new b(aVar, str, (Throwable) null, 4, (DefaultConstructorMarker) null));
    }

    public final void g(String str, Throwable th2) {
        C17542s.j(str, "log");
        d(str, a.Error, th2);
    }

    public final void i(String str, Throwable th2) {
        C17542s.j(str, "log");
        d(str, a.Warning, th2);
    }

    public void track(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventName");
        C17542s.j(map, "properties");
        if (C17542s.e(str, "Capture.Upload.End")) {
            Object obj = map.get("Result");
            e(this, str + " - " + obj, a.Analytic, (Throwable) null, 4, (Object) null);
        } else if (C15854t.W(str, "Capture.Upload", false, 2, (Object) null)) {
            e(this, str, a.Analytic, (Throwable) null, 4, (Object) null);
        }
    }

    public boolean trackAlways() {
        return IAnalyticsEngine.DefaultImpls.trackAlways(this);
    }
}
