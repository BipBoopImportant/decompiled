package B8;

import A8.b;
import C8.d;
import G8.v;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.P;
import QJ.P0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.X;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006&"}, d2 = {"LB8/c;", "", "LA8/b;", "configuration", "LC8/a;", "httpConnection", "LG8/a;", "buildConfig", "LQJ/M;", "ioDispatcher", "<init>", "(LA8/b;LC8/a;LG8/a;LQJ/M;)V", "", "endpoint", "userId", "packageName", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LC8/d;", "response", "e", "(LC8/d;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function0;", "LXH/N;", "onDownloadedCallback", "c", "(Ljava/lang/String;Ljava/lang/String;LnI/a;)V", "a", "LA8/b;", "b", "LC8/a;", "LG8/a;", "LQJ/Q;", "LQJ/Q;", "coroutineScope", "LD8/c;", "LD8/c;", "logger", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f33259a;

    /* renamed from: b  reason: collision with root package name */
    private final C8.a f33260b;

    /* renamed from: c  reason: collision with root package name */
    private final G8.a f33261c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f33262d;

    /* renamed from: e  reason: collision with root package name */
    private final D8.c f33263e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "com.contentsquare.android.core.features.config.network.ConfigurationDownloader$execute$1", f = "ConfigurationDownloader.kt", l = {45}, m = "invokeSuspend")
    public static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f33264c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f33265d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f33266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f33267f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f33268g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f33269h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "com.contentsquare.android.core.features.config.network.ConfigurationDownloader$execute$1$1", f = "ConfigurationDownloader.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B8.c$a$a  reason: collision with other inner class name */
        public static final class C0508a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f33270c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f33271d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0508a(C17631a<C16807N> aVar, C17164e<? super C0508a> eVar) {
                super(2, eVar);
                this.f33271d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0508a(this.f33271d, eVar);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f33270c == 0) {
                    y.b(obj);
                    this.f33271d.invoke();
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0508a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, String str2, String str3, C17631a<C16807N> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f33265d = cVar;
            this.f33266e = str;
            this.f33267f = str2;
            this.f33268g = str3;
            this.f33269h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f33265d, this.f33266e, this.f33267f, this.f33268g, this.f33269h, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f33264c;
            if (i10 == 0) {
                y.b(obj);
                String a10 = this.f33265d.d(this.f33266e, this.f33267f, this.f33268g);
                if (a10 != null) {
                    this.f33265d.f33259a.g(a10);
                    P0 c10 = C16311i0.c();
                    C0508a aVar = new C0508a(this.f33269h, (C17164e<? super C0508a>) null);
                    this.f33264c = 1;
                    if (C16310i.g(c10, aVar, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(b bVar, C8.a aVar, G8.a aVar2) {
        this(bVar, aVar, aVar2, (M) null, 8, (DefaultConstructorMarker) null);
        C17542s.j(bVar, "configuration");
        C17542s.j(aVar, "httpConnection");
        C17542s.j(aVar2, "buildConfig");
    }

    /* access modifiers changed from: private */
    public final String d(String str, String str2, String str3) {
        Map c10 = X.c();
        if (this.f33259a.a().length() > 0) {
            c10.put("If-None-Match", this.f33259a.a());
        }
        if (str2 != null && C17542s.e(this.f33261c.a(), "qa")) {
            c10.put("uid", str2);
        }
        return e(this.f33260b.d(str, X.b(c10)), str, str3);
    }

    private final String e(d dVar, String str, String str2) {
        String str3;
        int f10 = dVar.f();
        if (f10 == 200) {
            String g10 = dVar.g();
            if (g10 == null) {
                return null;
            }
            b bVar = this.f33259a;
            List list = dVar.e().get("ETag");
            if (list == null || (str3 = (String) C16877v.w0(list)) == null) {
                str3 = "";
            }
            bVar.h(str3);
            this.f33263e.f("Got remote config: ".concat(g10));
            return g10;
        } else if (f10 == 304) {
            return null;
        } else {
            if (f10 != 404) {
                D8.c cVar = this.f33263e;
                cVar.l("Failed to get the Contentsquare configuration from server: " + dVar.f() + " HTTP code.");
                return null;
            }
            D8.c cVar2 = this.f33263e;
            cVar2.h("Got HTTP_NOT_FOUND for endpoint " + str);
            D8.c cVar3 = this.f33263e;
            cVar3.k("Config for package name '" + str2 + "' could not be retrieved. A Contentsquare project mightnot have been created for you yet. Send your package name to your Contentsquare contact.");
            return null;
        }
    }

    public final void c(String str, String str2, C17631a<C16807N> aVar) {
        C17542s.j(str2, "packageName");
        C17542s.j(aVar, "onDownloadedCallback");
        String e10 = v.e(str2);
        F0 unused = C16314k.d(this.f33262d, (C17168i) null, (T) null, new a(this, e10, str, str2, aVar, (C17164e<? super a>) null), 3, (Object) null);
    }

    public c(b bVar, C8.a aVar, G8.a aVar2, M m10) {
        C17542s.j(bVar, "configuration");
        C17542s.j(aVar, "httpConnection");
        C17542s.j(aVar2, "buildConfig");
        C17542s.j(m10, "ioDispatcher");
        this.f33259a = bVar;
        this.f33260b = aVar;
        this.f33261c = aVar2;
        this.f33262d = S.i(S.a(m10), new P("ConfigurationDownloader"));
        this.f33263e = new D8.c("ConfigurationDownloader");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, C8.a aVar, G8.a aVar2, M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, aVar, aVar2, (i10 & 8) != 0 ? C16311i0.b() : m10);
    }
}
