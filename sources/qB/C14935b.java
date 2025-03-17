package qB;

import KJ.C15987c;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sB.C15035a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\b\u0018\u00002\u00020\u0001:\u0003\u001e\u0010\"BQ\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0014\u0010/\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0017\u00100\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b,\u0010+¨\u00061"}, d2 = {"LqB/b;", "", "LKJ/c;", "LqB/c;", "lists", "", "isAuthorized", "LqB/b$a;", "createListResult", "LqB/b$c;", "updateListResult", "syncingShoppingLists", "LqB/b$b;", "loading", "<init>", "(LKJ/c;Ljava/lang/Boolean;LqB/b$a;LqB/b$c;ZLqB/b$b;)V", "a", "(LKJ/c;Ljava/lang/Boolean;LqB/b$a;LqB/b$c;ZLqB/b$b;)LqB/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "d", "()LKJ/c;", "b", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "c", "LqB/b$a;", "()LqB/b$a;", "LqB/b$c;", "h", "()LqB/b$c;", "e", "Z", "g", "()Z", "f", "LqB/b$b;", "()LqB/b$b;", "createListResultFromEmptyList", "showListPicker", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qB.b  reason: case insensitive filesystem */
public final class C14935b {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C14936c> f130380a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f130381b;

    /* renamed from: c  reason: collision with root package name */
    private final a f130382c;

    /* renamed from: d  reason: collision with root package name */
    private final c f130383d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f130384e;

    /* renamed from: f  reason: collision with root package name */
    private final C3223b f130385f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f130386g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f130387h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LqB/b$a;", "", "a", "b", "LqB/b$a$a;", "LqB/b$a$b;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qB.b$a */
    public interface a {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LqB/b$a$a;", "LqB/b$a;", "", "fromEmptyList", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qB.b$a$a  reason: collision with other inner class name */
        public static final class C3221a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f130388a;

            public C3221a(boolean z10) {
                this.f130388a = z10;
            }

            public final boolean a() {
                return this.f130388a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3221a) && this.f130388a == ((C3221a) obj).f130388a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f130388a);
            }

            public String toString() {
                boolean z10 = this.f130388a;
                return "DisplayCreateListInput(fromEmptyList=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LqB/b$a$b;", "LqB/b$a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qB.b$a$b  reason: collision with other inner class name */
        public static final class C3222b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f130389a;

            public C3222b(Throwable th2) {
                C17542s.j(th2, "throwable");
                this.f130389a = th2;
            }

            public final Throwable a() {
                return this.f130389a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3222b) && C17542s.e(this.f130389a, ((C3222b) obj).f130389a);
            }

            public int hashCode() {
                return this.f130389a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f130389a;
                return "Failure(throwable=" + th2 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LqB/b$b;", "", "a", "LqB/b$b$a;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qB.b$b  reason: collision with other inner class name */
    public interface C3223b {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LqB/b$b$a;", "LqB/b$b;", "", "fromEmptyList", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qB.b$b$a */
        public static final class a implements C3223b {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f130390a;

            public a(boolean z10) {
                this.f130390a = z10;
            }

            public final boolean a() {
                return this.f130390a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f130390a == ((a) obj).f130390a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f130390a);
            }

            public String toString() {
                boolean z10 = this.f130390a;
                return "CreateList(fromEmptyList=" + z10 + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"LqB/b$c;", "", "", "requestKey", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "listId", "listName", "LsB/a$a;", "action", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;Ljava/lang/String;Ljava/lang/String;LsB/a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "d", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "c", "LsB/a$a;", "()LsB/a$a;", "listpicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qB.b$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f130391a;

        /* renamed from: b  reason: collision with root package name */
        private final ListPickerNavigation.Operation f130392b;

        /* renamed from: c  reason: collision with root package name */
        private final String f130393c;

        /* renamed from: d  reason: collision with root package name */
        private final String f130394d;

        /* renamed from: e  reason: collision with root package name */
        private final C15035a.C3239a f130395e;

        public c(String str, ListPickerNavigation.Operation operation, String str2, String str3, C15035a.C3239a aVar) {
            C17542s.j(str, "requestKey");
            C17542s.j(operation, "operation");
            C17542s.j(str2, "listId");
            C17542s.j(str3, "listName");
            C17542s.j(aVar, "action");
            this.f130391a = str;
            this.f130392b = operation;
            this.f130393c = str2;
            this.f130394d = str3;
            this.f130395e = aVar;
        }

        public final C15035a.C3239a a() {
            return this.f130395e;
        }

        public final String b() {
            return this.f130393c;
        }

        public final String c() {
            return this.f130394d;
        }

        public final ListPickerNavigation.Operation d() {
            return this.f130392b;
        }

        public final String e() {
            return this.f130391a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f130391a, cVar.f130391a) && C17542s.e(this.f130392b, cVar.f130392b) && C17542s.e(this.f130393c, cVar.f130393c) && C17542s.e(this.f130394d, cVar.f130394d) && this.f130395e == cVar.f130395e;
        }

        public int hashCode() {
            return (((((((this.f130391a.hashCode() * 31) + this.f130392b.hashCode()) * 31) + this.f130393c.hashCode()) * 31) + this.f130394d.hashCode()) * 31) + this.f130395e.hashCode();
        }

        public String toString() {
            String str = this.f130391a;
            ListPickerNavigation.Operation operation = this.f130392b;
            String str2 = this.f130393c;
            String str3 = this.f130394d;
            C15035a.C3239a aVar = this.f130395e;
            return "UpdateListResult(requestKey=" + str + ", operation=" + operation + ", listId=" + str2 + ", listName=" + str3 + ", action=" + aVar + ")";
        }
    }

    public C14935b() {
        this((C15987c) null, (Boolean) null, (a) null, (c) null, false, (C3223b) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C14935b b(C14935b bVar, C15987c<C14936c> cVar, Boolean bool, a aVar, c cVar2, boolean z10, C3223b bVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = bVar.f130380a;
        }
        if ((i10 & 2) != 0) {
            bool = bVar.f130381b;
        }
        Boolean bool2 = bool;
        if ((i10 & 4) != 0) {
            aVar = bVar.f130382c;
        }
        a aVar2 = aVar;
        if ((i10 & 8) != 0) {
            cVar2 = bVar.f130383d;
        }
        c cVar3 = cVar2;
        if ((i10 & 16) != 0) {
            z10 = bVar.f130384e;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            bVar2 = bVar.f130385f;
        }
        return bVar.a(cVar, bool2, aVar2, cVar3, z11, bVar2);
    }

    public final C14935b a(C15987c<C14936c> cVar, Boolean bool, a aVar, c cVar2, boolean z10, C3223b bVar) {
        C17542s.j(cVar, "lists");
        return new C14935b(cVar, bool, aVar, cVar2, z10, bVar);
    }

    public final a c() {
        return this.f130382c;
    }

    public final C15987c<C14936c> d() {
        return this.f130380a;
    }

    public final C3223b e() {
        return this.f130385f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14935b)) {
            return false;
        }
        C14935b bVar = (C14935b) obj;
        return C17542s.e(this.f130380a, bVar.f130380a) && C17542s.e(this.f130381b, bVar.f130381b) && C17542s.e(this.f130382c, bVar.f130382c) && C17542s.e(this.f130383d, bVar.f130383d) && this.f130384e == bVar.f130384e && C17542s.e(this.f130385f, bVar.f130385f);
    }

    public final boolean f() {
        return this.f130387h;
    }

    public final boolean g() {
        return this.f130384e;
    }

    public final c h() {
        return this.f130383d;
    }

    public int hashCode() {
        int hashCode = this.f130380a.hashCode() * 31;
        Boolean bool = this.f130381b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f130382c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f130383d;
        int hashCode4 = (((hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f130384e)) * 31;
        C3223b bVar = this.f130385f;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 + i10;
    }

    public final Boolean i() {
        return this.f130381b;
    }

    public String toString() {
        C15987c<C14936c> cVar = this.f130380a;
        Boolean bool = this.f130381b;
        a aVar = this.f130382c;
        c cVar2 = this.f130383d;
        boolean z10 = this.f130384e;
        C3223b bVar = this.f130385f;
        return "State(lists=" + cVar + ", isAuthorized=" + bool + ", createListResult=" + aVar + ", updateListResult=" + cVar2 + ", syncingShoppingLists=" + z10 + ", loading=" + bVar + ")";
    }

    public C14935b(C15987c<C14936c> cVar, Boolean bool, a aVar, c cVar2, boolean z10, C3223b bVar) {
        C17542s.j(cVar, "lists");
        this.f130380a = cVar;
        this.f130381b = bool;
        this.f130382c = aVar;
        this.f130383d = cVar2;
        this.f130384e = z10;
        this.f130385f = bVar;
        a.C3221a aVar2 = aVar instanceof a.C3221a ? (a.C3221a) aVar : null;
        boolean z11 = false;
        boolean z12 = aVar2 != null && aVar2.a();
        this.f130386g = z12;
        if (C17542s.e(bool, Boolean.TRUE) && !z12 && cVar2 == null) {
            z11 = true;
        }
        this.f130387h = z11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14935b(KJ.C15987c r5, java.lang.Boolean r6, qB.C14935b.a r7, qB.C14935b.c r8, boolean r9, qB.C14935b.C3223b r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0008
            KJ.f r5 = KJ.C15985a.a()
        L_0x0008:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000f
            r12 = r0
            goto L_0x0010
        L_0x000f:
            r12 = r6
        L_0x0010:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0016
            r1 = r0
            goto L_0x0017
        L_0x0016:
            r1 = r7
        L_0x0017:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001d
            r2 = r0
            goto L_0x001e
        L_0x001d:
            r2 = r8
        L_0x001e:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0023
            r9 = 0
        L_0x0023:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r10
        L_0x002a:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qB.C14935b.<init>(KJ.c, java.lang.Boolean, qB.b$a, qB.b$c, boolean, qB.b$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
