package com.ingka.ikea.core.android.fragments;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import Vo.b;
import XH.C16807N;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H%¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\u00020\u00168\u0014XD¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR \u0010 \u001a\u00020\u00168\u0014XD¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001aR \u0010$\u001a\u00020\u00168\u0014XD¢\u0006\u0012\n\u0004\b!\u0010\u0018\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\u001aR \u0010(\u001a\u00020\u00168\u0014XD¢\u0006\u0012\n\u0004\b%\u0010\u0018\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u001a¨\u0006)"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "F0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "O", "Z", "v0", "()Z", "getDrawUnderStatusBar$annotations", "drawUnderStatusBar", "P", "u0", "getDrawUnderNavigationBar$annotations", "drawUnderNavigationBar", "Q", "t0", "getDrawUnderDisplayCutout$annotations", "drawUnderDisplayCutout", "R", "w0", "getHandleImeInsets$annotations", "handleImeInsets", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseComposeFragment extends BaseFragment {

    /* renamed from: O  reason: collision with root package name */
    private final boolean f94849O = true;

    /* renamed from: P  reason: collision with root package name */
    private final boolean f94850P = true;

    /* renamed from: Q  reason: collision with root package name */
    private final boolean f94851Q = true;

    /* renamed from: R  reason: collision with root package name */
    private final boolean f94852R = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseComposeFragment f94853a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.core.android.fragments.BaseComposeFragment$a$a  reason: collision with other inner class name */
        static final class C2116a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseComposeFragment f94854a;

            C2116a(BaseComposeFragment baseComposeFragment) {
                this.f94854a = baseComposeFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1194135779, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BaseComposeFragment.kt:60)");
                    }
                    this.f94854a.D0(mVar, 0);
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

        a(BaseComposeFragment baseComposeFragment) {
            this.f94853a = baseComposeFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-626615331, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeFragment.onViewCreated.<anonymous>.<anonymous> (BaseComposeFragment.kt:59)");
                }
                C4910x.a(b.c().d(this.f94853a), c.e(-1194135779, true, new C2116a(this.f94853a), mVar, 54), mVar, J0.f13770i | 48);
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

    /* access modifiers changed from: protected */
    public abstract void D0(C4889m mVar, int i10);

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
    }

    /* renamed from: F0 */
    public final ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C17542s.i(context, "getContext(...)");
        return new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        ComposeView composeView = (ComposeView) view;
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        e.l(composeView, false, c.c(-626615331, true, new a(this)), 1, (Object) null);
        E0(bundle);
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f94851Q;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f94850P;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f94849O;
    }

    /* access modifiers changed from: protected */
    public boolean w0() {
        return this.f94852R;
    }
}
