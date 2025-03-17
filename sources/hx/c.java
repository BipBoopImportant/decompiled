package Hx;

import HJ.C15854t;
import XH.t;
import android.util.Base64;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001:\u0005\u00181-%)Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b1\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b-\u00107R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b8\u00107R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b)\u00107¨\u00069"}, d2 = {"LHx/c;", "", "", "id", "LHx/f;", "type", "LHx/c$e;", "status", "LHx/c$b;", "dateAndTime", "location", "LHx/c$a;", "costs", "", "LHx/c$c;", "deliveryMethods", "LHx/b;", "articles", "LHx/e;", "payments", "LHx/c$d;", "actions", "<init>", "(Ljava/lang/String;LHx/f;LHx/c$e;LHx/c$b;Ljava/lang/String;LHx/c$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/lang/String;LHx/f;LHx/c$e;LHx/c$b;Ljava/lang/String;LHx/c$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)LHx/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "h", "b", "LHx/f;", "l", "()LHx/f;", "c", "LHx/c$e;", "k", "()LHx/c$e;", "d", "LHx/c$b;", "f", "()LHx/c$b;", "e", "i", "LHx/c$a;", "()LHx/c$a;", "g", "Ljava/util/List;", "()Ljava/util/List;", "j", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f110747a;

    /* renamed from: b  reason: collision with root package name */
    private final f f110748b;

    /* renamed from: c  reason: collision with root package name */
    private final e f110749c;

    /* renamed from: d  reason: collision with root package name */
    private final b f110750d;

    /* renamed from: e  reason: collision with root package name */
    private final String f110751e;

    /* renamed from: f  reason: collision with root package name */
    private final a f110752f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C2661c> f110753g;

    /* renamed from: h  reason: collision with root package name */
    private final List<b> f110754h;

    /* renamed from: i  reason: collision with root package name */
    private final List<e> f110755i;

    /* renamed from: j  reason: collision with root package name */
    private final List<d> f110756j;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"LHx/c$a;", "", "", "total", "subTotal", "service", "discount", "delivery", "tax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "b", "d", "c", "e", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Double f110757a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f110758b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f110759c;

        /* renamed from: d  reason: collision with root package name */
        private final Double f110760d;

        /* renamed from: e  reason: collision with root package name */
        private final Double f110761e;

        /* renamed from: f  reason: collision with root package name */
        private final Double f110762f;

        public a(Double d10, Double d11, Double d12, Double d13, Double d14, Double d15) {
            this.f110757a = d10;
            this.f110758b = d11;
            this.f110759c = d12;
            this.f110760d = d13;
            this.f110761e = d14;
            this.f110762f = d15;
        }

        public final Double a() {
            return this.f110761e;
        }

        public final Double b() {
            return this.f110760d;
        }

        public final Double c() {
            return this.f110759c;
        }

        public final Double d() {
            return this.f110758b;
        }

        public final Double e() {
            return this.f110762f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f110757a, aVar.f110757a) && C17542s.e(this.f110758b, aVar.f110758b) && C17542s.e(this.f110759c, aVar.f110759c) && C17542s.e(this.f110760d, aVar.f110760d) && C17542s.e(this.f110761e, aVar.f110761e) && C17542s.e(this.f110762f, aVar.f110762f);
        }

        public final Double f() {
            return this.f110757a;
        }

        public int hashCode() {
            Double d10 = this.f110757a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f110758b;
            int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f110759c;
            int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f110760d;
            int hashCode4 = (hashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f110761e;
            int hashCode5 = (hashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f110762f;
            if (d15 != null) {
                i10 = d15.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            Double d10 = this.f110757a;
            Double d11 = this.f110758b;
            Double d12 = this.f110759c;
            Double d13 = this.f110760d;
            Double d14 = this.f110761e;
            Double d15 = this.f110762f;
            return "Costs(total=" + d10 + ", subTotal=" + d11 + ", service=" + d12 + ", discount=" + d13 + ", delivery=" + d14 + ", tax=" + d15 + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"LHx/c$b;", "", "", "formattedLongDateTime", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f110763a;

        public b(String str) {
            C17542s.j(str, "formattedLongDateTime");
            this.f110763a = str;
        }

        public final String a() {
            return this.f110763a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f110763a, ((b) obj).f110763a);
        }

        public int hashCode() {
            return this.f110763a.hashCode();
        }

        public String toString() {
            String str = this.f110763a;
            return "DateAndTime(formattedLongDateTime=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\b\u0018\u00002\u00020\u0001:\u0005,# (&Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b(\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0018R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b2\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104¨\u00065"}, d2 = {"LHx/c$c;", "", "", "id", "", "LHx/b;", "articles", "LHx/c$c$d;", "statuses", "LHx/c$d$e;", "rescheduleAction", "LHx/c$c$c;", "deliveryType", "LHx/c$c$b;", "deliveryDate", "carrier", "LHx/c$c$e;", "trackingInformation", "deliveryNumber", "LHx/c$c$a;", "deliveryAddressPresentation", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;LHx/c$d$e;LHx/c$c$c;LHx/c$c$b;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LHx/c$c$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "i", "d", "LHx/c$d$e;", "h", "()LHx/c$d$e;", "e", "LHx/c$c$c;", "f", "()LHx/c$c$c;", "LHx/c$c$b;", "()LHx/c$c$b;", "j", "LHx/c$c$a;", "()LHx/c$c$a;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hx.c$c  reason: collision with other inner class name */
    public static final class C2661c {

        /* renamed from: a  reason: collision with root package name */
        private final String f110764a;

        /* renamed from: b  reason: collision with root package name */
        private final List<b> f110765b;

        /* renamed from: c  reason: collision with root package name */
        private final List<d> f110766c;

        /* renamed from: d  reason: collision with root package name */
        private final d.e f110767d;

        /* renamed from: e  reason: collision with root package name */
        private final C2663c f110768e;

        /* renamed from: f  reason: collision with root package name */
        private final b f110769f;

        /* renamed from: g  reason: collision with root package name */
        private final String f110770g;

        /* renamed from: h  reason: collision with root package name */
        private final List<e> f110771h;

        /* renamed from: i  reason: collision with root package name */
        private final String f110772i;

        /* renamed from: j  reason: collision with root package name */
        private final a f110773j;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LHx/c$c$a;", "", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$c$a */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f110774a;

            /* renamed from: b  reason: collision with root package name */
            private final String f110775b;

            public a(String str, String str2) {
                C17542s.j(str, "title");
                C17542s.j(str2, "subtitle");
                this.f110774a = str;
                this.f110775b = str2;
            }

            public final String a() {
                return this.f110775b;
            }

            public final String b() {
                return this.f110774a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f110774a, aVar.f110774a) && C17542s.e(this.f110775b, aVar.f110775b);
            }

            public int hashCode() {
                return (this.f110774a.hashCode() * 31) + this.f110775b.hashCode();
            }

            public String toString() {
                String str = this.f110774a;
                String str2 = this.f110775b;
                return "DeliveryAddressPresentation(title=" + str + ", subtitle=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LHx/c$c$b;", "", "<init>", "()V", "a", "b", "LHx/c$c$b$a;", "LHx/c$c$b$b;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$c$b */
        public static abstract class b {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LHx/c$c$b$a;", "LHx/c$c$b;", "LHx/c$b;", "date", "<init>", "(LHx/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/c$b;", "()LHx/c$b;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.c$c$b$a */
            public static final class a extends b {

                /* renamed from: a  reason: collision with root package name */
                private final b f110776a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(bVar, "date");
                    this.f110776a = bVar;
                }

                public final b a() {
                    return this.f110776a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && C17542s.e(this.f110776a, ((a) obj).f110776a);
                }

                public int hashCode() {
                    return this.f110776a.hashCode();
                }

                public String toString() {
                    b bVar = this.f110776a;
                    return "Actual(date=" + bVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LHx/c$c$b$b;", "LHx/c$c$b;", "", "dateRange", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.c$c$b$b  reason: collision with other inner class name */
            public static final class C2662b extends b {

                /* renamed from: a  reason: collision with root package name */
                private final String f110777a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2662b(String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "dateRange");
                    this.f110777a = str;
                }

                public final String a() {
                    return this.f110777a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2662b) && C17542s.e(this.f110777a, ((C2662b) obj).f110777a);
                }

                public int hashCode() {
                    return this.f110777a.hashCode();
                }

                public String toString() {
                    String str = this.f110777a;
                    return "Estimated(dateRange=" + str + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"LHx/c$c$c;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "TRUCK_STANDARD", "TRUCK_CURBSIDE", "PARCEL", "TRUCK_EXPRESS", "PARCEL_EXPRESS", "CLICK_AND_COLLECT", "PICKUP_POINT", "PICKUP_TRUCK", "INTERNAL_LOCKER", "EXTERNAL_LOCKER", "CASH_AND_CARRY", "TRUCK_RETURN", "PARCEL_RETURN", "TRUCK_EXCHANGE", "PARCEL_EXCHANGE", "SERVICE_ORDER", "NO_STOCK", "UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$c$c  reason: collision with other inner class name */
        public enum C2663c {
            TRUCK_STANDARD("TRUCK_STANDARD"),
            TRUCK_CURBSIDE("TRUCK_CURBSIDE"),
            PARCEL("PARCEL"),
            TRUCK_EXPRESS("TRUCK_EXPRESS"),
            PARCEL_EXPRESS("PARCEL_EXPRESS"),
            CLICK_AND_COLLECT("CLICK_AND_COLLECT"),
            PICKUP_POINT("PICKUP_POINT"),
            PICKUP_TRUCK("PICKUP_TRUCK"),
            INTERNAL_LOCKER("INTERNAL_LOCKER"),
            EXTERNAL_LOCKER("EXTERNAL_LOCKER"),
            CASH_AND_CARRY("CASH_AND_CARRY"),
            TRUCK_RETURN("TRUCK_RETURN"),
            PARCEL_RETURN("PARCEL_RETURN"),
            TRUCK_EXCHANGE("TRUCK_EXCHANGE"),
            PARCEL_EXCHANGE("PARCEL_EXCHANGE"),
            SERVICE_ORDER("SERVICE_ORDER"),
            NO_STOCK("NO_STOCK"),
            UNKNOWN("UNKNOWN");
            
            public static final a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/c$c$c$a;", "", "<init>", "()V", "", "rawValue", "LHx/c$c$c;", "a", "(Ljava/lang/String;)LHx/c$c$c;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.c$c$c$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C2663c a(String str) {
                    T t10;
                    Iterator<T> it = C2663c.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.H(((C2663c) t10).j(), str, true)) {
                            break;
                        }
                    }
                    C2663c cVar = (C2663c) t10;
                    if (cVar != null) {
                        return cVar;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar.a(eVar, str5, false, illegalArgumentException, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return C2663c.UNKNOWN;
                }

                private a() {
                }
            }

            static {
                C2663c[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new a((DefaultConstructorMarker) null);
            }

            private C2663c(String str) {
                this.rawValue = str;
            }

            public static C17220a<C2663c> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LHx/c$c$d;", "", "LHx/c$c$d$a;", "deliveryStatus", "LHx/c$c$d$b;", "tense", "<init>", "(LHx/c$c$d$a;LHx/c$c$d$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/c$c$d$a;", "()LHx/c$c$d$a;", "b", "LHx/c$c$d$b;", "()LHx/c$c$d$b;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$c$d */
        public static final class d {

            /* renamed from: a  reason: collision with root package name */
            private final a f110778a;

            /* renamed from: b  reason: collision with root package name */
            private final b f110779b;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LHx/c$c$d$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "ORDER_RECEIVED", "ORDER_PREPARING", "ORDER_PACKING", "ORDER_FINAL_CHECKS", "ORDER_READY_DISPATCH", "ORDER_EXTERNAL_PROCESSING", "ORDER_READY_FOR_CUSTOMER", "ORDER_COMPLETED", "ORDER_FAILED", "CANCEL_PENDING", "CANCELLED", "RETURN_ORDER_CREATED", "RETURN_ON_THE_WAY_TO_IKEA", "RETURN_IKEA_RECEIVED_ITEMS", "ORDER_UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.c$c$d$a */
            public enum a {
                ORDER_RECEIVED("ORDER_RECEIVED"),
                ORDER_PREPARING("ORDER_PREPARING"),
                ORDER_PACKING("ORDER_PACKING"),
                ORDER_FINAL_CHECKS("ORDER_FINAL_CHECKS"),
                ORDER_READY_DISPATCH("ORDER_READY_DISPATCH"),
                ORDER_EXTERNAL_PROCESSING("ORDER_EXTERNAL_PROCESSING"),
                ORDER_READY_FOR_CUSTOMER("ORDER_READY_FOR_CUSTOMER"),
                ORDER_COMPLETED("ORDER_COMPLETED"),
                ORDER_FAILED("ORDER_FAILED"),
                CANCEL_PENDING("ORDER_CANCEL_PENDING"),
                CANCELLED("ORDER_CANCELLED"),
                RETURN_ORDER_CREATED("RETURN_ORDER_CREATED"),
                RETURN_ON_THE_WAY_TO_IKEA("RETURN_ON_THE_WAY_TO_IKEA"),
                RETURN_IKEA_RECEIVED_ITEMS("RETURN_IKEA_RECEIVED_ITEMS"),
                ORDER_UNKNOWN("ORDER_UNKNOWN");
                
                public static final C2664a Companion = null;
                private final String rawValue;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/c$c$d$a$a;", "", "<init>", "()V", "", "rawValue", "LHx/c$c$d$a;", "a", "(Ljava/lang/String;)LHx/c$c$d$a;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Hx.c$c$d$a$a  reason: collision with other inner class name */
                public static final class C2664a {
                    public /* synthetic */ C2664a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final a a(String str) {
                        T t10;
                        Iterator<T> it = a.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it.next();
                            if (C15854t.H(((a) t10).j(), str, true)) {
                                break;
                            }
                        }
                        a aVar = (a) t10;
                        if (aVar != null) {
                            return aVar;
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                        qv.e eVar = qv.e.ERROR;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str2 = null;
                        String str3 = null;
                        for (C11819b bVar : arrayList) {
                            if (str2 == null) {
                                String a10 = C11818a.a((String) null, illegalArgumentException);
                                if (a10 == null) {
                                    break;
                                }
                                str2 = C11820c.a(a10);
                            }
                            String str4 = str2;
                            if (str3 == null) {
                                String name = C2664a.class.getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str5 = str3;
                            bVar.a(eVar, str5, false, illegalArgumentException, str4);
                            str2 = str4;
                            str3 = str5;
                        }
                        return a.ORDER_UNKNOWN;
                    }

                    private C2664a() {
                    }
                }

                static {
                    a[] a10;
                    $ENTRIES = C17221b.a(a10);
                    Companion = new C2664a((DefaultConstructorMarker) null);
                }

                private a(String str) {
                    this.rawValue = str;
                }

                public static C17220a<a> b() {
                    return $ENTRIES;
                }

                public final String j() {
                    return this.rawValue;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LHx/c$c$d$b;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "PAST", "PRESENT", "FUTURE", "UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Hx.c$c$d$b */
            public enum b {
                PAST("PAST"),
                PRESENT("PRESENT"),
                FUTURE("FUTURE"),
                UNKNOWN("UNKNOWN");
                
                public static final a Companion = null;
                private final String rawValue;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/c$c$d$b$a;", "", "<init>", "()V", "", "rawValue", "LHx/c$c$d$b;", "a", "(Ljava/lang/String;)LHx/c$c$d$b;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Hx.c$c$d$b$a */
                public static final class a {
                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final b a(String str) {
                        T t10;
                        Iterator<T> it = b.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it.next();
                            if (C15854t.H(((b) t10).j(), str, true)) {
                                break;
                            }
                        }
                        b bVar = (b) t10;
                        if (bVar != null) {
                            return bVar;
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown status: " + str);
                        qv.e eVar = qv.e.ERROR;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str2 = null;
                        String str3 = null;
                        for (C11819b bVar2 : arrayList) {
                            if (str2 == null) {
                                String a10 = C11818a.a((String) null, illegalArgumentException);
                                if (a10 == null) {
                                    break;
                                }
                                str2 = C11820c.a(a10);
                            }
                            String str4 = str2;
                            if (str3 == null) {
                                String name = a.class.getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str5 = str3;
                            bVar2.a(eVar, str5, false, illegalArgumentException, str4);
                            str2 = str4;
                            str3 = str5;
                        }
                        return b.UNKNOWN;
                    }

                    private a() {
                    }
                }

                static {
                    b[] a10;
                    $ENTRIES = C17221b.a(a10);
                    Companion = new a((DefaultConstructorMarker) null);
                }

                private b(String str) {
                    this.rawValue = str;
                }

                public static C17220a<b> b() {
                    return $ENTRIES;
                }

                public final String j() {
                    return this.rawValue;
                }
            }

            public d(a aVar, b bVar) {
                C17542s.j(aVar, "deliveryStatus");
                C17542s.j(bVar, "tense");
                this.f110778a = aVar;
                this.f110779b = bVar;
            }

            public final a a() {
                return this.f110778a;
            }

            public final b b() {
                return this.f110779b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f110778a == dVar.f110778a && this.f110779b == dVar.f110779b;
            }

            public int hashCode() {
                return (this.f110778a.hashCode() * 31) + this.f110779b.hashCode();
            }

            public String toString() {
                a aVar = this.f110778a;
                b bVar = this.f110779b;
                return "Status(deliveryStatus=" + aVar + ", tense=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LHx/c$c$e;", "", "", "trackingNumber", "trackingLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$c$e */
        public static final class e {

            /* renamed from: a  reason: collision with root package name */
            private final String f110780a;

            /* renamed from: b  reason: collision with root package name */
            private final String f110781b;

            public e(String str, String str2) {
                this.f110780a = str;
                this.f110781b = str2;
            }

            public final String a() {
                return this.f110781b;
            }

            public final String b() {
                return this.f110780a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C17542s.e(this.f110780a, eVar.f110780a) && C17542s.e(this.f110781b, eVar.f110781b);
            }

            public int hashCode() {
                String str = this.f110780a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f110781b;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                String str = this.f110780a;
                String str2 = this.f110781b;
                return "TrackingInformation(trackingNumber=" + str + ", trackingLink=" + str2 + ")";
            }
        }

        public C2661c(String str, List<b> list, List<d> list2, d.e eVar, C2663c cVar, b bVar, String str2, List<e> list3, String str3, a aVar) {
            C17542s.j(str, "id");
            C17542s.j(list, "articles");
            C17542s.j(list2, "statuses");
            C17542s.j(cVar, "deliveryType");
            C17542s.j(list3, "trackingInformation");
            this.f110764a = str;
            this.f110765b = list;
            this.f110766c = list2;
            this.f110767d = eVar;
            this.f110768e = cVar;
            this.f110769f = bVar;
            this.f110770g = str2;
            this.f110771h = list3;
            this.f110772i = str3;
            this.f110773j = aVar;
        }

        public final List<b> a() {
            return this.f110765b;
        }

        public final String b() {
            return this.f110770g;
        }

        public final a c() {
            return this.f110773j;
        }

        public final b d() {
            return this.f110769f;
        }

        public final String e() {
            return this.f110772i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2661c)) {
                return false;
            }
            C2661c cVar = (C2661c) obj;
            return C17542s.e(this.f110764a, cVar.f110764a) && C17542s.e(this.f110765b, cVar.f110765b) && C17542s.e(this.f110766c, cVar.f110766c) && C17542s.e(this.f110767d, cVar.f110767d) && this.f110768e == cVar.f110768e && C17542s.e(this.f110769f, cVar.f110769f) && C17542s.e(this.f110770g, cVar.f110770g) && C17542s.e(this.f110771h, cVar.f110771h) && C17542s.e(this.f110772i, cVar.f110772i) && C17542s.e(this.f110773j, cVar.f110773j);
        }

        public final C2663c f() {
            return this.f110768e;
        }

        public final String g() {
            return this.f110764a;
        }

        public final d.e h() {
            return this.f110767d;
        }

        public int hashCode() {
            int hashCode = ((((this.f110764a.hashCode() * 31) + this.f110765b.hashCode()) * 31) + this.f110766c.hashCode()) * 31;
            d.e eVar = this.f110767d;
            int i10 = 0;
            int hashCode2 = (((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f110768e.hashCode()) * 31;
            b bVar = this.f110769f;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f110770g;
            int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f110771h.hashCode()) * 31;
            String str2 = this.f110772i;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.f110773j;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode5 + i10;
        }

        public final List<d> i() {
            return this.f110766c;
        }

        public final List<e> j() {
            return this.f110771h;
        }

        public String toString() {
            String str = this.f110764a;
            List<b> list = this.f110765b;
            List<d> list2 = this.f110766c;
            d.e eVar = this.f110767d;
            C2663c cVar = this.f110768e;
            b bVar = this.f110769f;
            String str2 = this.f110770g;
            List<e> list3 = this.f110771h;
            String str3 = this.f110772i;
            a aVar = this.f110773j;
            return "DeliveryMethod(id=" + str + ", articles=" + list + ", statuses=" + list2 + ", rescheduleAction=" + eVar + ", deliveryType=" + cVar + ", deliveryDate=" + bVar + ", carrier=" + str2 + ", trackingInformation=" + list3 + ", deliveryNumber=" + str3 + ", deliveryAddressPresentation=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\u0006\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"LHx/c$d;", "", "", "isDoable", "<init>", "(Z)V", "a", "Z", "()Z", "c", "f", "e", "b", "d", "LHx/c$d$a;", "LHx/c$d$b;", "LHx/c$d$c;", "LHx/c$d$e;", "LHx/c$d$f;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f110782a;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"LHx/c$d$a;", "LHx/c$d;", "", "isDoable", "", "assemblyUrl", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: b  reason: collision with root package name */
            private final boolean f110783b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110784c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(boolean z10, String str) {
                super(z10, (DefaultConstructorMarker) null);
                C17542s.j(str, "assemblyUrl");
                this.f110783b = z10;
                this.f110784c = str;
            }

            public boolean a() {
                return this.f110783b;
            }

            public final String b() {
                return this.f110784c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f110783b == aVar.f110783b && C17542s.e(this.f110784c, aVar.f110784c);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f110783b) * 31) + this.f110784c.hashCode();
            }

            public String toString() {
                boolean z10 = this.f110783b;
                String str = this.f110784c;
                return "AssemblyAction(isDoable=" + z10 + ", assemblyUrl=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"LHx/c$d$b;", "LHx/c$d;", "", "isDoable", "", "cancelToken", "", "LHx/c$d$b$a;", "reasons", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: b  reason: collision with root package name */
            private final boolean f110785b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110786c;

            /* renamed from: d  reason: collision with root package name */
            private final List<a> f110787d;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LHx/c$d$b$a;", "", "", "displayText", "reasonCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {

                /* renamed from: a  reason: collision with root package name */
                private final String f110788a;

                /* renamed from: b  reason: collision with root package name */
                private final String f110789b;

                public a(String str, String str2) {
                    C17542s.j(str, "displayText");
                    C17542s.j(str2, "reasonCode");
                    this.f110788a = str;
                    this.f110789b = str2;
                }

                public final String a() {
                    return this.f110788a;
                }

                public final String b() {
                    return this.f110789b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return C17542s.e(this.f110788a, aVar.f110788a) && C17542s.e(this.f110789b, aVar.f110789b);
                }

                public int hashCode() {
                    return (this.f110788a.hashCode() * 31) + this.f110789b.hashCode();
                }

                public String toString() {
                    String str = this.f110788a;
                    String str2 = this.f110789b;
                    return "CancelReason(displayText=" + str + ", reasonCode=" + str2 + ")";
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(boolean z10, String str, List<a> list) {
                super(z10, (DefaultConstructorMarker) null);
                C17542s.j(list, "reasons");
                this.f110785b = z10;
                this.f110786c = str;
                this.f110787d = list;
            }

            public boolean a() {
                return this.f110785b;
            }

            public final String b() {
                return this.f110786c;
            }

            public final List<a> c() {
                return this.f110787d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f110785b == bVar.f110785b && C17542s.e(this.f110786c, bVar.f110786c) && C17542s.e(this.f110787d, bVar.f110787d);
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.f110785b) * 31;
                String str = this.f110786c;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f110787d.hashCode();
            }

            public String toString() {
                boolean z10 = this.f110785b;
                String str = this.f110786c;
                List<a> list = this.f110787d;
                return "CancelOrderAction(isDoable=" + z10 + ", cancelToken=" + str + ", reasons=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"LHx/c$d$c;", "LHx/c$d;", "", "isDoable", "", "expressReturnsUrl", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$d$c  reason: collision with other inner class name */
        public static final class C2665c extends d {

            /* renamed from: b  reason: collision with root package name */
            private final boolean f110790b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110791c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2665c(boolean z10, String str) {
                super(z10, (DefaultConstructorMarker) null);
                C17542s.j(str, "expressReturnsUrl");
                this.f110790b = z10;
                this.f110791c = str;
            }

            public boolean a() {
                return this.f110790b;
            }

            public final String b() {
                return this.f110791c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2665c)) {
                    return false;
                }
                C2665c cVar = (C2665c) obj;
                return this.f110790b == cVar.f110790b && C17542s.e(this.f110791c, cVar.f110791c);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f110790b) * 31) + this.f110791c.hashCode();
            }

            public String toString() {
                boolean z10 = this.f110790b;
                String str = this.f110791c;
                return "ExpressReturnsAction(isDoable=" + z10 + ", expressReturnsUrl=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"LHx/c$d$d;", "", "", "encodedByteArray", "<init>", "(Ljava/lang/String;)V", "", "a", "()[B", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Hx.c$d$d  reason: collision with other inner class name */
        public static final class C2666d {

            /* renamed from: a  reason: collision with root package name */
            private final String f110792a;

            public C2666d(String str) {
                C17542s.j(str, "encodedByteArray");
                this.f110792a = str;
            }

            public final byte[] a() {
                try {
                    return Base64.decode(this.f110792a, 0);
                } catch (IllegalArgumentException e10) {
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("The invoice does not seem to be a Base64 encoded string.", e10);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = C2666d.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, e10, str3);
                        str = str3;
                        str2 = str4;
                    }
                    return null;
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2666d) && C17542s.e(this.f110792a, ((C2666d) obj).f110792a);
            }

            public int hashCode() {
                return this.f110792a.hashCode();
            }

            public String toString() {
                String str = this.f110792a;
                return "Invoice(encodedByteArray=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\t¨\u0006\u0017"}, d2 = {"LHx/c$d$e;", "LHx/c$d;", "", "isDoable", "", "token", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Ljava/lang/String;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends d {

            /* renamed from: b  reason: collision with root package name */
            private final boolean f110793b;

            /* renamed from: c  reason: collision with root package name */
            private final String f110794c;

            public e(boolean z10, String str) {
                super(z10, (DefaultConstructorMarker) null);
                this.f110793b = z10;
                this.f110794c = str;
            }

            public boolean a() {
                return this.f110793b;
            }

            public final String b() {
                return this.f110794c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f110793b == eVar.f110793b && C17542s.e(this.f110794c, eVar.f110794c);
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.f110793b) * 31;
                String str = this.f110794c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                boolean z10 = this.f110793b;
                String str = this.f110794c;
                return "RescheduleAction(isDoable=" + z10 + ", token=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LHx/c$d$f;", "LHx/c$d;", "", "isDoable", "", "LHx/c$d$d;", "invoices", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f extends d {

            /* renamed from: b  reason: collision with root package name */
            private final boolean f110795b;

            /* renamed from: c  reason: collision with root package name */
            private final List<C2666d> f110796c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(boolean z10, List<C2666d> list) {
                super(z10, (DefaultConstructorMarker) null);
                C17542s.j(list, "invoices");
                this.f110795b = z10;
                this.f110796c = list;
            }

            public boolean a() {
                return this.f110795b;
            }

            public final List<C2666d> b() {
                return this.f110796c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.f110795b == fVar.f110795b && C17542s.e(this.f110796c, fVar.f110796c);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.f110795b) * 31) + this.f110796c.hashCode();
            }

            public String toString() {
                boolean z10 = this.f110795b;
                List<C2666d> list = this.f110796c;
                return "ShowInvoiceAction(isDoable=" + z10 + ", invoices=" + list + ")";
            }
        }

        public /* synthetic */ d(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10);
        }

        public boolean a() {
            return this.f110782a;
        }

        private d(boolean z10) {
            this.f110782a = z10;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"LHx/c$e;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "n", "()Z", "", "b", "()I", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "Companion", "a", "CREATED", "IN_PROGRESS", "COMPLETED", "CANCELLED", "CANCEL_PENDING", "RETURNED", "UNKNOWN", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum e {
        CREATED("CREATED"),
        IN_PROGRESS("IN_PROGRESS"),
        COMPLETED("COMPLETED"),
        CANCELLED("CANCELLED"),
        CANCEL_PENDING("CANCEL_PENDING"),
        RETURNED("RETURNED"),
        UNKNOWN("UNKNOWN");
        
        public static final a Companion = null;
        private final String rawValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHx/c$e$a;", "", "<init>", "()V", "", "rawValue", "LHx/c$e;", "a", "(Ljava/lang/String;)LHx/c$e;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(String str) {
                T t10;
                Iterator<T> it = e.j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C15854t.H(((e) t10).m(), str, true)) {
                        break;
                    }
                }
                e eVar = (e) t10;
                return eVar == null ? e.UNKNOWN : eVar;
            }

            private a() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f110797a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Hx.c$e[] r0 = Hx.c.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Hx.c$e r1 = Hx.c.e.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Hx.c$e r1 = Hx.c.e.IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Hx.c$e r1 = Hx.c.e.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Hx.c$e r1 = Hx.c.e.CANCELLED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Hx.c$e r1 = Hx.c.e.CANCEL_PENDING     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Hx.c$e r1 = Hx.c.e.RETURNED     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    Hx.c$e r1 = Hx.c.e.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f110797a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Hx.c.e.b.<clinit>():void");
            }
        }

        static {
            e[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private e(String str) {
            this.rawValue = str;
        }

        public static C17220a<e> j() {
            return $ENTRIES;
        }

        public final int b() {
            switch (b.f110797a[ordinal()]) {
                case 1:
                    return Oo.b.f84534V6;
                case 2:
                    return Oo.b.f84544W6;
                case 3:
                    return Oo.b.f84524U6;
                case 4:
                    return Oo.b.f84514T6;
                case 5:
                    return Oo.b.f84504S6;
                case 6:
                    return Oo.b.f84554X6;
                case 7:
                    return Oo.b.f84564Y6;
                default:
                    throw new t();
            }
        }

        public final String m() {
            return this.rawValue;
        }

        public final boolean n() {
            switch (b.f110797a[ordinal()]) {
                case 1:
                case 2:
                    return true;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return false;
                default:
                    throw new t();
            }
        }
    }

    public c(String str, f fVar, e eVar, b bVar, String str2, a aVar, List<C2661c> list, List<b> list2, List<e> list3, List<? extends d> list4) {
        C17542s.j(str, "id");
        C17542s.j(fVar, "type");
        C17542s.j(eVar, "status");
        C17542s.j(list, "deliveryMethods");
        C17542s.j(list2, "articles");
        C17542s.j(list3, "payments");
        C17542s.j(list4, "actions");
        this.f110747a = str;
        this.f110748b = fVar;
        this.f110749c = eVar;
        this.f110750d = bVar;
        this.f110751e = str2;
        this.f110752f = aVar;
        this.f110753g = list;
        this.f110754h = list2;
        this.f110755i = list3;
        this.f110756j = list4;
    }

    public static /* synthetic */ c b(c cVar, String str, f fVar, e eVar, b bVar, String str2, a aVar, List list, List list2, List list3, List list4, int i10, Object obj) {
        c cVar2 = cVar;
        int i11 = i10;
        return cVar.a((i11 & 1) != 0 ? cVar2.f110747a : str, (i11 & 2) != 0 ? cVar2.f110748b : fVar, (i11 & 4) != 0 ? cVar2.f110749c : eVar, (i11 & 8) != 0 ? cVar2.f110750d : bVar, (i11 & 16) != 0 ? cVar2.f110751e : str2, (i11 & 32) != 0 ? cVar2.f110752f : aVar, (i11 & 64) != 0 ? cVar2.f110753g : list, (i11 & 128) != 0 ? cVar2.f110754h : list2, (i11 & 256) != 0 ? cVar2.f110755i : list3, (i11 & 512) != 0 ? cVar2.f110756j : list4);
    }

    public final c a(String str, f fVar, e eVar, b bVar, String str2, a aVar, List<C2661c> list, List<b> list2, List<e> list3, List<? extends d> list4) {
        C17542s.j(str, "id");
        C17542s.j(fVar, "type");
        C17542s.j(eVar, "status");
        List<C2661c> list5 = list;
        C17542s.j(list5, "deliveryMethods");
        List<b> list6 = list2;
        C17542s.j(list6, "articles");
        List<e> list7 = list3;
        C17542s.j(list7, "payments");
        List<? extends d> list8 = list4;
        C17542s.j(list8, "actions");
        return new c(str, fVar, eVar, bVar, str2, aVar, list5, list6, list7, list8);
    }

    public final List<d> c() {
        return this.f110756j;
    }

    public final List<b> d() {
        return this.f110754h;
    }

    public final a e() {
        return this.f110752f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f110747a, cVar.f110747a) && this.f110748b == cVar.f110748b && this.f110749c == cVar.f110749c && C17542s.e(this.f110750d, cVar.f110750d) && C17542s.e(this.f110751e, cVar.f110751e) && C17542s.e(this.f110752f, cVar.f110752f) && C17542s.e(this.f110753g, cVar.f110753g) && C17542s.e(this.f110754h, cVar.f110754h) && C17542s.e(this.f110755i, cVar.f110755i) && C17542s.e(this.f110756j, cVar.f110756j);
    }

    public final b f() {
        return this.f110750d;
    }

    public final List<C2661c> g() {
        return this.f110753g;
    }

    public final String h() {
        return this.f110747a;
    }

    public int hashCode() {
        int hashCode = ((((this.f110747a.hashCode() * 31) + this.f110748b.hashCode()) * 31) + this.f110749c.hashCode()) * 31;
        b bVar = this.f110750d;
        int i10 = 0;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f110751e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f110752f;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((((((hashCode3 + i10) * 31) + this.f110753g.hashCode()) * 31) + this.f110754h.hashCode()) * 31) + this.f110755i.hashCode()) * 31) + this.f110756j.hashCode();
    }

    public final String i() {
        return this.f110751e;
    }

    public final List<e> j() {
        return this.f110755i;
    }

    public final e k() {
        return this.f110749c;
    }

    public final f l() {
        return this.f110748b;
    }

    public String toString() {
        String str = this.f110747a;
        f fVar = this.f110748b;
        e eVar = this.f110749c;
        b bVar = this.f110750d;
        String str2 = this.f110751e;
        a aVar = this.f110752f;
        List<C2661c> list = this.f110753g;
        List<b> list2 = this.f110754h;
        List<e> list3 = this.f110755i;
        List<d> list4 = this.f110756j;
        return "PurchaseDetails(id=" + str + ", type=" + fVar + ", status=" + eVar + ", dateAndTime=" + bVar + ", location=" + str2 + ", costs=" + aVar + ", deliveryMethods=" + list + ", articles=" + list2 + ", payments=" + list3 + ", actions=" + list4 + ")";
    }
}
