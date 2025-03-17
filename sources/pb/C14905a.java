package pB;

import KJ.C15985a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import gB.k;
import jB.C14613b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0003#!\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"LpB/a;", "", "LaA/a;", "sessionManager", "LvB/d;", "getShoppingListsUseCase", "LjB/b;", "shoppingListRepository", "<init>", "(LaA/a;LvB/d;LjB/b;)V", "LpB/a$b;", "previousStatus", "", "loggedIn", "k", "(LpB/a$b;Z)LpB/a$b;", "loggedInState", "LTJ/g;", "LpB/a$c;", "i", "(LpB/a$b;)LTJ/g;", "LpB/a$a;", "previousFetchListStatus", "isFetching", "h", "(LpB/a$a;Z)LpB/a$a;", "status", "g", "(LpB/a$a;)LTJ/g;", "e", "()LTJ/g;", "a", "LaA/a;", "b", "LvB/d;", "c", "LjB/b;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pB.a  reason: case insensitive filesystem */
public final class C14905a {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f130178a;

    /* renamed from: b  reason: collision with root package name */
    private final vB.d f130179b;

    /* renamed from: c  reason: collision with root package name */
    private final C14613b f130180c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LpB/a$a;", "", "b", "a", "LpB/a$a$a;", "LpB/a$a$b;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$a  reason: collision with other inner class name */
    private interface C3207a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LpB/a$a$a;", "LpB/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$a$a  reason: collision with other inner class name */
        public static final class C3208a implements C3207a {

            /* renamed from: a  reason: collision with root package name */
            public static final C3208a f130181a = new C3208a();

