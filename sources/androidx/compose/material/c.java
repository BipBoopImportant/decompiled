package androidx.compose.material;

import I0.C;
import YH.C16877v;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006#"}, d2 = {"Landroidx/compose/material/c;", "T", "LI0/C;", "", "", "anchors", "<init>", "(Ljava/util/Map;)V", "value", "f", "(Ljava/lang/Object;)F", "", "d", "(Ljava/lang/Object;)Z", "position", "c", "(F)Ljava/lang/Object;", "searchUpwards", "b", "(FZ)Ljava/lang/Object;", "e", "()F", "g", "", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "size", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c<T> implements C<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, Float> f18619a;

    public c(Map<T, Float> map) {
        this.f18619a = map;
    }

    public int a() {
        return this.f18619a.size();
    }

    public T b(float f10, boolean z10) {
        Object obj;
        Iterator it = this.f18619a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) obj).getValue()).floatValue();
                float f11 = z10 ? floatValue - f10 : f10 - floatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    float f12 = z10 ? floatValue2 - f10 : f10 - floatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        obj = next;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public T c(float f10) {
        Object obj;
        Iterator it = this.f18619a.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f10 - ((Number) ((Map.Entry) obj).getValue()).floatValue());
                do {
                    Object next = it.next();
                    float abs2 = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        obj = next;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    public boolean d(T t10) {
        return this.f18619a.containsKey(t10);
    }

    public float e() {
        Float Q02 = C16877v.Q0(this.f18619a.values());
        if (Q02 != null) {
            return Q02.floatValue();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return C17542s.e(this.f18619a, ((c) obj).f18619a);
    }

    public float f(T t10) {
        Float f10 = this.f18619a.get(t10);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public float g() {
        Float N02 = C16877v.N0(this.f18619a.values());
        if (N02 != null) {
            return N02.floatValue();
        }
        return Float.NaN;
    }

    public int hashCode() {
        return this.f18619a.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.f18619a + ')';
    }
}
