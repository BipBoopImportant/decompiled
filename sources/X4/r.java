package x4;

import GJ.C15768k;
import YH.C16869m;
import YH.C16877v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*¨\u0006,"}, d2 = {"Lx4/r;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lx4/o;", "navController", "(Lx4/o;)V", "", "destId", "Lx4/v;", "d", "(I)Lx4/v;", "LXH/N;", "h", "()V", "c", "Landroid/os/Bundle;", "args", "f", "(ILandroid/os/Bundle;)Lx4/r;", "a", "e", "(Landroid/os/Bundle;)Lx4/r;", "Landroidx/core/app/B;", "b", "()Landroidx/core/app/B;", "Landroid/content/Context;", "Landroid/app/Activity;", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Lx4/x;", "Lx4/x;", "graph", "", "Lx4/r$a;", "Ljava/util/List;", "destinations", "Landroid/os/Bundle;", "globalArgs", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final Context f57652a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f57653b;

    /* renamed from: c  reason: collision with root package name */
    private final Intent f57654c;

    /* renamed from: d  reason: collision with root package name */
    private x f57655d;

    /* renamed from: e  reason: collision with root package name */
    private final List<a> f57656e;

    /* renamed from: f  reason: collision with root package name */
    private Bundle f57657f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lx4/r$a;", "", "", "destinationId", "Landroid/os/Bundle;", "arguments", "<init>", "(ILandroid/os/Bundle;)V", "a", "I", "b", "()I", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f57658a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f57659b;

        public a(int i10, Bundle bundle) {
            this.f57658a = i10;
            this.f57659b = bundle;
        }

        public final Bundle a() {
            return this.f57659b;
        }

        public final int b() {
            return this.f57658a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Context, Context> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f57660c = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C17542s.j(context, "it");
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper != null) {
                return contextWrapper.getBaseContext();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Landroid/app/Activity;", "a", "(Landroid/content/Context;)Landroid/app/Activity;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Context, Activity> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f57661c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final Activity invoke(Context context) {
            C17542s.j(context, "it");
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }
    }

    public r(Context context) {
        Intent intent;
        C17542s.j(context, "context");
        this.f57652a = context;
        Activity activity = (Activity) C15768k.L(C15768k.T(C15768k.q(context, b.f57660c), c.f57661c));
        this.f57653b = activity;
        if (activity != null) {
            intent = new Intent(context, activity.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f57654c = intent;
        this.f57656e = new ArrayList();
    }

    private final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        v vVar = null;
        for (a next : this.f57656e) {
            int b10 = next.b();
            Bundle a10 = next.a();
            v d10 = d(b10);
            if (d10 != null) {
                for (int valueOf : d10.p(vVar)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a10);
                }
                vVar = d10;
            } else {
                throw new IllegalArgumentException("Navigation destination " + v.f57671k.b(this.f57652a, b10) + " cannot be found in the navigation graph " + this.f57655d);
            }
        }
        this.f57654c.putExtra("android-support-nav:controller:deepLinkIds", C16877v.s1(arrayList));
        this.f57654c.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final v d(int i10) {
        C16869m mVar = new C16869m();
        x xVar = this.f57655d;
        C17542s.g(xVar);
        mVar.add(xVar);
        while (!mVar.isEmpty()) {
            v vVar = (v) mVar.removeFirst();
            if (vVar.x() == i10) {
                return vVar;
            }
            if (vVar instanceof x) {
                Iterator<v> it = ((x) vVar).iterator();
                while (it.hasNext()) {
                    mVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ r g(r rVar, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return rVar.f(i10, bundle);
    }

    private final void h() {
        for (a b10 : this.f57656e) {
            int b11 = b10.b();
            if (d(b11) == null) {
                String b12 = v.f57671k.b(this.f57652a, b11);
                throw new IllegalArgumentException("Navigation destination " + b12 + " cannot be found in the navigation graph " + this.f57655d);
            }
        }
    }

    public final r a(int i10, Bundle bundle) {
        this.f57656e.add(new a(i10, bundle));
        if (this.f57655d != null) {
            h();
        }
        return this;
    }

    public final B b() {
        if (this.f57655d == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else if (!this.f57656e.isEmpty()) {
            c();
            B i10 = B.m(this.f57652a).i(new Intent(this.f57654c));
            C17542s.i(i10, "create(context).addNextI…rentStack(Intent(intent))");
            int q10 = i10.q();
            for (int i11 = 0; i11 < q10; i11++) {
                Intent p10 = i10.p(i11);
                if (p10 != null) {
                    p10.putExtra("android-support-nav:controller:deepLinkIntent", this.f57654c);
                }
            }
            return i10;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
    }

    public final r e(Bundle bundle) {
        this.f57657f = bundle;
        this.f57654c.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final r f(int i10, Bundle bundle) {
        this.f57656e.clear();
        this.f57656e.add(new a(i10, bundle));
        if (this.f57655d != null) {
            h();
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(C8951o oVar) {
        this(oVar.F());
        C17542s.j(oVar, "navController");
        this.f57655d = oVar.L();
    }
}
