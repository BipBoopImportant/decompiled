package vH;

import AH.C15412c;
import BH.C15458c;
import DH.C15528a;
import JH.C15954a;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.q;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0002\u0007\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"LvH/q;", "", "", "checkHttpMethod", "allowHttpsDowngrade", "<init>", "(ZZ)V", "a", "Z", "b", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.q  reason: case insensitive filesystem */
public final class C18178q {

    /* renamed from: c  reason: collision with root package name */
    public static final b f148960c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15954a<C18178q> f148961d = new C15954a<>("HttpRedirect");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C15528a<C15458c> f148962e = new C15528a<>();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final boolean f148963a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f148964b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"LvH/q$a;", "", "<init>", "()V", "", "a", "Z", "b", "()Z", "setCheckHttpMethod", "(Z)V", "checkHttpMethod", "setAllowHttpsDowngrade", "allowHttpsDowngrade", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.q$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f148965a = true;

        /* renamed from: b  reason: collision with root package name */
        private boolean f148966b;

        public final boolean a() {
            return this.f148966b;
        }

        public final boolean b() {
            return this.f148965a;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"LvH/q$b;", "LvH/m;", "LvH/q$a;", "LvH/q;", "<init>", "()V", "LvH/C;", "LAH/c;", "context", "LqH/b;", "origin", "", "allowHttpsDowngrade", "LpH/a;", "client", "e", "(LvH/C;LAH/c;LqH/b;ZLpH/a;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "LXH/N;", "block", "g", "(LnI/l;)LvH/q;", "plugin", "scope", "f", "(LvH/q;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "LDH/a;", "LBH/c;", "HttpResponseRedirect", "LDH/a;", "d", "()LDH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: vH.q$b */
    public static final class b implements C18174m<a, C18178q> {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", l = {113}, m = "handleCall")
        /* renamed from: vH.q$b$a */
        static final class a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f148967c;

            /* renamed from: d  reason: collision with root package name */
            Object f148968d;

            /* renamed from: e  reason: collision with root package name */
            Object f148969e;

            /* renamed from: f  reason: collision with root package name */
            Object f148970f;

            /* renamed from: g  reason: collision with root package name */
            Object f148971g;

            /* renamed from: h  reason: collision with root package name */
            Object f148972h;

            /* renamed from: i  reason: collision with root package name */
            Object f148973i;

            /* renamed from: j  reason: collision with root package name */
            Object f148974j;

            /* renamed from: k  reason: collision with root package name */
            Object f148975k;

            /* renamed from: l  reason: collision with root package name */
            boolean f148976l;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f148977m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b f148978n;

            /* renamed from: o  reason: collision with root package name */
            int f148979o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f148978n = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f148977m = obj;
                this.f148979o |= Integer.MIN_VALUE;
                return this.f148978n.e((C18160C) null, (C15412c) null, (C17777b) null, false, (C17746a) null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LvH/C;", "LAH/c;", "context", "LqH/b;", "<anonymous>", "(LvH/C;LAH/c;)LqH/b;"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", f = "HttpRedirect.kt", l = {64, 69}, m = "invokeSuspend")
        /* renamed from: vH.q$b$b  reason: collision with other inner class name */
        static final class C4295b extends l implements q<C18160C, C15412c, C17164e<? super C17777b>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148980c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148981d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f148982e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C18178q f148983f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17746a f148984g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4295b(C18178q qVar, C17746a aVar, C17164e<? super C4295b> eVar) {
                super(3, eVar);
                this.f148983f = qVar;
                this.f148984g = aVar;
            }

            /* renamed from: i */
            public final Object invoke(C18160C c10, C15412c cVar, C17164e<? super C17777b> eVar) {
                C4295b bVar = new C4295b(this.f148983f, this.f148984g, eVar);
                bVar.f148981d = c10;
                bVar.f148982e = cVar;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C15412c cVar;
                C18160C c10;
                Object f10 = C17187b.f();
                int i10 = this.f148980c;
                if (i10 == 0) {
                    y.b(obj);
                    C18160C c11 = (C18160C) this.f148981d;
                    C15412c cVar2 = (C15412c) this.f148982e;
                    this.f148981d = c11;
                    this.f148982e = cVar2;
                    this.f148980c = 1;
                    Object a10 = c11.a(cVar2, this);
                    if (a10 == f10) {
                        return f10;
                    }
                    c10 = c11;
                    cVar = cVar2;
                    obj = a10;
                } else if (i10 == 1) {
                    y.b(obj);
                    cVar = (C15412c) this.f148982e;
                    c10 = (C18160C) this.f148981d;
                } else if (i10 == 2) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C17777b bVar = (C17777b) obj;
                if (this.f148983f.f148963a && !C18179r.f148985a.contains(bVar.e().U())) {
                    return bVar;
                }
                b bVar2 = C18178q.f148960c;
                boolean a11 = this.f148983f.f148964b;
                C17746a aVar = this.f148984g;
                this.f148981d = null;
                this.f148982e = null;
                this.f148980c = 2;
                obj = bVar2.e(c10, cVar, bVar, a11, aVar, this);
                return obj == f10 ? f10 : obj;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x015b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x01af A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x01cd  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object e(vH.C18160C r19, AH.C15412c r20, qH.C17777b r21, boolean r22, pH.C17746a r23, dI.C17164e<? super qH.C17777b> r24) {
            /*
                r18 = this;
                r0 = r21
                r1 = r24
                boolean r2 = r1 instanceof vH.C18178q.b.a
                if (r2 == 0) goto L_0x0019
                r2 = r1
                vH.q$b$a r2 = (vH.C18178q.b.a) r2
                int r3 = r2.f148979o
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0019
                int r3 = r3 - r4
                r2.f148979o = r3
                r3 = r18
                goto L_0x0020
            L_0x0019:
                vH.q$b$a r2 = new vH.q$b$a
                r3 = r18
                r2.<init>(r3, r1)
            L_0x0020:
                java.lang.Object r1 = r2.f148977m
                java.lang.Object r4 = eI.C17187b.f()
                int r5 = r2.f148979o
                r6 = 1
                if (r5 == 0) goto L_0x006e
                if (r5 != r6) goto L_0x0066
                boolean r0 = r2.f148976l
                java.lang.Object r5 = r2.f148975k
                kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
                java.lang.Object r7 = r2.f148974j
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r2.f148973i
                EH.M r8 = (EH.C15608M) r8
                java.lang.Object r9 = r2.f148972h
                kotlin.jvm.internal.O r9 = (kotlin.jvm.internal.O) r9
                java.lang.Object r10 = r2.f148971g
                kotlin.jvm.internal.O r10 = (kotlin.jvm.internal.O) r10
                java.lang.Object r11 = r2.f148970f
                pH.a r11 = (pH.C17746a) r11
                java.lang.Object r12 = r2.f148969e
                AH.c r12 = (AH.C15412c) r12
                java.lang.Object r13 = r2.f148968d
                vH.C r13 = (vH.C18160C) r13
                java.lang.Object r14 = r2.f148967c
                vH.q$b r14 = (vH.C18178q.b) r14
                XH.y.b(r1)
                r3 = r2
                r2 = r0
                r0 = r13
                r16 = r9
                r9 = r7
                r7 = r12
                r12 = r16
                r17 = r10
                r10 = r8
                r8 = r17
                goto L_0x01b6
            L_0x0066:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x006e:
                XH.y.b(r1)
                BH.c r1 = r21.f()
                EH.w r1 = r1.f()
                boolean r1 = vH.C18179r.d(r1)
                if (r1 != 0) goto L_0x0080
                return r0
            L_0x0080:
                kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                r1.<init>()
                r1.f144348a = r0
                kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
                r5.<init>()
                r7 = r20
                r5.f144348a = r7
                AH.b r8 = r21.e()
                EH.Q r8 = r8.getUrl()
                EH.M r8 = r8.k()
                AH.b r0 = r21.e()
                EH.Q r0 = r0.getUrl()
                java.lang.String r0 = EH.C15615U.a(r0)
                r9 = r0
                r14 = r3
                r11 = r5
                r10 = r8
                r0 = r19
                r8 = r1
                r5 = r2
                r1 = r22
                r2 = r23
            L_0x00b4:
                DH.b r12 = r2.g()
                DH.a r13 = r14.d()
                T r15 = r8.f144348a
                qH.b r15 = (qH.C17777b) r15
                BH.c r15 = r15.f()
                r12.a(r13, r15)
                T r12 = r8.f144348a
                qH.b r12 = (qH.C17777b) r12
                BH.c r12 = r12.f()
                EH.l r12 = r12.a()
                EH.p r13 = EH.C15631p.f134088a
                java.lang.String r15 = r13.o()
                java.lang.String r12 = r12.get(r15)
                org.slf4j.Logger r15 = vH.C18179r.f148986b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r3 = "Received redirect response to "
                r6.append(r3)
                r6.append(r12)
                java.lang.String r3 = " for request "
                r6.append(r3)
                EH.G r3 = r7.i()
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                r15.trace(r3)
                AH.c r3 = new AH.c
                r3.<init>()
                T r6 = r11.f144348a
                AH.c r6 = (AH.C15412c) r6
                r3.p(r6)
                EH.G r6 = r3.i()
                EH.B r6 = r6.k()
                r6.clear()
                if (r12 == 0) goto L_0x0121
                EH.G r6 = r3.i()
                EH.C15607L.j(r6, r12)
            L_0x0121:
                if (r1 != 0) goto L_0x015b
                boolean r6 = EH.C15609N.a(r10)
                if (r6 == 0) goto L_0x015b
                EH.G r6 = r3.i()
                EH.M r6 = r6.o()
                boolean r6 = EH.C15609N.a(r6)
                if (r6 != 0) goto L_0x015b
                org.slf4j.Logger r0 = vH.C18179r.f148986b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Can not redirect "
                r1.append(r2)
                EH.G r2 = r7.i()
                r1.append(r2)
                java.lang.String r2 = " because of security downgrade"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.trace(r1)
                T r0 = r8.f144348a
                return r0
            L_0x015b:
                EH.G r6 = r3.i()
                java.lang.String r6 = EH.C15604I.e(r6)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r9, r6)
                if (r6 != 0) goto L_0x0190
                EH.m r6 = r3.a()
                java.lang.String r12 = r13.e()
                r6.l(r12)
                org.slf4j.Logger r6 = vH.C18179r.f148986b
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "Removing Authorization header from redirect for "
                r12.append(r13)
                EH.G r13 = r7.i()
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                r6.trace(r12)
            L_0x0190:
                r11.f144348a = r3
                r5.f148967c = r14
                r5.f148968d = r0
                r5.f148969e = r7
                r5.f148970f = r2
                r5.f148971g = r8
                r5.f148972h = r11
                r5.f148973i = r10
                r5.f148974j = r9
                r5.f148975k = r8
                r5.f148976l = r1
                r6 = 1
                r5.f148979o = r6
                java.lang.Object r3 = r0.a(r3, r5)
                if (r3 != r4) goto L_0x01b0
                return r4
            L_0x01b0:
                r12 = r11
                r11 = r2
                r2 = r1
                r1 = r3
                r3 = r5
                r5 = r8
            L_0x01b6:
                r5.f144348a = r1
                T r1 = r8.f144348a
                qH.b r1 = (qH.C17777b) r1
                BH.c r1 = r1.f()
                EH.w r1 = r1.f()
                boolean r1 = vH.C18179r.d(r1)
                if (r1 != 0) goto L_0x01cd
                T r0 = r8.f144348a
                return r0
            L_0x01cd:
                r1 = r2
                r5 = r3
                r2 = r11
                r11 = r12
                r3 = r18
                goto L_0x00b4
            */
            throw new UnsupportedOperationException("Method not decompiled: vH.C18178q.b.e(vH.C, AH.c, qH.b, boolean, pH.a, dI.e):java.lang.Object");
        }

        public final C15528a<C15458c> d() {
            return C18178q.f148962e;
        }

        /* renamed from: f */
        public void b(C18178q qVar, C17746a aVar) {
            C17542s.j(qVar, "plugin");
            C17542s.j(aVar, "scope");
            ((C18183v) C18175n.b(aVar, C18183v.f148995c)).d(new C4295b(qVar, aVar, (C17164e<? super C4295b>) null));
        }

        /* renamed from: g */
        public C18178q a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new C18178q(aVar.b(), aVar.a(), (DefaultConstructorMarker) null);
        }

        public C15954a<C18178q> getKey() {
            return C18178q.f148961d;
        }

        private b() {
        }
    }

    public /* synthetic */ C18178q(boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11);
    }

    private C18178q(boolean z10, boolean z11) {
        this.f148963a = z10;
        this.f148964b = z11;
    }
}
