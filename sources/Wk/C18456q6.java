package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LwK/q6;", "", "<init>", "()V", "a", "b", "LwK/q6$a;", "LwK/q6$b;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.q6  reason: case insensitive filesystem */
public abstract class C18456q6 {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LwK/q6$a;", "LwK/q6;", "", "iconId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.q6$a */
    public static final class a extends C18456q6 {

        /* renamed from: b  reason: collision with root package name */
        public static final int f151444b = 0;

        /* renamed from: a  reason: collision with root package name */
        private final int f151445a;

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f151445a = i10;
        }

        public final int a() {
            return this.f151445a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f151445a == ((a) obj).f151445a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f151445a);
        }

        public String toString() {
            int i10 = this.f151445a;
            return "Icon(iconId=" + i10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LwK/q6$b;", "LwK/q6;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "a", "Lt1/c;", "()Lt1/c;", "painter", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.q6$b */
    public static final class b extends C18456q6 {

        /* renamed from: a  reason: collision with root package name */
        private final C5942c f151446a;

        public final C5942c a() {
            return this.f151446a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f151446a, ((b) obj).f151446a);
        }

        public int hashCode() {
            return this.f151446a.hashCode();
        }

        public String toString() {
            C5942c cVar = this.f151446a;
            return "Thumbnail(painter=" + cVar + ")";
        }
    }

    public /* synthetic */ C18456q6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18456q6() {
    }
}
