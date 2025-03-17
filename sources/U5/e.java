package U5;

import E1.C4478k;
import QJ.F0;
import QJ.Q;
import SJ.C16428d;
import T5.n;
import T5.r;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4899r0;
import U0.T0;
import U0.o1;
import V5.g;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import android.os.Trace;
import dI.C17164e;
import dI.C17169j;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import k6.C8438e;
import k6.C8441h;
import k6.C8445l;
import k6.C8454u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.C8531c;
import l6.j;
import nI.C17642l;
import nI.p;
import o1.C5673m;
import o6.C8607a;
import p1.C5749w0;
import r1.f;
import t1.C5942c;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0003$~ B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0007*\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0016¢\u0006\u0004\b&\u0010\tJ\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tR/\u00101\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018B@BX\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106R(\u0010>\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u0001088\u0002@BX\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010F\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00188\u0002@BX\u000e¢\u0006\f\n\u0004\bC\u0010\u000e\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020G8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\b3\u0010LR.\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100N8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010N8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\"\u0010a\u001a\u00020Z8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010f\u001a\u00020b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0015\u001a\u0004\b[\u0010c\"\u0004\bd\u0010eR$\u0010m\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bh\u0010j\"\u0004\bk\u0010lR.\u0010r\u001a\u0004\u0018\u00010\u00032\b\u00109\u001a\u0004\u0018\u00010\u00038\u0000@@X\u000e¢\u0006\u0012\n\u0004\bJ\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010\u0006R\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00030s8\u0002X\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030w8\u0006¢\u0006\f\n\u0004\b\b\u0010x\u001a\u0004\by\u0010zR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00100s8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010uR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100w8\u0006¢\u0006\f\n\u0004\b)\u0010x\u001a\u0004\bt\u0010zR\u0014\u0010}\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010|¨\u0006"}, d2 = {"LU5/e;", "Lt1/c;", "LU0/T0;", "LU5/e$b;", "input", "<init>", "(LU5/e$b;)V", "LXH/N;", "v", "()V", "Lk6/h;", "request", "", "isPreview", "J", "(Lk6/h;Z)Lk6/h;", "LU5/e$c;", "state", "K", "(LU5/e$c;)V", "Lk6/l;", "I", "(Lk6/l;)LU5/e$c;", "LTJ/g;", "Lo1/m;", "w", "()LTJ/g;", "Lr1/f;", "j", "(Lr1/f;)V", "", "alpha", "a", "(F)Z", "Lp1/w0;", "colorFilter", "b", "(Lp1/w0;)Z", "w0", "o1", "c1", "x", "<set-?>", "g", "LU0/r0;", "r", "()Lt1/c;", "C", "(Lt1/c;)V", "painter", "h", "F", "i", "Lp1/w0;", "Z", "isRemembered", "LQJ/F0;", "value", "k", "LQJ/F0;", "E", "(LQJ/F0;)V", "rememberJob", "LTJ/A;", "l", "LTJ/A;", "drawSizeFlow", "m", "z", "(J)V", "drawSize", "LQJ/Q;", "n", "LQJ/Q;", "t", "()LQJ/Q;", "(LQJ/Q;)V", "scope", "Lkotlin/Function1;", "o", "LnI/l;", "getTransform$coil_compose_core_release", "()LnI/l;", "G", "(LnI/l;)V", "transform", "p", "getOnState$coil_compose_core_release", "B", "onState", "LE1/k;", "q", "LE1/k;", "getContentScale$coil_compose_core_release", "()LE1/k;", "y", "(LE1/k;)V", "contentScale", "Lp1/E0;", "()I", "A", "(I)V", "filterQuality", "LU5/h;", "s", "LU5/h;", "()LU5/h;", "D", "(LU5/h;)V", "previewHandler", "LU5/e$b;", "get_input$coil_compose_core_release", "()LU5/e$b;", "H", "_input", "LTJ/B;", "u", "LTJ/B;", "inputFlow", "LTJ/P;", "LTJ/P;", "getInput", "()LTJ/P;", "stateFlow", "()J", "intrinsicSize", "c", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends C5942c implements T0 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f40189y = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final C17642l<c, c> f40190z = new d();

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f40191g = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private float f40192h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    private C5749w0 f40193i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40194j;

    /* renamed from: k  reason: collision with root package name */
    private F0 f40195k;

    /* renamed from: l  reason: collision with root package name */
    private C16504A<C5673m> f40196l;

    /* renamed from: m  reason: collision with root package name */
    private long f40197m = C5673m.f26722b.a();

    /* renamed from: n  reason: collision with root package name */
    public Q f40198n;

    /* renamed from: o  reason: collision with root package name */
    private C17642l<? super c, ? extends c> f40199o = f40190z;

    /* renamed from: p  reason: collision with root package name */
    private C17642l<? super c, C16807N> f40200p;

    /* renamed from: q  reason: collision with root package name */
    private C4478k f40201q = C4478k.f5915a.e();

    /* renamed from: r  reason: collision with root package name */
    private int f40202r = f.f28623w0.b();

    /* renamed from: s  reason: collision with root package name */
    private h f40203s;

    /* renamed from: t  reason: collision with root package name */
    private b f40204t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<b> f40205u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<b> f40206v;

    /* renamed from: w  reason: collision with root package name */
    private final C16505B<c> f40207w;

    /* renamed from: x  reason: collision with root package name */
    private final C16519P<c> f40208x;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LU5/e$a;", "", "<init>", "()V", "Lkotlin/Function1;", "LU5/e$c;", "DefaultTransform", "LnI/l;", "a", "()LnI/l;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17642l<c, c> a() {
            return e.f40190z;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LU5/e$b;", "", "LT5/r;", "imageLoader", "Lk6/h;", "request", "LU5/c;", "modelEqualityDelegate", "<init>", "(LT5/r;Lk6/h;LU5/c;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LT5/r;", "()LT5/r;", "b", "Lk6/h;", "()Lk6/h;", "c", "LU5/c;", "getModelEqualityDelegate", "()LU5/c;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final r f40209a;

        /* renamed from: b  reason: collision with root package name */
        private final C8441h f40210b;

        /* renamed from: c  reason: collision with root package name */
        private final c f40211c;

        public b(r rVar, C8441h hVar, c cVar) {
            this.f40209a = rVar;
            this.f40210b = hVar;
            this.f40211c = cVar;
        }

        public final r a() {
            return this.f40209a;
        }

        public final C8441h b() {
            return this.f40210b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C17542s.e(this.f40209a, bVar.f40209a) && C17542s.e(this.f40211c, bVar.f40211c) && this.f40211c.c(this.f40210b, bVar.f40210b);
            }
        }

        public int hashCode() {
            return (((this.f40209a.hashCode() * 31) + this.f40211c.hashCode()) * 31) + this.f40211c.b(this.f40210b);
        }

        public String toString() {
            return "Input(imageLoader=" + this.f40209a + ", request=" + this.f40210b + ", modelEqualityDelegate=" + this.f40211c + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0004\t\n\u000b\fø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"LU5/e$c;", "", "Lt1/c;", "a", "()Lt1/c;", "painter", "c", "d", "b", "LU5/e$c$a;", "LU5/e$c$b;", "LU5/e$c$c;", "LU5/e$c$d;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LU5/e$c$a;", "LU5/e$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lt1/c;", "a", "()Lt1/c;", "painter", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f40212a = new a();

            private a() {
            }

            public C5942c a() {
                return null;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1625786264;
            }

            public String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LU5/e$c$b;", "LU5/e$c;", "Lt1/c;", "painter", "Lk6/e;", "result", "<init>", "(Lt1/c;Lk6/e;)V", "b", "(Lt1/c;Lk6/e;)LU5/e$c$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "()Lt1/c;", "Lk6/e;", "d", "()Lk6/e;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            private final C5942c f40213a;

            /* renamed from: b  reason: collision with root package name */
            private final C8438e f40214b;

            public b(C5942c cVar, C8438e eVar) {
                this.f40213a = cVar;
                this.f40214b = eVar;
            }

            public static /* synthetic */ b c(b bVar, C5942c cVar, C8438e eVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = bVar.f40213a;
                }
                if ((i10 & 2) != 0) {
                    eVar = bVar.f40214b;
                }
                return bVar.b(cVar, eVar);
            }

            public C5942c a() {
                return this.f40213a;
            }

            public final b b(C5942c cVar, C8438e eVar) {
                return new b(cVar, eVar);
            }

            public final C8438e d() {
                return this.f40214b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f40213a, bVar.f40213a) && C17542s.e(this.f40214b, bVar.f40214b);
            }

            public int hashCode() {
                C5942c cVar = this.f40213a;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f40214b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f40213a + ", result=" + this.f40214b + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LU5/e$c$c;", "LU5/e$c;", "Lt1/c;", "painter", "<init>", "(Lt1/c;)V", "b", "(Lt1/c;)LU5/e$c$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "()Lt1/c;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: U5.e$c$c  reason: collision with other inner class name */
        public static final class C0658c implements c {

            /* renamed from: a  reason: collision with root package name */
            private final C5942c f40215a;

            public C0658c(C5942c cVar) {
                this.f40215a = cVar;
            }

            public C5942c a() {
                return this.f40215a;
            }

            public final C0658c b(C5942c cVar) {
                return new C0658c(cVar);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0658c) && C17542s.e(this.f40215a, ((C0658c) obj).f40215a);
            }

            public int hashCode() {
                C5942c cVar = this.f40215a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f40215a + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LU5/e$c$d;", "LU5/e$c;", "Lt1/c;", "painter", "Lk6/u;", "result", "<init>", "(Lt1/c;Lk6/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "()Lt1/c;", "b", "Lk6/u;", "()Lk6/u;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements c {

            /* renamed from: a  reason: collision with root package name */
            private final C5942c f40216a;

            /* renamed from: b  reason: collision with root package name */
            private final C8454u f40217b;

            public d(C5942c cVar, C8454u uVar) {
                this.f40216a = cVar;
                this.f40217b = uVar;
            }

            public C5942c a() {
                return this.f40216a;
            }

            public final C8454u b() {
                return this.f40217b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f40216a, dVar.f40216a) && C17542s.e(this.f40217b, dVar.f40217b);
            }

            public int hashCode() {
                return (this.f40216a.hashCode() * 31) + this.f40217b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f40216a + ", result=" + this.f40217b + ')';
            }
        }

        C5942c a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {228, 232}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f40218c;

        /* renamed from: d  reason: collision with root package name */
        int f40219d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f40220e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f40221f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar, b bVar, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f40220e = eVar;
            this.f40221f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f40220e, this.f40221f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            c cVar;
            e eVar;
            Object f10 = C17187b.f();
            int i10 = this.f40219d;
            if (i10 == 0) {
                y.b(obj);
                h s10 = this.f40220e.s();
                if (s10 != null) {
                    C8441h o10 = this.f40220e.J(this.f40221f.b(), true);
                    r a10 = this.f40221f.a();
                    this.f40219d = 1;
                    obj = s10.a(a10, o10, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    C8441h o11 = this.f40220e.J(this.f40221f.b(), false);
                    e eVar2 = this.f40220e;
                    r a11 = this.f40221f.a();
                    this.f40218c = eVar2;
                    this.f40219d = 2;
                    obj = a11.d(o11, this);
                    if (obj == f10) {
                        return f10;
                    }
                    eVar = eVar2;
                    cVar = eVar.I((C8445l) obj);
                    this.f40220e.K(cVar);
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                eVar = (e) this.f40218c;
                y.b(obj);
                cVar = eVar.I((C8445l) obj);
                this.f40220e.K(cVar);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (c) obj;
            this.f40220e.K(cVar);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"U5/e$e", "Lo6/a;", "LT5/n;", "placeholder", "LXH/N;", "b", "(LT5/n;)V", "error", "e", "result", "d", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: U5.e$e  reason: collision with other inner class name */
    public static final class C0659e implements C8607a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8441h f40222a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f40223b;

        public C0659e(C8441h hVar, e eVar) {
            this.f40222a = hVar;
            this.f40223b = eVar;
        }

        public void b(n nVar) {
            this.f40223b.K(new c.C0658c(nVar != null ? n.a(nVar, this.f40222a.c(), this.f40223b.q()) : null));
        }

        public void d(n nVar) {
        }

        public void e(n nVar) {
        }
    }

    public e(b bVar) {
        this.f40204t = bVar;
        C16505B<b> a10 = C16521S.a(bVar);
        this.f40205u = a10;
        this.f40206v = C16534i.c(a10);
        C16505B<c> a11 = C16521S.a(c.a.f40212a);
        this.f40207w = a11;
        this.f40208x = C16534i.c(a11);
    }

    private final void C(C5942c cVar) {
        this.f40191g.setValue(cVar);
    }

    private final void E(F0 f02) {
        F0 f03 = this.f40195k;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        this.f40195k = f02;
    }

    /* access modifiers changed from: private */
    public final c I(C8445l lVar) {
        if (lVar instanceof C8454u) {
            C8454u uVar = (C8454u) lVar;
            return new c.d(n.a(uVar.k(), uVar.b().c(), this.f40202r), uVar);
        } else if (lVar instanceof C8438e) {
            C8438e eVar = (C8438e) lVar;
            n k10 = eVar.k();
            return new c.b(k10 != null ? n.a(k10, eVar.b().c(), this.f40202r) : null, eVar);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final C8441h J(C8441h hVar, boolean z10) {
        j x10 = hVar.x();
        if (x10 instanceof l) {
            ((l) x10).j(w());
        }
        C8441h.a r10 = C8441h.A(hVar, (Context) null, 1, (Object) null).r(new C0659e(hVar, this));
        if (hVar.h().m() == null) {
            r10.q(j.f54775c);
        }
        if (hVar.h().l() == null) {
            r10.o(V5.l.p(this.f40201q));
        }
        if (hVar.h().k() == null) {
            r10.n(C8531c.INEXACT);
        }
        if (z10) {
            r10.d(C17169j.f142968a);
        }
        return r10.c();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [t1.c] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(U5.e.c r4) {
        /*
            r3 = this;
            TJ.B<U5.e$c> r0 = r3.f40207w
            java.lang.Object r0 = r0.getValue()
            U5.e$c r0 = (U5.e.c) r0
            nI.l<? super U5.e$c, ? extends U5.e$c> r1 = r3.f40199o
            java.lang.Object r4 = r1.invoke(r4)
            U5.e$c r4 = (U5.e.c) r4
            TJ.B<U5.e$c> r1 = r3.f40207w
            r1.setValue(r4)
            E1.k r1 = r3.f40201q
            U5.k r1 = U5.g.a(r0, r4, r1)
            if (r1 == 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            t1.c r1 = r4.a()
        L_0x0022:
            r3.C(r1)
            t1.c r1 = r0.a()
            t1.c r2 = r4.a()
            if (r1 == r2) goto L_0x0051
            t1.c r0 = r0.a()
            boolean r1 = r0 instanceof U0.T0
            r2 = 0
            if (r1 == 0) goto L_0x003b
            U0.T0 r0 = (U0.T0) r0
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.o1()
        L_0x0041:
            t1.c r0 = r4.a()
            boolean r1 = r0 instanceof U0.T0
            if (r1 == 0) goto L_0x004c
            r2 = r0
            U0.T0 r2 = (U0.T0) r2
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.w0()
        L_0x0051:
            nI.l<? super U5.e$c, XH.N> r0 = r3.f40200p
            if (r0 == 0) goto L_0x0058
            r0.invoke(r4)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.e.K(U5.e$c):void");
    }

    /* access modifiers changed from: private */
    public static final c l(c cVar) {
        return cVar;
    }

    private final C5942c r() {
        return (C5942c) this.f40191g.getValue();
    }

    private final void v() {
        b bVar = this.f40204t;
        if (bVar != null) {
            E(g.a(t(), new d(this, bVar, (C17164e<? super d>) null)));
        }
    }

    private final C16532g<C5673m> w() {
        C16504A<C5673m> a10 = this.f40196l;
        if (a10 == null) {
            a10 = C16511H.b(1, 0, C16428d.DROP_OLDEST, 2, (Object) null);
            long j10 = this.f40197m;
            if (j10 != 9205357640488583168L) {
                a10.a(C5673m.c(j10));
            }
            this.f40196l = a10;
        }
        return a10;
    }

    private final void z(long j10) {
        if (!C5673m.h(this.f40197m, j10)) {
            this.f40197m = j10;
            C16504A<C5673m> a10 = this.f40196l;
            if (a10 != null) {
                a10.a(C5673m.c(j10));
            }
        }
    }

    public final void A(int i10) {
        this.f40202r = i10;
    }

    public final void B(C17642l<? super c, C16807N> lVar) {
        this.f40200p = lVar;
    }

    public final void D(h hVar) {
        this.f40203s = hVar;
    }

    public final void F(Q q10) {
        this.f40198n = q10;
    }

    public final void G(C17642l<? super c, ? extends c> lVar) {
        this.f40199o = lVar;
    }

    public final void H(b bVar) {
        if (!C17542s.e(this.f40204t, bVar)) {
            this.f40204t = bVar;
            x();
            if (bVar != null) {
                this.f40205u.setValue(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        this.f40192h = f10;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean b(C5749w0 w0Var) {
        this.f40193i = w0Var;
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [t1.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c1() {
        /*
            r3 = this;
            r0 = 0
            r3.E(r0)
            t1.c r1 = r3.r()
            boolean r2 = r1 instanceof U0.T0
            if (r2 == 0) goto L_0x000f
            r0 = r1
            U0.T0 r0 = (U0.T0) r0
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            r0.c1()
        L_0x0014:
            r0 = 0
            r3.f40194j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.e.c1():void");
    }

    public long h() {
        C5942c r10 = r();
        return r10 != null ? r10.h() : C5673m.f26722b.a();
    }

    /* access modifiers changed from: protected */
    public void j(f fVar) {
        z(fVar.b());
        C5942c r10 = r();
        if (r10 != null) {
            r10.g(fVar, fVar.b(), this.f40192h, this.f40193i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [t1.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o1() {
        /*
            r3 = this;
            r0 = 0
            r3.E(r0)
            t1.c r1 = r3.r()
            boolean r2 = r1 instanceof U0.T0
            if (r2 == 0) goto L_0x000f
            r0 = r1
            U0.T0 r0 = (U0.T0) r0
        L_0x000f:
            if (r0 == 0) goto L_0x0014
            r0.o1()
        L_0x0014:
            r0 = 0
            r3.f40194j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.e.o1():void");
    }

    public final int q() {
        return this.f40202r;
    }

    public final h s() {
        return this.f40203s;
    }

    public final Q t() {
        Q q10 = this.f40198n;
        if (q10 != null) {
            return q10;
        }
        C17542s.z("scope");
        return null;
    }

    public final C16519P<c> u() {
        return this.f40208x;
    }

    public void w0() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            C5942c r10 = r();
            T0 t02 = r10 instanceof T0 ? (T0) r10 : null;
            if (t02 != null) {
                t02.w0();
            }
            v();
            this.f40194j = true;
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void x() {
        if (this.f40204t == null) {
            E((F0) null);
        } else if (this.f40194j) {
            v();
        }
    }

    public final void y(C4478k kVar) {
        this.f40201q = kVar;
    }
}
