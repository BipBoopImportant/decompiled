package T2;

import R2.r;
import WK.C16762E;
import WK.C16777l;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LT2/b;", "T", "LR2/r;", "LWK/l;", "fileSystem", "LWK/E;", "path", "LT2/c;", "serializer", "<init>", "(LWK/l;LWK/E;LT2/c;)V", "c", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "f", "a", "LWK/l;", "g", "()LWK/l;", "b", "LWK/E;", "h", "()LWK/E;", "LT2/c;", "i", "()LT2/c;", "LT2/a;", "d", "LT2/a;", "closed", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b<T> implements r<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16777l f13663a;

    /* renamed from: b  reason: collision with root package name */
    private final C16762E f13664b;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f13665c;

    /* renamed from: d  reason: collision with root package name */
    private final a f13666d = new a(false);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {180}, m = "readData$suspendImpl")
    static final class a<T> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f13667c;

        /* renamed from: d  reason: collision with root package name */
        Object f13668d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f13669e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b<T> f13670f;

        /* renamed from: g  reason: collision with root package name */
        int f13671g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f13670f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13669e = obj;
            this.f13671g |= Integer.MIN_VALUE;
            return b.j(this.f13670f, this);
        }
    }

    public b(C16777l lVar, C16762E e10, c<T> cVar) {
        C17542s.j(lVar, "fileSystem");
        C17542s.j(e10, "path");
        C17542s.j(cVar, "serializer");
        this.f13663a = lVar;
        this.f13664b = e10;
        this.f13665c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[SYNTHETIC, Splitter:B:24:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082 A[SYNTHETIC, Splitter:B:39:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[Catch:{ FileNotFoundException -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <T> java.lang.Object j(T2.b<T> r6, dI.C17164e<? super T> r7) {
        /*
            boolean r0 = r7 instanceof T2.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            T2.b$a r0 = (T2.b.a) r0
            int r1 = r0.f13671g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13671g = r1
            goto L_0x0018
        L_0x0013:
            T2.b$a r0 = new T2.b$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13669e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13671g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r6 = r0.f13668d
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r0 = r0.f13667c
            T2.b r0 = (T2.b) r0
            XH.y.b(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x0061
        L_0x0032:
            r7 = move-exception
            goto L_0x006f
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003c:
            XH.y.b(r7)
            r6.f()
            WK.l r7 = r6.f13663a     // Catch:{ FileNotFoundException -> 0x0086 }
            WK.E r2 = r6.f13664b     // Catch:{ FileNotFoundException -> 0x0086 }
            WK.N r7 = r7.B(r2)     // Catch:{ FileNotFoundException -> 0x0086 }
            WK.g r7 = WK.y.d(r7)     // Catch:{ FileNotFoundException -> 0x0086 }
            T2.c<T> r2 = r6.f13665c     // Catch:{ all -> 0x006a }
            r0.f13667c = r6     // Catch:{ all -> 0x006a }
            r0.f13668d = r7     // Catch:{ all -> 0x006a }
            r0.f13671g = r3     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r2.a(r7, r0)     // Catch:{ all -> 0x006a }
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x0061:
            if (r6 == 0) goto L_0x0068
            r6.close()     // Catch:{ all -> 0x0067 }
            goto L_0x0068
        L_0x0067:
            r4 = move-exception
        L_0x0068:
            r6 = r0
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x006f:
            if (r6 == 0) goto L_0x007c
            r6.close()     // Catch:{ all -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r6 = move-exception
            XH.C16816g.a(r7, r6)     // Catch:{ FileNotFoundException -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r6 = move-exception
            goto L_0x008b
        L_0x007c:
            r6 = r0
            r5 = r4
            r4 = r7
            r7 = r5
        L_0x0080:
            if (r4 != 0) goto L_0x008a
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ FileNotFoundException -> 0x0086 }
            goto L_0x009b
        L_0x0086:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x008b
        L_0x008a:
            throw r4     // Catch:{ FileNotFoundException -> 0x0086 }
        L_0x008b:
            WK.l r7 = r0.f13663a
            WK.E r1 = r0.f13664b
            boolean r7 = r7.o(r1)
            if (r7 != 0) goto L_0x009c
            T2.c<T> r6 = r0.f13665c
            java.lang.Object r7 = r6.c()
        L_0x009b:
            return r7
        L_0x009c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.j(T2.b, dI.e):java.lang.Object");
    }

    public Object c(C17164e<? super T> eVar) {
        return j(this, eVar);
    }

    public void close() {
        this.f13666d.b(true);
    }

    /* access modifiers changed from: protected */
    public final void f() {
        if (this.f13666d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    /* access modifiers changed from: protected */
    public final C16777l g() {
        return this.f13663a;
    }

    /* access modifiers changed from: protected */
    public final C16762E h() {
        return this.f13664b;
    }

    /* access modifiers changed from: protected */
    public final c<T> i() {
        return this.f13665c;
    }
}