            private C3208a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3208a);
            }

            public int hashCode() {
                return -782251118;
            }

            public String toString() {
                return "Done";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LpB/a$a$b;", "LpB/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$a$b */
        public static final class b implements C3207a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f130182a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 128024312;
            }

            public String toString() {
                return "Fetching";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LpB/a$b;", "", "c", "a", "b", "LpB/a$b$a;", "LpB/a$b$b;", "LpB/a$b$c;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$b */
    private interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LpB/a$b$a;", "LpB/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$b$a  reason: collision with other inner class name */
        public static final class C3209a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3209a f130183a = new C3209a();

            private C3209a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3209a);
            }

            public int hashCode() {
                return 805684886;
            }

            public String toString() {
                return "LoggedIn";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LpB/a$b$b;", "LpB/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$b$b  reason: collision with other inner class name */
        public static final class C3210b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C3210b f130184a = new C3210b();

            private C3210b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3210b);
            }

            public int hashCode() {
                return -789552523;
            }

            public String toString() {
                return "LoggingIn";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LpB/a$b$c;", "LpB/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$b$c */
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f130185a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1147468683;
            }

            public String toString() {
                return "NotLoggedIn";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.GetShoppingListAndLoggedInUseCase$invoke$$inlined$flatMapLatest$1", f = "GetShoppingListAndLoggedInUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: pB.a$d */
    public static final class d extends l implements q<C16533h<? super c>, b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130190c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f130191d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f130192e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14905a f130193f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, C14905a aVar) {
            super(3, eVar);
            this.f130193f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super c> hVar, b bVar, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f130193f);
            dVar.f130191d = hVar;
            dVar.f130192e = bVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130190c;
            if (i10 == 0) {
                y.b(obj);
                C16532g c10 = this.f130193f.i((b) this.f130192e);
                this.f130190c = 1;
                if (C16534i.x((C16533h) this.f130191d, c10, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$e */
    /* synthetic */ class e extends C17525a implements q<b, Boolean, C17164e<? super b>, Object> {
        e(Object obj) {
            super(3, obj, C14905a.class, "mapScannedLogInFlow", "mapScannedLogInFlow(Lcom/ingka/ikea/shoppinglist/listpicker/impl/presentation/GetShoppingListAndLoggedInUseCase$LoggedInStatus;Z)Lcom/ingka/ikea/shoppinglist/listpicker/impl/presentation/GetShoppingListAndLoggedInUseCase$LoggedInStatus;", 4);
        }

        public final Object a(b bVar, boolean z10, C17164e<? super b> eVar) {
            return ((C14905a) this.f144363a).k(bVar, z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((b) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$f */
    public static final class f implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f130194a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$f$a  reason: collision with other inner class name */
        public static final class C3211a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f130195a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.GetShoppingListAndLoggedInUseCase$mapFetchingListStatus$$inlined$map$1$2", f = "GetShoppingListAndLoggedInUseCase.kt", l = {50}, m = "emit")
            /* renamed from: pB.a$f$a$a  reason: collision with other inner class name */
            public static final class C3212a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f130196c;

                /* renamed from: d  reason: collision with root package name */
                int f130197d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3211a f130198e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3212a(C3211a aVar, C17164e eVar) {
                    super(eVar);
                    this.f130198e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f130196c = obj;
                    this.f130197d |= Integer.MIN_VALUE;
                    return this.f130198e.emit((Object) null, this);
                }
            }

            public C3211a(C16533h hVar) {
                this.f130195a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof pB.C14905a.f.C3211a.C3212a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    pB.a$f$a$a r0 = (pB.C14905a.f.C3211a.C3212a) r0
                    int r1 = r0.f130197d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f130197d = r1
                    goto L_0x0018
                L_0x0013:
                    pB.a$f$a$a r0 = new pB.a$f$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f130196c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f130197d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f130195a
                    java.util.List r7 = (java.util.List) r7
                    pB.a$c r2 = new pB.a$c
                    boolean r4 = r7.isEmpty()
                    r5 = 0
                    r2.<init>(r7, r5, r3, r4)
                    r0.f130197d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: pB.C14905a.f.C3211a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f130194a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f130194a.collect(new C3211a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.GetShoppingListAndLoggedInUseCase$mapLoggedInState$$inlined$flatMapLatest$1", f = "GetShoppingListAndLoggedInUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: pB.a$g */
    public static final class g extends l implements q<C16533h<? super c>, C3207a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f130199c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f130200d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f130201e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14905a f130202f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17164e eVar, C14905a aVar) {
            super(3, eVar);
            this.f130202f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super c> hVar, C3207a aVar, C17164e<? super C16807N> eVar) {
            g gVar = new g(eVar, this.f130202f);
            gVar.f130200d = hVar;
            gVar.f130201e = aVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f130199c;
            if (i10 == 0) {
                y.b(obj);
                C16532g b10 = this.f130202f.g((C3207a) this.f130201e);
                this.f130199c = 1;
                if (C16534i.x((C16533h) this.f130200d, b10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$h */
    public static final class h implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f130203a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pB.a$h$a  reason: collision with other inner class name */
        public static final class C3213a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f130204a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.listpicker.impl.presentation.GetShoppingListAndLoggedInUseCase$mapLoggedInState$$inlined$map$1$2", f = "GetShoppingListAndLoggedInUseCase.kt", l = {50}, m = "emit")
            /* renamed from: pB.a$h$a$a  reason: collision with other inner class name */
            public static final class C3214a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f130205c;

                /* renamed from: d  reason: collision with root package name */
                int f130206d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3213a f130207e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3214a(C3213a aVar, C17164e eVar) {
                    super(eVar);
                    this.f130207e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f130205c = obj;
                    this.f130206d |= Integer.MIN_VALUE;
                    return this.f130207e.emit((Object) null, this);
                }
            }

            public C3213a(C16533h hVar) {
                this.f130204a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, dI.C17164e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof pB.C14905a.h.C3213a.C3214a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    pB.a$h$a$a r0 = (pB.C14905a.h.C3213a.C3214a) r0
                    int r1 = r0.f130206d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f130206d = r1
                    goto L_0x0018
                L_0x0013:
                    pB.a$h$a$a r0 = new pB.a$h$a$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f130205c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f130206d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r13)
                    goto L_0x0050
                L_0x0029:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0031:
                    XH.y.b(r13)
                    TJ.h r13 = r11.f130204a
                    r5 = r12
                    java.util.List r5 = (java.util.List) r5
                    pB.a$c r12 = new pB.a$c
                    boolean r8 = r5.isEmpty()
                    r9 = 2
                    r10 = 0
                    r6 = 0
                    r7 = 1
                    r4 = r12
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r0.f130206d = r3
                    java.lang.Object r12 = r13.emit(r12, r0)
                    if (r12 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: pB.C14905a.h.C3213a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f130203a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f130203a.collect(new C3213a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$i */
    /* synthetic */ class i extends C17525a implements q<C3207a, Boolean, C17164e<? super C3207a>, Object> {
        i(Object obj) {
            super(3, obj, C14905a.class, "mapIsFetchingListFlow", "mapIsFetchingListFlow(Lcom/ingka/ikea/shoppinglist/listpicker/impl/presentation/GetShoppingListAndLoggedInUseCase$FetchingListStatus;Z)Lcom/ingka/ikea/shoppinglist/listpicker/impl/presentation/GetShoppingListAndLoggedInUseCase$FetchingListStatus;", 4);
        }

        public final Object a(C3207a aVar, boolean z10, C17164e<? super C3207a> eVar) {
            return ((C14905a) this.f144363a).h(aVar, z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((C3207a) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }
    }

    public C14905a(C13909a aVar, vB.d dVar, C14613b bVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(dVar, "getShoppingListsUseCase");
        C17542s.j(bVar, "shoppingListRepository");
        this.f130178a = aVar;
        this.f130179b = dVar;
        this.f130180c = bVar;
    }

    /* access modifiers changed from: private */
    public final C16532g<c> g(C3207a aVar) {
        if (C17542s.e(aVar, C3207a.C3208a.f130181a)) {
            return new f(this.f130179b.invoke());
        }
        if (C17542s.e(aVar, C3207a.b.f130182a)) {
            return C16534i.J(new c(C15985a.a(), true, true, false, 8, (DefaultConstructorMarker) null));
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final C3207a h(C3207a aVar, boolean z10) {
        return (aVar != null || z10) ? z10 ? C3207a.b.f130182a : (!(aVar instanceof C3207a.b) || z10) ? C3207a.C3208a.f130181a : C3207a.C3208a.f130181a : C3207a.b.f130182a;
    }

    /* access modifiers changed from: private */
    public final C16532g<c> i(b bVar) {
        if (C17542s.e(bVar, b.C3209a.f130183a)) {
            return new h(this.f130179b.invoke());
        }
        if (C17542s.e(bVar, b.C3210b.f130184a)) {
            return C16534i.g0(C16534i.A(C16534i.Y(this.f130180c.p(), null, new i(this))), new g((C17164e) null, this));
        }
        if (C17542s.e(bVar, b.c.f130185a)) {
            return C16534i.J(new c(C15985a.a(), false, false, false, 10, (DefaultConstructorMarker) null));
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final b k(b bVar, boolean z10) {
        return (bVar != null || !z10) ? (!(bVar instanceof b.c) || !z10) ? b.c.f130185a : b.C3210b.f130184a : b.C3209a.f130183a;
    }

    public final C16532g<c> e() {
        return C16534i.g0(C16534i.A(C16534i.Y(this.f130178a.n(), null, new e(this))), new d((C17164e) null, this));
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"LpB/a$c;", "", "", "LgB/k;", "shoppingList", "", "syncingShoppingLists", "isLoggedIn", "displayCreateListFromEmptyList", "<init>", "(Ljava/util/List;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "c", "()Z", "d", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pB.a$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final List<k> f130186a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f130187b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f130188c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f130189d;

        public c(List<k> list, boolean z10, boolean z11, boolean z12) {
            C17542s.j(list, "shoppingList");
            this.f130186a = list;
            this.f130187b = z10;
            this.f130188c = z11;
            this.f130189d = z12;
        }

        public final boolean a() {
            return this.f130189d;
        }

        public final List<k> b() {
            return this.f130186a;
        }

        public final boolean c() {
            return this.f130187b;
        }

        public final boolean d() {
            return this.f130188c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f130186a, cVar.f130186a) && this.f130187b == cVar.f130187b && this.f130188c == cVar.f130188c && this.f130189d == cVar.f130189d;
        }

        public int hashCode() {
            return (((((this.f130186a.hashCode() * 31) + Boolean.hashCode(this.f130187b)) * 31) + Boolean.hashCode(this.f130188c)) * 31) + Boolean.hashCode(this.f130189d);
        }

        public String toString() {
            List<k> list = this.f130186a;
            boolean z10 = this.f130187b;
            boolean z11 = this.f130188c;
            boolean z12 = this.f130189d;
            return "ShoppingListAndLoggedInState(shoppingList=" + list + ", syncingShoppingLists=" + z10 + ", isLoggedIn=" + z11 + ", displayCreateListFromEmptyList=" + z12 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(List list, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? false : z10, z11, (i10 & 8) != 0 ? false : z12);
        }
    }
}
