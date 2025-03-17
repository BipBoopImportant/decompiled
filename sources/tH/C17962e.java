package tH;

import AH.C15413d;
import EH.C15631p;
import FH.d;
import GK.C15774B;
import GK.C15775C;
import GK.C15805x;
import GK.z;
import QJ.C16342y0;
import WK.C16772g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import io.ktor.utils.io.q;
import io.ktor.utils.io.u;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qH.C17783h;
import sH.m;
import vH.C18184w;
import vH.C18185x;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LWK/g;", "LdI/i;", "context", "LAH/d;", "requestData", "Lio/ktor/utils/io/g;", "i", "(LWK/g;LdI/i;LAH/d;)Lio/ktor/utils/io/g;", "", "cause", "request", "g", "(Ljava/lang/Throwable;LAH/d;)Ljava/lang/Throwable;", "callContext", "LGK/B;", "f", "(LAH/d;LdI/i;)LGK/B;", "LFH/d;", "LGK/C;", "e", "(LFH/d;LdI/i;)LGK/C;", "LGK/z$a;", "LvH/w$a;", "timeoutAttributes", "h", "(LGK/z$a;LvH/w$a;)LGK/z$a;", "ktor-client-okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: tH.e  reason: case insensitive filesystem */
public final class C17962e {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.e$a */
    static final class a extends C17544u implements C17631a<g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FH.d f147271c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FH.d dVar) {
            super(0);
            this.f147271c = dVar;
        }

        /* renamed from: b */
        public final g invoke() {
            return ((d.c) this.f147271c).e();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/g;", "b", "()Lio/ktor/utils/io/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.e$b */
    static final class b extends C17544u implements C17631a<g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17168i f147272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FH.d f147273d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", l = {204}, m = "invokeSuspend")
        /* renamed from: tH.e$b$a */
        static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f147274c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f147275d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ FH.d f147276e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(FH.d dVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f147276e = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f147276e, eVar);
                aVar.f147275d = obj;
                return aVar;
            }

            /* renamed from: i */
            public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
                return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f147274c;
                if (i10 == 0) {
                    y.b(obj);
                    j d10 = ((u) this.f147275d).d();
                    this.f147274c = 1;
                    if (((d.C3307d) this.f147276e).e(d10, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17168i iVar, FH.d dVar) {
            super(0);
            this.f147272c = iVar;
            this.f147273d = dVar;
        }

        /* renamed from: b */
        public final g invoke() {
            return q.c(C16342y0.f137687a, this.f147272c, false, new a(this.f147273d, (C17164e<? super a>) null), 2, (Object) null).d();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "key", "value", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.e$c */
    static final class c extends C17544u implements p<String, String, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15774B.a f147277c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C15774B.a aVar) {
            super(2);
            this.f147277c = aVar;
        }

        public final void a(String str, String str2) {
            C17542s.j(str, "key");
            C17542s.j(str2, "value");
            if (!C17542s.e(str, C15631p.f134088a.g())) {
                this.f147277c.a(str, str2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (String) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {155}, m = "invokeSuspend")
    /* renamed from: tH.e$d */
    static final class d extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f147278c;

        /* renamed from: d  reason: collision with root package name */
        Object f147279d;

        /* renamed from: e  reason: collision with root package name */
        Object f147280e;

        /* renamed from: f  reason: collision with root package name */
        Object f147281f;

        /* renamed from: g  reason: collision with root package name */
        Object f147282g;

        /* renamed from: h  reason: collision with root package name */
        int f147283h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f147284i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C16772g f147285j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17168i f147286k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C15413d f147287l;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/nio/ByteBuffer;", "buffer", "LXH/N;", "a", "(Ljava/nio/ByteBuffer;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: tH.e$d$a */
        static final class a extends C17544u implements C17642l<ByteBuffer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ M f147288c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16772g f147289d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C15413d f147290e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(M m10, C16772g gVar, C15413d dVar) {
                super(1);
                this.f147288c = m10;
                this.f147289d = gVar;
                this.f147290e = dVar;
            }

            public final void a(ByteBuffer byteBuffer) {
                C17542s.j(byteBuffer, "buffer");
                try {
                    this.f147288c.f144346a = this.f147289d.read(byteBuffer);
                } catch (Throwable th2) {
                    throw C17962e.g(th2, this.f147290e);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ByteBuffer) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C16772g gVar, C17168i iVar, C15413d dVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f147285j = gVar;
            this.f147286k = iVar;
            this.f147287l = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f147285j, this.f147286k, this.f147287l, eVar);
            dVar.f147284i = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((d) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: WK.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: WK.g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: WK.g} */
        /* JADX WARNING: type inference failed for: r11v4 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[Catch:{ all -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[Catch:{ all -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[SYNTHETIC, Splitter:B:35:0x00a0] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r7 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f147283h
                r8 = 1
                r9 = 0
                if (r1 == 0) goto L_0x003c
                if (r1 != r8) goto L_0x0034
                java.lang.Object r1 = r7.f147282g
                kotlin.jvm.internal.M r1 = (kotlin.jvm.internal.M) r1
                java.lang.Object r2 = r7.f147281f
                WK.g r2 = (WK.C16772g) r2
                java.lang.Object r3 = r7.f147280e
                AH.d r3 = (AH.C15413d) r3
                java.lang.Object r4 = r7.f147279d
                dI.i r4 = (dI.C17168i) r4
                java.lang.Object r5 = r7.f147278c
                java.io.Closeable r5 = (java.io.Closeable) r5
                java.lang.Object r6 = r7.f147284i
                io.ktor.utils.io.u r6 = (io.ktor.utils.io.u) r6
                XH.y.b(r18)     // Catch:{ all -> 0x0030 }
                r10 = r1
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                goto L_0x0087
            L_0x0030:
                r0 = move-exception
                r1 = r0
                goto L_0x009e
            L_0x0034:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x003c:
                XH.y.b(r18)
                java.lang.Object r1 = r7.f147284i
                io.ktor.utils.io.u r1 = (io.ktor.utils.io.u) r1
                WK.g r5 = r7.f147285j
                dI.i r2 = r7.f147286k
                AH.d r3 = r7.f147287l
                kotlin.jvm.internal.M r4 = new kotlin.jvm.internal.M     // Catch:{ all -> 0x0030 }
                r4.<init>()     // Catch:{ all -> 0x0030 }
                r15 = r1
                r13 = r2
                r12 = r3
                r10 = r4
                r11 = r5
                r14 = r11
            L_0x0054:
                boolean r1 = r11.isOpen()     // Catch:{ all -> 0x008f }
                if (r1 == 0) goto L_0x0093
                boolean r1 = QJ.I0.p(r13)     // Catch:{ all -> 0x008f }
                if (r1 == 0) goto L_0x0093
                int r1 = r10.f144346a     // Catch:{ all -> 0x008f }
                if (r1 < 0) goto L_0x0093
                io.ktor.utils.io.j r1 = r15.d()     // Catch:{ all -> 0x008f }
                tH.e$d$a r3 = new tH.e$d$a     // Catch:{ all -> 0x008f }
                r3.<init>(r10, r11, r12)     // Catch:{ all -> 0x008f }
                r7.f147284i = r15     // Catch:{ all -> 0x008f }
                r7.f147278c = r14     // Catch:{ all -> 0x008f }
                r7.f147279d = r13     // Catch:{ all -> 0x008f }
                r7.f147280e = r12     // Catch:{ all -> 0x008f }
                r7.f147281f = r11     // Catch:{ all -> 0x008f }
                r7.f147282g = r10     // Catch:{ all -> 0x008f }
                r7.f147283h = r8     // Catch:{ all -> 0x008f }
                r2 = 0
                r5 = 1
                r6 = 0
                r4 = r17
                java.lang.Object r1 = io.ktor.utils.io.j.a.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008f }
                if (r1 != r0) goto L_0x0087
                return r0
            L_0x0087:
                io.ktor.utils.io.j r1 = r15.d()     // Catch:{ all -> 0x008f }
                r1.flush()     // Catch:{ all -> 0x008f }
                goto L_0x0054
            L_0x008f:
                r0 = move-exception
                r1 = r0
                r5 = r14
                goto L_0x009e
            L_0x0093:
                XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x008f }
                if (r14 == 0) goto L_0x00ae
                r14.close()     // Catch:{ all -> 0x009b }
                goto L_0x00ae
            L_0x009b:
                r0 = move-exception
                r9 = r0
                goto L_0x00ae
            L_0x009e:
                if (r5 == 0) goto L_0x00a9
                r5.close()     // Catch:{ all -> 0x00a4 }
                goto L_0x00a9
            L_0x00a4:
                r0 = move-exception
                r2 = r0
                XH.C16816g.a(r1, r2)
            L_0x00a9:
                r16 = r9
                r9 = r1
                r1 = r16
            L_0x00ae:
                if (r9 != 0) goto L_0x00b6
                kotlin.jvm.internal.C17542s.g(r1)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x00b6:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tH.C17962e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final C15775C e(FH.d dVar, C17168i iVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(iVar, "callContext");
        if (dVar instanceof d.a) {
            byte[] e10 = ((d.a) dVar).e();
            return C15775C.f134790a.h(e10, C15805x.f135130e.b(String.valueOf(dVar.b())), 0, e10.length);
        } else if (dVar instanceof d.c) {
            return new j(dVar.a(), new a(dVar));
        } else {
            if (dVar instanceof d.C3307d) {
                return new j(dVar.a(), new b(iVar, dVar));
            }
            if (dVar instanceof d.b) {
                return C15775C.f134790a.h(new byte[0], (C15805x) null, 0, 0);
            }
            throw new C17783h(dVar);
        }
    }

    /* access modifiers changed from: private */
    public static final C15774B f(C15413d dVar, C17168i iVar) {
        C15774B.a aVar = new C15774B.a();
        aVar.n(dVar.h().toString());
        m.c(dVar.e(), dVar.b(), new c(aVar));
        aVar.g(dVar.f().d(), MK.f.b(dVar.f().d()) ? e(dVar.b(), iVar) : null);
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public static final Throwable g(Throwable th2, C15413d dVar) {
        return th2 instanceof SocketTimeoutException ? C18185x.b(dVar, th2) : th2;
    }

    /* access modifiers changed from: private */
    public static final z.a h(z.a aVar, C18184w.a aVar2) {
        Long c10 = aVar2.c();
        if (c10 != null) {
            aVar.f(C18185x.d(c10.longValue()), TimeUnit.MILLISECONDS);
        }
        Long e10 = aVar2.e();
        if (e10 != null) {
            long longValue = e10.longValue();
            long d10 = C18185x.d(longValue);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.R(d10, timeUnit);
            aVar.U(C18185x.d(longValue), timeUnit);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final g i(C16772g gVar, C17168i iVar, C15413d dVar) {
        return q.c(C16342y0.f137687a, iVar, false, new d(gVar, iVar, dVar, (C17164e<? super d>) null), 2, (Object) null).d();
    }
}
