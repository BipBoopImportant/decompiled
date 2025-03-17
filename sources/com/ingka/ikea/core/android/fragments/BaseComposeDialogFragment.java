package com.ingka.ikea.core.android.fragments;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.J0;
import U0.o1;
import Vo.b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.compose.ui.window.i;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H%¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J-\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0014@\u0014X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "w0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment$ComposeDialogView;", "x0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment$ComposeDialogView;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "M", "Z", "v0", "()Z", "setTransparentSurface", "(Z)V", "transparentSurface", "ComposeDialogView", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseComposeDialogFragment extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private boolean f94841M;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0014@RX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment$ComposeDialogView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/i;", "Landroid/content/Context;", "context", "<init>", "(Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;Landroid/content/Context;)V", "LXH/N;", "a", "(LU0/m;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(LnI/p;)V", "Landroid/view/Window;", "i", "LXH/o;", "getWindow", "()Landroid/view/Window;", "window", "LU0/r0;", "j", "LU0/r0;", "", "value", "k", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ComposeDialogView extends AbstractComposeView implements i {

        /* renamed from: i  reason: collision with root package name */
        private final C16824o f94842i;

        /* renamed from: j  reason: collision with root package name */
        private final C4899r0<p<C4889m, Integer, C16807N>> f94843j = u1.e((Object) null, (o1) null, 2, (Object) null);

        /* renamed from: k  reason: collision with root package name */
        private boolean f94844k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ BaseComposeDialogFragment f94845l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ComposeDialogView(BaseComposeDialogFragment baseComposeDialogFragment, Context context) {
            super(context, (AttributeSet) null, 0);
            C17542s.j(context, "context");
            this.f94845l = baseComposeDialogFragment;
            this.f94842i = C16825p.b(new c(baseComposeDialogFragment));
        }

        /* access modifiers changed from: private */
        public static final Window l(BaseComposeDialogFragment baseComposeDialogFragment) {
            Window window = baseComposeDialogFragment.requireDialog().getWindow();
            C17542s.g(window);
            return window;
        }

        public void a(C4889m mVar, int i10) {
            mVar.W(-1659144270);
            if (C4895p.J()) {
                C4895p.S(-1659144270, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment.ComposeDialogView.Content (BaseComposeDialogFragment.kt:86)");
            }
            p value = this.f94843j.getValue();
            if (value != null) {
                value.invoke(mVar, 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
        }

        public CharSequence getAccessibilityClassName() {
            String name = ComposeView.class.getName();
            C17542s.i(name, "getName(...)");
            return name;
        }

        /* access modifiers changed from: protected */
        public boolean getShouldCreateCompositionOnAttachedToWindow() {
            return this.f94844k;
        }

        public Window getWindow() {
            return (Window) this.f94842i.getValue();
        }

        public final void setContent(p<? super C4889m, ? super Integer, C16807N> pVar) {
            C17542s.j(pVar, "content");
            this.f94844k = true;
            this.f94843j.setValue(pVar);
            if (isAttachedToWindow()) {
                d();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseComposeDialogFragment f94846a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment$a$a  reason: collision with other inner class name */
        static final class C2114a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseComposeDialogFragment f94847a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment$a$a$a  reason: collision with other inner class name */
            static final class C2115a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ BaseComposeDialogFragment f94848a;

                C2115a(BaseComposeDialogFragment baseComposeDialogFragment) {
                    this.f94848a = baseComposeDialogFragment;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(-835376171, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BaseComposeDialogFragment.kt:55)");
                        }
                        this.f94848a.u0(mVar, 0);
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

            C2114a(BaseComposeDialogFragment baseComposeDialogFragment) {
                this.f94847a = baseComposeDialogFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-470561041, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BaseComposeDialogFragment.kt:54)");
                    }
                    e.e(this.f94847a.v0(), c.e(-835376171, true, new C2115a(this.f94847a), mVar, 54), mVar, 48, 0);
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

        a(BaseComposeDialogFragment baseComposeDialogFragment) {
            this.f94846a = baseComposeDialogFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-775402961, i10, -1, "com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment.onViewCreated.<anonymous>.<anonymous> (BaseComposeDialogFragment.kt:53)");
                }
                C4910x.a(b.c().d(this.f94846a), c.e(-470561041, true, new C2114a(this.f94846a), mVar, 54), mVar, J0.f13770i | 48);
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

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        ComposeDialogView composeDialogView = (ComposeDialogView) view;
        composeDialogView.setViewCompositionStrategy(s1.d.f19581b);
        composeDialogView.setContent(c.c(-775402961, true, new a(this)));
        w0();
    }

    /* access modifiers changed from: protected */
    public abstract void u0(C4889m mVar, int i10);

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f94841M;
    }

    /* access modifiers changed from: protected */
    public void w0() {
    }

    /* renamed from: x0 */
    public final ComposeDialogView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C17542s.i(context, "getContext(...)");
        return new ComposeDialogView(this, context);
    }
}
