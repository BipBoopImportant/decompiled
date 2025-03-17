package vH;

import AH.C15411b;
import AH.C15412c;
import AH.C15415f;
import BH.C15458c;
import BH.C15459d;
import BH.C15461f;
import CH.C15492d;
import JH.C15954a;
import NH.e;
import NH.h;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import pH.C17746a;
import qH.C17777b;
import vH.C18173l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0017\u0019BL\b\u0000\u0012(\u0010\u0007\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R9\u0010\u0007\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LvH/k;", "", "", "Lkotlin/Function2;", "LBH/c;", "LdI/e;", "LXH/N;", "responseValidators", "LvH/j;", "callExceptionHandlers", "", "expectSuccess", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "response", "f", "(LBH/c;LdI/e;)Ljava/lang/Object;", "", "cause", "LAH/b;", "request", "e", "(Ljava/lang/Throwable;LAH/b;LdI/e;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "c", "Z", "d", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.k  reason: case insensitive filesystem */
public final class C18172k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f148902d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15954a<C18172k> f148903e = new C15954a<>("HttpResponseValidator");

    /* renamed from: a  reason: collision with root package name */
    private final List<p<C15458c, C17164e<? super C16807N>, Object>> f148904a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C18171j> f148905b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f148906c;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LvH/k$a;", "LvH/m;", "LvH/k$b;", "LvH/k;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LvH/k;", "plugin", "LpH/a;", "scope", "c", "(LvH/k;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.k$a */
    public static final class a implements C18174m<b, C18172k> {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "it", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", f = "HttpCallValidator.kt", l = {130, 133}, m = "invokeSuspend")
        /* renamed from: vH.k$a$a  reason: collision with other inner class name */
        static final class C4292a extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148907c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148908d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148909e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18172k f148910f;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: vH.k$a$a$a  reason: collision with other inner class name */
            static final class C4293a extends C17544u implements C17631a<Boolean> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C18172k f148911c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4293a(C18172k kVar) {
                    super(0);
                    this.f148911c = kVar;
                }

                public final Boolean invoke() {
                    return Boolean.valueOf(this.f148911c.f148906c);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4292a(C18172k kVar, C17164e<? super C4292a> eVar) {
                super(3, eVar);
                this.f148910f = kVar;
            }

            /* renamed from: i */
            public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                C4292a aVar = new C4292a(this.f148910f, eVar2);
                aVar.f148908d = eVar;
                aVar.f148909e = obj;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Throwable th2;
                e eVar;
                Object f10 = C17187b.f();
                int i10 = this.f148907c;
                if (i10 == 0) {
                    y.b(obj);
                    eVar = (e) this.f148908d;
                    Object obj2 = this.f148909e;
                    ((C15412c) eVar.b()).c().b(C18173l.e(), new C4293a(this.f148910f));
                    this.f148908d = eVar;
                    this.f148907c = 1;
                    if (eVar.f(obj2, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    eVar = (e) this.f148908d;
                    try {
                        y.b(obj);
                    } catch (Throwable th3) {
                        Throwable a10 = C15492d.a(th3);
                        C18172k kVar = this.f148910f;
                        C18173l.a c10 = C18173l.a((C15412c) eVar.b());
                        this.f148908d = a10;
                        this.f148907c = 2;
                        if (kVar.e(a10, c10, this) == f10) {
                            return f10;
                        }
                        th2 = a10;
                    }
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    th2 = (Throwable) this.f148908d;
                    y.b(obj);
                    throw th2;
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "container", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", f = "HttpCallValidator.kt", l = {142, 145}, m = "invokeSuspend")
        /* renamed from: vH.k$a$b */
        static final class b extends l implements q<e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148912c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148913d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148914e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18172k f148915f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C18172k kVar, C17164e<? super b> eVar) {
                super(3, eVar);
                this.f148915f = kVar;
            }

            /* renamed from: i */
            public final Object invoke(e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
                b bVar = new b(this.f148915f, eVar2);
                bVar.f148913d = eVar;
                bVar.f148914e = dVar;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Throwable th2;
                e eVar;
                Object f10 = C17187b.f();
                int i10 = this.f148912c;
                if (i10 == 0) {
                    y.b(obj);
                    eVar = (e) this.f148913d;
                    C15459d dVar = (C15459d) this.f148914e;
                    this.f148913d = eVar;
                    this.f148912c = 1;
                    if (eVar.f(dVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    eVar = (e) this.f148913d;
                    try {
                        y.b(obj);
                    } catch (Throwable th3) {
                        Throwable a10 = C15492d.a(th3);
                        C18172k kVar = this.f148915f;
                        C15411b e10 = ((C17777b) eVar.b()).e();
                        this.f148913d = a10;
                        this.f148912c = 2;
                        if (kVar.e(a10, e10, this) == f10) {
                            return f10;
                        }
                        th2 = a10;
                    }
                } else if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    th2 = (Throwable) this.f148913d;
                    y.b(obj);
                    throw th2;
                }
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LvH/C;", "LAH/c;", "request", "LqH/b;", "<anonymous>", "(LvH/C;LAH/c;)LqH/b;"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", f = "HttpCallValidator.kt", l = {151, 152}, m = "invokeSuspend")
        /* renamed from: vH.k$a$c */
        static final class c extends l implements q<C18160C, C15412c, C17164e<? super C17777b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148916c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148917d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148918e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18172k f148919f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C18172k kVar, C17164e<? super c> eVar) {
                super(3, eVar);
                this.f148919f = kVar;
            }

            /* renamed from: i */
            public final Object invoke(C18160C c10, C15412c cVar, C17164e<? super C17777b> eVar) {
                c cVar2 = new c(this.f148919f, eVar);
                cVar2.f148917d = c10;
                cVar2.f148918e = cVar;
                return cVar2.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f148916c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f148917d = null;
                    this.f148916c = 1;
                    obj = ((C18160C) this.f148917d).a((C15412c) this.f148918e, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else if (i10 == 2) {
                    C17777b bVar = (C17777b) this.f148917d;
                    y.b(obj);
                    return bVar;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C17777b bVar2 = (C17777b) obj;
                C18172k kVar = this.f148919f;
                C15458c f11 = bVar2.f();
                this.f148917d = bVar2;
                this.f148916c = 2;
                return kVar.f(f11, this) == f10 ? f10 : bVar2;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18172k kVar, C17746a aVar) {
            C17542s.j(kVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.i().l(C15415f.f132953h.a(), new C4292a(kVar, (C17164e<? super C4292a>) null));
            h hVar = new h("BeforeReceive");
            aVar.l().k(C15461f.f133245h.b(), hVar);
            aVar.l().l(hVar, new b(kVar, (C17164e<? super b>) null));
            ((C18183v) C18175n.b(aVar, C18183v.f148995c)).d(new c(kVar, (C17164e<? super c>) null));
        }

        /* renamed from: d */
        public C18172k a(C17642l<? super b, C16807N> lVar) {
            C17542s.j(lVar, "block");
            b bVar = new b();
            lVar.invoke(bVar);
            return new C18172k(C16877v.Z0(bVar.c()), C16877v.Z0(bVar.b()), bVar.a());
        }

        public C15954a<C18172k> getKey() {
            return C18172k.f148903e;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR?\u0010\u0010\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u000b8\u0000X\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000fR(\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"LvH/k$b;", "", "<init>", "()V", "Lkotlin/Function2;", "LBH/c;", "LdI/e;", "LXH/N;", "block", "e", "(LnI/p;)V", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "responseValidators", "LvH/j;", "b", "responseExceptionHandlers", "", "Z", "()Z", "d", "(Z)V", "getExpectSuccess$annotations", "expectSuccess", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.k$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<p<C15458c, C17164e<? super C16807N>, Object>> f148920a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<C18171j> f148921b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private boolean f148922c = true;

        public final boolean a() {
            return this.f148922c;
        }

        public final List<C18171j> b() {
            return this.f148921b;
        }

        public final List<p<C15458c, C17164e<? super C16807N>, Object>> c() {
            return this.f148920a;
        }

        public final void d(boolean z10) {
            this.f148922c = z10;
        }

        public final void e(p<? super C15458c, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
            C17542s.j(pVar, "block");
            this.f148920a.add(pVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {58, 59}, m = "processException")
    /* renamed from: vH.k$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f148923c;

        /* renamed from: d  reason: collision with root package name */
        Object f148924d;

        /* renamed from: e  reason: collision with root package name */
        Object f148925e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f148926f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C18172k f148927g;

        /* renamed from: h  reason: collision with root package name */
        int f148928h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18172k kVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f148927g = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f148926f = obj;
            this.f148928h |= Integer.MIN_VALUE;
            return this.f148927g.e((Throwable) null, (C15411b) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {51}, m = "validateResponse")
    /* renamed from: vH.k$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f148929c;

        /* renamed from: d  reason: collision with root package name */
        Object f148930d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f148931e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18172k f148932f;

        /* renamed from: g  reason: collision with root package name */
        int f148933g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C18172k kVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f148932f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f148931e = obj;
            this.f148933g |= Integer.MIN_VALUE;
            return this.f148932f.f((C15458c) null, this);
        }
    }

    public C18172k(List<? extends p<? super C15458c, ? super C17164e<? super C16807N>, ? extends Object>> list, List<? extends C18171j> list2, boolean z10) {
        C17542s.j(list, "responseValidators");
        C17542s.j(list2, "callExceptionHandlers");
        this.f148904a = list;
        this.f148905b = list2;
        this.f148906c = z10;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7 A[SYNTHETIC] */
    public final java.lang.Object e(java.lang.Throwable r8, AH.C15411b r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof vH.C18172k.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            vH.k$c r0 = (vH.C18172k.c) r0
            int r1 = r0.f148928h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f148928h = r1
            goto L_0x0018
        L_0x0013:
            vH.k$c r0 = new vH.k$c
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f148926f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f148928h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            java.lang.Object r8 = r0.f148925e
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f148924d
            AH.b r9 = (AH.C15411b) r9
            java.lang.Object r2 = r0.f148923c
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            XH.y.b(r10)
            goto L_0x009b
        L_0x0041:
            XH.y.b(r10)
            org.slf4j.Logger r10 = vH.C18173l.f148934a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Processing exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            EH.Q r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.trace(r2)
            java.util.List<vH.j> r10 = r7.f148905b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L_0x0074:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r8.next()
            vH.j r2 = (vH.C18171j) r2
            boolean r5 = r2 instanceof vH.C18170i
            if (r5 == 0) goto L_0x009e
            vH.i r2 = (vH.C18170i) r2
            nI.p r2 = r2.a()
            r0.f148923c = r9
            r0.f148924d = r10
            r0.f148925e = r8
            r0.f148928h = r4
            java.lang.Object r2 = r2.invoke(r9, r0)
            if (r2 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r2 = r9
            r9 = r10
        L_0x009b:
            r10 = r9
            r9 = r2
            goto L_0x0074
        L_0x009e:
            boolean r5 = r2 instanceof vH.C18187z
            if (r5 == 0) goto L_0x0074
            vH.z r2 = (vH.C18187z) r2
            nI.q r2 = r2.a()
            r0.f148923c = r9
            r0.f148924d = r10
            r0.f148925e = r8
            r0.f148928h = r3
            java.lang.Object r2 = r2.invoke(r9, r10, r0)
            if (r2 != r1) goto L_0x0099
            return r1
        L_0x00b7:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vH.C18172k.e(java.lang.Throwable, AH.b, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(BH.C15458c r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vH.C18172k.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            vH.k$d r0 = (vH.C18172k.d) r0
            int r1 = r0.f148933g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f148933g = r1
            goto L_0x0018
        L_0x0013:
            vH.k$d r0 = new vH.k$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f148931e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f148933g
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r7 = r0.f148930d
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f148929c
            BH.c r2 = (BH.C15458c) r2
            XH.y.b(r8)
            r8 = r2
            goto L_0x006c
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            XH.y.b(r8)
            org.slf4j.Logger r8 = vH.C18173l.f148934a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Validating response for request "
            r2.append(r4)
            qH.b r4 = r7.h0()
            AH.b r4 = r4.e()
            EH.Q r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r8.trace(r2)
            java.util.List<nI.p<BH.c, dI.e<? super XH.N>, java.lang.Object>> r8 = r6.f148904a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x006c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r7.next()
            nI.p r2 = (nI.p) r2
            r0.f148929c = r8
            r0.f148930d = r7
            r0.f148933g = r3
            java.lang.Object r2 = r2.invoke(r8, r0)
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x0085:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vH.C18172k.f(BH.c, dI.e):java.lang.Object");
    }
}
