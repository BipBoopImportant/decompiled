package Hn;

import com.ingka.ikea.app.caasremote.models.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000e\u000b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\b\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"LHn/d;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "group", "", "b", "()Z", "fetchItemInfo", "c", "fetchPrice", "fetchIndicativeAvailability", "Lcom/ingka/ikea/app/caasremote/models/h;", "e", "()Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "f", "xConsumerName", "LHn/d$b;", "LHn/d$c;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f81645b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f81646a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LHn/d$a;", "", "<init>", "()V", "", "CONSUMER_NAME_ONLINE", "Ljava/lang/String;", "CONSUMER_NAME_IN_STORE", "GROUP", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001a\u0010!\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010\u0006¨\u0006\""}, d2 = {"LHn/d$b;", "LHn/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "b", "()Z", "fetchItemInfo", "e", "c", "fetchPrice", "f", "a", "fetchIndicativeAvailability", "Lcom/ingka/ikea/app/caasremote/models/h;", "g", "Lcom/ingka/ikea/app/caasremote/models/h;", "()Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "h", "Ljava/lang/String;", "xConsumerName", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final b f81647c = new b();

        /* renamed from: d  reason: collision with root package name */
        private static final boolean f81648d = false;

        /* renamed from: e  reason: collision with root package name */
        private static final boolean f81649e = true;

        /* renamed from: f  reason: collision with root package name */
        private static final boolean f81650f = true;

        /* renamed from: g  reason: collision with root package name */
        private static final h f81651g = h.IN_STORE;

        /* renamed from: h  reason: collision with root package name */
        private static final String f81652h = "Shop and Go";

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean a() {
            return f81650f;
        }

        public boolean b() {
            return f81648d;
        }

        public boolean c() {
            return f81649e;
        }

        public h e() {
            return f81651g;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public String f() {
            return f81652h;
        }

        public int hashCode() {
            return 586783629;
        }

        public String toString() {
            return "InStore";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001a\u0010!\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010\u0006¨\u0006\""}, d2 = {"LHn/d$c;", "LHn/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "b", "()Z", "fetchItemInfo", "e", "c", "fetchPrice", "f", "a", "fetchIndicativeAvailability", "Lcom/ingka/ikea/app/caasremote/models/h;", "g", "Lcom/ingka/ikea/app/caasremote/models/h;", "()Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "h", "Ljava/lang/String;", "xConsumerName", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        public static final c f81653c = new c();

        /* renamed from: d  reason: collision with root package name */
        private static final boolean f81654d = true;

        /* renamed from: e  reason: collision with root package name */
        private static final boolean f81655e = true;

        /* renamed from: f  reason: collision with root package name */
        private static final boolean f81656f = true;

        /* renamed from: g  reason: collision with root package name */
        private static final h f81657g = h.ONLINE;

        /* renamed from: h  reason: collision with root package name */
        private static final String f81658h = "IKEA App";

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean a() {
            return f81656f;
        }

        public boolean b() {
            return f81654d;
        }

        public boolean c() {
            return f81655e;
        }

        public h e() {
            return f81657g;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public String f() {
            return f81658h;
        }

        public int hashCode() {
            return -778393758;
        }

        public String toString() {
            return "Online";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public final String d() {
        return this.f81646a;
    }

    public abstract h e();

    public abstract String f();

    private d() {
        this.f81646a = "DEFAULT";
    }
}
