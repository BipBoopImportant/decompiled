package io.ktor.utils.io;

import QJ.C16320n;
import QJ.F0;
import RH.C16368a;
import RH.C16374g;
import RH.C16376i;
import SH.C16416a;
import TH.C16492f;
import XH.C16807N;
import XH.C16814e;
import XH.C16820k;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.internal.g;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0010\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0004:\u0002\u0001B)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\n*\u00020\u000e2\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010&J+\u0010+\u001a\u00020\n2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J'\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b0\u00101J+\u00102\u001a\u00020\n2\u0006\u0010(\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u00020\n2\u0006\u0010(\u001a\u000204H@ø\u0001\u0000¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\u0012*\u00020\u000e2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\nH\u0002¢\u0006\u0004\b:\u0010;J#\u0010<\u001a\u00020\u0012*\u00020\u000e2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\nH\u0002¢\u0006\u0004\b<\u0010;J!\u0010?\u001a\u0004\u0018\u00010\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\u00020\n2\u0006\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\bH\u00101J+\u0010I\u001a\u00020\u00122\u0006\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bI\u00103J+\u0010J\u001a\u00020\n2\u0006\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bJ\u00103J/\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\n2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120LH@ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ#\u0010R\u001a\u00020P2\u0006\u0010Q\u001a\u00020P2\u0006\u0010*\u001a\u00020PH@ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001b\u0010V\u001a\u00020\u00122\u0006\u0010U\u001a\u00020TH@ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\n2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020T2\u0006\u0010Z\u001a\u00020PH\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020T2\u0006\u0010Z\u001a\u00020PH@ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0012H\u0002¢\u0006\u0004\b_\u0010\u001cJ\u000f\u0010`\u001a\u00020\u0012H\u0002¢\u0006\u0004\b`\u0010\u001cJ\u0019\u0010c\u001a\u00020\u00122\b\u0010b\u001a\u0004\u0018\u00010aH\u0002¢\u0006\u0004\bc\u0010dJ\u001b\u0010f\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bh\u0010gJ%\u0010k\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\n2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050iH\u0002¢\u0006\u0004\bk\u0010gJ\u001b\u0010l\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bl\u0010gJ\u000f\u0010m\u001a\u00020\u0005H\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\nH\u0002¢\u0006\u0004\bo\u0010pJ\u001b\u0010q\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\bq\u0010gJ%\u0010t\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\n2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00120rH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\bH\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\bH\u0002¢\u0006\u0004\by\u0010zJ\u000f\u0010|\u001a\u00020{H\u0000¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u001a\u00020~H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00052\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00052\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010\u001cJ\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0005\b\u0001\u0010\u001aJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u0001\u0010\u001cJ\u0011\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0005\b\u0001\u0010nJ-\u0010\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00103J\u001d\u0010\u0001\u001a\u00020\n2\u0006\u0010(\u001a\u000204H@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00106J\u0012\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\u00122\u0006\u0010A\u001a\u00020'H@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010CJ0\u0010\u0001\u001a\u00020P2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020P2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH@ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\u00122\u0006\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00103J-\u0010\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u00020-2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00103J.\u0010\u0001\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120LH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J1\u0010\u0001\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\n2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120LH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010OJ\u001d\u0010\u0001\u001a\u00020P2\u0006\u0010*\u001a\u00020PH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010^J\u001d\u0010\u0001\u001a\u00020\u00122\u0006\u0010U\u001a\u00020TH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010WJ\u001d\u0010\u0001\u001a\u00020T2\u0006\u0010Z\u001a\u00020PH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010^J\u001d\u0010\u0001\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010gJ\u0013\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010nR\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\bs\u0010\u0001R\u001e\u0010\u000b\u001a\u00020\n8\u0000X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0019\u0010>\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b>\u0010¢\u0001R\u0019\u0010¤\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0001R\u0019\u0010¥\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R2\u0010©\u0001\u001a\u00020P2\u0007\u0010¨\u0001\u001a\u00020P8\u0016@PX\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R2\u0010¯\u0001\u001a\u00020P2\u0007\u0010¨\u0001\u001a\u00020P8\u0016@PX\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010ª\u0001\u001a\u0006\b\u0001\u0010¬\u0001\"\u0006\b°\u0001\u0010®\u0001R\u001f\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0004¢\u0006\u000f\n\u0006\b\u0001\u0010²\u0001\u0012\u0005\b³\u0001\u0010\u001cR\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¹\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010º\u0001R\u001e\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120¹\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010º\u0001R\u0019\u0010½\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u0001R)\u0010¿\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120i\u0012\u0004\u0012\u00020\u00040L8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¾\u0001R\u0016\u0010Á\u0001\u001a\u00020{8BX\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010}R0\u0010È\u0001\u001a\u0005\u0018\u00010Â\u00012\n\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018B@BX\u000e¢\u0006\u0010\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R:\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010i2\u000f\u0010Ã\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010i8B@BX\u000e¢\u0006\u0010\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R:\u0010Ð\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010i2\u000f\u0010Ã\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010i8B@BX\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010Ê\u0001\"\u0006\bÏ\u0001\u0010Ì\u0001R\u0017\u0010Ñ\u0001\u001a\u00020\n8VX\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¡\u0001R\u0016\u0010Ó\u0001\u001a\u00020\u00058VX\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010nR\u0016\u0010Ô\u0001\u001a\u00020\u00058VX\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010nR\u0018\u0010Ö\u0001\u001a\u0004\u0018\u00010a8VX\u0004¢\u0006\u0007\u001a\u0005\bs\u0010Õ\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006×\u0001"}, d2 = {"Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "", "autoFlush", "LTH/f;", "Lio/ktor/utils/io/internal/g$c;", "pool", "", "reservedSize", "<init>", "(ZLTH/f;I)V", "Ljava/nio/ByteBuffer;", "content", "(Ljava/nio/ByteBuffer;)V", "minWriteSize", "LXH/N;", "U", "(I)V", "position", "available", "c0", "(Ljava/nio/ByteBuffer;II)V", "B0", "()Ljava/nio/ByteBuffer;", "t0", "()V", "Lio/ktor/utils/io/internal/d;", "joined", "F0", "(Lio/ktor/utils/io/internal/d;)Z", "forceTermination", "G0", "(Z)Z", "idx", "O", "(Ljava/nio/ByteBuffer;I)I", "LRH/a;", "dst", "consumed", "max", "d0", "(LRH/a;II)I", "", "offset", "length", "e0", "([BII)I", "j0", "([BIILdI/e;)Ljava/lang/Object;", "LSH/a;", "i0", "(LSH/a;LdI/e;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/i;", "capacity", "count", "N", "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;I)V", "M", "current", "joining", "s0", "(Lio/ktor/utils/io/a;Lio/ktor/utils/io/internal/d;)Lio/ktor/utils/io/a;", "src", "S0", "(LRH/a;LdI/e;)Ljava/lang/Object;", "T", "(Lio/ktor/utils/io/internal/d;)V", "L0", "(LRH/a;)I", "M0", "T0", "X0", "min", "Lkotlin/Function1;", "block", "L", "(ILnI/l;LdI/e;)Ljava/lang/Object;", "", "discarded0", "S", "(JJLdI/e;)Ljava/lang/Object;", "LRH/k;", "packet", "V0", "(LRH/k;LdI/e;)Ljava/lang/Object;", "I0", "(LRH/k;)I", "limit", "q0", "(J)LRH/k;", "l0", "(JLdI/e;)Ljava/lang/Object;", "w0", "x0", "", "cause", "v0", "(Ljava/lang/Throwable;)V", "size", "m0", "(ILdI/e;)Ljava/lang/Object;", "o0", "LdI/e;", "continuation", "E0", "n0", "D0", "()Z", "Z0", "(I)Z", "W0", "LQJ/n;", "c", "Y0", "(ILQJ/n;)V", "b0", "()Lio/ktor/utils/io/internal/g$c;", "buffer", "p0", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g;", "Q", "()Lio/ktor/utils/io/internal/g;", "LQJ/F0;", "job", "f", "(LQJ/F0;)V", "a", "(Ljava/lang/Throwable;)Z", "p", "flush", "C0", "u0", "H0", "j", "g", "r0", "()Lio/ktor/utils/io/a;", "k", "P", "(Lio/ktor/utils/io/a;JLio/ktor/utils/io/internal/d;LdI/e;)Ljava/lang/Object;", "l", "O0", "N0", "(ILnI/l;)I", "b", "i", "n", "d", "J0", "", "toString", "()Ljava/lang/String;", "Z", "o", "LTH/f;", "I", "getReservedSize$ktor_io", "()I", "Lio/ktor/utils/io/internal/d;", "e", "readPosition", "writePosition", "attachedJob", "LQJ/F0;", "<set-?>", "totalBytesRead", "J", "Y", "()J", "z0", "(J)V", "totalBytesWritten", "A0", "Lio/ktor/utils/io/internal/f;", "Lio/ktor/utils/io/internal/f;", "getReadSession$annotations", "readSession", "Lio/ktor/utils/io/internal/l;", "h", "Lio/ktor/utils/io/internal/l;", "writeSession", "Lio/ktor/utils/io/internal/b;", "Lio/ktor/utils/io/internal/b;", "readSuspendContinuationCache", "writeSuspendContinuationCache", "writeSuspensionSize", "LnI/l;", "writeSuspension", "X", "state", "Lio/ktor/utils/io/internal/c;", "value", "V", "()Lio/ktor/utils/io/internal/c;", "setClosed", "(Lio/ktor/utils/io/internal/c;)V", "closed", "W", "()LdI/e;", "y0", "(LdI/e;)V", "readOp", "a0", "setWriteOp", "writeOp", "availableForRead", "m", "isClosedForRead", "isClosedForWrite", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a implements c, g, j {

    /* renamed from: l  reason: collision with root package name */
    public static final C3506a f143531l = new C3506a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143532m;

    /* renamed from: n  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143533n;

    /* renamed from: o  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143534o;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f143535p;
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    /* access modifiers changed from: private */
    public volatile F0 attachedJob;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f143536b;

    /* renamed from: c  reason: collision with root package name */
    private final C16492f<g.c> f143537c;

    /* renamed from: d  reason: collision with root package name */
    private final int f143538d;

    /* renamed from: e  reason: collision with root package name */
    private int f143539e;

    /* renamed from: f  reason: collision with root package name */
    private int f143540f;

    /* renamed from: g  reason: collision with root package name */
    private final io.ktor.utils.io.internal.f f143541g;

    /* renamed from: h  reason: collision with root package name */
    private final io.ktor.utils.io.internal.l f143542h;

    /* renamed from: i  reason: collision with root package name */
    private final io.ktor.utils.io.internal.b<Boolean> f143543i;

    /* renamed from: j  reason: collision with root package name */
    private final io.ktor.utils.io.internal.b<C16807N> f143544j;
    private volatile io.ktor.utils.io.internal.d joining;

    /* renamed from: k  reason: collision with root package name */
    private final C17642l<C17164e<? super C16807N>, Object> f143545k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    /* access modifiers changed from: private */
    public volatile int writeSuspensionSize;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/a$a;", "", "<init>", "()V", "", "ReservedLongIndex", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.a$a  reason: collision with other inner class name */
    public static final class C3506a {
        public /* synthetic */ C3506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3506a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f143546c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f143546c = aVar;
        }

        public final void a(Throwable th2) {
            this.f143546c.attachedJob = null;
            if (th2 != null) {
                this.f143546c.p(s.a(th2));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1512, 1513}, m = "awaitFreeSpaceOrDelegate")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143547c;

        /* renamed from: d  reason: collision with root package name */
        Object f143548d;

        /* renamed from: e  reason: collision with root package name */
        int f143549e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143550f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f143551g;

        /* renamed from: h  reason: collision with root package name */
        int f143552h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f143551g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143550f = obj;
            this.f143552h |= Integer.MIN_VALUE;
            return this.f143551g.L(0, (C17642l<? super ByteBuffer, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1200, 1271, 1279}, m = "copyDirect$ktor_io")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143553c;

        /* renamed from: d  reason: collision with root package name */
        Object f143554d;

        /* renamed from: e  reason: collision with root package name */
        Object f143555e;

        /* renamed from: f  reason: collision with root package name */
        Object f143556f;

        /* renamed from: g  reason: collision with root package name */
        Object f143557g;

        /* renamed from: h  reason: collision with root package name */
        Object f143558h;

        /* renamed from: i  reason: collision with root package name */
        Object f143559i;

        /* renamed from: j  reason: collision with root package name */
        Object f143560j;

        /* renamed from: k  reason: collision with root package name */
        Object f143561k;

        /* renamed from: l  reason: collision with root package name */
        Object f143562l;

        /* renamed from: m  reason: collision with root package name */
        long f143563m;

        /* renamed from: n  reason: collision with root package name */
        long f143564n;

        /* renamed from: o  reason: collision with root package name */
        boolean f143565o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f143566p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ a f143567q;

        /* renamed from: r  reason: collision with root package name */
        int f143568r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f143567q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143566p = obj;
            this.f143568r |= Integer.MIN_VALUE;
            return this.f143567q.P((a) null, 0, (io.ktor.utils.io.internal.d) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1702}, m = "discardSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143569c;

        /* renamed from: d  reason: collision with root package name */
        Object f143570d;

        /* renamed from: e  reason: collision with root package name */
        long f143571e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143572f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f143573g;

        /* renamed from: h  reason: collision with root package name */
        int f143574h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f143573g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143572f = obj;
            this.f143574h |= Integer.MIN_VALUE;
            return this.f143573g.S(0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {729, 733}, m = "readAvailableSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143575c;

        /* renamed from: d  reason: collision with root package name */
        Object f143576d;

        /* renamed from: e  reason: collision with root package name */
        int f143577e;

        /* renamed from: f  reason: collision with root package name */
        int f143578f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f143579g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f143580h;

        /* renamed from: i  reason: collision with root package name */
        int f143581i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f143580h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143579g = obj;
            this.f143581i |= Integer.MIN_VALUE;
            return this.f143580h.j0((byte[]) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {745, 749}, m = "readAvailableSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143582c;

        /* renamed from: d  reason: collision with root package name */
        Object f143583d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143584e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143585f;

        /* renamed from: g  reason: collision with root package name */
        int f143586g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f143585f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143584e = obj;
            this.f143586g |= Integer.MIN_VALUE;
            return this.f143585f.i0((C16416a) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2093}, m = "readRemainingSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143587c;

        /* renamed from: d  reason: collision with root package name */
        Object f143588d;

        /* renamed from: e  reason: collision with root package name */
        Object f143589e;

        /* renamed from: f  reason: collision with root package name */
        Object f143590f;

        /* renamed from: g  reason: collision with root package name */
        Object f143591g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f143592h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f143593i;

        /* renamed from: j  reason: collision with root package name */
        int f143594j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f143593i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143592h = obj;
            this.f143594j |= Integer.MIN_VALUE;
            return this.f143593i.l0(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2236}, m = "readSuspendImpl")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143595c;

        /* renamed from: d  reason: collision with root package name */
        int f143596d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143597e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143598f;

        /* renamed from: g  reason: collision with root package name */
        int f143599g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f143598f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143597e = obj;
            this.f143599g |= Integer.MIN_VALUE;
            return this.f143598f.n0(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2189}, m = "readSuspendLoop")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143600c;

        /* renamed from: d  reason: collision with root package name */
        int f143601d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143602e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143603f;

        /* renamed from: g  reason: collision with root package name */
        int f143604g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, C17164e<? super j> eVar) {
            super(eVar);
            this.f143603f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143602e = obj;
            this.f143604g |= Integer.MIN_VALUE;
            return this.f143603f.o0(0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1507}, m = "write$suspendImpl")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143605c;

        /* renamed from: d  reason: collision with root package name */
        Object f143606d;

        /* renamed from: e  reason: collision with root package name */
        int f143607e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f143608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f143609g;

        /* renamed from: h  reason: collision with root package name */
        int f143610h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f143609g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143608f = obj;
            this.f143610h |= Integer.MIN_VALUE;
            return a.K0(this.f143609g, 0, (C17642l<? super ByteBuffer, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1123, 1125}, m = "writeFullySuspend")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143611c;

        /* renamed from: d  reason: collision with root package name */
        Object f143612d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143613e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143614f;

        /* renamed from: g  reason: collision with root package name */
        int f143615g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar, C17164e<? super l> eVar) {
            super(eVar);
            this.f143614f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143613e = obj;
            this.f143615g |= Integer.MIN_VALUE;
            return this.f143614f.S0((C16368a) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1422}, m = "writeFullySuspend")
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143616c;

        /* renamed from: d  reason: collision with root package name */
        Object f143617d;

        /* renamed from: e  reason: collision with root package name */
        int f143618e;

        /* renamed from: f  reason: collision with root package name */
        int f143619f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f143620g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f143621h;

        /* renamed from: i  reason: collision with root package name */
        int f143622i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar, C17164e<? super m> eVar) {
            super(eVar);
            this.f143621h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143620g = obj;
            this.f143622i |= Integer.MIN_VALUE;
            return this.f143621h.T0((byte[]) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1742, 1744}, m = "writePacketSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143623c;

        /* renamed from: d  reason: collision with root package name */
        Object f143624d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143625e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143626f;

        /* renamed from: g  reason: collision with root package name */
        int f143627g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar, C17164e<? super n> eVar) {
            super(eVar);
            this.f143626f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143625e = obj;
            this.f143627g |= Integer.MIN_VALUE;
            return this.f143626f.V0((RH.k) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1439, 1441}, m = "writeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143628c;

        /* renamed from: d  reason: collision with root package name */
        Object f143629d;

        /* renamed from: e  reason: collision with root package name */
        int f143630e;

        /* renamed from: f  reason: collision with root package name */
        int f143631f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f143632g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f143633h;

        /* renamed from: i  reason: collision with root package name */
        int f143634i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar, C17164e<? super o> eVar) {
            super(eVar);
            this.f143633h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143632g = obj;
            this.f143634i |= Integer.MIN_VALUE;
            return this.f143633h.X0((byte[]) null, 0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2412}, m = "writeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f143635c;

        /* renamed from: d  reason: collision with root package name */
        int f143636d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f143637e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f143638f;

        /* renamed from: g  reason: collision with root package name */
        int f143639g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar, C17164e<? super p> eVar) {
            super(eVar);
            this.f143638f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f143637e = obj;
            this.f143639g |= Integer.MIN_VALUE;
            return this.f143638f.W0(0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LdI/e;", "LXH/N;", "ucont", "", "a", "(LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class q extends C17544u implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f143640c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(1);
            this.f143640c = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            Throwable c10;
            C17542s.j(eVar, "ucont");
            int v10 = this.f143640c.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.c t10 = this.f143640c.V();
                if (t10 != null && (c10 = t10.c()) != null) {
                    Void unused = b.b(c10);
                    throw new C16820k();
                } else if (!this.f143640c.Z0(v10)) {
                    x.a aVar = x.f139812b;
                    eVar.resumeWith(x.b(C16807N.f139792a));
                    break;
                } else {
                    a aVar2 = this.f143640c;
                    C17164e<? super C16807N> c11 = C17187b.c(eVar);
                    a aVar3 = this.f143640c;
                    while (aVar2.a0() == null) {
                        if (aVar3.Z0(v10)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f143535p;
                            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar2, (Object) null, c11)) {
                                if (aVar3.Z0(v10) || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, aVar2, c11, (Object) null)) {
                                    break;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("Operation is already in progress");
                }
            }
            this.f143640c.U(v10);
            if (this.f143640c.D0()) {
                this.f143640c.w0();
            }
            return C17187b.f();
        }
    }

    static {
        Class<a> cls = a.class;
        Class<Object> cls2 = Object.class;
        f143532m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f143533n = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closed");
        f143534o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_readOp");
        f143535p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_writeOp");
    }

    public a(boolean z10, C16492f<g.c> fVar, int i10) {
        C17542s.j(fVar, "pool");
        this.f143536b = z10;
        this.f143537c = fVar;
        this.f143538d = i10;
        this._state = g.a.f143755c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f143541g = new io.ktor.utils.io.internal.f(this);
        this.f143542h = new io.ktor.utils.io.internal.l(this);
        this.f143543i = new io.ktor.utils.io.internal.b<>();
        this.f143544j = new io.ktor.utils.io.internal.b<>();
        this.f143545k = new q(this);
    }

    private final ByteBuffer B0() {
        Object obj;
        Throwable b10;
        io.ktor.utils.io.internal.g c10;
        Throwable b11;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            if (C17542s.e(gVar, g.f.f143765c) ? true : C17542s.e(gVar, g.a.f143755c)) {
                io.ktor.utils.io.internal.c V10 = V();
                if (V10 == null || (b10 = V10.b()) == null) {
                    return null;
                }
                Void unused = b.b(b10);
                throw new C16820k();
            }
            io.ktor.utils.io.internal.c V11 = V();
            if (V11 != null && (b11 = V11.b()) != null) {
                Void unused2 = b.b(b11);
                throw new C16820k();
            } else if (gVar.f143754b._availableForRead$internal == 0) {
                return null;
            } else {
                c10 = gVar.c();
            }
        } while (!androidx.concurrent.futures.b.a(f143532m, this, obj, c10));
        ByteBuffer a10 = c10.a();
        c0(a10, this.f143539e, c10.f143754b._availableForRead$internal);
        return a10;
    }

    /* access modifiers changed from: private */
    public final boolean D0() {
        return this.joining != null && (X() == g.a.f143755c || (X() instanceof g.b));
    }

    private final Object E0(int i10, C17164e<? super Boolean> eVar) {
        while (true) {
            io.ktor.utils.io.internal.g X10 = X();
            if (X10.f143754b._availableForRead$internal >= i10 || !(this.joining == null || a0() == null || (X10 != g.a.f143755c && !(X10 instanceof g.b)))) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(Boolean.TRUE));
            } else {
                io.ktor.utils.io.internal.c V10 = V();
                if (V10 == null) {
                    while (W() == null) {
                        if (V() == null) {
                            io.ktor.utils.io.internal.g X11 = X();
                            if (X11.f143754b._availableForRead$internal < i10 && (this.joining == null || a0() == null || (X11 != g.a.f143755c && !(X11 instanceof g.b)))) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f143534o;
                                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, eVar)) {
                                    if (V() == null) {
                                        io.ktor.utils.io.internal.g X12 = X();
                                        if (X12.f143754b._availableForRead$internal < i10) {
                                            if (this.joining != null) {
                                                if (a0() != null) {
                                                    if (X12 != g.a.f143755c && !(X12 instanceof g.b)) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, eVar, (Object) null)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("Operation is already in progress");
                } else if (V10.b() != null) {
                    x.a aVar2 = x.f139812b;
                    eVar.resumeWith(x.b(y.a(V10.b())));
                    return C17187b.f();
                } else {
                    boolean e10 = X().f143754b.e();
                    boolean z10 = false;
                    boolean z11 = X().f143754b._availableForRead$internal >= i10;
                    x.a aVar3 = x.f139812b;
                    if (e10 && z11) {
                        z10 = true;
                    }
                    eVar.resumeWith(x.b(Boolean.valueOf(z10)));
                    return C17187b.f();
                }
            }
        }
        return C17187b.f();
    }

    private final boolean F0(io.ktor.utils.io.internal.d dVar) {
        if (!G0(true)) {
            return false;
        }
        T(dVar);
        C17164e eVar = (C17164e) f143534o.getAndSet(this, (Object) null);
        if (eVar != null) {
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(y.a(new IllegalStateException("Joining is in progress"))));
        }
        x0();
        return true;
    }

    private final boolean G0(boolean z10) {
        Object obj;
        g.f fVar;
        g.c cVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            io.ktor.utils.io.internal.c V10 = V();
            if (cVar != null) {
                if ((V10 != null ? V10.b() : null) == null) {
                    cVar.f143754b.j();
                }
                x0();
                cVar = null;
            }
            fVar = g.f.f143765c;
            if (gVar == fVar) {
                return true;
            }
            if (gVar != g.a.f143755c) {
                if (V10 != null && (gVar instanceof g.b) && (gVar.f143754b.k() || V10.b() != null)) {
                    if (V10.b() != null) {
                        gVar.f143754b.f();
                    }
                    cVar = ((g.b) gVar).g();
                } else if (!z10 || !(gVar instanceof g.b) || !gVar.f143754b.k()) {
                    return false;
                } else {
                    cVar = ((g.b) gVar).g();
                }
            }
        } while (!androidx.concurrent.futures.b.a(f143532m, this, obj, fVar));
        if (cVar != null && X() == fVar) {
            p0(cVar);
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    private final int I0(RH.k kVar) {
        a aVar;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar = s0(this, dVar)) == null) {
            aVar = this;
        }
        ByteBuffer C02 = aVar.C0();
        if (C02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar.X().f143754b;
        long Z10 = aVar.Z();
        try {
            io.ktor.utils.io.internal.c V10 = aVar.V();
            if (V10 == null) {
                int o10 = iVar.o((int) Math.min(kVar.i0(), (long) C02.remaining()));
                if (o10 > 0) {
                    C02.limit(C02.position() + o10);
                    C16376i.b(kVar, C02);
                    aVar.N(C02, iVar, o10);
                }
                if (iVar.h() || aVar.o()) {
                    aVar.flush();
                }
                if (aVar != this) {
                    A0(Z() + (aVar.Z() - Z10));
                }
                aVar.u0();
                aVar.H0();
                return o10;
            }
            Void unused = b.b(V10.c());
            throw new C16820k();
        } catch (Throwable th2) {
            if (iVar.h() || aVar.o()) {
                aVar.flush();
            }
            if (aVar != this) {
                A0(Z() + (aVar.Z() - Z10));
            }
            aVar.u0();
            aVar.H0();
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object K0(io.ktor.utils.io.a r5, int r6, nI.C17642l<? super java.nio.ByteBuffer, XH.C16807N> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.a.k
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.ktor.utils.io.a$k r0 = (io.ktor.utils.io.a.k) r0
            int r1 = r0.f143610h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143610h = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$k r0 = new io.ktor.utils.io.a$k
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f143608f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143610h
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            int r5 = r0.f143607e
            java.lang.Object r6 = r0.f143606d
            nI.l r6 = (nI.C17642l) r6
            java.lang.Object r7 = r0.f143605c
            io.ktor.utils.io.a r7 = (io.ktor.utils.io.a) r7
            XH.y.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L_0x0048
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            XH.y.b(r8)
            if (r6 <= 0) goto L_0x0080
            r8 = 4088(0xff8, float:5.729E-42)
            if (r6 > r8) goto L_0x0060
        L_0x0048:
            int r8 = r5.N0(r6, r7)
            if (r8 < 0) goto L_0x0051
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x0051:
            r0.f143605c = r5
            r0.f143606d = r7
            r0.f143607e = r6
            r0.f143610h = r3
            java.lang.Object r8 = r5.L(r6, r7, r0)
            if (r8 != r1) goto L_0x0048
            return r1
        L_0x0060:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Min("
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = ") should'nt be greater than (4088)"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x0080:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "min should be positive"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.K0(io.ktor.utils.io.a, int, nI.l, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(int r6, nI.C17642l<? super java.nio.ByteBuffer, XH.C16807N> r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.ktor.utils.io.a$c r0 = (io.ktor.utils.io.a.c) r0
            int r1 = r0.f143552h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143552h = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$c r0 = new io.ktor.utils.io.a$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f143550f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143552h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r8)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            int r6 = r0.f143549e
            java.lang.Object r7 = r0.f143548d
            nI.l r7 = (nI.C17642l) r7
            java.lang.Object r2 = r0.f143547c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r8)
            goto L_0x0055
        L_0x0042:
            XH.y.b(r8)
            r0.f143547c = r5
            r0.f143548d = r7
            r0.f143549e = r6
            r0.f143552h = r4
            java.lang.Object r8 = r5.W0(r6, r0)
            if (r8 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r2 = r5
        L_0x0055:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 == 0) goto L_0x0070
            io.ktor.utils.io.a r8 = r2.s0(r2, r8)
            if (r8 == 0) goto L_0x0070
            r2 = 0
            r0.f143547c = r2
            r0.f143548d = r2
            r0.f143552h = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L_0x006d
            return r1
        L_0x006d:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0070:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.L(int, nI.l, dI.e):java.lang.Object");
    }

    private final int L0(C16368a aVar) {
        a aVar2;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar2 = s0(this, dVar)) == null) {
            aVar2 = this;
        }
        ByteBuffer C02 = aVar2.C0();
        int i10 = 0;
        if (C02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar2.X().f143754b;
        long Z10 = aVar2.Z();
        try {
            io.ktor.utils.io.internal.c V10 = aVar2.V();
            if (V10 == null) {
                while (true) {
                    int o10 = iVar.o(Math.min(aVar.k() - aVar.i(), C02.remaining()));
                    if (o10 == 0) {
                        break;
                    }
                    C16374g.a(aVar, C02, o10);
                    i10 += o10;
                    aVar2.c0(C02, aVar2.O(C02, aVar2.f143540f + i10), iVar._availableForWrite$internal);
                }
                aVar2.N(C02, iVar, i10);
                if (iVar.h() || aVar2.o()) {
                    aVar2.flush();
                }
                if (aVar2 != this) {
                    A0(Z() + (aVar2.Z() - Z10));
                }
                aVar2.u0();
                aVar2.H0();
                return i10;
            }
            Void unused = b.b(V10.c());
            throw new C16820k();
        } catch (Throwable th2) {
            if (iVar.h() || aVar2.o()) {
                aVar2.flush();
            }
            if (aVar2 != this) {
                A0(Z() + (aVar2.Z() - Z10));
            }
            aVar2.u0();
            aVar2.H0();
            throw th2;
        }
    }

    private final void M(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i10) {
        if (i10 >= 0) {
            this.f143539e = O(byteBuffer, this.f143539e + i10);
            iVar.a(i10);
            z0(Y() + ((long) i10));
            x0();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final int M0(byte[] bArr, int i10, int i11) {
        a aVar;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (aVar = s0(this, dVar)) == null) {
            aVar = this;
        }
        ByteBuffer C02 = aVar.C0();
        int i12 = 0;
        if (C02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = aVar.X().f143754b;
        long Z10 = aVar.Z();
        try {
            io.ktor.utils.io.internal.c V10 = aVar.V();
            if (V10 == null) {
                while (true) {
                    int o10 = iVar.o(Math.min(i11 - i12, C02.remaining()));
                    if (o10 == 0) {
                        aVar.N(C02, iVar, i12);
                        if (iVar.h() || aVar.o()) {
                            aVar.flush();
                        }
                        if (aVar != this) {
                            A0(Z() + (aVar.Z() - Z10));
                        }
                        aVar.u0();
                        aVar.H0();
                        return i12;
                    } else if (o10 > 0) {
                        C02.put(bArr, i10 + i12, o10);
                        i12 += o10;
                        aVar.c0(C02, aVar.O(C02, aVar.f143540f + i12), iVar._availableForWrite$internal);
                    } else {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            } else {
                Void unused = b.b(V10.c());
                throw new C16820k();
            }
        } catch (Throwable th2) {
            if (iVar.h() || aVar.o()) {
                aVar.flush();
            }
            if (aVar != this) {
                A0(Z() + (aVar.Z() - Z10));
            }
            aVar.u0();
            aVar.H0();
            throw th2;
        }
    }

    private final void N(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i10) {
        if (i10 >= 0) {
            this.f143540f = O(byteBuffer, this.f143540f + i10);
            iVar.c(i10);
            A0(Z() + ((long) i10));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final int O(ByteBuffer byteBuffer, int i10) {
        return i10 >= byteBuffer.capacity() - this.f143538d ? i10 - (byteBuffer.capacity() - this.f143538d) : i10;
    }

    static /* synthetic */ Object P0(a aVar, byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar) {
        a s02;
        io.ktor.utils.io.internal.d dVar = aVar.joining;
        if (dVar != null && (s02 = aVar.s0(aVar, dVar)) != null) {
            return s02.O0(bArr, i10, i11, eVar);
        }
        int M02 = aVar.M0(bArr, i10, i11);
        return M02 > 0 ? kotlin.coroutines.jvm.internal.b.e(M02) : aVar.X0(bArr, i10, i11, eVar);
    }

    static /* synthetic */ Object Q0(a aVar, C16368a aVar2, C17164e<? super C16807N> eVar) {
        aVar.L0(aVar2);
        if (aVar2.k() <= aVar2.i()) {
            return C16807N.f139792a;
        }
        Object S02 = aVar.S0(aVar2, eVar);
        return S02 == C17187b.f() ? S02 : C16807N.f139792a;
    }

    static /* synthetic */ Object R(a aVar, long j10, C17164e<? super Long> eVar) {
        long j11 = 0;
        if (j10 >= 0) {
            ByteBuffer B02 = aVar.B0();
            if (B02 != null) {
                io.ktor.utils.io.internal.i iVar = aVar.X().f143754b;
                try {
                    if (iVar._availableForRead$internal != 0) {
                        int l10 = iVar.l((int) Math.min(2147483647L, j10));
                        aVar.M(B02, iVar, l10);
                        j11 = (long) l10;
                    }
                } finally {
                    aVar.t0();
                    aVar.H0();
                }
            }
            long j12 = j11;
            return (j12 == j10 || aVar.m()) ? kotlin.coroutines.jvm.internal.b.f(j12) : aVar.S(j12, j10, eVar);
        }
        throw new IllegalArgumentException(("max shouldn't be negative: " + j10).toString());
    }

    static /* synthetic */ Object R0(a aVar, byte[] bArr, int i10, int i11, C17164e<? super C16807N> eVar) {
        a s02;
        io.ktor.utils.io.internal.d dVar = aVar.joining;
        if (dVar == null || (s02 = aVar.s0(aVar, dVar)) == null) {
            while (i11 > 0) {
                int M02 = aVar.M0(bArr, i10, i11);
                if (M02 == 0) {
                    break;
                }
                i10 += M02;
                i11 -= M02;
            }
            if (i11 == 0) {
                return C16807N.f139792a;
            }
            Object T02 = aVar.T0(bArr, i10, i11, eVar);
            return T02 == C17187b.f() ? T02 : C16807N.f139792a;
        }
        Object l10 = s02.l(bArr, i10, i11, eVar);
        return l10 == C17187b.f() ? l10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S(long r10, long r12, dI.C17164e<? super java.lang.Long> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.ktor.utils.io.a$e r0 = (io.ktor.utils.io.a.e) r0
            int r1 = r0.f143574h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143574h = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$e r0 = new io.ktor.utils.io.a$e
            r0.<init>(r9, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f143572f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143574h
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            long r10 = r0.f143571e
            java.lang.Object r12 = r0.f143570d
            kotlin.jvm.internal.N r12 = (kotlin.jvm.internal.N) r12
            java.lang.Object r13 = r0.f143569c
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.a) r13
            XH.y.b(r14)
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            XH.y.b(r14)
            kotlin.jvm.internal.N r14 = new kotlin.jvm.internal.N
            r14.<init>()
            r14.f144347a = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L_0x0048:
            long r4 = r12.f144347a
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ab
            java.nio.ByteBuffer r14 = r13.B0()
            if (r14 != 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            io.ktor.utils.io.internal.g r2 = r13.X()
            io.ktor.utils.io.internal.i r2 = r2.f143754b
            int r4 = r2._availableForRead$internal     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x0083
            r13.t0()
            r13.H0()
        L_0x0065:
            boolean r14 = r13.m()
            if (r14 != 0) goto L_0x00ab
            r0.f143569c = r13
            r0.f143570d = r12
            r0.f143571e = r10
            r0.f143574h = r3
            java.lang.Object r14 = r13.m0(r3, r0)
            if (r14 != r1) goto L_0x007a
            return r1
        L_0x007a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0048
            goto L_0x00ab
        L_0x0083:
            long r4 = r12.f144347a     // Catch:{ all -> 0x00a3 }
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch:{ all -> 0x00a3 }
            int r4 = (int) r4     // Catch:{ all -> 0x00a3 }
            int r4 = r2.l(r4)     // Catch:{ all -> 0x00a3 }
            r13.M(r14, r2, r4)     // Catch:{ all -> 0x00a3 }
            long r5 = r12.f144347a     // Catch:{ all -> 0x00a3 }
            long r7 = (long) r4     // Catch:{ all -> 0x00a3 }
            long r5 = r5 + r7
            r12.f144347a = r5     // Catch:{ all -> 0x00a3 }
            r13.t0()
            r13.H0()
            goto L_0x0048
        L_0x00a3:
            r10 = move-exception
            r13.t0()
            r13.H0()
            throw r10
        L_0x00ab:
            long r10 = r12.f144347a
            java.lang.Long r10 = kotlin.coroutines.jvm.internal.b.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.S(long, long, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object S0(RH.C16368a r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.a.l
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.ktor.utils.io.a$l r0 = (io.ktor.utils.io.a.l) r0
            int r1 = r0.f143615g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143615g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$l r0 = new io.ktor.utils.io.a$l
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f143613e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143615g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r8)
            goto L_0x0073
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            java.lang.Object r7 = r0.f143612d
            RH.a r7 = (RH.C16368a) r7
            java.lang.Object r2 = r0.f143611c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r8)
            goto L_0x005b
        L_0x0040:
            XH.y.b(r8)
            r2 = r6
        L_0x0044:
            int r8 = r7.k()
            int r5 = r7.i()
            if (r8 <= r5) goto L_0x007a
            r0.f143611c = r2
            r0.f143612d = r7
            r0.f143615g = r4
            java.lang.Object r8 = r2.J0(r4, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 == 0) goto L_0x0076
            io.ktor.utils.io.a r8 = r2.s0(r2, r8)
            if (r8 == 0) goto L_0x0076
            r2 = 0
            r0.f143611c = r2
            r0.f143612d = r2
            r0.f143615g = r3
            java.lang.Object r7 = r8.k(r7, r0)
            if (r7 != r1) goto L_0x0073
            return r1
        L_0x0073:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0076:
            r2.L0(r7)
            goto L_0x0044
        L_0x007a:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.S0(RH.a, dI.e):java.lang.Object");
    }

    private final void T(io.ktor.utils.io.internal.d dVar) {
        io.ktor.utils.io.internal.c V10 = V();
        if (V10 != null) {
            this.joining = null;
            if (!dVar.b()) {
                dVar.c().flush();
                dVar.a();
                return;
            }
            io.ktor.utils.io.internal.g X10 = dVar.c().X();
            boolean z10 = (X10 instanceof g.C3510g) || (X10 instanceof g.e);
            if (V10.b() != null || !z10) {
                dVar.c().a(V10.b());
            } else {
                dVar.c().flush();
            }
            dVar.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T0(byte[] r6, int r7, int r8, dI.C17164e<? super XH.C16807N> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.m
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.ktor.utils.io.a$m r0 = (io.ktor.utils.io.a.m) r0
            int r1 = r0.f143622i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143622i = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$m r0 = new io.ktor.utils.io.a$m
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f143620g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143622i
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            int r6 = r0.f143619f
            int r7 = r0.f143618e
            java.lang.Object r8 = r0.f143617d
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f143616c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r9)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r9)
            r2 = r5
        L_0x0041:
            if (r8 <= 0) goto L_0x0063
            r0.f143616c = r2
            r0.f143617d = r6
            r0.f143618e = r7
            r0.f143619f = r8
            r0.f143622i = r3
            java.lang.Object r9 = r2.O0(r6, r7, r8, r0)
            if (r9 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r4 = r8
            r8 = r6
            r6 = r4
        L_0x0057:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x0041
        L_0x0063:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.T0(byte[], int, int, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void U(int i10) {
        io.ktor.utils.io.internal.g X10;
        g.f fVar;
        a c10;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (!(dVar == null || (c10 = dVar.c()) == null)) {
            c10.flush();
        }
        do {
            X10 = X();
            fVar = g.f.f143765c;
            if (X10 != fVar) {
                X10.f143754b.e();
            } else {
                return;
            }
        } while (X10 != X());
        int i11 = X10.f143754b._availableForWrite$internal;
        if (X10.f143754b._availableForRead$internal >= 1) {
            w0();
        }
        io.ktor.utils.io.internal.d dVar2 = this.joining;
        if (i11 < i10) {
            return;
        }
        if (dVar2 == null || X() == fVar) {
            x0();
        }
    }

    static /* synthetic */ Object U0(a aVar, RH.k kVar, C17164e<? super C16807N> eVar) {
        a s02;
        a s03;
        io.ktor.utils.io.internal.d dVar = aVar.joining;
        if (dVar == null || (s03 = aVar.s0(aVar, dVar)) == null) {
            do {
                try {
                    if (kVar.J() || aVar.I0(kVar) == 0) {
                    }
                    break;
                } catch (Throwable th2) {
                    kVar.O0();
                    throw th2;
                }
            } while (aVar.I0(kVar) == 0);
            if (kVar.i0() <= 0) {
                return C16807N.f139792a;
            }
            io.ktor.utils.io.internal.d dVar2 = aVar.joining;
            if (dVar2 == null || (s02 = aVar.s0(aVar, dVar2)) == null) {
                Object V02 = aVar.V0(kVar, eVar);
                return V02 == C17187b.f() ? V02 : C16807N.f139792a;
            }
            Object n10 = s02.n(kVar, eVar);
            return n10 == C17187b.f() ? n10 : C16807N.f139792a;
        }
        Object n11 = s03.n(kVar, eVar);
        return n11 == C17187b.f() ? n11 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final io.ktor.utils.io.internal.c V() {
        return (io.ktor.utils.io.internal.c) this._closed;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V0(RH.k r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.n
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.a$n r0 = (io.ktor.utils.io.a.n) r0
            int r1 = r0.f143627g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143627g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$n r0 = new io.ktor.utils.io.a$n
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143625e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143627g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.f143623c
            RH.k r6 = (RH.k) r6
            XH.y.b(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x0075
        L_0x0030:
            r7 = move-exception
            goto L_0x0085
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.f143624d
            RH.k r6 = (RH.k) r6
            java.lang.Object r2 = r0.f143623c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r7)     // Catch:{ all -> 0x0030 }
            goto L_0x005d
        L_0x0046:
            XH.y.b(r7)
            r2 = r5
        L_0x004a:
            boolean r7 = r6.J()     // Catch:{ all -> 0x0030 }
            if (r7 != 0) goto L_0x007f
            r0.f143623c = r2     // Catch:{ all -> 0x0030 }
            r0.f143624d = r6     // Catch:{ all -> 0x0030 }
            r0.f143627g = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r7 = r2.W0(r4, r0)     // Catch:{ all -> 0x0030 }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            io.ktor.utils.io.internal.d r7 = r2.joining     // Catch:{ all -> 0x0030 }
            if (r7 == 0) goto L_0x007b
            io.ktor.utils.io.a r7 = r2.s0(r2, r7)     // Catch:{ all -> 0x0030 }
            if (r7 == 0) goto L_0x007b
            r0.f143623c = r6     // Catch:{ all -> 0x0030 }
            r2 = 0
            r0.f143624d = r2     // Catch:{ all -> 0x0030 }
            r0.f143627g = r3     // Catch:{ all -> 0x0030 }
            java.lang.Object r7 = r7.n(r6, r0)     // Catch:{ all -> 0x0030 }
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0075:
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0030 }
            r6.O0()
            return r7
        L_0x007b:
            r2.I0(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x004a
        L_0x007f:
            r6.O0()
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0085:
            r6.O0()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.V0(RH.k, dI.e):java.lang.Object");
    }

    private final C17164e<Boolean> W() {
        return (C17164e) this._readOp;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object W0(int r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.p
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.a$p r0 = (io.ktor.utils.io.a.p) r0
            int r1 = r0.f143639g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143639g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$p r0 = new io.ktor.utils.io.a$p
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143637e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143639g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r6 = r0.f143636d
            java.lang.Object r2 = r0.f143635c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r7)
            goto L_0x003b
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            XH.y.b(r7)
            r2 = r5
        L_0x003b:
            boolean r7 = r2.Z0(r6)
            if (r7 == 0) goto L_0x0066
            r0.f143635c = r2
            r0.f143636d = r6
            r0.f143639g = r3
            QJ.p r7 = new QJ.p
            dI.e r4 = eI.C17187b.c(r0)
            r7.<init>(r4, r3)
            r7.C()
            r2.Y0(r6, r7)
            java.lang.Object r7 = r7.w()
            java.lang.Object r4 = eI.C17187b.f()
            if (r7 != r4) goto L_0x0063
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0063:
            if (r7 != r1) goto L_0x003b
            return r1
        L_0x0066:
            io.ktor.utils.io.internal.c r6 = r2.V()
            if (r6 == 0) goto L_0x007c
            java.lang.Throwable r6 = r6.c()
            if (r6 != 0) goto L_0x0073
            goto L_0x007c
        L_0x0073:
            java.lang.Void unused = io.ktor.utils.io.b.b(r6)
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        L_0x007c:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.W0(int, dI.e):java.lang.Object");
    }

    private final io.ktor.utils.io.internal.g X() {
        return (io.ktor.utils.io.internal.g) this._state;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    public final java.lang.Object X0(byte[] r7, int r8, int r9, dI.C17164e<? super java.lang.Integer> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.a.o
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.ktor.utils.io.a$o r0 = (io.ktor.utils.io.a.o) r0
            int r1 = r0.f143634i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143634i = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$o r0 = new io.ktor.utils.io.a$o
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f143632g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143634i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r10)
            goto L_0x0074
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            int r7 = r0.f143631f
            int r8 = r0.f143630e
            java.lang.Object r9 = r0.f143629d
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.f143628c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L_0x005c
        L_0x0047:
            XH.y.b(r10)
            r2 = r6
        L_0x004b:
            r0.f143628c = r2
            r0.f143629d = r7
            r0.f143630e = r8
            r0.f143631f = r9
            r0.f143634i = r4
            java.lang.Object r10 = r2.J0(r4, r0)
            if (r10 != r1) goto L_0x005c
            return r1
        L_0x005c:
            io.ktor.utils.io.internal.d r10 = r2.joining
            if (r10 == 0) goto L_0x0075
            io.ktor.utils.io.a r10 = r2.s0(r2, r10)
            if (r10 == 0) goto L_0x0075
            r2 = 0
            r0.f143628c = r2
            r0.f143629d = r2
            r0.f143634i = r3
            java.lang.Object r10 = r10.X0(r7, r8, r9, r0)
            if (r10 != r1) goto L_0x0074
            return r1
        L_0x0074:
            return r10
        L_0x0075:
            int r10 = r2.M0(r7, r8, r9)
            if (r10 <= 0) goto L_0x004b
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.e(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.X0(byte[], int, int, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void Y0(int i10, C16320n<? super C16807N> nVar) {
        Throwable c10;
        while (true) {
            io.ktor.utils.io.internal.c V10 = V();
            if (V10 != null && (c10 = V10.c()) != null) {
                Void unused = b.b(c10);
                throw new C16820k();
            } else if (!Z0(i10)) {
                x.a aVar = x.f139812b;
                nVar.resumeWith(x.b(C16807N.f139792a));
                break;
            } else {
                while (a0() == null) {
                    if (Z0(i10)) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f143535p;
                        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, (Object) null, nVar)) {
                            if (Z0(i10) || !androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, nVar, (Object) null)) {
                                break;
                            }
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
        }
        U(i10);
        if (D0()) {
            w0();
        }
    }

    /* access modifiers changed from: private */
    public final boolean Z0(int i10) {
        io.ktor.utils.io.internal.d dVar = this.joining;
        io.ktor.utils.io.internal.g X10 = X();
        if (V() != null) {
            return false;
        }
        if (dVar == null) {
            if (X10.f143754b._availableForWrite$internal >= i10 || X10 == g.a.f143755c) {
                return false;
            }
        } else if (X10 == g.f.f143765c || (X10 instanceof g.C3510g) || (X10 instanceof g.e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final C17164e<C16807N> a0() {
        return (C17164e) this._writeOp;
    }

    private final g.c b0() {
        g.c Q12 = this.f143537c.Q1();
        Q12.f143754b.j();
        return Q12;
    }

    private final void c0(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i11 >= 0) {
            byteBuffer.limit(C17978n.i(i11 + i10, byteBuffer.capacity() - this.f143538d));
            byteBuffer.position(i10);
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r8 r9 
      PHI: (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:0:0x0000, B:25:0x006a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:0:0x0000, B:25:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[EDGE_INSN: B:29:0x006c->B:26:0x006c ?: BREAK  
    EDGE_INSN: B:31:0x006c->B:26:0x006c ?: BREAK  , RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int d0(RH.C16368a r7, int r8, int r9) {
        /*
            r6 = this;
        L_0x0000:
            java.nio.ByteBuffer r0 = r6.B0()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r4 = r1
            goto L_0x0054
        L_0x0009:
            io.ktor.utils.io.internal.g r2 = r6.X()
            io.ktor.utils.io.internal.i r2 = r2.f143754b
            int r3 = r2._availableForRead$internal     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x001a
            r6.t0()
            r6.H0()
            goto L_0x0007
        L_0x001a:
            int r3 = r7.g()     // Catch:{ all -> 0x0045 }
            int r4 = r7.k()     // Catch:{ all -> 0x0045 }
            int r3 = r3 - r4
            int r4 = r0.remaining()     // Catch:{ all -> 0x0045 }
            int r5 = java.lang.Math.min(r3, r9)     // Catch:{ all -> 0x0045 }
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ all -> 0x0045 }
            int r4 = r2.l(r4)     // Catch:{ all -> 0x0045 }
            if (r4 > 0) goto L_0x0036
            goto L_0x004e
        L_0x0036:
            int r1 = r0.remaining()     // Catch:{ all -> 0x0045 }
            if (r3 >= r1) goto L_0x0047
            int r1 = r0.position()     // Catch:{ all -> 0x0045 }
            int r1 = r1 + r3
            r0.limit(r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0047
        L_0x0045:
            r7 = move-exception
            goto L_0x006d
        L_0x0047:
            RH.C16372e.a(r7, r0)     // Catch:{ all -> 0x0045 }
            r6.M(r0, r2, r4)     // Catch:{ all -> 0x0045 }
            r1 = 1
        L_0x004e:
            r6.t0()
            r6.H0()
        L_0x0054:
            int r8 = r8 + r4
            int r9 = r9 - r4
            if (r1 == 0) goto L_0x006c
            int r0 = r7.g()
            int r1 = r7.k()
            if (r0 <= r1) goto L_0x006c
            io.ktor.utils.io.internal.g r0 = r6.X()
            io.ktor.utils.io.internal.i r0 = r0.f143754b
            int r0 = r0._availableForRead$internal
            if (r0 > 0) goto L_0x0000
        L_0x006c:
            return r8
        L_0x006d:
            r6.t0()
            r6.H0()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.d0(RH.a, int, int):int");
    }

    private final int e0(byte[] bArr, int i10, int i11) {
        ByteBuffer B02 = B0();
        int i12 = 0;
        if (B02 != null) {
            io.ktor.utils.io.internal.i iVar = X().f143754b;
            try {
                if (iVar._availableForRead$internal != 0) {
                    int capacity = B02.capacity() - this.f143538d;
                    while (true) {
                        int i13 = i11 - i12;
                        if (i13 == 0) {
                            break;
                        }
                        int i14 = this.f143539e;
                        int l10 = iVar.l(Math.min(capacity - i14, i13));
                        if (l10 == 0) {
                            break;
                        }
                        B02.limit(i14 + l10);
                        B02.position(i14);
                        B02.get(bArr, i10 + i12, l10);
                        M(B02, iVar, l10);
                        i12 += l10;
                    }
                }
            } finally {
                t0();
                H0();
            }
        }
        return i12;
    }

    static /* synthetic */ int f0(a aVar, C16368a aVar2, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = aVar2.g() - aVar2.k();
            }
            return aVar.d0(aVar2, i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
    }

    static /* synthetic */ Object g0(a aVar, C16416a aVar2, C17164e<? super Integer> eVar) {
        int f02 = f0(aVar, aVar2, 0, 0, 6, (Object) null);
        if (f02 == 0 && aVar.V() != null) {
            f02 = aVar.X().f143754b.e() ? f0(aVar, aVar2, 0, 0, 6, (Object) null) : -1;
        } else if (f02 <= 0 && aVar2.g() > aVar2.k()) {
            return aVar.i0(aVar2, eVar);
        }
        return kotlin.coroutines.jvm.internal.b.e(f02);
    }

    static /* synthetic */ Object h0(a aVar, byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar) {
        int e02 = aVar.e0(bArr, i10, i11);
        if (e02 == 0 && aVar.V() != null) {
            e02 = aVar.X().f143754b.e() ? aVar.e0(bArr, i10, i11) : -1;
        } else if (e02 <= 0 && i11 != 0) {
            return aVar.j0(bArr, i10, i11, eVar);
        }
        return kotlin.coroutines.jvm.internal.b.e(e02);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i0(SH.C16416a r6, dI.C17164e<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.a$g r0 = (io.ktor.utils.io.a.g) r0
            int r1 = r0.f143586g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143586g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$g r0 = new io.ktor.utils.io.a$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143584e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143586g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r7)
            goto L_0x006d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f143583d
            SH.a r6 = (SH.C16416a) r6
            java.lang.Object r2 = r0.f143582c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r7)
            goto L_0x0051
        L_0x0040:
            XH.y.b(r7)
            r0.f143582c = r5
            r0.f143583d = r6
            r0.f143586g = r4
            java.lang.Object r7 = r5.m0(r4, r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r5
        L_0x0051:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x005f
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        L_0x005f:
            r7 = 0
            r0.f143582c = r7
            r0.f143583d = r7
            r0.f143586g = r3
            java.lang.Object r7 = r2.g(r6, r0)
            if (r7 != r1) goto L_0x006d
            return r1
        L_0x006d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.i0(SH.a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j0(byte[] r6, int r7, int r8, dI.C17164e<? super java.lang.Integer> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.ktor.utils.io.a$f r0 = (io.ktor.utils.io.a.f) r0
            int r1 = r0.f143581i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143581i = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$f r0 = new io.ktor.utils.io.a$f
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f143579g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143581i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            XH.y.b(r9)
            goto L_0x0075
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            int r8 = r0.f143578f
            int r7 = r0.f143577e
            java.lang.Object r6 = r0.f143576d
            byte[] r6 = (byte[]) r6
            java.lang.Object r2 = r0.f143575c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r9)
            goto L_0x0059
        L_0x0044:
            XH.y.b(r9)
            r0.f143575c = r5
            r0.f143576d = r6
            r0.f143577e = r7
            r0.f143578f = r8
            r0.f143581i = r4
            java.lang.Object r9 = r5.m0(r4, r0)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r5
        L_0x0059:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0067
            r6 = -1
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.e(r6)
            return r6
        L_0x0067:
            r9 = 0
            r0.f143575c = r9
            r0.f143576d = r9
            r0.f143581i = r3
            java.lang.Object r9 = r2.j(r6, r7, r8, r0)
            if (r9 != r1) goto L_0x0075
            return r1
        L_0x0075:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.j0(byte[], int, int, dI.e):java.lang.Object");
    }

    static /* synthetic */ Object k0(a aVar, long j10, C17164e<? super RH.k> eVar) {
        if (!aVar.h()) {
            return aVar.l0(j10, eVar);
        }
        Throwable c10 = aVar.c();
        if (c10 == null) {
            return aVar.q0(j10);
        }
        Void unused = b.b(c10);
        throw new C16820k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: RH.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: RH.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: RH.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: RH.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: RH.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: RH.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: RH.j} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071 A[Catch:{ all -> 0x003e, all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A[Catch:{ all -> 0x003e, all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x003e, all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb A[SYNTHETIC, Splitter:B:38:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c4 A[Catch:{ all -> 0x003e, all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc A[Catch:{ all -> 0x003e, all -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l0(long r13, dI.C17164e<? super RH.k> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof io.ktor.utils.io.a.h
            if (r0 == 0) goto L_0x0013
            r0 = r15
            io.ktor.utils.io.a$h r0 = (io.ktor.utils.io.a.h) r0
            int r1 = r0.f143594j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143594j = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$h r0 = new io.ktor.utils.io.a$h
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f143592h
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143594j
            r3 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r13 = r0.f143591g
            SH.a r13 = (SH.C16416a) r13
            java.lang.Object r14 = r0.f143590f
            RH.s r14 = (RH.s) r14
            java.lang.Object r2 = r0.f143589e
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r4 = r0.f143588d
            RH.j r4 = (RH.j) r4
            java.lang.Object r5 = r0.f143587c
            io.ktor.utils.io.a r5 = (io.ktor.utils.io.a) r5
            XH.y.b(r15)     // Catch:{ all -> 0x003e }
            goto L_0x00a7
        L_0x003e:
            r13 = move-exception
            goto L_0x00cd
        L_0x0041:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0049:
            XH.y.b(r15)
            RH.j r15 = new RH.j
            r2 = 0
            r15.<init>(r2, r3, r2)
            kotlin.jvm.internal.N r4 = new kotlin.jvm.internal.N     // Catch:{ all -> 0x00d1 }
            r4.<init>()     // Catch:{ all -> 0x00d1 }
            r4.f144347a = r13     // Catch:{ all -> 0x00d1 }
            SH.a r13 = SH.g.d(r15, r3, r2)     // Catch:{ all -> 0x00d1 }
            r14 = r15
            r2 = r4
            r15 = r12
            r4 = r14
        L_0x0061:
            int r5 = r13.g()     // Catch:{ all -> 0x003e }
            int r6 = r13.k()     // Catch:{ all -> 0x003e }
            int r5 = r5 - r6
            long r5 = (long) r5     // Catch:{ all -> 0x003e }
            long r7 = r2.f144347a     // Catch:{ all -> 0x003e }
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0075
            int r5 = (int) r7     // Catch:{ all -> 0x003e }
            r13.t(r5)     // Catch:{ all -> 0x003e }
        L_0x0075:
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            r5 = r15
            r6 = r13
            int r5 = f0(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x003e }
            long r6 = r2.f144347a     // Catch:{ all -> 0x003e }
            long r8 = (long) r5     // Catch:{ all -> 0x003e }
            long r6 = r6 - r8
            r2.f144347a = r6     // Catch:{ all -> 0x003e }
            r8 = 0
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b3
            boolean r5 = r15.m()     // Catch:{ all -> 0x003e }
            if (r5 != 0) goto L_0x00b3
            r0.f143587c = r15     // Catch:{ all -> 0x003e }
            r0.f143588d = r4     // Catch:{ all -> 0x003e }
            r0.f143589e = r2     // Catch:{ all -> 0x003e }
            r0.f143590f = r14     // Catch:{ all -> 0x003e }
            r0.f143591g = r13     // Catch:{ all -> 0x003e }
            r0.f143594j = r3     // Catch:{ all -> 0x003e }
            java.lang.Object r5 = r15.m0(r3, r0)     // Catch:{ all -> 0x003e }
            if (r5 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r5
            r5 = r15
            r15 = r11
        L_0x00a7:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch:{ all -> 0x003e }
            boolean r15 = r15.booleanValue()     // Catch:{ all -> 0x003e }
            if (r15 == 0) goto L_0x00b2
            r15 = r5
            r5 = r3
            goto L_0x00b4
        L_0x00b2:
            r15 = r5
        L_0x00b3:
            r5 = 0
        L_0x00b4:
            if (r5 == 0) goto L_0x00bb
            SH.a r13 = SH.g.d(r14, r3, r13)     // Catch:{ all -> 0x003e }
            goto L_0x0061
        L_0x00bb:
            r14.d()     // Catch:{ all -> 0x00c9 }
            java.lang.Throwable r13 = r15.c()     // Catch:{ all -> 0x00c9 }
            if (r13 != 0) goto L_0x00cc
            RH.k r13 = r4.t0()     // Catch:{ all -> 0x00c9 }
            return r13
        L_0x00c9:
            r13 = move-exception
            r15 = r4
            goto L_0x00d2
        L_0x00cc:
            throw r13     // Catch:{ all -> 0x00c9 }
        L_0x00cd:
            r14.d()     // Catch:{ all -> 0x00c9 }
            throw r13     // Catch:{ all -> 0x00c9 }
        L_0x00d1:
            r13 = move-exception
        L_0x00d2:
            r15.J()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.l0(long, dI.e):java.lang.Object");
    }

    private final Object m0(int i10, C17164e<? super Boolean> eVar) {
        boolean z10 = true;
        if (X().f143754b._availableForRead$internal >= i10) {
            return kotlin.coroutines.jvm.internal.b.a(true);
        }
        io.ktor.utils.io.internal.c V10 = V();
        if (V10 == null) {
            return i10 == 1 ? n0(1, eVar) : o0(i10, eVar);
        }
        Throwable b10 = V10.b();
        if (b10 == null) {
            io.ktor.utils.io.internal.i iVar = X().f143754b;
            if (!iVar.e() || iVar._availableForRead$internal < i10) {
                z10 = false;
            }
            if (W() == null) {
                return kotlin.coroutines.jvm.internal.b.a(z10);
            }
            throw new IllegalStateException("Read operation is already in progress");
        }
        Void unused = b.b(b10);
        throw new C16820k();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n0(int r5, dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.a.i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            io.ktor.utils.io.a$i r0 = (io.ktor.utils.io.a.i) r0
            int r1 = r0.f143599g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143599g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$i r0 = new io.ktor.utils.io.a$i
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f143597e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143599g
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.f143595c
            io.ktor.utils.io.a r5 = (io.ktor.utils.io.a) r5
            XH.y.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x0079
        L_0x002d:
            r6 = move-exception
            goto L_0x007a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            XH.y.b(r6)
            io.ktor.utils.io.internal.g r6 = r4.X()
            io.ktor.utils.io.internal.i r2 = r6.f143754b
            int r2 = r2._availableForRead$internal
            if (r2 >= r5) goto L_0x007f
            io.ktor.utils.io.internal.d r2 = r4.joining
            if (r2 == 0) goto L_0x0056
            dI.e r2 = r4.a0()
            if (r2 == 0) goto L_0x0056
            io.ktor.utils.io.internal.g$a r2 = io.ktor.utils.io.internal.g.a.f143755c
            if (r6 == r2) goto L_0x007f
            boolean r6 = r6 instanceof io.ktor.utils.io.internal.g.b
            if (r6 != 0) goto L_0x007f
        L_0x0056:
            r0.f143595c = r4     // Catch:{ all -> 0x0073 }
            r0.f143596d = r5     // Catch:{ all -> 0x0073 }
            r0.f143599g = r3     // Catch:{ all -> 0x0073 }
            io.ktor.utils.io.internal.b<java.lang.Boolean> r6 = r4.f143543i     // Catch:{ all -> 0x0073 }
            r4.E0(r5, r6)     // Catch:{ all -> 0x0073 }
            dI.e r5 = eI.C17187b.c(r0)     // Catch:{ all -> 0x0073 }
            java.lang.Object r6 = r6.f(r5)     // Catch:{ all -> 0x0073 }
            java.lang.Object r5 = eI.C17187b.f()     // Catch:{ all -> 0x0073 }
            if (r6 != r5) goto L_0x0076
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch:{ all -> 0x0073 }
            goto L_0x0076
        L_0x0073:
            r6 = move-exception
            r5 = r4
            goto L_0x007a
        L_0x0076:
            if (r6 != r1) goto L_0x0079
            return r1
        L_0x0079:
            return r6
        L_0x007a:
            r0 = 0
            r5.y0(r0)
            throw r6
        L_0x007f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.n0(int, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o0(int r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.a.j
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.ktor.utils.io.a$j r0 = (io.ktor.utils.io.a.j) r0
            int r1 = r0.f143604g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f143604g = r1
            goto L_0x0018
        L_0x0013:
            io.ktor.utils.io.a$j r0 = new io.ktor.utils.io.a$j
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f143602e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f143604g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            int r6 = r0.f143601d
            java.lang.Object r2 = r0.f143600c
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            XH.y.b(r7)
            goto L_0x0095
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            XH.y.b(r7)
            r2 = r5
        L_0x003c:
            io.ktor.utils.io.internal.g r7 = r2.X()
            io.ktor.utils.io.internal.i r7 = r7.f143754b
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L_0x004b
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        L_0x004b:
            io.ktor.utils.io.internal.c r7 = r2.V()
            if (r7 == 0) goto L_0x0088
            java.lang.Throwable r0 = r7.b()
            if (r0 != 0) goto L_0x007b
            io.ktor.utils.io.internal.g r7 = r2.X()
            io.ktor.utils.io.internal.i r7 = r7.f143754b
            boolean r0 = r7.e()
            if (r0 == 0) goto L_0x0068
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L_0x0068
            r3 = r4
        L_0x0068:
            dI.e r6 = r2.W()
            if (r6 != 0) goto L_0x0073
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        L_0x0073:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L_0x007b:
            java.lang.Throwable r6 = r7.b()
            java.lang.Void unused = io.ktor.utils.io.b.b(r6)
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        L_0x0088:
            r0.f143600c = r2
            r0.f143601d = r6
            r0.f143604g = r4
            java.lang.Object r7 = r2.n0(r6, r0)
            if (r7 != r1) goto L_0x0095
            return r1
        L_0x0095:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x003c
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.o0(int, dI.e):java.lang.Object");
    }

    private final void p0(g.c cVar) {
        this.f143537c.f3(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return r0.t0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final RH.k q0(long r10) {
        /*
            r9 = this;
            RH.j r0 = new RH.j
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            SH.a r1 = SH.g.d(r0, r2, r1)     // Catch:{ all -> 0x0045 }
        L_0x000b:
            int r3 = r1.g()     // Catch:{ all -> 0x001e }
            int r4 = r1.k()     // Catch:{ all -> 0x001e }
            int r3 = r3 - r4
            long r3 = (long) r3     // Catch:{ all -> 0x001e }
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x0020
            int r3 = (int) r10     // Catch:{ all -> 0x001e }
            r1.t(r3)     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r10 = move-exception
            goto L_0x0047
        L_0x0020:
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            r4 = r1
            int r3 = f0(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x001e }
            long r3 = (long) r3     // Catch:{ all -> 0x001e }
            long r10 = r10 - r3
            r3 = 0
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003d
            boolean r3 = r9.m()     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x003d
            SH.a r1 = SH.g.d(r0, r2, r1)     // Catch:{ all -> 0x001e }
            goto L_0x000b
        L_0x003d:
            r0.d()     // Catch:{ all -> 0x0045 }
            RH.k r10 = r0.t0()     // Catch:{ all -> 0x0045 }
            return r10
        L_0x0045:
            r10 = move-exception
            goto L_0x004b
        L_0x0047:
            r0.d()     // Catch:{ all -> 0x0045 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x004b:
            r0.J()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.q0(long):RH.k");
    }

    private final a s0(a aVar, io.ktor.utils.io.internal.d dVar) {
        while (aVar.X() == g.f.f143765c) {
            aVar = dVar.c();
            dVar = aVar.joining;
            if (dVar == null) {
                return aVar;
            }
        }
        return null;
    }

    private final void t0() {
        Object obj;
        io.ktor.utils.io.internal.g e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.g gVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar2 = (io.ktor.utils.io.internal.g) obj;
            g.b bVar = (g.b) gVar;
            if (bVar != null) {
                bVar.f143754b.j();
                x0();
                gVar = null;
            }
            e10 = gVar2.e();
            if ((e10 instanceof g.b) && X() == gVar2 && e10.f143754b.k()) {
                io.ktor.utils.io.internal.g gVar3 = e10;
                e10 = g.a.f143755c;
                gVar = gVar3;
            }
            atomicReferenceFieldUpdater = f143532m;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, e10));
        io.ktor.utils.io.internal.g gVar4 = g.a.f143755c;
        if (e10 == gVar4) {
            g.b bVar2 = (g.b) gVar;
            if (bVar2 != null) {
                p0(bVar2.g());
            }
            x0();
        } else if ((e10 instanceof g.b) && e10.f143754b.g() && e10.f143754b.k() && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e10, gVar4)) {
            e10.f143754b.j();
            p0(((g.b) e10).g());
            x0();
        }
    }

    private final void v0(Throwable th2) {
        C17164e eVar = (C17164e) f143534o.getAndSet(this, (Object) null);
        if (eVar != null) {
            if (th2 != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(y.a(th2)));
            } else {
                eVar.resumeWith(x.b(Boolean.valueOf(X().f143754b._availableForRead$internal > 0)));
            }
        }
        C17164e eVar2 = (C17164e) f143535p.getAndSet(this, (Object) null);
        if (eVar2 != null) {
            x.a aVar2 = x.f139812b;
            if (th2 == null) {
                th2 = new p("Byte channel was closed");
            }
            eVar2.resumeWith(x.b(y.a(th2)));
        }
    }

    /* access modifiers changed from: private */
    public final void w0() {
        Throwable th2 = null;
        C17164e eVar = (C17164e) f143534o.getAndSet(this, (Object) null);
        if (eVar != null) {
            io.ktor.utils.io.internal.c V10 = V();
            if (V10 != null) {
                th2 = V10.b();
            }
            if (th2 != null) {
                x.a aVar = x.f139812b;
                eVar.resumeWith(x.b(y.a(th2)));
                return;
            }
            x.a aVar2 = x.f139812b;
            eVar.resumeWith(x.b(Boolean.TRUE));
        }
    }

    private final void x0() {
        C17164e<C16807N> a02;
        io.ktor.utils.io.internal.c V10;
        Object a10;
        do {
            a02 = a0();
            if (a02 != null) {
                V10 = V();
                if (V10 == null && this.joining != null) {
                    io.ktor.utils.io.internal.g X10 = X();
                    if (!(X10 instanceof g.C3510g) && !(X10 instanceof g.e) && X10 != g.f.f143765c) {
                        return;
                    }
                }
            } else {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f143535p, this, a02, (Object) null));
        if (V10 == null) {
            x.a aVar = x.f139812b;
            a10 = C16807N.f139792a;
        } else {
            x.a aVar2 = x.f139812b;
            a10 = y.a(V10.c());
        }
        a02.resumeWith(x.b(a10));
    }

    private final void y0(C17164e<? super Boolean> eVar) {
        this._readOp = eVar;
    }

    public void A0(long j10) {
        this.totalBytesWritten = j10;
    }

    public final ByteBuffer C0() {
        Object obj;
        io.ktor.utils.io.internal.g gVar;
        g.a aVar;
        io.ktor.utils.io.internal.g gVar2;
        C17164e<C16807N> a02 = a0();
        if (a02 == null) {
            io.ktor.utils.io.internal.g gVar3 = null;
            g.c cVar = null;
            do {
                obj = this._state;
                gVar = (io.ktor.utils.io.internal.g) obj;
                if (this.joining != null) {
                    if (cVar != null) {
                        p0(cVar);
                    }
                    return null;
                } else if (V() != null) {
                    if (cVar != null) {
                        p0(cVar);
                    }
                    io.ktor.utils.io.internal.c V10 = V();
                    C17542s.g(V10);
                    Void unused = b.b(V10.c());
                    throw new C16820k();
                } else {
                    aVar = g.a.f143755c;
                    if (gVar == aVar) {
                        if (cVar == null) {
                            cVar = b0();
                        }
                        gVar2 = cVar.d();
                    } else if (gVar == g.f.f143765c) {
                        if (cVar != null) {
                            p0(cVar);
                        }
                        if (this.joining != null) {
                            return null;
                        }
                        io.ktor.utils.io.internal.c V11 = V();
                        C17542s.g(V11);
                        Void unused2 = b.b(V11.c());
                        throw new C16820k();
                    } else {
                        gVar2 = gVar.d();
                    }
                }
            } while (!androidx.concurrent.futures.b.a(f143532m, this, obj, gVar2));
            if (V() == null) {
                ByteBuffer b10 = gVar2.b();
                if (cVar != null) {
                    if (gVar == null) {
                        C17542s.z("old");
                    } else {
                        gVar3 = gVar;
                    }
                    if (gVar3 != aVar) {
                        p0(cVar);
                    }
                }
                c0(b10, this.f143540f, gVar2.f143754b._availableForWrite$internal);
                return b10;
            }
            u0();
            H0();
            io.ktor.utils.io.internal.c V12 = V();
            C17542s.g(V12);
            Void unused3 = b.b(V12.c());
            throw new C16820k();
        }
        throw new IllegalStateException("Write operation is already in progress: " + a02);
    }

    public final boolean H0() {
        if (V() == null || !G0(false)) {
            return false;
        }
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar != null) {
            T(dVar);
        }
        w0();
        x0();
        return true;
    }

    public final Object J0(int i10, C17164e<? super C16807N> eVar) {
        Throwable c10;
        if (!Z0(i10)) {
            io.ktor.utils.io.internal.c V10 = V();
            if (V10 == null || (c10 = V10.c()) == null) {
                return C16807N.f139792a;
            }
            Void unused = b.b(c10);
            throw new C16820k();
        }
        this.writeSuspensionSize = i10;
        if (this.attachedJob != null) {
            Object invoke = this.f143545k.invoke(eVar);
            if (invoke == C17187b.f()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return invoke == C17187b.f() ? invoke : C16807N.f139792a;
        }
        io.ktor.utils.io.internal.b<C16807N> bVar = this.f143544j;
        this.f143545k.invoke(bVar);
        Object f10 = bVar.f(C17187b.c(eVar));
        if (f10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public int N0(int i10, C17642l<? super ByteBuffer, C16807N> lVar) {
        a aVar;
        int i11;
        C17542s.j(lVar, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        } else if (i10 <= 4088) {
            io.ktor.utils.io.internal.d dVar = this.joining;
            if (dVar == null || (aVar = s0(this, dVar)) == null) {
                aVar = this;
            }
            ByteBuffer C02 = aVar.C0();
            boolean z10 = false;
            if (C02 == null) {
                i11 = 0;
            } else {
                io.ktor.utils.io.internal.i iVar = aVar.X().f143754b;
                long Z10 = aVar.Z();
                try {
                    io.ktor.utils.io.internal.c V10 = aVar.V();
                    if (V10 == null) {
                        int n10 = iVar.n(i10);
                        if (n10 <= 0) {
                            i11 = 0;
                        } else {
                            aVar.c0(C02, aVar.f143540f, n10);
                            int position = C02.position();
                            int limit = C02.limit();
                            lVar.invoke(C02);
                            if (limit == C02.limit()) {
                                int position2 = C02.position() - position;
                                if (position2 < 0) {
                                    throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                                } else if (position2 >= 0) {
                                    aVar.N(C02, iVar, position2);
                                    if (position2 < n10) {
                                        iVar.a(n10 - position2);
                                    }
                                    int i12 = position2;
                                    z10 = true;
                                    i11 = i12;
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                throw new IllegalStateException("Buffer limit modified");
                            }
                        }
                    } else {
                        Void unused = b.b(V10.c());
                        throw new C16820k();
                    }
                } finally {
                    if (iVar.h() || aVar.o()) {
                        aVar.flush();
                    }
                    if (aVar != this) {
                        A0(Z() + (aVar.Z() - Z10));
                    }
                    aVar.u0();
                    aVar.H0();
                }
            }
            if (!z10) {
                return -1;
            }
            return i11;
        } else {
            throw new IllegalArgumentException(("Min(" + i10 + ") shouldn't be greater than 4088").toString());
        }
    }

    public Object O0(byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar) {
        return P0(this, bArr, i10, i11, eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: io.ktor.utils.io.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0273 A[Catch:{ all -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0284 A[Catch:{ all -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0307 A[Catch:{ all -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0317 A[Catch:{ all -> 0x030e }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0333 A[SYNTHETIC, Splitter:B:166:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0358 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0392 A[ADDED_TO_REGION, Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x039b A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03b4 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0401 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0417 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0124 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0161 A[Catch:{ all -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0190 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(io.ktor.utils.io.a r28, long r29, io.ktor.utils.io.internal.d r31, dI.C17164e<? super java.lang.Long> r32) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r2 = r31
            r3 = r32
            boolean r4 = r3 instanceof io.ktor.utils.io.a.d
            if (r4 == 0) goto L_0x001b
            r4 = r3
            io.ktor.utils.io.a$d r4 = (io.ktor.utils.io.a.d) r4
            int r5 = r4.f143568r
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f143568r = r5
            goto L_0x0020
        L_0x001b:
            io.ktor.utils.io.a$d r4 = new io.ktor.utils.io.a$d
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f143566p
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r4.f143568r
            r7 = 3
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x00d3
            if (r6 == r9) goto L_0x007e
            if (r6 == r8) goto L_0x0061
            if (r6 != r7) goto L_0x0059
            boolean r0 = r4.f143565o
            long r11 = r4.f143563m
            java.lang.Object r2 = r4.f143556f
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r6 = r4.f143555e
            io.ktor.utils.io.internal.d r6 = (io.ktor.utils.io.internal.d) r6
            java.lang.Object r13 = r4.f143554d
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.a) r13
            java.lang.Object r14 = r4.f143553c
            io.ktor.utils.io.a r14 = (io.ktor.utils.io.a) r14
            XH.y.b(r3)     // Catch:{ all -> 0x0056 }
            r10 = r9
            r1 = 0
            r9 = r7
            r7 = r4
            r4 = r6
            r6 = r0
            r0 = r5
            r5 = r8
            r8 = r2
            r2 = r11
            goto L_0x03d8
        L_0x0056:
            r0 = move-exception
            goto L_0x0424
        L_0x0059:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0061:
            boolean r0 = r4.f143565o
            long r11 = r4.f143563m
            java.lang.Object r2 = r4.f143556f
            kotlin.jvm.internal.N r2 = (kotlin.jvm.internal.N) r2
            java.lang.Object r6 = r4.f143555e
            io.ktor.utils.io.internal.d r6 = (io.ktor.utils.io.internal.d) r6
            java.lang.Object r13 = r4.f143554d
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.a) r13
            java.lang.Object r14 = r4.f143553c
            io.ktor.utils.io.a r14 = (io.ktor.utils.io.a) r14
            XH.y.b(r3)     // Catch:{ all -> 0x0056 }
            r1 = r6
            r6 = r0
            r0 = r5
            r5 = r8
            goto L_0x038a
        L_0x007e:
            long r11 = r4.f143564n
            boolean r0 = r4.f143565o
            long r13 = r4.f143563m
            java.lang.Object r2 = r4.f143562l
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            java.lang.Object r6 = r4.f143561k
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r15 = r4.f143560j
            io.ktor.utils.io.internal.i r15 = (io.ktor.utils.io.internal.i) r15
            java.lang.Object r7 = r4.f143559i
            io.ktor.utils.io.internal.i r7 = (io.ktor.utils.io.internal.i) r7
            java.lang.Object r8 = r4.f143558h
            io.ktor.utils.io.a r8 = (io.ktor.utils.io.a) r8
            java.lang.Object r10 = r4.f143557g
            io.ktor.utils.io.a r10 = (io.ktor.utils.io.a) r10
            java.lang.Object r9 = r4.f143556f
            kotlin.jvm.internal.N r9 = (kotlin.jvm.internal.N) r9
            r28 = r0
            java.lang.Object r0 = r4.f143555e
            io.ktor.utils.io.internal.d r0 = (io.ktor.utils.io.internal.d) r0
            r29 = r0
            java.lang.Object r0 = r4.f143554d
            io.ktor.utils.io.a r0 = (io.ktor.utils.io.a) r0
            r30 = r0
            java.lang.Object r0 = r4.f143553c
            r16 = r0
            io.ktor.utils.io.a r16 = (io.ktor.utils.io.a) r16
            XH.y.b(r3)     // Catch:{ all -> 0x00ce }
            r3 = r2
            r2 = r29
            r23 = r6
            r6 = r28
            r28 = r30
            r24 = r10
            r10 = r23
            r25 = r13
            r14 = r24
            r13 = r16
            r16 = r25
            goto L_0x01a1
        L_0x00ce:
            r0 = move-exception
            r14 = r16
            goto L_0x03f0
        L_0x00d3:
            XH.y.b(r3)
            boolean r3 = r28.m()
            r6 = 0
            if (r3 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x00ef
            boolean r2 = r0.F0(r2)
            if (r2 == 0) goto L_0x00e7
            goto L_0x00ef
        L_0x00e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Check failed."
            r0.<init>(r2)
            throw r0
        L_0x00ef:
            java.lang.Throwable r2 = r28.c()
            if (r2 == 0) goto L_0x00fc
            java.lang.Throwable r0 = r28.c()
            r1.a(r0)
        L_0x00fc:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r6)
            return r0
        L_0x0101:
            if (r2 == 0) goto L_0x010e
            boolean r3 = r0.F0(r2)
            if (r3 == 0) goto L_0x010e
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r6)
            return r0
        L_0x010e:
            boolean r3 = r27.o()
            kotlin.jvm.internal.N r6 = new kotlin.jvm.internal.N     // Catch:{ all -> 0x0421 }
            r6.<init>()     // Catch:{ all -> 0x0421 }
            r14 = r1
            r7 = r4
            r8 = r6
            r4 = r2
            r6 = r3
            r2 = r29
        L_0x011e:
            long r9 = r8.f144347a     // Catch:{ all -> 0x0056 }
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0415
            io.ktor.utils.io.internal.d r9 = r14.joining     // Catch:{ all -> 0x0056 }
            if (r9 == 0) goto L_0x012e
            io.ktor.utils.io.a r9 = r14.s0(r14, r9)     // Catch:{ all -> 0x0056 }
            if (r9 != 0) goto L_0x012f
        L_0x012e:
            r9 = r14
        L_0x012f:
            java.nio.ByteBuffer r10 = r9.C0()     // Catch:{ all -> 0x0056 }
            if (r10 != 0) goto L_0x013b
            r1 = r4
            r3 = r2
            r2 = r0
            r0 = r5
            goto L_0x0331
        L_0x013b:
            io.ktor.utils.io.internal.g r11 = r9.X()     // Catch:{ all -> 0x0056 }
            io.ktor.utils.io.internal.i r11 = r11.f143754b     // Catch:{ all -> 0x0056 }
            long r12 = r9.Z()     // Catch:{ all -> 0x0056 }
            io.ktor.utils.io.internal.c r15 = r9.V()     // Catch:{ all -> 0x03eb }
            if (r15 != 0) goto L_0x03de
            r16 = r5
            r30 = r6
            r15 = r11
            r28 = r12
            r12 = r2
            r2 = r9
            r3 = r14
            r9 = r8
            r8 = r2
        L_0x0157:
            long r5 = r9.f144347a     // Catch:{ all -> 0x01ce }
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 >= 0) goto L_0x02ec
            int r5 = r15._availableForWrite$internal     // Catch:{ all -> 0x01ce }
            if (r5 != 0) goto L_0x01d4
            r7.f143553c = r3     // Catch:{ all -> 0x01ce }
            r7.f143554d = r0     // Catch:{ all -> 0x01ce }
            r7.f143555e = r4     // Catch:{ all -> 0x01ce }
            r7.f143556f = r9     // Catch:{ all -> 0x01ce }
            r7.f143557g = r14     // Catch:{ all -> 0x01ce }
            r7.f143558h = r8     // Catch:{ all -> 0x01ce }
            r7.f143559i = r11     // Catch:{ all -> 0x01ce }
            r7.f143560j = r15     // Catch:{ all -> 0x01ce }
            r7.f143561k = r10     // Catch:{ all -> 0x01ce }
            r7.f143562l = r2     // Catch:{ all -> 0x01ce }
            r7.f143563m = r12     // Catch:{ all -> 0x01ce }
            r6 = r30
            r7.f143565o = r6     // Catch:{ all -> 0x01ce }
            r31 = r3
            r30 = r4
            r3 = r28
            r7.f143564n = r3     // Catch:{ all -> 0x01c6 }
            r5 = 1
            r7.f143568r = r5     // Catch:{ all -> 0x01c6 }
            r28 = r0
            java.lang.Object r0 = r2.J0(r5, r7)     // Catch:{ all -> 0x01c6 }
            r5 = r16
            if (r0 != r5) goto L_0x0191
            return r5
        L_0x0191:
            r16 = r12
            r13 = r31
            r23 = r2
            r2 = r30
            r24 = r3
            r3 = r23
            r4 = r7
            r7 = r11
            r11 = r24
        L_0x01a1:
            io.ktor.utils.io.internal.d r0 = r3.joining     // Catch:{ all -> 0x01b7 }
            if (r0 != 0) goto L_0x01bc
            int r0 = r15._availableForWrite$internal     // Catch:{ all -> 0x01b7 }
            r1 = r15
            r15 = r14
            r14 = r7
            r7 = r4
            r23 = r2
            r2 = r28
            r28 = r23
            r24 = r5
            r5 = r0
            r0 = r24
            goto L_0x01ed
        L_0x01b7:
            r0 = move-exception
            r10 = r14
        L_0x01b9:
            r14 = r13
            goto L_0x03f0
        L_0x01bc:
            r0 = r5
            r1 = r13
            r12 = r11
            r11 = r7
            r7 = r4
            r4 = r2
            r2 = r28
            goto L_0x0301
        L_0x01c6:
            r0 = move-exception
        L_0x01c7:
            r7 = r11
            r10 = r14
            r14 = r31
            r11 = r3
            goto L_0x03f0
        L_0x01ce:
            r0 = move-exception
            r31 = r3
            r3 = r28
            goto L_0x01c7
        L_0x01d4:
            r6 = r30
            r31 = r3
            r30 = r4
            r3 = r28
            r28 = r0
            r0 = r16
            r16 = r12
            r1 = r15
            r13 = r31
            r15 = r14
            r14 = r11
            r11 = r3
            r3 = r2
            r2 = r28
            r28 = r30
        L_0x01ed:
            int r4 = r3.f143540f     // Catch:{ all -> 0x02e2 }
            r3.c0(r10, r4, r5)     // Catch:{ all -> 0x02e2 }
            kotlin.jvm.internal.M r4 = new kotlin.jvm.internal.M     // Catch:{ all -> 0x02e2 }
            r4.<init>()     // Catch:{ all -> 0x02e2 }
            r29 = r7
            java.nio.ByteBuffer r7 = r2.B0()     // Catch:{ all -> 0x02e2 }
            if (r7 != 0) goto L_0x020c
            r22 = r5
            r21 = r6
            r30 = r8
            r18 = r11
        L_0x0207:
            r31 = r13
            r20 = r14
            goto L_0x026f
        L_0x020c:
            r30 = r8
            io.ktor.utils.io.internal.g r8 = r2.X()     // Catch:{ all -> 0x02d5 }
            io.ktor.utils.io.internal.i r8 = r8.f143754b     // Catch:{ all -> 0x02d5 }
            r18 = r11
            int r11 = r8._availableForRead$internal     // Catch:{ all -> 0x02ca }
            if (r11 != 0) goto L_0x022d
            r2.t0()     // Catch:{ all -> 0x0225 }
            r2.H0()     // Catch:{ all -> 0x0225 }
            r22 = r5
            r21 = r6
            goto L_0x0207
        L_0x0225:
            r0 = move-exception
            r8 = r30
            r7 = r14
            r10 = r15
            r11 = r18
            goto L_0x01b9
        L_0x022d:
            int r11 = r7.remaining()     // Catch:{ all -> 0x02ca }
            long r11 = (long) r11
            r31 = r13
            int r13 = r10.remaining()     // Catch:{ all -> 0x02c6 }
            r20 = r14
            long r13 = (long) r13
            r22 = r5
            r21 = r6
            long r5 = r9.f144347a     // Catch:{ all -> 0x02be }
            long r5 = r16 - r5
            long r5 = java.lang.Math.min(r13, r5)     // Catch:{ all -> 0x02be }
            long r5 = java.lang.Math.min(r11, r5)     // Catch:{ all -> 0x02be }
            int r5 = (int) r5     // Catch:{ all -> 0x02be }
            int r5 = r1.o(r5)     // Catch:{ all -> 0x02be }
            if (r5 > 0) goto L_0x0253
            goto L_0x0269
        L_0x0253:
            boolean r6 = r8.m(r5)     // Catch:{ all -> 0x02be }
            if (r6 == 0) goto L_0x02c0
            int r6 = r7.position()     // Catch:{ all -> 0x02be }
            int r6 = r6 + r5
            r7.limit(r6)     // Catch:{ all -> 0x02be }
            r10.put(r7)     // Catch:{ all -> 0x02be }
            r4.f144346a = r5     // Catch:{ all -> 0x02be }
            r2.M(r7, r8, r5)     // Catch:{ all -> 0x02be }
        L_0x0269:
            r2.t0()     // Catch:{ all -> 0x02b2 }
            r2.H0()     // Catch:{ all -> 0x02b2 }
        L_0x026f:
            int r5 = r4.f144346a     // Catch:{ all -> 0x02b2 }
            if (r5 > 0) goto L_0x0284
            r4 = r28
            r7 = r29
            r8 = r30
            r1 = r31
            r14 = r15
            r12 = r18
            r11 = r20
            r6 = r21
            goto L_0x0301
        L_0x0284:
            r3.N(r10, r1, r5)     // Catch:{ all -> 0x02b2 }
            long r5 = r9.f144347a     // Catch:{ all -> 0x02b2 }
            int r4 = r4.f144346a     // Catch:{ all -> 0x02b2 }
            long r7 = (long) r4     // Catch:{ all -> 0x02b2 }
            long r5 = r5 + r7
            r9.f144347a = r5     // Catch:{ all -> 0x02b2 }
            int r5 = r22 - r4
            if (r5 == 0) goto L_0x0295
            if (r21 == 0) goto L_0x0298
        L_0x0295:
            r3.flush()     // Catch:{ all -> 0x02b2 }
        L_0x0298:
            r4 = r28
            r7 = r29
            r8 = r30
            r14 = r15
            r12 = r16
            r28 = r18
            r11 = r20
            r30 = r21
            r16 = r0
            r15 = r1
            r0 = r2
            r2 = r3
            r1 = r27
            r3 = r31
            goto L_0x0157
        L_0x02b2:
            r0 = move-exception
            r8 = r30
            r14 = r31
            r10 = r15
            r11 = r18
        L_0x02ba:
            r7 = r20
            goto L_0x03f0
        L_0x02be:
            r0 = move-exception
            goto L_0x02ce
        L_0x02c0:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x02be }
            r0.<init>()     // Catch:{ all -> 0x02be }
            throw r0     // Catch:{ all -> 0x02be }
        L_0x02c6:
            r0 = move-exception
        L_0x02c7:
            r20 = r14
            goto L_0x02ce
        L_0x02ca:
            r0 = move-exception
            r31 = r13
            goto L_0x02c7
        L_0x02ce:
            r2.t0()     // Catch:{ all -> 0x02b2 }
            r2.H0()     // Catch:{ all -> 0x02b2 }
            throw r0     // Catch:{ all -> 0x02b2 }
        L_0x02d5:
            r0 = move-exception
            r18 = r11
            r31 = r13
            r20 = r14
            r8 = r30
        L_0x02de:
            r14 = r31
            r10 = r15
            goto L_0x02ba
        L_0x02e2:
            r0 = move-exception
            r30 = r8
            r18 = r11
            r31 = r13
            r20 = r14
            goto L_0x02de
        L_0x02ec:
            r6 = r30
            r31 = r3
            r30 = r4
            r3 = r28
            r28 = r0
            r0 = r16
            r2 = r28
            r1 = r31
            r16 = r12
            r12 = r3
            r4 = r30
        L_0x0301:
            boolean r3 = r11.h()     // Catch:{ all -> 0x030e }
            if (r3 != 0) goto L_0x0312
            boolean r3 = r8.o()     // Catch:{ all -> 0x030e }
            if (r3 == 0) goto L_0x0315
            goto L_0x0312
        L_0x030e:
            r0 = move-exception
            r14 = r1
            goto L_0x0424
        L_0x0312:
            r8.flush()     // Catch:{ all -> 0x030e }
        L_0x0315:
            if (r8 == r14) goto L_0x0326
            long r10 = r14.Z()     // Catch:{ all -> 0x030e }
            long r18 = r8.Z()     // Catch:{ all -> 0x030e }
            long r18 = r18 - r12
            long r10 = r10 + r18
            r14.A0(r10)     // Catch:{ all -> 0x030e }
        L_0x0326:
            r8.u0()     // Catch:{ all -> 0x030e }
            r8.H0()     // Catch:{ all -> 0x030e }
            r14 = r1
            r1 = r4
            r8 = r9
            r3 = r16
        L_0x0331:
            if (r1 == 0) goto L_0x0352
            boolean r5 = r2.F0(r1)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x033b
            goto L_0x0415
        L_0x033b:
            io.ktor.utils.io.internal.g r5 = r2.X()     // Catch:{ all -> 0x0056 }
            io.ktor.utils.io.internal.i r5 = r5.f143754b     // Catch:{ all -> 0x0056 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0352
            r2.x0()     // Catch:{ all -> 0x0056 }
            r5 = r0
            r0 = r2
            r2 = r3
            r4 = r1
            r1 = r27
            goto L_0x011e
        L_0x0352:
            long r9 = r8.f144347a     // Catch:{ all -> 0x0056 }
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0415
            r14.flush()     // Catch:{ all -> 0x0056 }
            int r5 = r2.e()     // Catch:{ all -> 0x0056 }
            if (r5 != 0) goto L_0x03ac
            r7.f143553c = r14     // Catch:{ all -> 0x0056 }
            r7.f143554d = r2     // Catch:{ all -> 0x0056 }
            r7.f143555e = r1     // Catch:{ all -> 0x0056 }
            r7.f143556f = r8     // Catch:{ all -> 0x0056 }
            r5 = 0
            r7.f143557g = r5     // Catch:{ all -> 0x0056 }
            r7.f143558h = r5     // Catch:{ all -> 0x0056 }
            r7.f143559i = r5     // Catch:{ all -> 0x0056 }
            r7.f143560j = r5     // Catch:{ all -> 0x0056 }
            r7.f143561k = r5     // Catch:{ all -> 0x0056 }
            r7.f143562l = r5     // Catch:{ all -> 0x0056 }
            r7.f143563m = r3     // Catch:{ all -> 0x0056 }
            r7.f143565o = r6     // Catch:{ all -> 0x0056 }
            r5 = 2
            r7.f143568r = r5     // Catch:{ all -> 0x0056 }
            r9 = 1
            java.lang.Object r10 = r2.n0(r9, r7)     // Catch:{ all -> 0x0056 }
            if (r10 != r0) goto L_0x0385
            return r0
        L_0x0385:
            r13 = r2
            r11 = r3
            r4 = r7
            r2 = r8
            r3 = r10
        L_0x038a:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0056 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x039b
            if (r1 == 0) goto L_0x03a4
            boolean r3 = r13.F0(r1)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x03a4
            goto L_0x03a9
        L_0x039b:
            if (r1 == 0) goto L_0x03a9
            boolean r3 = r13.F0(r1)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x03a4
            goto L_0x03a9
        L_0x03a4:
            r8 = r2
            r7 = r4
            r2 = r11
        L_0x03a7:
            r4 = r1
            goto L_0x03b0
        L_0x03a9:
            r8 = r2
            goto L_0x0415
        L_0x03ac:
            r5 = 2
            r13 = r2
            r2 = r3
            goto L_0x03a7
        L_0x03b0:
            io.ktor.utils.io.internal.d r1 = r14.joining     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x03d8
            r7.f143553c = r14     // Catch:{ all -> 0x0056 }
            r7.f143554d = r13     // Catch:{ all -> 0x0056 }
            r7.f143555e = r4     // Catch:{ all -> 0x0056 }
            r7.f143556f = r8     // Catch:{ all -> 0x0056 }
            r1 = 0
            r7.f143557g = r1     // Catch:{ all -> 0x0056 }
            r7.f143558h = r1     // Catch:{ all -> 0x0056 }
            r7.f143559i = r1     // Catch:{ all -> 0x0056 }
            r7.f143560j = r1     // Catch:{ all -> 0x0056 }
            r7.f143561k = r1     // Catch:{ all -> 0x0056 }
            r7.f143562l = r1     // Catch:{ all -> 0x0056 }
            r7.f143563m = r2     // Catch:{ all -> 0x0056 }
            r7.f143565o = r6     // Catch:{ all -> 0x0056 }
            r9 = 3
            r7.f143568r = r9     // Catch:{ all -> 0x0056 }
            r10 = 1
            java.lang.Object r11 = r14.J0(r10, r7)     // Catch:{ all -> 0x0056 }
            if (r11 != r0) goto L_0x03d8
            return r0
        L_0x03d8:
            r1 = r27
            r5 = r0
            r0 = r13
            goto L_0x011e
        L_0x03de:
            java.lang.Throwable r0 = r15.c()     // Catch:{ all -> 0x03eb }
            java.lang.Void unused = io.ktor.utils.io.b.b(r0)     // Catch:{ all -> 0x03eb }
            XH.k r0 = new XH.k     // Catch:{ all -> 0x03eb }
            r0.<init>()     // Catch:{ all -> 0x03eb }
            throw r0     // Catch:{ all -> 0x03eb }
        L_0x03eb:
            r0 = move-exception
            r8 = r9
            r7 = r11
            r11 = r12
            r10 = r14
        L_0x03f0:
            boolean r1 = r7.h()     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x03fc
            boolean r1 = r8.o()     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x03ff
        L_0x03fc:
            r8.flush()     // Catch:{ all -> 0x0056 }
        L_0x03ff:
            if (r8 == r10) goto L_0x040e
            long r1 = r10.Z()     // Catch:{ all -> 0x0056 }
            long r3 = r8.Z()     // Catch:{ all -> 0x0056 }
            long r3 = r3 - r11
            long r1 = r1 + r3
            r10.A0(r1)     // Catch:{ all -> 0x0056 }
        L_0x040e:
            r8.u0()     // Catch:{ all -> 0x0056 }
            r8.H0()     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0415:
            if (r6 == 0) goto L_0x041a
            r14.flush()     // Catch:{ all -> 0x0056 }
        L_0x041a:
            long r0 = r8.f144347a     // Catch:{ all -> 0x0056 }
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.f(r0)     // Catch:{ all -> 0x0056 }
            return r0
        L_0x0421:
            r0 = move-exception
            r14 = r27
        L_0x0424:
            r14.a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.P(io.ktor.utils.io.a, long, io.ktor.utils.io.internal.d, dI.e):java.lang.Object");
    }

    public final io.ktor.utils.io.internal.g Q() {
        return X();
    }

    public long Y() {
        return this.totalBytesRead;
    }

    public long Z() {
        return this.totalBytesWritten;
    }

    public boolean a(Throwable th2) {
        io.ktor.utils.io.internal.d dVar;
        if (V() != null) {
            return false;
        }
        io.ktor.utils.io.internal.c a10 = th2 == null ? io.ktor.utils.io.internal.c.f143739b.a() : new io.ktor.utils.io.internal.c(th2);
        X().f143754b.e();
        if (!androidx.concurrent.futures.b.a(f143533n, this, (Object) null, a10)) {
            return false;
        }
        X().f143754b.e();
        if (X().f143754b.g() || th2 != null) {
            H0();
        }
        v0(th2);
        if (X() == g.f.f143765c && (dVar = this.joining) != null) {
            T(dVar);
        }
        if (th2 != null) {
            F0 f02 = this.attachedJob;
            if (f02 != null) {
                F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            }
            this.f143543i.e(th2);
            this.f143544j.e(th2);
            return true;
        }
        this.f143544j.e(new p("Byte channel was closed"));
        this.f143543i.d(Boolean.valueOf(X().f143754b.e()));
        return true;
    }

    public Object b(int i10, C17642l<? super ByteBuffer, C16807N> lVar, C17164e<? super C16807N> eVar) {
        return K0(this, i10, lVar, eVar);
    }

    public Throwable c() {
        io.ktor.utils.io.internal.c V10 = V();
        if (V10 != null) {
            return V10.b();
        }
        return null;
    }

    public Object d(long j10, C17164e<? super RH.k> eVar) {
        return k0(this, j10, eVar);
    }

    public int e() {
        return X().f143754b._availableForRead$internal;
    }

    @C16814e
    public void f(F0 f02) {
        C17542s.j(f02, "job");
        F0 f03 = this.attachedJob;
        if (f03 != null) {
            F0.a.a(f03, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = f02;
        F0.a.d(f02, true, false, new b(this), 2, (Object) null);
    }

    public void flush() {
        U(1);
    }

    public Object g(C16416a aVar, C17164e<? super Integer> eVar) {
        return g0(this, aVar, eVar);
    }

    public boolean h() {
        return V() != null;
    }

    public Object i(long j10, C17164e<? super Long> eVar) {
        return R(this, j10, eVar);
    }

    public Object j(byte[] bArr, int i10, int i11, C17164e<? super Integer> eVar) {
        return h0(this, bArr, i10, i11, eVar);
    }

    public Object k(C16368a aVar, C17164e<? super C16807N> eVar) {
        return Q0(this, aVar, eVar);
    }

    public Object l(byte[] bArr, int i10, int i11, C17164e<? super C16807N> eVar) {
        return R0(this, bArr, i10, i11, eVar);
    }

    public boolean m() {
        return X() == g.f.f143765c && V() != null;
    }

    public Object n(RH.k kVar, C17164e<? super C16807N> eVar) {
        return U0(this, kVar, eVar);
    }

    public boolean o() {
        return this.f143536b;
    }

    public boolean p(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return a(th2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = s0(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.ktor.utils.io.a r0() {
        /*
            r1 = this;
            io.ktor.utils.io.internal.d r0 = r1.joining
            if (r0 == 0) goto L_0x000a
            io.ktor.utils.io.a r0 = r1.s0(r1, r0)
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.r0():io.ktor.utils.io.a");
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + X() + ')';
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0027: MOVE  (r0v3 io.ktor.utils.io.internal.g$b) = (r0v2 io.ktor.utils.io.internal.g$b)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void u0() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            java.lang.Object r1 = r5._state
            r2 = r1
            io.ktor.utils.io.internal.g r2 = (io.ktor.utils.io.internal.g) r2
            io.ktor.utils.io.internal.g r2 = r2.f()
            boolean r3 = r2 instanceof io.ktor.utils.io.internal.g.b
            if (r3 == 0) goto L_0x001b
            io.ktor.utils.io.internal.i r3 = r2.f143754b
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x001b
            io.ktor.utils.io.internal.g$a r0 = io.ktor.utils.io.internal.g.a.f143755c
            r4 = r2
            r2 = r0
            r0 = r4
        L_0x001b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f143532m
            boolean r1 = androidx.concurrent.futures.b.a(r3, r5, r1, r2)
            if (r1 == 0) goto L_0x0001
            io.ktor.utils.io.internal.g$a r1 = io.ktor.utils.io.internal.g.a.f143755c
            if (r2 != r1) goto L_0x0032
            io.ktor.utils.io.internal.g$b r0 = (io.ktor.utils.io.internal.g.b) r0
            if (r0 == 0) goto L_0x0032
            io.ktor.utils.io.internal.g$c r0 = r0.g()
            r5.p0(r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.u0():void");
    }

    public void z0(long j10) {
        this.totalBytesRead = j10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z10, C16492f<g.c> fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i11 & 2) != 0 ? io.ktor.utils.io.internal.e.c() : fVar, (i11 & 4) != 0 ? 8 : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.e.b(), 0);
        C17542s.j(byteBuffer, "content");
        ByteBuffer slice = byteBuffer.slice();
        C17542s.i(slice, "content.slice()");
        g.c cVar = new g.c(slice, 0);
        cVar.f143754b.i();
        this._state = cVar.d();
        u0();
        k.a(this);
        H0();
    }
}
