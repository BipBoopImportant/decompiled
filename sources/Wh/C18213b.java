package wH;

import AH.C15412c;
import AH.C15415f;
import BH.C15459d;
import BH.C15461f;
import EH.C15612Q;
import EH.C15618c;
import EH.C15619d;
import EH.C15635t;
import GH.C15702a;
import GH.C15704c;
import GH.C15705d;
import JH.C15954a;
import OH.C16158a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import YH.g0;
import dI.C17164e;
import eI.C17187b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import pH.C17746a;
import qH.C17777b;
import uI.C18055d;
import vH.C18174m;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0002\u001a\rB)\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\f\b\u0002\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"LwH/b;", "", "", "LwH/b$a$a;", "registrations", "", "LuI/d;", "ignoredTypes", "<init>", "(Ljava/util/List;Ljava/util/Set;)V", "LAH/c;", "request", "body", "b", "(LAH/c;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LEH/Q;", "requestUrl", "LOH/a;", "info", "LEH/c;", "responseContentType", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "c", "(LEH/Q;LOH/a;Ljava/lang/Object;LEH/c;Ljava/nio/charset/Charset;LdI/e;)Ljava/lang/Object;", "a", "Ljava/util/List;", "getRegistrations$ktor_client_content_negotiation", "()Ljava/util/List;", "Ljava/util/Set;", "getIgnoredTypes$ktor_client_content_negotiation", "()Ljava/util/Set;", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: wH.b  reason: case insensitive filesystem */
public final class C18213b {

    /* renamed from: c  reason: collision with root package name */
    public static final C4305b f149113c = new C4305b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15954a<C18213b> f149114d = new C15954a<>("ContentNegotiation");

    /* renamed from: a  reason: collision with root package name */
    private final List<a.C4303a> f149115a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<C18055d<?>> f149116b;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0010\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0014\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LwH/b$a;", "LGH/a;", "<init>", "()V", "LEH/c;", "pattern", "LEH/d;", "b", "(LEH/c;)LEH/d;", "LGH/c;", "T", "contentType", "converter", "Lkotlin/Function1;", "LXH/N;", "configuration", "a", "(LEH/c;LGH/c;LnI/l;)V", "contentTypeToSend", "contentTypeMatcher", "e", "(LEH/c;LGH/c;LEH/d;LnI/l;)V", "", "LuI/d;", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "ignoredTypes", "", "LwH/b$a$a;", "Ljava/util/List;", "d", "()Ljava/util/List;", "registrations", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wH.b$a */
    public static final class a implements C15702a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<C18055d<?>> f149117a = C16877v.x1(g0.k(C18215d.a(), C18214c.b()));

        /* renamed from: b  reason: collision with root package name */
        private final List<C4303a> f149118b = new ArrayList();

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"LwH/b$a$a;", "", "LGH/c;", "converter", "LEH/c;", "contentTypeToSend", "LEH/d;", "contentTypeMatcher", "<init>", "(LGH/c;LEH/c;LEH/d;)V", "a", "LGH/c;", "c", "()LGH/c;", "b", "LEH/c;", "()LEH/c;", "LEH/d;", "()LEH/d;", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: wH.b$a$a  reason: collision with other inner class name */
        public static final class C4303a {

            /* renamed from: a  reason: collision with root package name */
            private final C15704c f149119a;

            /* renamed from: b  reason: collision with root package name */
            private final C15618c f149120b;

            /* renamed from: c  reason: collision with root package name */
            private final C15619d f149121c;

            public C4303a(C15704c cVar, C15618c cVar2, C15619d dVar) {
                C17542s.j(cVar, "converter");
                C17542s.j(cVar2, "contentTypeToSend");
                C17542s.j(dVar, "contentTypeMatcher");
                this.f149119a = cVar;
                this.f149120b = cVar2;
                this.f149121c = dVar;
            }

            public final C15619d a() {
                return this.f149121c;
            }

            public final C15618c b() {
                return this.f149120b;
            }

