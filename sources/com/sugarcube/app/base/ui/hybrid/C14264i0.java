package com.sugarcube.app.base.ui.hybrid;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import YH.C16870n;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import com.sugarcube.core.logger.AnyKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0006*\u00016\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u00102\u001a\u0004\u0018\u00010.8BX\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001d\u00105\u001a\u0004\u0018\u00010.8BX\u0002¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u00101R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010B\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010>R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010>R\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010>¨\u0006L"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/i0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "s", "(Landroid/hardware/SensorEvent;)V", "", "samplingPeriodUs", "Lkotlin/Function0;", "block", "v", "(ILnI/a;)V", "y", "()V", "", "angleChange", "origin", "j", "([F[F)V", "matrix", "k", "([F[F[F)V", "rotationMatrix", "", "m", "([F)J", "limit", "h", "(I)V", "timestamp", "Lcom/sugarcube/app/base/ui/hybrid/K0;", "p", "(J)Lcom/sugarcube/app/base/ui/hybrid/K0;", "o", "()Lcom/sugarcube/app/base/ui/hybrid/K0;", "Landroid/hardware/SensorManager;", "a", "LXH/o;", "q", "()Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", "b", "n", "()Landroid/hardware/Sensor;", "rotationVectorSensor", "c", "l", "gravitySensor", "com/sugarcube/app/base/ui/hybrid/i0$a", "d", "Lcom/sugarcube/app/base/ui/hybrid/i0$a;", "sensorEventListener", "e", "J", "gravityTime", "f", "[F", "gravityValues", "g", "rotationTime", "rotationValues", "i", "LnI/a;", "callback", "", "Ljava/util/List;", "collectedGravityTimes", "collectedGravityValues", "collectedRotationTimes", "collectedRotationValues", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.hybrid.i0  reason: case insensitive filesystem */
public final class C14264i0 {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f125028a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f125029b = C16825p.b(new C14256e0(this));

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f125030c = C16825p.b(new C14258f0(this));

    /* renamed from: d  reason: collision with root package name */
    private final a f125031d = new a(this);

    /* renamed from: e  reason: collision with root package name */
    private long f125032e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f125033f = {0.0f, 9.81f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private long f125034g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f125035h = new float[5];

    /* renamed from: i  reason: collision with root package name */
    private C17631a<C16807N> f125036i = new C14260g0();

    /* renamed from: j  reason: collision with root package name */
    private List<Long> f125037j;

    /* renamed from: k  reason: collision with root package name */
    private float[] f125038k;

    /* renamed from: l  reason: collision with root package name */
    private List<Long> f125039l;

    /* renamed from: m  reason: collision with root package name */
    private float[] f125040m;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/sugarcube/app/base/ui/hybrid/i0$a", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "LXH/N;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.i0$a */
    public static final class a implements SensorEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14264i0 f125041a;

        a(C14264i0 i0Var) {
            this.f125041a = i0Var;
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C17542s.j(sensorEvent, "event");
            this.f125041a.s(sensorEvent);
        }
    }

    public C14264i0(Context context) {
        C17542s.j(context, "context");
        this.f125028a = C16825p.b(new C14254d0(context));
    }

    /* access modifiers changed from: private */
    public static final C16807N g() {
        return C16807N.f139792a;
    }

    public static /* synthetic */ void i(C14264i0 i0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1000;
        }
        i0Var.h(i10);
    }

    private final Sensor l() {
        return (Sensor) this.f125030c.getValue();
    }

    private final Sensor n() {
        return (Sensor) this.f125029b.getValue();
    }

    private final SensorManager q() {
        return (SensorManager) this.f125028a.getValue();
    }

    /* access modifiers changed from: private */
    public static final Sensor r(C14264i0 i0Var) {
        return i0Var.q().getDefaultSensor(9);
    }

    /* access modifiers changed from: private */
    public final synchronized void s(SensorEvent sensorEvent) {
        try {
            int type = sensorEvent.sensor.getType();
            if (type == 9) {
                this.f125032e = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                C17542s.i(fArr, "values");
                C16870n.p(fArr, this.f125033f, 0, 0, 0, 14, (Object) null);
                List<Long> list = this.f125037j;
                if (list != null) {
                    int size = list.size() * 3;
                    float[] fArr2 = this.f125038k;
                    if (fArr2 != null && size < fArr2.length) {
                        list.add(Long.valueOf(sensorEvent.timestamp));
                        float[] fArr3 = sensorEvent.values;
                        C17542s.i(fArr3, "values");
                        C16870n.p(fArr3, fArr2, size, 0, 0, 12, (Object) null);
                    }
                }
            } else if (type == 11) {
                this.f125034g = sensorEvent.timestamp;
                float[] fArr4 = sensorEvent.values;
                C17542s.i(fArr4, "values");
                C16870n.p(fArr4, this.f125035h, 0, 0, 0, 14, (Object) null);
                List<Long> list2 = this.f125039l;
                if (list2 != null) {
                    int size2 = list2.size() * 5;
                    float[] fArr5 = this.f125040m;
                    if (fArr5 != null && size2 < fArr5.length) {
                        list2.add(Long.valueOf(sensorEvent.timestamp));
                        float[] fArr6 = sensorEvent.values;
                        C17542s.i(fArr6, "values");
                        C16870n.p(fArr6, fArr5, size2, 0, 0, 12, (Object) null);
                    }
                }
            }
            this.f125036i.invoke();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final Sensor t(C14264i0 i0Var) {
        return i0Var.q().getDefaultSensor(11);
    }

    /* access modifiers changed from: private */
    public static final SensorManager u(Context context) {
        Object systemService = context.getSystemService("sensor");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    public static /* synthetic */ void w(C14264i0 i0Var, int i10, C17631a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 10000;
        }
        if ((i11 & 2) != 0) {
            new C14262h0
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r2v2 ? I:com.sugarcube.app.base.ui.hybrid.h0) =  call: com.sugarcube.app.base.ui.hybrid.h0.<init>():void type: CONSTRUCTOR in method: com.sugarcube.app.base.ui.hybrid.i0.w(com.sugarcube.app.base.ui.hybrid.i0, int, nI.a, int, java.lang.Object):void, dex: classes5.dex
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
                com.sugarcube.app.base.ui.hybrid.h0 r2 = new com.sugarcube.app.base.ui.hybrid.h0
                r2.<init>()
            L_0x000f:
                r0.v(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.C14264i0.w(com.sugarcube.app.base.ui.hybrid.i0, int, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N x() {
            return C16807N.f139792a;
        }

        public final void h(int i10) {
            this.f125039l = new ArrayList();
            this.f125040m = new float[(i10 * 5)];
            this.f125037j = new ArrayList();
            this.f125038k = new float[(i10 * 3)];
        }

        public final void j(float[] fArr, float[] fArr2) {
            C17542s.j(fArr, "angleChange");
            C17542s.j(fArr2, "origin");
            float[] fArr3 = new float[16];
            m(fArr3);
            k(fArr, fArr2, fArr3);
        }

        public final void k(float[] fArr, float[] fArr2, float[] fArr3) {
            C17542s.j(fArr, "angleChange");
            C17542s.j(fArr2, "origin");
            C17542s.j(fArr3, "matrix");
            float[] fArr4 = new float[3];
            SensorManager.getAngleChange(fArr4, fArr3, fArr2);
            fArr[0] = -C14266j0.b(fArr4[2]);
            fArr[1] = -C14266j0.b(fArr4[1]);
            fArr[2] = -C14266j0.b(fArr4[0]);
        }

        public final synchronized long m(float[] fArr) {
            C17542s.j(fArr, "rotationMatrix");
            SensorManager.getRotationMatrixFromVector(fArr, this.f125035h);
            return this.f125034g;
        }

        public final synchronized K0 o() {
            long j10;
            float[] copyOf;
            long j11;
            float[] copyOf2;
            j10 = this.f125032e;
            float[] fArr = this.f125033f;
            copyOf = Arrays.copyOf(fArr, fArr.length);
            C17542s.i(copyOf, "copyOf(...)");
            j11 = this.f125034g;
            float[] fArr2 = this.f125035h;
            copyOf2 = Arrays.copyOf(fArr2, fArr2.length);
            C17542s.i(copyOf2, "copyOf(...)");
            return new K0(j10, copyOf, j11, copyOf2);
        }

        public final K0 p(long j10) {
            float[] fArr;
            int i10;
            float[] fArr2;
            int i11;
            long j11 = j10;
            K0 o10 = o();
            long a10 = o10.a();
            float[] b10 = o10.b();
            long d10 = o10.d();
            float[] e10 = o10.e();
            List<Long> list = this.f125037j;
            Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
            List<Long> list2 = this.f125039l;
            v vVar = new v(valueOf, list2 != null ? Integer.valueOf(list2.size()) : null);
            List<Long> list3 = this.f125037j;
            if (list3 != null) {
                float[] fArr3 = this.f125038k;
                if (fArr3 != null) {
                    Iterator it = list3.iterator();
                    i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i12 = i10 + 1;
                        long longValue = ((Number) it.next()).longValue();
                        if (j11 < longValue) {
                            int i13 = i10 * 3;
                            int i14 = i13 + 3;
                            if (i14 < fArr3.length) {
                                b10 = C16870n.t(fArr3, i13, i14);
                                a10 = longValue;
                            }
                        } else {
                            i10 = i12;
                        }
                    }
                }
                i10 = 0;
                fArr = b10;
            } else {
                fArr = b10;
                i10 = 0;
            }
            List<Long> list4 = this.f125039l;
            if (list4 != null) {
                float[] fArr4 = this.f125040m;
                if (fArr4 != null) {
                    Iterator it2 = list4.iterator();
                    i11 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        int i15 = i11 + 1;
                        long longValue2 = ((Number) it2.next()).longValue();
                        if (j11 < longValue2) {
                            int i16 = i11 * 5;
                            int i17 = i16 + 5;
                            if (i17 < fArr4.length) {
                                e10 = C16870n.t(fArr4, i16, i17);
                                d10 = longValue2;
                            }
                        } else {
                            i11 = i15;
                        }
                    }
                }
                i11 = 0;
                fArr2 = e10;
            } else {
                fArr2 = e10;
                i11 = 0;
            }
            Object c10 = vVar.c();
            Object d11 = vVar.d();
            Log.d(AnyKt.SUGARCUBE_TAG, "ts=" + j11 + " sensorData(g=" + i10 + "/" + c10 + "/" + a10 + "/" + (a10 - j11) + ",r=" + i11 + "/" + d11 + "/" + d10 + "/" + (d10 - j11) + ")");
            this.f125039l = null;
            this.f125040m = null;
            this.f125037j = null;
            this.f125038k = null;
            return new K0(a10, fArr, d10, fArr2);
        }

        public final void v(int i10, C17631a<C16807N> aVar) {
            C17542s.j(aVar, "block");
            this.f125036i = aVar;
            Sensor n10 = n();
            if (n10 != null) {
                q().registerListener(this.f125031d, n10, i10);
            }
            Sensor l10 = l();
            if (l10 != null) {
                q().registerListener(this.f125031d, l10, i10);
            }
        }

        public final void y() {
            Sensor n10 = n();
            if (n10 != null) {
                q().unregisterListener(this.f125031d, n10);
            }
            Sensor l10 = l();
            if (l10 != null) {
                q().unregisterListener(this.f125031d, l10);
            }
        }
    }
