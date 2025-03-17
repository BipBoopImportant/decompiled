package Kk;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LKk/d;", "LKk/c;", "LKk/a;", "remoteSource", "<init>", "(LKk/a;)V", "LXH/x;", "LIk/a;", "a", "(LdI/e;)Ljava/lang/Object;", "LKk/a;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f82817a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.splash.onboarding.steps.features.repository.OnboardingFeaturesRepositoryImpl", f = "OnboardingFeaturesRepository.kt", l = {17}, m = "fetchOnboardingFeatures-IoAF18A")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f82818c;

        /* renamed from: d  reason: collision with root package name */
        Object f82819d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f82820e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f82821f;

        /* renamed from: g  reason: collision with root package name */
        int f82822g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f82821f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f82820e = obj;
            this.f82822g |= Integer.MIN_VALUE;
            Object a10 = this.f82821f.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public d(a aVar) {
        C17542s.j(aVar, "remoteSource");
        this.f82817a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.x<Ik.a>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Kk.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Kk.d$a r0 = (Kk.d.a) r0
            int r1 = r0.f82822g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f82822g = r1
            goto L_0x0018
        L_0x0013:
            Kk.d$a r0 = new Kk.d$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f82820e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f82822g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f82819d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f82818c
            Kk.d r6 = (Kk.d) r6
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            goto L_0x0051
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            Kk.a r1 = r5.f82817a
            r0.f82818c = r5
            r0.f82819d = r6
            r0.f82822g = r4
            java.lang.Object r6 = r1.a(r0)
            if (r6 != r2) goto L_0x0051
            return r2
        L_0x0051:
            java.lang.Throwable r0 = XH.x.e(r6)
            if (r0 != 0) goto L_0x005e
            Ik.a r6 = (Ik.a) r6
            java.lang.Object r6 = XH.x.b(r6)
            goto L_0x0066
        L_0x005e:
            java.lang.Object r6 = XH.y.a(r0)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0066:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Kk.d.a(dI.e):java.lang.Object");
    }
}
