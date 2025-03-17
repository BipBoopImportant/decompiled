package nr;

import Jq.c;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/b;", "Lnr/a;", "LJq/c;", "repository", "<init>", "(LJq/c;)V", "", "id", "Lnr/a$a;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LJq/c;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nr.b  reason: case insensitive filesystem */
public final class C11671b implements C11670a {

    /* renamed from: a  reason: collision with root package name */
    private final c f99995a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.familyrewards.implementation.usecase.ClaimRewardUseCaseImpl", f = "ClaimRewardUseCase.kt", l = {28}, m = "invoke")
    /* renamed from: nr.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99996c;

        /* renamed from: d  reason: collision with root package name */
        Object f99997d;

        /* renamed from: e  reason: collision with root package name */
        Object f99998e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f99999f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11671b f100000g;

        /* renamed from: h  reason: collision with root package name */
        int f100001h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11671b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f100000g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99999f = obj;
            this.f100001h |= Integer.MIN_VALUE;
            return this.f100000g.a((String) null, this);
        }
    }

    public C11671b(c cVar) {
        C17542s.j(cVar, "repository");
        this.f99995a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super nr.C11670a.C2304a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof nr.C11671b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            nr.b$a r0 = (nr.C11671b.a) r0
            int r1 = r0.f100001h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f100001h = r1
            goto L_0x0018
        L_0x0013:
            nr.b$a r0 = new nr.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f99999f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f100001h
            r4 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r4) goto L_0x003b
            java.lang.Object r6 = r0.f99998e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f99997d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f99996c
            nr.b r7 = (nr.C11671b) r7
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r7 = r1.j()
            goto L_0x0058
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r1)
            Jq.c r1 = r5.f99995a
            r0.f99996c = r5
            r0.f99997d = r6
            r0.f99998e = r7
            r0.f100001h = r4
            r7 = 0
            java.lang.Object r7 = r1.e(r6, r7, r0)
            if (r7 != r2) goto L_0x0058
            return r2
        L_0x0058:
            java.lang.Throwable r0 = XH.x.e(r7)
            if (r0 != 0) goto L_0x006a
            Qq.g r7 = (Qq.g) r7
            nr.a$a$c r0 = new nr.a$a$c
            java.lang.String r7 = r7.m()
            r0.<init>(r6, r7)
            goto L_0x0085
        L_0x006a:
            boolean r6 = r0 instanceof Jq.a
            if (r6 == 0) goto L_0x007f
            nr.a$a$b r6 = new nr.a$a$b
            Jq.a r0 = (Jq.a) r0
            java.lang.String r7 = r0.a()
            int r0 = r0.b()
            r6.<init>(r7, r0)
        L_0x007d:
            r0 = r6
            goto L_0x0085
        L_0x007f:
            nr.a$a$a r6 = new nr.a$a$a
            r6.<init>(r0)
            goto L_0x007d
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr.C11671b.a(java.lang.String, dI.e):java.lang.Object");
    }
}
