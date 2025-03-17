package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a  reason: case insensitive filesystem */
public class C17525a implements C17538n, Serializable {

    /* renamed from: a  reason: collision with root package name */
    protected final Object f144363a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f144364b;

    /* renamed from: c  reason: collision with root package name */
    private final String f144365c;

    /* renamed from: d  reason: collision with root package name */
    private final String f144366d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f144367e;

    /* renamed from: f  reason: collision with root package name */
    private final int f144368f;

    /* renamed from: g  reason: collision with root package name */
    private final int f144369g;

    public C17525a(int i10, Class cls, String str, String str2, int i11) {
        this(i10, C17530f.NO_RECEIVER, cls, str, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17525a)) {
            return false;
        }
        C17525a aVar = (C17525a) obj;
        return this.f144367e == aVar.f144367e && this.f144368f == aVar.f144368f && this.f144369g == aVar.f144369g && C17542s.e(this.f144363a, aVar.f144363a) && C17542s.e(this.f144364b, aVar.f144364b) && this.f144365c.equals(aVar.f144365c) && this.f144366d.equals(aVar.f144366d);
    }

    public int getArity() {
        return this.f144368f;
    }

    public int hashCode() {
        Object obj = this.f144363a;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f144364b;
        if (cls != null) {
            i10 = cls.hashCode();
        }
        return ((((((((((hashCode + i10) * 31) + this.f144365c.hashCode()) * 31) + this.f144366d.hashCode()) * 31) + (this.f144367e ? 1231 : 1237)) * 31) + this.f144368f) * 31) + this.f144369g;
    }

    public String toString() {
        return P.j(this);
    }

    public C17525a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f144363a = obj;
        this.f144364b = cls;
        this.f144365c = str;
        this.f144366d = str2;
        this.f144367e = (i11 & 1) == 1;
        this.f144368f = i10;
        this.f144369g = i11 >> 1;
    }
}
