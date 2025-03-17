package com.google.android.libraries.places.widget.internal.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzhk;
import h3.b;
import java.util.ArrayList;
import java.util.List;

public final class zzo extends g {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    /* access modifiers changed from: private */
    public final List zzc = new ArrayList();
    private final int zzd;

    public zzo(Resources resources) {
        this.zzd = resources.getDimensionPixelSize(R.dimen.places_autocomplete_vertical_dropdown);
    }

    private final void zzd(RecyclerView.G g10) {
        View view = g10.itemView;
        this.zzc.add(g10);
        long moveDuration = getMoveDuration() + ((long) (g10.getLayoutPosition() * 67));
        view.setTranslationY((float) (-this.zzd));
        view.setAlpha(0.0f);
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new b()).setStartDelay(moveDuration);
        animate.setListener(new zzn(this, view, g10, animate)).start();
    }

    /* access modifiers changed from: private */
    public final void zze() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* access modifiers changed from: private */
    public static void zzf(View view) {
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    public final boolean animateAdd(RecyclerView.G g10) {
        try {
            endAnimation(g10);
            g10.itemView.setAlpha(0.0f);
            if (((zzt) g10).zzb()) {
                this.zza.add(g10);
                return true;
            }
            this.zzb.add(g10);
            return true;
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }

    public final void endAnimation(RecyclerView.G g10) {
        try {
            super.endAnimation(g10);
            if (this.zza.remove(g10)) {
                zzf(g10.itemView);
                dispatchAddFinished(g10);
            }
            zze();
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }

    public final void endAnimations() {
        try {
            int size = this.zza.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                RecyclerView.G g10 = (RecyclerView.G) this.zza.get(size);
                zzf(g10.itemView);
                dispatchAddFinished(g10);
                this.zza.remove(size);
            }
            List list = this.zzc;
            int size2 = list.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    ((RecyclerView.G) list.get(size2)).itemView.animate().cancel();
                } else {
                    super.endAnimations();
                    return;
                }
            }
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }

    public final boolean isRunning() {
        try {
            return super.isRunning() || !this.zzb.isEmpty() || !this.zza.isEmpty() || !this.zzc.isEmpty();
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final void runPendingAnimations() {
        try {
            for (RecyclerView.G animateAdd : this.zzb) {
                super.animateAdd(animateAdd);
            }
            this.zzb.clear();
            super.runPendingAnimations();
            if (!this.zza.isEmpty()) {
                ArrayList<RecyclerView.G> arrayList = new ArrayList<>(this.zza);
                this.zza.clear();
                for (RecyclerView.G g10 : arrayList) {
                    View view = g10.itemView;
                    this.zzc.add(g10);
                    long moveDuration = getMoveDuration() + ((long) (g10.getLayoutPosition() * 67));
                    view.setTranslationY((float) (-this.zzd));
                    view.setAlpha(0.0f);
                    ViewPropertyAnimator animate = view.animate();
                    animate.cancel();
                    animate.translationY(0.0f).alpha(1.0f).setDuration(133).setInterpolator(new b()).setStartDelay(moveDuration);
                    animate.setListener(new zzn(this, view, g10, animate)).start();
                }
            }
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }
}
