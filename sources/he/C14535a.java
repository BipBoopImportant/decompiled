package hE;

import com.ingka.ikea.app.base.UserPostalCodeAddress;
import gE.C14514a;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sf.C10242c;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u001a9\u0010\u000b\u001a\u00020\n2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "preSelectedPostalCode", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "Lsf/c;", "appUserDataRepository", "LgE/a;", "zipSelectorAnalytics", "Ljava/util/regex/Pattern;", "postalCodePattern", "", "b", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Lsf/c;LgE/a;Ljava/util/regex/Pattern;)Z", "", "postCode", "a", "(Ljava/util/regex/Pattern;Ljava/lang/CharSequence;)Z", "zipselector-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hE.a  reason: case insensitive filesystem */
public final class C14535a {
    public static final boolean a(Pattern pattern, CharSequence charSequence) {
        C17542s.j(charSequence, "postCode");
        if (pattern == null) {
            return true;
        }
        return pattern.matcher(charSequence).matches();
    }

    public static final boolean b(String str, UserPostalCodeAddress userPostalCodeAddress, C10242c cVar, C14514a aVar, Pattern pattern) {
        C17542s.j(userPostalCodeAddress, "postalCodeAddress");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar, "zipSelectorAnalytics");
        boolean b10 = UserPostalCodeAddress.f70222e.b(userPostalCodeAddress, cVar, pattern);
        if (b10 && !C17542s.e(str, userPostalCodeAddress.d())) {
            aVar.a();
        }
        return b10;
    }
}
