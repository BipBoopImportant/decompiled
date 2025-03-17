package com.ingka.ikea.ui.bottomsheetdialog;

import D2.d;
import I0.C4581s;
import I0.r;
import O0.C4755u;
import S1.C4820m;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4910x;
import U0.J0;
import U0.o1;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.v;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.compose.ui.window.i;
import androidx.fragment.app.C5197z;
import c1.c;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import jC.C14615b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import nI.p;
import p1.C5747v0;
import tK.C18025p;
import tK.C18030v;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H%¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0004¢\u0006\u0004\b#\u0010\u0003R/\u0010,\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8B@BX\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0014XD¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00105\u001a\u00020-8\u0014XD¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00101R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\u00020-8\u0014XD¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R,\u0010C\u001a\u00020-*\u00060=R\u00020\u00002\u0006\u0010>\u001a\u00020-8B@BX\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "G0", "B0", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/activity/r;", "C0", "(Landroid/os/Bundle;)Landroidx/activity/r;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "x0", "w0", "Lcom/ingka/ikea/ui/bottomsheetdialog/g;", "<set-?>", "M", "LU0/r0;", "y0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/g;", "F0", "(Lcom/ingka/ikea/ui/bottomsheetdialog/g;)V", "sheetVisibility", "", "N", "Z", "t0", "()Z", "drawUnderStatusBar", "O", "z0", "showTopHandle", "Landroidx/activity/v;", "P", "Landroidx/activity/v;", "hideOnBackPressCallback", "Q", "A0", "skipPartiallyExpanded", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$ComposeDialogView;", "value", "getConsumeWindowInsets", "(Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$ComposeDialogView;)Z", "E0", "(Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$ComposeDialogView;Z)V", "consumeWindowInsets", "a", "ComposeDialogView", "bottom-sheet-dialog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BottomSheetComposeDialogFragment extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C4899r0 f120561M = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: N  reason: collision with root package name */
    private final boolean f120562N = true;

    /* renamed from: O  reason: collision with root package name */
    private final boolean f120563O = true;

    /* renamed from: P  reason: collision with root package name */
    private v f120564P;

    /* renamed from: Q  reason: collision with root package name */
    private final boolean f120565Q = true;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r0\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0014@RX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$ComposeDialogView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/i;", "Landroid/content/Context;", "context", "<init>", "(Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;Landroid/content/Context;)V", "LXH/N;", "a", "(LU0/m;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(LnI/p;)V", "Landroid/view/Window;", "i", "LXH/o;", "getWindow", "()Landroid/view/Window;", "window", "LU0/r0;", "j", "LU0/r0;", "", "value", "k", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "bottom-sheet-dialog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ComposeDialogView extends AbstractComposeView implements i {

        /* renamed from: i  reason: collision with root package name */
        private final C16824o f120566i;

        /* renamed from: j  reason: collision with root package name */
        private final C4899r0<p<C4889m, Integer, C16807N>> f120567j = u1.e((Object) null, (o1) null, 2, (Object) null);

        /* renamed from: k  reason: collision with root package name */
        private boolean f120568k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ BottomSheetComposeDialogFragment f120569l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ComposeDialogView(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment, Context context) {
            super(context, (AttributeSet) null, 0);
            C17542s.j(context, "context");
            this.f120569l = bottomSheetComposeDialogFragment;
            this.f120566i = C16825p.b(new a(bottomSheetComposeDialogFragment));
        }

        /* access modifiers changed from: private */
        public static final Window l(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
            Window window = bottomSheetComposeDialogFragment.requireDialog().getWindow();
            C17542s.g(window);
            return window;
        }

        public void a(C4889m mVar, int i10) {
            mVar.W(1144195249);
            if (C4895p.J()) {
                C4895p.S(1144195249, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.ComposeDialogView.Content (BottomSheetComposeDialogFragment.kt:208)");
            }
            p value = this.f120567j.getValue();
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
            return this.f120568k;
        }

        public Window getWindow() {
            return (Window) this.f120566i.getValue();
        }

        public final void setContent(p<? super C4889m, ? super Integer, C16807N> pVar) {
            C17542s.j(pVar, "content");
            this.f120568k = true;
            this.f120567j.setValue(pVar);
            if (isAttachedToWindow()) {
                d();
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "", "", "requestKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "c", "bottom-sheet-dialog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C3005a f120570c = new C3005a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120571a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f120572b;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a$a;", "", "<init>", "()V", "", "requestKey", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "bottom-sheet-dialog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment$a$a  reason: collision with other inner class name */
        public static final class C3005a {
            public /* synthetic */ C3005a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String str) {
                C17542s.j(str, "requestKey");
                return new a(str, d.a());
            }

            private C3005a() {
            }
        }

        public a(String str, Bundle bundle) {
            C17542s.j(str, "requestKey");
            C17542s.j(bundle, "bundle");
            this.f120571a = str;
            this.f120572b = bundle;
        }

        public final Bundle a() {
            return this.f120572b;
        }

        public final String b() {
            return this.f120571a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f120571a, aVar.f120571a) && C17542s.e(this.f120572b, aVar.f120572b);
        }

        public int hashCode() {
            return (this.f120571a.hashCode() * 31) + this.f120572b.hashCode();
        }

        public String toString() {
            String str = this.f120571a;
            Bundle bundle = this.f120572b;
            return "Result(requestKey=" + str + ", bundle=" + bundle + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BottomSheetComposeDialogFragment f120573a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BottomSheetComposeDialogFragment f120574a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment$b$a$a  reason: collision with other inner class name */
            static final class C3006a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ BottomSheetComposeDialogFragment f120575a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment$b$a$a$a  reason: collision with other inner class name */
                static final class C3007a implements p<C4889m, Integer, C16807N> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ BottomSheetComposeDialogFragment f120576a;

                    C3007a(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
                        this.f120576a = bottomSheetComposeDialogFragment;
                    }

                    public final void a(C4889m mVar, int i10) {
                        if ((i10 & 3) != 2 || !mVar.l()) {
                            if (C4895p.J()) {
                                C4895p.S(-1842702795, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetComposeDialogFragment.kt:126)");
                            }
                            this.f120576a.u0(mVar, 0);
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

                C3006a(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
                    this.f120575a = bottomSheetComposeDialogFragment;
                }

                /* access modifiers changed from: private */
                public static final C16807N c(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
                    bottomSheetComposeDialogFragment.dismiss();
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void b(U0.C4889m r11, int r12) {
                    /*
                        r10 = this;
                        r0 = r12 & 3
                        r1 = 2
                        if (r0 != r1) goto L_0x0010
                        boolean r0 = r11.l()
                        if (r0 != 0) goto L_0x000c
                        goto L_0x0010
                    L_0x000c:
                        r11.L()
                        goto L_0x0081
                    L_0x0010:
                        boolean r0 = U0.C4895p.J()
                        if (r0 == 0) goto L_0x001f
                        r0 = -1
                        java.lang.String r2 = "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetComposeDialogFragment.kt:115)"
                        r3 = 2085352422(0x7c4bf3e6, float:4.2359324E36)
                        U0.C4895p.S(r3, r12, r0, r2)
                    L_0x001f:
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r12 = r10.f120575a
                        boolean r12 = r12.A0()
                        r0 = 0
                        r2 = 0
                        O0.F0 r5 = O0.C4725e0.l(r12, r0, r11, r2, r1)
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r12 = r10.f120575a
                        com.ingka.ikea.ui.bottomsheetdialog.g r3 = r12.y0()
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r12 = r10.f120575a
                        boolean r4 = r12.z0()
                        r12 = -1931052074(0xffffffff8ce67bd6, float:-3.5511642E-31)
                        r11.W(r12)
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r12 = r10.f120575a
                        boolean r12 = r11.F(r12)
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r0 = r10.f120575a
                        java.lang.Object r1 = r11.D()
                        if (r12 != 0) goto L_0x0053
                        U0.m$a r12 = U0.C4889m.f14007a
                        java.lang.Object r12 = r12.a()
                        if (r1 != r12) goto L_0x005b
                    L_0x0053:
                        com.ingka.ikea.ui.bottomsheetdialog.b r1 = new com.ingka.ikea.ui.bottomsheetdialog.b
                        r1.<init>(r0)
                        r11.u(r1)
                    L_0x005b:
                        r6 = r1
                        nI.a r6 = (nI.C17631a) r6
                        r11.P()
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment$b$a$a$a r12 = new com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment$b$a$a$a
                        com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment r0 = r10.f120575a
                        r12.<init>(r0)
                        r0 = 54
                        r1 = -1842702795(0xffffffff922a9635, float:-5.3827686E-28)
                        r2 = 1
                        c1.a r7 = c1.c.e(r1, r2, r12, r11, r0)
                        r9 = 24576(0x6000, float:3.4438E-41)
                        r8 = r11
                        com.ingka.ikea.ui.bottomsheetdialog.f.f(r3, r4, r5, r6, r7, r8, r9)
                        boolean r11 = U0.C4895p.J()
                        if (r11 == 0) goto L_0x0081
                        U0.C4895p.R()
                    L_0x0081:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.b.a.C3006a.b(U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((C4889m) obj, ((Number) obj2).intValue());
                    return C16807N.f139792a;
                }
            }

            a(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
                this.f120574a = bottomSheetComposeDialogFragment;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1433407322, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (BottomSheetComposeDialogFragment.kt:110)");
                    }
                    C4910x.b(new J0[]{r.a().d(Float.valueOf(1.0f)), C4581s.a().d(C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).G0())), C4755u.h().d(Boolean.FALSE)}, c.e(2085352422, true, new C3006a(this.f120574a), mVar, 54), mVar, J0.f13770i | 48);
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

        b(BottomSheetComposeDialogFragment bottomSheetComposeDialogFragment) {
            this.f120573a = bottomSheetComposeDialogFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1676521514, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment.onCreateView.<anonymous>.<anonymous> (BottomSheetComposeDialogFragment.kt:109)");
                }
                C18025p.e(e.h(mVar, 0), (C4820m) null, c.e(-1433407322, true, new a(this.f120573a), mVar, 54), mVar, 384, 2);
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

    private final void E0(ComposeDialogView composeDialogView, boolean z10) {
        composeDialogView.setTag(i1.i.f24337I, Boolean.valueOf(z10));
    }

    private final void F0(g gVar) {
        this.f120561M.setValue(gVar);
    }

    private final void G0() {
        Window window = requireDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(0);
            window.clearFlags(2);
            window.setLayout(-1, -1);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final g y0() {
        return (g) this.f120561M.getValue();
    }

    /* access modifiers changed from: protected */
    public boolean A0() {
        return this.f120565Q;
    }

    /* access modifiers changed from: protected */
    public void B0() {
    }

    /* renamed from: C0 */
    public final androidx.activity.r onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        androidx.activity.r rVar = new androidx.activity.r(requireContext, getTheme());
        rVar.setCancelable(false);
        rVar.setCanceledOnTouchOutside(false);
        return rVar;
    }

    /* access modifiers changed from: protected */
    public abstract a D0();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeDialogView composeDialogView = new ComposeDialogView(this, requireContext);
        composeDialogView.setViewCompositionStrategy(s1.d.f19581b);
        E0(composeDialogView, false);
        composeDialogView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeDialogView.setContent(c.c(1676521514, true, new b(this)));
        return composeDialogView;
    }

    public void onDestroy() {
        this.f120564P = null;
        super.onDestroy();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        a D02 = D0();
        if (D02 != null) {
            C5197z.c(this, D02.b(), D02.a());
        }
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Z().a().a(C14615b.c.f127858b);
        G0();
        B0();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120562N;
    }

    /* access modifiers changed from: protected */
    public abstract void u0(C4889m mVar, int i10);

    /* access modifiers changed from: protected */
    public final void w0() {
        F0(g.Hidden);
    }

    /* access modifiers changed from: protected */
    public final void x0() {
        F0(g.Expanded);
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f120563O;
    }
}
