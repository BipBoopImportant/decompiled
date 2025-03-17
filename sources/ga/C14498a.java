package gA;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LgA/a;", "Ljava/io/IOException;", "<init>", "()V", "b", "a", "LgA/a$a;", "LgA/a$b;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gA.a  reason: case insensitive filesystem */
public abstract class C14498a extends IOException {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LgA/a$a;", "LgA/a;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gA.a$a  reason: collision with other inner class name */
    public static final class C3115a extends C14498a {

        /* renamed from: a  reason: collision with root package name */
        private final String f127251a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3115a(String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "text");
            this.f127251a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3115a) && C17542s.e(this.f127251a, ((C3115a) obj).f127251a);
        }

        public int hashCode() {
            return this.f127251a.hashCode();
        }

        public String toString() {
            String str = this.f127251a;
            return "Generic(text=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LgA/a$b;", "LgA/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gA.a$b */
    public static final class b extends C14498a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f127252a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 340340031;
        }

        public String toString() {
            return "InvalidToken";
        }
    }

    public /* synthetic */ C14498a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C14498a() {
    }
}
