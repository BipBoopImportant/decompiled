package dw;

import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import cw.d;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gw.d;
import gw.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001d\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0016H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00160\u0015H\u0016¢\u0006\u0004\b'\u0010\u0019J\u001d\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00160\u0015H\u0016¢\u0006\u0004\b)\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u00100R\u0014\u00104\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00067"}, d2 = {"Ldw/a;", "Lcw/d;", "Lgw/d;", "localSource", "Lgw/g;", "remoteSource", "Lfw/a;", "messageMapper", "LQJ/Q;", "scope", "LQJ/M;", "ioDispatcher", "<init>", "(Lgw/d;Lgw/g;Lfw/a;LQJ/Q;LQJ/M;)V", "LXH/N;", "o", "()V", "Lfw/c;", "l", "(LdI/e;)Ljava/lang/Object;", "invalidate", "LTJ/g;", "", "Lcw/a;", "b", "()LTJ/g;", "", "id", "e", "(Ljava/lang/String;)V", "", "reset", "f", "(Ljava/lang/String;Z)V", "Lcw/e;", "messageTypes", "d", "(Ljava/util/List;)V", "Lcw/b;", "c", "Lcw/f;", "a", "Lgw/d;", "Lgw/g;", "Lfw/a;", "LQJ/Q;", "LQJ/M;", "LQJ/F0;", "LQJ/F0;", "ongoingJob", "n", "()Z", "updating", "m", "updated", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final gw.d f72553a;

    /* renamed from: b  reason: collision with root package name */
    private final g f72554b;

    /* renamed from: c  reason: collision with root package name */
    private final fw.a f72555c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f72556d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final M f72557e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public F0 f72558f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.messagecenter.impl.data.MessageCenterRepositoryImpl", f = "MessageCenterRepositoryImpl.kt", l = {96}, m = "fetchRemoteAndUpdateLocal")
    /* renamed from: dw.a$a  reason: collision with other inner class name */
    static final class C1243a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f72559c;

        /* renamed from: d  reason: collision with root package name */
        Object f72560d;

        /* renamed from: e  reason: collision with root package name */
        Object f72561e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f72562f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f72563g;

        /* renamed from: h  reason: collision with root package name */
        int f72564h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1243a(a aVar, C17164e<? super C1243a> eVar) {
            super(eVar);
            this.f72563g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f72562f = obj;
            this.f72564h |= Integer.MIN_VALUE;
            return this.f72563g.l(this);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"dw/a$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f72565a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, a aVar2) {
            super(aVar);
            this.f72565a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Failed to fetch messages";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f72565a.f72558f = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.messagecenter.impl.data.MessageCenterRepositoryImpl$refreshMessagesIfNeeded$3", f = "MessageCenterRepositoryImpl.kt", l = {88}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f72567d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.messagecenter.impl.data.MessageCenterRepositoryImpl$refreshMessagesIfNeeded$3$1", f = "MessageCenterRepositoryImpl.kt", l = {89}, m = "invokeSuspend")
        /* renamed from: dw.a$c$a  reason: collision with other inner class name */
        static final class C1244a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f72568c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f72569d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1244a(a aVar, C17164e<? super C1244a> eVar) {
                super(2, eVar);
                this.f72569d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1244a(this.f72569d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1244a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f72568c;
                if (i10 == 0) {
                    y.b(obj);
                    a aVar = this.f72569d;
                    this.f72568c = 1;
                    if (aVar.l(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f72567d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f72567d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f72566c;
            if (i10 == 0) {
                y.b(obj);
                M h10 = this.f72567d.f72557e;
                C1244a aVar = new C1244a(this.f72567d, (C17164e<? super C1244a>) null);
                this.f72566c = 1;
                if (C16310i.g(h10, aVar, this) == f10) {
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

    public a(gw.d dVar, g gVar, fw.a aVar, Q q10, M m10) {
        C17542s.j(dVar, "localSource");
        C17542s.j(gVar, "remoteSource");
        C17542s.j(aVar, "messageMapper");
        C17542s.j(q10, "scope");
        C17542s.j(m10, "ioDispatcher");
        this.f72553a = dVar;
        this.f72554b = gVar;
        this.f72555c = aVar;
        this.f72556d = q10;
        this.f72557e = m10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(dI.C17164e<? super fw.c> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof dw.a.C1243a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            dw.a$a r0 = (dw.a.C1243a) r0
            int r1 = r0.f72564h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f72564h = r1
            goto L_0x0018
        L_0x0013:
            dw.a$a r0 = new dw.a$a
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f72562f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f72564h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r15 = r0.f72561e
            fw.a r15 = (fw.a) r15
            java.lang.Object r2 = r0.f72560d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f72559c
            dw.a r0 = (dw.a) r0
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x003d:
            XH.y.b(r1)
            fw.a r1 = r14.f72555c
            gw.g r3 = r14.f72554b
            r0.f72559c = r14
            r0.f72560d = r15
            r0.f72561e = r1
            r0.f72564h = r4
            java.lang.Object r15 = r3.a(r0)
            if (r15 != r2) goto L_0x0053
            return r2
        L_0x0053:
            r0 = r14
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x0057:
            com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote r1 = (com.ingka.ikea.messagecenter.impl.data.endpoint.MessagesRemote) r1
            fw.c r15 = r15.a(r1)
            qv.e r1 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0070:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r2.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            boolean r6 = r6.b(r1, r7)
            if (r6 == 0) goto L_0x0070
            r3.add(r5)
            goto L_0x0070
        L_0x0088:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r5 = r3
            r6 = r5
        L_0x008f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0118
            java.lang.Object r7 = r2.next()
            qv.b r7 = (qv.C11819b) r7
            r9 = 0
            if (r5 != 0) goto L_0x00ba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "fetchRemoteAndUpdateLocal: "
            r5.append(r8)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r9)
            if (r5 != 0) goto L_0x00b6
            goto L_0x0118
        L_0x00b6:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x00ba:
            r11 = r5
            if (r6 != 0) goto L_0x010b
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r6 = 36
            r8 = 2
            java.lang.String r6 = HJ.C15854t.s1(r5, r6, r3, r8, r3)
            r10 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r10, r3, r8, r3)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r6, r5)
        L_0x00e2:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r8 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r8, r4)
            if (r6 == 0) goto L_0x00f5
            java.lang.String r6 = "m"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r6 = "b"
        L_0x00f7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "|"
            r8.append(r6)
            r8.append(r5)
            java.lang.String r6 = r8.toString()
        L_0x010b:
            r12 = r6
            r8 = 0
            r5 = r7
            r6 = r1
            r7 = r12
            r10 = r11
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            r6 = r12
            goto L_0x008f
        L_0x0118:
            gw.d r0 = r0.f72553a
            r0.e(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.a.l(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final boolean m() {
        F0 f02 = this.f72558f;
        return f02 != null && f02.h();
    }

    /* access modifiers changed from: private */
    public final boolean n() {
        F0 f02 = this.f72558f;
        return f02 != null && f02.c();
    }

    private final void o() {
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("refreshMessageIfNeeded when updated: " + m() + ", updating: " + n(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (!n() && !m()) {
            this.f72558f = C16314k.d(this.f72556d, new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
        }
    }

    public C16532g<List<cw.f>> a() {
        C16532g<List<cw.f>> a10 = this.f72553a.a();
        o();
        return a10;
    }

    public C16532g<List<cw.a>> b() {
        C16532g<List<cw.a>> b10 = this.f72553a.b();
        o();
        return b10;
    }

    public C16532g<List<cw.b>> c() {
        C16532g<List<cw.b>> c10 = this.f72553a.c();
        this.f72553a.i();
        o();
        return c10;
    }

    public void d(List<? extends cw.e> list) {
        C17542s.j(list, "messageTypes");
        for (cw.e g10 : list) {
            this.f72553a.g(g10);
        }
    }

    public void e(String str) {
        C17542s.j(str, "id");
        d.a.a(this.f72553a, str, false, 2, (Object) null);
    }

    public void f(String str, boolean z10) {
        C17542s.j(str, "id");
        this.f72553a.h(str, z10);
        this.f72553a.g(cw.e.WHATS_NEW);
    }

    public void invalidate() {
        e eVar = e.DEBUG;
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
                String a10 = C11818a.a("Invalidating local source updated: " + m(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 f02 = this.f72558f;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f72558f = null;
        o();
    }
}
