package vH;

import AH.C15412c;
import AH.C15415f;
import JH.C15954a;
import NH.e;
import XH.C16807N;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0004\u000f\u0012\u0017\rB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\r\u001a\u00020\f2(\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010RE\u0010\u0016\u001a*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00118\u0002X\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"LvH/v;", "", "", "maxSendCount", "<init>", "(I)V", "Lkotlin/Function3;", "LvH/C;", "LAH/c;", "LdI/e;", "LqH/b;", "block", "LXH/N;", "d", "(LnI/q;)V", "a", "I", "", "b", "Ljava/util/List;", "getInterceptors$annotations", "()V", "interceptors", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.v  reason: case insensitive filesystem */
public final class C18183v {

    /* renamed from: c  reason: collision with root package name */
    public static final d f148995c = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15954a<C18183v> f148996d = new C15954a<>("HttpSend");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f148997a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<q<C18160C, C15412c, C17164e<? super C17777b>, Object>> f148998b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LvH/v$a;", "", "<init>", "()V", "", "a", "I", "()I", "setMaxSendCount", "(I)V", "maxSendCount", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.v$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f148999a = 20;

        public final int a() {
            return this.f148999a;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"LvH/v$b;", "LvH/C;", "", "maxSendCount", "LpH/a;", "client", "<init>", "(ILpH/a;)V", "LAH/c;", "requestBuilder", "LqH/b;", "a", "(LAH/c;LdI/e;)Ljava/lang/Object;", "I", "b", "LpH/a;", "c", "sentCount", "d", "LqH/b;", "currentCall", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.v$b */
    private static final class b implements C18160C {

        /* renamed from: a  reason: collision with root package name */
        private final int f149000a;

        /* renamed from: b  reason: collision with root package name */
        private final C17746a f149001b;

        /* renamed from: c  reason: collision with root package name */
        private int f149002c;

        /* renamed from: d  reason: collision with root package name */
        private C17777b f149003d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {138}, m = "execute")
        /* renamed from: vH.v$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f149004c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f149005d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f149006e;

            /* renamed from: f  reason: collision with root package name */
            int f149007f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f149006e = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f149005d = obj;
                this.f149007f |= Integer.MIN_VALUE;
                return this.f149006e.a((C15412c) null, this);
            }
        }

        public b(int i10, C17746a aVar) {
            C17542s.j(aVar, "client");
            this.f149000a = i10;
            this.f149001b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(AH.C15412c r6, dI.C17164e<? super qH.C17777b> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof vH.C18183v.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                vH.v$b$a r0 = (vH.C18183v.b.a) r0
                int r1 = r0.f149007f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f149007f = r1
                goto L_0x0018
            L_0x0013:
                vH.v$b$a r0 = new vH.v$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f149005d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f149007f
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0036
                if (r2 != r4) goto L_0x002e
                java.lang.Object r6 = r0.f149004c
                vH.v$b r6 = (vH.C18183v.b) r6
                XH.y.b(r7)
                goto L_0x005f
            L_0x002e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0036:
                XH.y.b(r7)
                qH.b r7 = r5.f149003d
                if (r7 == 0) goto L_0x0040
                QJ.S.e(r7, r3, r4, r3)
            L_0x0040:
                int r7 = r5.f149002c
                int r2 = r5.f149000a
                if (r7 >= r2) goto L_0x0086
                int r7 = r7 + r4
                r5.f149002c = r7
                pH.a r7 = r5.f149001b
                AH.h r7 = r7.n()
                java.lang.Object r2 = r6.d()
                r0.f149004c = r5
                r0.f149007f = r4
                java.lang.Object r7 = r7.d(r6, r2, r0)
                if (r7 != r1) goto L_0x005e
                return r1
            L_0x005e:
                r6 = r5
            L_0x005f:
                boolean r0 = r7 instanceof qH.C17777b
                if (r0 == 0) goto L_0x0066
                r3 = r7
                qH.b r3 = (qH.C17777b) r3
            L_0x0066:
                if (r3 == 0) goto L_0x006b
                r6.f149003d = r3
                return r3
            L_0x006b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L_0x0086:
                vH.B r6 = new vH.B
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f149000a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vH.C18183v.b.a(AH.c, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B<\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0006\u0010\b\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR9\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LvH/v$c;", "LvH/C;", "Lkotlin/Function3;", "LAH/c;", "LdI/e;", "LqH/b;", "", "interceptor", "nextSender", "<init>", "(LnI/q;LvH/C;)V", "requestBuilder", "a", "(LAH/c;LdI/e;)Ljava/lang/Object;", "LnI/q;", "b", "LvH/C;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.v$c */
    private static final class c implements C18160C {

        /* renamed from: a  reason: collision with root package name */
        private final q<C18160C, C15412c, C17164e<? super C17777b>, Object> f149008a;

        /* renamed from: b  reason: collision with root package name */
        private final C18160C f149009b;

        public c(q<? super C18160C, ? super C15412c, ? super C17164e<? super C17777b>, ? extends Object> qVar, C18160C c10) {
            C17542s.j(qVar, "interceptor");
            C17542s.j(c10, "nextSender");
            this.f149008a = qVar;
            this.f149009b = c10;
        }

        public Object a(C15412c cVar, C17164e<? super C17777b> eVar) {
            return this.f149008a.invoke(this.f149009b, cVar, eVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LvH/v$d;", "LvH/m;", "LvH/v$a;", "LvH/v;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LvH/v;", "plugin", "LpH/a;", "scope", "c", "(LvH/v;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.v$d */
    public static final class d implements C18174m<a, C18183v> {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "content", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", l = {104, 105}, m = "invokeSuspend")
        /* renamed from: vH.v$d$a */
        static final class a extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f149010c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f149011d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f149012e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18183v f149013f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17746a f149014g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18183v vVar, C17746a aVar, C17164e<? super a> eVar) {
                super(3, eVar);
                this.f149013f = vVar;
                this.f149014g = aVar;
            }

            /* renamed from: i */
            public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                a aVar = new a(this.f149013f, this.f149014g, eVar2);
                aVar.f149011d = eVar;
                aVar.f149012e = obj;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: NH.e} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r10.f149010c
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x0025
                    if (r1 == r3) goto L_0x001c
                    if (r1 != r2) goto L_0x0014
                    XH.y.b(r11)
                    goto L_0x00e5
                L_0x0014:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x001c:
                    java.lang.Object r1 = r10.f149011d
                    NH.e r1 = (NH.e) r1
                    XH.y.b(r11)
                    goto L_0x00d8
                L_0x0025:
                    XH.y.b(r11)
                    java.lang.Object r11 = r10.f149011d
                    r1 = r11
                    NH.e r1 = (NH.e) r1
                    java.lang.Object r11 = r10.f149012e
                    boolean r5 = r11 instanceof FH.d
                    if (r5 == 0) goto L_0x00e8
                    java.lang.Object r5 = r1.b()
                    AH.c r5 = (AH.C15412c) r5
                    java.lang.Class<FH.d> r6 = FH.d.class
                    if (r11 != 0) goto L_0x0056
                    FH.c r11 = FH.c.f134396a
                    r5.j(r11)
                    uI.q r11 = kotlin.jvm.internal.P.l(r6)
                    java.lang.reflect.Type r7 = uI.C18075x.f(r11)
                    uI.d r6 = kotlin.jvm.internal.P.b(r6)
                    OH.a r11 = OH.b.c(r7, r6, r11)
                    r5.k(r11)
                    goto L_0x0077
                L_0x0056:
                    boolean r7 = r11 instanceof FH.d
                    if (r7 == 0) goto L_0x0061
                    r5.j(r11)
                    r5.k(r4)
                    goto L_0x0077
                L_0x0061:
                    r5.j(r11)
                    uI.q r11 = kotlin.jvm.internal.P.l(r6)
                    java.lang.reflect.Type r7 = uI.C18075x.f(r11)
                    uI.d r6 = kotlin.jvm.internal.P.b(r6)
                    OH.a r11 = OH.b.c(r7, r6, r11)
                    r5.k(r11)
                L_0x0077:
                    vH.v$b r11 = new vH.v$b
                    vH.v r5 = r10.f149013f
                    int r5 = r5.f148997a
                    pH.a r6 = r10.f149014g
                    r11.<init>(r5, r6)
                    kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
                    r5.<init>()
                    r5.f144348a = r11
                    vH.v r11 = r10.f149013f
                    java.util.List r11 = r11.f148998b
                    int r11 = YH.C16877v.p(r11)
                    r6 = 0
                    tI.h r11 = tI.C17978n.s(r11, r6)
                    vH.v r6 = r10.f149013f
                    java.util.Iterator r11 = r11.iterator()
                L_0x00a0:
                    boolean r7 = r11.hasNext()
                    if (r7 == 0) goto L_0x00c3
                    r7 = r11
                    YH.U r7 = (YH.U) r7
                    int r7 = r7.c()
                    java.util.List r8 = r6.f148998b
                    java.lang.Object r7 = r8.get(r7)
                    nI.q r7 = (nI.q) r7
                    vH.v$c r8 = new vH.v$c
                    T r9 = r5.f144348a
                    vH.C r9 = (vH.C18160C) r9
                    r8.<init>(r7, r9)
                    r5.f144348a = r8
                    goto L_0x00a0
                L_0x00c3:
                    T r11 = r5.f144348a
                    vH.C r11 = (vH.C18160C) r11
                    java.lang.Object r5 = r1.b()
                    AH.c r5 = (AH.C15412c) r5
                    r10.f149011d = r1
                    r10.f149010c = r3
                    java.lang.Object r11 = r11.a(r5, r10)
                    if (r11 != r0) goto L_0x00d8
                    return r0
                L_0x00d8:
                    qH.b r11 = (qH.C17777b) r11
                    r10.f149011d = r4
                    r10.f149010c = r2
                    java.lang.Object r11 = r1.f(r11, r10)
                    if (r11 != r0) goto L_0x00e5
                    return r0
                L_0x00e5:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                L_0x00e8:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "\n|Fail to prepare request body for sending. \n|The body type is: "
                    r0.append(r2)
                    java.lang.Class r11 = r11.getClass()
                    uI.d r11 = kotlin.jvm.internal.P.b(r11)
                    r0.append(r11)
                    java.lang.String r11 = ", with Content-Type: "
                    r0.append(r11)
                    java.lang.Object r11 = r1.b()
                    EH.s r11 = (EH.C15634s) r11
                    EH.c r11 = EH.C15635t.d(r11)
                    r0.append(r11)
                    java.lang.String r11 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
                    r0.append(r11)
                    java.lang.String r11 = r0.toString()
                    java.lang.String r11 = HJ.C15854t.o(r11, r4, r3, r4)
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r11 = r11.toString()
                    r0.<init>(r11)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: vH.C18183v.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18183v vVar, C17746a aVar) {
            C17542s.j(vVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.i().l(C15415f.f132953h.c(), new a(vVar, aVar, (C17164e<? super a>) null));
        }

        /* renamed from: d */
        public C18183v a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new C18183v(aVar.a(), (DefaultConstructorMarker) null);
        }

        public C15954a<C18183v> getKey() {
            return C18183v.f148996d;
        }

        private d() {
        }
    }

    public /* synthetic */ C18183v(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final void d(q<? super C18160C, ? super C15412c, ? super C17164e<? super C17777b>, ? extends Object> qVar) {
        C17542s.j(qVar, "block");
        this.f148998b.add(qVar);
    }

    private C18183v(int i10) {
        this.f148997a = i10;
        this.f148998b = new ArrayList();
    }
}
