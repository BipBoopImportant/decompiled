package B0;

import H0.Q;
import N1.W;
import T1.C4832a;
import T1.C4838g;
import T1.C4840i;
import T1.C4842k;
import T1.C4845n;
import T1.H;
import T1.P;
import T1.r;
import XH.C16807N;
import YH.C16877v;
import android.view.KeyEvent;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import nI.C17642l;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u00162\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b=\u0010<R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010HR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010IR\u001a\u0010\u0019\u001a\u00020\u00188\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010J\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"LB0/U;", "", "LB0/B;", "state", "LH0/Q;", "selectionManager", "LT1/P;", "value", "", "editable", "singleLine", "LH0/U;", "preparedSelectionState", "LT1/H;", "offsetMapping", "LB0/o0;", "undoManager", "LB0/k;", "keyCombiner", "LB0/u;", "keyMapping", "Lkotlin/Function1;", "LXH/N;", "onValueChange", "LT1/r;", "imeAction", "<init>", "(LB0/B;LH0/Q;LT1/P;ZZLH0/U;LT1/H;LB0/o0;LB0/k;LB0/u;LnI/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "LT1/i;", "f", "(Ljava/util/List;)V", "e", "(LT1/i;)V", "Ly1/b;", "event", "LT1/a;", "m", "(Landroid/view/KeyEvent;)LT1/a;", "LH0/P;", "block", "g", "(LnI/l;)V", "l", "(Landroid/view/KeyEvent;)Z", "a", "LB0/B;", "j", "()LB0/B;", "b", "LH0/Q;", "h", "()LH0/Q;", "c", "LT1/P;", "getValue", "()LT1/P;", "d", "Z", "getEditable", "()Z", "i", "LH0/U;", "getPreparedSelectionState", "()LH0/U;", "LT1/H;", "getOffsetMapping", "()LT1/H;", "LB0/o0;", "k", "()LB0/o0;", "LB0/k;", "LB0/u;", "LnI/l;", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final B f4604a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f4605b;

    /* renamed from: c  reason: collision with root package name */
    private final P f4606c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4607d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4608e;

    /* renamed from: f  reason: collision with root package name */
    private final H0.U f4609f;

    /* renamed from: g  reason: collision with root package name */
    private final H f4610g;

    /* renamed from: h  reason: collision with root package name */
    private final o0 f4611h;

    /* renamed from: i  reason: collision with root package name */
    private final C4367k f4612i;

    /* renamed from: j  reason: collision with root package name */
    private final C4376u f4613j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C17642l<P, C16807N> f4614k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int f4615l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/P;", "it", "LXH/N;", "a", "(LT1/P;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f4616c = new a();

        a() {
            super(1);
        }

        public final void a(P p10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((P) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LXH/N;", "a", "(LH0/P;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<H0.P, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4374s f4617c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ U f4618d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f4619e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LXH/N;", "a", "(LH0/P;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<H0.P, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f4620c = new a();

            a() {
                super(1);
            }

            public final void a(H0.P p10) {
                p10.A();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((H0.P) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LXH/N;", "a", "(LH0/P;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B0.U$b$b  reason: collision with other inner class name */
        static final class C0006b extends C17544u implements C17642l<H0.P, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0006b f4621c = new C0006b();

            C0006b() {
                super(1);
            }

            public final void a(H0.P p10) {
                p10.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((H0.P) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final c f4622c = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                return new C4838g(W.i(p10.u()) - p10.q(), 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class d extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final d f4623c = new d();

            d() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                int l10 = p10.l();
                if (l10 != -1) {
                    return new C4838g(0, l10 - W.i(p10.u()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class e extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final e f4624c = new e();

            e() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                Integer t10 = p10.t();
                if (t10 == null) {
                    return null;
                }
                return new C4838g(W.i(p10.u()) - t10.intValue(), 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class f extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final f f4625c = new f();

            f() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                Integer m10 = p10.m();
                if (m10 != null) {
                    return new C4838g(0, m10.intValue() - W.i(p10.u()));
                }
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class g extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final g f4626c = new g();

            g() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                Integer i10 = p10.i();
                if (i10 == null) {
                    return null;
                }
                return new C4838g(W.i(p10.u()) - i10.intValue(), 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH0/P;", "LT1/i;", "a", "(LH0/P;)LT1/i;"}, k = 3, mv = {1, 8, 0})
        static final class h extends C17544u implements C17642l<H0.P, C4840i> {

            /* renamed from: c  reason: collision with root package name */
            public static final h f4627c = new h();

            h() {
                super(1);
            }

            /* renamed from: a */
            public final C4840i invoke(H0.P p10) {
                Integer f10 = p10.f();
                if (f10 != null) {
                    return new C4838g(0, f10.intValue() - W.i(p10.u()));
                }
                return null;
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class i {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f4628a;

            /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|(2:95|96)|97|99) */
            /* JADX WARNING: Can't wrap try/catch for region: R(99:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|99) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00fa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0104 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x010e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0118 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0122 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x012c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0136 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0140 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x014a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0154 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x015e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0168 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0172 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x017c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0186 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0190 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x019a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01a4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x01ae */
            /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x01b8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01c2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x01cc */
            /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x01d6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    B0.s[] r0 = B0.C4374s.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    B0.s r1 = B0.C4374s.COPY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    B0.s r1 = B0.C4374s.PASTE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    B0.s r1 = B0.C4374s.CUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    B0.s r1 = B0.C4374s.LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    B0.s r1 = B0.C4374s.RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    B0.s r1 = B0.C4374s.LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    B0.s r1 = B0.C4374s.RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    B0.s r1 = B0.C4374s.PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    B0.s r1 = B0.C4374s.NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    B0.s r1 = B0.C4374s.UP     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    B0.s r1 = B0.C4374s.DOWN     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    B0.s r1 = B0.C4374s.PAGE_UP     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    B0.s r1 = B0.C4374s.PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    B0.s r1 = B0.C4374s.LINE_START     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    B0.s r1 = B0.C4374s.LINE_END     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    B0.s r1 = B0.C4374s.LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    B0.s r1 = B0.C4374s.LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    B0.s r1 = B0.C4374s.HOME     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    B0.s r1 = B0.C4374s.END     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    B0.s r1 = B0.C4374s.DELETE_PREV_CHAR     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    B0.s r1 = B0.C4374s.DELETE_NEXT_CHAR     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    B0.s r1 = B0.C4374s.DELETE_PREV_WORD     // Catch:{ NoSuchFieldError -> 0x00dc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dc }
                    r2 = 22
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dc }
                L_0x00dc:
                    B0.s r1 = B0.C4374s.DELETE_NEXT_WORD     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                    r2 = 23
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
                L_0x00e6:
                    B0.s r1 = B0.C4374s.DELETE_FROM_LINE_START     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                    r2 = 24
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
                L_0x00f0:
                    B0.s r1 = B0.C4374s.DELETE_TO_LINE_END     // Catch:{ NoSuchFieldError -> 0x00fa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                    r2 = 25
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fa }
                L_0x00fa:
                    B0.s r1 = B0.C4374s.NEW_LINE     // Catch:{ NoSuchFieldError -> 0x0104 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                    r2 = 26
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0104 }
                L_0x0104:
                    B0.s r1 = B0.C4374s.TAB     // Catch:{ NoSuchFieldError -> 0x010e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010e }
                    r2 = 27
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010e }
                L_0x010e:
                    B0.s r1 = B0.C4374s.SELECT_ALL     // Catch:{ NoSuchFieldError -> 0x0118 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0118 }
                    r2 = 28
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0118 }
                L_0x0118:
                    B0.s r1 = B0.C4374s.SELECT_LEFT_CHAR     // Catch:{ NoSuchFieldError -> 0x0122 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0122 }
                    r2 = 29
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0122 }
                L_0x0122:
                    B0.s r1 = B0.C4374s.SELECT_RIGHT_CHAR     // Catch:{ NoSuchFieldError -> 0x012c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                    r2 = 30
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
                L_0x012c:
                    B0.s r1 = B0.C4374s.SELECT_LEFT_WORD     // Catch:{ NoSuchFieldError -> 0x0136 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0136 }
                    r2 = 31
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0136 }
                L_0x0136:
                    B0.s r1 = B0.C4374s.SELECT_RIGHT_WORD     // Catch:{ NoSuchFieldError -> 0x0140 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0140 }
                    r2 = 32
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0140 }
                L_0x0140:
                    B0.s r1 = B0.C4374s.SELECT_PREV_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x014a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x014a }
                    r2 = 33
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x014a }
                L_0x014a:
                    B0.s r1 = B0.C4374s.SELECT_NEXT_PARAGRAPH     // Catch:{ NoSuchFieldError -> 0x0154 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0154 }
                    r2 = 34
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0154 }
                L_0x0154:
                    B0.s r1 = B0.C4374s.SELECT_LINE_START     // Catch:{ NoSuchFieldError -> 0x015e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015e }
                    r2 = 35
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015e }
                L_0x015e:
                    B0.s r1 = B0.C4374s.SELECT_LINE_END     // Catch:{ NoSuchFieldError -> 0x0168 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                    r2 = 36
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
                L_0x0168:
                    B0.s r1 = B0.C4374s.SELECT_LINE_LEFT     // Catch:{ NoSuchFieldError -> 0x0172 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0172 }
                    r2 = 37
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0172 }
                L_0x0172:
                    B0.s r1 = B0.C4374s.SELECT_LINE_RIGHT     // Catch:{ NoSuchFieldError -> 0x017c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017c }
                    r2 = 38
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x017c }
                L_0x017c:
                    B0.s r1 = B0.C4374s.SELECT_UP     // Catch:{ NoSuchFieldError -> 0x0186 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0186 }
                    r2 = 39
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0186 }
                L_0x0186:
                    B0.s r1 = B0.C4374s.SELECT_DOWN     // Catch:{ NoSuchFieldError -> 0x0190 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0190 }
                    r2 = 40
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0190 }
                L_0x0190:
                    B0.s r1 = B0.C4374s.SELECT_PAGE_UP     // Catch:{ NoSuchFieldError -> 0x019a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019a }
                    r2 = 41
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019a }
                L_0x019a:
                    B0.s r1 = B0.C4374s.SELECT_PAGE_DOWN     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                    r2 = 42
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
                L_0x01a4:
                    B0.s r1 = B0.C4374s.SELECT_HOME     // Catch:{ NoSuchFieldError -> 0x01ae }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ae }
                    r2 = 43
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ae }
                L_0x01ae:
                    B0.s r1 = B0.C4374s.SELECT_END     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b8 }
                    r2 = 44
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b8 }
                L_0x01b8:
                    B0.s r1 = B0.C4374s.DESELECT     // Catch:{ NoSuchFieldError -> 0x01c2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c2 }
                    r2 = 45
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c2 }
                L_0x01c2:
                    B0.s r1 = B0.C4374s.UNDO     // Catch:{ NoSuchFieldError -> 0x01cc }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                    r2 = 46
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01cc }
                L_0x01cc:
                    B0.s r1 = B0.C4374s.REDO     // Catch:{ NoSuchFieldError -> 0x01d6 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d6 }
                    r2 = 47
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d6 }
                L_0x01d6:
                    B0.s r1 = B0.C4374s.CHARACTER_PALETTE     // Catch:{ NoSuchFieldError -> 0x01e0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                    r2 = 48
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
                L_0x01e0:
                    f4628a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: B0.U.b.i.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4374s sVar, U u10, K k10) {
            super(1);
            this.f4617c = sVar;
            this.f4618d = u10;
            this.f4619e = k10;
        }

        public final void a(H0.P p10) {
            P g10;
            P c10;
            switch (i.f4628a[this.f4617c.ordinal()]) {
                case 1:
                    this.f4618d.h().o(false);
                    return;
                case 2:
                    this.f4618d.h().T();
                    return;
                case 3:
                    this.f4618d.h().s();
                    return;
                case 4:
                    p10.b(a.f4620c);
                    return;
                case 5:
                    p10.c(C0006b.f4621c);
                    return;
                case 6:
                    p10.B();
                    return;
                case 7:
                    p10.J();
                    return;
                case 8:
                    p10.G();
                    return;
                case 9:
                    p10.D();
                    return;
                case 10:
                    p10.Q();
                    return;
                case 11:
                    p10.z();
                    return;
                case 12:
                    p10.c0();
                    return;
                case 13:
                    p10.b0();
                    return;
                case 14:
                    p10.P();
                    return;
                case 15:
                    p10.M();
                    return;
                case 16:
                    p10.N();
                    return;
                case 17:
                    p10.O();
                    return;
                case 18:
                    p10.L();
                    return;
                case 19:
                    p10.K();
                    return;
                case 20:
                    List<C4840i> Y10 = p10.Y(c.f4622c);
                    if (Y10 != null) {
                        this.f4618d.f(Y10);
                        return;
                    }
                    return;
                case 21:
                    List<C4840i> Y11 = p10.Y(d.f4623c);
                    if (Y11 != null) {
                        this.f4618d.f(Y11);
                        return;
                    }
                    return;
                case 22:
                    List<C4840i> Y12 = p10.Y(e.f4624c);
                    if (Y12 != null) {
                        this.f4618d.f(Y12);
                        return;
                    }
                    return;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    List<C4840i> Y13 = p10.Y(f.f4625c);
                    if (Y13 != null) {
                        this.f4618d.f(Y13);
                        return;
                    }
                    return;
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                    List<C4840i> Y14 = p10.Y(g.f4626c);
                    if (Y14 != null) {
                        this.f4618d.f(Y14);
                        return;
                    }
                    return;
                case 25:
                    List<C4840i> Y15 = p10.Y(h.f4627c);
                    if (Y15 != null) {
                        this.f4618d.f(Y15);
                        return;
                    }
                    return;
                case 26:
                    if (!this.f4618d.i()) {
                        this.f4618d.e(new C4832a("\n", 1));
                        return;
                    } else {
                        this.f4618d.j().l().invoke(r.j(this.f4618d.f4615l));
                        return;
                    }
                case 27:
                    if (!this.f4618d.i()) {
                        this.f4618d.e(new C4832a("\t", 1));
                        return;
                    } else {
                        this.f4619e.f144344a = false;
                        return;
                    }
                case 28:
                    p10.R();
                    return;
                case 29:
                    ((H0.P) p10.A()).S();
                    return;
                case 30:
                    ((H0.P) p10.I()).S();
                    return;
                case 31:
                    ((H0.P) p10.B()).S();
                    return;
                case 32:
                    ((H0.P) p10.J()).S();
                    return;
                case BuildConfig.TARGET_SDK_VERSION /*33*/:
                    ((H0.P) p10.G()).S();
                    return;
                case 34:
                    ((H0.P) p10.D()).S();
                    return;
                case ImageFormat.YUV_420_888 /*35*/:
                    ((H0.P) p10.P()).S();
                    return;
                case 36:
                    ((H0.P) p10.M()).S();
                    return;
                case 37:
                    ((H0.P) p10.N()).S();
                    return;
                case 38:
                    ((H0.P) p10.O()).S();
                    return;
                case 39:
                    ((H0.P) p10.Q()).S();
                    return;
                case 40:
                    ((H0.P) p10.z()).S();
                    return;
                case 41:
                    p10.c0().S();
                    return;
                case 42:
                    p10.b0().S();
                    return;
                case 43:
                    ((H0.P) p10.L()).S();
                    return;
                case 44:
                    ((H0.P) p10.K()).S();
                    return;
                case 45:
                    p10.d();
                    return;
                case 46:
                    o0 k10 = this.f4618d.k();
                    if (k10 != null) {
                        k10.b(p10.Z());
                    }
                    o0 k11 = this.f4618d.k();
                    if (k11 != null && (g10 = k11.g()) != null) {
                        this.f4618d.f4614k.invoke(g10);
                        return;
                    }
                    return;
                case 47:
                    o0 k12 = this.f4618d.k();
                    if (k12 != null && (c10 = k12.c()) != null) {
                        this.f4618d.f4614k.invoke(c10);
                        return;
                    }
                    return;
                case 48:
                    C4375t.b();
                    return;
                default:
                    return;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((H0.P) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ U(B b10, Q q10, P p10, boolean z10, boolean z11, H0.U u10, H h10, o0 o0Var, C4367k kVar, C4376u uVar, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, q10, p10, z10, z11, u10, h10, o0Var, kVar, uVar, lVar, i10);
    }

    /* access modifiers changed from: private */
    public final void e(C4840i iVar) {
        f(C16877v.e(iVar));
    }

    /* access modifiers changed from: private */
    public final void f(List<? extends C4840i> list) {
        C4842k n10 = this.f4604a.n();
        List w12 = C16877v.w1(list);
        w12.add(0, new C4845n());
        this.f4614k.invoke(n10.b(w12));
    }

    private final void g(C17642l<? super H0.P, C16807N> lVar) {
        H0.P p10 = new H0.P(this.f4606c, this.f4610g, this.f4604a.j(), this.f4609f);
        lVar.invoke(p10);
        if (!W.g(p10.u(), this.f4606c.h()) || !C17542s.e(p10.e(), this.f4606c.f())) {
            this.f4614k.invoke(p10.Z());
        }
    }

    private final C4832a m(KeyEvent keyEvent) {
        Integer a10;
        if (!W.a(keyEvent) || (a10 = this.f4612i.a(keyEvent)) == null) {
            return null;
        }
        return new C4832a(I.a(new StringBuilder(), a10.intValue()).toString(), 1);
    }

    public final Q h() {
        return this.f4605b;
    }

    public final boolean i() {
        return this.f4608e;
    }

    public final B j() {
        return this.f4604a;
    }

    public final o0 k() {
        return this.f4611h;
    }

    public final boolean l(KeyEvent keyEvent) {
        C4374s a10;
        C4832a m10 = m(keyEvent);
        if (m10 != null) {
            if (!this.f4607d) {
                return false;
            }
            e(m10);
            this.f4609f.b();
            return true;
        } else if (!C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a()) || (a10 = this.f4613j.a(keyEvent)) == null || (a10.b() && !this.f4607d)) {
            return false;
        } else {
            K k10 = new K();
            k10.f144344a = true;
            g(new b(a10, this, k10));
            o0 o0Var = this.f4611h;
            if (o0Var != null) {
                o0Var.a();
            }
            return k10.f144344a;
        }
    }

    private U(B b10, Q q10, P p10, boolean z10, boolean z11, H0.U u10, H h10, o0 o0Var, C4367k kVar, C4376u uVar, C17642l<? super P, C16807N> lVar, int i10) {
        this.f4604a = b10;
        this.f4605b = q10;
        this.f4606c = p10;
        this.f4607d = z10;
        this.f4608e = z11;
        this.f4609f = u10;
        this.f4610g = h10;
        this.f4611h = o0Var;
        this.f4612i = kVar;
        this.f4613j = uVar;
        this.f4614k = lVar;
        this.f4615l = i10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ U(B0.B r24, H0.Q r25, T1.P r26, boolean r27, boolean r28, H0.U r29, T1.H r30, B0.o0 r31, B0.C4367k r32, B0.C4376u r33, nI.C17642l r34, int r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r23 = this;
            r0 = r36
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            T1.P r1 = new T1.P
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (N1.W) r6, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r26
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = r1
            goto L_0x001f
        L_0x001d:
            r13 = r27
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r28
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            T1.H$a r1 = T1.H.f13514a
            T1.H r1 = r1.a()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r30
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r31
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            B0.u r1 = B0.C4378w.a()
            r19 = r1
            goto L_0x004e
        L_0x004c:
            r19 = r33
        L_0x004e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            B0.U$a r0 = B0.U.a.f4616c
            r20 = r0
            goto L_0x0059
        L_0x0057:
            r20 = r34
        L_0x0059:
            r22 = 0
            r9 = r23
            r10 = r24
            r11 = r25
            r15 = r29
            r18 = r32
            r21 = r35
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.U.<init>(B0.B, H0.Q, T1.P, boolean, boolean, H0.U, T1.H, B0.o0, B0.k, B0.u, nI.l, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
