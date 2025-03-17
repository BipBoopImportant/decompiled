package com.sugarcube.app.base.ui.capturev2;

import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16870n;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import dI.C17164e;
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

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007*\u00011\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u0004\u0018\u00010)8BX\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\u0004\u0018\u00010)8BX\u0002¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010,R\u0014\u00104\u001a\u0002018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010?\u001a\u0002088\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010:R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010:R\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010DR\u0018\u0010H\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:¨\u0006I"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/U;", "", "Landroidx/fragment/app/t;", "activity", "Lcom/sugarcube/app/base/ui/capturev2/h1;", "model", "<init>", "(Landroidx/fragment/app/t;Lcom/sugarcube/app/base/ui/capturev2/h1;)V", "", "samplingPeriodUs", "Lkotlin/Function0;", "LXH/N;", "block", "v", "(ILnI/a;)V", "y", "()V", "Landroid/hardware/SensorEvent;", "event", "s", "(Landroid/hardware/SensorEvent;)V", "limit", "k", "(I)V", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "o", "()Lcom/sugarcube/app/base/ui/capturev2/R0;", "", "timestamp", "p", "(J)Lcom/sugarcube/app/base/ui/capturev2/R0;", "a", "Landroidx/fragment/app/t;", "b", "Lcom/sugarcube/app/base/ui/capturev2/h1;", "Landroid/hardware/SensorManager;", "c", "LXH/o;", "q", "()Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "d", "n", "()Landroid/hardware/Sensor;", "rotationVectorSensor", "e", "m", "gravitySensor", "com/sugarcube/app/base/ui/capturev2/U$b", "f", "Lcom/sugarcube/app/base/ui/capturev2/U$b;", "sensorEventListener", "g", "J", "gravityTime", "", "h", "[F", "gravityValues", "i", "rotationTime", "j", "rotationValues", "LnI/a;", "callback", "", "l", "Ljava/util/List;", "collectedGravityTimes", "collectedGravityValues", "collectedRotationTimes", "collectedRotationValues", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class U {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5191t f123611a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h1 f123612b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f123613c = C16825p.b(new O(this));

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f123614d = C16825p.b(new P(this));

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f123615e = C16825p.b(new Q(this));

    /* renamed from: f  reason: collision with root package name */
    private final b f123616f = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private long f123617g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f123618h;

    /* renamed from: i  reason: collision with root package name */
    private long f123619i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f123620j;

    /* renamed from: k  reason: collision with root package name */
    private C17631a<C16807N> f123621k;

    /* renamed from: l  reason: collision with root package name */
    private List<Long> f123622l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f123623m;

    /* renamed from: n  reason: collision with root package name */
    private List<Long> f123624n;

    /* renamed from: o  reason: collision with root package name */
    private float[] f123625o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.CaptureSensor$1", f = "CaptureSensor.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123626c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ U f123627d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/sugarcube/app/base/ui/capturev2/U$a$a", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "onPause", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.capturev2.U$a$a  reason: collision with other inner class name */
        public static final class C3037a implements C5205h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f123628a;

            C3037a(U u10) {
                this.f123628a = u10;
            }

            public void onPause(C5221y yVar) {
                C17542s.j(yVar, "owner");
                h1.R1(this.f123628a.f123612b, "CaptureSensor onPause", (Throwable) null, 2, (Object) null);
                this.f123628a.y();
            }

            public void onResume(C5221y yVar) {
                C17542s.j(yVar, "owner");
                h1.R1(this.f123628a.f123612b, "CaptureSensor onResume", (Throwable) null, 2, (Object) null);
                U.w(this.f123628a, 0, (C17631a) null, 3, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(U u10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123627d = u10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123627d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123626c == 0) {
                y.b(obj);
                this.f123627d.f123611a.getLifecycle().c(new C3037a(this.f123627d));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/sugarcube/app/base/ui/capturev2/U$b", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f123629a;

        b(U u10) {
            this.f123629a = u10;
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C17542s.j(sensorEvent, "event");
            U u10 = this.f123629a;
            synchronized (u10) {
                u10.s(sensorEvent);
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    public U(C5191t tVar, h1 h1Var) {
        C17542s.j(tVar, "activity");
        C17542s.j(h1Var, "model");
        this.f123611a = tVar;
        this.f123612b = h1Var;
        this.f123618h = h1Var.P() ? new float[]{9.81f, 0.0f, 0.0f} : new float[]{0.0f, 9.81f, 0.0f};
        this.f123620j = new float[5];
        this.f123621k = new S();
        F0 unused = C16314k.d(C5222z.a(tVar), C16311i0.c(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N j() {
        return C16807N.f139792a;
    }

    public static /* synthetic */ void l(U u10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1000;
        }
        u10.k(i10);
    }

    private final Sensor m() {
        return (Sensor) this.f123615e.getValue();
    }

    private final Sensor n() {
        return (Sensor) this.f123614d.getValue();
    }

    private final SensorManager q() {
        return (SensorManager) this.f123613c.getValue();
    }

    /* access modifiers changed from: private */
    public static final Sensor r(U u10) {
        SensorManager q10 = u10.q();
        if (q10 != null) {
            return q10.getDefaultSensor(9);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void s(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 9) {
            this.f123617g = sensorEvent.timestamp;
            float[] fArr = sensorEvent.values;
            C17542s.i(fArr, "values");
            C16870n.p(fArr, this.f123618h, 0, 0, 0, 14, (Object) null);
            List<Long> list = this.f123622l;
            if (list != null) {
                int size = list.size() * 3;
                float[] fArr2 = this.f123623m;
                if (fArr2 != null && size < fArr2.length) {
                    list.add(Long.valueOf(sensorEvent.timestamp));
                    float[] fArr3 = sensorEvent.values;
                    C17542s.i(fArr3, "values");
                    C16870n.p(fArr3, fArr2, size, 0, 0, 12, (Object) null);
                }
            }
        } else if (type == 11) {
            this.f123619i = sensorEvent.timestamp;
            float[] fArr4 = sensorEvent.values;
            C17542s.i(fArr4, "values");
            C16870n.p(fArr4, this.f123620j, 0, 0, 0, 14, (Object) null);
            List<Long> list2 = this.f123624n;
            if (list2 != null) {
                int size2 = list2.size() * 5;
                float[] fArr5 = this.f123625o;
                if (fArr5 != null && size2 < fArr5.length) {
                    list2.add(Long.valueOf(sensorEvent.timestamp));
                    float[] fArr6 = sensorEvent.values;
                    C17542s.i(fArr6, "values");
                    C16870n.p(fArr6, fArr5, size2, 0, 0, 12, (Object) null);
                }
            }
        }
        this.f123621k.invoke();
    }

    /* access modifiers changed from: private */
    public static final Sensor t(U u10) {
        SensorManager q10 = u10.q();
        if (q10 != null) {
            return q10.getDefaultSensor(11);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final SensorManager u(U u10) {
        Object systemService = u10.f123611a.getSystemService("sensor");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    private final void v(int i10, C17631a<C16807N> aVar) {
        SensorManager q10;
        SensorManager q11;
        this.f123621k = aVar;
        Sensor n10 = n();
        if (!(n10 == null || (q11 = q()) == null)) {
            q11.registerListener(this.f123616f, n10, i10);
        }
        Sensor m10 = m();
        if (m10 != null && (q10 = q()) != null) {
            q10.registerListener(this.f123616f, m10, i10);
        }
    }

    static /* synthetic */ void w(U u10, int i10, C17631a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10000;
        }
        if ((i11 & 2) != 0) {
            new T
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r2v2 ? I:com.sugarcube.app.base.ui.capturev2.T) =  call: com.sugarcube.app.base.ui.capturev2.T.<init>():void type: CONSTRUCTOR in method: com.sugarcube.app.base.ui.capturev2.U.w(com.sugarcube.app.base.ui.capturev2.U, int, nI.a, int, java.lang.Object):void, dex: classes5.dex
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
                com.sugarcube.app.base.ui.capturev2.T r2 = new com.sugarcube.app.base.ui.capturev2.T
                r2.<init>()
            L_0x000f:
                r0.v(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.U.w(com.sugarcube.app.base.ui.capturev2.U, int, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N x() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public final void y() {
            SensorManager q10;
            SensorManager q11;
            Sensor n10 = n();
            if (!(n10 == null || (q11 = q()) == null)) {
                q11.unregisterListener(this.f123616f, n10);
            }
            Sensor m10 = m();
            if (m10 != null && (q10 = q()) != null) {
                q10.unregisterListener(this.f123616f, m10);
            }
        }

        public final void k(int i10) {
            synchronized (this) {
                this.f123624n = new ArrayList();
                this.f123625o = new float[(i10 * 5)];
                this.f123622l = new ArrayList();
                this.f123623m = new float[(i10 * 3)];
                C16807N n10 = C16807N.f139792a;
            }
        }

        public final R0 o() {
            R0 r02;
            synchronized (this) {
                long j10 = this.f123617g;
                float[] fArr = this.f123618h;
                float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                C17542s.i(copyOf, "copyOf(...)");
                long j11 = this.f123619i;
                float[] fArr2 = this.f123620j;
                float[] copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
                C17542s.i(copyOf2, "copyOf(...)");
                r02 = new R0(j10, copyOf, j11, copyOf2);
            }
            return r02;
        }

        public final R0 p(long j10) {
            float[] fArr;
            long j11;
            float[] fArr2;
            R0 r02;
            float[] fArr3;
            float[] fArr4;
            float[] fArr5;
            long j12 = j10;
            synchronized (this) {
                try {
                    R0 o10 = o();
                    long a10 = o10.a();
                    float[] b10 = o10.b();
                    long d10 = o10.d();
                    float[] e10 = o10.e();
                    List<Long> list = this.f123622l;
                    if (list != null && (fArr5 = this.f123623m) != null) {
                        Iterator it = list.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i11 = i10 + 1;
                            long longValue = ((Number) it.next()).longValue();
                            if (j12 < longValue) {
                                int i12 = i10 * 3;
                                int i13 = i12 + 3;
                                fArr = e10;
                                if (i13 < fArr5.length) {
                                    b10 = C16870n.t(fArr5, i12, i13);
                                    a10 = longValue;
                                }
                                int i14 = i10 > 0 ? i10 - 1 : i10;
                                h1 h1Var = this.f123612b;
                                int size = list.size();
                                Long l10 = list.get(i14);
                                h1.R1(h1Var, "gravity [" + i10 + "/" + size + "] " + l10 + " < " + j12 + " < " + longValue, (Throwable) null, 2, (Object) null);
                            } else {
                                i10 = i11;
                            }
                        }
                    }
                    fArr = e10;
                    long j13 = a10;
                    float[] fArr6 = b10;
                    List<Long> list2 = this.f123624n;
                    if (list2 != null) {
                        float[] fArr7 = this.f123625o;
                        if (fArr7 != null) {
                            Iterator it2 = list2.iterator();
                            int i15 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                int i16 = i15 + 1;
                                long longValue2 = ((Number) it2.next()).longValue();
                                if (j12 < longValue2) {
                                    int i17 = i15 * 5;
                                    int i18 = i17 + 5;
                                    if (i18 < fArr7.length) {
                                        fArr4 = C16870n.t(fArr7, i17, i18);
                                        d10 = longValue2;
                                    } else {
                                        fArr4 = fArr;
                                    }
                                    int i19 = i15 > 0 ? i15 - 1 : i15;
                                    h1 h1Var2 = this.f123612b;
                                    int size2 = list2.size();
                                    Long l11 = list2.get(i19);
                                    h1.R1(h1Var2, "rotation [" + i15 + "/" + size2 + "] " + l11 + " < " + j12 + " < " + longValue2, (Throwable) null, 2, (Object) null);
                                    fArr3 = fArr4;
                                } else {
                                    i15 = i16;
                                }
                            }
                        }
                        fArr3 = fArr;
                        fArr2 = fArr3;
                        j11 = d10;
                    } else {
                        j11 = d10;
                        fArr2 = fArr;
                    }
                    this.f123624n = null;
                    this.f123625o = null;
                    this.f123622l = null;
                    this.f123623m = null;
                    r02 = new R0(j13, fArr6, j11, fArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return r02;
        }
    }
