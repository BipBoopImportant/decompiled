package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"LwK/ia;", "", "", "title", "", "enabled", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "()Z", "LwK/ia$a;", "LwK/ia$b;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.ia  reason: case insensitive filesystem */
public abstract class C18364ia {

    /* renamed from: a  reason: collision with root package name */
    private final String f151047a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f151048b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LwK/ia$a;", "LwK/ia;", "", "title", "", "iconId", "", "enabled", "<init>", "(Ljava/lang/String;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "I", "e", "Z", "a", "()Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ia$a */
    public static final class a extends C18364ia {

        /* renamed from: c  reason: collision with root package name */
        private final String f151049c;

        /* renamed from: d  reason: collision with root package name */
        private final int f151050d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f151051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, boolean z10) {
            super(str, z10, (DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            this.f151049c = str;
            this.f151050d = i10;
            this.f151051e = z10;
        }

        public boolean a() {
            return this.f151051e;
        }

        public String b() {
            return this.f151049c;
        }

        public final int c() {
            return this.f151050d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f151049c, aVar.f151049c) && this.f151050d == aVar.f151050d && this.f151051e == aVar.f151051e;
        }

        public int hashCode() {
            return (((this.f151049c.hashCode() * 31) + Integer.hashCode(this.f151050d)) * 31) + Boolean.hashCode(this.f151051e);
        }

        public String toString() {
            String str = this.f151049c;
            int i10 = this.f151050d;
            boolean z10 = this.f151051e;
            return "Icon(title=" + str + ", iconId=" + i10 + ", enabled=" + z10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, (i11 & 4) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LwK/ia$b;", "LwK/ia;", "", "title", "", "enabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.ia$b */
    public static final class b extends C18364ia {

        /* renamed from: c  reason: collision with root package name */
        private final String f151052c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f151053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z10) {
            super(str, z10, (DefaultConstructorMarker) null);
            C17542s.j(str, "title");
            this.f151052c = str;
            this.f151053d = z10;
        }

        public boolean a() {
            return this.f151053d;
        }

        public String b() {
            return this.f151052c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f151052c, bVar.f151052c) && this.f151053d == bVar.f151053d;
        }

        public int hashCode() {
            return (this.f151052c.hashCode() * 31) + Boolean.hashCode(this.f151053d);
        }

        public String toString() {
            String str = this.f151052c;
            boolean z10 = this.f151053d;
            return "Text(title=" + str + ", enabled=" + z10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? true : z10);
        }
    }

    public /* synthetic */ C18364ia(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    public boolean a() {
        return this.f151048b;
    }

    public String b() {
        return this.f151047a;
    }

    private C18364ia(String str, boolean z10) {
        this.f151047a = str;
        this.f151048b = z10;
    }
}
