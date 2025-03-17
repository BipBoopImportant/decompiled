package CH;

import QJ.C16342y0;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import io.ktor.utils.io.g;
import io.ktor.utils.io.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aR\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/g;", "LdI/i;", "context", "", "contentLength", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "", "listener", "a", "(Lio/ktor/utils/io/g;LdI/i;Ljava/lang/Long;LnI/q;)Lio/ktor/utils/io/g;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: CH.a  reason: case insensitive filesystem */
public final class C15489a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {23, 24, 26, 31}, m = "invokeSuspend")
    /* renamed from: CH.a$a  reason: collision with other inner class name */
    static final class C3291a extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f133466c;

        /* renamed from: d  reason: collision with root package name */
        Object f133467d;

        /* renamed from: e  reason: collision with root package name */
        Object f133468e;

        /* renamed from: f  reason: collision with root package name */
        Object f133469f;

        /* renamed from: g  reason: collision with root package name */
        Object f133470g;

        /* renamed from: h  reason: collision with root package name */
        long f133471h;

        /* renamed from: i  reason: collision with root package name */
        long f133472i;

        /* renamed from: j  reason: collision with root package name */
        int f133473j;

        /* renamed from: k  reason: collision with root package name */
        int f133474k;

        /* renamed from: l  reason: collision with root package name */
        private /* synthetic */ Object f133475l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Long f133476m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f133477n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ q<Long, Long, C17164e<? super C16807N>, Object> f133478o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3291a(Long l10, g gVar, q<? super Long, ? super Long, ? super C17164e<? super C16807N>, ? extends Object> qVar, C17164e<? super C3291a> eVar) {
            super(2, eVar);
            this.f133476m = l10;
            this.f133477n = gVar;
            this.f133478o = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3291a aVar = new C3291a(this.f133476m, this.f133477n, this.f133478o, eVar);
            aVar.f133475l = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((C3291a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: TH.f<byte[]>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x015e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f133474k
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L_0x00b2
                if (r2 == r8) goto L_0x008a
                if (r2 == r7) goto L_0x0061
                if (r2 == r6) goto L_0x002d
                if (r2 != r5) goto L_0x0025
                java.lang.Object r2 = r1.f133466c
                java.lang.Object r0 = r1.f133475l
                r3 = r0
                TH.f r3 = (TH.C16492f) r3
                XH.y.b(r21)     // Catch:{ all -> 0x0022 }
                goto L_0x01a4
            L_0x0022:
                r0 = move-exception
                goto L_0x01ac
            L_0x0025:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002d:
                long r9 = r1.f133472i
                long r11 = r1.f133471h
                java.lang.Object r2 = r1.f133470g
                byte[] r2 = (byte[]) r2
                java.lang.Object r13 = r1.f133469f
                java.lang.Object r14 = r1.f133468e
                nI.q r14 = (nI.q) r14
                java.lang.Object r15 = r1.f133467d
                io.ktor.utils.io.g r15 = (io.ktor.utils.io.g) r15
                java.lang.Object r5 = r1.f133466c
                TH.f r5 = (TH.C16492f) r5
                java.lang.Object r3 = r1.f133475l
                io.ktor.utils.io.u r3 = (io.ktor.utils.io.u) r3
                XH.y.b(r21)     // Catch:{ all -> 0x005c }
                r8 = r6
                r16 = r9
                r9 = r2
                r2 = r13
                r18 = r14
                r14 = r3
                r3 = r5
                r4 = r11
                r11 = r18
                r12 = r15
                r15 = r7
                r6 = r16
                goto L_0x016b
            L_0x005c:
                r0 = move-exception
                r3 = r5
                r2 = r13
                goto L_0x01ac
            L_0x0061:
                int r2 = r1.f133473j
                long r3 = r1.f133472i
                long r9 = r1.f133471h
                java.lang.Object r5 = r1.f133470g
                byte[] r5 = (byte[]) r5
                java.lang.Object r11 = r1.f133469f
                java.lang.Object r12 = r1.f133468e
                nI.q r12 = (nI.q) r12
                java.lang.Object r13 = r1.f133467d
                io.ktor.utils.io.g r13 = (io.ktor.utils.io.g) r13
                java.lang.Object r14 = r1.f133466c
                TH.f r14 = (TH.C16492f) r14
                java.lang.Object r15 = r1.f133475l
                io.ktor.utils.io.u r15 = (io.ktor.utils.io.u) r15
                XH.y.b(r21)     // Catch:{ all -> 0x0085 }
                r6 = r14
                r14 = r15
                r15 = r7
                goto L_0x0139
            L_0x0085:
                r0 = move-exception
                r2 = r11
                r3 = r14
                goto L_0x01ac
            L_0x008a:
                long r2 = r1.f133472i
                long r4 = r1.f133471h
                java.lang.Object r9 = r1.f133470g
                byte[] r9 = (byte[]) r9
                java.lang.Object r10 = r1.f133469f
                java.lang.Object r11 = r1.f133468e
                nI.q r11 = (nI.q) r11
                java.lang.Object r12 = r1.f133467d
                io.ktor.utils.io.g r12 = (io.ktor.utils.io.g) r12
                java.lang.Object r13 = r1.f133466c
                TH.f r13 = (TH.C16492f) r13
                java.lang.Object r14 = r1.f133475l
                io.ktor.utils.io.u r14 = (io.ktor.utils.io.u) r14
                XH.y.b(r21)     // Catch:{ all -> 0x00ad }
                r6 = r2
                r2 = r10
                r3 = r13
                r10 = r21
                goto L_0x0104
            L_0x00ad:
                r0 = move-exception
                r2 = r10
                r3 = r13
                goto L_0x01ac
            L_0x00b2:
                XH.y.b(r21)
                java.lang.Object r2 = r1.f133475l
                io.ktor.utils.io.u r2 = (io.ktor.utils.io.u) r2
                TH.f r3 = TH.C16487a.a()
                java.lang.Long r4 = r1.f133476m
                io.ktor.utils.io.g r5 = r1.f133477n
                nI.q<java.lang.Long, java.lang.Long, dI.e<? super XH.N>, java.lang.Object> r9 = r1.f133478o
                java.lang.Object r10 = r3.Q1()
                r11 = r10
                byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x00d1 }
                if (r4 == 0) goto L_0x00d5
                long r12 = r4.longValue()     // Catch:{ all -> 0x00d1 }
                goto L_0x00d7
            L_0x00d1:
                r0 = move-exception
                r2 = r10
                goto L_0x01ac
            L_0x00d5:
                r12 = -1
            L_0x00d7:
                r14 = r2
                r2 = r10
                r6 = 0
                r16 = r12
                r12 = r5
                r4 = r16
                r18 = r11
                r11 = r9
                r9 = r18
            L_0x00e5:
                boolean r10 = r12.m()     // Catch:{ all -> 0x0022 }
                if (r10 != 0) goto L_0x0172
                r1.f133475l = r14     // Catch:{ all -> 0x0022 }
                r1.f133466c = r3     // Catch:{ all -> 0x0022 }
                r1.f133467d = r12     // Catch:{ all -> 0x0022 }
                r1.f133468e = r11     // Catch:{ all -> 0x0022 }
                r1.f133469f = r2     // Catch:{ all -> 0x0022 }
                r1.f133470g = r9     // Catch:{ all -> 0x0022 }
                r1.f133471h = r4     // Catch:{ all -> 0x0022 }
                r1.f133472i = r6     // Catch:{ all -> 0x0022 }
                r1.f133474k = r8     // Catch:{ all -> 0x0022 }
                java.lang.Object r10 = io.ktor.utils.io.i.c(r12, r9, r1)     // Catch:{ all -> 0x0022 }
                if (r10 != r0) goto L_0x0104
                return r0
            L_0x0104:
                java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0022 }
                int r10 = r10.intValue()     // Catch:{ all -> 0x0022 }
                io.ktor.utils.io.j r8 = r14.d()     // Catch:{ all -> 0x0022 }
                r1.f133475l = r14     // Catch:{ all -> 0x0022 }
                r1.f133466c = r3     // Catch:{ all -> 0x0022 }
                r1.f133467d = r12     // Catch:{ all -> 0x0022 }
                r1.f133468e = r11     // Catch:{ all -> 0x0022 }
                r1.f133469f = r2     // Catch:{ all -> 0x0022 }
                r1.f133470g = r9     // Catch:{ all -> 0x0022 }
                r1.f133471h = r4     // Catch:{ all -> 0x0022 }
                r1.f133472i = r6     // Catch:{ all -> 0x0022 }
                r1.f133473j = r10     // Catch:{ all -> 0x0022 }
                r15 = 2
                r1.f133474k = r15     // Catch:{ all -> 0x0022 }
                r13 = 0
                java.lang.Object r8 = r8.l(r9, r13, r10, r1)     // Catch:{ all -> 0x0022 }
                if (r8 != r0) goto L_0x012b
                return r0
            L_0x012b:
                r13 = r12
                r12 = r11
                r11 = r2
                r2 = r10
                r16 = r6
                r6 = r3
                r18 = r4
                r5 = r9
                r9 = r18
                r3 = r16
            L_0x0139:
                long r7 = (long) r2
                long r2 = r3 + r7
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.f(r2)     // Catch:{ all -> 0x016e }
                java.lang.Long r7 = kotlin.coroutines.jvm.internal.b.f(r9)     // Catch:{ all -> 0x016e }
                r1.f133475l = r14     // Catch:{ all -> 0x016e }
                r1.f133466c = r6     // Catch:{ all -> 0x016e }
                r1.f133467d = r13     // Catch:{ all -> 0x016e }
                r1.f133468e = r12     // Catch:{ all -> 0x016e }
                r1.f133469f = r11     // Catch:{ all -> 0x016e }
                r1.f133470g = r5     // Catch:{ all -> 0x016e }
                r1.f133471h = r9     // Catch:{ all -> 0x016e }
                r1.f133472i = r2     // Catch:{ all -> 0x016e }
                r8 = 3
                r1.f133474k = r8     // Catch:{ all -> 0x016e }
                java.lang.Object r4 = r12.invoke(r4, r7, r1)     // Catch:{ all -> 0x016e }
                if (r4 != r0) goto L_0x015e
                return r0
            L_0x015e:
                r16 = r9
                r9 = r5
                r4 = r16
                r18 = r2
                r3 = r6
                r6 = r18
                r2 = r11
                r11 = r12
                r12 = r13
            L_0x016b:
                r8 = 1
                goto L_0x00e5
            L_0x016e:
                r0 = move-exception
                r3 = r6
                r2 = r11
                goto L_0x01ac
            L_0x0172:
                java.lang.Throwable r8 = r12.c()     // Catch:{ all -> 0x0022 }
                io.ktor.utils.io.j r9 = r14.d()     // Catch:{ all -> 0x0022 }
                r9.a(r8)     // Catch:{ all -> 0x0022 }
                if (r8 != 0) goto L_0x01a4
                r8 = 0
                int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r8 != 0) goto L_0x01a4
                java.lang.Long r6 = kotlin.coroutines.jvm.internal.b.f(r6)     // Catch:{ all -> 0x0022 }
                java.lang.Long r4 = kotlin.coroutines.jvm.internal.b.f(r4)     // Catch:{ all -> 0x0022 }
                r1.f133475l = r3     // Catch:{ all -> 0x0022 }
                r1.f133466c = r2     // Catch:{ all -> 0x0022 }
                r5 = 0
                r1.f133467d = r5     // Catch:{ all -> 0x0022 }
                r1.f133468e = r5     // Catch:{ all -> 0x0022 }
                r1.f133469f = r5     // Catch:{ all -> 0x0022 }
                r1.f133470g = r5     // Catch:{ all -> 0x0022 }
                r5 = 4
                r1.f133474k = r5     // Catch:{ all -> 0x0022 }
                java.lang.Object r4 = r11.invoke(r6, r4, r1)     // Catch:{ all -> 0x0022 }
                if (r4 != r0) goto L_0x01a4
                return r0
            L_0x01a4:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0022 }
                r3.f3(r2)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x01ac:
                r3.f3(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: CH.C15489a.C3291a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final g a(g gVar, C17168i iVar, Long l10, q<? super Long, ? super Long, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(iVar, "context");
        C17542s.j(qVar, "listener");
        return io.ktor.utils.io.q.b(C16342y0.f137687a, iVar, true, new C3291a(l10, gVar, qVar, (C17164e<? super C3291a>) null)).d();
    }
}
