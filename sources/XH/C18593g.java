package xH;

import AH.C15411b;
import AH.C15412c;
import AH.C15417h;
import BH.C15457b;
import BH.C15458c;
import BH.C15459d;
import BH.C15461f;
import EH.C15610O;
import EH.C15618c;
import EH.C15620e;
import EH.C15631p;
import HJ.C15838d;
import JH.C15954a;
import QJ.C16311i0;
import QJ.C16342y0;
import QJ.Q;
import QJ.T;
import RH.n;
import RH.w;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.q;
import pH.C17746a;
import qH.C17777b;
import vH.C18174m;
import yH.C18715e;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 ;2\u00020\u0001:\u0002*.BC\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0013J+\u0010&\u001a\u00020\u00112\n\u0010$\u001a\u00060\"j\u0002`#2\u0006\u0010\u0014\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R4\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00105\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"LxH/g;", "", "LxH/e;", "logger", "LxH/b;", "level", "", "Lkotlin/Function1;", "LAH/c;", "", "filters", "LxH/l;", "sanitizedHeaders", "<init>", "(LxH/e;LxH/b;Ljava/util/List;Ljava/util/List;)V", "LpH/a;", "client", "LXH/N;", "n", "(LpH/a;)V", "request", "LFH/d;", "j", "(LAH/c;LdI/e;)Ljava/lang/Object;", "content", "LxH/a;", "k", "(LFH/d;LxH/a;LdI/e;)Ljava/lang/Object;", "context", "", "cause", "l", "(LAH/c;Ljava/lang/Throwable;)V", "o", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "log", "LAH/b;", "m", "(Ljava/lang/StringBuilder;LAH/b;Ljava/lang/Throwable;)V", "p", "(LAH/c;)Z", "a", "LxH/e;", "getLogger", "()LxH/e;", "b", "LxH/b;", "i", "()LxH/b;", "setLevel", "(LxH/b;)V", "c", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "setFilters", "(Ljava/util/List;)V", "d", "e", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.g  reason: case insensitive filesystem */
public final class C18593g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f152217e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C15954a<C18593g> f152218f = new C15954a<>("ClientLogging");

    /* renamed from: a  reason: collision with root package name */
    private final C18591e f152219a;

    /* renamed from: b  reason: collision with root package name */
    private C18588b f152220b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends C17642l<? super C15412c, Boolean>> f152221c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final List<C18598l> f152222d;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LxH/g$a;", "LvH/m;", "LxH/g$b;", "LxH/g;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LxH/g;", "plugin", "LpH/a;", "scope", "c", "(LxH/g;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xH.g$a */
    public static final class a implements C18174m<b, C18593g> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18593g gVar, C17746a aVar) {
            C17542s.j(gVar, "plugin");
            C17542s.j(aVar, "scope");
            gVar.n(aVar);
            gVar.o(aVar);
        }

        /* renamed from: d */
        public C18593g a(C17642l<? super b, C16807N> lVar) {
            C17542s.j(lVar, "block");
            b bVar = new b();
            lVar.invoke(bVar);
            return new C18593g(bVar.c(), bVar.b(), bVar.a(), bVar.d(), (DefaultConstructorMarker) null);
        }

        public C15954a<C18593g> getKey() {
            return C18593g.f152218f;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R4\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\nR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00128F@FX\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LxH/g$b;", "", "<init>", "()V", "", "Lkotlin/Function1;", "LAH/c;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "setFilters$ktor_client_logging", "(Ljava/util/List;)V", "filters", "LxH/l;", "b", "d", "sanitizedHeaders", "LxH/e;", "c", "LxH/e;", "_logger", "LxH/b;", "LxH/b;", "()LxH/b;", "e", "(LxH/b;)V", "level", "value", "()LxH/e;", "f", "(LxH/e;)V", "logger", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xH.g$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private List<C17642l<C15412c, Boolean>> f152223a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<C18598l> f152224b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private C18591e f152225c;

        /* renamed from: d  reason: collision with root package name */
        private C18588b f152226d = C18588b.HEADERS;

        public final List<C17642l<C15412c, Boolean>> a() {
            return this.f152223a;
        }

        public final C18588b b() {
            return this.f152226d;
        }

        public final C18591e c() {
            C18591e eVar = this.f152225c;
            return eVar == null ? C18592f.c(C18591e.f152212a) : eVar;
        }

        public final List<C18598l> d() {
            return this.f152224b;
        }

        public final void e(C18588b bVar) {
            C17542s.j(bVar, "<set-?>");
            this.f152226d = bVar;
        }

        public final void f(C18591e eVar) {
            C17542s.j(eVar, "value");
            this.f152225c = eVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.logging.Logging$logRequestBody$2", f = "Logging.kt", l = {268}, m = "invokeSuspend")
    /* renamed from: xH.g$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f152227c;

        /* renamed from: d  reason: collision with root package name */
        int f152228d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f152229e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Charset f152230f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ StringBuilder f152231g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(io.ktor.utils.io.c cVar, Charset charset, StringBuilder sb2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f152229e = cVar;
            this.f152230f = charset;
            this.f152231g = sb2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f152229e, this.f152230f, this.f152231g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Charset charset;
            Object f10 = C17187b.f();
            int i10 = this.f152228d;
            String str = null;
            if (i10 == 0) {
                y.b(obj);
                io.ktor.utils.io.c cVar = this.f152229e;
                Charset charset2 = this.f152230f;
                this.f152227c = charset2;
                this.f152228d = 1;
                obj = g.b.a(cVar, 0, this, 1, (Object) null);
                if (obj == f10) {
                    return f10;
                }
                charset = charset2;
            } else if (i10 == 1) {
                charset = (Charset) this.f152227c;
                try {
                    y.b(obj);
                } catch (Throwable unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = w.e((n) obj, charset, 0, 2, (Object) null);
            if (str == null) {
                str = "[request body omitted]";
            }
            StringBuilder sb2 = this.f152231g;
            sb2.append("BODY START");
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            StringBuilder sb3 = this.f152231g;
            sb3.append(str);
            C17542s.i(sb3, "append(value)");
            sb3.append(10);
            C17542s.i(sb3, "append('\\n')");
            this.f152231g.append("BODY END");
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: xH.g$d */
    static final class d extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18587a f152232c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ StringBuilder f152233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18587a aVar, StringBuilder sb2) {
            super(1);
            this.f152232c = aVar;
            this.f152233d = sb2;
        }

        public final void a(Throwable th2) {
            C18587a aVar = this.f152232c;
            String sb2 = this.f152233d.toString();
            C17542s.i(sb2, "requestLog.toString()");
            aVar.c(sb2);
            this.f152232c.a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "it", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.logging.Logging$setupRequestLogging$1", f = "Logging.kt", l = {84, 90}, m = "invokeSuspend")
    /* renamed from: xH.g$e */
    static final class e extends l implements q<NH.e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f152234c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f152235d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18593g f152236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18593g gVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f152236e = gVar;
        }

        /* renamed from: i */
        public final Object invoke(NH.e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
            e eVar3 = new e(this.f152236e, eVar2);
            eVar3.f152235d = eVar;
            return eVar3.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: NH.e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f152234c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 == r3) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                java.lang.Object r0 = r5.f152235d
                NH.e r0 = (NH.e) r0
                XH.y.b(r6)     // Catch:{ all -> 0x0016 }
                goto L_0x007e
            L_0x0016:
                r6 = move-exception
                goto L_0x0081
            L_0x0018:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0020:
                java.lang.Object r1 = r5.f152235d
                NH.e r1 = (NH.e) r1
                XH.y.b(r6)     // Catch:{ all -> 0x0068 }
                goto L_0x0065
            L_0x0028:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f152235d
                r1 = r6
                NH.e r1 = (NH.e) r1
                xH.g r6 = r5.f152236e
                java.lang.Object r4 = r1.b()
                AH.c r4 = (AH.C15412c) r4
                boolean r6 = r6.p(r4)
                if (r6 != 0) goto L_0x0052
                java.lang.Object r6 = r1.b()
                AH.c r6 = (AH.C15412c) r6
                JH.b r6 = r6.c()
                JH.a r0 = xH.C18594h.f152252b
                XH.N r1 = XH.C16807N.f139792a
                r6.c(r0, r1)
                return r1
            L_0x0052:
                xH.g r6 = r5.f152236e     // Catch:{ all -> 0x0068 }
                java.lang.Object r4 = r1.b()     // Catch:{ all -> 0x0068 }
                AH.c r4 = (AH.C15412c) r4     // Catch:{ all -> 0x0068 }
                r5.f152235d = r1     // Catch:{ all -> 0x0068 }
                r5.f152234c = r3     // Catch:{ all -> 0x0068 }
                java.lang.Object r6 = r6.j(r4, r5)     // Catch:{ all -> 0x0068 }
                if (r6 != r0) goto L_0x0065
                return r0
            L_0x0065:
                FH.d r6 = (FH.d) r6     // Catch:{ all -> 0x0068 }
                goto L_0x0069
            L_0x0068:
                r6 = 0
            L_0x0069:
                if (r6 != 0) goto L_0x0073
                java.lang.Object r6 = r1.c()     // Catch:{ all -> 0x0070 }
                goto L_0x0073
            L_0x0070:
                r6 = move-exception
                r0 = r1
                goto L_0x0081
            L_0x0073:
                r5.f152235d = r1     // Catch:{ all -> 0x0070 }
                r5.f152234c = r2     // Catch:{ all -> 0x0070 }
                java.lang.Object r6 = r1.f(r6, r5)     // Catch:{ all -> 0x0070 }
                if (r6 != r0) goto L_0x007e
                return r0
            L_0x007e:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x0081:
                xH.g r1 = r5.f152236e
                java.lang.Object r0 = r0.b()
                AH.c r0 = (AH.C15412c) r0
                r1.l(r0, r6)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xH.C18593g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNH/e;", "LBH/c;", "LXH/N;", "response", "<anonymous>", "(LNH/e;LBH/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$1", f = "Logging.kt", l = {184, 191, 191}, m = "invokeSuspend")
    /* renamed from: xH.g$f */
    static final class f extends l implements q<NH.e<C15458c, C16807N>, C15458c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f152237c;

        /* renamed from: d  reason: collision with root package name */
        int f152238d;

        /* renamed from: e  reason: collision with root package name */
        int f152239e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f152240f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f152241g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C18593g f152242h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C18593g gVar, C17164e<? super f> eVar) {
            super(3, eVar);
            this.f152242h = gVar;
        }

        /* renamed from: i */
        public final Object invoke(NH.e<C15458c, C16807N> eVar, C15458c cVar, C17164e<? super C16807N> eVar2) {
            f fVar = new f(this.f152242h, eVar2);
            fVar.f152240f = eVar;
            fVar.f152241g = cVar;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: xH.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r13.f152239e
                java.lang.String r2 = "header.toString()"
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x003f
                if (r1 == r5) goto L_0x002a
                if (r1 == r4) goto L_0x0025
                if (r1 == r3) goto L_0x001c
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001c:
                java.lang.Object r0 = r13.f152240f
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                XH.y.b(r14)
                goto L_0x0112
            L_0x0025:
                XH.y.b(r14)
                goto L_0x00d5
            L_0x002a:
                int r1 = r13.f152238d
                java.lang.Object r7 = r13.f152237c
                java.lang.StringBuilder r7 = (java.lang.StringBuilder) r7
                java.lang.Object r8 = r13.f152241g
                xH.a r8 = (xH.C18587a) r8
                java.lang.Object r9 = r13.f152240f
                BH.c r9 = (BH.C15458c) r9
                XH.y.b(r14)     // Catch:{ all -> 0x003c }
                goto L_0x00ae
            L_0x003c:
                r14 = move-exception
                goto L_0x00d8
            L_0x003f:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f152240f
                NH.e r14 = (NH.e) r14
                java.lang.Object r1 = r13.f152241g
                r9 = r1
                BH.c r9 = (BH.C15458c) r9
                xH.g r1 = r13.f152242h
                xH.b r1 = r1.i()
                xH.b r7 = xH.C18588b.NONE
                if (r1 == r7) goto L_0x0114
                qH.b r1 = r9.h0()
                JH.b r1 = r1.getAttributes()
                JH.a r7 = xH.C18594h.f152252b
                boolean r1 = r1.f(r7)
                if (r1 == 0) goto L_0x0069
                goto L_0x0114
            L_0x0069:
                qH.b r1 = r9.h0()
                JH.b r1 = r1.getAttributes()
                JH.a r7 = xH.C18594h.f152251a
                java.lang.Object r1 = r1.a(r7)
                r8 = r1
                xH.a r8 = (xH.C18587a) r8
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r1 = 0
                qH.b r10 = r9.h0()     // Catch:{ all -> 0x003c }
                BH.c r10 = r10.f()     // Catch:{ all -> 0x003c }
                xH.g r11 = r13.f152242h     // Catch:{ all -> 0x003c }
                xH.b r11 = r11.i()     // Catch:{ all -> 0x003c }
                xH.g r12 = r13.f152242h     // Catch:{ all -> 0x003c }
                java.util.List r12 = r12.f152222d     // Catch:{ all -> 0x003c }
                xH.C18595i.d(r7, r10, r11, r12)     // Catch:{ all -> 0x003c }
                java.lang.Object r10 = r14.c()     // Catch:{ all -> 0x003c }
                r13.f152240f = r9     // Catch:{ all -> 0x003c }
                r13.f152241g = r8     // Catch:{ all -> 0x003c }
                r13.f152237c = r7     // Catch:{ all -> 0x003c }
                r13.f152238d = r1     // Catch:{ all -> 0x003c }
                r13.f152239e = r5     // Catch:{ all -> 0x003c }
                java.lang.Object r14 = r14.f(r10, r13)     // Catch:{ all -> 0x003c }
                if (r14 != r0) goto L_0x00ae
                return r0
            L_0x00ae:
                java.lang.String r14 = r7.toString()
                kotlin.jvm.internal.C17542s.i(r14, r2)
                r8.f(r14)
                if (r1 != 0) goto L_0x00c6
                xH.g r14 = r13.f152242h
                xH.b r14 = r14.i()
                boolean r14 = r14.b()
                if (r14 != 0) goto L_0x00d5
            L_0x00c6:
                r13.f152240f = r6
                r13.f152241g = r6
                r13.f152237c = r6
                r13.f152239e = r4
                java.lang.Object r14 = r8.b(r13)
                if (r14 != r0) goto L_0x00d5
                return r0
            L_0x00d5:
                XH.N r14 = XH.C16807N.f139792a
                return r14
            L_0x00d8:
                xH.g r4 = r13.f152242h     // Catch:{ all -> 0x00e8 }
                qH.b r9 = r9.h0()     // Catch:{ all -> 0x00e8 }
                AH.b r9 = r9.e()     // Catch:{ all -> 0x00e8 }
                r4.m(r7, r9, r14)     // Catch:{ all -> 0x00e8 }
                throw r14     // Catch:{ all -> 0x00e6 }
            L_0x00e6:
                r14 = move-exception
                goto L_0x00ea
            L_0x00e8:
                r14 = move-exception
                r5 = r1
            L_0x00ea:
                java.lang.String r1 = r7.toString()
                kotlin.jvm.internal.C17542s.i(r1, r2)
                r8.f(r1)
                if (r5 != 0) goto L_0x0102
                xH.g r1 = r13.f152242h
                xH.b r1 = r1.i()
                boolean r1 = r1.b()
                if (r1 != 0) goto L_0x0113
            L_0x0102:
                r13.f152240f = r14
                r13.f152241g = r6
                r13.f152237c = r6
                r13.f152239e = r3
                java.lang.Object r1 = r8.b(r13)
                if (r1 != r0) goto L_0x0111
                return r0
            L_0x0111:
                r0 = r14
            L_0x0112:
                r14 = r0
            L_0x0113:
                throw r14
            L_0x0114:
                XH.N r14 = XH.C16807N.f139792a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xH.C18593g.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "it", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$2", f = "Logging.kt", l = {201, 206, 207}, m = "invokeSuspend")
    /* renamed from: xH.g$g  reason: collision with other inner class name */
    static final class C4324g extends l implements q<NH.e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f152243c;

        /* renamed from: d  reason: collision with root package name */
        int f152244d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f152245e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18593g f152246f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4324g(C18593g gVar, C17164e<? super C4324g> eVar) {
            super(3, eVar);
            this.f152246f = gVar;
        }

        /* renamed from: i */
        public final Object invoke(NH.e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
            C4324g gVar = new C4324g(this.f152246f, eVar2);
            gVar.f152245e = eVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            C18587a aVar;
            NH.e eVar;
            Object f10 = C17187b.f();
            int i10 = this.f152244d;
            if (i10 == 0) {
                y.b(obj);
                eVar = (NH.e) this.f152245e;
                if (this.f152246f.i() == C18588b.NONE || ((C17777b) eVar.b()).getAttributes().f(C18594h.f152252b)) {
                    return C16807N.f139792a;
                }
                this.f152245e = eVar;
                this.f152244d = 1;
                if (eVar.e(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                eVar = (NH.e) this.f152245e;
                try {
                    y.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    StringBuilder sb2 = new StringBuilder();
                    C18587a aVar2 = (C18587a) ((C17777b) eVar.b()).getAttributes().a(C18594h.f152251a);
                    this.f152246f.m(sb2, ((C17777b) eVar.b()).e(), th);
                    String sb3 = sb2.toString();
                    C17542s.i(sb3, "log.toString()");
                    this.f152245e = th;
                    this.f152243c = aVar2;
                    this.f152244d = 2;
                    if (aVar2.e(sb3, this) == f10) {
                        return f10;
                    }
                    aVar = aVar2;
                }
            } else if (i10 == 2) {
                aVar = (C18587a) this.f152243c;
                y.b(obj);
                th = (Throwable) this.f152245e;
                this.f152245e = th;
                this.f152243c = null;
                this.f152244d = 3;
                if (aVar.b(this) == f10) {
                    return f10;
                }
                th2 = th;
                throw th2;
            } else if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                th2 = (Throwable) this.f152245e;
                y.b(obj);
                throw th2;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBH/c;", "it", "LXH/N;", "<anonymous>", "(LBH/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1", f = "Logging.kt", l = {222, 225, 226, 225, 226, 225, 226}, m = "invokeSuspend")
    /* renamed from: xH.g$h */
    static final class h extends l implements p<C15458c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f152247c;

        /* renamed from: d  reason: collision with root package name */
        int f152248d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152249e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18593g f152250f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C18593g gVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f152250f = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f152250f, eVar);
            hVar.f152249e = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(C15458c cVar, C17164e<? super C16807N> eVar) {
            return ((h) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
            r9 = r4.toString();
            kotlin.jvm.internal.C17542s.i(r9, "log.toString()");
            r9 = HJ.C15854t.z1(r9).toString();
            r8.f152249e = r1;
            r8.f152247c = null;
            r8.f152248d = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ce, code lost:
            if (r1.d(r9, r8) != r0) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
            r8.f152249e = null;
            r8.f152248d = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
            if (r1.b(r8) != r0) goto L_0x0106;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0105 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r8.f152248d
                java.lang.String r2 = "log.toString()"
                r3 = 0
                switch(r1) {
                    case 0: goto L_0x0062;
                    case 1: goto L_0x004e;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0040;
                    case 4: goto L_0x0037;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x001c;
                    case 7: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0014:
                java.lang.Object r0 = r8.f152249e
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                XH.y.b(r9)
                goto L_0x0036
            L_0x001c:
                java.lang.Object r1 = r8.f152247c
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r2 = r8.f152249e
                xH.a r2 = (xH.C18587a) r2
                XH.y.b(r9)
                r8.f152249e = r1
                r8.f152247c = r3
                r9 = 7
                r8.f152248d = r9
                java.lang.Object r9 = r2.b(r8)
                if (r9 != r0) goto L_0x0035
                return r0
            L_0x0035:
                r0 = r1
            L_0x0036:
                throw r0
            L_0x0037:
                java.lang.Object r1 = r8.f152249e
                xH.a r1 = (xH.C18587a) r1
                XH.y.b(r9)
                goto L_0x00fa
            L_0x0040:
                XH.y.b(r9)
                goto L_0x0106
            L_0x0045:
                java.lang.Object r1 = r8.f152249e
                xH.a r1 = (xH.C18587a) r1
                XH.y.b(r9)
                goto L_0x00d1
            L_0x004e:
                java.lang.Object r1 = r8.f152247c
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.Object r4 = r8.f152249e
                xH.a r4 = (xH.C18587a) r4
                XH.y.b(r9)     // Catch:{ all -> 0x005d }
                r7 = r4
                r4 = r1
                r1 = r7
                goto L_0x00b4
            L_0x005d:
                r7 = r4
                r4 = r1
                r1 = r7
                goto L_0x00dd
            L_0x0062:
                XH.y.b(r9)
                java.lang.Object r9 = r8.f152249e
                BH.c r9 = (BH.C15458c) r9
                xH.g r1 = r8.f152250f
                xH.b r1 = r1.i()
                xH.b r4 = xH.C18588b.NONE
                if (r1 == r4) goto L_0x0109
                qH.b r1 = r9.h0()
                JH.b r1 = r1.getAttributes()
                JH.a r4 = xH.C18594h.f152252b
                boolean r1 = r1.f(r4)
                if (r1 == 0) goto L_0x0087
                goto L_0x0109
            L_0x0087:
                qH.b r1 = r9.h0()
                JH.b r1 = r1.getAttributes()
                JH.a r4 = xH.C18594h.f152251a
                java.lang.Object r1 = r1.a(r4)
                xH.a r1 = (xH.C18587a) r1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                EH.c r5 = EH.C15635t.c(r9)     // Catch:{ all -> 0x00dd }
                io.ktor.utils.io.g r9 = r9.b()     // Catch:{ all -> 0x00dd }
                r8.f152249e = r1     // Catch:{ all -> 0x00dd }
                r8.f152247c = r4     // Catch:{ all -> 0x00dd }
                r6 = 1
                r8.f152248d = r6     // Catch:{ all -> 0x00dd }
                java.lang.Object r9 = xH.C18595i.c(r4, r5, r9, r8)     // Catch:{ all -> 0x00dd }
                if (r9 != r0) goto L_0x00b4
                return r0
            L_0x00b4:
                java.lang.String r9 = r4.toString()
                kotlin.jvm.internal.C17542s.i(r9, r2)
                java.lang.CharSequence r9 = HJ.C15854t.z1(r9)
                java.lang.String r9 = r9.toString()
                r8.f152249e = r1
                r8.f152247c = r3
                r2 = 2
                r8.f152248d = r2
                java.lang.Object r9 = r1.d(r9, r8)
                if (r9 != r0) goto L_0x00d1
                return r0
            L_0x00d1:
                r8.f152249e = r3
                r9 = 3
                r8.f152248d = r9
                java.lang.Object r9 = r1.b(r8)
                if (r9 != r0) goto L_0x0106
                return r0
            L_0x00dd:
                java.lang.String r9 = r4.toString()
                kotlin.jvm.internal.C17542s.i(r9, r2)
                java.lang.CharSequence r9 = HJ.C15854t.z1(r9)
                java.lang.String r9 = r9.toString()
                r8.f152249e = r1
                r8.f152247c = r3
                r2 = 4
                r8.f152248d = r2
                java.lang.Object r9 = r1.d(r9, r8)
                if (r9 != r0) goto L_0x00fa
                return r0
            L_0x00fa:
                r8.f152249e = r3
                r9 = 5
                r8.f152248d = r9
                java.lang.Object r9 = r1.b(r8)
                if (r9 != r0) goto L_0x0106
                return r0
            L_0x0106:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            L_0x0109:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: xH.C18593g.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ C18593g(C18591e eVar, C18588b bVar, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, bVar, list, list2);
    }

    /* access modifiers changed from: private */
    public final Object j(C15412c cVar, C17164e<? super FH.d> eVar) {
        Object obj;
        Object obj2;
        Object d10 = cVar.d();
        C17542s.h(d10, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        FH.d dVar = (FH.d) d10;
        C18587a aVar = new C18587a(this.f152219a);
        cVar.c().c(C18594h.f152251a, aVar);
        StringBuilder sb2 = new StringBuilder();
        if (this.f152220b.m()) {
            sb2.append("REQUEST: " + C15610O.c(cVar.i()));
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            sb2.append("METHOD: " + cVar.h());
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
        }
        if (this.f152220b.j()) {
            sb2.append("COMMON HEADERS");
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            C18595i.b(sb2, cVar.a().a(), this.f152222d);
            sb2.append("CONTENT HEADERS");
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            Iterator it = this.f152222d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C18598l) obj).b().invoke(C15631p.f134088a.g()).booleanValue()) {
                    break;
                }
            }
            C18598l lVar = (C18598l) obj;
            String a10 = lVar != null ? lVar.a() : null;
            Iterator it2 = this.f152222d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C18598l) obj2).b().invoke(C15631p.f134088a.h()).booleanValue()) {
                    break;
                }
            }
            C18598l lVar2 = (C18598l) obj2;
            String a11 = lVar2 != null ? lVar2.a() : null;
            Long a12 = dVar.a();
            if (a12 != null) {
                long longValue = a12.longValue();
                String g10 = C15631p.f134088a.g();
                if (a10 == null) {
                    a10 = String.valueOf(longValue);
                }
                C18595i.a(sb2, g10, a10);
            }
            C15618c b10 = dVar.b();
            if (b10 != null) {
                String h10 = C15631p.f134088a.h();
                if (a11 == null) {
                    a11 = b10.toString();
                }
                C18595i.a(sb2, h10, a11);
            }
            C18595i.b(sb2, dVar.c().a(), this.f152222d);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        if (sb3.length() > 0) {
            aVar.c(sb3);
        }
        if (sb3.length() != 0 && this.f152220b.b()) {
            return k(dVar, aVar, eVar);
        }
        aVar.a();
        return null;
    }

    private final Object k(FH.d dVar, C18587a aVar, C17164e<? super FH.d> eVar) {
        Charset charset;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BODY Content-Type: " + dVar.b());
        C17542s.i(sb2, "append(value)");
        sb2.append(10);
        C17542s.i(sb2, "append('\\n')");
        C15618c b10 = dVar.b();
        if (b10 == null || (charset = C15620e.a(b10)) == null) {
            charset = C15838d.f135279b;
        }
        io.ktor.utils.io.c b11 = io.ktor.utils.io.e.b(false, 1, (Object) null);
        C16314k.d(C16342y0.f137687a, C16311i0.d(), (T) null, new c(b11, charset, sb2, (C17164e<? super c>) null), 2, (Object) null).s(new d(aVar, sb2));
        return C18597k.a(dVar, b11, eVar);
    }

    /* access modifiers changed from: private */
    public final void l(C15412c cVar, Throwable th2) {
        if (this.f152220b.m()) {
            C18591e eVar = this.f152219a;
            eVar.log("REQUEST " + C15610O.c(cVar.i()) + " failed with exception: " + th2);
        }
    }

    /* access modifiers changed from: private */
    public final void m(StringBuilder sb2, C15411b bVar, Throwable th2) {
        if (this.f152220b.m()) {
            sb2.append("RESPONSE " + bVar.getUrl() + " failed with exception: " + th2);
        }
    }

    /* access modifiers changed from: private */
    public final void n(C17746a aVar) {
        aVar.n().l(C15417h.f132967h.b(), new e(this, (C17164e<? super e>) null));
    }

    /* access modifiers changed from: private */
    public final void o(C17746a aVar) {
        aVar.h().l(C15457b.f133235h.b(), new f(this, (C17164e<? super f>) null));
        aVar.l().l(C15461f.f133245h.b(), new C4324g(this, (C17164e<? super C4324g>) null));
        if (this.f152220b.b()) {
            C18715e.f152688c.b(new C18715e(new h(this, (C17164e<? super h>) null), (C17642l) null, 2, (DefaultConstructorMarker) null), aVar);
        }
    }

    /* access modifiers changed from: private */
    public final boolean p(C15412c cVar) {
        if (!this.f152221c.isEmpty()) {
            Iterable<C17642l> iterable = this.f152221c;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C17642l invoke : iterable) {
                    if (((Boolean) invoke.invoke(cVar)).booleanValue()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C18588b i() {
        return this.f152220b;
    }

    private C18593g(C18591e eVar, C18588b bVar, List<? extends C17642l<? super C15412c, Boolean>> list, List<C18598l> list2) {
        this.f152219a = eVar;
        this.f152220b = bVar;
        this.f152221c = list;
        this.f152222d = list2;
    }
}
