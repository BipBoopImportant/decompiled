package Ff;

import Il.d;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LFf/b;", "", "LIl/d;", "repository", "<init>", "(LIl/d;)V", "LTJ/g;", "", "", "a", "()LTJ/g;", "LIl/d;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f60498a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f60499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f60500b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ff.b$a$a  reason: collision with other inner class name */
        public static final class C0988a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f60501a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f60502b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.browseandsearch.search.viewmodels.SearchHintsUseCase$invoke$$inlined$map$1$2", f = "SearchHintsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Ff.b$a$a$a  reason: collision with other inner class name */
            public static final class C0989a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f60503c;

                /* renamed from: d  reason: collision with root package name */
                int f60504d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0988a f60505e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0989a(C0988a aVar, C17164e eVar) {
                    super(eVar);
                    this.f60505e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f60503c = obj;
                    this.f60504d |= Integer.MIN_VALUE;
                    return this.f60505e.emit((Object) null, this);
                }
            }

            public C0988a(C16533h hVar, b bVar) {
                this.f60501a = hVar;
                this.f60502b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r20, dI.C17164e r21) {
                /*
                    r19 = this;
                    r0 = r19
                    r1 = r21
                    boolean r2 = r1 instanceof Ff.b.a.C0988a.C0989a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    Ff.b$a$a$a r2 = (Ff.b.a.C0988a.C0989a) r2
                    int r3 = r2.f60504d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f60504d = r3
                    goto L_0x001c
                L_0x0017:
                    Ff.b$a$a$a r2 = new Ff.b$a$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f60503c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f60504d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x0112
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f60501a
                    r4 = r20
                    Rl.e r4 = (Rl.e) r4
                    if (r4 == 0) goto L_0x0047
                    java.util.List r4 = r4.r()
                    if (r4 != 0) goto L_0x0109
                L_0x0047:
                    java.util.List r4 = YH.C16877v.n()
                    Ff.b r6 = r0.f60502b
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r7 = "Config was missing"
                    r13.<init>(r7)
                    qv.e r14 = qv.e.WARN
                    qv.d r7 = qv.d.f102012a
                    java.util.List r7 = r7.a()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L_0x0067:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L_0x007f
                    java.lang.Object r9 = r7.next()
                    r10 = r9
                    qv.b r10 = (qv.C11819b) r10
                    r11 = 0
                    boolean r10 = r10.b(r14, r11)
                    if (r10 == 0) goto L_0x0067
                    r8.add(r9)
                    goto L_0x0067
                L_0x007f:
                    java.util.Iterator r15 = r8.iterator()
                    r12 = 0
                    r7 = r12
                    r8 = r7
                L_0x0086:
                    boolean r9 = r15.hasNext()
                    if (r9 == 0) goto L_0x0109
                    java.lang.Object r9 = r15.next()
                    qv.b r9 = (qv.C11819b) r9
                    if (r7 != 0) goto L_0x00a0
                    java.lang.String r7 = qv.C11818a.a(r12, r13)
                    if (r7 != 0) goto L_0x009c
                    goto L_0x0109
                L_0x009c:
                    java.lang.String r7 = qv.C11820c.a(r7)
                L_0x00a0:
                    r16 = r7
                    if (r8 != 0) goto L_0x00f2
                    java.lang.Class r7 = r6.getClass()
                    java.lang.String r7 = r7.getName()
                    kotlin.jvm.internal.C17542s.g(r7)
                    r8 = 36
                    r10 = 2
                    java.lang.String r8 = HJ.C15854t.s1(r7, r8, r12, r10, r12)
                    r11 = 46
                    java.lang.String r8 = HJ.C15854t.o1(r8, r11, r12, r10, r12)
                    int r10 = r8.length()
                    if (r10 != 0) goto L_0x00c3
                    goto L_0x00c9
                L_0x00c3:
                    java.lang.String r7 = "Kt"
                    java.lang.String r7 = HJ.C15854t.P0(r8, r7)
                L_0x00c9:
                    java.lang.Thread r8 = java.lang.Thread.currentThread()
                    java.lang.String r8 = r8.getName()
                    java.lang.String r10 = "main"
                    boolean r8 = HJ.C15854t.b0(r8, r10, r5)
                    if (r8 == 0) goto L_0x00dc
                    java.lang.String r8 = "m"
                    goto L_0x00de
                L_0x00dc:
                    java.lang.String r8 = "b"
                L_0x00de:
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder
                    r10.<init>()
                    r10.append(r8)
                    java.lang.String r8 = "|"
                    r10.append(r8)
                    r10.append(r7)
                    java.lang.String r8 = r10.toString()
                L_0x00f2:
                    r17 = r8
                    r10 = 0
                    r7 = r9
                    r8 = r14
                    r9 = r17
                    r11 = r13
                    r18 = r12
                    r12 = r16
                    r7.a(r8, r9, r10, r11, r12)
                    r7 = r16
                    r8 = r17
                    r12 = r18
                    goto L_0x0086
                L_0x0109:
                    r2.f60504d = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L_0x0112
                    return r3
                L_0x0112:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: Ff.b.a.C0988a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, b bVar) {
            this.f60499a = gVar;
            this.f60500b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f60499a.collect(new C0988a(hVar, this.f60500b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(d dVar) {
        C17542s.j(dVar, "repository");
        this.f60498a = dVar;
    }

    public final C16532g<List<String>> a() {
        return new a(this.f60498a.d(), this);
    }
}
