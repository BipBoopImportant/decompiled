package Bs;

import Ps.e;
import Ps.f;
import XH.t;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHB¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LBs/d;", "LBs/c;", "LQs/a;", "getAllNotificationSettingsUseCase", "<init>", "(LQs/a;)V", "LPs/f;", "setting", "", "b", "(LPs/f;)Ljava/lang/String;", "", "LPs/d;", "contentToFilter", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LQs/a;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Qs.a f79379a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.FilterInboxNotificationUseCaseImpl", f = "FilterInboxNotificationUseCase.kt", l = {38}, m = "invoke")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79380c;

        /* renamed from: d  reason: collision with root package name */
        Object f79381d;

        /* renamed from: e  reason: collision with root package name */
        Object f79382e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f79383f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f79384g;

        /* renamed from: h  reason: collision with root package name */
        int f79385h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79384g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79383f = obj;
            this.f79385h |= Integer.MIN_VALUE;
            return this.f79384g.a((List<Ps.d>) null, this);
        }
    }

    public d(Qs.a aVar) {
        C17542s.j(aVar, "getAllNotificationSettingsUseCase");
        this.f79379a = aVar;
    }

    private final String b(Ps.f fVar) {
        if (fVar instanceof f.b) {
            return e.OFFERS.b();
        }
        if (fVar instanceof f.a) {
            return e.COLLECTIONS.b();
        }
        if (fVar instanceof f.c) {
            return e.INFORMATION.b();
        }
        throw new t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0139 A[LOOP:3: B:50:0x0133->B:52:0x0139, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.List<Ps.d> r12, dI.C17164e<? super java.util.List<Ps.d>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof Bs.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            Bs.d$a r0 = (Bs.d.a) r0
            int r1 = r0.f79385h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79385h = r1
            goto L_0x0018
        L_0x0013:
            Bs.d$a r0 = new Bs.d$a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r1 = r0.f79383f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79385h
            r4 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r4) goto L_0x0036
            java.lang.Object r12 = r0.f79382e
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f79381d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r0.f79380c
            Bs.d r13 = (Bs.d) r13
            XH.y.b(r1)
            goto L_0x0102
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            XH.y.b(r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x00ec
            qv.e r13 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r0.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            r5 = 0
            boolean r3 = r3.b(r13, r5)
            if (r3 == 0) goto L_0x005a
            r1.add(r2)
            goto L_0x005a
        L_0x0072:
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0079:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r0.next()
            qv.b r5 = (qv.C11819b) r5
            r9 = 0
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "Try to filter a empty list of inbox notifications"
            java.lang.String r2 = qv.C11818a.a(r2, r9)
            if (r2 != 0) goto L_0x0091
            goto L_0x00eb
        L_0x0091:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x0095:
            if (r3 != 0) goto L_0x00e3
            java.lang.Class<Bs.d> r3 = Bs.d.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r6 = 36
            r7 = 2
            java.lang.String r6 = HJ.C15854t.s1(r3, r6, r1, r7, r1)
            r8 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r8, r1, r7, r1)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00b4
            goto L_0x00ba
        L_0x00b4:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r6, r3)
        L_0x00ba:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "main"
            boolean r6 = HJ.C15854t.b0(r6, r7, r4)
            if (r6 == 0) goto L_0x00cd
            java.lang.String r6 = "m"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r6 = "b"
        L_0x00cf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "|"
            r7.append(r6)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
        L_0x00e3:
            r8 = 0
            r6 = r13
            r7 = r3
            r10 = r2
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x0079
        L_0x00eb:
            return r12
        L_0x00ec:
            Qs.a r1 = r11.f79379a
            TJ.g r1 = r1.invoke()
            r0.f79380c = r11
            r0.f79381d = r12
            r0.f79382e = r13
            r0.f79385h = r4
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x0101
            return r2
        L_0x0101:
            r13 = r11
        L_0x0102:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x010d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0124
            java.lang.Object r2 = r1.next()
            r3 = r2
            Ps.f r3 = (Ps.f) r3
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x010d
            r0.add(r2)
            goto L_0x010d
        L_0x0124:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0133:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0147
            java.lang.Object r2 = r0.next()
            Ps.f r2 = (Ps.f) r2
            java.lang.String r2 = r13.b(r2)
            r1.add(r2)
            goto L_0x0133
        L_0x0147:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0152:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r12.next()
            r2 = r0
            Ps.d r2 = (Ps.d) r2
            java.lang.String r2 = r2.i()
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0152
            r13.add(r0)
            goto L_0x0152
        L_0x016d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Bs.d.a(java.util.List, dI.e):java.lang.Object");
    }
}
