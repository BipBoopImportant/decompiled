package AF;

import DF.C12785b;
import DF.C12789f;
import DF.C12791h;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0018\u0019\n\u0013\u001a\u0015\u0005\u0010\u0011\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0012\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0014\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0016\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\u00020\t8\u0016XD¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0010\u0010\f\u0001\n\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"LAF/D;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "id", "", "b", "Z", "()Z", "isDone", "c", "isHighlighted", "d", "f", "isSelected", "e", "isProcessing", "g", "isUploading", "isNew", "i", "j", "h", "LAF/D$a;", "LAF/D$b;", "LAF/D$c;", "LAF/D$d;", "LAF/D$e;", "LAF/D$f;", "LAF/D$g;", "LAF/D$h;", "LAF/D$i;", "LAF/D$j;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.D  reason: case insensitive filesystem */
public abstract class C12570D {

    /* renamed from: a  reason: collision with root package name */
    private final String f107634a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f107635b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f107636c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f107637d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f107638e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f107639f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f107640g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$a;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$a */
    public static final class a extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final a f107641h = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"LAF/D$b;", "LAF/D;", "LDF/b;", "designItem", "<init>", "(LDF/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "LDF/b;", "()LDF/b;", "i", "Ljava/lang/String;", "a", "id", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$b */
    public static final class b extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        private final C12785b f107642h;

        /* renamed from: i  reason: collision with root package name */
        private final String f107643i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C12785b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "designItem");
            this.f107642h = bVar;
            String uuid = bVar.a().getCompositionUuid().toString();
            C17542s.i(uuid, "toString(...)");
            this.f107643i = uuid;
        }

        public String a() {
            return this.f107643i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f107642h, ((b) obj).f107642h);
        }

        public final C12785b h() {
            return this.f107642h;
        }

        public int hashCode() {
            return this.f107642h.hashCode();
        }

        public String toString() {
            C12785b bVar = this.f107642h;
            return "DesignItem(designItem=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$c;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$c */
    public static final class c extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final c f107644h = new c();

        private c() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$d;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$d */
    public static final class d extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final d f107645h = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$e;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$e */
    public static final class e extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final e f107646h = new e();

        private e() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$f;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$f */
    public static final class f extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final f f107647h = new f();

        private f() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00068\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\b¨\u0006\u0017"}, d2 = {"LAF/D$g;", "LAF/D;", "", "captureSupported", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Z", "()Z", "i", "Ljava/lang/String;", "a", "id", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$g */
    public static final class g extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        private final boolean f107648h;

        /* renamed from: i  reason: collision with root package name */
        private final String f107649i;

        public g() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public String a() {
            return this.f107649i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f107648h == ((g) obj).f107648h;
        }

        public final boolean h() {
            return this.f107648h;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f107648h);
        }

        public String toString() {
            boolean z10 = this.f107648h;
            return "Login(captureSupported=" + z10 + ")";
        }

        public g(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f107648h = z10;
            this.f107649i = "Login";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAF/D$h;", "LAF/D;", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$h */
    public static final class h extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        public static final h f107650h = new h();

        private h() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001a\u0010%\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u001a\u0010(\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001a\u0010+\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001b¨\u0006,"}, d2 = {"LAF/D$i;", "LAF/D;", "LDF/f;", "sceneItem", "<init>", "(LDF/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "LDF/f;", "()LDF/f;", "i", "Ljava/lang/String;", "a", "id", "j", "Z", "b", "()Z", "isDone", "k", "c", "isHighlighted", "l", "f", "isSelected", "m", "e", "isProcessing", "n", "g", "isUploading", "o", "d", "isNew", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$i */
    public static final class i extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        private final C12789f f107651h;

        /* renamed from: i  reason: collision with root package name */
        private final String f107652i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f107653j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f107654k;

        /* renamed from: l  reason: collision with root package name */
        private final boolean f107655l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f107656m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f107657n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f107658o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C12789f fVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(fVar, "sceneItem");
            this.f107651h = fVar;
            String uuid = fVar.l().getUuid().toString();
            C17542s.i(uuid, "toString(...)");
            this.f107652i = uuid;
            this.f107653j = fVar.l().isDone();
            this.f107654k = fVar.f();
            this.f107655l = fVar.g();
            this.f107656m = fVar.l().isProcessing();
            this.f107657n = fVar.l().isUploading();
            this.f107658o = fVar.l().isNew();
        }

        public String a() {
            return this.f107652i;
        }

        public boolean b() {
            return this.f107653j;
        }

        public boolean c() {
            return this.f107654k;
        }

        public boolean d() {
            return this.f107658o;
        }

        public boolean e() {
            return this.f107656m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && C17542s.e(this.f107651h, ((i) obj).f107651h);
        }

        public boolean f() {
            return this.f107655l;
        }

        public boolean g() {
            return this.f107657n;
        }

        public final C12789f h() {
            return this.f107651h;
        }

        public int hashCode() {
            return this.f107651h.hashCode();
        }

        public String toString() {
            C12789f fVar = this.f107651h;
            return "SceneItem(sceneItem=" + fVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u001c\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"LAF/D$j;", "LAF/D;", "LDF/h;", "showroomItem", "<init>", "(LDF/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "h", "LDF/h;", "()LDF/h;", "i", "Ljava/lang/String;", "a", "id", "j", "Z", "c", "()Z", "isHighlighted", "k", "f", "isSelected", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.D$j */
    public static final class j extends C12570D {

        /* renamed from: h  reason: collision with root package name */
        private final C12791h f107659h;

        /* renamed from: i  reason: collision with root package name */
        private final String f107660i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f107661j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f107662k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C12791h hVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(hVar, "showroomItem");
            this.f107659h = hVar;
            String uuid = hVar.l().getSceneUuid().toString();
            C17542s.i(uuid, "toString(...)");
            this.f107660i = uuid;
            this.f107661j = hVar.g();
            this.f107662k = hVar.f();
        }

        public String a() {
            return this.f107660i;
        }

        public boolean c() {
            return this.f107661j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && C17542s.e(this.f107659h, ((j) obj).f107659h);
        }

        public boolean f() {
            return this.f107662k;
        }

        public final C12791h h() {
            return this.f107659h;
        }

        public int hashCode() {
            return this.f107659h.hashCode();
        }

        public String toString() {
            C12791h hVar = this.f107659h;
            return "ShowroomItem(showroomItem=" + hVar + ")";
        }
    }

    public /* synthetic */ C12570D(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String a() {
        return this.f107634a;
    }

    public boolean b() {
        return this.f107635b;
    }

    public boolean c() {
        return this.f107636c;
    }

    public boolean d() {
        return this.f107640g;
    }

    public boolean e() {
        return this.f107638e;
    }

    public boolean f() {
        return this.f107637d;
    }

    public boolean g() {
        return this.f107639f;
    }

    private C12570D() {
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        this.f107634a = uuid;
    }
}
