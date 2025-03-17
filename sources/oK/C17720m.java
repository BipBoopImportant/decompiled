package oK;

import XH.C16807N;
import XH.y;
import android.app.ActivityManager;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import oK.C17715h;
import t1.C5942c;
import tI.C17978n;
import u2.C6012a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0003\u001a\u00020\u00028\u0016X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"LoK/m;", "LoK/h;", "Lc2/r;", "imageSize", "LoK/n;", "decoders", "<init>", "(JLoK/n;)V", "LoK/j;", "region", "Lt1/c;", "b", "(LoK/j;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "a", "J", "()J", "LoK/n;", "c", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.m  reason: case insensitive filesystem */
public final class C17720m implements C17715h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f145390c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f145391d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static Integer f145392e;

    /* renamed from: a  reason: collision with root package name */
    private final long f145393a;

    /* renamed from: b  reason: collision with root package name */
    private final C17721n<C17715h> f145394b;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"LoK/m$a;", "", "<init>", "()V", "LoK/h$b;", "params", "Lc2/r;", "imageSize", "", "c", "(LoK/h$b;J)I", "LoK/h$a;", "delegate", "a", "(LoK/h$a;)LoK/h$a;", "overriddenPoolCount", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setOverriddenPoolCount$sub_sampling_image_release", "(Ljava/lang/Integer;)V", "getOverriddenPoolCount$sub_sampling_image_release$annotations", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.m$a */
    public static final class a {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoK/h$b;", "params", "LoK/h;", "a", "(LoK/h$b;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oK.m$a$a  reason: collision with other inner class name */
        static final class C4243a implements C17715h.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17715h.a f145395a;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @f(c = "me.saket.telephoto.subsamplingimage.internal.PooledImageRegionDecoder$Companion$Factory$1", f = "PooledImageRegionDecoder.kt", l = {38, 40}, m = "create")
            /* renamed from: oK.m$a$a$a  reason: collision with other inner class name */
            static final class C4244a extends d {

                /* renamed from: c  reason: collision with root package name */
                Object f145396c;

                /* renamed from: d  reason: collision with root package name */
                Object f145397d;

                /* renamed from: e  reason: collision with root package name */
                Object f145398e;

                /* renamed from: f  reason: collision with root package name */
                Object f145399f;

                /* renamed from: g  reason: collision with root package name */
                Object f145400g;

                /* renamed from: h  reason: collision with root package name */
                int f145401h;

                /* renamed from: i  reason: collision with root package name */
                int f145402i;

                /* renamed from: j  reason: collision with root package name */
                /* synthetic */ Object f145403j;

                /* renamed from: k  reason: collision with root package name */
                final /* synthetic */ C4243a f145404k;

                /* renamed from: l  reason: collision with root package name */
                int f145405l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4244a(C4243a aVar, C17164e<? super C4244a> eVar) {
                    super(eVar);
                    this.f145404k = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f145403j = obj;
                    this.f145405l |= Integer.MIN_VALUE;
                    return this.f145404k.a((C17715h.b) null, this);
                }
            }

            C4243a(C17715h.a aVar) {
                this.f145395a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00c1  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object a(oK.C17715h.b r11, dI.C17164e<? super oK.C17715h> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof oK.C17720m.a.C4243a.C4244a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    oK.m$a$a$a r0 = (oK.C17720m.a.C4243a.C4244a) r0
                    int r1 = r0.f145405l
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f145405l = r1
                    goto L_0x0018
                L_0x0013:
                    oK.m$a$a$a r0 = new oK.m$a$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f145403j
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f145405l
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0065
                    if (r2 == r4) goto L_0x004d
                    if (r2 != r3) goto L_0x0045
                    int r11 = r0.f145402i
                    int r2 = r0.f145401h
                    java.lang.Object r5 = r0.f145400g
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r6 = r0.f145399f
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Object r7 = r0.f145398e
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Object r8 = r0.f145397d
                    oK.h$a r8 = (oK.C17715h.a) r8
                    java.lang.Object r9 = r0.f145396c
                    oK.h$b r9 = (oK.C17715h.b) r9
                    XH.y.b(r12)
                    goto L_0x00bb
                L_0x0045:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x004d:
                    java.lang.Object r11 = r0.f145400g
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Object r2 = r0.f145399f
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r5 = r0.f145398e
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r6 = r0.f145397d
                    oK.h$a r6 = (oK.C17715h.a) r6
                    java.lang.Object r7 = r0.f145396c
                    oK.h$b r7 = (oK.C17715h.b) r7
                    XH.y.b(r12)
                    goto L_0x0086
                L_0x0065:
                    XH.y.b(r12)
                    oK.h$a r6 = r10.f145395a
                    java.util.List r12 = YH.C16877v.c()
                    r0.f145396c = r11
                    r0.f145397d = r6
                    r0.f145398e = r12
                    r0.f145399f = r12
                    r0.f145400g = r12
                    r0.f145405l = r4
                    java.lang.Object r2 = r6.a(r11, r0)
                    if (r2 != r1) goto L_0x0081
                    return r1
                L_0x0081:
                    r7 = r11
                    r11 = r12
                    r5 = r11
                    r12 = r2
                    r2 = r5
                L_0x0086:
                    r11.add(r12)
                    oK.m$a r11 = oK.C17720m.f145390c
                    java.lang.Object r12 = YH.C16877v.w0(r2)
                    oK.h r12 = (oK.C17715h) r12
                    long r8 = r12.a()
                    int r11 = r11.c(r7, r8)
                    int r11 = r11 - r4
                    r12 = 0
                    r8 = r6
                    r9 = r7
                    r7 = r5
                    r5 = r2
                    r2 = r11
                    r11 = r12
                L_0x00a1:
                    if (r11 >= r2) goto L_0x00c1
                    r0.f145396c = r9
                    r0.f145397d = r8
                    r0.f145398e = r7
                    r0.f145399f = r5
                    r0.f145400g = r5
                    r0.f145401h = r2
                    r0.f145402i = r11
                    r0.f145405l = r3
                    java.lang.Object r12 = r8.a(r9, r0)
                    if (r12 != r1) goto L_0x00ba
                    return r1
                L_0x00ba:
                    r6 = r5
                L_0x00bb:
                    r5.add(r12)
                    int r11 = r11 + r4
                    r5 = r6
                    goto L_0x00a1
                L_0x00c1:
                    java.util.List r11 = YH.C16877v.a(r7)
                    oK.m r12 = new oK.m
                    java.lang.Object r0 = YH.C16877v.w0(r11)
                    oK.h r0 = (oK.C17715h) r0
                    long r0 = r0.a()
                    oK.n r2 = new oK.n
                    r2.<init>(r11)
                    r11 = 0
                    r12.<init>(r0, r2, r11)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: oK.C17720m.a.C4243a.a(oK.h$b, dI.e):java.lang.Object");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(C17715h.b bVar, long j10) {
            Integer d10 = d();
            if (d10 != null) {
                return d10.intValue();
            }
            Object j11 = C6012a.j(bVar.a(), ActivityManager.class);
            C17542s.g(j11);
            ActivityManager activityManager = (ActivityManager) j11;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.lowMemory || activityManager.isLowRamDevice() || C17709b.h(j10) >= 2160) {
                return 1;
            }
            return C17978n.i(Runtime.getRuntime().availableProcessors(), 2);
        }

        public final C17715h.a a(C17715h.a aVar) {
            C17542s.j(aVar, "delegate");
            return new C4243a(aVar);
        }

        public final Integer d() {
            return C17720m.f145392e;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoK/h;", "decoder", "Lt1/c;", "<anonymous>", "(LoK/h;)Lt1/c;"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.PooledImageRegionDecoder$decodeRegion$2", f = "PooledImageRegionDecoder.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: oK.m$b */
    static final class b extends l implements p<C17715h, C17164e<? super C5942c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145406c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f145407d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17717j f145408e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17717j jVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f145408e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f145408e, eVar);
            bVar.f145407d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C17715h hVar, C17164e<? super C5942c> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f145406c;
            if (i10 == 0) {
                y.b(obj);
                C17717j jVar = this.f145408e;
                this.f145406c = 1;
                obj = ((C17715h) this.f145407d).b(jVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public /* synthetic */ C17720m(long j10, C17721n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, nVar);
    }

    public long a() {
        return this.f145393a;
    }

    public Object b(C17717j jVar, C17164e<? super C5942c> eVar) {
        return this.f145394b.a(new b(jVar, (C17164e<? super b>) null), eVar);
    }

    public void close() {
        for (C17715h close : this.f145394b.b()) {
            close.close();
        }
    }

    private C17720m(long j10, C17721n<C17715h> nVar) {
        this.f145393a = j10;
        this.f145394b = nVar;
    }
}
