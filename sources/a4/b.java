package A4;

import YH.C16877v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.r;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import x4.C;
import x4.C8941e;
import x4.C8948l;
import x4.I;
import x4.K;
import x4.v;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006*\u00012\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0015058\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u00106¨\u0006;"}, d2 = {"LA4/b;", "Lx4/I;", "LA4/b$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "", "popUpToIndex", "Lx4/l;", "popUpTo", "", "savedState", "LXH/N;", "s", "(ILx4/l;Z)V", "entry", "q", "(Lx4/l;)V", "Landroidx/fragment/app/DialogFragment;", "p", "(Lx4/l;)Landroidx/fragment/app/DialogFragment;", "j", "(Lx4/l;Z)V", "o", "()LA4/b$b;", "", "entries", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "e", "(Ljava/util/List;Lx4/C;Lx4/I$a;)V", "backStackEntry", "g", "Lx4/K;", "state", "f", "(Lx4/K;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/FragmentManager;", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "A4/b$c", "LA4/b$c;", "observer", "", "Ljava/util/Map;", "transitioningFragments", "h", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@I.b("dialog")
public final class b extends I<C0502b> {

    /* renamed from: h  reason: collision with root package name */
    private static final a f32676h = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final Context f32677c;

    /* renamed from: d  reason: collision with root package name */
    private final FragmentManager f32678d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f32679e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    private final c f32680f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, DialogFragment> f32681g = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LA4/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LA4/b$b;", "Lx4/v;", "Lx4/e;", "Lx4/I;", "fragmentNavigator", "<init>", "(Lx4/I;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "LXH/N;", "J", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "S", "(Ljava/lang/String;)LA4/b$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "m", "Ljava/lang/String;", "_className", "R", "()Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A4.b$b  reason: collision with other inner class name */
    public static class C0502b extends v implements C8941e {

        /* renamed from: m  reason: collision with root package name */
        private String f32682m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0502b(I<? extends C0502b> i10) {
            super((I<? extends v>) i10);
            C17542s.j(i10, "fragmentNavigator");
        }

        public void J(Context context, AttributeSet attributeSet) {
            C17542s.j(context, "context");
            C17542s.j(attributeSet, "attrs");
            super.J(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, g.f32690a);
            C17542s.i(obtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String string = obtainAttributes.getString(g.f32691b);
            if (string != null) {
                S(string);
            }
            obtainAttributes.recycle();
        }

        public final String R() {
            String str = this.f32682m;
            if (str != null) {
                C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final C0502b S(String str) {
            C17542s.j(str, "className");
            this.f32682m = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C0502b)) {
                return false;
            }
            return super.equals(obj) && C17542s.e(this.f32682m, ((C0502b) obj).f32682m);
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this.f32682m;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"A4/b$c", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f32683a;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f32684a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f32684a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: A4.b.c.a.<clinit>():void");
            }
        }

        c(b bVar) {
            this.f32683a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: x4.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: x4.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(androidx.lifecycle.C5221y r5, androidx.lifecycle.r.a r6) {
            /*
                r4 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.C17542s.j(r5, r0)
                java.lang.String r0 = "event"
                kotlin.jvm.internal.C17542s.j(r6, r0)
                int[] r0 = A4.b.c.a.f32684a
                int r6 = r6.ordinal()
                r6 = r0[r6]
                r0 = 1
                if (r6 == r0) goto L_0x0124
                r0 = 2
                r1 = 0
                if (r6 == r0) goto L_0x00e3
                r0 = 3
                if (r6 == r0) goto L_0x006a
                r0 = 4
                if (r6 == r0) goto L_0x0021
                goto L_0x0166
            L_0x0021:
                androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
                A4.b r6 = r4.f32683a
                x4.K r6 = r6.b()
                TJ.P r6 = r6.c()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L_0x0037:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0054
                java.lang.Object r0 = r6.next()
                r2 = r0
                x4.l r2 = (x4.C8948l) r2
                java.lang.String r2 = r2.f()
                java.lang.String r3 = r5.getTag()
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
                if (r2 == 0) goto L_0x0037
                r1 = r0
                goto L_0x0037
            L_0x0054:
                x4.l r1 = (x4.C8948l) r1
                if (r1 == 0) goto L_0x0061
                A4.b r6 = r4.f32683a
                x4.K r6 = r6.b()
                r6.e(r1)
            L_0x0061:
                androidx.lifecycle.r r5 = r5.getLifecycle()
                r5.g(r4)
                goto L_0x0166
            L_0x006a:
                androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
                android.app.Dialog r6 = r5.requireDialog()
                boolean r6 = r6.isShowing()
                if (r6 != 0) goto L_0x0166
                A4.b r6 = r4.f32683a
                x4.K r6 = r6.b()
                TJ.P r6 = r6.b()
                java.lang.Object r6 = r6.getValue()
                java.util.List r6 = (java.util.List) r6
                int r0 = r6.size()
                java.util.ListIterator r0 = r6.listIterator(r0)
            L_0x008e:
                boolean r1 = r0.hasPrevious()
                if (r1 == 0) goto L_0x00ad
                java.lang.Object r1 = r0.previous()
                x4.l r1 = (x4.C8948l) r1
                java.lang.String r1 = r1.f()
                java.lang.String r2 = r5.getTag()
                boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
                if (r1 == 0) goto L_0x008e
                int r0 = r0.nextIndex()
                goto L_0x00ae
            L_0x00ad:
                r0 = -1
            L_0x00ae:
                java.lang.Object r1 = YH.C16877v.z0(r6, r0)
                x4.l r1 = (x4.C8948l) r1
                java.lang.Object r6 = YH.C16877v.K0(r6)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r1)
                if (r6 != 0) goto L_0x00d9
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = "Dialog "
                r6.append(r2)
                r6.append(r5)
                java.lang.String r5 = " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "DialogFragmentNavigator"
                android.util.Log.i(r6, r5)
            L_0x00d9:
                if (r1 == 0) goto L_0x0166
                A4.b r5 = r4.f32683a
                r6 = 0
                r5.s(r0, r1, r6)
                goto L_0x0166
            L_0x00e3:
                androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
                A4.b r6 = r4.f32683a
                x4.K r6 = r6.b()
                TJ.P r6 = r6.c()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
            L_0x00f9:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0116
                java.lang.Object r0 = r6.next()
                r2 = r0
                x4.l r2 = (x4.C8948l) r2
                java.lang.String r2 = r2.f()
                java.lang.String r3 = r5.getTag()
                boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
                if (r2 == 0) goto L_0x00f9
                r1 = r0
                goto L_0x00f9
            L_0x0116:
                x4.l r1 = (x4.C8948l) r1
                if (r1 == 0) goto L_0x0166
                A4.b r5 = r4.f32683a
                x4.K r5 = r5.b()
                r5.e(r1)
                goto L_0x0166
            L_0x0124:
                androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
                A4.b r6 = r4.f32683a
                x4.K r6 = r6.b()
                TJ.P r6 = r6.b()
                java.lang.Object r6 = r6.getValue()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r0 = r6 instanceof java.util.Collection
                if (r0 == 0) goto L_0x0144
                r0 = r6
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0144
                goto L_0x0163
            L_0x0144:
                java.util.Iterator r6 = r6.iterator()
            L_0x0148:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x0163
                java.lang.Object r0 = r6.next()
                x4.l r0 = (x4.C8948l) r0
                java.lang.String r0 = r0.f()
                java.lang.String r1 = r5.getTag()
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r0 == 0) goto L_0x0148
                goto L_0x0166
            L_0x0163:
                r5.dismiss()
            L_0x0166:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A4.b.c.e(androidx.lifecycle.y, androidx.lifecycle.r$a):void");
        }
    }

    public b(Context context, FragmentManager fragmentManager) {
        C17542s.j(context, "context");
        C17542s.j(fragmentManager, "fragmentManager");
        this.f32677c = context;
        this.f32678d = fragmentManager;
    }

    private final DialogFragment p(C8948l lVar) {
        v e10 = lVar.e();
        C17542s.h(e10, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0502b bVar = (C0502b) e10;
        String R10 = bVar.R();
        if (R10.charAt(0) == '.') {
            R10 = this.f32677c.getPackageName() + R10;
        }
        C5187o instantiate = this.f32678d.E0().instantiate(this.f32677c.getClassLoader(), R10);
        C17542s.i(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogFragment.class.isAssignableFrom(instantiate.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) instantiate;
            dialogFragment.setArguments(lVar.c());
            dialogFragment.getLifecycle().c(this.f32680f);
            this.f32681g.put(lVar.f(), dialogFragment);
            return dialogFragment;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.R() + " is not an instance of DialogFragment").toString());
    }

    private final void q(C8948l lVar) {
        p(lVar).show(this.f32678d, lVar.f());
        C8948l lVar2 = (C8948l) C16877v.K0(b().b().getValue());
        boolean l02 = C16877v.l0(b().c().getValue(), lVar2);
        b().l(lVar);
        if (lVar2 != null && !l02) {
            b().e(lVar2);
        }
    }

    /* access modifiers changed from: private */
    public static final void r(b bVar, FragmentManager fragmentManager, C5187o oVar) {
        C17542s.j(bVar, "this$0");
        C17542s.j(fragmentManager, "<anonymous parameter 0>");
        C17542s.j(oVar, "childFragment");
        if (W.a(bVar.f32679e).remove(oVar.getTag())) {
            oVar.getLifecycle().c(bVar.f32680f);
        }
        Map<String, DialogFragment> map = bVar.f32681g;
        W.d(map).remove(oVar.getTag());
    }

    /* access modifiers changed from: private */
    public final void s(int i10, C8948l lVar, boolean z10) {
        C8948l lVar2 = (C8948l) C16877v.z0(b().b().getValue(), i10 - 1);
        boolean l02 = C16877v.l0(b().c().getValue(), lVar2);
        b().i(lVar, z10);
        if (lVar2 != null && !l02) {
            b().e(lVar2);
        }
    }

    public void e(List<C8948l> list, C c10, I.a aVar) {
        C17542s.j(list, "entries");
        if (this.f32678d.b1()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for (C8948l q10 : list) {
            q(q10);
        }
    }

    public void f(K k10) {
        r lifecycle;
        C17542s.j(k10, "state");
        super.f(k10);
        for (C8948l lVar : k10.b().getValue()) {
            DialogFragment dialogFragment = (DialogFragment) this.f32678d.q0(lVar.f());
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f32679e.add(lVar.f());
            } else {
                lifecycle.c(this.f32680f);
            }
        }
        this.f32678d.m(new a(this));
    }

    public void g(C8948l lVar) {
        C17542s.j(lVar, "backStackEntry");
        if (this.f32678d.b1()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment = this.f32681g.get(lVar.f());
        if (dialogFragment == null) {
            C5187o q02 = this.f32678d.q0(lVar.f());
            dialogFragment = q02 instanceof DialogFragment ? (DialogFragment) q02 : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().g(this.f32680f);
            dialogFragment.dismiss();
        }
        p(lVar).show(this.f32678d, lVar.f());
        b().g(lVar);
    }

    public void j(C8948l lVar, boolean z10) {
        C17542s.j(lVar, "popUpTo");
        if (this.f32678d.b1()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List value = b().b().getValue();
        int indexOf = value.indexOf(lVar);
        for (C8948l f10 : C16877v.Z0(value.subList(indexOf, value.size()))) {
            C5187o q02 = this.f32678d.q0(f10.f());
            if (q02 != null) {
                ((DialogFragment) q02).dismiss();
            }
        }
        s(indexOf, lVar, z10);
    }

    /* renamed from: o */
    public C0502b a() {
        return new C0502b(this);
    }
}
