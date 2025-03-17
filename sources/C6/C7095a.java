package c6;

import QJ.Q;
import T5.C6704h;
import T5.j;
import T5.n;
import T5.r;
import X5.C6721f;
import XH.C16807N;
import XH.y;
import Z5.i;
import Z5.o;
import c6.C7098d;
import dI.C17164e;
import eI.C17187b;
import f6.C7853d;
import f6.C7854e;
import k6.C8441h;
import k6.C8450q;
import k6.C8452s;
import k6.C8454u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.p;
import r6.C8690A;
import r6.E;
import r6.s;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0002&#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lc6/a;", "Lc6/d;", "LT5/r;", "imageLoader", "Lr6/A;", "systemCallbacks", "Lk6/s;", "requestService", "Lr6/s;", "logger", "<init>", "(LT5/r;Lr6/A;Lk6/s;Lr6/s;)V", "Lk6/h;", "request", "", "mappedData", "Lk6/q;", "options", "LT5/j;", "eventListener", "Lc6/a$b;", "h", "(Lk6/h;Ljava/lang/Object;Lk6/q;LT5/j;LdI/e;)Ljava/lang/Object;", "LT5/h;", "components", "LZ5/i;", "i", "(LT5/h;Lk6/h;Ljava/lang/Object;Lk6/q;LT5/j;LdI/e;)Ljava/lang/Object;", "LZ5/o;", "fetchResult", "g", "(LZ5/o;LT5/h;Lk6/h;Ljava/lang/Object;Lk6/q;LT5/j;LdI/e;)Ljava/lang/Object;", "Lc6/d$a;", "chain", "Lk6/l;", "a", "(Lc6/d$a;LdI/e;)Ljava/lang/Object;", "LT5/r;", "b", "Lr6/A;", "c", "Lk6/s;", "Lf6/e;", "d", "Lf6/e;", "memoryCacheService", "e", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: c6.a  reason: case insensitive filesystem */
public final class C7095a implements C7098d {

    /* renamed from: e  reason: collision with root package name */
    public static final C0796a f45664e = new C0796a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final r f45665a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8690A f45666b;

    /* renamed from: c  reason: collision with root package name */
    private final C8452s f45667c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C7854e f45668d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc6/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: c6.a$a  reason: collision with other inner class name */
    public static final class C0796a {
        public /* synthetic */ C0796a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0796a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lc6/a$b;", "", "LT5/n;", "image", "", "isSampled", "LX5/f;", "dataSource", "", "diskCacheKey", "<init>", "(LT5/n;ZLX5/f;Ljava/lang/String;)V", "a", "(LT5/n;ZLX5/f;Ljava/lang/String;)Lc6/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LT5/n;", "e", "()LT5/n;", "b", "Z", "f", "()Z", "c", "LX5/f;", "()LX5/f;", "d", "Ljava/lang/String;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: c6.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final n f45669a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f45670b;

        /* renamed from: c  reason: collision with root package name */
        private final C6721f f45671c;

        /* renamed from: d  reason: collision with root package name */
        private final String f45672d;

        public b(n nVar, boolean z10, C6721f fVar, String str) {
            this.f45669a = nVar;
            this.f45670b = z10;
            this.f45671c = fVar;
            this.f45672d = str;
        }

        public static /* synthetic */ b b(b bVar, n nVar, boolean z10, C6721f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                nVar = bVar.f45669a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f45670b;
            }
            if ((i10 & 4) != 0) {
                fVar = bVar.f45671c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f45672d;
            }
            return bVar.a(nVar, z10, fVar, str);
        }

        public final b a(n nVar, boolean z10, C6721f fVar, String str) {
            return new b(nVar, z10, fVar, str);
        }

        public final C6721f c() {
            return this.f45671c;
        }

        public final String d() {
            return this.f45672d;
        }

