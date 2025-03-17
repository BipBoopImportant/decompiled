package bt;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import TJ.C16532g;
import TJ.C16533h;
import W2.e;
import W2.f;
import W2.h;
import W2.i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import dt.C11240a;
import eI.C17187b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lbt/c;", "Lbt/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTJ/g;", "Ldt/a;", "a", "()LTJ/g;", "currentOrder", "LXH/N;", "d", "(Ldt/a;LdI/e;)Ljava/lang/Object;", "c", "(LdI/e;)Ljava/lang/Object;", "LR2/h;", "b", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11126a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f90677b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final f.a<String> f90678c = h.g("food_order_store_id");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final f.a<String> f90679d = h.g("food_order_order_id");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f.a<String> f90680e = h.g("food_order_expire_timestamp");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<f> f90681a;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\u0014R&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lbt/c$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "LW2/f$a;", "FOOD_ORDER_STORE_ID", "LW2/f$a;", "g", "()LW2/f$a;", "getFOOD_ORDER_STORE_ID$annotations", "FOOD_ORDER_ORDER_ID", "f", "getFOOD_ORDER_ORDER_ID$annotations", "FOOD_ORDER_EXPIRE_TIMESTAMP", "e", "getFOOD_ORDER_EXPIRE_TIMESTAMP$annotations", "FILE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<f> c(String str, Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new C11127b(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return c("foodmobile_preferences", context, m10);
        }

        public final f.a<String> e() {
            return c.f90680e;
        }

        public final f.a<String> f() {
            return c.f90679d;
        }

        public final f.a<String> g() {
            return c.f90678c;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.foodmobile.FoodMobileLocalSourceImpl$deleteCurrentOrder$2", f = "FoodMobileLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90682c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90683d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f90683d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90682c == 0) {
                y.b(obj);
                ((W2.c) this.f90683d).f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bt.c$c  reason: collision with other inner class name */
    public static final class C1977c implements C16532g<C11240a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f90684a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bt.c$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f90685a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.foodmobile.FoodMobileLocalSourceImpl$getCurrentOrder$$inlined$map$1$2", f = "FoodMobileLocalSource.kt", l = {50}, m = "emit")
            /* renamed from: bt.c$c$a$a  reason: collision with other inner class name */
            public static final class C1978a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f90686c;

                /* renamed from: d  reason: collision with root package name */
                int f90687d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f90688e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1978a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f90688e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90686c = obj;
                    this.f90687d |= Integer.MIN_VALUE;
                    return this.f90688e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f90685a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof bt.c.C1977c.a.C1978a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    bt.c$c$a$a r0 = (bt.c.C1977c.a.C1978a) r0
                    int r1 = r0.f90687d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90687d = r1
                    goto L_0x0018
                L_0x0013:
                    bt.c$c$a$a r0 = new bt.c$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f90686c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f90687d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0073
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f90685a
                    W2.f r7 = (W2.f) r7
                    W2.f$a r2 = bt.c.f90678c
                    java.lang.Object r2 = r7.b(r2)
                    java.lang.String r2 = (java.lang.String) r2
                    W2.f$a r4 = bt.c.f90679d
                    java.lang.Object r4 = r7.b(r4)
                    java.lang.String r4 = (java.lang.String) r4
                    W2.f$a r5 = bt.c.f90680e
                    java.lang.Object r7 = r7.b(r5)
                    java.lang.String r7 = (java.lang.String) r7
                    r5 = 0
                    if (r7 == 0) goto L_0x005e
                    java.time.LocalDateTime r7 = java.time.LocalDateTime.parse(r7)
                    goto L_0x005f
                L_0x005e:
                    r7 = r5
                L_0x005f:
                    if (r2 == 0) goto L_0x006a
                    if (r4 == 0) goto L_0x006a
                    if (r7 == 0) goto L_0x006a
                    dt.a r5 = new dt.a
                    r5.<init>(r2, r4, r7)
                L_0x006a:
                    r0.f90687d = r3
                    java.lang.Object r7 = r8.emit(r5, r0)
                    if (r7 != r1) goto L_0x0073
                    return r1
                L_0x0073:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: bt.c.C1977c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1977c(C16532g gVar) {
            this.f90684a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f90684a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.foodmobile.FoodMobileLocalSourceImpl$setCurrentOrder$2", f = "FoodMobileLocalSource.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90689c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90690d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11240a f90691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C11240a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f90691e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f90691e, eVar);
            dVar.f90690d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90689c == 0) {
                y.b(obj);
                W2.c cVar = (W2.c) this.f90690d;
                String c10 = this.f90691e.c();
                String b10 = this.f90691e.b();
                String localDateTime = this.f90691e.a().toString();
                C17542s.i(localDateTime, "toString(...)");
                a aVar = c.f90677b;
                cVar.j(aVar.g(), c10);
                cVar.j(aVar.f(), b10);
                cVar.j(aVar.e(), localDateTime);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f90681a = hVar;
    }

    public C16532g<C11240a> a() {
        return new C1977c(this.f90681a.getData());
    }

    public Object c(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f90681a, new b((C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object d(C11240a aVar, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f90681a, new d(aVar, (C17164e<? super d>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
