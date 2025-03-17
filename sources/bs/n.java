package Bs;

import HJ.C15854t;
import QJ.N;
import QJ.Q;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rs.C11844a;
import zs.i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0015B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013HB¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LBs/n;", "LBs/m;", "Lzs/i;", "notificationUriMapper", "LQs/b;", "getNotificationMessage", "LBs/i;", "markNotificationAsRead", "Lrs/a;", "analytics", "LQJ/Q;", "applicationScope", "<init>", "(Lzs/i;LQs/b;LBs/i;Lrs/a;LQJ/Q;)V", "LPs/b;", "inboxId", "LXH/N;", "c", "(LPs/b;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "applink", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "Lzs/i;", "b", "LQs/b;", "LBs/i;", "d", "Lrs/a;", "e", "LQJ/Q;", "f", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f79429f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f79430g = 8;

    /* renamed from: h  reason: collision with root package name */
    private static final N f79431h = new d(N.f137593c0);

    /* renamed from: a  reason: collision with root package name */
    private final i f79432a;

    /* renamed from: b  reason: collision with root package name */
    private final Qs.b f79433b;

    /* renamed from: c  reason: collision with root package name */
    private final i f79434c;

    /* renamed from: d  reason: collision with root package name */
    private final C11844a f79435d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f79436e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LBs/n$a;", "", "<init>", "()V", "LQJ/N;", "exceptionHandler", "LQJ/N;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.ResolveNotificationContentUriUseCaseImpl", f = "ResolveNotificationContentUriUseCase.kt", l = {41}, m = "invoke")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79437c;

        /* renamed from: d  reason: collision with root package name */
        Object f79438d;

        /* renamed from: e  reason: collision with root package name */
        Object f79439e;

        /* renamed from: f  reason: collision with root package name */
        Object f79440f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f79441g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ n f79442h;

        /* renamed from: i  reason: collision with root package name */
        int f79443i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f79442h = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79441g = obj;
            this.f79443i |= Integer.MIN_VALUE;
            return this.f79442h.a((Uri) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.usecase.ResolveNotificationContentUriUseCaseImpl$invoke$4", f = "ResolveNotificationContentUriUseCase.kt", l = {50}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f79445d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ps.b f79446e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, Ps.b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f79445d = nVar;
            this.f79446e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f79445d, this.f79446e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f79444c;
            if (i10 == 0) {
                y.b(obj);
                n nVar = this.f79445d;
                Ps.b bVar = this.f79446e;
                this.f79444c = 1;
                if (nVar.c(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Bs/n$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {
        public d(N.a aVar) {
            super(aVar);
        }

        public void handleException(C17168i iVar, Throwable th2) {
            a aVar = n.f79429f;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Caught exception in usecase", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = aVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.ResolveNotificationContentUriUseCaseImpl", f = "ResolveNotificationContentUriUseCase.kt", l = {57, 58}, m = "trackAndMarkAsRead")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79447c;

        /* renamed from: d  reason: collision with root package name */
        Object f79448d;

        /* renamed from: e  reason: collision with root package name */
        Object f79449e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f79450f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f79451g;

        /* renamed from: h  reason: collision with root package name */
        int f79452h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(n nVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f79451g = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79450f = obj;
            this.f79452h |= Integer.MIN_VALUE;
            return this.f79451g.c((Ps.b) null, this);
        }
    }

    public n(i iVar, Qs.b bVar, i iVar2, C11844a aVar, Q q10) {
        C17542s.j(iVar, "notificationUriMapper");
        C17542s.j(bVar, "getNotificationMessage");
        C17542s.j(iVar2, "markNotificationAsRead");
        C17542s.j(aVar, "analytics");
        C17542s.j(q10, "applicationScope");
        this.f79432a = iVar;
        this.f79433b = bVar;
        this.f79434c = iVar2;
        this.f79435d = aVar;
        this.f79436e = q10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: dI.e<? super XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(Ps.b r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Bs.n.e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Bs.n$e r0 = (Bs.n.e) r0
            int r1 = r0.f79452h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79452h = r1
            goto L_0x0018
        L_0x0013:
            Bs.n$e r0 = new Bs.n$e
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f79450f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79452h
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0053
            if (r3 == r4) goto L_0x0040
            if (r3 != r5) goto L_0x0038
            java.lang.Object r14 = r0.f79449e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f79448d
            Ps.b r14 = (Ps.b) r14
            java.lang.Object r15 = r0.f79447c
            Bs.n r15 = (Bs.n) r15
            XH.y.b(r1)
            goto L_0x007a
        L_0x0038:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0040:
            java.lang.Object r14 = r0.f79449e
            r15 = r14
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r14 = r0.f79448d
            Ps.b r14 = (Ps.b) r14
            java.lang.Object r3 = r0.f79447c
            Bs.n r3 = (Bs.n) r3
            XH.y.b(r1)
            r1 = r15
            r15 = r3
            goto L_0x0069
        L_0x0053:
            XH.y.b(r1)
            Bs.i r1 = r13.f79434c
            r0.f79447c = r13
            r0.f79448d = r14
            r0.f79449e = r15
            r0.f79452h = r4
            java.lang.Object r1 = r1.a(r14, r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            r1 = r15
            r15 = r13
        L_0x0069:
            Qs.b r3 = r15.f79433b
            r0.f79447c = r15
            r0.f79448d = r14
            r0.f79449e = r1
            r0.f79452h = r5
            java.lang.Object r1 = r3.a(r14, r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            Ps.d r1 = (Ps.d) r1
            if (r1 == 0) goto L_0x008f
            rs.a r14 = r15.f79435d
            java.lang.String r15 = r1.h()
            java.lang.String r0 = r1.i()
            rs.c r1 = rs.c.NOTIFICATION_CENTER
            r14.f(r15, r0, r1)
            goto L_0x0147
        L_0x008f:
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r1.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r0, r7)
            if (r6 == 0) goto L_0x00a2
            r2.add(r3)
            goto L_0x00a2
        L_0x00ba:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r6 = r3
        L_0x00c1:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0147
            java.lang.Object r7 = r1.next()
            qv.b r7 = (qv.C11819b) r7
            r10 = 0
            if (r3 != 0) goto L_0x00ec
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "Could not find notification for id:"
            r3.append(r8)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = qv.C11818a.a(r3, r10)
            if (r3 != 0) goto L_0x00e8
            goto L_0x0147
        L_0x00e8:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00ec:
            if (r6 != 0) goto L_0x013b
            java.lang.Class r6 = r15.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r2, r5, r2)
            r9 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r9, r2, r5, r2)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x010c
            goto L_0x0112
        L_0x010c:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x0112:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r4)
            if (r8 == 0) goto L_0x0125
            java.lang.String r8 = "m"
            goto L_0x0127
        L_0x0125:
            java.lang.String r8 = "b"
        L_0x0127:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x013b:
            r12 = r6
            r9 = 0
            r6 = r7
            r7 = r0
            r8 = r12
            r11 = r3
            r6.a(r7, r8, r9, r10, r11)
            r6 = r12
            goto L_0x00c1
        L_0x0147:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Bs.n.c(Ps.b, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(android.net.Uri r31, dI.C17164e<? super android.net.Uri> r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            boolean r3 = r2 instanceof Bs.n.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Bs.n$b r3 = (Bs.n.b) r3
            int r4 = r3.f79443i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f79443i = r4
            goto L_0x001e
        L_0x0019:
            Bs.n$b r3 = new Bs.n$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f79441g
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f79443i
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 0
            r15 = 2
            r12 = 1
            r13 = 0
            if (r6 == 0) goto L_0x0055
            if (r6 != r12) goto L_0x004d
            java.lang.Object r1 = r3.f79440f
            Ps.b r1 = (Ps.b) r1
            java.lang.Object r2 = r3.f79439e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f79438d
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r2 = r3.f79437c
            Bs.n r2 = (Bs.n) r2
            XH.y.b(r4)
            goto L_0x012c
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0055:
            XH.y.b(r4)
            zs.i r4 = r0.f79432a
            Ps.b r4 = r4.a(r1)
            if (r4 != 0) goto L_0x0113
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r2, r14)
            if (r6 == 0) goto L_0x0073
            r4.add(r5)
            goto L_0x0073
        L_0x008a:
            java.util.Iterator r3 = r4.iterator()
            r4 = r13
            r5 = r4
        L_0x0090:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r3.next()
            r17 = r6
            qv.b r17 = (qv.C11819b) r17
            r6 = 0
            if (r4 != 0) goto L_0x00bd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r14 = "Could not get id from applink: "
            r4.append(r14)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r6)
            if (r4 != 0) goto L_0x00b9
            goto L_0x0112
        L_0x00b9:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x00bd:
            if (r5 != 0) goto L_0x0102
            java.lang.Class<Bs.n> r5 = Bs.n.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r14 = 36
            java.lang.String r6 = HJ.C15854t.s1(r5, r14, r13, r15, r13)
            r14 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r14, r13, r15, r13)
            int r14 = r6.length()
            if (r14 != 0) goto L_0x00db
            goto L_0x00df
        L_0x00db:
            java.lang.String r5 = HJ.C15854t.P0(r6, r11)
        L_0x00df:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            boolean r6 = HJ.C15854t.b0(r6, r10, r12)
            if (r6 == 0) goto L_0x00ef
            r6 = r9
            goto L_0x00f0
        L_0x00ef:
            r6 = r8
        L_0x00f0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r7)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
        L_0x0102:
            r20 = 0
            r18 = r2
            r19 = r5
            r6 = 0
            r21 = r6
            r22 = r4
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0090
        L_0x0112:
            return r13
        L_0x0113:
            zs.i r6 = r0.f79432a
            r3.f79437c = r0
            r3.f79438d = r1
            r3.f79439e = r2
            r3.f79440f = r4
            r3.f79443i = r12
            java.lang.Object r1 = r6.b(r4, r3)
            if (r1 != r5) goto L_0x0126
            return r5
        L_0x0126:
            r2 = r0
            r29 = r4
            r4 = r1
            r1 = r29
        L_0x012c:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0135
            android.net.Uri r3 = android.net.Uri.parse(r4)
            goto L_0x0136
        L_0x0135:
            r3 = r13
        L_0x0136:
            if (r3 != 0) goto L_0x01ef
            qv.e r3 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x014b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0163
            java.lang.Object r6 = r4.next()
            r12 = r6
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r14)
            if (r12 == 0) goto L_0x0161
            r5.add(r6)
        L_0x0161:
            r12 = 1
            goto L_0x014b
        L_0x0163:
            java.util.Iterator r4 = r5.iterator()
            r5 = r13
            r6 = r5
        L_0x0169:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x01ee
            java.lang.Object r12 = r4.next()
            r17 = r12
            qv.b r17 = (qv.C11819b) r17
            r12 = 0
            if (r5 != 0) goto L_0x0196
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Could not get a content uri for id: "
            r5.append(r14)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r12)
            if (r5 != 0) goto L_0x0192
            goto L_0x01ee
        L_0x0192:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0196:
            if (r6 != 0) goto L_0x01de
            java.lang.Class r6 = r2.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r14 = 36
            java.lang.String r12 = HJ.C15854t.s1(r6, r14, r13, r15, r13)
            r14 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r14, r13, r15, r13)
            int r16 = r12.length()
            if (r16 != 0) goto L_0x01b6
            goto L_0x01ba
        L_0x01b6:
            java.lang.String r6 = HJ.C15854t.P0(r12, r11)
        L_0x01ba:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r10, r14)
            if (r12 == 0) goto L_0x01cb
            r12 = r9
            goto L_0x01cc
        L_0x01cb:
            r12 = r8
        L_0x01cc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r14.append(r7)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
        L_0x01de:
            r20 = 0
            r18 = r3
            r19 = r6
            r12 = 0
            r21 = r12
            r22 = r5
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0169
        L_0x01ee:
            return r13
        L_0x01ef:
            QJ.Q r4 = r2.f79436e
            QJ.N r24 = f79431h
            Bs.n$c r5 = new Bs.n$c
            r5.<init>(r2, r1, r13)
            r27 = 2
            r28 = 0
            r25 = 0
            r23 = r4
            r26 = r5
            QJ.F0 unused = QJ.C16314k.d(r23, r24, r25, r26, r27, r28)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Bs.n.a(android.net.Uri, dI.e):java.lang.Object");
    }
}
