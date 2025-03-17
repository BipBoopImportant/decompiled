package JH;

import QJ.C16311i0;
import QJ.C16342y0;
import QJ.Q;
import QJ.T;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/g;", "LQJ/Q;", "coroutineScope", "LXH/v;", "b", "(Lio/ktor/utils/io/g;LQJ/Q;)LXH/v;", "Lio/ktor/utils/io/j;", "first", "second", "LXH/N;", "a", "(Lio/ktor/utils/io/g;Lio/ktor/utils/io/j;Lio/ktor/utils/io/j;)V", "", "c", "(Lio/ktor/utils/io/g;LdI/e;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", l = {61, 63, 64}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f135684c;

        /* renamed from: d  reason: collision with root package name */
        Object f135685d;

        /* renamed from: e  reason: collision with root package name */
        Object f135686e;

        /* renamed from: f  reason: collision with root package name */
        Object f135687f;

        /* renamed from: g  reason: collision with root package name */
        Object f135688g;

        /* renamed from: h  reason: collision with root package name */
        int f135689h;

        /* renamed from: i  reason: collision with root package name */
        int f135690i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f135691j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ j f135692k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ j f135693l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, j jVar, j jVar2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f135691j = gVar;
            this.f135692k = jVar;
            this.f135693l = jVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f135691j, this.f135692k, this.f135693l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[Catch:{ all -> 0x005d, all -> 0x0114 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7 A[Catch:{ all -> 0x0027 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0 A[Catch:{ all -> 0x0027 }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2 A[Catch:{ all -> 0x005d, all -> 0x0114 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f135690i
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0060
                if (r1 == r4) goto L_0x0059
                if (r1 == r3) goto L_0x0032
                if (r1 != r2) goto L_0x002a
                java.lang.Object r1 = r11.f135687f
                io.ktor.utils.io.g r1 = (io.ktor.utils.io.g) r1
                java.lang.Object r6 = r11.f135686e
                io.ktor.utils.io.j r6 = (io.ktor.utils.io.j) r6
                java.lang.Object r7 = r11.f135685d
                io.ktor.utils.io.j r7 = (io.ktor.utils.io.j) r7
                java.lang.Object r8 = r11.f135684c
                java.io.Closeable r8 = (java.io.Closeable) r8
                XH.y.b(r12)     // Catch:{ all -> 0x0027 }
                goto L_0x00d1
            L_0x0027:
                r12 = move-exception
                goto L_0x00d4
            L_0x002a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0032:
                int r1 = r11.f135689h
                java.lang.Object r6 = r11.f135688g
                RH.k r6 = (RH.k) r6
                java.lang.Object r7 = r11.f135687f
                io.ktor.utils.io.g r7 = (io.ktor.utils.io.g) r7
                java.lang.Object r8 = r11.f135686e
                io.ktor.utils.io.j r8 = (io.ktor.utils.io.j) r8
                java.lang.Object r9 = r11.f135685d
                io.ktor.utils.io.j r9 = (io.ktor.utils.io.j) r9
                java.lang.Object r10 = r11.f135684c
                java.io.Closeable r10 = (java.io.Closeable) r10
                XH.y.b(r12)     // Catch:{ all -> 0x0052 }
                r12 = r6
                r6 = r8
                r8 = r10
                r10 = r1
                r1 = r7
                r7 = r9
                goto L_0x00b8
            L_0x0052:
                r12 = move-exception
                r1 = r7
                r6 = r8
                r7 = r9
                r8 = r10
                goto L_0x00d4
            L_0x0059:
                XH.y.b(r12)     // Catch:{ all -> 0x005d }
                goto L_0x0092
            L_0x005d:
                r12 = move-exception
                goto L_0x0106
            L_0x0060:
                XH.y.b(r12)
            L_0x0063:
                io.ktor.utils.io.g r12 = r11.f135691j     // Catch:{ all -> 0x005d }
                boolean r12 = r12.m()     // Catch:{ all -> 0x005d }
                if (r12 != 0) goto L_0x00f2
                io.ktor.utils.io.j r12 = r11.f135692k     // Catch:{ all -> 0x005d }
                boolean r12 = r12.h()     // Catch:{ all -> 0x005d }
                if (r12 == 0) goto L_0x007b
                io.ktor.utils.io.j r12 = r11.f135693l     // Catch:{ all -> 0x005d }
                boolean r12 = r12.h()     // Catch:{ all -> 0x005d }
                if (r12 != 0) goto L_0x00f2
            L_0x007b:
                io.ktor.utils.io.g r12 = r11.f135691j     // Catch:{ all -> 0x005d }
                r11.f135684c = r5     // Catch:{ all -> 0x005d }
                r11.f135685d = r5     // Catch:{ all -> 0x005d }
                r11.f135686e = r5     // Catch:{ all -> 0x005d }
                r11.f135687f = r5     // Catch:{ all -> 0x005d }
                r11.f135688g = r5     // Catch:{ all -> 0x005d }
                r11.f135690i = r4     // Catch:{ all -> 0x005d }
                r6 = 4096(0x1000, double:2.0237E-320)
                java.lang.Object r12 = r12.d(r6, r11)     // Catch:{ all -> 0x005d }
                if (r12 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r8 = r12
                java.io.Closeable r8 = (java.io.Closeable) r8     // Catch:{ all -> 0x005d }
                io.ktor.utils.io.j r7 = r11.f135692k     // Catch:{ all -> 0x005d }
                io.ktor.utils.io.j r6 = r11.f135693l     // Catch:{ all -> 0x005d }
                io.ktor.utils.io.g r1 = r11.f135691j     // Catch:{ all -> 0x005d }
                r12 = r8
                RH.k r12 = (RH.k) r12     // Catch:{ all -> 0x00e6 }
                RH.k r9 = r12.a1()     // Catch:{ all -> 0x0027 }
                r11.f135684c = r8     // Catch:{ all -> 0x0027 }
                r11.f135685d = r7     // Catch:{ all -> 0x0027 }
                r11.f135686e = r6     // Catch:{ all -> 0x0027 }
                r11.f135687f = r1     // Catch:{ all -> 0x0027 }
                r11.f135688g = r12     // Catch:{ all -> 0x0027 }
                r10 = 0
                r11.f135689h = r10     // Catch:{ all -> 0x0027 }
                r11.f135690i = r3     // Catch:{ all -> 0x0027 }
                java.lang.Object r9 = r7.n(r9, r11)     // Catch:{ all -> 0x0027 }
                if (r9 != r0) goto L_0x00b8
                return r0
            L_0x00b8:
                RH.k r12 = r12.a1()     // Catch:{ all -> 0x0027 }
                r11.f135684c = r8     // Catch:{ all -> 0x0027 }
                r11.f135685d = r7     // Catch:{ all -> 0x0027 }
                r11.f135686e = r6     // Catch:{ all -> 0x0027 }
                r11.f135687f = r1     // Catch:{ all -> 0x0027 }
                r11.f135688g = r5     // Catch:{ all -> 0x0027 }
                r11.f135689h = r10     // Catch:{ all -> 0x0027 }
                r11.f135690i = r2     // Catch:{ all -> 0x0027 }
                java.lang.Object r12 = r6.n(r12, r11)     // Catch:{ all -> 0x0027 }
                if (r12 != r0) goto L_0x00d1
                return r0
            L_0x00d1:
                XH.N r12 = XH.C16807N.f139792a     // Catch:{ all -> 0x0027 }
                goto L_0x00e1
            L_0x00d4:
                r1.p(r12)     // Catch:{ all -> 0x00e6 }
                r7.a(r12)     // Catch:{ all -> 0x00e6 }
                boolean r12 = r6.a(r12)     // Catch:{ all -> 0x00e6 }
                kotlin.coroutines.jvm.internal.b.a(r12)     // Catch:{ all -> 0x00e6 }
            L_0x00e1:
                r8.close()     // Catch:{ all -> 0x005d }
                goto L_0x0063
            L_0x00e6:
                r12 = move-exception
                r8.close()     // Catch:{ all -> 0x00eb }
                goto L_0x00ef
            L_0x00eb:
                r0 = move-exception
                RH.l.a(r12, r0)     // Catch:{ all -> 0x00f0 }
            L_0x00ef:
                throw r12     // Catch:{ all -> 0x00f0 }
            L_0x00f0:
                r12 = move-exception
                throw r12     // Catch:{ all -> 0x005d }
            L_0x00f2:
                io.ktor.utils.io.g r12 = r11.f135691j     // Catch:{ all -> 0x005d }
                java.lang.Throwable r12 = r12.c()     // Catch:{ all -> 0x005d }
                if (r12 != 0) goto L_0x0105
            L_0x00fa:
                io.ktor.utils.io.j r12 = r11.f135692k
                io.ktor.utils.io.k.a(r12)
                io.ktor.utils.io.j r12 = r11.f135693l
                io.ktor.utils.io.k.a(r12)
                goto L_0x0111
            L_0x0105:
                throw r12     // Catch:{ all -> 0x005d }
            L_0x0106:
                io.ktor.utils.io.j r0 = r11.f135692k     // Catch:{ all -> 0x0114 }
                r0.a(r12)     // Catch:{ all -> 0x0114 }
                io.ktor.utils.io.j r0 = r11.f135693l     // Catch:{ all -> 0x0114 }
                r0.a(r12)     // Catch:{ all -> 0x0114 }
                goto L_0x00fa
            L_0x0111:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x0114:
                r12 = move-exception
                io.ktor.utils.io.j r0 = r11.f135692k
                io.ktor.utils.io.k.a(r0)
                io.ktor.utils.io.j r0 = r11.f135693l
                io.ktor.utils.io.k.a(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: JH.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f135694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f135695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar, j jVar2) {
            super(1);
            this.f135694c = jVar;
            this.f135695d = jVar2;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f135694c.a(th2);
                this.f135695d.a(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", l = {27, 31}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f135696c;

        /* renamed from: d  reason: collision with root package name */
        int f135697d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f135698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f135699f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f135700g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f135701h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", l = {29}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f135702c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f135703d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ byte[] f135704e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f135705f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(io.ktor.utils.io.c cVar, byte[] bArr, int i10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f135703d = cVar;
                this.f135704e = bArr;
                this.f135705f = i10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f135703d, this.f135704e, this.f135705f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f135702c;
                if (i10 == 0) {
                    y.b(obj);
                    io.ktor.utils.io.c cVar = this.f135703d;
                    byte[] bArr = this.f135704e;
                    int i11 = this.f135705f;
                    this.f135702c = 1;
                    if (cVar.l(bArr, 0, i11, this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", l = {30}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f135706c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.c f135707d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ byte[] f135708e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f135709f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(io.ktor.utils.io.c cVar, byte[] bArr, int i10, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f135707d = cVar;
                this.f135708e = bArr;
                this.f135709f = i10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f135707d, this.f135708e, this.f135709f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f135706c;
                if (i10 == 0) {
                    y.b(obj);
                    io.ktor.utils.io.c cVar = this.f135707d;
                    byte[] bArr = this.f135708e;
                    int i11 = this.f135709f;
                    this.f135706c = 1;
                    if (cVar.l(bArr, 0, i11, this) == f10) {
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
        c(g gVar, io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f135699f = gVar;
            this.f135700g = cVar;
            this.f135701h = cVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f135699f, this.f135700g, this.f135701h, eVar);
            cVar.f135698e = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x009e A[Catch:{ all -> 0x001b, all -> 0x00d5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                r0 = 1
                r1 = 2
                java.lang.Object r2 = eI.C17187b.f()
                int r3 = r13.f135697d
                if (r3 == 0) goto L_0x0033
                if (r3 == r0) goto L_0x0026
                if (r3 != r1) goto L_0x001e
                java.lang.Object r3 = r13.f135696c
                byte[] r3 = (byte[]) r3
                java.lang.Object r4 = r13.f135698e
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r14)     // Catch:{ all -> 0x001b }
                r14 = r4
                goto L_0x0044
            L_0x001b:
                r14 = move-exception
                goto L_0x00bb
            L_0x001e:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0026:
                java.lang.Object r3 = r13.f135696c
                byte[] r3 = (byte[]) r3
                java.lang.Object r4 = r13.f135698e
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r14)     // Catch:{ all -> 0x001b }
                r10 = r4
                goto L_0x005d
            L_0x0033:
                XH.y.b(r14)
                java.lang.Object r14 = r13.f135698e
                QJ.Q r14 = (QJ.Q) r14
                TH.f r3 = TH.C16487a.a()
                java.lang.Object r3 = r3.Q1()
                byte[] r3 = (byte[]) r3
            L_0x0044:
                io.ktor.utils.io.g r4 = r13.f135699f     // Catch:{ all -> 0x001b }
                boolean r4 = r4.m()     // Catch:{ all -> 0x001b }
                if (r4 != 0) goto L_0x00a0
                io.ktor.utils.io.g r4 = r13.f135699f     // Catch:{ all -> 0x001b }
                r13.f135698e = r14     // Catch:{ all -> 0x001b }
                r13.f135696c = r3     // Catch:{ all -> 0x001b }
                r13.f135697d = r0     // Catch:{ all -> 0x001b }
                java.lang.Object r4 = io.ktor.utils.io.i.c(r4, r3, r13)     // Catch:{ all -> 0x001b }
                if (r4 != r2) goto L_0x005b
                return r2
            L_0x005b:
                r10 = r14
                r14 = r4
            L_0x005d:
                java.lang.Number r14 = (java.lang.Number) r14     // Catch:{ all -> 0x001b }
                int r14 = r14.intValue()     // Catch:{ all -> 0x001b }
                JH.f$c$a r7 = new JH.f$c$a     // Catch:{ all -> 0x001b }
                io.ktor.utils.io.c r4 = r13.f135700g     // Catch:{ all -> 0x001b }
                r11 = 0
                r7.<init>(r4, r3, r14, r11)     // Catch:{ all -> 0x001b }
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                r4 = r10
                QJ.Y r12 = QJ.C16314k.b(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
                JH.f$c$b r7 = new JH.f$c$b     // Catch:{ all -> 0x001b }
                io.ktor.utils.io.c r4 = r13.f135701h     // Catch:{ all -> 0x001b }
                r7.<init>(r4, r3, r14, r11)     // Catch:{ all -> 0x001b }
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                r4 = r10
                QJ.Y r14 = QJ.C16314k.b(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
                QJ.Y[] r4 = new QJ.Y[r1]     // Catch:{ all -> 0x001b }
                r5 = 0
                r4[r5] = r12     // Catch:{ all -> 0x001b }
                r4[r0] = r14     // Catch:{ all -> 0x001b }
                java.util.List r14 = YH.C16877v.q(r4)     // Catch:{ all -> 0x001b }
                java.util.Collection r14 = (java.util.Collection) r14     // Catch:{ all -> 0x001b }
                r13.f135698e = r10     // Catch:{ all -> 0x001b }
                r13.f135696c = r3     // Catch:{ all -> 0x001b }
                r13.f135697d = r1     // Catch:{ all -> 0x001b }
                java.lang.Object r14 = QJ.C16304f.a(r14, r13)     // Catch:{ all -> 0x001b }
                if (r14 != r2) goto L_0x009e
                return r2
            L_0x009e:
                r14 = r10
                goto L_0x0044
            L_0x00a0:
                io.ktor.utils.io.g r14 = r13.f135699f     // Catch:{ all -> 0x001b }
                java.lang.Throwable r14 = r14.c()     // Catch:{ all -> 0x001b }
                if (r14 != 0) goto L_0x00ba
                TH.f r14 = TH.C16487a.a()
                r14.f3(r3)
            L_0x00af:
                io.ktor.utils.io.c r14 = r13.f135700g
                io.ktor.utils.io.k.a(r14)
                io.ktor.utils.io.c r14 = r13.f135701h
                io.ktor.utils.io.k.a(r14)
                goto L_0x00d2
            L_0x00ba:
                throw r14     // Catch:{ all -> 0x001b }
            L_0x00bb:
                io.ktor.utils.io.g r0 = r13.f135699f     // Catch:{ all -> 0x00d5 }
                r0.p(r14)     // Catch:{ all -> 0x00d5 }
                io.ktor.utils.io.c r0 = r13.f135700g     // Catch:{ all -> 0x00d5 }
                r0.p(r14)     // Catch:{ all -> 0x00d5 }
                io.ktor.utils.io.c r0 = r13.f135701h     // Catch:{ all -> 0x00d5 }
                r0.p(r14)     // Catch:{ all -> 0x00d5 }
                TH.f r14 = TH.C16487a.a()
                r14.f3(r3)
                goto L_0x00af
            L_0x00d2:
                XH.N r14 = XH.C16807N.f139792a
                return r14
            L_0x00d5:
                r14 = move-exception
                TH.f r0 = TH.C16487a.a()
                r0.f3(r3)
                io.ktor.utils.io.c r0 = r13.f135700g
                io.ktor.utils.io.k.a(r0)
                io.ktor.utils.io.c r0 = r13.f135701h
                io.ktor.utils.io.k.a(r0)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: JH.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f135710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.c f135711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(io.ktor.utils.io.c cVar, io.ktor.utils.io.c cVar2) {
            super(1);
            this.f135710c = cVar;
            this.f135711d = cVar2;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f135710c.p(th2);
                this.f135711d.p(th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.ByteChannelsKt", f = "ByteChannels.kt", l = {91}, m = "toByteArray")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f135712c;

        /* renamed from: d  reason: collision with root package name */
        int f135713d;

        e(C17164e<? super e> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f135712c = obj;
            this.f135713d |= Integer.MIN_VALUE;
            return f.c((g) null, this);
        }
    }

    public static final void a(g gVar, j jVar, j jVar2) {
        C17542s.j(gVar, "<this>");
        C17542s.j(jVar, "first");
        C17542s.j(jVar2, "second");
        C16314k.d(C16342y0.f137687a, C16311i0.d(), (T) null, new a(gVar, jVar, jVar2, (C17164e<? super a>) null), 2, (Object) null).s(new b(jVar, jVar2));
    }

    public static final v<g, g> b(g gVar, Q q10) {
        C17542s.j(gVar, "<this>");
        C17542s.j(q10, "coroutineScope");
        io.ktor.utils.io.c a10 = io.ktor.utils.io.e.a(true);
        io.ktor.utils.io.c a11 = io.ktor.utils.io.e.a(true);
        C16314k.d(q10, (C17168i) null, (T) null, new c(gVar, a10, a11, (C17164e<? super c>) null), 3, (Object) null).s(new d(a10, a11));
        return C16796C.a(a10, a11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(io.ktor.utils.io.g r8, dI.C17164e<? super byte[]> r9) {
        /*
            boolean r0 = r9 instanceof JH.f.e
            if (r0 == 0) goto L_0x0014
            r0 = r9
            JH.f$e r0 = (JH.f.e) r0
            int r1 = r0.f135713d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f135713d = r1
        L_0x0012:
            r4 = r0
            goto L_0x001a
        L_0x0014:
            JH.f$e r0 = new JH.f$e
            r0.<init>(r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r4.f135712c
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r4.f135713d
            r7 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r7) goto L_0x002b
            XH.y.b(r9)
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            XH.y.b(r9)
            r4.f135713d = r7
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r8
            java.lang.Object r9 = io.ktor.utils.io.g.b.a(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L_0x0044
            return r0
        L_0x0044:
            RH.k r9 = (RH.k) r9
            r8 = 0
            r0 = 0
            byte[] r8 = RH.w.c(r9, r8, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: JH.f.c(io.ktor.utils.io.g, dI.e):java.lang.Object");
    }
}
