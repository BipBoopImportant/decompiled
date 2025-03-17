package androidx.compose.ui.focus;

import G1.C4502e0;
import G1.C4507j;
import XH.C16807N;
import android.view.KeyEvent;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.m;
import c2.t;
import j0.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import n1.C5623c;
import n1.C5625e;
import n1.C5629i;
import n1.C5630j;
import n1.C5635o;
import n1.C5636p;
import n1.C5640t;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5669i;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J2\u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J:\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J(\u00102\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u0010\u001bJ\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00042\u0006\u00109\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bB\u0010CR*\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010FR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\"\u0010M\u001a\u00020-8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010;R\u0014\u0010P\u001a\u00020N8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010OR\u001a\u0010T\u001a\u00020Q8\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010R\u001a\u0004\bG\u0010SR\u001a\u0010Y\u001a\u00020U8\u0016X\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bV\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Ln1/i;", "Lkotlin/Function1;", "Lkotlin/Function0;", "LXH/N;", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/d;", "Lo1/i;", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Lc2/t;", "onLayoutDirection", "<init>", "(LnI/l;LnI/p;LnI/l;LnI/a;LnI/a;LnI/a;)V", "u", "()V", "LG1/j;", "Landroidx/compose/ui/d$c;", "v", "(LG1/j;)Landroidx/compose/ui/d$c;", "Ly1/b;", "keyEvent", "x", "(Landroid/view/KeyEvent;)Z", "focusDirection", "previouslyFocusedRect", "f", "(Landroidx/compose/ui/focus/d;Lo1/i;)Z", "w", "(ILo1/i;)Z", "p", "force", "r", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "j", "(ZZZI)Z", "d", "(I)Z", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "k", "(ILo1/i;LnI/l;)Ljava/lang/Boolean;", "onFocusedItem", "n", "(Landroid/view/KeyEvent;LnI/a;)Z", "e", "LC1/b;", "event", "b", "(LC1/b;)Z", "node", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Ln1/c;", "g", "(Ln1/c;)V", "Ln1/j;", "m", "(Ln1/j;)V", "o", "()Lo1/i;", "a", "LnI/p;", "LnI/l;", "c", "LnI/a;", "Landroidx/compose/ui/focus/FocusTargetNode;", "t", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Ln1/e;", "Ln1/e;", "focusInvalidationManager", "Ln1/t;", "Ln1/t;", "()Ln1/t;", "focusTransactionManager", "Landroidx/compose/ui/d;", "i", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "Lj0/I;", "Lj0/I;", "keysCurrentlyDown", "Ln1/o;", "l", "()Ln1/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOwnerImpl implements C5629i {

    /* renamed from: a  reason: collision with root package name */
    private final p<d, C5669i, Boolean> f18800a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<d, Boolean> f18801b;

    /* renamed from: c  reason: collision with root package name */
    private final C17631a<C16807N> f18802c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C5669i> f18803d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<t> f18804e;

    /* renamed from: f  reason: collision with root package name */
    private FocusTargetNode f18805f = new FocusTargetNode();

    /* renamed from: g  reason: collision with root package name */
    private final C5625e f18806g;

    /* renamed from: h  reason: collision with root package name */
    private final C5640t f18807h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.compose.ui.d f18808i;

    /* renamed from: j  reason: collision with root package name */
    private I f18809j;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18810a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                n1.a[] r0 = n1.C5621a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n1.a r1 = n1.C5621a.Redirected     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n1.a r1 = n1.C5621a.Cancelled     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                n1.a r1 = n1.C5621a.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                n1.a r1 = n1.C5621a.None     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f18810a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f18811c = new b();

        b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((FocusOwnerImpl) this.receiver).u();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18812c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f18813d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<FocusTargetNode, Boolean> f18814e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, C17642l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f18812c = focusTargetNode;
            this.f18813d = focusOwnerImpl;
            this.f18814e = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z10;
            if (C17542s.e(focusTargetNode, this.f18812c)) {
                z10 = false;
            } else if (!C17542s.e(focusTargetNode, this.f18813d.t())) {
                z10 = this.f18814e.invoke(focusTargetNode).booleanValue();
            } else {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/i;", "LXH/N;", "a", "(Landroidx/compose/ui/focus/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<i, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f18815c = new e();

        e() {
            super(1);
        }

        public final void a(i iVar) {
            iVar.w(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<Boolean> f18816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(O<Boolean> o10, int i10) {
            super(1);
            this.f18816c = o10;
            this.f18817d = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f18816c.f144348a = q.k(focusTargetNode, this.f18817d);
            Boolean bool = (Boolean) this.f18816c.f144348a;
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18818c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(int i10) {
            super(1);
            this.f18818c = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean k10 = q.k(focusTargetNode, this.f18818c);
            return Boolean.valueOf(k10 != null ? k10.booleanValue() : false);
        }
    }

    public FocusOwnerImpl(C17642l<? super C17631a<C16807N>, C16807N> lVar, p<? super d, ? super C5669i, Boolean> pVar, C17642l<? super d, Boolean> lVar2, C17631a<C16807N> aVar, C17631a<C5669i> aVar2, C17631a<? extends t> aVar3) {
        this.f18800a = pVar;
        this.f18801b = lVar2;
        this.f18802c = aVar;
        this.f18803d = aVar2;
        this.f18804e = aVar3;
        this.f18806g = new C5625e(lVar, new c(this));
        this.f18807h = new C5640t();
        this.f18808i = k.a(androidx.compose.ui.d.f18749a, e.f18815c).s(new FocusOwnerImpl$modifier$2(this));
    }

    /* access modifiers changed from: private */
    public final void u() {
        if (this.f18805f.J2() == C5636p.Inactive) {
            this.f18802c.invoke();
        }
    }

    private final d.c v(C4507j jVar) {
        int a10 = C4502e0.a(1024) | C4502e0.a(8192);
        if (!jVar.E0().j2()) {
            D1.a.b("visitLocalDescendants called on an unattached node");
        }
        d.c E02 = jVar.E0();
        d.c cVar = null;
        if ((E02.Z1() & a10) != 0) {
            for (d.c a22 = E02.a2(); a22 != null; a22 = a22.a2()) {
                if ((a22.e2() & a10) != 0) {
                    if ((C4502e0.a(1024) & a22.e2()) != 0) {
                        return cVar;
                    }
                    cVar = a22;
                }
            }
        }
        return cVar;
    }

    private final boolean x(KeyEvent keyEvent) {
        long a10 = C6256d.a(keyEvent);
        int b10 = C6256d.b(keyEvent);
        C6255c.a aVar = C6255c.f32260a;
        if (C6255c.e(b10, aVar.a())) {
            I i10 = this.f18809j;
            if (i10 == null) {
                i10 = new I(3);
                this.f18809j = i10;
            }
            i10.l(a10);
        } else if (C6255c.e(b10, aVar.b())) {
            I i11 = this.f18809j;
            if (i11 == null || !i11.a(a10)) {
                return false;
            }
            I i12 = this.f18809j;
            if (i12 != null) {
                i12.m(a10);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        r8 = r0.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(C1.b r15) {
        /*
            r14 = this;
            n1.e r0 = r14.f18806g
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0243
            androidx.compose.ui.focus.FocusTargetNode r0 = r14.f18805f
            androidx.compose.ui.focus.FocusTargetNode r0 = androidx.compose.ui.focus.r.b(r0)
            java.lang.String r1 = "visitAncestors called on an unattached node"
            r2 = 16384(0x4000, float:2.2959E-41)
            r3 = 16
            r4 = 0
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00b5
            int r7 = G1.C4502e0.a(r2)
            androidx.compose.ui.d$c r8 = r0.E0()
            boolean r8 = r8.j2()
            if (r8 == 0) goto L_0x00af
            androidx.compose.ui.d$c r8 = r0.E0()
            G1.G r0 = G1.C4508k.m(r0)
        L_0x002f:
            if (r0 == 0) goto L_0x00ab
            G1.a0 r9 = r0.m0()
            androidx.compose.ui.d$c r9 = r9.k()
            int r9 = r9.Z1()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0098
        L_0x0040:
            if (r8 == 0) goto L_0x0098
            int r9 = r8.e2()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x0093
            r10 = r5
            r9 = r8
        L_0x004b:
            if (r9 == 0) goto L_0x0093
            boolean r11 = r9 instanceof C1.a
            if (r11 == 0) goto L_0x0052
            goto L_0x00ac
        L_0x0052:
            int r11 = r9.e2()
            r11 = r11 & r7
            if (r11 == 0) goto L_0x008e
            boolean r11 = r9 instanceof G1.C4510m
            if (r11 == 0) goto L_0x008e
            r11 = r9
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r4
        L_0x0065:
            if (r11 == 0) goto L_0x008b
            int r13 = r11.e2()
            r13 = r13 & r7
            if (r13 == 0) goto L_0x0086
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x0074
            r9 = r11
            goto L_0x0086
        L_0x0074:
            if (r10 != 0) goto L_0x007d
            W0.b r10 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r3]
            r10.<init>(r13, r4)
        L_0x007d:
            if (r9 == 0) goto L_0x0083
            r10.b(r9)
            r9 = r5
        L_0x0083:
            r10.b(r11)
        L_0x0086:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x0065
        L_0x008b:
            if (r12 != r6) goto L_0x008e
            goto L_0x004b
        L_0x008e:
            androidx.compose.ui.d$c r9 = G1.C4508k.g(r10)
            goto L_0x004b
        L_0x0093:
            androidx.compose.ui.d$c r8 = r8.g2()
            goto L_0x0040
        L_0x0098:
            G1.G r0 = r0.q0()
            if (r0 == 0) goto L_0x00a9
            G1.a0 r8 = r0.m0()
            if (r8 == 0) goto L_0x00a9
            androidx.compose.ui.d$c r8 = r8.p()
            goto L_0x002f
        L_0x00a9:
            r8 = r5
            goto L_0x002f
        L_0x00ab:
            r9 = r5
        L_0x00ac:
            C1.a r9 = (C1.a) r9
            goto L_0x00b6
        L_0x00af:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r1)
            throw r15
        L_0x00b5:
            r9 = r5
        L_0x00b6:
            if (r9 == 0) goto L_0x0242
            int r0 = G1.C4502e0.a(r2)
            androidx.compose.ui.d$c r2 = r9.E0()
            boolean r2 = r2.j2()
            if (r2 == 0) goto L_0x023c
            androidx.compose.ui.d$c r1 = r9.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r2 = G1.C4508k.m(r9)
            r7 = r5
        L_0x00d3:
            if (r2 == 0) goto L_0x015b
            G1.a0 r8 = r2.m0()
            androidx.compose.ui.d$c r8 = r8.k()
            int r8 = r8.Z1()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0146
        L_0x00e4:
            if (r1 == 0) goto L_0x0146
            int r8 = r1.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0141
            r8 = r1
            r10 = r5
        L_0x00ef:
            if (r8 == 0) goto L_0x0141
            boolean r11 = r8 instanceof C1.a
            if (r11 == 0) goto L_0x0100
            if (r7 != 0) goto L_0x00fc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00fc:
            r7.add(r8)
            goto L_0x013c
        L_0x0100:
            int r11 = r8.e2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x013c
            boolean r11 = r8 instanceof G1.C4510m
            if (r11 == 0) goto L_0x013c
            r11 = r8
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r4
        L_0x0113:
            if (r11 == 0) goto L_0x0139
            int r13 = r11.e2()
            r13 = r13 & r0
            if (r13 == 0) goto L_0x0134
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x0122
            r8 = r11
            goto L_0x0134
        L_0x0122:
            if (r10 != 0) goto L_0x012b
            W0.b r10 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r3]
            r10.<init>(r13, r4)
        L_0x012b:
            if (r8 == 0) goto L_0x0131
            r10.b(r8)
            r8 = r5
        L_0x0131:
            r10.b(r11)
        L_0x0134:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x0113
        L_0x0139:
            if (r12 != r6) goto L_0x013c
            goto L_0x00ef
        L_0x013c:
            androidx.compose.ui.d$c r8 = G1.C4508k.g(r10)
            goto L_0x00ef
        L_0x0141:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x00e4
        L_0x0146:
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x0158
            G1.a0 r1 = r2.m0()
            if (r1 == 0) goto L_0x0158
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x00d3
        L_0x0158:
            r1 = r5
            goto L_0x00d3
        L_0x015b:
            if (r7 == 0) goto L_0x0179
            int r1 = r7.size()
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0179
        L_0x0165:
            int r2 = r1 + -1
            java.lang.Object r1 = r7.get(r1)
            C1.a r1 = (C1.a) r1
            boolean r1 = r1.X0(r15)
            if (r1 == 0) goto L_0x0174
            return r6
        L_0x0174:
            if (r2 >= 0) goto L_0x0177
            goto L_0x0179
        L_0x0177:
            r1 = r2
            goto L_0x0165
        L_0x0179:
            androidx.compose.ui.d$c r1 = r9.E0()
            r2 = r5
        L_0x017e:
            if (r1 == 0) goto L_0x01ce
            boolean r8 = r1 instanceof C1.a
            if (r8 == 0) goto L_0x018d
            C1.a r1 = (C1.a) r1
            boolean r1 = r1.X0(r15)
            if (r1 == 0) goto L_0x01c9
            return r6
        L_0x018d:
            int r8 = r1.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x01c9
            boolean r8 = r1 instanceof G1.C4510m
            if (r8 == 0) goto L_0x01c9
            r8 = r1
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r10 = r4
        L_0x01a0:
            if (r8 == 0) goto L_0x01c6
            int r11 = r8.e2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x01c1
            int r10 = r10 + 1
            if (r10 != r6) goto L_0x01af
            r1 = r8
            goto L_0x01c1
        L_0x01af:
            if (r2 != 0) goto L_0x01b8
            W0.b r2 = new W0.b
            androidx.compose.ui.d$c[] r11 = new androidx.compose.ui.d.c[r3]
            r2.<init>(r11, r4)
        L_0x01b8:
            if (r1 == 0) goto L_0x01be
            r2.b(r1)
            r1 = r5
        L_0x01be:
            r2.b(r8)
        L_0x01c1:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x01a0
        L_0x01c6:
            if (r10 != r6) goto L_0x01c9
            goto L_0x017e
        L_0x01c9:
            androidx.compose.ui.d$c r1 = G1.C4508k.g(r2)
            goto L_0x017e
        L_0x01ce:
            androidx.compose.ui.d$c r1 = r9.E0()
            r2 = r5
        L_0x01d3:
            if (r1 == 0) goto L_0x0223
            boolean r8 = r1 instanceof C1.a
            if (r8 == 0) goto L_0x01e2
            C1.a r1 = (C1.a) r1
            boolean r1 = r1.d0(r15)
            if (r1 == 0) goto L_0x021e
            return r6
        L_0x01e2:
            int r8 = r1.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x021e
            boolean r8 = r1 instanceof G1.C4510m
            if (r8 == 0) goto L_0x021e
            r8 = r1
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r9 = r4
        L_0x01f5:
            if (r8 == 0) goto L_0x021b
            int r10 = r8.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0216
            int r9 = r9 + 1
            if (r9 != r6) goto L_0x0204
            r1 = r8
            goto L_0x0216
        L_0x0204:
            if (r2 != 0) goto L_0x020d
            W0.b r2 = new W0.b
            androidx.compose.ui.d$c[] r10 = new androidx.compose.ui.d.c[r3]
            r2.<init>(r10, r4)
        L_0x020d:
            if (r1 == 0) goto L_0x0213
            r2.b(r1)
            r1 = r5
        L_0x0213:
            r2.b(r8)
        L_0x0216:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x01f5
        L_0x021b:
            if (r9 != r6) goto L_0x021e
            goto L_0x01d3
        L_0x021e:
            androidx.compose.ui.d$c r1 = G1.C4508k.g(r2)
            goto L_0x01d3
        L_0x0223:
            if (r7 == 0) goto L_0x0242
            int r0 = r7.size()
            r1 = r4
        L_0x022a:
            if (r1 >= r0) goto L_0x0242
            java.lang.Object r2 = r7.get(r1)
            C1.a r2 = (C1.a) r2
            boolean r2 = r2.d0(r15)
            if (r2 == 0) goto L_0x0239
            return r6
        L_0x0239:
            int r1 = r1 + 1
            goto L_0x022a
        L_0x023c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r1)
            throw r15
        L_0x0242:
            return r4
        L_0x0243:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Dispatching rotary event while focus system is invalidated."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.b(C1.b):boolean");
    }

    public C5640t c() {
        return this.f18807h;
    }

    public boolean d(int i10) {
        O o10 = new O();
        o10.f144348a = Boolean.FALSE;
        Boolean k10 = k(i10, this.f18803d.invoke(), new f(o10, i10));
        if (k10 == null || o10.f144348a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (!C17542s.e(k10, bool) || !C17542s.e(o10.f144348a, bool)) {
            return h.a(i10) ? j(false, true, false, i10) && w(i10, (C5669i) null) : this.f18801b.invoke(d.i(i10)).booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        r8 = r0.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.KeyEvent r15) {
        /*
            r14 = this;
            n1.e r0 = r14.f18806g
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r15 = "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r15)
            return r1
        L_0x0011:
            androidx.compose.ui.focus.FocusTargetNode r0 = r14.f18805f
            androidx.compose.ui.focus.FocusTargetNode r0 = androidx.compose.ui.focus.r.b(r0)
            java.lang.String r2 = "visitAncestors called on an unattached node"
            r3 = 131072(0x20000, float:1.83671E-40)
            r4 = 16
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00bd
            int r7 = G1.C4502e0.a(r3)
            androidx.compose.ui.d$c r8 = r0.E0()
            boolean r8 = r8.j2()
            if (r8 == 0) goto L_0x00b7
            androidx.compose.ui.d$c r8 = r0.E0()
            G1.G r0 = G1.C4508k.m(r0)
        L_0x0037:
            if (r0 == 0) goto L_0x00b3
            G1.a0 r9 = r0.m0()
            androidx.compose.ui.d$c r9 = r9.k()
            int r9 = r9.Z1()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x00a0
        L_0x0048:
            if (r8 == 0) goto L_0x00a0
            int r9 = r8.e2()
            r9 = r9 & r7
            if (r9 == 0) goto L_0x009b
            r10 = r5
            r9 = r8
        L_0x0053:
            if (r9 == 0) goto L_0x009b
            boolean r11 = r9 instanceof y1.C6259g
            if (r11 == 0) goto L_0x005a
            goto L_0x00b4
        L_0x005a:
            int r11 = r9.e2()
            r11 = r11 & r7
            if (r11 == 0) goto L_0x0096
            boolean r11 = r9 instanceof G1.C4510m
            if (r11 == 0) goto L_0x0096
            r11 = r9
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r1
        L_0x006d:
            if (r11 == 0) goto L_0x0093
            int r13 = r11.e2()
            r13 = r13 & r7
            if (r13 == 0) goto L_0x008e
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x007c
            r9 = r11
            goto L_0x008e
        L_0x007c:
            if (r10 != 0) goto L_0x0085
            W0.b r10 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r4]
            r10.<init>(r13, r1)
        L_0x0085:
            if (r9 == 0) goto L_0x008b
            r10.b(r9)
            r9 = r5
        L_0x008b:
            r10.b(r11)
        L_0x008e:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x006d
        L_0x0093:
            if (r12 != r6) goto L_0x0096
            goto L_0x0053
        L_0x0096:
            androidx.compose.ui.d$c r9 = G1.C4508k.g(r10)
            goto L_0x0053
        L_0x009b:
            androidx.compose.ui.d$c r8 = r8.g2()
            goto L_0x0048
        L_0x00a0:
            G1.G r0 = r0.q0()
            if (r0 == 0) goto L_0x00b1
            G1.a0 r8 = r0.m0()
            if (r8 == 0) goto L_0x00b1
            androidx.compose.ui.d$c r8 = r8.p()
            goto L_0x0037
        L_0x00b1:
            r8 = r5
            goto L_0x0037
        L_0x00b3:
            r9 = r5
        L_0x00b4:
            y1.g r9 = (y1.C6259g) r9
            goto L_0x00be
        L_0x00b7:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r2)
            throw r15
        L_0x00bd:
            r9 = r5
        L_0x00be:
            if (r9 == 0) goto L_0x024a
            int r0 = G1.C4502e0.a(r3)
            androidx.compose.ui.d$c r3 = r9.E0()
            boolean r3 = r3.j2()
            if (r3 == 0) goto L_0x0244
            androidx.compose.ui.d$c r2 = r9.E0()
            androidx.compose.ui.d$c r2 = r2.g2()
            G1.G r3 = G1.C4508k.m(r9)
            r7 = r5
        L_0x00db:
            if (r3 == 0) goto L_0x0163
            G1.a0 r8 = r3.m0()
            androidx.compose.ui.d$c r8 = r8.k()
            int r8 = r8.Z1()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x014e
        L_0x00ec:
            if (r2 == 0) goto L_0x014e
            int r8 = r2.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0149
            r8 = r2
            r10 = r5
        L_0x00f7:
            if (r8 == 0) goto L_0x0149
            boolean r11 = r8 instanceof y1.C6259g
            if (r11 == 0) goto L_0x0108
            if (r7 != 0) goto L_0x0104
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0104:
            r7.add(r8)
            goto L_0x0144
        L_0x0108:
            int r11 = r8.e2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0144
            boolean r11 = r8 instanceof G1.C4510m
            if (r11 == 0) goto L_0x0144
            r11 = r8
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r1
        L_0x011b:
            if (r11 == 0) goto L_0x0141
            int r13 = r11.e2()
            r13 = r13 & r0
            if (r13 == 0) goto L_0x013c
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x012a
            r8 = r11
            goto L_0x013c
        L_0x012a:
            if (r10 != 0) goto L_0x0133
            W0.b r10 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r4]
            r10.<init>(r13, r1)
        L_0x0133:
            if (r8 == 0) goto L_0x0139
            r10.b(r8)
            r8 = r5
        L_0x0139:
            r10.b(r11)
        L_0x013c:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x011b
        L_0x0141:
            if (r12 != r6) goto L_0x0144
            goto L_0x00f7
        L_0x0144:
            androidx.compose.ui.d$c r8 = G1.C4508k.g(r10)
            goto L_0x00f7
        L_0x0149:
            androidx.compose.ui.d$c r2 = r2.g2()
            goto L_0x00ec
        L_0x014e:
            G1.G r3 = r3.q0()
            if (r3 == 0) goto L_0x0160
            G1.a0 r2 = r3.m0()
            if (r2 == 0) goto L_0x0160
            androidx.compose.ui.d$c r2 = r2.p()
            goto L_0x00db
        L_0x0160:
            r2 = r5
            goto L_0x00db
        L_0x0163:
            if (r7 == 0) goto L_0x0181
            int r2 = r7.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0181
        L_0x016d:
            int r3 = r2 + -1
            java.lang.Object r2 = r7.get(r2)
            y1.g r2 = (y1.C6259g) r2
            boolean r2 = r2.V(r15)
            if (r2 == 0) goto L_0x017c
            return r6
        L_0x017c:
            if (r3 >= 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r2 = r3
            goto L_0x016d
        L_0x0181:
            androidx.compose.ui.d$c r2 = r9.E0()
            r3 = r5
        L_0x0186:
            if (r2 == 0) goto L_0x01d6
            boolean r8 = r2 instanceof y1.C6259g
            if (r8 == 0) goto L_0x0195
            y1.g r2 = (y1.C6259g) r2
            boolean r2 = r2.V(r15)
            if (r2 == 0) goto L_0x01d1
            return r6
        L_0x0195:
            int r8 = r2.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x01d1
            boolean r8 = r2 instanceof G1.C4510m
            if (r8 == 0) goto L_0x01d1
            r8 = r2
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r10 = r1
        L_0x01a8:
            if (r8 == 0) goto L_0x01ce
            int r11 = r8.e2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x01c9
            int r10 = r10 + 1
            if (r10 != r6) goto L_0x01b7
            r2 = r8
            goto L_0x01c9
        L_0x01b7:
            if (r3 != 0) goto L_0x01c0
            W0.b r3 = new W0.b
            androidx.compose.ui.d$c[] r11 = new androidx.compose.ui.d.c[r4]
            r3.<init>(r11, r1)
        L_0x01c0:
            if (r2 == 0) goto L_0x01c6
            r3.b(r2)
            r2 = r5
        L_0x01c6:
            r3.b(r8)
        L_0x01c9:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x01a8
        L_0x01ce:
            if (r10 != r6) goto L_0x01d1
            goto L_0x0186
        L_0x01d1:
            androidx.compose.ui.d$c r2 = G1.C4508k.g(r3)
            goto L_0x0186
        L_0x01d6:
            androidx.compose.ui.d$c r2 = r9.E0()
            r3 = r5
        L_0x01db:
            if (r2 == 0) goto L_0x022b
            boolean r8 = r2 instanceof y1.C6259g
            if (r8 == 0) goto L_0x01ea
            y1.g r2 = (y1.C6259g) r2
            boolean r2 = r2.C0(r15)
            if (r2 == 0) goto L_0x0226
            return r6
        L_0x01ea:
            int r8 = r2.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0226
            boolean r8 = r2 instanceof G1.C4510m
            if (r8 == 0) goto L_0x0226
            r8 = r2
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r9 = r1
        L_0x01fd:
            if (r8 == 0) goto L_0x0223
            int r10 = r8.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x021e
            int r9 = r9 + 1
            if (r9 != r6) goto L_0x020c
            r2 = r8
            goto L_0x021e
        L_0x020c:
            if (r3 != 0) goto L_0x0215
            W0.b r3 = new W0.b
            androidx.compose.ui.d$c[] r10 = new androidx.compose.ui.d.c[r4]
            r3.<init>(r10, r1)
        L_0x0215:
            if (r2 == 0) goto L_0x021b
            r3.b(r2)
            r2 = r5
        L_0x021b:
            r3.b(r8)
        L_0x021e:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x01fd
        L_0x0223:
            if (r9 != r6) goto L_0x0226
            goto L_0x01db
        L_0x0226:
            androidx.compose.ui.d$c r2 = G1.C4508k.g(r3)
            goto L_0x01db
        L_0x022b:
            if (r7 == 0) goto L_0x024a
            int r0 = r7.size()
            r2 = r1
        L_0x0232:
            if (r2 >= r0) goto L_0x024a
            java.lang.Object r3 = r7.get(r2)
            y1.g r3 = (y1.C6259g) r3
            boolean r3 = r3.C0(r15)
            if (r3 == 0) goto L_0x0241
            return r6
        L_0x0241:
            int r2 = r2 + 1
            goto L_0x0232
        L_0x0244:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r2)
            throw r15
        L_0x024a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.e(android.view.KeyEvent):boolean");
    }

    public boolean f(d dVar, C5669i iVar) {
        return this.f18800a.invoke(dVar, iVar).booleanValue();
    }

    public void g(C5623c cVar) {
        this.f18806g.f(cVar);
    }

    public void h(FocusTargetNode focusTargetNode) {
        this.f18806g.d(focusTargetNode);
    }

    public androidx.compose.ui.d i() {
        return this.f18808i;
    }

    public boolean j(boolean z10, boolean z11, boolean z12, int i10) {
        boolean z13;
        C5640t c10 = c();
        b bVar = b.f18811c;
        try {
            if (c10.f26514c) {
                c10.g();
            }
            c10.f();
            if (bVar != null) {
                c10.f26513b.b(bVar);
            }
            if (!z10) {
                int i11 = a.f18810a[q.e(this.f18805f, i10).ordinal()];
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    z13 = false;
                    if (z13 && z12) {
                        this.f18802c.invoke();
                    }
                    return z13;
                }
            }
            z13 = q.c(this.f18805f, z10, z11);
            this.f18802c.invoke();
            return z13;
        } finally {
            c10.h();
        }
    }

    public Boolean k(int i10, C5669i iVar, C17642l<? super FocusTargetNode, Boolean> lVar) {
        FocusTargetNode b10 = r.b(this.f18805f);
        if (b10 != null) {
            m a10 = r.a(b10, i10, this.f18804e.invoke());
            m.a aVar = m.f18861b;
            if (C17542s.e(a10, aVar.b())) {
                return null;
            }
            if (!C17542s.e(a10, aVar.c())) {
                return Boolean.valueOf(a10.c(lVar));
            }
        } else {
            b10 = null;
        }
        return r.e(this.f18805f, i10, this.f18804e.invoke(), iVar, new d(b10, this, lVar));
    }

    public C5635o l() {
        return this.f18805f.J2();
    }

    public void m(C5630j jVar) {
        this.f18806g.g(jVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        r10 = r3.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(android.view.KeyEvent r17, nI.C17631a<java.lang.Boolean> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            n1.e r3 = r0.f18806g
            boolean r3 = r3.b()
            r4 = 0
            if (r3 == 0) goto L_0x0016
            java.lang.String r1 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
            return r4
        L_0x0016:
            boolean r3 = r16.x(r17)
            if (r3 != 0) goto L_0x001d
            return r4
        L_0x001d:
            androidx.compose.ui.focus.FocusTargetNode r3 = r0.f18805f
            androidx.compose.ui.focus.FocusTargetNode r3 = androidx.compose.ui.focus.r.b(r3)
            java.lang.String r5 = "visitAncestors called on an unattached node"
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 16
            r8 = 0
            if (r3 == 0) goto L_0x0032
            androidx.compose.ui.d$c r9 = r0.v(r3)
            if (r9 != 0) goto L_0x0178
        L_0x0032:
            if (r3 == 0) goto L_0x00d6
            int r9 = G1.C4502e0.a(r6)
            androidx.compose.ui.d$c r10 = r3.E0()
            boolean r10 = r10.j2()
            if (r10 == 0) goto L_0x00d0
            androidx.compose.ui.d$c r10 = r3.E0()
            G1.G r3 = G1.C4508k.m(r3)
        L_0x004a:
            if (r3 == 0) goto L_0x00c5
            G1.a0 r11 = r3.m0()
            androidx.compose.ui.d$c r11 = r11.k()
            int r11 = r11.Z1()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00b2
        L_0x005b:
            if (r10 == 0) goto L_0x00b2
            int r11 = r10.e2()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x00ad
            r12 = r8
            r11 = r10
        L_0x0066:
            if (r11 == 0) goto L_0x00ad
            boolean r13 = r11 instanceof y1.C6257e
            if (r13 == 0) goto L_0x006d
            goto L_0x00c6
        L_0x006d:
            int r13 = r11.e2()
            r13 = r13 & r9
            if (r13 == 0) goto L_0x00a8
            boolean r13 = r11 instanceof G1.C4510m
            if (r13 == 0) goto L_0x00a8
            r13 = r11
            G1.m r13 = (G1.C4510m) r13
            androidx.compose.ui.d$c r13 = r13.D2()
            r14 = r4
        L_0x0080:
            if (r13 == 0) goto L_0x00a5
            int r15 = r13.e2()
            r15 = r15 & r9
            if (r15 == 0) goto L_0x00a0
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x008e
            r11 = r13
            goto L_0x00a0
        L_0x008e:
            if (r12 != 0) goto L_0x0097
            W0.b r12 = new W0.b
            androidx.compose.ui.d$c[] r15 = new androidx.compose.ui.d.c[r7]
            r12.<init>(r15, r4)
        L_0x0097:
            if (r11 == 0) goto L_0x009d
            r12.b(r11)
            r11 = r8
        L_0x009d:
            r12.b(r13)
        L_0x00a0:
            androidx.compose.ui.d$c r13 = r13.a2()
            goto L_0x0080
        L_0x00a5:
            if (r14 != r2) goto L_0x00a8
            goto L_0x0066
        L_0x00a8:
            androidx.compose.ui.d$c r11 = G1.C4508k.g(r12)
            goto L_0x0066
        L_0x00ad:
            androidx.compose.ui.d$c r10 = r10.g2()
            goto L_0x005b
        L_0x00b2:
            G1.G r3 = r3.q0()
            if (r3 == 0) goto L_0x00c3
            G1.a0 r10 = r3.m0()
            if (r10 == 0) goto L_0x00c3
            androidx.compose.ui.d$c r10 = r10.p()
            goto L_0x004a
        L_0x00c3:
            r10 = r8
            goto L_0x004a
        L_0x00c5:
            r11 = r8
        L_0x00c6:
            y1.e r11 = (y1.C6257e) r11
            if (r11 == 0) goto L_0x00d6
            androidx.compose.ui.d$c r9 = r11.E0()
            goto L_0x0178
        L_0x00d0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            throw r1
        L_0x00d6:
            androidx.compose.ui.focus.FocusTargetNode r3 = r0.f18805f
            int r9 = G1.C4502e0.a(r6)
            androidx.compose.ui.d$c r10 = r3.E0()
            boolean r10 = r10.j2()
            if (r10 == 0) goto L_0x0315
            androidx.compose.ui.d$c r10 = r3.E0()
            androidx.compose.ui.d$c r10 = r10.g2()
            G1.G r3 = G1.C4508k.m(r3)
        L_0x00f2:
            if (r3 == 0) goto L_0x016d
            G1.a0 r11 = r3.m0()
            androidx.compose.ui.d$c r11 = r11.k()
            int r11 = r11.Z1()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x015a
        L_0x0103:
            if (r10 == 0) goto L_0x015a
            int r11 = r10.e2()
            r11 = r11 & r9
            if (r11 == 0) goto L_0x0155
            r12 = r8
            r11 = r10
        L_0x010e:
            if (r11 == 0) goto L_0x0155
            boolean r13 = r11 instanceof y1.C6257e
            if (r13 == 0) goto L_0x0115
            goto L_0x016e
        L_0x0115:
            int r13 = r11.e2()
            r13 = r13 & r9
            if (r13 == 0) goto L_0x0150
            boolean r13 = r11 instanceof G1.C4510m
            if (r13 == 0) goto L_0x0150
            r13 = r11
            G1.m r13 = (G1.C4510m) r13
            androidx.compose.ui.d$c r13 = r13.D2()
            r14 = r4
        L_0x0128:
            if (r13 == 0) goto L_0x014d
            int r15 = r13.e2()
            r15 = r15 & r9
            if (r15 == 0) goto L_0x0148
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x0136
            r11 = r13
            goto L_0x0148
        L_0x0136:
            if (r12 != 0) goto L_0x013f
            W0.b r12 = new W0.b
            androidx.compose.ui.d$c[] r15 = new androidx.compose.ui.d.c[r7]
            r12.<init>(r15, r4)
        L_0x013f:
            if (r11 == 0) goto L_0x0145
            r12.b(r11)
            r11 = r8
        L_0x0145:
            r12.b(r13)
        L_0x0148:
            androidx.compose.ui.d$c r13 = r13.a2()
            goto L_0x0128
        L_0x014d:
            if (r14 != r2) goto L_0x0150
            goto L_0x010e
        L_0x0150:
            androidx.compose.ui.d$c r11 = G1.C4508k.g(r12)
            goto L_0x010e
        L_0x0155:
            androidx.compose.ui.d$c r10 = r10.g2()
            goto L_0x0103
        L_0x015a:
            G1.G r3 = r3.q0()
            if (r3 == 0) goto L_0x016b
            G1.a0 r10 = r3.m0()
            if (r10 == 0) goto L_0x016b
            androidx.compose.ui.d$c r10 = r10.p()
            goto L_0x00f2
        L_0x016b:
            r10 = r8
            goto L_0x00f2
        L_0x016d:
            r11 = r8
        L_0x016e:
            y1.e r11 = (y1.C6257e) r11
            if (r11 == 0) goto L_0x0177
            androidx.compose.ui.d$c r9 = r11.E0()
            goto L_0x0178
        L_0x0177:
            r9 = r8
        L_0x0178:
            if (r9 == 0) goto L_0x0314
            int r3 = G1.C4502e0.a(r6)
            androidx.compose.ui.d$c r6 = r9.E0()
            boolean r6 = r6.j2()
            if (r6 == 0) goto L_0x030e
            androidx.compose.ui.d$c r5 = r9.E0()
            androidx.compose.ui.d$c r5 = r5.g2()
            G1.G r6 = G1.C4508k.m(r9)
            r10 = r8
        L_0x0195:
            if (r6 == 0) goto L_0x021c
            G1.a0 r11 = r6.m0()
            androidx.compose.ui.d$c r11 = r11.k()
            int r11 = r11.Z1()
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0207
        L_0x01a6:
            if (r5 == 0) goto L_0x0207
            int r11 = r5.e2()
            r11 = r11 & r3
            if (r11 == 0) goto L_0x0202
            r11 = r5
            r12 = r8
        L_0x01b1:
            if (r11 == 0) goto L_0x0202
            boolean r13 = r11 instanceof y1.C6257e
            if (r13 == 0) goto L_0x01c2
            if (r10 != 0) goto L_0x01be
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x01be:
            r10.add(r11)
            goto L_0x01fd
        L_0x01c2:
            int r13 = r11.e2()
            r13 = r13 & r3
            if (r13 == 0) goto L_0x01fd
            boolean r13 = r11 instanceof G1.C4510m
            if (r13 == 0) goto L_0x01fd
            r13 = r11
            G1.m r13 = (G1.C4510m) r13
            androidx.compose.ui.d$c r13 = r13.D2()
            r14 = r4
        L_0x01d5:
            if (r13 == 0) goto L_0x01fa
            int r15 = r13.e2()
            r15 = r15 & r3
            if (r15 == 0) goto L_0x01f5
            int r14 = r14 + r2
            if (r14 != r2) goto L_0x01e3
            r11 = r13
            goto L_0x01f5
        L_0x01e3:
            if (r12 != 0) goto L_0x01ec
            W0.b r12 = new W0.b
            androidx.compose.ui.d$c[] r15 = new androidx.compose.ui.d.c[r7]
            r12.<init>(r15, r4)
        L_0x01ec:
            if (r11 == 0) goto L_0x01f2
            r12.b(r11)
            r11 = r8
        L_0x01f2:
            r12.b(r13)
        L_0x01f5:
            androidx.compose.ui.d$c r13 = r13.a2()
            goto L_0x01d5
        L_0x01fa:
            if (r14 != r2) goto L_0x01fd
            goto L_0x01b1
        L_0x01fd:
            androidx.compose.ui.d$c r11 = G1.C4508k.g(r12)
            goto L_0x01b1
        L_0x0202:
            androidx.compose.ui.d$c r5 = r5.g2()
            goto L_0x01a6
        L_0x0207:
            G1.G r6 = r6.q0()
            if (r6 == 0) goto L_0x0219
            G1.a0 r5 = r6.m0()
            if (r5 == 0) goto L_0x0219
            androidx.compose.ui.d$c r5 = r5.p()
            goto L_0x0195
        L_0x0219:
            r5 = r8
            goto L_0x0195
        L_0x021c:
            if (r10 == 0) goto L_0x023c
            int r5 = r10.size()
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x023a
        L_0x0226:
            int r6 = r5 + -1
            java.lang.Object r5 = r10.get(r5)
            y1.e r5 = (y1.C6257e) r5
            boolean r5 = r5.Y0(r1)
            if (r5 == 0) goto L_0x0235
            return r2
        L_0x0235:
            if (r6 >= 0) goto L_0x0238
            goto L_0x023a
        L_0x0238:
            r5 = r6
            goto L_0x0226
        L_0x023a:
            XH.N r5 = XH.C16807N.f139792a
        L_0x023c:
            androidx.compose.ui.d$c r5 = r9.E0()
            r6 = r8
        L_0x0241:
            if (r5 == 0) goto L_0x0290
            boolean r11 = r5 instanceof y1.C6257e
            if (r11 == 0) goto L_0x0250
            y1.e r5 = (y1.C6257e) r5
            boolean r5 = r5.Y0(r1)
            if (r5 == 0) goto L_0x028b
            return r2
        L_0x0250:
            int r11 = r5.e2()
            r11 = r11 & r3
            if (r11 == 0) goto L_0x028b
            boolean r11 = r5 instanceof G1.C4510m
            if (r11 == 0) goto L_0x028b
            r11 = r5
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r4
        L_0x0263:
            if (r11 == 0) goto L_0x0288
            int r13 = r11.e2()
            r13 = r13 & r3
            if (r13 == 0) goto L_0x0283
            int r12 = r12 + r2
            if (r12 != r2) goto L_0x0271
            r5 = r11
            goto L_0x0283
        L_0x0271:
            if (r6 != 0) goto L_0x027a
            W0.b r6 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r7]
            r6.<init>(r13, r4)
        L_0x027a:
            if (r5 == 0) goto L_0x0280
            r6.b(r5)
            r5 = r8
        L_0x0280:
            r6.b(r11)
        L_0x0283:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x0263
        L_0x0288:
            if (r12 != r2) goto L_0x028b
            goto L_0x0241
        L_0x028b:
            androidx.compose.ui.d$c r5 = G1.C4508k.g(r6)
            goto L_0x0241
        L_0x0290:
            java.lang.Object r5 = r18.invoke()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x029d
            return r2
        L_0x029d:
            androidx.compose.ui.d$c r5 = r9.E0()
            r6 = r8
        L_0x02a2:
            if (r5 == 0) goto L_0x02f1
            boolean r9 = r5 instanceof y1.C6257e
            if (r9 == 0) goto L_0x02b1
            y1.e r5 = (y1.C6257e) r5
            boolean r5 = r5.p1(r1)
            if (r5 == 0) goto L_0x02ec
            return r2
        L_0x02b1:
            int r9 = r5.e2()
            r9 = r9 & r3
            if (r9 == 0) goto L_0x02ec
            boolean r9 = r5 instanceof G1.C4510m
            if (r9 == 0) goto L_0x02ec
            r9 = r5
            G1.m r9 = (G1.C4510m) r9
            androidx.compose.ui.d$c r9 = r9.D2()
            r11 = r4
        L_0x02c4:
            if (r9 == 0) goto L_0x02e9
            int r12 = r9.e2()
            r12 = r12 & r3
            if (r12 == 0) goto L_0x02e4
            int r11 = r11 + r2
            if (r11 != r2) goto L_0x02d2
            r5 = r9
            goto L_0x02e4
        L_0x02d2:
            if (r6 != 0) goto L_0x02db
            W0.b r6 = new W0.b
            androidx.compose.ui.d$c[] r12 = new androidx.compose.ui.d.c[r7]
            r6.<init>(r12, r4)
        L_0x02db:
            if (r5 == 0) goto L_0x02e1
            r6.b(r5)
            r5 = r8
        L_0x02e1:
            r6.b(r9)
        L_0x02e4:
            androidx.compose.ui.d$c r9 = r9.a2()
            goto L_0x02c4
        L_0x02e9:
            if (r11 != r2) goto L_0x02ec
            goto L_0x02a2
        L_0x02ec:
            androidx.compose.ui.d$c r5 = G1.C4508k.g(r6)
            goto L_0x02a2
        L_0x02f1:
            if (r10 == 0) goto L_0x030b
            int r3 = r10.size()
            r5 = r4
        L_0x02f8:
            if (r5 >= r3) goto L_0x0309
            java.lang.Object r6 = r10.get(r5)
            y1.e r6 = (y1.C6257e) r6
            boolean r6 = r6.p1(r1)
            if (r6 == 0) goto L_0x0307
            return r2
        L_0x0307:
            int r5 = r5 + r2
            goto L_0x02f8
        L_0x0309:
            XH.N r1 = XH.C16807N.f139792a
        L_0x030b:
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x0314
        L_0x030e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            throw r1
        L_0x0314:
            return r4
        L_0x0315:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.n(android.view.KeyEvent, nI.a):boolean");
    }

    public C5669i o() {
        FocusTargetNode b10 = r.b(this.f18805f);
        if (b10 != null) {
            return r.d(b10);
        }
        return null;
    }

    public void p() {
        C5640t c10 = c();
        if (c10.f26514c) {
            q.c(this.f18805f, true, true);
            return;
        }
        try {
            c10.f();
            q.c(this.f18805f, true, true);
        } finally {
            c10.h();
        }
    }

    public void r(boolean z10) {
        j(z10, true, true, d.f18832b.c());
    }

    public final FocusTargetNode t() {
        return this.f18805f;
    }

    public boolean w(int i10, C5669i iVar) {
        Boolean k10 = k(i10, iVar, new g(i10));
        if (k10 != null) {
            return k10.booleanValue();
        }
        return false;
    }
}
