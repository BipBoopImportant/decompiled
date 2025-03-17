package pk;

import Ae.k;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import gB.C14505g;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pk.s;
import qk.h;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001a"}, d2 = {"Lpk/b;", "", "LjB/b;", "shoppingListRepository", "Lqk/h;", "removeItemFromListUseCase", "<init>", "(LjB/b;Lqk/h;)V", "Lpk/b$a;", "params", "Lpk/s$i;", "c", "(Lpk/b$a;LdI/e;)Ljava/lang/Object;", "", "listId", "itemNo", "LXH/N;", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "LjB/b;", "b", "Lqk/h;", "LgB/g;", "LgB/g;", "removedProduct", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.b  reason: case insensitive filesystem */
public final class C11723b {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f100877a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f100878b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C14505g f100879c;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpk/b$a;", "", "", "listId", "itemNo", "LAe/k;", "actionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;LAe/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LAe/k;", "()LAe/k;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.b$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f100880a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100881b;

        /* renamed from: c  reason: collision with root package name */
        private final k f100882c;

        public a(String str, String str2, k kVar) {
            C17542s.j(str, "listId");
            C17542s.j(str2, "itemNo");
            C17542s.j(kVar, "actionType");
            this.f100880a = str;
            this.f100881b = str2;
            this.f100882c = kVar;
        }

        public final k a() {
            return this.f100882c;
        }

        public final String b() {
            return this.f100881b;
        }

        public final String c() {
            return this.f100880a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f100880a, aVar.f100880a) && C17542s.e(this.f100881b, aVar.f100881b) && this.f100882c == aVar.f100882c;
        }

        public int hashCode() {
            return (((this.f100880a.hashCode() * 31) + this.f100881b.hashCode()) * 31) + this.f100882c.hashCode();
        }

        public String toString() {
            String str = this.f100880a;
            String str2 = this.f100881b;
            k kVar = this.f100882c;
            return "RemoveProductParams(listId=" + str + ", itemNo=" + str2 + ", actionType=" + kVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.b$b  reason: collision with other inner class name */
    public static final class C2370b implements C16532g<s.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11723b f100884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f100885c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pk.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100886a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11723b f100887b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f100888c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.RemoveProductHelper$removeProduct$$inlined$map$1$2", f = "RemoveProductHelper.kt", l = {50}, m = "emit")
            /* renamed from: pk.b$b$a$a  reason: collision with other inner class name */
            public static final class C2371a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100889c;

                /* renamed from: d  reason: collision with root package name */
                int f100890d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f100891e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2371a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100891e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100889c = obj;
                    this.f100890d |= Integer.MIN_VALUE;
                    return this.f100891e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11723b bVar, a aVar) {
                this.f100886a = hVar;
                this.f100887b = bVar;
                this.f100888c = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof pk.C11723b.C2370b.a.C2371a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    pk.b$b$a$a r0 = (pk.C11723b.C2370b.a.C2371a) r0
                    int r1 = r0.f100890d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100890d = r1
                    goto L_0x0018
                L_0x0013:
                    pk.b$b$a$a r0 = new pk.b$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f100889c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100890d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x005c
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f100886a
                    gB.g r7 = (gB.C14505g) r7
                    pk.b r2 = r6.f100887b
                    qk.h r2 = r2.f100878b
                    pk.b$a r4 = r6.f100888c
                    java.lang.String r4 = r4.c()
                    pk.b$a r5 = r6.f100888c
                    Ae.k r5 = r5.a()
                    pk.s$i r2 = r2.a(r4, r7, r5)
                    pk.b r4 = r6.f100887b
                    r4.f100879c = r7
                    r0.f100890d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x005c
                    return r1
                L_0x005c:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: pk.C11723b.C2370b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2370b(C16532g gVar, C11723b bVar, a aVar) {
            this.f100883a = gVar;
            this.f100884b = bVar;
            this.f100885c = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100883a.collect(new a(hVar, this.f100884b, this.f100885c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11723b(C14613b bVar, h hVar) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(hVar, "removeItemFromListUseCase");
        this.f100877a = bVar;
        this.f100878b = hVar;
    }

    public final Object c(a aVar, C17164e<? super s.i> eVar) {
        return C16534i.B(new C2370b(C16534i.e0(this.f100877a.b(aVar.c(), aVar.b()), 1), this, aVar), eVar);
    }

    public final void d(String str, String str2) {
        C17542s.j(str, "listId");
        C17542s.j(str2, "itemNo");
        C14505g gVar = this.f100879c;
        if (gVar != null) {
            if (!C17542s.e(gVar.d(), str) || !C17542s.e(gVar.b(), str2)) {
                gVar = null;
            }
            if (gVar != null) {
                this.f100877a.j(str, C16877v.e(new C14613b.C3151b(gVar.b(), gVar.g())), Interaction$Component.SHOPPING_LIST_DETAILS, (k) null);
            }
        }
    }
}
