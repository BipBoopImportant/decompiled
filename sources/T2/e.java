package T2;

import R2.n;
import R2.x;
import WK.C16762E;
import WK.C16777l;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\f2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LT2/e;", "T", "LR2/x;", "LWK/l;", "fileSystem", "LWK/E;", "path", "LT2/c;", "serializer", "LR2/n;", "coordinator", "Lkotlin/Function0;", "LXH/N;", "onClose", "<init>", "(LWK/l;LWK/E;LT2/c;LR2/n;LnI/a;)V", "f", "()V", "R", "Lkotlin/Function3;", "LR2/r;", "", "LdI/e;", "", "block", "b", "(LnI/q;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "LR2/B;", "d", "(LnI/p;LdI/e;)Ljava/lang/Object;", "close", "a", "LWK/l;", "LWK/E;", "c", "LT2/c;", "LR2/n;", "e", "()LR2/n;", "LnI/a;", "LT2/a;", "LT2/a;", "closed", "LbK/a;", "g", "LbK/a;", "transactionMutex", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<T> implements x<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16777l f13683a;

    /* renamed from: b  reason: collision with root package name */
    private final C16762E f13684b;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f13685c;

    /* renamed from: d  reason: collision with root package name */
    private final n f13686d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C16807N> f13687e;

    /* renamed from: f  reason: collision with root package name */
    private final a f13688f = new a(false);

    /* renamed from: g  reason: collision with root package name */
    private final C17052a f13689g = g.b(false, 1, (Object) null);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
    static final class a<R> extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f13690c;

        /* renamed from: d  reason: collision with root package name */
        Object f13691d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13692e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f13693f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e<T> f13694g;

        /* renamed from: h  reason: collision with root package name */
        int f13695h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e<T> eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f13694g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13693f = obj;
            this.f13695h |= Integer.MIN_VALUE;
            return this.f13694g.b((q) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {231, 137}, m = "writeScope")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f13696c;

        /* renamed from: d  reason: collision with root package name */
        Object f13697d;

        /* renamed from: e  reason: collision with root package name */
        Object f13698e;

        /* renamed from: f  reason: collision with root package name */
        Object f13699f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f13700g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e<T> f13701h;

        /* renamed from: i  reason: collision with root package name */
        int f13702i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e<T> eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f13701h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13700g = obj;
            this.f13702i |= Integer.MIN_VALUE;
            return this.f13701h.d((p) null, this);
        }
    }

    public e(C16777l lVar, C16762E e10, c<T> cVar, n nVar, C17631a<C16807N> aVar) {
        C17542s.j(lVar, "fileSystem");
        C17542s.j(e10, "path");
        C17542s.j(cVar, "serializer");
        C17542s.j(nVar, "coordinator");
        C17542s.j(aVar, "onClose");
        this.f13683a = lVar;
        this.f13684b = e10;
        this.f13685c = cVar;
        this.f13686d = nVar;
        this.f13687e = aVar;
    }

    private final void f() {
        if (this.f13688f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        XH.C16816g.a(r11, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x007d, B:36:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[SYNTHETIC, Splitter:B:31:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <R> java.lang.Object b(nI.q<? super R2.r<T>, ? super java.lang.Boolean, ? super dI.C17164e<? super R>, ? extends java.lang.Object> r10, dI.C17164e<? super R> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof T2.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            T2.e$a r0 = (T2.e.a) r0
            int r1 = r0.f13695h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13695h = r1
            goto L_0x0018
        L_0x0013:
            T2.e$a r0 = new T2.e$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f13693f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13695h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r10 = r0.f13692e
            java.lang.Object r1 = r0.f13691d
            R2.b r1 = (R2.C4798b) r1
            java.lang.Object r0 = r0.f13690c
            T2.e r0 = (T2.e) r0
            XH.y.b(r11)     // Catch:{ all -> 0x0034 }
            goto L_0x006d
        L_0x0034:
            r11 = move-exception
            goto L_0x0086
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            XH.y.b(r11)
            r9.f()
            bK.a r11 = r9.f13689g
            boolean r11 = bK.C17052a.C3460a.b(r11, r4, r3, r4)
            T2.b r2 = new T2.b     // Catch:{ all -> 0x008f }
            WK.l r5 = r9.f13683a     // Catch:{ all -> 0x008f }
            WK.E r6 = r9.f13684b     // Catch:{ all -> 0x008f }
            T2.c<T> r7 = r9.f13685c     // Catch:{ all -> 0x008f }
            r2.<init>(r5, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r11)     // Catch:{ all -> 0x0080 }
            r0.f13690c = r9     // Catch:{ all -> 0x0080 }
            r0.f13691d = r2     // Catch:{ all -> 0x0080 }
            r0.f13692e = r11     // Catch:{ all -> 0x0080 }
            r0.f13695h = r3     // Catch:{ all -> 0x0080 }
            java.lang.Object r10 = r10.invoke(r2, r5, r0)     // Catch:{ all -> 0x0080 }
            if (r10 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x006d:
            r1.close()     // Catch:{ all -> 0x0072 }
            r1 = r4
            goto L_0x0073
        L_0x0072:
            r1 = move-exception
        L_0x0073:
            if (r1 != 0) goto L_0x007d
            if (r10 == 0) goto L_0x007c
            bK.a r10 = r0.f13689g
            bK.C17052a.C3460a.c(r10, r4, r3, r4)
        L_0x007c:
            return r11
        L_0x007d:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r11 = move-exception
            goto L_0x0094
        L_0x0080:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0086:
            r1.close()     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008a:
            r1 = move-exception
            XH.C16816g.a(r11, r1)     // Catch:{ all -> 0x007e }
        L_0x008e:
            throw r11     // Catch:{ all -> 0x007e }
        L_0x008f:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x0094:
            if (r10 == 0) goto L_0x009b
            bK.a r10 = r0.f13689g
            bK.C17052a.C3460a.c(r10, r4, r3, r4)
        L_0x009b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.b(nI.q, dI.e):java.lang.Object");
    }

    public void close() {
        this.f13688f.b(true);
        this.f13687e.invoke();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x010f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[SYNTHETIC, Splitter:B:39:0x00cf] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef A[SYNTHETIC, Splitter:B:51:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(nI.p<? super R2.B<T>, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof T2.e.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            T2.e$b r0 = (T2.e.b) r0
            int r1 = r0.f13702i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13702i = r1
            goto L_0x0018
        L_0x0013:
            T2.e$b r0 = new T2.e$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f13700g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f13702i
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r10 = r0.f13699f
            R2.b r10 = (R2.C4798b) r10
            java.lang.Object r1 = r0.f13698e
            WK.E r1 = (WK.C16762E) r1
            java.lang.Object r2 = r0.f13697d
            bK.a r2 = (bK.C17052a) r2
            java.lang.Object r0 = r0.f13696c
            T2.e r0 = (T2.e) r0
            XH.y.b(r11)     // Catch:{ all -> 0x003f }
            goto L_0x00c5
        L_0x003f:
            r11 = move-exception
            goto L_0x00f6
        L_0x0042:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x004a:
            java.lang.Object r10 = r0.f13699f
            bK.a r10 = (bK.C17052a) r10
            java.lang.Object r2 = r0.f13698e
            WK.E r2 = (WK.C16762E) r2
            java.lang.Object r5 = r0.f13697d
            nI.p r5 = (nI.p) r5
            java.lang.Object r7 = r0.f13696c
            T2.e r7 = (T2.e) r7
            XH.y.b(r11)
            r11 = r10
            r10 = r5
            goto L_0x0087
        L_0x0060:
            XH.y.b(r11)
            r9.f()
            WK.E r11 = r9.f13684b
            WK.E r2 = r11.D()
            if (r2 == 0) goto L_0x0114
            WK.l r11 = r9.f13683a
            r11.g(r2, r3)
            bK.a r11 = r9.f13689g
            r0.f13696c = r9
            r0.f13697d = r10
            r0.f13698e = r2
            r0.f13699f = r11
            r0.f13702i = r5
            java.lang.Object r5 = r11.e(r6, r0)
            if (r5 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r7 = r9
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r5.<init>()     // Catch:{ all -> 0x00ff }
            WK.E r8 = r7.f13684b     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = r8.v()     // Catch:{ all -> 0x00ff }
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r8 = ".tmp"
            r5.append(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00ff }
            WK.E r2 = r2.G(r5)     // Catch:{ all -> 0x00ff }
            WK.l r5 = r7.f13683a     // Catch:{ IOException -> 0x0101 }
            r5.n(r2, r3)     // Catch:{ IOException -> 0x0101 }
            T2.g r3 = new T2.g     // Catch:{ IOException -> 0x0101 }
            WK.l r5 = r7.f13683a     // Catch:{ IOException -> 0x0101 }
            T2.c<T> r8 = r7.f13685c     // Catch:{ IOException -> 0x0101 }
            r3.<init>(r5, r2, r8)     // Catch:{ IOException -> 0x0101 }
            r0.f13696c = r7     // Catch:{ all -> 0x00f0 }
            r0.f13697d = r11     // Catch:{ all -> 0x00f0 }
            r0.f13698e = r2     // Catch:{ all -> 0x00f0 }
            r0.f13699f = r3     // Catch:{ all -> 0x00f0 }
            r0.f13702i = r4     // Catch:{ all -> 0x00f0 }
            java.lang.Object r10 = r10.invoke(r3, r0)     // Catch:{ all -> 0x00f0 }
            if (r10 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            r1 = r2
            r10 = r3
            r0 = r7
            r2 = r11
        L_0x00c5:
            XH.N r11 = XH.C16807N.f139792a     // Catch:{ all -> 0x003f }
            r10.close()     // Catch:{ all -> 0x00cc }
            r10 = r6
            goto L_0x00cd
        L_0x00cc:
            r10 = move-exception
        L_0x00cd:
            if (r10 != 0) goto L_0x00ef
            WK.l r10 = r0.f13683a     // Catch:{ IOException -> 0x00e2 }
            boolean r10 = r10.o(r1)     // Catch:{ IOException -> 0x00e2 }
            if (r10 == 0) goto L_0x00e7
            WK.l r10 = r0.f13683a     // Catch:{ IOException -> 0x00e2 }
            WK.E r11 = r0.f13684b     // Catch:{ IOException -> 0x00e2 }
            r10.e(r1, r11)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00e7
        L_0x00df:
            r10 = move-exception
            r11 = r2
            goto L_0x0110
        L_0x00e2:
            r10 = move-exception
            r7 = r0
            r11 = r2
            r2 = r1
            goto L_0x0102
        L_0x00e7:
            XH.N r10 = XH.C16807N.f139792a     // Catch:{ all -> 0x00df }
            r2.d(r6)
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00ef:
            throw r10     // Catch:{ IOException -> 0x00e2 }
        L_0x00f0:
            r10 = move-exception
            r1 = r2
            r0 = r7
            r2 = r11
            r11 = r10
            r10 = r3
        L_0x00f6:
            r10.close()     // Catch:{ all -> 0x00fa }
            goto L_0x00fe
        L_0x00fa:
            r10 = move-exception
            XH.C16816g.a(r11, r10)     // Catch:{ IOException -> 0x00e2 }
        L_0x00fe:
            throw r11     // Catch:{ IOException -> 0x00e2 }
        L_0x00ff:
            r10 = move-exception
            goto L_0x0110
        L_0x0101:
            r10 = move-exception
        L_0x0102:
            WK.l r0 = r7.f13683a     // Catch:{ all -> 0x00ff }
            boolean r0 = r0.o(r2)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x010f
            WK.l r0 = r7.f13683a     // Catch:{ IOException -> 0x010f }
            r0.l(r2)     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            throw r10     // Catch:{ all -> 0x00ff }
        L_0x0110:
            r11.d(r6)
            throw r10
        L_0x0114:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "must have a parent path"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.e.d(nI.p, dI.e):java.lang.Object");
    }

    public n e() {
        return this.f13686d;
    }
}
