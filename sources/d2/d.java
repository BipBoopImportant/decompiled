package D2;

import XH.v;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "LXH/v;", "", "", "pairs", "Landroid/os/Bundle;", "b", "([LXH/v;)Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Bundle a() {
        return new Bundle(0);
    }

    public static final Bundle b(v<String, ? extends Object>... vVarArr) {
        Bundle bundle = new Bundle(vVarArr.length);
        for (v<String, ? extends Object> vVar : vVarArr) {
            String a10 = vVar.a();
            Object b10 = vVar.b();
            if (b10 == null) {
                bundle.putString(a10, (String) null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(a10, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(a10, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(a10, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(a10, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(a10, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(a10, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(a10, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(a10, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(a10, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(a10, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(a10, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(a10, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(a10, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(a10, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(a10, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(a10, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(a10, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(a10, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(a10, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                C17542s.g(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C17542s.h(b10, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a10, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C17542s.h(b10, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a10, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C17542s.h(b10, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a10, (CharSequence[]) b10);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a10, (Serializable) b10);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a10 + '\"');
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(a10, (Serializable) b10);
            } else if (b10 instanceof IBinder) {
                bundle.putBinder(a10, (IBinder) b10);
            } else if (b10 instanceof Size) {
                b.a(bundle, a10, (Size) b10);
            } else if (b10 instanceof SizeF) {
                b.b(bundle, a10, (SizeF) b10);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + a10 + '\"');
            }
        }
        return bundle;
    }
}
