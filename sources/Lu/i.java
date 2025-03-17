package Lu;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LLu/i;", "", "LIC/e;", "title", "contentDescription", "buttonText", "LLu/i$a;", "iconCenter", "<init>", "(LIC/e;LIC/e;LIC/e;LLu/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "d", "()LIC/e;", "b", "c", "LLu/i$a;", "()LLu/i$a;", "wayfinding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final int f83367e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f83368a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f83369b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f83370c;

    /* renamed from: d  reason: collision with root package name */
    private final a f83371d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LLu/i$a;", "", "<init>", "()V", "b", "a", "c", "LLu/i$a$a;", "LLu/i$a$b;", "LLu/i$a$c;", "wayfinding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f83372a = 0;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LLu/i$a$a;", "LLu/i$a;", "", "iconResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "wayfinding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lu.i$a$a  reason: collision with other inner class name */
        public static final class C1669a extends a {

            /* renamed from: b  reason: collision with root package name */
            private final int f83373b;

            public C1669a(int i10) {
                super((DefaultConstructorMarker) null);
                this.f83373b = i10;
            }

            public final int a() {
                return this.f83373b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1669a) && this.f83373b == ((C1669a) obj).f83373b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f83373b);
            }

            public String toString() {
                int i10 = this.f83373b;
                return "Icon(iconResId=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLu/i$a$b;", "LLu/i$a;", "<init>", "()V", "wayfinding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f83374b = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LLu/i$a$c;", "LLu/i$a;", "", "imageUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "wayfinding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            private final String f83375b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "imageUrl");
                this.f83375b = str;
            }

            public final String a() {
                return this.f83375b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f83375b, ((c) obj).f83375b);
            }

            public int hashCode() {
                return this.f83375b.hashCode();
            }

            public String toString() {
                String str = this.f83375b;
                return "Url(imageUrl=" + str + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i(C13023e eVar, C13023e eVar2, C13023e eVar3, a aVar) {
        C17542s.j(eVar2, "contentDescription");
        this.f83368a = eVar;
        this.f83369b = eVar2;
        this.f83370c = eVar3;
        this.f83371d = aVar;
    }

    public final C13023e a() {
        return this.f83370c;
    }

    public final C13023e b() {
        return this.f83369b;
    }

    public final a c() {
        return this.f83371d;
    }

    public final C13023e d() {
        return this.f83368a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f83368a, iVar.f83368a) && C17542s.e(this.f83369b, iVar.f83369b) && C17542s.e(this.f83370c, iVar.f83370c) && C17542s.e(this.f83371d, iVar.f83371d);
    }

    public int hashCode() {
        C13023e eVar = this.f83368a;
        int i10 = 0;
        int hashCode = (((eVar == null ? 0 : eVar.hashCode()) * 31) + this.f83369b.hashCode()) * 31;
        C13023e eVar2 = this.f83370c;
        int hashCode2 = (hashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        a aVar = this.f83371d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        C13023e eVar = this.f83368a;
        C13023e eVar2 = this.f83369b;
        C13023e eVar3 = this.f83370c;
        a aVar = this.f83371d;
        return "WayfindingContentModel(title=" + eVar + ", contentDescription=" + eVar2 + ", buttonText=" + eVar3 + ", iconCenter=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(C13023e eVar, C13023e eVar2, C13023e eVar3, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, eVar2, (i10 & 4) != 0 ? null : eVar3, aVar);
    }
}
