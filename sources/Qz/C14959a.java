package qz;

import Sy.a;
import aA.C13909a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lD.C14762d;
import rz.K;
import tz.C15100a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHB¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqz/a;", "Ltz/a;", "LlD/d;", "getProfile", "LaA/a;", "sessionManager", "LSy/a;", "analytics", "<init>", "(LlD/d;LaA/a;LSy/a;)V", "Lrz/K;", "c", "(LdI/e;)Ljava/lang/Object;", "a", "LlD/d;", "b", "LaA/a;", "LSy/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qz.a  reason: case insensitive filesystem */
public final class C14959a implements C15100a {

    /* renamed from: a  reason: collision with root package name */
    private final C14762d f130491a;

    /* renamed from: b  reason: collision with root package name */
    private final C13909a f130492b;

    /* renamed from: c  reason: collision with root package name */
    private final a f130493c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.usecase.GetProfileStateUseCaseImpl", f = "GetProfileStateUseCaseImpl.kt", l = {24}, m = "loadProfileState")
    /* renamed from: qz.a$a  reason: collision with other inner class name */
    static final class C3226a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f130494c;

        /* renamed from: d  reason: collision with root package name */
        Object f130495d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f130496e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14959a f130497f;

        /* renamed from: g  reason: collision with root package name */
        int f130498g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3226a(C14959a aVar, C17164e<? super C3226a> eVar) {
            super(eVar);
            this.f130497f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f130496e = obj;
            this.f130498g |= Integer.MIN_VALUE;
            return this.f130497f.c(this);
        }
    }

    public C14959a(C14762d dVar, C13909a aVar, a aVar2) {
        C17542s.j(dVar, "getProfile");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "analytics");
        this.f130491a = dVar;
        this.f130492b = aVar;
        this.f130493c = aVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super rz.K> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qz.C14959a.C3226a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qz.a$a r0 = (qz.C14959a.C3226a) r0
            int r1 = r0.f130498g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f130498g = r1
            goto L_0x0018
        L_0x0013:
            qz.a$a r0 = new qz.a$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f130496e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f130498g
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r5) goto L_0x0032
            java.lang.Object r7 = r0.f130495d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f130494c
            qz.a r7 = (qz.C14959a) r7
            XH.y.b(r1)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003a:
            XH.y.b(r1)
            lD.d r1 = r6.f130491a
            r0.f130494c = r6
            r0.f130495d = r7
            r0.f130498g = r5
            r7 = 0
            java.lang.Object r1 = lD.C14762d.a.a(r1, r7, r0, r5, r4)
            if (r1 != r2) goto L_0x004d
            return r2
        L_0x004d:
            r7 = r6
        L_0x004e:
            kD.h r1 = (kD.h) r1
            if (r1 != 0) goto L_0x0060
            aA.a r0 = r7.f130492b
            boolean r0 = r0.isLoggedIn()
            if (r0 == 0) goto L_0x005d
            rz.K$a$b r0 = rz.K.a.b.f130756b
            goto L_0x0081
        L_0x005d:
            rz.K$b r0 = rz.K.b.f130758b
            goto L_0x0081
        L_0x0060:
            java.util.List r0 = r1.g()
            java.lang.Object r0 = YH.C16877v.y0(r0)
            kD.f r0 = (kD.f) r0
            if (r0 == 0) goto L_0x0070
            java.lang.String r4 = r0.a()
        L_0x0070:
            if (r4 == 0) goto L_0x007f
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0079
            goto L_0x007f
        L_0x0079:
            rz.K$a$a r0 = new rz.K$a$a
            r0.<init>(r4)
            goto L_0x0081
        L_0x007f:
            rz.K$a$c r0 = rz.K.a.c.f130757b
        L_0x0081:
            rz.K$a$b r1 = rz.K.a.b.f130756b
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 != 0) goto L_0x00ad
            rz.K$a$c r1 = rz.K.a.c.f130757b
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0092
            goto L_0x00ad
        L_0x0092:
            boolean r7 = r0 instanceof rz.K.a.C3233a
            if (r7 != 0) goto L_0x00bc
            rz.K$b r7 = rz.K.b.f130758b
            boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
            if (r7 != 0) goto L_0x00bc
            rz.K$c r7 = rz.K.c.f130759b
            boolean r7 = kotlin.jvm.internal.C17542s.e(r0, r7)
            if (r7 == 0) goto L_0x00a7
            goto L_0x00bc
        L_0x00a7:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x00ad:
            aA.a r1 = r7.f130492b
            aA.b r1 = r1.o()
            aA.b r2 = aA.C13910b.FAMILY
            if (r1 != r2) goto L_0x00bc
            Sy.a r7 = r7.f130493c
            r7.B()
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.C14959a.c(dI.e):java.lang.Object");
    }

    public Object a(C17164e<? super K> eVar) {
        return c(eVar);
    }
}
