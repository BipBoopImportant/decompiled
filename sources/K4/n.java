package K4;

import D2.o;
import QJ.C16324p;
import XH.C16807N;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"LK4/n;", "", "<init>", "()V", "LK4/a;", "deletionRequest", "LXH/N;", "a", "(LK4/a;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;LdI/e;)Ljava/lang/Object;", "trigger", "d", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "LK4/o;", "request", "e", "(LK4/o;LdI/e;)Ljava/lang/Object;", "LK4/p;", "f", "(LK4/p;LdI/e;)Ljava/lang/Object;", "", "b", "(LdI/e;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final b f37501a = new b((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"LK4/n$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LK4/n;", "a", "(Landroid/content/Context;)LK4/n;", "", "MEASUREMENT_API_STATE_DISABLED", "I", "MEASUREMENT_API_STATE_ENABLED", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final n a(Context context) {
            C17542s.j(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            H4.b bVar = H4.b.f36401a;
            sb2.append(bVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public abstract Object a(a aVar, C17164e<? super C16807N> eVar);

    public abstract Object b(C17164e<? super Integer> eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, C17164e<? super C16807N> eVar);

    public abstract Object d(Uri uri, C17164e<? super C16807N> eVar);

    public abstract Object e(o oVar, C17164e<? super C16807N> eVar);

    public abstract Object f(p pVar, C17164e<? super C16807N> eVar);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001aH@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0012H@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010*\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"LK4/n$a;", "LK4/n;", "Landroid/adservices/measurement/MeasurementManager;", "mMeasurementManager", "<init>", "(Landroid/adservices/measurement/MeasurementManager;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "LK4/a;", "request", "Landroid/adservices/measurement/DeletionRequest;", "k", "(LK4/a;)Landroid/adservices/measurement/DeletionRequest;", "LK4/o;", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "l", "(LK4/o;)Landroid/adservices/measurement/WebSourceRegistrationRequest;", "LK4/p;", "Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "m", "(LK4/p;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;", "deletionRequest", "LXH/N;", "a", "(LK4/a;LdI/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;LdI/e;)Ljava/lang/Object;", "trigger", "d", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "e", "(LK4/o;LdI/e;)Ljava/lang/Object;", "f", "(LK4/p;LdI/e;)Ljava/lang/Object;", "", "b", "(LdI/e;)Ljava/lang/Object;", "Landroid/adservices/measurement/MeasurementManager;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends n {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MeasurementManager f37502b;

        public a(MeasurementManager measurementManager) {
            C17542s.j(measurementManager, "mMeasurementManager");
            this.f37502b = measurementManager;
        }

        /* access modifiers changed from: private */
        public final DeletionRequest k(a aVar) {
            k.a();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            l.a();
            throw null;
        }

        /* access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            c.a();
            throw null;
        }

        public Object a(a aVar, C17164e<? super C16807N> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f37502b.deleteRegistrations(k(aVar), new m(), o.a(pVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        }

        public Object b(C17164e<? super Integer> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f37502b.getMeasurementApiStatus(new m(), o.a(pVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10;
        }

        public Object c(Uri uri, InputEvent inputEvent, C17164e<? super C16807N> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f37502b.registerSource(uri, inputEvent, new m(), o.a(pVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        }

        public Object d(Uri uri, C17164e<? super C16807N> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f37502b.registerTrigger(uri, new m(), o.a(pVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        }

        public Object e(o oVar, C17164e<? super C16807N> eVar) {
            C16324p pVar = new C16324p(C17187b.c(eVar), 1);
            pVar.C();
            this.f37502b.registerWebSource(l(oVar), new m(), o.a(pVar));
            Object w10 = pVar.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        }

        public Object f(p pVar, C17164e<? super C16807N> eVar) {
            C16324p pVar2 = new C16324p(C17187b.c(eVar), 1);
            pVar2.C();
            this.f37502b.registerWebTrigger(m(pVar), new m(), o.a(pVar2));
            Object w10 = pVar2.w();
            if (w10 == C17187b.f()) {
                h.c(eVar);
            }
            return w10 == C17187b.f() ? w10 : C16807N.f139792a;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C17542s.j(r2, r0)
                java.lang.Class r0 = K4.f.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = K4.g.a(r2)
                r1.<init>((android.adservices.measurement.MeasurementManager) r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: K4.n.a.<init>(android.content.Context):void");
        }
    }
}
