package androidx.navigation.fragment.compose;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import e1.C5292b;
import e1.C5293c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/navigation/fragment/compose/ComposableFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Le1/b;", "D", "LXH/o;", "m0", "()Le1/b;", "composableMethod", "E", "a", "navigation-fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableFragment extends C5187o {

    /* renamed from: E  reason: collision with root package name */
    public static final a f43473E = new a((DefaultConstructorMarker) null);

    /* renamed from: F  reason: collision with root package name */
    public static final int f43474F = 8;

    /* renamed from: D  reason: collision with root package name */
    private final C16824o f43475D = C16825p.b(new b(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/fragment/compose/ComposableFragment$a;", "", "<init>", "()V", "", "FULLY_QUALIFIED_NAME", "Ljava/lang/String;", "navigation-fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le1/b;", "b", "()Le1/b;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C5292b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ComposableFragment f43476c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ComposableFragment composableFragment) {
            super(0);
            this.f43476c = composableFragment;
        }

        /* renamed from: b */
        public final C5292b invoke() {
            String string = this.f43476c.requireArguments().getString("androidx.navigation.fragment.compose.FULLY_QUALIFIED_NAME");
            if (string != null) {
                List Y02 = C15854t.Y0(string, new String[]{"$"}, false, 0, 6, (Object) null);
                return C5293c.f(Class.forName((String) Y02.get(0)), (String) Y02.get(1), new Class[0]);
            }
            throw new IllegalStateException("Instances of ComposableFragment must be created with the factory function ComposableFragment(fullyQualifiedName)");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ComposableFragment f43477c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ ComposableFragment f43478c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ComposableFragment composableFragment) {
                super(2);
                this.f43478c = composableFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-434912179, i10, -1, "androidx.navigation.fragment.compose.ComposableFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (ComposableFragment.kt:61)");
                    }
                    this.f43478c.m0().a(mVar, (Object) null, new Object[0]);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ComposableFragment composableFragment) {
            super(2);
            this.f43477c = composableFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1186066547, i10, -1, "androidx.navigation.fragment.compose.ComposableFragment.onCreateView.<anonymous>.<anonymous> (ComposableFragment.kt:60)");
                }
                C4910x.b(new J0[]{B4.b.a().d(this.f43477c)}, c1.c.b(mVar, -434912179, true, new a(this.f43477c)), mVar, 48);
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

    /* access modifiers changed from: private */
    public final C5292b m0() {
        return (C5292b) this.f43475D.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c1.c.c(-1186066547, true, new c(this)));
        return composeView;
    }
}
