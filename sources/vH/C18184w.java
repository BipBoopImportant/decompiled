package vH;

import AH.C15412c;
import EH.C15609N;
import JH.C15954a;
import QJ.C16297b0;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.q;
import org.slf4j.Logger;
import pH.C17746a;
import qH.C17777b;
import sH.C17901e;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000b\rB'\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"LvH/w;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "f", "()Z", "a", "Ljava/lang/Long;", "b", "c", "d", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.w  reason: case insensitive filesystem */
public final class C18184w {

    /* renamed from: d  reason: collision with root package name */
    public static final b f149015d = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15954a<C18184w> f149016e = new C15954a<>("TimeoutPlugin");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Long f149017a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Long f149018b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Long f149019c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b\u001e\u0010\u001dR(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00028F@FX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"LvH/w$a;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "value", "b", "(Ljava/lang/Long;)Ljava/lang/Long;", "LvH/w;", "a", "()LvH/w;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Long;", "_requestTimeoutMillis", "_connectTimeoutMillis", "c", "_socketTimeoutMillis", "d", "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", "f", "e", "h", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.w$a */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C4297a f149020d = new C4297a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        private static final C15954a<a> f149021e = new C15954a<>("TimeoutConfiguration");

        /* renamed from: a  reason: collision with root package name */
        private Long f149022a;

        /* renamed from: b  reason: collision with root package name */
        private Long f149023b;

        /* renamed from: c  reason: collision with root package name */
        private Long f149024c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvH/w$a$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: vH.w$a$a  reason: collision with other inner class name */
        public static final class C4297a {
            public /* synthetic */ C4297a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C4297a() {
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Long l10, Long l11, Long l12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : l11, (i10 & 4) != 0 ? null : l12);
        }

        private final Long b(Long l10) {
            if (l10 == null || l10.longValue() > 0) {
                return l10;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final C18184w a() {
            return new C18184w(d(), c(), e(), (DefaultConstructorMarker) null);
        }

        public final Long c() {
            return this.f149023b;
        }

        public final Long d() {
            return this.f149022a;
        }

        public final Long e() {
            return this.f149024c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f149022a, aVar.f149022a) && C17542s.e(this.f149023b, aVar.f149023b) && C17542s.e(this.f149024c, aVar.f149024c);
        }

        public final void f(Long l10) {
            this.f149023b = b(l10);
        }

        public final void g(Long l10) {
            this.f149022a = b(l10);
        }

        public final void h(Long l10) {
            this.f149024c = b(l10);
        }

        public int hashCode() {
            Long l10 = this.f149022a;
            int i10 = 0;
            int hashCode = (l10 != null ? l10.hashCode() : 0) * 31;
            Long l11 = this.f149023b;
            int hashCode2 = (hashCode + (l11 != null ? l11.hashCode() : 0)) * 31;
            Long l12 = this.f149024c;
            if (l12 != null) {
                i10 = l12.hashCode();
            }
            return hashCode2 + i10;
        }

        public a(Long l10, Long l11, Long l12) {
            this.f149022a = 0L;
            this.f149023b = 0L;
            this.f149024c = 0L;
            g(l10);
            f(l11);
            h(l12);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LvH/w$b;", "LvH/m;", "LvH/w$a;", "LvH/w;", "LsH/e;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LvH/w;", "plugin", "LpH/a;", "scope", "c", "(LvH/w;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "", "INFINITE_TIMEOUT_MS", "J", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.w$b */
    public static final class b implements C18174m<a, C18184w>, C17901e<a> {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LvH/C;", "LAH/c;", "request", "LqH/b;", "<anonymous>", "(LvH/C;LAH/c;)LqH/b;"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1", f = "HttpTimeout.kt", l = {146, 174}, m = "invokeSuspend")
        /* renamed from: vH.w$b$a */
        static final class a extends l implements q<C18160C, C15412c, C17164e<? super C17777b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f149025c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f149026d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f149027e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18184w f149028f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17746a f149029g;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: vH.w$b$a$a  reason: collision with other inner class name */
            static final class C4298a extends C17544u implements C17642l<Throwable, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ F0 f149030c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4298a(F0 f02) {
                    super(1);
                    this.f149030c = f02;
                }

                public final void a(Throwable th2) {
                    F0.a.a(this.f149030c, (CancellationException) null, 1, (Object) null);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Throwable) obj);
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "io.ktor.client.plugins.HttpTimeout$Plugin$install$1$1$killer$1", f = "HttpTimeout.kt", l = {164}, m = "invokeSuspend")
            /* renamed from: vH.w$b$a$b  reason: collision with other inner class name */
            static final class C4299b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f149031c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Long f149032d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C15412c f149033e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ F0 f149034f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4299b(Long l10, C15412c cVar, F0 f02, C17164e<? super C4299b> eVar) {
                    super(2, eVar);
                    this.f149032d = l10;
                    this.f149033e = cVar;
                    this.f149034f = f02;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C4299b(this.f149032d, this.f149033e, this.f149034f, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C4299b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f149031c;
                    if (i10 == 0) {
                        y.b(obj);
                        long longValue = this.f149032d.longValue();
                        this.f149031c = 1;
                        if (C16297b0.b(longValue, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C18182u uVar = new C18182u(this.f149033e);
                    Logger c10 = C18185x.f149035a;
                    c10.trace("Request timeout: " + this.f149033e.i());
                    F0 f02 = this.f149034f;
                    String message = uVar.getMessage();
                    C17542s.g(message);
                    I0.c(f02, message, uVar);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18184w wVar, C17746a aVar, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f149028f = wVar;
                this.f149029g = aVar;
            }

            /* renamed from: i */
            public final Object invoke(C18160C c10, C15412c cVar, C17164e<? super C17777b> eVar) {
                a aVar = new a(this.f149028f, this.f149029g, eVar);
                aVar.f149026d = c10;
                aVar.f149027e = cVar;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f149025c;
                if (i10 == 0) {
                    y.b(obj);
                    C18160C c10 = (C18160C) this.f149026d;
                    C15412c cVar = (C15412c) this.f149027e;
                    if (!C15609N.b(cVar.i().o())) {
                        cVar.d();
                        b bVar = C18184w.f149015d;
                        a aVar = (a) cVar.f(bVar);
                        if (aVar == null && this.f149028f.f()) {
                            aVar = new a((Long) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null);
                            cVar.l(bVar, aVar);
                        }
                        if (aVar != null) {
                            C18184w wVar = this.f149028f;
                            C17746a aVar2 = this.f149029g;
                            Long c11 = aVar.c();
                            if (c11 == null) {
                                c11 = wVar.f149018b;
                            }
                            aVar.f(c11);
                            Long e10 = aVar.e();
                            if (e10 == null) {
                                e10 = wVar.f149019c;
                            }
                            aVar.h(e10);
                            Long d10 = aVar.d();
                            if (d10 == null) {
                                d10 = wVar.f149017a;
                            }
                            aVar.g(d10);
                            Long d11 = aVar.d();
                            if (d11 == null) {
                                d11 = wVar.f149017a;
                            }
                            if (!(d11 == null || d11.longValue() == Long.MAX_VALUE)) {
                                cVar.g().s(new C4298a(C16314k.d(aVar2, (C17168i) null, (T) null, new C4299b(d11, cVar, cVar.g(), (C17164e<? super C4299b>) null), 3, (Object) null)));
                            }
                        }
                        this.f149026d = null;
                        this.f149025c = 2;
                        obj = c10.a(cVar, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else {
                        this.f149026d = null;
                        this.f149025c = 1;
                        obj = c10.a(cVar, this);
                        return obj == f10 ? f10 : obj;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else if (i10 == 2) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18184w wVar, C17746a aVar) {
            C17542s.j(wVar, "plugin");
            C17542s.j(aVar, "scope");
            ((C18183v) C18175n.b(aVar, C18183v.f148995c)).d(new a(wVar, aVar, (C17164e<? super a>) null));
        }

        /* renamed from: d */
        public C18184w a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a((Long) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null);
            lVar.invoke(aVar);
            return aVar.a();
        }

        public C15954a<C18184w> getKey() {
            return C18184w.f149016e;
        }

        private b() {
        }
    }

    public /* synthetic */ C18184w(Long l10, Long l11, Long l12, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, l11, l12);
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        return (this.f149017a == null && this.f149018b == null && this.f149019c == null) ? false : true;
    }

    private C18184w(Long l10, Long l11, Long l12) {
        this.f149017a = l10;
        this.f149018b = l11;
        this.f149019c = l12;
    }
}
