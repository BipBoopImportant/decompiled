package androidx.recyclerview.widget;

import I2.C4600b0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g extends x {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.G> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.G>> mAdditionsList = new ArrayList<>();
    ArrayList<RecyclerView.G> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.G> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.G> mPendingAdditions = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.G> mPendingRemovals = new ArrayList<>();
    ArrayList<RecyclerView.G> mRemoveAnimations = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f43980a;

        a(ArrayList arrayList) {
            this.f43980a = arrayList;
        }

        public void run() {
            Iterator it = this.f43980a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.animateMoveImpl(jVar.f44014a, jVar.f44015b, jVar.f44016c, jVar.f44017d, jVar.f44018e);
            }
            this.f43980a.clear();
            g.this.mMovesList.remove(this.f43980a);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f43982a;

        b(ArrayList arrayList) {
            this.f43982a = arrayList;
        }

        public void run() {
            Iterator it = this.f43982a.iterator();
            while (it.hasNext()) {
                g.this.animateChangeImpl((i) it.next());
            }
            this.f43982a.clear();
            g.this.mChangesList.remove(this.f43982a);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f43984a;

        c(ArrayList arrayList) {
            this.f43984a = arrayList;
        }

        public void run() {
            Iterator it = this.f43984a.iterator();
            while (it.hasNext()) {
                g.this.animateAddImpl((RecyclerView.G) it.next());
            }
            this.f43984a.clear();
            g.this.mAdditionsList.remove(this.f43984a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f43986a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f43987b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f43988c;

        d(RecyclerView.G g10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f43986a = g10;
            this.f43987b = viewPropertyAnimator;
            this.f43988c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f43987b.setListener((Animator.AnimatorListener) null);
            this.f43988c.setAlpha(1.0f);
            g.this.dispatchRemoveFinished(this.f43986a);
            g.this.mRemoveAnimations.remove(this.f43986a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchRemoveStarting(this.f43986a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f43990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f43991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f43992c;

        e(RecyclerView.G g10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f43990a = g10;
            this.f43991b = view;
            this.f43992c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f43991b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f43992c.setListener((Animator.AnimatorListener) null);
            g.this.dispatchAddFinished(this.f43990a);
            g.this.mAddAnimations.remove(this.f43990a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchAddStarting(this.f43990a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.G f43994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f43996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43997d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f43998e;

        f(RecyclerView.G g10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f43994a = g10;
            this.f43995b = i10;
            this.f43996c = view;
            this.f43997d = i11;
            this.f43998e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f43995b != 0) {
                this.f43996c.setTranslationX(0.0f);
            }
            if (this.f43997d != 0) {
                this.f43996c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f43998e.setListener((Animator.AnimatorListener) null);
            g.this.dispatchMoveFinished(this.f43994a);
            g.this.mMoveAnimations.remove(this.f43994a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchMoveStarting(this.f43994a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g  reason: collision with other inner class name */
    class C0753g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f44000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f44002c;

        C0753g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f44000a = iVar;
            this.f44001b = viewPropertyAnimator;
            this.f44002c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f44001b.setListener((Animator.AnimatorListener) null);
            this.f44002c.setAlpha(1.0f);
            this.f44002c.setTranslationX(0.0f);
            this.f44002c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f44000a.f44008a, true);
            g.this.mChangeAnimations.remove(this.f44000a.f44008a);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f44000a.f44008a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f44004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f44005b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f44006c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f44004a = iVar;
            this.f44005b = viewPropertyAnimator;
            this.f44006c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f44005b.setListener((Animator.AnimatorListener) null);
            this.f44006c.setAlpha(1.0f);
            this.f44006c.setTranslationX(0.0f);
            this.f44006c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f44004a.f44009b, false);
            g.this.mChangeAnimations.remove(this.f44004a.f44009b);
            g.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f44004a.f44009b, false);
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.G f44014a;

        /* renamed from: b  reason: collision with root package name */
        public int f44015b;

        /* renamed from: c  reason: collision with root package name */
        public int f44016c;

        /* renamed from: d  reason: collision with root package name */
        public int f44017d;

        /* renamed from: e  reason: collision with root package name */
        public int f44018e;

        j(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
            this.f44014a = g10;
            this.f44015b = i10;
            this.f44016c = i11;
            this.f44017d = i12;
            this.f44018e = i13;
        }
    }

    private void animateRemoveImpl(RecyclerView.G g10) {
        View view = g10.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(g10);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(g10, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.G g10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, g10) && iVar.f44008a == null && iVar.f44009b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.G g10 = iVar.f44008a;
        if (g10 != null) {
            endChangeAnimationIfNecessary(iVar, g10);
        }
        RecyclerView.G g11 = iVar.f44009b;
        if (g11 != null) {
            endChangeAnimationIfNecessary(iVar, g11);
        }
    }

    private void resetAnimation(RecyclerView.G g10) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        g10.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(g10);
    }

    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.G g10) {
        resetAnimation(g10);
        g10.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(g10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateAddImpl(RecyclerView.G g10) {
        View view = g10.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(g10);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(g10, view, animate)).start();
    }

    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13) {
        if (g10 == g11) {
            return animateMove(g10, i10, i11, i12, i13);
        }
        float translationX = g10.itemView.getTranslationX();
        float translationY = g10.itemView.getTranslationY();
        float alpha = g10.itemView.getAlpha();
        resetAnimation(g10);
        int i14 = (int) (((float) (i12 - i10)) - translationX);
        int i15 = (int) (((float) (i13 - i11)) - translationY);
        g10.itemView.setTranslationX(translationX);
        g10.itemView.setTranslationY(translationY);
        g10.itemView.setAlpha(alpha);
        if (g11 != null) {
            resetAnimation(g11);
            g11.itemView.setTranslationX((float) (-i14));
            g11.itemView.setTranslationY((float) (-i15));
            g11.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(g10, g11, i10, i11, i12, i13));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateChangeImpl(i iVar) {
        RecyclerView.G g10 = iVar.f44008a;
        View view = null;
        View view2 = g10 == null ? null : g10.itemView;
        RecyclerView.G g11 = iVar.f44009b;
        if (g11 != null) {
            view = g11.itemView;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f44008a);
            duration.translationX((float) (iVar.f44012e - iVar.f44010c));
            duration.translationY((float) (iVar.f44013f - iVar.f44011d));
            duration.alpha(0.0f).setListener(new C0753g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.mChangeAnimations.add(iVar.f44009b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
        View view = g10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) g10.itemView.getTranslationY());
        resetAnimation(g10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(g10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.mPendingMoves.add(new j(g10, translationX, translationY, i12, i13));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateMoveImpl(RecyclerView.G g10, int i10, int i11, int i12, int i13) {
        View view = g10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(g10);
        animate.setDuration(getMoveDuration()).setListener(new f(g10, i14, view, i15, animate)).start();
    }

    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.G g10) {
        resetAnimation(g10);
        this.mPendingRemovals.add(g10);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.G g10, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(g10, list);
    }

    /* access modifiers changed from: package-private */
    public void cancelAll(List<RecyclerView.G> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.G g10) {
        View view = g10.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f44014a == g10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(g10);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, g10);
        if (this.mPendingRemovals.remove(g10)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(g10);
        }
        if (this.mPendingAdditions.remove(g10)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(g10);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, g10);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f44014a == g10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(g10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(g10)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(g10);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(g10);
        this.mAddAnimations.remove(g10);
        this.mChangeAnimations.remove(g10);
        this.mMoveAnimations.remove(g10);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f44014a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f44014a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.G g10 = this.mPendingAdditions.get(size3);
            g10.itemView.setAlpha(1.0f);
            dispatchAddFinished(g10);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f44014a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f44014a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.G g11 = (RecyclerView.G) arrayList2.get(size8);
                    g11.itemView.setAlpha(1.0f);
                    dispatchAddFinished(g11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    public void runPendingAnimations() {
        boolean isEmpty = this.mPendingRemovals.isEmpty();
        boolean isEmpty2 = this.mPendingMoves.isEmpty();
        boolean isEmpty3 = this.mPendingChanges.isEmpty();
        boolean isEmpty4 = this.mPendingAdditions.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator<RecyclerView.G> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (!isEmpty2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                a aVar = new a(arrayList);
                if (!isEmpty) {
                    C4600b0.h0(((j) arrayList.get(0)).f44014a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    C4600b0.h0(((i) arrayList2.get(0)).f44008a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                c cVar = new c(arrayList3);
                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                    long j10 = 0;
                    long removeDuration = !isEmpty ? getRemoveDuration() : 0;
                    long moveDuration = !isEmpty2 ? getMoveDuration() : 0;
                    if (!isEmpty3) {
                        j10 = getChangeDuration();
                    }
                    C4600b0.h0(((RecyclerView.G) arrayList3.get(0)).itemView, cVar, removeDuration + Math.max(moveDuration, j10));
                    return;
                }
                cVar.run();
            }
        }
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.G f44008a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.G f44009b;

        /* renamed from: c  reason: collision with root package name */
        public int f44010c;

        /* renamed from: d  reason: collision with root package name */
        public int f44011d;

        /* renamed from: e  reason: collision with root package name */
        public int f44012e;

        /* renamed from: f  reason: collision with root package name */
        public int f44013f;

        private i(RecyclerView.G g10, RecyclerView.G g11) {
            this.f44008a = g10;
            this.f44009b = g11;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f44008a + ", newHolder=" + this.f44009b + ", fromX=" + this.f44010c + ", fromY=" + this.f44011d + ", toX=" + this.f44012e + ", toY=" + this.f44013f + '}';
        }

        i(RecyclerView.G g10, RecyclerView.G g11, int i10, int i11, int i12, int i13) {
            this(g10, g11);
            this.f44010c = i10;
            this.f44011d = i11;
            this.f44012e = i12;
            this.f44013f = i13;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.G g10) {
        boolean z10 = false;
        if (iVar.f44009b == g10) {
            iVar.f44009b = null;
        } else if (iVar.f44008a != g10) {
            return false;
        } else {
            iVar.f44008a = null;
            z10 = true;
        }
        g10.itemView.setAlpha(1.0f);
        g10.itemView.setTranslationX(0.0f);
        g10.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(g10, z10);
        return true;
    }
}
