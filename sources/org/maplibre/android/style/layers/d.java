package org.maplibre.android.style.layers;

import java.util.Arrays;

public class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f146083a;

    /* renamed from: b  reason: collision with root package name */
    public final T f146084b;

    public d(String str, T t10) {
        this.f146083a = str;
        this.f146084b = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f146083a.equals(dVar.f146083a)) {
            return false;
        }
        T t10 = this.f146084b;
        return t10 != null ? t10 instanceof Object[] ? Arrays.deepEquals((Object[]) t10, (Object[]) dVar.f146084b) : t10.equals(dVar.f146084b) : dVar.f146084b == null;
    }

    public int hashCode() {
        int hashCode = this.f146083a.hashCode() * 31;
        T t10 = this.f146084b;
        return hashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f146083a, this.f146084b});
    }
}
