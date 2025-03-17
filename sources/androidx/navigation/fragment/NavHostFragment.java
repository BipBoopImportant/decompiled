package androidx.navigation.fragment;

import A4.f;
import A4.g;
import D2.d;
import XH.C16796C;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.j0;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import x4.C8935A;
import x4.C8951o;
import x4.H;
import x4.I;
import x4.J;
import x4.N;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001b\u0010\u000f\u001a\u00020\u000e8@X\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002028BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/o;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LXH/N;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lx4/A;", "navHostController", "s0", "(Lx4/A;)V", "Lx4/o;", "navController", "r0", "(Lx4/o;)V", "Lx4/I;", "Landroidx/navigation/fragment/FragmentNavigator$c;", "m0", "()Lx4/I;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "D", "LXH/o;", "q0", "()Lx4/A;", "E", "Landroid/view/View;", "viewParent", "", "F", "I", "graphId", "", "G", "Z", "defaultNavHost", "n0", "()I", "containerId", "o0", "()Lx4/o;", "H", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class NavHostFragment extends C5187o {

    /* renamed from: H  reason: collision with root package name */
    public static final a f43464H = new a((DefaultConstructorMarker) null);

    /* renamed from: D  reason: collision with root package name */
    private final C16824o f43465D = C16825p.b(new b(this));

    /* renamed from: E  reason: collision with root package name */
    private View f43466E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public int f43467F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f43468G;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$a;", "", "<init>", "()V", "Landroidx/fragment/app/o;", "fragment", "Lx4/o;", "a", "(Landroidx/fragment/app/o;)Lx4/o;", "", "KEY_DEFAULT_NAV_HOST", "Ljava/lang/String;", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8951o a(C5187o oVar) {
            Dialog dialog;
            Window window;
            C17542s.j(oVar, "fragment");
            for (C5187o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.getParentFragment()) {
                if (oVar2 instanceof NavHostFragment) {
                    return ((NavHostFragment) oVar2).q0();
                }
                C5187o L02 = oVar2.getParentFragmentManager().L0();
                if (L02 instanceof NavHostFragment) {
                    return ((NavHostFragment) L02).q0();
                }
            }
            View view = oVar.getView();
            if (view != null) {
                return H.b(view);
            }
            View view2 = null;
            DialogFragment dialogFragment = oVar instanceof DialogFragment ? (DialogFragment) oVar : null;
            if (!(dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            if (view2 != null) {
                return H.b(view2);
            }
            throw new IllegalStateException("Fragment " + oVar + " does not have a NavController set");
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/A;", "c", "()Lx4/A;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C8935A> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NavHostFragment f43469c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NavHostFragment navHostFragment) {
            super(0);
            this.f43469c = navHostFragment;
        }

        /* access modifiers changed from: private */
        public static final Bundle e(C8935A a10) {
            C17542s.j(a10, "$this_apply");
            Bundle B02 = a10.B0();
            if (B02 != null) {
                return B02;
            }
            Bundle bundle = Bundle.EMPTY;
            C17542s.i(bundle, "EMPTY");
            return bundle;
        }

        /* access modifiers changed from: private */
        public static final Bundle f(NavHostFragment navHostFragment) {
            C17542s.j(navHostFragment, "this$0");
            if (navHostFragment.f43467F != 0) {
                return d.b(C16796C.a("android-support-nav:fragment:graphId", Integer.valueOf(navHostFragment.f43467F)));
            }
            Bundle bundle = Bundle.EMPTY;
            C17542s.i(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        /* renamed from: c */
        public final C8935A invoke() {
            Context context = this.f43469c.getContext();
            if (context != null) {
                C17542s.i(context, "checkNotNull(context) {\n…s attached\"\n            }");
                C8935A a10 = new C8935A(context);
                NavHostFragment navHostFragment = this.f43469c;
                a10.G0(navHostFragment);
                j0 viewModelStore = navHostFragment.getViewModelStore();
                C17542s.i(viewModelStore, "viewModelStore");
                a10.H0(viewModelStore);
                navHostFragment.s0(a10);
                Bundle b10 = navHostFragment.getSavedStateRegistry().b("android-support-nav:fragment:navControllerState");
                if (b10 != null) {
                    a10.z0(b10);
                }
                navHostFragment.getSavedStateRegistry().h("android-support-nav:fragment:navControllerState", new d(a10));
                Bundle b11 = navHostFragment.getSavedStateRegistry().b("android-support-nav:fragment:graphId");
                if (b11 != null) {
                    navHostFragment.f43467F = b11.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().h("android-support-nav:fragment:graphId", new e(navHostFragment));
                if (navHostFragment.f43467F != 0) {
                    a10.C0(navHostFragment.f43467F);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    int i10 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                    if (i10 != 0) {
                        a10.D0(i10, bundle);
                    }
                }
                return a10;
            }
            throw new IllegalStateException("NavController cannot be created before the fragment is attached");
        }
    }

    private final int n0() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? f.f32689a : id2;
    }

    /* access modifiers changed from: protected */
    @C16814e
    public I<? extends FragmentNavigator.c> m0() {
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C17542s.i(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(requireContext, childFragmentManager, n0());
    }

    public final C8951o o0() {
        return q0();
    }

    public void onAttach(Context context) {
        C17542s.j(context, "context");
        super.onAttach(context);
        if (this.f43468G) {
            getParentFragmentManager().s().A(this).j();
        }
    }

    public void onCreate(Bundle bundle) {
        q0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f43468G = true;
            getParentFragmentManager().s().A(this).j();
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C17542s.i(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(n0());
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f43466E;
        if (view != null && H.b(view) == q0()) {
            H.e(view, (C8951o) null);
        }
        this.f43466E = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        C17542s.j(context, "context");
        C17542s.j(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.f57479g);
        C17542s.i(obtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = obtainStyledAttributes.getResourceId(N.f57480h, 0);
        if (resourceId != 0) {
            this.f43467F = resourceId;
        }
        C16807N n10 = C16807N.f139792a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f32694e);
        C17542s.i(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(g.f32695f, false)) {
            this.f43468G = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f43468G) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            H.e(view, q0());
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                C17542s.h(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f43466E = view2;
                C17542s.g(view2);
                if (view2.getId() == getId()) {
                    View view3 = this.f43466E;
                    C17542s.g(view3);
                    H.e(view3, q0());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final C8935A q0() {
        return (C8935A) this.f43465D.getValue();
    }

    /* access modifiers changed from: protected */
    @C16814e
    public void r0(C8951o oVar) {
        C17542s.j(oVar, "navController");
        J O10 = oVar.O();
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C17542s.i(childFragmentManager, "childFragmentManager");
        O10.c(new A4.b(requireContext, childFragmentManager));
        oVar.O().c(m0());
    }

    /* access modifiers changed from: protected */
    public void s0(C8935A a10) {
        C17542s.j(a10, "navHostController");
        r0(a10);
    }
}
