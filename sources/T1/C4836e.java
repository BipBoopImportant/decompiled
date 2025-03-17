package T1;

import A1.Q;
import N1.P;
import XH.C16807N;
import XH.C16814e;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;
import p1.O0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010&\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010@\u001a\u00020\u001b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010C\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"LT1/e;", "", "LA1/Q;", "rootPositionCalculator", "LT1/u;", "inputMethodManager", "<init>", "(LA1/Q;LT1/u;)V", "LXH/N;", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "LT1/P;", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lkotlin/Function1;", "Lp1/O0;", "textFieldToRootTransform", "Lo1/i;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(LT1/P;LT1/H;LN1/P;LnI/l;Lo1/i;Lo1/i;)V", "a", "LA1/Q;", "LT1/u;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "LT1/P;", "k", "LN1/P;", "l", "LT1/H;", "m", "LnI/l;", "n", "Lo1/i;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "p", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "q", "[F", "matrix", "Landroid/graphics/Matrix;", "r", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: T1.e  reason: case insensitive filesystem */
public final class C4836e {

    /* renamed from: a  reason: collision with root package name */
    private final Q f13581a;

    /* renamed from: b  reason: collision with root package name */
    private final C4851u f13582b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13583c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f13584d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13585e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13586f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13587g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13588h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13589i;

    /* renamed from: j  reason: collision with root package name */
    private P f13590j;

    /* renamed from: k  reason: collision with root package name */
    private P f13591k;

    /* renamed from: l  reason: collision with root package name */
    private H f13592l;

    /* renamed from: m  reason: collision with root package name */
    private C17642l<? super O0, C16807N> f13593m = b.f13600c;

    /* renamed from: n  reason: collision with root package name */
    private C5669i f13594n;

    /* renamed from: o  reason: collision with root package name */
    private C5669i f13595o;

    /* renamed from: p  reason: collision with root package name */
    private final CursorAnchorInfo.Builder f13596p = new CursorAnchorInfo.Builder();

    /* renamed from: q  reason: collision with root package name */
    private final float[] f13597q = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    private final Matrix f13598r = new Matrix();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/O0;", "it", "LXH/N;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: T1.e$a */
    static final class a extends C17544u implements C17642l<O0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f13599c = new a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((O0) obj).r());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/O0;", "it", "LXH/N;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: T1.e$b */
    static final class b extends C17544u implements C17642l<O0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f13600c = new b();

        b() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((O0) obj).r());
            return C16807N.f139792a;
        }
    }

    public C4836e(Q q10, C4851u uVar) {
        this.f13581a = q10;
        this.f13582b = uVar;
    }

    private final void c() {
        if (this.f13582b.c()) {
            this.f13593m.invoke(O0.a(this.f13597q));
            this.f13581a.v(this.f13597q);
            p1.P.a(this.f13598r, this.f13597q);
            C4851u uVar = this.f13582b;
            CursorAnchorInfo.Builder builder = this.f13596p;
            P p10 = this.f13590j;
            C17542s.g(p10);
            H h10 = this.f13592l;
            C17542s.g(h10);
            P p11 = this.f13591k;
            C17542s.g(p11);
            Matrix matrix = this.f13598r;
            C5669i iVar = this.f13594n;
            C17542s.g(iVar);
            C5669i iVar2 = this.f13595o;
            C17542s.g(iVar2);
            uVar.g(C4835d.b(builder, p10, h10, p11, matrix, iVar, iVar2, this.f13586f, this.f13587g, this.f13588h, this.f13589i));
            this.f13585e = false;
        }
    }

    public final void a() {
        synchronized (this.f13583c) {
            this.f13590j = null;
            this.f13592l = null;
            this.f13591k = null;
            this.f13593m = a.f13599c;
            this.f13594n = null;
            this.f13595o = null;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f13583c) {
            try {
                this.f13586f = z12;
                this.f13587g = z13;
                this.f13588h = z14;
                this.f13589i = z15;
                if (z10) {
                    this.f13585e = true;
                    if (this.f13590j != null) {
                        c();
                    }
                }
                this.f13584d = z11;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(P p10, H h10, P p11, C17642l<? super O0, C16807N> lVar, C5669i iVar, C5669i iVar2) {
        synchronized (this.f13583c) {
            try {
                this.f13590j = p10;
                this.f13592l = h10;
                this.f13591k = p11;
                this.f13593m = lVar;
                this.f13594n = iVar;
                this.f13595o = iVar2;
                if (!this.f13585e) {
                    if (this.f13584d) {
                    }
                    C16807N n10 = C16807N.f139792a;
                }
                c();
                C16807N n102 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
