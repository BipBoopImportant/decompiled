package Ql;

import Il.d;
import Sl.f;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import com.ingka.ikea.core.model.Media;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LQl/e;", "LSl/f;", "LIl/d;", "marketRepo", "<init>", "(LIl/d;)V", "", "key", "Lcom/ingka/ikea/core/model/Media$Video;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LIl/d;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f85994a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<Media.Video> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f85995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f85996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f85997c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ql.e$a$a  reason: collision with other inner class name */
        public static final class C1765a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f85998a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f85999b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f86000c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.appconfig.impl.usecase.GetStaticVideoUseCaseImpl$invoke$$inlined$map$1$2", f = "GetStaticVideoUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Ql.e$a$a$a  reason: collision with other inner class name */
            public static final class C1766a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f86001c;

                /* renamed from: d  reason: collision with root package name */
                int f86002d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1765a f86003e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1766a(C1765a aVar, C17164e eVar) {
                    super(eVar);
                    this.f86003e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f86001c = obj;
                    this.f86002d |= Integer.MIN_VALUE;
                    return this.f86003e.emit((Object) null, this);
                }
            }

            public C1765a(C16533h hVar, e eVar, String str) {
                this.f85998a = hVar;
                this.f85999b = eVar;
                this.f86000c = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r19, dI.C17164e r20) {
                /*
                    r18 = this;
                    r0 = r18
                    r1 = r20
                    boolean r2 = r1 instanceof Ql.e.a.C1765a.C1766a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    Ql.e$a$a$a r2 = (Ql.e.a.C1765a.C1766a) r2
                    int r3 = r2.f86002d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f86002d = r3
                    goto L_0x001c
                L_0x0017:
                    Ql.e$a$a$a r2 = new Ql.e$a$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f86001c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f86002d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x015b
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f85998a
                    r4 = r19
                    Rl.e r4 = (Rl.e) r4
                    r6 = 0
                    if (r4 == 0) goto L_0x0152
                    java.util.List r4 = r4.a()
                    if (r4 == 0) goto L_0x0152
                    java.lang.Iterable r4 = (java.lang.Iterable) r4
                    java.util.Iterator r4 = r4.iterator()
                L_0x004e:
                    boolean r7 = r4.hasNext()
                    if (r7 == 0) goto L_0x0070
                    java.lang.Object r7 = r4.next()
                    r8 = r7
                    com.ingka.ikea.appconfig.model.RemoteMedia r8 = (com.ingka.ikea.appconfig.model.RemoteMedia) r8
                    java.lang.String r9 = r8.c()
                    java.lang.String r10 = r0.f86000c
                    boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
                    if (r9 == 0) goto L_0x004e
                    com.ingka.ikea.appconfig.model.RemoteMedia$b r8 = r8.d()
                    com.ingka.ikea.appconfig.model.RemoteMedia$b r9 = com.ingka.ikea.appconfig.model.RemoteMedia.b.VIDEO
                    if (r8 != r9) goto L_0x004e
                    goto L_0x0071
                L_0x0070:
                    r7 = r6
                L_0x0071:
                    com.ingka.ikea.appconfig.model.RemoteMedia r7 = (com.ingka.ikea.appconfig.model.RemoteMedia) r7
                    if (r7 == 0) goto L_0x0084
                    com.ingka.ikea.core.model.Media$Video r6 = new com.ingka.ikea.core.model.Media$Video
                    java.lang.String r4 = r7.e()
                    java.lang.String r7 = r7.b()
                    r6.<init>(r4, r7)
                    goto L_0x0152
                L_0x0084:
                    Ql.e r4 = r0.f85999b
                    java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                    java.lang.String r7 = r0.f86000c
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "Media type with key "
                    r8.append(r9)
                    r8.append(r7)
                    java.lang.String r7 = " was not found"
                    r8.append(r7)
                    java.lang.String r7 = r8.toString()
                    r13.<init>(r7)
                    qv.e r14 = qv.e.ERROR
                    qv.d r7 = qv.d.f102012a
                    java.util.List r7 = r7.a()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x00b6:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L_0x00ce
                    java.lang.Object r9 = r7.next()
                    r10 = r9
                    qv.b r10 = (qv.C11819b) r10
                    r11 = 0
                    boolean r10 = r10.b(r14, r11)
                    if (r10 == 0) goto L_0x00b6
                    r8.add(r9)
                    goto L_0x00b6
                L_0x00ce:
                    java.util.Iterator r15 = r8.iterator()
                    r7 = r6
                    r8 = r7
                L_0x00d4:
                    boolean r9 = r15.hasNext()
                    if (r9 == 0) goto L_0x0152
                    java.lang.Object r9 = r15.next()
                    qv.b r9 = (qv.C11819b) r9
                    if (r7 != 0) goto L_0x00ee
                    java.lang.String r7 = qv.C11818a.a(r6, r13)
                    if (r7 != 0) goto L_0x00ea
                    goto L_0x0152
                L_0x00ea:
                    java.lang.String r7 = qv.C11820c.a(r7)
                L_0x00ee:
                    r16 = r7
                    if (r8 != 0) goto L_0x0140
                    java.lang.Class r7 = r4.getClass()
                    java.lang.String r7 = r7.getName()
                    kotlin.jvm.internal.C17542s.g(r7)
                    r8 = 36
                    r10 = 2
                    java.lang.String r8 = HJ.C15854t.s1(r7, r8, r6, r10, r6)
                    r11 = 46
                    java.lang.String r8 = HJ.C15854t.o1(r8, r11, r6, r10, r6)
                    int r10 = r8.length()
                    if (r10 != 0) goto L_0x0111
                    goto L_0x0117
                L_0x0111:
                    java.lang.String r7 = "Kt"
                    java.lang.String r7 = HJ.C15854t.P0(r8, r7)
                L_0x0117:
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    java.lang.String r8 = r8.getName()
                    java.lang.String r10 = "main"
                    boolean r8 = HJ.C15854t.b0(r8, r10, r5)
                    if (r8 == 0) goto L_0x012a
                    java.lang.String r8 = "m"
                    goto L_0x012c
                L_0x012a:
                    java.lang.String r8 = "b"
                L_0x012c:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r8)
                    java.lang.String r8 = "|"
                    r10.append(r8)
                    r10.append(r7)
                    java.lang.String r8 = r10.toString()
                L_0x0140:
                    r17 = r8
                    r10 = 0
                    r7 = r9
                    r8 = r14
                    r9 = r17
                    r11 = r13
                    r12 = r16
                    r7.a(r8, r9, r10, r11, r12)
                    r7 = r16
                    r8 = r17
                    goto L_0x00d4
                L_0x0152:
                    r2.f86002d = r5
                    java.lang.Object r1 = r1.emit(r6, r2)
                    if (r1 != r3) goto L_0x015b
                    return r3
                L_0x015b:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: Ql.e.a.C1765a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, e eVar, String str) {
            this.f85995a = gVar;
            this.f85996b = eVar;
            this.f85997c = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f85995a.collect(new C1765a(hVar, this.f85996b, this.f85997c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public e(d dVar) {
        C17542s.j(dVar, "marketRepo");
        this.f85994a = dVar;
    }

    public Object a(String str, C17164e<? super Media.Video> eVar) {
        return C16534i.D(new a(this.f85994a.d(), this, str), eVar);
    }
}
