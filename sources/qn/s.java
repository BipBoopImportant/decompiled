package qn;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import pn.e;
import vn.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\tB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lqn/s;", "Lpn/e;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTJ/g;", "Lvn/g;", "a", "()LTJ/g;", "rowLayout", "LXH/N;", "e", "(Lvn/g;LdI/e;)Ljava/lang/Object;", "LR2/h;", "b", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f101887b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f101888a;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lqn/s$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "ROW_LAYOUT_KEY", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final h<f> c(String str, Context context, M m10) {
            return W2.e.c(W2.e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new r(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return c("selected_row_size_data_store", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f.a f101890b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101891a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f.a f101892b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.SelectedRowSizeLocalDatasourceImpl$getItemsPerRowFlow$$inlined$map$1$2", f = "SelectedRowSizeLocalDatasourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: qn.s$b$a$a  reason: collision with other inner class name */
            public static final class C2418a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101893c;

                /* renamed from: d  reason: collision with root package name */
                int f101894d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101895e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2418a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101895e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101893c = obj;
                    this.f101894d |= Integer.MIN_VALUE;
                    return this.f101895e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f.a aVar) {
                this.f101891a = hVar;
                this.f101892b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qn.s.b.a.C2418a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qn.s$b$a$a r0 = (qn.s.b.a.C2418a) r0
                    int r1 = r0.f101894d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101894d = r1
                    goto L_0x0018
                L_0x0013:
                    qn.s$b$a$a r0 = new qn.s$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101893c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101894d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101891a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = r4.f101892b
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r5 != 0) goto L_0x004a
                    vn.g r5 = vn.h.a()
                    java.lang.String r5 = r5.j()
                L_0x004a:
                    r0.f101894d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qn.s.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, f.a aVar) {
            this.f101889a = gVar;
            this.f101890b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101889a.collect(new a(hVar, this.f101890b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101896a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101897a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.SelectedRowSizeLocalDatasourceImpl$getItemsPerRowFlow$$inlined$map$2$2", f = "SelectedRowSizeLocalDatasourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: qn.s$c$a$a  reason: collision with other inner class name */
            public static final class C2419a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101898c;

                /* renamed from: d  reason: collision with root package name */
                int f101899d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101900e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2419a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101900e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101898c = obj;
                    this.f101899d |= Integer.MIN_VALUE;
                    return this.f101900e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101897a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof qn.s.c.a.C2419a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    qn.s$c$a$a r0 = (qn.s.c.a.C2419a) r0
                    int r1 = r0.f101899d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101899d = r1
                    goto L_0x0018
                L_0x0013:
                    qn.s$c$a$a r0 = new qn.s$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f101898c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101899d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x006a
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f101897a
                    java.lang.String r7 = (java.lang.String) r7
                    fI.a r2 = vn.g.b()
                    java.util.Iterator r2 = r2.iterator()
                L_0x0040:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0058
                    java.lang.Object r4 = r2.next()
                    r5 = r4
                    vn.g r5 = (vn.g) r5
                    java.lang.String r5 = r5.j()
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
                    if (r5 == 0) goto L_0x0040
                    goto L_0x0059
                L_0x0058:
                    r4 = 0
                L_0x0059:
                    vn.g r4 = (vn.g) r4
                    if (r4 != 0) goto L_0x0061
                    vn.g r4 = vn.h.a()
                L_0x0061:
                    r0.f101899d = r3
                    java.lang.Object r7 = r8.emit(r4, r0)
                    if (r7 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: qn.s.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f101896a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101896a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.SelectedRowSizeLocalDatasourceImpl$updateItemsPerRow$2", f = "SelectedRowSizeLocalDatasourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101901c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.a<String> f101903e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f101904f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f.a<String> aVar, g gVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f101903e = aVar;
            this.f101904f = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f101903e, this.f101904f, eVar);
            dVar.f101902d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101901c == 0) {
                y.b(obj);
                ((W2.c) this.f101902d).j(this.f101903e, this.f101904f.j());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public s(h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f101888a = hVar;
    }

    public C16532g<g> a() {
        return new c(new b(this.f101888a.getData(), W2.h.g("plp_row_layout_key")));
    }

    public Object e(g gVar, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f101888a, new d(W2.h.g("plp_row_layout_key"), gVar, (C17164e<? super d>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
