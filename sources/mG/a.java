package Mg;

import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LMg/a;", "Lgp/b;", "LMg/b;", "repository", "<init>", "(LMg/b;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LMg/b;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final b f61890a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f61891b = C11346e.LOCAL_HISTORY_CLEAR;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.localhistory.LocalHistoryClearTask", f = "LocalHistoryClearTask.kt", l = {21}, m = "execute")
    /* renamed from: Mg.a$a  reason: collision with other inner class name */
    static final class C1037a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f61892c;

        /* renamed from: d  reason: collision with root package name */
        Object f61893d;

        /* renamed from: e  reason: collision with root package name */
        Object f61894e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f61895f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f61896g;

        /* renamed from: h  reason: collision with root package name */
        int f61897h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1037a(a aVar, C17164e<? super C1037a> eVar) {
            super(eVar);
            this.f61896g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61895f = obj;
            this.f61897h |= Integer.MIN_VALUE;
            return this.f61896g.b((Object) null, this);
        }
    }

    public a(b bVar) {
        C17542s.j(bVar, "repository");
        this.f61890a = bVar;
    }

    public C11346e a() {
        return this.f61891b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Mg.a.C1037a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Mg.a$a r0 = (Mg.a.C1037a) r0
            int r1 = r0.f61897h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61897h = r1
            goto L_0x0018
        L_0x0013:
            Mg.a$a r0 = new Mg.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f61895f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f61897h
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f61894e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f61892c
            Mg.a r6 = (Mg.a) r6
            XH.y.b(r1)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            Mg.b r1 = r5.f61890a
            r0.f61892c = r5
            r0.f61893d = r6
            r0.f61894e = r7
            r0.f61897h = r4
            java.lang.Object r6 = r1.i(r0)
            if (r6 != r2) goto L_0x004d
            return r2
        L_0x004d:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
