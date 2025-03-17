package Er;

import OE.w;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import com.sugarcube.app.base.DeviceCompatibility;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tf.C10253a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LEr/b;", "LDr/b;", "Ltf/a;", "killSwitchRepository", "Lcom/sugarcube/app/base/DeviceCompatibility;", "deviceCompatibility", "LOE/w;", "sugarcubeService", "<init>", "(Ltf/a;Lcom/sugarcube/app/base/DeviceCompatibility;LOE/w;)V", "a", "Lcom/sugarcube/app/base/DeviceCompatibility;", "b", "LOE/w;", "LTJ/g;", "", "c", "LTJ/g;", "isEnabled", "()LTJ/g;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Dr.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final DeviceCompatibility f80766a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final w f80767b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f80768c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80769a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f80770b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Er.b$a$a  reason: collision with other inner class name */
        public static final class C1542a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80771a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f80772b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.geomagical.impl.GeomagicalIntegrationImpl$special$$inlined$map$1$2", f = "GeomagicalIntegrationImpl.kt", l = {51, 50}, m = "emit")
            /* renamed from: Er.b$a$a$a  reason: collision with other inner class name */
            public static final class C1543a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80773c;

                /* renamed from: d  reason: collision with root package name */
                int f80774d;

                /* renamed from: e  reason: collision with root package name */
                Object f80775e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C1542a f80776f;

                /* renamed from: g  reason: collision with root package name */
                Object f80777g;

                /* renamed from: h  reason: collision with root package name */
                boolean f80778h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1543a(C1542a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80776f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80773c = obj;
                    this.f80774d |= Integer.MIN_VALUE;
                    return this.f80776f.emit((Object) null, this);
                }
            }

            public C1542a(C16533h hVar, b bVar) {
                this.f80771a = hVar;
                this.f80772b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x008b A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof Er.b.a.C1542a.C1543a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    Er.b$a$a$a r0 = (Er.b.a.C1542a.C1543a) r0
                    int r1 = r0.f80774d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f80774d = r1
                    goto L_0x0018
                L_0x0013:
                    Er.b$a$a$a r0 = new Er.b$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f80773c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f80774d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0042
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r8)
                    goto L_0x008c
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    boolean r7 = r0.f80778h
                    java.lang.Object r2 = r0.f80777g
                    TJ.h r2 = (TJ.C16533h) r2
                    java.lang.Object r5 = r0.f80775e
                    Er.b$a$a r5 = (Er.b.a.C1542a) r5
                    XH.y.b(r8)
                    goto L_0x0063
                L_0x0042:
                    XH.y.b(r8)
                    TJ.h r2 = r6.f80771a
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    Er.b r8 = r6.f80772b
                    com.sugarcube.app.base.DeviceCompatibility r8 = r8.f80766a
                    r0.f80775e = r6
                    r0.f80777g = r2
                    r0.f80778h = r7
                    r0.f80774d = r4
                    java.lang.Object r8 = r8.isKreativEnabled(r0)
                    if (r8 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    r5 = r6
                L_0x0063:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r7 == 0) goto L_0x006e
                    if (r8 == 0) goto L_0x006e
                    goto L_0x006f
                L_0x006e:
                    r4 = 0
                L_0x006f:
                    if (r4 == 0) goto L_0x007a
                    Er.b r7 = r5.f80772b
                    OE.w r7 = r7.f80767b
                    r7.g()
                L_0x007a:
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r8 = 0
                    r0.f80775e = r8
                    r0.f80777g = r8
                    r0.f80774d = r3
                    java.lang.Object r7 = r2.emit(r7, r0)
                    if (r7 != r1) goto L_0x008c
                    return r1
                L_0x008c:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Er.b.a.C1542a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, b bVar) {
            this.f80769a = gVar;
            this.f80770b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80769a.collect(new C1542a(hVar, this.f80770b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(C10253a aVar, DeviceCompatibility deviceCompatibility, w wVar) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(deviceCompatibility, "deviceCompatibility");
        C17542s.j(wVar, "sugarcubeService");
        this.f80766a = deviceCompatibility;
        this.f80767b = wVar;
        this.f80768c = new a(C16534i.s(aVar.p()), this);
    }

    public C16532g<Boolean> isEnabled() {
        return this.f80768c;
    }
}
