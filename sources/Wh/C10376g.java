package wh;

import M6.n;
import YH.C16877v;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lwh/g;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "StandardHomeDeliveryParcel", "StandardHomeDeliveryTruck", "ExpressHomeDeliveryTruck", "CurbSideDeliveryTruck", "ExpressCurbSideTruck", "InternalPickupPointTruck", "InternalPickupPointParcel", "ExternalPickupPointTruck", "ExternalPickupPointParcel", "CollectAtStore", "InternalLockers", "ExternalLockers", "ClickCollectNearYouTruck", "ClickCollectNearYouParcel", "HomeDeliveryParcelExpress", "UNKNOWN__", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wh.g  reason: case insensitive filesystem */
public enum C10376g {
    StandardHomeDeliveryParcel("StandardHomeDeliveryParcel"),
    StandardHomeDeliveryTruck("StandardHomeDeliveryTruck"),
    ExpressHomeDeliveryTruck("ExpressHomeDeliveryTruck"),
    CurbSideDeliveryTruck("CurbSideDeliveryTruck"),
    ExpressCurbSideTruck("ExpressCurbSideTruck"),
    InternalPickupPointTruck("InternalPickupPointTruck"),
    InternalPickupPointParcel("InternalPickupPointParcel"),
    ExternalPickupPointTruck("ExternalPickupPointTruck"),
    ExternalPickupPointParcel("ExternalPickupPointParcel"),
    CollectAtStore("CollectAtStore"),
    InternalLockers("InternalLockers"),
    ExternalLockers("ExternalLockers"),
    ClickCollectNearYouTruck("ClickCollectNearYouTruck"),
    ClickCollectNearYouParcel("ClickCollectNearYouParcel"),
    HomeDeliveryParcelExpress("HomeDeliveryParcelExpress"),
    UNKNOWN__("UNKNOWN__");
    
    public static final a Companion = null;
    private static final n type = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwh/g$a;", "", "<init>", "()V", "", "rawValue", "Lwh/g;", "a", "(Ljava/lang/String;)Lwh/g;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wh.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C10376g a(String str) {
            C10376g gVar;
            C17542s.j(str, "rawValue");
            C10376g[] values = C10376g.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    gVar = null;
                    break;
                }
                gVar = values[i10];
                if (C17542s.e(gVar.b(), str)) {
                    break;
                }
                i10++;
            }
            return gVar == null ? C10376g.UNKNOWN__ : gVar;
        }

        private a() {
        }
    }

    static {
        C10376g[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        type = new n("DeliveryServiceName", C16877v.q("StandardHomeDeliveryParcel", "StandardHomeDeliveryTruck", "ExpressHomeDeliveryTruck", "CurbSideDeliveryTruck", "ExpressCurbSideTruck", "InternalPickupPointTruck", "InternalPickupPointParcel", "ExternalPickupPointTruck", "ExternalPickupPointParcel", "CollectAtStore", "InternalLockers", "ExternalLockers", "ClickCollectNearYouTruck", "ClickCollectNearYouParcel", "HomeDeliveryParcelExpress"));
    }

    private C10376g(String str) {
        this.rawValue = str;
    }

    public final String b() {
        return this.rawValue;
    }
}
