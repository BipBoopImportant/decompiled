package T2;

import R2.B;
import WK.C16762E;
import WK.C16777l;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LT2/g;", "T", "LT2/b;", "LR2/B;", "LWK/l;", "fileSystem", "LWK/E;", "path", "LT2/c;", "serializer", "<init>", "(LWK/l;LWK/E;LT2/c;)V", "value", "LXH/N;", "a", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g<T> extends b<T> implements B<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {211}, m = "writeData")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f13703c;

        /* renamed from: d  reason: collision with root package name */
        Object f13704d;

        /* renamed from: e  reason: collision with root package name */
        Object f13705e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f13706f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g<T> f13707g;

        /* renamed from: h  reason: collision with root package name */
        int f13708h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g<T> gVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f13707g = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13706f = obj;
            this.f13708h |= Integer.MIN_VALUE;
            return this.f13707g.a(null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(C16777l lVar, C16762E e10, c<T> cVar) {
        super(lVar, e10, cVar);
        C17542s.j(lVar, "fileSystem");
        C17542s.j(e10, "path");
        C17542s.j(cVar, "serializer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: WK.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: WK.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: WK.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: WK.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: WK.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: WK.j} */
    /* JADX WARNING: type inference failed for: r1v1, types: [WK.j] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[SYNTHETIC, Splitter:B:26:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097 A[Catch:{ all -> 0x008b, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4 A[SYNTHETIC, Splitter:B:47:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(T r9, dI.C17164e<? super XH.C16807N> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof T2.g.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            T2.g$a r0 = (T2.g.a) r0
            int r1 = r0.f13708h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13708h = r1
            goto L_0x0018
        L_0x0013:
            T2.g$a r0 = new T2.g$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13706f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13708h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r9 = r0.f13705e
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f13704d
            WK.j r1 = (WK.C16775j) r1
            java.lang.Object r0 = r0.f13703c
            java.io.Closeable r0 = (java.io.Closeable) r0
            XH.y.b(r10)     // Catch:{ all -> 0x0036 }
            goto L_0x0072
        L_0x0036:
            r10 = move-exception
            goto L_0x0085
        L_0x0038:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0040:
            XH.y.b(r10)
            r8.f()
            WK.l r10 = r8.g()
            WK.E r2 = r8.h()
            WK.j r10 = r10.v(r2)
            r5 = 0
            WK.L r2 = WK.C16775j.u(r10, r5, r3, r4)     // Catch:{ all -> 0x00a5 }
            WK.f r2 = WK.y.c(r2)     // Catch:{ all -> 0x00a5 }
            T2.c r5 = r8.i()     // Catch:{ all -> 0x0081 }
            r0.f13703c = r10     // Catch:{ all -> 0x0081 }
            r0.f13704d = r10     // Catch:{ all -> 0x0081 }
            r0.f13705e = r2     // Catch:{ all -> 0x0081 }
            r0.f13708h = r3     // Catch:{ all -> 0x0081 }
            java.lang.Object r9 = r5.b(r9, r2, r0)     // Catch:{ all -> 0x0081 }
            if (r9 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r0 = r10
            r1 = r0
            r9 = r2
        L_0x0072:
            r1.flush()     // Catch:{ all -> 0x0036 }
            XH.N r10 = XH.C16807N.f139792a     // Catch:{ all -> 0x0036 }
            if (r9 == 0) goto L_0x007f
            r9.close()     // Catch:{ all -> 0x007d }
            goto L_0x007f
        L_0x007d:
            r9 = move-exception
            goto L_0x0095
        L_0x007f:
            r9 = r4
            goto L_0x0095
        L_0x0081:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L_0x0085:
            if (r9 == 0) goto L_0x0093
            r9.close()     // Catch:{ all -> 0x008b }
            goto L_0x0093
        L_0x008b:
            r9 = move-exception
            XH.C16816g.a(r10, r9)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r9 = move-exception
            r10 = r0
            goto L_0x00a6
        L_0x0093:
            r9 = r10
            r10 = r4
        L_0x0095:
            if (r9 != 0) goto L_0x00a4
            kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ all -> 0x0090 }
            XH.N r9 = XH.C16807N.f139792a     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x00b3
            r0.close()     // Catch:{ all -> 0x00a2 }
            goto L_0x00b3
        L_0x00a2:
            r4 = move-exception
            goto L_0x00b3
        L_0x00a4:
            throw r9     // Catch:{ all -> 0x0090 }
        L_0x00a5:
            r9 = move-exception
        L_0x00a6:
            if (r10 == 0) goto L_0x00b0
            r10.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r10 = move-exception
            XH.C16816g.a(r9, r10)
        L_0x00b0:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x00b3:
            if (r4 != 0) goto L_0x00bb
            kotlin.jvm.internal.C17542s.g(r9)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x00bb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.g.a(java.lang.Object, dI.e):java.lang.Object");
    }
}
