package Au;

import TJ.C16532g;
import android.content.Context;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import ru.c;
import su.C11891a;
import tf.C10253a;
import yd.C10452f;
import zu.C12555a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"LAu/d;", "Lru/c;", "Landroid/content/Context;", "context", "Ltf/a;", "killSwitchRepository", "Lzu/a;", "getWayfindingDetailsUseCase", "Lyd/f;", "dependencyManager", "Lsu/a;", "analytics", "<init>", "(Landroid/content/Context;Ltf/a;Lzu/a;Lyd/f;Lsu/a;)V", "", "c", "(Landroid/content/Context;)Z", "", "storeId", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lzu/a;", "Lyd/f;", "d", "Lsu/a;", "LTJ/g;", "e", "LTJ/g;", "()LTJ/g;", "isEnabledFlow", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f79181a;

    /* renamed from: b  reason: collision with root package name */
    private final C12555a f79182b;

    /* renamed from: c  reason: collision with root package name */
    private final C10452f f79183c;

    /* renamed from: d  reason: collision with root package name */
    private final C11891a f79184d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Boolean> f79185e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.wayfinding.impl.WayfindingIntegrationImpl", f = "WayfindingIntegrationImpl.kt", l = {35}, m = "isWayfindingSupported")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f79186c;

        /* renamed from: d  reason: collision with root package name */
        Object f79187d;

        /* renamed from: e  reason: collision with root package name */
        Object f79188e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f79189f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f79190g;

        /* renamed from: h  reason: collision with root package name */
        int f79191h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79190g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79189f = obj;
            this.f79191h |= Integer.MIN_VALUE;
            return this.f79190g.b((String) null, this);
        }
    }

    public d(Context context, C10253a aVar, C12555a aVar2, C10452f fVar, C11891a aVar3) {
        C17542s.j(context, "context");
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "getWayfindingDetailsUseCase");
        C17542s.j(fVar, "dependencyManager");
        C17542s.j(aVar3, "analytics");
        this.f79181a = context;
        this.f79182b = aVar2;
        this.f79183c = fVar;
        this.f79184d = aVar3;
        this.f79185e = aVar.s();
    }

    private final boolean c(Context context) {
        return this.f79183c.a(context);
    }

    public C16532g<Boolean> a() {
        return this.f79185e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r13, dI.C17164e<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof Au.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            Au.d$a r0 = (Au.d.a) r0
            int r1 = r0.f79191h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79191h = r1
            goto L_0x0018
        L_0x0013:
            Au.d$a r0 = new Au.d$a
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f79189f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79191h
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r5) goto L_0x003d
            java.lang.Object r13 = r0.f79188e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f79187d
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r0.f79186c
            Au.d r13 = (Au.d) r13
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r13 = r1.j()
            goto L_0x010b
        L_0x003d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0045:
            XH.y.b(r1)
            android.content.Context r1 = r12.f79181a
            boolean r1 = r12.c(r1)
            if (r1 != 0) goto L_0x00fa
            qv.e r13 = qv.e.WARN
            qv.d r14 = qv.d.f102012a
            java.util.List r14 = r14.a()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0063:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r14.next()
            r2 = r1
            qv.b r2 = (qv.C11819b) r2
            boolean r2 = r2.b(r13, r4)
            if (r2 == 0) goto L_0x0063
            r0.add(r1)
            goto L_0x0063
        L_0x007a:
            java.util.Iterator r14 = r0.iterator()
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0081:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x00f4
            java.lang.Object r3 = r14.next()
            r6 = r3
            qv.b r6 = (qv.C11819b) r6
            r10 = 0
            if (r1 != 0) goto L_0x009e
            java.lang.String r1 = "KompassMap SDK is not supported by this device"
            java.lang.String r1 = qv.C11818a.a(r1, r10)
            if (r1 != 0) goto L_0x009a
            goto L_0x00f4
        L_0x009a:
            java.lang.String r1 = qv.C11820c.a(r1)
        L_0x009e:
            if (r2 != 0) goto L_0x00ec
            java.lang.Class<Au.d> r2 = Au.d.class
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r7 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r0, r7, r0)
            r8 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r8, r0, r7, r0)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x00bd
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x00c3:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r7 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r7, r5)
            if (r3 == 0) goto L_0x00d6
            java.lang.String r3 = "m"
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r3 = "b"
        L_0x00d8:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = "|"
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        L_0x00ec:
            r9 = 0
            r7 = r13
            r8 = r2
            r11 = r1
            r6.a(r7, r8, r9, r10, r11)
            goto L_0x0081
        L_0x00f4:
            su.a r13 = r12.f79184d
            r13.d()
            goto L_0x0116
        L_0x00fa:
            zu.a r1 = r12.f79182b
            r0.f79186c = r12
            r0.f79187d = r13
            r0.f79188e = r14
            r0.f79191h = r5
            java.lang.Object r13 = r1.m16invokegIAlus(r13, r0)
            if (r13 != r2) goto L_0x010b
            return r2
        L_0x010b:
            java.lang.Throwable r14 = XH.x.e(r13)
            if (r14 != 0) goto L_0x0116
            yu.a r13 = (yu.C12516a) r13
            if (r13 == 0) goto L_0x0116
            r4 = r5
        L_0x0116:
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Au.d.b(java.lang.String, dI.e):java.lang.Object");
    }
}
