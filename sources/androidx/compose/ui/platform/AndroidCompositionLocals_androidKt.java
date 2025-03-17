package androidx.compose.ui.platform;

import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.I0;
import U0.J0;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.C16820k;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.C5221y;
import f1.C5308j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;LnI/p;LU0/m;I)V", "Landroid/content/Context;", "context", "LJ1/g;", "n", "(Landroid/content/Context;LU0/m;I)LJ1/g;", "Landroid/content/res/Configuration;", "configuration", "LJ1/d;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LU0/m;I)LJ1/d;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "LU0/I0;", "LU0/I0;", "f", "()LU0/I0;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "d", "i", "LocalResourceIdCache", "LP4/f;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/y;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<Configuration> f19118a = C4910x.d((o1) null, a.f19124c, 1, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private static final I0<Context> f19119b = C4910x.f(b.f19125c);

    /* renamed from: c  reason: collision with root package name */
    private static final I0<J1.d> f19120c = C4910x.f(c.f19126c);

    /* renamed from: d  reason: collision with root package name */
    private static final I0<J1.g> f19121d = C4910x.f(d.f19127c);

    /* renamed from: e  reason: collision with root package name */
    private static final I0<P4.f> f19122e = C4910x.f(e.f19128c);

    /* renamed from: f  reason: collision with root package name */
    private static final I0<View> f19123f = C4910x.f(f.f19129c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "b", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Configuration> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19124c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final Configuration invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "b", "()Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<Context> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f19125c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Context invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LJ1/d;", "b", "()LJ1/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<J1.d> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f19126c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final J1.d invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LJ1/g;", "b", "()LJ1/g;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<J1.g> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f19127c = new d();

        d() {
            super(0);
        }

        /* renamed from: b */
        public final J1.g invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LP4/f;", "b", "()LP4/f;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17631a<P4.f> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f19128c = new e();

        e() {
            super(0);
        }

        /* renamed from: b */
        public final P4.f invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17631a<View> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f19129c = new f();

        f() {
            super(0);
        }

        /* renamed from: b */
        public final View invoke() {
            Void unused = AndroidCompositionLocals_androidKt.l("LocalView");
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "LXH/N;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<Configuration, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Configuration> f19130c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C4899r0<Configuration> r0Var) {
            super(1);
            this.f19130c = r0Var;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f19130c, new Configuration(configuration));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5112j0 f19131c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5112j0 f19132a;

            public a(C5112j0 j0Var) {
                this.f19132a = j0Var;
            }

            public void b() {
                this.f19132a.c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C5112j0 j0Var) {
            super(1);
            this.f19131c = j0Var;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            return new a(this.f19131c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S f19134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19135e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AndroidComposeView androidComposeView, S s10, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f19133c = androidComposeView;
            this.f19134d = s10;
            this.f19135e = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                }
                C5100f0.a(this.f19133c, this.f19134d, this.f19135e, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19137d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f19138e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AndroidComposeView androidComposeView, p<? super C4889m, ? super Integer, C16807N> pVar, int i10) {
            super(2);
            this.f19136c = androidComposeView;
            this.f19137d = pVar;
            this.f19138e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            AndroidCompositionLocals_androidKt.a(this.f19136c, this.f19137d, mVar, M0.a(this.f19138e | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class k extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f19139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f19140d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f19141a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ l f19142b;

            public a(Context context, l lVar) {
                this.f19141a = context;
                this.f19142b = lVar;
            }

            public void b() {
                this.f19141a.getApplicationContext().unregisterComponentCallbacks(this.f19142b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f19139c = context;
            this.f19140d = lVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19139c.getApplicationContext().registerComponentCallbacks(this.f19140d);
            return new a(this.f19139c, this.f19140d);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "LXH/N;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Configuration f19143a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ J1.d f19144b;

        l(Configuration configuration, J1.d dVar) {
            this.f19143a = configuration;
            this.f19144b = dVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.f19144b.c(this.f19143a.updateFrom(configuration));
            this.f19143a.setTo(configuration);
        }

        public void onLowMemory() {
            this.f19144b.a();
        }

        public void onTrimMemory(int i10) {
            this.f19144b.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class m extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f19145c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f19146d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$m$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f19147a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n f19148b;

            public a(Context context, n nVar) {
                this.f19147a = context;
                this.f19148b = nVar;
            }

            public void b() {
                this.f19147a.getApplicationContext().unregisterComponentCallbacks(this.f19148b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f19145c = context;
            this.f19146d = nVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19145c.getApplicationContext().registerComponentCallbacks(this.f19146d);
            return new a(this.f19145c, this.f19146d);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$n", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "LXH/N;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J1.g f19149a;

        n(J1.g gVar) {
            this.f19149a = gVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.f19149a.a();
        }

        public void onLowMemory() {
            this.f19149a.a();
        }

        public void onTrimMemory(int i10) {
            this.f19149a.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        AndroidComposeView androidComposeView2 = androidComposeView;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1396852028);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(androidComposeView2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1396852028, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView.getContext();
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e(new Configuration(context.getResources().getConfiguration()), (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = new g(r0Var);
                k10.u(D11);
            }
            androidComposeView2.setConfigurationChangeObserver((C17642l) D11);
            Object D12 = k10.D();
            if (D12 == aVar.a()) {
                D12 = new S(context);
                k10.u(D12);
            }
            S s10 = (S) D12;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners != null) {
                Object D13 = k10.D();
                if (D13 == aVar.a()) {
                    D13 = C5118l0.b(androidComposeView2, viewTreeOwners.b());
                    k10.u(D13);
                }
                C5112j0 j0Var = (C5112j0) D13;
                C16807N n10 = C16807N.f139792a;
                boolean F10 = k10.F(j0Var);
                Object D14 = k10.D();
                if (F10 || D14 == aVar.a()) {
                    D14 = new h(j0Var);
                    k10.u(D14);
                }
                P.c(n10, (C17642l) D14, k10, 6);
                C4910x.b(new J0[]{f19118a.d(b(r0Var)), f19119b.d(context), j3.g.a().d(viewTreeOwners.a()), f19122e.d(viewTreeOwners.b()), C5308j.d().d(j0Var), f19123f.d(androidComposeView.getView()), f19120c.d(m(context, b(r0Var), k10, 0)), f19121d.d(n(context, k10, 0)), C5100f0.m().d(Boolean.valueOf(((Boolean) k10.Q(C5100f0.n())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, c1.c.e(1471621628, true, new i(androidComposeView2, s10, pVar2), k10, 54), k10, J0.f13770i | 48);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new j(androidComposeView2, pVar2, i12));
        }
    }

    private static final Configuration b(C4899r0<Configuration> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(C4899r0<Configuration> r0Var, Configuration configuration) {
        r0Var.setValue(configuration);
    }

    public static final I0<Configuration> f() {
        return f19118a;
    }

    public static final I0<Context> g() {
        return f19119b;
    }

    public static final I0<C5221y> getLocalLifecycleOwner() {
        return j3.g.a();
    }

    public static final I0<J1.d> h() {
        return f19120c;
    }

    public static final I0<J1.g> i() {
        return f19121d;
    }

    public static final I0<P4.f> j() {
        return f19122e;
    }

    public static final I0<View> k() {
        return f19123f;
    }

    /* access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final J1.d m(Context context, Configuration configuration, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new J1.d();
            mVar.u(D10);
        }
        J1.d dVar = (J1.d) D10;
        Object D11 = mVar.D();
        Configuration configuration2 = D11;
        if (D11 == aVar.a()) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            mVar.u(configuration3);
            configuration2 = configuration3;
        }
        Configuration configuration4 = (Configuration) configuration2;
        Object D12 = mVar.D();
        if (D12 == aVar.a()) {
            D12 = new l(configuration4, dVar);
            mVar.u(D12);
        }
        l lVar = (l) D12;
        boolean F10 = mVar.F(context);
        Object D13 = mVar.D();
        if (F10 || D13 == aVar.a()) {
            D13 = new k(context, lVar);
            mVar.u(D13);
        }
        P.c(dVar, (C17642l) D13, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return dVar;
    }

    private static final J1.g n(Context context, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-1348507246, i10, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        if (D10 == aVar.a()) {
            D10 = new J1.g();
            mVar.u(D10);
        }
        J1.g gVar = (J1.g) D10;
        Object D11 = mVar.D();
        if (D11 == aVar.a()) {
            D11 = new n(gVar);
            mVar.u(D11);
        }
        n nVar = (n) D11;
        boolean F10 = mVar.F(context);
        Object D12 = mVar.D();
        if (F10 || D12 == aVar.a()) {
            D12 = new m(context, nVar);
            mVar.u(D12);
        }
        P.c(gVar, (C17642l) D12, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return gVar;
    }
}
