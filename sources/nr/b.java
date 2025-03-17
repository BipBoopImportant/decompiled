package Nr;

import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import com.sugarcube.app.base.external.shoppinglist.FetchShoppingListItemsUseCase;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LNr/b;", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "LjB/b;", "shoppingListRepository", "<init>", "(LjB/b;)V", "LTJ/g;", "", "", "invoke", "()LTJ/g;", "a", "LjB/b;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements FetchShoppingListItemsUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f84255a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f84256a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Nr.b$a$a  reason: collision with other inner class name */
        public static final class C1714a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f84257a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.geomagical.impl.sugarcube.usecase.FetchShoppingListItemsUseCaseImpl$invoke$$inlined$map$1$2", f = "FetchShoppingListItemsUseCaseImpl.kt", l = {50}, m = "emit")
            /* renamed from: Nr.b$a$a$a  reason: collision with other inner class name */
            public static final class C1715a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f84258c;

                /* renamed from: d  reason: collision with root package name */
                int f84259d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1714a f84260e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1715a(C1714a aVar, C17164e eVar) {
                    super(eVar);
                    this.f84260e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f84258c = obj;
                    this.f84259d |= Integer.MIN_VALUE;
                    return this.f84260e.emit((Object) null, this);
                }
            }

            public C1714a(C16533h hVar) {
                this.f84257a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Nr.b.a.C1714a.C1715a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Nr.b$a$a$a r0 = (Nr.b.a.C1714a.C1715a) r0
                    int r1 = r0.f84259d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f84259d = r1
                    goto L_0x0018
                L_0x0013:
                    Nr.b$a$a$a r0 = new Nr.b$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f84258c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f84259d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0062
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f84257a
                    java.util.Set r6 = (java.util.Set) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x0059
                    java.lang.Object r4 = r6.next()
                    java.lang.String r4 = (java.lang.String) r4
                    r2.add(r4)
                    goto L_0x0049
                L_0x0059:
                    r0.f84259d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Nr.b.a.C1714a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f84256a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f84256a.collect(new C1714a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(C14613b bVar) {
        C17542s.j(bVar, "shoppingListRepository");
        this.f84255a = bVar;
    }

    public C16532g<List<String>> invoke() {
        return new a(this.f84255a.f());
    }
}
