package gs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import gs.h;
import k6.C8441h;
import k6.C8442i;
import k6.C8444k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.i;
import t1.C5942c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001:\u0003\u0014\u001f!BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgs/e;", "", "Landroid/content/Context;", "context", "data", "Lgs/h$a;", "imageSize", "Lgs/e$b;", "size", "", "crossFade", "allowHardware", "", "errorResId", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lgs/h$a;Lgs/e$b;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Lgs/e$a;", "builder", "(Landroid/content/Context;Lgs/e$a;)V", "Lk6/h;", "a", "()Lk6/h;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "b", "Ljava/lang/Object;", "c", "Lgs/h$a;", "d", "Lgs/e$b;", "e", "Ljava/lang/Boolean;", "f", "g", "Ljava/lang/Integer;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final int f97946h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f97947a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f97948b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f97949c;

    /* renamed from: d  reason: collision with root package name */
    private final b f97950d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f97951e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f97952f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f97953g;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f\"\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%\"\u0004\b&\u0010'R$\u0010.\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b#\u0010+\"\u0004\b,\u0010-R$\u00100\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\r\u0010\u001f\"\u0004\b/\u0010!¨\u00061"}, d2 = {"Lgs/e$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lgs/e;", "a", "()Lgs/e;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lgs/h$a;", "b", "Lgs/h$a;", "f", "()Lgs/h$a;", "l", "(Lgs/h$a;)V", "imageSize", "Lgs/e$b;", "c", "Lgs/e$b;", "g", "()Lgs/e$b;", "m", "(Lgs/e$b;)V", "size", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "(Ljava/lang/Boolean;)V", "crossfade", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "data", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "k", "(Ljava/lang/Integer;)V", "errorResId", "h", "allowHardware", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f97954a;

        /* renamed from: b  reason: collision with root package name */
        private h.a f97955b;

        /* renamed from: c  reason: collision with root package name */
        private b f97956c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f97957d;

        /* renamed from: e  reason: collision with root package name */
        private Object f97958e;

        /* renamed from: f  reason: collision with root package name */
        private Integer f97959f;

        /* renamed from: g  reason: collision with root package name */
        private Boolean f97960g;

        public a(Context context) {
            C17542s.j(context, "context");
            this.f97954a = context;
        }

        public final e a() {
            return new e(this.f97954a, this, (DefaultConstructorMarker) null);
        }

        public final Boolean b() {
            return this.f97960g;
        }

        public final Boolean c() {
            return this.f97957d;
        }

        public final Object d() {
            return this.f97958e;
        }

        public final Integer e() {
            return this.f97959f;
        }

        public final h.a f() {
            return this.f97955b;
        }

        public final b g() {
            return this.f97956c;
        }

        public final void h(Boolean bool) {
            this.f97960g = bool;
        }

        public final void i(Boolean bool) {
            this.f97957d = bool;
        }

        public final void j(Object obj) {
            this.f97958e = obj;
        }

        public final void k(Integer num) {
            this.f97959f = num;
        }

        public final void l(h.a aVar) {
            this.f97955b = aVar;
        }

        public final void m(b bVar) {
            this.f97956c = bVar;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lgs/e$b;", "", "", "width", "height", "<init>", "(II)V", "Ll6/h;", "c", "()Ll6/h;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f97961c = 0;

        /* renamed from: a  reason: collision with root package name */
        private final int f97962a;

        /* renamed from: b  reason: collision with root package name */
        private final int f97963b;

        public b(int i10, int i11) {
            this.f97962a = i10;
            this.f97963b = i11;
        }

        public final int a() {
            return this.f97963b;
        }

        public final int b() {
            return this.f97962a;
        }

        public final l6.h c() {
            return i.a(this.f97962a, this.f97963b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f97962a == bVar.f97962a && this.f97963b == bVar.f97963b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f97962a) * 31) + Integer.hashCode(this.f97963b);
        }

        public String toString() {
            int i10 = this.f97962a;
            int i11 = this.f97963b;
            return "Size(width=" + i10 + ", height=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lgs/e$c;", "", "<init>", "()V", "a", "c", "d", "b", "Lgs/e$c$a;", "Lgs/e$c$b;", "Lgs/e$c$c;", "Lgs/e$c$d;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f97964a = 0;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgs/e$c$a;", "Lgs/e$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: b  reason: collision with root package name */
            public static final a f97965b = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1364136737;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgs/e$c$b;", "Lgs/e$c;", "Lt1/c;", "painter", "<init>", "(Lt1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt1/c;", "getPainter", "()Lt1/c;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: b  reason: collision with root package name */
            private final C5942c f97966b;

            public b(C5942c cVar) {
                super((DefaultConstructorMarker) null);
                this.f97966b = cVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f97966b, ((b) obj).f97966b);
            }

            public int hashCode() {
                C5942c cVar = this.f97966b;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                C5942c cVar = this.f97966b;
                return "Error(painter=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgs/e$c$c;", "Lgs/e$c;", "Lt1/c;", "painter", "<init>", "(Lt1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt1/c;", "getPainter", "()Lt1/c;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gs.e$c$c  reason: collision with other inner class name */
        public static final class C2193c extends c {

            /* renamed from: b  reason: collision with root package name */
            private final C5942c f97967b;

            public C2193c(C5942c cVar) {
                super((DefaultConstructorMarker) null);
                this.f97967b = cVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2193c) && C17542s.e(this.f97967b, ((C2193c) obj).f97967b);
            }

            public int hashCode() {
                C5942c cVar = this.f97967b;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                C5942c cVar = this.f97967b;
                return "Loading(painter=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgs/e$c$d;", "Lgs/e$c;", "Lt1/c;", "painter", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Lt1/c;Landroid/graphics/drawable/Drawable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt1/c;", "getPainter", "()Lt1/c;", "c", "Landroid/graphics/drawable/Drawable;", "a", "()Landroid/graphics/drawable/Drawable;", "imagerequest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: b  reason: collision with root package name */
            private final C5942c f97968b;

            /* renamed from: c  reason: collision with root package name */
            private final Drawable f97969c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C5942c cVar, Drawable drawable) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, PlaceTypes.PAINTER);
                C17542s.j(drawable, "drawable");
                this.f97968b = cVar;
                this.f97969c = drawable;
            }

            public final Drawable a() {
                return this.f97969c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f97968b, dVar.f97968b) && C17542s.e(this.f97969c, dVar.f97969c);
            }

            public int hashCode() {
                return (this.f97968b.hashCode() * 31) + this.f97969c.hashCode();
            }

            public String toString() {
                C5942c cVar = this.f97968b;
                Drawable drawable = this.f97969c;
                return "Success(painter=" + cVar + ", drawable=" + drawable + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ e(Context context, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar);
    }

    public final C8441h a() {
        C8441h.a aVar = new C8441h.a(this.f97947a);
        aVar.e(this.f97948b);
        h.a aVar2 = this.f97949c;
        if (aVar2 != null) {
            g.a(aVar, aVar2);
        }
        Boolean bool = this.f97951e;
        if (bool != null) {
            C8442i.a(aVar, bool.booleanValue());
        }
        Integer num = this.f97953g;
        if (num != null) {
            C8444k.d(aVar, num.intValue());
        }
        b bVar = this.f97950d;
        if (bVar != null) {
            aVar.p(bVar.c());
        }
        Boolean bool2 = this.f97952f;
        if (bool2 != null) {
            C8444k.b(aVar, bool2.booleanValue());
        }
        return aVar.c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f97947a, eVar.f97947a) && C17542s.e(this.f97948b, eVar.f97948b) && this.f97949c == eVar.f97949c && C17542s.e(this.f97950d, eVar.f97950d) && C17542s.e(this.f97951e, eVar.f97951e) && C17542s.e(this.f97952f, eVar.f97952f) && C17542s.e(this.f97953g, eVar.f97953g);
    }

    public int hashCode() {
        int hashCode = this.f97947a.hashCode() * 31;
        Object obj = this.f97948b;
        int i10 = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        h.a aVar = this.f97949c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f97950d;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.f97951e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f97952f;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f97953g;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        Context context = this.f97947a;
        Object obj = this.f97948b;
        h.a aVar = this.f97949c;
        b bVar = this.f97950d;
        Boolean bool = this.f97951e;
        Boolean bool2 = this.f97952f;
        Integer num = this.f97953g;
        return "IkeaImageRequest(context=" + context + ", data=" + obj + ", imageSize=" + aVar + ", size=" + bVar + ", crossFade=" + bool + ", allowHardware=" + bool2 + ", errorResId=" + num + ")";
    }

    public e(Context context, Object obj, h.a aVar, b bVar, Boolean bool, Boolean bool2, Integer num) {
        C17542s.j(context, "context");
        this.f97947a = context;
        this.f97948b = obj;
        this.f97949c = aVar;
        this.f97950d = bVar;
        this.f97951e = bool;
        this.f97952f = bool2;
        this.f97953g = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e(android.content.Context r9, gs.e.a r10) {
        /*
            r8 = this;
            java.lang.Object r2 = r10.d()
            gs.h$a r3 = r10.f()
            gs.e$b r4 = r10.g()
            java.lang.Boolean r5 = r10.c()
            java.lang.Integer r7 = r10.e()
            java.lang.Boolean r6 = r10.b()
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.e.<init>(android.content.Context, gs.e$a):void");
    }
}
