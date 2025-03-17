package com.sugarcube.app.base.ui.compose.tutorial.data;

import YH.C16877v;
import YH.g0;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bJ\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0000J\b\u0010%\u001a\u00020&H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "", "stepNum", "", "<init>", "(Ljava/lang/String;II)V", "getStepNum", "()I", "HY_GET_READY_1", "HY_GET_READY_2", "HY_SCAN", "HY_SCAN_AGAIN", "UW_GET_READY_1", "UW_GET_READY_2", "UW_SCAN", "UW_SCAN_AGAIN", "HY_AR_GET_READY", "HY_AR_INIT", "HY_AR_PANO", "HY_AR_SCAN", "HY_AR_SCAN_AGAIN", "UW_AR_GET_READY_1", "UW_AR_GET_READY_2", "UW_AR_INIT", "UW_AR_SCAN", "UW_AR_SCAN_AGAIN", "isAR", "", "isLandscape", "isHybrid", "isUltrawide", "isHybridAR", "isUltrawideAR", "getStep", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;", "isFurtherThan", "stepEnum", "toString", "", "Companion", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum TutorialStepEnum {
    HY_GET_READY_1(1),
    HY_GET_READY_2(2),
    HY_SCAN(3),
    HY_SCAN_AGAIN(4),
    UW_GET_READY_1(1),
    UW_GET_READY_2(2),
    UW_SCAN(3),
    UW_SCAN_AGAIN(4),
    HY_AR_GET_READY(1),
    HY_AR_INIT(2),
    HY_AR_PANO(3),
    HY_AR_SCAN(4),
    HY_AR_SCAN_AGAIN(5),
    UW_AR_GET_READY_1(1),
    UW_AR_GET_READY_2(2),
    UW_AR_INIT(3),
    UW_AR_SCAN(4),
    UW_AR_SCAN_AGAIN(5);
    
    private static final Set<TutorialStepEnum> AR_STEPS = null;
    public static final Companion Companion = null;
    private static final Set<TutorialStepEnum> HYBRID_AR_STEPS = null;
    private static final Set<TutorialStepEnum> HYBRID_STEPS = null;
    private static final Set<TutorialStepEnum> LANDSCAPE_STEPS = null;
    private static final Set<TutorialStepEnum> ULTRAWIDE_AR_STEPS = null;
    private static final Set<TutorialStepEnum> ULTRAWIDE_STEPS = null;
    private final int stepNum;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum$Companion;", "", "<init>", "()V", "HYBRID_STEPS", "", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStepEnum;", "ULTRAWIDE_STEPS", "HYBRID_AR_STEPS", "ULTRAWIDE_AR_STEPS", "AR_STEPS", "LANDSCAPE_STEPS", "getStep", "enumString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TutorialStepEnum getStep(String str) {
            T t10;
            C17542s.j(str, "enumString");
            Iterator<T> it = TutorialStepEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((TutorialStepEnum) t10).name(), str)) {
                    break;
                }
            }
            return (TutorialStepEnum) t10;
        }

        private Companion() {
        }
    }

    static {
        TutorialStepEnum tutorialStepEnum;
        TutorialStepEnum tutorialStepEnum2;
        TutorialStepEnum tutorialStepEnum3;
        TutorialStepEnum tutorialStepEnum4;
        TutorialStepEnum tutorialStepEnum5;
        TutorialStepEnum tutorialStepEnum6;
        TutorialStepEnum tutorialStepEnum7;
        TutorialStepEnum tutorialStepEnum8;
        TutorialStepEnum tutorialStepEnum9;
        TutorialStepEnum tutorialStepEnum10;
        TutorialStepEnum tutorialStepEnum11;
        TutorialStepEnum tutorialStepEnum12;
        TutorialStepEnum tutorialStepEnum13;
        TutorialStepEnum tutorialStepEnum14;
        TutorialStepEnum tutorialStepEnum15;
        TutorialStepEnum tutorialStepEnum16;
        TutorialStepEnum tutorialStepEnum17;
        TutorialStepEnum tutorialStepEnum18;
        TutorialStepEnum[] $values;
        $ENTRIES = C17221b.a($values);
        Companion = new Companion((DefaultConstructorMarker) null);
        HYBRID_STEPS = g0.h(tutorialStepEnum, tutorialStepEnum2, tutorialStepEnum3, tutorialStepEnum4);
        Set<TutorialStepEnum> h10 = g0.h(tutorialStepEnum5, tutorialStepEnum6, tutorialStepEnum7, tutorialStepEnum8);
        ULTRAWIDE_STEPS = h10;
        Set<TutorialStepEnum> h11 = g0.h(tutorialStepEnum9, tutorialStepEnum10, tutorialStepEnum13, tutorialStepEnum11, tutorialStepEnum12);
        HYBRID_AR_STEPS = h11;
        Set<TutorialStepEnum> h12 = g0.h(tutorialStepEnum14, tutorialStepEnum15, tutorialStepEnum16, tutorialStepEnum18, tutorialStepEnum17);
        ULTRAWIDE_AR_STEPS = h12;
        AR_STEPS = C16877v.z1(h11, h12);
        LANDSCAPE_STEPS = C16877v.z1(h10, h12);
    }

    private TutorialStepEnum(int i10) {
        this.stepNum = i10;
    }

    public static C17220a<TutorialStepEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep getStep() {
        /*
            r5 = this;
            java.lang.Class<com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep> r0 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep.class
            uI.d r0 = kotlin.jvm.internal.P.b(r0)
            java.util.Collection r0 = r0.j()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()
            uI.d r2 = (uI.C18055d) r2
            java.lang.Object r2 = r2.p()
            boolean r4 = r2 instanceof com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep
            if (r4 == 0) goto L_0x0033
            r3 = r2
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r3 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep) r3
        L_0x0033:
            r1.add(r3)
            goto L_0x001b
        L_0x0037:
            java.util.Iterator r0 = r1.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r2 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep) r2
            if (r2 == 0) goto L_0x004f
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r2 = r2.getStepEnum()
            goto L_0x0050
        L_0x004f:
            r2 = r3
        L_0x0050:
            if (r2 != r5) goto L_0x003b
            r3 = r1
        L_0x0053:
            com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep r3 = (com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.getStep():com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep");
    }

    public final int getStepNum() {
        return this.stepNum;
    }

    public final boolean isAR() {
        Iterable<TutorialStepEnum> iterable = AR_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public final boolean isFurtherThan(TutorialStepEnum tutorialStepEnum) {
        C17542s.j(tutorialStepEnum, "stepEnum");
        return ((isHybrid() && tutorialStepEnum.isHybrid()) || ((isUltrawide() && tutorialStepEnum.isUltrawide()) || ((isHybridAR() && tutorialStepEnum.isHybridAR()) || (isUltrawideAR() && tutorialStepEnum.isUltrawideAR())))) && this.stepNum > tutorialStepEnum.stepNum;
    }

    public final boolean isHybrid() {
        Iterable<TutorialStepEnum> iterable = HYBRID_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public final boolean isHybridAR() {
        Iterable<TutorialStepEnum> iterable = HYBRID_AR_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public final boolean isLandscape() {
        Iterable<TutorialStepEnum> iterable = LANDSCAPE_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public final boolean isUltrawide() {
        Iterable<TutorialStepEnum> iterable = ULTRAWIDE_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public final boolean isUltrawideAR() {
        Iterable<TutorialStepEnum> iterable = ULTRAWIDE_AR_STEPS;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TutorialStepEnum tutorialStepEnum : iterable) {
            if (this == tutorialStepEnum) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return name();
    }
}
