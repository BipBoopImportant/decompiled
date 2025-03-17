package androidx.fragment.app;

import I2.C4600b0;
import I2.C4608f0;
import I2.L;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16877v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C4987b;
import androidx.core.app.A;
import androidx.fragment.app.C5192u;
import androidx.fragment.app.a0;
import j0.C5445a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\b%&'#()*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ9\u0010\u0015\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$¨\u0006,"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/a0;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/a0$d;", "operations", "LXH/N;", "K", "(Ljava/util/List;)V", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animationInfos", "F", "Landroidx/fragment/app/DefaultSpecialEffectsController$h;", "transitionInfos", "", "isPop", "firstOut", "lastIn", "H", "(Ljava/util/List;ZLandroidx/fragment/app/a0$d;Landroidx/fragment/app/a0$d;)V", "Lj0/a;", "", "Landroid/view/View;", "", "names", "J", "(Lj0/a;Ljava/util/Collection;)V", "", "namedViews", "view", "I", "(Ljava/util/Map;Landroid/view/View;)V", "d", "(Ljava/util/List;Z)V", "a", "b", "c", "e", "f", "g", "h", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends a0 {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$a;", "Landroidx/fragment/app/a0$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animationInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$b;)V", "Landroid/view/ViewGroup;", "container", "LXH/N;", "d", "(Landroid/view/ViewGroup;)V", "c", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "h", "()Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends a0.b {

        /* renamed from: d  reason: collision with root package name */
        private final b f21741d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$a$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$a$a  reason: collision with other inner class name */
        public static final class C0338a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a0.d f21742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewGroup f21743b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f21744c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f21745d;

            C0338a(a0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f21742a = dVar;
                this.f21743b = viewGroup;
                this.f21744c = view;
                this.f21745d = aVar;
            }

            /* access modifiers changed from: private */
            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                C17542s.j(viewGroup, "$container");
                C17542s.j(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().e(aVar);
            }

            public void onAnimationEnd(Animation animation) {
                C17542s.j(animation, "animation");
                ViewGroup viewGroup = this.f21743b;
                viewGroup.post(new C5177e(viewGroup, this.f21744c, this.f21745d));
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f21742a + " has ended.");
                }
            }

            public void onAnimationRepeat(Animation animation) {
                C17542s.j(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C17542s.j(animation, "animation");
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f21742a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            C17542s.j(bVar, "animationInfo");
            this.f21741d = bVar;
        }

        public void c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            a0.d a10 = this.f21741d.a();
            View view = a10.h().mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f21741d.a().e(this);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a10 + " has been cancelled.");
            }
        }

        public void d(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (this.f21741d.b()) {
                this.f21741d.a().e(this);
                return;
            }
            Context context = viewGroup.getContext();
            a0.d a10 = this.f21741d.a();
            View view = a10.h().mView;
            b bVar = this.f21741d;
            C17542s.i(context, "context");
            C5192u.a c10 = bVar.c(context);
            if (c10 != null) {
                Animation animation = c10.f22114a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (a10.g() != a0.d.b.REMOVED) {
                    view.startAnimation(animation);
                    this.f21741d.a().e(this);
                } else {
                    viewGroup.startViewTransition(view);
                    C5192u.b bVar2 = new C5192u.b(animation, viewGroup, view);
                    bVar2.setAnimationListener(new C0338a(a10, viewGroup, view, this));
                    view.startAnimation(bVar2);
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + a10 + " has started.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final b h() {
            return this.f21741d;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "Landroidx/fragment/app/a0$d;", "operation", "", "isPop", "<init>", "(Landroidx/fragment/app/a0$d;Z)V", "Landroid/content/Context;", "context", "Landroidx/fragment/app/u$a;", "c", "(Landroid/content/Context;)Landroidx/fragment/app/u$a;", "b", "Z", "isAnimLoaded", "d", "Landroidx/fragment/app/u$a;", "animation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f21746b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f21747c;

        /* renamed from: d  reason: collision with root package name */
        private C5192u.a f21748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0.d dVar, boolean z10) {
            super(dVar);
            C17542s.j(dVar, "operation");
            this.f21746b = z10;
        }

        public final C5192u.a c(Context context) {
            C17542s.j(context, "context");
            if (this.f21747c) {
                return this.f21748d;
            }
            C5192u.a b10 = C5192u.b(context, a().h(), a().g() == a0.d.b.VISIBLE, this.f21746b);
            this.f21748d = b10;
            this.f21747c = true;
            return b10;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$c;", "Landroidx/fragment/app/a0$b;", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "animatorInfo", "<init>", "(Landroidx/fragment/app/DefaultSpecialEffectsController$b;)V", "Landroid/view/ViewGroup;", "container", "LXH/N;", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "c", "Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "h", "()Landroidx/fragment/app/DefaultSpecialEffectsController$b;", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "animator", "", "b", "()Z", "isSeekingSupported", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c extends a0.b {

        /* renamed from: d  reason: collision with root package name */
        private final b f21749d;

        /* renamed from: e  reason: collision with root package name */
        private AnimatorSet f21750e;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$c$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "anim", "LXH/N;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewGroup f21751a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f21752b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f21753c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a0.d f21754d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c f21755e;

            a(ViewGroup viewGroup, View view, boolean z10, a0.d dVar, c cVar) {
                this.f21751a = viewGroup;
                this.f21752b = view;
                this.f21753c = z10;
                this.f21754d = dVar;
                this.f21755e = cVar;
            }

            public void onAnimationEnd(Animator animator) {
                C17542s.j(animator, "anim");
                this.f21751a.endViewTransition(this.f21752b);
                if (this.f21753c) {
                    a0.d.b g10 = this.f21754d.g();
                    View view = this.f21752b;
                    C17542s.i(view, "viewToAnimate");
                    g10.b(view, this.f21751a);
                }
                this.f21755e.h().a().e(this.f21755e);
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f21754d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            C17542s.j(bVar, "animatorInfo");
            this.f21749d = bVar;
        }

        public boolean b() {
            return true;
        }

        public void c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            AnimatorSet animatorSet = this.f21750e;
            if (animatorSet == null) {
                this.f21749d.a().e(this);
                return;
            }
            a0.d a10 = this.f21749d.a();
            if (a10.m()) {
                e.f21757a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (FragmentManager.U0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(a10);
                sb2.append(" has been canceled");
                sb2.append(a10.m() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        public void d(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            a0.d a10 = this.f21749d.a();
            AnimatorSet animatorSet = this.f21750e;
            if (animatorSet == null) {
                this.f21749d.a().e(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a10 + " has started.");
            }
        }

        public void e(C4987b bVar, ViewGroup viewGroup) {
            C17542s.j(bVar, "backEvent");
            C17542s.j(viewGroup, "container");
            a0.d a10 = this.f21749d.a();
            AnimatorSet animatorSet = this.f21750e;
            if (animatorSet == null) {
                this.f21749d.a().e(this);
            } else if (Build.VERSION.SDK_INT >= 34 && a10.h().mTransitioning) {
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a10);
                }
                long a11 = d.f21756a.a(animatorSet);
                long a12 = (long) (bVar.a() * ((float) a11));
                if (a12 == 0) {
                    a12 = 1;
                }
                if (a12 == a11) {
                    a12 = a11 - 1;
                }
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Setting currentPlayTime to " + a12 + " for Animator " + animatorSet + " on operation " + a10);
                }
                e.f21757a.b(animatorSet, a12);
            }
        }

        public void f(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (!this.f21749d.b()) {
                Context context = viewGroup.getContext();
                b bVar = this.f21749d;
                C17542s.i(context, "context");
                C5192u.a c10 = bVar.c(context);
                this.f21750e = c10 != null ? c10.f22115b : null;
                a0.d a10 = this.f21749d.a();
                C5187o h10 = a10.h();
                boolean z10 = a10.g() == a0.d.b.GONE;
                View view = h10.mView;
                viewGroup.startViewTransition(view);
                AnimatorSet animatorSet = this.f21750e;
                if (animatorSet != null) {
                    animatorSet.addListener(new a(viewGroup, view, z10, a10, this));
                }
                AnimatorSet animatorSet2 = this.f21750e;
                if (animatorSet2 != null) {
                    animatorSet2.setTarget(view);
                }
            }
        }

        public final b h() {
            return this.f21749d;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$d;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "", "a", "(Landroid/animation/AnimatorSet;)J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21756a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            C17542s.j(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$e;", "", "<init>", "()V", "Landroid/animation/AnimatorSet;", "animatorSet", "LXH/N;", "a", "(Landroid/animation/AnimatorSet;)V", "", "time", "b", "(Landroid/animation/AnimatorSet;J)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f21757a = new e();

        private e() {
        }

        public final void a(AnimatorSet animatorSet) {
            C17542s.j(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            C17542s.j(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "", "Landroidx/fragment/app/a0$d;", "operation", "<init>", "(Landroidx/fragment/app/a0$d;)V", "a", "Landroidx/fragment/app/a0$d;", "()Landroidx/fragment/app/a0$d;", "", "b", "()Z", "isVisibilityUnchanged", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final a0.d f21758a;

        public f(a0.d dVar) {
            C17542s.j(dVar, "operation");
            this.f21758a = dVar;
        }

        public final a0.d a() {
            return this.f21758a;
        }

        public final boolean b() {
            a0.d.b bVar;
            View view = this.f21758a.h().mView;
            a0.d.b a10 = view != null ? a0.d.b.Companion.a(view) : null;
            a0.d.b g10 = this.f21758a.g();
            return a10 == g10 || !(a10 == (bVar = a0.d.b.VISIBLE) || g10 == bVar);
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001Bß\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020#2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020#2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b1\u0010,J\u0017\u00102\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b9\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER'\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010ER'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bP\u0010KR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0019\u0010TR\u001d\u0010\\\u001a\u00020U8\u0006¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010YR$\u0010a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010TR\u0011\u0010e\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bd\u0010T¨\u0006f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$g;", "Landroidx/fragment/app/a0$b;", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$h;", "transitionInfos", "Landroidx/fragment/app/a0$d;", "firstOut", "lastIn", "Landroidx/fragment/app/U;", "transitionImpl", "", "sharedElementTransition", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementFirstOutViews", "sharedElementLastInViews", "Lj0/a;", "", "sharedElementNameMapping", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "", "isPop", "<init>", "(Ljava/util/List;Landroidx/fragment/app/a0$d;Landroidx/fragment/app/a0$d;Landroidx/fragment/app/U;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Lj0/a;Ljava/util/ArrayList;Ljava/util/ArrayList;Lj0/a;Lj0/a;Z)V", "Landroid/view/ViewGroup;", "container", "LXH/v;", "o", "(Landroid/view/ViewGroup;Landroidx/fragment/app/a0$d;Landroidx/fragment/app/a0$d;)LXH/v;", "enteringViews", "Lkotlin/Function0;", "LXH/N;", "executeTransition", "B", "(Ljava/util/ArrayList;Landroid/view/ViewGroup;LnI/a;)V", "transitioningViews", "view", "n", "(Ljava/util/ArrayList;Landroid/view/View;)V", "f", "(Landroid/view/ViewGroup;)V", "Landroidx/activity/b;", "backEvent", "e", "(Landroidx/activity/b;Landroid/view/ViewGroup;)V", "d", "c", "Ljava/util/List;", "w", "()Ljava/util/List;", "Landroidx/fragment/app/a0$d;", "t", "()Landroidx/fragment/app/a0$d;", "u", "g", "Landroidx/fragment/app/U;", "v", "()Landroidx/fragment/app/U;", "h", "Ljava/lang/Object;", "getSharedElementTransition", "()Ljava/lang/Object;", "i", "Ljava/util/ArrayList;", "getSharedElementFirstOutViews", "()Ljava/util/ArrayList;", "j", "getSharedElementLastInViews", "k", "Lj0/a;", "getSharedElementNameMapping", "()Lj0/a;", "l", "getEnteringNames", "m", "getExitingNames", "getFirstOutViews", "getLastInViews", "p", "Z", "()Z", "LD2/e;", "q", "LD2/e;", "getTransitionSignal", "()LD2/e;", "getTransitionSignal$annotations", "()V", "transitionSignal", "r", "s", "C", "(Ljava/lang/Object;)V", "controller", "b", "isSeekingSupported", "x", "transitioning", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class g extends a0.b {

        /* renamed from: d  reason: collision with root package name */
        private final List<h> f21759d;

        /* renamed from: e  reason: collision with root package name */
        private final a0.d f21760e;

        /* renamed from: f  reason: collision with root package name */
        private final a0.d f21761f;

        /* renamed from: g  reason: collision with root package name */
        private final U f21762g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f21763h;

        /* renamed from: i  reason: collision with root package name */
        private final ArrayList<View> f21764i;

        /* renamed from: j  reason: collision with root package name */
        private final ArrayList<View> f21765j;

        /* renamed from: k  reason: collision with root package name */
        private final C5445a<String, String> f21766k;

        /* renamed from: l  reason: collision with root package name */
        private final ArrayList<String> f21767l;

        /* renamed from: m  reason: collision with root package name */
        private final ArrayList<String> f21768m;

        /* renamed from: n  reason: collision with root package name */
        private final C5445a<String, View> f21769n;

        /* renamed from: o  reason: collision with root package name */
        private final C5445a<String, View> f21770o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f21771p;

        /* renamed from: q  reason: collision with root package name */
        private final D2.e f21772q = new D2.e();

        /* renamed from: r  reason: collision with root package name */
        private Object f21773r;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f21774c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ViewGroup f21775d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f21776e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, ViewGroup viewGroup, Object obj) {
                super(0);
                this.f21774c = gVar;
                this.f21775d = viewGroup;
                this.f21776e = obj;
            }

            public final void invoke() {
                this.f21774c.v().e(this.f21775d, this.f21776e);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g f21777c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ViewGroup f21778d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Object f21779e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ O<C17631a<C16807N>> f21780f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class a extends C17544u implements C17631a<C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ g f21781c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Object f21782d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ ViewGroup f21783e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f21781c = gVar;
                    this.f21782d = obj;
                    this.f21783e = viewGroup;
                }

                /* access modifiers changed from: private */
                public static final void c(g gVar, ViewGroup viewGroup) {
                    C17542s.j(gVar, "this$0");
                    C17542s.j(viewGroup, "$container");
                    for (h a10 : gVar.w()) {
                        a0.d a11 = a10.a();
                        View view = a11.h().getView();
                        if (view != null) {
                            a11.g().b(view, viewGroup);
                        }
                    }
                }

                /* access modifiers changed from: private */
                public static final void e(g gVar) {
                    C17542s.j(gVar, "this$0");
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    for (h a10 : gVar.w()) {
                        a10.a().e(gVar);
                    }
                }

                public final void invoke() {
                    Iterable<h> w10 = this.f21781c.w();
                    if (!(w10 instanceof Collection) || !((Collection) w10).isEmpty()) {
                        for (h a10 : w10) {
                            if (!a10.a().m()) {
                                if (FragmentManager.U0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                D2.e eVar = new D2.e();
                                this.f21781c.v().w(this.f21781c.w().get(0).a().h(), this.f21782d, eVar, new C5185m(this.f21781c));
                                eVar.a();
                                return;
                            }
                        }
                    }
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    U v10 = this.f21781c.v();
                    Object s10 = this.f21781c.s();
                    C17542s.g(s10);
                    v10.d(s10, new C5184l(this.f21781c, this.f21783e));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar, ViewGroup viewGroup, Object obj, O<C17631a<C16807N>> o10) {
                super(0);
                this.f21777c = gVar;
                this.f21778d = viewGroup;
                this.f21779e = obj;
                this.f21780f = o10;
            }

            public final void invoke() {
                g gVar = this.f21777c;
                gVar.C(gVar.v().j(this.f21778d, this.f21779e));
                boolean z10 = this.f21777c.s() != null;
                Object obj = this.f21779e;
                ViewGroup viewGroup = this.f21778d;
                if (z10) {
                    this.f21780f.f144348a = new a(this.f21777c, obj, viewGroup);
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + this.f21777c.t() + " to " + this.f21777c.u());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
            }
        }

        public g(List<h> list, a0.d dVar, a0.d dVar2, U u10, Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2, C5445a<String, String> aVar, ArrayList<String> arrayList3, ArrayList<String> arrayList4, C5445a<String, View> aVar2, C5445a<String, View> aVar3, boolean z10) {
            C17542s.j(list, "transitionInfos");
            C17542s.j(u10, "transitionImpl");
            C17542s.j(arrayList, "sharedElementFirstOutViews");
            C17542s.j(arrayList2, "sharedElementLastInViews");
            C17542s.j(aVar, "sharedElementNameMapping");
            C17542s.j(arrayList3, "enteringNames");
            C17542s.j(arrayList4, "exitingNames");
            C17542s.j(aVar2, "firstOutViews");
            C17542s.j(aVar3, "lastInViews");
            this.f21759d = list;
            this.f21760e = dVar;
            this.f21761f = dVar2;
            this.f21762g = u10;
            this.f21763h = obj;
            this.f21764i = arrayList;
            this.f21765j = arrayList2;
            this.f21766k = aVar;
            this.f21767l = arrayList3;
            this.f21768m = arrayList4;
            this.f21769n = aVar2;
            this.f21770o = aVar3;
            this.f21771p = z10;
        }

        /* access modifiers changed from: private */
        public static final void A(a0.d dVar, g gVar) {
            C17542s.j(dVar, "$operation");
            C17542s.j(gVar, "this$0");
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        private final void B(ArrayList<View> arrayList, ViewGroup viewGroup, C17631a<C16807N> aVar) {
            S.e(arrayList, 4);
            ArrayList<String> q10 = this.f21762g.q(this.f21765j);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = this.f21764i.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    C17542s.i(next, "sharedElementFirstOutViews");
                    View view = next;
                    Log.v("FragmentManager", "View: " + view + " Name: " + C4600b0.I(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = this.f21765j.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    C17542s.i(next2, "sharedElementLastInViews");
                    View view2 = next2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + C4600b0.I(view2));
                }
            }
            aVar.invoke();
            this.f21762g.y(viewGroup, this.f21764i, this.f21765j, q10, this.f21766k);
            S.e(arrayList, 0);
            this.f21762g.A(this.f21763h, this.f21764i, this.f21765j);
        }

        private final void n(ArrayList<View> arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!C4608f0.a(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            C17542s.i(childAt, "child");
                            n(arrayList, childAt);
                        }
                    }
                } else if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }

        private final v<ArrayList<View>, Object> o(ViewGroup viewGroup, a0.d dVar, a0.d dVar2) {
            ViewGroup viewGroup2 = viewGroup;
            a0.d dVar3 = dVar;
            a0.d dVar4 = dVar2;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            boolean z10 = false;
            View view2 = null;
            for (h g10 : this.f21759d) {
                if (!(!g10.g() || dVar4 == null || dVar3 == null || this.f21766k.isEmpty() || this.f21763h == null)) {
                    S.a(dVar.h(), dVar2.h(), this.f21771p, this.f21769n, true);
                    L.a(viewGroup2, new C5181i(dVar3, dVar4, this));
                    this.f21764i.addAll(this.f21769n.values());
                    if (!this.f21768m.isEmpty()) {
                        String str = this.f21768m.get(0);
                        C17542s.i(str, "exitingNames[0]");
                        view2 = this.f21769n.get(str);
                        this.f21762g.v(this.f21763h, view2);
                    }
                    this.f21765j.addAll(this.f21770o.values());
                    if (!this.f21767l.isEmpty()) {
                        String str2 = this.f21767l.get(0);
                        C17542s.i(str2, "enteringNames[0]");
                        View view3 = this.f21770o.get(str2);
                        if (view3 != null) {
                            L.a(viewGroup2, new C5182j(this.f21762g, view3, rect));
                            z10 = true;
                        }
                    }
                    this.f21762g.z(this.f21763h, view, this.f21764i);
                    U u10 = this.f21762g;
                    Object obj = this.f21763h;
                    u10.s(obj, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj, this.f21765j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f21759d.iterator();
            Object obj2 = null;
            Object obj3 = null;
            while (it.hasNext()) {
                h next = it.next();
                a0.d a10 = next.a();
                Iterator<h> it2 = it;
                Object h10 = this.f21762g.h(next.f());
                if (h10 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj4 = obj3;
                    View view4 = a10.h().mView;
                    Object obj5 = obj2;
                    C17542s.i(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f21763h != null && (a10 == dVar4 || a10 == dVar3)) {
                        if (a10 == dVar4) {
                            arrayList2.removeAll(C16877v.y1(this.f21764i));
                        } else {
                            arrayList2.removeAll(C16877v.y1(this.f21765j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f21762g.a(h10, view);
                    } else {
                        this.f21762g.b(h10, arrayList2);
                        this.f21762g.s(h10, h10, arrayList2, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (a10.g() == a0.d.b.GONE) {
                            a10.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a10.h().mView);
                            this.f21762g.r(h10, a10.h().mView, arrayList3);
                            L.a(viewGroup2, new C5183k(arrayList2));
                        }
                    }
                    if (a10.g() == a0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.f21762g.u(h10, rect);
                        }
                        if (FragmentManager.U0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                C17542s.i(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next2));
                            }
                        }
                    } else {
                        this.f21762g.v(h10, view2);
                        if (FragmentManager.U0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h10);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next3 = it4.next();
                                C17542s.i(next3, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next3));
                            }
                        }
                    }
                    if (next.h()) {
                        obj2 = this.f21762g.p(obj5, h10, (Object) null);
                        dVar3 = dVar;
                        it = it2;
                        obj3 = obj4;
                    } else {
                        obj2 = obj5;
                        obj3 = this.f21762g.p(obj4, h10, (Object) null);
                    }
                }
                dVar3 = dVar;
                it = it2;
            }
            Object o10 = this.f21762g.o(obj2, obj3, this.f21763h);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o10);
            }
            return new v<>(arrayList, o10);
        }

        /* access modifiers changed from: private */
        public static final void p(a0.d dVar, a0.d dVar2, g gVar) {
            C17542s.j(gVar, "this$0");
            S.a(dVar.h(), dVar2.h(), gVar.f21771p, gVar.f21770o, false);
        }

        /* access modifiers changed from: private */
        public static final void q(U u10, View view, Rect rect) {
            C17542s.j(u10, "$impl");
            C17542s.j(rect, "$lastInEpicenterRect");
            u10.k(view, rect);
        }

        /* access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            C17542s.j(arrayList, "$transitioningViews");
            S.e(arrayList, 4);
        }

        /* access modifiers changed from: private */
        public static final void y(a0.d dVar, g gVar) {
            C17542s.j(dVar, "$operation");
            C17542s.j(gVar, "this$0");
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        /* access modifiers changed from: private */
        public static final void z(O o10) {
            C17542s.j(o10, "$seekCancelLambda");
            C17631a aVar = (C17631a) o10.f144348a;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void C(Object obj) {
            this.f21773r = obj;
        }

        public boolean b() {
            if (this.f21762g.m()) {
                Iterable iterable = this.f21759d;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        h hVar = (h) it.next();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (hVar.f() != null) {
                                if (!this.f21762g.n(hVar.f())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Object obj = this.f21763h;
                if (obj == null || this.f21762g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        public void c(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            this.f21772q.a();
        }

        public void d(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f21759d) {
                    a0.d a10 = hVar.a();
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + a10);
                    }
                    hVar.a().e(this);
                }
                return;
            }
            Object obj = this.f21773r;
            if (obj != null) {
                U u10 = this.f21762g;
                C17542s.g(obj);
                u10.c(obj);
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f21760e + " to " + this.f21761f);
                    return;
                }
                return;
            }
            v<ArrayList<View>, Object> o10 = o(viewGroup, this.f21761f, this.f21760e);
            ArrayList a11 = o10.a();
            Object b10 = o10.b();
            Iterable<h> iterable = this.f21759d;
            ArrayList<a0.d> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
            for (h a12 : iterable) {
                arrayList.add(a12.a());
            }
            for (a0.d dVar : arrayList) {
                this.f21762g.w(dVar.h(), b10, this.f21772q, new C5180h(dVar, this));
            }
            B(a11, viewGroup, new a(this, viewGroup, b10));
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f21760e + " to " + this.f21761f);
            }
        }

        public void e(C4987b bVar, ViewGroup viewGroup) {
            C17542s.j(bVar, "backEvent");
            C17542s.j(viewGroup, "container");
            Object obj = this.f21773r;
            if (obj != null) {
                this.f21762g.t(obj, bVar.a());
            }
        }

        public void f(ViewGroup viewGroup) {
            C17542s.j(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h a10 : this.f21759d) {
                    a0.d a11 = a10.a();
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + a11);
                    }
                }
                return;
            }
            if (x() && this.f21763h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f21763h + " between " + this.f21760e + " and " + this.f21761f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                O o10 = new O();
                v<ArrayList<View>, Object> o11 = o(viewGroup, this.f21761f, this.f21760e);
                ArrayList a12 = o11.a();
                Object b10 = o11.b();
                Iterable<h> iterable = this.f21759d;
                ArrayList<a0.d> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
                for (h a13 : iterable) {
                    arrayList.add(a13.a());
                }
                for (a0.d dVar : arrayList) {
                    C5178f fVar = new C5178f(o10);
                    this.f21762g.x(dVar.h(), b10, this.f21772q, fVar, new C5179g(dVar, this));
                }
                B(a12, viewGroup, new b(this, viewGroup, b10, o10));
            }
        }

        public final Object s() {
            return this.f21773r;
        }

        public final a0.d t() {
            return this.f21760e;
        }

        public final a0.d u() {
            return this.f21761f;
        }

        public final U v() {
            return this.f21762g;
        }

        public final List<h> w() {
            return this.f21759d;
        }

        public final boolean x() {
            Iterable<h> iterable = this.f21759d;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (h a10 : iterable) {
                if (!a10.a().h().mTransitioning) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$h;", "Landroidx/fragment/app/DefaultSpecialEffectsController$f;", "Landroidx/fragment/app/a0$d;", "operation", "", "isPop", "providesSharedElementTransition", "<init>", "(Landroidx/fragment/app/a0$d;ZZ)V", "", "transition", "Landroidx/fragment/app/U;", "d", "(Ljava/lang/Object;)Landroidx/fragment/app/U;", "g", "()Z", "b", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "c", "Z", "h", "isOverlapAllowed", "e", "sharedElementTransition", "()Landroidx/fragment/app/U;", "handlingImpl", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class h extends f {

        /* renamed from: b  reason: collision with root package name */
        private final Object f21784b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21785c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f21786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(a0.d dVar, boolean z10, boolean z11) {
            super(dVar);
            Object obj;
            C17542s.j(dVar, "operation");
            a0.d.b g10 = dVar.g();
            a0.d.b bVar = a0.d.b.VISIBLE;
            if (g10 == bVar) {
                C5187o h10 = dVar.h();
                obj = z10 ? h10.getReenterTransition() : h10.getEnterTransition();
            } else {
                C5187o h11 = dVar.h();
                obj = z10 ? h11.getReturnTransition() : h11.getExitTransition();
            }
            this.f21784b = obj;
            this.f21785c = dVar.g() == bVar ? z10 ? dVar.h().getAllowReturnTransitionOverlap() : dVar.h().getAllowEnterTransitionOverlap() : true;
            this.f21786d = z11 ? z10 ? dVar.h().getSharedElementReturnTransition() : dVar.h().getSharedElementEnterTransition() : null;
        }

        private final U d(Object obj) {
            if (obj == null) {
                return null;
            }
            U u10 = S.f21956b;
            if (u10 != null && u10.g(obj)) {
                return u10;
            }
            U u11 = S.f21957c;
            if (u11 != null && u11.g(obj)) {
                return u11;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final U c() {
            U d10 = d(this.f21784b);
            U d11 = d(this.f21786d);
            if (d10 == null || d11 == null || d10 == d11) {
                return d10 == null ? d11 : d10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f21784b + " which uses a different Transition  type than its shared element transition " + this.f21786d).toString());
        }

        public final Object e() {
            return this.f21786d;
        }

        public final Object f() {
            return this.f21784b;
        }

        public final boolean g() {
            return this.f21786d != null;
        }

        public final boolean h() {
            return this.f21785c;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "kotlin.jvm.PlatformType", "Landroid/view/View;", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17642l<Map.Entry<String, View>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Collection<String> f21787c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Collection<String> collection) {
            super(1);
            this.f21787c = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(Map.Entry<String, View> entry) {
            C17542s.j(entry, "entry");
            return Boolean.valueOf(C16877v.l0(this.f21787c, C4600b0.I(entry.getValue())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup viewGroup) {
        super(viewGroup);
        C17542s.j(viewGroup, "container");
    }

    @SuppressLint({"NewApi", "PrereleaseSdkCoreDependency"})
    private final void F(List<b> list) {
        ArrayList<b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (b a10 : list) {
            C16877v.E(arrayList2, a10.a().f());
        }
        boolean isEmpty = arrayList2.isEmpty();
        boolean z10 = false;
        for (b next : list) {
            Context context = t().getContext();
            a0.d a11 = next.a();
            C17542s.i(context, "context");
            C5192u.a c10 = next.c(context);
            if (c10 != null) {
                if (c10.f22115b == null) {
                    arrayList.add(next);
                } else {
                    C5187o h10 = a11.h();
                    if (a11.f().isEmpty()) {
                        if (a11.g() == a0.d.b.GONE) {
                            a11.q(false);
                        }
                        a11.b(new c(next));
                        z10 = true;
                    } else if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + h10 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar : arrayList) {
            a0.d a12 = bVar.a();
            C5187o h11 = a12.h();
            if (!isEmpty) {
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Transitions.");
                }
            } else if (!z10) {
                a12.b(new a(bVar));
            } else if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + h11 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void G(DefaultSpecialEffectsController defaultSpecialEffectsController, a0.d dVar) {
        C17542s.j(defaultSpecialEffectsController, "this$0");
        C17542s.j(dVar, "$operation");
        defaultSpecialEffectsController.c(dVar);
    }

    private final void H(List<h> list, boolean z10, a0.d dVar, a0.d dVar2) {
        Object obj;
        U u10;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Object obj2;
        String b10;
        a0.d dVar3 = dVar;
        a0.d dVar4 = dVar2;
        ArrayList arrayList4 = new ArrayList();
        for (Object next : list) {
            if (!((h) next).b()) {
                arrayList4.add(next);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList<>();
        for (Object next2 : arrayList4) {
            if (((h) next2).c() != null) {
                arrayList5.add(next2);
            }
        }
        U u11 = null;
        for (h hVar : arrayList5) {
            U c10 = hVar.c();
            if (u11 == null || c10 == u11) {
                u11 = c10;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (u11 != null) {
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            C5445a aVar = new C5445a();
            ArrayList<String> arrayList8 = new ArrayList<>();
            ArrayList<String> arrayList9 = new ArrayList<>();
            C5445a aVar2 = new C5445a();
            C5445a aVar3 = new C5445a();
            Iterator it2 = arrayList5.iterator();
            ArrayList<String> arrayList10 = arrayList8;
            ArrayList<String> arrayList11 = arrayList9;
            loop3:
            while (true) {
                obj = null;
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.g() || dVar3 == null || dVar4 == null) {
                        u10 = u11;
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        it = it2;
                        arrayList3 = arrayList5;
                    } else {
                        Object B10 = u11.B(u11.h(hVar2.e()));
                        arrayList11 = dVar2.h().getSharedElementSourceNames();
                        C17542s.i(arrayList11, "lastIn.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementSourceNames = dVar.h().getSharedElementSourceNames();
                        C17542s.i(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames = dVar.h().getSharedElementTargetNames();
                        C17542s.i(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames.size();
                        u10 = u11;
                        it = it2;
                        int i10 = 0;
                        while (i10 < size) {
                            int i11 = size;
                            int indexOf = arrayList11.indexOf(sharedElementTargetNames.get(i10));
                            if (indexOf != -1) {
                                arrayList11.set(indexOf, sharedElementSourceNames.get(i10));
                            }
                            i10++;
                            size = i11;
                        }
                        arrayList10 = dVar2.h().getSharedElementTargetNames();
                        C17542s.i(arrayList10, "lastIn.fragment.sharedElementTargetNames");
                        v a10 = !z10 ? C16796C.a(dVar.h().getExitTransitionCallback(), dVar2.h().getEnterTransitionCallback()) : C16796C.a(dVar.h().getEnterTransitionCallback(), dVar2.h().getExitTransitionCallback());
                        A a11 = (A) a10.a();
                        A a12 = (A) a10.b();
                        int size2 = arrayList11.size();
                        int i12 = 0;
                        arrayList3 = arrayList5;
                        while (true) {
                            arrayList2 = arrayList7;
                            if (i12 >= size2) {
                                break;
                            }
                            int i13 = size2;
                            String str = arrayList11.get(i12);
                            C17542s.i(str, "exitingNames[i]");
                            String str2 = arrayList10.get(i12);
                            C17542s.i(str2, "enteringNames[i]");
                            aVar.put(str, str2);
                            i12++;
                            arrayList7 = arrayList2;
                            size2 = i13;
                        }
                        if (FragmentManager.U0(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            Iterator<String> it3 = arrayList10.iterator();
                            while (true) {
                                arrayList = arrayList6;
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Log.v("FragmentManager", "Name: " + it3.next());
                                B10 = B10;
                                arrayList6 = arrayList;
                                it3 = it3;
                            }
                            obj2 = B10;
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator<String> it4 = arrayList11.iterator(); it4.hasNext(); it4 = it4) {
                                Log.v("FragmentManager", "Name: " + it4.next());
                            }
                        } else {
                            obj2 = B10;
                            arrayList = arrayList6;
                        }
                        View view = dVar.h().mView;
                        C17542s.i(view, "firstOut.fragment.mView");
                        I(aVar2, view);
                        aVar2.q(arrayList11);
                        if (a11 != null) {
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + dVar3);
                            }
                            a11.d(arrayList11, aVar2);
                            int size3 = arrayList11.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i14 = size3 - 1;
                                    String str3 = arrayList11.get(size3);
                                    C17542s.i(str3, "exitingNames[i]");
                                    String str4 = str3;
                                    View view2 = (View) aVar2.get(str4);
                                    if (view2 == null) {
                                        aVar.remove(str4);
                                    } else if (!C17542s.e(str4, C4600b0.I(view2))) {
                                        aVar.put(C4600b0.I(view2), (String) aVar.remove(str4));
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size3 = i14;
                                }
                            }
                        } else {
                            aVar.q(aVar2.keySet());
                        }
                        View view3 = dVar2.h().mView;
                        C17542s.i(view3, "lastIn.fragment.mView");
                        I(aVar3, view3);
                        aVar3.q(arrayList10);
                        aVar3.q(aVar.values());
                        if (a12 != null) {
                            if (FragmentManager.U0(2)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + dVar4);
                            }
                            a12.d(arrayList10, aVar3);
                            int size4 = arrayList10.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i15 = size4 - 1;
                                    String str5 = arrayList10.get(size4);
                                    C17542s.i(str5, "enteringNames[i]");
                                    String str6 = str5;
                                    View view4 = (View) aVar3.get(str6);
                                    if (view4 == null) {
                                        String b11 = S.b(aVar, str6);
                                        if (b11 != null) {
                                            aVar.remove(b11);
                                        }
                                    } else if (!C17542s.e(str6, C4600b0.I(view4)) && (b10 = S.b(aVar, str6)) != null) {
                                        aVar.put(b10, C4600b0.I(view4));
                                    }
                                    if (i15 < 0) {
                                        break;
                                    }
                                    size4 = i15;
                                }
                            }
                        } else {
                            S.d(aVar, aVar3);
                        }
                        Set keySet = aVar.keySet();
                        C17542s.i(keySet, "sharedElementNameMapping.keys");
                        J(aVar2, keySet);
                        Collection values = aVar.values();
                        C17542s.i(values, "sharedElementNameMapping.values");
                        J(aVar3, values);
                        if (aVar.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + obj2 + " between " + dVar3 + " and " + dVar4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList.clear();
                            arrayList2.clear();
                            arrayList5 = arrayList3;
                            it2 = it;
                            u11 = u10;
                            arrayList7 = arrayList2;
                            arrayList6 = arrayList;
                        } else {
                            obj = obj2;
                        }
                    }
                    arrayList5 = arrayList3;
                    it2 = it;
                    u11 = u10;
                    arrayList7 = arrayList2;
                    arrayList6 = arrayList;
                }
                break loop3;
            }
            U u12 = u11;
            ArrayList arrayList12 = arrayList6;
            ArrayList arrayList13 = arrayList7;
            ArrayList<h> arrayList14 = arrayList5;
            if (obj != null) {
                g gVar = new g(arrayList14, dVar, dVar2, u12, obj, arrayList12, arrayList13, aVar, arrayList10, arrayList11, aVar2, aVar3, z10);
            } else if (!arrayList14.isEmpty()) {
                for (h f10 : arrayList14) {
                    if (f10.f() != null) {
                    }
                }
                return;
            } else {
                return;
            }
            g gVar2 = new g(arrayList14, dVar, dVar2, u12, obj, arrayList12, arrayList13, aVar, arrayList10, arrayList11, aVar2, aVar3, z10);
            for (h a13 : arrayList14) {
                a13.a().b(gVar2);
            }
        }
    }

    private final void I(Map<String, View> map, View view) {
        String I10 = C4600b0.I(view);
        if (I10 != null) {
            map.put(I10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    C17542s.i(childAt, "child");
                    I(map, childAt);
                }
            }
        }
    }

    private final void J(C5445a<String, View> aVar, Collection<String> collection) {
        Set<Map.Entry<String, View>> entrySet = aVar.entrySet();
        C17542s.i(entrySet, "entries");
        C16877v.Q(entrySet, new i(collection));
    }

    private final void K(List<? extends a0.d> list) {
        C5187o h10 = ((a0.d) C16877v.I0(list)).h();
        for (a0.d dVar : list) {
            dVar.h().mAnimationInfo.f22080c = h10.mAnimationInfo.f22080c;
            dVar.h().mAnimationInfo.f22081d = h10.mAnimationInfo.f22081d;
            dVar.h().mAnimationInfo.f22082e = h10.mAnimationInfo.f22082e;
            dVar.h().mAnimationInfo.f22083f = h10.mAnimationInfo.f22083f;
        }
    }

    public void d(List<? extends a0.d> list, boolean z10) {
        a0.d dVar;
        Object obj;
        C17542s.j(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            a0.d dVar2 = (a0.d) obj;
            a0.d.b.a aVar = a0.d.b.Companion;
            View view = dVar2.h().mView;
            C17542s.i(view, "operation.fragment.mView");
            a0.d.b a10 = aVar.a(view);
            a0.d.b bVar = a0.d.b.VISIBLE;
            if (a10 == bVar && dVar2.g() != bVar) {
                break;
            }
        }
        a0.d dVar3 = (a0.d) obj;
        ListIterator<? extends a0.d> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            a0.d dVar4 = (a0.d) previous;
            a0.d.b.a aVar2 = a0.d.b.Companion;
            View view2 = dVar4.h().mView;
            C17542s.i(view2, "operation.fragment.mView");
            a0.d.b a11 = aVar2.a(view2);
            a0.d.b bVar2 = a0.d.b.VISIBLE;
            if (a11 != bVar2 && dVar4.g() == bVar2) {
                dVar = previous;
                break;
            }
        }
        a0.d dVar5 = dVar;
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar3 + " to " + dVar5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        K(list);
        for (a0.d dVar6 : list) {
            arrayList.add(new b(dVar6, z10));
            boolean z11 = false;
            if (z10) {
                if (dVar6 != dVar3) {
                    arrayList2.add(new h(dVar6, z10, z11));
                    dVar6.a(new C5176d(this, dVar6));
                }
            } else if (dVar6 != dVar5) {
                arrayList2.add(new h(dVar6, z10, z11));
                dVar6.a(new C5176d(this, dVar6));
            }
            z11 = true;
            arrayList2.add(new h(dVar6, z10, z11));
            dVar6.a(new C5176d(this, dVar6));
        }
        H(arrayList2, z10, dVar3, dVar5);
        F(arrayList);
    }
}
