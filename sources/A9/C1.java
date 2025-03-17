package a9;

import HJ.C15854t;
import kotlin.jvm.internal.C17542s;

public final class C1 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f41941a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41942b;

        /* renamed from: c  reason: collision with root package name */
        public final int f41943c;

        public a(int i10, int i11, String str) {
            C17542s.j(str, "value");
            this.f41941a = str;
            this.f41942b = i10;
            this.f41943c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f41941a, aVar.f41941a) && this.f41942b == aVar.f41942b && this.f41943c == aVar.f41943c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f41942b);
            return Integer.hashCode(this.f41943c) + ((hashCode + (this.f41941a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "URL(value=" + this.f41941a + ", startIndex=" + this.f41942b + ", endIndex=" + this.f41943c + ')';
        }
    }

    public static a a(int i10, String str, String str2, String str3) {
        int s02 = C15854t.s0(str, str2, i10, false, 4, (Object) null);
        Integer valueOf = Integer.valueOf(s02);
        if (s02 == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int length = str2.length() + valueOf.intValue();
        int s03 = C15854t.s0(str, str3, length, false, 4, (Object) null);
        Integer valueOf2 = Integer.valueOf(s03);
        if (s03 == -1) {
            valueOf2 = null;
        }
        if (valueOf2 == null) {
            return null;
        }
        int intValue = valueOf2.intValue();
        if (C15854t.V(str, "url(", length, false, 4, (Object) null)) {
            if (!C15854t.V(str, ")", intValue - 1, false, 4, (Object) null)) {
                return null;
            }
            length += 4;
            intValue--;
        }
        if (C15854t.V(str, "\"", length, false, 4, (Object) null) || C15854t.V(str, "'", length, false, 4, (Object) null)) {
            length++;
            intValue--;
        }
        if (length >= intValue) {
            return null;
        }
        String substring = str.substring(length, intValue);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new a(length, intValue, substring);
    }
}
