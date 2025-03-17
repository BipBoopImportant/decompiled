package Ny;

import By.C12666e;
import Dw.C12792a;
import GJ.C15768k;
import Jy.j;
import My.e;
import My.i;
import Ry.f;
import Ry.g;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import UJ.C16619l;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;
import nI.C17631a;
import nI.q;
import rz.C15014g;
import rz.C15031y;
import rz.D;
import rz.E;
import rz.r;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u00013BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00140\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0002¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u001aH\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001aH\u0002¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001aH\u0002¢\u0006\u0004\b%\u0010\u001cJ\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u001aH\u0002¢\u0006\u0004\b'\u0010\u001cJ5\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001a2\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001a¢\u0006\u0004\b,\u0010-J\u0015\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010=R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020.0?8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010@¨\u0006B"}, d2 = {"LNy/d;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LRy/d;", "discountRepository", "LRy/g;", "couponsRepository", "Lsz/b;", "coWorkerDiscountRepository", "Lsz/d;", "totalPricingRepository", "LTy/b;", "estimatedWaitingTimeRepository", "LBy/e;", "cartListProductListBuilder", "LDw/b;", "ongoingInStoreOrderOrderRepository", "<init>", "(LRy/f;LRy/d;LRy/g;Lsz/b;Lsz/d;LTy/b;LBy/e;LDw/b;)V", "", "Lrz/g;", "cartItems", "LMy/e;", "e", "(Ljava/util/List;)LMy/e;", "LTJ/g;", "g", "()LTJ/g;", "Lrz/r;", "j", "", "m", "Lrz/E;", "i", "", "h", "k", "LDw/a;", "l", "LMy/i;", "settings", "itemsUpdateQuantity", "LMy/c;", "d", "(LTJ/g;LTJ/g;)LTJ/g;", "LJy/j$a;", "sortBy", "LXH/N;", "n", "(LJy/j$a;)V", "a", "LRy/f;", "b", "LRy/d;", "c", "LRy/g;", "Lsz/b;", "Lsz/d;", "f", "LTy/b;", "LBy/e;", "LDw/b;", "LTJ/B;", "LTJ/B;", "sortBySelected", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final f f112511a;

    /* renamed from: b  reason: collision with root package name */
    private final Ry.d f112512b;

    /* renamed from: c  reason: collision with root package name */
    private final g f112513c;

    /* renamed from: d  reason: collision with root package name */
    private final sz.b f112514d;

    /* renamed from: e  reason: collision with root package name */
    private final sz.d f112515e;

    /* renamed from: f  reason: collision with root package name */
    private final Ty.b f112516f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C12666e f112517g;

    /* renamed from: h  reason: collision with root package name */
    private final Dw.b f112518h;

    /* renamed from: i  reason: collision with root package name */
    private final C16505B<j.a> f112519i = C16521S.a(j.a.RECENTLY_ADDED);

    @C17604b
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u0001\u0004\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"LNy/d$a;", "", "", "Lrz/D;", "coupons", "a", "(Ljava/util/List;)Ljava/util/List;", "", "b", "(Ljava/util/List;)I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public static List<? extends D> a(List<D> list) {
            C17542s.j(list, "coupons");
            return list;
        }

        public static final int b(List<? extends D> list) {
            Iterable<D> iterable = list;
            int i10 = 0;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (D d10 : iterable) {
                    if (d10.c() && d10.b() == null && (i10 = i10 + 1) < 0) {
                        C16877v.w();
                    }
                }
            }
            return i10;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<My.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f112520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f112521b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f112522c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f112522c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f112522c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.CartContentOrchestrator$asStateFlow$$inlined$combine$1$3", f = "CartContentOrchestrator.kt", l = {238}, m = "invokeSuspend")
        /* renamed from: Ny.d$b$b  reason: collision with other inner class name */
        public static final class C2768b extends l implements q<C16533h<? super My.c>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f112523c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f112524d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f112525e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ d f112526f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2768b(C17164e eVar, d dVar) {
                super(3, eVar);
                this.f112526f = dVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super My.c> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                C2768b bVar = new C2768b(eVar, this.f112526f);
                bVar.f112524d = hVar;
                bVar.f112525e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f112523c;
                if (i10 == 0) {
                    y.b(obj);
                    Object[] objArr = (Object[]) this.f112525e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    Object obj7 = objArr[5];
                    Object obj8 = objArr[6];
                    Object obj9 = objArr[7];
                    boolean booleanValue = ((Boolean) obj9).booleanValue();
                    int intValue = ((Number) obj7).intValue();
                    List list = (List) obj5;
                    List list2 = (List) obj4;
                    i iVar = (i) obj3;
                    j.a aVar = (j.a) obj2;
                    C12666e c10 = this.f112526f.f112517g;
                    List list3 = list2;
                    My.c cVar = new My.c((j.a) null, this.f112526f.e(list2), list2, c10.i(aVar, iVar, list3, list, intValue, (Integer) objArr[8], (E) obj8, booleanValue, (List) obj6, (C12792a) objArr[9]), 1, (DefaultConstructorMarker) null);
                    this.f112523c = 1;
                    if (((C16533h) this.f112524d).emit(cVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        public b(C16532g[] gVarArr, d dVar) {
            this.f112520a = gVarArr;
            this.f112521b = dVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f112520a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new C2768b((C17164e) null, this.f112521b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112527a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112528a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.CartContentOrchestrator$getEstimatedWaitingTime$$inlined$map$1$2", f = "CartContentOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: Ny.d$c$a$a  reason: collision with other inner class name */
            public static final class C2769a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112529c;

                /* renamed from: d  reason: collision with root package name */
                int f112530d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f112531e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2769a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112531e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112529c = obj;
                    this.f112530d |= Integer.MIN_VALUE;
                    return this.f112531e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f112528a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ny.d.c.a.C2769a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ny.d$c$a$a r0 = (Ny.d.c.a.C2769a) r0
                    int r1 = r0.f112530d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112530d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.d$c$a$a r0 = new Ny.d$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f112529c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112530d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f112528a
                    Ty.c r5 = (Ty.c) r5
                    if (r5 == 0) goto L_0x0043
                    int r5 = r5.b()
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                    goto L_0x0044
                L_0x0043:
                    r5 = 0
                L_0x0044:
                    r0.f112530d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.d.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f112527a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112527a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ny.d$d  reason: collision with other inner class name */
    public static final class C2770d implements C16532g<C12792a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112532a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ny.d$d$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112533a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.CartContentOrchestrator$getMostRecentOnGoingOrder$$inlined$map$1$2", f = "CartContentOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: Ny.d$d$a$a  reason: collision with other inner class name */
            public static final class C2771a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112534c;

                /* renamed from: d  reason: collision with root package name */
                int f112535d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f112536e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2771a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112536e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112534c = obj;
                    this.f112535d |= Integer.MIN_VALUE;
                    return this.f112536e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f112533a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof Ny.d.C2770d.a.C2771a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    Ny.d$d$a$a r0 = (Ny.d.C2770d.a.C2771a) r0
                    int r1 = r0.f112535d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112535d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.d$d$a$a r0 = new Ny.d$d$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f112534c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112535d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r12)
                    goto L_0x007a
                L_0x0029:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0031:
                    XH.y.b(r12)
                    TJ.h r12 = r10.f112533a
                    java.util.List r11 = (java.util.List) r11
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.Iterator r11 = r11.iterator()
                    boolean r2 = r11.hasNext()
                    if (r2 != 0) goto L_0x0046
                    r11 = 0
                    goto L_0x0071
                L_0x0046:
                    java.lang.Object r2 = r11.next()
                    boolean r4 = r11.hasNext()
                    if (r4 != 0) goto L_0x0052
                L_0x0050:
                    r11 = r2
                    goto L_0x0071
                L_0x0052:
                    r4 = r2
                    Dw.a r4 = (Dw.C12792a) r4
                    long r4 = r4.f()
                L_0x0059:
                    java.lang.Object r6 = r11.next()
                    r7 = r6
                    Dw.a r7 = (Dw.C12792a) r7
                    long r7 = r7.f()
                    int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                    if (r9 >= 0) goto L_0x006a
                    r2 = r6
                    r4 = r7
                L_0x006a:
                    boolean r6 = r11.hasNext()
                    if (r6 != 0) goto L_0x0059
                    goto L_0x0050
                L_0x0071:
                    r0.f112535d = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L_0x007a
                    return r1
                L_0x007a:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.d.C2770d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2770d(C16532g gVar) {
            this.f112532a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112532a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112537a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112538a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.CartContentOrchestrator$getNumberOfCoupons$$inlined$map$1$2", f = "CartContentOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: Ny.d$e$a$a  reason: collision with other inner class name */
            public static final class C2772a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112539c;

                /* renamed from: d  reason: collision with root package name */
                int f112540d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f112541e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2772a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112541e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112539c = obj;
                    this.f112540d |= Integer.MIN_VALUE;
                    return this.f112541e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f112538a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ny.d.e.a.C2772a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ny.d$e$a$a r0 = (Ny.d.e.a.C2772a) r0
                    int r1 = r0.f112540d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112540d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.d$e$a$a r0 = new Ny.d$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f112539c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112540d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f112538a
                    java.util.List r5 = (java.util.List) r5
                    java.util.List r5 = Ny.d.a.a(r5)
                    int r5 = Ny.d.a.b(r5)
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.b.e(r5)
                    r0.f112540d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.d.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f112537a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112537a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public d(f fVar, Ry.d dVar, g gVar, sz.b bVar, sz.d dVar2, Ty.b bVar2, C12666e eVar, Dw.b bVar3) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(dVar, "discountRepository");
        C17542s.j(gVar, "couponsRepository");
        C17542s.j(bVar, "coWorkerDiscountRepository");
        C17542s.j(dVar2, "totalPricingRepository");
        C17542s.j(bVar2, "estimatedWaitingTimeRepository");
        C17542s.j(eVar, "cartListProductListBuilder");
        C17542s.j(bVar3, "ongoingInStoreOrderOrderRepository");
        this.f112511a = fVar;
        this.f112512b = dVar;
        this.f112513c = gVar;
        this.f112514d = bVar;
        this.f112515e = dVar2;
        this.f112516f = bVar2;
        this.f112517g = eVar;
        this.f112518h = bVar3;
    }

    /* access modifiers changed from: private */
    public final My.e e(List<C15014g> list) {
        List a02 = C15768k.a0(C15768k.H(C16877v.h0(list), new c()));
        if (!a02.isEmpty()) {
            Iterable<C15014g> iterable = a02;
            boolean z10 = iterable instanceof Collection;
            if (!z10 || !((Collection) iterable).isEmpty()) {
                for (C15014g j10 : iterable) {
                    if (j10.j()) {
                    }
                }
            }
            int i10 = 0;
            if (!z10 || !((Collection) iterable).isEmpty()) {
                for (C15014g b10 : iterable) {
                    if (!b10.b() && (i10 = i10 + 1) < 0) {
                        C16877v.w();
                    }
                }
            }
            return i10 > 0 ? new e.a.b(i10) : e.a.C2757a.f112111f;
        }
        return e.b.f112113a;
    }

    /* access modifiers changed from: private */
    public static final boolean f(C15014g gVar) {
        C17542s.j(gVar, "it");
        return gVar.i() == C15031y.CASH_AND_CARRY || gVar.i() == C15031y.SELF_SERVE;
    }

    private final C16532g<List<C15014g>> g() {
        return this.f112511a.invoke().i();
    }

    private final C16532g<Boolean> h() {
        return this.f112514d.a();
    }

    private final C16532g<E> i() {
        return this.f112515e.a();
    }

    private final C16532g<List<r>> j() {
        return this.f112512b.a();
    }

    private final C16532g<Integer> k() {
        return new c(this.f112516f.a());
    }

    private final C16532g<C12792a> l() {
        return new C2770d(this.f112518h.d());
    }

    private final C16532g<Integer> m() {
        return new e(this.f112513c.a());
    }

    public final C16532g<My.c> d(C16532g<i> gVar, C16532g<? extends List<C15014g>> gVar2) {
        C17542s.j(gVar, "settings");
        C17542s.j(gVar2, "itemsUpdateQuantity");
        return new b(new C16532g[]{this.f112519i, gVar, g(), gVar2, j(), m(), i(), h(), k(), l()}, this);
    }

    public final void n(j.a aVar) {
        C17542s.j(aVar, "sortBy");
        this.f112519i.setValue(aVar);
    }
}
