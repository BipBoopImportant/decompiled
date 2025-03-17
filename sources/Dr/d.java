package Dr;

import U0.C4889m;
import XH.C16807N;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\n\fJ3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LDr/d;", "", "Landroidx/compose/ui/d;", "modifier", "LDr/d$b;", "model", "Lkotlin/Function1;", "LDr/d$a;", "LXH/N;", "onAction", "a", "(Landroidx/compose/ui/d;LDr/d$b;LnI/l;LU0/m;I)V", "b", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\u0005\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"LDr/d$a;", "", "<init>", "()V", "Landroid/net/Uri;", "a", "()Landroid/net/Uri;", "uri", "c", "d", "b", "LDr/d$a$a;", "LDr/d$a$b;", "LDr/d$a$c;", "LDr/d$a$d;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDr/d$a$a;", "LDr/d$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dr.d$a$a  reason: collision with other inner class name */
        public static final class C1510a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f80153a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1510a(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f80153a = uri;
            }

            public Uri a() {
                return this.f80153a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1510a) && C17542s.e(this.f80153a, ((C1510a) obj).f80153a);
            }

            public int hashCode() {
                return this.f80153a.hashCode();
            }

            public String toString() {
                Uri uri = this.f80153a;
                return "LatestSpace(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDr/d$a$b;", "LDr/d$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f80154a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f80154a = uri;
            }

            public Uri a() {
                return this.f80154a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f80154a, ((b) obj).f80154a);
            }

            public int hashCode() {
                return this.f80154a.hashCode();
            }

            public String toString() {
                Uri uri = this.f80154a;
                return "SavedRooms(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDr/d$a$c;", "LDr/d$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f80155a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f80155a = uri;
            }

            public Uri a() {
                return this.f80155a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f80155a, ((c) obj).f80155a);
            }

            public int hashCode() {
                return this.f80155a.hashCode();
            }

            public String toString() {
                Uri uri = this.f80155a;
                return "StartScan(uri=" + uri + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDr/d$a$d;", "LDr/d$a;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dr.d$a$d  reason: collision with other inner class name */
        public static final class C1511d extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f80156a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1511d(Uri uri) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                this.f80156a = uri;
            }

            public Uri a() {
                return this.f80156a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1511d) && C17542s.e(this.f80156a, ((C1511d) obj).f80156a);
            }

            public int hashCode() {
                return this.f80156a.hashCode();
            }

            public String toString() {
                Uri uri = this.f80156a;
                return "TryShowroom(uri=" + uri + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Uri a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDr/d$b;", "", "b", "a", "LDr/d$b$a;", "LDr/d$b$b;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"LDr/d$b$a;", "LDr/d$b;", "", "titleRes", "descriptionRes", "backgroundImageRes", "Landroid/net/Uri;", "backgroundVideoUri", "primaryButtonTextRes", "secondaryButtonTextRes", "", "isInverted", "<init>", "(IIILandroid/net/Uri;ILjava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "f", "b", "c", "d", "Landroid/net/Uri;", "()Landroid/net/Uri;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "Z", "()Z", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final int f80157a;

            /* renamed from: b  reason: collision with root package name */
            private final int f80158b;

            /* renamed from: c  reason: collision with root package name */
            private final int f80159c;

            /* renamed from: d  reason: collision with root package name */
            private final Uri f80160d;

            /* renamed from: e  reason: collision with root package name */
            private final int f80161e;

            /* renamed from: f  reason: collision with root package name */
            private final Integer f80162f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f80163g;

            public a(int i10, int i11, int i12, Uri uri, int i13, Integer num, boolean z10) {
                this.f80157a = i10;
                this.f80158b = i11;
                this.f80159c = i12;
                this.f80160d = uri;
                this.f80161e = i13;
                this.f80162f = num;
                this.f80163g = z10;
            }

            public final int a() {
                return this.f80159c;
            }

            public final Uri b() {
                return this.f80160d;
            }

            public final int c() {
                return this.f80158b;
            }

            public final int d() {
                return this.f80161e;
            }

            public final Integer e() {
                return this.f80162f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f80157a == aVar.f80157a && this.f80158b == aVar.f80158b && this.f80159c == aVar.f80159c && C17542s.e(this.f80160d, aVar.f80160d) && this.f80161e == aVar.f80161e && C17542s.e(this.f80162f, aVar.f80162f) && this.f80163g == aVar.f80163g;
            }

            public final int f() {
                return this.f80157a;
            }

            public final boolean g() {
                return this.f80163g;
            }

            public int hashCode() {
                int hashCode = ((((Integer.hashCode(this.f80157a) * 31) + Integer.hashCode(this.f80158b)) * 31) + Integer.hashCode(this.f80159c)) * 31;
                Uri uri = this.f80160d;
                int i10 = 0;
                int hashCode2 = (((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + Integer.hashCode(this.f80161e)) * 31;
                Integer num = this.f80162f;
                if (num != null) {
                    i10 = num.hashCode();
                }
                return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f80163g);
            }

            public String toString() {
                int i10 = this.f80157a;
                int i11 = this.f80158b;
                int i12 = this.f80159c;
                Uri uri = this.f80160d;
                int i13 = this.f80161e;
                Integer num = this.f80162f;
                boolean z10 = this.f80163g;
                return "Entry(titleRes=" + i10 + ", descriptionRes=" + i11 + ", backgroundImageRes=" + i12 + ", backgroundVideoUri=" + uri + ", primaryButtonTextRes=" + i13 + ", secondaryButtonTextRes=" + num + ", isInverted=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u000f¨\u0006#"}, d2 = {"LDr/d$b$b;", "LDr/d$b;", "", "title", "update", "Landroid/net/Uri;", "roomImage", "", "showProgress", "ready", "sceneUuid", "compositionUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", "Landroid/net/Uri;", "()Landroid/net/Uri;", "d", "Z", "e", "()Z", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Dr.d$b$b  reason: collision with other inner class name */
        public static final class C1512b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f80164a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80165b;

            /* renamed from: c  reason: collision with root package name */
            private final Uri f80166c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f80167d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f80168e;

            /* renamed from: f  reason: collision with root package name */
            private final String f80169f;

            /* renamed from: g  reason: collision with root package name */
            private final String f80170g;

            public C1512b(String str, String str2, Uri uri, boolean z10, boolean z11, String str3, String str4) {
                C17542s.j(str, "title");
                C17542s.j(str2, "update");
                C17542s.j(uri, "roomImage");
                C17542s.j(str3, "sceneUuid");
                this.f80164a = str;
                this.f80165b = str2;
                this.f80166c = uri;
                this.f80167d = z10;
                this.f80168e = z11;
                this.f80169f = str3;
                this.f80170g = str4;
            }

            public final String a() {
                return this.f80170g;
            }

            public final boolean b() {
                return this.f80168e;
            }

            public final Uri c() {
                return this.f80166c;
            }

            public final String d() {
                return this.f80169f;
            }

            public final boolean e() {
                return this.f80167d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1512b)) {
                    return false;
                }
                C1512b bVar = (C1512b) obj;
                return C17542s.e(this.f80164a, bVar.f80164a) && C17542s.e(this.f80165b, bVar.f80165b) && C17542s.e(this.f80166c, bVar.f80166c) && this.f80167d == bVar.f80167d && this.f80168e == bVar.f80168e && C17542s.e(this.f80169f, bVar.f80169f) && C17542s.e(this.f80170g, bVar.f80170g);
            }

            public final String f() {
                return this.f80164a;
            }

            public final String g() {
                return this.f80165b;
            }

            public int hashCode() {
                int hashCode = ((((((((((this.f80164a.hashCode() * 31) + this.f80165b.hashCode()) * 31) + this.f80166c.hashCode()) * 31) + Boolean.hashCode(this.f80167d)) * 31) + Boolean.hashCode(this.f80168e)) * 31) + this.f80169f.hashCode()) * 31;
                String str = this.f80170g;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.f80164a;
                String str2 = this.f80165b;
                Uri uri = this.f80166c;
                boolean z10 = this.f80167d;
                boolean z11 = this.f80168e;
                String str3 = this.f80169f;
                String str4 = this.f80170g;
                return "LatestSpace(title=" + str + ", update=" + str2 + ", roomImage=" + uri + ", showProgress=" + z10 + ", ready=" + z11 + ", sceneUuid=" + str3 + ", compositionUuid=" + str4 + ")";
            }
        }
    }

    void a(androidx.compose.ui.d dVar, b bVar, C17642l<? super a, C16807N> lVar, C4889m mVar, int i10);
}
