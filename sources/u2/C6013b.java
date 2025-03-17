package u2;

import H2.i;
import android.content.LocusId;
import android.os.Build;

/* renamed from: u2.b  reason: case insensitive filesystem */
public final class C6013b {

    /* renamed from: a  reason: collision with root package name */
    private final String f30060a;

    /* renamed from: b  reason: collision with root package name */
    private final LocusId f30061b;

    /* renamed from: u2.b$a */
    private static class a {
        static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public C6013b(String str) {
        this.f30060a = (String) i.k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f30061b = a.a(str);
        } else {
            this.f30061b = null;
        }
    }

    private String b() {
        int length = this.f30060a.length();
        return length + "_chars";
    }

    public String a() {
        return this.f30060a;
    }

    public LocusId c() {
        return this.f30061b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6013b.class != obj.getClass()) {
            return false;
        }
        C6013b bVar = (C6013b) obj;
        String str = this.f30060a;
        return str == null ? bVar.f30060a == null : str.equals(bVar.f30060a);
    }

    public int hashCode() {
        String str = this.f30060a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
