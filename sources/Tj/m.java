package Tj;

import Ry.f;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tj.l;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import nI.p;
import rz.C15014g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LTj/m;", "LTj/l;", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LRy/f;)V", "LTj/l$a;", "previousState", "", "Lrz/g;", "items", "b", "(LTj/l$a;Ljava/util/List;)LTj/l$a;", "", "", "c", "(Ljava/util/Collection;)I", "LTJ/g;", "invoke", "()LTJ/g;", "a", "LRy/f;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements l {

    /* renamed from: a  reason: collision with root package name */
    private final f f87625a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<l.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f87626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f87627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O f87628c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tj.m$a$a  reason: collision with other inner class name */
        public static final class C1826a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f87629a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m f87630b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O f87631c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.GetCartQuantityUpdateFlowUseCaseImpl$invoke$$inlined$map$1$2", f = "GetCartQuantityUpdateFlowUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Tj.m$a$a$a  reason: collision with other inner class name */
            public static final class C1827a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f87632c;

                /* renamed from: d  reason: collision with root package name */
                int f87633d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1826a f87634e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1827a(C1826a aVar, C17164e eVar) {
                    super(eVar);
                    this.f87634e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f87632c = obj;
                    this.f87633d |= Integer.MIN_VALUE;
                    return this.f87634e.emit((Object) null, this);
                }
            }

            public C1826a(C16533h hVar, m mVar, O o10) {
                this.f87629a = hVar;
                this.f87630b = mVar;
                this.f87631c = o10;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Tj.m.a.C1826a.C1827a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Tj.m$a$a$a r0 = (Tj.m.a.C1826a.C1827a) r0
                    int r1 = r0.f87633d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f87633d = r1
                    goto L_0x0018
                L_0x0013:
                    Tj.m$a$a$a r0 = new Tj.m$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f87632c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f87633d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f87629a
                    java.util.List r6 = (java.util.List) r6
                    Tj.m r2 = r5.f87630b
                    kotlin.jvm.internal.O r4 = r5.f87631c
                    T r4 = r4.f144348a
                    Tj.l$a r4 = (Tj.l.a) r4
                    Tj.l$a r6 = r2.b(r4, r6)
                    r0.f87633d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Tj.m.a.C1826a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, m mVar, O o10) {
            this.f87626a = gVar;
            this.f87627b = mVar;
            this.f87628c = o10;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f87626a.collect(new C1826a(hVar, this.f87627b, this.f87628c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTj/l$a;", "it", "LXH/N;", "<anonymous>", "(LTj/l$a;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.GetCartQuantityUpdateFlowUseCaseImpl$invoke$2", f = "GetCartQuantityUpdateFlowUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<l.a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f87635c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f87636d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<l.a> f87637e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(O<l.a> o10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f87637e = o10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f87637e, eVar);
            bVar.f87636d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(l.a aVar, C17164e<? super C16807N> eVar) {
            return ((b) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f87635c == 0) {
                y.b(obj);
                this.f87637e.f144348a = (l.a) this.f87636d;
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final c f87638b = new c();

        c() {
            super(l.a.class, "totalQuantity", "getTotalQuantity()I", 0);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((l.a) obj).b());
        }
    }

    public m(f fVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f87625a = fVar;
    }

    /* access modifiers changed from: private */
    public final l.a b(l.a aVar, List<C15014g> list) {
        int c10 = c(list);
        int size = list.size();
        return aVar == null ? new l.a.C1825a(c10, size) : c10 == aVar.b() ? aVar : size > aVar.a() ? new l.a.b(c10, size) : size < aVar.a() ? new l.a.c(c10, size) : new l.a.d(c10, size);
    }

    private final int c(Collection<C15014g> collection) {
        int i10 = 0;
        for (C15014g h10 : collection) {
            i10 += h10.h().c();
        }
        return i10;
    }

    public C16532g<l.a> invoke() {
        O o10 = new O();
        return C16534i.t(C16534i.R(new a(this.f87625a.invoke().i(), this, o10), new b(o10, (C17164e<? super b>) null)), c.f87638b);
    }
}
