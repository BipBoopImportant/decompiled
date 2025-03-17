package vH;

import AH.C15412c;
import AH.C15415f;
import BH.C15458c;
import BH.C15459d;
import BH.C15460e;
import BH.C15461f;
import EH.C15618c;
import EH.C15631p;
import FH.d;
import MH.C16039a;
import NH.e;
import QJ.C16283A;
import QJ.S;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.h;
import io.ktor.utils.io.j;
import io.ktor.utils.io.u;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.q;
import org.slf4j.Logger;
import pH.C17746a;
import qH.C17777b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LpH/a;", "LXH/N;", "b", "(LpH/a;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "a", "Lorg/slf4j/Logger;", "LOGGER", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.g  reason: case insensitive filesystem */
public final class C18168g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f148873a = C16039a.a("io.ktor.client.plugins.defaultTransformers");

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "body", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: vH.g$a */
    static final class a extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f148874c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f148875d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f148876e;

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"vH/g$a$a", "LFH/d$a;", "", "e", "()[B", "LEH/c;", "a", "LEH/c;", "b", "()LEH/c;", "contentType", "", "J", "()Ljava/lang/Long;", "contentLength", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: vH.g$a$a  reason: collision with other inner class name */
        public static final class C4290a extends d.a {

            /* renamed from: a  reason: collision with root package name */
            private final C15618c f148877a;

            /* renamed from: b  reason: collision with root package name */
            private final long f148878b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f148879c;

            C4290a(C15618c cVar, Object obj) {
                this.f148879c = obj;
                this.f148877a = cVar == null ? C15618c.a.f133990a.b() : cVar;
                this.f148878b = (long) ((byte[]) obj).length;
            }

            public Long a() {
                return Long.valueOf(this.f148878b);
            }

            public C15618c b() {
                return this.f148877a;
            }

            public byte[] e() {
                return (byte[]) this.f148879c;
            }
        }

        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"vH/g$a$b", "LFH/d$c;", "Lio/ktor/utils/io/g;", "e", "()Lio/ktor/utils/io/g;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contentLength", "LEH/c;", "b", "LEH/c;", "()LEH/c;", "contentType", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: vH.g$a$b */
        public static final class b extends d.c {

            /* renamed from: a  reason: collision with root package name */
            private final Long f148880a;

            /* renamed from: b  reason: collision with root package name */
            private final C15618c f148881b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f148882c;

            b(e<Object, C15412c> eVar, C15618c cVar, Object obj) {
                this.f148882c = obj;
                String j10 = eVar.b().a().j(C15631p.f134088a.g());
                this.f148880a = j10 != null ? Long.valueOf(Long.parseLong(j10)) : null;
                this.f148881b = cVar == null ? C15618c.a.f133990a.b() : cVar;
            }

            public Long a() {
                return this.f148880a;
            }

            public C15618c b() {
                return this.f148881b;
            }

            public g e() {
                return (g) this.f148882c;
            }
        }

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
            a aVar = new a(eVar2);
            aVar.f148875d = eVar;
            aVar.f148876e = obj;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: FH.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: FH.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: FH.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: vH.g$a$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: vH.g$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: FH.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: FH.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: FH.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: FH.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: FH.e} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f148874c
                r2 = 1
                if (r1 == 0) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                XH.y.b(r13)
                goto L_0x00ed
            L_0x0010:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0018:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f148875d
                NH.e r13 = (NH.e) r13
                java.lang.Object r1 = r12.f148876e
                java.lang.Object r3 = r13.b()
                AH.c r3 = (AH.C15412c) r3
                EH.m r3 = r3.a()
                EH.p r4 = EH.C15631p.f134088a
                java.lang.String r5 = r4.c()
                java.lang.String r3 = r3.j(r5)
                if (r3 != 0) goto L_0x004a
                java.lang.Object r3 = r13.b()
                AH.c r3 = (AH.C15412c) r3
                EH.m r3 = r3.a()
                java.lang.String r5 = r4.c()
                java.lang.String r6 = "*/*"
                r3.f(r5, r6)
            L_0x004a:
                java.lang.Object r3 = r13.b()
                EH.s r3 = (EH.C15634s) r3
                EH.c r3 = EH.C15635t.d(r3)
                boolean r5 = r1 instanceof java.lang.String
                if (r5 == 0) goto L_0x006e
                FH.e r5 = new FH.e
                r7 = r1
                java.lang.String r7 = (java.lang.String) r7
                if (r3 != 0) goto L_0x0065
                EH.c$c r3 = EH.C15618c.C3303c.f134012a
                EH.c r3 = r3.a()
            L_0x0065:
                r8 = r3
                r10 = 4
                r11 = 0
                r9 = 0
                r6 = r5
                r6.<init>(r7, r8, r9, r10, r11)
                goto L_0x0094
            L_0x006e:
                boolean r5 = r1 instanceof byte[]
                if (r5 == 0) goto L_0x0078
                vH.g$a$a r5 = new vH.g$a$a
                r5.<init>(r3, r1)
                goto L_0x0094
            L_0x0078:
                boolean r5 = r1 instanceof io.ktor.utils.io.g
                if (r5 == 0) goto L_0x0082
                vH.g$a$b r5 = new vH.g$a$b
                r5.<init>(r13, r3, r1)
                goto L_0x0094
            L_0x0082:
                boolean r5 = r1 instanceof FH.d
                if (r5 == 0) goto L_0x008a
                r5 = r1
                FH.d r5 = (FH.d) r5
                goto L_0x0094
            L_0x008a:
                java.lang.Object r5 = r13.b()
                AH.c r5 = (AH.C15412c) r5
                FH.d r5 = vH.C18169h.a(r3, r5, r1)
            L_0x0094:
                r3 = 0
                if (r5 == 0) goto L_0x009c
                EH.c r6 = r5.b()
                goto L_0x009d
            L_0x009c:
                r6 = r3
            L_0x009d:
                if (r6 == 0) goto L_0x00ed
                java.lang.Object r6 = r13.b()
                AH.c r6 = (AH.C15412c) r6
                EH.m r6 = r6.a()
                java.lang.String r4 = r4.h()
                r6.l(r4)
                org.slf4j.Logger r4 = vH.C18168g.f148873a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "Transformed with default transformers request body for "
                r6.append(r7)
                java.lang.Object r7 = r13.b()
                AH.c r7 = (AH.C15412c) r7
                EH.G r7 = r7.i()
                r6.append(r7)
                java.lang.String r7 = " from "
                r6.append(r7)
                java.lang.Class r1 = r1.getClass()
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                r4.trace(r1)
                r12.f148875d = r3
                r12.f148874c = r2
                java.lang.Object r13 = r13.f(r5, r12)
                if (r13 != r0) goto L_0x00ed
                return r0
            L_0x00ed:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: vH.C18168g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "LBH/d;", "LqH/b;", "<name for destructuring parameter 0>", "LXH/N;", "<anonymous>", "(LNH/e;LBH/d;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {68, 72, 72, 78, 78, 82, 90, 116, 121}, m = "invokeSuspend")
    /* renamed from: vH.g$b */
    static final class b extends l implements q<e<C15459d, C17777b>, C15459d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f148883c;

        /* renamed from: d  reason: collision with root package name */
        Object f148884d;

        /* renamed from: e  reason: collision with root package name */
        int f148885e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f148886f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f148887g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2$result$channel$1", f = "DefaultTransform.kt", l = {100}, m = "invokeSuspend")
        /* renamed from: vH.g$b$a */
        static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f148888c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f148889d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f148890e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C15458c f148891f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, C15458c cVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f148890e = obj;
                this.f148891f = cVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f148890e, this.f148891f, eVar);
                aVar.f148889d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
                return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f148888c;
                if (i10 == 0) {
                    y.b(obj);
                    j d10 = ((u) this.f148889d).d();
                    this.f148888c = 1;
                    if (h.b((g) this.f148890e, d10, Long.MAX_VALUE, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    try {
                        y.b(obj);
                    } catch (CancellationException e10) {
                        S.d(this.f148891f, e10);
                        throw e10;
                    } catch (Throwable th2) {
                        C15460e.c(this.f148891f);
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C15460e.c(this.f148891f);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: vH.g$b$b  reason: collision with other inner class name */
        static final class C4291b extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16283A f148892c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4291b(C16283A a10) {
                super(1);
                this.f148892c = a10;
            }

            public final void a(Throwable th2) {
                this.f148892c.l();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(e<C15459d, C17777b> eVar, C15459d dVar, C17164e<? super C16807N> eVar2) {
            b bVar = new b(eVar2);
            bVar.f148886f = eVar;
            bVar.f148887g = dVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: NH.e} */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x010c, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x010f, code lost:
            r15 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x013a, code lost:
            r4 = new BH.C15459d(r14, kotlin.coroutines.jvm.internal.b.e(java.lang.Integer.parseInt(RH.n.K0((RH.n) r0, 0, 0, 3, (java.lang.Object) null))));
            r6.f148886f = r15;
            r6.f148887g = r2;
            r6.f148883c = null;
            r6.f148884d = null;
            r6.f148885e = 3;
            r0 = r1.f(r4, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x015c, code lost:
            if (r0 != r7) goto L_0x015f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x015e, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x015f, code lost:
            r1 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0163, code lost:
            r15 = r1;
            r14 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x019d, code lost:
            r3 = new BH.C15459d(r14, r0);
            r6.f148886f = r15;
            r6.f148887g = r2;
            r6.f148883c = null;
            r6.f148884d = null;
            r6.f148885e = 5;
            r0 = r1.f(r3, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b1, code lost:
            if (r0 != r7) goto L_0x01b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b3, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b4, code lost:
            r1 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b5, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01d7, code lost:
            r0 = (byte[]) r0;
            r3 = EH.C15635t.b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e3, code lost:
            if (JH.t.f135734a.a() != false) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01f3, code lost:
            if (r2.a().get(EH.C15631p.f134088a.f()) != null) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f5, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f7, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f8, code lost:
            r4 = kotlin.jvm.internal.C17542s.e(((qH.C17777b) r15.b()).e().U(), EH.C15636u.f134140b.b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0210, code lost:
            if (r2 == false) goto L_0x0250;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0212, code lost:
            if (r4 != false) goto L_0x0250;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0214, code lost:
            if (r3 == null) goto L_0x0250;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x021e, code lost:
            if (r3.longValue() <= 0) goto L_0x0250;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0226, code lost:
            if (r0.length != ((int) r3.longValue())) goto L_0x0229;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0228, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0229, code lost:
            if (r8 == false) goto L_0x022c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x024f, code lost:
            throw new java.lang.IllegalStateException(("Expected " + r3 + ", actual " + r0.length).toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0250, code lost:
            r1 = new BH.C15459d(r14, r0);
            r6.f148886f = r15;
            r6.f148887g = r14;
            r6.f148883c = null;
            r6.f148885e = 7;
            r0 = r15.f(r1, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0262, code lost:
            if (r0 != r7) goto L_0x0265;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0264, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0265, code lost:
            r1 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0266, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02bd, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02c0, code lost:
            r15 = r1;
            r14 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ef, code lost:
            r9 = (BH.C15459d) r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x02f5, code lost:
            if (r9 == null) goto L_0x0329;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f7, code lost:
            vH.C18168g.a().trace("Transformed with default transformers response body for " + ((qH.C17777b) r15.b()).e().getUrl() + " to " + r14.b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x032b, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Object r7 = eI.C17187b.f()
                int r0 = r6.f148885e
                r8 = 0
                r1 = 1
                r9 = 0
                switch(r0) {
                    case 0: goto L_0x00bd;
                    case 1: goto L_0x00ae;
                    case 2: goto L_0x0095;
                    case 3: goto L_0x0085;
                    case 4: goto L_0x006c;
                    case 5: goto L_0x005c;
                    case 6: goto L_0x0046;
                    case 7: goto L_0x0036;
                    case 8: goto L_0x0026;
                    case 9: goto L_0x0016;
                    default: goto L_0x000e;
                }
            L_0x000e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0016:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r4 = r0
                r0 = r17
                goto L_0x02ef
            L_0x0026:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r4 = r0
                r0 = r17
                goto L_0x02bd
            L_0x0036:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r14 = r0
                r0 = r17
                goto L_0x0266
            L_0x0046:
                java.lang.Object r0 = r6.f148883c
                BH.c r0 = (BH.C15458c) r0
                java.lang.Object r2 = r6.f148887g
                OH.a r2 = (OH.C16158a) r2
                java.lang.Object r3 = r6.f148886f
                NH.e r3 = (NH.e) r3
                XH.y.b(r17)
                r14 = r2
                r15 = r3
                r2 = r0
                r0 = r17
                goto L_0x01d7
            L_0x005c:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r2 = r0
                r0 = r17
                goto L_0x01b5
            L_0x006c:
                java.lang.Object r0 = r6.f148884d
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148883c
                NH.e r1 = (NH.e) r1
                java.lang.Object r2 = r6.f148887g
                OH.a r2 = (OH.C16158a) r2
                java.lang.Object r3 = r6.f148886f
                NH.e r3 = (NH.e) r3
                XH.y.b(r17)
                r14 = r0
                r15 = r3
                r0 = r17
                goto L_0x019d
            L_0x0085:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r2 = r0
                r0 = r17
                goto L_0x0160
            L_0x0095:
                java.lang.Object r0 = r6.f148884d
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148883c
                NH.e r1 = (NH.e) r1
                java.lang.Object r2 = r6.f148887g
                OH.a r2 = (OH.C16158a) r2
                java.lang.Object r3 = r6.f148886f
                NH.e r3 = (NH.e) r3
                XH.y.b(r17)
                r14 = r0
                r15 = r3
                r0 = r17
                goto L_0x013a
            L_0x00ae:
                java.lang.Object r0 = r6.f148887g
                OH.a r0 = (OH.C16158a) r0
                java.lang.Object r1 = r6.f148886f
                NH.e r1 = (NH.e) r1
                XH.y.b(r17)
                r14 = r0
                r0 = r17
                goto L_0x010c
            L_0x00bd:
                XH.y.b(r17)
                java.lang.Object r0 = r6.f148886f
                r15 = r0
                NH.e r15 = (NH.e) r15
                java.lang.Object r0 = r6.f148887g
                BH.d r0 = (BH.C15459d) r0
                OH.a r14 = r0.a()
                java.lang.Object r0 = r0.b()
                boolean r2 = r0 instanceof io.ktor.utils.io.g
                if (r2 != 0) goto L_0x00d8
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x00d8:
                java.lang.Object r2 = r15.b()
                qH.b r2 = (qH.C17777b) r2
                BH.c r2 = r2.f()
                uI.d r3 = r14.b()
                java.lang.Class<XH.N> r4 = XH.C16807N.class
                uI.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
                if (r4 == 0) goto L_0x0112
                io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0
                io.ktor.utils.io.i.a(r0)
                BH.d r0 = new BH.d
                XH.N r2 = XH.C16807N.f139792a
                r0.<init>(r14, r2)
                r6.f148886f = r15
                r6.f148887g = r14
                r6.f148885e = r1
                java.lang.Object r0 = r15.f(r0, r6)
                if (r0 != r7) goto L_0x010b
                return r7
            L_0x010b:
                r1 = r15
            L_0x010c:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
            L_0x010f:
                r15 = r1
                goto L_0x02f5
            L_0x0112:
                java.lang.Class r4 = java.lang.Integer.TYPE
                uI.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
                if (r4 == 0) goto L_0x0167
                io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0
                r6.f148886f = r15
                r6.f148887g = r14
                r6.f148883c = r15
                r6.f148884d = r14
                r1 = 2
                r6.f148885e = r1
                r1 = 0
                r4 = 1
                r5 = 0
                r3 = r16
                java.lang.Object r0 = io.ktor.utils.io.g.b.a(r0, r1, r3, r4, r5)
                if (r0 != r7) goto L_0x0138
                return r7
            L_0x0138:
                r2 = r14
                r1 = r15
            L_0x013a:
                RH.n r0 = (RH.n) r0
                r3 = 3
                java.lang.String r0 = RH.n.K0(r0, r8, r8, r3, r9)
                int r0 = java.lang.Integer.parseInt(r0)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.e(r0)
                BH.d r4 = new BH.d
                r4.<init>(r14, r0)
                r6.f148886f = r15
                r6.f148887g = r2
                r6.f148883c = r9
                r6.f148884d = r9
                r6.f148885e = r3
                java.lang.Object r0 = r1.f(r4, r6)
                if (r0 != r7) goto L_0x015f
                return r7
            L_0x015f:
                r1 = r15
            L_0x0160:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
            L_0x0163:
                r15 = r1
                r14 = r2
                goto L_0x02f5
            L_0x0167:
                java.lang.Class<RH.k> r4 = RH.k.class
                uI.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
                if (r4 == 0) goto L_0x0175
                r4 = r1
                goto L_0x017f
            L_0x0175:
                java.lang.Class<RH.n> r4 = RH.n.class
                uI.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
            L_0x017f:
                if (r4 == 0) goto L_0x01b9
                io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0
                r6.f148886f = r15
                r6.f148887g = r14
                r6.f148883c = r15
                r6.f148884d = r14
                r1 = 4
                r6.f148885e = r1
                r1 = 0
                r4 = 1
                r5 = 0
                r3 = r16
                java.lang.Object r0 = io.ktor.utils.io.g.b.a(r0, r1, r3, r4, r5)
                if (r0 != r7) goto L_0x019b
                return r7
            L_0x019b:
                r2 = r14
                r1 = r15
            L_0x019d:
                BH.d r3 = new BH.d
                r3.<init>(r14, r0)
                r6.f148886f = r15
                r6.f148887g = r2
                r6.f148883c = r9
                r6.f148884d = r9
                r0 = 5
                r6.f148885e = r0
                java.lang.Object r0 = r1.f(r3, r6)
                if (r0 != r7) goto L_0x01b4
                return r7
            L_0x01b4:
                r1 = r15
            L_0x01b5:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
                goto L_0x0163
            L_0x01b9:
                java.lang.Class<byte[]> r4 = byte[].class
                uI.d r4 = kotlin.jvm.internal.P.b(r4)
                boolean r4 = kotlin.jvm.internal.C17542s.e(r3, r4)
                if (r4 == 0) goto L_0x026b
                io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0
                r6.f148886f = r15
                r6.f148887g = r14
                r6.f148883c = r2
                r3 = 6
                r6.f148885e = r3
                java.lang.Object r0 = JH.f.c(r0, r6)
                if (r0 != r7) goto L_0x01d7
                return r7
            L_0x01d7:
                byte[] r0 = (byte[]) r0
                java.lang.Long r3 = EH.C15635t.b(r2)
                JH.t r4 = JH.t.f135734a
                boolean r4 = r4.a()
                if (r4 != 0) goto L_0x01f7
                EH.l r2 = r2.a()
                EH.p r4 = EH.C15631p.f134088a
                java.lang.String r4 = r4.f()
                java.lang.String r2 = r2.get(r4)
                if (r2 != 0) goto L_0x01f7
                r2 = r1
                goto L_0x01f8
            L_0x01f7:
                r2 = r8
            L_0x01f8:
                java.lang.Object r4 = r15.b()
                qH.b r4 = (qH.C17777b) r4
                AH.b r4 = r4.e()
                EH.u r4 = r4.U()
                EH.u$a r5 = EH.C15636u.f134140b
                EH.u r5 = r5.b()
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r2 == 0) goto L_0x0250
                if (r4 != 0) goto L_0x0250
                if (r3 == 0) goto L_0x0250
                long r4 = r3.longValue()
                r10 = 0
                int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r2 <= 0) goto L_0x0250
                int r2 = r0.length
                long r4 = r3.longValue()
                int r4 = (int) r4
                if (r2 != r4) goto L_0x0229
                r8 = r1
            L_0x0229:
                if (r8 == 0) goto L_0x022c
                goto L_0x0250
            L_0x022c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = ", actual "
                r1.append(r2)
                int r0 = r0.length
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L_0x0250:
                BH.d r1 = new BH.d
                r1.<init>(r14, r0)
                r6.f148886f = r15
                r6.f148887g = r14
                r6.f148883c = r9
                r0 = 7
                r6.f148885e = r0
                java.lang.Object r0 = r15.f(r1, r6)
                if (r0 != r7) goto L_0x0265
                return r7
            L_0x0265:
                r1 = r15
            L_0x0266:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
                goto L_0x010f
            L_0x026b:
                java.lang.Class<io.ktor.utils.io.g> r1 = io.ktor.utils.io.g.class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r1)
                if (r1 == 0) goto L_0x02c3
                dI.i r1 = r2.getCoroutineContext()
                QJ.F0$b r3 = QJ.F0.f137562d0
                dI.i$b r1 = r1.get(r3)
                QJ.F0 r1 = (QJ.F0) r1
                QJ.A r1 = QJ.I0.a(r1)
                dI.i r11 = r2.getCoroutineContext()
                vH.g$b$a r13 = new vH.g$b$a
                r13.<init>(r0, r2, r9)
                r0 = 2
                r2 = 0
                r12 = 0
                r10 = r15
                r4 = r14
                r14 = r0
                r5 = r15
                r15 = r2
                io.ktor.utils.io.t r0 = io.ktor.utils.io.q.c(r10, r11, r12, r13, r14, r15)
                vH.g$b$b r2 = new vH.g$b$b
                r2.<init>(r1)
                r0.s(r2)
                io.ktor.utils.io.g r0 = r0.d()
                BH.d r1 = new BH.d
                r1.<init>(r4, r0)
                r6.f148886f = r5
                r6.f148887g = r4
                r0 = 8
                r6.f148885e = r0
                java.lang.Object r0 = r5.f(r1, r6)
                if (r0 != r7) goto L_0x02bc
                return r7
            L_0x02bc:
                r1 = r5
            L_0x02bd:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
            L_0x02c0:
                r15 = r1
                r14 = r4
                goto L_0x02f5
            L_0x02c3:
                r4 = r14
                r5 = r15
                java.lang.Class<EH.w> r1 = EH.C15638w.class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r1)
                if (r1 == 0) goto L_0x02f3
                io.ktor.utils.io.g r0 = (io.ktor.utils.io.g) r0
                io.ktor.utils.io.i.a(r0)
                BH.d r0 = new BH.d
                EH.w r1 = r2.f()
                r0.<init>(r4, r1)
                r6.f148886f = r5
                r6.f148887g = r4
                r1 = 9
                r6.f148885e = r1
                java.lang.Object r0 = r5.f(r0, r6)
                if (r0 != r7) goto L_0x02ee
                return r7
            L_0x02ee:
                r1 = r5
            L_0x02ef:
                r9 = r0
                BH.d r9 = (BH.C15459d) r9
                goto L_0x02c0
            L_0x02f3:
                r14 = r4
                r15 = r5
            L_0x02f5:
                if (r9 == 0) goto L_0x0329
                org.slf4j.Logger r0 = vH.C18168g.f148873a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transformed with default transformers response body for "
                r1.append(r2)
                java.lang.Object r2 = r15.b()
                qH.b r2 = (qH.C17777b) r2
                AH.b r2 = r2.e()
                EH.Q r2 = r2.getUrl()
                r1.append(r2)
                java.lang.String r2 = " to "
                r1.append(r2)
                uI.d r2 = r14.b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.trace(r1)
            L_0x0329:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vH.C18168g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void b(C17746a aVar) {
        C17542s.j(aVar, "<this>");
        aVar.i().l(C15415f.f132953h.b(), new a((C17164e<? super a>) null));
        aVar.l().l(C15461f.f133245h.a(), new b((C17164e<? super b>) null));
        C18169h.b(aVar);
    }
}
