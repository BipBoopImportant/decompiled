package l2;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: l2.c  reason: case insensitive filesystem */
public class C5519c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final char[] f25464a;

    /* renamed from: b  reason: collision with root package name */
    protected long f25465b = -1;

    /* renamed from: c  reason: collision with root package name */
    protected long f25466c = Long.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    protected C5518b f25467d;

    /* renamed from: e  reason: collision with root package name */
    private int f25468e;

    public C5519c(char[] cArr) {
        this.f25464a = cArr;
    }

    /* access modifiers changed from: protected */
    public String A() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean C() {
        char[] cArr = this.f25464a;
        return cArr != null && cArr.length >= 1;
    }

    public boolean D() {
        return this.f25466c != Long.MAX_VALUE;
    }

    public void E(C5518b bVar) {
        this.f25467d = bVar;
    }

    public void G(long j10) {
        if (this.f25466c == Long.MAX_VALUE) {
            this.f25466c = j10;
            if (g.f25473d) {
                PrintStream printStream = System.out;
                printStream.println("closing " + hashCode() + " -> " + this);
            }
            C5518b bVar = this.f25467d;
            if (bVar != null) {
                bVar.L(this);
            }
        }
    }

    public void H(int i10) {
        this.f25468e = i10;
    }

    public void I(long j10) {
        this.f25465b = j10;
    }

    /* access modifiers changed from: protected */
    public String K() {
        return "";
    }

    /* renamed from: b */
    public C5519c clone() {
        try {
            return (C5519c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5519c)) {
            return false;
        }
        C5519c cVar = (C5519c) obj;
        if (this.f25465b == cVar.f25465b && this.f25466c == cVar.f25466c && this.f25468e == cVar.f25468e && Arrays.equals(this.f25464a, cVar.f25464a)) {
            return Objects.equals(this.f25467d, cVar.f25467d);
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25465b;
        long j11 = this.f25466c;
        int hashCode = ((((Arrays.hashCode(this.f25464a) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        C5518b bVar = this.f25467d;
        return ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f25468e;
    }

    public String j() {
        String str = new String(this.f25464a);
        if (str.length() < 1) {
            return "";
        }
        long j10 = this.f25466c;
        if (j10 != Long.MAX_VALUE) {
            long j11 = this.f25465b;
            if (j10 >= j11) {
                return str.substring((int) j11, ((int) j10) + 1);
            }
        }
        long j12 = this.f25465b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public C5519c k() {
        return this.f25467d;
    }

    /* access modifiers changed from: protected */
    public String m() {
        if (!g.f25473d) {
            return "";
        }
        return A() + " -> ";
    }

    public float p() {
        if (this instanceof e) {
            return ((e) this).p();
        }
        return Float.NaN;
    }

    public int r() {
        if (this instanceof e) {
            return ((e) this).r();
        }
        return 0;
    }

    public String toString() {
        long j10 = this.f25465b;
        long j11 = this.f25466c;
        if (j10 > j11 || j11 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f25465b + "-" + this.f25466c + ")";
        }
        String substring = new String(this.f25464a).substring((int) this.f25465b, ((int) this.f25466c) + 1);
        return A() + " (" + this.f25465b + " : " + this.f25466c + ") <<" + substring + ">>";
    }

    public int y() {
        return this.f25468e;
    }
}
