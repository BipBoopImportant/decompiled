package Ak;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import bI.C17035a;
import dI.C17164e;
import eI.C17187b;
import gB.C14505g;
import gB.k;
import jB.C14613b;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import vB.d;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LAk/b;", "LvB/d;", "LjB/b;", "shoppingListRepository", "<init>", "(LjB/b;)V", "LTJ/g;", "", "LgB/k;", "invoke", "()LTJ/g;", "a", "LjB/b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f78958a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends k>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f78959a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ak.b$a$a  reason: collision with other inner class name */
        public static final class C1455a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f78960a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.usecase.GetShoppingListsWithItemsSortedUseCaseImpl$invoke$$inlined$map$1$2", f = "GetShoppingListsWithItemsSortedUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Ak.b$a$a$a  reason: collision with other inner class name */
            public static final class C1456a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f78961c;

                /* renamed from: d  reason: collision with root package name */
                int f78962d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1455a f78963e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1456a(C1455a aVar, C17164e eVar) {
                    super(eVar);
                    this.f78963e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f78961c = obj;
                    this.f78962d |= Integer.MIN_VALUE;
                    return this.f78963e.emit((Object) null, this);
                }
            }

            public C1455a(C16533h hVar) {
                this.f78960a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Ak.b.a.C1455a.C1456a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Ak.b$a$a$a r0 = (Ak.b.a.C1455a.C1456a) r0
                    int r1 = r0.f78962d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f78962d = r1
                    goto L_0x0018
                L_0x0013:
                    Ak.b$a$a$a r0 = new Ak.b$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f78961c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f78962d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x0081
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f78960a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    Ak.b$b r2 = new Ak.b$b
                    r2.<init>()
                    java.util.List r8 = YH.C16877v.g1(r8, r2)
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r8, r4)
                    r2.<init>(r4)
                    java.util.Iterator r8 = r8.iterator()
                L_0x0054:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0078
                    java.lang.Object r4 = r8.next()
                    gB.k r4 = (gB.k) r4
                    java.util.List r5 = r4.c()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    Ak.b$c r6 = new Ak.b$c
                    r6.<init>()
                    java.util.List r5 = YH.C16877v.g1(r5, r6)
                    r6 = 0
                    gB.k r4 = gB.k.b(r4, r6, r5, r3, r6)
                    r2.add(r4)
                    goto L_0x0054
                L_0x0078:
                    r0.f78962d = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x0081
                    return r1
                L_0x0081:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Ak.b.a.C1455a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f78959a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f78959a.collect(new C1455a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ak.b$b  reason: collision with other inner class name */
    public static final class C1457b<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((k) t11).d().c(), ((k) t10).d().c());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(((C14505g) t11).i(), ((C14505g) t10).i());
        }
    }

    public b(C14613b bVar) {
        C17542s.j(bVar, "shoppingListRepository");
        this.f78958a = bVar;
    }

    public C16532g<List<k>> invoke() {
        return C16534i.s(new a(C16534i.s(this.f78958a.g())));
    }
}
