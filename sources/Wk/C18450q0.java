package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vK.C18201a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LwK/q0;", "", "a", "b", "LwK/q0$a;", "LwK/q0$b;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.q0  reason: case insensitive filesystem */
public abstract class C18450q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f151416a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"LwK/q0$a;", "LwK/q0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "buttonLabel", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "iconId", "LvK/a;", "d", "LvK/a;", "()LvK/a;", "iconPosition", "e", "getContentDescription", "contentDescription", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.q0$a */
    public static final class a extends C18450q0 {

        /* renamed from: b  reason: collision with root package name */
        private final String f151417b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f151418c;

        /* renamed from: d  reason: collision with root package name */
        private final C18201a f151419d;

        /* renamed from: e  reason: collision with root package name */
        private final String f151420e;

        public String a() {
            return this.f151417b;
        }

        public Integer b() {
            return this.f151418c;
        }

        public C18201a c() {
            return this.f151419d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f151417b, aVar.f151417b) && C17542s.e(this.f151418c, aVar.f151418c) && this.f151419d == aVar.f151419d && C17542s.e(this.f151420e, aVar.f151420e);
        }

        public int hashCode() {
            int hashCode = this.f151417b.hashCode() * 31;
            Integer num = this.f151418c;
            int i10 = 0;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f151419d.hashCode()) * 31;
            String str = this.f151420e;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f151417b;
            Integer num = this.f151418c;
            C18201a aVar = this.f151419d;
            String str2 = this.f151420e;
            return "PrimaryButton(buttonLabel=" + str + ", iconId=" + num + ", iconPosition=" + aVar + ", contentDescription=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"LwK/q0$b;", "LwK/q0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "buttonLabel", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "iconId", "LvK/a;", "d", "LvK/a;", "()LvK/a;", "iconPosition", "e", "getContentDescription", "contentDescription", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.q0$b */
    public static final class b extends C18450q0 {

        /* renamed from: b  reason: collision with root package name */
        private final String f151421b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f151422c;

        /* renamed from: d  reason: collision with root package name */
        private final C18201a f151423d;

        /* renamed from: e  reason: collision with root package name */
        private final String f151424e;

        public String a() {
            return this.f151421b;
        }

        public Integer b() {
            return this.f151422c;
        }

        public C18201a c() {
            return this.f151423d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f151421b, bVar.f151421b) && C17542s.e(this.f151422c, bVar.f151422c) && this.f151423d == bVar.f151423d && C17542s.e(this.f151424e, bVar.f151424e);
        }

        public int hashCode() {
            int hashCode = this.f151421b.hashCode() * 31;
            Integer num = this.f151422c;
            int i10 = 0;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f151423d.hashCode()) * 31;
            String str = this.f151424e;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f151421b;
            Integer num = this.f151422c;
            C18201a aVar = this.f151423d;
            String str2 = this.f151424e;
            return "SecondaryButton(buttonLabel=" + str + ", iconId=" + num + ", iconPosition=" + aVar + ", contentDescription=" + str2 + ")";
        }
    }
}
