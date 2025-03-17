package androidx.compose.ui.platform;

import XH.C16807N;
import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import p1.O0;
import p1.P;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/z0;", "T", "", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "LXH/N;", "getMatrix", "<init>", "(LnI/p;)V", "c", "()V", "target", "Lp1/O0;", "b", "(Ljava/lang/Object;)[F", "a", "LnI/p;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.z0  reason: case insensitive filesystem */
public final class C5145z0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p<T, Matrix, C16807N> f19679a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f19680b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f19681c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f19682d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f19683e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f19684f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19685g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19686h = true;

    public C5145z0(p<? super T, ? super Matrix, C16807N> pVar) {
        this.f19679a = pVar;
    }

    public final float[] a(T t10) {
        float[] fArr = this.f19683e;
        if (fArr == null) {
            fArr = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f19683e = fArr;
        }
        if (this.f19685g) {
            this.f19686h = C5141x0.a(b(t10), fArr);
            this.f19685g = false;
        }
        if (this.f19686h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t10) {
        float[] fArr = this.f19682d;
        if (fArr == null) {
            fArr = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f19682d = fArr;
        }
        if (!this.f19684f) {
            return fArr;
        }
        Matrix matrix = this.f19680b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f19680b = matrix;
        }
        this.f19679a.invoke(t10, matrix);
        Matrix matrix2 = this.f19681c;
        if (matrix2 == null || !C17542s.e(matrix, matrix2)) {
            P.b(fArr, matrix);
            this.f19680b = matrix2;
            this.f19681c = matrix;
        }
        this.f19684f = false;
        return fArr;
    }

    public final void c() {
        this.f19684f = true;
        this.f19685g = true;
    }
}
