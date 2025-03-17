package androidx.fragment.app;

import XH.C16807N;
import YH.C16877v;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C4987b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00132\u00020\u0001:\u0004=A25B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u001cJ\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010\u001cJ%\u00105\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010)\u001a\u00020\u0017H&¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0010¢\u0006\u0004\b7\u0010 J\u0015\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/a0;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/o;", "fragment", "Landroidx/fragment/app/a0$d;", "o", "(Landroidx/fragment/app/o;)Landroidx/fragment/app/a0$d;", "p", "Landroidx/fragment/app/a0$d$b;", "finalState", "Landroidx/fragment/app/a0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/O;", "fragmentStateManager", "LXH/N;", "g", "(Landroidx/fragment/app/a0$d$b;Landroidx/fragment/app/a0$d$a;Landroidx/fragment/app/O;)V", "", "newPendingOperations", "", "x", "(Ljava/util/List;)Z", "w", "C", "()V", "", "operations", "B", "(Ljava/util/List;)V", "s", "(Landroidx/fragment/app/O;)Landroidx/fragment/app/a0$d$a;", "j", "(Landroidx/fragment/app/a0$d$b;Landroidx/fragment/app/O;)V", "m", "(Landroidx/fragment/app/O;)V", "k", "l", "isPop", "D", "(Z)V", "z", "y", "()Z", "r", "n", "operation", "c", "(Landroidx/fragment/app/a0$d;)V", "q", "d", "(Ljava/util/List;Z)V", "e", "Landroidx/activity/b;", "backEvent", "A", "(Landroidx/activity/b;)V", "f", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f21998g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f21999a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f22000b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f22001c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f22002d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22003e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22004f;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/a0$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/a0;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/a0;", "Landroidx/fragment/app/b0;", "factory", "b", "(Landroid/view/ViewGroup;Landroidx/fragment/app/b0;)Landroidx/fragment/app/a0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a0 a(ViewGroup viewGroup, FragmentManager fragmentManager) {
            C17542s.j(viewGroup, "container");
            C17542s.j(fragmentManager, "fragmentManager");
            b0 M02 = fragmentManager.M0();
            C17542s.i(M02, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, M02);
        }

        public final a0 b(ViewGroup viewGroup, b0 b0Var) {
            C17542s.j(viewGroup, "container");
            C17542s.j(b0Var, "factory");
            Object tag = viewGroup.getTag(b3.b.f22952b);
            if (tag instanceof a0) {
                return (a0) tag;
            }
            a0 a10 = b0Var.a(viewGroup);
            C17542s.i(a10, "factory.createController(container)");
            viewGroup.setTag(b3.b.f22952b, a10);
            return a10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/a0$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "LXH/N;", "g", "(Landroid/view/ViewGroup;)V", "f", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f22005a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f22006b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22007c;

        public final void a(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (!this.f22007c) {
                c(viewGroup);
            }
            this.f22007c = true;
        }

        public boolean b() {
            return this.f22005a;
        }

        public void c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
        }

        public void d(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
        }

        public void e(C4987b bVar, ViewGroup viewGroup) {
            C17542s.j(bVar, "backEvent");
            C17542s.j(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (!this.f22006b) {
                f(viewGroup);
            }
            this.f22006b = true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/a0$c;", "Landroidx/fragment/app/a0$d;", "Landroidx/fragment/app/a0$d$b;", "finalState", "Landroidx/fragment/app/a0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/O;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/a0$d$b;Landroidx/fragment/app/a0$d$a;Landroidx/fragment/app/O;)V", "LXH/N;", "p", "()V", "d", "l", "Landroidx/fragment/app/O;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends d {

        /* renamed from: l  reason: collision with root package name */
        private final O f22008l;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(androidx.fragment.app.a0.d.b r3, androidx.fragment.app.a0.d.a r4, androidx.fragment.app.O r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.C17542s.j(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.C17542s.j(r5, r0)
                androidx.fragment.app.o r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f22008l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.c.<init>(androidx.fragment.app.a0$d$b, androidx.fragment.app.a0$d$a, androidx.fragment.app.O):void");
        }

        public void d() {
            super.d();
            h().mTransitioning = false;
            this.f22008l.m();
        }

        public void p() {
            if (!n()) {
                super.p();
                if (i() == d.a.ADDING) {
                    C5187o k10 = this.f22008l.k();
                    C17542s.i(k10, "fragmentStateManager.fragment");
                    View findFocus = k10.mView.findFocus();
                    if (findFocus != null) {
                        k10.setFocusedView(findFocus);
                        if (FragmentManager.U0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                        }
                    }
                    View requireView = h().requireView();
                    C17542s.i(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        this.f22008l.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
                } else if (i() == d.a.REMOVING) {
                    C5187o k11 = this.f22008l.k();
                    C17542s.i(k11, "fragmentStateManager.fragment");
                    View requireView2 = k11.requireView();
                    C17542s.i(requireView2, "fragment.requireView()");
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + k11);
                    }
                    requireView2.clearFocus();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/a0$d;", "", "Landroidx/fragment/app/a0$d$b;", "finalState", "Landroidx/fragment/app/a0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/o;", "fragment", "<init>", "(Landroidx/fragment/app/a0$d$b;Landroidx/fragment/app/a0$d$a;Landroidx/fragment/app/o;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "LXH/N;", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/a0$d$b;Landroidx/fragment/app/a0$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/a0$b;", "effect", "b", "(Landroidx/fragment/app/a0$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/a0$d$b;", "g", "()Landroidx/fragment/app/a0$d$b;", "setFinalState", "(Landroidx/fragment/app/a0$d$b;)V", "Landroidx/fragment/app/a0$d$a;", "i", "()Landroidx/fragment/app/a0$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/a0$d$a;)V", "Landroidx/fragment/app/o;", "h", "()Landroidx/fragment/app/o;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private b f22009a;

        /* renamed from: b  reason: collision with root package name */
        private a f22010b;

        /* renamed from: c  reason: collision with root package name */
        private final C5187o f22011c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f22012d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private boolean f22013e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f22014f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f22015g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f22016h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f22017i = true;

        /* renamed from: j  reason: collision with root package name */
        private final List<b> f22018j;

        /* renamed from: k  reason: collision with root package name */
        private final List<b> f22019k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/a0$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/a0$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "LXH/N;", "b", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "Companion", "a", "REMOVED", "VISIBLE", "GONE", "INVISIBLE", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            public static final a Companion = null;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/a0$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/a0$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/a0$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/a0$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(View view) {
                    C17542s.j(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.a0$d$b$b  reason: collision with other inner class name */
            public /* synthetic */ class C0339b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f22020a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                static {
                    /*
                        androidx.fragment.app.a0$d$b[] r0 = androidx.fragment.app.a0.d.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.fragment.app.a0$d$b r1 = androidx.fragment.app.a0.d.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.fragment.app.a0$d$b r1 = androidx.fragment.app.a0.d.b.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.fragment.app.a0$d$b r1 = androidx.fragment.app.a0.d.b.GONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.fragment.app.a0$d$b r1 = androidx.fragment.app.a0.d.b.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        f22020a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.d.b.C0339b.<clinit>():void");
                }
            }

            static {
                Companion = new a((DefaultConstructorMarker) null);
            }

            public static final b j(int i10) {
                return Companion.b(i10);
            }

            /* JADX WARNING: type inference failed for: r7v1, types: [android.view.ViewParent] */
            /* JADX WARNING: type inference failed for: r0v8, types: [android.view.ViewParent] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 2 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void b(android.view.View r6, android.view.ViewGroup r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "view"
                    kotlin.jvm.internal.C17542s.j(r6, r0)
                    java.lang.String r0 = "container"
                    kotlin.jvm.internal.C17542s.j(r7, r0)
                    int[] r0 = androidx.fragment.app.a0.d.b.C0339b.f22020a
                    int r1 = r5.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    r2 = 0
                    java.lang.String r3 = "FragmentManager"
                    r4 = 2
                    if (r0 == r1) goto L_0x00bf
                    java.lang.String r1 = "SpecialEffectsController: Setting view "
                    if (r0 == r4) goto L_0x006b
                    r7 = 3
                    if (r0 == r7) goto L_0x0047
                    r7 = 4
                    if (r0 == r7) goto L_0x0025
                    goto L_0x00f1
                L_0x0025:
                    boolean r0 = androidx.fragment.app.FragmentManager.U0(r4)
                    if (r0 == 0) goto L_0x0042
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to INVISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0042:
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x0047:
                    boolean r7 = androidx.fragment.app.FragmentManager.U0(r4)
                    if (r7 == 0) goto L_0x0064
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r1)
                    r7.append(r6)
                    java.lang.String r0 = " to GONE"
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x0064:
                    r7 = 8
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x006b:
                    boolean r0 = androidx.fragment.app.FragmentManager.U0(r4)
                    if (r0 == 0) goto L_0x0088
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to VISIBLE"
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x0088:
                    android.view.ViewParent r0 = r6.getParent()
                    boolean r1 = r0 instanceof android.view.ViewGroup
                    if (r1 == 0) goto L_0x0093
                    r2 = r0
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x0093:
                    if (r2 != 0) goto L_0x00ba
                    boolean r0 = androidx.fragment.app.FragmentManager.U0(r4)
                    if (r0 == 0) goto L_0x00b7
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "SpecialEffectsController: Adding view "
                    r0.append(r1)
                    r0.append(r6)
                    java.lang.String r1 = " to Container "
                    r0.append(r1)
                    r0.append(r7)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.v(r3, r0)
                L_0x00b7:
                    r7.addView(r6)
                L_0x00ba:
                    r7 = 0
                    r6.setVisibility(r7)
                    goto L_0x00f1
                L_0x00bf:
                    android.view.ViewParent r7 = r6.getParent()
                    boolean r0 = r7 instanceof android.view.ViewGroup
                    if (r0 == 0) goto L_0x00ca
                    r2 = r7
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x00ca:
                    if (r2 == 0) goto L_0x00f1
                    boolean r7 = androidx.fragment.app.FragmentManager.U0(r4)
                    if (r7 == 0) goto L_0x00ee
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    java.lang.String r0 = "SpecialEffectsController: Removing view "
                    r7.append(r0)
                    r7.append(r6)
                    java.lang.String r0 = " from container "
                    r7.append(r0)
                    r7.append(r2)
                    java.lang.String r7 = r7.toString()
                    android.util.Log.v(r3, r7)
                L_0x00ee:
                    r2.removeView(r6)
                L_0x00f1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.d.b.b(android.view.View, android.view.ViewGroup):void");
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22021a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.fragment.app.a0$d$a[] r0 = androidx.fragment.app.a0.d.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.fragment.app.a0$d$a r1 = androidx.fragment.app.a0.d.a.ADDING     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.fragment.app.a0$d$a r1 = androidx.fragment.app.a0.d.a.REMOVING     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.fragment.app.a0$d$a r1 = androidx.fragment.app.a0.d.a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f22021a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.d.c.<clinit>():void");
            }
        }

        public d(b bVar, a aVar, C5187o oVar) {
            C17542s.j(bVar, "finalState");
            C17542s.j(aVar, "lifecycleImpact");
            C17542s.j(oVar, "fragment");
            this.f22009a = bVar;
            this.f22010b = aVar;
            this.f22011c = oVar;
            ArrayList arrayList = new ArrayList();
            this.f22018j = arrayList;
            this.f22019k = arrayList;
        }

        public final void a(Runnable runnable) {
            C17542s.j(runnable, "listener");
            this.f22012d.add(runnable);
        }

        public final void b(b bVar) {
            C17542s.j(bVar, "effect");
            this.f22018j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            this.f22016h = false;
            if (!this.f22013e) {
                this.f22013e = true;
                if (this.f22018j.isEmpty()) {
                    d();
                    return;
                }
                for (b a10 : C16877v.t1(this.f22019k)) {
                    a10.a(viewGroup);
                }
            }
        }

        public void d() {
            this.f22016h = false;
            if (!this.f22014f) {
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f22014f = true;
                for (Runnable run : this.f22012d) {
                    run.run();
                }
            }
        }

        public final void e(b bVar) {
            C17542s.j(bVar, "effect");
            if (this.f22018j.remove(bVar) && this.f22018j.isEmpty()) {
                d();
            }
        }

        public final List<b> f() {
            return this.f22019k;
        }

        public final b g() {
            return this.f22009a;
        }

        public final C5187o h() {
            return this.f22011c;
        }

        public final a i() {
            return this.f22010b;
        }

        public final boolean j() {
            return this.f22017i;
        }

        public final boolean k() {
            return this.f22013e;
        }

        public final boolean l() {
            return this.f22014f;
        }

        public final boolean m() {
            return this.f22015g;
        }

        public final boolean n() {
            return this.f22016h;
        }

        public final void o(b bVar, a aVar) {
            C17542s.j(bVar, "finalState");
            C17542s.j(aVar, "lifecycleImpact");
            int i10 = c.f22021a[aVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f22011c + " mFinalState = " + this.f22009a + " -> REMOVED. mLifecycleImpact  = " + this.f22010b + " to REMOVING.");
                    }
                    this.f22009a = b.REMOVED;
                    this.f22010b = a.REMOVING;
                    this.f22017i = true;
                } else if (i10 == 3 && this.f22009a != b.REMOVED) {
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f22011c + " mFinalState = " + this.f22009a + " -> " + bVar + '.');
                    }
                    this.f22009a = bVar;
                }
            } else if (this.f22009a == b.REMOVED) {
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f22011c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f22010b + " to ADDING.");
                }
                this.f22009a = b.VISIBLE;
                this.f22010b = a.ADDING;
                this.f22017i = true;
            }
        }

        public void p() {
            this.f22016h = true;
        }

        public final void q(boolean z10) {
            this.f22017i = z10;
        }

        public final void r(boolean z10) {
            this.f22015g = z10;
        }

        public String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            return "Operation {" + hexString + "} {finalState = " + this.f22009a + " lifecycleImpact = " + this.f22010b + " fragment = " + this.f22011c + '}';
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22022a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22022a = iArr;
        }
    }

    public a0(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        this.f21999a = viewGroup;
    }

    private final void B(List<d> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        for (d f10 : list) {
            C16877v.E(arrayList, f10.f());
        }
        List t12 = C16877v.t1(C16877v.y1(arrayList));
        int size2 = t12.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) t12.get(i11)).g(this.f21999a);
        }
    }

    private final void C() {
        for (d next : this.f22000b) {
            if (next.i() == d.a.ADDING) {
                View requireView = next.h().requireView();
                C17542s.i(requireView, "fragment.requireView()");
                next.o(d.b.Companion.b(requireView.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, O o10) {
        synchronized (this.f22000b) {
            try {
                C5187o k10 = o10.k();
                C17542s.i(k10, "fragmentStateManager.fragment");
                d o11 = o(k10);
                if (o11 == null) {
                    if (o10.k().mTransitioning) {
                        C5187o k11 = o10.k();
                        C17542s.i(k11, "fragmentStateManager.fragment");
                        o11 = p(k11);
                    } else {
                        o11 = null;
                    }
                }
                if (o11 != null) {
                    o11.o(bVar, aVar);
                    return;
                }
                c cVar = new c(bVar, aVar, o10);
                this.f22000b.add(cVar);
                cVar.a(new Y(this, cVar));
                cVar.a(new Z(this, cVar));
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h(a0 a0Var, c cVar) {
        C17542s.j(a0Var, "this$0");
        C17542s.j(cVar, "$operation");
        if (a0Var.f22000b.contains(cVar)) {
            d.b g10 = cVar.g();
            View view = cVar.h().mView;
            C17542s.i(view, "operation.fragment.mView");
            g10.b(view, a0Var.f21999a);
        }
    }

    /* access modifiers changed from: private */
    public static final void i(a0 a0Var, c cVar) {
        C17542s.j(a0Var, "this$0");
        C17542s.j(cVar, "$operation");
        a0Var.f22000b.remove(cVar);
        a0Var.f22001c.remove(cVar);
    }

    private final d o(C5187o oVar) {
        Object obj;
        Iterator it = this.f22000b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C17542s.e(dVar.h(), oVar) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    private final d p(C5187o oVar) {
        Object obj;
        Iterator it = this.f22001c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C17542s.e(dVar.h(), oVar) && !dVar.k()) {
                break;
            }
        }
        return (d) obj;
    }

    public static final a0 u(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return f21998g.a(viewGroup, fragmentManager);
    }

    public static final a0 v(ViewGroup viewGroup, b0 b0Var) {
        return f21998g.b(viewGroup, b0Var);
    }

    private final boolean w(List<d> list) {
        boolean z10;
        Iterable<d> iterable = list;
        loop0:
        while (true) {
            z10 = true;
            for (d dVar : iterable) {
                if (!dVar.f().isEmpty()) {
                    Iterable<b> f10 = dVar.f();
                    if (!(f10 instanceof Collection) || !((Collection) f10).isEmpty()) {
                        for (b b10 : f10) {
                            if (!b10.b()) {
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (d f11 : iterable) {
                C16877v.E(arrayList, f11.f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> list) {
        boolean z10 = true;
        for (d h10 : list) {
            if (!h10.h().mTransitioning) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(C4987b bVar) {
        C17542s.j(bVar, "backEvent");
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.a());
        }
        ArrayList arrayList = new ArrayList();
        for (d f10 : this.f22001c) {
            C16877v.E(arrayList, f10.f());
        }
        List t12 = C16877v.t1(C16877v.y1(arrayList));
        int size = t12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) t12.get(i10)).e(bVar, this.f21999a);
        }
    }

    public final void D(boolean z10) {
        this.f22003e = z10;
    }

    public final void c(d dVar) {
        C17542s.j(dVar, "operation");
        if (dVar.j()) {
            d.b g10 = dVar.g();
            View requireView = dVar.h().requireView();
            C17542s.i(requireView, "operation.fragment.requireView()");
            g10.b(requireView, this.f21999a);
            dVar.q(false);
        }
    }

    public abstract void d(List<d> list, boolean z10);

    public void e(List<d> list) {
        C17542s.j(list, "operations");
        ArrayList arrayList = new ArrayList();
        for (d f10 : list) {
            C16877v.E(arrayList, f10.f());
        }
        List t12 = C16877v.t1(C16877v.y1(arrayList));
        int size = t12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) t12.get(i10)).d(this.f21999a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(list.get(i11));
        }
        List t13 = C16877v.t1(list);
        int size3 = t13.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) t13.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f22001c);
        e(this.f22001c);
    }

    public final void j(d.b bVar, O o10) {
        C17542s.j(bVar, "finalState");
        C17542s.j(o10, "fragmentStateManager");
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + o10.k());
        }
        g(bVar, d.a.ADDING, o10);
    }

    public final void k(O o10) {
        C17542s.j(o10, "fragmentStateManager");
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + o10.k());
        }
        g(d.b.GONE, d.a.NONE, o10);
    }

    public final void l(O o10) {
        C17542s.j(o10, "fragmentStateManager");
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + o10.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, o10);
    }

    public final void m(O o10) {
        C17542s.j(o10, "fragmentStateManager");
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + o10.k());
        }
        g(d.b.VISIBLE, d.a.NONE, o10);
    }

    public final void n() {
        if (!this.f22004f) {
            if (!this.f21999a.isAttachedToWindow()) {
                q();
                this.f22003e = false;
                return;
            }
            synchronized (this.f22000b) {
                try {
                    List<d> w12 = C16877v.w1(this.f22001c);
                    this.f22001c.clear();
                    for (d dVar : w12) {
                        dVar.r(!this.f22000b.isEmpty() && dVar.h().mTransitioning);
                    }
                    for (d dVar2 : w12) {
                        if (this.f22002d) {
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                            }
                            dVar2.d();
                        } else {
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                            }
                            dVar2.c(this.f21999a);
                        }
                        this.f22002d = false;
                        if (!dVar2.l()) {
                            this.f22001c.add(dVar2);
                        }
                    }
                    if (!this.f22000b.isEmpty()) {
                        C();
                        List w13 = C16877v.w1(this.f22000b);
                        if (!w13.isEmpty()) {
                            this.f22000b.clear();
                            this.f22001c.addAll(w13);
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                            }
                            d(w13, this.f22003e);
                            boolean w10 = w(w13);
                            boolean x10 = x(w13);
                            this.f22002d = x10 && !w10;
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + w10 + " \ntransition = " + x10);
                            }
                            if (!x10) {
                                B(w13);
                                e(w13);
                            } else if (w10) {
                                B(w13);
                                int size = w13.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    c((d) w13.get(i10));
                                }
                            }
                            this.f22003e = false;
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        } else {
                            return;
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                } finally {
                }
            }
        }
    }

    public final void q() {
        String str;
        String str2;
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f21999a.isAttachedToWindow();
        synchronized (this.f22000b) {
            try {
                C();
                B(this.f22000b);
                List<d> w12 = C16877v.w1(this.f22001c);
                for (d r10 : w12) {
                    r10.r(false);
                }
                for (d dVar : w12) {
                    if (FragmentManager.U0(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f21999a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f21999a);
                }
                List<d> w13 = C16877v.w1(this.f22000b);
                for (d r11 : w13) {
                    r11.r(false);
                }
                for (d dVar2 : w13) {
                    if (FragmentManager.U0(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f21999a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f21999a);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f22004f) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f22004f = false;
            n();
        }
    }

    public final d.a s(O o10) {
        C17542s.j(o10, "fragmentStateManager");
        C5187o k10 = o10.k();
        C17542s.i(k10, "fragmentStateManager.fragment");
        d o11 = o(k10);
        d.a aVar = null;
        d.a i10 = o11 != null ? o11.i() : null;
        d p10 = p(k10);
        if (p10 != null) {
            aVar = p10.i();
        }
        int i11 = i10 == null ? -1 : e.f22022a[i10.ordinal()];
        return (i11 == -1 || i11 == 1) ? aVar : i10;
    }

    public final ViewGroup t() {
        return this.f21999a;
    }

    public final boolean y() {
        return !this.f22000b.isEmpty();
    }

    public final void z() {
        C5187o oVar;
        d dVar;
        synchronized (this.f22000b) {
            try {
                C();
                List<d> list = this.f22000b;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    oVar = null;
                    if (!listIterator.hasPrevious()) {
                        dVar = null;
                        break;
                    }
                    dVar = listIterator.previous();
                    d dVar2 = dVar;
                    d.b.a aVar = d.b.Companion;
                    View view = dVar2.h().mView;
                    C17542s.i(view, "operation.fragment.mView");
                    d.b a10 = aVar.a(view);
                    d.b g10 = dVar2.g();
                    d.b bVar = d.b.VISIBLE;
                    if (g10 == bVar && a10 != bVar) {
                        break;
                    }
                }
                d dVar3 = dVar;
                if (dVar3 != null) {
                    oVar = dVar3.h();
                }
                this.f22004f = oVar != null ? oVar.isPostponed() : false;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
