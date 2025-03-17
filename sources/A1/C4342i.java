package A1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R \u0010(\u001a\u00020#8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"LA1/i;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "LXH/N;", "a", "(Landroid/view/MotionEvent;)V", "h", "", "pointerId", "", "g", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "LA1/A;", "f", "(I)J", "b", "LA1/Q;", "positionCalculator", "index", "pressed", "LA1/E;", "d", "(LA1/Q;Landroid/view/MotionEvent;IZ)LA1/E;", "LA1/D;", "c", "(Landroid/view/MotionEvent;LA1/Q;)LA1/D;", "e", "(I)V", "", "J", "nextId", "Landroid/util/SparseLongArray;", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "motionEventToComposePointerIdMap", "Landroid/util/SparseBooleanArray;", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "", "Ljava/util/List;", "pointers", "I", "previousToolType", "previousSource", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.i  reason: case insensitive filesystem */
public final class C4342i {

    /* renamed from: a  reason: collision with root package name */
    private long f4409a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseLongArray f4410b = new SparseLongArray();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f4411c = new SparseBooleanArray();

    /* renamed from: d  reason: collision with root package name */
    private final List<E> f4412d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private int f4413e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f4414f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f4410b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f4410b;
                long j10 = this.f4409a;
                this.f4409a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    this.f4411c.put(pointerId, true);
                }
            }
        } else if (actionMasked == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (this.f4410b.indexOfKey(pointerId2) < 0) {
                SparseLongArray sparseLongArray2 = this.f4410b;
                long j11 = this.f4409a;
                this.f4409a = 1 + j11;
                sparseLongArray2.put(pointerId2, j11);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f4413e || source != this.f4414f) {
                this.f4413e = toolType;
                this.f4414f = source;
                this.f4411c.clear();
                this.f4410b.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final A1.E d(A1.Q r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            int r4 = r33.getPointerId(r34)
            long r6 = r0.f(r4)
            float r15 = r33.getPressure(r34)
            float r4 = r33.getX(r34)
            float r5 = r33.getY(r34)
            long r4 = o1.C5668h.a(r4, r5)
            r12 = 3
            r13 = 0
            r10 = 0
            r11 = 0
            r8 = r4
            long r21 = o1.C5667g.g(r8, r10, r11, r12, r13)
            if (r3 != 0) goto L_0x003e
            float r4 = r33.getRawX()
            float r5 = r33.getRawY()
            long r4 = o1.C5668h.a(r4, r5)
            long r8 = r1.u(r4)
        L_0x003b:
            r10 = r4
            r12 = r8
            goto L_0x0055
        L_0x003e:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L_0x004f
            A1.l r4 = A1.C4345l.f4415a
            long r4 = r4.a(r2, r3)
            long r8 = r1.u(r4)
            goto L_0x003b
        L_0x004f:
            long r8 = r1.z(r4)
            r12 = r4
            r10 = r8
        L_0x0055:
            int r1 = r33.getToolType(r34)
            if (r1 == 0) goto L_0x008c
            r4 = 1
            if (r1 == r4) goto L_0x0085
            r4 = 2
            if (r1 == r4) goto L_0x007e
            r4 = 3
            if (r1 == r4) goto L_0x0077
            r4 = 4
            if (r1 == r4) goto L_0x0070
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.e()
        L_0x006d:
            r16 = r1
            goto L_0x0093
        L_0x0070:
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.a()
            goto L_0x006d
        L_0x0077:
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.b()
            goto L_0x006d
        L_0x007e:
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.c()
            goto L_0x006d
        L_0x0085:
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.d()
            goto L_0x006d
        L_0x008c:
            A1.P$a r1 = A1.P.f4356a
            int r1 = r1.e()
            goto L_0x006d
        L_0x0093:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r33.getHistorySize()
            r1.<init>(r4)
            int r4 = r33.getHistorySize()
            r5 = 0
            r8 = r5
        L_0x00a2:
            if (r8 >= r4) goto L_0x00dd
            float r9 = r2.getHistoricalX(r3, r8)
            float r14 = r2.getHistoricalY(r3, r8)
            boolean r17 = java.lang.Float.isInfinite(r9)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isNaN(r9)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isInfinite(r14)
            if (r17 != 0) goto L_0x00da
            boolean r17 = java.lang.Float.isNaN(r14)
            if (r17 != 0) goto L_0x00da
            long r28 = o1.C5668h.a(r9, r14)
            A1.f r9 = new A1.f
            long r24 = r2.getHistoricalEventTime(r8)
            r30 = 0
            r23 = r9
            r26 = r28
            r23.<init>(r24, r26, r28, r30)
            r1.add(r9)
        L_0x00da:
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00dd:
            int r4 = r33.getActionMasked()
            r8 = 8
            if (r4 != r8) goto L_0x00fb
            r4 = 10
            float r4 = r2.getAxisValue(r4)
            r8 = 9
            float r8 = r2.getAxisValue(r8)
            float r8 = -r8
            r9 = 0
            float r8 = r8 + r9
            long r8 = o1.C5668h.a(r4, r8)
        L_0x00f8:
            r19 = r8
            goto L_0x0102
        L_0x00fb:
            o1.g$a r4 = o1.C5667g.f26701b
            long r8 = r4.c()
            goto L_0x00f8
        L_0x0102:
            android.util.SparseBooleanArray r4 = r0.f4411c
            int r3 = r33.getPointerId(r34)
            boolean r17 = r4.get(r3, r5)
            A1.E r3 = new A1.E
            r5 = r3
            long r8 = r33.getEventTime()
            r23 = 0
            r14 = r35
            r18 = r1
            r5.<init>(r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r21, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.C4342i.d(A1.Q, android.view.MotionEvent, int, boolean):A1.E");
    }

    private final long f(int i10) {
        long j10;
        int indexOfKey = this.f4410b.indexOfKey(i10);
        if (indexOfKey >= 0) {
            j10 = this.f4410b.valueAt(indexOfKey);
        } else {
            j10 = this.f4409a;
            this.f4409a = 1 + j10;
            this.f4410b.put(i10, j10);
        }
        return A.b(j10);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f4411c.get(pointerId, false)) {
                this.f4410b.delete(pointerId);
                this.f4411c.delete(pointerId);
            }
        }
        if (this.f4410b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f4410b.size() - 1; -1 < size; size--) {
                int keyAt = this.f4410b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.f4410b.removeAt(size);
                    this.f4411c.delete(keyAt);
                }
            }
        }
    }

    public final D c(MotionEvent motionEvent, Q q10) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f4410b.clear();
            this.f4411c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f4411c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f4412d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f4412d.add(d(q10, motionEvent, i10, !z10 && i10 != actionIndex && (!z11 || motionEvent.getButtonState() != 0)));
            i10++;
        }
        h(motionEvent);
        return new D(motionEvent.getEventTime(), this.f4412d, motionEvent);
    }

    public final void e(int i10) {
        this.f4411c.delete(i10);
        this.f4410b.delete(i10);
    }
}
