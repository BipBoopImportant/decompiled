package io.ktor.utils.io.jvm.javaio;

import QJ.C16311i0;
import QJ.C16342y0;
import TH.C16487a;
import TH.C16492f;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import io.ktor.utils.io.g;
import io.ktor.utils.io.q;
import io.ktor.utils.io.u;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/io/InputStream;", "LdI/i;", "context", "LTH/f;", "", "pool", "Lio/ktor/utils/io/g;", "a", "(Ljava/io/InputStream;LdI/i;LTH/f;)Lio/ktor/utils/io/g;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/u;", "LXH/N;", "<anonymous>", "(Lio/ktor/utils/io/u;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", l = {90}, m = "invokeSuspend")
    static final class a extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f143817c;

        /* renamed from: d  reason: collision with root package name */
        int f143818d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f143819e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16492f<byte[]> f143820f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ InputStream f143821g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16492f<byte[]> fVar, InputStream inputStream, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f143820f = fVar;
            this.f143821g = inputStream;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f143820f, this.f143821g, eVar);
            aVar.f143819e = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((a) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x003b A[Catch:{ all -> 0x0017, all -> 0x0069 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f143818d
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r6.f143817c
                byte[] r1 = (byte[]) r1
                java.lang.Object r3 = r6.f143819e
                io.ktor.utils.io.u r3 = (io.ktor.utils.io.u) r3
                XH.y.b(r7)     // Catch:{ all -> 0x0017 }
                goto L_0x0031
            L_0x0017:
                r7 = move-exception
                goto L_0x0059
            L_0x0019:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0021:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f143819e
                io.ktor.utils.io.u r7 = (io.ktor.utils.io.u) r7
                TH.f<byte[]> r1 = r6.f143820f
                java.lang.Object r1 = r1.Q1()
                byte[] r1 = (byte[]) r1
                r3 = r7
            L_0x0031:
                java.io.InputStream r7 = r6.f143821g     // Catch:{ all -> 0x0017 }
                int r4 = r1.length     // Catch:{ all -> 0x0017 }
                r5 = 0
                int r7 = r7.read(r1, r5, r4)     // Catch:{ all -> 0x0017 }
                if (r7 < 0) goto L_0x004e
                if (r7 == 0) goto L_0x0031
                io.ktor.utils.io.j r4 = r3.d()     // Catch:{ all -> 0x0017 }
                r6.f143819e = r3     // Catch:{ all -> 0x0017 }
                r6.f143817c = r1     // Catch:{ all -> 0x0017 }
                r6.f143818d = r2     // Catch:{ all -> 0x0017 }
                java.lang.Object r7 = r4.l(r1, r5, r7, r6)     // Catch:{ all -> 0x0017 }
                if (r7 != r0) goto L_0x0031
                return r0
            L_0x004e:
                TH.f<byte[]> r7 = r6.f143820f
                r7.f3(r1)
            L_0x0053:
                java.io.InputStream r7 = r6.f143821g
                r7.close()
                goto L_0x0066
            L_0x0059:
                io.ktor.utils.io.j r0 = r3.d()     // Catch:{ all -> 0x0069 }
                r0.a(r7)     // Catch:{ all -> 0x0069 }
                TH.f<byte[]> r7 = r6.f143820f
                r7.f3(r1)
                goto L_0x0053
            L_0x0066:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x0069:
                r7 = move-exception
                TH.f<byte[]> r0 = r6.f143820f
                r0.f3(r1)
                java.io.InputStream r0 = r6.f143821g
                r0.close()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final g a(InputStream inputStream, C17168i iVar, C16492f<byte[]> fVar) {
        C17542s.j(inputStream, "<this>");
        C17542s.j(iVar, "context");
        C17542s.j(fVar, "pool");
        return q.b(C16342y0.f137687a, iVar, true, new a(fVar, inputStream, (C17164e<? super a>) null)).d();
    }

    public static /* synthetic */ g b(InputStream inputStream, C17168i iVar, C16492f<byte[]> fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C16311i0.b();
        }
        if ((i10 & 2) != 0) {
            fVar = C16487a.a();
        }
        return a(inputStream, iVar, fVar);
    }
}
