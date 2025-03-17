package th;

import M6.A;
import M6.C6654b;
import M6.k;
import M6.w;
import Q6.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uh.v;
import uh.y;
import vh.E0;
import wh.C10378i;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0017\u000b\r\u0014B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b$\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lth/e;", "LM6/A;", "Lth/e$b;", "", "checkoutId", "serviceAreaId", "", "Lwh/i;", "additionalValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "g", "Ljava/util/List;", "e", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements A<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f76851d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f76852a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76853b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C10378i> f76854c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lth/e$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetSelectedDelivery($checkoutId: String!, $serviceAreaId: String!, $additionalValues: [KeyValuePair!]!) { selectedDeliveryAndServices(checkoutId: $checkoutId, serviceAreaId: $serviceAreaId) { shippingBilling(displayFieldVersion: V4, additionalValues: $additionalValues) { __typename ...UserDetailsFields } } }  fragment DynamicFieldsConfigurationFragment on DisplayField { key targetKey title text textAsCollapsed inputValue inputDisplay mandatory errorText inputType uiType accountType data { key value displayText } validation { key value displayText } visibility { conditions { key regex } conditionName } }  fragment UserDetailsFields on DisplayFieldSection { primary { __typename ...DynamicFieldsConfigurationFragment } secondary { __typename ...DynamicFieldsConfigurationFragment } contact { __typename ...DynamicFieldsConfigurationFragment } terms { __typename ...DynamicFieldsConfigurationFragment } }";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth/e$b;", "", "Lth/e$c;", "selectedDeliveryAndServices", "<init>", "(Lth/e$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/e$c;", "()Lth/e$c;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f76855a;

        public b(c cVar) {
            C17542s.j(cVar, "selectedDeliveryAndServices");
            this.f76855a = cVar;
        }

        public final c a() {
            return this.f76855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f76855a, ((b) obj).f76855a);
        }

        public int hashCode() {
            return this.f76855a.hashCode();
        }

        public String toString() {
            c cVar = this.f76855a;
            return "Data(selectedDeliveryAndServices=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth/e$c;", "", "Lth/e$d;", "shippingBilling", "<init>", "(Lth/e$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth/e$d;", "()Lth/e$d;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f76856a;

        public c(d dVar) {
            C17542s.j(dVar, "shippingBilling");
            this.f76856a = dVar;
        }

        public final d a() {
            return this.f76856a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f76856a, ((c) obj).f76856a);
        }

        public int hashCode() {
            return this.f76856a.hashCode();
        }

        public String toString() {
            d dVar = this.f76856a;
            return "SelectedDeliveryAndServices(shippingBilling=" + dVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lth/e$d;", "", "", "__typename", "Lvh/E0;", "userDetailsFields", "<init>", "(Ljava/lang/String;Lvh/E0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/E0;", "()Lvh/E0;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f76857a;

        /* renamed from: b  reason: collision with root package name */
        private final E0 f76858b;

        public d(String str, E0 e02) {
            C17542s.j(str, "__typename");
            C17542s.j(e02, "userDetailsFields");
            this.f76857a = str;
            this.f76858b = e02;
        }

        public final E0 a() {
            return this.f76858b;
        }

        public final String b() {
            return this.f76857a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f76857a, dVar.f76857a) && C17542s.e(this.f76858b, dVar.f76858b);
        }

        public int hashCode() {
            return (this.f76857a.hashCode() * 31) + this.f76858b.hashCode();
        }

        public String toString() {
            String str = this.f76857a;
            E0 e02 = this.f76858b;
            return "ShippingBilling(__typename=" + str + ", userDetailsFields=" + e02 + ")";
        }
    }

    public e(String str, String str2, List<C10378i> list) {
        C17542s.j(str, "checkoutId");
        C17542s.j(str2, "serviceAreaId");
        C17542s.j(list, "additionalValues");
        this.f76852a = str;
        this.f76853b = str2;
        this.f76854c = list;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        y.f77133a.b(gVar, kVar, this);
    }

    public C6654b<b> b() {
        return M6.d.d(v.f77127a, false, 1, (Object) null);
    }

    public String c() {
        return "c44b3e0fe8b79e604777985db66b0cfcbd0fd92c2b57739453e5581b3a5b53cc";
    }

    public String d() {
        return f76851d.a();
    }

    public final List<C10378i> e() {
        return this.f76854c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f76852a, eVar.f76852a) && C17542s.e(this.f76853b, eVar.f76853b) && C17542s.e(this.f76854c, eVar.f76854c);
    }

    public final String f() {
        return this.f76852a;
    }

    public final String g() {
        return this.f76853b;
    }

    public int hashCode() {
        return (((this.f76852a.hashCode() * 31) + this.f76853b.hashCode()) * 31) + this.f76854c.hashCode();
    }

    public String name() {
        return "GetSelectedDelivery";
    }

    public String toString() {
        String str = this.f76852a;
        String str2 = this.f76853b;
        List<C10378i> list = this.f76854c;
        return "GetSelectedDeliveryQuery(checkoutId=" + str + ", serviceAreaId=" + str2 + ", additionalValues=" + list + ")";
    }
}
