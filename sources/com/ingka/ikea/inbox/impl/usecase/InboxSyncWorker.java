package com.ingka.ikea.inbox.impl.usecase;

import Bs.k;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import tf.C10253a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/inbox/impl/usecase/InboxSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "LQJ/M;", "dispatcher", "LBs/k;", "refreshInboxSources", "Ltf/a;", "killSwitchRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;LQJ/M;LBs/k;Ltf/a;)V", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "d", "(LdI/e;)Ljava/lang/Object;", "Landroidx/work/x$a;", "doWork", "a", "LQJ/M;", "b", "LBs/k;", "c", "Ltf/a;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InboxSyncWorker extends CoroutineWorker {

    /* renamed from: d  reason: collision with root package name */
    public static final a f96102d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f96103e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final M f96104a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f96105b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f96106c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/inbox/impl/usecase/InboxSyncWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker", f = "SchedulePeriodicInboxSyncUseCase.kt", l = {143, 153}, m = "doWork")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f96107c;

        /* renamed from: d  reason: collision with root package name */
        Object f96108d;

        /* renamed from: e  reason: collision with root package name */
        Object f96109e;

        /* renamed from: f  reason: collision with root package name */
        Object f96110f;

        /* renamed from: g  reason: collision with root package name */
        Object f96111g;

        /* renamed from: h  reason: collision with root package name */
        Object f96112h;

        /* renamed from: i  reason: collision with root package name */
        Object f96113i;

        /* renamed from: j  reason: collision with root package name */
        Object f96114j;

        /* renamed from: k  reason: collision with root package name */
        Object f96115k;

        /* renamed from: l  reason: collision with root package name */
        Object f96116l;

        /* renamed from: m  reason: collision with root package name */
        Object f96117m;

        /* renamed from: n  reason: collision with root package name */
        int f96118n;

        /* renamed from: o  reason: collision with root package name */
        int f96119o;

        /* renamed from: p  reason: collision with root package name */
        int f96120p;

        /* renamed from: q  reason: collision with root package name */
        int f96121q;

        /* renamed from: r  reason: collision with root package name */
        int f96122r;

        /* renamed from: s  reason: collision with root package name */
        int f96123s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f96124t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ InboxSyncWorker f96125u;

        /* renamed from: v  reason: collision with root package name */
        int f96126v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(InboxSyncWorker inboxSyncWorker, C17164e<? super b> eVar) {
            super(eVar);
            this.f96125u = inboxSyncWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96124t = obj;
            this.f96126v |= Integer.MIN_VALUE;
            return this.f96125u.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/x;", "", "LPs/d;", "<anonymous>", "(LQJ/Q;)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$doWork$4", f = "SchedulePeriodicInboxSyncUseCase.kt", l = {154}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super x<? extends List<? extends Ps.d>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96127c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InboxSyncWorker f96128d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(InboxSyncWorker inboxSyncWorker, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f96128d = inboxSyncWorker;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f96128d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super x<? extends List<Ps.d>>> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f96127c;
            if (i10 == 0) {
                y.b(obj);
                k b10 = this.f96128d.f96105b;
                this.f96127c = 1;
                obj2 = b10.a(true, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a(obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker", f = "SchedulePeriodicInboxSyncUseCase.kt", l = {164}, m = "refreshAndGetKillSwitchConfig")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f96129c;

        /* renamed from: d  reason: collision with root package name */
        Object f96130d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f96131e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ InboxSyncWorker f96132f;

        /* renamed from: g  reason: collision with root package name */
        int f96133g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(InboxSyncWorker inboxSyncWorker, C17164e<? super d> eVar) {
            super(eVar);
            this.f96132f = inboxSyncWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f96131e = obj;
            this.f96133g |= Integer.MIN_VALUE;
            return this.f96132f.d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InboxSyncWorker(Context context, WorkerParameters workerParameters, M m10, k kVar, C10253a aVar) {
        super(context, workerParameters);
        C17542s.j(context, "appContext");
        C17542s.j(workerParameters, "workerParams");
        C17542s.j(m10, "dispatcher");
        C17542s.j(kVar, "refreshInboxSources");
        C17542s.j(aVar, "killSwitchRepository");
        this.f96104a = m10;
        this.f96105b = kVar;
        this.f96106c = aVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(dI.C17164e<? super com.ingka.ikea.killswitch.model.KillSwitchConfig> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$d r0 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.d) r0
            int r1 = r0.f96133g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f96133g = r1
            goto L_0x0018
        L_0x0013:
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$d r0 = new com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$d
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f96131e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f96133g
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            java.lang.Object r13 = r0.f96130d
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f96129c
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker r13 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker) r13
            XH.y.b(r1)     // Catch:{ all -> 0x0050 }
            goto L_0x00f9
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003a:
            XH.y.b(r1)
            tf.a r1 = r12.f96106c     // Catch:{ all -> 0x004f }
            r0.f96129c = r12     // Catch:{ all -> 0x004f }
            r0.f96130d = r13     // Catch:{ all -> 0x004f }
            r0.f96133g = r4     // Catch:{ all -> 0x004f }
            java.lang.Object r13 = r1.f(r0)     // Catch:{ all -> 0x004f }
            if (r13 != r2) goto L_0x004c
            return r2
        L_0x004c:
            r13 = r12
            goto L_0x00f9
        L_0x004f:
            r13 = r12
        L_0x0050:
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r1.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r0, r6)
            if (r5 == 0) goto L_0x0063
            r2.add(r3)
            goto L_0x0063
        L_0x007b:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x0082:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            r9 = 0
            if (r3 != 0) goto L_0x009e
            java.lang.String r3 = "Failed to refresh kill switch"
            java.lang.String r3 = qv.C11818a.a(r3, r9)
            if (r3 != 0) goto L_0x009a
            goto L_0x00f9
        L_0x009a:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x009e:
            if (r5 != 0) goto L_0x00ee
            java.lang.Class r5 = r13.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00bf:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00c5:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x00d8
            java.lang.String r7 = "m"
            goto L_0x00da
        L_0x00d8:
            java.lang.String r7 = "b"
        L_0x00da:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x00ee:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r11
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x0082
        L_0x00f9:
            tf.a r13 = r13.f96106c
            TJ.P r13 = r13.I()
            java.lang.Object r13 = r13.getValue()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.d(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x028b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doWork(dI.C17164e<? super androidx.work.C7054x.a> r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1 instanceof com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$b r2 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.b) r2
            int r3 = r2.f96126v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f96126v = r3
            goto L_0x001c
        L_0x0017:
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$b r2 = new com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f96124t
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f96126v
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r12 = 36
            r13 = 1
            r14 = 2
            r15 = 0
            r11 = 0
            if (r5 == 0) goto L_0x007f
            if (r5 == r13) goto L_0x0073
            if (r5 != r14) goto L_0x006b
            java.lang.Object r1 = r2.f96116l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f96115k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f96114j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f96113i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f96112h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f96111g
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker r1 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker) r1
            java.lang.Object r1 = r2.f96110f
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker r1 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker) r1
            java.lang.Object r1 = r2.f96109e
            com.ingka.ikea.killswitch.model.KillSwitchConfig r1 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r1
            java.lang.Object r1 = r2.f96108d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f96107c
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker r1 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker) r1
            XH.y.b(r3)
            r21 = r7
            r22 = r8
            goto L_0x0254
        L_0x006b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0073:
            java.lang.Object r1 = r2.f96108d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f96107c
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker r5 = (com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker) r5
            XH.y.b(r3)
            goto L_0x0090
        L_0x007f:
            XH.y.b(r3)
            r2.f96107c = r0
            r2.f96108d = r1
            r2.f96126v = r13
            java.lang.Object r3 = r0.d(r2)
            if (r3 != r4) goto L_0x008f
            return r4
        L_0x008f:
            r5 = r0
        L_0x0090:
            com.ingka.ikea.killswitch.model.KillSwitchConfig r3 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r3
            if (r3 == 0) goto L_0x0099
            com.ingka.ikea.killswitch.model.BlockApp r16 = r3.b()
            goto L_0x009b
        L_0x0099:
            r16 = r11
        L_0x009b:
            if (r16 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r13 = r15
        L_0x009f:
            if (r13 == 0) goto L_0x0146
            qv.e r1 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00cb
            java.lang.Object r4 = r2.next()
            r13 = r4
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r1, r15)
            if (r13 == 0) goto L_0x00b4
            r3.add(r4)
            goto L_0x00b4
        L_0x00cb:
            java.util.Iterator r2 = r3.iterator()
            r3 = r11
            r4 = r3
        L_0x00d1:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x0305
            java.lang.Object r13 = r2.next()
            r17 = r13
            qv.b r17 = (qv.C11819b) r17
            r13 = 0
            if (r3 != 0) goto L_0x00f0
            java.lang.String r3 = "INBOX SYNC App blocked, ignoring sync"
            java.lang.String r3 = qv.C11818a.a(r3, r13)
            if (r3 != 0) goto L_0x00ec
            goto L_0x0305
        L_0x00ec:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00f0:
            if (r4 != 0) goto L_0x0136
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            java.lang.String r15 = HJ.C15854t.s1(r4, r12, r11, r14, r11)
            r12 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r12, r11, r14, r11)
            int r12 = r15.length()
            if (r12 != 0) goto L_0x010e
            goto L_0x0112
        L_0x010e:
            java.lang.String r4 = HJ.C15854t.P0(r15, r10)
        L_0x0112:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r15 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r15)
            if (r12 == 0) goto L_0x0123
            r12 = r8
            goto L_0x0124
        L_0x0123:
            r12 = r7
        L_0x0124:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r6)
            r15.append(r4)
            java.lang.String r4 = r15.toString()
        L_0x0136:
            r20 = 0
            r18 = r1
            r19 = r4
            r21 = r13
            r22 = r3
            r17.a(r18, r19, r20, r21, r22)
            r12 = 36
            goto L_0x00d1
        L_0x0146:
            qv.e r12 = qv.e.DEBUG
            qv.d r17 = qv.d.f102012a
            java.util.List r17 = r17.a()
            java.lang.Iterable r17 = (java.lang.Iterable) r17
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r17 = r17.iterator()
        L_0x0159:
            boolean r19 = r17.hasNext()
            if (r19 == 0) goto L_0x0173
            java.lang.Object r14 = r17.next()
            r0 = r14
            qv.b r0 = (qv.C11819b) r0
            boolean r0 = r0.b(r12, r15)
            if (r0 == 0) goto L_0x016f
            r11.add(r14)
        L_0x016f:
            r0 = r31
            r14 = 2
            goto L_0x0159
        L_0x0173:
            java.util.Iterator r0 = r11.iterator()
            r20 = r11
            r14 = 0
            r15 = 0
        L_0x017b:
            boolean r21 = r0.hasNext()
            if (r21 == 0) goto L_0x0213
            java.lang.Object r20 = r0.next()
            r23 = r20
            qv.b r23 = (qv.C11819b) r23
            r21 = r7
            r7 = 0
            r22 = r8
            if (r14 != 0) goto L_0x01a5
            java.lang.String r8 = "INBOX SYNC Running background sync"
            java.lang.String r8 = qv.C11818a.a(r8, r7)
            if (r8 != 0) goto L_0x01a0
            r29 = r4
        L_0x019a:
            r30 = r13
            r4 = r20
            goto L_0x021a
        L_0x01a0:
            java.lang.String r8 = qv.C11820c.a(r8)
            r14 = r8
        L_0x01a5:
            if (r15 != 0) goto L_0x01f7
            java.lang.Class r8 = r5.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r29 = r4
            r30 = r13
            r4 = 0
            r7 = 2
            r15 = 36
            java.lang.String r13 = HJ.C15854t.s1(r8, r15, r4, r7, r4)
            r15 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r15, r4, r7, r4)
            int r4 = r13.length()
            if (r4 != 0) goto L_0x01cb
            goto L_0x01cf
        L_0x01cb:
            java.lang.String r8 = HJ.C15854t.P0(r13, r10)
        L_0x01cf:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r7 = 1
            boolean r4 = HJ.C15854t.b0(r4, r9, r7)
            if (r4 == 0) goto L_0x01e1
            r4 = r22
            goto L_0x01e3
        L_0x01e1:
            r4 = r21
        L_0x01e3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            r7.append(r8)
            java.lang.String r4 = r7.toString()
            r15 = r4
            goto L_0x01fb
        L_0x01f7:
            r29 = r4
            r30 = r13
        L_0x01fb:
            r26 = 0
            r24 = r12
            r25 = r15
            r4 = 0
            r27 = r4
            r28 = r14
            r23.a(r24, r25, r26, r27, r28)
            r7 = r21
            r8 = r22
            r4 = r29
            r13 = r30
            goto L_0x017b
        L_0x0213:
            r29 = r4
            r21 = r7
            r22 = r8
            goto L_0x019a
        L_0x021a:
            QJ.M r7 = r5.f96104a
            com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$c r8 = new com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker$c
            r13 = 0
            r8.<init>(r5, r13)
            r2.f96107c = r5
            r2.f96108d = r1
            r2.f96109e = r3
            r2.f96110f = r5
            r2.f96111g = r5
            r2.f96112h = r12
            r2.f96113i = r14
            r2.f96114j = r15
            r2.f96115k = r11
            r2.f96116l = r0
            r2.f96117m = r4
            r15 = r30
            r2.f96118n = r15
            r0 = 0
            r2.f96119o = r0
            r2.f96120p = r0
            r2.f96121q = r0
            r2.f96122r = r0
            r2.f96123s = r0
            r0 = 2
            r2.f96126v = r0
            java.lang.Object r0 = QJ.C16310i.g(r7, r8, r2)
            r1 = r29
            if (r0 != r1) goto L_0x0253
            return r1
        L_0x0253:
            r1 = r5
        L_0x0254:
            qv.e r0 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0267:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x027f
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            boolean r5 = r5.b(r0, r7)
            if (r5 == 0) goto L_0x0267
            r3.add(r4)
            goto L_0x0267
        L_0x027f:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r4 = 0
        L_0x0285:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0305
            java.lang.Object r5 = r2.next()
            r23 = r5
            qv.b r23 = (qv.C11819b) r23
            r5 = 0
            if (r4 != 0) goto L_0x02a3
            java.lang.String r4 = "INBOX SYNC Done"
            java.lang.String r4 = qv.C11818a.a(r4, r5)
            if (r4 != 0) goto L_0x029f
            goto L_0x0305
        L_0x029f:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x02a3:
            if (r3 != 0) goto L_0x02f0
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r7 = 36
            r8 = 2
            r11 = 0
            java.lang.String r12 = HJ.C15854t.s1(r3, r7, r11, r8, r11)
            r13 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r13, r11, r8, r11)
            int r14 = r12.length()
            if (r14 != 0) goto L_0x02c5
            goto L_0x02c9
        L_0x02c5:
            java.lang.String r3 = HJ.C15854t.P0(r12, r10)
        L_0x02c9:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r14 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r14)
            if (r12 == 0) goto L_0x02db
            r12 = r22
            goto L_0x02dd
        L_0x02db:
            r12 = r21
        L_0x02dd:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r15.append(r6)
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            goto L_0x02f7
        L_0x02f0:
            r7 = 36
            r8 = 2
            r11 = 0
            r13 = 46
            r14 = 1
        L_0x02f7:
            r26 = 0
            r24 = r0
            r25 = r3
            r27 = r5
            r28 = r4
            r23.a(r24, r25, r26, r27, r28)
            goto L_0x0285
        L_0x0305:
            androidx.work.x$a r0 = androidx.work.C7054x.a.c()
            java.lang.String r1 = "success(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.inbox.impl.usecase.InboxSyncWorker.doWork(dI.e):java.lang.Object");
    }
}
