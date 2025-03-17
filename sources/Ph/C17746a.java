package pH;

import AH.C15412c;
import AH.C15415f;
import AH.C15417h;
import BH.C15457b;
import BH.C15458c;
import BH.C15459d;
import BH.C15461f;
import CH.C15490b;
import DH.C15529b;
import JH.C15954a;
import JH.C15955b;
import QJ.C16283A;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.S;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.q;
import qH.C17777b;
import sH.C17898b;
import sH.C17903g;
import vH.C18162a;
import vH.C18167f;
import vH.C18168g;
import vH.C18172k;
import vH.C18175n;
import vH.C18176o;
import vH.C18178q;
import vH.C18180s;
import vH.C18183v;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010.\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010>\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\b6\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010I\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010M\u001a\u00020J8\u0006¢\u0006\f\n\u0004\b2\u0010K\u001a\u0004\b0\u0010LR \u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010\u001e\u001a\u0004\b%\u0010O\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"LpH/a;", "LQJ/Q;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "LsH/b;", "engine", "LpH/b;", "LsH/g;", "userConfig", "<init>", "(LsH/b;LpH/b;)V", "", "manageEngine", "(LsH/b;LpH/b;Z)V", "LAH/c;", "builder", "LqH/b;", "c", "(LAH/c;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "LsH/b;", "f", "()LsH/b;", "b", "LpH/b;", "Z", "LQJ/A;", "d", "LQJ/A;", "clientJob", "LdI/i;", "e", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "LAH/f;", "LAH/f;", "i", "()LAH/f;", "requestPipeline", "LBH/f;", "g", "LBH/f;", "l", "()LBH/f;", "responsePipeline", "LAH/h;", "h", "LAH/h;", "n", "()LAH/h;", "sendPipeline", "LBH/b;", "LBH/b;", "()LBH/b;", "receivePipeline", "LJH/b;", "j", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "k", "LsH/g;", "getEngineConfig", "()LsH/g;", "engineConfig", "LDH/b;", "LDH/b;", "()LDH/b;", "monitor", "m", "()LpH/b;", "config", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: pH.a  reason: case insensitive filesystem */
public final class C17746a implements Q, Closeable {

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f146295n = AtomicIntegerFieldUpdater.newUpdater(C17746a.class, "closed");

    /* renamed from: a  reason: collision with root package name */
    private final C17898b f146296a;

    /* renamed from: b  reason: collision with root package name */
    private final C17747b<? extends C17903g> f146297b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f146298c;
    private volatile /* synthetic */ int closed;

    /* renamed from: d  reason: collision with root package name */
    private final C16283A f146299d;

    /* renamed from: e  reason: collision with root package name */
    private final C17168i f146300e;

    /* renamed from: f  reason: collision with root package name */
    private final C15415f f146301f;

    /* renamed from: g  reason: collision with root package name */
    private final C15461f f146302g;

    /* renamed from: h  reason: collision with root package name */
    private final C15417h f146303h;

    /* renamed from: i  reason: collision with root package name */
    private final C15457b f146304i;

    /* renamed from: j  reason: collision with root package name */
    private final C15955b f146305j;

    /* renamed from: k  reason: collision with root package name */
    private final C17903g f146306k;

    /* renamed from: l  reason: collision with root package name */
    private final C15529b f146307l;

    /* renamed from: m  reason: collision with root package name */
    private final C17747b<C17903g> f146308m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.a$a  reason: collision with other inner class name */
    static final class C4256a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17746a f146309c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4256a(C17746a aVar) {
            super(1);
            this.f146309c = aVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                S.e(this.f146309c.f(), (CancellationException) null, 1, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "call", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.HttpClient$2", f = "HttpClient.kt", l = {144, 146}, m = "invokeSuspend")
    /* renamed from: pH.a$b */
    static final class b extends l implements q<NH.e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146310c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f146311d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f146312e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17746a f146313f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17746a aVar, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f146313f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(NH.e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
            b bVar = new b(this.f146313f, eVar2);
            bVar.f146311d = eVar;
            bVar.f146312e = obj;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            NH.e eVar;
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f146310c;
            if (i10 == 0) {
                y.b(obj);
                NH.e eVar2 = (NH.e) this.f146311d;
                obj2 = this.f146312e;
                if (obj2 instanceof C17777b) {
                    C15457b h10 = this.f146313f.h();
                    C16807N n10 = C16807N.f139792a;
                    C15458c f11 = ((C17777b) obj2).f();
                    this.f146311d = eVar2;
                    this.f146312e = obj2;
                    this.f146310c = 1;
                    Object d10 = h10.d(n10, f11, this);
                    if (d10 == f10) {
                        return f10;
                    }
                    Object obj3 = d10;
                    eVar = eVar2;
                    obj = obj3;
                } else {
                    throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + P.b(obj2.getClass()) + ").").toString());
                }
            } else if (i10 == 1) {
                obj2 = this.f146312e;
                eVar = (NH.e) this.f146311d;
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ((C17777b) obj2).k((C15458c) obj);
            this.f146311d = null;
            this.f146312e = null;
            this.f146310c = 2;
            if (eVar.f(obj2, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LpH/a;", "LXH/N;", "a", "(LpH/a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: pH.a$c */
    static final class c extends C17544u implements C17642l<C17746a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f146314c = new c();

        c() {
            super(1);
        }

        public final void a(C17746a aVar) {
            C17542s.j(aVar, "$this$install");
            C18168g.b(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C17746a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "it", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: pH.a$d */
    static final class d extends l implements q<NH.e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146315c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f146316d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17746a f146317e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17746a aVar, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f146317e = aVar;
        }

        /* renamed from: i */
        public final Object invoke(NH.e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
            d dVar2 = new d(this.f146317e, eVar2);
            dVar2.f146316d = eVar;
            return dVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            NH.e eVar;
            Object f10 = C17187b.f();
            int i10 = this.f146315c;
            if (i10 == 0) {
                y.b(obj);
                NH.e eVar2 = (NH.e) this.f146316d;
                try {
                    this.f146316d = eVar2;
                    this.f146315c = 1;
                    if (eVar2.e(this) == f10) {
                        return f10;
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    eVar = eVar2;
                    th2 = th4;
                    this.f146317e.g().a(C15490b.d(), new CH.f(((C17777b) eVar.b()).f(), th2));
                    throw th2;
                }
            } else if (i10 == 1) {
                eVar = (NH.e) this.f146316d;
                try {
                    y.b(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", l = {191}, m = "execute$ktor_client_core")
    /* renamed from: pH.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f146318c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17746a f146319d;

        /* renamed from: e  reason: collision with root package name */
        int f146320e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17746a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f146319d = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146318c = obj;
            this.f146320e |= Integer.MIN_VALUE;
            return this.f146319d.c((C15412c) null, this);
        }
    }

    public C17746a(C17898b bVar, C17747b<? extends C17903g> bVar2) {
        C17542s.j(bVar, "engine");
        C17542s.j(bVar2, "userConfig");
        this.f146296a = bVar;
        this.f146297b = bVar2;
        this.closed = 0;
        C16283A a10 = I0.a((F0) bVar.getCoroutineContext().get(F0.f137562d0));
        this.f146299d = a10;
        this.f146300e = bVar.getCoroutineContext().plus(a10);
        this.f146301f = new C15415f(bVar2.b());
        C15461f fVar = new C15461f(bVar2.b());
        this.f146302g = fVar;
        C15417h hVar = new C15417h(bVar2.b());
        this.f146303h = hVar;
        this.f146304i = new C15457b(bVar2.b());
        this.f146305j = JH.d.a(true);
        this.f146306k = bVar.getConfig();
        this.f146307l = new C15529b();
        C17747b<C17903g> bVar3 = new C17747b<>();
        this.f146308m = bVar3;
        if (this.f146298c) {
            a10.s(new C4256a(this));
        }
        bVar.a2(this);
        hVar.l(C15417h.f132967h.c(), new b(this, (C17164e<? super b>) null));
        C17747b.j(bVar3, C18180s.f148987a, (C17642l) null, 2, (Object) null);
        C17747b.j(bVar3, C18162a.f148845a, (C17642l) null, 2, (Object) null);
        if (bVar2.f()) {
            bVar3.g("DefaultTransformers", c.f146314c);
        }
        C17747b.j(bVar3, C18183v.f148995c, (C17642l) null, 2, (Object) null);
        C17747b.j(bVar3, C18172k.f148902d, (C17642l) null, 2, (Object) null);
        if (bVar2.e()) {
            C17747b.j(bVar3, C18178q.f148960c, (C17642l) null, 2, (Object) null);
        }
        bVar3.k(bVar2);
        if (bVar2.f()) {
            C17747b.j(bVar3, C18176o.f148942d, (C17642l) null, 2, (Object) null);
        }
        C18167f.c(bVar3);
        bVar3.h(this);
        fVar.l(C15461f.f133245h.b(), new d(this, (C17164e<? super d>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(AH.C15412c r5, dI.C17164e<? super qH.C17777b> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof pH.C17746a.e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            pH.a$e r0 = (pH.C17746a.e) r0
            int r1 = r0.f146320e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146320e = r1
            goto L_0x0018
        L_0x0013:
            pH.a$e r0 = new pH.a$e
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f146318c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f146320e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r6)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            XH.y.b(r6)
            DH.b r6 = r4.f146307l
            DH.a r2 = CH.C15490b.a()
            r6.a(r2, r5)
            AH.f r6 = r4.f146301f
            java.lang.Object r2 = r5.d()
            r0.f146320e = r3
            java.lang.Object r6 = r6.d(r5, r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.C17542s.h(r6, r5)
            qH.b r6 = (qH.C17777b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pH.C17746a.c(AH.c, dI.e):java.lang.Object");
    }

    public void close() {
        if (f146295n.compareAndSet(this, 0, 1)) {
            C15955b bVar = (C15955b) this.f146305j.a(C18175n.a());
            for (C15954a aVar : bVar.g()) {
                C17542s.h(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object a10 = bVar.a(aVar);
                if (a10 instanceof Closeable) {
                    ((Closeable) a10).close();
                }
            }
            this.f146299d.l();
            if (this.f146298c) {
                this.f146296a.close();
            }
        }
    }

    public final C17747b<C17903g> e() {
        return this.f146308m;
    }

    public final C17898b f() {
        return this.f146296a;
    }

    public final C15529b g() {
        return this.f146307l;
    }

    public final C15955b getAttributes() {
        return this.f146305j;
    }

    public C17168i getCoroutineContext() {
        return this.f146300e;
    }

    public final C15457b h() {
        return this.f146304i;
    }

    public final C15415f i() {
        return this.f146301f;
    }

    public final C15461f l() {
        return this.f146302g;
    }

    public final C15417h n() {
        return this.f146303h;
    }

    public String toString() {
        return "HttpClient[" + this.f146296a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17746a(C17898b bVar, C17747b<? extends C17903g> bVar2, boolean z10) {
        this(bVar, bVar2);
        C17542s.j(bVar, "engine");
        C17542s.j(bVar2, "userConfig");
        this.f146298c = z10;
    }
}
