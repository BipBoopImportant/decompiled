package c3;

import YH.C16877v;
import YH.X;
import YH.g0;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003;\u0007/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010-\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u00062\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040*2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0*H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lc3/b;", "", "<init>", "()V", "Landroidx/fragment/app/o;", "fragment", "Lc3/b$c;", "b", "(Landroidx/fragment/app/o;)Lc3/b$c;", "", "previousFragmentId", "LXH/N;", "f", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/o;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "o", "(Landroidx/fragment/app/o;Landroidx/fragment/app/o;I)V", "k", "(Landroidx/fragment/app/o;)V", "h", "", "isVisibleToUser", "m", "(Landroidx/fragment/app/o;Z)V", "violatingFragment", "targetFragment", "requestCode", "l", "j", "i", "n", "Lc3/c;", "violation", "e", "(Lc3/c;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "q", "(Lc3/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(Lc3/b$c;Lc3/c;)V", "Ljava/lang/Runnable;", "runnable", "p", "(Landroidx/fragment/app/o;Ljava/lang/Runnable;)V", "Lc3/b$c;", "getDefaultPolicy", "()Lc3/b$c;", "setDefaultPolicy", "(Lc3/b$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f23071a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static c f23072b = c.f23074d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lc3/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_WRONG_NESTED_HIERARCHY", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lc3/b$b;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: c3.b$b  reason: collision with other inner class name */
    public interface C0360b {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc3/b$c;", "", "", "Lc3/b$a;", "flags", "Lc3/b$b;", "listener", "", "", "", "Ljava/lang/Class;", "Lc3/c;", "allowedViolations", "<init>", "(Ljava/util/Set;Lc3/b$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "Lc3/b$b;", "()Lc3/b$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f23073c = new a((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static final c f23074d = new c(g0.d(), (C0360b) null, X.j());

        /* renamed from: a  reason: collision with root package name */
        private final Set<a> f23075a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Set<Class<? extends c>>> f23076b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc3/b$c$a;", "", "<init>", "()V", "Lc3/b$c;", "LAX", "Lc3/b$c;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(Set<? extends a> set, C0360b bVar, Map<String, ? extends Set<Class<? extends c>>> map) {
            C17542s.j(set, "flags");
            C17542s.j(map, "allowedViolations");
            this.f23075a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put((String) next.getKey(), (Set) next.getValue());
            }
            this.f23076b = linkedHashMap;
        }

        public final Set<a> a() {
            return this.f23075a;
        }

        public final C0360b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends c>>> c() {
            return this.f23076b;
        }
    }

    private b() {
    }

    private final c b(C5187o oVar) {
        while (oVar != null) {
            if (oVar.isAdded()) {
                FragmentManager parentFragmentManager = oVar.getParentFragmentManager();
                C17542s.i(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.N0() != null) {
                    c N02 = parentFragmentManager.N0();
                    C17542s.g(N02);
                    return N02;
                }
            }
            oVar = oVar.getParentFragment();
        }
        return f23072b;
    }

    private final void c(c cVar, c cVar2) {
        C5187o a10 = cVar2.a();
        String name = a10.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, cVar2);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            p(a10, new a(name, cVar2));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, c cVar) {
        C17542s.j(cVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, cVar);
        throw cVar;
    }

    private final void e(c cVar) {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + cVar.a().getClass().getName(), cVar);
        }
    }

    public static final void f(C5187o oVar, String str) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(oVar, str);
        b bVar = f23071a;
        bVar.e(fragmentReuseViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.q(b10, oVar.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(b10, fragmentReuseViolation);
        }
    }

    public static final void g(C5187o oVar, ViewGroup viewGroup) {
        C17542s.j(oVar, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(oVar, viewGroup);
        b bVar = f23071a;
        bVar.e(fragmentTagUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.q(b10, oVar.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(b10, fragmentTagUsageViolation);
        }
    }

    public static final void h(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(oVar);
        b bVar = f23071a;
        bVar.e(getRetainInstanceUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(b10, oVar.getClass(), getRetainInstanceUsageViolation.getClass())) {
            bVar.c(b10, getRetainInstanceUsageViolation);
        }
    }

    public static final void i(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(oVar);
        b bVar = f23071a;
        bVar.e(getTargetFragmentRequestCodeUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, oVar.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            bVar.c(b10, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void j(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(oVar);
        b bVar = f23071a;
        bVar.e(getTargetFragmentUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, oVar.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(b10, getTargetFragmentUsageViolation);
        }
    }

    public static final void k(C5187o oVar) {
        C17542s.j(oVar, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(oVar);
        b bVar = f23071a;
        bVar.e(setRetainInstanceUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && bVar.q(b10, oVar.getClass(), setRetainInstanceUsageViolation.getClass())) {
            bVar.c(b10, setRetainInstanceUsageViolation);
        }
    }

    public static final void l(C5187o oVar, C5187o oVar2, int i10) {
        C17542s.j(oVar, "violatingFragment");
        C17542s.j(oVar2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(oVar, oVar2, i10);
        b bVar = f23071a;
        bVar.e(setTargetFragmentUsageViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.q(b10, oVar.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.c(b10, setTargetFragmentUsageViolation);
        }
    }

    public static final void m(C5187o oVar, boolean z10) {
        C17542s.j(oVar, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(oVar, z10);
        b bVar = f23071a;
        bVar.e(setUserVisibleHintViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && bVar.q(b10, oVar.getClass(), setUserVisibleHintViolation.getClass())) {
            bVar.c(b10, setUserVisibleHintViolation);
        }
    }

    public static final void n(C5187o oVar, ViewGroup viewGroup) {
        C17542s.j(oVar, "fragment");
        C17542s.j(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(oVar, viewGroup);
        b bVar = f23071a;
        bVar.e(wrongFragmentContainerViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.q(b10, oVar.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(b10, wrongFragmentContainerViolation);
        }
    }

    public static final void o(C5187o oVar, C5187o oVar2, int i10) {
        C17542s.j(oVar, "fragment");
        C17542s.j(oVar2, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(oVar, oVar2, i10);
        b bVar = f23071a;
        bVar.e(wrongNestedHierarchyViolation);
        c b10 = bVar.b(oVar);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bVar.q(b10, oVar.getClass(), wrongNestedHierarchyViolation.getClass())) {
            bVar.c(b10, wrongNestedHierarchyViolation);
        }
    }

    private final void p(C5187o oVar, Runnable runnable) {
        if (oVar.isAdded()) {
            Handler h10 = oVar.getParentFragmentManager().H0().h();
            if (C17542s.e(h10.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                h10.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    private final boolean q(c cVar, Class<? extends C5187o> cls, Class<? extends c> cls2) {
        Set set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C17542s.e(cls2.getSuperclass(), c.class) || !C16877v.l0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
