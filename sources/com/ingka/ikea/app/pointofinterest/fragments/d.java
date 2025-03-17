package com.ingka.ikea.app.pointofinterest.fragments;

import XH.C16818i;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.L;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"+\u0010\u0014\u001a\u0015\u0012\u0011\u0012\u000f \u0007*\u0004\u0018\u00010\u00100\u0010¢\u0006\u0002\b\u00110\u000f*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/fragment/app/o;", "", "id", "h", "(Landroidx/fragment/app/o;I)I", "LIh/a;", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "f", "(LIh/a;)Landroid/animation/ObjectAnimator;", "g", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "Lcom/google/android/gms/maps/model/LatLng;", "j", "(Lcom/ingka/ikea/appconfig/model/LocationLatLng;)Lcom/google/android/gms/maps/model/LatLng;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/LinearLayout;", "Lkotlin/jvm/internal/EnhancedNullability;", "i", "(LIh/a;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "pointofinterest_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "LXH/N;", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f72080a;

        public a(View view) {
            this.f72080a = view;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f72080a.setForeground((Drawable) null);
            this.f72080a.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f72081a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f72081a = lVar;
        }

        public final C16818i<?> c() {
            return this.f72081a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f72081a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final ObjectAnimator f(Ih.a aVar) {
        RecyclerView recyclerView = aVar.f61116f;
        recyclerView.setVisibility(0);
        recyclerView.setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerView, View.ALPHA, new float[]{1.0f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new h3.b());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static final ObjectAnimator g(Ih.a aVar) {
        View view = aVar.f61118h;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new h3.b());
        C17542s.g(ofFloat);
        ofFloat.addListener(new a(view));
        return ofFloat;
    }

    /* access modifiers changed from: private */
    public static final int h(C5187o oVar, int i10) {
        return oVar.getResources().getDimensionPixelOffset(i10);
    }

    /* access modifiers changed from: private */
    public static final BottomSheetBehavior<LinearLayout> i(Ih.a aVar) {
        BottomSheetBehavior<LinearLayout> q02 = BottomSheetBehavior.q0(aVar.f61112b);
        C17542s.i(q02, "from(...)");
        return q02;
    }

    /* access modifiers changed from: private */
    public static final LatLng j(LocationLatLng locationLatLng) {
        return new LatLng(locationLatLng.a(), locationLatLng.b());
    }
}
