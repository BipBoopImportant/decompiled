package k1;

import G1.G;
import G1.m0;
import H2.b;
import L1.i;
import L1.k;
import L1.l;
import L1.m;
import L1.p;
import L1.s;
import L1.w;
import N1.C4669d;
import N1.O;
import N1.P;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import XH.C16807N;
import XH.C16820k;
import YH.C16877v;
import YH.V;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C5101f1;
import androidx.compose.ui.platform.C5104g1;
import androidx.compose.ui.platform.C5107h1;
import androidx.compose.ui.platform.coreshims.e;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import c2.v;
import dI.C17164e;
import e2.C5294a;
import j0.C5446b;
import j0.C5459o;
import j0.C5460p;
import j0.E;
import j0.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002U@B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u0004\u0018\u00010$*\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u001fJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00100J\u000f\u00103\u001a\u00020\u000fH\u0002¢\u0006\u0004\b3\u0010\u001fJ\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010\u001fJ\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u001fJ\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u000fH@¢\u0006\u0004\b@\u0010AJ\u000f\u00107\u001a\u00020\u000fH\u0000¢\u0006\u0004\b7\u0010\u001fJ\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\bB\u0010#J\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u001fJ\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010\u001fJ\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010\u001fJ/\u0010M\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010K0JH\u0001¢\u0006\u0004\bM\u0010NJ'\u0010S\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u00002\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0001¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010e\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b^\u0010_\u0012\u0004\bd\u0010\u001f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020$0f8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010qR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010tR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020 0v8\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000f0z8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001d\u0010\u0001\u001a\u00020~8\u0000X\u0004¢\u0006\u000e\n\u0004\bW\u0010\u001a\u0006\b\u0001\u0010\u0001R-\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138@@\u0000X\u000e¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b{\u0010\u0001\"\u0005\b\u0001\u0010\u0017R\u0017\u0010\u0001\u001a\u00020m8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010nR\u001e\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\r0f8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010gR\u0019\u0010\u0001\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020s8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010tR\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0001R\u001e\u0010\u0001\u001a\u00020s8@X\u0004¢\u0006\u000f\u0012\u0005\b\u0001\u0010\u001f\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lk1/b;", "Lk1/l;", "Landroidx/lifecycle/h;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/c;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;LnI/a;)V", "LL1/p;", "newNode", "Landroidx/compose/ui/platform/f1;", "oldNode", "LXH/N;", "A", "(LL1/p;Landroidx/compose/ui/platform/f1;)V", "y", "Lj0/o;", "Landroidx/compose/ui/platform/g1;", "newSemanticsNodes", "g", "(Lj0/o;)V", "", "id", "", "newText", "z", "(ILjava/lang/String;)V", "F", "()V", "LG1/G;", "layoutNode", "q", "(LG1/G;)V", "Landroidx/compose/ui/platform/coreshims/e;", "C", "(LL1/p;)Landroidx/compose/ui/platform/coreshims/e;", "virtualId", "viewStructure", "d", "(ILandroidx/compose/ui/platform/coreshims/e;)V", "f", "(I)V", "p", "node", "D", "(LL1/p;)V", "E", "G", "B", "m", "h", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/y;", "owner", "onStart", "(Landroidx/lifecycle/y;)V", "onStop", "b", "(LdI/e;)Ljava/lang/Object;", "u", "w", "t", "r", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "s", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "x", "(Lk1/b;Landroid/util/LongSparseArray;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "k", "()Landroidx/compose/ui/platform/AndroidComposeView;", "LnI/a;", "getOnContentCaptureSession", "()LnI/a;", "setOnContentCaptureSession", "(LnI/a;)V", "c", "Landroidx/compose/ui/platform/coreshims/c;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/c;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/c;)V", "getContentCaptureSession$ui_release$annotations", "contentCaptureSession", "Lj0/E;", "Lj0/E;", "bufferedAppearedNodes", "Lj0/F;", "e", "Lj0/F;", "bufferedDisappearedNodes", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Lk1/b$a;", "Lk1/b$a;", "translateStatus", "", "Z", "currentSemanticsNodesInvalidated", "Lj0/b;", "i", "Lj0/b;", "subtreeChangedLayoutNodes", "LSJ/j;", "j", "LSJ/j;", "boundsUpdateChannel", "Landroid/os/Handler;", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "handler", "l", "Lj0/o;", "()Lj0/o;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodes", "currentSemanticsNodesSnapshotTimestampMillis", "n", "previousSemanticsNodes", "o", "Landroidx/compose/ui/platform/f1;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "()Z", "isEnabled$ui_release$annotations", "isEnabled", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k1.b  reason: case insensitive filesystem */
public final class C5492b implements C5502l, C5205h, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f24995a;

    /* renamed from: b  reason: collision with root package name */
    private C17631a<? extends androidx.compose.ui.platform.coreshims.c> f24996b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.compose.ui.platform.coreshims.c f24997c;

    /* renamed from: d  reason: collision with root package name */
    private final E<e> f24998d = new E<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final F f24999e = new F(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private long f25000f = 100;

    /* renamed from: g  reason: collision with root package name */
    private a f25001g = a.SHOW_ORIGINAL;

    /* renamed from: h  reason: collision with root package name */
    private boolean f25002h = true;

    /* renamed from: i  reason: collision with root package name */
    private final C5446b<G> f25003i = new C5446b<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private final C16434j<C16807N> f25004j = C16437m.b(1, (C16428d) null, (C17642l) null, 6, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final Handler f25005k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    private C5459o<C5104g1> f25006l = C5460p.a();

    /* renamed from: m  reason: collision with root package name */
    private long f25007m;

    /* renamed from: n  reason: collision with root package name */
    private E<C5101f1> f25008n = C5460p.b();

    /* renamed from: o  reason: collision with root package name */
    private C5101f1 f25009o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25010p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f25011q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lk1/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k1.b$a */
    private enum a {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lk1/b$b;", "", "<init>", "()V", "Lk1/b;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "LXH/N;", "b", "(Lk1/b;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(Lk1/b;[J[ILjava/util/function/Consumer;)V", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k1.b$b  reason: collision with other inner class name */
    private static final class C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0400b f25012a = new C0400b();

        private C0400b() {
        }

        private final void b(C5492b bVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            TranslationResponseValue a10;
            CharSequence a11;
            C5104g1 c10;
            p b10;
            L1.a aVar;
            C17642l lVar;
            V a12 = b.a(longSparseArray);
            while (a12.hasNext()) {
                long c11 = a12.c();
                ViewTranslationResponse a13 = C5498h.a(longSparseArray.get(c11));
                if (!(a13 == null || (a10 = a13.getValue("android:text")) == null || (a11 = a10.getText()) == null || (c10 = bVar.j().c((int) c11)) == null || (b10 = c10.b()) == null || (aVar = (L1.a) m.a(b10.w(), k.f8953a.z())) == null || (lVar = (C17642l) aVar.a()) == null)) {
                    Boolean bool = (Boolean) lVar.invoke(new C4669d(a11.toString(), (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                }
            }
        }

        /* access modifiers changed from: private */
        public static final void e(C5492b bVar, LongSparseArray longSparseArray) {
            f25012a.b(bVar, longSparseArray);
        }

        public final void c(C5492b bVar, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            p b10;
            String e10;
            for (long j10 : jArr) {
                C5104g1 c10 = bVar.j().c((int) j10);
                if (!(c10 == null || (b10 = c10.b()) == null)) {
                    C5497g.a();
                    ViewTranslationRequest.Builder a10 = C5496f.a(bVar.k().getAutofillId(), (long) b10.o());
                    List list = (List) m.a(b10.w(), s.f9010a.D());
                    if (!(list == null || (e10 = C5294a.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null)) == null)) {
                        ViewTranslationRequest.Builder unused = a10.setValue("android:text", TranslationRequestValue.forText(new C4669d(e10, (List) null, (List) null, 6, (DefaultConstructorMarker) null)));
                        consumer.accept(a10.build());
                    }
                }
                Consumer<ViewTranslationRequest> consumer2 = consumer;
            }
        }

        public final void d(C5492b bVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (C17542s.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    b(bVar, longSparseArray);
                } else {
                    bVar.k().post(new C5501k(bVar, longSparseArray));
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.contentcapture.AndroidContentCaptureManager", f = "AndroidContentCaptureManager.android.kt", l = {186, 196}, m = "boundsUpdatesEventLoop$ui_release")
    /* renamed from: k1.b$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f25013c;

        /* renamed from: d  reason: collision with root package name */
        Object f25014d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25015e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5492b f25016f;

        /* renamed from: g  reason: collision with root package name */
        int f25017g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5492b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f25016f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25015e = obj;
            this.f25017g |= Integer.MIN_VALUE;
            return this.f25016f.b(this);
        }
    }

    public C5492b(AndroidComposeView androidComposeView, C17631a<? extends androidx.compose.ui.platform.coreshims.c> aVar) {
        this.f24995a = androidComposeView;
        this.f24996b = aVar;
        this.f25009o = new C5101f1(androidComposeView.getSemanticsOwner().a(), C5460p.a());
        this.f25011q = new C5491a(this);
    }

    private final void A(p pVar, C5101f1 f1Var) {
        F f10 = new F(0, 1, (DefaultConstructorMarker) null);
        List<p> t10 = pVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar2 = t10.get(i10);
            if (j().a(pVar2.o())) {
                if (!f1Var.a().a(pVar2.o())) {
                    q(pVar.q());
                    return;
                }
                f10.f(pVar2.o());
            }
        }
        F a10 = f1Var.a();
        int[] iArr = a10.f24640b;
        long[] jArr = a10.f24639a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) >= 128 || f10.a(iArr[(i11 << 3) + i13])) {
                            j10 >>= 8;
                            i13++;
                        } else {
                            q(pVar.q());
                            return;
                        }
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List<p> t11 = pVar.t();
        int size2 = t11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            p pVar3 = t11.get(i14);
            if (j().a(pVar3.o())) {
                C5101f1 c10 = this.f25008n.c(pVar3.o());
                if (c10 != null) {
                    A(pVar3, c10);
                } else {
                    D1.a.c("node not present in pruned tree before this change");
                    throw new C16820k();
                }
            }
        }
    }

    private final void B() {
        L1.a aVar;
        C17642l lVar;
        C5459o<C5104g1> j10 = j();
        Object[] objArr = j10.f24635c;
        long[] jArr = j10.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            l w10 = ((C5104g1) objArr[(i10 << 3) + i12]).b().w();
                            if (!(!C17542s.e(m.a(w10, s.f9010a.r()), Boolean.FALSE) || (aVar = (L1.a) m.a(w10, k.f8953a.A())) == null || (lVar = (C17642l) aVar.a()) == null)) {
                                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final e C(p pVar) {
        androidx.compose.ui.platform.coreshims.a a10;
        AutofillId autofillId;
        String i10;
        androidx.compose.ui.platform.coreshims.c cVar = this.f24997c;
        if (cVar == null || Build.VERSION.SDK_INT < 29 || (a10 = androidx.compose.ui.platform.coreshims.d.a(this.f24995a)) == null) {
            return null;
        }
        p r10 = pVar.r();
        if (r10 != null) {
            autofillId = cVar.a((long) r10.o());
            if (autofillId == null) {
                return null;
            }
        } else {
            autofillId = a10.a();
        }
        e b10 = cVar.b(autofillId, (long) pVar.o());
        if (b10 == null) {
            return null;
        }
        l w10 = pVar.w();
        s sVar = s.f9010a;
        if (w10.k(sVar.w())) {
            return null;
        }
        Bundle a11 = b10.a();
        if (a11 != null) {
            a11.putLong("android.view.contentcapture.EventTimestamp", this.f25007m);
        }
        String str = (String) m.a(w10, sVar.C());
        if (str != null) {
            b10.e(pVar.o(), (String) null, (String) null, str);
        }
        List list = (List) m.a(w10, sVar.D());
        if (list != null) {
            b10.b("android.widget.TextView");
            b10.f(C5294a.e(list, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        }
        C4669d dVar = (C4669d) m.a(w10, sVar.g());
        if (dVar != null) {
            b10.b("android.widget.EditText");
            b10.f(dVar);
        }
        List list2 = (List) m.a(w10, sVar.d());
        if (list2 != null) {
            b10.c(C5294a.e(list2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        }
        i iVar = (i) m.a(w10, sVar.y());
        if (!(iVar == null || (i10 = C5107h1.i(iVar.n())) == null)) {
            b10.b(i10);
        }
        P e10 = C5107h1.e(w10);
        if (e10 != null) {
            O l10 = e10.l();
            b10.g(v.h(l10.i().l()) * l10.b().getDensity() * l10.b().D1(), 0, 0, 0);
        }
        C5669i h10 = pVar.h();
        b10.d((int) h10.o(), (int) h10.r(), 0, 0, (int) h10.t(), (int) h10.n());
        return b10;
    }

    private final void D(p pVar) {
        if (o()) {
            G(pVar);
            d(pVar.o(), C(pVar));
            List<p> t10 = pVar.t();
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                D(t10.get(i10));
            }
        }
    }

    private final void E(p pVar) {
        if (o()) {
            f(pVar.o());
            List<p> t10 = pVar.t();
            int size = t10.size();
            for (int i10 = 0; i10 < size; i10++) {
                E(t10.get(i10));
            }
        }
    }

    private final void F() {
        this.f25008n.i();
        C5459o<C5104g1> j10 = j();
        int[] iArr = j10.f24634b;
        Object[] objArr = j10.f24635c;
        long[] jArr = j10.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            int i13 = (i10 << 3) + i12;
                            this.f25008n.t(iArr[i13], new C5101f1(((C5104g1) objArr[i13]).b(), j()));
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        this.f25009o = new C5101f1(this.f24995a.getSemanticsOwner().a(), j());
    }

    private final void G(p pVar) {
        L1.a aVar;
        C17642l lVar;
        C17642l lVar2;
        l w10 = pVar.w();
        Boolean bool = (Boolean) m.a(w10, s.f9010a.r());
        if (this.f25001g == a.SHOW_ORIGINAL && C17542s.e(bool, Boolean.TRUE)) {
            L1.a aVar2 = (L1.a) m.a(w10, k.f8953a.A());
            if (aVar2 != null && (lVar2 = (C17642l) aVar2.a()) != null) {
                Boolean bool2 = (Boolean) lVar2.invoke(Boolean.FALSE);
            }
        } else if (this.f25001g == a.SHOW_TRANSLATED && C17542s.e(bool, Boolean.FALSE) && (aVar = (L1.a) m.a(w10, k.f8953a.A())) != null && (lVar = (C17642l) aVar.a()) != null) {
            Boolean bool3 = (Boolean) lVar.invoke(Boolean.TRUE);
        }
    }

    private final void d(int i10, e eVar) {
        if (eVar != null) {
            if (this.f24999e.a(i10)) {
                this.f24999e.q(i10);
            } else {
                this.f24998d.t(i10, eVar);
            }
        }
    }

    private final void f(int i10) {
        if (this.f24998d.b(i10)) {
            this.f24998d.q(i10);
        } else {
            this.f24999e.f(i10);
        }
    }

    private final void g(C5459o<C5104g1> oVar) {
        int i10;
        C5459o<C5104g1> oVar2 = oVar;
        int[] iArr = oVar2.f24634b;
        long[] jArr = oVar2.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = iArr[(i11 << 3) + i14];
                            C5101f1 c10 = this.f25008n.c(i15);
                            C5104g1 c11 = oVar2.c(i15);
                            p b10 = c11 != null ? c11.b() : null;
                            if (b10 != null) {
                                if (c10 == null) {
                                    Iterator<Map.Entry<w<?>, Object>> it = b10.w().iterator();
                                    while (it.hasNext()) {
                                        Object key = it.next().getKey();
                                        s sVar = s.f9010a;
                                        if (C17542s.e(key, sVar.D())) {
                                            List list = (List) m.a(b10.w(), sVar.D());
                                            z(b10.o(), String.valueOf(list != null ? (C4669d) C16877v.y0(list) : null));
                                        }
                                    }
                                } else {
                                    Iterator<Map.Entry<w<?>, Object>> it2 = b10.w().iterator();
                                    while (it2.hasNext()) {
                                        s sVar2 = s.f9010a;
                                        if (C17542s.e((w) it2.next().getKey(), sVar2.D())) {
                                            List list2 = (List) m.a(c10.b(), sVar2.D());
                                            C4669d dVar = list2 != null ? (C4669d) C16877v.y0(list2) : null;
                                            List list3 = (List) m.a(b10.w(), sVar2.D());
                                            C4669d dVar2 = list3 != null ? (C4669d) C16877v.y0(list3) : null;
                                            if (!C17542s.e(dVar, dVar2)) {
                                                z(b10.o(), String.valueOf(dVar2));
                                            }
                                        }
                                    }
                                }
                                i10 = 8;
                            } else {
                                D1.a.c("no value for specified key");
                                throw new C16820k();
                            }
                        } else {
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                    }
                    if (i13 != i12) {
                        return;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    private final void h() {
        L1.a aVar;
        C17631a aVar2;
        C5459o<C5104g1> j10 = j();
        Object[] objArr = j10.f24635c;
        long[] jArr = j10.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            l w10 = ((C5104g1) objArr[(i10 << 3) + i12]).b().w();
                            if (!(m.a(w10, s.f9010a.r()) == null || (aVar = (L1.a) m.a(w10, k.f8953a.a())) == null || (aVar2 = (C17631a) aVar.a()) == null)) {
                                Boolean bool = (Boolean) aVar2.invoke();
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void i(C5492b bVar) {
        if (bVar.o()) {
            m0.k(bVar.f24995a, false, 1, (Object) null);
            bVar.A(bVar.f24995a.getSemanticsOwner().a(), bVar.f25009o);
            bVar.y(bVar.f24995a.getSemanticsOwner().a(), bVar.f25009o);
            bVar.g(bVar.j());
            bVar.F();
            bVar.f25010p = false;
        }
    }

    private final void m() {
        L1.a aVar;
        C17642l lVar;
        C5459o<C5104g1> j10 = j();
        Object[] objArr = j10.f24635c;
        long[] jArr = j10.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j11) < 128) {
                            l w10 = ((C5104g1) objArr[(i10 << 3) + i12]).b().w();
                            if (!(!C17542s.e(m.a(w10, s.f9010a.r()), Boolean.TRUE) || (aVar = (L1.a) m.a(w10, k.f8953a.A())) == null || (lVar = (C17642l) aVar.a()) == null)) {
                                Boolean bool = (Boolean) lVar.invoke(Boolean.FALSE);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void p() {
        androidx.compose.ui.platform.coreshims.c cVar = this.f24997c;
        if (cVar != null && Build.VERSION.SDK_INT >= 29) {
            long j10 = 255;
            char c10 = 7;
            if (this.f24998d.g()) {
                ArrayList arrayList = new ArrayList();
                E<e> e10 = this.f24998d;
                Object[] objArr = e10.f24635c;
                long[] jArr = e10.f24633a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j11 = jArr[i10];
                        long[] jArr2 = jArr;
                        if ((((~j11) << 7) & j11 & -9187201950435737472L) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j11 & j10) < 128) {
                                    arrayList.add((e) objArr[(i10 << 3) + i12]);
                                }
                                j11 >>= 8;
                                i12++;
                                j10 = 255;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        jArr = jArr2;
                        j10 = 255;
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList2.add(((e) arrayList.get(i13)).h());
                }
                cVar.d(arrayList2);
                this.f24998d.i();
            }
            if (this.f24999e.c()) {
                ArrayList arrayList3 = new ArrayList();
                F f10 = this.f24999e;
                int[] iArr = f10.f24640b;
                long[] jArr3 = f10.f24639a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr3[i14];
                        if ((((~j12) << c10) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & 255) < 128) {
                                    arrayList3.add(Integer.valueOf(iArr[(i14 << 3) + i16]));
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length2) {
                            break;
                        }
                        i14++;
                        c10 = 7;
                    }
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    arrayList4.add(Long.valueOf((long) ((Number) arrayList3.get(i17)).intValue()));
                }
                cVar.e(C16877v.u1(arrayList4));
                this.f24999e.h();
            }
        }
    }

    private final void q(G g10) {
        if (this.f25003i.add(g10)) {
            this.f25004j.k(C16807N.f139792a);
        }
    }

    private final void y(p pVar, C5101f1 f1Var) {
        List<p> t10 = pVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar2 = t10.get(i10);
            if (j().a(pVar2.o()) && !f1Var.a().a(pVar2.o())) {
                D(pVar2);
            }
        }
        E<C5101f1> e10 = this.f25008n;
        int[] iArr = e10.f24634b;
        long[] jArr = e10.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = iArr[(i11 << 3) + i13];
                            if (!j().a(i14)) {
                                f(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List<p> t11 = pVar.t();
        int size2 = t11.size();
        for (int i15 = 0; i15 < size2; i15++) {
            p pVar3 = t11.get(i15);
            if (j().a(pVar3.o()) && this.f25008n.a(pVar3.o())) {
                C5101f1 c10 = this.f25008n.c(pVar3.o());
                if (c10 != null) {
                    y(pVar3, c10);
                } else {
                    D1.a.c("node not present in pruned tree before this change");
                    throw new C16820k();
                }
            }
        }
    }

    private final void z(int i10, String str) {
        androidx.compose.ui.platform.coreshims.c cVar;
        if (Build.VERSION.SDK_INT >= 29 && (cVar = this.f24997c) != null) {
            AutofillId a10 = cVar.a((long) i10);
            if (a10 != null) {
                cVar.c(a10, str);
            } else {
                D1.a.c("Invalid content capture ID");
                throw new C16820k();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[Catch:{ all -> 0x0035 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super XH.C16807N> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof k1.C5492b.c
            if (r0 == 0) goto L_0x0013
            r0 = r10
            k1.b$c r0 = (k1.C5492b.c) r0
            int r1 = r0.f25017g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25017g = r1
            goto L_0x0018
        L_0x0013:
            k1.b$c r0 = new k1.b$c
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f25015e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f25017g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r2 = r0.f25014d
            SJ.l r2 = (SJ.C16436l) r2
            java.lang.Object r5 = r0.f25013c
            k1.b r5 = (k1.C5492b) r5
            XH.y.b(r10)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            r10 = r2
            goto L_0x0056
        L_0x0035:
            r10 = move-exception
            goto L_0x00a5
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0040:
            java.lang.Object r2 = r0.f25014d
            SJ.l r2 = (SJ.C16436l) r2
            java.lang.Object r5 = r0.f25013c
            k1.b r5 = (k1.C5492b) r5
            XH.y.b(r10)     // Catch:{ all -> 0x0035 }
            goto L_0x0066
        L_0x004c:
            XH.y.b(r10)
            SJ.j<XH.N> r10 = r9.f25004j     // Catch:{ all -> 0x00a3 }
            SJ.l r10 = r10.iterator()     // Catch:{ all -> 0x00a3 }
            r5 = r9
        L_0x0056:
            r0.f25013c = r5     // Catch:{ all -> 0x0035 }
            r0.f25014d = r10     // Catch:{ all -> 0x0035 }
            r0.f25017g = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r10.a(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r8 = r2
            r2 = r10
            r10 = r8
        L_0x0066:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0035 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x009b
            r2.next()     // Catch:{ all -> 0x0035 }
            boolean r10 = r5.o()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x007a
            r5.p()     // Catch:{ all -> 0x0035 }
        L_0x007a:
            boolean r10 = r5.f25010p     // Catch:{ all -> 0x0035 }
            if (r10 != 0) goto L_0x0087
            r5.f25010p = r4     // Catch:{ all -> 0x0035 }
            android.os.Handler r10 = r5.f25005k     // Catch:{ all -> 0x0035 }
            java.lang.Runnable r6 = r5.f25011q     // Catch:{ all -> 0x0035 }
            r10.post(r6)     // Catch:{ all -> 0x0035 }
        L_0x0087:
            j0.b<G1.G> r10 = r5.f25003i     // Catch:{ all -> 0x0035 }
            r10.clear()     // Catch:{ all -> 0x0035 }
            long r6 = r5.f25000f     // Catch:{ all -> 0x0035 }
            r0.f25013c = r5     // Catch:{ all -> 0x0035 }
            r0.f25014d = r2     // Catch:{ all -> 0x0035 }
            r0.f25017g = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r10 = QJ.C16297b0.b(r6, r0)     // Catch:{ all -> 0x0035 }
            if (r10 != r1) goto L_0x0033
            return r1
        L_0x009b:
            j0.b<G1.G> r10 = r5.f25003i
            r10.clear()
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x00a3:
            r10 = move-exception
            r5 = r9
        L_0x00a5:
            j0.b<G1.G> r0 = r5.f25003i
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C5492b.b(dI.e):java.lang.Object");
    }

    public final C5459o<C5104g1> j() {
        if (this.f25002h) {
            this.f25002h = false;
            this.f25006l = C5107h1.b(this.f24995a.getSemanticsOwner());
            this.f25007m = System.currentTimeMillis();
        }
        return this.f25006l;
    }

    public final AndroidComposeView k() {
        return this.f24995a;
    }

    public final boolean o() {
        return C5502l.f25020u0.a() && this.f24997c != null;
    }

    public void onStart(C5221y yVar) {
        this.f24997c = (androidx.compose.ui.platform.coreshims.c) this.f24996b.invoke();
        D(this.f24995a.getSemanticsOwner().a());
        p();
    }

    public void onStop(C5221y yVar) {
        E(this.f24995a.getSemanticsOwner().a());
        p();
        this.f24997c = null;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f25005k.removeCallbacks(this.f25011q);
        this.f24997c = null;
    }

    public final void r() {
        this.f25001g = a.SHOW_ORIGINAL;
        h();
    }

    public final void s(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        C0400b.f25012a.c(this, jArr, iArr, consumer);
    }

    public final void t() {
        this.f25001g = a.SHOW_ORIGINAL;
        m();
    }

    public final void u(G g10) {
        this.f25002h = true;
        if (o()) {
            q(g10);
        }
    }

    public final void v() {
        this.f25002h = true;
        if (o() && !this.f25010p) {
            this.f25010p = true;
            this.f25005k.post(this.f25011q);
        }
    }

    public final void w() {
        this.f25001g = a.SHOW_TRANSLATED;
        B();
    }

    public final void x(C5492b bVar, LongSparseArray<ViewTranslationResponse> longSparseArray) {
        C0400b.f25012a.d(bVar, longSparseArray);
    }
}
