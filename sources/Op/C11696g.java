package op;

import fI.C17220a;
import fI.C17221b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lop/g;", "", "", "priceType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getPriceType", "()Ljava/lang/String;", "Companion", "a", "REGULAR", "NEW_LOWER_PRICE", "TIME_RESTRICTED", "BREATH_TAKING_ITEM", "FAMILY", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.g  reason: case insensitive filesystem */
public enum C11696g {
    REGULAR("REG"),
    NEW_LOWER_PRICE("NLP"),
    TIME_RESTRICTED("TRO"),
    BREATH_TAKING_ITEM("BTI"),
    FAMILY("FAM");
    
    public static final a Companion = null;
    private static final HashMap<String, C11696g> map = null;
    private final String priceType;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lop/g$a;", "", "<init>", "()V", "Ljava/util/HashMap;", "", "Lop/g;", "Lkotlin/collections/HashMap;", "map", "Ljava/util/HashMap;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: op.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C11696g[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        HashMap<String, C11696g> hashMap = new HashMap<>();
        for (C11696g gVar : b()) {
            hashMap.put(gVar.priceType, gVar);
        }
        map = hashMap;
    }

    private C11696g(String str) {
        this.priceType = str;
    }

    public static C17220a<C11696g> b() {
        return $ENTRIES;
    }
}
