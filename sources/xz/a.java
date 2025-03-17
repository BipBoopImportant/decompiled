package Xz;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HB¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LXz/a;", "LRz/a;", "LPz/a;", "promoImageRepository", "<init>", "(LPz/a;)V", "LXH/x;", "LQz/b;", "invoke-IoAF18A", "(LdI/e;)Ljava/lang/Object;", "invoke", "a", "LPz/a;", "seasonability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Rz.a {

    /* renamed from: a  reason: collision with root package name */
    private final Pz.a f117872a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.seasonability.impl.domain.RandomPromoImageUseCaseImpl", f = "RandomPromoImageUseCaseImpl.kt", l = {17}, m = "invoke-IoAF18A")
    /* renamed from: Xz.a$a  reason: collision with other inner class name */
    static final class C2924a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f117873c;

        /* renamed from: d  reason: collision with root package name */
        Object f117874d;

        /* renamed from: e  reason: collision with root package name */
        Object f117875e;

        /* renamed from: f  reason: collision with root package name */
        Object f117876f;

        /* renamed from: g  reason: collision with root package name */
        int f117877g;

        /* renamed from: h  reason: collision with root package name */
        int f117878h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f117879i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f117880j;

        /* renamed from: k  reason: collision with root package name */
        int f117881k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2924a(a aVar, C17164e<? super C2924a> eVar) {
            super(eVar);
            this.f117880j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f117879i = obj;
            this.f117881k |= Integer.MIN_VALUE;
            Object r22 = this.f117880j.m19invokeIoAF18A(this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public a(Pz.a aVar) {
        C17542s.j(aVar, "promoImageRepository");
        this.f117872a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a A[Catch:{ CancellationException -> 0x0042, all -> 0x003f }, LOOP:0: B:22:0x0084->B:24:0x008a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7 A[Catch:{ CancellationException -> 0x0042, all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m19invokeIoAF18A(dI.C17164e<? super XH.x<Qz.b>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Xz.a.C2924a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Xz.a$a r0 = (Xz.a.C2924a) r0
            int r1 = r0.f117881k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f117881k = r1
            goto L_0x0018
        L_0x0013:
            Xz.a$a r0 = new Xz.a$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f117879i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f117881k
            r4 = 1
            if (r3 == 0) goto L_0x004d
            if (r3 != r4) goto L_0x0045
            java.lang.Object r6 = r0.f117876f
            Xz.a r6 = (Xz.a) r6
            java.lang.Object r6 = r0.f117875e
            Xz.a r6 = (Xz.a) r6
            java.lang.Object r6 = r0.f117874d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f117873c
            Xz.a r6 = (Xz.a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            XH.x r1 = (XH.x) r1     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.lang.Object r6 = r1.j()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            goto L_0x006a
        L_0x003f:
            r6 = move-exception
            goto L_0x00c7
        L_0x0042:
            r6 = move-exception
            goto L_0x00d2
        L_0x0045:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x004d:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Pz.a r1 = r5.f117872a     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117873c = r5     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117874d = r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117875e = r5     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117876f = r5     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r6 = 0
            r0.f117877g = r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117878h = r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.f117881k = r4     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.lang.Object r6 = r1.a(r0)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            if (r6 != r2) goto L_0x006a
            return r2
        L_0x006a:
            XH.y.b(r6)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.a r6 = (Qz.a) r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.util.List r6 = r6.a()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r1 = 10
            int r1 = YH.C16877v.y(r6, r1)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
        L_0x0084:
            boolean r1 = r6.hasNext()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r6.next()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.c r1 = (Qz.c) r1     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.b r1 = r1.a()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r0.add(r1)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            goto L_0x0084
        L_0x0098:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r6.<init>()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
        L_0x00a1:
            boolean r1 = r0.hasNext()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r0.next()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            r2 = r1
            Qz.b r2 = (Qz.b) r2     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.b$a r2 = r2.a()     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.b$a r3 = Qz.b.a.IMAGE     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            if (r2 != r3) goto L_0x00a1
            r6.add(r1)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            goto L_0x00a1
        L_0x00ba:
            rI.c$a r0 = rI.C17853c.f146670a     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.lang.Object r6 = YH.C16877v.X0(r6, r0)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            Qz.b r6 = (Qz.b) r6     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x0042, all -> 0x003f }
            goto L_0x00d1
        L_0x00c7:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x00d1:
            return r6
        L_0x00d2:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Xz.a.m19invokeIoAF18A(dI.e):java.lang.Object");
    }
}
