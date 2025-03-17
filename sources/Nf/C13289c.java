package NF;

import com.google.android.libraries.places.api.model.PlaceTypes;
import fI.C17221b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.C18464r2;
import wK.C18488t2;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B1\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"LNF/c;", "", "LwK/r2;", "currencyPosition", "", "integerSeparator", "LwK/t2;", "decimalSign", "emptyDecimalValueSymbol", "<init>", "(Ljava/lang/String;ILwK/r2;Ljava/lang/String;LwK/t2;Ljava/lang/String;)V", "LwK/r2;", "b", "()LwK/r2;", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "LwK/t2;", "j", "()LwK/t2;", "m", "Companion", "a", "AT", "BE", "BE_FR", "CA_FR", "CH", "CH_FR", "CZ", "DE", "DK", "ES", "ES_ES", "FR", "HR", "HU", "IT", "NL_NL", "NO", "PL", "RO", "RS_RS", "SE", "SK", "SL", "IN_EN", "DEFAULT", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: NF.c  reason: case insensitive filesystem */
public enum C13289c {
    AT((String) null, ".", r5, "-", 1, (String) null),
    BE((String) null, ".", r5, (String) null, 9, (String) null),
    BE_FR(r3, ".", r5, (String) null, 8, (String) null),
    CA_FR(r3, " ", r5, (String) null, 8, (String) null),
    CH((String) null, "'", r5, (String) null, 9, (String) null),
    CH_FR((String) null, " ", r5, (String) null, 9, (String) null),
    CZ(r3, " ", r5, ""),
    DE(r3, ".", (C18464r2) null, (String) null, 12, (String) null),
    DK(r9, ".", r19, "-"),
    ES(r3, ".", r5, (String) null, 8, (String) null),
    ES_ES(r3, "", r5, (String) null, 8, (String) null),
    FR(r3, " ", r5, (String) null, 8, (String) null),
    HR(r3, ".", r5, ""),
    HU(r3, " ", r5, ""),
    IT((String) null, ".", r5, (String) null, 9, (String) null),
    NL_NL((String) null, ".", (C18464r2) null, (String) null, 13, (String) null),
    NO(r11, ".", r5, "-"),
    PL((String) null, "", r5, (String) null, 9, (String) null),
    RO(r3, ".", r5, ""),
    RS_RS(r3, ".", r5, ""),
    SE(r3, " ", (C18464r2) null, (String) null, 12, (String) null),
    SK((String) null, " ", r5, "", 1, (String) null),
    SL(r11, ".", r5, ""),
    IN_EN(r9, ",", r19, ""),
    DEFAULT((String) null, (int) null, (C18464r2) null, (String) null, 15, (String) null);
    
    public static final a Companion = null;
    private final C18464r2 currencyPosition;
    private final C18488t2 decimalSign;
    private final String emptyDecimalValueSymbol;
    private final String integerSeparator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LNF/c$a;", "", "<init>", "()V", "", "country", "language", "LNF/c;", "a", "(Ljava/lang/String;Ljava/lang/String;)LNF/c;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NF.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13289c a(String str, String str2) {
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            C17542s.i(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            C17542s.i(lowerCase2, "toLowerCase(...)");
            switch (lowerCase2.hashCode()) {
                case 3123:
                    if (lowerCase2.equals("at")) {
                        return C13289c.AT;
                    }
                    break;
                case 3139:
                    if (lowerCase2.equals("be")) {
                        return C17542s.e(lowerCase, "fr") ? C13289c.BE_FR : C13289c.BE;
                    }
                    break;
                case 3166:
                    if (lowerCase2.equals("ca")) {
                        return C17542s.e(lowerCase, "fr") ? C13289c.CA_FR : C13289c.DEFAULT;
                    }
                    break;
                case 3173:
                    if (lowerCase2.equals("ch")) {
                        return C17542s.e(lowerCase, "fr") ? C13289c.CH_FR : C13289c.CH;
                    }
                    break;
                case 3191:
                    if (lowerCase2.equals("cz")) {
                        return C13289c.CZ;
                    }
                    break;
                case 3201:
                    if (lowerCase2.equals("de")) {
                        return C13289c.DE;
                    }
                    break;
                case 3207:
                    if (lowerCase2.equals("dk")) {
                        return C13289c.DK;
                    }
                    break;
                case 3246:
                    if (lowerCase2.equals("es")) {
                        return C17542s.e(lowerCase, "es") ? C13289c.ES_ES : C13289c.ES;
                    }
                    break;
                case 3276:
                    if (lowerCase2.equals("fr")) {
                        return C13289c.FR;
                    }
                    break;
                case 3338:
                    if (lowerCase2.equals("hr")) {
                        return C13289c.HR;
                    }
                    break;
                case 3341:
                    if (lowerCase2.equals("hu")) {
                        return C13289c.HU;
                    }
                    break;
                case 3365:
                    if (lowerCase2.equals("in")) {
                        return C13289c.IN_EN;
                    }
                    break;
                case 3371:
                    if (lowerCase2.equals("it")) {
                        return C13289c.IT;
                    }
                    break;
                case 3518:
                    if (lowerCase2.equals("nl")) {
                        return C17542s.e(lowerCase, "nl") ? C13289c.NL_NL : C13289c.DEFAULT;
                    }
                    break;
                case 3521:
                    if (lowerCase2.equals("no")) {
                        return C13289c.NO;
                    }
                    break;
                case 3580:
                    if (lowerCase2.equals("pl")) {
                        return C13289c.PL;
                    }
                    break;
                case 3645:
                    if (lowerCase2.equals("ro")) {
                        return C13289c.RO;
                    }
                    break;
                case 3649:
                    if (lowerCase2.equals("rs")) {
                        return C17542s.e(lowerCase, "rs") ? C13289c.RS_RS : C13289c.DEFAULT;
                    }
                    break;
                case 3666:
                    if (lowerCase2.equals("se")) {
                        return C13289c.SE;
                    }
                    break;
                case 3672:
                    if (lowerCase2.equals("sk")) {
                        return C13289c.SK;
                    }
                    break;
                case 3673:
                    if (lowerCase2.equals("sl")) {
                        return C13289c.SL;
                    }
                    break;
            }
            return C13289c.DEFAULT;
        }

        private a() {
        }
    }

    static {
        C13289c[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private C13289c(C18464r2 r2Var, String str, C18488t2 t2Var, String str2) {
        this.currencyPosition = r2Var;
        this.integerSeparator = str;
        this.decimalSign = t2Var;
        this.emptyDecimalValueSymbol = str2;
    }

    public final C18464r2 b() {
        return this.currencyPosition;
    }

    public final C18488t2 j() {
        return this.decimalSign;
    }

    public final String m() {
        return this.emptyDecimalValueSymbol;
    }

    public final String n() {
        return this.integerSeparator;
    }
}
