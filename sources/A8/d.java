package A8;

import D8.c;
import XH.C16807N;
import android.app.Application;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001(\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LA8/d;", "", "Landroidx/lifecycle/y;", "appLifecycleOwner", "Landroid/app/Application;", "application", "LB8/a;", "configDownloaderFactory", "", "userId", "LA8/b;", "configuration", "<init>", "(Landroidx/lifecycle/y;Landroid/app/Application;LB8/a;Ljava/lang/String;LA8/b;)V", "LXH/N;", "h", "()V", "LA8/a;", "configRetrieverCallback", "g", "(LA8/a;)V", "a", "Landroidx/lifecycle/y;", "b", "Landroid/app/Application;", "c", "LB8/a;", "d", "Ljava/lang/String;", "e", "LA8/b;", "f", "LA8/a;", "onFirstConfigLoaded", "", "Z", "isFirstDownloadTry", "Lkotlin/Function0;", "LnI/a;", "processConfigCallback", "A8/d$a", "i", "LA8/d$a;", "appLifeCycleObserver", "LD8/c;", "j", "LD8/c;", "logger", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final C5221y f32761a;

    /* renamed from: b  reason: collision with root package name */
    private final Application f32762b;

    /* renamed from: c  reason: collision with root package name */
    private final B8.a f32763c;

    /* renamed from: d  reason: collision with root package name */
    private final String f32764d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f32765e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f32766f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32767g = true;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C17631a<C16807N> f32768h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final a f32769i = new a(this);

    /* renamed from: j  reason: collision with root package name */
    private final c f32770j = new c("ConfigurationRefresher");

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"A8/d$a", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "c", "(Landroidx/lifecycle/y;)V", "onResume", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f32771a;

        public a(d dVar) {
            this.f32771a = dVar;
        }

        public void c(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f32771a.f32768h.invoke();
        }

        public void onResume(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f32771a.h();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f32772c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(0);
            this.f32772c = dVar;
        }

        public final void invoke() {
            if (this.f32772c.f32765e.b() != null) {
                d dVar = this.f32772c;
                a c10 = dVar.f32766f;
                if (c10 != null) {
                    c10.a();
                }
                dVar.f32766f = null;
            }
        }
    }

    public d(C5221y yVar, Application application, B8.a aVar, String str, b bVar) {
        C17542s.j(yVar, "appLifecycleOwner");
        C17542s.j(application, "application");
        C17542s.j(aVar, "configDownloaderFactory");
        C17542s.j(bVar, "configuration");
        this.f32761a = yVar;
        this.f32762b = application;
        this.f32763c = aVar;
        this.f32764d = str;
        this.f32765e = bVar;
    }

    /* access modifiers changed from: private */
    public final void h() {
        if (this.f32765e.d("foreground_refresh_config")) {
            this.f32767g = false;
            this.f32770j.f("Use the new ConfigurationDownloader to download the CS configuration.");
            B8.c a10 = this.f32763c.a(this.f32765e);
            String str = this.f32764d;
            String packageName = this.f32762b.getPackageName();
            C17542s.i(packageName, "application.packageName");
            a10.c(str, packageName, this.f32768h);
        } else if (this.f32767g) {
            this.f32767g = false;
            this.f32770j.f("Use the deprecated ConfigRetrieverTask to download the CS configuration.");
            this.f32763c.b(this.f32764d, this.f32765e, new c(this.f32768h)).execute(new String[]{this.f32762b.getPackageName()});
        }
    }

    /* access modifiers changed from: private */
    public static final void i(C17631a aVar) {
        C17542s.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void g(a aVar) {
        C17542s.j(aVar, "configRetrieverCallback");
        this.f32766f = aVar;
        this.f32761a.getLifecycle().c(this.f32769i);
    }
}
