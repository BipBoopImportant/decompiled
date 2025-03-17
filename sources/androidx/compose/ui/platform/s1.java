package androidx.compose.ui.platform;

import XH.C16807N;
import XH.C16820k;
import android.view.View;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00062\u00020\u0001:\u0004\u0006\b\t\nJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/s1;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)LnI/a;", "b", "c", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19573a = a.f19574a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/s1$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/s1;", "a", "()Landroidx/compose/ui/platform/s1;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f19574a = new a();

        private a() {
        }

        public final s1 a() {
            return b.f19575b;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/s1$b;", "Landroidx/compose/ui/platform/s1;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)LnI/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements s1 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f19575b = new b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f19576c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C0305b f19577d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ N2.b f19578e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, C0305b bVar, N2.b bVar2) {
                super(0);
                this.f19576c = abstractComposeView;
                this.f19577d = bVar;
                this.f19578e = bVar2;
            }

            public final void invoke() {
                this.f19576c.removeOnAttachStateChangeListener(this.f19577d);
                N2.a.g(this.f19576c, this.f19578e);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/s1$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.s1$b$b  reason: collision with other inner class name */
        public static final class C0305b implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f19579a;

            C0305b(AbstractComposeView abstractComposeView) {
                this.f19579a = abstractComposeView;
            }

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                if (!N2.a.f(this.f19579a)) {
                    this.f19579a.e();
                }
            }
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public static final void c(AbstractComposeView abstractComposeView) {
            abstractComposeView.e();
        }

        public C17631a<C16807N> a(AbstractComposeView abstractComposeView) {
            C0305b bVar = new C0305b(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(bVar);
            t1 t1Var = new t1(abstractComposeView);
            N2.a.a(abstractComposeView, t1Var);
            return new a(abstractComposeView, bVar, t1Var);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/s1$d;", "Landroidx/compose/ui/platform/s1;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)LnI/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements s1 {

        /* renamed from: b  reason: collision with root package name */
        public static final d f19581b = new d();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f19582c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c f19583d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, c cVar) {
                super(0);
                this.f19582c = abstractComposeView;
                this.f19583d = cVar;
            }

            public final void invoke() {
                this.f19582c.removeOnAttachStateChangeListener(this.f19583d);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O<C17631a<C16807N>> f19584c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(O<C17631a<C16807N>> o10) {
                super(0);
                this.f19584c = o10;
            }

            public final void invoke() {
                ((C17631a) this.f19584c.f144348a).invoke();
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/s1$d$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements View.OnAttachStateChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f19585a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ O<C17631a<C16807N>> f19586b;

            c(AbstractComposeView abstractComposeView, O<C17631a<C16807N>> o10) {
                this.f19585a = abstractComposeView;
                this.f19586b = o10;
            }

            public void onViewAttachedToWindow(View view) {
                C5221y a10 = l0.a(this.f19585a);
                AbstractComposeView abstractComposeView = this.f19585a;
                if (a10 != null) {
                    this.f19586b.f144348a = v1.c(abstractComposeView, a10.getLifecycle());
                    this.f19585a.removeOnAttachStateChangeListener(this);
                    return;
                }
                D1.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                throw new C16820k();
            }

            public void onViewDetachedFromWindow(View view) {
            }
        }

        private d() {
        }

        public C17631a<C16807N> a(AbstractComposeView abstractComposeView) {
            if (abstractComposeView.isAttachedToWindow()) {
                C5221y a10 = l0.a(abstractComposeView);
                if (a10 != null) {
                    return v1.c(abstractComposeView, a10.getLifecycle());
                }
                D1.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                throw new C16820k();
            }
            O o10 = new O();
            c cVar = new c(abstractComposeView, o10);
            abstractComposeView.addOnAttachStateChangeListener(cVar);
            o10.f144348a = new a(abstractComposeView, cVar);
            return new b(o10);
        }
    }

    C17631a<C16807N> a(AbstractComposeView abstractComposeView);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/s1$c;", "Landroidx/compose/ui/platform/s1;", "Landroidx/lifecycle/r;", "lifecycle", "<init>", "(Landroidx/lifecycle/r;)V", "Landroidx/lifecycle/y;", "lifecycleOwner", "(Landroidx/lifecycle/y;)V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)LnI/a;", "b", "Landroidx/lifecycle/r;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements s1 {

        /* renamed from: b  reason: collision with root package name */
        private final r f19580b;

        public c(r rVar) {
            this.f19580b = rVar;
        }

        public C17631a<C16807N> a(AbstractComposeView abstractComposeView) {
            return v1.c(abstractComposeView, this.f19580b);
        }

        public c(C5221y yVar) {
            this(yVar.getLifecycle());
        }
    }
}
