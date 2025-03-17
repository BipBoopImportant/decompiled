package T1;

import A1.Q;
import N1.P;
import N1.W;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import o1.C5669i;
import p1.O0;
import pI.C17752b;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00013B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010KR$\u0010P\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0000@BX\u000e¢\u0006\f\n\u0004\b/\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010QR\"\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000e0f8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"LT1/U;", "LT1/K;", "Landroid/view/View;", "view", "LA1/Q;", "rootPositionCalculator", "LT1/u;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;LA1/Q;LT1/u;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;LA1/Q;)V", "LT1/U$a;", "command", "LXH/N;", "v", "(LT1/U$a;)V", "s", "()V", "u", "", "visible", "x", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "r", "()Z", "LT1/P;", "value", "LT1/s;", "imeOptions", "Lkotlin/Function1;", "", "LT1/i;", "onEditCommand", "LT1/r;", "onImeActionPerformed", "d", "(LT1/P;LT1/s;LnI/l;LnI/l;)V", "b", "c", "g", "e", "oldValue", "newValue", "a", "(LT1/P;LT1/P;)V", "Lo1/i;", "rect", "f", "(Lo1/i;)V", "textFieldValue", "LT1/H;", "offsetMapping", "LN1/P;", "textLayoutResult", "Lp1/O0;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "h", "(LT1/P;LT1/H;LN1/P;LnI/l;Lo1/i;Lo1/i;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "LT1/u;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "LnI/l;", "<set-?>", "LT1/P;", "getState$ui_release", "()LT1/P;", "state", "LT1/s;", "", "Ljava/lang/ref/WeakReference;", "LT1/L;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "LXH/o;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "LT1/e;", "l", "LT1/e;", "cursorAnchorInfoController", "LW0/b;", "m", "LW0/b;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class U implements K {

    /* renamed from: a  reason: collision with root package name */
    private final View f13547a;

    /* renamed from: b  reason: collision with root package name */
    private final C4851u f13548b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f13549c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13550d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C17642l<? super List<? extends C4840i>, C16807N> f13551e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public C17642l<? super r, C16807N> f13552f;

    /* renamed from: g  reason: collision with root package name */
    private P f13553g;

    /* renamed from: h  reason: collision with root package name */
    private C4849s f13554h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List<WeakReference<L>> f13555i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f13556j;

    /* renamed from: k  reason: collision with root package name */
    private Rect f13557k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final C4836e f13558l;

    /* renamed from: m  reason: collision with root package name */
    private final W0.b<a> f13559m;

    /* renamed from: n  reason: collision with root package name */
    private Runnable f13560n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LT1/U$a;", "", "<init>", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13561a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                T1.U$a[] r0 = T1.U.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                T1.U$a r1 = T1.U.a.StartInput     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                T1.U$a r1 = T1.U.a.StopInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                T1.U$a r1 = T1.U.a.ShowKeyboard     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                T1.U$a r1 = T1.U.a.HideKeyboard     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f13561a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: T1.U.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "b", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<BaseInputConnection> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ U f13562c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(U u10) {
            super(0);
            this.f13562c = u10;
        }

        /* renamed from: b */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.f13562c.q(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"T1/U$d", "LT1/t;", "", "LT1/i;", "editCommands", "LXH/N;", "d", "(Ljava/util/List;)V", "LT1/r;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "LT1/L;", "inputConnection", "e", "(LT1/L;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements C4850t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f13563a;

        d(U u10) {
            this.f13563a = u10;
        }

        public void a(KeyEvent keyEvent) {
            this.f13563a.p().sendKeyEvent(keyEvent);
        }

        public void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f13563a.f13558l.b(z10, z11, z12, z13, z14, z15);
        }

        public void c(int i10) {
            this.f13563a.f13552f.invoke(r.j(i10));
        }

        public void d(List<? extends C4840i> list) {
            this.f13563a.f13551e.invoke(list);
        }

        public void e(L l10) {
            int size = this.f13563a.f13555i.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (C17542s.e(((WeakReference) this.f13563a.f13555i.get(i10)).get(), l10)) {
                    this.f13563a.f13555i.remove(i10);
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LT1/i;", "it", "LXH/N;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<List<? extends C4840i>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f13564c = new e();

        e() {
            super(1);
        }

        public final void a(List<? extends C4840i> list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/r;", "it", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final f f13565c = new f();

        f() {
            super(1);
        }

        public final void a(int i10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LT1/i;", "it", "LXH/N;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l<List<? extends C4840i>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f13566c = new g();

        g() {
            super(1);
        }

        public final void a(List<? extends C4840i> list) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/r;", "it", "LXH/N;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17642l<r, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final h f13567c = new h();

        h() {
            super(1);
        }

        public final void a(int i10) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((r) obj).p());
            return C16807N.f139792a;
        }
    }

    public U(View view, Q q10, C4851u uVar, Executor executor) {
        this.f13547a = view;
        this.f13548b = uVar;
        this.f13549c = executor;
        this.f13551e = e.f13564c;
        this.f13552f = f.f13565c;
        this.f13553g = new P("", W.f9419b.a(), (W) null, 4, (DefaultConstructorMarker) null);
        this.f13554h = C4849s.f13631g.a();
        this.f13555i = new ArrayList();
        this.f13556j = C16825p.a(s.NONE, new c(this));
        this.f13558l = new C4836e(q10, uVar);
        this.f13559m = new W0.b<>(new a[16], 0);
    }

    /* access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.f13556j.getValue();
    }

    private final void s() {
        O o10 = new O();
        O o11 = new O();
        W0.b<a> bVar = this.f13559m;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            int i10 = 0;
            do {
                t((a) q10[i10], o10, o11);
                i10++;
            } while (i10 < r10);
        }
        this.f13559m.k();
        if (C17542s.e(o10.f144348a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) o11.f144348a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (C17542s.e(o10.f144348a, Boolean.FALSE)) {
            u();
        }
    }

    private static final void t(a aVar, O<Boolean> o10, O<Boolean> o11) {
        int i10 = b.f13561a[aVar.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            T t10 = Boolean.TRUE;
            o10.f144348a = t10;
            o11.f144348a = t10;
        } else if (i10 == 2) {
            T t11 = Boolean.FALSE;
            o10.f144348a = t11;
            o11.f144348a = t11;
        } else if ((i10 == 3 || i10 == 4) && !C17542s.e(o10.f144348a, Boolean.FALSE)) {
            if (aVar != a.ShowKeyboard) {
                z10 = false;
            }
            o11.f144348a = Boolean.valueOf(z10);
        }
    }

    private final void u() {
        this.f13548b.f();
    }

    private final void v(a aVar) {
        this.f13559m.b(aVar);
        if (this.f13560n == null) {
            T t10 = new T(this);
            this.f13549c.execute(t10);
            this.f13560n = t10;
        }
    }

    /* access modifiers changed from: private */
    public static final void w(U u10) {
        u10.f13560n = null;
        u10.s();
    }

    private final void x(boolean z10) {
        if (z10) {
            this.f13548b.a();
        } else {
            this.f13548b.b();
        }
    }

    public void a(P p10, P p11) {
        boolean z10 = !W.g(this.f13553g.h(), p11.h()) || !C17542s.e(this.f13553g.g(), p11.g());
        this.f13553g = p11;
        int size = this.f13555i.size();
        for (int i10 = 0; i10 < size; i10++) {
            L l10 = (L) this.f13555i.get(i10).get();
            if (l10 != null) {
                l10.f(p11);
            }
        }
        this.f13558l.a();
        if (C17542s.e(p10, p11)) {
            if (z10) {
                C4851u uVar = this.f13548b;
                int l11 = W.l(p11.h());
                int k10 = W.k(p11.h());
                W g10 = this.f13553g.g();
                int i11 = -1;
                int l12 = g10 != null ? W.l(g10.r()) : -1;
                W g11 = this.f13553g.g();
                if (g11 != null) {
                    i11 = W.k(g11.r());
                }
                uVar.e(l11, k10, l12, i11);
            }
        } else if (p10 == null || (C17542s.e(p10.i(), p11.i()) && (!W.g(p10.h(), p11.h()) || C17542s.e(p10.g(), p11.g())))) {
            int size2 = this.f13555i.size();
            for (int i12 = 0; i12 < size2; i12++) {
                L l13 = (L) this.f13555i.get(i12).get();
                if (l13 != null) {
                    l13.g(this.f13553g, this.f13548b);
                }
            }
        } else {
            u();
        }
    }

    public void b() {
        v(a.StartInput);
    }

    public void c() {
        this.f13550d = false;
        this.f13551e = g.f13566c;
        this.f13552f = h.f13567c;
        this.f13557k = null;
        v(a.StopInput);
    }

    public void d(P p10, C4849s sVar, C17642l<? super List<? extends C4840i>, C16807N> lVar, C17642l<? super r, C16807N> lVar2) {
        this.f13550d = true;
        this.f13553g = p10;
        this.f13554h = sVar;
        this.f13551e = lVar;
        this.f13552f = lVar2;
        v(a.StartInput);
    }

    public void e() {
        v(a.HideKeyboard);
    }

    @C16814e
    public void f(C5669i iVar) {
        Rect rect;
        this.f13557k = new Rect(C17752b.e(iVar.o()), C17752b.e(iVar.r()), C17752b.e(iVar.p()), C17752b.e(iVar.j()));
        if (this.f13555i.isEmpty() && (rect = this.f13557k) != null) {
            this.f13547a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public void g() {
        v(a.ShowKeyboard);
    }

    public void h(P p10, H h10, P p11, C17642l<? super O0, C16807N> lVar, C5669i iVar, C5669i iVar2) {
        this.f13558l.d(p10, h10, p11, lVar, iVar, iVar2);
    }

    public final InputConnection o(EditorInfo editorInfo) {
        if (!this.f13550d) {
            return null;
        }
        X.h(editorInfo, this.f13554h, this.f13553g);
        X.i(editorInfo);
        L l10 = new L(this.f13553g, new d(this), this.f13554h.b());
        this.f13555i.add(new WeakReference(l10));
        return l10;
    }

    public final View q() {
        return this.f13547a;
    }

    public final boolean r() {
        return this.f13550d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(View view, Q q10, C4851u uVar, Executor executor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, q10, uVar, (i10 & 8) != 0 ? X.d(Choreographer.getInstance()) : executor);
    }

    public U(View view, Q q10) {
        this(view, q10, new C4852v(view), (Executor) null, 8, (DefaultConstructorMarker) null);
    }
}
