package O4;

import HJ.C15854t;
import Q4.g;
import androidx.room.o;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0005\u0017\u0019\u001b\u001d\u001eBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"LO4/f;", "", "", "name", "", "LO4/f$a;", "columns", "", "LO4/f$c;", "foreignKeys", "LO4/f$e;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "Ljava/util/Set;", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final b f39220e = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f39221a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f39222b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<c> f39223c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<e> f39224d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 \"2\u00020\u0001:\u0001\rB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010!\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"LO4/f$a;", "", "", "name", "type", "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "a", "(Ljava/lang/String;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "c", "Z", "d", "I", "e", "f", "g", "getAffinity$annotations", "()V", "affinity", "h", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0618a f39225h = new C0618a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f39226a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39227b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f39228c;

        /* renamed from: d  reason: collision with root package name */
        public final int f39229d;

        /* renamed from: e  reason: collision with root package name */
        public final String f39230e;

        /* renamed from: f  reason: collision with root package name */
        public final int f39231f;

        /* renamed from: g  reason: collision with root package name */
        public final int f39232g;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LO4/f$a$a;", "", "<init>", "()V", "", "current", "", "a", "(Ljava/lang/String;)Z", "other", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O4.f$a$a  reason: collision with other inner class name */
        public static final class C0618a {
            public /* synthetic */ C0618a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    int i13 = i12 + 1;
                    if (i12 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i11++;
                    } else if (charAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                        return false;
                    }
                    i10++;
                    i12 = i13;
                }
                return i11 == 0;
            }

            public final boolean b(String str, String str2) {
                C17542s.j(str, "current");
                if (C17542s.e(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return C17542s.e(C15854t.z1(substring).toString(), str2);
            }

            private C0618a() {
            }
        }

        public a(String str, String str2, boolean z10, int i10, String str3, int i11) {
            C17542s.j(str, "name");
            C17542s.j(str2, "type");
            this.f39226a = str;
            this.f39227b = str2;
            this.f39228c = z10;
            this.f39229d = i10;
            this.f39230e = str3;
            this.f39231f = i11;
            this.f39232g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
            String upperCase = str.toUpperCase(locale);
            C17542s.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (C15854t.d0(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (C15854t.d0(upperCase, "CHAR", false, 2, (Object) null) || C15854t.d0(upperCase, "CLOB", false, 2, (Object) null) || C15854t.d0(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (C15854t.d0(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            return (C15854t.d0(upperCase, "REAL", false, 2, (Object) null) || C15854t.d0(upperCase, "FLOA", false, 2, (Object) null) || C15854t.d0(upperCase, "DOUB", false, 2, (Object) null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f39229d != ((a) obj).f39229d) {
                return false;
            }
            a aVar = (a) obj;
            if (!C17542s.e(this.f39226a, aVar.f39226a) || this.f39228c != aVar.f39228c) {
                return false;
            }
            if (this.f39231f == 1 && aVar.f39231f == 2 && (str3 = this.f39230e) != null && !f39225h.b(str3, aVar.f39230e)) {
                return false;
            }
            if (this.f39231f == 2 && aVar.f39231f == 1 && (str2 = aVar.f39230e) != null && !f39225h.b(str2, this.f39230e)) {
                return false;
            }
            int i10 = this.f39231f;
            if (i10 == 0 || i10 != aVar.f39231f || ((str = this.f39230e) == null ? aVar.f39230e == null : f39225h.b(str, aVar.f39230e))) {
                return this.f39232g == aVar.f39232g;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f39226a.hashCode() * 31) + this.f39232g) * 31) + (this.f39228c ? 1231 : 1237)) * 31) + this.f39229d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f39226a);
            sb2.append("', type='");
            sb2.append(this.f39227b);
            sb2.append("', affinity='");
            sb2.append(this.f39232g);
            sb2.append("', notNull=");
            sb2.append(this.f39228c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f39229d);
            sb2.append(", defaultValue='");
            String str = this.f39230e;
            if (str == null) {
                str = "undefined";
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"LO4/f$b;", "", "<init>", "()V", "LQ4/g;", "database", "", "tableName", "LO4/f;", "a", "(LQ4/g;Ljava/lang/String;)LO4/f;", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(g gVar, String str) {
            C17542s.j(gVar, "database");
            C17542s.j(str, "tableName");
            return g.f(gVar, str);
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LO4/f$c;", "", "", "referenceTable", "onDelete", "onUpdate", "", "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/util/List;", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f39233a;

        /* renamed from: b  reason: collision with root package name */
        public final String f39234b;

        /* renamed from: c  reason: collision with root package name */
        public final String f39235c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f39236d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f39237e;

        public c(String str, String str2, String str3, List<String> list, List<String> list2) {
            C17542s.j(str, "referenceTable");
            C17542s.j(str2, "onDelete");
            C17542s.j(str3, "onUpdate");
            C17542s.j(list, "columnNames");
            C17542s.j(list2, "referenceColumnNames");
            this.f39233a = str;
            this.f39234b = str2;
            this.f39235c = str3;
            this.f39236d = list;
            this.f39237e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (C17542s.e(this.f39233a, cVar.f39233a) && C17542s.e(this.f39234b, cVar.f39234b) && C17542s.e(this.f39235c, cVar.f39235c) && C17542s.e(this.f39236d, cVar.f39236d)) {
                return C17542s.e(this.f39237e, cVar.f39237e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f39233a.hashCode() * 31) + this.f39234b.hashCode()) * 31) + this.f39235c.hashCode()) * 31) + this.f39236d.hashCode()) * 31) + this.f39237e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f39233a + "', onDelete='" + this.f39234b + " +', onUpdate='" + this.f39235c + "', columnNames=" + this.f39236d + ", referenceColumnNames=" + this.f39237e + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LO4/f$d;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "a", "(LO4/f$d;)I", "I", "j", "()I", "b", "getSequence", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "m", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Comparable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final int f39238a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39239b;

        /* renamed from: c  reason: collision with root package name */
        private final String f39240c;

        /* renamed from: d  reason: collision with root package name */
        private final String f39241d;

        public d(int i10, int i11, String str, String str2) {
            C17542s.j(str, "from");
            C17542s.j(str2, "to");
            this.f39238a = i10;
            this.f39239b = i11;
            this.f39240c = str;
            this.f39241d = str2;
        }

        /* renamed from: a */
        public int compareTo(d dVar) {
            C17542s.j(dVar, "other");
            int i10 = this.f39238a - dVar.f39238a;
            return i10 == 0 ? this.f39239b - dVar.f39239b : i10;
        }

        public final String b() {
            return this.f39240c;
        }

        public final int j() {
            return this.f39238a;
        }

        public final String m() {
            return this.f39241d;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"LO4/f$e;", "", "", "name", "", "unique", "", "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "c", "Ljava/util/List;", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final a f39242e = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        public final String f39243a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f39244b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f39245c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f39246d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LO4/f$e$a;", "", "<init>", "()V", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public e(String str, boolean z10, List<String> list, List<String> list2) {
            C17542s.j(str, "name");
            C17542s.j(list, "columns");
            C17542s.j(list2, "orders");
            this.f39243a = str;
            this.f39244b = z10;
            this.f39245c = list;
            this.f39246d = list2;
            Collection collection = list2;
            boolean isEmpty = collection.isEmpty();
            ArrayList arrayList = collection;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(o.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f39246d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f39244b == eVar.f39244b && C17542s.e(this.f39245c, eVar.f39245c) && C17542s.e(this.f39246d, eVar.f39246d)) {
                return C15854t.W(this.f39243a, "index_", false, 2, (Object) null) ? C15854t.W(eVar.f39243a, "index_", false, 2, (Object) null) : C17542s.e(this.f39243a, eVar.f39243a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((C15854t.W(this.f39243a, "index_", false, 2, (Object) null) ? -1184239155 : this.f39243a.hashCode()) * 31) + (this.f39244b ? 1 : 0)) * 31) + this.f39245c.hashCode()) * 31) + this.f39246d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f39243a + "', unique=" + this.f39244b + ", columns=" + this.f39245c + ", orders=" + this.f39246d + "'}";
        }
    }

    public f(String str, Map<String, a> map, Set<c> set, Set<e> set2) {
        C17542s.j(str, "name");
        C17542s.j(map, "columns");
        C17542s.j(set, "foreignKeys");
        this.f39221a = str;
        this.f39222b = map;
        this.f39223c = set;
        this.f39224d = set2;
    }

    public static final f a(g gVar, String str) {
        return f39220e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set<e> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!C17542s.e(this.f39221a, fVar.f39221a) || !C17542s.e(this.f39222b, fVar.f39222b) || !C17542s.e(this.f39223c, fVar.f39223c)) {
            return false;
        }
        Set<e> set2 = this.f39224d;
        if (set2 == null || (set = fVar.f39224d) == null) {
            return true;
        }
        return C17542s.e(set2, set);
    }

    public int hashCode() {
        return (((this.f39221a.hashCode() * 31) + this.f39222b.hashCode()) * 31) + this.f39223c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f39221a + "', columns=" + this.f39222b + ", foreignKeys=" + this.f39223c + ", indices=" + this.f39224d + '}';
    }
}
