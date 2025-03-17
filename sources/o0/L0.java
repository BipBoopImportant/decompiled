package O0;

import QJ.C16320n;
import U0.C4899r0;
import U0.o1;
import XH.x;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0013\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00168F@BX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LO0/L0;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "LO0/J0;", "duration", "LO0/N0;", "e", "(Ljava/lang/String;Ljava/lang/String;ZLO0/J0;LdI/e;)Ljava/lang/Object;", "LO0/O0;", "visuals", "d", "(LO0/O0;LdI/e;)Ljava/lang/Object;", "LbK/a;", "a", "LbK/a;", "mutex", "LO0/H0;", "<set-?>", "b", "LU0/r0;", "()LO0/H0;", "c", "(LO0/H0;)V", "currentSnackbarData", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L0 {

    /* renamed from: a  reason: collision with root package name */
    private final C17052a f9828a = g.b(false, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f9829b = u1.e((Object) null, (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LO0/L0$a;", "LO0/H0;", "LO0/O0;", "visuals", "LQJ/n;", "LO0/N0;", "continuation", "<init>", "(LO0/O0;LQJ/n;)V", "LXH/N;", "c", "()V", "dismiss", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LO0/O0;", "()LO0/O0;", "b", "LQJ/n;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements H0 {

        /* renamed from: a  reason: collision with root package name */
        private final O0 f9830a;

        /* renamed from: b  reason: collision with root package name */
        private final C16320n<N0> f9831b;

        public a(O0 o02, C16320n<? super N0> nVar) {
            this.f9830a = o02;
            this.f9831b = nVar;
        }

        public O0 a() {
            return this.f9830a;
        }

        public void c() {
            if (this.f9831b.c()) {
                C16320n<N0> nVar = this.f9831b;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(N0.ActionPerformed));
            }
        }

        public void dismiss() {
            if (this.f9831b.c()) {
                C16320n<N0> nVar = this.f9831b;
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(N0.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(a(), aVar.a()) && C17542s.e(this.f9831b, aVar.f9831b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f9831b.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, d2 = {"LO0/L0$b;", "LO0/O0;", "", "message", "actionLabel", "", "withDismissAction", "LO0/J0;", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLO0/J0;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "LO0/J0;", "()LO0/J0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements O0 {

        /* renamed from: a  reason: collision with root package name */
        private final String f9832a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9833b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f9834c;

        /* renamed from: d  reason: collision with root package name */
        private final J0 f9835d;

        public b(String str, String str2, boolean z10, J0 j02) {
            this.f9832a = str;
            this.f9833b = str2;
            this.f9834c = z10;
            this.f9835d = j02;
        }

        public J0 a() {
            return this.f9835d;
        }

        public String b() {
            return this.f9833b;
        }

        public boolean c() {
            return this.f9834c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(getMessage(), bVar.getMessage()) && C17542s.e(b(), bVar.b()) && c() == bVar.c() && a() == bVar.a();
        }

        public String getMessage() {
            return this.f9832a;
        }

        public int hashCode() {
            int hashCode = getMessage().hashCode() * 31;
            String b10 = b();
            return ((((hashCode + (b10 != null ? b10.hashCode() : 0)) * 31) + Boolean.hashCode(c())) * 31) + a().hashCode();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {446, 449}, m = "showSnackbar")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f9836c;

        /* renamed from: d  reason: collision with root package name */
        Object f9837d;

        /* renamed from: e  reason: collision with root package name */
        Object f9838e;

        /* renamed from: f  reason: collision with root package name */
        Object f9839f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f9840g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ L0 f9841h;

        /* renamed from: i  reason: collision with root package name */
        int f9842i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(L0 l02, C17164e<? super c> eVar) {
            super(eVar);
            this.f9841h = l02;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9840g = obj;
            this.f9842i |= Integer.MIN_VALUE;
            return this.f9841h.d((O0) null, this);
        }
    }

    /* access modifiers changed from: private */
    public final void c(H0 h02) {
        this.f9829b.setValue(h02);
    }

    public static /* synthetic */ Object f(L0 l02, String str, String str2, boolean z10, J0 j02, C17164e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            j02 = str3 == null ? J0.Short : J0.Indefinite;
        }
        return l02.e(str, str3, z11, j02, eVar);
    }

    public final H0 b() {
        return (H0) this.f9829b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b2=Splitter:B:35:0x00b2, B:30:0x00a9=Splitter:B:30:0x00a9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(O0.O0 r9, dI.C17164e<? super O0.N0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof O0.L0.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            O0.L0$c r0 = (O0.L0.c) r0
            int r1 = r0.f9842i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9842i = r1
            goto L_0x0018
        L_0x0013:
            O0.L0$c r0 = new O0.L0$c
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f9840g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f9842i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r9 = r0.f9839f
            O0.L0$c r9 = (O0.L0.c) r9
            java.lang.Object r9 = r0.f9838e
            bK.a r9 = (bK.C17052a) r9
            java.lang.Object r1 = r0.f9837d
            O0.O0 r1 = (O0.O0) r1
            java.lang.Object r0 = r0.f9836c
            O0.L0 r0 = (O0.L0) r0
            XH.y.b(r10)     // Catch:{ all -> 0x003e }
            goto L_0x00a9
        L_0x003e:
            r10 = move-exception
            goto L_0x00b2
        L_0x0041:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0049:
            java.lang.Object r9 = r0.f9838e
            bK.a r9 = (bK.C17052a) r9
            java.lang.Object r2 = r0.f9837d
            O0.O0 r2 = (O0.O0) r2
            java.lang.Object r6 = r0.f9836c
            O0.L0 r6 = (O0.L0) r6
            XH.y.b(r10)
            r10 = r9
            r9 = r2
            goto L_0x0070
        L_0x005b:
            XH.y.b(r10)
            bK.a r10 = r8.f9828a
            r0.f9836c = r8
            r0.f9837d = r9
            r0.f9838e = r10
            r0.f9842i = r4
            java.lang.Object r2 = r10.e(r5, r0)
            if (r2 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r6 = r8
        L_0x0070:
            r0.f9836c = r6     // Catch:{ all -> 0x009c }
            r0.f9837d = r9     // Catch:{ all -> 0x009c }
            r0.f9838e = r10     // Catch:{ all -> 0x009c }
            r0.f9839f = r0     // Catch:{ all -> 0x009c }
            r0.f9842i = r3     // Catch:{ all -> 0x009c }
            QJ.p r2 = new QJ.p     // Catch:{ all -> 0x009c }
            dI.e r3 = eI.C17187b.c(r0)     // Catch:{ all -> 0x009c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x009c }
            r2.C()     // Catch:{ all -> 0x009c }
            O0.L0$a r3 = new O0.L0$a     // Catch:{ all -> 0x009c }
            r3.<init>(r9, r2)     // Catch:{ all -> 0x009c }
            r6.c(r3)     // Catch:{ all -> 0x009c }
            java.lang.Object r9 = r2.w()     // Catch:{ all -> 0x009c }
            java.lang.Object r2 = eI.C17187b.f()     // Catch:{ all -> 0x009c }
            if (r9 != r2) goto L_0x00a2
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x009c }
            goto L_0x00a2
        L_0x009c:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b2
        L_0x00a2:
            if (r9 != r1) goto L_0x00a5
            return r1
        L_0x00a5:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00a9:
            r0.c(r5)     // Catch:{ all -> 0x00b0 }
            r9.d(r5)
            return r10
        L_0x00b0:
            r10 = move-exception
            goto L_0x00b6
        L_0x00b2:
            r0.c(r5)     // Catch:{ all -> 0x00b0 }
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b6:
            r9.d(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.L0.d(O0.O0, dI.e):java.lang.Object");
    }

    public final Object e(String str, String str2, boolean z10, J0 j02, C17164e<? super N0> eVar) {
        return d(new b(str, str2, z10, j02), eVar);
    }
}
