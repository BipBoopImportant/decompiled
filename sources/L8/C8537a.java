package l8;

import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0001\fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Ll8/a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "I", "b", "index", "Ljava/lang/String;", "c", "name", "d", "value", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l8.a  reason: case insensitive filesystem */
public final class C8537a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0870a f54796d = new C0870a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f54797a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54798b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54799c;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ll8/a$a;", "", "<init>", "()V", "", "Ll8/a;", "customVars", "", "a", "([Ll8/a;)Ljava/lang/String;", "Lorg/json/JSONObject;", "b", "([Ll8/a;)Lorg/json/JSONObject;", "", "MIN_VALID_INDEX", "I", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l8.a$a  reason: collision with other inner class name */
    public static final class C0870a {

        /* renamed from: l8.a$a$a  reason: collision with other inner class name */
        public static final class C0871a extends C17544u implements C17642l<C8537a, CharSequence> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0871a f54800c = new C0871a();

            public C0871a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                C8537a aVar = (C8537a) obj;
                C17542s.j(aVar, "it");
                return aVar.a();
            }
        }

        private C0870a() {
        }

        public final String a(C8537a[] aVarArr) {
            C17542s.j(aVarArr, "customVars");
            return C16870n.C0(aVarArr, " | ", "{ ", " }", 0, (CharSequence) null, C0871a.f54800c, 24, (Object) null);
        }

        public final JSONObject b(C8537a[] aVarArr) {
            C17542s.j(aVarArr, "customVars");
            JSONObject jSONObject = new JSONObject();
            for (C8537a aVar : aVarArr) {
                jSONObject.put(String.valueOf(aVar.b()), aVar.e());
            }
            return jSONObject;
        }

        public /* synthetic */ C0870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String a() {
        return "[" + this.f54797a + "] " + this.f54798b + ": " + this.f54799c;
    }

    public final int b() {
        return this.f54797a;
    }

    public final String c() {
        return this.f54798b;
    }

    public final String d() {
        return this.f54799c;
    }

    public final JSONObject e() {
        JSONObject put = new JSONObject().put(this.f54798b, this.f54799c);
        C17542s.i(put, "JSONObject().put(name, value)");
        return put;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8537a) {
            C8537a aVar = (C8537a) obj;
            return this.f54797a == aVar.f54797a && C17542s.e(this.f54798b, aVar.f54798b) && C17542s.e(this.f54799c, aVar.f54799c);
        }
    }

    public int hashCode() {
        int hashCode = this.f54798b.hashCode();
        return this.f54799c.hashCode() + ((hashCode + (this.f54797a * 31)) * 31);
    }

    public String toString() {
        return "CustomVar(index=" + this.f54797a + ", name=" + this.f54798b + ", value=" + this.f54799c + ')';
    }
}
