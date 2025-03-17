package eB;

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
import eI.C17187b;
import gB.C14504f;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LeB/d;", "LeB/b;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTJ/g;", "LgB/f;", "a", "()LTJ/g;", "cardSize", "LXH/N;", "b", "(LgB/f;LdI/e;)Ljava/lang/Object;", "LR2/h;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eB.d  reason: case insensitive filesystem */
public final class C14376d implements C14374b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f126362b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final f.a<String> f126363c = h.g("shopping_list_card_size");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<f> f126364a;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\u000bR&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LeB/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "c", "(Landroid/content/Context;LQJ/M;)LR2/h;", "b", "LW2/f$a;", "", "CARD_SIZE_KEY", "LW2/f$a;", "e", "()LW2/f$a;", "getCARD_SIZE_KEY$shoppinglist_datalayer_implementation_release$annotations", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<f> c(Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new C14375c(context), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context) {
            return V2.b.a(context, "shopping_list_data_store");
        }

        public final R2.h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return c(context, m10);
        }

        public final f.a<String> e() {
            return C14376d.f126363c;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.d$b */
    public static final class b implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126365a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.d$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126366a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListDataStoreImpl$getCardSizeStored$$inlined$map$1$2", f = "ShoppingListDataStoreImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.d$b$a$a  reason: collision with other inner class name */
            public static final class C3088a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126367c;

                /* renamed from: d  reason: collision with root package name */
                int f126368d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126369e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3088a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126369e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126367c = obj;
                    this.f126368d |= Integer.MIN_VALUE;
                    return this.f126369e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126366a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14376d.b.a.C3088a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.d$b$a$a r0 = (eB.C14376d.b.a.C3088a) r0
                    int r1 = r0.f126368d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126368d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.d$b$a$a r0 = new eB.d$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126367c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126368d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126366a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = eB.C14376d.f126363c
                    java.lang.Object r5 = r5.b(r2)
                    r0.f126368d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14376d.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f126365a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126365a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eB.d$c */
    public static final class c implements C16532g<C14504f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126370a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eB.d$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126371a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListDataStoreImpl$getCardSizeStored$$inlined$map$2$2", f = "ShoppingListDataStoreImpl.kt", l = {50}, m = "emit")
            /* renamed from: eB.d$c$a$a  reason: collision with other inner class name */
            public static final class C3089a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126372c;

                /* renamed from: d  reason: collision with root package name */
                int f126373d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f126374e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3089a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126374e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126372c = obj;
                    this.f126373d |= Integer.MIN_VALUE;
                    return this.f126374e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f126371a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof eB.C14376d.c.a.C3089a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    eB.d$c$a$a r0 = (eB.C14376d.c.a.C3089a) r0
                    int r1 = r0.f126373d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126373d = r1
                    goto L_0x0018
                L_0x0013:
                    eB.d$c$a$a r0 = new eB.d$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126372c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126373d
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
                    TJ.h r6 = r4.f126371a
                    java.lang.String r5 = (java.lang.String) r5
                    gB.f$a r2 = gB.C14504f.Companion
                    gB.f r5 = r2.b(r5)
                    r0.f126373d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: eB.C14376d.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f126370a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126370a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.repo.ShoppingListDataStoreImpl$updateCardSizeStored$2", f = "ShoppingListDataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eB.d$d  reason: collision with other inner class name */
    static final class C3090d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126375c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f126376d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14504f f126377e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3090d(C14504f fVar, C17164e<? super C3090d> eVar) {
            super(2, eVar);
            this.f126377e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3090d dVar = new C3090d(this.f126377e, eVar);
            dVar.f126376d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((C3090d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f126375c == 0) {
                y.b(obj);
                ((W2.c) this.f126376d).j(C14376d.f126362b.e(), this.f126377e.m());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14376d(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f126364a = hVar;
    }

    public C16532g<C14504f> a() {
        return new c(new b(this.f126364a.getData()));
    }

    public Object b(C14504f fVar, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f126364a, new C3090d(fVar, (C17164e<? super C3090d>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
