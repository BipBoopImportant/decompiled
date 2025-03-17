package Pr;

import Qr.a;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import com.sugarcube.app.base.external.membership.GetMembershipActionListUseCase;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LPr/a;", "LQr/a;", "Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;", "getMembershipActionListUseCase", "<init>", "(Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;)V", "LTJ/g;", "", "LQr/a$a;", "invoke", "()LTJ/g;", "a", "Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Qr.a {

    /* renamed from: a  reason: collision with root package name */
    private final GetMembershipActionListUseCase f85748a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pr.a$a  reason: collision with other inner class name */
    public static final class C1737a implements C16532g<List<? extends a.C1771a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85749a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pr.a$a$a  reason: collision with other inner class name */
        public static final class C1738a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85750a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.geomagical.impl.usecase.GetKreativActionListUseCaseImpl$invoke$$inlined$map$1$2", f = "GetKreativActionListUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Pr.a$a$a$a  reason: collision with other inner class name */
            public static final class C1739a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85751c;

                /* renamed from: d  reason: collision with root package name */
                int f85752d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1738a f85753e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1739a(C1738a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85753e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85751c = obj;
                    this.f85752d |= Integer.MIN_VALUE;
                    return this.f85753e.emit((Object) null, this);
                }
            }

            public C1738a(C16533h hVar) {
                this.f85750a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Pr.a.C1737a.C1738a.C1739a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Pr.a$a$a$a r0 = (Pr.a.C1737a.C1738a.C1739a) r0
                    int r1 = r0.f85752d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f85752d = r1
                    goto L_0x0018
                L_0x0013:
                    Pr.a$a$a$a r0 = new Pr.a$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f85751c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f85752d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x006f
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f85750a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                L_0x0049:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0066
                    java.lang.Object r4 = r8.next()
                    XE.a r4 = (XE.C13805a) r4
                    Qr.a$a r5 = new Qr.a$a
                    java.lang.String r6 = r4.c()
                    java.lang.String r4 = r4.a()
                    r5.<init>(r6, r4)
                    r2.add(r5)
                    goto L_0x0049
                L_0x0066:
                    r0.f85752d = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x006f
                    return r1
                L_0x006f:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Pr.a.C1737a.C1738a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1737a(C16532g gVar) {
            this.f85749a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85749a.collect(new C1738a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(GetMembershipActionListUseCase getMembershipActionListUseCase) {
        C17542s.j(getMembershipActionListUseCase, "getMembershipActionListUseCase");
        this.f85748a = getMembershipActionListUseCase;
    }

    public C16532g<List<a.C1771a>> invoke() {
        return new C1737a(this.f85748a.execute());
    }
}
