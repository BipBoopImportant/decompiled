package Fa;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: Fa.i  reason: case insensitive filesystem */
public class C9089i {

    /* renamed from: a  reason: collision with root package name */
    private long f60386a;

    /* renamed from: b  reason: collision with root package name */
    private long f60387b;

    /* renamed from: c  reason: collision with root package name */
    private TimeInterpolator f60388c;

    /* renamed from: d  reason: collision with root package name */
    private int f60389d;

    /* renamed from: e  reason: collision with root package name */
    private int f60390e;

    public C9089i(long j10, long j11) {
        this.f60388c = null;
        this.f60389d = 0;
        this.f60390e = 1;
        this.f60386a = j10;
        this.f60387b = j11;
    }

    static C9089i b(ValueAnimator valueAnimator) {
        C9089i iVar = new C9089i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f60389d = valueAnimator.getRepeatCount();
        iVar.f60390e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? C9081a.f60372b : interpolator instanceof AccelerateInterpolator ? C9081a.f60373c : interpolator instanceof DecelerateInterpolator ? C9081a.f60374d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f60386a;
    }

    public long d() {
        return this.f60387b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f60388c;
        return timeInterpolator != null ? timeInterpolator : C9081a.f60372b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9089i)) {
            return false;
        }
        C9089i iVar = (C9089i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f60389d;
    }

    public int h() {
        return this.f60390e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public C9089i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f60389d = 0;
        this.f60390e = 1;
        this.f60386a = j10;
        this.f60387b = j11;
        this.f60388c = timeInterpolator;
    }
}
