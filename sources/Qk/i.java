package qk;

import BA.C12609a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqk/i;", "", "LjB/b;", "shoppingListRepository", "LBA/a;", "shareRepository", "<init>", "(LjB/b;LBA/a;)V", "", "itemNo", "listId", "Lpk/s$l;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LjB/b;", "LBA/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101653a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12609a f101654b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<s.l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101655a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f101656b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f101657c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.i$a$a  reason: collision with other inner class name */
        public static final class C2408a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101658a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f101659b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f101660c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.ShareItemUseCase$invoke$$inlined$map$1$2", f = "ShareItemUseCase.kt", l = {53, 50}, m = "emit")
            /* renamed from: qk.i$a$a$a  reason: collision with other inner class name */
            public static final class C2409a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101661c;

                /* renamed from: d  reason: collision with root package name */
                int f101662d;

                /* renamed from: e  reason: collision with root package name */
                Object f101663e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2408a f101664f;

                /* renamed from: g  reason: collision with root package name */
                Object f101665g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2409a(C2408a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101664f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101661c = obj;
                    this.f101662d |= Integer.MIN_VALUE;
                    return this.f101664f.emit((Object) null, this);
                }
            }

            public C2408a(C16533h hVar, i iVar, String str) {
                this.f101658a = hVar;
                this.f101659b = iVar;
                this.f101660c = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0079  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x009e A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, dI.C17164e r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof qk.i.a.C2408a.C2409a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    qk.i$a$a$a r0 = (qk.i.a.C2408a.C2409a) r0
                    int r1 = r0.f101662d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101662d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.i$a$a$a r0 = new qk.i$a$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f101661c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101662d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0047
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    XH.y.b(r10)
                    goto L_0x009f
                L_0x002d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0035:
                    java.lang.Object r9 = r0.f101665g
                    gB.g r9 = (gB.C14505g) r9
                    java.lang.Object r2 = r0.f101663e
                    TJ.h r2 = (TJ.C16533h) r2
                    XH.y.b(r10)
                    XH.x r10 = (XH.x) r10
                    java.lang.Object r10 = r10.j()
                    goto L_0x006b
                L_0x0047:
                    XH.y.b(r10)
                    TJ.h r2 = r8.f101658a
                    gB.g r9 = (gB.C14505g) r9
                    java.lang.String r10 = r9.c()
                    if (r10 == 0) goto L_0x00a2
                    qk.i r5 = r8.f101659b
                    BA.a r5 = r5.f101654b
                    java.lang.String r6 = r8.f101660c
                    CA.b r7 = CA.C12683b.LIST
                    r0.f101663e = r2
                    r0.f101665g = r9
                    r0.f101662d = r4
                    java.lang.Object r10 = r5.a(r6, r10, r7, r0)
                    if (r10 != r1) goto L_0x006b
                    return r1
                L_0x006b:
                    XH.y.b(r10)
                    java.lang.String r10 = (java.lang.String) r10
                    pk.s$l$b r4 = new pk.s$l$b
                    gB.b r5 = r9.f()
                    r6 = 0
                    if (r5 == 0) goto L_0x007e
                    java.lang.String r5 = r5.f()
                    goto L_0x007f
                L_0x007e:
                    r5 = r6
                L_0x007f:
                    if (r5 != 0) goto L_0x0083
                    java.lang.String r5 = ""
                L_0x0083:
                    gB.b r9 = r9.f()
                    if (r9 == 0) goto L_0x008e
                    java.lang.String r9 = r9.b()
                    goto L_0x008f
                L_0x008e:
                    r9 = r6
                L_0x008f:
                    r4.<init>(r10, r5, r9)
                    r0.f101663e = r6
                    r0.f101665g = r6
                    r0.f101662d = r3
                    java.lang.Object r9 = r2.emit(r4, r0)
                    if (r9 != r1) goto L_0x009f
                    return r1
                L_0x009f:
                    XH.N r9 = XH.C16807N.f139792a
                    return r9
                L_0x00a2:
                    java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                    java.lang.String r10 = "Item type is null"
                    r9.<init>(r10)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.i.a.C2408a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, i iVar, String str) {
            this.f101655a = gVar;
            this.f101656b = iVar;
            this.f101657c = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101655a.collect(new C2408a(hVar, this.f101656b, this.f101657c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$l;", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.ShareItemUseCase$invoke$3", f = "ShareItemUseCase.kt", l = {45}, m = "invokeSuspend")
    static final class b extends l implements q<C16533h<? super s.l>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101666c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101667d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101668e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.l> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar);
            bVar.f101667d = hVar;
            bVar.f101668e = th2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101666c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101667d;
                Throwable th2 = (Throwable) this.f101668e;
                s.l.a aVar = new s.l.a(th2);
                this.f101667d = hVar;
                this.f101668e = th2;
                this.f101666c = 1;
                if (hVar.emit(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Throwable th3 = (Throwable) this.f101668e;
                C16533h hVar2 = (C16533h) this.f101667d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public i(C14613b bVar, C12609a aVar) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar, "shareRepository");
        this.f101653a = bVar;
        this.f101654b = aVar;
    }

    public final Object b(String str, String str2, C17164e<? super s.l> eVar) {
        return C16534i.B(C16534i.g(new a(C16534i.e0(this.f101653a.b(str2, str), 1), this, str), new b((C17164e<? super b>) null)), eVar);
    }
}
