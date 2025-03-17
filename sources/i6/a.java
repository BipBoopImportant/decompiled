package I6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f36945a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f36946b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Set<Animator.AnimatorPauseListener> f36947c = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    public void a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f36946b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f36946b.add(animatorListener);
    }

    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f36947c.add(animatorPauseListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f36945a.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        for (Animator.AnimatorListener onAnimationEnd : this.f36946b) {
            onAnimationEnd.onAnimationEnd(this, z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        for (Animator.AnimatorPauseListener onAnimationPause : this.f36947c) {
            onAnimationPause.onAnimationPause(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f36946b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        for (Animator.AnimatorPauseListener onAnimationResume : this.f36947c) {
            onAnimationResume.onAnimationResume(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z10) {
        for (Animator.AnimatorListener onAnimationStart : this.f36946b) {
            onAnimationStart.onAnimationStart(this, z10);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* access modifiers changed from: package-private */
    public void j() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f36945a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void removeAllListeners() {
        this.f36946b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f36945a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f36946b.remove(animatorListener);
    }

    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f36947c.remove(animatorPauseListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f36945a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
