package Jh;

import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\nB\u001d\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"LJh/a;", "", "", "drawableRes", "titleRes", "<init>", "(Ljava/lang/Integer;I)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "I", "()I", "LJh/a$a;", "LJh/a$b;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f61395a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61396b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LJh/a$a;", "LJh/a;", "", "poiName", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "d", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jh.a$a  reason: collision with other inner class name */
    public static final class C1016a extends a {

        /* renamed from: c  reason: collision with root package name */
        private final String f61397c;

        /* renamed from: d  reason: collision with root package name */
        private final LocationLatLng f61398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1016a(String str, LocationLatLng locationLatLng) {
            super(Integer.valueOf(C18146a.f148086I6), Oo.b.f84472P4, (DefaultConstructorMarker) null);
            C17542s.j(str, "poiName");
            C17542s.j(locationLatLng, "location");
            this.f61397c = str;
            this.f61398d = locationLatLng;
        }

        public final LocationLatLng c() {
            return this.f61398d;
        }

        public final String d() {
            return this.f61397c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1016a)) {
                return false;
            }
            C1016a aVar = (C1016a) obj;
            return C17542s.e(this.f61397c, aVar.f61397c) && C17542s.e(this.f61398d, aVar.f61398d);
        }

        public int hashCode() {
            return (this.f61397c.hashCode() * 31) + this.f61398d.hashCode();
        }

        public String toString() {
            String str = this.f61397c;
            LocationLatLng locationLatLng = this.f61398d;
            return "Directions(poiName=" + str + ", location=" + locationLatLng + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LJh/a$b;", "LJh/a;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: c  reason: collision with root package name */
        private final String f61399c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((Integer) null, Oo.b.f84508T0, (DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            this.f61399c = str;
        }

        public final String c() {
            return this.f61399c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f61399c, ((b) obj).f61399c);
        }

        public int hashCode() {
            return this.f61399c.hashCode();
        }

        public String toString() {
            String str = this.f61399c;
            return "SelectPoi(id=" + str + ")";
        }
    }

    public /* synthetic */ a(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i10);
    }

    public final Integer a() {
        return this.f61395a;
    }

    public final int b() {
        return this.f61396b;
    }

    private a(Integer num, int i10) {
        this.f61395a = num;
        this.f61396b = i10;
    }
}
