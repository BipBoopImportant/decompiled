package Ab;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import qb.C10166k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f58662a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C0958c> f58663b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f58664c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<C0958c> f58665a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private a f58666b = a.f58659b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f58667c = null;

        private boolean c(int i10) {
            Iterator<C0958c> it = this.f58665a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b a(C10166k kVar, int i10, String str, String str2) {
            ArrayList<C0958c> arrayList = this.f58665a;
            if (arrayList != null) {
                arrayList.add(new C0958c(kVar, i10, str, str2));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public c b() {
            if (this.f58665a != null) {
                Integer num = this.f58667c;
                if (num == null || c(num.intValue())) {
                    c cVar = new c(this.f58666b, Collections.unmodifiableList(this.f58665a), this.f58667c);
                    this.f58665a = null;
                    return cVar;
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        public b d(a aVar) {
            if (this.f58665a != null) {
                this.f58666b = aVar;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        public b e(int i10) {
            if (this.f58665a != null) {
                this.f58667c = Integer.valueOf(i10);
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    /* renamed from: Ab.c$c  reason: collision with other inner class name */
    public static final class C0958c {

        /* renamed from: a  reason: collision with root package name */
        private final C10166k f58668a;

        /* renamed from: b  reason: collision with root package name */
        private final int f58669b;

        /* renamed from: c  reason: collision with root package name */
        private final String f58670c;

        /* renamed from: d  reason: collision with root package name */
        private final String f58671d;

        public int a() {
            return this.f58669b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0958c)) {
                return false;
            }
            C0958c cVar = (C0958c) obj;
            return this.f58668a == cVar.f58668a && this.f58669b == cVar.f58669b && this.f58670c.equals(cVar.f58670c) && this.f58671d.equals(cVar.f58671d);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f58668a, Integer.valueOf(this.f58669b), this.f58670c, this.f58671d});
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[]{this.f58668a, Integer.valueOf(this.f58669b), this.f58670c, this.f58671d});
        }

        private C0958c(C10166k kVar, int i10, String str, String str2) {
            this.f58668a = kVar;
            this.f58669b = i10;
            this.f58670c = str;
            this.f58671d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f58662a.equals(cVar.f58662a) && this.f58663b.equals(cVar.f58663b) && Objects.equals(this.f58664c, cVar.f58664c);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f58662a, this.f58663b});
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f58662a, this.f58663b, this.f58664c});
    }

    private c(a aVar, List<C0958c> list, Integer num) {
        this.f58662a = aVar;
        this.f58663b = list;
        this.f58664c = num;
    }
}
