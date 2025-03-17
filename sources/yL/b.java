package Yl;

import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LYl/b;", "", "Landroid/net/Uri;", "uri", "LYl/b$a;", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LYl/b$a;", "", "<init>", "()V", "b", "a", "LYl/b$a$a;", "LYl/b$a$b;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LYl/b$a$a;", "LYl/b$a;", "", "exceptionMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yl.b$a$a  reason: collision with other inner class name */
        public static final class C1914a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f89305a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1914a(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "exceptionMessage");
                this.f89305a = str;
            }

            public final String a() {
                return this.f89305a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1914a) && C17542s.e(this.f89305a, ((C1914a) obj).f89305a);
            }

            public int hashCode() {
                return this.f89305a.hashCode();
            }

            public String toString() {
                String str = this.f89305a;
                return "Error(exceptionMessage=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LYl/b$a$b;", "LYl/b$a;", "Landroid/net/Uri;", "uri", "backupWebUri", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yl.b$a$b  reason: collision with other inner class name */
        public static final class C1915b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Uri f89306a;

            /* renamed from: b  reason: collision with root package name */
            private final Uri f89307b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1915b(Uri uri, Uri uri2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(uri, "uri");
                C17542s.j(uri2, "backupWebUri");
                this.f89306a = uri;
                this.f89307b = uri2;
            }

            public final Uri a() {
                return this.f89307b;
            }

            public final Uri b() {
                return this.f89306a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1915b)) {
                    return false;
                }
                C1915b bVar = (C1915b) obj;
                return C17542s.e(this.f89306a, bVar.f89306a) && C17542s.e(this.f89307b, bVar.f89307b);
            }

            public int hashCode() {
                return (this.f89306a.hashCode() * 31) + this.f89307b.hashCode();
            }

            public String toString() {
                Uri uri = this.f89306a;
                Uri uri2 = this.f89307b;
                return "LinkItLink(uri=" + uri + ", backupWebUri=" + uri2 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    Object a(Uri uri, C17164e<? super a> eVar);
}
