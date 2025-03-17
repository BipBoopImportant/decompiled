package hD;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import cD.C14029a;
import dI.C17164e;
import kD.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14759a;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LhD/a;", "LlD/a;", "LcD/a;", "editProfileRepository", "<init>", "(LcD/a;)V", "LTJ/g;", "LkD/c;", "invoke", "()LTJ/g;", "a", "LcD/a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hD.a  reason: case insensitive filesystem */
public final class C14529a implements C14759a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14029a f127437a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LkD/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.useraccount.impl.usecase.GetChangePasswordHlpUrlUseCaseImpl$invoke$1", f = "GetChangePasswordHlpUrlUseCaseImpl.kt", l = {18, 19, 21, 22}, m = "invokeSuspend")
    /* renamed from: hD.a$a  reason: collision with other inner class name */
    static final class C3135a extends l implements p<C16533h<? super c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f127438c;

        /* renamed from: d  reason: collision with root package name */
        Object f127439d;

        /* renamed from: e  reason: collision with root package name */
        int f127440e;

        /* renamed from: f  reason: collision with root package name */
        int f127441f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f127442g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14529a f127443h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3135a(C14529a aVar, C17164e<? super C3135a> eVar) {
            super(2, eVar);
            this.f127443h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3135a aVar = new C3135a(this.f127443h, eVar);
            aVar.f127442g = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super c> hVar, C17164e<? super C16807N> eVar) {
            return ((C3135a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f127441f
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0044
                if (r1 == r5) goto L_0x003c
                if (r1 == r4) goto L_0x002e
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r6.f127439d
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                goto L_0x0025
            L_0x0019:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0021:
                java.lang.Object r0 = r6.f127439d
                java.lang.String r0 = (java.lang.String) r0
            L_0x0025:
                java.lang.Object r0 = r6.f127442g
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r7)
                goto L_0x00a0
            L_0x002e:
                java.lang.Object r1 = r6.f127442g
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                XH.x r7 = (XH.x) r7
                java.lang.Object r7 = r7.j()
                goto L_0x006a
            L_0x003c:
                java.lang.Object r1 = r6.f127442g
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0059
            L_0x0044:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f127442g
                TJ.h r7 = (TJ.C16533h) r7
                kD.c$c r1 = kD.c.C3171c.f128622a
                r6.f127442g = r7
                r6.f127441f = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L_0x0058
                return r0
            L_0x0058:
                r1 = r7
            L_0x0059:
                hD.a r7 = r6.f127443h
                cD.a r7 = r7.f127437a
                r6.f127442g = r1
                r6.f127441f = r4
                java.lang.Object r7 = r7.j(r6)
                if (r7 != r0) goto L_0x006a
                return r0
            L_0x006a:
                java.lang.Throwable r4 = XH.x.e(r7)
                r5 = 0
                if (r4 != 0) goto L_0x008a
                r2 = r7
                java.lang.String r2 = (java.lang.String) r2
                kD.c$b r4 = new kD.c$b
                r4.<init>(r2)
                r6.f127442g = r1
                r6.f127438c = r7
                r6.f127439d = r2
                r6.f127440e = r5
                r6.f127441f = r3
                java.lang.Object r7 = r1.emit(r4, r6)
                if (r7 != r0) goto L_0x00a0
                return r0
            L_0x008a:
                kD.c$a r3 = new kD.c$a
                r3.<init>(r4)
                r6.f127442g = r1
                r6.f127438c = r7
                r6.f127439d = r4
                r6.f127440e = r5
                r6.f127441f = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L_0x00a0
                return r0
            L_0x00a0:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hD.C14529a.C3135a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14529a(C14029a aVar) {
        C17542s.j(aVar, "editProfileRepository");
        this.f127437a = aVar;
    }

    public C16532g<c> invoke() {
        return C16534i.H(new C3135a(this, (C17164e<? super C3135a>) null));
    }
}
