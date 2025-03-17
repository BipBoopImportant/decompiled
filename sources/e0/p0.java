package E0;

import T1.H;
import T1.P;
import XH.C16807N;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;
import p1.O0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\u00020\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"LE0/p0;", "", "Lkotlin/Function1;", "Lp1/O0;", "LXH/N;", "localToScreen", "LE0/l0;", "inputMethodManager", "<init>", "(LnI/l;LE0/l0;)V", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "LT1/P;", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lo1/i;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(LT1/P;LT1/H;LN1/P;Lo1/i;Lo1/i;)V", "a", "LnI/l;", "LE0/l0;", "Ljava/lang/Object;", "lock", "Z", "monitorEnabled", "e", "hasPendingImmediateRequest", "f", "g", "h", "i", "j", "LT1/P;", "k", "LN1/P;", "l", "LT1/H;", "m", "Lo1/i;", "n", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<O0, C16807N> f5729a;

    /* renamed from: b  reason: collision with root package name */
    private final l0 f5730b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5731c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5732d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5733e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5734f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5735g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5736h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5737i;

    /* renamed from: j  reason: collision with root package name */
    private P f5738j;

    /* renamed from: k  reason: collision with root package name */
    private N1.P f5739k;

    /* renamed from: l  reason: collision with root package name */
    private H f5740l;

    /* renamed from: m  reason: collision with root package name */
    private C5669i f5741m;

    /* renamed from: n  reason: collision with root package name */
    private C5669i f5742n;

    /* renamed from: o  reason: collision with root package name */
    private final CursorAnchorInfo.Builder f5743o = new CursorAnchorInfo.Builder();

    /* renamed from: p  reason: collision with root package name */
    private final float[] f5744p = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    private final Matrix f5745q = new Matrix();

    public p0(C17642l<? super O0, C16807N> lVar, l0 l0Var) {
        this.f5729a = lVar;
        this.f5730b = l0Var;
    }

    private final void c() {
        if (this.f5730b.c() && this.f5738j != null && this.f5740l != null && this.f5739k != null && this.f5741m != null && this.f5742n != null) {
            O0.h(this.f5744p);
            this.f5729a.invoke(O0.a(this.f5744p));
            float[] fArr = this.f5744p;
            C5669i iVar = this.f5742n;
            C17542s.g(iVar);
            C5669i iVar2 = this.f5742n;
            C17542s.g(iVar2);
            O0.p(fArr, -iVar.o(), -iVar2.r(), 0.0f);
            p1.P.a(this.f5745q, this.f5744p);
            l0 l0Var = this.f5730b;
            CursorAnchorInfo.Builder builder = this.f5743o;
            P p10 = this.f5738j;
            C17542s.g(p10);
            H h10 = this.f5740l;
            C17542s.g(h10);
            N1.P p11 = this.f5739k;
            C17542s.g(p11);
            Matrix matrix = this.f5745q;
            C5669i iVar3 = this.f5741m;
            C17542s.g(iVar3);
            C5669i iVar4 = this.f5742n;
            C17542s.g(iVar4);
            l0Var.g(o0.b(builder, p10, h10, p11, matrix, iVar3, iVar4, this.f5734f, this.f5735g, this.f5736h, this.f5737i));
            this.f5733e = false;
        }
    }

    public final void a() {
        synchronized (this.f5731c) {
            this.f5738j = null;
            this.f5740l = null;
            this.f5739k = null;
            this.f5741m = null;
            this.f5742n = null;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f5731c) {
            try {
                this.f5734f = z12;
                this.f5735g = z13;
                this.f5736h = z14;
                this.f5737i = z15;
                if (z10) {
                    this.f5733e = true;
                    if (this.f5738j != null) {
                        c();
                    }
                }
                this.f5732d = z11;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(P p10, H h10, N1.P p11, C5669i iVar, C5669i iVar2) {
        synchronized (this.f5731c) {
            try {
                this.f5738j = p10;
                this.f5740l = h10;
                this.f5739k = p11;
                this.f5741m = iVar;
                this.f5742n = iVar2;
                if (!this.f5733e) {
                    if (this.f5732d) {
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
