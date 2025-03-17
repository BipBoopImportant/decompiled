package Iz;

import XH.x;
import android.net.Uri;
import dI.C17164e;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0002\u000b\u0006J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LIz/r;", "", "Landroid/net/Uri;", "uri", "LXH/x;", "LIz/t;", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "storeId", "additionalInfo", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface r {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"LIz/r$a;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "a", "LIz/r$a$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends IllegalArgumentException {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LIz/r$a$a;", "LIz/r$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Iz.r$a$a  reason: collision with other inner class name */
        public static final class C2692a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2692a f111114a = new C2692a();

            private C2692a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2692a);
            }

            public int hashCode() {
                return -926729185;
            }

            public String toString() {
                return "InvalidStore";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LIz/r$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "START_INSTORE_PAGE", "START_PTAG", "UNKNOWN", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        START_INSTORE_PAGE("start_instore_page"),
        START_PTAG("start_ptag"),
        UNKNOWN("unknown");
        
        private final String value;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.value = str;
        }
    }

    Object a(Uri uri, C17164e<? super x<? extends C13053t>> eVar);

    Object b(String str, String str2, C17164e<? super x<? extends C13053t>> eVar);
}
