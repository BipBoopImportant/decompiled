package uv;

import HJ.C15854t;
import QJ.C16311i0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.mcomsettings.impl.network.a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import sv.C11892a;
import tw.g;
import uf.C10271a;
import vv.C12268a;
import vv.C12270c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\fR\u0014\u0010\"\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006#"}, d2 = {"Luv/a;", "Lsv/a;", "Lvv/a;", "configDao", "Ltw/g;", "networkParameters", "Lcom/ingka/ikea/mcomsettings/impl/network/a;", "mComConfigRemoteDataSource", "<init>", "(Lvv/a;Ltw/g;Lcom/ingka/ikea/mcomsettings/impl/network/a;)V", "LXH/N;", "d", "()V", "", "fetchConfig", "LTJ/g;", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "a", "(Z)LTJ/g;", "Lvv/a;", "b", "Ltw/g;", "c", "Lcom/ingka/ikea/mcomsettings/impl/network/a;", "LTJ/B;", "Luf/a;", "LTJ/B;", "languageConfigFlow", "e", "LTJ/g;", "getConfigFlow$annotations", "configFlow", "LQJ/Q;", "()LQJ/Q;", "coroutineScope", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.a  reason: case insensitive filesystem */
public final class C12126a implements C11892a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C12268a f104432a;

    /* renamed from: b  reason: collision with root package name */
    private final g f104433b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final a f104434c;

    /* renamed from: d  reason: collision with root package name */
    private final C16505B<C10271a> f104435d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<MComConfig> f104436e;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"uv/a$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.a$a  reason: collision with other inner class name */
    public static final class C2485a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12126a f104437a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2485a(N.a aVar, C12126a aVar2) {
            super(aVar);
            this.f104437a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C12126a aVar = this.f104437a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Problem getting MComConfig", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.mcomsettings.impl.MComConfigRepository$fetchRemoteConfig$2", f = "MComConfigRepository.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: uv.a$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104438c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12126a f104439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12126a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f104439d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f104439d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104438c;
            if (i10 == 0) {
                y.b(obj);
                a c10 = this.f104439d.f104434c;
                this.f104438c = 1;
                obj = c10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f104439d.f104432a.b((C12270c) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.mcomsettings.impl.MComConfigRepository$special$$inlined$flatMapLatest$1", f = "MComConfigRepository.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: uv.a$c */
    public static final class c extends l implements q<C16533h<? super C12270c>, C10271a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104440c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f104441d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f104442e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12126a f104443f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, C12126a aVar) {
            super(3, eVar);
            this.f104443f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12270c> hVar, C10271a aVar, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar, this.f104443f);
            cVar.f104441d = hVar;
            cVar.f104442e = aVar;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104440c;
            if (i10 == 0) {
                y.b(obj);
                C10271a aVar = (C10271a) this.f104442e;
                C16532g<C12270c> a10 = this.f104443f.f104432a.a(aVar.a(), aVar.b());
                this.f104440c = 1;
                if (C16534i.x((C16533h) this.f104441d, a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.a$d */
    public static final class d implements C16532g<MComConfig> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f104444a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uv.a$d$a  reason: collision with other inner class name */
        public static final class C2486a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f104445a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.mcomsettings.impl.MComConfigRepository$special$$inlined$map$1$2", f = "MComConfigRepository.kt", l = {50}, m = "emit")
            /* renamed from: uv.a$d$a$a  reason: collision with other inner class name */
            public static final class C2487a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f104446c;

                /* renamed from: d  reason: collision with root package name */
                int f104447d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2486a f104448e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2487a(C2486a aVar, C17164e eVar) {
                    super(eVar);
                    this.f104448e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f104446c = obj;
                    this.f104447d |= Integer.MIN_VALUE;
                    return this.f104448e.emit((Object) null, this);
                }
            }

            public C2486a(C16533h hVar) {
                this.f104445a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uv.C12126a.d.C2486a.C2487a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uv.a$d$a$a r0 = (uv.C12126a.d.C2486a.C2487a) r0
                    int r1 = r0.f104447d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f104447d = r1
                    goto L_0x0018
                L_0x0013:
                    uv.a$d$a$a r0 = new uv.a$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f104446c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f104447d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f104445a
                    vv.c r5 = (vv.C12270c) r5
                    if (r5 == 0) goto L_0x003f
                    com.ingka.ikea.mcomsettings.MComConfig r5 = vv.C12271d.a(r5)
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f104447d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uv.C12126a.d.C2486a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f104444a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f104444a.collect(new C2486a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C12126a(C12268a aVar, g gVar, a aVar2) {
        C17542s.j(aVar, "configDao");
        C17542s.j(gVar, "networkParameters");
        C17542s.j(aVar2, "mComConfigRemoteDataSource");
        this.f104432a = aVar;
        this.f104433b = gVar;
        this.f104434c = aVar2;
        C16505B<C10271a> a10 = C16521S.a(new C10271a(gVar.i(), gVar.a()));
        this.f104435d = a10;
        this.f104436e = new d(C16534i.g0(a10, new c((C17164e) null, this)));
    }

    private final void d() {
        F0 unused = C16314k.d(e(), new C2485a(N.f137593c0, this), (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
    }

    private final Q e() {
        return S.a(C16311i0.a());
    }

    public C16532g<MComConfig> a(boolean z10) {
        C10271a value;
        if (z10) {
            d();
        }
        C16505B<C10271a> b10 = this.f104435d;
        do {
            value = b10.getValue();
            C10271a aVar = value;
        } while (!b10.e(value, new C10271a(this.f104433b.i(), this.f104433b.a())));
        return this.f104436e;
    }
}
