package Fa;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import j0.b0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Fa.h  reason: case insensitive filesystem */
public class C9088h {

    /* renamed from: a  reason: collision with root package name */
    private final b0<String, C9089i> f60384a = new b0<>();

    /* renamed from: b  reason: collision with root package name */
    private final b0<String, PropertyValuesHolder[]> f60385b = new b0<>();

    private static void a(C9088h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.i(objectAnimator.getPropertyName(), C9089i.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static C9088h b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C9088h c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    private static C9088h d(List<Animator> list) {
        C9088h hVar = new C9088h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(hVar, list.get(i10));
        }
        return hVar;
    }

    public C9089i e(String str) {
        if (g(str)) {
            return this.f60384a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9088h)) {
            return false;
        }
        return this.f60384a.equals(((C9088h) obj).f60384a);
    }

    public long f() {
        int size = this.f60384a.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C9089i m10 = this.f60384a.m(i10);
            j10 = Math.max(j10, m10.c() + m10.d());
        }
        return j10;
    }

    public boolean g(String str) {
        return this.f60384a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f60385b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f60384a.hashCode();
    }

    public void i(String str, C9089i iVar) {
        this.f60384a.put(str, iVar);
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f60384a + "}\n";
    }
}
