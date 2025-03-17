package jw;

import IC.C13023e;
import cw.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ljw/b;", "", "<init>", "()V", "b", "a", "Ljw/b$a;", "Ljw/b$b;", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b\u001a\u0010$¨\u0006%"}, d2 = {"Ljw/b$a;", "Ljw/b;", "", "id", "Lcw/c;", "type", "LIC/e;", "message", "", "icon", "deeplink", "", "expanded", "<init>", "(Ljava/lang/String;Lcw/c;LIC/e;ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lcw/c;", "f", "()Lcw/c;", "c", "LIC/e;", "e", "()LIC/e;", "I", "Z", "()Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: g  reason: collision with root package name */
        public static final int f24875g = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final String f24876a;

        /* renamed from: b  reason: collision with root package name */
        private final c f24877b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f24878c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24879d;

        /* renamed from: e  reason: collision with root package name */
        private final String f24880e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f24881f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, c cVar, C13023e eVar, int i10, String str2, boolean z10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(cVar, "type");
            C17542s.j(eVar, "message");
            this.f24876a = str;
            this.f24877b = cVar;
            this.f24878c = eVar;
            this.f24879d = i10;
            this.f24880e = str2;
            this.f24881f = z10;
        }

        public final String a() {
            return this.f24880e;
        }

        public final boolean b() {
            return this.f24881f;
        }

        public final int c() {
            return this.f24879d;
        }

        public final String d() {
            return this.f24876a;
        }

        public final C13023e e() {
            return this.f24878c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f24876a, aVar.f24876a) && this.f24877b == aVar.f24877b && C17542s.e(this.f24878c, aVar.f24878c) && this.f24879d == aVar.f24879d && C17542s.e(this.f24880e, aVar.f24880e) && this.f24881f == aVar.f24881f;
        }

        public final c f() {
            return this.f24877b;
        }

        public int hashCode() {
            int hashCode = ((((((this.f24876a.hashCode() * 31) + this.f24877b.hashCode()) * 31) + this.f24878c.hashCode()) * 31) + Integer.hashCode(this.f24879d)) * 31;
            String str = this.f24880e;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f24881f);
        }

        public String toString() {
            String str = this.f24876a;
            c cVar = this.f24877b;
            C13023e eVar = this.f24878c;
            int i10 = this.f24879d;
            String str2 = this.f24880e;
            boolean z10 = this.f24881f;
            return "DisplayMessage(id=" + str + ", type=" + cVar + ", message=" + eVar + ", icon=" + i10 + ", deeplink=" + str2 + ", expanded=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljw/b$b;", "Ljw/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "messaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jw.b$b  reason: collision with other inner class name */
    public static final class C0397b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0397b f24882a = new C0397b();

        private C0397b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0397b);
        }

        public int hashCode() {
            return 1028566211;
        }

        public String toString() {
            return "NoMessage";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
