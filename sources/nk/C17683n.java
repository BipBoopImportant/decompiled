package nK;

import HJ.C15854t;
import WK.C16762E;
import YH.C16877v;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0004\u0007\b\t\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"LnK/n;", "", "a", "b", "c", "d", "e", "LnK/n$a;", "LnK/n$c;", "LnK/n$d;", "LnK/n$e;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.n  reason: case insensitive filesystem */
interface C17683n {

    /* renamed from: a  reason: collision with root package name */
    public static final b f144966a = b.f144968a;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"LnK/n$a;", "LnK/n;", "LnK/b;", "asset", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.n$a */
    public static final class a implements C17683n {

        /* renamed from: b  reason: collision with root package name */
        private final String f144967b;

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String a() {
            return this.f144967b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17671b.b(this.f144967b, ((a) obj).f144967b);
        }

        public int hashCode() {
            return C17671b.c(this.f144967b);
        }

        public String toString() {
            String d10 = C17671b.d(this.f144967b);
            return "AssetUri(asset=" + d10 + ")";
        }

        private a(String str) {
            C17542s.j(str, "asset");
            this.f144967b = str;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LnK/n$b;", "", "<init>", "()V", "Landroid/net/Uri;", "", "a", "(Landroid/net/Uri;)Ljava/lang/Integer;", "uri", "LnK/n;", "b", "(Landroid/net/Uri;)LnK/n;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.n$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f144968a = new b();

        private b() {
        }

        private final Integer a(Uri uri) {
            if (C17542s.e(uri.getScheme(), "android.resource")) {
                String authority = uri.getAuthority();
                if (authority == null || !(!C15854t.v0(authority))) {
                    return null;
                }
                List<String> pathSegments = uri.getPathSegments();
                C17542s.i(pathSegments, "getPathSegments(...)");
                String str = (String) C16877v.d1(pathSegments);
                if (str != null) {
                    return C15854t.t(str);
                }
                return null;
            }
            throw new IllegalStateException("Check failed.");
        }

        public final C17683n b(Uri uri) {
            C17683n dVar;
            C17542s.j(uri, "uri");
            String scheme = uri.getScheme();
            if (scheme != null) {
                int hashCode = scheme.hashCode();
                if (hashCode != -368816979) {
                    if (hashCode != 3143036) {
                        if (hashCode == 951530617 && scheme.equals("content")) {
                            return new c(uri);
                        }
                        return null;
                    } else if (!scheme.equals("file")) {
                        return null;
                    } else {
                        List<String> pathSegments = uri.getPathSegments();
                        C17542s.i(pathSegments, "getPathSegments(...)");
                        if (C17542s.e((String) C16877v.y0(pathSegments), "android_asset")) {
                            List<String> pathSegments2 = uri.getPathSegments();
                            C17542s.i(pathSegments2, "getPathSegments(...)");
                            dVar = new a(C17671b.a(C16877v.G0(C16877v.n0(pathSegments2, 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)), (DefaultConstructorMarker) null);
                        } else {
                            String path = uri.getPath();
                            if (path == null) {
                                return null;
                            }
                            dVar = new d(C16762E.a.e(C16762E.f139592b, path, false, 1, (Object) null));
                        }
                    }
                } else if (!scheme.equals("android.resource")) {
                    return null;
                } else {
                    Integer a10 = a(uri);
                    return a10 != null ? new e(a10.intValue()) : new c(uri);
                }
            } else {
                String path2 = uri.getPath();
                if (path2 == null || !C15854t.e1(path2, '/', false, 2, (Object) null)) {
                    return null;
                }
                List<String> pathSegments3 = uri.getPathSegments();
                C17542s.i(pathSegments3, "getPathSegments(...)");
                if (pathSegments3.isEmpty()) {
                    return null;
                }
                C16762E.a aVar = C16762E.f139592b;
                String uri2 = uri.toString();
                C17542s.i(uri2, "toString(...)");
                dVar = new d(C16762E.a.e(aVar, uri2, false, 1, (Object) null));
            }
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LnK/n$c;", "LnK/n;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroid/net/Uri;", "a", "()Landroid/net/Uri;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.n$c */
    public static final class c implements C17683n {

        /* renamed from: b  reason: collision with root package name */
        private final Uri f144969b;

        public c(Uri uri) {
            C17542s.j(uri, "uri");
            this.f144969b = uri;
        }

        public final Uri a() {
            return this.f144969b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f144969b, ((c) obj).f144969b);
        }

        public int hashCode() {
            return this.f144969b.hashCode();
        }

        public String toString() {
            Uri uri = this.f144969b;
            return "ContentUri(uri=" + uri + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LnK/n$d;", "LnK/n;", "LWK/E;", "path", "<init>", "(LWK/E;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LWK/E;", "a", "()LWK/E;", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.n$d */
    public static final class d implements C17683n {

        /* renamed from: b  reason: collision with root package name */
        private final C16762E f144970b;

        public d(C16762E e10) {
            C17542s.j(e10, "path");
            this.f144970b = e10;
        }

        public final C16762E a() {
            return this.f144970b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f144970b, ((d) obj).f144970b);
        }

        public int hashCode() {
            return this.f144970b.hashCode();
        }

        public String toString() {
            C16762E e10 = this.f144970b;
            return "FileUri(path=" + e10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LnK/n$e;", "LnK/n;", "", "resourceId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nK.n$e */
    public static final class e implements C17683n {

        /* renamed from: b  reason: collision with root package name */
        private final int f144971b;

        public e(int i10) {
            this.f144971b = i10;
        }

        public final int a() {
            return this.f144971b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f144971b == ((e) obj).f144971b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f144971b);
        }

        public String toString() {
            int i10 = this.f144971b;
            return "ResourceUri(resourceId=" + i10 + ")";
        }
    }
}
