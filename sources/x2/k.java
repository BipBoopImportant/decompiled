package x2;

import E2.k;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import w2.C6211e;

public class k extends j {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f31853g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f31854h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f31855i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f31856j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f31857k;

    /* renamed from: l  reason: collision with root package name */
    protected final Method f31858l;

    /* renamed from: m  reason: collision with root package name */
    protected final Method f31859m;

    public k() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = u();
            constructor = v(cls);
            method5 = r(cls);
            method4 = s(cls);
            method3 = w(cls);
            method2 = q(cls);
            method = t(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f31853g = cls;
        this.f31854h = constructor;
        this.f31855i = method5;
        this.f31856j = method4;
        this.f31857k = method3;
        this.f31858l = method2;
        this.f31859m = method;
    }

    private Object k() {
        try {
            return this.f31854h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void l(Object obj) {
        try {
            this.f31858l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean m(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f31855i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean n(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f31856j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj) {
        try {
            return ((Boolean) this.f31857k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p() {
        if (this.f31855i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f31855i != null;
    }

    public Typeface a(Context context, C6211e.c cVar, Resources resources, int i10) {
        if (!p()) {
            return super.a(context, cVar, resources, i10);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        for (C6211e.d dVar : cVar.a()) {
            if (!m(context, k10, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                l(k10);
                return null;
            }
        }
        if (!o(k10)) {
            return null;
        }
        return i(k10);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        Typeface i11;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!p()) {
            k.b g10 = g(bVarArr, i10);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(g10.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g10.e()).setItalic(g10.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            Map<Uri, ByteBuffer> f10 = o.f(context, bVarArr, cancellationSignal);
            Object k10 = k();
            if (k10 == null) {
                return null;
            }
            boolean z10 = false;
            for (k.b bVar : bVarArr) {
                ByteBuffer byteBuffer = f10.get(bVar.d());
                if (byteBuffer != null) {
                    if (!n(k10, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        l(k10);
                        return null;
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                l(k10);
                return null;
            } else if (o(k10) && (i11 = i(k10)) != null) {
                return Typeface.create(i11, i10);
            } else {
                return null;
            }
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!p()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        if (!m(context, k10, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            l(k10);
            return null;
        } else if (!o(k10)) {
            return null;
        } else {
            return i(k10);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f31853g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f31859m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Method q(Class<?> cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method r(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method s(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    public Method t(Class<?> cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class<?> u() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    public Constructor<?> v(Class<?> cls) {
        return cls.getConstructor((Class[]) null);
    }

    /* access modifiers changed from: protected */
    public Method w(Class<?> cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }
}
