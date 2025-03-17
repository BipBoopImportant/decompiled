package JD;

import dI.C17164e;
import hx.C14544b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LJD/b;", "LJD/a;", "Lhx/b;", "prepaidCardRepository", "<init>", "(Lhx/b;)V", "", "redemptionCode", "", "b", "(Ljava/lang/String;)Z", "LJD/a$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lhx/b;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JD.b  reason: case insensitive filesystem */
public final class C13070b implements C13069a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f111214b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f111215c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C14544b f111216a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJD/b$a;", "", "<init>", "()V", "", "REQUIRED_LENGTH", "I", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JD.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.wallet.impl.usecase.AttachPrepaidCardUseCaseImpl", f = "AttachPrepaidCardUseCase.kt", l = {22}, m = "invoke")
    /* renamed from: JD.b$b  reason: collision with other inner class name */
    static final class C2696b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111217c;

        /* renamed from: d  reason: collision with root package name */
        Object f111218d;

        /* renamed from: e  reason: collision with root package name */
        Object f111219e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111220f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13070b f111221g;

        /* renamed from: h  reason: collision with root package name */
        int f111222h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2696b(C13070b bVar, C17164e<? super C2696b> eVar) {
            super(eVar);
            this.f111221g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111220f = obj;
            this.f111222h |= Integer.MIN_VALUE;
            return this.f111221g.a((String) null, this);
        }
    }

    public C13070b(C14544b bVar) {
        C17542s.j(bVar, "prepaidCardRepository");
        this.f111216a = bVar;
    }

    private final boolean b(String str) {
        return str.length() == 16;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super JD.C13069a.C2695a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof JD.C13070b.C2696b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            JD.b$b r0 = (JD.C13070b.C2696b) r0
            int r1 = r0.f111222h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111222h = r1
            goto L_0x0018
        L_0x0013:
            JD.b$b r0 = new JD.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111220f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111222h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f111219e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111218d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111217c
            JD.b r6 = (JD.C13070b) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            boolean r1 = r5.b(r6)
            if (r1 == 0) goto L_0x006d
            hx.b r1 = r5.f111216a
            r0.f111217c = r5
            r0.f111218d = r6
            r0.f111219e = r7
            r0.f111222h = r4
            java.lang.Object r1 = r1.c(r6, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            hx.a r1 = (hx.C14543a) r1
            boolean r6 = r1 instanceof hx.C14543a.b
            if (r6 == 0) goto L_0x0060
            JD.a$a r6 = JD.C13069a.C2695a.Success
            goto L_0x006f
        L_0x0060:
            boolean r6 = r1 instanceof hx.C14543a.C3140a
            if (r6 == 0) goto L_0x0067
            JD.a$a r6 = JD.C13069a.C2695a.Failure
            goto L_0x006f
        L_0x0067:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x006d:
            JD.a$a r6 = JD.C13069a.C2695a.InvalidInput
        L_0x006f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: JD.C13070b.a(java.lang.String, dI.e):java.lang.Object");
    }
}
