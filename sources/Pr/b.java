package Pr;

import Dr.d;
import Qr.c;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.t;
import com.sugarcube.app.base.external.MembershipUiRepo;
import com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LPr/b;", "LQr/c;", "Lcom/sugarcube/app/base/external/MembershipUiRepo;", "repo", "<init>", "(Lcom/sugarcube/app/base/external/MembershipUiRepo;)V", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "LDr/d$b;", "c", "(Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;)LDr/d$b;", "LTJ/g;", "a", "()LTJ/g;", "Lcom/sugarcube/app/base/external/MembershipUiRepo;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final MembershipUiRepo f85754a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<d.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f85756b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pr.b$a$a  reason: collision with other inner class name */
        public static final class C1740a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85757a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f85758b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.geomagical.impl.usecase.GetKreativCardModelUseCaseImpl$getModel$$inlined$map$1$2", f = "GetKreativCardModelUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Pr.b$a$a$a  reason: collision with other inner class name */
            public static final class C1741a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85759c;

                /* renamed from: d  reason: collision with root package name */
                int f85760d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1740a f85761e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1741a(C1740a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85761e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85759c = obj;
                    this.f85760d |= Integer.MIN_VALUE;
                    return this.f85761e.emit((Object) null, this);
                }
            }

            public C1740a(C16533h hVar, b bVar) {
                this.f85757a = hVar;
                this.f85758b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Pr.b.a.C1740a.C1741a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Pr.b$a$a$a r0 = (Pr.b.a.C1740a.C1741a) r0
                    int r1 = r0.f85760d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f85760d = r1
                    goto L_0x0018
                L_0x0013:
                    Pr.b$a$a$a r0 = new Pr.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f85759c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f85760d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f85757a
                    com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model r5 = (com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model) r5
                    Pr.b r2 = r4.f85758b
                    Dr.d$b r5 = r2.c(r5)
                    r0.f85760d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Pr.b.a.C1740a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, b bVar) {
            this.f85755a = gVar;
            this.f85756b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85755a.collect(new C1740a(hVar, this.f85756b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(MembershipUiRepo membershipUiRepo) {
        C17542s.j(membershipUiRepo, "repo");
        this.f85754a = membershipUiRepo;
    }

    /* access modifiers changed from: private */
    public final d.b c(GetMembershipListsCardUseCase.Model model) {
        if (model instanceof GetMembershipListsCardUseCase.Model.b) {
            GetMembershipListsCardUseCase.Model.b bVar = (GetMembershipListsCardUseCase.Model.b) model;
            return new d.b.C1512b(bVar.f(), bVar.g(), bVar.c(), bVar.e(), bVar.b(), bVar.d(), bVar.a());
        } else if (model instanceof GetMembershipListsCardUseCase.Model.a) {
            GetMembershipListsCardUseCase.Model.a aVar = (GetMembershipListsCardUseCase.Model.a) model;
            return new d.b.a(aVar.f(), aVar.c(), aVar.a(), aVar.b(), aVar.d(), aVar.e(), aVar.g());
        } else {
            throw new t();
        }
    }

    public C16532g<d.b> a() {
        return new a(this.f85754a.getMembershipListsCardInformation(), this);
    }
}
