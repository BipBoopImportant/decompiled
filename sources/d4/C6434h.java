package D4;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.v;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u0005R(\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0013"}, d2 = {"LD4/h;", "", "T", "initialValue", "<init>", "(Ljava/lang/Object;)V", "data", "LXH/N;", "b", "LTJ/B;", "LXH/v;", "", "a", "LTJ/B;", "state", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "flow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.h  reason: case insensitive filesystem */
public final class C6434h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<v<Integer, T>> f34347a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<T> f34348b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.h$a */
    public static final class a implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f34349a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.h$a$a  reason: collision with other inner class name */
        public static final class C0547a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f34350a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {225}, m = "emit")
            /* renamed from: D4.h$a$a$a  reason: collision with other inner class name */
            public static final class C0548a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f34351c;

                /* renamed from: d  reason: collision with root package name */
                int f34352d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0547a f34353e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0548a(C0547a aVar, C17164e eVar) {
                    super(eVar);
                    this.f34353e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34351c = obj;
                    this.f34352d |= Integer.MIN_VALUE;
                    return this.f34353e.emit((Object) null, this);
                }
            }

            public C0547a(C16533h hVar) {
                this.f34350a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof D4.C6434h.a.C0547a.C0548a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    D4.h$a$a$a r0 = (D4.C6434h.a.C0547a.C0548a) r0
                    int r1 = r0.f34352d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34352d = r1
                    goto L_0x0018
                L_0x0013:
                    D4.h$a$a$a r0 = new D4.h$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f34351c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34352d
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
                    TJ.h r6 = r4.f34350a
                    XH.v r5 = (XH.v) r5
                    java.lang.Object r5 = r5.d()
                    if (r5 == 0) goto L_0x0047
                    r0.f34352d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.C6434h.a.C0547a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f34349a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f34349a.collect(new C0547a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C6434h(T t10) {
        C16505B<v<Integer, T>> a10 = C16521S.a(new v(Integer.MIN_VALUE, t10));
        this.f34347a = a10;
        this.f34348b = new a(a10);
    }

    public final C16532g<T> a() {
        return this.f34348b;
    }

    public final void b(T t10) {
        C17542s.j(t10, "data");
        C16505B<v<Integer, T>> b10 = this.f34347a;
        b10.setValue(new v(Integer.valueOf(((Number) b10.getValue().c()).intValue() + 1), t10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6434h(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
