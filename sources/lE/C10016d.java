package le;

import Lg.c;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ke.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import uI.C18059h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lle/d;", "LLg/a;", "Lle/e;", "Lle/c;", "actions", "<init>", "(Lle/c;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Lle/d$a;", "f", "(Landroid/view/ViewGroup;)Lle/d$a;", "b", "Lle/c;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: le.d  reason: case insensitive filesystem */
public final class C10016d extends Lg.a<C10017e> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C10015c f75219b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lle/d$a;", "LLg/c;", "Lle/e;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lle/d;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(Lle/e;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: le.d$a */
    public final class a extends c<C10017e> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f75220h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C10016d f75221i;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"le/d$a$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: le.d$a$a  reason: collision with other inner class name */
        public static final class C1367a implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f75222a;

            public C1367a(View view) {
                this.f75222a = view;
            }

            public void onViewAttachedToWindow(View view) {
                this.f75222a.removeOnAttachStateChangeListener(this);
                C17542s.h(view, "null cannot be cast to non-null type android.view.ViewGroup");
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt != null) {
                    childAt.setFocusable(false);
                }
            }

            public void onViewDetachedFromWindow(View view) {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: le.d$a$b */
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C10017e f75223a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10016d f75224b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: le.d$a$b$a  reason: collision with other inner class name */
            static final class C1368a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C10017e f75225a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C10016d f75226b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: le.d$a$b$a$a  reason: collision with other inner class name */
                /* synthetic */ class C1369a extends C17540p implements C17631a<C16807N> {
                    C1369a(Object obj) {
                        super(0, obj, C10015c.class, "onSave", "onSave()V", 0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        t();
                        return C16807N.f139792a;
                    }

                    public final void t() {
                        ((C10015c) this.receiver).a();
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: le.d$a$b$a$b  reason: collision with other inner class name */
                /* synthetic */ class C1370b extends C17540p implements C17631a<C16807N> {
                    C1370b(Object obj) {
                        super(0, obj, C10015c.class, "onDelete", "onDelete()V", 0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        t();
                        return C16807N.f139792a;
                    }

                    public final void t() {
                        ((C10015c) this.receiver).onDelete();
                    }
                }

                C1368a(C10017e eVar, C10016d dVar) {
                    this.f75225a = eVar;
                    this.f75226b = dVar;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(2099256323, i10, -1, "com.ingka.ikea.account.impl.ui.delegate.SaveDeleteButtonsDelegate.ViewHolder.bind.<anonymous>.<anonymous> (SaveDeleteButtonsDelegate.kt:56)");
                        }
                        C10017e eVar = this.f75225a;
                        C10015c e10 = this.f75226b.f75219b;
                        mVar.W(1068872584);
                        boolean F10 = mVar.F(e10);
                        Object D10 = mVar.D();
                        if (F10 || D10 == C4889m.f14007a.a()) {
                            D10 = new C1369a(e10);
                            mVar.u(D10);
                        }
                        mVar.P();
                        C17631a aVar = (C17631a) ((C18059h) D10);
                        C10015c e11 = this.f75226b.f75219b;
                        mVar.W(1068874250);
                        boolean F11 = mVar.F(e11);
                        Object D11 = mVar.D();
                        if (F11 || D11 == C4889m.f14007a.a()) {
                            D11 = new C1370b(e11);
                            mVar.u(D11);
                        }
                        mVar.P();
                        d.d(eVar, aVar, (C17631a) ((C18059h) D11), mVar, 0, 0);
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

            b(C10017e eVar, C10016d dVar) {
                this.f75223a = eVar;
                this.f75224b = dVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-497215331, i10, -1, "com.ingka.ikea.account.impl.ui.delegate.SaveDeleteButtonsDelegate.ViewHolder.bind.<anonymous> (SaveDeleteButtonsDelegate.kt:55)");
                    }
                    e.e(false, c1.c.e(2099256323, true, new C1368a(this.f75223a, this.f75224b), mVar, 54), mVar, 48, 1);
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
        public a(C10016d dVar, ComposeView composeView) {
            super((View) composeView, false, 2, (DefaultConstructorMarker) null);
            C17542s.j(composeView, "composeView");
            this.f75221i = dVar;
            this.f75220h = composeView;
            composeView.setFocusable(false);
            composeView.setFocusableInTouchMode(false);
            if (composeView.isAttachedToWindow()) {
                C17542s.h(composeView, "null cannot be cast to non-null type android.view.ViewGroup");
                View childAt = composeView.getChildAt(0);
                if (childAt != null) {
                    childAt.setFocusable(false);
                    return;
                }
                return;
            }
            composeView.addOnAttachStateChangeListener(new C1367a(composeView));
        }

        /* renamed from: l */
        public void c(C10017e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            this.f75220h.setContent(c1.c.c(-497215331, true, new b(eVar, this.f75221i)));
        }
    }

    public C10016d(C10015c cVar) {
        C17542s.j(cVar, "actions");
        this.f75219b = cVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10017e;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
