package pC;

import HJ.C15854t;
import QJ.C16304f;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gp.C11343b;
import gp.C11344c;
import gp.C11345d;
import gp.C11346e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oC.C14872a;
import oC.C14873b;
import oC.C14874c;
import qC.C14937a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BK\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0017H@¢\u0006\u0004\b\u001d\u0010\u001cJ2\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J-\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fH\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b/\u00100J\"\u00101\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H@¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00103R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"LpC/d;", "LoC/b;", "LoC/c;", "LQJ/Q;", "coroutineScope", "LqC/a;", "analytics", "Lgp/c;", "taskEventRegistry", "LpC/a;", "taskResolver", "LpC/b;", "taskSchedulerConfig", "LQJ/M;", "coroutineDispatcher", "", "", "taskLogInterceptors", "<init>", "(LQJ/Q;LqC/a;Lgp/c;LpC/a;LpC/b;LQJ/M;Ljava/util/Set;)V", "Lgp/d;", "taskGroup", "payload", "Lgp/b$a;", "type", "", "LoC/a;", "k", "(Lgp/d;Ljava/lang/Object;Lgp/b$a;LdI/e;)Ljava/lang/Object;", "l", "Lgp/b;", "task", "", "mode", "j", "(Lgp/b;Ljava/lang/Object;Lgp/b$a;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/N;", "n", "(Lgp/b$a;)V", "", "timestamp", "tasksLogs", "m", "(JLgp/b$a;Ljava/util/List;)V", "tasks", "c", "(Ljava/util/Set;)V", "a", "(Lgp/b$a;Ljava/lang/Object;)V", "b", "(Lgp/b$a;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LQJ/Q;", "LqC/a;", "Lgp/c;", "d", "LpC/a;", "e", "LpC/b;", "f", "LQJ/M;", "g", "Ljava/util/Set;", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pC.d  reason: case insensitive filesystem */
public final class C14913d implements C14873b, C14874c {

    /* renamed from: a  reason: collision with root package name */
    private final Q f130264a;

    /* renamed from: b  reason: collision with root package name */
    private final C14937a f130265b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C11344c f130266c;

    /* renamed from: d  reason: collision with root package name */
    private final C14910a f130267d;

    /* renamed from: e  reason: collision with root package name */
    private final C14911b f130268e;

    /* renamed from: f  reason: collision with root package name */
    private final M f130269f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Object> f130270g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl", f = "TaskSchedulerImpl.kt", l = {149}, m = "executeTaskWithTimeout")
    /* renamed from: pC.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130271c;

        /* renamed from: d  reason: collision with root package name */
        Object f130272d;

        /* renamed from: e  reason: collision with root package name */
        Object f130273e;

        /* renamed from: f  reason: collision with root package name */
        Object f130274f;

        /* renamed from: g  reason: collision with root package name */
        Object f130275g;

        /* renamed from: h  reason: collision with root package name */
        Object f130276h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f130277i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C14913d f130278j;

        /* renamed from: k  reason: collision with root package name */
        int f130279k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14913d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f130278j = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130277i = obj;
            this.f130279k |= Integer.MIN_VALUE;
            return this.f130278j.j((C11343b) null, (Object) null, (C11343b.a) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LoC/a;", "<anonymous>", "(LQJ/Q;)LoC/a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl$executeTaskWithTimeout$2", f = "TaskSchedulerImpl.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: pC.d$b */
    static final class b extends l implements p<Q, C17164e<? super C14872a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130280c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f130281d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11343b f130282e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f130283f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11343b.a f130284g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f130285h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C11343b bVar, Object obj, C11343b.a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f130282e = bVar;
            this.f130283f = obj;
            this.f130284g = aVar;
            this.f130285h = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f130282e, this.f130283f, this.f130284g, this.f130285h, eVar);
            bVar.f130281d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C14872a> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: QJ.Q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                r27 = this;
                r1 = r27
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f130280c
                r3 = 1
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r0 = r1.f130281d
                r2 = r0
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r28)     // Catch:{ Exception -> 0x0018 }
                r4 = r28
                goto L_0x0038
            L_0x0018:
                r0 = move-exception
                goto L_0x0042
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0022:
                XH.y.b(r28)
                java.lang.Object r2 = r1.f130281d
                QJ.Q r2 = (QJ.Q) r2
                gp.b r4 = r1.f130282e     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r5 = r1.f130283f     // Catch:{ Exception -> 0x0018 }
                r1.f130281d = r2     // Catch:{ Exception -> 0x0018 }
                r1.f130280c = r3     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r4 = r4.b(r5, r1)     // Catch:{ Exception -> 0x0018 }
                if (r4 != r0) goto L_0x0038
                return r0
            L_0x0038:
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ Exception -> 0x0018 }
                boolean r0 = r4.booleanValue()     // Catch:{ Exception -> 0x0018 }
                r22 = r0
                goto L_0x012d
            L_0x0042:
                gp.b r10 = r1.f130282e
                java.lang.String r11 = r1.f130285h
                gp.b$a r12 = r1.f130284g
                qv.e r13 = qv.e.ERROR
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x005b:
                boolean r6 = r4.hasNext()
                r14 = 0
                if (r6 == 0) goto L_0x0073
                java.lang.Object r6 = r4.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r13, r14)
                if (r7 == 0) goto L_0x005b
                r5.add(r6)
                goto L_0x005b
            L_0x0073:
                java.util.Iterator r15 = r5.iterator()
                r9 = 0
                r4 = r9
                r5 = r4
            L_0x007a:
                boolean r6 = r15.hasNext()
                if (r6 == 0) goto L_0x012b
                java.lang.Object r6 = r15.next()
                qv.b r6 = (qv.C11819b) r6
                if (r4 != 0) goto L_0x00c2
                java.lang.Class r4 = r10.getClass()
                java.lang.String r4 = r4.getSimpleName()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Error in "
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = " during "
                r7.append(r4)
                r7.append(r11)
                java.lang.String r4 = " execution for "
                r7.append(r4)
                r7.append(r12)
                java.lang.String r4 = " event."
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                java.lang.String r4 = qv.C11818a.a(r4, r0)
                if (r4 != 0) goto L_0x00be
                goto L_0x012b
            L_0x00be:
                java.lang.String r4 = qv.C11820c.a(r4)
            L_0x00c2:
                r16 = r4
                if (r5 != 0) goto L_0x0114
                java.lang.Class r4 = r2.getClass()
                java.lang.String r4 = r4.getName()
                kotlin.jvm.internal.C17542s.g(r4)
                r5 = 36
                r7 = 2
                java.lang.String r5 = HJ.C15854t.s1(r4, r5, r9, r7, r9)
                r8 = 46
                java.lang.String r5 = HJ.C15854t.o1(r5, r8, r9, r7, r9)
                int r7 = r5.length()
                if (r7 != 0) goto L_0x00e5
                goto L_0x00eb
            L_0x00e5:
                java.lang.String r4 = "Kt"
                java.lang.String r4 = HJ.C15854t.P0(r5, r4)
            L_0x00eb:
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.String r7 = "main"
                boolean r5 = HJ.C15854t.b0(r5, r7, r3)
                if (r5 == 0) goto L_0x00fe
                java.lang.String r5 = "m"
                goto L_0x0100
            L_0x00fe:
                java.lang.String r5 = "b"
            L_0x0100:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                java.lang.String r5 = "|"
                r7.append(r5)
                r7.append(r4)
                java.lang.String r5 = r7.toString()
            L_0x0114:
                r17 = r5
                r7 = 0
                r4 = r6
                r5 = r13
                r6 = r17
                r8 = r0
                r18 = r9
                r9 = r16
                r4.a(r5, r6, r7, r8, r9)
                r4 = r16
                r5 = r17
                r9 = r18
                goto L_0x007a
            L_0x012b:
                r22 = r14
            L_0x012d:
                oC.a r0 = new oC.a
                gp.b$a r2 = r1.f130284g
                gp.b r3 = r1.f130282e
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getSimpleName()
                java.lang.String r4 = "getSimpleName(...)"
                kotlin.jvm.internal.C17542s.i(r3, r4)
                r25 = 8
                r26 = 0
                r23 = 0
                r19 = r0
                r20 = r2
                r21 = r3
                r19.<init>(r20, r21, r22, r23, r25, r26)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: pC.C14913d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LoC/a;", "<anonymous>", "(LQJ/Q;)LoC/a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl$handleParallelExecution$tasks$2$1", f = "TaskSchedulerImpl.kt", l = {113}, m = "invokeSuspend")
    /* renamed from: pC.d$c */
    static final class c extends l implements p<Q, C17164e<? super C14872a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130286c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14913d f130287d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11343b f130288e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f130289f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11343b.a f130290g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14913d dVar, C11343b bVar, Object obj, C11343b.a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f130287d = dVar;
            this.f130288e = bVar;
            this.f130289f = obj;
            this.f130290g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f130287d, this.f130288e, this.f130289f, this.f130290g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C14872a> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130286c;
            if (i10 == 0) {
                y.b(obj);
                C14913d dVar = this.f130287d;
                C11343b bVar = this.f130288e;
                Object obj2 = this.f130289f;
                C11343b.a aVar = this.f130290g;
                this.f130286c = 1;
                obj = dVar.j(bVar, obj2, aVar, "PARALLEL", this);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl", f = "TaskSchedulerImpl.kt", l = {135}, m = "handleSequentialExecution")
    /* renamed from: pC.d$d  reason: collision with other inner class name */
    static final class C3217d extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130291c;

        /* renamed from: d  reason: collision with root package name */
        Object f130292d;

        /* renamed from: e  reason: collision with root package name */
        Object f130293e;

        /* renamed from: f  reason: collision with root package name */
        Object f130294f;

        /* renamed from: g  reason: collision with root package name */
        Object f130295g;

        /* renamed from: h  reason: collision with root package name */
        Object f130296h;

        /* renamed from: i  reason: collision with root package name */
        Object f130297i;

        /* renamed from: j  reason: collision with root package name */
        Object f130298j;

        /* renamed from: k  reason: collision with root package name */
        Object f130299k;

        /* renamed from: l  reason: collision with root package name */
        Object f130300l;

        /* renamed from: m  reason: collision with root package name */
        Object f130301m;

        /* renamed from: n  reason: collision with root package name */
        Object f130302n;

        /* renamed from: o  reason: collision with root package name */
        int f130303o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f130304p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C14913d f130305q;

        /* renamed from: r  reason: collision with root package name */
        int f130306r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3217d(C14913d dVar, C17164e<? super C3217d> eVar) {
            super(eVar);
            this.f130305q = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130304p = obj;
            this.f130306r |= Integer.MIN_VALUE;
            return this.f130305q.l((C11345d) null, (Object) null, (C11343b.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl$onEvent$1", f = "TaskSchedulerImpl.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: pC.d$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130307c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14913d f130308d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11343b.a f130309e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f130310f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14913d dVar, C11343b.a aVar, Object obj, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f130308d = dVar;
            this.f130309e = aVar;
            this.f130310f = obj;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f130308d, this.f130309e, this.f130310f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130307c;
            if (i10 == 0) {
                y.b(obj);
                C14913d dVar = this.f130308d;
                C11343b.a aVar = this.f130309e;
                Object obj2 = this.f130310f;
                this.f130307c = 1;
                if (dVar.b(aVar, obj2, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.taskscheduler.impl.TaskSchedulerImpl$onEventSuspended$2", f = "TaskSchedulerImpl.kt", l = {94, 95}, m = "invokeSuspend")
    /* renamed from: pC.d$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f130311c;

        /* renamed from: d  reason: collision with root package name */
        Object f130312d;

        /* renamed from: e  reason: collision with root package name */
        Object f130313e;

        /* renamed from: f  reason: collision with root package name */
        Object f130314f;

        /* renamed from: g  reason: collision with root package name */
        Object f130315g;

        /* renamed from: h  reason: collision with root package name */
        Object f130316h;

        /* renamed from: i  reason: collision with root package name */
        Object f130317i;

        /* renamed from: j  reason: collision with root package name */
        Object f130318j;

        /* renamed from: k  reason: collision with root package name */
        Object f130319k;

        /* renamed from: l  reason: collision with root package name */
        Object f130320l;

        /* renamed from: m  reason: collision with root package name */
        Object f130321m;

        /* renamed from: n  reason: collision with root package name */
        long f130322n;

        /* renamed from: o  reason: collision with root package name */
        int f130323o;

        /* renamed from: p  reason: collision with root package name */
        int f130324p;

        /* renamed from: q  reason: collision with root package name */
        int f130325q;

        /* renamed from: r  reason: collision with root package name */
        private /* synthetic */ Object f130326r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ C14913d f130327s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C11343b.a f130328t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Object f130329u;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pC.d$f$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f130330a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    gp.a[] r0 = gp.C11342a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gp.a r1 = gp.C11342a.PARALLEL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gp.a r1 = gp.C11342a.SEQUENTIAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f130330a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pC.C14913d.f.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14913d dVar, C11343b.a aVar, Object obj, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f130327s = dVar;
            this.f130328t = aVar;
            this.f130329u = obj;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f130327s, this.f130328t, this.f130329u, eVar);
            fVar.f130326r = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: gp.b$a} */
        /* JADX WARNING: type inference failed for: r9v20, types: [java.lang.Iterable] */
        /* JADX WARNING: type inference failed for: r9v22, types: [java.lang.Iterable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0192  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                r27 = this;
                r0 = r27
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f130325q
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L_0x0087
                if (r2 == r3) goto L_0x004e
                if (r2 != r4) goto L_0x0046
                int r2 = r0.f130324p
                long r5 = r0.f130322n
                java.lang.Object r7 = r0.f130321m
                java.lang.Object r8 = r0.f130320l
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r0.f130319k
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r10 = r0.f130318j
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r0.f130317i
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r0.f130316h
                gp.a r12 = (gp.C11342a) r12
                java.lang.Object r12 = r0.f130314f
                gp.d r12 = (gp.C11345d) r12
                java.lang.Object r12 = r0.f130313e
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r0.f130312d
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r14 = r0.f130311c
                java.util.List r14 = (java.util.List) r14
                java.lang.Object r15 = r0.f130326r
                QJ.Q r15 = (QJ.Q) r15
                XH.y.b(r28)
                r3 = r1
                r1 = r28
                goto L_0x01f6
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004e:
                int r2 = r0.f130324p
                long r5 = r0.f130322n
                java.lang.Object r7 = r0.f130321m
                java.lang.Object r8 = r0.f130320l
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r9 = r0.f130319k
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.lang.Object r10 = r0.f130318j
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r0.f130317i
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r0.f130316h
                gp.a r12 = (gp.C11342a) r12
                java.lang.Object r12 = r0.f130314f
                gp.d r12 = (gp.C11345d) r12
                java.lang.Object r12 = r0.f130313e
                java.util.Iterator r12 = (java.util.Iterator) r12
                java.lang.Object r13 = r0.f130312d
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r14 = r0.f130311c
                java.util.List r14 = (java.util.List) r14
                java.lang.Object r15 = r0.f130326r
                QJ.Q r15 = (QJ.Q) r15
                XH.y.b(r28)
                r3 = r2
                r17 = r4
                r2 = r1
                r1 = r28
                goto L_0x0259
            L_0x0087:
                XH.y.b(r28)
                java.lang.Object r2 = r0.f130326r
                QJ.Q r2 = (QJ.Q) r2
                pC.d r5 = r0.f130327s
                gp.c r5 = r5.f130266c
                gp.b$a r6 = r0.f130328t
                java.util.List r5 = r5.g(r6)
                gp.b$a r6 = r0.f130328t
                qv.e r13 = qv.e.DEBUG
                qv.d r7 = qv.d.f102012a
                java.util.List r7 = r7.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x00af:
                boolean r8 = r7.hasNext()
                r15 = 0
                if (r8 == 0) goto L_0x00c7
                java.lang.Object r8 = r7.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r13, r15)
                if (r9 == 0) goto L_0x00af
                r14.add(r8)
                goto L_0x00af
            L_0x00c7:
                java.util.Iterator r16 = r14.iterator()
                r12 = 0
                r7 = r12
                r8 = r7
                r9 = r14
            L_0x00cf:
                boolean r10 = r16.hasNext()
                if (r10 == 0) goto L_0x0166
                java.lang.Object r17 = r16.next()
                r9 = r17
                qv.b r9 = (qv.C11819b) r9
                r11 = 0
                if (r7 != 0) goto L_0x00ff
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r15 = "Handling event: "
                r10.append(r15)
                r10.append(r6)
                java.lang.String r10 = r10.toString()
                java.lang.String r10 = qv.C11818a.a(r10, r11)
                if (r10 != 0) goto L_0x00fb
                r9 = r17
                goto L_0x0166
            L_0x00fb:
                java.lang.String r7 = qv.C11820c.a(r10)
            L_0x00ff:
                r15 = r7
                if (r8 != 0) goto L_0x014f
                java.lang.Class r7 = r2.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r8 = 36
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r12, r4, r12)
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r12, r4, r12)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x0120
                goto L_0x0126
            L_0x0120:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)
            L_0x0126:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r10 = "main"
                boolean r8 = HJ.C15854t.b0(r8, r10, r3)
                if (r8 == 0) goto L_0x0139
                java.lang.String r8 = "m"
                goto L_0x013b
            L_0x0139:
                java.lang.String r8 = "b"
            L_0x013b:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r8 = "|"
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
            L_0x014f:
                r18 = r8
                r10 = 0
                r7 = r9
                r8 = r13
                r9 = r18
                r19 = r12
                r12 = r15
                r7.a(r8, r9, r10, r11, r12)
                r7 = r15
                r9 = r17
                r8 = r18
                r12 = r19
                r15 = 0
                goto L_0x00cf
            L_0x0166:
                long r10 = java.lang.System.currentTimeMillis()
                pC.d r12 = r0.f130327s
                gp.b$a r13 = r0.f130328t
                r12.n(r13)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r13 = r5.iterator()
                r20 = r2
                r15 = r5
                r2 = 0
                r25 = r7
                r7 = r6
                r5 = r10
                r11 = r25
                r10 = r8
                r8 = r16
                r26 = r13
                r13 = r12
                r12 = r26
            L_0x018c:
                boolean r16 = r12.hasNext()
                if (r16 == 0) goto L_0x026e
                java.lang.Object r16 = r12.next()
                r4 = r16
                gp.d r4 = (gp.C11345d) r4
                gp.a r3 = r4.a()
                int[] r18 = pC.C14913d.f.a.f130330a
                int r19 = r3.ordinal()
                r21 = r1
                r1 = r18[r19]
                r18 = r2
                r2 = 1
                if (r1 == r2) goto L_0x020c
                r2 = 2
                if (r1 != r2) goto L_0x0206
                pC.d r2 = r0.f130327s
                r19 = r2
                java.lang.Object r2 = r0.f130329u
                r28 = r2
                gp.b$a r2 = r0.f130328t
                r22 = r2
                r2 = r20
                r0.f130326r = r2
                r0.f130311c = r15
                r0.f130312d = r13
                r0.f130313e = r12
                r0.f130314f = r4
                r0.f130315g = r7
                r0.f130316h = r3
                r0.f130317i = r11
                r0.f130318j = r10
                r0.f130319k = r14
                r0.f130320l = r8
                r0.f130321m = r9
                r0.f130322n = r5
                r0.f130323o = r1
                r1 = r18
                r0.f130324p = r1
                r3 = 2
                r0.f130325q = r3
                r3 = r28
                r7 = r19
                r1 = r22
                java.lang.Object r1 = r7.l(r4, r3, r1, r0)
                r3 = r21
                if (r1 != r3) goto L_0x01f0
                return r3
            L_0x01f0:
                r7 = r9
                r9 = r14
                r14 = r15
                r15 = r2
                r2 = r18
            L_0x01f6:
                java.util.List r1 = (java.util.List) r1
                r20 = r15
                r17 = 2
                r15 = r14
                r14 = r9
                r9 = r7
                r7 = r1
                r25 = r3
                r3 = r2
                r2 = r25
                goto L_0x0261
            L_0x0206:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x020c:
                r28 = r1
                r24 = r18
                r2 = r20
                r23 = r21
                r17 = 2
                pC.d r1 = r0.f130327s
                r18 = r1
                java.lang.Object r1 = r0.f130329u
                r19 = r1
                gp.b$a r1 = r0.f130328t
                r0.f130326r = r2
                r0.f130311c = r15
                r0.f130312d = r13
                r0.f130313e = r12
                r0.f130314f = r4
                r0.f130315g = r7
                r0.f130316h = r3
                r0.f130317i = r11
                r0.f130318j = r10
                r0.f130319k = r14
                r0.f130320l = r8
                r0.f130321m = r9
                r0.f130322n = r5
                r3 = r28
                r0.f130323o = r3
                r3 = r24
                r0.f130324p = r3
                r7 = 1
                r0.f130325q = r7
                r7 = r18
                r18 = r2
                r2 = r19
                java.lang.Object r1 = r7.k(r4, r2, r1, r0)
                r2 = r23
                if (r1 != r2) goto L_0x0254
                return r2
            L_0x0254:
                r7 = r9
                r9 = r14
                r14 = r15
                r15 = r18
            L_0x0259:
                java.util.List r1 = (java.util.List) r1
                r20 = r15
                r15 = r14
                r14 = r9
                r9 = r7
                r7 = r1
            L_0x0261:
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1
                r13.addAll(r1)
                r1 = r2
                r2 = r3
                r4 = r17
                r3 = 1
                goto L_0x018c
            L_0x026e:
                pC.d r1 = r0.f130327s
                gp.b$a r2 = r0.f130328t
                r1.m(r5, r2, r13)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pC.C14913d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14913d(Q q10, C14937a aVar, C11344c cVar, C14910a aVar2, C14911b bVar, M m10, Set<Object> set) {
        C17542s.j(q10, "coroutineScope");
        C17542s.j(aVar, "analytics");
        C17542s.j(cVar, "taskEventRegistry");
        C17542s.j(aVar2, "taskResolver");
        C17542s.j(bVar, "taskSchedulerConfig");
        C17542s.j(m10, "coroutineDispatcher");
        C17542s.j(set, "taskLogInterceptors");
        this.f130264a = q10;
        this.f130265b = aVar;
        this.f130266c = cVar;
        this.f130267d = aVar2;
        this.f130268e = bVar;
        this.f130269f = m10;
        this.f130270g = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: gp.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: gp.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: pC.d} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(gp.C11343b r19, java.lang.Object r20, gp.C11343b.a r21, java.lang.String r22, dI.C17164e<? super oC.C14872a> r23) {
        /*
            r18 = this;
            r1 = r18
            r0 = r23
            boolean r2 = r0 instanceof pC.C14913d.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            pC.d$a r2 = (pC.C14913d.a) r2
            int r3 = r2.f130279k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f130279k = r3
            goto L_0x001c
        L_0x0017:
            pC.d$a r2 = new pC.d$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f130277i
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f130279k
            r6 = 1
            if (r5 == 0) goto L_0x0055
            if (r5 != r6) goto L_0x004d
            java.lang.Object r0 = r2.f130276h
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f130275g
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r2.f130274f
            r5 = r0
            gp.b$a r5 = (gp.C11343b.a) r5
            java.lang.Object r0 = r2.f130272d
            r7 = r0
            gp.b r7 = (gp.C11343b) r7
            java.lang.Object r0 = r2.f130271c
            r2 = r0
            pC.d r2 = (pC.C14913d) r2
            XH.y.b(r3)     // Catch:{ k1 -> 0x0048 }
            r10 = r4
            r9 = r5
            r5 = r7
            goto L_0x008b
        L_0x0048:
            r0 = move-exception
            r10 = r4
            r8 = r5
            r5 = r7
            goto L_0x00a1
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0055:
            XH.y.b(r3)
            pC.b r3 = r1.f130268e     // Catch:{ k1 -> 0x009d }
            long r7 = r3.a()     // Catch:{ k1 -> 0x009d }
            pC.d$b r3 = new pC.d$b     // Catch:{ k1 -> 0x009d }
            r14 = 0
            r9 = r3
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ k1 -> 0x009d }
            r2.f130271c = r1     // Catch:{ k1 -> 0x009d }
            r5 = r19
            r2.f130272d = r5     // Catch:{ k1 -> 0x0099 }
            r9 = r20
            r2.f130273e = r9     // Catch:{ k1 -> 0x0099 }
            r9 = r21
            r2.f130274f = r9     // Catch:{ k1 -> 0x0095 }
            r10 = r22
            r2.f130275g = r10     // Catch:{ k1 -> 0x0092 }
            r2.f130276h = r0     // Catch:{ k1 -> 0x0092 }
            r2.f130279k = r6     // Catch:{ k1 -> 0x0092 }
            java.lang.Object r3 = QJ.m1.c(r7, r3, r2)     // Catch:{ k1 -> 0x0092 }
            if (r3 != r4) goto L_0x008a
            return r4
        L_0x008a:
            r2 = r1
        L_0x008b:
            oC.a r3 = (oC.C14872a) r3     // Catch:{ k1 -> 0x008f }
            goto L_0x018c
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            r8 = r9
            goto L_0x00a1
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            r2 = r1
            goto L_0x0090
        L_0x0095:
            r0 = move-exception
        L_0x0096:
            r10 = r22
            goto L_0x0093
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            r9 = r21
            goto L_0x0096
        L_0x009d:
            r0 = move-exception
            r5 = r19
            goto L_0x009a
        L_0x00a1:
            qv.e r3 = qv.e.ERROR
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b4:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x00cc
            java.lang.Object r9 = r4.next()
            r11 = r9
            qv.b r11 = (qv.C11819b) r11
            r12 = 0
            boolean r11 = r11.b(r3, r12)
            if (r11 == 0) goto L_0x00b4
            r7.add(r9)
            goto L_0x00b4
        L_0x00cc:
            java.util.Iterator r4 = r7.iterator()
            r7 = 0
            r9 = r7
            r11 = r9
        L_0x00d3:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x0173
            java.lang.Object r12 = r4.next()
            qv.b r12 = (qv.C11819b) r12
            if (r9 != 0) goto L_0x0112
            java.lang.Class r9 = r5.getClass()
            java.lang.String r9 = r9.getSimpleName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Task "
            r13.append(r14)
            r13.append(r9)
            java.lang.String r9 = " timed out during "
            r13.append(r9)
            r13.append(r10)
            java.lang.String r9 = " execution."
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r0)
            if (r9 != 0) goto L_0x010e
            goto L_0x0173
        L_0x010e:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0112:
            if (r11 != 0) goto L_0x0162
            java.lang.Class r11 = r2.getClass()
            java.lang.String r11 = r11.getName()
            kotlin.jvm.internal.C17542s.g(r11)
            r13 = 36
            r14 = 2
            java.lang.String r13 = HJ.C15854t.s1(r11, r13, r7, r14, r7)
            r15 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r15, r7, r14, r7)
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0133
            goto L_0x0139
        L_0x0133:
            java.lang.String r11 = "Kt"
            java.lang.String r11 = HJ.C15854t.P0(r13, r11)
        L_0x0139:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "main"
            boolean r13 = HJ.C15854t.b0(r13, r14, r6)
            if (r13 == 0) goto L_0x014c
            java.lang.String r13 = "m"
            goto L_0x014e
        L_0x014c:
            java.lang.String r13 = "b"
        L_0x014e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = "|"
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
        L_0x0162:
            r17 = r11
            r14 = 0
            r11 = r12
            r12 = r3
            r13 = r17
            r15 = r0
            r16 = r9
            r11.a(r12, r13, r14, r15, r16)
            r11 = r17
            goto L_0x00d3
        L_0x0173:
            oC.a r3 = new oC.a
            java.lang.Class r0 = r5.getClass()
            java.lang.String r9 = r0.getSimpleName()
            java.lang.String r0 = "getSimpleName(...)"
            kotlin.jvm.internal.C17542s.i(r9, r0)
            r13 = 8
            r14 = 0
            r10 = 0
            r11 = 0
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r13, r14)
        L_0x018c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pC.C14913d.j(gp.b, java.lang.Object, gp.b$a, java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object k(C11345d dVar, Object obj, C11343b.a aVar, C17164e<? super List<C14872a>> eVar) {
        ArrayList<C11343b> arrayList = new ArrayList<>();
        for (C11346e a10 : dVar.b()) {
            C11343b a11 = this.f130267d.a(a10);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (C11343b cVar : arrayList) {
            arrayList2.add(C16314k.b(this.f130264a, (C17168i) null, (T) null, new c(this, cVar, obj, aVar, (C17164e<? super c>) null), 3, (Object) null));
        }
        return C16304f.a(arrayList2, eVar);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9 A[SYNTHETIC] */
    public final java.lang.Object l(gp.C11345d r18, java.lang.Object r19, gp.C11343b.a r20, dI.C17164e<? super java.util.List<oC.C14872a>> r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof pC.C14913d.C3217d
            if (r1 == 0) goto L_0x0017
            r1 = r0
            pC.d$d r1 = (pC.C14913d.C3217d) r1
            int r2 = r1.f130306r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f130306r = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            pC.d$d r1 = new pC.d$d
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f130304p
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f130306r
            r6 = 1
            if (r5 == 0) goto L_0x006b
            if (r5 != r6) goto L_0x0063
            java.lang.Object r0 = r1.f130302n
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r1.f130301m
            gp.b r5 = (gp.C11343b) r5
            java.lang.Object r5 = r1.f130300l
            gp.b r5 = (gp.C11343b) r5
            java.lang.Object r5 = r1.f130299k
            gp.b r5 = (gp.C11343b) r5
            java.lang.Object r5 = r1.f130298j
            gp.e r5 = (gp.C11346e) r5
            java.lang.Object r5 = r1.f130297i
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r7 = r1.f130296h
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.f130295g
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r1.f130294f
            gp.b$a r9 = (gp.C11343b.a) r9
            java.lang.Object r10 = r1.f130293e
            java.lang.Object r11 = r1.f130292d
            gp.d r11 = (gp.C11345d) r11
            java.lang.Object r12 = r1.f130291c
            pC.d r12 = (pC.C14913d) r12
            XH.y.b(r3)
            r14 = r1
            r15 = r5
            r13 = r7
            r5 = r8
            r1 = r10
            goto L_0x00cc
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x006b:
            XH.y.b(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r5 = r18.b()
            java.util.Iterator r5 = r5.iterator()
            r14 = r1
            r12 = r2
            r13 = r3
            r15 = r5
            r1 = r19
            r3 = r20
            r5 = r0
            r0 = r18
        L_0x0086:
            boolean r7 = r15.hasNext()
            if (r7 == 0) goto L_0x00d9
            java.lang.Object r7 = r15.next()
            gp.e r7 = (gp.C11346e) r7
            pC.a r8 = r12.f130267d
            gp.b r8 = r8.a(r7)
            if (r8 == 0) goto L_0x00d6
            r14.f130291c = r12
            r14.f130292d = r0
            r14.f130293e = r1
            r14.f130294f = r3
            r14.f130295g = r5
            r14.f130296h = r13
            r14.f130297i = r15
            r14.f130298j = r7
            r14.f130299k = r8
            r14.f130300l = r8
            r14.f130301m = r8
            r14.f130302n = r13
            r7 = 0
            r14.f130303o = r7
            r14.f130306r = r6
            java.lang.String r11 = "SEQUENTIAL"
            r7 = r12
            r9 = r1
            r10 = r3
            r16 = r12
            r12 = r14
            java.lang.Object r7 = r7.j(r8, r9, r10, r11, r12)
            if (r7 != r4) goto L_0x00c6
            return r4
        L_0x00c6:
            r11 = r0
            r9 = r3
            r3 = r7
            r0 = r13
            r12 = r16
        L_0x00cc:
            boolean r0 = r0.add(r3)
            kotlin.coroutines.jvm.internal.b.a(r0)
            r3 = r9
            r0 = r11
            goto L_0x0086
        L_0x00d6:
            r16 = r12
            goto L_0x0086
        L_0x00d9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: pC.C14913d.l(gp.d, java.lang.Object, gp.b$a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void m(long j10, C11343b.a aVar, List<C14872a> list) {
    }

    /* access modifiers changed from: private */
    public final void n(C11343b.a aVar) {
        try {
            this.f130265b.a(aVar);
        } catch (Exception e10) {
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a("Error occurred while tracking analytics for event " + aVar, e10);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C14913d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public void a(C11343b.a aVar, Object obj) {
        C17542s.j(aVar, "type");
        F0 unused = C16314k.d(this.f130264a, this.f130269f, (T) null, new e(this, aVar, obj, (C17164e<? super e>) null), 2, (Object) null);
    }

    public Object b(C11343b.a aVar, Object obj, C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(this.f130269f, new f(this, aVar, obj, (C17164e<? super f>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public void c(Set<? extends C11343b> set) {
        C17542s.j(set, "tasks");
        this.f130267d.b(set);
    }
}
