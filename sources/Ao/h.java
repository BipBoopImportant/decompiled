package ao;

import IC.C13026h;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import bo.f;
import dI.C17164e;
import eI.C17187b;
import fm.C11274b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rv.C11849b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lao/h;", "Lao/g;", "Lfm/b;", "getAssemblyServiceUseCase", "<init>", "(Lfm/b;)V", "Lfm/b$a;", "", "orderNumber", "Lbo/f$b$a$a;", "c", "(Lfm/b$a;Ljava/lang/String;)Lbo/f$b$a$a;", "", "Lfm/b$b;", "items", "LTJ/g;", "a", "(Ljava/lang/String;Ljava/util/List;)LTJ/g;", "Lfm/b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C11274b f90355a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<f.b.a.C1968a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90356a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f90357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f90358c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ao.h$a$a  reason: collision with other inner class name */
        public static final class C1958a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90359a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f90360b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f90361c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.confirmation.usecase.GetOrderConfirmationAssemblyServicesUseCaseImpl$invoke$$inlined$map$1$2", f = "GetOrderConfirmationAssemblyServicesUseCase.kt", l = {50}, m = "emit")
            /* renamed from: ao.h$a$a$a  reason: collision with other inner class name */
            public static final class C1959a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90362c;

                /* renamed from: d  reason: collision with root package name */
                int f90363d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1958a f90364e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1959a(C1958a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90364e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90362c = obj;
                    this.f90363d |= Integer.MIN_VALUE;
                    return this.f90364e.emit((Object) null, this);
                }
            }

            public C1958a(C16533h hVar, h hVar2, String str) {
                this.f90359a = hVar;
                this.f90360b = hVar2;
                this.f90361c = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ao.h.a.C1958a.C1959a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ao.h$a$a$a r0 = (ao.h.a.C1958a.C1959a) r0
                    int r1 = r0.f90363d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90363d = r1
                    goto L_0x0018
                L_0x0013:
                    ao.h$a$a$a r0 = new ao.h$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f90362c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90363d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f90359a
                    fm.b$a r6 = (fm.C11274b.a) r6
                    ao.h r2 = r5.f90360b
                    java.lang.String r4 = r5.f90361c
                    bo.f$b$a$a r6 = r2.c(r6, r4)
                    r0.f90363d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ao.h.a.C1958a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, h hVar, String str) {
            this.f90356a = gVar;
            this.f90357b = hVar;
            this.f90358c = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90356a.collect(new C1958a(hVar, this.f90357b, this.f90358c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public h(C11274b bVar) {
        C17542s.j(bVar, "getAssemblyServiceUseCase");
        this.f90355a = bVar;
    }

    /* access modifiers changed from: private */
    public final f.b.a.C1968a c(C11274b.a aVar, String str) {
        if (aVar instanceof C11274b.a.C2167a) {
            return new f.b.a.C1968a(C13026h.a(C11849b.f102366x2), C13026h.a(C11849b.f102362w2), str);
        }
        return null;
    }

    public C16532g<f.b.a.C1968a> a(String str, List<C11274b.C2173b> list) {
        C17542s.j(list, "items");
        return (str == null || str.length() == 0) ? C16521S.a(null) : new a(this.f90355a.a(list), this, str);
    }
}
