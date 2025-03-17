package Cr;

import android.content.Context;
import android.content.Intent;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0013\r\u0011J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LCr/a;", "", "Landroid/content/Context;", "launchingContext", "", "fileName", "LCr/a$a;", "data", "LCr/a$c;", "type", "LCr/a$b;", "intentType", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;LCr/a$a;LCr/a$c;LCr/a$b;)Landroid/content/Intent;", "context", "LXH/N;", "b", "(LCr/a$c;Landroid/content/Context;)V", "c", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LCr/a$a;", "", "", "b", "()[B", "byteArray", "", "a", "()Ljava/lang/String;", "mimeType", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cr.a$a  reason: collision with other inner class name */
    public interface C1481a {
        String a();

        byte[] b();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LCr/a$b;", "", "<init>", "()V", "a", "b", "LCr/a$b$a;", "LCr/a$b$b;", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"LCr/a$b$a;", "LCr/a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "subject", "b", "text", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cr.a$b$a  reason: collision with other inner class name */
        public static final class C1482a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f79665a;

            /* renamed from: b  reason: collision with root package name */
            private final String f79666b;

            public final String a() {
                return this.f79665a;
            }

            public final String b() {
                return this.f79666b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1482a)) {
                    return false;
                }
                C1482a aVar = (C1482a) obj;
                return C17542s.e(this.f79665a, aVar.f79665a) && C17542s.e(this.f79666b, aVar.f79666b);
            }

            public int hashCode() {
                return (this.f79665a.hashCode() * 31) + this.f79666b.hashCode();
            }

            public String toString() {
                String str = this.f79665a;
                String str2 = this.f79666b;
                return "ShareFile(subject=" + str + ", text=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LCr/a$b$b;", "LCr/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cr.a$b$b  reason: collision with other inner class name */
        public static final class C1483b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1483b f79667a = new C1483b();

            private C1483b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1483b);
            }

            public int hashCode() {
                return -1313698344;
            }

            public String toString() {
                return "ViewFile";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LCr/a$c;", "", "", "subDir", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "INVOICE", "OTHER", "filesharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        INVOICE("invoices"),
        OTHER("other");
        
        private final String subDir;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private c(String str) {
            this.subDir = str;
        }

        public final String b() {
            return this.subDir;
        }
    }

    Intent a(Context context, String str, C1481a aVar, c cVar, b bVar);

    void b(c cVar, Context context);
}
