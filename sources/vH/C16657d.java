package VH;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"LVH/d;", "", "", "controlFrame", "", "opcode", "<init>", "(Ljava/lang/String;IZI)V", "Z", "getControlFrame", "()Z", "I", "getOpcode", "()I", "Companion", "a", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: VH.d  reason: case insensitive filesystem */
public enum C16657d {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);
    
    public static final a Companion = null;
    private static final C16657d[] byOpcodeArray = null;
    private static final int maxOpcode = 0;
    private final boolean controlFrame;
    private final int opcode;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LVH/d$a;", "", "<init>", "()V", "", "LVH/d;", "byOpcodeArray", "[LVH/d;", "", "maxOpcode", "I", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VH.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        r10 = null;
     */
    static {
        /*
            VH.d r0 = new VH.d
            java.lang.String r1 = "TEXT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r2, r3)
            TEXT = r0
            VH.d r0 = new VH.d
            java.lang.String r1 = "BINARY"
            r4 = 2
            r0.<init>(r1, r3, r2, r4)
            BINARY = r0
            VH.d r0 = new VH.d
            java.lang.String r1 = "CLOSE"
            r5 = 8
            r0.<init>(r1, r4, r3, r5)
            CLOSE = r0
            VH.d r0 = new VH.d
            r1 = 3
            r4 = 9
            java.lang.String r5 = "PING"
            r0.<init>(r5, r1, r3, r4)
            PING = r0
            VH.d r0 = new VH.d
            r1 = 4
            r4 = 10
            java.lang.String r5 = "PONG"
            r0.<init>(r5, r1, r3, r4)
            PONG = r0
            VH.d[] r0 = a()
            $VALUES = r0
            VH.d$a r0 = new VH.d$a
            r1 = 0
            r0.<init>(r1)
            Companion = r0
            VH.d[] r0 = values()
            int r4 = r0.length
            if (r4 != 0) goto L_0x004f
            r4 = r1
            goto L_0x0076
        L_0x004f:
            r4 = r0[r2]
            int r5 = YH.C16870n.n0(r0)
            if (r5 != 0) goto L_0x0058
            goto L_0x0076
        L_0x0058:
            int r6 = r4.opcode
            tI.j r7 = new tI.j
            r7.<init>(r3, r5)
            YH.U r5 = r7.iterator()
        L_0x0063:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0076
            int r7 = r5.c()
            r7 = r0[r7]
            int r8 = r7.opcode
            if (r6 >= r8) goto L_0x0063
            r4 = r7
            r6 = r8
            goto L_0x0063
        L_0x0076:
            kotlin.jvm.internal.C17542s.g(r4)
            int r0 = r4.opcode
            maxOpcode = r0
            int r0 = r0 + r3
            VH.d[] r4 = new VH.C16657d[r0]
            r5 = r2
        L_0x0081:
            if (r5 >= r0) goto L_0x00a4
            VH.d[] r6 = values()
            int r7 = r6.length
            r10 = r1
            r8 = r2
            r9 = r8
        L_0x008b:
            if (r8 >= r7) goto L_0x009c
            r11 = r6[r8]
            int r12 = r11.opcode
            if (r12 != r5) goto L_0x0099
            if (r9 == 0) goto L_0x0097
        L_0x0095:
            r10 = r1
            goto L_0x009f
        L_0x0097:
            r9 = r3
            r10 = r11
        L_0x0099:
            int r8 = r8 + 1
            goto L_0x008b
        L_0x009c:
            if (r9 != 0) goto L_0x009f
            goto L_0x0095
        L_0x009f:
            r4[r5] = r10
            int r5 = r5 + 1
            goto L_0x0081
        L_0x00a4:
            byOpcodeArray = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: VH.C16657d.<clinit>():void");
    }

    private C16657d(boolean z10, int i10) {
        this.controlFrame = z10;
        this.opcode = i10;
    }
}
