package F2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0004\u000e\u0007\u000b\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"LF2/c;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "LXH/N;", "b", "()V", "LF2/c$d;", "condition", "c", "(LF2/c$d;)V", "LF2/c$b;", "a", "LF2/c$b;", "impl", "d", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6024b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f6025a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LF2/c$a;", "", "<init>", "()V", "Landroid/app/Activity;", "LF2/c;", "a", "(Landroid/app/Activity;)LF2/c;", "", "MASK_FACTOR", "F", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Activity activity) {
            C17542s.j(activity, "<this>");
            c cVar = new c(activity, (DefaultConstructorMarker) null);
            cVar.b();
            return cVar;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R$\u00100\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00107\u001a\u0002018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u00108\u001a\u0004\b&\u00109\"\u0004\b:\u0010\u0013¨\u0006<"}, d2 = {"LF2/c$b;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "LXH/N;", "e", "()V", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "currentTheme", "Landroid/util/TypedValue;", "typedValue", "g", "(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V", "LF2/c$d;", "keepOnScreenCondition", "f", "(LF2/c$d;)V", "a", "Landroid/app/Activity;", "c", "()Landroid/app/Activity;", "", "b", "I", "getFinalThemeId", "()I", "setFinalThemeId", "(I)V", "finalThemeId", "Ljava/lang/Integer;", "getBackgroundResId", "()Ljava/lang/Integer;", "setBackgroundResId", "(Ljava/lang/Integer;)V", "backgroundResId", "d", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "icon", "", "Z", "getHasBackground", "()Z", "setHasBackground", "(Z)V", "hasBackground", "LF2/c$d;", "()LF2/c$d;", "h", "splashScreenWaitPredicate", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f6026a;

        /* renamed from: b  reason: collision with root package name */
        private int f6027b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f6028c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f6029d;

        /* renamed from: e  reason: collision with root package name */
        private Drawable f6030e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f6031f;

        /* renamed from: g  reason: collision with root package name */
        private d f6032g = new d();

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"F2/c$b$a", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f6033a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f6034b;

            a(b bVar, View view) {
                this.f6033a = bVar;
                this.f6034b = view;
            }

            public boolean onPreDraw() {
                if (this.f6033a.d().b()) {
                    return false;
                }
                this.f6034b.getViewTreeObserver().removeOnPreDrawListener(this);
                j unused = this.f6033a.getClass();
                return true;
            }
        }

        public b(Activity activity) {
            C17542s.j(activity, "activity");
            this.f6026a = activity;
        }

        /* access modifiers changed from: private */
        public static final boolean i() {
            return false;
        }

        public final Activity c() {
            return this.f6026a;
        }

        public final d d() {
            return this.f6032g;
        }

        public void e() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f6026a.getTheme();
            boolean z10 = true;
            if (theme.resolveAttribute(a.f6022d, typedValue, true)) {
                this.f6028c = Integer.valueOf(typedValue.resourceId);
                this.f6029d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(a.f6021c, typedValue, true)) {
                this.f6030e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(a.f6020b, typedValue, true)) {
                if (typedValue.resourceId != b.f6023a) {
                    z10 = false;
                }
                this.f6031f = z10;
            }
            C17542s.i(theme, "currentTheme");
            g(theme, typedValue);
        }

        public void f(d dVar) {
            C17542s.j(dVar, "keepOnScreenCondition");
            this.f6032g = dVar;
            View findViewById = this.f6026a.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new a(this, findViewById));
        }

        /* access modifiers changed from: protected */
        public final void g(Resources.Theme theme, TypedValue typedValue) {
            C17542s.j(theme, "currentTheme");
            C17542s.j(typedValue, "typedValue");
            if (theme.resolveAttribute(a.f6019a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f6027b = i10;
                if (i10 != 0) {
                    this.f6026a.setTheme(i10);
                }
            }
        }

        public final void h(d dVar) {
            C17542s.j(dVar, "<set-?>");
            this.f6032g = dVar;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"LF2/c$c;", "LF2/c$b;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/window/SplashScreenView;", "child", "", "j", "(Landroid/window/SplashScreenView;)Z", "LXH/N;", "e", "()V", "LF2/c$d;", "keepOnScreenCondition", "f", "(LF2/c$d;)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "h", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setPreDrawListener", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "preDrawListener", "i", "Z", "getMDecorFitWindowInsets", "()Z", "k", "(Z)V", "mDecorFitWindowInsets", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getHierarchyListener", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "hierarchyListener", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: F2.c$c  reason: collision with other inner class name */
    private static final class C0049c extends b {

        /* renamed from: h  reason: collision with root package name */
        private ViewTreeObserver.OnPreDrawListener f6035h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f6036i = true;

        /* renamed from: j  reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f6037j;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"F2/c$c$a", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "LXH/N;", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewRemoved", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: F2.c$c$a */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0049c f6038a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f6039b;

            a(C0049c cVar, Activity activity) {
                this.f6038a = cVar;
                this.f6039b = activity;
            }

            public void onChildViewAdded(View view, View view2) {
                if (h.a(view2)) {
                    C0049c cVar = this.f6038a;
                    cVar.k(cVar.j(i.a(view2)));
                    ((ViewGroup) this.f6039b.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                }
            }

            public void onChildViewRemoved(View view, View view2) {
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"F2/c$c$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: F2.c$c$b */
        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0049c f6040a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f6041b;

            b(C0049c cVar, View view) {
                this.f6040a = cVar;
                this.f6041b = view;
            }

            public boolean onPreDraw() {
                if (this.f6040a.d().b()) {
                    return false;
                }
                this.f6041b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0049c(Activity activity) {
            super(activity);
            C17542s.j(activity, "activity");
            this.f6037j = new a(this, activity);
        }

        public void e() {
            Resources.Theme theme = c().getTheme();
            C17542s.i(theme, "activity.theme");
            g(theme, new TypedValue());
            ((ViewGroup) c().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f6037j);
        }

        public void f(d dVar) {
            C17542s.j(dVar, "keepOnScreenCondition");
            h(dVar);
            View findViewById = c().findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.f6035h != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f6035h);
            }
            b bVar = new b(this, findViewById);
            this.f6035h = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public final boolean j(SplashScreenView splashScreenView) {
            C17542s.j(splashScreenView, "child");
            WindowInsets a10 = e.a().build();
            C17542s.i(a10, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return a10 != splashScreenView.getRootView().computeSystemWindowInsets(a10, rect) || !rect.isEmpty();
        }

        public final void k(boolean z10) {
            this.f6036i = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LF2/c$d;", "", "", "b", "()Z", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface d {
        boolean b();
    }

    public /* synthetic */ c(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* access modifiers changed from: private */
    public final void b() {
        this.f6025a.e();
    }

    public final void c(d dVar) {
        C17542s.j(dVar, "condition");
        this.f6025a.f(dVar);
    }

    private c(Activity activity) {
        b bVar;
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new C0049c(activity);
        } else {
            bVar = new b(activity);
        }
        this.f6025a = bVar;
    }
}
