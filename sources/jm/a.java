package Jm;

import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"LJm/a;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "EVENTS_AND_WORKSHOPS", "FREE_DRINK", "GIVE_BACK_PROJECTS", "FAMILY_BENEFITS", "JUST_IN_CASE_PROTECTION", "MEMBERSHIP_DISCOUNTS_RANGE", "PARTNERSHIPS", "REWARD_KEYS", "THANK_YOU_SURPRISES", "PRICE_PROTECTION", "UNKNOWN", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    EVENTS_AND_WORKSHOPS("eventsAndWorkshops"),
    FREE_DRINK("freeDrink"),
    GIVE_BACK_PROJECTS("giveBackProjects"),
    FAMILY_BENEFITS("familyBenefits"),
    JUST_IN_CASE_PROTECTION("justInCaseProtection"),
    MEMBERSHIP_DISCOUNTS_RANGE("memberDiscountsRange"),
    PARTNERSHIPS("partnerships"),
    REWARD_KEYS("rewardKeys"),
    THANK_YOU_SURPRISES("thankYouSurprises"),
    PRICE_PROTECTION("priceProtection"),
    UNKNOWN("UNKNOWN");
    
    public static final C1622a Companion = null;

    /* renamed from: id  reason: collision with root package name */
    private final String f82608id;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJm/a$a;", "", "<init>", "()V", "", "value", "LJm/a;", "a", "(Ljava/lang/String;)LJm/a;", "benefits-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jm.a$a  reason: collision with other inner class name */
    public static final class C1622a {
        public /* synthetic */ C1622a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String str) {
            T t10;
            C17542s.j(str, "value");
            Iterator<T> it = a.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((a) t10).j(), str)) {
                    break;
                }
            }
            a aVar = (a) t10;
            return aVar == null ? a.UNKNOWN : aVar;
        }

        private C1622a() {
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new C1622a((DefaultConstructorMarker) null);
    }

    private a(String str) {
        this.f82608id = str;
    }

    public static C17220a<a> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.f82608id;
    }
}
