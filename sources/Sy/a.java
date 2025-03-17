package Sy;

import Ae.l;
import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0015\bf\u0018\u00002\u00020\u0001:\u0005LdRJCJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J1\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&¢\u0006\u0004\b&\u0010\u001bJ\u001f\u0010'\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b'\u0010(J1\u0010-\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J7\u00101\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u000bH&¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H&¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0013H&¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000bH&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000bH&¢\u0006\u0004\b;\u0010:J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\bH&¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0004H&¢\u0006\u0004\b@\u00104J\u000f\u0010A\u001a\u00020\u0004H&¢\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\u00020\u0004H&¢\u0006\u0004\bB\u00104J\u000f\u0010C\u001a\u00020\u0004H&¢\u0006\u0004\bC\u00104J\u000f\u0010D\u001a\u00020\u0004H&¢\u0006\u0004\bD\u00104J\u000f\u0010E\u001a\u00020\u0004H&¢\u0006\u0004\bE\u00104J\u0017\u0010G\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\bH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0004H&¢\u0006\u0004\bI\u00104J\u0017\u0010J\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0004H&¢\u0006\u0004\bL\u00104J/\u0010N\u001a\u00020\u00042\u0006\u0010M\u001a\u00020)2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0004H&¢\u0006\u0004\bP\u00104J\u0017\u0010R\u001a\u00020\u00042\u0006\u0010M\u001a\u00020QH&¢\u0006\u0004\bR\u0010SJ\u001f\u0010W\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\b2\u0006\u0010V\u001a\u00020UH&¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\bH&¢\u0006\u0004\bY\u0010HJ\u0017\u0010Z\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\bH&¢\u0006\u0004\bZ\u0010HJ\u001f\u0010\\\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\b2\u0006\u0010[\u001a\u00020\bH&¢\u0006\u0004\b\\\u0010?J\u000f\u0010]\u001a\u00020\u0004H&¢\u0006\u0004\b]\u00104J\u0017\u0010^\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\bH&¢\u0006\u0004\b^\u0010HJG\u0010b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010`\u001a\u00020_2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010a\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\bd\u0010?J\u001f\u0010e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\be\u0010?J\u001f\u0010f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\bf\u0010?J\u001f\u0010g\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\bg\u0010?J\u000f\u0010h\u001a\u00020\u0004H&¢\u0006\u0004\bh\u00104J\u001f\u0010i\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010M\u001a\u00020QH&¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0004H&¢\u0006\u0004\bk\u00104J\u000f\u0010l\u001a\u00020\u0004H&¢\u0006\u0004\bl\u00104J\u000f\u0010m\u001a\u00020\u0004H&¢\u0006\u0004\bm\u00104J\u0017\u0010o\u001a\u00020\u00042\u0006\u0010n\u001a\u00020)H&¢\u0006\u0004\bo\u0010KJ\u000f\u0010p\u001a\u00020\u0004H&¢\u0006\u0004\bp\u00104J\u0017\u0010r\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\bH&¢\u0006\u0004\br\u0010HJ\u000f\u0010s\u001a\u00020\u0004H&¢\u0006\u0004\bs\u00104¨\u0006t"}, d2 = {"LSy/a;", "", "LAe/l;", "entryPoint", "LXH/N;", "C", "(LAe/l;)V", "E", "", "itemId", "productType", "", "manualEntry", "scanType", "r", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "listId", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "numOfSupportedProducts", "numOfUnSupportedProducts", "", "unSupportedProductsId", "T", "(IILjava/util/List;)V", "V", "(II)V", "currency", "quantity", "qtyInStock", "LSy/a$c;", "productAssortmentType", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILSy/a$c;)V", "reason", "x", "(Ljava/lang/String;II)V", "X", "O", "(Ljava/lang/String;LSy/a$c;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LSy/a$d;", "errorSource", "s", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;LSy/a$d;)V", "fullserve", "isFromCart", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "k", "()V", "numberOfItemsInCart", "Q", "(I)V", "hasFullServeItems", "f", "(Z)V", "F", "code", "message", "t", "(Ljava/lang/String;Ljava/lang/String;)V", "W", "w", "I", "a", "g", "L", "itemNo", "A", "(Ljava/lang/String;)V", "p", "e", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "d", "appLocation", "q", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;LSy/a$c;)V", "B", "LSy/a$e;", "b", "(LSy/a$e;)V", "discountCode", "LSy/a$a;", "discountSource", "R", "(Ljava/lang/String;LSy/a$a;)V", "i", "h", "reasonCode", "J", "j", "m", "", "value", "stockQty", "S", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ILSy/a$c;)V", "c", "z", "G", "P", "U", "o", "(Ljava/lang/String;LSy/a$e;)V", "M", "D", "N", "section", "v", "H", "productNo", "u", "n", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0006\n\u0006\u000b\f\r\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"LSy/a$a;", "", "", "type", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "e", "c", "f", "d", "LSy/a$a$a;", "LSy/a$a$c;", "LSy/a$a$d;", "LSy/a$a$e;", "LSy/a$a$f;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sy.a$a  reason: collision with other inner class name */
    public static abstract class C2850a {

        /* renamed from: b  reason: collision with root package name */
        public static final b f116635b = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f116636a;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSy/a$a$a;", "LSy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$a  reason: collision with other inner class name */
        public static final class C2851a extends C2850a {

            /* renamed from: c  reason: collision with root package name */
            public static final C2851a f116637c = new C2851a();

            private C2851a() {
                super("barcode", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2851a);
            }

            public int hashCode() {
                return -1550721424;
            }

            public String toString() {
                return "Barcode";
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSy/a$a$b;", "", "<init>", "()V", "", "type", "LSy/a$a;", "a", "(Ljava/lang/String;)LSy/a$a;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C2850a a(String str) {
                Object obj;
                String str2 = str;
                Iterator it = C16877v.q(C2851a.f116637c, c.f116638c, e.f116640c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((C2850a) obj).a(), str2)) {
                        break;
                    }
                }
                C2850a aVar = (C2850a) obj;
                if (aVar != null) {
                    return aVar;
                }
                b bVar = C2850a.f116635b;
                Throwable th2 = new Throwable("DiscountSource " + str2 + " not found.");
                qv.e eVar = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, th2);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = bVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar2.a(eVar, str6, false, th2, str5);
                    str3 = str5;
                    str4 = str6;
                }
                return f.f116641c;
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSy/a$a$c;", "LSy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$c */
        public static final class c extends C2850a {

            /* renamed from: c  reason: collision with root package name */
            public static final c f116638c = new c();

            private c() {
                super("data_matrix", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -531722213;
            }

            public String toString() {
                return "DataMatrix";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSy/a$a$d;", "LSy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$d */
        public static final class d extends C2850a {

            /* renamed from: c  reason: collision with root package name */
            public static final d f116639c = new d();

            private d() {
                super("manual_entry", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1001691708;
            }

            public String toString() {
                return "ManualEntry";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSy/a$a$e;", "LSy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$e */
        public static final class e extends C2850a {

            /* renamed from: c  reason: collision with root package name */
            public static final e f116640c = new e();

            private e() {
                super("qr", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -393862639;
            }

            public String toString() {
                return "QR";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSy/a$a$f;", "LSy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$a$f */
        public static final class f extends C2850a {

            /* renamed from: c  reason: collision with root package name */
            public static final f f116641c = new f();

            private f() {
                super("unknown", (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -1501978054;
            }

            public String toString() {
                return "Unknown";
            }
        }

        public /* synthetic */ C2850a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.f116636a;
        }

        private C2850a(String str) {
            this.f116636a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LSy/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "AS_IS", "MEASURED_ITEMS", "UNKNOWN", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        AS_IS("asis"),
        MEASURED_ITEMS("measured_item"),
        UNKNOWN("unknown");
        
        private final String value;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.value = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LSy/a$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "m", "()Ljava/lang/String;", "Ljava/lang/String;", "j", "CASH_CARRY", "SELF_SERVE", "FULL_SERVE", "COMBINATION", "UNKNOWN", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        CASH_CARRY("cash_carry"),
        SELF_SERVE("self_serve"),
        FULL_SERVE("full_serve"),
        COMBINATION("combination"),
        UNKNOWN("unknown");
        
        private final String value;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sy.a$c$a  reason: collision with other inner class name */
        public /* synthetic */ class C2852a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f116642a = null;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.FULL_SERVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f116642a = iArr;
            }
        }

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(String str) {
            this.value = str;
        }

        public static C17220a<c> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }

        public final String m() {
            return C2852a.f116642a[ordinal()] == 1 ? "yes" : "no";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LSy/a$d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CLIENT", "SERVER", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        CLIENT("client"),
        SERVER("server");
        
        private final String value;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private d(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LSy/a$e;", "", "", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "ACTIVE_DISCOUT_OVERLAY", "CHECKOUT", "PAYMENT", "PAYMENT_COMPLETED", "SHOP_GO_CART", "SHOP_GO_PIP", "SHOP_GO_COLLECT_PIP", "SHOP_COMBINATION_PARTIAL_AVAILABLE", "PICKING_LIST", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum e {
        ACTIVE_DISCOUT_OVERLAY("active_discout_overlay"),
        CHECKOUT("shopgo_checkout"),
        PAYMENT("shopgo_payment"),
        PAYMENT_COMPLETED("shopgo_payment_completed"),
        SHOP_GO_CART("shopgo_cart"),
        SHOP_GO_PIP("shopgo_pip"),
        SHOP_GO_COLLECT_PIP("pickup_pip"),
        SHOP_COMBINATION_PARTIAL_AVAILABLE("shopgo_combination_partial_availability"),
        PICKING_LIST("picking_list");
        
        private final String analyticsName;

        static {
            e[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private e(String str) {
            this.analyticsName = str;
        }

        public final String b() {
            return this.analyticsName;
        }
    }

    void A(String str);

    void B();

    void C(l lVar);

    void D();

    void E(l lVar);

    void F(boolean z10);

    void G(String str, String str2);

    void H();

    void I();

    void J(String str, String str2);

    void K(String str, String str2, String str3, int i10, int i11, c cVar);

    void L();

    void M();

    void N();

    void O(String str, c cVar);

    void P(String str, String str2);

    void Q(int i10);

    void R(String str, C2850a aVar);

    void S(String str, String str2, int i10, double d10, String str3, int i11, c cVar);

    void T(int i10, int i11, List<String> list);

    void U();

    void V(int i10, int i11);

    void W();

    void X(int i10, int i11);

    void a();

    void b(e eVar);

    void c(String str, String str2);

    void d();

    void e(Interaction$Component interaction$Component);

    void f(boolean z10);

    void g();

    void h(String str);

    void i(String str);

    void j();

    void k();

    void l(String str, String str2, String str3, int i10, boolean z10);

    void m(String str);

    void n();

    void o(String str, e eVar);

    void p();

    void q(Interaction$Component interaction$Component, String str, String str2, c cVar);

    void r(String str, String str2, boolean z10, String str3);

    void s(String str, String str2, Interaction$Component interaction$Component, d dVar);

    void t(String str, String str2);

    void u(String str);

    void v(Interaction$Component interaction$Component);

    void w();

    void x(String str, int i10, int i11);

    void y(String str, String str2, String str3);

    void z(String str, String str2);
}
