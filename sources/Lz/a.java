package Lz;

import Oz.b;
import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LLz/a;", "Lgp/b;", "LOz/b;", "scanAndGoCleanupUseCase", "<init>", "(LOz/b;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LOz/b;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final b f111944a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f111945b = C11346e.SCAN_AND_GO_CHANGE_MARKET;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.task.ScanAndGoChangeMarketTask", f = "ScanAndGoChangeMarketTask.kt", l = {24}, m = "execute")
    /* renamed from: Lz.a$a  reason: collision with other inner class name */
    static final class C2741a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111946c;

        /* renamed from: d  reason: collision with root package name */
        Object f111947d;

        /* renamed from: e  reason: collision with root package name */
        Object f111948e;

        /* renamed from: f  reason: collision with root package name */
        Object f111949f;

        /* renamed from: g  reason: collision with root package name */
        Object f111950g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f111951h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f111952i;

        /* renamed from: j  reason: collision with root package name */
        int f111953j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2741a(a aVar, C17164e<? super C2741a> eVar) {
            super(eVar);
            this.f111952i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111951h = obj;
            this.f111953j |= Integer.MIN_VALUE;
            return this.f111952i.b((Object) null, this);
        }
    }

    public a(b bVar) {
        C17542s.j(bVar, "scanAndGoCleanupUseCase");
        this.f111944a = bVar;
    }

    public C11346e a() {
        return this.f111945b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r7, dI.C17164e<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Lz.a.C2741a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            Lz.a$a r0 = (Lz.a.C2741a) r0
            int r1 = r0.f111953j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111953j = r1
            goto L_0x0018
        L_0x0013:
            Lz.a$a r0 = new Lz.a$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f111951h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111953j
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r7 = r0.f111950g
            Il.e r7 = (Il.e) r7
            java.lang.Object r7 = r0.f111949f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111948e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f111946c
            Lz.a r7 = (Lz.a) r7
            XH.y.b(r1)
            goto L_0x0069
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            XH.y.b(r1)
            boolean r1 = r7 instanceof Il.e
            r3 = 0
            if (r1 == 0) goto L_0x004d
            r1 = r7
            Il.e r1 = (Il.e) r1
            goto L_0x004e
        L_0x004d:
            r1 = r3
        L_0x004e:
            if (r1 == 0) goto L_0x0054
            java.lang.String r3 = r1.b()
        L_0x0054:
            Oz.b r5 = r6.f111944a
            r0.f111946c = r6
            r0.f111947d = r7
            r0.f111948e = r8
            r0.f111949f = r3
            r0.f111950g = r1
            r0.f111953j = r4
            java.lang.Object r7 = r5.a(r3, r0)
            if (r7 != r2) goto L_0x0069
            return r2
        L_0x0069:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Lz.a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
