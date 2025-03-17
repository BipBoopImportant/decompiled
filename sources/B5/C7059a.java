package b5;

import aL.C17032a;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b5.a  reason: case insensitive filesystem */
public abstract class C7059a implements C7067i {

    /* renamed from: c  reason: collision with root package name */
    private static final Set<C7059a> f45411c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f45412a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45413b;

    /* renamed from: b5.a$a  reason: collision with other inner class name */
    private static class C0784a {

        /* renamed from: a  reason: collision with root package name */
        static final Set<String> f45414a = new HashSet(Arrays.asList(p.d().a()));
    }

    /* renamed from: b5.a$b */
    public static class b extends C7059a {
        b(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: b5.a$c */
    public static class c extends C7059a {
        c(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: b5.a$d */
    public static class d extends C7059a {
        d(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return false;
        }
    }

    /* renamed from: b5.a$e */
    public static class e extends C7059a {
        e(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return true;
        }
    }

    /* renamed from: b5.a$f */
    public static class f extends C7059a {
        f(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: b5.a$g */
    public static class g extends C7059a {
        g(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: b5.a$h */
    public static class h extends C7059a {
        h(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: b5.a$i */
    public static class i extends C7059a {
        i(String str, String str2) {
            super(str, str2);
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    C7059a(String str, String str2) {
        this.f45412a = str;
        this.f45413b = str2;
        f45411c.add(this);
    }

    public static Set<C7059a> d() {
        return Collections.unmodifiableSet(f45411c);
    }

    public String a() {
        return this.f45412a;
    }

    public abstract boolean b();

    public boolean c() {
        return C17032a.b(C0784a.f45414a, this.f45413b);
    }

    public boolean isSupported() {
        return b() || c();
    }
}
