package yv;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyv/a;", "LTJ/g;", "", "d", "(Lyv/a;)LTJ/g;", "b", "c", "Ltf/a;", "Lyv/j;", "e", "(Ltf/a;)LTJ/g;", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.c  reason: case insensitive filesystem */
public final class C8998c {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.c$a */
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f58100a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yv.c$a$a  reason: collision with other inner class name */
        public static final class C0942a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f58101a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.MembershipFeaturesKt$isBokaEnabled$$inlined$map$1$2", f = "MembershipFeatures.kt", l = {50}, m = "emit")
            /* renamed from: yv.c$a$a$a  reason: collision with other inner class name */
            public static final class C0943a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f58102c;

                /* renamed from: d  reason: collision with root package name */
                int f58103d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0942a f58104e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0943a(C0942a aVar, C17164e eVar) {
                    super(eVar);
                    this.f58104e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f58102c = obj;
                    this.f58103d |= Integer.MIN_VALUE;
                    return this.f58104e.emit((Object) null, this);
                }
            }

            public C0942a(C16533h hVar) {
                this.f58101a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof yv.C8998c.a.C0942a.C0943a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    yv.c$a$a$a r0 = (yv.C8998c.a.C0942a.C0943a) r0
                    int r1 = r0.f58103d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f58103d = r1
                    goto L_0x0018
                L_0x0013:
                    yv.c$a$a$a r0 = new yv.c$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f58102c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f58103d
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
                    TJ.h r6 = r4.f58101a
                    yv.a$a r5 = (yv.C8996a.C0939a) r5
                    boolean r5 = r5.a()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f58103d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: yv.C8998c.a.C0942a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f58100a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f58100a.collect(new C0942a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.c$b */
    public static final class b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f58105a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yv.c$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f58106a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.MembershipFeaturesKt$isFamilyRewardsEnabled$$inlined$map$1$2", f = "MembershipFeatures.kt", l = {50}, m = "emit")
            /* renamed from: yv.c$b$a$a  reason: collision with other inner class name */
            public static final class C0944a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f58107c;

                /* renamed from: d  reason: collision with root package name */
                int f58108d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f58109e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0944a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f58109e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f58107c = obj;
                    this.f58108d |= Integer.MIN_VALUE;
                    return this.f58109e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f58106a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof yv.C8998c.b.a.C0944a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    yv.c$b$a$a r0 = (yv.C8998c.b.a.C0944a) r0
                    int r1 = r0.f58108d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f58108d = r1
                    goto L_0x0018
                L_0x0013:
                    yv.c$b$a$a r0 = new yv.c$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f58107c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f58108d
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
                    TJ.h r6 = r4.f58106a
                    yv.a$a r5 = (yv.C8996a.C0939a) r5
                    boolean r5 = r5.b()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f58108d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: yv.C8998c.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f58105a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f58105a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.c$c  reason: collision with other inner class name */
    public static final class C0945c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f58110a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yv.c$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f58111a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.MembershipFeaturesKt$isKreativEnabled$$inlined$map$1$2", f = "MembershipFeatures.kt", l = {50}, m = "emit")
            /* renamed from: yv.c$c$a$a  reason: collision with other inner class name */
            public static final class C0946a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f58112c;

                /* renamed from: d  reason: collision with root package name */
                int f58113d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f58114e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0946a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f58114e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f58112c = obj;
                    this.f58113d |= Integer.MIN_VALUE;
                    return this.f58114e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f58111a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof yv.C8998c.C0945c.a.C0946a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    yv.c$c$a$a r0 = (yv.C8998c.C0945c.a.C0946a) r0
                    int r1 = r0.f58113d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f58113d = r1
                    goto L_0x0018
                L_0x0013:
                    yv.c$c$a$a r0 = new yv.c$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f58112c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f58113d
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
                    TJ.h r6 = r4.f58111a
                    yv.a$a r5 = (yv.C8996a.C0939a) r5
                    boolean r5 = r5.d()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f58113d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: yv.C8998c.C0945c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C0945c(C16532g gVar) {
            this.f58110a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f58110a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yv.c$d */
    public static final class d implements C16532g<C9005j> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f58115a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yv.c$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f58116a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.MembershipFeaturesKt$membershipKillSwitch$$inlined$map$1$2", f = "MembershipFeatures.kt", l = {50}, m = "emit")
            /* renamed from: yv.c$d$a$a  reason: collision with other inner class name */
            public static final class C0947a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f58117c;

                /* renamed from: d  reason: collision with root package name */
                int f58118d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f58119e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0947a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f58119e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f58117c = obj;
                    this.f58118d |= Integer.MIN_VALUE;
                    return this.f58119e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f58116a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
                r5 = r5.u();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof yv.C8998c.d.a.C0947a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    yv.c$d$a$a r0 = (yv.C8998c.d.a.C0947a) r0
                    int r1 = r0.f58118d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f58118d = r1
                    goto L_0x0018
                L_0x0013:
                    yv.c$d$a$a r0 = new yv.c$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f58117c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f58118d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0054
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f58116a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    yv.j r2 = new yv.j
                    if (r5 == 0) goto L_0x0047
                    java.lang.Boolean r5 = r5.u()
                    if (r5 == 0) goto L_0x0047
                    boolean r5 = r5.booleanValue()
                    goto L_0x0048
                L_0x0047:
                    r5 = 0
                L_0x0048:
                    r2.<init>(r5)
                    r0.f58118d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0054
                    return r1
                L_0x0054:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: yv.C8998c.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f58115a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f58115a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public static final C16532g<Boolean> b(C8996a aVar) {
        C17542s.j(aVar, "<this>");
        return new a(aVar.a());
    }

    public static final C16532g<Boolean> c(C8996a aVar) {
        C17542s.j(aVar, "<this>");
        return new b(aVar.a());
    }

    public static final C16532g<Boolean> d(C8996a aVar) {
        C17542s.j(aVar, "<this>");
        return new C0945c(aVar.a());
    }

    /* access modifiers changed from: private */
    public static final C16532g<C9005j> e(C10253a aVar) {
        return C16534i.s(new d(aVar.I()));
    }
}