        public final n e() {
            return this.f45669a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f45669a, bVar.f45669a) && this.f45670b == bVar.f45670b && this.f45671c == bVar.f45671c && C17542s.e(this.f45672d, bVar.f45672d);
        }

        public final boolean f() {
            return this.f45670b;
        }

        public int hashCode() {
            int hashCode = ((((this.f45669a.hashCode() * 31) + Boolean.hashCode(this.f45670b)) * 31) + this.f45671c.hashCode()) * 31;
            String str = this.f45672d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.f45669a + ", isSampled=" + this.f45670b + ", dataSource=" + this.f45671c + ", diskCacheKey=" + this.f45672d + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
    /* renamed from: c6.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f45673c;

        /* renamed from: d  reason: collision with root package name */
        Object f45674d;

        /* renamed from: e  reason: collision with root package name */
        Object f45675e;

        /* renamed from: f  reason: collision with root package name */
        Object f45676f;

        /* renamed from: g  reason: collision with root package name */
        Object f45677g;

        /* renamed from: h  reason: collision with root package name */
        Object f45678h;

        /* renamed from: i  reason: collision with root package name */
        Object f45679i;

        /* renamed from: j  reason: collision with root package name */
        Object f45680j;

        /* renamed from: k  reason: collision with root package name */
        int f45681k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f45682l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C7095a f45683m;

        /* renamed from: n  reason: collision with root package name */
        int f45684n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C7095a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f45683m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45682l = obj;
            this.f45684n |= Integer.MIN_VALUE;
            return this.f45683m.g((o) null, (C6704h) null, (C8441h) null, (Object) null, (C8450q) null, (j) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    /* renamed from: c6.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f45685c;

        /* renamed from: d  reason: collision with root package name */
        Object f45686d;

        /* renamed from: e  reason: collision with root package name */
        Object f45687e;

        /* renamed from: f  reason: collision with root package name */
        Object f45688f;

        /* renamed from: g  reason: collision with root package name */
        Object f45689g;

        /* renamed from: h  reason: collision with root package name */
        Object f45690h;

        /* renamed from: i  reason: collision with root package name */
        Object f45691i;

        /* renamed from: j  reason: collision with root package name */
        Object f45692j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f45693k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C7095a f45694l;

        /* renamed from: m  reason: collision with root package name */
        int f45695m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C7095a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f45694l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45693k = obj;
            this.f45695m |= Integer.MIN_VALUE;
            return this.f45694l.h((C8441h) null, (Object) null, (C8450q) null, (j) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lc6/a$b;", "<anonymous>", "(LQJ/Q;)Lc6/a$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    /* renamed from: c6.a$e */
    static final class e extends l implements p<Q, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45696c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7095a f45697d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<i> f45698e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O<C6704h> f45699f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C8441h f45700g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f45701h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ O<C8450q> f45702i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j f45703j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C7095a aVar, O<i> o10, O<C6704h> o11, C8441h hVar, Object obj, O<C8450q> o12, j jVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f45697d = aVar;
            this.f45698e = o10;
            this.f45699f = o11;
            this.f45700g = hVar;
            this.f45701h = obj;
            this.f45702i = o12;
            this.f45703j = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f45697d, this.f45698e, this.f45699f, this.f45700g, this.f45701h, this.f45702i, this.f45703j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super b> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45696c;
            if (i10 == 0) {
                y.b(obj);
                C7095a aVar = this.f45697d;
                j jVar = this.f45703j;
                this.f45696c = 1;
                obj = aVar.g((o) this.f45698e.f144348a, (C6704h) this.f45699f.f144348a, this.f45700g, this.f45701h, (C8450q) this.f45702i.f144348a, jVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    /* renamed from: c6.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f45704c;

        /* renamed from: d  reason: collision with root package name */
        Object f45705d;

        /* renamed from: e  reason: collision with root package name */
        Object f45706e;

        /* renamed from: f  reason: collision with root package name */
        Object f45707f;

        /* renamed from: g  reason: collision with root package name */
        Object f45708g;

        /* renamed from: h  reason: collision with root package name */
        Object f45709h;

        /* renamed from: i  reason: collision with root package name */
        Object f45710i;

        /* renamed from: j  reason: collision with root package name */
        int f45711j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f45712k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C7095a f45713l;

        /* renamed from: m  reason: collision with root package name */
        int f45714m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C7095a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f45713l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45712k = obj;
            this.f45714m |= Integer.MIN_VALUE;
            return this.f45713l.i((C6704h) null, (C8441h) null, (Object) null, (C8450q) null, (j) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    /* renamed from: c6.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f45715c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f45716d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C7095a f45717e;

        /* renamed from: f  reason: collision with root package name */
        int f45718f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C7095a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f45717e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f45716d = obj;
            this.f45718f |= Integer.MIN_VALUE;
            return this.f45717e.a((C7098d.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lk6/u;", "<anonymous>", "(LQJ/Q;)Lk6/u;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: c6.a$h */
    static final class h extends l implements p<Q, C17164e<? super C8454u>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f45719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C7095a f45720d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8441h f45721e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f45722f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C8450q f45723g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ j f45724h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C7853d.b f45725i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C7098d.a f45726j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C7095a aVar, C8441h hVar, Object obj, C8450q qVar, j jVar, C7853d.b bVar, C7098d.a aVar2, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f45720d = aVar;
            this.f45721e = hVar;
            this.f45722f = obj;
            this.f45723g = qVar;
            this.f45724h = jVar;
            this.f45725i = bVar;
            this.f45726j = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f45720d, this.f45721e, this.f45722f, this.f45723g, this.f45724h, this.f45725i, this.f45726j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C8454u> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f45719c;
            if (i10 == 0) {
                y.b(obj);
                C7095a aVar = this.f45720d;
                C8441h hVar = this.f45721e;
                Object obj2 = this.f45722f;
                C8450q qVar = this.f45723g;
                j jVar = this.f45724h;
                this.f45719c = 1;
                obj = aVar.h(hVar, obj2, qVar, jVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) obj;
            this.f45720d.f45666b.a();
            return new C8454u(bVar.e(), this.f45721e, bVar.c(), this.f45720d.f45668d.h(this.f45725i, this.f45721e, bVar) ? this.f45725i : null, bVar.d(), bVar.f(), E.o(this.f45726j));
        }
    }

    public C7095a(r rVar, C8690A a10, C8452s sVar, s sVar2) {
        this.f45665a = rVar;
        this.f45666b = a10;
        this.f45667c = sVar;
        this.f45668d = new C7854e(rVar, sVar, (s) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(Z5.o r18, T5.C6704h r19, k6.C8441h r20, java.lang.Object r21, k6.C8450q r22, T5.j r23, dI.C17164e<? super c6.C7095a.b> r24) {
        /*
            r17 = this;
            r0 = r24
            boolean r1 = r0 instanceof c6.C7095a.c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            c6.a$c r1 = (c6.C7095a.c) r1
            int r2 = r1.f45684n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f45684n = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            c6.a$c r1 = new c6.a$c
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f45682l
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f45684n
            r5 = 1
            if (r4 == 0) goto L_0x0062
            if (r4 != r5) goto L_0x005a
            int r4 = r1.f45681k
            java.lang.Object r6 = r1.f45680j
            X5.i r6 = (X5.C6724i) r6
            java.lang.Object r7 = r1.f45679i
            T5.j r7 = (T5.j) r7
            java.lang.Object r8 = r1.f45678h
            k6.q r8 = (k6.C8450q) r8
            java.lang.Object r9 = r1.f45677g
            java.lang.Object r10 = r1.f45676f
            k6.h r10 = (k6.C8441h) r10
            java.lang.Object r11 = r1.f45675e
            T5.h r11 = (T5.C6704h) r11
            java.lang.Object r12 = r1.f45674d
            Z5.o r12 = (Z5.o) r12
            java.lang.Object r13 = r1.f45673c
            c6.a r13 = (c6.C7095a) r13
            XH.y.b(r0)
            r14 = r11
            r11 = r1
            r1 = r14
            r15 = r10
            r10 = r4
            r4 = r15
            r16 = r8
            r8 = r7
            r7 = r16
            goto L_0x00b4
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0062:
            XH.y.b(r0)
            r0 = 0
            r4 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r0
            r10 = r1
            r13 = r2
            r0 = r18
            r1 = r19
        L_0x0075:
            T5.r r11 = r13.f45665a
            XH.v r9 = r1.l(r0, r7, r11, r9)
            if (r9 == 0) goto L_0x00e5
            java.lang.Object r11 = r9.c()
            X5.i r11 = (X5.C6724i) r11
            java.lang.Object r9 = r9.d()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r5
            r8.f(r4, r11, r7)
            r10.f45673c = r13
            r10.f45674d = r0
            r10.f45675e = r1
            r10.f45676f = r4
            r10.f45677g = r6
            r10.f45678h = r7
            r10.f45679i = r8
            r10.f45680j = r11
            r10.f45681k = r9
            r10.f45684n = r5
            java.lang.Object r12 = r11.a(r10)
            if (r12 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r14 = r12
            r12 = r0
            r0 = r14
            r15 = r9
            r9 = r6
            r6 = r11
            r11 = r10
            r10 = r15
        L_0x00b4:
            X5.g r0 = (X5.C6722g) r0
            r8.e(r4, r6, r7, r0)
            if (r0 == 0) goto L_0x00e0
            c6.a$b r1 = new c6.a$b
            T5.n r3 = r0.a()
            boolean r0 = r0.b()
            X5.f r4 = r12.a()
            X5.s r5 = r12.c()
            boolean r6 = r5 instanceof X5.r
            r7 = 0
            if (r6 == 0) goto L_0x00d5
            X5.r r5 = (X5.r) r5
            goto L_0x00d6
        L_0x00d5:
            r5 = r7
        L_0x00d6:
            if (r5 == 0) goto L_0x00dc
            java.lang.String r7 = r5.e()
        L_0x00dc:
            r1.<init>(r3, r0, r4, r7)
            return r1
        L_0x00e0:
            r6 = r9
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x0075
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create a decoder that supports: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C7095a.g(Z5.o, T5.h, k6.h, java.lang.Object, k6.q, T5.j, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112 A[Catch:{ all -> 0x00bf }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0113 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0129 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166 A[SYNTHETIC, Splitter:B:48:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(k6.C8441h r26, java.lang.Object r27, k6.C8450q r28, T5.j r29, dI.C17164e<? super c6.C7095a.b> r30) {
        /*
            r25 = this;
            r8 = r25
            r0 = r30
            boolean r1 = r0 instanceof c6.C7095a.d
            if (r1 == 0) goto L_0x0018
            r1 = r0
            c6.a$d r1 = (c6.C7095a.d) r1
            int r2 = r1.f45695m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f45695m = r2
        L_0x0016:
            r0 = r1
            goto L_0x001e
        L_0x0018:
            c6.a$d r1 = new c6.a$d
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r0.f45693k
            java.lang.Object r9 = eI.C17187b.f()
            int r2 = r0.f45695m
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0088
            if (r2 == r3) goto L_0x005b
            if (r2 == r11) goto L_0x003f
            if (r2 != r10) goto L_0x0037
            XH.y.b(r1)
            goto L_0x01c0
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r2 = r0.f45689g
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r3 = r0.f45688f
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r4 = r0.f45687e
            T5.j r4 = (T5.j) r4
            java.lang.Object r5 = r0.f45686d
            k6.h r5 = (k6.C8441h) r5
            java.lang.Object r6 = r0.f45685c
            c6.a r6 = (c6.C7095a) r6
            XH.y.b(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x015d
        L_0x0058:
            r0 = move-exception
            goto L_0x01d0
        L_0x005b:
            java.lang.Object r2 = r0.f45692j
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r3 = r0.f45691i
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r4 = r0.f45690h
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r5 = r0.f45689g
            kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
            java.lang.Object r6 = r0.f45688f
            T5.j r6 = (T5.j) r6
            java.lang.Object r7 = r0.f45687e
            java.lang.Object r13 = r0.f45686d
            k6.h r13 = (k6.C8441h) r13
            java.lang.Object r14 = r0.f45685c
            c6.a r14 = (c6.C7095a) r14
            XH.y.b(r1)     // Catch:{ all -> 0x0084 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x011e
        L_0x0084:
            r0 = move-exception
            r2 = r3
            goto L_0x01d0
        L_0x0088:
            XH.y.b(r1)
            kotlin.jvm.internal.O r13 = new kotlin.jvm.internal.O
            r13.<init>()
            r1 = r28
            r13.f144348a = r1
            kotlin.jvm.internal.O r14 = new kotlin.jvm.internal.O
            r14.<init>()
            T5.r r1 = r8.f45665a
            T5.h r1 = r1.getComponents()
            r14.f144348a = r1
            kotlin.jvm.internal.O r15 = new kotlin.jvm.internal.O
            r15.<init>()
            k6.s r1 = r8.f45667c     // Catch:{ all -> 0x00bf }
            T r2 = r13.f144348a     // Catch:{ all -> 0x00bf }
            k6.q r2 = (k6.C8450q) r2     // Catch:{ all -> 0x00bf }
            k6.q r1 = r1.c(r2)     // Catch:{ all -> 0x00bf }
            r13.f144348a = r1     // Catch:{ all -> 0x00bf }
            XH.v r1 = r26.m()     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x00c3
            X5.i$a r1 = r26.f()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00e1
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r2 = r15
            goto L_0x01d0
        L_0x00c3:
            T r1 = r14.f144348a     // Catch:{ all -> 0x00bf }
            T5.h r1 = (T5.C6704h) r1     // Catch:{ all -> 0x00bf }
            T5.h$a r1 = r1.k()     // Catch:{ all -> 0x00bf }
            XH.v r2 = r26.m()     // Catch:{ all -> 0x00bf }
            T5.h$a r1 = r6.E.e(r1, r2)     // Catch:{ all -> 0x00bf }
            X5.i$a r2 = r26.f()     // Catch:{ all -> 0x00bf }
            T5.h$a r1 = r6.E.d(r1, r2)     // Catch:{ all -> 0x00bf }
            T5.h r1 = r1.p()     // Catch:{ all -> 0x00bf }
            r14.f144348a = r1     // Catch:{ all -> 0x00bf }
        L_0x00e1:
            T r1 = r14.f144348a     // Catch:{ all -> 0x00bf }
            r2 = r1
            T5.h r2 = (T5.C6704h) r2     // Catch:{ all -> 0x00bf }
            T r1 = r13.f144348a     // Catch:{ all -> 0x00bf }
            r5 = r1
            k6.q r5 = (k6.C8450q) r5     // Catch:{ all -> 0x00bf }
            r0.f45685c = r8     // Catch:{ all -> 0x00bf }
            r7 = r26
            r0.f45686d = r7     // Catch:{ all -> 0x00bf }
            r6 = r27
            r0.f45687e = r6     // Catch:{ all -> 0x00bf }
            r4 = r29
            r0.f45688f = r4     // Catch:{ all -> 0x00bf }
            r0.f45689g = r13     // Catch:{ all -> 0x00bf }
            r0.f45690h = r14     // Catch:{ all -> 0x00bf }
            r0.f45691i = r15     // Catch:{ all -> 0x00bf }
            r0.f45692j = r15     // Catch:{ all -> 0x00bf }
            r0.f45695m = r3     // Catch:{ all -> 0x00bf }
            r1 = r25
            r3 = r26
            r4 = r27
            r6 = r29
            r7 = r0
            java.lang.Object r1 = r1.i(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x0113
            return r9
        L_0x0113:
            r21 = r27
            r6 = r29
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r26
            r14 = r8
        L_0x011e:
            r2.f144348a = r1     // Catch:{ all -> 0x00bf }
            T r1 = r15.f144348a     // Catch:{ all -> 0x00bf }
            r2 = r1
            Z5.i r2 = (Z5.i) r2     // Catch:{ all -> 0x00bf }
            boolean r4 = r2 instanceof Z5.o     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0166
            dI.i r1 = r13.e()     // Catch:{ all -> 0x00bf }
            c6.a$e r2 = new c6.a$e     // Catch:{ all -> 0x00bf }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00bf }
            r0.f45685c = r14     // Catch:{ all -> 0x00bf }
            r0.f45686d = r13     // Catch:{ all -> 0x00bf }
            r0.f45687e = r6     // Catch:{ all -> 0x00bf }
            r0.f45688f = r3     // Catch:{ all -> 0x00bf }
            r0.f45689g = r15     // Catch:{ all -> 0x00bf }
            r0.f45690h = r12     // Catch:{ all -> 0x00bf }
            r0.f45691i = r12     // Catch:{ all -> 0x00bf }
            r0.f45692j = r12     // Catch:{ all -> 0x00bf }
            r0.f45695m = r11     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = QJ.C16310i.g(r1, r2, r0)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x0159
            return r9
        L_0x0159:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x015d:
            c6.a$b r1 = (c6.C7095a.b) r1     // Catch:{ all -> 0x0058 }
            r15 = r2
            r14 = r6
            r2 = r1
            r1 = r3
            r3 = r5
            r5 = r4
            goto L_0x0188
        L_0x0166:
            boolean r2 = r2 instanceof Z5.l     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x01ca
            c6.a$b r2 = new c6.a$b     // Catch:{ all -> 0x00bf }
            Z5.l r1 = (Z5.l) r1     // Catch:{ all -> 0x00bf }
            T5.n r1 = r1.b()     // Catch:{ all -> 0x00bf }
            T r4 = r15.f144348a     // Catch:{ all -> 0x00bf }
            Z5.l r4 = (Z5.l) r4     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.c()     // Catch:{ all -> 0x00bf }
            T r5 = r15.f144348a     // Catch:{ all -> 0x00bf }
            Z5.l r5 = (Z5.l) r5     // Catch:{ all -> 0x00bf }
            X5.f r5 = r5.a()     // Catch:{ all -> 0x00bf }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x00bf }
            r1 = r3
            r5 = r6
            r3 = r13
        L_0x0188:
            T r4 = r15.f144348a
            boolean r6 = r4 instanceof Z5.o
            if (r6 == 0) goto L_0x0191
            Z5.o r4 = (Z5.o) r4
            goto L_0x0192
        L_0x0191:
            r4 = r12
        L_0x0192:
            if (r4 == 0) goto L_0x019d
            X5.s r4 = r4.c()
            if (r4 == 0) goto L_0x019d
            r6.E.i(r4)
        L_0x019d:
            T r1 = r1.f144348a
            r4 = r1
            k6.q r4 = (k6.C8450q) r4
            r14.getClass()
            r0.f45685c = r12
            r0.f45686d = r12
            r0.f45687e = r12
            r0.f45688f = r12
            r0.f45689g = r12
            r0.f45690h = r12
            r0.f45691i = r12
            r0.f45692j = r12
            r0.f45695m = r10
            r6 = 0
            r7 = r0
            java.lang.Object r1 = c6.C7096b.a(r2, r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01c0
            return r9
        L_0x01c0:
            c6.a$b r1 = (c6.C7095a.b) r1
            T5.n r0 = r1.e()
            r6.F.k(r0)
            return r1
        L_0x01ca:
            XH.t r0 = new XH.t     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x01d0:
            T r1 = r2.f144348a
            boolean r2 = r1 instanceof Z5.o
            if (r2 == 0) goto L_0x01d9
            r12 = r1
            Z5.o r12 = (Z5.o) r12
        L_0x01d9:
            if (r12 == 0) goto L_0x01e4
            X5.s r1 = r12.c()
            if (r1 == 0) goto L_0x01e4
            r6.E.i(r1)
        L_0x01e4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C7095a.h(k6.h, java.lang.Object, k6.q, T5.j, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(T5.C6704h r10, k6.C8441h r11, java.lang.Object r12, k6.C8450q r13, T5.j r14, dI.C17164e<? super Z5.i> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof c6.C7095a.f
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c6.a$f r0 = (c6.C7095a.f) r0
            int r1 = r0.f45714m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f45714m = r1
            goto L_0x0018
        L_0x0013:
            c6.a$f r0 = new c6.a$f
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f45712k
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f45714m
            r3 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 != r3) goto L_0x004f
            int r10 = r0.f45711j
            java.lang.Object r11 = r0.f45710i
            Z5.j r11 = (Z5.j) r11
            java.lang.Object r12 = r0.f45709h
            T5.j r12 = (T5.j) r12
            java.lang.Object r13 = r0.f45708g
            k6.q r13 = (k6.C8450q) r13
            java.lang.Object r14 = r0.f45707f
            java.lang.Object r2 = r0.f45706e
            k6.h r2 = (k6.C8441h) r2
            java.lang.Object r4 = r0.f45705d
            T5.h r4 = (T5.C6704h) r4
            java.lang.Object r5 = r0.f45704c
            c6.a r5 = (c6.C7095a) r5
            XH.y.b(r15)
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r6
            r7 = r2
            r2 = r11
            r11 = r7
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x0095
        L_0x004f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0057:
            XH.y.b(r15)
            r15 = 0
            r5 = r9
        L_0x005c:
            T5.r r2 = r5.f45665a
            XH.v r15 = r10.m(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b5
            java.lang.Object r2 = r15.c()
            Z5.j r2 = (Z5.j) r2
            java.lang.Object r15 = r15.d()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.h(r11, r2, r13)
            r0.f45704c = r5
            r0.f45705d = r10
            r0.f45706e = r11
            r0.f45707f = r12
            r0.f45708g = r13
            r0.f45709h = r14
            r0.f45710i = r2
            r0.f45711j = r15
            r0.f45714m = r3
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r6
        L_0x0095:
            Z5.i r15 = (Z5.i) r15
            r14.g(r11, r2, r13, r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009d
            return r15
        L_0x009d:
            r15 = r0
            r0 = r4
            goto L_0x005c
        L_0x00a0:
            r10 = move-exception
            boolean r11 = r15 instanceof Z5.o
            if (r11 == 0) goto L_0x00a8
            Z5.o r15 = (Z5.o) r15
            goto L_0x00a9
        L_0x00a8:
            r15 = 0
        L_0x00a9:
            if (r15 == 0) goto L_0x00b4
            X5.s r11 = r15.c()
            if (r11 == 0) goto L_0x00b4
            r6.E.i(r11)
        L_0x00b4:
            throw r10
        L_0x00b5:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unable to create a fetcher that supports: "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C7095a.i(T5.h, k6.h, java.lang.Object, k6.q, T5.j, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(c6.C7098d.a r14, dI.C17164e<? super k6.C8445l> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof c6.C7095a.g
            if (r0 == 0) goto L_0x0013
            r0 = r15
            c6.a$g r0 = (c6.C7095a.g) r0
            int r1 = r0.f45718f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f45718f = r1
            goto L_0x0018
        L_0x0013:
            c6.a$g r0 = new c6.a$g
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f45716d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f45718f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r14 = r0.f45715c
            c6.d$a r14 = (c6.C7098d.a) r14
            XH.y.b(r15)     // Catch:{ all -> 0x002d }
            goto L_0x0095
        L_0x002d:
            r15 = move-exception
            goto L_0x0096
        L_0x002f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0037:
            XH.y.b(r15)
            k6.h r6 = r14.b()     // Catch:{ all -> 0x002d }
            java.lang.Object r15 = r6.d()     // Catch:{ all -> 0x002d }
            l6.h r2 = r14.a()     // Catch:{ all -> 0x002d }
            T5.j r9 = r6.E.l(r14)     // Catch:{ all -> 0x002d }
            k6.s r4 = r13.f45667c     // Catch:{ all -> 0x002d }
            k6.q r8 = r4.a(r6, r2)     // Catch:{ all -> 0x002d }
            l6.f r4 = r8.j()     // Catch:{ all -> 0x002d }
            r9.l(r6, r15)     // Catch:{ all -> 0x002d }
            T5.r r5 = r13.f45665a     // Catch:{ all -> 0x002d }
            T5.h r5 = r5.getComponents()     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = r5.j(r15, r8)     // Catch:{ all -> 0x002d }
            r9.k(r6, r7)     // Catch:{ all -> 0x002d }
            f6.e r15 = r13.f45668d     // Catch:{ all -> 0x002d }
            f6.d$b r10 = r15.f(r6, r7, r8, r9)     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x0073
            f6.e r15 = r13.f45668d     // Catch:{ all -> 0x002d }
            f6.d$c r15 = r15.a(r6, r10, r2, r4)     // Catch:{ all -> 0x002d }
            goto L_0x0074
        L_0x0073:
            r15 = 0
        L_0x0074:
            if (r15 == 0) goto L_0x007d
            f6.e r0 = r13.f45668d     // Catch:{ all -> 0x002d }
            k6.u r14 = r0.g(r14, r6, r10, r15)     // Catch:{ all -> 0x002d }
            return r14
        L_0x007d:
            dI.i r15 = r6.l()     // Catch:{ all -> 0x002d }
            c6.a$h r2 = new c6.a$h     // Catch:{ all -> 0x002d }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x002d }
            r0.f45715c = r14     // Catch:{ all -> 0x002d }
            r0.f45718f = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r15 = QJ.C16310i.g(r15, r2, r0)     // Catch:{ all -> 0x002d }
            if (r15 != r1) goto L_0x0095
            return r1
        L_0x0095:
            return r15
        L_0x0096:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x00a3
            k6.h r14 = r14.b()
            k6.e r14 = r6.E.c(r14, r15)
            return r14
        L_0x00a3:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C7095a.a(c6.d$a, dI.e):java.lang.Object");
    }
}
