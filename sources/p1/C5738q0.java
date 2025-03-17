package p1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lp1/q0;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "enable", "LXH/N;", "a", "(Landroid/graphics/Canvas;Z)V", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "c", "inorderBarrierMethod", "d", "Z", "orderMethodsFetched", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.q0  reason: case insensitive filesystem */
public final class C5738q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C5738q0 f27341a = new C5738q0();

    /* renamed from: b  reason: collision with root package name */
    private static Method f27342b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f27343c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f27344d;

    private C5738q0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C5743t0.f27346a.a(canvas, z10);
            return;
        }
        if (!f27344d) {
            Class<Canvas> cls = Canvas.class;
            if (i10 == 28) {
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f27342b = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    f27343c = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f27342b = cls.getDeclaredMethod("insertReorderBarrier", (Class[]) null);
                f27343c = cls.getDeclaredMethod("insertInorderBarrier", (Class[]) null);
            }
            Method method2 = f27342b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f27343c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f27344d = true;
        }
        if (z10) {
            try {
                Method method4 = f27342b;
                if (method4 != null) {
                    C17542s.g(method4);
                    method4.invoke(canvas, (Object[]) null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z10 && (method = f27343c) != null) {
            C17542s.g(method);
            method.invoke(canvas, (Object[]) null);
        }
    }
}
