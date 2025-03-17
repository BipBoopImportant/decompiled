package kb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import jb.l;
import jb.r;

/* renamed from: kb.I  reason: case insensitive filesystem */
public abstract class C9929I<K0, V0> {

    /* renamed from: kb.I$a */
    class a extends e<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f74875a;

        a(int i10) {
            this.f74875a = i10;
        }

        /* access modifiers changed from: package-private */
        public <K, V> Map<K, Collection<V>> c() {
            return C9936P.c(this.f74875a);
        }
    }

    /* renamed from: kb.I$b */
    class b extends e<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f74876a;

        b(Comparator comparator) {
            this.f74876a = comparator;
        }

        /* access modifiers changed from: package-private */
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f74876a);
        }
    }

    /* renamed from: kb.I$c */
    private static final class c<V> implements r<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f74877a;

        c(int i10) {
            this.f74877a = C9954i.b(i10, "expectedValuesPerKey");
        }

        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f74877a);
        }
    }

    /* renamed from: kb.I$d */
    public static abstract class d<K0, V0> extends C9929I<K0, V0> {
        d() {
            super((a) null);
        }

        public abstract <K extends K0, V extends V0> C9924D<K, V> e();
    }

    /* renamed from: kb.I$e */
    public static abstract class e<K0> {

        /* renamed from: kb.I$e$a */
        class a extends d<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f74878a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f74879b;

            a(e eVar, int i10) {
                this.f74878a = i10;
                this.f74879b = eVar;
            }

            public <K extends K0, V> C9924D<K, V> e() {
                return C9930J.b(this.f74879b.c(), new c(this.f74878a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            C9954i.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        /* access modifiers changed from: package-private */
        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ C9929I(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        C9954i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(C9935O.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        l.j(comparator);
        return new b(comparator);
    }

    private C9929I() {
    }
}
