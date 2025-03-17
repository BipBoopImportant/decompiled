package p1;

import XH.C16807N;
import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s1.C5905c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0002\u000f\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lp1/K;", "Lp1/H0;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "d", "(Landroid/view/ViewGroup;)Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)J", "Ls1/c;", "a", "()Ls1/c;", "layer", "LXH/N;", "b", "(Ls1/c;)V", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "viewLayerContainer", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "componentCallback", "e", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class K implements H0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f27210e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static boolean f27211f = true;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f27212a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f27213b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private DrawChildContainer f27214c;

    /* renamed from: d  reason: collision with root package name */
    private final ComponentCallbacks2 f27215d = null;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp1/K$a;", "", "<init>", "()V", "", "enableLayerPersistence", "Z", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp1/K$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f27216a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public K(ViewGroup viewGroup) {
        this.f27212a = viewGroup;
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1;
    }

    private final DrawChildContainer d(ViewGroup viewGroup) {
        DrawChildContainer drawChildContainer = this.f27214c;
        if (drawChildContainer != null) {
            return drawChildContainer;
        }
        ViewLayerContainer viewLayerContainer = new ViewLayerContainer(viewGroup.getContext());
        viewGroup.addView(viewLayerContainer);
        this.f27214c = viewLayerContainer;
        return viewLayerContainer;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [androidx.compose.ui.graphics.layer.a] */
    /* JADX WARNING: type inference failed for: r2v8, types: [s1.D] */
    /* JADX WARNING: type inference failed for: r2v9, types: [s1.D] */
    /* JADX WARNING: type inference failed for: r2v10, types: [s1.e] */
    /* JADX WARNING: type inference failed for: r2v11, types: [s1.C] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s1.C5905c a() {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f27213b
            monitor-enter(r0)
            android.view.ViewGroup r1 = r12.f27212a     // Catch:{ all -> 0x001b }
            long r10 = r12.c(r1)     // Catch:{ all -> 0x001b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001b }
            r2 = 29
            if (r1 < r2) goto L_0x001d
            s1.C r1 = new s1.C     // Catch:{ all -> 0x001b }
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r3 = r10
            r2.<init>(r3, r5, r6, r7, r8)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x001b:
            r1 = move-exception
            goto L_0x0060
        L_0x001d:
            boolean r1 = f27211f     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0046
            s1.e r1 = new s1.e     // Catch:{ all -> 0x0030 }
            android.view.ViewGroup r3 = r12.f27212a     // Catch:{ all -> 0x0030 }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0058
        L_0x0030:
            r1 = 0
            f27211f = r1     // Catch:{ all -> 0x001b }
            s1.D r1 = new s1.D     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f27212a     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.view.DrawChildContainer r3 = r12.d(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
            goto L_0x0058
        L_0x0046:
            s1.D r1 = new s1.D     // Catch:{ all -> 0x001b }
            android.view.ViewGroup r2 = r12.f27212a     // Catch:{ all -> 0x001b }
            androidx.compose.ui.graphics.layer.view.DrawChildContainer r3 = r12.d(r2)     // Catch:{ all -> 0x001b }
            r8 = 12
            r9 = 0
            r6 = 0
            r7 = 0
            r2 = r1
            r4 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x001b }
        L_0x0058:
            s1.c r2 = new s1.c     // Catch:{ all -> 0x001b }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)
            return r2
        L_0x0060:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.K.a():s1.c");
    }

    public void b(C5905c cVar) {
        synchronized (this.f27213b) {
            cVar.H();
            C16807N n10 = C16807N.f139792a;
        }
    }
}