            public final C15704c c() {
                return this.f149119a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"wH/b$a$b", "LEH/d;", "LEH/c;", "contentType", "", "a", "(LEH/c;)Z", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: wH.b$a$b  reason: collision with other inner class name */
        public static final class C4304b implements C15619d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C15618c f149122a;

            C4304b(C15618c cVar) {
                this.f149122a = cVar;
            }

            public boolean a(C15618c cVar) {
                C17542s.j(cVar, "contentType");
                return cVar.g(this.f149122a);
            }
        }

        private final C15619d b(C15618c cVar) {
            return new C4304b(cVar);
        }

        public <T extends C15704c> void a(C15618c cVar, T t10, C17642l<? super T, C16807N> lVar) {
            C17542s.j(cVar, "contentType");
            C17542s.j(t10, "converter");
            C17542s.j(lVar, "configuration");
            e(cVar, t10, C17542s.e(cVar, C15618c.a.f133990a.a()) ? C18216e.f149147a : b(cVar), lVar);
        }

        public final Set<C18055d<?>> c() {
            return this.f149117a;
        }

        public final List<C4303a> d() {
            return this.f149118b;
        }

        public final <T extends C15704c> void e(C15618c cVar, T t10, C15619d dVar, C17642l<? super T, C16807N> lVar) {
            C17542s.j(cVar, "contentTypeToSend");
            C17542s.j(t10, "converter");
            C17542s.j(dVar, "contentTypeMatcher");
            C17542s.j(lVar, "configuration");
            lVar.invoke(t10);
            this.f149118b.add(new C4303a(t10, cVar, dVar));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LwH/b$b;", "LvH/m;", "LwH/b$a;", "LwH/b;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LwH/b;", "plugin", "LpH/a;", "scope", "c", "(LwH/b;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-content-negotiation"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wH.b$b  reason: collision with other inner class name */
    public static final class C4305b implements C18174m<a, C18213b> {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "it", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$1", f = "ContentNegotiation.kt", l = {253, 254}, m = "invokeSuspend")
        /* renamed from: wH.b$b$a */
        static final class a extends l implements q<NH.e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f149123c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f149124d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C18213b f149125e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18213b bVar, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f149125e = bVar;
            }

            /* renamed from: i */
            public final Object invoke(NH.e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                a aVar = new a(this.f149125e, eVar2);
                aVar.f149124d = eVar;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: NH.e} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r6.f149123c
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    XH.y.b(r7)
                    goto L_0x0052
                L_0x0012:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L_0x001a:
                    java.lang.Object r1 = r6.f149124d
                    NH.e r1 = (NH.e) r1
                    XH.y.b(r7)
                    goto L_0x0041
                L_0x0022:
                    XH.y.b(r7)
                    java.lang.Object r7 = r6.f149124d
                    r1 = r7
                    NH.e r1 = (NH.e) r1
                    wH.b r7 = r6.f149125e
                    java.lang.Object r4 = r1.b()
                    AH.c r4 = (AH.C15412c) r4
                    java.lang.Object r5 = r1.c()
                    r6.f149124d = r1
                    r6.f149123c = r3
                    java.lang.Object r7 = r7.b(r4, r5, r6)
                    if (r7 != r0) goto L_0x0041
                    return r0
                L_0x0041:
                    if (r7 != 0) goto L_0x0046
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                L_0x0046:
                    r3 = 0
                    r6.f149124d = r3
                    r6.f149123c = r2
                    java.lang.Object r7 = r1.f(r7, r6)
                    if (r7 != r0) goto L_0x0052
                    return r0
                L_0x0052:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: wH.C18213b.C4305b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation$Plugin$install$2", f = "ContentNegotiation.kt", l = {264, 267}, m = "invokeSuspend")
        /* renamed from: wH.b$b$b  reason: collision with other inner class name */
        static final class C4306b extends l implements q<NH.e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f149126c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f149127d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f149128e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18213b f149129f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4306b(C18213b bVar, C17164e<? super C4306b> eVar) {
                super(3, eVar);
                this.f149129f = bVar;
            }

            /* renamed from: i */
            public final Object invoke(NH.e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
                C4306b bVar = new C4306b(this.f149129f, eVar2);
                bVar.f149127d = eVar;
                bVar.f149128e = dVar;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                NH.e eVar;
                C16158a aVar;
                Object f10 = C17187b.f();
                int i10 = this.f149126c;
                if (i10 == 0) {
                    y.b(obj);
                    NH.e eVar2 = (NH.e) this.f149127d;
                    C15459d dVar = (C15459d) this.f149128e;
                    C16158a a10 = dVar.a();
                    Object b10 = dVar.b();
                    C15618c c10 = C15635t.c(((C17777b) eVar2.b()).f());
                    if (c10 == null) {
                        C18214c.f149144a.trace("Response doesn't have \"Content-Type\" header, skipping ContentNegotiation plugin");
                        return C16807N.f139792a;
                    }
                    Charset c11 = C15705d.c(((C17777b) eVar2.b()).e().a(), (Charset) null, 1, (Object) null);
                    C18213b bVar = this.f149129f;
                    C15612Q url = ((C17777b) eVar2.b()).e().getUrl();
                    this.f149127d = eVar2;
                    this.f149128e = a10;
                    this.f149126c = 1;
                    Object c12 = bVar.c(url, a10, b10, c10, c11, this);
                    if (c12 == f10) {
                        return f10;
                    }
                    eVar = eVar2;
                    obj = c12;
                    aVar = a10;
                } else if (i10 == 1) {
                    aVar = (C16158a) this.f149128e;
                    eVar = (NH.e) this.f149127d;
                    y.b(obj);
                } else if (i10 == 2) {
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj == null) {
                    return C16807N.f139792a;
                }
                C15459d dVar2 = new C15459d(aVar, obj);
                this.f149127d = null;
                this.f149128e = null;
                this.f149126c = 2;
                if (eVar.f(dVar2, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            }
        }

        public /* synthetic */ C4305b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18213b bVar, C17746a aVar) {
            C17542s.j(bVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.i().l(C15415f.f132953h.d(), new a(bVar, (C17164e<? super a>) null));
            aVar.l().l(C15461f.f133245h.c(), new C4306b(bVar, (C17164e<? super C4306b>) null));
        }

        /* renamed from: d */
        public C18213b a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new C18213b(aVar.d(), aVar.c());
        }

        public C15954a<C18213b> getKey() {
            return C18213b.f149114d;
        }

        private C4305b() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", l = {182}, m = "convertRequest$ktor_client_content_negotiation")
    /* renamed from: wH.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f149130c;

        /* renamed from: d  reason: collision with root package name */
        Object f149131d;

        /* renamed from: e  reason: collision with root package name */
        Object f149132e;

        /* renamed from: f  reason: collision with root package name */
        Object f149133f;

        /* renamed from: g  reason: collision with root package name */
        Object f149134g;

        /* renamed from: h  reason: collision with root package name */
        Object f149135h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f149136i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C18213b f149137j;

        /* renamed from: k  reason: collision with root package name */
        int f149138k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18213b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f149137j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f149136i = obj;
            this.f149138k |= Integer.MIN_VALUE;
            return this.f149137j.b((C15412c) null, (Object) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwH/b$a$a;", "it", "", "a", "(LwH/b$a$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: wH.b$d */
    static final class d extends C17544u implements C17642l<a.C4303a, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f149139c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(a.C4303a aVar) {
            C17542s.j(aVar, "it");
            return aVar.c().toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.contentnegotiation.ContentNegotiation", f = "ContentNegotiation.kt", l = {232}, m = "convertResponse$ktor_client_content_negotiation")
    /* renamed from: wH.b$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f149140c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f149141d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18213b f149142e;

        /* renamed from: f  reason: collision with root package name */
        int f149143f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C18213b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f149142e = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f149141d = obj;
            this.f149143f |= Integer.MIN_VALUE;
            return this.f149142e.c((C15612Q) null, (C16158a) null, (Object) null, (C15618c) null, (Charset) null, this);
        }
    }

    public C18213b(List<a.C4303a> list, Set<? extends C18055d<?>> set) {
        C17542s.j(list, "registrations");
        C17542s.j(set, "ignoredTypes");
        this.f149115a = list;
        this.f149116b = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: wH.b$a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0257 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(AH.C15412c r18, java.lang.Object r19, dI.C17164e<java.lang.Object> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof wH.C18213b.c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            wH.b$c r3 = (wH.C18213b.c) r3
            int r4 = r3.f149138k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f149138k = r4
            goto L_0x001e
        L_0x0019:
            wH.b$c r3 = new wH.b$c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f149136i
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f149138k
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0050
            if (r5 != r6) goto L_0x0048
            java.lang.Object r1 = r3.f149135h
            wH.b$a$a r1 = (wH.C18213b.a.C4303a) r1
            java.lang.Object r5 = r3.f149134g
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r8 = r3.f149133f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r3.f149132e
            EH.c r9 = (EH.C15618c) r9
            java.lang.Object r10 = r3.f149131d
            java.lang.Object r11 = r3.f149130c
            AH.c r11 = (AH.C15412c) r11
            XH.y.b(r2)
            r15 = r9
            goto L_0x021e
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            XH.y.b(r2)
            java.util.List<wH.b$a$a> r2 = r0.f149115a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x005b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r2.next()
            wH.b$a$a r5 = (wH.C18213b.a.C4303a) r5
            org.slf4j.Logger r8 = wH.C18214c.f149144a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Adding Accept="
            r9.append(r10)
            EH.c r10 = r5.b()
            java.lang.String r10 = r10.e()
            r9.append(r10)
            java.lang.String r10 = " header for "
            r9.append(r10)
            EH.G r10 = r18.i()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.trace(r9)
            EH.m r8 = r18.a()
            EH.p r9 = EH.C15631p.f134088a
            java.lang.String r9 = r9.c()
            EH.c r10 = r5.b()
            java.lang.String r10 = r10.toString()
            boolean r8 = r8.h(r9, r10)
            if (r8 != 0) goto L_0x00b5
            EH.c r5 = r5.b()
            r8 = r18
            AH.C15419j.a(r8, r5)
            goto L_0x005b
        L_0x00b5:
            r8 = r18
            goto L_0x005b
        L_0x00b8:
            r8 = r18
            boolean r2 = r1 instanceof FH.d
            r5 = 46
            if (r2 != 0) goto L_0x0290
            java.util.Set<uI.d<?>> r2 = r0.f149116b
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r9 = r2 instanceof java.util.Collection
            if (r9 == 0) goto L_0x00d2
            r9 = r2
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x00d2
            goto L_0x00ea
        L_0x00d2:
            java.util.Iterator r2 = r2.iterator()
        L_0x00d6:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00ea
            java.lang.Object r9 = r2.next()
            uI.d r9 = (uI.C18055d) r9
            boolean r9 = r9.s(r1)
            if (r9 == 0) goto L_0x00d6
            goto L_0x0290
        L_0x00ea:
            EH.c r2 = EH.C15635t.d(r18)
            if (r2 != 0) goto L_0x0110
            org.slf4j.Logger r1 = wH.C18214c.f149144a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Request doesn't have Content-Type header. Skipping ContentNegotiation for "
            r2.append(r3)
            EH.G r3 = r18.i()
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.trace(r2)
            return r7
        L_0x0110:
            boolean r9 = r1 instanceof XH.C16807N
            if (r9 == 0) goto L_0x0140
            org.slf4j.Logger r1 = wH.C18214c.f149144a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Sending empty body for "
            r2.append(r3)
            EH.G r3 = r18.i()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.trace(r2)
            EH.m r1 = r18.a()
            EH.p r2 = EH.C15631p.f134088a
            java.lang.String r2 = r2.h()
            r1.l(r2)
            CH.c r1 = CH.C15491c.f133484a
            return r1
        L_0x0140:
            java.util.List<wH.b$a$a> r9 = r0.f149115a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x014d:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0168
            java.lang.Object r11 = r9.next()
            r12 = r11
            wH.b$a$a r12 = (wH.C18213b.a.C4303a) r12
            EH.d r12 = r12.a()
            boolean r12 = r12.a(r2)
            if (r12 == 0) goto L_0x014d
            r10.add(r11)
            goto L_0x014d
        L_0x0168:
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            r10 = r7
        L_0x0170:
            if (r10 != 0) goto L_0x019a
            org.slf4j.Logger r1 = wH.C18214c.f149144a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "None of the registered converters match request Content-Type="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ". Skipping ContentNegotiation for "
            r3.append(r2)
            EH.G r2 = r18.i()
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.trace(r2)
            return r7
        L_0x019a:
            OH.a r9 = r18.e()
            if (r9 != 0) goto L_0x01c0
            org.slf4j.Logger r1 = wH.C18214c.f149144a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Request has unknown body type. Skipping ContentNegotiation for "
            r2.append(r3)
            EH.G r3 = r18.i()
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.trace(r2)
            return r7
        L_0x01c0:
            EH.m r5 = r18.a()
            EH.p r9 = EH.C15631p.f134088a
            java.lang.String r9 = r9.h()
            r5.l(r9)
            java.util.Iterator r5 = r10.iterator()
            r15 = r2
            r2 = r10
        L_0x01d3:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0255
            java.lang.Object r9 = r5.next()
            r14 = r9
            wH.b$a$a r14 = (wH.C18213b.a.C4303a) r14
            GH.c r9 = r14.c()
            java.nio.charset.Charset r10 = EH.C15620e.a(r15)
            if (r10 != 0) goto L_0x01ec
            java.nio.charset.Charset r10 = HJ.C15838d.f135279b
        L_0x01ec:
            r11 = r10
            OH.a r12 = r8.e()
            kotlin.jvm.internal.C17542s.g(r12)
            FH.c r10 = FH.c.f134396a
            boolean r10 = kotlin.jvm.internal.C17542s.e(r1, r10)
            if (r10 != 0) goto L_0x01fe
            r13 = r1
            goto L_0x01ff
        L_0x01fe:
            r13 = r7
        L_0x01ff:
            r3.f149130c = r8
            r3.f149131d = r1
            r3.f149132e = r15
            r3.f149133f = r2
            r3.f149134g = r5
            r3.f149135h = r14
            r3.f149138k = r6
            r10 = r15
            r16 = r14
            r14 = r3
            java.lang.Object r9 = r9.b(r10, r11, r12, r13, r14)
            if (r9 != r4) goto L_0x0218
            return r4
        L_0x0218:
            r10 = r1
            r11 = r8
            r1 = r16
            r8 = r2
            r2 = r9
        L_0x021e:
            FH.d r2 = (FH.d) r2
            if (r2 == 0) goto L_0x024a
            org.slf4j.Logger r9 = wH.C18214c.f149144a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Converted request body using "
            r12.append(r13)
            GH.c r1 = r1.c()
            r12.append(r1)
            java.lang.String r1 = " for "
            r12.append(r1)
            EH.G r1 = r11.i()
            r12.append(r1)
            java.lang.String r1 = r12.toString()
            r9.trace(r1)
        L_0x024a:
            if (r2 == 0) goto L_0x0250
            r7 = r2
            r2 = r8
            r1 = r10
            goto L_0x0255
        L_0x0250:
            r2 = r8
            r1 = r10
            r8 = r11
            goto L_0x01d3
        L_0x0255:
            if (r7 == 0) goto L_0x0258
            return r7
        L_0x0258:
            wH.a r3 = new wH.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Can't convert "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " with contentType "
            r4.append(r1)
            r4.append(r15)
            java.lang.String r1 = " using converters "
            r4.append(r1)
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            wH.b$d r11 = wH.C18213b.d.f149139c
            r12 = 31
            r13 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r1 = YH.C16877v.G0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
        L_0x0290:
            org.slf4j.Logger r2 = wH.C18214c.f149144a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Body type "
            r3.append(r4)
            java.lang.Class r1 = r19.getClass()
            uI.d r1 = kotlin.jvm.internal.P.b(r1)
            r3.append(r1)
            java.lang.String r1 = " is in ignored types. Skipping ContentNegotiation for "
            r3.append(r1)
            EH.G r1 = r18.i()
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.trace(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wH.C18213b.b(AH.c, java.lang.Object, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(EH.C15612Q r9, OH.C16158a r10, java.lang.Object r11, EH.C15618c r12, java.nio.charset.Charset r13, dI.C17164e<java.lang.Object> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof wH.C18213b.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            wH.b$e r0 = (wH.C18213b.e) r0
            int r1 = r0.f149143f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f149143f = r1
            goto L_0x0018
        L_0x0013:
            wH.b$e r0 = new wH.b$e
            r0.<init>(r8, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f149141d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f149143f
            r3 = 1
            r4 = 46
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f149140c
            EH.Q r9 = (EH.C15612Q) r9
            XH.y.b(r14)
            goto L_0x0116
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            XH.y.b(r14)
            boolean r14 = r11 instanceof io.ktor.utils.io.g
            r2 = 0
            if (r14 != 0) goto L_0x005c
            org.slf4j.Logger r10 = wH.C18214c.f149144a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Response body is already transformed. Skipping ContentNegotiation for "
            r11.append(r12)
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r10.trace(r9)
            return r2
        L_0x005c:
            java.util.Set<uI.d<?>> r14 = r8.f149116b
            uI.d r5 = r10.b()
            boolean r14 = r14.contains(r5)
            if (r14 == 0) goto L_0x0090
            org.slf4j.Logger r11 = wH.C18214c.f149144a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Response body type "
            r12.append(r13)
            uI.d r10 = r10.b()
            r12.append(r10)
            java.lang.String r10 = " is in ignored types. Skipping ContentNegotiation for "
            r12.append(r10)
            r12.append(r9)
            r12.append(r4)
            java.lang.String r9 = r12.toString()
            r11.trace(r9)
            return r2
        L_0x0090:
            java.util.List<wH.b$a$a> r14 = r8.f149115a
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x009d:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r14.next()
            r7 = r6
            wH.b$a$a r7 = (wH.C18213b.a.C4303a) r7
            EH.d r7 = r7.a()
            boolean r7 = r7.a(r12)
            if (r7 == 0) goto L_0x009d
            r5.add(r6)
            goto L_0x009d
        L_0x00b8:
            java.util.ArrayList r14 = new java.util.ArrayList
            r6 = 10
            int r6 = YH.C16877v.y(r5, r6)
            r14.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x00c7:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r5.next()
            wH.b$a$a r6 = (wH.C18213b.a.C4303a) r6
            GH.c r6 = r6.c()
            r14.add(r6)
            goto L_0x00c7
        L_0x00db:
            boolean r5 = r14.isEmpty()
            if (r5 != 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r14 = r2
        L_0x00e3:
            if (r14 != 0) goto L_0x0109
            org.slf4j.Logger r10 = wH.C18214c.f149144a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "None of the registered converters match response with Content-Type="
            r11.append(r13)
            r11.append(r12)
            java.lang.String r12 = ". Skipping ContentNegotiation for "
            r11.append(r12)
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r10.trace(r9)
            return r2
        L_0x0109:
            io.ktor.utils.io.g r11 = (io.ktor.utils.io.g) r11
            r0.f149140c = r9
            r0.f149143f = r3
            java.lang.Object r14 = GH.C15705d.a(r14, r11, r10, r13, r0)
            if (r14 != r1) goto L_0x0116
            return r1
        L_0x0116:
            boolean r10 = r14 instanceof io.ktor.utils.io.g
            if (r10 != 0) goto L_0x0145
            org.slf4j.Logger r10 = wH.C18214c.f149144a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Response body was converted to "
            r11.append(r12)
            java.lang.Class r12 = r14.getClass()
            uI.d r12 = kotlin.jvm.internal.P.b(r12)
            r11.append(r12)
            java.lang.String r12 = " for "
            r11.append(r12)
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r10.trace(r9)
        L_0x0145:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: wH.C18213b.c(EH.Q, OH.a, java.lang.Object, EH.c, java.nio.charset.Charset, dI.e):java.lang.Object");
    }
}
