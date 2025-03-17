package org.maplibre.android.style.layers;

import LL.C16031a;
import androidx.annotation.Keep;
import com.google.gson.JsonElement;
import org.maplibre.android.a;
import org.maplibre.android.style.types.Formatted;
import org.maplibre.android.utils.g;

public abstract class Layer {

    /* renamed from: a  reason: collision with root package name */
    private boolean f146082a;
    @Keep
    private boolean invalidated;
    @Keep
    private long nativePtr;

    static {
        a.a();
    }

    @Keep
    protected Layer(long j10) {
        a();
        this.nativePtr = j10;
    }

    private Object b(Object obj) {
        return obj instanceof C16031a ? ((C16031a) obj).e() : obj instanceof Formatted ? ((Formatted) obj).toArray() : obj;
    }

    /* access modifiers changed from: protected */
    public void a() {
        g.a("Mbgl-Layer");
    }

    public String c() {
        a();
        return nativeGetId();
    }

    public long d() {
        return this.nativePtr;
    }

    public void e() {
        this.f146082a = true;
    }

    public void f(d<?>... dVarArr) {
        if (!this.f146082a) {
            a();
            if (dVarArr.length != 0) {
                for (d<?> dVar : dVarArr) {
                    Object b10 = b(dVar.f146084b);
                    if (dVar instanceof b) {
                        nativeSetPaintProperty(dVar.f146083a, b10);
                    } else {
                        nativeSetLayoutProperty(dVar.f146083a, b10);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native JsonElement nativeGetFilter();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMaxZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native float nativeGetMinZoom();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceId();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetSourceLayer();

    /* access modifiers changed from: protected */
    @Keep
    public native Object nativeGetVisibility();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetFilter(Object[] objArr);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetLayoutProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMaxZoom(float f10);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMinZoom(float f10);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetPaintProperty(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetSourceLayer(String str);

    public Layer() {
        a();
    }
}
