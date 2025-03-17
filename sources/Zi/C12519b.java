package zi;

import Ai.C10599p0;
import Al.d;
import Hx.c;
import Hx.f;
import Oo.b;
import XH.t;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18146a;
import wi.C12272a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LHx/c$c$d$a;", "deliveryStatus", "LHx/c$c$d$b;", "tense", "LAi/p0;", "type", "", "h", "(LHx/c$c$d$a;LHx/c$c$d$b;LAi/p0;)Ljava/lang/Integer;", "LHx/c$c$c;", "deliveryType", "LHx/f;", "purchaseType", "d", "(LHx/c$c$c;LHx/f;)I", "", "isReturnOrder", "b", "(LHx/c$c$c;Z)I", "i", "(LHx/c$c$d$a;LAi/p0;)I", "LHx/c$c;", "deliveryMethod", "Lzi/a;", "c", "(LHx/c$c;)Lzi/a;", "e", "(LAi/p0;)I", "f", "(LAi/p0;)Ljava/lang/Integer;", "g", "LAl/d;", "a", "(LHx/c$c$d$b;)LAl/d;", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zi.b  reason: case insensitive filesystem */
public final class C12519b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zi.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f107360a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f107361b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f107362c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f107363d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f107364e;

        /* JADX WARNING: Can't wrap try/catch for region: R(103:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|37|38|39|41|42|43|45|46|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|123|124|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(105:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|123|124|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(106:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|(2:53|54)|55|57|58|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|123|124|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(109:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|41|42|43|45|46|47|49|50|51|53|54|55|57|58|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|123|124|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|(2:67|68)|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|(2:123|124)|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(95:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|(2:45|46)|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|(2:123|124)|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(96:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|(2:123|124)|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(97:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|(2:41|42)|43|45|46|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|(2:123|124)|125|127) */
        /* JADX WARNING: Can't wrap try/catch for region: R(99:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|(2:33|34)|35|(2:37|38)|39|41|42|43|45|46|47|49|50|51|(2:53|54)|55|(2:57|58)|59|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|119|120|121|122|(2:123|124)|125|127) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0141 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0151 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0159 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0169 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x0173 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x017d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x01a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x00f9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0121 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0129 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0139 */
        static {
            /*
                Hx.c$c$d$a[] r0 = Hx.c.C2661c.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Hx.c$c$d$a r2 = Hx.c.C2661c.d.a.ORDER_RECEIVED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Hx.c$c$d$a r3 = Hx.c.C2661c.d.a.ORDER_PREPARING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Hx.c$c$d$a r4 = Hx.c.C2661c.d.a.ORDER_PACKING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                Hx.c$c$d$a r5 = Hx.c.C2661c.d.a.ORDER_FINAL_CHECKS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                Hx.c$c$d$a r6 = Hx.c.C2661c.d.a.ORDER_READY_DISPATCH     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                Hx.c$c$d$a r7 = Hx.c.C2661c.d.a.ORDER_EXTERNAL_PROCESSING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                r7 = 7
                Hx.c$c$d$a r8 = Hx.c.C2661c.d.a.ORDER_READY_FOR_CUSTOMER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r0[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                r8 = 8
                Hx.c$c$d$a r9 = Hx.c.C2661c.d.a.CANCEL_PENDING     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r0[r9] = r8     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                r9 = 9
                Hx.c$c$d$a r10 = Hx.c.C2661c.d.a.CANCELLED     // Catch:{ NoSuchFieldError -> 0x005a }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r0[r10] = r9     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                r10 = 10
                Hx.c$c$d$a r11 = Hx.c.C2661c.d.a.ORDER_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r0[r11] = r10     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                r11 = 11
                Hx.c$c$d$a r12 = Hx.c.C2661c.d.a.ORDER_FAILED     // Catch:{ NoSuchFieldError -> 0x006e }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r12] = r11     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                r12 = 12
                Hx.c$c$d$a r13 = Hx.c.C2661c.d.a.ORDER_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r13 = r13.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r13] = r12     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                r13 = 13
                Hx.c$c$d$a r14 = Hx.c.C2661c.d.a.RETURN_ORDER_CREATED     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r14 = r14.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r14] = r13     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                r14 = 14
                Hx.c$c$d$a r15 = Hx.c.C2661c.d.a.RETURN_ON_THE_WAY_TO_IKEA     // Catch:{ NoSuchFieldError -> 0x008c }
                int r15 = r15.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r0[r15] = r14     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                r15 = 15
                Hx.c$c$d$a r16 = Hx.c.C2661c.d.a.RETURN_IKEA_RECEIVED_ITEMS     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r0[r16] = r15     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                f107360a = r0
                Hx.c$c$d$b[] r0 = Hx.c.C2661c.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hx.c$c$d$b r16 = Hx.c.C2661c.d.b.PAST     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r0[r16] = r1     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                Hx.c$c$d$b r16 = Hx.c.C2661c.d.b.FUTURE     // Catch:{ NoSuchFieldError -> 0x00af }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r0[r16] = r2     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                Hx.c$c$d$b r16 = Hx.c.C2661c.d.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r16] = r3     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                Hx.c$c$d$b r16 = Hx.c.C2661c.d.b.PRESENT     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r0[r16] = r4     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                f107361b = r0
                Hx.f[] r0 = Hx.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hx.f r16 = Hx.f.RETURN     // Catch:{ NoSuchFieldError -> 0x00d0 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d0 }
                r0[r16] = r1     // Catch:{ NoSuchFieldError -> 0x00d0 }
            L_0x00d0:
                Hx.f r16 = Hx.f.ORDER     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r0[r16] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                Hx.f r16 = Hx.f.RECEIPT     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r0[r16] = r3     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                Hx.f r16 = Hx.f.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00e8 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
                r0[r16] = r4     // Catch:{ NoSuchFieldError -> 0x00e8 }
            L_0x00e8:
                f107362c = r0
                Hx.c$c$c[] r0 = Hx.c.C2661c.C2663c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Hx.c$c$c r16 = Hx.c.C2661c.C2663c.TRUCK_EXPRESS     // Catch:{ NoSuchFieldError -> 0x00f9 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f9 }
                r0[r16] = r1     // Catch:{ NoSuchFieldError -> 0x00f9 }
            L_0x00f9:
                Hx.c$c$c r16 = Hx.c.C2661c.C2663c.TRUCK_STANDARD     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r0[r16] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                Hx.c$c$c r16 = Hx.c.C2661c.C2663c.TRUCK_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r0[r16] = r3     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                Hx.c$c$c r16 = Hx.c.C2661c.C2663c.PARCEL     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r16 = r16.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r16] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.PARCEL_EXPRESS     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0121 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0121 }
                r0[r4] = r6     // Catch:{ NoSuchFieldError -> 0x0121 }
            L_0x0121:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.INTERNAL_LOCKER     // Catch:{ NoSuchFieldError -> 0x0129 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0129 }
                r0[r4] = r7     // Catch:{ NoSuchFieldError -> 0x0129 }
            L_0x0129:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.EXTERNAL_LOCKER     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r0[r4] = r8     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.PICKUP_POINT     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r4] = r9     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.PICKUP_TRUCK     // Catch:{ NoSuchFieldError -> 0x0141 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0141 }
                r0[r4] = r10     // Catch:{ NoSuchFieldError -> 0x0141 }
            L_0x0141:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r0[r4] = r11     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.TRUCK_RETURN     // Catch:{ NoSuchFieldError -> 0x0151 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0151 }
                r0[r4] = r12     // Catch:{ NoSuchFieldError -> 0x0151 }
            L_0x0151:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.PARCEL_RETURN     // Catch:{ NoSuchFieldError -> 0x0159 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0159 }
                r0[r4] = r13     // Catch:{ NoSuchFieldError -> 0x0159 }
            L_0x0159:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.TRUCK_EXCHANGE     // Catch:{ NoSuchFieldError -> 0x0161 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
                r0[r4] = r14     // Catch:{ NoSuchFieldError -> 0x0161 }
            L_0x0161:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.PARCEL_EXCHANGE     // Catch:{ NoSuchFieldError -> 0x0169 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0169 }
                r0[r4] = r15     // Catch:{ NoSuchFieldError -> 0x0169 }
            L_0x0169:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.SERVICE_ORDER     // Catch:{ NoSuchFieldError -> 0x0173 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0173 }
                r5 = 16
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0173 }
            L_0x0173:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.NO_STOCK     // Catch:{ NoSuchFieldError -> 0x017d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x017d }
                r5 = 17
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x017d }
            L_0x017d:
                Hx.c$c$c r4 = Hx.c.C2661c.C2663c.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0187 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0187 }
                r5 = 18
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0187 }
            L_0x0187:
                f107363d = r0
                Ai.p0[] r0 = Ai.C10599p0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ai.p0 r4 = Ai.C10599p0.COLLECT     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                Ai.p0 r1 = Ai.C10599p0.HOME     // Catch:{ NoSuchFieldError -> 0x01a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a0 }
            L_0x01a0:
                Ai.p0 r1 = Ai.C10599p0.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x01a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a8 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x01a8 }
            L_0x01a8:
                f107364e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zi.C12519b.a.<clinit>():void");
        }
    }

    public static final d a(c.C2661c.d.b bVar) {
        C17542s.j(bVar, "<this>");
        int i10 = a.f107361b[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return d.FUTURE;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return d.ACTIVE;
                }
                throw new t();
            }
        }
        return d.PAST;
    }

    public static final int b(c.C2661c.C2663c cVar, boolean z10) {
        C17542s.j(cVar, "<this>");
        if (z10) {
            return C18146a.f148125L0;
        }
        switch (a.f107363d[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 14:
                return C18146a.f148385c3;
            case 4:
                return C18146a.f148050G0;
            case 5:
                return C18146a.f148095J0;
            case 6:
                return C18146a.f148352a2;
            case 7:
            case 8:
                return C18146a.f148221R6;
            case 9:
            case 10:
                return C18146a.f148086I6;
            case 11:
                return C18146a.f148378bc;
            case 12:
            case 13:
                return C18146a.f148125L0;
            case 15:
                return C18146a.f148080I0;
            case 16:
            case 17:
            case 18:
                return C18146a.f147984B9;
            default:
                throw new t();
        }
    }

    public static final C12518a c(c.C2661c cVar) {
        Object obj;
        C17542s.j(cVar, "deliveryMethod");
        Iterator it = cVar.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((c.C2661c.d) obj).b() == c.C2661c.d.b.PRESENT) {
                break;
            }
        }
        c.C2661c.d dVar = (c.C2661c.d) obj;
        if (dVar == null) {
            return null;
        }
        switch (a.f107360a[dVar.a().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
                return null;
            case 11:
            case 12:
                return new C12518a(C12272a.f105751C0, C12272a.f105826j0);
            default:
                throw new t();
        }
    }

    public static final int d(c.C2661c.C2663c cVar, f fVar) {
        C17542s.j(cVar, "deliveryType");
        C17542s.j(fVar, "purchaseType");
        switch (a.f107363d[cVar.ordinal()]) {
            case 1:
                return b.f84486Q8;
            case 2:
                return b.f84496R8;
            case 3:
                return b.f84476P8;
            case 4:
                return b.f84792t5;
            case 5:
                return b.f84803u5;
            case 6:
                return b.f84810v1;
            case 7:
                return b.f84831x1;
            case 8:
                return b.f84821w1;
            case 9:
            case 10:
                return b.f84851z1;
            case 11:
                int i10 = a.f107362c[fVar.ordinal()];
                if (i10 == 1) {
                    return C12272a.f105814f0;
                }
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    return b.f84799u1;
                }
                throw new t();
            case 12:
            case 13:
                return C12272a.f105814f0;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return b.f84613d2;
            default:
                throw new t();
        }
    }

    private static final int e(C10599p0 p0Var) {
        int i10 = a.f107364e[p0Var.ordinal()];
        if (i10 == 1) {
            return C12272a.f105750C;
        }
        if (i10 == 2) {
            return C12272a.f105752D;
        }
        if (i10 == 3) {
            return C12272a.f105748B;
        }
        throw new t();
    }

    private static final Integer f(C10599p0 p0Var) {
        int i10 = a.f107364e[p0Var.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return Integer.valueOf(C12272a.f105762I);
        }
        if (i10 == 3) {
            return null;
        }
        throw new t();
    }

    private static final Integer g(C10599p0 p0Var) {
        int i10 = a.f107364e[p0Var.ordinal()];
        if (i10 == 1) {
            return Integer.valueOf(C12272a.f105778Q);
        }
        if (i10 == 2) {
            return Integer.valueOf(C12272a.f105780R);
        }
        if (i10 == 3) {
            return null;
        }
        throw new t();
    }

    public static final Integer h(c.C2661c.d.a aVar, c.C2661c.d.b bVar, C10599p0 p0Var) {
        C17542s.j(aVar, "deliveryStatus");
        C17542s.j(bVar, "tense");
        C17542s.j(p0Var, "type");
        int i10 = a.f107361b[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return null;
        }
        if (i10 == 4) {
            switch (a.f107360a[aVar.ordinal()]) {
                case 1:
                    return Integer.valueOf(C12272a.f105770M);
                case 2:
                    return Integer.valueOf(C12272a.f105784T);
                case 3:
                    return g(p0Var);
                case 4:
                    return Integer.valueOf(C12272a.f105766K);
                case 5:
                    return Integer.valueOf(C12272a.f105788V);
                case 6:
                    return f(p0Var);
                case 7:
                    return Integer.valueOf(C12272a.f105792X);
                case 8:
                    return Integer.valueOf(C12272a.f105855y);
                case 9:
                    return Integer.valueOf(C12272a.f105853x);
                case 10:
                    return Integer.valueOf(e(p0Var));
                case 11:
                case 12:
                    return Integer.valueOf(C12272a.f105753D0);
                case 13:
                    return Integer.valueOf(C12272a.f105799a0);
                case 14:
                    return Integer.valueOf(C12272a.f105805c0);
                case 15:
                    return Integer.valueOf(C12272a.f105774O);
                default:
                    throw new t();
            }
        } else {
            throw new t();
        }
    }

    public static final int i(c.C2661c.d.a aVar, C10599p0 p0Var) {
        C17542s.j(aVar, "deliveryStatus");
        C17542s.j(p0Var, "type");
        switch (a.f107360a[aVar.ordinal()]) {
            case 1:
                return C12272a.f105772N;
            case 2:
                return C12272a.f105786U;
            case 3:
                return C12272a.f105782S;
            case 4:
                return C12272a.f105768L;
            case 5:
                return C12272a.f105790W;
            case 6:
                return C12272a.f105764J;
            case 7:
                return C12272a.f105794Y;
            case 8:
                return C12272a.f105857z;
            case 9:
                return C12272a.f105746A;
            case 10:
                int i10 = a.f107364e[p0Var.ordinal()];
                if (i10 == 1) {
                    return C12272a.f105756F;
                }
                if (i10 == 2) {
                    return C12272a.f105758G;
                }
                if (i10 == 3) {
                    return C12272a.f105754E;
                }
                throw new t();
            case 11:
            case 12:
                return C12272a.f105751C0;
            case 13:
                return C12272a.f105802b0;
            case 14:
                return C12272a.f105808d0;
            case 15:
                return C12272a.f105814f0;
            default:
                throw new t();
        }
    }
}
