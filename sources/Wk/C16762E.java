package WK;

import XK.C16837d;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\n\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%R\u0013\u0010'\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010/8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b3\u0010%R\u0011\u00106\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b5\u0010\"R\u0013\u00108\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b7\u0010\u0012¨\u00069"}, d2 = {"LWK/E;", "", "LWK/h;", "bytes", "<init>", "(LWK/h;)V", "", "child", "G", "(Ljava/lang/String;)LWK/E;", "", "normalize", "F", "(LWK/E;Z)LWK/E;", "other", "E", "(LWK/E;)LWK/E;", "C", "()LWK/E;", "Ljava/io/File;", "I", "()Ljava/io/File;", "Ljava/nio/file/Path;", "J", "()Ljava/nio/file/Path;", "", "a", "(LWK/E;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "LWK/h;", "b", "()LWK/h;", "j", "root", "", "m", "()Ljava/util/List;", "segmentsBytes", "n", "()Z", "isAbsolute", "", "K", "()Ljava/lang/Character;", "volumeLetter", "B", "nameBytes", "v", "name", "D", "parent", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.E  reason: case insensitive filesystem */
public final class C16762E implements Comparable<C16762E> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139592b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f139593c;

    /* renamed from: a  reason: collision with root package name */
    private final C16773h f139594a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u0007*\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006XD¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWK/E$a;", "", "<init>", "()V", "", "", "normalize", "LWK/E;", "b", "(Ljava/lang/String;Z)LWK/E;", "Ljava/io/File;", "a", "(Ljava/io/File;Z)LWK/E;", "Ljava/nio/file/Path;", "c", "(Ljava/nio/file/Path;Z)LWK/E;", "DIRECTORY_SEPARATOR", "Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C16762E d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ C16762E e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ C16762E f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final C16762E a(File file, boolean z10) {
            C17542s.j(file, "<this>");
            String file2 = file.toString();
            C17542s.i(file2, "toString(...)");
            return b(file2, z10);
        }

        public final C16762E b(String str, boolean z10) {
            C17542s.j(str, "<this>");
            return C16837d.k(str, z10);
        }

        public final C16762E c(Path path, boolean z10) {
            C17542s.j(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String str = File.separator;
        C17542s.i(str, "separator");
        f139593c = str;
    }

    public C16762E(C16773h hVar) {
        C17542s.j(hVar, "bytes");
        this.f139594a = hVar;
    }

    public static /* synthetic */ C16762E H(C16762E e10, C16762E e11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e10.F(e11, z10);
    }

    public final C16773h B() {
        int d10 = C16837d.l(this);
        return d10 != -1 ? C16773h.Z(b(), d10 + 1, 0, 2, (Object) null) : (K() == null || b().W() != 2) ? b() : C16773h.f139665e;
    }

    public final C16762E C() {
        return f139592b.b(toString(), true);
    }

    public final C16762E D() {
        C16762E e10;
        if (C17542s.e(b(), C16837d.f140287d) || C17542s.e(b(), C16837d.f140284a) || C17542s.e(b(), C16837d.f140285b) || C16837d.n(this)) {
            return null;
        }
        int d10 = C16837d.l(this);
        if (d10 != 2 || K() == null) {
            if (d10 == 1 && b().X(C16837d.f140285b)) {
                return null;
            }
            if (d10 != -1 || K() == null) {
                if (d10 == -1) {
                    return new C16762E(C16837d.f140287d);
                }
                if (d10 != 0) {
                    return new C16762E(C16773h.Z(b(), 0, d10, 1, (Object) null));
                }
                e10 = new C16762E(C16773h.Z(b(), 0, 1, 1, (Object) null));
            } else if (b().W() == 2) {
                return null;
            } else {
                e10 = new C16762E(C16773h.Z(b(), 0, 2, 1, (Object) null));
            }
        } else if (b().W() == 3) {
            return null;
        } else {
            e10 = new C16762E(C16773h.Z(b(), 0, 3, 1, (Object) null));
        }
        return e10;
    }

    public final C16762E E(C16762E e10) {
        C17542s.j(e10, "other");
        if (C17542s.e(j(), e10.j())) {
            List<C16773h> m10 = m();
            List<C16773h> m11 = e10.m();
            int min = Math.min(m10.size(), m11.size());
            int i10 = 0;
            while (i10 < min && C17542s.e(m10.get(i10), m11.get(i10))) {
                i10++;
            }
            if (i10 == min && b().W() == e10.b().W()) {
                return a.e(f139592b, ".", false, 1, (Object) null);
            }
            if (m11.subList(i10, m11.size()).indexOf(C16837d.f140288e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + e10).toString());
            } else if (C17542s.e(e10.b(), C16837d.f140287d)) {
                return this;
            } else {
                C16770e eVar = new C16770e();
                C16773h f10 = C16837d.m(e10);
                if (f10 == null && (f10 = C16837d.m(this)) == null) {
                    f10 = C16837d.s(f139593c);
                }
                int size = m11.size();
                for (int i11 = i10; i11 < size; i11++) {
                    eVar.j2(C16837d.f140288e);
                    eVar.j2(f10);
                }
                int size2 = m10.size();
                while (i10 < size2) {
                    eVar.j2(m10.get(i10));
                    eVar.j2(f10);
                    i10++;
                }
                return C16837d.q(eVar, false);
            }
        } else {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + e10).toString());
        }
    }

    public final C16762E F(C16762E e10, boolean z10) {
        C17542s.j(e10, "child");
        return C16837d.j(this, e10, z10);
    }

    public final C16762E G(String str) {
        C17542s.j(str, "child");
        return C16837d.j(this, C16837d.q(new C16770e().D0(str), false), false);
    }

    public final File I() {
        return new File(toString());
    }

    public final Path J() {
        Path path = Paths.get(toString(), new String[0]);
        C17542s.i(path, "get(...)");
        return path;
    }

    public final Character K() {
        if (C16773h.J(b(), C16837d.f140284a, 0, 2, (Object) null) != -1 || b().W() < 2 || b().B(1) != 58) {
            return null;
        }
        char B10 = (char) b().B(0);
        if (('a' > B10 || B10 >= '{') && ('A' > B10 || B10 >= '[')) {
            return null;
        }
        return Character.valueOf(B10);
    }

    /* renamed from: a */
    public int compareTo(C16762E e10) {
        C17542s.j(e10, "other");
        return b().compareTo(e10.b());
    }

    public final C16773h b() {
        return this.f139594a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C16762E) && C17542s.e(((C16762E) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final C16762E j() {
        int h10 = C16837d.o(this);
        if (h10 == -1) {
            return null;
        }
        return new C16762E(b().Y(0, h10));
    }

    public final List<C16773h> m() {
        ArrayList arrayList = new ArrayList();
        int h10 = C16837d.o(this);
        if (h10 == -1) {
            h10 = 0;
        } else if (h10 < b().W() && b().B(h10) == 92) {
            h10++;
        }
        int W10 = b().W();
        int i10 = h10;
        while (h10 < W10) {
            if (b().B(h10) == 47 || b().B(h10) == 92) {
                arrayList.add(b().Y(i10, h10));
                i10 = h10 + 1;
            }
            h10++;
        }
        if (i10 < b().W()) {
            arrayList.add(b().Y(i10, b().W()));
        }
        return arrayList;
    }

    public final boolean n() {
        return C16837d.o(this) != -1;
    }

    public String toString() {
        return b().c0();
    }

    public final String v() {
        return B().c0();
    }
}
