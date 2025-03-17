package mA;

import YH.C16870n;
import com.auth0.android.jwt.JWT;
import com.auth0.android.jwt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"LmA/a;", "", "<init>", "()V", "", "idToken", "", "b", "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Ljava/lang/String;", "d", "a", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mA.a  reason: case insensitive filesystem */
public final class C14780a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3180a f129357a = new C3180a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LmA/a$a;", "", "<init>", "()V", "", "NAMESPACE", "Ljava/lang/String;", "PARTY_UID_KEY", "LOYALTY_PROGRAMS_ID_KEY", "FAMILY_LOYALTY_PROGRAM_VALUE", "SUB_KEY", "EMPLOYEE_ID", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mA.a$a  reason: collision with other inner class name */
    public static final class C3180a {
        public /* synthetic */ C3180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3180a() {
        }
    }

    public final boolean a(String str) {
        String str2 = "";
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            str2 = new JWT(str).c("https://accounts.ikea.com/employeeID").a();
        } catch (d | NullPointerException unused) {
        }
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final boolean b(String str) {
        C17542s.j(str, "idToken");
        try {
            Object[] b10 = new JWT(str).c("https://accounts.ikea.com/loyaltyPrograms").b(String.class);
            C17542s.i(b10, "asArray(...)");
            return C16870n.a0(b10, "IKEA_FAMILY");
        } catch (d | NullPointerException unused) {
            return false;
        }
    }

    public final String c(String str) {
        C17542s.j(str, "idToken");
        try {
            String a10 = new JWT(str).c("https://accounts.ikea.com/partyUId").a();
            return a10 == null ? "" : a10;
        } catch (d | NullPointerException unused) {
            return "";
        }
    }

    public final String d(String str) {
        C17542s.j(str, "idToken");
        try {
            String a10 = new JWT(str).c("sub").a();
            return a10 == null ? "" : a10;
        } catch (d | NullPointerException unused) {
            return "";
        }
    }
}
