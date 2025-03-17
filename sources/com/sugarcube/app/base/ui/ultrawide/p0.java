package com.sugarcube.app.base.ui.ultrawide;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import XH.y;
import YE.C13868b;
import YE.e;
import YH.C16870n;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006*\u0001/\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u0004\u0018\u00010'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001d\u0010.\u001a\u0004\u0018\u00010'8BX\u0002¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010*R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0014\u0010<\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00108R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010=R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010@R\u0018\u0010B\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00108R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010?8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0018\u0010D\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00108¨\u0006E"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/p0;", "", "Landroidx/fragment/app/t;", "context", "<init>", "(Landroidx/fragment/app/t;)V", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "p", "(Landroid/hardware/SensorEvent;)V", "", "samplingPeriodUs", "Lkotlin/Function0;", "block", "s", "(ILnI/a;)V", "v", "()V", "limit", "h", "(I)V", "", "timestamp", "Lcom/sugarcube/app/base/ui/ultrawide/e;", "m", "(J)Lcom/sugarcube/app/base/ui/ultrawide/e;", "l", "()Lcom/sugarcube/app/base/ui/ultrawide/e;", "a", "Landroidx/fragment/app/t;", "getContext", "()Landroidx/fragment/app/t;", "Landroid/hardware/SensorManager;", "b", "LXH/o;", "n", "()Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "c", "k", "()Landroid/hardware/Sensor;", "rotationVectorSensor", "d", "j", "gravitySensor", "com/sugarcube/app/base/ui/ultrawide/p0$d", "e", "Lcom/sugarcube/app/base/ui/ultrawide/p0$d;", "sensorEventListener", "f", "J", "gravityTime", "", "g", "[F", "gravityValues", "rotationTime", "i", "rotationValues", "LnI/a;", "callback", "", "Ljava/util/List;", "collectedGravityTimes", "collectedGravityValues", "collectedRotationTimes", "collectedRotationValues", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5191t f125686a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f125687b = C16825p.b(new C14307k0(this));

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f125688c = C16825p.b(new C14309l0(this));

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f125689d = C16825p.b(new m0(this));

    /* renamed from: e  reason: collision with root package name */
    private final d f125690e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private long f125691f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f125692g = {9.81f, 0.0f, 0.0f};

    /* renamed from: h  reason: collision with root package name */
    private long f125693h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f125694i = new float[5];

    /* renamed from: j  reason: collision with root package name */
    private C17631a<C16807N> f125695j = new n0();

    /* renamed from: k  reason: collision with root package name */
    private List<Long> f125696k;

    /* renamed from: l  reason: collision with root package name */
    private float[] f125697l;

    /* renamed from: m  reason: collision with root package name */
    private List<Long> f125698m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f125699n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideSensor$getSensorData$3", f = "UltrawideSensor.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125700c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125701d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125701d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125700c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125701d, e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideSensor$getSensorData$4", f = "UltrawideSensor.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f125703d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125703d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125702c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125703d, e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideSensor$getSensorData$5", f = "UltrawideSensor.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125704c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125705d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f125705d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f125705d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125704c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125705d, e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/p0$d", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0 f125706a;

        d(p0 p0Var) {
            this.f125706a = p0Var;
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C17542s.j(sensorEvent, "event");
            this.f125706a.p(sensorEvent);
        }
    }

    public p0(C5191t tVar) {
        C17542s.j(tVar, "context");
        this.f125686a = tVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N g() {
        return C16807N.f139792a;
    }

    public static /* synthetic */ void i(p0 p0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1000;
        }
        p0Var.h(i10);
    }

    private final Sensor j() {
        return (Sensor) this.f125689d.getValue();
    }

    private final Sensor k() {
        return (Sensor) this.f125688c.getValue();
    }

    private final SensorManager n() {
        return (SensorManager) this.f125687b.getValue();
    }

    /* access modifiers changed from: private */
    public static final Sensor o(p0 p0Var) {
        return p0Var.n().getDefaultSensor(9);
    }

    /* access modifiers changed from: private */
    public final synchronized void p(SensorEvent sensorEvent) {
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 9) {
                this.f125691f = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                C17542s.i(fArr, "values");
                C16870n.p(fArr, this.f125692g, 0, 0, 0, 14, (Object) null);
                List<Long> list = this.f125696k;
                if (list != null) {
                    int size = list.size() * 3;
                    float[] fArr2 = this.f125697l;
                    if (fArr2 != null && size < fArr2.length) {
                        list.add(Long.valueOf(sensorEvent.timestamp));
                        float[] fArr3 = sensorEvent.values;
                        C17542s.i(fArr3, "values");
                        C16870n.p(fArr3, fArr2, size, 0, 0, 12, (Object) null);
                    }
                }
            } else if (type == 11) {
                this.f125693h = sensorEvent.timestamp;
                float[] fArr4 = sensorEvent.values;
                C17542s.i(fArr4, "values");
                C16870n.p(fArr4, this.f125694i, 0, 0, 0, 14, (Object) null);
                List<Long> list2 = this.f125698m;
                if (list2 != null) {
                    int size2 = list2.size() * 5;
                    float[] fArr5 = this.f125699n;
                    if (fArr5 != null && size2 < fArr5.length) {
                        list2.add(Long.valueOf(sensorEvent.timestamp));
                        float[] fArr6 = sensorEvent.values;
                        C17542s.i(fArr6, "values");
                        C16870n.p(fArr6, fArr5, size2, 0, 0, 12, (Object) null);
                    }
                }
            }
            this.f125695j.invoke();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final Sensor q(p0 p0Var) {
        return p0Var.n().getDefaultSensor(11);
    }

    /* access modifiers changed from: private */
    public static final SensorManager r(p0 p0Var) {
        Object systemService = p0Var.f125686a.getSystemService("sensor");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    public static /* synthetic */ void t(p0 p0Var, int i10, C17631a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10000;
        }
        if ((i11 & 2) != 0) {
            new o0
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r2v2 ? I:com.sugarcube.app.base.ui.ultrawide.o0) =  call: com.sugarcube.app.base.ui.ultrawide.o0.<init>():void type: CONSTRUCTOR in method: com.sugarcube.app.base.ui.ultrawide.p0.t(com.sugarcube.app.base.ui.ultrawide.p0, int, nI.a, int, java.lang.Object):void, dex: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r4 = r3 & 1
                if (r4 == 0) goto L_0x0006
                r1 = 10000(0x2710, float:1.4013E-41)
            L_0x0006:
                r3 = r3 & 2
                if (r3 == 0) goto L_0x000f
                com.sugarcube.app.base.ui.ultrawide.o0 r2 = new com.sugarcube.app.base.ui.ultrawide.o0
                r2.<init>()
            L_0x000f:
                r0.s(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.p0.t(com.sugarcube.app.base.ui.ultrawide.p0, int, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N u() {
            return C16807N.f139792a;
        }

        public final void h(int i10) {
            this.f125698m = new ArrayList();
            this.f125699n = new float[(i10 * 5)];
            this.f125696k = new ArrayList();
            this.f125697l = new float[(i10 * 3)];
        }

        public final synchronized C14294e l() {
            long j10;
            float[] copyOf;
            long j11;
            float[] copyOf2;
            j10 = this.f125691f;
            float[] fArr = this.f125692g;
            copyOf = Arrays.copyOf(fArr, fArr.length);
            C17542s.i(copyOf, "copyOf(...)");
            j11 = this.f125693h;
            float[] fArr2 = this.f125694i;
            copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
            C17542s.i(copyOf2, "copyOf(...)");
            return new C14294e(j10, copyOf, j11, copyOf2);
        }

        /* JADX WARNING: type inference failed for: r15v3, types: [java.util.List<java.lang.Long>, float[]] */
        /* JADX WARNING: type inference failed for: r15v6 */
        /* JADX WARNING: type inference failed for: r15v8 */
        public final synchronized C14294e m(long j10) {
            float[] fArr;
            float[] fArr2;
            int i10;
            int i11;
            int i12;
            float[] fArr3;
            ? r15;
            int i13;
            C14294e eVar;
            int i14;
            int i15;
            int i16;
            long j11;
            long j12;
            int i17;
            float[] fArr4;
            long j13 = j10;
            synchronized (this) {
                try {
                    C14294e l10 = l();
                    long a10 = l10.a();
                    long a11 = l10.a();
                    float[] b10 = l10.b();
                    long d10 = l10.d();
                    long d11 = l10.d();
                    float[] e10 = l10.e();
                    List<Long> list = this.f125696k;
                    Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
                    List<Long> list2 = this.f125698m;
                    v vVar = new v(valueOf, list2 != null ? Integer.valueOf(list2.size()) : null);
                    List<Long> list3 = this.f125696k;
                    long j14 = 0;
                    if (list3 == null || (fArr4 = this.f125697l) == null) {
                        fArr = e10;
                        long j15 = a10;
                        fArr2 = b10;
                        i11 = 0;
                        i10 = 0;
                    } else {
                        Iterator it = list3.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                fArr = e10;
                                long j16 = a10;
                                break;
                            }
                            int i19 = i18 + 1;
                            long longValue = ((Number) it.next()).longValue();
                            if (j13 < longValue) {
                                int i20 = i18 * 3;
                                fArr = e10;
                                int i21 = i20 + 3;
                                long j17 = a10;
                                if (i21 < fArr4.length) {
                                    b10 = C16870n.t(fArr4, i20, i21);
                                    a10 = longValue;
                                } else {
                                    a10 = j17;
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        i18 = 0;
                        i11 = i18 > 0 ? i18 - 1 : i18;
                        float[] fArr5 = b10;
                        i10 = i18;
                        a11 = i11 < list3.size() ? list3.get(i11).longValue() : 0;
                        fArr2 = fArr5;
                    }
                    List<Long> list4 = this.f125698m;
                    if (list4 != null) {
                        long j18 = d10;
                        float[] fArr6 = this.f125699n;
                        if (fArr6 != null) {
                            Iterator it2 = list4.iterator();
                            int i22 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                int i23 = i22 + 1;
                                long longValue2 = ((Number) it2.next()).longValue();
                                if (j13 < longValue2) {
                                    int i24 = i22 * 5;
                                    int i25 = i24 + 5;
                                    int i26 = i22;
                                    if (i25 < fArr6.length) {
                                        fArr = C16870n.t(fArr6, i24, i25);
                                        i16 = i26;
                                        j11 = longValue2;
                                    }
                                } else {
                                    i22 = i23;
                                }
                            }
                            j11 = j18;
                            i16 = 0;
                            if (i16 > 0) {
                                i17 = i16 - 1;
                                j12 = j11;
                            } else {
                                j12 = j11;
                                i17 = i16;
                            }
                            if (i17 < list4.size()) {
                                j14 = list4.get(i17).longValue();
                            }
                            i15 = i16;
                            d10 = j12;
                            long j19 = j14;
                            i14 = i17;
                            d11 = j19;
                        } else {
                            d10 = j18;
                            i15 = 0;
                            i14 = 0;
                        }
                        i12 = i15;
                        r15 = 0;
                        int i27 = i14;
                        fArr3 = fArr2;
                        i13 = i27;
                    } else {
                        long j20 = d10;
                        fArr3 = fArr2;
                        i13 = 0;
                        r15 = 0;
                        i12 = 0;
                    }
                    this.f125698m = r15;
                    this.f125699n = r15;
                    this.f125696k = r15;
                    this.f125697l = r15;
                    long j21 = d10;
                    long j22 = a10;
                    v vVar2 = vVar;
                    String str = "ts=" + j13 + " sensorData(g=" + i11 + "/" + vVar.c() + "/" + a11 + "/" + (a11 - j13) + ",r=" + i13 + "/" + vVar.d() + "/" + d11 + "/" + (d11 - j13) + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str);
                    F0 unused = C16314k.d(C5222z.a(this.f125686a), (C17168i) null, (T) null, new a(str, (C17164e<? super a>) null), 3, (Object) null);
                    Object c10 = vVar2.c();
                    Object d12 = vVar2.d();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ts=");
                    sb2.append(j13);
                    sb2.append(" sensorData(g=");
                    int i28 = i10;
                    sb2.append(i28);
                    sb2.append("/");
                    sb2.append(c10);
                    sb2.append("/");
                    long j23 = j22;
                    sb2.append(j23);
                    sb2.append("/");
                    sb2.append(j22 - j13);
                    sb2.append(",r=");
                    sb2.append(i12);
                    sb2.append("/");
                    sb2.append(d12);
                    sb2.append("/");
                    long j24 = j21;
                    sb2.append(j24);
                    sb2.append("/");
                    sb2.append(j21 - j13);
                    sb2.append(")");
                    String sb3 = sb2.toString();
                    Log.d(AnyKt.SUGARCUBE_TAG, sb3);
                    F0 unused2 = C16314k.d(C5222z.a(this.f125686a), (C17168i) null, (T) null, new b(sb3, (C17164e<? super b>) null), 3, (Object) null);
                    float[] a12 = q0.a(fArr3);
                    String str2 = "gravity[" + i28 + "]=[" + fArr3[0] + "," + fArr3[1] + "," + fArr3[2] + "],normalized=[" + a12[0] + "," + a12[1] + "," + a12[2] + "]";
                    Log.d(AnyKt.SUGARCUBE_TAG, str2);
                    F0 unused3 = C16314k.d(C5222z.a(this.f125686a), (C17168i) null, (T) null, new c(str2, (C17164e<? super c>) null), 3, (Object) null);
                    eVar = new C14294e(j23, fArr3, j24, fArr);
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            return eVar;
        }

        public final void s(int i10, C17631a<C16807N> aVar) {
            C17542s.j(aVar, "block");
            this.f125695j = aVar;
            Sensor k10 = k();
            if (k10 != null) {
                n().registerListener(this.f125690e, k10, i10);
            }
            Sensor j10 = j();
            if (j10 != null) {
                n().registerListener(this.f125690e, j10, i10);
            }
        }

        public final void v() {
            Sensor k10 = k();
            if (k10 != null) {
                n().unregisterListener(this.f125690e, k10);
            }
            Sensor j10 = j();
            if (j10 != null) {
                n().unregisterListener(this.f125690e, j10);
            }
        }
    }
