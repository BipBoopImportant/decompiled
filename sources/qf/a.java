package Qf;

import HJ.C15854t;
import IC.C13023e;
import XH.t;
import android.content.Context;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kp.C11522d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sf.C10243d;
import xB.C15201a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001a!BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b0\u0010,R\u001a\u00104\u001a\u0002018\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b-\u00103¨\u00065"}, d2 = {"LQf/a;", "LxB/a;", "", "postalCode", "Lsf/d;", "preferredDelivery", "LQf/a$b$b;", "homeAvailability", "LQf/a$b$a;", "clickCollectAvailability", "", "isClickCollectAvailabilityDisabled", "showError", "isLoading", "isLoadingDeliveryDetails", "<init>", "(Ljava/lang/String;Lsf/d;LQf/a$b$b;LQf/a$b$a;ZZZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "Lsf/d;", "j", "()Lsf/d;", "c", "LQf/a$b$b;", "h", "()LQf/a$b$b;", "d", "LQf/a$b$a;", "g", "()LQf/a$b$a;", "e", "Z", "o", "()Z", "f", "n", "p", "q", "", "J", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final String f63089a;

    /* renamed from: b  reason: collision with root package name */
    private final C10243d f63090b;

    /* renamed from: c  reason: collision with root package name */
    private final b.C1071b f63091c;

    /* renamed from: d  reason: collision with root package name */
    private final b.C1070a f63092d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f63093e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63094f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f63095g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f63096h;

    /* renamed from: i  reason: collision with root package name */
    private final long f63097i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LQf/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "PARTIAL", "LIMITED", "NONE", "UNKNOWN", "INVALID_INPUT", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qf.a$a  reason: collision with other inner class name */
    public enum C1069a {
        FULL,
        PARTIAL,
        LIMITED,
        NONE,
        UNKNOWN,
        INVALID_INPUT;

        static {
            C1069a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0011\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"LQf/a$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "LQf/a$a;", "e", "()LQf/a$a;", "status", "", "d", "()I", "requested", "b", "available", "LQf/a$c;", "c", "()LQf/a$c;", "details", "LQf/a$b$a;", "LQf/a$b$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"LQf/a$b$a;", "LQf/a$b;", "", "requested", "available", "", "selectedStoreName", "LQf/a$a;", "status", "LQf/a$c;", "details", "<init>", "(IILjava/lang/String;LQf/a$a;LQf/a$c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Ljava/lang/String;", "f", "LQf/a$a;", "e", "()LQf/a$a;", "LQf/a$c;", "()LQf/a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qf.a$b$a  reason: collision with other inner class name */
        public static final class C1070a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final int f63098a;

            /* renamed from: b  reason: collision with root package name */
            private final int f63099b;

            /* renamed from: c  reason: collision with root package name */
            private final String f63100c;

            /* renamed from: d  reason: collision with root package name */
            private final C1069a f63101d;

            /* renamed from: e  reason: collision with root package name */
            private final c f63102e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C1070a(int i10, int i11, String str, C1069a aVar, c cVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, str, aVar, (i12 & 16) != 0 ? null : cVar);
            }

            public int b() {
                return this.f63099b;
            }

            public c c() {
                return this.f63102e;
            }

            public int d() {
                return this.f63098a;
            }

            public C1069a e() {
                return this.f63101d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1070a)) {
                    return false;
                }
                C1070a aVar = (C1070a) obj;
                return this.f63098a == aVar.f63098a && this.f63099b == aVar.f63099b && C17542s.e(this.f63100c, aVar.f63100c) && this.f63101d == aVar.f63101d && C17542s.e(this.f63102e, aVar.f63102e);
            }

            public final String f() {
                return this.f63100c;
            }

            public int hashCode() {
                int hashCode = ((Integer.hashCode(this.f63098a) * 31) + Integer.hashCode(this.f63099b)) * 31;
                String str = this.f63100c;
                int i10 = 0;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f63101d.hashCode()) * 31;
                c cVar = this.f63102e;
                if (cVar != null) {
                    i10 = cVar.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                int i10 = this.f63098a;
                int i11 = this.f63099b;
                String str = this.f63100c;
                C1069a aVar = this.f63101d;
                c cVar = this.f63102e;
                return "ClickCollect(requested=" + i10 + ", available=" + i11 + ", selectedStoreName=" + str + ", status=" + aVar + ", details=" + cVar + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1070a(int i10, int i11, String str, C1069a aVar, c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "status");
                this.f63098a = i10;
                this.f63099b = i11;
                this.f63100c = str;
                this.f63101d = aVar;
                this.f63102e = cVar;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"LQf/a$b$b;", "LQf/a$b;", "", "requested", "available", "LQf/a$a;", "status", "LQf/a$c;", "details", "<init>", "(IILQf/a$a;LQf/a$c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "LQf/a$a;", "e", "()LQf/a$a;", "LQf/a$c;", "()LQf/a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qf.a$b$b  reason: collision with other inner class name */
        public static final class C1071b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final int f63103a;

            /* renamed from: b  reason: collision with root package name */
            private final int f63104b;

            /* renamed from: c  reason: collision with root package name */
            private final C1069a f63105c;

            /* renamed from: d  reason: collision with root package name */
            private final c f63106d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1071b(int i10, int i11, C1069a aVar, c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "status");
                this.f63103a = i10;
                this.f63104b = i11;
                this.f63105c = aVar;
                this.f63106d = cVar;
            }

            public int b() {
                return this.f63104b;
            }

            public c c() {
                return this.f63106d;
            }

            public int d() {
                return this.f63103a;
            }

            public C1069a e() {
                return this.f63105c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1071b)) {
                    return false;
                }
                C1071b bVar = (C1071b) obj;
                return this.f63103a == bVar.f63103a && this.f63104b == bVar.f63104b && this.f63105c == bVar.f63105c && C17542s.e(this.f63106d, bVar.f63106d);
            }

            public int hashCode() {
                int hashCode = ((((Integer.hashCode(this.f63103a) * 31) + Integer.hashCode(this.f63104b)) * 31) + this.f63105c.hashCode()) * 31;
                c cVar = this.f63106d;
                return hashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                int i10 = this.f63103a;
                int i11 = this.f63104b;
                C1069a aVar = this.f63105c;
                c cVar = this.f63106d;
                return "Home(requested=" + i10 + ", available=" + i11 + ", status=" + aVar + ", details=" + cVar + ")";
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f63107a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    Qf.a$a[] r0 = Qf.a.C1069a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Qf.a$a r1 = Qf.a.C1069a.FULL     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    Qf.a$a r1 = Qf.a.C1069a.PARTIAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    Qf.a$a r1 = Qf.a.C1069a.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    Qf.a$a r1 = Qf.a.C1069a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    Qf.a$a r1 = Qf.a.C1069a.INVALID_INPUT     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    Qf.a$a r1 = Qf.a.C1069a.LIMITED     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f63107a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: Qf.a.b.c.<clinit>():void");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Context context) {
            C17542s.j(context, "context");
            switch (c.f63107a[e().ordinal()]) {
                case 1:
                    return context.getString(Oo.b.f84688k0);
                case 2:
                    int d10 = d() - b();
                    return context.getResources().getQuantityString(Oo.a.f84310e, d10, new Object[]{Integer.valueOf(d10), Integer.valueOf(d())});
                case 3:
                    return context.getString(Oo.b.f84699l0);
                case 4:
                    if (this instanceof C1070a) {
                        return context.getString(Oo.b.f84652g8);
                    }
                    if (this instanceof C1071b) {
                        return context.getString(Oo.b.f84674i8);
                    }
                    throw new t();
                case 5:
                    if (!(this instanceof C1070a)) {
                        if (this instanceof C1071b) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected scenario");
                            e eVar = e.ERROR;
                            ArrayList<C11819b> arrayList = new ArrayList<>();
                            for (Object next : d.f102012a.a()) {
                                if (((C11819b) next).b(eVar, false)) {
                                    arrayList.add(next);
                                }
                            }
                            String str = null;
                            String str2 = null;
                            for (C11819b bVar : arrayList) {
                                if (str == null) {
                                    String a10 = C11818a.a((String) null, illegalArgumentException);
                                    if (a10 != null) {
                                        str = C11820c.a(a10);
                                    }
                                }
                                String str3 = str;
                                if (str2 == null) {
                                    String name = getClass().getName();
                                    C17542s.g(name);
                                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o12.length() != 0) {
                                        name = C15854t.P0(o12, "Kt");
                                    }
                                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                }
                                String str4 = str2;
                                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                                str = str3;
                                str2 = str4;
                            }
                        } else {
                            throw new t();
                        }
                    }
                    return null;
                case 6:
                    return context.getString(Oo.b.f84754q0);
                default:
                    throw new t();
            }
        }

        public abstract int b();

        public abstract c c();

        public abstract int d();

        public abstract C1069a e();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LQf/a$c;", "", "", "earliestDelivery", "LQf/a$c$a;", "price", "<init>", "(Ljava/lang/String;LQf/a$c$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LQf/a$c$a;", "()LQf/a$c$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f63108a;

        /* renamed from: b  reason: collision with root package name */
        private final C1072a f63109b;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LQf/a$c$a;", "", "<init>", "()V", "b", "a", "c", "LQf/a$c$a$a;", "LQf/a$c$a$b;", "LQf/a$c$a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qf.a$c$a  reason: collision with other inner class name */
        public static abstract class C1072a {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"LQf/a$c$a$a;", "LQf/a$c$a;", "", "value", "", "stringResId", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qf.a$c$a$a  reason: collision with other inner class name */
            public static final class C1073a extends C1072a {

                /* renamed from: a  reason: collision with root package name */
                private final String f63110a;

                /* renamed from: b  reason: collision with root package name */
                private final int f63111b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1073a(String str, int i10) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "value");
                    this.f63110a = str;
                    this.f63111b = i10;
                }

                public final int a() {
                    return this.f63111b;
                }

                public final String b() {
                    return this.f63110a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1073a)) {
                        return false;
                    }
                    C1073a aVar = (C1073a) obj;
                    return C17542s.e(this.f63110a, aVar.f63110a) && this.f63111b == aVar.f63111b;
                }

                public int hashCode() {
                    return (this.f63110a.hashCode() * 31) + Integer.hashCode(this.f63111b);
                }

                public String toString() {
                    String str = this.f63110a;
                    int i10 = this.f63111b;
                    return "From(value=" + str + ", stringResId=" + i10 + ")";
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LQf/a$c$a$b;", "LQf/a$c$a;", "", "value", "Lkp/d;", "currencyConfig", "<init>", "(DLkp/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Lkp/d;", "()Lkp/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qf.a$c$a$b */
            public static final class b extends C1072a {

                /* renamed from: a  reason: collision with root package name */
                private final double f63112a;

                /* renamed from: b  reason: collision with root package name */
                private final C11522d f63113b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(double d10, C11522d dVar) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(dVar, "currencyConfig");
                    this.f63112a = d10;
                    this.f63113b = dVar;
                }

                public final C11522d a() {
                    return this.f63113b;
                }

                public final double b() {
                    return this.f63112a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return Double.compare(this.f63112a, bVar.f63112a) == 0 && C17542s.e(this.f63113b, bVar.f63113b);
                }

                public int hashCode() {
                    return (Double.hashCode(this.f63112a) * 31) + this.f63113b.hashCode();
                }

                public String toString() {
                    double d10 = this.f63112a;
                    C11522d dVar = this.f63113b;
                    return "Standard(value=" + d10 + ", currencyConfig=" + dVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LQf/a$c$a$c;", "LQf/a$c$a;", "LIC/e;", "label", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qf.a$c$a$c  reason: collision with other inner class name */
            public static final class C1074c extends C1072a {

                /* renamed from: b  reason: collision with root package name */
                public static final int f63114b = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final C13023e f63115a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1074c(C13023e eVar) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(eVar, "label");
                    this.f63115a = eVar;
                }

                public final C13023e a() {
                    return this.f63115a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1074c) && C17542s.e(this.f63115a, ((C1074c) obj).f63115a);
                }

                public int hashCode() {
                    return this.f63115a.hashCode();
                }

                public String toString() {
                    C13023e eVar = this.f63115a;
                    return "Text(label=" + eVar + ")";
                }
            }

            public /* synthetic */ C1072a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1072a() {
            }
        }

        public c(String str, C1072a aVar) {
            this.f63108a = str;
            this.f63109b = aVar;
        }

        public final String a() {
            return this.f63108a;
        }

        public final C1072a b() {
            return this.f63109b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f63108a, cVar.f63108a) && C17542s.e(this.f63109b, cVar.f63109b);
        }

        public int hashCode() {
            String str = this.f63108a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            C1072a aVar = this.f63109b;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f63108a;
            C1072a aVar = this.f63109b;
            return "DeliveryOptionDetails(earliestDelivery=" + str + ", price=" + aVar + ")";
        }
    }

    public a(String str, C10243d dVar, b.C1071b bVar, b.C1070a aVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dVar, "preferredDelivery");
        C17542s.j(bVar, "homeAvailability");
        C17542s.j(aVar, "clickCollectAvailability");
        this.f63089a = str;
        this.f63090b = dVar;
        this.f63091c = bVar;
        this.f63092d = aVar;
        this.f63093e = z10;
        this.f63094f = z11;
        this.f63095g = z12;
        this.f63096h = z13;
        this.f63097i = (long) Objects.hash(new Object[]{P.b(a.class)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f63089a, aVar.f63089a) && this.f63090b == aVar.f63090b && C17542s.e(this.f63091c, aVar.f63091c) && C17542s.e(this.f63092d, aVar.f63092d) && this.f63093e == aVar.f63093e && this.f63094f == aVar.f63094f && this.f63095g == aVar.f63095g && this.f63096h == aVar.f63096h;
    }

    public long f() {
        return this.f63097i;
    }

    public final b.C1070a g() {
        return this.f63092d;
    }

    public final b.C1071b h() {
        return this.f63091c;
    }

    public int hashCode() {
        String str = this.f63089a;
        return ((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f63090b.hashCode()) * 31) + this.f63091c.hashCode()) * 31) + this.f63092d.hashCode()) * 31) + Boolean.hashCode(this.f63093e)) * 31) + Boolean.hashCode(this.f63094f)) * 31) + Boolean.hashCode(this.f63095g)) * 31) + Boolean.hashCode(this.f63096h);
    }

    public final String i() {
        return this.f63089a;
    }

    public final C10243d j() {
        return this.f63090b;
    }

    public final boolean n() {
        return this.f63094f;
    }

    public final boolean o() {
        return this.f63093e;
    }

    public final boolean p() {
        return this.f63095g;
    }

    public final boolean q() {
        return this.f63096h;
    }

    public String toString() {
        String str = this.f63089a;
        C10243d dVar = this.f63090b;
        b.C1071b bVar = this.f63091c;
        b.C1070a aVar = this.f63092d;
        boolean z10 = this.f63093e;
        boolean z11 = this.f63094f;
        boolean z12 = this.f63095g;
        boolean z13 = this.f63096h;
        return "AvailabilityUiState(postalCode=" + str + ", preferredDelivery=" + dVar + ", homeAvailability=" + bVar + ", clickCollectAvailability=" + aVar + ", isClickCollectAvailabilityDisabled=" + z10 + ", showError=" + z11 + ", isLoading=" + z12 + ", isLoadingDeliveryDetails=" + z13 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, C10243d dVar, b.C1071b bVar, b.C1070a aVar, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, dVar, bVar, aVar, z10, z11, z12, (i10 & 128) != 0 ? false : z13);
    }
}
