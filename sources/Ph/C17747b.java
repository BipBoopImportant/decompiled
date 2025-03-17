package pH;

import JH.C15954a;
import JH.C15955b;
import JH.t;
import XH.C16807N;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import sH.C17903g;
import vH.C18174m;
import vH.C18175n;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\r\u001a\u00020\u000b\"\b\b\u0001\u0010\u0006*\u00020\u0003\"\b\b\u0002\u0010\u0007*\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR0\u0010!\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\n0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR.\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00105\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\b$\u0010-\"\u0004\b4\u0010/R\"\u00107\u001a\u00020*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b \u0010-\"\u0004\b6\u0010/¨\u00068"}, d2 = {"LpH/b;", "LsH/g;", "T", "", "<init>", "()V", "TBuilder", "TPlugin", "LvH/m;", "plugin", "Lkotlin/Function1;", "LXH/N;", "configure", "i", "(LvH/m;LnI/l;)V", "", "key", "LpH/a;", "block", "g", "(Ljava/lang/String;LnI/l;)V", "client", "h", "(LpH/a;)V", "other", "k", "(LpH/b;)V", "", "LJH/a;", "a", "Ljava/util/Map;", "plugins", "b", "pluginConfigurations", "c", "customInterceptors", "d", "LnI/l;", "()LnI/l;", "setEngineConfig$ktor_client_core", "(LnI/l;)V", "engineConfig", "", "e", "Z", "()Z", "setFollowRedirects", "(Z)V", "followRedirects", "f", "setUseDefaultTransformers", "useDefaultTransformers", "l", "expectSuccess", "setDevelopmentMode", "developmentMode", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: pH.b  reason: case insensitive filesystem */
public final class C17747b<T extends C17903g> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C15954a<?>, C17642l<C17746a, C16807N>> f146321a = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<C15954a<?>, C17642l<Object, C16807N>> f146322b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, C17642l<C17746a, C16807N>> f146323c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private C17642l<? super T, C16807N> f146324d = a.f146329c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f146325e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f146326f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f146327g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f146328h = t.f135734a.b();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsH/g;", "T", "LXH/N;", "a", "(LsH/g;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.b$a */
    static final class a extends C17544u implements C17642l<T, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f146329c = new a();

        a() {
            super(1);
        }

        public final void a(T t10) {
            C17542s.j(t10, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17903g) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "LsH/g;", "T", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.b$b  reason: collision with other inner class name */
    static final class C4257b extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final C4257b f146330c = new C4257b();

        C4257b() {
            super(1);
        }

        public final void a(Object obj) {
            C17542s.j(obj, "$this$null");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "LsH/g;", "T", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.b$c */
    static final class c extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f146331c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<TBuilder, C16807N> f146332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<Object, C16807N> lVar, C17642l<? super TBuilder, C16807N> lVar2) {
            super(1);
            this.f146331c = lVar;
            this.f146332d = lVar2;
        }

        public final void a(Object obj) {
            C17542s.j(obj, "$this$null");
            C17642l<Object, C16807N> lVar = this.f146331c;
            if (lVar != null) {
                lVar.invoke(obj);
            }
            this.f146332d.invoke(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "TBuilder", "TPlugin", "LsH/g;", "T", "LpH/a;", "scope", "LXH/N;", "a", "(LpH/a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.b$d */
    static final class d extends C17544u implements C17642l<C17746a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18174m<TBuilder, TPlugin> f146333c;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "TBuilder", "TPlugin", "LsH/g;", "T", "LJH/b;", "b", "()LJH/b;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: pH.b$d$a */
        static final class a extends C17544u implements C17631a<C15955b> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f146334c = new a();

            a() {
                super(0);
            }

            /* renamed from: b */
            public final C15955b invoke() {
                return JH.d.a(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18174m<? extends TBuilder, TPlugin> mVar) {
            super(1);
            this.f146333c = mVar;
        }

        public final void a(C17746a aVar) {
            C17542s.j(aVar, "scope");
            Object obj = aVar.e().f146322b.get(this.f146333c.getKey());
            C17542s.g(obj);
            TPlugin a10 = this.f146333c.a((C17642l) obj);
            this.f146333c.b(a10, aVar);
            ((C15955b) aVar.getAttributes().b(C18175n.a(), a.f146334c)).c(this.f146333c.getKey(), a10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17746a) obj);
            return C16807N.f139792a;
        }
    }

    public static /* synthetic */ void j(C17747b bVar, C18174m mVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C4257b.f146330c;
        }
        bVar.i(mVar, lVar);
    }

    public final boolean b() {
        return this.f146328h;
    }

    public final C17642l<T, C16807N> c() {
        return this.f146324d;
    }

    public final boolean d() {
        return this.f146327g;
    }

    public final boolean e() {
        return this.f146325e;
    }

    public final boolean f() {
        return this.f146326f;
    }

    public final void g(String str, C17642l<? super C17746a, C16807N> lVar) {
        C17542s.j(str, "key");
        C17542s.j(lVar, "block");
        this.f146323c.put(str, lVar);
    }

    public final void h(C17746a aVar) {
        C17542s.j(aVar, "client");
        for (C17642l invoke : this.f146321a.values()) {
            invoke.invoke(aVar);
        }
        for (C17642l invoke2 : this.f146323c.values()) {
            invoke2.invoke(aVar);
        }
    }

    public final <TBuilder, TPlugin> void i(C18174m<? extends TBuilder, TPlugin> mVar, C17642l<? super TBuilder, C16807N> lVar) {
        C17542s.j(mVar, "plugin");
        C17542s.j(lVar, "configure");
        this.f146322b.put(mVar.getKey(), new c(this.f146322b.get(mVar.getKey()), lVar));
        if (!this.f146321a.containsKey(mVar.getKey())) {
            this.f146321a.put(mVar.getKey(), new d(mVar));
        }
    }

    public final void k(C17747b<? extends T> bVar) {
        C17542s.j(bVar, "other");
        this.f146325e = bVar.f146325e;
        this.f146326f = bVar.f146326f;
        this.f146327g = bVar.f146327g;
        this.f146321a.putAll(bVar.f146321a);
        this.f146322b.putAll(bVar.f146322b);
        this.f146323c.putAll(bVar.f146323c);
    }

    public final void l(boolean z10) {
        this.f146327g = z10;
    }
}
