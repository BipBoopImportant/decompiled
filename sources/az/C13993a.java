package az;

import Ry.g;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import Yy.i;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.D;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Laz/a;", "LRy/g;", "LYy/i;", "couponsSource", "<init>", "(LYy/i;)V", "LTJ/g;", "", "Lrz/D;", "a", "()LTJ/g;", "LYy/i;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: az.a  reason: case insensitive filesystem */
public final class C13993a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final i f118802a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: az.a$a  reason: collision with other inner class name */
    public static final class C2960a implements C16532g<List<? extends D>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118803a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: az.a$a$a  reason: collision with other inner class name */
        public static final class C2961a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118804a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.ScanAndGoCouponsRepositoryImpl$getAllCoupons$$inlined$map$1$2", f = "ScanAndGoCouponsRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: az.a$a$a$a  reason: collision with other inner class name */
            public static final class C2962a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118805c;

                /* renamed from: d  reason: collision with root package name */
                int f118806d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2961a f118807e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2962a(C2961a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118807e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118805c = obj;
                    this.f118806d |= Integer.MIN_VALUE;
                    return this.f118807e.emit((Object) null, this);
                }
            }

            public C2961a(C16533h hVar) {
                this.f118804a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof az.C13993a.C2960a.C2961a.C2962a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    az.a$a$a$a r0 = (az.C13993a.C2960a.C2961a.C2962a) r0
                    int r1 = r0.f118806d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118806d = r1
                    goto L_0x0018
                L_0x0013:
                    az.a$a$a$a r0 = new az.a$a$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f118805c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118806d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r10)
                    goto L_0x0080
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    XH.y.b(r10)
                    TJ.h r10 = r8.f118804a
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r9, r4)
                    r2.<init>(r4)
                    java.util.Iterator r9 = r9.iterator()
                L_0x0049:
                    boolean r4 = r9.hasNext()
                    if (r4 == 0) goto L_0x0077
                    java.lang.Object r4 = r9.next()
                    gz.d r4 = (gz.d) r4
                    java.lang.String r5 = r4.a()
                    boolean r6 = r4.c()
                    gz.g r4 = r4.b()
                    if (r4 == 0) goto L_0x006d
                    rz.W r7 = new rz.W
                    rz.X r4 = r4.a()
                    r7.<init>(r4)
                    goto L_0x006e
                L_0x006d:
                    r7 = 0
                L_0x006e:
                    rz.D r4 = new rz.D
                    r4.<init>(r5, r6, r7)
                    r2.add(r4)
                    goto L_0x0049
                L_0x0077:
                    r0.f118806d = r3
                    java.lang.Object r9 = r10.emit(r2, r0)
                    if (r9 != r1) goto L_0x0080
                    return r1
                L_0x0080:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: az.C13993a.C2960a.C2961a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2960a(C16532g gVar) {
            this.f118803a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118803a.collect(new C2961a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13993a(i iVar) {
        C17542s.j(iVar, "couponsSource");
        this.f118802a = iVar;
    }

    public C16532g<List<D>> a() {
        return new C2960a(this.f118802a.a());
    }
}
