package lf;

import Lg.c;
import Lg.d;
import Oo.b;
import YH.C16870n;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl.C11101a;
import java.util.List;
import jp.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0003\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Llf/d;", "LLg/a;", "Llf/e;", "", "delegates", "<init>", "([LLg/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "Llf/d$a;", "f", "(Landroid/view/ViewGroup;)Llf/d$a;", "b", "[LLg/a;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lf.d  reason: case insensitive filesystem */
public final class C10021d extends Lg.a<C10022e> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Lg.a<?>[] f75233b;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001e"}, d2 = {"Llf/d$a;", "LLg/c;", "Llf/e;", "Lbl/a;", "binding", "<init>", "(Llf/d;Lbl/a;)V", "viewModel", "", "animation", "LXH/N;", "o", "(Llf/e;Z)V", "n", "()V", "m", "(Llf/e;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "j", "h", "Lbl/a;", "LLg/d;", "LLg/d;", "delegateAdapter", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "animator", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lf.d$a */
    public final class a extends c<C10022e> {

        /* renamed from: h  reason: collision with root package name */
        private final C11101a f75234h;

        /* renamed from: i  reason: collision with root package name */
        private final d f75235i;

        /* renamed from: j  reason: collision with root package name */
        private Animator f75236j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C10021d f75237k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C10021d dVar, C11101a aVar) {
            super((X4.a) aVar, true);
            C17542s.j(aVar, "binding");
            this.f75237k = dVar;
            this.f75234h = aVar;
            this.f75235i = new d((List<? extends Lg.a<?>>) C16870n.c1(dVar.f75233b));
        }

        private final void n() {
            Animator animator = this.f75236j;
            if (animator != null) {
                animator.cancel();
                animator.removeAllListeners();
                this.f75236j = null;
            }
        }

        private final void o(C10022e eVar, boolean z10) {
            int i10 = 0;
            this.f75234h.f90466d.setText(eVar.h() ? eVar.j() : eVar.i());
            n();
            float f10 = 180.0f;
            float f11 = eVar.h() ? 0.0f : 180.0f;
            if (!eVar.h()) {
                f10 = 0.0f;
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f11, f10});
                ofFloat.addUpdateListener(new C10019b(this));
                ofFloat.setDuration(200);
                this.f75236j = ofFloat;
                ofFloat.start();
            } else {
                this.f75234h.f90464b.setRotation(f10);
            }
            RecyclerView recyclerView = this.f75234h.f90465c;
            if (!eVar.h()) {
                i10 = 8;
            }
            recyclerView.setVisibility(i10);
            this.f75234h.f90464b.setContentDescription(eVar.h() ? this.f75234h.f90464b.getContext().getString(b.f84742p) : this.f75234h.f90464b.getContext().getString(b.f84731o));
            this.itemView.requestLayout();
        }

        static /* synthetic */ void p(a aVar, C10022e eVar, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            aVar.o(eVar, z10);
        }

        /* access modifiers changed from: private */
        public static final void q(a aVar, ValueAnimator valueAnimator) {
            C17542s.j(valueAnimator, "it");
            ImageView imageView = aVar.f75234h.f90464b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C17542s.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            imageView.setRotation(((Float) animatedValue).floatValue());
        }

        public void i(View view) {
            C17542s.j(view, "view");
            ((C10022e) g()).n(!((C10022e) g()).h());
            p(this, (C10022e) g(), false, 2, (Object) null);
        }

        public void j() {
            Animator animator = this.f75236j;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f75236j;
            if (animator2 != null) {
                animator2.removeAllListeners();
            }
            this.f75236j = null;
            super.j();
        }

        /* renamed from: m */
        public void c(C10022e eVar) {
            C17542s.j(eVar, "viewModel");
            super.c(eVar);
            d.q(this.f75235i, eVar.g(), false, (C17642l) null, 6, (Object) null);
            this.f75234h.f90465c.setAdapter(this.f75235i);
            this.f75234h.f90465c.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
            this.f75234h.f90466d.setOnClickListener(new C10020c(this));
            o(eVar, false);
        }
    }

    public C10021d(Lg.a<?>... aVarArr) {
        C17542s.j(aVarArr, "delegates");
        this.f75233b = aVarArr;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof C10022e;
    }

    /* renamed from: f */
    public a d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        C11101a c10 = C11101a.c(h.a(viewGroup), viewGroup, false);
        C17542s.i(c10, "inflate(...)");
        return new a(this, c10);
    }
}
