package Z0;

import U0.C0;
import b1.C5254a;
import b1.C5255b;
import b1.C5258e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 ]*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002{\u000fB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0002\u0010!J?\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J?\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J5\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/JQ\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u00105JK\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107JS\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u00109J]\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00028\u00002\u0006\u0010<\u001a\u00028\u00012\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b@\u0010AJ-\u0010B\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010-JA\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bC\u0010DJ%\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010E\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bL\u0010MJ-\u0010N\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bN\u0010OJ?\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bP\u0010QJ%\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bE\u0010RJ9\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\bU\u0010QJ?\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020W2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bY\u0010ZJ[\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0004H\u0002¢\u0006\u0004\b]\u0010^J#\u0010_\u001a\u00020\u00132\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b_\u0010`JW\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bb\u0010cJ_\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0001\u0010dJ\u000f\u0010e\u001a\u00020\u0004H\u0000¢\u0006\u0004\be\u0010^J\u0017\u0010f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bf\u0010\u0015J\u0017\u0010g\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010hJ#\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010&\u001a\u00020\u0004H\u0000¢\u0006\u0004\bj\u0010GJ%\u0010l\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bl\u0010mJ'\u0010n\u001a\u0004\u0018\u00018\u00012\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bn\u0010oJQ\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00103\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bp\u0010qJ;\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\br\u0010sJM\u0010t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bt\u0010uJ3\u0010v\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\bv\u0010wJG\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bx\u0010yJO\u0010z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010k\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\bz\u0010uR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010CR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010|R5\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u000e¢\u0006\r\n\u0004\b4\u0010~\u001a\u0005\b\u0010\u0001¨\u0006\u0001"}, d2 = {"LZ0/t;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Lb1/e;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Lb1/e;)V", "(II[Ljava/lang/Object;)V", "LZ0/t$b;", "b", "()LZ0/t$b;", "c", "positionMask", "", "r", "(I)Z", "keyIndex", "t", "(I)Ljava/lang/Object;", "W", "key", "value", "s", "(ILjava/lang/Object;Ljava/lang/Object;)LZ0/t;", "owner", "B", "(ILjava/lang/Object;Ljava/lang/Object;Lb1/e;)LZ0/t;", "(ILjava/lang/Object;)LZ0/t;", "LZ0/f;", "mutator", "M", "(ILjava/lang/Object;LZ0/f;)LZ0/t;", "nodeIndex", "newNode", "U", "(IILZ0/t;)LZ0/t;", "L", "(ILZ0/t;Lb1/e;)LZ0/t;", "S", "(II)LZ0/t;", "J", "(IILb1/e;)LZ0/t;", "newKeyHash", "newKey", "newValue", "shift", "d", "(IIILjava/lang/Object;Ljava/lang/Object;ILb1/e;)[Ljava/lang/Object;", "v", "(IIILjava/lang/Object;Ljava/lang/Object;I)LZ0/t;", "C", "(IIILjava/lang/Object;Ljava/lang/Object;ILb1/e;)LZ0/t;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "u", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILb1/e;)LZ0/t;", "R", "I", "(IILZ0/f;)LZ0/t;", "i", "j", "(I)LZ0/t;", "A", "(ILZ0/f;)LZ0/t;", "f", "(Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)LZ0/t$b;", "w", "(Ljava/lang/Object;Ljava/lang/Object;LZ0/f;)LZ0/t;", "(Ljava/lang/Object;)LZ0/t;", "y", "(Ljava/lang/Object;LZ0/f;)LZ0/t;", "z", "otherNode", "Lb1/b;", "intersectionCounter", "x", "(LZ0/t;Lb1/b;Lb1/e;)LZ0/t;", "F", "(LZ0/t;IILb1/b;LZ0/f;)LZ0/t;", "e", "()I", "l", "(LZ0/t;)Z", "targetNode", "T", "(LZ0/t;LZ0/t;II)LZ0/t;", "(LZ0/t;LZ0/t;IILb1/e;)LZ0/t;", "m", "q", "n", "(I)I", "O", "N", "keyHash", "k", "(ILjava/lang/Object;I)Z", "o", "(ILjava/lang/Object;I)Ljava/lang/Object;", "E", "(LZ0/t;ILb1/b;LZ0/f;)LZ0/t;", "P", "(ILjava/lang/Object;Ljava/lang/Object;I)LZ0/t$b;", "D", "(ILjava/lang/Object;Ljava/lang/Object;ILZ0/f;)LZ0/t;", "Q", "(ILjava/lang/Object;I)LZ0/t;", "G", "(ILjava/lang/Object;ILZ0/f;)LZ0/t;", "H", "a", "Lb1/e;", "<set-?>", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14940e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f14941f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final t f14942g = new t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    private int f14943a;

    /* renamed from: b  reason: collision with root package name */
    private int f14944b;

    /* renamed from: c  reason: collision with root package name */
    private final C5258e f14945c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f14946d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LZ0/t$a;", "", "<init>", "()V", "LZ0/t;", "", "EMPTY", "LZ0/t;", "a", "()LZ0/t;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f14942g;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LZ0/t$b;", "K", "V", "", "LZ0/t;", "node", "", "sizeDelta", "<init>", "(LZ0/t;I)V", "a", "LZ0/t;", "()LZ0/t;", "c", "(LZ0/t;)V", "b", "I", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private t<K, V> f14947a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14948b;

        public b(t<K, V> tVar, int i10) {
            this.f14947a = tVar;
            this.f14948b = i10;
        }

        public final t<K, V> a() {
            return this.f14947a;
        }

        public final int b() {
            return this.f14948b;
        }

        public final void c(t<K, V> tVar) {
            this.f14947a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, C5258e eVar) {
        this.f14943a = i10;
        this.f14944b = i11;
        this.f14945c = eVar;
        this.f14946d = objArr;
    }

    private final t<K, V> A(int i10, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.m(W(i10));
        if (this.f14946d.length == 2) {
            return null;
        }
        if (this.f14945c != fVar.k()) {
            return new t<>(0, 0, x.h(this.f14946d, i10), fVar.k());
        }
        this.f14946d = x.h(this.f14946d, i10);
        return this;
    }

    private final t<K, V> B(int i10, K k10, V v10, C5258e eVar) {
        int n10 = n(i10);
        if (this.f14945c == eVar) {
            this.f14946d = x.g(this.f14946d, n10, k10, v10);
            this.f14943a = i10 | this.f14943a;
            return this;
        }
        return new t<>(i10 | this.f14943a, this.f14944b, x.g(this.f14946d, n10, k10, v10), eVar);
    }

    private final t<K, V> C(int i10, int i11, int i12, K k10, V v10, int i13, C5258e eVar) {
        if (this.f14945c == eVar) {
            this.f14946d = d(i10, i11, i12, k10, v10, i13, eVar);
            this.f14943a ^= i11;
            this.f14944b |= i11;
            return this;
        }
        return new t<>(this.f14943a ^ i11, i11 | this.f14944b, d(i10, i11, i12, k10, v10, i13, eVar), eVar);
    }

    private final t<K, V> F(t<K, V> tVar, int i10, int i11, C5255b bVar, f<K, V> fVar) {
        t<K, V> tVar2 = tVar;
        int i12 = i10;
        C5255b bVar2 = bVar;
        int i13 = 0;
        if (r(i12)) {
            t<K, V> N10 = N(O(i12));
            if (tVar.r(i10)) {
                return N10.E(tVar2.N(tVar.O(i10)), i11 + 5, bVar2, fVar);
            }
            f<K, V> fVar2 = fVar;
            if (!tVar.q(i10)) {
                return N10;
            }
            int n10 = tVar.n(i10);
            K t10 = tVar2.t(n10);
            V W10 = tVar2.W(n10);
            int size = fVar.size();
            if (t10 != null) {
                i13 = t10.hashCode();
            }
            t<K, V> D10 = N10.D(i13, t10, W10, i11 + 5, fVar);
            if (fVar.size() != size) {
                return D10;
            }
            bVar2.c(bVar.a() + 1);
            return D10;
        }
        f<K, V> fVar3 = fVar;
        if (tVar.r(i10)) {
            t<K, V> N11 = tVar2.N(tVar.O(i10));
            if (q(i12)) {
                int n11 = n(i12);
                Object t11 = t(n11);
                int i14 = i11 + 5;
                if (N11.k(t11 != null ? t11.hashCode() : 0, t11, i14)) {
                    bVar2.c(bVar.a() + 1);
                } else {
                    Object W11 = W(n11);
                    if (t11 != null) {
                        i13 = t11.hashCode();
                    }
                    return N11.D(i13, t11, W11, i14, fVar);
                }
            }
            return N11;
        }
        int n12 = n(i12);
        Object t12 = t(n12);
        Object W12 = W(n12);
        int n13 = tVar.n(i10);
        K t13 = tVar2.t(n13);
        V W13 = tVar2.W(n13);
        int hashCode = t12 != null ? t12.hashCode() : 0;
        if (t13 != null) {
            i13 = t13.hashCode();
        }
        return u(hashCode, t12, W12, i13, t13, W13, i11 + 5, fVar.k());
    }

    private final t<K, V> I(int i10, int i11, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.m(W(i10));
        if (this.f14946d.length == 2) {
            return null;
        }
        if (this.f14945c == fVar.k()) {
            this.f14946d = x.h(this.f14946d, i10);
            this.f14943a ^= i11;
            return this;
        }
        return new t<>(i11 ^ this.f14943a, this.f14944b, x.h(this.f14946d, i10), fVar.k());
    }

    private final t<K, V> J(int i10, int i11, C5258e eVar) {
        Object[] objArr = this.f14946d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f14945c == eVar) {
            this.f14946d = x.i(objArr, i10);
            this.f14944b ^= i11;
            return this;
        }
        return new t<>(this.f14943a, i11 ^ this.f14944b, x.i(objArr, i10), eVar);
    }

    private final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, C5258e eVar) {
        return tVar2 == null ? J(i10, i11, eVar) : (this.f14945c == eVar || tVar != tVar2) ? L(i10, tVar2, eVar) : this;
    }

    private final t<K, V> L(int i10, t<K, V> tVar, C5258e eVar) {
        Object[] objArr = this.f14946d;
        if (objArr.length == 1 && tVar.f14946d.length == 2 && tVar.f14944b == 0) {
            tVar.f14943a = this.f14944b;
            return tVar;
        } else if (this.f14945c == eVar) {
            objArr[i10] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C17542s.i(copyOf, "copyOf(this, size)");
            copyOf[i10] = tVar;
            return new t<>(this.f14943a, this.f14944b, copyOf, eVar);
        }
    }

    private final t<K, V> M(int i10, V v10, f<K, V> fVar) {
        if (this.f14945c == fVar.k()) {
            this.f14946d[i10 + 1] = v10;
            return this;
        }
        fVar.l(fVar.h() + 1);
        Object[] objArr = this.f14946d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C17542s.i(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f14943a, this.f14944b, copyOf, fVar.k());
    }

    private final t<K, V> R(int i10, int i11) {
        Object[] objArr = this.f14946d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(i11 ^ this.f14943a, this.f14944b, x.h(objArr, i10));
    }

    private final t<K, V> S(int i10, int i11) {
        Object[] objArr = this.f14946d;
        if (objArr.length == 1) {
            return null;
        }
        return new t<>(this.f14943a, i11 ^ this.f14944b, x.i(objArr, i10));
    }

    private final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i10, int i11) {
        return tVar2 == null ? S(i10, i11) : tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    private final t<K, V> U(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f14946d;
        if (objArr.length != 2 || tVar.f14944b != 0) {
            Object[] objArr2 = this.f14946d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            copyOf[i10] = tVar;
            return new t<>(this.f14943a, this.f14944b, copyOf);
        } else if (this.f14946d.length == 1) {
            tVar.f14943a = this.f14944b;
            return tVar;
        } else {
            return new t<>(this.f14943a ^ i11, i11 ^ this.f14944b, x.k(this.f14946d, i10, n(i11), objArr[0], objArr[1]));
        }
    }

    private final t<K, V> V(int i10, V v10) {
        Object[] objArr = this.f14946d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C17542s.i(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = v10;
        return new t<>(this.f14943a, this.f14944b, copyOf);
    }

    private final V W(int i10) {
        return this.f14946d[i10 + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, K k10, V v10, int i13, C5258e eVar) {
        Object t10 = t(i10);
        int i14 = i11;
        int i15 = i10;
        return x.j(this.f14946d, i10, O(i11) + 1, u(t10 != null ? t10.hashCode() : 0, t10, W(i10), i12, k10, v10, i13 + 5, eVar));
    }

    private final int e() {
        if (this.f14944b == 0) {
            return this.f14946d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f14943a);
        int length = this.f14946d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += N(i10).e();
        }
        return bitCount;
    }

    private final boolean f(K k10) {
        C17972h v10 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (!C17542s.e(k10, this.f14946d[p10])) {
                if (p10 != q10) {
                    p10 += s10;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K k10) {
        C17972h v10 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 <= 0 || p10 > q10) && (s10 >= 0 || q10 > p10)) {
            return null;
        }
        while (!C17542s.e(k10, t(p10))) {
            if (p10 == q10) {
                return null;
            }
            p10 += s10;
        }
        return W(p10);
    }

    private final b<K, V> h(K k10, V v10) {
        C17972h v11 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v11.p();
        int q10 = v11.q();
        int s10 = v11.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (!C17542s.e(k10, t(p10))) {
                if (p10 != q10) {
                    p10 += s10;
                }
            }
            if (v10 == W(p10)) {
                return null;
            }
            Object[] objArr = this.f14946d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C17542s.i(copyOf, "copyOf(this, size)");
            copyOf[p10 + 1] = v10;
            return new t(0, 0, copyOf).c();
        }
        return new t(0, 0, x.g(this.f14946d, 0, k10, v10)).b();
    }

    private final t<K, V> i(K k10) {
        C17972h v10 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (!C17542s.e(k10, t(p10))) {
                if (p10 != q10) {
                    p10 += s10;
                }
            }
            return j(p10);
        }
        return this;
    }

    private final t<K, V> j(int i10) {
        Object[] objArr = this.f14946d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(0, 0, x.h(objArr, i10));
    }

    private final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f14944b != tVar.f14944b || this.f14943a != tVar.f14943a) {
            return false;
        }
        int length = this.f14946d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f14946d[i10] != tVar.f14946d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        return (i10 & this.f14944b) != 0;
    }

    private final t<K, V> s(int i10, K k10, V v10) {
        return new t<>(i10 | this.f14943a, this.f14944b, x.g(this.f14946d, n(i10), k10, v10));
    }

    private final K t(int i10) {
        return this.f14946d[i10];
    }

    private final t<K, V> u(int i10, K k10, V v10, int i11, K k11, V v11, int i12, C5258e eVar) {
        K k12 = k10;
        V v12 = v10;
        K k13 = k11;
        V v13 = v11;
        int i13 = i12;
        C5258e eVar2 = eVar;
        if (i13 > 30) {
            return new t<>(0, 0, new Object[]{k10, v12, k13, v13}, eVar2);
        }
        int i14 = i10;
        int f10 = x.f(i10, i13);
        int f11 = x.f(i11, i13);
        if (f10 != f11) {
            return new t<>((1 << f10) | (1 << f11), 0, f10 < f11 ? new Object[]{k12, v12, k13, v13} : new Object[]{k13, v13, k12, v12}, eVar2);
        }
        return new t<>(0, 1 << f10, new Object[]{u(i10, k10, v10, i11, k11, v11, i13 + 5, eVar)}, eVar2);
    }

    private final t<K, V> v(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new t<>(this.f14943a ^ i11, i11 | this.f14944b, d(i10, i11, i12, k10, v10, i13, (C5258e) null));
    }

    private final t<K, V> w(K k10, V v10, f<K, V> fVar) {
        C17972h v11 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v11.p();
        int q10 = v11.q();
        int s10 = v11.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (!C17542s.e(k10, t(p10))) {
                if (p10 != q10) {
                    p10 += s10;
                }
            }
            fVar.m(W(p10));
            if (this.f14945c == fVar.k()) {
                this.f14946d[p10 + 1] = v10;
                return this;
            }
            fVar.l(fVar.h() + 1);
            Object[] objArr = this.f14946d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C17542s.i(copyOf, "copyOf(this, size)");
            copyOf[p10 + 1] = v10;
            return new t<>(0, 0, copyOf, fVar.k());
        }
        fVar.o(fVar.size() + 1);
        return new t<>(0, 0, x.g(this.f14946d, 0, k10, v10), fVar.k());
    }

    private final t<K, V> x(t<K, V> tVar, C5255b bVar, C5258e eVar) {
        C5254a.a(this.f14944b == 0);
        C5254a.a(this.f14943a == 0);
        C5254a.a(tVar.f14944b == 0);
        C5254a.a(tVar.f14943a == 0);
        Object[] objArr = this.f14946d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f14946d.length);
        C17542s.i(copyOf, "copyOf(this, newSize)");
        int length = this.f14946d.length;
        C17972h v10 = C17978n.v(C17978n.w(0, tVar.f14946d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (true) {
                if (!f(tVar.f14946d[p10])) {
                    Object[] objArr2 = tVar.f14946d;
                    copyOf[length] = objArr2[p10];
                    copyOf[length + 1] = objArr2[p10 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (p10 == q10) {
                    break;
                }
                p10 += s10;
            }
        }
        if (length == this.f14946d.length) {
            return this;
        }
        if (length == tVar.f14946d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t<>(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C17542s.i(copyOf2, "copyOf(this, newSize)");
        return new t<>(0, 0, copyOf2, eVar);
    }

    private final t<K, V> y(K k10, f<K, V> fVar) {
        C17972h v10 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v10.p();
        int q10 = v10.q();
        int s10 = v10.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (!C17542s.e(k10, t(p10))) {
                if (p10 != q10) {
                    p10 += s10;
                }
            }
            return A(p10, fVar);
        }
        return this;
    }

    private final t<K, V> z(K k10, V v10, f<K, V> fVar) {
        C17972h v11 = C17978n.v(C17978n.w(0, this.f14946d.length), 2);
        int p10 = v11.p();
        int q10 = v11.q();
        int s10 = v11.s();
        if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
            while (true) {
                if (!C17542s.e(k10, t(p10)) || !C17542s.e(v10, W(p10))) {
                    if (p10 == q10) {
                        break;
                    }
                    p10 += s10;
                } else {
                    return A(p10, fVar);
                }
            }
        }
        return this;
    }

    public final t<K, V> D(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C17542s.e(k10, t(n10))) {
                fVar.m(W(n10));
                return W(n10) == v10 ? this : M(n10, v10, fVar);
            }
            fVar.o(fVar.size() + 1);
            return C(n10, f10, i10, k10, v10, i11, fVar.k());
        } else if (r(f10)) {
            int O10 = O(f10);
            t<K, V> N10 = N(O10);
            t<K, V> w10 = i11 == 30 ? N10.w(k10, v10, fVar) : N10.D(i10, k10, v10, i11 + 5, fVar);
            return N10 == w10 ? this : L(O10, w10, fVar.k());
        } else {
            fVar.o(fVar.size() + 1);
            return B(f10, k10, v10, fVar.k());
        }
    }

    public final t<K, V> E(t<K, V> tVar, int i10, C5255b bVar, f<K, V> fVar) {
        t<K, V> tVar2 = tVar;
        C5255b bVar2 = bVar;
        if (this == tVar2) {
            bVar2.b(e());
            return this;
        } else if (i10 > 30) {
            return x(tVar2, bVar2, fVar.k());
        } else {
            int i11 = this.f14944b | tVar2.f14944b;
            int i12 = this.f14943a;
            int i13 = tVar2.f14943a;
            int i14 = i12 & i13;
            int i15 = (i12 ^ i13) & (~i11);
            while (i14 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i14);
                if (C17542s.e(t(n(lowestOneBit)), tVar2.t(tVar2.n(lowestOneBit)))) {
                    i15 |= lowestOneBit;
                } else {
                    i11 |= lowestOneBit;
                }
                i14 ^= lowestOneBit;
            }
            int i16 = 0;
            if (!((i11 & i15) == 0)) {
                C0.b("Check failed.");
            }
            t tVar3 = (C17542s.e(this.f14945c, fVar.k()) && this.f14943a == i15 && this.f14944b == i11) ? this : new t(i15, i11, new Object[((Integer.bitCount(i15) * 2) + Integer.bitCount(i11))]);
            int i17 = i11;
            int i18 = 0;
            while (i17 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr = tVar3.f14946d;
                objArr[(objArr.length - 1) - i18] = F(tVar, lowestOneBit2, i10, bVar, fVar);
                i18++;
                i17 ^= lowestOneBit2;
            }
            while (i15 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i15);
                int i19 = i16 * 2;
                if (!tVar2.q(lowestOneBit3)) {
                    int n10 = n(lowestOneBit3);
                    tVar3.f14946d[i19] = t(n10);
                    tVar3.f14946d[i19 + 1] = W(n10);
                } else {
                    int n11 = tVar2.n(lowestOneBit3);
                    tVar3.f14946d[i19] = tVar2.t(n11);
                    tVar3.f14946d[i19 + 1] = tVar2.W(n11);
                    if (q(lowestOneBit3)) {
                        bVar2.c(bVar.a() + 1);
                    }
                }
                i16++;
                i15 ^= lowestOneBit3;
            }
            return l(tVar3) ? this : tVar2.l(tVar3) ? tVar2 : tVar3;
        }
    }

    public final t<K, V> G(int i10, K k10, int i11, f<K, V> fVar) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return C17542s.e(k10, t(n10)) ? I(n10, f10, fVar) : this;
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            t N10 = N(O10);
            return K(N10, i11 == 30 ? N10.y(k10, fVar) : N10.G(i10, k10, i11 + 5, fVar), O10, f10, fVar.k());
        }
    }

    public final t<K, V> H(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        K k11 = k10;
        V v11 = v10;
        int i12 = i11;
        f<K, V> fVar2 = fVar;
        int i13 = i10;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return (!C17542s.e(k10, t(n10)) || !C17542s.e(v10, W(n10))) ? this : I(n10, f10, fVar2);
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            t N10 = N(O10);
            return K(N10, i12 == 30 ? N10.z(k10, v10, fVar2) : N10.H(i10, k10, v10, i12 + 5, fVar), O10, f10, fVar.k());
        }
    }

    public final t<K, V> N(int i10) {
        Object obj = this.f14946d[i10];
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f14946d.length - 1) - Integer.bitCount((i10 - 1) & this.f14944b);
    }

    public final b<K, V> P(int i10, K k10, V v10, int i11) {
        b<K, V> bVar;
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (!C17542s.e(k10, t(n10))) {
                return v(n10, f10, i10, k10, v10, i11).b();
            }
            if (W(n10) == v10) {
                return null;
            }
            return V(n10, v10).c();
        } else if (!r(f10)) {
            return s(f10, k10, v10).b();
        } else {
            int O10 = O(f10);
            t N10 = N(O10);
            if (i11 == 30) {
                bVar = N10.h(k10, v10);
                if (bVar == null) {
                    return null;
                }
            } else {
                bVar = N10.P(i10, k10, v10, i11 + 5);
                if (bVar == null) {
                    return null;
                }
            }
            bVar.c(U(O10, f10, bVar.a()));
            return bVar;
        }
    }

    public final t<K, V> Q(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            return C17542s.e(k10, t(n10)) ? R(n10, f10) : this;
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            t N10 = N(O10);
            return T(N10, i11 == 30 ? N10.i(k10) : N10.Q(i10, k10, i11 + 5), O10, f10);
        }
    }

    public final boolean k(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            return C17542s.e(k10, t(n(f10)));
        }
        if (!r(f10)) {
            return false;
        }
        t N10 = N(O(f10));
        return i11 == 30 ? N10.f(k10) : N10.k(i10, k10, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f14943a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f14943a) * 2;
    }

    public final V o(int i10, K k10, int i11) {
        int f10 = 1 << x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C17542s.e(k10, t(n10))) {
                return W(n10);
            }
            return null;
        } else if (!r(f10)) {
            return null;
        } else {
            t N10 = N(O(f10));
            return i11 == 30 ? N10.g(k10) : N10.o(i10, k10, i11 + 5);
        }
    }

    public final Object[] p() {
        return this.f14946d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f14943a) != 0;
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, (C5258e) null);
    }
}
