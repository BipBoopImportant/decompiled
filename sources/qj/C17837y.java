package qJ;

import cJ.C17065b;
import kotlin.jvm.internal.C17542s;

/* renamed from: qJ.y  reason: case insensitive filesystem */
public final class C17837y<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f146612a;

    /* renamed from: b  reason: collision with root package name */
    private final T f146613b;

    /* renamed from: c  reason: collision with root package name */
    private final T f146614c;

    /* renamed from: d  reason: collision with root package name */
    private final T f146615d;

    /* renamed from: e  reason: collision with root package name */
    private final String f146616e;

    /* renamed from: f  reason: collision with root package name */
    private final C17065b f146617f;

    public C17837y(T t10, T t11, T t12, T t13, String str, C17065b bVar) {
        C17542s.j(str, "filePath");
        C17542s.j(bVar, "classId");
        this.f146612a = t10;
        this.f146613b = t11;
        this.f146614c = t12;
        this.f146615d = t13;
        this.f146616e = str;
        this.f146617f = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17837y)) {
            return false;
        }
        C17837y yVar = (C17837y) obj;
        return C17542s.e(this.f146612a, yVar.f146612a) && C17542s.e(this.f146613b, yVar.f146613b) && C17542s.e(this.f146614c, yVar.f146614c) && C17542s.e(this.f146615d, yVar.f146615d) && C17542s.e(this.f146616e, yVar.f146616e) && C17542s.e(this.f146617f, yVar.f146617f);
    }

    public int hashCode() {
        T t10 = this.f146612a;
        int i10 = 0;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f146613b;
        int hashCode2 = (hashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f146614c;
        int hashCode3 = (hashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f146615d;
        if (t13 != null) {
            i10 = t13.hashCode();
        }
        return ((((hashCode3 + i10) * 31) + this.f146616e.hashCode()) * 31) + this.f146617f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f146612a + ", compilerVersion=" + this.f146613b + ", languageVersion=" + this.f146614c + ", expectedVersion=" + this.f146615d + ", filePath=" + this.f146616e + ", classId=" + this.f146617f + ')';
    }
}
