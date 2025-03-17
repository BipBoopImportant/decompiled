package TJ;

import SJ.C16428d;
import UJ.C16609b;
import UJ.C16624q;
import UJ.C16627t;
import XH.C16807N;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u0000H@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030#2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J-\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010.R$\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010\tR\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000038VX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u00058\u0002X\u0004¨\u00068"}, d2 = {"LTJ/Q;", "T", "LUJ/b;", "LTJ/T;", "LTJ/B;", "", "LUJ/q;", "initialState", "<init>", "(Ljava/lang/Object;)V", "expectedState", "newState", "", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "expect", "update", "e", "value", "a", "(Ljava/lang/Object;)Z", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "f", "()V", "LTJ/h;", "collector", "", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "o", "()LTJ/T;", "", "size", "", "p", "(I)[LTJ/T;", "LdI/i;", "context", "capacity", "LSJ/d;", "onBufferOverflow", "LTJ/g;", "d", "(LdI/i;ILSJ/d;)LTJ/g;", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "", "c", "()Ljava/util/List;", "replayCache", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.Q  reason: case insensitive filesystem */
final class C16520Q<T> extends C16609b<C16522T> implements C16505B<T>, C16532g, C16624q<T> {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138590f = AtomicReferenceFieldUpdater.newUpdater(C16520Q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e  reason: collision with root package name */
    private int f138591e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    /* renamed from: TJ.Q$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f138592c;

        /* renamed from: d  reason: collision with root package name */
        Object f138593d;

        /* renamed from: e  reason: collision with root package name */
        Object f138594e;

        /* renamed from: f  reason: collision with root package name */
        Object f138595f;

        /* renamed from: g  reason: collision with root package name */
        Object f138596g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f138597h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C16520Q<T> f138598i;

        /* renamed from: j  reason: collision with root package name */
        int f138599j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16520Q<T> q10, C17164e<? super a> eVar) {
            super(eVar);
            this.f138598i = q10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138597h = obj;
            this.f138599j |= Integer.MIN_VALUE;
            return this.f138598i.collect((C16533h) null, this);
        }
    }

    public C16520Q(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        r8 = (TJ.C16522T[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r8 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r3 >= r1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r4 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        r4.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f138591e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8 != r7) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        r6.f138591e = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = n();
        r1 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0059, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005a, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean r(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f138590f     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r7 == 0) goto L_0x0017
            boolean r7 = kotlin.jvm.internal.C17542s.e(r1, r7)     // Catch:{ all -> 0x0015 }
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r2
        L_0x0015:
            r7 = move-exception
            goto L_0x0066
        L_0x0017:
            boolean r7 = kotlin.jvm.internal.C17542s.e(r1, r8)     // Catch:{ all -> 0x0015 }
            if (r7 == 0) goto L_0x001f
            monitor-exit(r6)
            return r0
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f138590f     // Catch:{ all -> 0x0015 }
            r7.set(r6, r8)     // Catch:{ all -> 0x0015 }
            int r7 = r6.f138591e     // Catch:{ all -> 0x0015 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0060
            int r7 = r7 + r0
            r6.f138591e = r7     // Catch:{ all -> 0x0015 }
            UJ.d[] r8 = r6.n()     // Catch:{ all -> 0x0015 }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
        L_0x0036:
            TJ.T[] r8 = (TJ.C16522T[]) r8
            if (r8 == 0) goto L_0x0047
            int r1 = r8.length
            r3 = r2
        L_0x003c:
            if (r3 >= r1) goto L_0x0047
            r4 = r8[r3]
            if (r4 == 0) goto L_0x0045
            r4.g()
        L_0x0045:
            int r3 = r3 + r0
            goto L_0x003c
        L_0x0047:
            monitor-enter(r6)
            int r8 = r6.f138591e     // Catch:{ all -> 0x0051 }
            if (r8 != r7) goto L_0x0053
            int r7 = r7 + r0
            r6.f138591e = r7     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            return r0
        L_0x0051:
            r7 = move-exception
            goto L_0x005e
        L_0x0053:
            UJ.d[] r7 = r6.n()     // Catch:{ all -> 0x0051 }
            XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0036
        L_0x005e:
            monitor-exit(r6)
            throw r7
        L_0x0060:
            int r7 = r7 + 2
            r6.f138591e = r7     // Catch:{ all -> 0x0015 }
            monitor-exit(r6)
            return r0
        L_0x0066:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16520Q.r(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean a(T t10) {
        setValue(t10);
        return true;
    }

    public List<T> c() {
        return C16877v.e(getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: TJ.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: TJ.Q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[Catch:{ all -> 0x0043 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1 A[Catch:{ all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(TJ.C16533h<? super T> r11, dI.C17164e<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof TJ.C16520Q.a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            TJ.Q$a r0 = (TJ.C16520Q.a) r0
            int r1 = r0.f138599j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138599j = r1
            goto L_0x0018
        L_0x0013:
            TJ.Q$a r0 = new TJ.Q$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f138597h
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138599j
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0077
            if (r2 == r6) goto L_0x0065
            if (r2 == r5) goto L_0x004e
            if (r2 != r4) goto L_0x0046
            java.lang.Object r11 = r0.f138596g
            java.lang.Object r2 = r0.f138595f
            QJ.F0 r2 = (QJ.F0) r2
            java.lang.Object r6 = r0.f138594e
            TJ.T r6 = (TJ.C16522T) r6
            java.lang.Object r7 = r0.f138593d
            TJ.h r7 = (TJ.C16533h) r7
            java.lang.Object r8 = r0.f138592c
            TJ.Q r8 = (TJ.C16520Q) r8
            XH.y.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00ab
        L_0x0043:
            r11 = move-exception
            goto L_0x00f4
        L_0x0046:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004e:
            java.lang.Object r11 = r0.f138596g
            java.lang.Object r2 = r0.f138595f
            QJ.F0 r2 = (QJ.F0) r2
            java.lang.Object r6 = r0.f138594e
            TJ.T r6 = (TJ.C16522T) r6
            java.lang.Object r7 = r0.f138593d
            TJ.h r7 = (TJ.C16533h) r7
            java.lang.Object r8 = r0.f138592c
            TJ.Q r8 = (TJ.C16520Q) r8
            XH.y.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x00db
        L_0x0065:
            java.lang.Object r11 = r0.f138594e
            r6 = r11
            TJ.T r6 = (TJ.C16522T) r6
            java.lang.Object r11 = r0.f138593d
            TJ.h r11 = (TJ.C16533h) r11
            java.lang.Object r2 = r0.f138592c
            r8 = r2
            TJ.Q r8 = (TJ.C16520Q) r8
            XH.y.b(r12)     // Catch:{ all -> 0x0043 }
            goto L_0x009c
        L_0x0077:
            XH.y.b(r12)
            UJ.d r12 = r10.i()
            TJ.T r12 = (TJ.C16522T) r12
            boolean r2 = r11 instanceof TJ.C16523U     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x009a
            r2 = r11
            TJ.U r2 = (TJ.C16523U) r2     // Catch:{ all -> 0x0096 }
            r0.f138592c = r10     // Catch:{ all -> 0x0096 }
            r0.f138593d = r11     // Catch:{ all -> 0x0096 }
            r0.f138594e = r12     // Catch:{ all -> 0x0096 }
            r0.f138599j = r6     // Catch:{ all -> 0x0096 }
            java.lang.Object r2 = r2.c(r0)     // Catch:{ all -> 0x0096 }
            if (r2 != r1) goto L_0x009a
            return r1
        L_0x0096:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto L_0x00f4
        L_0x009a:
            r8 = r10
            r6 = r12
        L_0x009c:
            dI.i r12 = r0.getContext()     // Catch:{ all -> 0x0043 }
            QJ.F0$b r2 = QJ.F0.f137562d0     // Catch:{ all -> 0x0043 }
            dI.i$b r12 = r12.get(r2)     // Catch:{ all -> 0x0043 }
            QJ.F0 r12 = (QJ.F0) r12     // Catch:{ all -> 0x0043 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f138590f     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r12.get(r8)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x00b8
            QJ.I0.k(r2)     // Catch:{ all -> 0x0043 }
        L_0x00b8:
            if (r11 == 0) goto L_0x00c0
            boolean r9 = kotlin.jvm.internal.C17542s.e(r11, r12)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x00db
        L_0x00c0:
            WJ.D r11 = UJ.C16627t.f139163a     // Catch:{ all -> 0x0043 }
            if (r12 != r11) goto L_0x00c6
            r11 = r3
            goto L_0x00c7
        L_0x00c6:
            r11 = r12
        L_0x00c7:
            r0.f138592c = r8     // Catch:{ all -> 0x0043 }
            r0.f138593d = r7     // Catch:{ all -> 0x0043 }
            r0.f138594e = r6     // Catch:{ all -> 0x0043 }
            r0.f138595f = r2     // Catch:{ all -> 0x0043 }
            r0.f138596g = r12     // Catch:{ all -> 0x0043 }
            r0.f138599j = r5     // Catch:{ all -> 0x0043 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0043 }
            if (r11 != r1) goto L_0x00da
            return r1
        L_0x00da:
            r11 = r12
        L_0x00db:
            boolean r12 = r6.h()     // Catch:{ all -> 0x0043 }
            if (r12 != 0) goto L_0x00ab
            r0.f138592c = r8     // Catch:{ all -> 0x0043 }
            r0.f138593d = r7     // Catch:{ all -> 0x0043 }
            r0.f138594e = r6     // Catch:{ all -> 0x0043 }
            r0.f138595f = r2     // Catch:{ all -> 0x0043 }
            r0.f138596g = r11     // Catch:{ all -> 0x0043 }
            r0.f138599j = r4     // Catch:{ all -> 0x0043 }
            java.lang.Object r12 = r6.e(r0)     // Catch:{ all -> 0x0043 }
            if (r12 != r1) goto L_0x00ab
            return r1
        L_0x00f4:
            r8.l(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16520Q.collect(TJ.h, dI.e):java.lang.Object");
    }

    public C16532g<T> d(C17168i iVar, int i10, C16428d dVar) {
        return C16521S.d(this, iVar, i10, dVar);
    }

    public boolean e(T t10, T t11) {
        if (t10 == null) {
            t10 = C16627t.f139163a;
        }
        if (t11 == null) {
            t11 = C16627t.f139163a;
        }
        return r(t10, t11);
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        setValue(t10);
        return C16807N.f139792a;
    }

    public void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public T getValue() {
        T t10 = C16627t.f139163a;
        T t11 = f138590f.get(this);
        if (t11 == t10) {
            return null;
        }
        return t11;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C16522T j() {
        return new C16522T();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C16522T[] k(int i10) {
        return new C16522T[i10];
    }

    public void setValue(T t10) {
        if (t10 == null) {
            t10 = C16627t.f139163a;
        }
        r((Object) null, t10);
    }
}
