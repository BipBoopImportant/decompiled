package Oz;

import HJ.C15854t;
import QJ.M;
import QJ.Q;
import Ry.f;
import XH.C16807N;
import XH.x;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tz.C15100a;
import ug.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HB¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LOz/c;", "LOz/b;", "LRy/f;", "scanAndGoCartRepositoryFactory", "Lug/j;", "enabledFeaturesFactory", "LRy/b;", "capability", "LQJ/M;", "dispatcherIO", "Ltz/a;", "getProfileStateUseCase", "LRy/a;", "scanAndGoSettingsRepo", "LOz/a;", "resolveFallBackStoreIdForCleanUp", "<init>", "(LRy/f;Lug/j;LRy/b;LQJ/M;Ltz/a;LRy/a;LOz/a;)V", "", "storeId", "LXH/N;", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LRy/f;", "b", "Lug/j;", "c", "LRy/b;", "LQJ/M;", "e", "Ltz/a;", "f", "LRy/a;", "g", "LOz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f113760a;

    /* renamed from: b  reason: collision with root package name */
    private final j f113761b;

    /* renamed from: c  reason: collision with root package name */
    private final Ry.b f113762c;

    /* renamed from: d  reason: collision with root package name */
    private final M f113763d;

    /* renamed from: e  reason: collision with root package name */
    private final C15100a f113764e;

    /* renamed from: f  reason: collision with root package name */
    private final Ry.a f113765f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final a f113766g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.usecase.ScanAndGoCleanUpUseCaseImpl", f = "ScanAndGoCleanUpUseCaseImpl.kt", l = {55, 53}, m = "clearCart")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f113767c;

        /* renamed from: d  reason: collision with root package name */
        Object f113768d;

        /* renamed from: e  reason: collision with root package name */
        Object f113769e;

        /* renamed from: f  reason: collision with root package name */
        Object f113770f;

        /* renamed from: g  reason: collision with root package name */
        Object f113771g;

        /* renamed from: h  reason: collision with root package name */
        Object f113772h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f113773i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f113774j;

        /* renamed from: k  reason: collision with root package name */
        int f113775k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f113774j = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113773i = obj;
            this.f113775k |= Integer.MIN_VALUE;
            return this.f113774j.d((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.usecase.ScanAndGoCleanUpUseCaseImpl", f = "ScanAndGoCleanUpUseCaseImpl.kt", l = {32, 48}, m = "invoke")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f113776c;

        /* renamed from: d  reason: collision with root package name */
        Object f113777d;

        /* renamed from: e  reason: collision with root package name */
        Object f113778e;

        /* renamed from: f  reason: collision with root package name */
        Object f113779f;

        /* renamed from: g  reason: collision with root package name */
        Object f113780g;

        /* renamed from: h  reason: collision with root package name */
        Object f113781h;

        /* renamed from: i  reason: collision with root package name */
        Object f113782i;

        /* renamed from: j  reason: collision with root package name */
        Object f113783j;

        /* renamed from: k  reason: collision with root package name */
        Object f113784k;

        /* renamed from: l  reason: collision with root package name */
        Object f113785l;

        /* renamed from: m  reason: collision with root package name */
        Object f113786m;

        /* renamed from: n  reason: collision with root package name */
        int f113787n;

        /* renamed from: o  reason: collision with root package name */
        int f113788o;

        /* renamed from: p  reason: collision with root package name */
        int f113789p;

        /* renamed from: q  reason: collision with root package name */
        int f113790q;

        /* renamed from: r  reason: collision with root package name */
        int f113791r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f113792s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ c f113793t;

        /* renamed from: u  reason: collision with root package name */
        int f113794u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f113793t = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113792s = obj;
            this.f113794u |= Integer.MIN_VALUE;
            return this.f113793t.a((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.usecase.ScanAndGoCleanUpUseCaseImpl$invoke$3", f = "ScanAndGoCleanUpUseCaseImpl.kt", l = {34, 35, 43}, m = "invokeSuspend")
    /* renamed from: Oz.c$c  reason: collision with other inner class name */
    static final class C2794c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f113795c;

        /* renamed from: d  reason: collision with root package name */
        Object f113796d;

        /* renamed from: e  reason: collision with root package name */
        Object f113797e;

        /* renamed from: f  reason: collision with root package name */
        int f113798f;

        /* renamed from: g  reason: collision with root package name */
        int f113799g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f113800h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f113801i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f113802j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2794c(String str, c cVar, C17164e<? super C2794c> eVar) {
            super(2, eVar);
            this.f113801i = str;
            this.f113802j = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2794c cVar = new C2794c(this.f113801i, this.f113802j, eVar);
            cVar.f113800h = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2794c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f113799g;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f113800h;
                String str = this.f113801i;
                if (str == null || str.length() == 0) {
                    a c10 = this.f113802j.f113766g;
                    this.f113800h = q10;
                    this.f113795c = str;
                    this.f113799g = 1;
                    obj2 = c10.a(this);
                    if (obj2 == f10) {
                        return f10;
                    }
                } else {
                    c cVar = this.f113802j;
                    String str2 = this.f113801i;
                    this.f113800h = q10;
                    this.f113795c = str;
                    this.f113799g = 3;
                    if (cVar.d(str2, this) == f10) {
                        return f10;
                    }
                    return C16807N.f139792a;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    String str3 = (String) this.f113797e;
                    c cVar2 = (c) this.f113796d;
                } else if (i10 == 3) {
                    CharSequence charSequence = (CharSequence) this.f113795c;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q q11 = (Q) this.f113800h;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                CharSequence charSequence2 = (CharSequence) this.f113795c;
                q10 = (Q) this.f113800h;
                y.b(obj);
                obj2 = ((x) obj).j();
            }
            c cVar3 = this.f113802j;
            if (x.e(obj2) == null) {
                String str4 = (String) obj2;
                this.f113800h = q10;
                this.f113795c = obj2;
                this.f113796d = cVar3;
                this.f113797e = str4;
                this.f113798f = 0;
                this.f113799g = 2;
                if (cVar3.d(str4, this) == f10) {
                    return f10;
                }
            } else {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar : arrayList) {
                    if (str5 == null) {
                        String a10 = C11818a.a("Could not find a valid store id to clear cart with", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str5 = C11820c.a(a10);
                    }
                    String str7 = str5;
                    if (str6 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str8 = str6;
                    bVar.a(eVar, str8, false, (Throwable) null, str7);
                    str5 = str7;
                    str6 = str8;
                }
            }
            return C16807N.f139792a;
        }
    }

    public c(f fVar, j jVar, Ry.b bVar, M m10, C15100a aVar, Ry.a aVar2, a aVar3) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(jVar, "enabledFeaturesFactory");
        C17542s.j(bVar, "capability");
        C17542s.j(m10, "dispatcherIO");
        C17542s.j(aVar, "getProfileStateUseCase");
        C17542s.j(aVar2, "scanAndGoSettingsRepo");
        C17542s.j(aVar3, "resolveFallBackStoreIdForCleanUp");
        this.f113760a = fVar;
        this.f113761b = jVar;
        this.f113762c = bVar;
        this.f113763d = m10;
        this.f113764e = aVar;
        this.f113765f = aVar2;
        this.f113766g = aVar3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r24, dI.C17164e<? super XH.C16807N> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof Oz.c.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Oz.c$a r3 = (Oz.c.a) r3
            int r4 = r3.f113775k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f113775k = r4
            goto L_0x001e
        L_0x0019:
            Oz.c$a r3 = new Oz.c$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f113773i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f113775k
            r7 = 1
            r8 = 2
            if (r6 == 0) goto L_0x0072
            if (r6 == r7) goto L_0x0054
            if (r6 != r8) goto L_0x004c
            java.lang.Object r1 = r3.f113771g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f113770f
            Ry.e r1 = (Ry.e) r1
            java.lang.Object r1 = r3.f113769e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f113768d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f113767c
            Oz.c r1 = (Oz.c) r1
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r2 = r4.j()
            goto L_0x00af
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0054:
            java.lang.Object r1 = r3.f113771g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.f113770f
            Ry.e r2 = (Ry.e) r2
            java.lang.Object r6 = r3.f113769e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r9 = r3.f113768d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.f113767c
            Oz.c r10 = (Oz.c) r10
            XH.y.b(r4)
            r22 = r4
            r4 = r2
            r2 = r6
            r6 = r22
            goto L_0x0092
        L_0x0072:
            XH.y.b(r4)
            Ry.f r4 = r0.f113760a
            Ry.e r4 = r4.invoke()
            tz.a r6 = r0.f113764e
            r3.f113767c = r0
            r3.f113768d = r1
            r3.f113769e = r2
            r3.f113770f = r4
            r3.f113771g = r1
            r3.f113775k = r7
            java.lang.Object r6 = r6.a(r3)
            if (r6 != r5) goto L_0x0090
            return r5
        L_0x0090:
            r10 = r0
            r9 = r1
        L_0x0092:
            r11 = r6
            rz.K r11 = (rz.K) r11
            java.lang.String r11 = r11.a()
            r3.f113767c = r10
            r3.f113768d = r9
            r3.f113769e = r2
            r3.f113770f = r4
            r3.f113771g = r1
            r3.f113772h = r6
            r3.f113775k = r8
            java.lang.Object r2 = r4.l(r1, r11, r3)
            if (r2 != r5) goto L_0x00ae
            return r5
        L_0x00ae:
            r1 = r10
        L_0x00af:
            java.lang.Throwable r3 = XH.x.e(r2)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r15 = "main"
            java.lang.String r14 = "Kt"
            r12 = 36
            r11 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0181
            qv.e r9 = qv.e.WARN
            qv.d r16 = qv.d.f102012a
            java.util.List r16 = r16.a()
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r16 = r16.iterator()
        L_0x00d6:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x00ee
            java.lang.Object r13 = r16.next()
            r8 = r13
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r9, r11)
            if (r8 == 0) goto L_0x00ec
            r7.add(r13)
        L_0x00ec:
            r8 = 2
            goto L_0x00d6
        L_0x00ee:
            java.util.Iterator r7 = r7.iterator()
            r8 = r10
            r13 = r8
        L_0x00f4:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L_0x0181
            java.lang.Object r16 = r7.next()
            qv.b r16 = (qv.C11819b) r16
            if (r8 != 0) goto L_0x0110
            java.lang.String r8 = "Failed to clear cart"
            java.lang.String r8 = qv.C11818a.a(r8, r3)
            if (r8 != 0) goto L_0x010c
            goto L_0x0181
        L_0x010c:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x0110:
            if (r13 != 0) goto L_0x0159
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r11 = 2
            java.lang.String r0 = HJ.C15854t.s1(r13, r12, r10, r11, r10)
            r12 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r12, r10, r11, r10)
            int r11 = r0.length()
            if (r11 != 0) goto L_0x012f
            goto L_0x0133
        L_0x012f:
            java.lang.String r13 = HJ.C15854t.P0(r0, r14)
        L_0x0133:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r11 = 1
            boolean r0 = HJ.C15854t.b0(r0, r15, r11)
            if (r0 == 0) goto L_0x0144
            r0 = r6
            goto L_0x0145
        L_0x0144:
            r0 = r5
        L_0x0145:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r4)
            r11.append(r13)
            java.lang.String r13 = r11.toString()
        L_0x0157:
            r0 = r13
            goto L_0x015c
        L_0x0159:
            r12 = 46
            goto L_0x0157
        L_0x015c:
            r13 = 0
            r20 = r9
            r9 = r16
            r11 = r10
            r10 = r20
            r24 = r5
            r5 = 0
            r11 = r0
            r16 = r12
            r12 = r13
            r13 = r3
            r21 = r14
            r14 = r8
            r9.a(r10, r11, r12, r13, r14)
            r13 = r0
            r11 = r5
            r9 = r20
            r14 = r21
            r10 = 0
            r12 = 36
            r0 = r23
            r5 = r24
            goto L_0x00f4
        L_0x0181:
            r24 = r5
            r5 = r11
            r21 = r14
            boolean r0 = XH.x.h(r2)
            if (r0 == 0) goto L_0x0246
            XH.N r2 = (XH.C16807N) r2
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01a1:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01b8
            java.lang.Object r7 = r2.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            boolean r8 = r8.b(r0, r5)
            if (r8 == 0) goto L_0x01a1
            r3.add(r7)
            goto L_0x01a1
        L_0x01b8:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r10 = 0
        L_0x01be:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0246
            java.lang.Object r5 = r2.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r11 = 0
            if (r10 != 0) goto L_0x01dd
            java.lang.String r5 = "Successfully cleared cart"
            java.lang.String r5 = qv.C11818a.a(r5, r11)
            if (r5 != 0) goto L_0x01d8
            goto L_0x0246
        L_0x01d8:
            java.lang.String r5 = qv.C11820c.a(r5)
            goto L_0x01de
        L_0x01dd:
            r5 = r10
        L_0x01de:
            if (r3 != 0) goto L_0x022e
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r12 = 0
            r13 = 2
            r14 = 36
            java.lang.String r8 = HJ.C15854t.s1(r3, r14, r12, r13, r12)
            r10 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r10, r12, r13, r12)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0202
            r9 = r21
            goto L_0x0208
        L_0x0202:
            r9 = r21
            java.lang.String r3 = HJ.C15854t.P0(r8, r9)
        L_0x0208:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r13 = 1
            boolean r8 = HJ.C15854t.b0(r8, r15, r13)
            if (r8 == 0) goto L_0x0219
            r8 = r6
            goto L_0x021b
        L_0x0219:
            r8 = r24
        L_0x021b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r4)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            goto L_0x0234
        L_0x022e:
            r9 = r21
            r12 = 0
            r13 = 1
            r14 = 36
        L_0x0234:
            r10 = 0
            r8 = r0
            r16 = r9
            r9 = r3
            r17 = 46
            r19 = r12
            r12 = r5
            r7.a(r8, r9, r10, r11, r12)
            r10 = r5
            r21 = r16
            goto L_0x01be
        L_0x0246:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oz.c.d(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x023e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r34, dI.C17164e<? super XH.C16807N> r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            boolean r3 = r2 instanceof Oz.c.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Oz.c$b r3 = (Oz.c.b) r3
            int r4 = r3.f113794u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f113794u = r4
            goto L_0x001e
        L_0x0019:
            Oz.c$b r3 = new Oz.c$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f113792s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f113794u
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 1
            r15 = 2
            if (r6 == 0) goto L_0x00e9
            if (r6 == r14) goto L_0x0077
            if (r6 != r15) goto L_0x006f
            java.lang.Object r1 = r3.f113785l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f113784k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f113783j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f113782i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f113781h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f113780g
            Oz.c r1 = (Oz.c) r1
            java.lang.Object r1 = r3.f113779f
            Oz.c r1 = (Oz.c) r1
            java.lang.Object r1 = r3.f113778e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f113777d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f113776c
            Oz.c r1 = (Oz.c) r1
            XH.y.b(r4)
            r21 = r7
            r19 = r8
            r20 = r9
            r22 = r10
            r23 = r11
            goto L_0x0240
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r1 = r3.f113791r
            int r2 = r3.f113790q
            int r6 = r3.f113789p
            int r14 = r3.f113788o
            int r13 = r3.f113787n
            java.lang.Object r15 = r3.f113786m
            java.lang.Object r12 = r3.f113785l
            java.util.Iterator r12 = (java.util.Iterator) r12
            r34 = r1
            java.lang.Object r1 = r3.f113784k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r35 = r1
            java.lang.Object r1 = r3.f113783j
            java.lang.String r1 = (java.lang.String) r1
            r19 = r1
            java.lang.Object r1 = r3.f113782i
            java.lang.String r1 = (java.lang.String) r1
            r20 = r1
            java.lang.Object r1 = r3.f113781h
            qv.e r1 = (qv.e) r1
            r21 = r1
            java.lang.Object r1 = r3.f113780g
            Oz.c r1 = (Oz.c) r1
            r22 = r1
            java.lang.Object r1 = r3.f113779f
            Oz.c r1 = (Oz.c) r1
            r23 = r1
            java.lang.Object r1 = r3.f113778e
            dI.e r1 = (dI.C17164e) r1
            r24 = r1
            java.lang.Object r1 = r3.f113777d
            java.lang.String r1 = (java.lang.String) r1
            r25 = r1
            java.lang.Object r1 = r3.f113776c
            Oz.c r1 = (Oz.c) r1
            XH.y.b(r4)
            r4 = r1
            r26 = r2
            r2 = r24
            r1 = r25
            r25 = r34
            r24 = r5
            r5 = r23
            r23 = r11
            r11 = r13
            r13 = r20
            r20 = r9
            r9 = r21
            r21 = r7
            r7 = r6
            r6 = r22
            r22 = r10
            r10 = r12
            r12 = r35
            r32 = r19
            r19 = r8
            r8 = r14
            r14 = r32
            goto L_0x0208
        L_0x00e9:
            XH.y.b(r4)
            qv.e r4 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00ff:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0117
            java.lang.Object r13 = r6.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            boolean r14 = r14.b(r4, r15)
            if (r14 == 0) goto L_0x00ff
            r12.add(r13)
            goto L_0x00ff
        L_0x0117:
            java.util.Iterator r6 = r12.iterator()
            r15 = r12
            r13 = 0
            r14 = 0
        L_0x011e:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L_0x01b0
            java.lang.Object r15 = r6.next()
            r26 = r15
            qv.b r26 = (qv.C11819b) r26
            r19 = r8
            r8 = 0
            r20 = r9
            if (r13 != 0) goto L_0x0144
            java.lang.String r9 = "Cleaning out scan and go data and settings: start"
            java.lang.String r9 = qv.C11818a.a(r9, r8)
            if (r9 != 0) goto L_0x013f
            r23 = r5
            goto L_0x01b6
        L_0x013f:
            java.lang.String r9 = qv.C11820c.a(r9)
            r13 = r9
        L_0x0144:
            if (r14 != 0) goto L_0x0194
            java.lang.Class<Oz.c> r9 = Oz.c.class
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r23 = r5
            r22 = r15
            r8 = 2
            r14 = 36
            r15 = 0
            java.lang.String r5 = HJ.C15854t.s1(r9, r14, r15, r8, r15)
            r14 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r14, r15, r8, r15)
            int r8 = r5.length()
            if (r8 != 0) goto L_0x0168
            goto L_0x016c
        L_0x0168:
            java.lang.String r9 = HJ.C15854t.P0(r5, r11)
        L_0x016c:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r8 = 1
            boolean r5 = HJ.C15854t.b0(r5, r10, r8)
            if (r5 == 0) goto L_0x017e
            r5 = r20
            goto L_0x0180
        L_0x017e:
            r5 = r19
        L_0x0180:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            r8.append(r9)
            java.lang.String r5 = r8.toString()
            r14 = r5
            goto L_0x0198
        L_0x0194:
            r23 = r5
            r22 = r15
        L_0x0198:
            r29 = 0
            r27 = r4
            r28 = r14
            r5 = 0
            r30 = r5
            r31 = r13
            r26.a(r27, r28, r29, r30, r31)
            r8 = r19
            r9 = r20
            r15 = r22
            r5 = r23
            goto L_0x011e
        L_0x01b0:
            r23 = r5
            r19 = r8
            r20 = r9
        L_0x01b6:
            ug.j r5 = r0.f113761b
            ug.m r5 = r5.d()
            r5.f()
            QJ.M r5 = r0.f113763d
            Oz.c$c r8 = new Oz.c$c
            r9 = 0
            r8.<init>(r1, r0, r9)
            r3.f113776c = r0
            r3.f113777d = r1
            r3.f113778e = r2
            r3.f113779f = r0
            r3.f113780g = r0
            r3.f113781h = r4
            r3.f113782i = r13
            r3.f113783j = r14
            r3.f113784k = r12
            r3.f113785l = r6
            r3.f113786m = r15
            r9 = 0
            r3.f113787n = r9
            r3.f113788o = r9
            r3.f113789p = r9
            r3.f113790q = r9
            r3.f113791r = r9
            r9 = 1
            r3.f113794u = r9
            java.lang.Object r5 = QJ.C16310i.g(r5, r8, r3)
            r8 = r23
            if (r5 != r8) goto L_0x01f4
            return r8
        L_0x01f4:
            r5 = r0
            r9 = r4
            r21 = r7
            r24 = r8
            r22 = r10
            r23 = r11
            r7 = 0
            r8 = 0
            r11 = 0
            r25 = 0
            r26 = 0
            r4 = r5
            r10 = r6
            r6 = r4
        L_0x0208:
            Ry.b r0 = r4.f113762c
            r0.f()
            Ry.a r0 = r4.f113765f
            r3.f113776c = r4
            r3.f113777d = r1
            r3.f113778e = r2
            r3.f113779f = r5
            r3.f113780g = r6
            r3.f113781h = r9
            r3.f113782i = r13
            r3.f113783j = r14
            r3.f113784k = r12
            r3.f113785l = r10
            r3.f113786m = r15
            r3.f113787n = r11
            r3.f113788o = r8
            r3.f113789p = r7
            r2 = r26
            r3.f113790q = r2
            r1 = r25
            r3.f113791r = r1
            r1 = 2
            r3.f113794u = r1
            java.lang.Object r0 = r0.a(r3)
            r1 = r24
            if (r0 != r1) goto L_0x023f
            return r1
        L_0x023f:
            r1 = r4
        L_0x0240:
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0253:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x026b
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r0, r6)
            if (r5 == 0) goto L_0x0253
            r3.add(r4)
            goto L_0x0253
        L_0x026b:
            java.util.Iterator r8 = r3.iterator()
            r2 = 0
            r15 = 0
        L_0x0271:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x030b
            java.lang.Object r3 = r8.next()
            qv.b r3 = (qv.C11819b) r3
            r6 = 0
            if (r15 != 0) goto L_0x028f
            java.lang.String r4 = "Cleaning out scan and go data and settings: done"
            java.lang.String r4 = qv.C11818a.a(r4, r6)
            if (r4 != 0) goto L_0x028a
            goto L_0x030b
        L_0x028a:
            java.lang.String r4 = qv.C11820c.a(r4)
            r15 = r4
        L_0x028f:
            if (r2 != 0) goto L_0x02e6
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r9 = 36
            r10 = 2
            r11 = 0
            java.lang.String r4 = HJ.C15854t.s1(r2, r9, r11, r10, r11)
            r12 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r12, r11, r10, r11)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x02b3
            r13 = r23
            goto L_0x02b9
        L_0x02b3:
            r13 = r23
            java.lang.String r2 = HJ.C15854t.P0(r4, r13)
        L_0x02b9:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r14 = r22
            r7 = 1
            boolean r4 = HJ.C15854t.b0(r4, r14, r7)
            if (r4 == 0) goto L_0x02cd
            r4 = r20
            goto L_0x02cf
        L_0x02cd:
            r4 = r19
        L_0x02cf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r4 = r21
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x02e3:
            r16 = r2
            goto L_0x02f4
        L_0x02e6:
            r4 = r21
            r14 = r22
            r13 = r23
            r7 = 1
            r9 = 36
            r10 = 2
            r11 = 0
            r12 = 46
            goto L_0x02e3
        L_0x02f4:
            r5 = 0
            r2 = r3
            r3 = r0
            r17 = r4
            r4 = r16
            r18 = r7
            r7 = r15
            r2.a(r3, r4, r5, r6, r7)
            r23 = r13
            r22 = r14
            r2 = r16
            r21 = r17
            goto L_0x0271
        L_0x030b:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oz.c.a(java.lang.String, dI.e):java.lang.Object");
    }
}
