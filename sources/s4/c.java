package s4;

import android.text.TextUtils;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jb.C9892c;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f55809a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f55810b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f55811c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f55812d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f55813e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f55814f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55815g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f55816h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55817i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f55818j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f55819k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f55820l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f55821m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f55822n = -1;

    /* renamed from: o  reason: collision with root package name */
    private float f55823o;

    /* renamed from: p  reason: collision with root package name */
    private int f55824p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f55825q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f55819k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f55817i) {
            return this.f55816h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f55825q;
    }

    public int c() {
        if (this.f55815g) {
            return this.f55814f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f55813e;
    }

    public float e() {
        return this.f55823o;
    }

    public int f() {
        return this.f55822n;
    }

    public int g() {
        return this.f55824p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f55809a.isEmpty() && this.f55810b.isEmpty() && this.f55811c.isEmpty() && this.f55812d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B10 = B(B(B(0, this.f55809a, str, CatalogRepository.FETCH_FLAG_SDB), this.f55810b, str2, 2), this.f55812d, str3, 4);
        if (B10 == -1 || !set.containsAll(this.f55811c)) {
            return 0;
        }
        return B10 + (this.f55811c.size() * 4);
    }

    public int i() {
        int i10 = this.f55820l;
        if (i10 == -1 && this.f55821m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f55821m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public boolean j() {
        return this.f55817i;
    }

    public boolean k() {
        return this.f55815g;
    }

    public boolean l() {
        return this.f55818j == 1;
    }

    public boolean m() {
        return this.f55819k == 1;
    }

    public c n(int i10) {
        this.f55816h = i10;
        this.f55817i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f55820l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f55825q = z10;
        return this;
    }

    public c q(int i10) {
        this.f55814f = i10;
        this.f55815g = true;
        return this;
    }

    public c r(String str) {
        this.f55813e = str == null ? null : C9892c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f55823o = f10;
        return this;
    }

    public c t(int i10) {
        this.f55822n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f55821m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f55824p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f55811c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f55809a = str;
    }

    public void y(String str) {
        this.f55810b = str;
    }

    public void z(String str) {
        this.f55812d = str;
    }
}
