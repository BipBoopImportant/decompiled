package Yv;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import Yv.C6733a;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LYv/b;", "LYv/a;", "LjB/b;", "shoppingListRepository", "<init>", "(LjB/b;)V", "LTJ/g;", "LYv/a$a;", "invoke", "()LTJ/g;", "a", "LjB/b;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yv.b  reason: case insensitive filesystem */
public final class C6734b implements C6733a {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f41092a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yv.b$a */
    public static final class a implements C16532g<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41093a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.b$a$a  reason: collision with other inner class name */
        public static final class C0695a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41094a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetAddToListEventFlowUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAddToListEventFlowUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.b$a$a$a  reason: collision with other inner class name */
            public static final class C0696a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41095c;

                /* renamed from: d  reason: collision with root package name */
                int f41096d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0695a f41097e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0696a(C0695a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41097e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41095c = obj;
                    this.f41096d |= Integer.MIN_VALUE;
                    return this.f41097e.emit((Object) null, this);
                }
            }

            public C0695a(C16533h hVar) {
                this.f41094a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.C6734b.a.C0695a.C0696a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.b$a$a$a r0 = (Yv.C6734b.a.C0695a.C0696a) r0
                    int r1 = r0.f41096d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41096d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.b$a$a$a r0 = new Yv.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41095c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41096d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41094a
                    jB.b$a r5 = (jB.C14613b.a) r5
                    int r5 = r5.hashCode()
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                    r0.f41096d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.C6734b.a.C0695a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f41093a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41093a.collect(new C0695a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yv.b$b  reason: collision with other inner class name */
    public static final class C0697b implements C16532g<C6733a.C0694a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41098a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41099a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetAddToListEventFlowUseCaseImpl$invoke$$inlined$map$2$2", f = "GetAddToListEventFlowUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.b$b$a$a  reason: collision with other inner class name */
            public static final class C0698a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41100c;

                /* renamed from: d  reason: collision with root package name */
                int f41101d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f41102e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0698a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41102e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41100c = obj;
                    this.f41101d |= Integer.MIN_VALUE;
                    return this.f41102e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f41099a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.C6734b.C0697b.a.C0698a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.b$b$a$a r0 = (Yv.C6734b.C0697b.a.C0698a) r0
                    int r1 = r0.f41101d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41101d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.b$b$a$a r0 = new Yv.b$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41100c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41101d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004a
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41099a
                    java.lang.Number r5 = (java.lang.Number) r5
                    int r5 = r5.intValue()
                    Yv.a$a r2 = new Yv.a$a
                    r2.<init>(r5)
                    r0.f41101d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.C6734b.C0697b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C0697b(C16532g gVar) {
            this.f41098a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41098a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C6734b(C14613b bVar) {
        C17542s.j(bVar, "shoppingListRepository");
        this.f41092a = bVar;
    }

    public C16532g<C6733a.C0694a> invoke() {
        return new C0697b(new a(this.f41092a.u()));
    }
}
