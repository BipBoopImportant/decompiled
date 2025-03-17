package mz;

import TJ.C16532g;
import XH.C16807N;
import XH.x;
import XH.y;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oz.C14902a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u001e\u0010\f\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {"Lmz/c;", "LRy/a;", "Lpz/b;", "scanAndGoSettingsRemoteDataSource", "Loz/a;", "scanAndGoSettingsLocalDataSource", "<init>", "(Lpz/b;Loz/a;)V", "Lkotlin/Function1;", "LdI/e;", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "", "block", "LXH/x;", "g", "(LnI/l;LdI/e;)Ljava/lang/Object;", "", "storeId", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "c", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "Lpz/b;", "b", "Loz/a;", "LTJ/g;", "()LTJ/g;", "settings", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mz.c  reason: case insensitive filesystem */
public final class C14837c implements Ry.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final pz.b f129665a;

    /* renamed from: b  reason: collision with root package name */
    private final C14902a f129666b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsRepo", f = "ScanAndGoSettingsRepo.kt", l = {29}, m = "fetchAndSaveSettings-gIAlu-s")
    /* renamed from: mz.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129667c;

        /* renamed from: d  reason: collision with root package name */
        Object f129668d;

        /* renamed from: e  reason: collision with root package name */
        Object f129669e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f129670f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C14837c f129671g;

        /* renamed from: h  reason: collision with root package name */
        int f129672h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14837c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129671g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129670f = obj;
            this.f129672h |= Integer.MIN_VALUE;
            Object d10 = this.f129671g.d((String) null, this);
            return d10 == C17187b.f() ? d10 : x.a(d10);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsRepo$fetchAndSaveSettings$2", f = "ScanAndGoSettingsRepo.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: mz.c$b */
    static final class b extends l implements C17642l<C17164e<? super ScanAndGoSettings>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129673c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14837c f129674d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f129675e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14837c cVar, String str, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f129674d = cVar;
            this.f129675e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f129674d, this.f129675e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super ScanAndGoSettings> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f129673c;
            if (i10 == 0) {
                y.b(obj);
                pz.b e10 = this.f129674d.f129665a;
                String str = this.f129675e;
                this.f129673c = 1;
                obj = e10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsRepo", f = "ScanAndGoSettingsRepo.kt", l = {34}, m = "fetchSettings-gIAlu-s")
    /* renamed from: mz.c$c  reason: collision with other inner class name */
    static final class C3188c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129676c;

        /* renamed from: d  reason: collision with root package name */
        Object f129677d;

        /* renamed from: e  reason: collision with root package name */
        Object f129678e;

        /* renamed from: f  reason: collision with root package name */
        Object f129679f;

        /* renamed from: g  reason: collision with root package name */
        Object f129680g;

        /* renamed from: h  reason: collision with root package name */
        int f129681h;

        /* renamed from: i  reason: collision with root package name */
        int f129682i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f129683j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14837c f129684k;

        /* renamed from: l  reason: collision with root package name */
        int f129685l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3188c(C14837c cVar, C17164e<? super C3188c> eVar) {
            super(eVar);
            this.f129684k = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129683j = obj;
            this.f129685l |= Integer.MIN_VALUE;
            Object c10 = this.f129684k.c((String) null, this);
            return c10 == C17187b.f() ? c10 : x.a(c10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsRepo", f = "ScanAndGoSettingsRepo.kt", l = {50, 51}, m = "processSettings-gIAlu-s")
    /* renamed from: mz.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f129686c;

        /* renamed from: d  reason: collision with root package name */
        Object f129687d;

        /* renamed from: e  reason: collision with root package name */
        Object f129688e;

        /* renamed from: f  reason: collision with root package name */
        Object f129689f;

        /* renamed from: g  reason: collision with root package name */
        Object f129690g;

        /* renamed from: h  reason: collision with root package name */
        Object f129691h;

        /* renamed from: i  reason: collision with root package name */
        Object f129692i;

        /* renamed from: j  reason: collision with root package name */
        int f129693j;

        /* renamed from: k  reason: collision with root package name */
        int f129694k;

        /* renamed from: l  reason: collision with root package name */
        int f129695l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f129696m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C14837c f129697n;

        /* renamed from: o  reason: collision with root package name */
        int f129698o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14837c cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f129697n = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129696m = obj;
            this.f129698o |= Integer.MIN_VALUE;
            Object f10 = this.f129697n.g((C17642l<? super C17164e<? super ScanAndGoSettings>, ? extends Object>) null, this);
            return f10 == C17187b.f() ? f10 : x.a(f10);
        }
    }

    public C14837c(pz.b bVar, C14902a aVar) {
        C17542s.j(bVar, "scanAndGoSettingsRemoteDataSource");
        C17542s.j(aVar, "scanAndGoSettingsLocalDataSource");
        this.f129665a = bVar;
        this.f129666b = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0049, B:18:0x0074] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0049, B:24:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051 A[ExcHandler: CancellationException (r0v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(nI.C17642l<? super dI.C17164e<? super com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings>, ? extends java.lang.Object> r20, dI.C17164e<? super XH.x<com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings>> r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            boolean r3 = r2 instanceof mz.C14837c.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            mz.c$d r3 = (mz.C14837c.d) r3
            int r4 = r3.f129698o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f129698o = r4
            goto L_0x001e
        L_0x0019:
            mz.c$d r3 = new mz.c$d
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f129696m
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f129698o
            r7 = 1
            r8 = 0
            r9 = 2
            if (r6 == 0) goto L_0x0088
            if (r6 == r7) goto L_0x005c
            if (r6 != r9) goto L_0x0054
            java.lang.Object r0 = r3.f129692i
            java.lang.Object r2 = r3.f129691h
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r2 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r2
            java.lang.Object r2 = r3.f129690g
            mz.c r2 = (mz.C14837c) r2
            java.lang.Object r2 = r3.f129689f
            mz.c r2 = (mz.C14837c) r2
            java.lang.Object r2 = r3.f129688e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f129687d
            nI.l r2 = (nI.C17642l) r2
            java.lang.Object r2 = r3.f129686c
            mz.c r2 = (mz.C14837c) r2
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            goto L_0x00d0
        L_0x004e:
            r0 = move-exception
            goto L_0x00e1
        L_0x0051:
            r0 = move-exception
            goto L_0x019a
        L_0x0054:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005c:
            int r0 = r3.f129694k
            int r2 = r3.f129693j
            java.lang.Object r6 = r3.f129690g
            mz.c r6 = (mz.C14837c) r6
            java.lang.Object r10 = r3.f129689f
            mz.c r10 = (mz.C14837c) r10
            java.lang.Object r11 = r3.f129688e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r3.f129687d
            nI.l r12 = (nI.C17642l) r12
            java.lang.Object r13 = r3.f129686c
            mz.c r13 = (mz.C14837c) r13
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r17 = r4
            r4 = r0
            r0 = r12
            r12 = r10
            r10 = r17
            r18 = r6
            r6 = r2
            r2 = r11
            r11 = r18
            goto L_0x00aa
        L_0x0085:
            r0 = move-exception
            r2 = r13
            goto L_0x00e1
        L_0x0088:
            XH.y.b(r4)
            XH.x$a r4 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129686c = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129687d = r0     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129688e = r2     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129689f = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129690g = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129693j = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129694k = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            r3.f129698o = r7     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            java.lang.Object r4 = r0.invoke(r3)     // Catch:{ CancellationException -> 0x0051, all -> 0x00df }
            if (r4 != r5) goto L_0x00a4
            return r5
        L_0x00a4:
            r11 = r1
            r12 = r11
            r13 = r12
            r10 = r4
            r4 = r8
            r6 = r4
        L_0x00aa:
            if (r10 == 0) goto L_0x00d7
            r14 = r10
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r14 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r14     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            oz.a r15 = r11.f129666b     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129686c = r13     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129687d = r0     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129688e = r2     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129689f = r12     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129690g = r11     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129691h = r14     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129692i = r10     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129693j = r6     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129694k = r4     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129695l = r8     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r3.f129698o = r9     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            java.lang.Object r0 = r15.c(r14, r3)     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            if (r0 != r5) goto L_0x00ce
            return r5
        L_0x00ce:
            r0 = r10
            r2 = r13
        L_0x00d0:
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r0 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r0     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
            goto L_0x00eb
        L_0x00d7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            r2.<init>(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
            throw r2     // Catch:{ CancellationException -> 0x0051, all -> 0x0085 }
        L_0x00df:
            r0 = move-exception
            r2 = r1
        L_0x00e1:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00eb:
            java.lang.Throwable r3 = XH.x.e(r0)
            if (r3 == 0) goto L_0x0199
            qv.e r4 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0104:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x011b
            java.lang.Object r10 = r5.next()
            r11 = r10
            qv.b r11 = (qv.C11819b) r11
            boolean r11 = r11.b(r4, r8)
            if (r11 == 0) goto L_0x0104
            r6.add(r10)
            goto L_0x0104
        L_0x011b:
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r8 = r6
            r10 = r8
        L_0x0122:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0199
            java.lang.Object r11 = r5.next()
            qv.b r11 = (qv.C11819b) r11
            if (r8 != 0) goto L_0x013b
            java.lang.String r8 = qv.C11818a.a(r6, r3)
            if (r8 != 0) goto L_0x0137
            goto L_0x0199
        L_0x0137:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x013b:
            if (r10 != 0) goto L_0x018a
            java.lang.Class r10 = r2.getClass()
            java.lang.String r10 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r12 = 36
            java.lang.String r12 = HJ.C15854t.s1(r10, r12, r6, r9, r6)
            r13 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r13, r6, r9, r6)
            int r13 = r12.length()
            if (r13 != 0) goto L_0x015b
            goto L_0x0161
        L_0x015b:
            java.lang.String r10 = "Kt"
            java.lang.String r10 = HJ.C15854t.P0(r12, r10)
        L_0x0161:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "main"
            boolean r12 = HJ.C15854t.b0(r12, r13, r7)
            if (r12 == 0) goto L_0x0174
            java.lang.String r12 = "m"
            goto L_0x0176
        L_0x0174:
            java.lang.String r12 = "b"
        L_0x0176:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = "|"
            r13.append(r12)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
        L_0x018a:
            r16 = r10
            r13 = 0
            r10 = r11
            r11 = r4
            r12 = r16
            r14 = r3
            r15 = r8
            r10.a(r11, r12, r13, r14, r15)
            r10 = r16
            goto L_0x0122
        L_0x0199:
            return r0
        L_0x019a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.C14837c.g(nI.l, dI.e):java.lang.Object");
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = this.f129666b.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<ScanAndGoSettings> b() {
        return this.f129666b.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ CancellationException -> 0x003f, all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ CancellationException -> 0x003f, all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r6, dI.C17164e<? super XH.x<com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mz.C14837c.C3188c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            mz.c$c r0 = (mz.C14837c.C3188c) r0
            int r1 = r0.f129685l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129685l = r1
            goto L_0x0018
        L_0x0013:
            mz.c$c r0 = new mz.c$c
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129683j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129685l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f129680g
            mz.c r6 = (mz.C14837c) r6
            java.lang.Object r6 = r0.f129679f
            mz.c r6 = (mz.C14837c) r6
            java.lang.Object r6 = r0.f129678e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129677d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129676c
            mz.c r6 = (mz.C14837c) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0068
        L_0x003d:
            r6 = move-exception
            goto L_0x0079
        L_0x003f:
            r6 = move-exception
            goto L_0x0084
        L_0x0041:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            pz.b r1 = r5.f129665a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129676c = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129677d = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129678e = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129679f = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129680g = r5     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f129681h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129682i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129685l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r1 = r1.a(r6, r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r1 != r2) goto L_0x0068
            return r2
        L_0x0068:
            if (r1 == 0) goto L_0x0071
            com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r1 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r6 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0083
        L_0x0071:
            java.lang.String r6 = "Required value was null."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7.<init>(r6)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            throw r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
        L_0x0079:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0083:
            return r6
        L_0x0084:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.C14837c.c(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r6, dI.C17164e<? super XH.x<com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mz.C14837c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            mz.c$a r0 = (mz.C14837c.a) r0
            int r1 = r0.f129672h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129672h = r1
            goto L_0x0018
        L_0x0013:
            mz.c$a r0 = new mz.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129670f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129672h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f129669e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f129668d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f129667c
            mz.c r6 = (mz.C14837c) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x005b
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            mz.c$b r1 = new mz.c$b
            r3 = 0
            r1.<init>(r5, r6, r3)
            r0.f129667c = r5
            r0.f129668d = r6
            r0.f129669e = r7
            r0.f129672h = r4
            java.lang.Object r6 = r5.g(r1, r0)
            if (r6 != r2) goto L_0x005b
            return r2
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mz.C14837c.d(java.lang.String, dI.e):java.lang.Object");
    }
}
