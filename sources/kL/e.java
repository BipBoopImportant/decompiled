package Kl;

import HJ.C15854t;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import sf.C10242c;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\u0014\u0010\u000fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LKl/e;", "LJl/b;", "Lsf/c;", "iAppUserDataRepository", "LIl/c;", "marketConfigRemoteDataSource", "LKl/c;", "marketConfigLocalDataSource", "<init>", "(Lsf/c;LIl/c;LKl/c;)V", "", "marketCode", "languageCode", "LRl/e;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "marketConfig", "LXH/N;", "f", "(LRl/e;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "c", "", "LRl/d;", "b", "(LdI/e;)Ljava/lang/Object;", "LIl/c;", "LKl/c;", "LTJ/g;", "LTJ/g;", "d", "()LTJ/g;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements Jl.b {

    /* renamed from: a  reason: collision with root package name */
    private final Il.c f82864a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final c f82865b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Rl.e> f82866c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "languageCode", "marketCode", "LTJ/g;", "LRl/e;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.appconfig.impl.config.MarketConfigRepositoryImpl$marketConfig$1", f = "MarketConfigRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<String, String, C17164e<? super C16532g<? extends Rl.e>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82867c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82868d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f82869e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f82870f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(3, eVar2);
            this.f82870f = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82867c == 0) {
                y.b(obj);
                String str = (String) this.f82868d;
                String str2 = (String) this.f82869e;
                return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? C16534i.J(null) : this.f82870f.f82865b.b(str2, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(String str, String str2, C17164e<? super C16532g<Rl.e>> eVar) {
            a aVar = new a(this.f82870f, eVar);
            aVar.f82868d = str;
            aVar.f82869e = str2;
            return aVar.invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRl/e;", "it", "LXH/N;", "<anonymous>", "(LRl/e;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.appconfig.impl.config.MarketConfigRepositoryImpl$marketConfig$2", f = "MarketConfigRepositoryImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Rl.e, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82871c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82872d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f82873e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f82873e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f82873e, eVar);
            bVar.f82872d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(Rl.e eVar, C17164e<? super C16807N> eVar2) {
            return ((b) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82871c == 0) {
                y.b(obj);
                Rl.e eVar = (Rl.e) this.f82872d;
                e eVar2 = this.f82873e;
                qv.e eVar3 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar3, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("New config emitted " + (eVar != null ? eVar.n() : null) + "_" + (eVar != null ? eVar.k() : null), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = eVar2.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar3, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.appconfig.impl.config.MarketConfigRepositoryImpl", f = "MarketConfigRepositoryImpl.kt", l = {56, 60}, m = "update")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82874c;

        /* renamed from: d  reason: collision with root package name */
        Object f82875d;

        /* renamed from: e  reason: collision with root package name */
        Object f82876e;

        /* renamed from: f  reason: collision with root package name */
        Object f82877f;

        /* renamed from: g  reason: collision with root package name */
        Object f82878g;

        /* renamed from: h  reason: collision with root package name */
        Object f82879h;

        /* renamed from: i  reason: collision with root package name */
        Object f82880i;

        /* renamed from: j  reason: collision with root package name */
        int f82881j;

        /* renamed from: k  reason: collision with root package name */
        int f82882k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f82883l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f82884m;

        /* renamed from: n  reason: collision with root package name */
        int f82885n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, C17164e<? super c> eVar2) {
            super(eVar2);
            this.f82884m = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82883l = obj;
            this.f82885n |= Integer.MIN_VALUE;
            return this.f82884m.c((String) null, (String) null, this);
        }
    }

    public e(C10242c cVar, Il.c cVar2, c cVar3) {
        C17542s.j(cVar, "iAppUserDataRepository");
        C17542s.j(cVar2, "marketConfigRemoteDataSource");
        C17542s.j(cVar3, "marketConfigLocalDataSource");
        this.f82864a = cVar2;
        this.f82865b = cVar3;
        this.f82866c = C16534i.R(C16534i.s(C16534i.G(C16534i.n(cVar.y(), cVar.n(), new a(this, (C17164e<? super a>) null)))), new b(this, (C17164e<? super b>) null));
    }

    public Object a(String str, String str2, C17164e<? super Rl.e> eVar) {
        return this.f82865b.a(str, str2, eVar);
    }

    public Object b(C17164e<? super List<Rl.d>> eVar) {
        return this.f82864a.b(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r2 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027a, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x004d, B:18:0x007c] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x004d, B:24:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[ExcHandler: CancellationException (r0v13 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0 A[Catch:{ CancellationException -> 0x0055, all -> 0x0052 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1 A[Catch:{ CancellationException -> 0x0055, all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0278 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r29, java.lang.String r30, dI.C17164e<? super Rl.e> r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            r2 = r30
            r3 = r31
            boolean r4 = r3 instanceof Kl.e.c
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Kl.e$c r4 = (Kl.e.c) r4
            int r5 = r4.f82885n
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f82885n = r5
            goto L_0x0020
        L_0x001b:
            Kl.e$c r4 = new Kl.e$c
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f82883l
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f82885n
            r8 = 0
            r9 = 1
            r10 = 2
            if (r7 == 0) goto L_0x008c
            if (r7 == r9) goto L_0x0060
            if (r7 != r10) goto L_0x0058
            java.lang.Object r0 = r4.f82880i
            Rl.e r0 = (Rl.e) r0
            java.lang.Object r2 = r4.f82879h
            Kl.e r2 = (Kl.e) r2
            java.lang.Object r2 = r4.f82878g
            Kl.e r2 = (Kl.e) r2
            java.lang.Object r2 = r4.f82877f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r4.f82876e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f82875d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f82874c
            Kl.e r2 = (Kl.e) r2
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            goto L_0x00d2
        L_0x0052:
            r0 = move-exception
            goto L_0x00d9
        L_0x0055:
            r0 = move-exception
            goto L_0x027a
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0060:
            int r0 = r4.f82882k
            int r2 = r4.f82881j
            java.lang.Object r3 = r4.f82879h
            Kl.e r3 = (Kl.e) r3
            java.lang.Object r7 = r4.f82878g
            Kl.e r7 = (Kl.e) r7
            java.lang.Object r11 = r4.f82877f
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r12 = r4.f82876e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r4.f82875d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.f82874c
            Kl.e r14 = (Kl.e) r14
            XH.y.b(r5)     // Catch:{ CancellationException -> 0x0055, all -> 0x0089 }
            r27 = r5
            r5 = r2
            r2 = r14
            r14 = r7
            r7 = r3
            r3 = r11
            r11 = r27
            goto L_0x00b4
        L_0x0089:
            r0 = move-exception
            r2 = r14
            goto L_0x00d9
        L_0x008c:
            XH.y.b(r5)
            XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            Il.c r5 = r1.f82864a     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82874c = r1     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82875d = r0     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82876e = r2     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82877f = r3     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82878g = r1     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82879h = r1     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82881j = r8     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82882k = r8     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            r4.f82885n = r9     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            java.lang.Object r5 = r5.c(r0, r2, r4)     // Catch:{ CancellationException -> 0x0055, all -> 0x00d7 }
            if (r5 != r6) goto L_0x00ac
            return r6
        L_0x00ac:
            r13 = r0
            r7 = r1
            r14 = r7
            r12 = r2
            r11 = r5
            r0 = r8
            r5 = r0
            r2 = r14
        L_0x00b4:
            Rl.e r11 = (Rl.e) r11     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82874c = r2     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82875d = r13     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82876e = r12     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82877f = r3     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82878g = r14     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82879h = r7     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82880i = r11     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82881j = r5     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82882k = r0     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            r4.f82885n = r10     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            java.lang.Object r0 = r7.f(r11, r13, r12, r4)     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            if (r0 != r6) goto L_0x00d1
            return r6
        L_0x00d1:
            r0 = r11
        L_0x00d2:
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0055, all -> 0x0052 }
            goto L_0x00e3
        L_0x00d7:
            r0 = move-exception
            r2 = r1
        L_0x00d9:
            XH.x$a r3 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x00e3:
            boolean r3 = XH.x.h(r0)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r7 = "main"
            java.lang.String r11 = "Kt"
            if (r3 == 0) goto L_0x01c3
            r3 = r0
            Rl.e r3 = (Rl.e) r3
            qv.e r15 = qv.e.DEBUG
            qv.d r16 = qv.d.f102012a
            java.util.List r16 = r16.a()
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r16 = r16.iterator()
        L_0x0109:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0121
            java.lang.Object r12 = r16.next()
            r10 = r12
            qv.b r10 = (qv.C11819b) r10
            boolean r10 = r10.b(r15, r8)
            if (r10 == 0) goto L_0x011f
            r9.add(r12)
        L_0x011f:
            r10 = 2
            goto L_0x0109
        L_0x0121:
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r12 = 0
        L_0x0127:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x01c3
            java.lang.Object r16 = r9.next()
            qv.b r16 = (qv.C11819b) r16
            if (r10 != 0) goto L_0x0162
            java.lang.String r10 = r3.n()
            java.lang.String r13 = r3.k()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r8 = "Updated with new config "
            r14.append(r8)
            r14.append(r10)
            java.lang.String r8 = "_"
            r14.append(r8)
            r14.append(r13)
            java.lang.String r8 = r14.toString()
            r10 = 0
            java.lang.String r8 = qv.C11818a.a(r8, r10)
            if (r8 != 0) goto L_0x015e
            goto L_0x01c3
        L_0x015e:
            java.lang.String r10 = qv.C11820c.a(r8)
        L_0x0162:
            if (r12 != 0) goto L_0x01ac
            java.lang.Class r8 = r2.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r12 = 2
            r13 = 36
            r14 = 0
            java.lang.String r1 = HJ.C15854t.s1(r8, r13, r14, r12, r14)
            r13 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r13, r14, r12, r14)
            int r12 = r1.length()
            if (r12 != 0) goto L_0x0184
            goto L_0x0188
        L_0x0184:
            java.lang.String r8 = HJ.C15854t.P0(r1, r11)
        L_0x0188:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r12 = 1
            boolean r1 = HJ.C15854t.b0(r1, r7, r12)
            if (r1 == 0) goto L_0x0199
            r1 = r6
            goto L_0x019a
        L_0x0199:
            r1 = r5
        L_0x019a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r12.append(r4)
            r12.append(r8)
            java.lang.String r12 = r12.toString()
        L_0x01ac:
            r18 = 0
            r1 = r15
            r15 = r16
            r16 = r1
            r17 = r12
            r8 = 0
            r19 = r8
            r20 = r10
            r15.a(r16, r17, r18, r19, r20)
            r15 = r1
            r8 = 0
            r1 = r28
            goto L_0x0127
        L_0x01c3:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 == 0) goto L_0x0272
            qv.e r3 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x01dc:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01f4
            java.lang.Object r10 = r8.next()
            r12 = r10
            qv.b r12 = (qv.C11819b) r12
            r13 = 0
            boolean r12 = r12.b(r3, r13)
            if (r12 == 0) goto L_0x01dc
            r9.add(r10)
            goto L_0x01dc
        L_0x01f4:
            java.util.Iterator r8 = r9.iterator()
            r9 = 0
            r14 = 0
        L_0x01fa:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0272
            java.lang.Object r10 = r8.next()
            r21 = r10
            qv.b r21 = (qv.C11819b) r21
            r10 = 0
            if (r14 != 0) goto L_0x0217
            java.lang.String r12 = qv.C11818a.a(r10, r1)
            if (r12 != 0) goto L_0x0212
            goto L_0x0272
        L_0x0212:
            java.lang.String r12 = qv.C11820c.a(r12)
            r14 = r12
        L_0x0217:
            if (r9 != 0) goto L_0x0261
            java.lang.Class r9 = r2.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r12 = 2
            r13 = 36
            java.lang.String r15 = HJ.C15854t.s1(r9, r13, r10, r12, r10)
            r13 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r13, r10, r12, r10)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x0238
            goto L_0x023c
        L_0x0238:
            java.lang.String r9 = HJ.C15854t.P0(r15, r11)
        L_0x023c:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r10 = 1
            boolean r15 = HJ.C15854t.b0(r15, r7, r10)
            if (r15 == 0) goto L_0x024d
            r15 = r6
            goto L_0x024e
        L_0x024d:
            r15 = r5
        L_0x024e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r15)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x0264
        L_0x0261:
            r12 = 2
            r13 = 46
        L_0x0264:
            r24 = 0
            r22 = r3
            r23 = r9
            r25 = r1
            r26 = r14
            r21.a(r22, r23, r24, r25, r26)
            goto L_0x01fa
        L_0x0272:
            boolean r1 = XH.x.g(r0)
            if (r1 == 0) goto L_0x0279
            r0 = 0
        L_0x0279:
            return r0
        L_0x027a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Kl.e.c(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    public C16532g<Rl.e> d() {
        return this.f82866c;
    }

    public Object f(Rl.e eVar, String str, String str2, C17164e<? super C16807N> eVar2) {
        Object c10 = this.f82865b.c(eVar, str, str2, eVar2);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
