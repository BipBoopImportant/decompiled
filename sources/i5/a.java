package I5;

import H5.m;
import I5.b;
import L5.c;
import N5.p;
import N5.q;
import QJ.C16310i;
import QJ.Q;
import S5.j;
import S5.r;
import S5.t;
import XH.C16807N;
import XH.y;
import YH.C16870n;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 :2\u00020\u0001:\u00022,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u001f\u0010 J-\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H@¢\u0006\u0004\b,\u0010-J0\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"LI5/a;", "LI5/b;", "LB5/h;", "imageLoader", "LS5/t;", "systemCallbacks", "LN5/p;", "requestService", "LS5/r;", "logger", "<init>", "(LB5/h;LS5/t;LN5/p;LS5/r;)V", "LN5/h;", "request", "", "mappedData", "LN5/m;", "_options", "LB5/c;", "eventListener", "LI5/a$b;", "j", "(LN5/h;Ljava/lang/Object;LN5/m;LB5/c;LdI/e;)Ljava/lang/Object;", "LB5/b;", "components", "options", "LH5/h;", "k", "(LB5/b;LN5/h;Ljava/lang/Object;LN5/m;LB5/c;LdI/e;)Ljava/lang/Object;", "LH5/m;", "fetchResult", "i", "(LH5/m;LB5/b;LN5/h;Ljava/lang/Object;LN5/m;LB5/c;LdI/e;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "LQ5/a;", "transformations", "Landroid/graphics/Bitmap;", "h", "(Landroid/graphics/drawable/Drawable;LN5/m;Ljava/util/List;)Landroid/graphics/Bitmap;", "LI5/b$a;", "chain", "LN5/i;", "a", "(LI5/b$a;LdI/e;)Ljava/lang/Object;", "result", "l", "(LI5/a$b;LN5/h;LN5/m;LB5/c;LdI/e;)Ljava/lang/Object;", "LB5/h;", "b", "LS5/t;", "c", "LN5/p;", "LL5/d;", "d", "LL5/d;", "memoryCacheService", "e", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0581a f36857e = new C0581a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final B5.h f36858a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f36859b;

    /* renamed from: c  reason: collision with root package name */
    private final p f36860c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final L5.d f36861d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LI5/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: I5.a$a  reason: collision with other inner class name */
    public static final class C0581a {
        public /* synthetic */ C0581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0581a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LI5/a$b;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isSampled", "LE5/e;", "dataSource", "", "diskCacheKey", "<init>", "(Landroid/graphics/drawable/Drawable;ZLE5/e;Ljava/lang/String;)V", "a", "(Landroid/graphics/drawable/Drawable;ZLE5/e;Ljava/lang/String;)LI5/a$b;", "Landroid/graphics/drawable/Drawable;", "e", "()Landroid/graphics/drawable/Drawable;", "b", "Z", "f", "()Z", "c", "LE5/e;", "()LE5/e;", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable f36862a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f36863b;

        /* renamed from: c  reason: collision with root package name */
        private final E5.e f36864c;

        /* renamed from: d  reason: collision with root package name */
        private final String f36865d;

        public b(Drawable drawable, boolean z10, E5.e eVar, String str) {
            this.f36862a = drawable;
            this.f36863b = z10;
            this.f36864c = eVar;
            this.f36865d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, E5.e eVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f36862a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f36863b;
            }
            if ((i10 & 4) != 0) {
                eVar = bVar.f36864c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f36865d;
            }
            return bVar.a(drawable, z10, eVar, str);
        }

        public final b a(Drawable drawable, boolean z10, E5.e eVar, String str) {
            return new b(drawable, z10, eVar, str);
        }

        public final E5.e c() {
            return this.f36864c;
        }

        public final String d() {
            return this.f36865d;
        }

        public final Drawable e() {
            return this.f36862a;
        }

        public final boolean f() {
            return this.f36863b;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f36866c;

        /* renamed from: d  reason: collision with root package name */
        Object f36867d;

        /* renamed from: e  reason: collision with root package name */
        Object f36868e;

        /* renamed from: f  reason: collision with root package name */
        Object f36869f;

        /* renamed from: g  reason: collision with root package name */
        Object f36870g;

        /* renamed from: h  reason: collision with root package name */
        Object f36871h;

        /* renamed from: i  reason: collision with root package name */
        Object f36872i;

        /* renamed from: j  reason: collision with root package name */
        Object f36873j;

        /* renamed from: k  reason: collision with root package name */
        int f36874k;

        /* renamed from: l  reason: collision with root package name */
        /* synthetic */ Object f36875l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a f36876m;

        /* renamed from: n  reason: collision with root package name */
        int f36877n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f36876m = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36875l = obj;
            this.f36877n |= Integer.MIN_VALUE;
            return this.f36876m.i((m) null, (B5.b) null, (N5.h) null, (Object) null, (N5.m) null, (B5.c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {126, 130, 148}, m = "execute")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f36878c;

        /* renamed from: d  reason: collision with root package name */
        Object f36879d;

        /* renamed from: e  reason: collision with root package name */
        Object f36880e;

        /* renamed from: f  reason: collision with root package name */
        Object f36881f;

        /* renamed from: g  reason: collision with root package name */
        Object f36882g;

        /* renamed from: h  reason: collision with root package name */
        Object f36883h;

        /* renamed from: i  reason: collision with root package name */
        Object f36884i;

        /* renamed from: j  reason: collision with root package name */
        Object f36885j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f36886k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f36887l;

        /* renamed from: m  reason: collision with root package name */
        int f36888m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f36887l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36886k = obj;
            this.f36888m |= Integer.MIN_VALUE;
            return this.f36887l.j((N5.h) null, (Object) null, (N5.m) null, (B5.c) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LI5/a$b;", "<anonymous>", "(LQJ/Q;)LI5/a$b;"}, k = 3, mv = {2, 0, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
    static final class e extends l implements nI.p<Q, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f36889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f36890d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ O<H5.h> f36891e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ O<B5.b> f36892f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N5.h f36893g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f36894h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ O<N5.m> f36895i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ B5.c f36896j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, O<H5.h> o10, O<B5.b> o11, N5.h hVar, Object obj, O<N5.m> o12, B5.c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f36890d = aVar;
            this.f36891e = o10;
            this.f36892f = o11;
            this.f36893g = hVar;
            this.f36894h = obj;
            this.f36895i = o12;
            this.f36896j = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f36890d, this.f36891e, this.f36892f, this.f36893g, this.f36894h, this.f36895i, this.f36896j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super b> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f36889c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f36890d;
                B5.c cVar = this.f36896j;
                this.f36889c = 1;
                obj = aVar.i((m) this.f36891e.f144348a, (B5.b) this.f36892f.f144348a, this.f36893g, this.f36894h, (N5.m) this.f36895i.f144348a, cVar, this);
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

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f36897c;

        /* renamed from: d  reason: collision with root package name */
        Object f36898d;

        /* renamed from: e  reason: collision with root package name */
        Object f36899e;

        /* renamed from: f  reason: collision with root package name */
        Object f36900f;

        /* renamed from: g  reason: collision with root package name */
        Object f36901g;

        /* renamed from: h  reason: collision with root package name */
        Object f36902h;

        /* renamed from: i  reason: collision with root package name */
        Object f36903i;

        /* renamed from: j  reason: collision with root package name */
        int f36904j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f36905k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f36906l;

        /* renamed from: m  reason: collision with root package name */
        int f36907m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f36906l = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36905k = obj;
            this.f36907m |= Integer.MIN_VALUE;
            return this.f36906l.k((B5.b) null, (N5.h) null, (Object) null, (N5.m) null, (B5.c) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {75}, m = "intercept")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f36908c;

        /* renamed from: d  reason: collision with root package name */
        Object f36909d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f36910e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f36911f;

        /* renamed from: g  reason: collision with root package name */
        int f36912g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f36911f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36910e = obj;
            this.f36912g |= Integer.MIN_VALUE;
            return this.f36911f.a((b.a) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LN5/q;", "<anonymous>", "(LQJ/Q;)LN5/q;"}, k = 3, mv = {2, 0, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
    static final class h extends l implements nI.p<Q, C17164e<? super q>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f36913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f36914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ N5.h f36915e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f36916f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N5.m f36917g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ B5.c f36918h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c.b f36919i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b.a f36920j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, N5.h hVar, Object obj, N5.m mVar, B5.c cVar, c.b bVar, b.a aVar2, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f36914d = aVar;
            this.f36915e = hVar;
            this.f36916f = obj;
            this.f36917g = mVar;
            this.f36918h = cVar;
            this.f36919i = bVar;
            this.f36920j = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f36914d, this.f36915e, this.f36916f, this.f36917g, this.f36918h, this.f36919i, this.f36920j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super q> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f36913c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f36914d;
                N5.h hVar = this.f36915e;
                Object obj2 = this.f36916f;
                N5.m mVar = this.f36917g;
                B5.c cVar = this.f36918h;
                this.f36913c = 1;
                obj = aVar.j(hVar, obj2, mVar, cVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) obj;
            this.f36914d.f36859b.c();
            return new q(bVar.e(), this.f36915e, bVar.c(), this.f36914d.f36861d.h(this.f36919i, this.f36915e, bVar) ? this.f36919i : null, bVar.d(), bVar.f(), j.v(this.f36920j));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LI5/a$b;", "<anonymous>", "(LQJ/Q;)LI5/a$b;"}, k = 3, mv = {2, 0, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {246}, m = "invokeSuspend")
    static final class i extends l implements nI.p<Q, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f36921c;

        /* renamed from: d  reason: collision with root package name */
        Object f36922d;

        /* renamed from: e  reason: collision with root package name */
        int f36923e;

        /* renamed from: f  reason: collision with root package name */
        int f36924f;

        /* renamed from: g  reason: collision with root package name */
        int f36925g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f36926h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f36927i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f36928j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ N5.m f36929k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ List<Q5.a> f36930l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ B5.c f36931m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ N5.h f36932n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, b bVar, N5.m mVar, List<? extends Q5.a> list, B5.c cVar, N5.h hVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f36927i = aVar;
            this.f36928j = bVar;
            this.f36929k = mVar;
            this.f36930l = list;
            this.f36931m = cVar;
            this.f36932n = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f36927i, this.f36928j, this.f36929k, this.f36930l, this.f36931m, this.f36932n, eVar);
            iVar.f36926h = obj;
            return iVar;
        }

        public final Object invoke(Q q10, C17164e<? super b> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0059  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f36925g
                r2 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                int r1 = r10.f36924f
                int r3 = r10.f36923e
                java.lang.Object r4 = r10.f36922d
                N5.m r4 = (N5.m) r4
                java.lang.Object r5 = r10.f36921c
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r10.f36926h
                QJ.Q r6 = (QJ.Q) r6
                XH.y.b(r11)
                goto L_0x0076
            L_0x001f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0027:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f36926h
                QJ.Q r11 = (QJ.Q) r11
                I5.a r1 = r10.f36927i
                I5.a$b r3 = r10.f36928j
                android.graphics.drawable.Drawable r3 = r3.e()
                N5.m r4 = r10.f36929k
                java.util.List<Q5.a> r5 = r10.f36930l
                android.graphics.Bitmap r1 = r1.h(r3, r4, r5)
                B5.c r3 = r10.f36931m
                N5.h r4 = r10.f36932n
                r3.i(r4, r1)
                java.util.List<Q5.a> r3 = r10.f36930l
                N5.m r4 = r10.f36929k
                r5 = r3
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
                r9 = r6
                r6 = r11
                r11 = r1
                r1 = r5
                r5 = r3
                r3 = r9
            L_0x0057:
                if (r3 >= r1) goto L_0x007d
                java.lang.Object r7 = r5.get(r3)
                Q5.a r7 = (Q5.a) r7
                O5.i r8 = r4.n()
                r10.f36926h = r6
                r10.f36921c = r5
                r10.f36922d = r4
                r10.f36923e = r3
                r10.f36924f = r1
                r10.f36925g = r2
                java.lang.Object r11 = r7.b(r11, r8, r10)
                if (r11 != r0) goto L_0x0076
                return r0
            L_0x0076:
                android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                QJ.S.g(r6)
                int r3 = r3 + r2
                goto L_0x0057
            L_0x007d:
                B5.c r0 = r10.f36931m
                N5.h r1 = r10.f36932n
                r0.k(r1, r11)
                I5.a$b r2 = r10.f36928j
                N5.h r0 = r10.f36932n
                android.content.Context r0 = r0.l()
                android.content.res.Resources r0 = r0.getResources()
                android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
                r3.<init>(r0, r11)
                r7 = 14
                r8 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                I5.a$b r11 = I5.a.b.b(r2, r3, r4, r5, r6, r7, r8)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: I5.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(B5.h hVar, t tVar, p pVar, r rVar) {
        this.f36858a = hVar;
        this.f36859b = tVar;
        this.f36860c = pVar;
        this.f36861d = new L5.d(hVar, pVar, (r) null);
    }

    /* access modifiers changed from: private */
    public final Bitmap h(Drawable drawable, N5.m mVar, List<? extends Q5.a> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (C16870n.a0(j.q(), S5.a.c(bitmap))) {
                return bitmap;
            }
        }
        return S5.l.f39892a.a(drawable, mVar.f(), mVar.n(), mVar.m(), mVar.c());
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
    public final java.lang.Object i(H5.m r18, B5.b r19, N5.h r20, java.lang.Object r21, N5.m r22, B5.c r23, dI.C17164e<? super I5.a.b> r24) {
        /*
            r17 = this;
            r0 = r24
            boolean r1 = r0 instanceof I5.a.c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            I5.a$c r1 = (I5.a.c) r1
            int r2 = r1.f36877n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f36877n = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            I5.a$c r1 = new I5.a$c
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f36875l
            java.lang.Object r3 = eI.C17187b.f()
            int r4 = r1.f36877n
            r5 = 1
            if (r4 == 0) goto L_0x0062
            if (r4 != r5) goto L_0x005a
            int r4 = r1.f36874k
            java.lang.Object r6 = r1.f36873j
            E5.h r6 = (E5.h) r6
            java.lang.Object r7 = r1.f36872i
            B5.c r7 = (B5.c) r7
            java.lang.Object r8 = r1.f36871h
            N5.m r8 = (N5.m) r8
            java.lang.Object r9 = r1.f36870g
            java.lang.Object r10 = r1.f36869f
            N5.h r10 = (N5.h) r10
            java.lang.Object r11 = r1.f36868e
            B5.b r11 = (B5.b) r11
            java.lang.Object r12 = r1.f36867d
            H5.m r12 = (H5.m) r12
            java.lang.Object r13 = r1.f36866c
            I5.a r13 = (I5.a) r13
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
            B5.h r11 = r13.f36858a
            XH.v r9 = r1.i(r0, r7, r11, r9)
            if (r9 == 0) goto L_0x00e5
            java.lang.Object r11 = r9.c()
            E5.h r11 = (E5.h) r11
            java.lang.Object r9 = r9.d()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r5
            r8.n(r4, r11, r7)
            r10.f36866c = r13
            r10.f36867d = r0
            r10.f36868e = r1
            r10.f36869f = r4
            r10.f36870g = r6
            r10.f36871h = r7
            r10.f36872i = r8
            r10.f36873j = r11
            r10.f36874k = r9
            r10.f36877n = r5
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
            E5.f r0 = (E5.f) r0
            r8.r(r4, r6, r7, r0)
            if (r0 == 0) goto L_0x00e0
            I5.a$b r1 = new I5.a$b
            android.graphics.drawable.Drawable r3 = r0.a()
            boolean r0 = r0.b()
            E5.e r4 = r12.a()
            E5.o r5 = r12.b()
            boolean r6 = r5 instanceof E5.n
            r7 = 0
            if (r6 == 0) goto L_0x00d5
            E5.n r5 = (E5.n) r5
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
        throw new UnsupportedOperationException("Method not decompiled: I5.a.i(H5.m, B5.b, N5.h, java.lang.Object, N5.m, B5.c, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: H5.m} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011d A[Catch:{ all -> 0x00bf }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0134 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0174 A[SYNTHETIC, Splitter:B:54:0x0174] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(N5.h r27, java.lang.Object r28, N5.m r29, B5.c r30, dI.C17164e<? super I5.a.b> r31) {
        /*
            r26 = this;
            r8 = r26
            r0 = r31
            boolean r1 = r0 instanceof I5.a.d
            if (r1 == 0) goto L_0x0018
            r1 = r0
            I5.a$d r1 = (I5.a.d) r1
            int r2 = r1.f36888m
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f36888m = r2
        L_0x0016:
            r0 = r1
            goto L_0x001e
        L_0x0018:
            I5.a$d r1 = new I5.a$d
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r0.f36886k
            java.lang.Object r9 = eI.C17187b.f()
            int r2 = r0.f36888m
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0088
            if (r2 == r3) goto L_0x005b
            if (r2 == r11) goto L_0x003f
            if (r2 != r10) goto L_0x0037
            XH.y.b(r1)
            goto L_0x01cb
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            java.lang.Object r2 = r0.f36882g
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r3 = r0.f36881f
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r4 = r0.f36880e
            B5.c r4 = (B5.c) r4
            java.lang.Object r5 = r0.f36879d
            N5.h r5 = (N5.h) r5
            java.lang.Object r6 = r0.f36878c
            I5.a r6 = (I5.a) r6
            XH.y.b(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0168
        L_0x0058:
            r0 = move-exception
            goto L_0x01ea
        L_0x005b:
            java.lang.Object r2 = r0.f36885j
            kotlin.jvm.internal.O r2 = (kotlin.jvm.internal.O) r2
            java.lang.Object r3 = r0.f36884i
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r4 = r0.f36883h
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r5 = r0.f36882g
            kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
            java.lang.Object r6 = r0.f36881f
            B5.c r6 = (B5.c) r6
            java.lang.Object r7 = r0.f36880e
            java.lang.Object r13 = r0.f36879d
            N5.h r13 = (N5.h) r13
            java.lang.Object r14 = r0.f36878c
            I5.a r14 = (I5.a) r14
            XH.y.b(r1)     // Catch:{ all -> 0x0084 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x0129
        L_0x0084:
            r0 = move-exception
            r2 = r3
            goto L_0x01ea
        L_0x0088:
            XH.y.b(r1)
            kotlin.jvm.internal.O r13 = new kotlin.jvm.internal.O
            r13.<init>()
            r1 = r29
            r13.f144348a = r1
            kotlin.jvm.internal.O r14 = new kotlin.jvm.internal.O
            r14.<init>()
            B5.h r1 = r8.f36858a
            B5.b r1 = r1.getComponents()
            r14.f144348a = r1
            kotlin.jvm.internal.O r15 = new kotlin.jvm.internal.O
            r15.<init>()
            N5.p r1 = r8.f36860c     // Catch:{ all -> 0x00bf }
            T r2 = r13.f144348a     // Catch:{ all -> 0x00bf }
            N5.m r2 = (N5.m) r2     // Catch:{ all -> 0x00bf }
            N5.m r1 = r1.h(r2)     // Catch:{ all -> 0x00bf }
            r13.f144348a = r1     // Catch:{ all -> 0x00bf }
            XH.v r1 = r27.w()     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x00c3
            E5.h$a r1 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r1 == 0) goto L_0x00ec
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            r2 = r15
            goto L_0x01ea
        L_0x00c3:
            T r1 = r14.f144348a     // Catch:{ all -> 0x00bf }
            B5.b r1 = (B5.b) r1     // Catch:{ all -> 0x00bf }
            B5.b$a r1 = r1.h()     // Catch:{ all -> 0x00bf }
            XH.v r2 = r27.w()     // Catch:{ all -> 0x00bf }
            r4 = 0
            if (r2 == 0) goto L_0x00d9
            java.util.List r5 = r1.g()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00d9:
            E5.h$a r2 = r27.o()     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00e6
            java.util.List r5 = r1.f()     // Catch:{ all -> 0x00bf }
            r5.add(r4, r2)     // Catch:{ all -> 0x00bf }
        L_0x00e6:
            B5.b r1 = r1.e()     // Catch:{ all -> 0x00bf }
            r14.f144348a = r1     // Catch:{ all -> 0x00bf }
        L_0x00ec:
            T r1 = r14.f144348a     // Catch:{ all -> 0x00bf }
            r2 = r1
            B5.b r2 = (B5.b) r2     // Catch:{ all -> 0x00bf }
            T r1 = r13.f144348a     // Catch:{ all -> 0x00bf }
            r5 = r1
            N5.m r5 = (N5.m) r5     // Catch:{ all -> 0x00bf }
            r0.f36878c = r8     // Catch:{ all -> 0x00bf }
            r7 = r27
            r0.f36879d = r7     // Catch:{ all -> 0x00bf }
            r6 = r28
            r0.f36880e = r6     // Catch:{ all -> 0x00bf }
            r4 = r30
            r0.f36881f = r4     // Catch:{ all -> 0x00bf }
            r0.f36882g = r13     // Catch:{ all -> 0x00bf }
            r0.f36883h = r14     // Catch:{ all -> 0x00bf }
            r0.f36884i = r15     // Catch:{ all -> 0x00bf }
            r0.f36885j = r15     // Catch:{ all -> 0x00bf }
            r0.f36888m = r3     // Catch:{ all -> 0x00bf }
            r1 = r26
            r3 = r27
            r4 = r28
            r6 = r30
            r7 = r0
            java.lang.Object r1 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x011e
            return r9
        L_0x011e:
            r21 = r28
            r6 = r30
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r27
            r14 = r8
        L_0x0129:
            r2.f144348a = r1     // Catch:{ all -> 0x00bf }
            T r1 = r15.f144348a     // Catch:{ all -> 0x00bf }
            r2 = r1
            H5.h r2 = (H5.h) r2     // Catch:{ all -> 0x00bf }
            boolean r4 = r2 instanceof H5.m     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0174
            QJ.M r1 = r13.n()     // Catch:{ all -> 0x00bf }
            I5.a$e r2 = new I5.a$e     // Catch:{ all -> 0x00bf }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00bf }
            r0.f36878c = r14     // Catch:{ all -> 0x00bf }
            r0.f36879d = r13     // Catch:{ all -> 0x00bf }
            r0.f36880e = r6     // Catch:{ all -> 0x00bf }
            r0.f36881f = r3     // Catch:{ all -> 0x00bf }
            r0.f36882g = r15     // Catch:{ all -> 0x00bf }
            r0.f36883h = r12     // Catch:{ all -> 0x00bf }
            r0.f36884i = r12     // Catch:{ all -> 0x00bf }
            r0.f36885j = r12     // Catch:{ all -> 0x00bf }
            r0.f36888m = r11     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = QJ.C16310i.g(r1, r2, r0)     // Catch:{ all -> 0x00bf }
            if (r1 != r9) goto L_0x0164
            return r9
        L_0x0164:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x0168:
            I5.a$b r1 = (I5.a.b) r1     // Catch:{ all -> 0x0058 }
            r15 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r25 = r3
            r3 = r1
            r1 = r25
            goto L_0x0197
        L_0x0174:
            boolean r2 = r2 instanceof H5.g     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x01e4
            I5.a$b r2 = new I5.a$b     // Catch:{ all -> 0x00bf }
            H5.g r1 = (H5.g) r1     // Catch:{ all -> 0x00bf }
            android.graphics.drawable.Drawable r1 = r1.b()     // Catch:{ all -> 0x00bf }
            T r4 = r15.f144348a     // Catch:{ all -> 0x00bf }
            H5.g r4 = (H5.g) r4     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.c()     // Catch:{ all -> 0x00bf }
            T r5 = r15.f144348a     // Catch:{ all -> 0x00bf }
            H5.g r5 = (H5.g) r5     // Catch:{ all -> 0x00bf }
            E5.e r5 = r5.a()     // Catch:{ all -> 0x00bf }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x00bf }
            r1 = r3
            r4 = r13
            r3 = r2
            r2 = r14
        L_0x0197:
            T r5 = r15.f144348a
            boolean r7 = r5 instanceof H5.m
            if (r7 == 0) goto L_0x01a0
            H5.m r5 = (H5.m) r5
            goto L_0x01a1
        L_0x01a0:
            r5 = r12
        L_0x01a1:
            if (r5 == 0) goto L_0x01ac
            E5.o r5 = r5.b()
            if (r5 == 0) goto L_0x01ac
            S5.j.d(r5)
        L_0x01ac:
            T r1 = r1.f144348a
            r5 = r1
            N5.m r5 = (N5.m) r5
            r0.f36878c = r12
            r0.f36879d = r12
            r0.f36880e = r12
            r0.f36881f = r12
            r0.f36882g = r12
            r0.f36883h = r12
            r0.f36884i = r12
            r0.f36885j = r12
            r0.f36888m = r10
            r7 = r0
            java.lang.Object r1 = r2.l(r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01cb
            return r9
        L_0x01cb:
            I5.a$b r1 = (I5.a.b) r1
            android.graphics.drawable.Drawable r0 = r1.e()
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x01d8
            r12 = r0
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
        L_0x01d8:
            if (r12 == 0) goto L_0x01e3
            android.graphics.Bitmap r0 = r12.getBitmap()
            if (r0 == 0) goto L_0x01e3
            r0.prepareToDraw()
        L_0x01e3:
            return r1
        L_0x01e4:
            XH.t r0 = new XH.t     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x01ea:
            T r1 = r2.f144348a
            boolean r2 = r1 instanceof H5.m
            if (r2 == 0) goto L_0x01f3
            r12 = r1
            H5.m r12 = (H5.m) r12
        L_0x01f3:
            if (r12 == 0) goto L_0x01fe
            E5.o r1 = r12.b()
            if (r1 == 0) goto L_0x01fe
            S5.j.d(r1)
        L_0x01fe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.j(N5.h, java.lang.Object, N5.m, B5.c, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(B5.b r10, N5.h r11, java.lang.Object r12, N5.m r13, B5.c r14, dI.C17164e<? super H5.h> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof I5.a.f
            if (r0 == 0) goto L_0x0013
            r0 = r15
            I5.a$f r0 = (I5.a.f) r0
            int r1 = r0.f36907m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36907m = r1
            goto L_0x0018
        L_0x0013:
            I5.a$f r0 = new I5.a$f
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f36905k
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f36907m
            r3 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 != r3) goto L_0x004f
            int r10 = r0.f36904j
            java.lang.Object r11 = r0.f36903i
            H5.i r11 = (H5.i) r11
            java.lang.Object r12 = r0.f36902h
            B5.c r12 = (B5.c) r12
            java.lang.Object r13 = r0.f36901g
            N5.m r13 = (N5.m) r13
            java.lang.Object r14 = r0.f36900f
            java.lang.Object r2 = r0.f36899e
            N5.h r2 = (N5.h) r2
            java.lang.Object r4 = r0.f36898d
            B5.b r4 = (B5.b) r4
            java.lang.Object r5 = r0.f36897c
            I5.a r5 = (I5.a) r5
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
            B5.h r2 = r5.f36858a
            XH.v r15 = r10.j(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b5
            java.lang.Object r2 = r15.c()
            H5.i r2 = (H5.i) r2
            java.lang.Object r15 = r15.d()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.l(r11, r2, r13)
            r0.f36897c = r5
            r0.f36898d = r10
            r0.f36899e = r11
            r0.f36900f = r12
            r0.f36901g = r13
            r0.f36902h = r14
            r0.f36903i = r2
            r0.f36904j = r15
            r0.f36907m = r3
            java.lang.Object r4 = r2.a(r0)
            if (r4 != r1) goto L_0x0091
            return r1
        L_0x0091:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r6
        L_0x0095:
            H5.h r15 = (H5.h) r15
            r14.h(r11, r2, r13, r15)     // Catch:{ all -> 0x00a0 }
            if (r15 == 0) goto L_0x009d
            return r15
        L_0x009d:
            r15 = r0
            r0 = r4
            goto L_0x005c
        L_0x00a0:
            r10 = move-exception
            boolean r11 = r15 instanceof H5.m
            if (r11 == 0) goto L_0x00a8
            H5.m r15 = (H5.m) r15
            goto L_0x00a9
        L_0x00a8:
            r15 = 0
        L_0x00a9:
            if (r15 == 0) goto L_0x00b4
            E5.o r11 = r15.b()
            if (r11 == 0) goto L_0x00b4
            S5.j.d(r11)
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
        throw new UnsupportedOperationException("Method not decompiled: I5.a.k(B5.b, N5.h, java.lang.Object, N5.m, B5.c, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(I5.b.a r14, dI.C17164e<? super N5.i> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof I5.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r15
            I5.a$g r0 = (I5.a.g) r0
            int r1 = r0.f36912g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36912g = r1
            goto L_0x0018
        L_0x0013:
            I5.a$g r0 = new I5.a$g
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f36910e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f36912g
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r14 = r0.f36909d
            I5.b$a r14 = (I5.b.a) r14
            java.lang.Object r0 = r0.f36908c
            I5.a r0 = (I5.a) r0
            XH.y.b(r15)     // Catch:{ all -> 0x0032 }
            goto L_0x009f
        L_0x0032:
            r15 = move-exception
            goto L_0x00a0
        L_0x0034:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003c:
            XH.y.b(r15)
            N5.h r6 = r14.b()     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = r6.m()     // Catch:{ all -> 0x0078 }
            O5.i r2 = r14.a()     // Catch:{ all -> 0x0078 }
            B5.c r9 = S5.j.h(r14)     // Catch:{ all -> 0x0078 }
            N5.p r4 = r13.f36860c     // Catch:{ all -> 0x0078 }
            N5.m r8 = r4.f(r6, r2)     // Catch:{ all -> 0x0078 }
            O5.h r4 = r8.m()     // Catch:{ all -> 0x0078 }
            r9.e(r6, r15)     // Catch:{ all -> 0x0078 }
            B5.h r5 = r13.f36858a     // Catch:{ all -> 0x0078 }
            B5.b r5 = r5.getComponents()     // Catch:{ all -> 0x0078 }
            java.lang.Object r7 = r5.g(r15, r8)     // Catch:{ all -> 0x0078 }
            r9.f(r6, r7)     // Catch:{ all -> 0x0078 }
            L5.d r15 = r13.f36861d     // Catch:{ all -> 0x0078 }
            L5.c$b r10 = r15.f(r6, r7, r8, r9)     // Catch:{ all -> 0x0078 }
            if (r10 == 0) goto L_0x007b
            L5.d r15 = r13.f36861d     // Catch:{ all -> 0x0078 }
            L5.c$c r15 = r15.a(r6, r10, r2, r4)     // Catch:{ all -> 0x0078 }
            goto L_0x007c
        L_0x0078:
            r15 = move-exception
            r0 = r13
            goto L_0x00a0
        L_0x007b:
            r15 = 0
        L_0x007c:
            if (r15 == 0) goto L_0x0085
            L5.d r0 = r13.f36861d     // Catch:{ all -> 0x0078 }
            N5.q r14 = r0.g(r14, r6, r10, r15)     // Catch:{ all -> 0x0078 }
            return r14
        L_0x0085:
            QJ.M r15 = r6.v()     // Catch:{ all -> 0x0078 }
            I5.a$h r2 = new I5.a$h     // Catch:{ all -> 0x0078 }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0078 }
            r0.f36908c = r13     // Catch:{ all -> 0x0078 }
            r0.f36909d = r14     // Catch:{ all -> 0x0078 }
            r0.f36912g = r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r15 = QJ.C16310i.g(r15, r2, r0)     // Catch:{ all -> 0x0078 }
            if (r15 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r15
        L_0x00a0:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00af
            N5.p r0 = r0.f36860c
            N5.h r14 = r14.b()
            N5.f r14 = r0.a(r14, r15)
            return r14
        L_0x00af:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.a.a(I5.b$a, dI.e):java.lang.Object");
    }

    public final Object l(b bVar, N5.h hVar, N5.m mVar, B5.c cVar, C17164e<? super b> eVar) {
        List<Q5.a> O10 = hVar.O();
        return O10.isEmpty() ? bVar : ((bVar.e() instanceof BitmapDrawable) || hVar.g()) ? C16310i.g(hVar.N(), new i(this, bVar, mVar, O10, cVar, hVar, (C17164e<? super i>) null), eVar) : bVar;
    }
}
