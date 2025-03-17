package x3;

import java.io.File;

public class i implements Comparable<i> {

    /* renamed from: a  reason: collision with root package name */
    public final String f31910a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31911b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31912c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31913d;

    /* renamed from: e  reason: collision with root package name */
    public final File f31914e;

    /* renamed from: f  reason: collision with root package name */
    public final long f31915f;

    public i(String str, long j10, long j11, long j12, File file) {
        this.f31910a = str;
        this.f31911b = j10;
        this.f31912c = j11;
        this.f31913d = file != null;
        this.f31914e = file;
        this.f31915f = j12;
    }

    /* renamed from: a */
    public int compareTo(i iVar) {
        if (!this.f31910a.equals(iVar.f31910a)) {
            return this.f31910a.compareTo(iVar.f31910a);
        }
        int i10 = ((this.f31911b - iVar.f31911b) > 0 ? 1 : ((this.f31911b - iVar.f31911b) == 0 ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f31913d;
    }

    public boolean j() {
        return this.f31912c == -1;
    }

    public String toString() {
        return "[" + this.f31911b + ", " + this.f31912c + "]";
    }
}
