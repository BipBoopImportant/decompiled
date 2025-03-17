package D4;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"", "T", "R", "LD4/M;", "Lkotlin/Function2;", "LdI/e;", "transform", "a", "(LD4/M;LnI/p;)LD4/M;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class O {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C16532g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f34180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f34181b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.O$a$a  reason: collision with other inner class name */
        public static final class C0530a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f34182a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f34183b;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.paging.PagingDataTransforms$map$$inlined$transform$1$2", f = "PagingDataTransforms.kt", l = {225, 223}, m = "emit")
            /* renamed from: D4.O$a$a$a  reason: collision with other inner class name */
            public static final class C0531a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f34184c;

                /* renamed from: d  reason: collision with root package name */
                int f34185d;

                /* renamed from: e  reason: collision with root package name */
                Object f34186e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C0530a f34187f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0531a(C0530a aVar, C17164e eVar) {
                    super(eVar);
                    this.f34187f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34184c = obj;
                    this.f34185d |= Integer.MIN_VALUE;
                    return this.f34187f.emit((Object) null, this);
                }
            }

            public C0530a(C16533h hVar, p pVar) {
                this.f34182a = hVar;
                this.f34183b = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof D4.O.a.C0530a.C0531a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    D4.O$a$a$a r0 = (D4.O.a.C0530a.C0531a) r0
                    int r1 = r0.f34185d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34185d = r1
                    goto L_0x0018
                L_0x0013:
                    D4.O$a$a$a r0 = new D4.O$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f34184c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34185d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r8)
                    goto L_0x005f
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.f34186e
                    TJ.h r7 = (TJ.C16533h) r7
                    XH.y.b(r8)
                    goto L_0x0053
                L_0x003c:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f34182a
                    D4.E r7 = (D4.E) r7
                    nI.p r2 = r6.f34183b
                    r0.f34186e = r8
                    r0.f34185d = r4
                    java.lang.Object r7 = r7.a(r2, r0)
                    if (r7 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0053:
                    r2 = 0
                    r0.f34186e = r2
                    r0.f34185d = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.O.a.C0530a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, p pVar) {
            this.f34180a = gVar;
            this.f34181b = pVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f34180a.collect(new C0530a(hVar, this.f34181b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public static final /* synthetic */ M a(M m10, p pVar) {
        C17542s.j(m10, "<this>");
        C17542s.j(pVar, "transform");
        return new M(new a(m10.d(), pVar), m10.f(), m10.e(), (C17631a) null, 8, (DefaultConstructorMarker) null);
    }
}
