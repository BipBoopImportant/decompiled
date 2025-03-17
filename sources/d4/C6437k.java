package D4;

import D4.E;
import YH.C16877v;
import YH.Q;
import bK.C17052a;
import bK.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00050\u000bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LD4/k;", "", "T", "<init>", "()V", "LYH/Q;", "LD4/E;", "event", "LXH/N;", "c", "(LYH/Q;LdI/e;)Ljava/lang/Object;", "", "b", "(LdI/e;)Ljava/lang/Object;", "LD4/E$b;", "a", "()LD4/E$b;", "LD4/l;", "LD4/l;", "list", "LbK/a;", "LbK/a;", "lock", "", "I", "maxEventIndex", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.k  reason: case insensitive filesystem */
final class C6437k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C6438l<T> f34365a = new C6438l<>();

    /* renamed from: b  reason: collision with root package name */
    private final C17052a f34366b = g.b(false, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private int f34367c = -1;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {288}, m = "getStateAsEvents")
    /* renamed from: D4.k$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f34368c;

        /* renamed from: d  reason: collision with root package name */
        Object f34369d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f34370e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6437k<T> f34371f;

        /* renamed from: g  reason: collision with root package name */
        int f34372g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6437k<T> kVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f34371f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34370e = obj;
            this.f34372g |= Integer.MIN_VALUE;
            return this.f34371f.b(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {288}, m = "record")
    /* renamed from: D4.k$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f34373c;

        /* renamed from: d  reason: collision with root package name */
        Object f34374d;

        /* renamed from: e  reason: collision with root package name */
        Object f34375e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f34376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6437k<T> f34377g;

        /* renamed from: h  reason: collision with root package name */
        int f34378h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6437k<T> kVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f34377g = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f34376f = obj;
            this.f34378h |= Integer.MIN_VALUE;
            return this.f34377g.c((Q) null, this);
        }
    }

    public final E.b<T> a() {
        E e10 = (E) C16877v.y0(this.f34365a.b());
        if (e10 == null || !(e10 instanceof E.b)) {
            return null;
        }
        E.b<T> bVar = (E.b) e10;
        if (bVar.f() == C6449x.REFRESH) {
            return bVar;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super java.util.List<? extends YH.Q<? extends D4.E<T>>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof D4.C6437k.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            D4.k$a r0 = (D4.C6437k.a) r0
            int r1 = r0.f34372g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34372g = r1
            goto L_0x0018
        L_0x0013:
            D4.k$a r0 = new D4.k$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f34370e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f34372g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f34369d
            bK.a r1 = (bK.C17052a) r1
            java.lang.Object r0 = r0.f34368c
            D4.k r0 = (D4.C6437k) r0
            XH.y.b(r9)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003a:
            XH.y.b(r9)
            bK.a r9 = r8.f34366b
            r0.f34368c = r8
            r0.f34369d = r9
            r0.f34372g = r3
            java.lang.Object r0 = r9.e(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r8
            r1 = r9
        L_0x004e:
            D4.l<T> r9 = r0.f34365a     // Catch:{ all -> 0x0080 }
            java.util.List r9 = r9.b()     // Catch:{ all -> 0x0080 }
            int r0 = r0.f34367c     // Catch:{ all -> 0x0080 }
            int r2 = r9.size()     // Catch:{ all -> 0x0080 }
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ all -> 0x0080 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0080 }
            r3 = 10
            int r3 = YH.C16877v.y(r9, r3)     // Catch:{ all -> 0x0080 }
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0080 }
            r3 = 0
        L_0x006e:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0080 }
            int r6 = r3 + 1
            if (r3 >= 0) goto L_0x0082
            YH.C16877v.x()     // Catch:{ all -> 0x0080 }
            goto L_0x0082
        L_0x0080:
            r9 = move-exception
            goto L_0x0093
        L_0x0082:
            D4.E r5 = (D4.E) r5     // Catch:{ all -> 0x0080 }
            YH.Q r7 = new YH.Q     // Catch:{ all -> 0x0080 }
            int r3 = r3 + r0
            r7.<init>(r3, r5)     // Catch:{ all -> 0x0080 }
            r2.add(r7)     // Catch:{ all -> 0x0080 }
            r3 = r6
            goto L_0x006e
        L_0x008f:
            r1.d(r4)
            return r2
        L_0x0093:
            r1.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.C6437k.b(dI.e):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(YH.Q<? extends D4.E<T>> r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof D4.C6437k.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            D4.k$b r0 = (D4.C6437k.b) r0
            int r1 = r0.f34378h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f34378h = r1
            goto L_0x0018
        L_0x0013:
            D4.k$b r0 = new D4.k$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f34376f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f34378h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f34375e
            bK.a r6 = (bK.C17052a) r6
            java.lang.Object r1 = r0.f34374d
            YH.Q r1 = (YH.Q) r1
            java.lang.Object r0 = r0.f34373c
            D4.k r0 = (D4.C6437k) r0
            XH.y.b(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            XH.y.b(r7)
            bK.a r7 = r5.f34366b
            r0.f34373c = r5
            r0.f34374d = r6
            r0.f34375e = r7
            r0.f34378h = r3
            java.lang.Object r0 = r7.e(r4, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            int r1 = r6.c()     // Catch:{ all -> 0x006e }
            r0.f34367c = r1     // Catch:{ all -> 0x006e }
            D4.l<T> r0 = r0.f34365a     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r6.d()     // Catch:{ all -> 0x006e }
            D4.E r6 = (D4.E) r6     // Catch:{ all -> 0x006e }
            r0.a(r6)     // Catch:{ all -> 0x006e }
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x006e }
            r7.d(r4)
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x006e:
            r6 = move-exception
            r7.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.C6437k.c(YH.Q, dI.e):java.lang.Object");
    }
}
