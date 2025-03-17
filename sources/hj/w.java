package Hj;

import Gj.h;
import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16509F;
import TJ.C16511H;
import TJ.C16533h;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import XH.x;
import XH.y;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.activity.j;
import androidx.lifecycle.C5215s;
import com.ingka.ikea.app.scannerbase.googlevision.CameraPreview;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import ya.a;
import ya.b;
import za.b;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0014J \u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00172\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J6\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H@¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\u00122\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00120,H\u0007¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0012¢\u0006\u0004\b1\u0010\u0014J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010NR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000S8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020?8BX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010ZR\u0014\u0010#\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010&\u001a\u00020%8BX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000S8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"LHj/w;", "T", "", "Landroidx/lifecycle/s;", "coroutineScope", "Lya/b$b;", "Lza/a;", "detectorProcessor", "LHj/y;", "scannerFilterProcessorFactory", "LGj/h;", "scannerPermissionHandler", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "<init>", "(Landroidx/lifecycle/s;Lya/b$b;LHj/y;LGj/h;Landroid/content/Context;LQJ/M;)V", "LXH/N;", "k", "()V", "l", "w", "Lza/b;", "kotlin.jvm.PlatformType", "n", "(Landroid/content/Context;LdI/e;)Ljava/lang/Object;", "detector", "", "previewWidth", "previewHeight", "Lya/a;", "m", "(Landroid/content/Context;Lza/b;II)Lya/a;", "Landroid/view/View;", "root", "viewport", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;", "preview", "Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "overlay", "LTJ/F;", "s", "(Landroid/view/View;Landroid/view/View;Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;Lcom/ingka/ikea/app/scannerbase/googlevision/a;LdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "onFailure", "u", "(LnI/l;)V", "x", "t", "a", "Landroidx/lifecycle/s;", "b", "Lya/b$b;", "c", "LHj/y;", "d", "LGj/h;", "e", "Landroid/content/Context;", "f", "LQJ/M;", "LWj/c;", "g", "LWj/c;", "_filterProcessor", "h", "Landroid/view/View;", "_root", "i", "Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;", "_preview", "LHj/b;", "j", "LHj/b;", "startOnLayoutCallback", "LQJ/F0;", "LQJ/F0;", "initBarcodeDetectorJob", "Lza/b;", "barcodeDetector", "receivedDetectionsJob", "LTJ/A;", "LTJ/A;", "receivedDetections", "LQJ/N;", "o", "LQJ/N;", "onException", "()LWj/c;", "filterProcessor", "r", "()Landroid/view/View;", "p", "()Lcom/ingka/ikea/app/scannerbase/googlevision/CameraPreview;", "q", "()LTJ/A;", "result", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C5215s f81304a;

    /* renamed from: b  reason: collision with root package name */
    private final b.C0937b<za.a> f81305b;

    /* renamed from: c  reason: collision with root package name */
    private final y f81306c;

    /* renamed from: d  reason: collision with root package name */
    private final h f81307d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f81308e;

    /* renamed from: f  reason: collision with root package name */
    private final M f81309f;

    /* renamed from: g  reason: collision with root package name */
    private Wj.c f81310g;

    /* renamed from: h  reason: collision with root package name */
    private View f81311h;

    /* renamed from: i  reason: collision with root package name */
    private CameraPreview f81312i;

    /* renamed from: j  reason: collision with root package name */
    private C10721b f81313j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public F0 f81314k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public za.b f81315l;

    /* renamed from: m  reason: collision with root package name */
    private F0 f81316m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16504A<T> f81317n = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    /* renamed from: o  reason: collision with root package name */
    private final N f81318o = new c(N.f137593c0, this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Lza/b;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Lza/b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.Scanner$getBarcodeDetector$2", f = "Scanner.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super za.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f81320d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ w<T> f81321e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, w<T> wVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f81320d = context;
            this.f81321e = wVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f81320d, this.f81321e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super za.b> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f81319c == 0) {
                y.b(obj);
                za.b a10 = new b.a(this.f81320d).b(Vj.a.f88655c.b()).a();
                this.f81321e.f81315l = a10;
                return a10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.Scanner$init$2", f = "Scanner.kt", l = {89}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w<T> f81323d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ w<T> f81324a;

            a(w<T> wVar) {
                this.f81324a = wVar;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                Object emit = this.f81324a.f81317n.emit(t10, eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w<T> wVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f81323d = wVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f81323d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81322c;
            if (i10 == 0) {
                y.b(obj);
                C16504A<T> q10 = this.f81323d.q();
                a aVar = new a(this.f81323d);
                this.f81322c = 1;
                if (q10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Hj/w$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f81325a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, w wVar) {
            super(aVar);
            this.f81325a = wVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            w wVar = this.f81325a;
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = wVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.Scanner$startInternal$2", f = "Scanner.kt", l = {170}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81326c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w<T> f81327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(w<T> wVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f81327d = wVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f81327d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81326c;
            if (i10 == 0) {
                y.b(obj);
                w<T> wVar = this.f81327d;
                Context d10 = wVar.f81308e;
                this.f81326c = 1;
                obj = wVar.n(d10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w<T> wVar2 = this.f81327d;
            za.b bVar = (za.b) obj;
            bVar.e(wVar2.o());
            wVar2.o().c(false);
            View h10 = this.f81327d.r();
            v a10 = C16796C.a(kotlin.coroutines.jvm.internal.b.e(h10.getMeasuredWidth()), kotlin.coroutines.jvm.internal.b.e(h10.getMeasuredHeight()));
            int intValue = ((Number) a10.a()).intValue();
            int intValue2 = ((Number) a10.b()).intValue();
            w<T> wVar3 = this.f81327d;
            Context d11 = wVar3.f81308e;
            C17542s.g(bVar);
            this.f81327d.p().m(wVar3.m(d11, bVar, intValue, intValue2));
            this.f81327d.f81314k = null;
            return C16807N.f139792a;
        }
    }

    public w(C5215s sVar, b.C0937b<za.a> bVar, y yVar, h hVar, Context context, M m10) {
        C17542s.j(sVar, "coroutineScope");
        C17542s.j(bVar, "detectorProcessor");
        C17542s.j(yVar, "scannerFilterProcessorFactory");
        C17542s.j(hVar, "scannerPermissionHandler");
        C17542s.j(context, "context");
        C17542s.j(m10, "dispatcher");
        this.f81304a = sVar;
        this.f81305b = bVar;
        this.f81306c = yVar;
        this.f81307d = hVar;
        this.f81308e = context;
        this.f81309f = m10;
    }

    private final void k() {
        F0 f02 = this.f81316m;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f81316m = null;
        F0 f03 = this.f81314k;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        this.f81314k = null;
    }

    private final void l() {
        View view = this.f81311h;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f81313j);
        }
        this.f81313j = null;
    }

    /* access modifiers changed from: private */
    public final ya.a m(Context context, za.b bVar, int i10, int i11) {
        return new a.C0936a(context, bVar).c(0).e(i11, i10).b(true).d(30.0f).a();
    }

    /* access modifiers changed from: private */
    public final Object n(Context context, C17164e<? super za.b> eVar) {
        za.b bVar = this.f81315l;
        return bVar == null ? C16310i.g(this.f81309f, new a(context, this, (C17164e<? super a>) null), eVar) : bVar;
    }

    /* access modifiers changed from: private */
    public final Wj.c o() {
        Wj.c cVar = this.f81310g;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final CameraPreview p() {
        CameraPreview cameraPreview = this.f81312i;
        if (cameraPreview != null) {
            return cameraPreview;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final View r() {
        View view = this.f81311h;
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(w wVar, View view) {
        C17542s.j(view, "it");
        wVar.w();
        wVar.f81313j = null;
        return C16807N.f139792a;
    }

    private final void w() {
        if (p().h()) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Camera preview already running", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return;
        }
        F0 f02 = this.f81314k;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f81314k = C16314k.d(this.f81304a, this.f81318o, (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    public abstract C16504A<T> q();

    public final Object s(View view, View view2, CameraPreview cameraPreview, com.ingka.ikea.app.scannerbase.googlevision.a aVar, C17164e<? super C16509F<? extends T>> eVar) {
        this.f81311h = view;
        this.f81312i = cameraPreview;
        this.f81310g = this.f81306c.a(this.f81304a, view2, cameraPreview, aVar, this.f81305b);
        F0 f02 = this.f81316m;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f81316m = C16314k.d(this.f81304a, this.f81309f, (T) null, new b(this, (C17164e<? super b>) null), 2, (Object) null);
        return this.f81317n;
    }

    public final void t() {
        l();
        k();
        Wj.c cVar = this.f81310g;
        if (cVar != null) {
            cVar.c(true);
        }
        Wj.c cVar2 = this.f81310g;
        if (cVar2 != null) {
            cVar2.release();
        }
        this.f81310g = null;
        CameraPreview cameraPreview = this.f81312i;
        if (cameraPreview != null) {
            cameraPreview.k();
        }
        this.f81311h = null;
        this.f81312i = null;
        this.f81315l = null;
    }

    @SuppressLint({"MissingPermission"})
    public final void u(C17642l<? super Throwable, C16807N> lVar) {
        C17542s.j(lVar, "onFailure");
        h hVar = this.f81307d;
        Activity a10 = Xo.c.a(this.f81308e);
        j jVar = a10 instanceof j ? (j) a10 : null;
        if (jVar != null) {
            Object a11 = hVar.a(jVar);
            Throwable e10 = x.e(a11);
            if (e10 == null) {
                C16807N n10 = (C16807N) a11;
                if (r().isLaidOut()) {
                    l();
                    w();
                } else if (this.f81313j == null) {
                    C10721b bVar = new C10721b(new v(this));
                    r().addOnLayoutChangeListener(bVar);
                    this.f81313j = bVar;
                }
            } else {
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String message = e10.getMessage();
                        if (message == null) {
                            message = "Failed to start the scanner";
                        }
                        String a12 = C11818a.a(message, e10);
                        if (a12 == null) {
                            break;
                        }
                        str = C11820c.a(a12);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                lVar.invoke(e10);
            }
        } else {
            throw new IllegalArgumentException("Expected context is ComponentActivity, but was " + Xo.c.a(this.f81308e));
        }
    }

    public final void x() {
        Wj.c cVar = this.f81310g;
        if (cVar != null) {
            cVar.c(true);
        }
        l();
        CameraPreview cameraPreview = this.f81312i;
        if (cameraPreview != null) {
            cameraPreview.o();
        }
    }
}
