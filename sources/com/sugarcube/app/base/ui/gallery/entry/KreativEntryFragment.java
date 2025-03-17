package com.sugarcube.app.base.ui.gallery.entry;

import BF.C12651b;
import BF.C12652c;
import BF.C12653d;
import BF.C12655f;
import HJ.C15854t;
import JF.T;
import S1.C4820m;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import aF.C13959W;
import android.app.Activity;
import android.util.Log;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.Priority;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tK.Z;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/entry/KreativEntryFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "u0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LBF/f;", "J", "LXH/o;", "t0", "()LBF/f;", "viewModel", "sugarcube_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KreativEntryFragment extends Hilt_KreativEntryFragment implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f124392I = new T();

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f124393J;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KreativEntryFragment f124394a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment$a$a  reason: collision with other inner class name */
        static final class C3056a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ KreativEntryFragment f124395a;

            C3056a(KreativEntryFragment kreativEntryFragment) {
                this.f124395a = kreativEntryFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1406972082, i10, -1, "com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (KreativEntryFragment.kt:104)");
                    }
                    C12651b.b(d1.b.a(this.f124395a.t0().T(), mVar, 0), mVar, 0);
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

        a(KreativEntryFragment kreativEntryFragment) {
            this.f124394a = kreativEntryFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(614041520, i10, -1, "com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment.onCreateView.<anonymous>.<anonymous> (KreativEntryFragment.kt:103)");
                }
                Z.g(false, (C4820m) null, c1.c.e(1406972082, true, new C3056a(this.f124394a), mVar, 54), mVar, 384, 3);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124396a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124396a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124396a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124396a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124397c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f124397c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f124397c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124398c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f124398c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f124398c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f124399c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f124399c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f124399c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f124400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124401d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f124400c = aVar;
            this.f124401d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f124400c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f124401d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f124402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f124403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f124402c = oVar;
            this.f124403d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f124403d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f124402c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public KreativEntryFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f124393J = W.b(this, P.b(C12655f.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public final C12655f t0() {
        return (C12655f) this.f124393J.getValue();
    }

    private final void u0() {
        t0().S().observe(getViewLifecycleOwner(), new b(new C12652c(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N v0(KreativEntryFragment kreativEntryFragment, List list) {
        Priority priority = Priority.DEBUG;
        String str = "navigating to: " + list;
        if (str == null) {
            str = "";
        }
        int i10 = C12653d.f108055a[priority.ordinal()];
        if (i10 == 1) {
            String name = kreativEntryFragment.getClass().getName();
            C17542s.g(name);
            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o12.length() != 0) {
                name = C15854t.P0(o12, "Kt");
            }
            Log.v(name, str + " " + "");
        } else if (i10 == 2) {
            String name2 = kreativEntryFragment.getClass().getName();
            C17542s.g(name2);
            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o13.length() != 0) {
                name2 = C15854t.P0(o13, "Kt");
            }
            Log.d(name2, str + " " + "");
        } else if (i10 == 3) {
            String name3 = kreativEntryFragment.getClass().getName();
            C17542s.g(name3);
            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o14.length() != 0) {
                name3 = C15854t.P0(o14, "Kt");
            }
            Log.i(name3, str + " " + "");
        } else if (i10 == 4) {
            String name4 = kreativEntryFragment.getClass().getName();
            C17542s.g(name4);
            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o15.length() != 0) {
                name4 = C15854t.P0(o15, "Kt");
            }
            Log.w(name4, str + " " + "");
        } else if (i10 == 5) {
            String name5 = kreativEntryFragment.getClass().getName();
            C17542s.g(name5);
            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
            if (o16.length() != 0) {
                name5 = C15854t.P0(o16, "Kt");
            }
            Log.e(name5, str + " " + "");
        } else {
            throw new t();
        }
        C17542s.g(list);
        boolean z10 = false;
        for (Object next : list) {
            C8951o a10 = androidx.navigation.fragment.a.a(kreativEntryFragment);
            C.a a11 = C13959W.f118791a.a();
            if (!z10) {
                a11.j(P.b(Kreativ.Entry.class), true, false);
                z10 = true;
            }
            C16807N n10 = C16807N.f139792a;
            C8951o.f0(a10, next, a11.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124392I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
        r10 = r10.keySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            java.lang.String r10 = "inflater"
            kotlin.jvm.internal.C17542s.j(r9, r10)
            androidx.fragment.app.t r1 = r8.requireActivity()
            java.lang.String r9 = "requireActivity(...)"
            kotlin.jvm.internal.C17542s.i(r1, r9)
            androidx.lifecycle.y r2 = r8.getViewLifecycleOwner()
            java.lang.String r9 = "getViewLifecycleOwner(...)"
            kotlin.jvm.internal.C17542s.i(r2, r9)
            r10 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r6 = 12
            r7 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            com.sugarcube.app.base.ui.utils.SystemUiDelegate.a.a(r0, r1, r2, r3, r4, r5, r6, r7)
            android.os.Bundle r10 = r8.getArguments()
            r11 = 0
            if (r10 == 0) goto L_0x003e
            java.util.Set r10 = r10.keySet()
            if (r10 == 0) goto L_0x003e
            java.util.Collection r10 = (java.util.Collection) r10
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r10 = r10.toArray(r0)
            java.lang.String[] r10 = (java.lang.String[]) r10
            goto L_0x003f
        L_0x003e:
            r10 = r11
        L_0x003f:
            java.lang.String r10 = java.util.Arrays.toString(r10)
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r10, r0)
            android.os.Bundle r0 = r8.getArguments()
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = r0.toString()
            goto L_0x0054
        L_0x0053:
            r0 = r11
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\n                GalleryEntryFragment.arguments\n                "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "\n                "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = "\n            "
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "Sugarcube"
            android.util.Log.d(r0, r10)
            BF.f r10 = r8.t0()
            r10.V()
            r8.u0()
            androidx.compose.ui.platform.ComposeView r10 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r1 = r8.requireContext()
            java.lang.String r0 = "requireContext(...)"
            kotlin.jvm.internal.C17542s.i(r1, r0)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.ui.platform.s1$c r0 = new androidx.compose.ui.platform.s1$c
            androidx.lifecycle.y r1 = r8.getViewLifecycleOwner()
            kotlin.jvm.internal.C17542s.i(r1, r9)
            r0.<init>((androidx.lifecycle.C5221y) r1)
            r10.setViewCompositionStrategy(r0)
            com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment$a r9 = new com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment$a
            r9.<init>(r8)
            r0 = 614041520(0x249987b0, float:6.6583037E-17)
            r1 = 1
            c1.a r9 = c1.c.c(r0, r1, r9)
            JF.C13113u.h(r10, r11, r9, r1, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.entry.KreativEntryFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
