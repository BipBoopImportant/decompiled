package Pr;

import Qr.b;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.app.base.external.entrypoint.EntryPointModelUseCase;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LPr/c;", "LQr/b;", "Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;", "entryPointModelUseCase", "LDr/b;", "geomagicalIntegration", "<init>", "(Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;LDr/b;)V", "LTJ/g;", "LQr/b$c;", "a", "()LTJ/g;", "Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;", "b", "LDr/b;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Qr.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final EntryPointModelUseCase f85762a;

    /* renamed from: b  reason: collision with root package name */
    private final Dr.b f85763b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.geomagical.impl.usecase.GetKreativEntryPointModelUseCaseImpl$getModel$$inlined$flatMapLatest$1", f = "GetKreativEntryPointModelUseCaseImpl.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super b.c>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85764c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f85765d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f85766e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f85767f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, c cVar) {
            super(3, eVar);
            this.f85767f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super b.c> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f85767f);
            aVar.f85765d = hVar;
            aVar.f85766e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85764c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f85765d;
                C16532g bVar = ((Boolean) this.f85766e).booleanValue() ? new b(this.f85767f.f85762a.execute()) : C16534i.J(null);
                this.f85764c = 1;
                if (C16534i.x(hVar, bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<b.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85768a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85769a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.geomagical.impl.usecase.GetKreativEntryPointModelUseCaseImpl$getModel$lambda$1$$inlined$map$1$2", f = "GetKreativEntryPointModelUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Pr.c$b$a$a  reason: collision with other inner class name */
            public static final class C1742a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f85770c;

                /* renamed from: d  reason: collision with root package name */
                int f85771d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f85772e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1742a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f85772e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f85770c = obj;
                    this.f85771d |= Integer.MIN_VALUE;
                    return this.f85772e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f85769a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Pr.c.b.a.C1742a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Pr.c$b$a$a r0 = (Pr.c.b.a.C1742a) r0
                    int r1 = r0.f85771d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f85771d = r1
                    goto L_0x0018
                L_0x0013:
                    Pr.c$b$a$a r0 = new Pr.c$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f85770c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f85771d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f85769a
                    nF.b r5 = (nF.C14851b) r5
                    Qr.b$c r5 = Pr.d.a(r5)
                    r0.f85771d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Pr.c.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f85768a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85768a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(EntryPointModelUseCase entryPointModelUseCase, Dr.b bVar) {
        C17542s.j(entryPointModelUseCase, "entryPointModelUseCase");
        C17542s.j(bVar, "geomagicalIntegration");
        this.f85762a = entryPointModelUseCase;
        this.f85763b = bVar;
    }

    public C16532g<b.c> a() {
        return C16534i.g0(this.f85763b.isEnabled(), new a((C17164e) null, this));
    }
}
