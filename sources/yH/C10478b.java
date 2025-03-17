package yh;

import M6.C6654b;
import M6.d;
import M6.k;
import M6.t;
import M6.w;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zh.e;
import zh.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\u0013\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lyh/b;", "LM6/t;", "Lyh/b$c;", "", "listName", "<init>", "(Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yh.b  reason: case insensitive filesystem */
public final class C10478b implements t<c> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f78070b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f78071a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lyh/b$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation ListCreate($listName: String!) { createList(name: $listName) { listId name updated } }";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lyh/b$b;", "", "", "listId", "name", "updated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.b$b  reason: collision with other inner class name */
    public static final class C1445b {

        /* renamed from: a  reason: collision with root package name */
        private final String f78072a;

        /* renamed from: b  reason: collision with root package name */
        private final String f78073b;

        /* renamed from: c  reason: collision with root package name */
        private final String f78074c;

        public C1445b(String str, String str2, String str3) {
            C17542s.j(str, "listId");
            C17542s.j(str2, "name");
            C17542s.j(str3, "updated");
            this.f78072a = str;
            this.f78073b = str2;
            this.f78074c = str3;
        }

        public final String a() {
            return this.f78072a;
        }

        public final String b() {
            return this.f78073b;
        }

        public final String c() {
            return this.f78074c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1445b)) {
                return false;
            }
            C1445b bVar = (C1445b) obj;
            return C17542s.e(this.f78072a, bVar.f78072a) && C17542s.e(this.f78073b, bVar.f78073b) && C17542s.e(this.f78074c, bVar.f78074c);
        }

        public int hashCode() {
            return (((this.f78072a.hashCode() * 31) + this.f78073b.hashCode()) * 31) + this.f78074c.hashCode();
        }

        public String toString() {
            String str = this.f78072a;
            String str2 = this.f78073b;
            String str3 = this.f78074c;
            return "CreateList(listId=" + str + ", name=" + str2 + ", updated=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyh/b$c;", "", "Lyh/b$b;", "createList", "<init>", "(Lyh/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh/b$b;", "()Lyh/b$b;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.b$c */
    public static final class c implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final C1445b f78075a;

        public c(C1445b bVar) {
            C17542s.j(bVar, "createList");
            this.f78075a = bVar;
        }

        public final C1445b a() {
            return this.f78075a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f78075a, ((c) obj).f78075a);
        }

        public int hashCode() {
            return this.f78075a.hashCode();
        }

        public String toString() {
            C1445b bVar = this.f78075a;
            return "Data(createList=" + bVar + ")";
        }
    }

    public C10478b(String str) {
        C17542s.j(str, "listName");
        this.f78071a = str;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        f.f78395a.b(gVar, kVar, this);
    }

    public C6654b<c> b() {
        return d.d(e.f78393a, false, 1, (Object) null);
    }

    public String c() {
        return "24994a06de04534fbbba4c3b6140cf41690a29bcfbd6a84be590b941e9c5c841";
    }

    public String d() {
        return f78070b.a();
    }

    public final String e() {
        return this.f78071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10478b) && C17542s.e(this.f78071a, ((C10478b) obj).f78071a);
    }

    public int hashCode() {
        return this.f78071a.hashCode();
    }

    public String name() {
        return "ListCreate";
    }

    public String toString() {
        String str = this.f78071a;
        return "ListCreateMutation(listName=" + str + ")";
    }
}
