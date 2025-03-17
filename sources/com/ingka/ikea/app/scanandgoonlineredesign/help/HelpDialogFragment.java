package com.ingka.ikea.app.scanandgoonlineredesign.help;

import Ez.f;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import Xo.e;
import YH.C16877v;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.activity.v;
import androidx.recyclerview.widget.RecyclerView;
import cl.C11144a;
import com.ingka.ikea.app.uicomponents.fragment.DelegateDialogFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import rw.d;
import tK.C18010a;
import u2.C6012a;
import uj.C11998a;
import uj.C11999b;
import uj.C12000c;
import uj.C12001d;
import uj.C12002e;
import uj.C12003f;
import uj.C12004g;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016XD¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\u00178TX\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/help/HelpDialogFragment;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateDialogFragment;", "", "<init>", "()V", "LXH/N;", "L0", "LLg/d;", "x0", "()LLg/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "w0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "R", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "S", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "", "Luj/a;", "T", "Ljava/util/List;", "content", "U", "LXH/o;", "C0", "pageTitle", "X", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HelpDialogFragment extends DelegateDialogFragment {

    /* renamed from: X  reason: collision with root package name */
    public static final a f91659X = new a((DefaultConstructorMarker) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final int f91660Y = 8;

    /* renamed from: R  reason: collision with root package name */
    private final String f91661R = "scanandgo/dialog/scanningHelpDialog";

    /* renamed from: S  reason: collision with root package name */
    private final C17631a<C16807N> f91662S = new C12003f();

    /* renamed from: T  reason: collision with root package name */
    private final List<C11998a> f91663T = C16877v.q(new C12000c(0, Oo.b.f84525U7, 1, (DefaultConstructorMarker) null), new C12000c(Oo.b.f84425K7, Oo.b.f84415J7), new C12000c(Oo.b.f84405I7, Oo.b.f84465O7), new C11999b(Oo.b.f84435L7, Ez.b.f109496c, Oo.b.f84575Z7), new C11999b(0, Ez.b.f109500g, Oo.b.f84586a8, 1, (DefaultConstructorMarker) null), new C12000c(f.f109687a, f.f109689b), new C11999b(0, Ez.b.f109499f, f.f109691c, 1, (DefaultConstructorMarker) null));

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f91664U = C16825p.b(new C12004g(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/help/HelpDialogFragment$a;", "", "<init>", "()V", "", "DIVIDER_HEIGHT", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/help/HelpDialogFragment$b", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HelpDialogFragment f91665b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(HelpDialogFragment helpDialogFragment) {
            super(true);
            this.f91665b = helpDialogFragment;
        }

        public void handleOnBackPressed() {
            this.f91665b.L0();
        }
    }

    public HelpDialogFragment() {
    }

    /* access modifiers changed from: private */
    public static final C16807N J0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final String K0(HelpDialogFragment helpDialogFragment) {
        return helpDialogFragment.getString(Oo.b.f84565Y7);
    }

    /* access modifiers changed from: private */
    public final void L0() {
        d.a(this, "", "help_fragment_result");
    }

    /* access modifiers changed from: protected */
    public String C0() {
        return (String) this.f91664U.getValue();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        L0();
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Lg.d.q(y0(), this.f91663T, false, (C17642l) null, 6, (Object) null);
        requireActivity().getOnBackPressedDispatcher().i(this, new b(this));
    }

    /* access modifiers changed from: protected */
    public void w0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new C11144a((int) e.a(40), C6012a.c(requireContext(), C18010a.f147420d), false, true, 4, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public Lg.d x0() {
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{new C12001d(), new C12002e()});
    }
}
