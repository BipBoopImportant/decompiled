package yn;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11519a;
import mp.C11588a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lyn/e2;", "", "a", "j", "c", "k", "f", "e", "h", "i", "d", "b", "g", "Lyn/e2$a;", "Lyn/e2$b;", "Lyn/e2$c;", "Lyn/e2$d;", "Lyn/e2$e;", "Lyn/e2$f;", "Lyn/e2$g;", "Lyn/e2$h;", "Lyn/e2$i;", "Lyn/e2$j;", "Lyn/e2$k;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e2 {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/e2$a;", "Lyn/e2;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e2 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f106842a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1979727319;
        }

        public String toString() {
            return "AvailabilitySettingsClicked";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyn/e2$b;", "Lyn/e2;", "Lkp/a;", "campaign", "<init>", "(Lkp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/a;", "()Lkp/a;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final C11519a f106843a;

        public b(C11519a aVar) {
            C17542s.j(aVar, "campaign");
            this.f106843a = aVar;
        }

        public final C11519a a() {
            return this.f106843a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f106843a, ((b) obj).f106843a);
        }

        public int hashCode() {
            return this.f106843a.hashCode();
        }

        public String toString() {
            C11519a aVar = this.f106843a;
            return "CampaignClicked(campaign=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lyn/e2$c;", "Lyn/e2;", "", "categoryId", "categoryTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106844a;

        /* renamed from: b  reason: collision with root package name */
        private final String f106845b;

        public c(String str, String str2) {
            C17542s.j(str, "categoryId");
            C17542s.j(str2, "categoryTitle");
            this.f106844a = str;
            this.f106845b = str2;
        }

        public final String a() {
            return this.f106844a;
        }

        public final String b() {
            return this.f106845b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f106844a, cVar.f106844a) && C17542s.e(this.f106845b, cVar.f106845b);
        }

        public int hashCode() {
            return (this.f106844a.hashCode() * 31) + this.f106845b.hashCode();
        }

        public String toString() {
            String str = this.f106844a;
            String str2 = this.f106845b;
            return "CategoryClicked(categoryId=" + str + ", categoryTitle=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyn/e2$d;", "Lyn/e2;", "Lmp/a;", "inspirationItem", "<init>", "(Lmp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmp/a;", "()Lmp/a;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final C11588a f106846a;

        public d(C11588a aVar) {
            C17542s.j(aVar, "inspirationItem");
            this.f106846a = aVar;
        }

        public final C11588a a() {
            return this.f106846a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f106846a, ((d) obj).f106846a);
        }

        public int hashCode() {
            return this.f106846a.hashCode();
        }

        public String toString() {
            C11588a aVar = this.f106846a;
            return "InspirationClicked(inspirationItem=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lyn/e2$e;", "Lyn/e2;", "Lkp/i;", "media", "", "visualMessageId", "<init>", "(Lkp/i;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkp/i;", "()Lkp/i;", "b", "Ljava/lang/String;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final kp.i f106847a;

        /* renamed from: b  reason: collision with root package name */
        private final String f106848b;

        public e(kp.i iVar, String str) {
            C17542s.j(iVar, "media");
            C17542s.j(str, "visualMessageId");
            this.f106847a = iVar;
            this.f106848b = str;
        }

        public final kp.i a() {
            return this.f106847a;
        }

        public final String b() {
            return this.f106848b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f106847a, eVar.f106847a) && C17542s.e(this.f106848b, eVar.f106848b);
        }

        public int hashCode() {
            return (this.f106847a.hashCode() * 31) + this.f106848b.hashCode();
        }

        public String toString() {
            kp.i iVar = this.f106847a;
            String str = this.f106848b;
            return "OnShoppableImageClicked(media=" + iVar + ", visualMessageId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lyn/e2$f;", "Lyn/e2;", "", "storyId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106849a;

        public f(String str) {
            C17542s.j(str, "storyId");
            this.f106849a = str;
        }

        public final String a() {
            return this.f106849a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && C17542s.e(this.f106849a, ((f) obj).f106849a);
        }

        public int hashCode() {
            return this.f106849a.hashCode();
        }

        public String toString() {
            String str = this.f106849a;
            return "OnStoryClicked(storyId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lyn/e2$g;", "Lyn/e2;", "", "listId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106850a;

        public g(String str) {
            C17542s.j(str, "listId");
            this.f106850a = str;
        }

        public final String a() {
            return this.f106850a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && C17542s.e(this.f106850a, ((g) obj).f106850a);
        }

        public int hashCode() {
            return this.f106850a.hashCode();
        }

        public String toString() {
            String str = this.f106850a;
            return "OpenShoppingList(listId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lyn/e2$h;", "Lyn/e2;", "", "componentValue", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106851a;

        /* renamed from: b  reason: collision with root package name */
        private final String f106852b;

        public h(String str, String str2) {
            C17542s.j(str, "componentValue");
            C17542s.j(str2, "listId");
            this.f106851a = str;
            this.f106852b = str2;
        }

        public final String a() {
            return this.f106851a;
        }

        public final String b() {
            return this.f106852b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f106851a, hVar.f106851a) && C17542s.e(this.f106852b, hVar.f106852b);
        }

        public int hashCode() {
            return (this.f106851a.hashCode() * 31) + this.f106852b.hashCode();
        }

        public String toString() {
            String str = this.f106851a;
            String str2 = this.f106852b;
            return "ScreenViewed(componentValue=" + str + ", listId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lyn/e2$i;", "Lyn/e2;", "", "suggestionId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106853a;

        public i(String str) {
            C17542s.j(str, "suggestionId");
            this.f106853a = str;
        }

        public final String a() {
            return this.f106853a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f106853a, ((i) obj).f106853a);
        }

        public int hashCode() {
            return this.f106853a.hashCode();
        }

        public String toString() {
            String str = this.f106853a;
            return "SuggestionClicked(suggestionId=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/e2$j;", "Lyn/e2;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j implements e2 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f106854a = new j();

        private j() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 424896619;
        }

        public String toString() {
            return "TopAppBarBackClicked";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lyn/e2$k;", "Lyn/e2;", "", "visualMessageId", "categoryId", "categoryTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final String f106855a;

        /* renamed from: b  reason: collision with root package name */
        private final String f106856b;

        /* renamed from: c  reason: collision with root package name */
        private final String f106857c;

        public k(String str, String str2, String str3) {
            C17542s.j(str, "visualMessageId");
            C17542s.j(str2, "categoryId");
            C17542s.j(str3, "categoryTitle");
            this.f106855a = str;
            this.f106856b = str2;
            this.f106857c = str3;
        }

        public final String a() {
            return this.f106856b;
        }

        public final String b() {
            return this.f106857c;
        }

        public final String c() {
            return this.f106855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C17542s.e(this.f106855a, kVar.f106855a) && C17542s.e(this.f106856b, kVar.f106856b) && C17542s.e(this.f106857c, kVar.f106857c);
        }

        public int hashCode() {
            return (((this.f106855a.hashCode() * 31) + this.f106856b.hashCode()) * 31) + this.f106857c.hashCode();
        }

        public String toString() {
            String str = this.f106855a;
            String str2 = this.f106856b;
            String str3 = this.f106857c;
            return "VisualMessageActionHeaderClicked(visualMessageId=" + str + ", categoryId=" + str2 + ", categoryTitle=" + str3 + ")";
        }
    }
}
