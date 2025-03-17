package ft;

import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.b1;
import S2.b;
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
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lft/b;", "", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTJ/g;", "", "b", "()LTJ/g;", "shown", "LXH/N;", "c", "(ZLdI/e;)Ljava/lang/Object;", "a", "LR2/h;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ft.b  reason: case insensitive filesystem */
public final class C11284b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f97515b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final f.a<Boolean> f97516c = h.a("store_page_small_store_shown");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<f> f97517a;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lft/b$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LQJ/Q;", "scope", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;LQJ/Q;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "LW2/f$a;", "", "STORE_PAGE_SMALL_STORE_SHOWN", "LW2/f$a;", "f", "()LW2/f$a;", "getSTORE_PAGE_SMALL_STORE_SHOWN$annotations", "FILE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ft.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<f> c(String str, Context context, M m10, Q q10) {
            return e.c(e.f14655a, (b) null, (List) null, q10, new C11283a(context, str), 3, (Object) null);
        }

        static /* synthetic */ R2.h d(a aVar, String str, Context context, M m10, Q q10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                q10 = S.a(m10.plus(b1.b((F0) null, 1, (Object) null)));
            }
            return aVar.c(str, context, m10, q10);
        }

        /* access modifiers changed from: private */
        public static final File e(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return d(this, "store_page", context, m10, (Q) null, 8, (Object) null);
        }

        public final f.a<Boolean> f() {
            return C11284b.f97516c;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ft.b$b  reason: collision with other inner class name */
    public static final class C2176b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f97518a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ft.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f97519a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.repository.StorePageLocalDataSource$hasSmallStoreEntryBeenShown$$inlined$map$1$2", f = "StorePageLocalDataSource.kt", l = {50}, m = "emit")
            /* renamed from: ft.b$b$a$a  reason: collision with other inner class name */
            public static final class C2177a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f97520c;

                /* renamed from: d  reason: collision with root package name */
                int f97521d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f97522e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2177a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f97522e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f97520c = obj;
                    this.f97521d |= Integer.MIN_VALUE;
                    return this.f97522e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f97519a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ft.C11284b.C2176b.a.C2177a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ft.b$b$a$a r0 = (ft.C11284b.C2176b.a.C2177a) r0
                    int r1 = r0.f97521d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f97521d = r1
                    goto L_0x0018
                L_0x0013:
                    ft.b$b$a$a r0 = new ft.b$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f97520c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f97521d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f97519a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = ft.C11284b.f97516c
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f97521d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ft.C11284b.C2176b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2176b(C16532g gVar) {
            this.f97518a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f97518a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.datalayer.repository.StorePageLocalDataSource$setSmallStoreEntryShown$2", f = "StorePageLocalDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ft.b$c */
    static final class c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97523c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f97524d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f97525e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f97525e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f97525e, eVar);
            cVar.f97524d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f97523c == 0) {
                y.b(obj);
                ((W2.c) this.f97524d).j(C11284b.f97515b.f(), kotlin.coroutines.jvm.internal.b.a(this.f97525e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11284b(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f97517a = hVar;
    }

    public final C16532g<Boolean> b() {
        return new C2176b(this.f97517a.getData());
    }

    public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f97517a, new c(z10, (C17164e<? super c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
