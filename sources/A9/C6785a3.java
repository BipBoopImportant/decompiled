package a9;

import E8.c;
import YH.C16877v;
import android.widget.EditText;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.a3  reason: case insensitive filesystem */
public final class C6785a3 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42447a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap f42448b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f42449c = C16877v.t(new a(EditText.class, true));

    /* renamed from: a9.a3$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f42450a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f42451b;

        public a(Class<?> cls, boolean z10) {
            C17542s.j(cls, "clazz");
            this.f42450a = cls;
            this.f42451b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(a.class, obj.getClass())) {
                return false;
            }
            return C17542s.e(this.f42450a, ((a) obj).f42450a);
        }

        public final int hashCode() {
            return this.f42450a.hashCode();
        }
    }

    public C6785a3(c cVar) {
        C17542s.j(cVar, "preferencesStore");
        this.f42447a = cVar;
    }
}
