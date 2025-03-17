package m9;

import android.content.Context;
import v9.C8903a;

/* renamed from: m9.c  reason: case insensitive filesystem */
final class C8566c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f55034a;

    /* renamed from: b  reason: collision with root package name */
    private final C8903a f55035b;

    /* renamed from: c  reason: collision with root package name */
    private final C8903a f55036c;

    /* renamed from: d  reason: collision with root package name */
    private final String f55037d;

    C8566c(Context context, C8903a aVar, C8903a aVar2, String str) {
        if (context != null) {
            this.f55034a = context;
            if (aVar != null) {
                this.f55035b = aVar;
                if (aVar2 != null) {
                    this.f55036c = aVar2;
                    if (str != null) {
                        this.f55037d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.f55034a;
    }

    public String c() {
        return this.f55037d;
    }

    public C8903a d() {
        return this.f55036c;
    }

    public C8903a e() {
        return this.f55035b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f55034a.equals(hVar.b()) && this.f55035b.equals(hVar.e()) && this.f55036c.equals(hVar.d()) && this.f55037d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f55034a.hashCode() ^ 1000003) * 1000003) ^ this.f55035b.hashCode()) * 1000003) ^ this.f55036c.hashCode()) * 1000003) ^ this.f55037d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f55034a + ", wallClock=" + this.f55035b + ", monotonicClock=" + this.f55036c + ", backendName=" + this.f55037d + "}";
    }
}
