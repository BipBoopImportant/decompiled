package qn;

import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pn.C11761a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqn/a;", "Lgp/b;", "Lpn/a;", "availabilitySettingsDataSource", "<init>", "(Lpn/a;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lpn/a;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qn.a  reason: case insensitive filesystem */
public final class C11799a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C11761a f101689a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f101690b = C11346e.AVAILABILITY_SETTINGS_CLEAR;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsClearTask", f = "AvailabilitySettingsClearTask.kt", l = {22}, m = "execute")
    /* renamed from: qn.a$a  reason: collision with other inner class name */
    static final class C2412a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f101691c;

        /* renamed from: d  reason: collision with root package name */
        Object f101692d;

        /* renamed from: e  reason: collision with root package name */
        Object f101693e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101694f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11799a f101695g;

        /* renamed from: h  reason: collision with root package name */
        int f101696h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2412a(C11799a aVar, C17164e<? super C2412a> eVar) {
            super(eVar);
            this.f101695g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101694f = obj;
            this.f101696h |= Integer.MIN_VALUE;
            return this.f101695g.b((Object) null, this);
        }
    }

    public C11799a(C11761a aVar) {
        C17542s.j(aVar, "availabilitySettingsDataSource");
        this.f101689a = aVar;
    }

    public C11346e a() {
        return this.f101690b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qn.C11799a.C2412a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qn.a$a r0 = (qn.C11799a.C2412a) r0
            int r1 = r0.f101696h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101696h = r1
            goto L_0x0018
        L_0x0013:
            qn.a$a r0 = new qn.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f101694f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f101696h
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f101693e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f101691c
            qn.a r6 = (qn.C11799a) r6
            XH.y.b(r1)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            pn.a r1 = r5.f101689a
            r0.f101691c = r5
            r0.f101692d = r6
            r0.f101693e = r7
            r0.f101696h = r4
            java.lang.Object r6 = r1.f(r0)
            if (r6 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.C11799a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
