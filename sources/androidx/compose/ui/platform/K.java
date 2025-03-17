package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.coreshims.c;
import androidx.compose.ui.platform.coreshims.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import p1.O0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\t\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\".\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lp1/O0;", "other", "LXH/N;", "i", "([F[F)V", "", "x", "y", "tmpMatrix", "j", "([FFF[F)V", "m1", "", "row", "m2", "column", "f", "([FI[FI)F", "Landroid/view/View;", "", "e", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/platform/coreshims/c;", "g", "(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/c;", "Lkotlin/Function1;", "LT1/K;", "a", "LnI/l;", "h", "()LnI/l;", "setPlatformTextInputServiceInterceptor", "(LnI/l;)V", "platformTextInputServiceInterceptor", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class K {

    /* renamed from: a  reason: collision with root package name */
    private static C17642l<? super T1.K, ? extends T1.K> f19269a = a.f19270c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LT1/K;", "it", "a", "(LT1/K;)LT1/K;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<T1.K, T1.K> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19270c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final T1.K invoke(T1.K k10) {
            return k10;
        }
    }

    /* access modifiers changed from: private */
    public static final boolean e(View view, View view2) {
        if (C17542s.e(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float f(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12] * fArr2[i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    /* access modifiers changed from: private */
    public static final c g(View view) {
        d.c(view, 1);
        return d.b(view);
    }

    public static final C17642l<T1.K, T1.K> h() {
        return f19269a;
    }

    /* access modifiers changed from: private */
    public static final void i(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float f10 = f(fArr4, 0, fArr3, 0);
        float f11 = f(fArr4, 0, fArr3, 1);
        float f12 = f(fArr4, 0, fArr3, 2);
        float f13 = f(fArr4, 0, fArr3, 3);
        float f14 = f(fArr4, 1, fArr3, 0);
        float f15 = f(fArr4, 1, fArr3, 1);
        float f16 = f(fArr4, 1, fArr3, 2);
        float f17 = f(fArr4, 1, fArr3, 3);
        float f18 = f(fArr4, 2, fArr3, 0);
        float f19 = f(fArr4, 2, fArr3, 1);
        float f20 = f(fArr4, 2, fArr3, 2);
        float f21 = f(fArr4, 2, fArr3, 3);
        float f22 = f(fArr4, 3, fArr3, 0);
        float f23 = f(fArr4, 3, fArr3, 1);
        float f24 = f(fArr4, 3, fArr3, 2);
        float f25 = f(fArr4, 3, fArr3, 3);
        fArr3[0] = f10;
        fArr3[1] = f11;
        fArr3[2] = f12;
        fArr3[3] = f13;
        fArr3[4] = f14;
        fArr3[5] = f15;
        fArr3[6] = f16;
        fArr3[7] = f17;
        fArr3[8] = f18;
        fArr3[9] = f19;
        fArr3[10] = f20;
        fArr3[11] = f21;
        fArr3[12] = f22;
        fArr3[13] = f23;
        fArr3[14] = f24;
        fArr3[15] = f25;
    }

    /* access modifiers changed from: private */
    public static final void j(float[] fArr, float f10, float f11, float[] fArr2) {
        O0.h(fArr2);
        O0.q(fArr2, f10, f11, 0.0f, 4, (Object) null);
        i(fArr, fArr2);
    }
}
