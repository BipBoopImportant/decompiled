package U0;

import U0.B0;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import dI.C17168i;
import g1.C5333b;
import g1.C5347p;
import h1.C5410a;
import j0.C;
import j0.N;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004Ö\u0002´\u0001BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J!\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b:\u0010;J6\u0010?\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u000207H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bW\u0010NJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010NJ\u001f\u0010Z\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010QJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0014J'\u0010_\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010QJ/\u0010e\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010VJ\u001b\u0010g\u001a\u00020\u0017*\u00020f2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u0012H\u0002¢\u0006\u0004\bj\u0010\u0014J9\u0010p\u001a\u00020\u00122\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0k2\u0006\u0010m\u001a\u00020'2\b\u0010n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u000207H\u0002¢\u0006\u0004\bp\u0010qJ+\u0010v\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0002¢\u0006\u0004\bv\u0010wJf\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010x2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020{\u0012\u0006\u0012\u0004\u0018\u00010\u001b0s0r2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0002¢\u0006\u0005\b\u0010\u0001J8\u0010\u0001\u001a\u00020\u00122\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u00012\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010}H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J \u0010\u0001\u001a\u0004\u0018\u00010\u001b*\u00020f2\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u001b\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u001a\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u0001\u0010\u001aJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0014J\u0019\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0001\u0010\u001aJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0001\u0010\u0014J\u0019\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0001\u0010\u001aJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0001\u0010\u0014J#\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u0001\u0010\u001eJ\u0011\u0010\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010\u0014J\u0011\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010\u0014J(\u0010¡\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010\u00012\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0014J\u0011\u0010¤\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0014J#\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b¥\u0001\u0010\u001eJ\u0011\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0014J\u000f\u0010§\u0001\u001a\u00020\u0012¢\u0006\u0005\b§\u0001\u0010\u0014J\u000f\u0010¨\u0001\u001a\u00020\u0012¢\u0006\u0005\b¨\u0001\u0010\u0014J\u001a\u0010ª\u0001\u001a\u00020\u00122\u0007\u0010©\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\bª\u0001\u0010\u001aJC\u0010­\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010«\u0001\"\u0005\b\u0001\u0010\u00012\u0006\u0010!\u001a\u00028\u00002\u0019\u0010~\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120¬\u0001H\u0016¢\u0006\u0006\b­\u0001\u0010®\u0001J\u0014\u0010¯\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0014\u0010±\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001c\u0010«\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b«\u0001\u0010²\u0001J\u001c\u0010³\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b³\u0001\u0010²\u0001J\u001a\u0010´\u0001\u001a\u0002072\u0006\u0010!\u001a\u000207H\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001b\u0010·\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030¶\u0001H\u0017¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001b\u0010º\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030¹\u0001H\u0017¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001b\u0010½\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030¼\u0001H\u0017¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010¿\u0001\u001a\u0002072\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001b\u0010Á\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÁ\u0001\u0010#J\u001b\u0010Â\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÂ\u0001\u0010#J!\u0010Ä\u0001\u001a\u00020\u00122\r\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\bÄ\u0001\u0010¢\u0001J\u001f\u0010Æ\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030Å\u0001H\u0017¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0011\u0010È\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÈ\u0001\u0010\u0014J)\u0010Ë\u0001\u001a\u00020\u00122\u0015\u0010Ê\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Å\u00010É\u0001H\u0017¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0011\u0010Í\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÍ\u0001\u0010\u0014J(\u0010Ï\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000Î\u0001H\u0017¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0012\u0010Ñ\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J&\u0010Õ\u0001\u001a\u0002072\u0007\u0010Ó\u0001\u001a\u00020{2\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0011\u0010×\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b×\u0001\u0010\u0014J\u0011\u0010Ø\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bØ\u0001\u0010\u0014J\u001a\u0010Ú\u0001\u001a\u00020\u00122\u0007\u0010Ù\u0001\u001a\u000207H\u0017¢\u0006\u0005\bÚ\u0001\u0010JJ\u001a\u0010Û\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0015\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u0001H\u0017¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J-\u0010à\u0001\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0017¢\u0006\u0005\bà\u0001\u0010wJ6\u0010á\u0001\u001a\u00020\u00122\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u00012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bá\u0001\u0010\u0001J \u0010â\u0001\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bâ\u0001\u0010¢\u0001J(\u0010ã\u0001\u001a\u0002072\u0014\u0010\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0001H\u0000¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0014\u0010å\u0001\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\bå\u0001\u0010°\u0001J\u001b\u0010æ\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\bæ\u0001\u0010#J\u001c\u0010è\u0001\u001a\u00020\u00122\b\u0010Ó\u0001\u001a\u00030ç\u0001H\u0016¢\u0006\u0006\bè\u0001\u0010é\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010í\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010î\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010ï\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010ð\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010ð\u0001R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R \u0010÷\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u001b\u0010ù\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010ø\u0001R\u0019\u0010ú\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010\u0001R\u0019\u0010ü\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bû\u0001\u0010\u0001R\u0018\u0010c\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bë\u0001\u0010\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ý\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010þ\u0001R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0002R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001e\u0010|\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028\u0002X\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u0002R\u0018\u0010\u0002\u001a\u00030ý\u00018\u0002X\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010þ\u0001R\u0019\u0010\u0002\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0002R\"\u0010\u0002\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0002R\u0018\u0010\u0002\u001a\u00030ý\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010þ\u0001R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0001R\u0019\u0010\u0002\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0001R\u0019\u0010\u0002\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bå\u0001\u0010\u0002R\u0018\u0010 \u0002\u001a\u00030\u00028\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001e\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020{0ô\u00018\u0002X\u0004¢\u0006\b\n\u0006\b³\u0001\u0010ö\u0001R*\u0010¥\u0002\u001a\u0002072\u0007\u0010¢\u0002\u001a\u0002078\u0000@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0002\u001a\u0006\b£\u0002\u0010¤\u0002R*\u0010§\u0002\u001a\u0002072\u0007\u0010¢\u0002\u001a\u0002078\u0000@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0002\u001a\u0006\b¦\u0002\u0010¤\u0002R)\u0010­\u0002\u001a\u00020f8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002\"\u0006\b«\u0002\u0010¬\u0002R)\u0010²\u0002\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010î\u0001\u001a\u0006\b®\u0002\u0010¯\u0002\"\u0006\b°\u0002\u0010±\u0002R\u001a\u0010µ\u0002\u001a\u00030³\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bË\u0001\u0010´\u0002R\u0019\u0010¶\u0002\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u0002R\u001b\u0010·\u0002\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bè\u0001\u0010\u0002R+\u0010¼\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010ð\u0001\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R\u0018\u0010À\u0002\u001a\u00030½\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0019\u0010Â\u0002\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010Á\u0002R\u001a\u0010Å\u0002\u001a\u00030Ã\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ä\u0002R/\u0010F\u001a\u0002072\u0007\u0010¢\u0002\u001a\u0002078\u0016@RX\u000e¢\u0006\u0016\n\u0005\bx\u0010\u0002\u0012\u0005\bÆ\u0002\u0010\u0014\u001a\u0006\bõ\u0001\u0010¤\u0002R0\u0010É\u0002\u001a\u00020\u00172\u0007\u0010¢\u0002\u001a\u00020\u00178\u0016@RX\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010\u0001\u0012\u0005\bÈ\u0002\u0010\u0014\u001a\u0005\bx\u0010Ç\u0002R\u001d\u0010Ì\u0002\u001a\u0004\u0018\u00010\u001b*\u00020f8BX\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0017\u0010Î\u0002\u001a\u0002078@X\u0004¢\u0006\b\u001a\u0006\bÍ\u0002\u0010¤\u0002R\u0018\u0010Ñ\u0002\u001a\u00030Ï\u00028WX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010Ð\u0002R\u001e\u0010Ó\u0002\u001a\u0002078VX\u0004¢\u0006\u000f\u0012\u0005\bÒ\u0002\u0010\u0014\u001a\u0006\b¾\u0002\u0010¤\u0002R\u001e\u0010Õ\u0002\u001a\u0002078VX\u0004¢\u0006\u000f\u0012\u0005\bÔ\u0002\u0010\u0014\u001a\u0006\bû\u0001\u0010¤\u0002R\u0017\u0010×\u0002\u001a\u00020\u00178VX\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010Ç\u0002R\u0018\u0010Ú\u0002\u001a\u00030Ø\u00028VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010Ù\u0002R\u0018\u0010Ý\u0002\u001a\u00030Û\u00028VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010Ü\u0002R\u0019\u0010à\u0002\u001a\u0004\u0018\u00010{8@X\u0004¢\u0006\b\u001a\u0006\bÞ\u0002\u0010ß\u0002R\u001a\u0010â\u0002\u001a\u0005\u0018\u00010ç\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010á\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006ã\u0002"}, d2 = {"LU0/n;", "LU0/m;", "LU0/f;", "applier", "LU0/r;", "parentContext", "LU0/c1;", "slotTable", "", "LU0/T0;", "abandonSet", "LV0/a;", "changes", "lateChanges", "LU0/F;", "composition", "<init>", "(LU0/f;LU0/r;LU0/c1;Ljava/util/Set;LV0/a;LV0/a;LU0/F;)V", "LXH/N;", "r1", "()V", "y0", "X", "", "key", "n1", "(I)V", "", "dataKey", "o1", "(ILjava/lang/Object;)V", "w0", "k1", "value", "x1", "(Ljava/lang/Object;)V", "LU0/d;", "e1", "()LU0/d;", "LU0/B0;", "p0", "()LU0/B0;", "group", "q0", "(I)LU0/B0;", "parentScope", "currentProviders", "w1", "(LU0/B0;LU0/B0;)LU0/B0;", "providers", "c1", "(LU0/B0;)V", "z0", "o0", "D0", "", "isNode", "data", "p1", "(ZLjava/lang/Object;)V", "objectKey", "LU0/U;", "kind", "m1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "LU0/A0;", "newPending", "A0", "(ZLU0/A0;)V", "expectedNodeCount", "inserting", "B0", "(IZ)V", "v0", "(Z)V", "Z0", "index", "N0", "(I)I", "newCount", "v1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "T0", "(IIII)I", "V0", "z1", "count", "u1", "l0", "oldGroup", "newGroup", "commonRoot", "d1", "(III)V", "nearestCommonRoot", "u0", "rGroupIndex", "recomposeKey", "n0", "LU0/b1;", "K0", "(LU0/b1;I)I", "l1", "i0", "LU0/k0;", "content", "locals", "parameter", "force", "O0", "(LU0/k0;LU0/B0;Ljava/lang/Object;Z)V", "", "LXH/v;", "LU0/m0;", "references", "L0", "(Ljava/util/List;)V", "R", "from", "to", "LU0/L0;", "invalidations", "Lkotlin/Function0;", "block", "X0", "(LU0/F;LU0/F;Ljava/lang/Integer;Ljava/util/List;LnI/a;)Ljava/lang/Object;", "LW0/f;", "invalidationsRequested", "t0", "(LW0/f;LnI/p;)V", "S0", "(LU0/b1;I)Ljava/lang/Object;", "A1", "B1", "anchor", "b1", "(LU0/d;)V", "a1", "groupBeingRemoved", "g1", "f1", "C0", "k0", "C", "U", "W", "P", "G", "y", "H", "T", "j0", "z", "s0", "r0", "o", "I", "factory", "p", "(LnI/a;)V", "t", "x", "J", "B", "q1", "x0", "marker", "q", "V", "Lkotlin/Function2;", "w", "(Ljava/lang/Object;LnI/p;)V", "Q0", "()Ljava/lang/Object;", "R0", "(Ljava/lang/Object;)Z", "F", "b", "(Z)Z", "", "c", "(F)Z", "", "e", "(J)Z", "", "h", "(D)Z", "d", "(I)Z", "y1", "t1", "effect", "f", "LU0/J0;", "g", "(LU0/J0;)V", "v", "", "values", "K", "([LU0/J0;)V", "N", "LU0/v;", "Q", "(LU0/v;)Ljava/lang/Object;", "S", "()LU0/r;", "scope", "instance", "s1", "(LU0/L0;Ljava/lang/Object;)Z", "j1", "L", "changed", "j", "k", "(I)LU0/m;", "LU0/Y0;", "n", "()LU0/Y0;", "M0", "m0", "U0", "W0", "(LW0/f;)Z", "D", "u", "LU0/K0;", "M", "(LU0/K0;)V", "LU0/f;", "m", "()LU0/f;", "LU0/r;", "LU0/c1;", "Ljava/util/Set;", "LV0/a;", "LU0/F;", "F0", "()LU0/F;", "LU0/z1;", "i", "LU0/z1;", "pendingStack", "LU0/A0;", "pending", "nodeIndex", "l", "groupNodeCount", "LU0/W;", "LU0/W;", "parentStateStack", "", "[I", "nodeCountOverrides", "Lj0/C;", "Lj0/C;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "r", "forciblyRecompose", "s", "nodeExpected", "", "LU0/Y;", "Ljava/util/List;", "entersStack", "LU0/B0;", "parentProvider", "LW0/a;", "LW0/a;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "A", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "U0/n$c", "E", "LU0/n$c;", "derivedStateObserver", "invalidateStack", "<set-?>", "P0", "()Z", "isComposing", "isDisposed$runtime_release", "isDisposed", "LU0/b1;", "J0", "()LU0/b1;", "i1", "(LU0/b1;)V", "reader", "getInsertTable$runtime_release", "()LU0/c1;", "setInsertTable$runtime_release", "(LU0/c1;)V", "insertTable", "LU0/f1;", "LU0/f1;", "writer", "writerHasAProvider", "providerCache", "H0", "()LV0/a;", "setDeferredChanges$runtime_release", "(LV0/a;)V", "deferredChanges", "LV0/b;", "O", "LV0/b;", "changeListWriter", "LU0/d;", "insertAnchor", "LV0/c;", "LV0/c;", "insertFixups", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "I0", "(LU0/b1;)Ljava/lang/Object;", "node", "E0", "areChildrenComposing", "LdI/i;", "()LdI/i;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "a", "currentMarker", "Lh1/a;", "()Lh1/a;", "compositionData", "LU0/y;", "()LU0/y;", "currentCompositionLocalMap", "G0", "()LU0/L0;", "currentRecomposeScope", "()LU0/K0;", "recomposeScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.n  reason: case insensitive filesystem */
public final class C4891n implements C4889m {

    /* renamed from: A  reason: collision with root package name */
    private int f14020A = -1;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public int f14021B;

    /* renamed from: C  reason: collision with root package name */
    private int f14022C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f14023D;

    /* renamed from: E  reason: collision with root package name */
    private final c f14024E;

    /* renamed from: F  reason: collision with root package name */
    private final z1<L0> f14025F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f14026G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f14027H;

    /* renamed from: I  reason: collision with root package name */
    private C4862b1 f14028I;

    /* renamed from: J  reason: collision with root package name */
    private C4865c1 f14029J;

    /* renamed from: K  reason: collision with root package name */
    private C4874f1 f14030K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f14031L;

    /* renamed from: M  reason: collision with root package name */
    private B0 f14032M;

    /* renamed from: N  reason: collision with root package name */
    private V0.a f14033N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public final V0.b f14034O;

    /* renamed from: P  reason: collision with root package name */
    private C4866d f14035P;

    /* renamed from: Q  reason: collision with root package name */
    private V0.c f14036Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f14037R;

    /* renamed from: S  reason: collision with root package name */
    private int f14038S;

    /* renamed from: b  reason: collision with root package name */
    private final C4872f<?> f14039b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final r f14040c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C4865c1 f14041d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<T0> f14042e;

    /* renamed from: f  reason: collision with root package name */
    private V0.a f14043f;

    /* renamed from: g  reason: collision with root package name */
    private V0.a f14044g;

    /* renamed from: h  reason: collision with root package name */
    private final F f14045h;

    /* renamed from: i  reason: collision with root package name */
    private final z1<A0> f14046i = new z1<>();

    /* renamed from: j  reason: collision with root package name */
    private A0 f14047j;

    /* renamed from: k  reason: collision with root package name */
    private int f14048k;

    /* renamed from: l  reason: collision with root package name */
    private int f14049l;

    /* renamed from: m  reason: collision with root package name */
    private int f14050m;

    /* renamed from: n  reason: collision with root package name */
    private final W f14051n = new W();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int[] f14052o;

    /* renamed from: p  reason: collision with root package name */
    private C f14053p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f14054q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f14055r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f14056s;

    /* renamed from: t  reason: collision with root package name */
    private final List<Y> f14057t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final W f14058u = new W();

    /* renamed from: v  reason: collision with root package name */
    private B0 f14059v = c1.f.a();
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public W0.a<B0> f14060w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f14061x;

    /* renamed from: y  reason: collision with root package name */
    private final W f14062y = new W();

    /* renamed from: z  reason: collision with root package name */
    private boolean f14063z;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LU0/n$a;", "LU0/W0;", "LU0/n$b;", "LU0/n;", "ref", "<init>", "(LU0/n$b;)V", "LXH/N;", "w0", "()V", "c1", "o1", "a", "LU0/n$b;", "()LU0/n$b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.n$a */
    private static final class a implements W0 {

        /* renamed from: a  reason: collision with root package name */
        private final b f14064a;

        public a(b bVar) {
            this.f14064a = bVar;
        }

        public final b a() {
            return this.f14064a;
        }

        public void c1() {
            this.f14064a.u();
        }

        public void o1() {
            this.f14064a.u();
        }

        public void w0() {
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0010¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0010¢\u0006\u0004\b(\u0010\rJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b-\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u00101\u001a\u00020.H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b4\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b;\u0010:R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R0\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\"8\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bF\u0010BR+\u0010L\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010!R\u0014\u0010M\u001a\u00020\u00048PX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010Q\u001a\u00020N8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"LU0/n$b;", "LU0/r;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "LU0/A;", "observerHolder", "<init>", "(LU0/n;IZZLU0/A;)V", "LXH/N;", "u", "()V", "LU0/m;", "composer", "p", "(LU0/m;)V", "s", "LU0/F;", "composition", "t", "(LU0/F;)V", "Lkotlin/Function0;", "content", "a", "(LU0/F;LnI/p;)V", "l", "LU0/B0;", "g", "()LU0/B0;", "scope", "y", "(LU0/B0;)V", "", "Lh1/a;", "table", "o", "(Ljava/util/Set;)V", "r", "c", "LU0/m0;", "reference", "k", "(LU0/m0;)V", "b", "LU0/l0;", "n", "(LU0/m0;)LU0/l0;", "data", "m", "(LU0/m0;LU0/l0;)V", "q", "I", "h", "()I", "Z", "e", "()Z", "f", "d", "LU0/A;", "j", "()LU0/A;", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "LU0/n;", "v", "composers", "<set-?>", "LU0/r0;", "w", "x", "compositionLocalScope", "collectingCallByInformation", "LdI/i;", "i", "()LdI/i;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.n$b */
    private final class b extends r {

        /* renamed from: a  reason: collision with root package name */
        private final int f14065a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14066b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f14067c;

        /* renamed from: d  reason: collision with root package name */
        private final A f14068d;

        /* renamed from: e  reason: collision with root package name */
        private Set<Set<C5410a>> f14069e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<C4891n> f14070f = new LinkedHashSet();

        /* renamed from: g  reason: collision with root package name */
        private final C4899r0 f14071g = p1.i(c1.f.a(), p1.p());

        public b(int i10, boolean z10, boolean z11, A a10) {
            this.f14065a = i10;
            this.f14066b = z10;
            this.f14067c = z11;
            this.f14068d = a10;
        }

        private final B0 w() {
            return (B0) this.f14071g.getValue();
        }

        private final void x(B0 b02) {
            this.f14071g.setValue(b02);
        }

        public void a(F f10, p<? super C4889m, ? super Integer, C16807N> pVar) {
            C4891n.this.f14040c.a(f10, pVar);
        }

        public void b(C4890m0 m0Var) {
            C4891n.this.f14040c.b(m0Var);
        }

        public void c() {
            C4891n nVar = C4891n.this;
            nVar.f14021B = nVar.f14021B - 1;
        }

        public boolean d() {
            return C4891n.this.f14040c.d();
        }

        public boolean e() {
            return this.f14066b;
        }

        public boolean f() {
            return this.f14067c;
        }

        public B0 g() {
            return w();
        }

        public int h() {
            return this.f14065a;
        }

        public C17168i i() {
            return C4891n.this.f14040c.i();
        }

        public A j() {
            return this.f14068d;
        }

        public void k(C4890m0 m0Var) {
            C4891n.this.f14040c.k(m0Var);
        }

        public void l(F f10) {
            C4891n.this.f14040c.l(C4891n.this.F0());
            C4891n.this.f14040c.l(f10);
        }

        public void m(C4890m0 m0Var, C4888l0 l0Var) {
            C4891n.this.f14040c.m(m0Var, l0Var);
        }

        public C4888l0 n(C4890m0 m0Var) {
            return C4891n.this.f14040c.n(m0Var);
        }

        public void o(Set<C5410a> set) {
            Set set2 = this.f14069e;
            if (set2 == null) {
                set2 = new HashSet();
                this.f14069e = set2;
            }
            set2.add(set);
        }

        public void p(C4889m mVar) {
            C17542s.h(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.p((C4891n) mVar);
            this.f14070f.add(mVar);
        }

        public void q(F f10) {
            C4891n.this.f14040c.q(f10);
        }

        public void r() {
            C4891n nVar = C4891n.this;
            nVar.f14021B = nVar.f14021B + 1;
        }

        public void s(C4889m mVar) {
            Set<Set<C5410a>> set = this.f14069e;
            if (set != null) {
                for (Set remove : set) {
                    C17542s.h(mVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    remove.remove(((C4891n) mVar).f14041d);
                }
            }
            W.a(this.f14070f).remove(mVar);
        }

        public void t(F f10) {
            C4891n.this.f14040c.t(f10);
        }

        public final void u() {
            if (!this.f14070f.isEmpty()) {
                Set<Set<C5410a>> set = this.f14069e;
                if (set != null) {
                    for (C4891n next : this.f14070f) {
                        for (Set<C5410a> remove : set) {
                            remove.remove(next.f14041d);
                        }
                    }
                }
                this.f14070f.clear();
            }
        }

        public final Set<C4891n> v() {
            return this.f14070f;
        }

        public final void y(B0 b02) {
            x(b02);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"U0/n$c", "LU0/J;", "LU0/I;", "derivedState", "LXH/N;", "a", "(LU0/I;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.n$c */
    public static final class c implements J {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4891n f14073a;

        c(C4891n nVar) {
            this.f14073a = nVar;
        }

        public void a(I<?> i10) {
            C4891n nVar = this.f14073a;
            nVar.f14021B = nVar.f14021B + 1;
        }

        public void b(I<?> i10) {
            C4891n nVar = this.f14073a;
            nVar.f14021B = nVar.f14021B - 1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.n$d */
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4891n f14074c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ V0.a f14075d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4862b1 f14076e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4890m0 f14077f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C4891n nVar, V0.a aVar, C4862b1 b1Var, C4890m0 m0Var) {
            super(0);
            this.f14074c = nVar;
            this.f14075d = aVar;
            this.f14076e = b1Var;
            this.f14077f = m0Var;
        }

        public final void invoke() {
            C4862b1 J02;
            int[] a02;
            W0.a c02;
            V0.b Y10;
            boolean p10;
            V0.b Y11 = this.f14074c.f14034O;
            V0.a aVar = this.f14075d;
            C4891n nVar = this.f14074c;
            C4862b1 b1Var = this.f14076e;
            C4890m0 m0Var = this.f14077f;
            V0.a o10 = Y11.o();
            try {
                Y11.T(aVar);
                J02 = nVar.J0();
                a02 = nVar.f14052o;
                c02 = nVar.f14060w;
                nVar.f14052o = null;
                nVar.f14060w = null;
                nVar.i1(b1Var);
                Y10 = nVar.f14034O;
                p10 = Y10.p();
                Y10.U(false);
                nVar.O0(m0Var.c(), m0Var.e(), m0Var.f(), true);
                Y10.U(p10);
                C16807N n10 = C16807N.f139792a;
                nVar.i1(J02);
                nVar.f14052o = a02;
                nVar.f14060w = c02;
                Y11.T(o10);
            } catch (Throwable th2) {
                Y11.T(o10);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.n$e */
    static final class e extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4891n f14078c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4890m0 f14079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C4891n nVar, C4890m0 m0Var) {
            super(0);
            this.f14078c = nVar;
            this.f14079d = m0Var;
        }

        public final void invoke() {
            this.f14078c.O0(this.f14079d.c(), this.f14079d.e(), this.f14079d.f(), true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.n$f */
    static final class f extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4886k0<Object> f14080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f14081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C4886k0<Object> k0Var, Object obj) {
            super(2);
            this.f14080c = k0Var;
            this.f14081d = obj;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                }
                this.f14080c.a().invoke(this.f14081d, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX INFO: finally extract failed */
    public C4891n(C4872f<?> fVar, r rVar, C4865c1 c1Var, Set<T0> set, V0.a aVar, V0.a aVar2, F f10) {
        this.f14039b = fVar;
        this.f14040c = rVar;
        this.f14041d = c1Var;
        this.f14042e = set;
        this.f14043f = aVar;
        this.f14044g = aVar2;
        this.f14045h = f10;
        this.f14023D = rVar.f() || rVar.d();
        this.f14024E = new c(this);
        this.f14025F = new z1<>();
        C4862b1 I10 = c1Var.I();
        I10.d();
        this.f14028I = I10;
        C4865c1 c1Var2 = new C4865c1();
        if (rVar.f()) {
            c1Var2.q();
        }
        if (rVar.d()) {
            c1Var2.p();
        }
        this.f14029J = c1Var2;
        C4874f1 J10 = c1Var2.J();
        J10.L(true);
        this.f14030K = J10;
        this.f14034O = new V0.b(this, this.f14043f);
        C4862b1 I11 = this.f14029J.I();
        try {
            C4866d a10 = I11.a(0);
            I11.d();
            this.f14035P = a10;
            this.f14036Q = new V0.c();
        } catch (Throwable th2) {
            I11.d();
            throw th2;
        }
    }

    private final void A0(boolean z10, A0 a02) {
        this.f14046i.h(this.f14047j);
        this.f14047j = a02;
        this.f14051n.j(this.f14049l);
        this.f14051n.j(this.f14050m);
        this.f14051n.j(this.f14048k);
        if (z10) {
            this.f14048k = 0;
        }
        this.f14049l = 0;
        this.f14050m = 0;
    }

    private final void A1() {
        if (!this.f14056s) {
            C4895p.s("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f14056s = false;
    }

    private final void B0(int i10, boolean z10) {
        A0 g10 = this.f14046i.g();
        if (g10 != null && !z10) {
            g10.l(g10.a() + 1);
        }
        this.f14047j = g10;
        this.f14048k = this.f14051n.i() + i10;
        this.f14050m = this.f14051n.i();
        this.f14049l = this.f14051n.i() + i10;
    }

    private final void B1() {
        if (this.f14056s) {
            C4895p.s("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void C0() {
        this.f14034O.n();
        if (!this.f14046i.c()) {
            C4895p.s("Start/end imbalance");
        }
        k0();
    }

    private final void D0() {
        C4865c1 c1Var = new C4865c1();
        if (this.f14023D) {
            c1Var.q();
        }
        if (this.f14040c.d()) {
            c1Var.p();
        }
        this.f14029J = c1Var;
        C4874f1 J10 = c1Var.J();
        J10.L(true);
        this.f14030K = J10;
    }

    private final Object I0(C4862b1 b1Var) {
        return b1Var.L(b1Var.u());
    }

    private final int K0(C4862b1 b1Var, int i10) {
        Object z10;
        if (b1Var.G(i10)) {
            Object D10 = b1Var.D(i10);
            if (D10 == null) {
                return 0;
            }
            if (D10 instanceof Enum) {
                return ((Enum) D10).ordinal();
            }
            if (D10 instanceof C4886k0) {
                return 126665345;
            }
            return D10.hashCode();
        }
        int C10 = b1Var.C(i10);
        if (C10 == 207 && (z10 = b1Var.z(i10)) != null && !C17542s.e(z10, C4889m.f14007a.a())) {
            C10 = z10.hashCode();
        }
        return C10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r4 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r6 != null) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void L0(java.util.List<XH.v<U0.C4890m0, U0.C4890m0>> r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = 1
            V0.b r10 = r9.f14034O
            V0.a r1 = r9.f14044g
            V0.a r11 = r10.o()
            r10.T(r1)     // Catch:{ all -> 0x0058 }
            V0.b r1 = r9.f14034O     // Catch:{ all -> 0x0058 }
            r1.R()     // Catch:{ all -> 0x0058 }
            int r12 = r26.size()     // Catch:{ all -> 0x0058 }
            r13 = 0
            r14 = r13
        L_0x0019:
            if (r14 >= r12) goto L_0x0201
            r15 = r26
            java.lang.Object r1 = r15.get(r14)     // Catch:{ all -> 0x01fb }
            XH.v r1 = (XH.v) r1     // Catch:{ all -> 0x01fb }
            java.lang.Object r2 = r1.a()     // Catch:{ all -> 0x01fb }
            U0.m0 r2 = (U0.C4890m0) r2     // Catch:{ all -> 0x01fb }
            java.lang.Object r1 = r1.b()     // Catch:{ all -> 0x01fb }
            U0.m0 r1 = (U0.C4890m0) r1     // Catch:{ all -> 0x01fb }
            U0.d r3 = r2.a()     // Catch:{ all -> 0x01fb }
            U0.c1 r4 = r2.g()     // Catch:{ all -> 0x01fb }
            int r4 = r4.i(r3)     // Catch:{ all -> 0x01fb }
            c1.d r8 = new c1.d     // Catch:{ all -> 0x01fb }
            r5 = 0
            r8.<init>(r13, r0, r5)     // Catch:{ all -> 0x01fb }
            V0.b r6 = r9.f14034O     // Catch:{ all -> 0x01fb }
            r6.e(r8, r3)     // Catch:{ all -> 0x01fb }
            if (r1 != 0) goto L_0x00b0
            U0.c1 r1 = r2.g()     // Catch:{ all -> 0x0058 }
            U0.c1 r3 = r9.f14029J     // Catch:{ all -> 0x0058 }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r3)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x005d
            r25.o0()     // Catch:{ all -> 0x0058 }
            goto L_0x005d
        L_0x0058:
            r0 = move-exception
            r1 = r10
            r2 = r11
            goto L_0x0218
        L_0x005d:
            U0.c1 r1 = r2.g()     // Catch:{ all -> 0x0058 }
            U0.b1 r7 = r1.I()     // Catch:{ all -> 0x0058 }
            r7.Q(r4)     // Catch:{ all -> 0x00a9 }
            V0.b r1 = r9.f14034O     // Catch:{ all -> 0x00a9 }
            r1.z(r4)     // Catch:{ all -> 0x00a9 }
            V0.a r6 = new V0.a     // Catch:{ all -> 0x00a9 }
            r6.<init>()     // Catch:{ all -> 0x00a9 }
            U0.n$d r5 = new U0.n$d     // Catch:{ all -> 0x00a9 }
            r5.<init>(r9, r6, r7, r2)     // Catch:{ all -> 0x00a9 }
            r16 = 15
            r17 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r18 = 0
            r1 = r25
            r19 = r5
            r5 = r18
            r0 = r6
            r6 = r19
            r19 = r7
            r7 = r16
            r13 = r8
            r8 = r17
            Y0(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a7 }
            V0.b r1 = r9.f14034O     // Catch:{ all -> 0x00a7 }
            r1.s(r0, r13)     // Catch:{ all -> 0x00a7 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x00a7 }
            r19.d()     // Catch:{ all -> 0x0058 }
            r24 = r10
            r19 = r11
            r17 = r12
            r20 = r14
            goto L_0x019e
        L_0x00a7:
            r0 = move-exception
            goto L_0x00ac
        L_0x00a9:
            r0 = move-exception
            r19 = r7
        L_0x00ac:
            r19.d()     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x00b0:
            r13 = r8
            U0.r r0 = r9.f14040c     // Catch:{ all -> 0x01fb }
            U0.l0 r0 = r0.n(r1)     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x00bf
            U0.c1 r4 = r0.a()     // Catch:{ all -> 0x0058 }
            if (r4 != 0) goto L_0x00c3
        L_0x00bf:
            U0.c1 r4 = r1.g()     // Catch:{ all -> 0x01fb }
        L_0x00c3:
            if (r0 == 0) goto L_0x00d2
            U0.c1 r6 = r0.a()     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x00d2
            r7 = 0
            U0.d r6 = r6.b(r7)     // Catch:{ all -> 0x0058 }
            if (r6 != 0) goto L_0x00d6
        L_0x00d2:
            U0.d r6 = r1.a()     // Catch:{ all -> 0x01fb }
        L_0x00d6:
            java.util.List r7 = U0.C4895p.q(r4, r6)     // Catch:{ all -> 0x01fb }
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x01fb }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x01fb }
            if (r8 != 0) goto L_0x0106
            V0.b r8 = r9.f14034O     // Catch:{ all -> 0x0058 }
            r8.b(r7, r13)     // Catch:{ all -> 0x0058 }
            U0.c1 r8 = r2.g()     // Catch:{ all -> 0x0058 }
            U0.c1 r5 = r9.f14041d     // Catch:{ all -> 0x0058 }
            boolean r5 = kotlin.jvm.internal.C17542s.e(r8, r5)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0106
            U0.c1 r5 = r9.f14041d     // Catch:{ all -> 0x0058 }
            int r3 = r5.i(r3)     // Catch:{ all -> 0x0058 }
            int r5 = r9.z1(r3)     // Catch:{ all -> 0x0058 }
            int r7 = r7.size()     // Catch:{ all -> 0x0058 }
            int r5 = r5 + r7
            r9.u1(r3, r5)     // Catch:{ all -> 0x0058 }
        L_0x0106:
            V0.b r3 = r9.f14034O     // Catch:{ all -> 0x01fb }
            U0.r r5 = r9.f14040c     // Catch:{ all -> 0x01fb }
            r3.c(r0, r5, r1, r2)     // Catch:{ all -> 0x01fb }
            U0.b1 r7 = r4.I()     // Catch:{ all -> 0x01fb }
            U0.b1 r8 = r25.J0()     // Catch:{ all -> 0x01f0 }
            int[] r5 = r25.f14052o     // Catch:{ all -> 0x01f0 }
            W0.a r3 = r25.f14060w     // Catch:{ all -> 0x01f0 }
            r0 = 0
            r9.f14052o = r0     // Catch:{ all -> 0x01f0 }
            r9.f14060w = r0     // Catch:{ all -> 0x01f0 }
            r9.i1(r7)     // Catch:{ all -> 0x01dd }
            int r0 = r4.i(r6)     // Catch:{ all -> 0x01dd }
            r7.Q(r0)     // Catch:{ all -> 0x01dd }
            V0.b r4 = r9.f14034O     // Catch:{ all -> 0x01dd }
            r4.z(r0)     // Catch:{ all -> 0x01dd }
            V0.a r0 = new V0.a     // Catch:{ all -> 0x01dd }
            r0.<init>()     // Catch:{ all -> 0x01dd }
            V0.b r6 = r9.f14034O     // Catch:{ all -> 0x01dd }
            V0.a r4 = r6.o()     // Catch:{ all -> 0x01dd }
            r6.T(r0)     // Catch:{ all -> 0x01ce }
            r17 = r12
            V0.b r12 = r9.f14034O     // Catch:{ all -> 0x01ce }
            boolean r15 = r12.p()     // Catch:{ all -> 0x01ce }
            r19 = r3
            r3 = 0
            r12.U(r3)     // Catch:{ all -> 0x01be }
            U0.F r3 = r1.b()     // Catch:{ all -> 0x01be }
            U0.F r20 = r2.b()     // Catch:{ all -> 0x01be }
            int r21 = r7.k()     // Catch:{ all -> 0x01be }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x01be }
            java.util.List r22 = r1.d()     // Catch:{ all -> 0x01be }
            U0.n$e r1 = new U0.n$e     // Catch:{ all -> 0x01be }
            r1.<init>(r9, r2)     // Catch:{ all -> 0x01be }
            r23 = r1
            r1 = r25
            r2 = r3
            r24 = r10
            r10 = r19
            r3 = r20
            r19 = r11
            r11 = r4
            r4 = r21
            r20 = r14
            r14 = r5
            r5 = r22
            r21 = r7
            r7 = r6
            r6 = r23
            r1.X0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01bc }
            r12.U(r15)     // Catch:{ all -> 0x01ba }
            r7.T(r11)     // Catch:{ all -> 0x01b8 }
            V0.b r1 = r9.f14034O     // Catch:{ all -> 0x01b8 }
            r1.s(r0, r13)     // Catch:{ all -> 0x01b8 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01b8 }
            r9.i1(r8)     // Catch:{ all -> 0x01b6 }
            r9.f14052o = r14     // Catch:{ all -> 0x01b6 }
            r9.f14060w = r10     // Catch:{ all -> 0x01b6 }
            r21.d()     // Catch:{ all -> 0x01af }
        L_0x019e:
            V0.b r0 = r9.f14034O     // Catch:{ all -> 0x01af }
            r0.W()     // Catch:{ all -> 0x01af }
            r0 = 1
            int r14 = r20 + 1
            r12 = r17
            r11 = r19
            r10 = r24
            r13 = 0
            goto L_0x0019
        L_0x01af:
            r0 = move-exception
        L_0x01b0:
            r2 = r19
            r1 = r24
            goto L_0x0218
        L_0x01b6:
            r0 = move-exception
            goto L_0x01f7
        L_0x01b8:
            r0 = move-exception
            goto L_0x01e6
        L_0x01ba:
            r0 = move-exception
            goto L_0x01d9
        L_0x01bc:
            r0 = move-exception
            goto L_0x01ca
        L_0x01be:
            r0 = move-exception
            r14 = r5
            r21 = r7
            r24 = r10
            r10 = r19
            r7 = r6
            r19 = r11
            r11 = r4
        L_0x01ca:
            r12.U(r15)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ce:
            r0 = move-exception
            r14 = r5
            r21 = r7
            r24 = r10
            r19 = r11
            r10 = r3
            r11 = r4
            r7 = r6
        L_0x01d9:
            r7.T(r11)     // Catch:{ all -> 0x01b8 }
            throw r0     // Catch:{ all -> 0x01b8 }
        L_0x01dd:
            r0 = move-exception
            r14 = r5
            r21 = r7
            r24 = r10
            r19 = r11
            r10 = r3
        L_0x01e6:
            r9.i1(r8)     // Catch:{ all -> 0x01b6 }
            r9.f14052o = r14     // Catch:{ all -> 0x01b6 }
            r9.f14060w = r10     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x01f0:
            r0 = move-exception
            r21 = r7
            r24 = r10
            r19 = r11
        L_0x01f7:
            r21.d()     // Catch:{ all -> 0x01af }
            throw r0     // Catch:{ all -> 0x01af }
        L_0x01fb:
            r0 = move-exception
            r24 = r10
            r19 = r11
            goto L_0x01b0
        L_0x0201:
            r24 = r10
            r19 = r11
            V0.b r0 = r9.f14034O     // Catch:{ all -> 0x01af }
            r0.h()     // Catch:{ all -> 0x01af }
            V0.b r0 = r9.f14034O     // Catch:{ all -> 0x01af }
            r1 = 0
            r0.z(r1)     // Catch:{ all -> 0x01af }
            r2 = r19
            r1 = r24
            r1.T(r2)
            return
        L_0x0218:
            r1.T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.L0(java.util.List):void");
    }

    private final int N0(int i10) {
        return -2 - i10;
    }

    /* access modifiers changed from: private */
    public final void O0(C4886k0<Object> k0Var, B0 b02, Object obj, boolean z10) {
        H(126665345, k0Var);
        x1(obj);
        int R10 = R();
        try {
            this.f14038S = 126665345;
            boolean z11 = false;
            if (i()) {
                C4874f1.v0(this.f14030K, 0, 1, (Object) null);
            }
            if (!i()) {
                if (!C17542s.e(this.f14028I.l(), b02)) {
                    z11 = true;
                }
            }
            if (z11) {
                c1(b02);
            }
            m1(202, C4895p.A(), U.f13882a.a(), b02);
            this.f14032M = null;
            if (!i() || z10) {
                boolean z12 = this.f14061x;
                this.f14061x = z11;
                C4863c.d(this, c1.c.c(316014703, true, new f(k0Var, obj)));
                this.f14061x = z12;
            } else {
                this.f14031L = true;
                C4874f1 f1Var = this.f14030K;
                this.f14040c.k(new C4890m0(k0Var, obj, F0(), this.f14029J, f1Var.E(f1Var.H0(f1Var.e0())), C16877v.n(), p0()));
            }
        } finally {
            w0();
            this.f14032M = null;
            this.f14038S = R10;
            T();
        }
    }

    private final Object S0(C4862b1 b1Var, int i10) {
        return b1Var.L(i10);
    }

    private final int T0(int i10, int i11, int i12, int i13) {
        int i14;
        int P10 = this.f14028I.P(i11);
        while (i14 != i12 && !this.f14028I.J(i14)) {
            P10 = this.f14028I.P(i14);
        }
        if (this.f14028I.J(i14)) {
            i13 = 0;
        }
        if (i14 == i11) {
            return i13;
        }
        int z12 = (z1(i14) - this.f14028I.N(i11)) + i13;
        loop1:
        while (i13 < z12 && i14 != i10) {
            i14++;
            while (true) {
                if (i14 >= i10) {
                    break loop1;
                }
                int E10 = this.f14028I.E(i14) + i14;
                if (i10 >= E10) {
                    i13 += this.f14028I.J(i14) ? 1 : z1(i14);
                    i14 = E10;
                }
            }
        }
        return i13;
    }

    private final int V0(int i10) {
        int P10 = this.f14028I.P(i10) + 1;
        int i11 = 0;
        while (P10 < i10) {
            if (!this.f14028I.G(P10)) {
                i11++;
            }
            P10 += this.f14028I.E(P10);
        }
        return i11;
    }

    private final void X() {
        k0();
        this.f14046i.a();
        this.f14051n.a();
        this.f14058u.a();
        this.f14062y.a();
        this.f14060w = null;
        this.f14036Q.a();
        this.f14038S = 0;
        this.f14021B = 0;
        this.f14056s = false;
        this.f14037R = false;
        this.f14063z = false;
        this.f14026G = false;
        this.f14055r = false;
        this.f14020A = -1;
        if (!this.f14028I.i()) {
            this.f14028I.d();
        }
        if (!this.f14030K.Z()) {
            D0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <R> R X0(U0.F r7, U0.F r8, java.lang.Integer r9, java.util.List<? extends XH.v<U0.L0, ? extends java.lang.Object>> r10, nI.C17631a<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.f14026G
            int r1 = r6.f14048k
            r2 = 1
            r6.f14026G = r2     // Catch:{ all -> 0x0026 }
            r2 = 0
            r6.f14048k = r2     // Catch:{ all -> 0x0026 }
            int r3 = r10.size()     // Catch:{ all -> 0x0026 }
        L_0x000e:
            if (r2 >= r3) goto L_0x002f
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x0026 }
            XH.v r4 = (XH.v) r4     // Catch:{ all -> 0x0026 }
            java.lang.Object r5 = r4.a()     // Catch:{ all -> 0x0026 }
            U0.L0 r5 = (U0.L0) r5     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r4.b()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            r6.s1(r5, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x002c
        L_0x0026:
            r7 = move-exception
            goto L_0x0048
        L_0x0028:
            r4 = 0
            r6.s1(r5, r4)     // Catch:{ all -> 0x0026 }
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x002f:
            if (r7 == 0) goto L_0x003f
            if (r9 == 0) goto L_0x0038
            int r9 = r9.intValue()     // Catch:{ all -> 0x0026 }
            goto L_0x0039
        L_0x0038:
            r9 = -1
        L_0x0039:
            java.lang.Object r7 = r7.g(r8, r9, r11)     // Catch:{ all -> 0x0026 }
            if (r7 != 0) goto L_0x0043
        L_0x003f:
            java.lang.Object r7 = r11.invoke()     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r6.f14026G = r0
            r6.f14048k = r1
            return r7
        L_0x0048:
            r6.f14026G = r0
            r6.f14048k = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.X0(U0.F, U0.F, java.lang.Integer, java.util.List, nI.a):java.lang.Object");
    }

    static /* synthetic */ Object Y0(C4891n nVar, F f10, F f11, Integer num, List list, C17631a aVar, int i10, Object obj) {
        F f12 = (i10 & 1) != 0 ? null : f10;
        F f13 = (i10 & 2) != 0 ? null : f11;
        Integer num2 = (i10 & 4) != 0 ? null : num;
        if ((i10 & 8) != 0) {
            list = C16877v.n();
        }
        return nVar.X0(f12, f13, num2, list, aVar);
    }

    private final void Z0() {
        boolean z10 = this.f14026G;
        this.f14026G = true;
        int u10 = this.f14028I.u();
        int E10 = this.f14028I.E(u10) + u10;
        int i10 = this.f14048k;
        int R10 = R();
        int i11 = this.f14049l;
        int i12 = this.f14050m;
        Y g10 = C4895p.z(this.f14057t, this.f14028I.k(), E10);
        boolean z11 = false;
        int i13 = u10;
        while (g10 != null) {
            int b10 = g10.b();
            Y unused = C4895p.O(this.f14057t, b10);
            if (g10.d()) {
                this.f14028I.Q(b10);
                int k10 = this.f14028I.k();
                d1(i13, k10, u10);
                this.f14048k = T0(b10, k10, u10, i10);
                this.f14050m = V0(k10);
                int P10 = this.f14028I.P(k10);
                this.f14038S = n0(P10, V0(P10), u10, R10);
                this.f14032M = null;
                g10.c().g(this);
                this.f14032M = null;
                this.f14028I.R(u10);
                i13 = k10;
                z11 = true;
            } else {
                this.f14025F.h(g10.c());
                g10.c().y();
                this.f14025F.g();
            }
            g10 = C4895p.z(this.f14057t, this.f14028I.k(), E10);
        }
        if (z11) {
            d1(i13, u10, u10);
            this.f14028I.T();
            int z12 = z1(u10);
            this.f14048k = i10 + z12;
            this.f14049l = i11 + z12;
            this.f14050m = i12;
        } else {
            l1();
        }
        this.f14038S = R10;
        this.f14026G = z10;
    }

    private final void a1() {
        g1(this.f14028I.k());
        this.f14034O.P();
    }

    private final void b1(C4866d dVar) {
        if (this.f14036Q.e()) {
            this.f14034O.t(dVar, this.f14029J);
            return;
        }
        this.f14034O.u(dVar, this.f14029J, this.f14036Q);
        this.f14036Q = new V0.c();
    }

    private final void c1(B0 b02) {
        W0.a<B0> aVar = this.f14060w;
        if (aVar == null) {
            aVar = new W0.a<>(0, 1, (DefaultConstructorMarker) null);
            this.f14060w = aVar;
        }
        aVar.b(this.f14028I.k(), b02);
    }

    private final void d1(int i10, int i11, int i12) {
        C4862b1 b1Var = this.f14028I;
        int l10 = C4895p.L(b1Var, i10, i11, i12);
        while (i10 > 0 && i10 != l10) {
            if (b1Var.J(i10)) {
                this.f14034O.A();
            }
            i10 = b1Var.P(i10);
        }
        u0(i11, l10);
    }

    private final C4866d e1() {
        int i10;
        int i11;
        if (i()) {
            if (!C4895p.I(this.f14030K)) {
                return null;
            }
            int c02 = this.f14030K.c0() - 1;
            int H02 = this.f14030K.H0(c02);
            while (true) {
                int i12 = H02;
                i11 = c02;
                c02 = i12;
                if (c02 != this.f14030K.e0() && c02 >= 0) {
                    H02 = this.f14030K.H0(c02);
                }
            }
            return this.f14030K.E(i11);
        } else if (!C4895p.H(this.f14028I)) {
            return null;
        } else {
            int k10 = this.f14028I.k() - 1;
            int P10 = this.f14028I.P(k10);
            while (true) {
                int i13 = P10;
                i10 = k10;
                k10 = i13;
                if (k10 != this.f14028I.u() && k10 >= 0) {
                    P10 = this.f14028I.P(k10);
                }
            }
            return this.f14028I.a(i10);
        }
    }

    private final void f1() {
        V0.b bVar;
        V0.a o10;
        if (this.f14041d.s()) {
            V0.a aVar = new V0.a();
            this.f14033N = aVar;
            C4862b1 I10 = this.f14041d.I();
            try {
                this.f14028I = I10;
                bVar = this.f14034O;
                o10 = bVar.o();
                bVar.T(aVar);
                g1(0);
                this.f14034O.M();
                bVar.T(o10);
                C16807N n10 = C16807N.f139792a;
                I10.d();
            } catch (Throwable th2) {
                I10.d();
                throw th2;
            }
        }
    }

    private final void g1(int i10) {
        h1(this, i10, false, 0);
        this.f14034O.i();
    }

    private static final int h1(C4891n nVar, int i10, boolean z10, int i11) {
        C4891n nVar2 = nVar;
        int i12 = i10;
        int i13 = i11;
        C4862b1 b1Var = nVar2.f14028I;
        if (b1Var.F(i12)) {
            int C10 = b1Var.C(i12);
            Object D10 = b1Var.D(i12);
            if (C10 == 126665345 && (D10 instanceof C4886k0)) {
                C4886k0 k0Var = (C4886k0) D10;
                Object B10 = b1Var.B(i12, 0);
                C4866d a10 = b1Var.a(i12);
                List f10 = C4895p.w(nVar2.f14057t, i12, b1Var.E(i12) + i12);
                ArrayList arrayList = new ArrayList(f10.size());
                int size = f10.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Y y10 = (Y) f10.get(i14);
                    arrayList.add(C16796C.a(y10.c(), y10.a()));
                }
                C4890m0 m0Var = new C4890m0(k0Var, B10, nVar.F0(), nVar2.f14041d, a10, arrayList, nVar.q0(i10));
                nVar2.f14040c.b(m0Var);
                nVar2.f14034O.L();
                nVar2.f14034O.N(nVar.F0(), nVar2.f14040c, m0Var);
                if (!z10) {
                    return b1Var.N(i12);
                }
                nVar2.f14034O.j(i13, i12);
                return 0;
            } else if (C10 == 206 && C17542s.e(D10, C4895p.F())) {
                Object B11 = b1Var.B(i12, 0);
                a aVar = B11 instanceof a ? (a) B11 : null;
                if (aVar != null) {
                    for (C4891n nVar3 : aVar.a().v()) {
                        nVar3.f1();
                        nVar2.f14040c.q(nVar3.F0());
                    }
                }
                return b1Var.N(i12);
            } else if (b1Var.J(i12)) {
                return 1;
            } else {
                return b1Var.N(i12);
            }
        } else if (b1Var.e(i12)) {
            int E10 = b1Var.E(i12) + i12;
            int i15 = 0;
            for (int i16 = i12 + 1; i16 < E10; i16 += b1Var.E(i16)) {
                boolean J10 = b1Var.J(i16);
                if (J10) {
                    nVar2.f14034O.i();
                    nVar2.f14034O.w(b1Var.L(i16));
                }
                i15 += h1(nVar2, i16, J10 || z10, J10 ? 0 : i13 + i15);
                if (J10) {
                    nVar2.f14034O.i();
                    nVar2.f14034O.A();
                }
            }
            if (b1Var.J(i12)) {
                return 1;
            }
            return i15;
        } else if (b1Var.J(i12)) {
            return 1;
        } else {
            return b1Var.N(i12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (r0 != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i0() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L_0x0024
            U0.L0 r0 = new U0.L0
            U0.F r2 = r4.F0()
            kotlin.jvm.internal.C17542s.h(r2, r1)
            U0.t r2 = (U0.C4902t) r2
            r0.<init>(r2)
            U0.z1<U0.L0> r1 = r4.f14025F
            r1.h(r0)
            r4.y1(r0)
            int r1 = r4.f14022C
            r0.I(r1)
            goto L_0x0077
        L_0x0024:
            java.util.List<U0.Y> r0 = r4.f14057t
            U0.b1 r2 = r4.f14028I
            int r2 = r2.u()
            U0.Y r0 = U0.C4895p.O(r0, r2)
            U0.b1 r2 = r4.f14028I
            java.lang.Object r2 = r2.K()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r3 == 0) goto L_0x0054
            U0.L0 r2 = new U0.L0
            U0.F r3 = r4.F0()
            kotlin.jvm.internal.C17542s.h(r3, r1)
            U0.t r3 = (U0.C4902t) r3
            r2.<init>(r3)
            r4.y1(r2)
            goto L_0x005b
        L_0x0054:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.C17542s.h(r2, r1)
            U0.L0 r2 = (U0.L0) r2
        L_0x005b:
            if (r0 != 0) goto L_0x0069
            boolean r0 = r2.m()
            r1 = 0
            if (r0 == 0) goto L_0x0067
            r2.D(r1)
        L_0x0067:
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r1 = 1
        L_0x006a:
            r2.E(r1)
            U0.z1<U0.L0> r0 = r4.f14025F
            r0.h(r2)
            int r0 = r4.f14022C
            r2.I(r0)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.i0():void");
    }

    private final void k0() {
        this.f14047j = null;
        this.f14048k = 0;
        this.f14049l = 0;
        this.f14038S = 0;
        this.f14056s = false;
        this.f14034O.S();
        this.f14025F.a();
        l0();
    }

    private final void k1() {
        this.f14049l += this.f14028I.S();
    }

    private final void l0() {
        this.f14052o = null;
        this.f14053p = null;
    }

    private final void l1() {
        this.f14049l = this.f14028I.v();
        this.f14028I.T();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            r13 = this;
            r0 = r13
            r2 = r14
            r1 = r15
            r3 = r16
            r4 = r17
            r13.B1()
            int r5 = r0.f14050m
            r6 = 3
            if (r1 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0036
            r7 = 207(0xcf, float:2.9E-43)
            if (r2 != r7) goto L_0x0036
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r4, r7)
            if (r7 != 0) goto L_0x0036
            int r7 = r17.hashCode()
            int r8 = r13.R()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r6 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r6
            r0.f14038S = r5
            goto L_0x0065
        L_0x0036:
            int r7 = r13.R()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r2
            int r6 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r6
        L_0x0044:
            r0.f14038S = r5
            goto L_0x0065
        L_0x0047:
            boolean r5 = r1 instanceof java.lang.Enum
            if (r5 == 0) goto L_0x0060
            r5 = r1
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r5 = r5.ordinal()
        L_0x0052:
            int r7 = r13.R()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r5 = r5 ^ r7
            int r5 = java.lang.Integer.rotateLeft(r5, r6)
            goto L_0x0044
        L_0x0060:
            int r5 = r15.hashCode()
            goto L_0x0052
        L_0x0065:
            r5 = 1
            if (r1 != 0) goto L_0x006d
            int r6 = r0.f14050m
            int r6 = r6 + r5
            r0.f14050m = r6
        L_0x006d:
            U0.U$a r6 = U0.U.f13882a
            int r7 = r6.a()
            r8 = 0
            if (r3 == r7) goto L_0x0078
            r7 = r5
            goto L_0x0079
        L_0x0078:
            r7 = r8
        L_0x0079:
            boolean r9 = r13.i()
            r10 = -1
            r11 = 0
            if (r9 == 0) goto L_0x00e1
            U0.b1 r3 = r0.f14028I
            r3.c()
            U0.f1 r3 = r0.f14030K
            int r3 = r3.c0()
            if (r7 == 0) goto L_0x009a
            U0.f1 r1 = r0.f14030K
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            r1.m1(r14, r4)
            goto L_0x00b7
        L_0x009a:
            if (r4 == 0) goto L_0x00aa
            U0.f1 r5 = r0.f14030K
            if (r1 != 0) goto L_0x00a6
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
        L_0x00a6:
            r5.i1(r14, r1, r4)
            goto L_0x00b7
        L_0x00aa:
            U0.f1 r4 = r0.f14030K
            if (r1 != 0) goto L_0x00b4
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
        L_0x00b4:
            r4.k1(r14, r1)
        L_0x00b7:
            U0.A0 r8 = r0.f14047j
            if (r8 == 0) goto L_0x00dd
            U0.b0 r9 = new U0.b0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.N0(r3)
            r6 = -1
            r10 = 0
            r1 = r9
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f14048k
            int r2 = r8.e()
            int r1 = r1 - r2
            r8.i(r9, r1)
            r8.h(r9)
        L_0x00dd:
            r13.A0(r7, r11)
            return
        L_0x00e1:
            int r6 = r6.b()
            if (r3 == r6) goto L_0x00e8
            goto L_0x00ee
        L_0x00e8:
            boolean r3 = r0.f14063z
            if (r3 == 0) goto L_0x00ee
            r3 = r5
            goto L_0x00ef
        L_0x00ee:
            r3 = r8
        L_0x00ef:
            U0.A0 r6 = r0.f14047j
            if (r6 != 0) goto L_0x011c
            U0.b1 r6 = r0.f14028I
            int r6 = r6.n()
            if (r3 != 0) goto L_0x010d
            if (r6 != r2) goto L_0x010d
            U0.b1 r6 = r0.f14028I
            java.lang.Object r6 = r6.o()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r15, r6)
            if (r6 == 0) goto L_0x010d
            r13.p1(r7, r4)
            goto L_0x011c
        L_0x010d:
            U0.A0 r6 = new U0.A0
            U0.b1 r9 = r0.f14028I
            java.util.List r9 = r9.h()
            int r12 = r0.f14048k
            r6.<init>(r9, r12)
            r0.f14047j = r6
        L_0x011c:
            U0.A0 r9 = r0.f14047j
            if (r9 == 0) goto L_0x01dc
            U0.b0 r6 = r9.d(r14, r15)
            if (r3 != 0) goto L_0x0161
            if (r6 == 0) goto L_0x0161
            r9.h(r6)
            int r1 = r6.b()
            int r2 = r9.g(r6)
            int r3 = r9.e()
            int r2 = r2 + r3
            r0.f14048k = r2
            int r2 = r9.m(r6)
            int r3 = r9.a()
            int r3 = r2 - r3
            int r5 = r9.a()
            r9.k(r2, r5)
            V0.b r2 = r0.f14034O
            r2.y(r1)
            U0.b1 r2 = r0.f14028I
            r2.Q(r1)
            if (r3 <= 0) goto L_0x015c
            V0.b r1 = r0.f14034O
            r1.v(r3)
        L_0x015c:
            r13.p1(r7, r4)
            goto L_0x01dc
        L_0x0161:
            U0.b1 r3 = r0.f14028I
            r3.c()
            r0.f14037R = r5
            r0.f14032M = r11
            r13.z0()
            U0.f1 r3 = r0.f14030K
            r3.I()
            U0.f1 r3 = r0.f14030K
            int r3 = r3.c0()
            if (r7 == 0) goto L_0x0186
            U0.f1 r1 = r0.f14030K
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            r1.m1(r14, r4)
            goto L_0x01a3
        L_0x0186:
            if (r4 == 0) goto L_0x0196
            U0.f1 r5 = r0.f14030K
            if (r1 != 0) goto L_0x0192
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
        L_0x0192:
            r5.i1(r14, r1, r4)
            goto L_0x01a3
        L_0x0196:
            U0.f1 r4 = r0.f14030K
            if (r1 != 0) goto L_0x01a0
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
        L_0x01a0:
            r4.k1(r14, r1)
        L_0x01a3:
            U0.f1 r1 = r0.f14030K
            U0.d r1 = r1.E(r3)
            r0.f14035P = r1
            U0.b0 r11 = new U0.b0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r5 = r13.N0(r3)
            r6 = -1
            r10 = 0
            r1 = r11
            r2 = r14
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = r0.f14048k
            int r2 = r9.e()
            int r1 = r1 - r2
            r9.i(r11, r1)
            r9.h(r11)
            U0.A0 r11 = new U0.A0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r7 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            int r8 = r0.f14048k
        L_0x01d9:
            r11.<init>(r1, r8)
        L_0x01dc:
            r13.A0(r7, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.m1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final int n0(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            return i13;
        }
        int K02 = K0(this.f14028I, i10);
        if (K02 == 126665345) {
            return K02;
        }
        int P10 = this.f14028I.P(i10);
        if (P10 != i12) {
            i13 = n0(P10, V0(P10), i12, i13);
        }
        if (this.f14028I.G(i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ K02, 3) ^ i11;
    }

    private final void n1(int i10) {
        m1(i10, (Object) null, U.f13882a.a(), (Object) null);
    }

    private final void o0() {
        C4895p.Q(this.f14030K.Z());
        D0();
    }

    private final void o1(int i10, Object obj) {
        m1(i10, obj, U.f13882a.a(), (Object) null);
    }

    private final B0 p0() {
        B0 b02 = this.f14032M;
        return b02 != null ? b02 : q0(this.f14028I.u());
    }

    private final void p1(boolean z10, Object obj) {
        if (z10) {
            this.f14028I.V();
            return;
        }
        if (!(obj == null || this.f14028I.l() == obj)) {
            this.f14034O.Z(obj);
        }
        this.f14028I.U();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: U0.B0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final U0.B0 q0(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.i()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            r2 = 202(0xca, float:2.83E-43)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5.f14031L
            if (r0 == 0) goto L_0x0043
            U0.f1 r0 = r5.f14030K
            int r0 = r0.e0()
        L_0x0014:
            if (r0 <= 0) goto L_0x0043
            U0.f1 r3 = r5.f14030K
            int r3 = r3.k0(r0)
            if (r3 != r2) goto L_0x003c
            U0.f1 r3 = r5.f14030K
            java.lang.Object r3 = r3.l0(r0)
            java.lang.Object r4 = U0.C4895p.A()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x003c
            U0.f1 r6 = r5.f14030K
            java.lang.Object r6 = r6.i0(r0)
            kotlin.jvm.internal.C17542s.h(r6, r1)
            U0.B0 r6 = (U0.B0) r6
            r5.f14032M = r6
            return r6
        L_0x003c:
            U0.f1 r3 = r5.f14030K
            int r0 = r3.H0(r0)
            goto L_0x0014
        L_0x0043:
            U0.b1 r0 = r5.f14028I
            int r0 = r0.x()
            if (r0 <= 0) goto L_0x0087
        L_0x004b:
            if (r6 <= 0) goto L_0x0087
            U0.b1 r0 = r5.f14028I
            int r0 = r0.C(r6)
            if (r0 != r2) goto L_0x0080
            U0.b1 r0 = r5.f14028I
            java.lang.Object r0 = r0.D(r6)
            java.lang.Object r3 = U0.C4895p.A()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r0 == 0) goto L_0x0080
            W0.a<U0.B0> r0 = r5.f14060w
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r0.a(r6)
            U0.B0 r0 = (U0.B0) r0
            if (r0 != 0) goto L_0x007d
        L_0x0071:
            U0.b1 r0 = r5.f14028I
            java.lang.Object r6 = r0.z(r6)
            kotlin.jvm.internal.C17542s.h(r6, r1)
            r0 = r6
            U0.B0 r0 = (U0.B0) r0
        L_0x007d:
            r5.f14032M = r0
            return r0
        L_0x0080:
            U0.b1 r0 = r5.f14028I
            int r6 = r0.P(r6)
            goto L_0x004b
        L_0x0087:
            U0.B0 r6 = r5.f14059v
            r5.f14032M = r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.q0(int):U0.B0");
    }

    private final void r1() {
        this.f14050m = 0;
        this.f14028I = this.f14041d.I();
        n1(100);
        this.f14040c.r();
        this.f14059v = this.f14040c.g();
        this.f14062y.j(C4895p.p(this.f14061x));
        this.f14061x = V(this.f14059v);
        this.f14032M = null;
        if (!this.f14054q) {
            this.f14054q = this.f14040c.e();
        }
        if (!this.f14023D) {
            this.f14023D = this.f14040c.f();
        }
        Set set = (Set) C4914z.b(this.f14059v, h1.d.a());
        if (set != null) {
            set.add(this.f14041d);
            this.f14040c.o(set);
        }
        n1(this.f14040c.h());
    }

    private final void t0(W0.f<L0, Object> fVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        W0.b<J> c10;
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        if (this.f14026G) {
            C4895p.s("Reentrant composition is not supported");
        }
        Object a10 = E1.f13744a.a("Compose:recompose");
        try {
            this.f14022C = C5347p.H().f();
            this.f14060w = null;
            N<Object, Object> d10 = fVar.d();
            Object[] objArr = d10.f24569b;
            Object[] objArr2 = d10.f24570c;
            long[] jArr3 = d10.f24568a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr3[i12];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i13 = 8;
                        int i14 = 8 - ((~(i12 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i12 << 3) + i15;
                                Object obj = objArr[i16];
                                Object obj2 = objArr2[i16];
                                C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                L0 l02 = (L0) obj;
                                C4866d i17 = ((L0) obj).i();
                                if (i17 != null) {
                                    int a11 = i17.a();
                                    List<Y> list = this.f14057t;
                                    L0 l03 = (L0) obj;
                                    jArr2 = jArr3;
                                    if (obj2 == X0.f13893a) {
                                        obj2 = null;
                                    }
                                    list.add(new Y(l03, a11, obj2));
                                } else {
                                    jArr2 = jArr3;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                i11 = i13;
                            }
                            j10 >>= i11;
                            i15++;
                            i13 = i11;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        i10 = 1;
                        if (i14 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i10 = 1;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12 += i10;
                    jArr3 = jArr;
                }
            }
            C16877v.C(this.f14057t, C4895p.f14092g);
            this.f14048k = 0;
            this.f14026G = true;
            r1();
            Object Q02 = Q0();
            if (!(Q02 == pVar2 || pVar2 == null)) {
                y1(pVar2);
            }
            c cVar = this.f14024E;
            c10 = p1.c();
            c10.b(cVar);
            if (pVar2 != null) {
                o1(200, C4895p.B());
                C4863c.d(this, pVar2);
                w0();
            } else if ((this.f14055r || this.f14061x) && Q02 != null && !C17542s.e(Q02, C4889m.f14007a.a())) {
                o1(200, C4895p.B());
                C4863c.d(this, (p) W.g(Q02, 2));
                w0();
            } else {
                j1();
            }
            c10.B(c10.r() - 1);
            y0();
            this.f14026G = false;
            this.f14057t.clear();
            o0();
            C16807N n10 = C16807N.f139792a;
            E1.f13744a.b(a10);
        } catch (Throwable th2) {
            E1.f13744a.b(a10);
            throw th2;
        }
    }

    private final void u0(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            u0(this.f14028I.P(i10), i11);
            if (this.f14028I.J(i10)) {
                this.f14034O.w(S0(this.f14028I, i10));
            }
        }
    }

    private final void u1(int i10, int i11) {
        if (z1(i10) == i11) {
            return;
        }
        if (i10 < 0) {
            C c10 = this.f14053p;
            if (c10 == null) {
                c10 = new C(0, 1, (DefaultConstructorMarker) null);
                this.f14053p = c10;
            }
            c10.q(i10, i11);
            return;
        }
        int[] iArr = this.f14052o;
        if (iArr == null) {
            iArr = new int[this.f14028I.x()];
            C16870n.y(iArr, -1, 0, 0, 6, (Object) null);
            this.f14052o = iArr;
        }
        iArr[i10] = i11;
    }

    private final void v0(boolean z10) {
        Set<T> set;
        List<C4861b0> list;
        int hashCode;
        int hashCode2;
        int g10 = this.f14051n.g() - 1;
        if (i()) {
            int e02 = this.f14030K.e0();
            int k02 = this.f14030K.k0(e02);
            Object l02 = this.f14030K.l0(e02);
            Object i02 = this.f14030K.i0(e02);
            if (l02 != null) {
                hashCode2 = Integer.hashCode(l02 instanceof Enum ? ((Enum) l02).ordinal() : l02.hashCode()) ^ Integer.rotateRight(R(), 3);
            } else if (i02 == null || k02 != 207 || C17542s.e(i02, C4889m.f14007a.a())) {
                hashCode2 = Integer.rotateRight(g10 ^ R(), 3) ^ Integer.hashCode(k02);
            } else {
                this.f14038S = Integer.rotateRight(Integer.rotateRight(g10 ^ R(), 3) ^ Integer.hashCode(i02.hashCode()), 3);
            }
            this.f14038S = Integer.rotateRight(hashCode2, 3);
        } else {
            int u10 = this.f14028I.u();
            int C10 = this.f14028I.C(u10);
            Object D10 = this.f14028I.D(u10);
            Object z11 = this.f14028I.z(u10);
            if (D10 != null) {
                hashCode = Integer.hashCode(D10 instanceof Enum ? ((Enum) D10).ordinal() : D10.hashCode()) ^ Integer.rotateRight(R(), 3);
            } else if (z11 == null || C10 != 207 || C17542s.e(z11, C4889m.f14007a.a())) {
                hashCode = Integer.rotateRight(g10 ^ R(), 3) ^ Integer.hashCode(C10);
            } else {
                this.f14038S = Integer.rotateRight(Integer.rotateRight(g10 ^ R(), 3) ^ Integer.hashCode(z11.hashCode()), 3);
            }
            this.f14038S = Integer.rotateRight(hashCode, 3);
        }
        int i10 = this.f14049l;
        A0 a02 = this.f14047j;
        if (a02 != null && a02.b().size() > 0) {
            List<C4861b0> b10 = a02.b();
            List<C4861b0> f10 = a02.f();
            Set<T> e10 = C5333b.e(f10);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f10.size();
            int size2 = b10.size();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < size2) {
                C4861b0 b0Var = b10.get(i11);
                if (!e10.contains(b0Var)) {
                    this.f14034O.Q(a02.g(b0Var) + a02.e(), b0Var.c());
                    a02.n(b0Var.b(), 0);
                    this.f14034O.y(b0Var.b());
                    this.f14028I.Q(b0Var.b());
                    a1();
                    this.f14028I.S();
                    set = e10;
                    C4895p.P(this.f14057t, b0Var.b(), b0Var.b() + this.f14028I.E(b0Var.b()));
                } else {
                    set = e10;
                    if (!linkedHashSet.contains(b0Var)) {
                        if (i12 < size) {
                            C4861b0 b0Var2 = f10.get(i12);
                            if (b0Var2 != b0Var) {
                                int g11 = a02.g(b0Var2);
                                linkedHashSet.add(b0Var2);
                                if (g11 != i13) {
                                    int o10 = a02.o(b0Var2);
                                    list = f10;
                                    this.f14034O.x(a02.e() + g11, i13 + a02.e(), o10);
                                    a02.j(g11, i13, o10);
                                } else {
                                    list = f10;
                                }
                            } else {
                                list = f10;
                                i11++;
                            }
                            i12++;
                            i13 += a02.o(b0Var2);
                            e10 = set;
                            f10 = list;
                        }
                        e10 = set;
                    }
                }
                i11++;
                e10 = set;
            }
            this.f14034O.i();
            if (b10.size() > 0) {
                this.f14034O.y(this.f14028I.m());
                this.f14028I.T();
            }
        }
        int i14 = this.f14048k;
        while (!this.f14028I.H()) {
            int k10 = this.f14028I.k();
            a1();
            this.f14034O.Q(i14, this.f14028I.S());
            C4895p.P(this.f14057t, k10, this.f14028I.k());
        }
        boolean i15 = i();
        if (i15) {
            if (z10) {
                this.f14036Q.c();
                i10 = 1;
            }
            this.f14028I.f();
            int e03 = this.f14030K.e0();
            this.f14030K.T();
            if (!this.f14028I.t()) {
                int N02 = N0(e03);
                this.f14030K.U();
                this.f14030K.L(true);
                b1(this.f14035P);
                this.f14037R = false;
                if (!this.f14041d.isEmpty()) {
                    u1(N02, 0);
                    v1(N02, i10);
                }
            }
        } else {
            if (z10) {
                this.f14034O.A();
            }
            int w10 = this.f14028I.w();
            if (w10 > 0) {
                this.f14034O.X(w10);
            }
            this.f14034O.g();
            int u11 = this.f14028I.u();
            if (i10 != z1(u11)) {
                v1(u11, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.f14028I.g();
            this.f14034O.i();
        }
        B0(i10, i15);
    }

    private final void v1(int i10, int i11) {
        int z12 = z1(i10);
        if (z12 != i11) {
            int i12 = i11 - z12;
            int b10 = this.f14046i.b() - 1;
            while (i10 != -1) {
                int z13 = z1(i10) + i12;
                u1(i10, z13);
                int i13 = b10;
                while (true) {
                    if (-1 < i13) {
                        A0 f10 = this.f14046i.f(i13);
                        if (f10 != null && f10.n(i10, z13)) {
                            b10 = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f14028I.u();
                } else if (!this.f14028I.J(i10)) {
                    i10 = this.f14028I.P(i10);
                } else {
                    return;
                }
            }
        }
    }

    private final void w0() {
        v0(false);
    }

    private final B0 w1(B0 b02, B0 b03) {
        B0.a e10 = b02.e();
        e10.putAll(b03);
        B0 g10 = e10.g();
        o1(204, C4895p.E());
        x1(g10);
        x1(b03);
        w0();
        return g10;
    }

    private final void x1(Object obj) {
        Q0();
        y1(obj);
    }

    private final void y0() {
        w0();
        this.f14040c.c();
        w0();
        this.f14034O.k();
        C0();
        this.f14028I.d();
        this.f14055r = false;
        this.f14061x = C4895p.o(this.f14062y.i());
    }

    private final void z0() {
        if (this.f14030K.Z()) {
            C4874f1 J10 = this.f14029J.J();
            this.f14030K = J10;
            J10.Z0();
            this.f14031L = false;
            this.f14032M = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r0[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int z1(int r4) {
        /*
            r3 = this;
            if (r4 >= 0) goto L_0x0012
            j0.C r0 = r3.f14053p
            r1 = 0
            if (r0 == 0) goto L_0x0011
            boolean r2 = r0.a(r4)
            if (r2 == 0) goto L_0x0011
            int r1 = r0.c(r4)
        L_0x0011:
            return r1
        L_0x0012:
            int[] r0 = r3.f14052o
            if (r0 == 0) goto L_0x001b
            r0 = r0[r4]
            if (r0 < 0) goto L_0x001b
            return r0
        L_0x001b:
            U0.b1 r0 = r3.f14028I
            int r4 = r0.N(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.z1(int):int");
    }

    public K0 A() {
        return G0();
    }

    public void B() {
        if (this.f14063z && this.f14028I.u() == this.f14020A) {
            this.f14020A = -1;
            this.f14063z = false;
        }
        v0(false);
    }

    public void C(int i10) {
        m1(i10, (Object) null, U.f13882a.a(), (Object) null);
    }

    public Object D() {
        return R0();
    }

    public C5410a E() {
        return this.f14041d;
    }

    public final boolean E0() {
        return this.f14021B > 0;
    }

    public boolean F(Object obj) {
        if (Q0() == obj) {
            return false;
        }
        y1(obj);
        return true;
    }

    public F F0() {
        return this.f14045h;
    }

    public void G() {
        m1(-127, (Object) null, U.f13882a.a(), (Object) null);
    }

    public final L0 G0() {
        z1<L0> z1Var = this.f14025F;
        if (this.f14021B != 0 || !z1Var.d()) {
            return null;
        }
        return z1Var.e();
    }

    public void H(int i10, Object obj) {
        m1(i10, obj, U.f13882a.a(), (Object) null);
    }

    public final V0.a H0() {
        return this.f14033N;
    }

    public void I() {
        m1(125, (Object) null, U.f13882a.c(), (Object) null);
        this.f14056s = true;
    }

    public void J(int i10, Object obj) {
        if (!i() && this.f14028I.n() == i10 && !C17542s.e(this.f14028I.l(), obj) && this.f14020A < 0) {
            this.f14020A = this.f14028I.k();
            this.f14063z = true;
        }
        m1(i10, (Object) null, U.f13882a.a(), obj);
    }

    public final C4862b1 J0() {
        return this.f14028I;
    }

    public void K(J0<?>[] j0Arr) {
        B0 b02;
        B0 p02 = p0();
        o1(201, C4895p.D());
        boolean z10 = true;
        boolean z11 = false;
        if (i()) {
            b02 = w1(p02, C4914z.d(j0Arr, p02, (B0) null, 4, (Object) null));
            this.f14031L = true;
        } else {
            Object A10 = this.f14028I.A(0);
            C17542s.h(A10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b03 = (B0) A10;
            Object A11 = this.f14028I.A(1);
            C17542s.h(A11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b04 = (B0) A11;
            B0 c10 = C4914z.c(j0Arr, p02, b04);
            if (!l() || this.f14063z || !C17542s.e(b04, c10)) {
                b02 = w1(p02, c10);
                if (!this.f14063z && C17542s.e(b02, b03)) {
                    z10 = false;
                }
                z11 = z10;
            } else {
                k1();
                b02 = b03;
            }
        }
        if (z11 && !i()) {
            c1(b02);
        }
        this.f14062y.j(C4895p.p(this.f14061x));
        this.f14061x = z11;
        this.f14032M = b02;
        m1(202, C4895p.A(), U.f13882a.a(), b02);
    }

    public void L() {
        if (!(this.f14049l == 0)) {
            C4895p.s("No nodes can be emitted before calling skipAndEndGroup");
        }
        L0 G02 = G0();
        if (G02 != null) {
            G02.z();
        }
        if (this.f14057t.isEmpty()) {
            l1();
        } else {
            Z0();
        }
    }

    public void M(K0 k02) {
        L0 l02 = k02 instanceof L0 ? (L0) k02 : null;
        if (l02 != null) {
            l02.H(true);
        }
    }

    public void M0(List<v<C4890m0, C4890m0>> list) {
        try {
            L0(list);
            k0();
        } catch (Throwable th2) {
            X();
            throw th2;
        }
    }

    public void N() {
        w0();
        w0();
        this.f14061x = C4895p.o(this.f14062y.i());
        this.f14032M = null;
    }

    public boolean O() {
        if (!l() || this.f14061x) {
            return true;
        }
        L0 G02 = G0();
        return G02 != null && G02.l();
    }

    public void P() {
        w0();
    }

    public final boolean P0() {
        return this.f14026G;
    }

    public <T> T Q(C4906v<T> vVar) {
        return C4914z.b(p0(), vVar);
    }

    public final Object Q0() {
        if (i()) {
            B1();
            return C4889m.f14007a.a();
        }
        Object K10 = this.f14028I.K();
        return (!this.f14063z || (K10 instanceof W0)) ? K10 : C4889m.f14007a.a();
    }

    public int R() {
        return this.f14038S;
    }

    public final Object R0() {
        if (i()) {
            B1();
            return C4889m.f14007a.a();
        }
        Object K10 = this.f14028I.K();
        return (!this.f14063z || (K10 instanceof W0)) ? K10 instanceof U0 ? ((U0) K10).b() : K10 : C4889m.f14007a.a();
    }

    public r S() {
        o1(206, C4895p.F());
        A a10 = null;
        if (i()) {
            C4874f1.v0(this.f14030K, 0, 1, (Object) null);
        }
        Object Q02 = Q0();
        a aVar = Q02 instanceof a ? (a) Q02 : null;
        if (aVar == null) {
            int R10 = R();
            boolean z10 = this.f14054q;
            boolean z11 = this.f14023D;
            F F02 = F0();
            C4902t tVar = F02 instanceof C4902t ? (C4902t) F02 : null;
            if (tVar != null) {
                a10 = tVar.G();
            }
            aVar = new a(new b(R10, z10, z11, a10));
            y1(aVar);
        }
        aVar.a().y(p0());
        w0();
        return aVar.a();
    }

    public void T() {
        w0();
    }

    public void U() {
        w0();
    }

    public final void U0(C17631a<C16807N> aVar) {
        if (this.f14026G) {
            C4895p.s("Preparing a composition while composing is not supported");
        }
        this.f14026G = true;
        try {
            aVar.invoke();
        } finally {
            this.f14026G = false;
        }
    }

    public boolean V(Object obj) {
        if (C17542s.e(Q0(), obj)) {
            return false;
        }
        y1(obj);
        return true;
    }

    public void W(int i10) {
        if (this.f14047j != null) {
            m1(i10, (Object) null, U.f13882a.a(), (Object) null);
            return;
        }
        B1();
        this.f14038S = this.f14050m ^ Integer.rotateLeft(Integer.rotateLeft(R(), 3) ^ i10, 3);
        this.f14050m++;
        C4862b1 b1Var = this.f14028I;
        if (i()) {
            b1Var.c();
            this.f14030K.k1(i10, C4889m.f14007a.a());
            A0(false, (A0) null);
        } else if (b1Var.n() != i10 || b1Var.s()) {
            if (!b1Var.H()) {
                int i11 = this.f14048k;
                int k10 = b1Var.k();
                a1();
                this.f14034O.Q(i11, b1Var.S());
                C4895p.P(this.f14057t, k10, b1Var.k());
            }
            b1Var.c();
            this.f14037R = true;
            this.f14032M = null;
            z0();
            C4874f1 f1Var = this.f14030K;
            f1Var.I();
            int c02 = f1Var.c0();
            f1Var.k1(i10, C4889m.f14007a.a());
            this.f14035P = f1Var.E(c02);
            A0(false, (A0) null);
        } else {
            b1Var.U();
            A0(false, (A0) null);
        }
    }

    public final boolean W0(W0.f<L0, Object> fVar) {
        if (!this.f14043f.c()) {
            C4895p.s("Expected applyChanges() to have been called");
        }
        if (fVar.e() <= 0 && this.f14057t.isEmpty() && !this.f14055r) {
            return false;
        }
        t0(fVar, (p<? super C4889m, ? super Integer, C16807N>) null);
        return this.f14043f.d();
    }

    public int a() {
        return i() ? -this.f14030K.e0() : this.f14028I.u();
    }

    public boolean b(boolean z10) {
        Object Q02 = Q0();
        if ((Q02 instanceof Boolean) && z10 == ((Boolean) Q02).booleanValue()) {
            return false;
        }
        y1(Boolean.valueOf(z10));
        return true;
    }

    public boolean c(float f10) {
        Object Q02 = Q0();
        if ((Q02 instanceof Float) && f10 == ((Number) Q02).floatValue()) {
            return false;
        }
        y1(Float.valueOf(f10));
        return true;
    }

    public boolean d(int i10) {
        Object Q02 = Q0();
        if ((Q02 instanceof Integer) && i10 == ((Number) Q02).intValue()) {
            return false;
        }
        y1(Integer.valueOf(i10));
        return true;
    }

    public boolean e(long j10) {
        Object Q02 = Q0();
        if ((Q02 instanceof Long) && j10 == ((Number) Q02).longValue()) {
            return false;
        }
        y1(Long.valueOf(j10));
        return true;
    }

    public void f(C17631a<C16807N> aVar) {
        this.f14034O.V(aVar);
    }

    public void g(J0<?> j02) {
        G1 g12;
        B0 b02;
        B0 p02 = p0();
        o1(201, C4895p.D());
        Object D10 = D();
        if (C17542s.e(D10, C4889m.f14007a.a())) {
            g12 = null;
        } else {
            C17542s.h(D10, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            g12 = (G1) D10;
        }
        C4906v<?> b10 = j02.b();
        C17542s.h(b10, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        C17542s.h(j02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        G1<?> b11 = b10.b(j02, g12);
        boolean e10 = C17542s.e(b11, g12);
        if (!e10) {
            u(b11);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (i()) {
            if (j02.a() || !C4914z.a(p02, b10)) {
                p02 = p02.y(b10, b11);
            }
            this.f14031L = true;
        } else {
            C4862b1 b1Var = this.f14028I;
            Object z12 = b1Var.z(b1Var.k());
            C17542s.h(z12, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            B0 b03 = (B0) z12;
            b02 = ((!l() || !e10) && (j02.a() || !C4914z.a(p02, b10))) ? p02.y(b10, b11) : b03;
            if (!this.f14063z && b03 == b02) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !i()) {
            c1(b02);
        }
        this.f14062y.j(C4895p.p(this.f14061x));
        this.f14061x = z11;
        this.f14032M = b02;
        m1(202, C4895p.A(), U.f13882a.a(), b02);
    }

    public boolean h(double d10) {
        Object Q02 = Q0();
        if ((Q02 instanceof Double) && d10 == ((Number) Q02).doubleValue()) {
            return false;
        }
        y1(Double.valueOf(d10));
        return true;
    }

    public boolean i() {
        return this.f14037R;
    }

    public final void i1(C4862b1 b1Var) {
        this.f14028I = b1Var;
    }

    public void j(boolean z10) {
        if (!(this.f14049l == 0)) {
            C4895p.s("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (i()) {
            return;
        }
        if (!z10) {
            l1();
            return;
        }
        int k10 = this.f14028I.k();
        int j10 = this.f14028I.j();
        this.f14034O.d();
        C4895p.P(this.f14057t, k10, j10);
        this.f14028I.T();
    }

    public final void j0() {
        this.f14060w = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j1() {
        /*
            r9 = this;
            java.util.List<U0.Y> r0 = r9.f14057t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000d
            r9.k1()
            goto L_0x00e1
        L_0x000d:
            U0.b1 r0 = r9.f14028I
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r9.f14050m
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L_0x0058
            if (r3 == 0) goto L_0x0047
            if (r1 != r5) goto L_0x0047
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r3, r7)
            if (r7 != 0) goto L_0x0047
            int r7 = r3.hashCode()
            int r8 = r9.R()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.f14038S = r7
            goto L_0x0076
        L_0x0047:
            int r7 = r9.R()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L_0x0055:
            r9.f14038S = r7
            goto L_0x0076
        L_0x0058:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L_0x0071
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L_0x0063:
            int r8 = r9.R()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L_0x0055
        L_0x0071:
            int r7 = r2.hashCode()
            goto L_0x0063
        L_0x0076:
            boolean r7 = r0.I()
            r8 = 0
            r9.p1(r7, r8)
            r9.Z0()
            r0.g()
            if (r2 != 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00af
            if (r1 != r5) goto L_0x00af
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r3, r0)
            if (r0 != 0) goto L_0x00af
            int r0 = r3.hashCode()
            int r1 = r9.R()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f14038S = r0
            goto L_0x00e1
        L_0x00af:
            int r0 = r9.R()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        L_0x00bd:
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.f14038S = r0
            goto L_0x00e1
        L_0x00c4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x00dc
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        L_0x00ce:
            int r1 = r9.R()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto L_0x00bd
        L_0x00dc:
            int r0 = r2.hashCode()
            goto L_0x00ce
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.j1():void");
    }

    public C4889m k(int i10) {
        W(i10);
        i0();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = G0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l() {
        /*
            r1 = this;
            boolean r0 = r1.i()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14063z
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14061x
            if (r0 != 0) goto L_0x0020
            U0.L0 r0 = r1.G0()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x0020
            boolean r0 = r1.f14055r
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4891n.l():boolean");
    }

    public C4872f<?> m() {
        return this.f14039b;
    }

    public final void m0(W0.f<L0, Object> fVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
        if (!this.f14043f.c()) {
            C4895p.s("Expected applyChanges() to have been called");
        }
        t0(fVar, pVar);
    }

    public Y0 n() {
        C4866d dVar;
        C17642l<C4897q, C16807N> h10;
        L0 l02 = null;
        L0 g10 = this.f14025F.d() ? this.f14025F.g() : null;
        if (g10 != null) {
            g10.E(false);
        }
        if (!(g10 == null || (h10 = g10.h(this.f14022C)) == null)) {
            this.f14034O.f(h10, F0());
        }
        if (g10 != null && !g10.p() && (g10.q() || this.f14054q)) {
            if (g10.i() == null) {
                if (i()) {
                    C4874f1 f1Var = this.f14030K;
                    dVar = f1Var.E(f1Var.e0());
                } else {
                    C4862b1 b1Var = this.f14028I;
                    dVar = b1Var.a(b1Var.u());
                }
                g10.A(dVar);
            }
            g10.C(false);
            l02 = g10;
        }
        v0(false);
        return l02;
    }

    public void o() {
        m1(125, (Object) null, U.f13882a.b(), (Object) null);
        this.f14056s = true;
    }

    public <T> void p(C17631a<? extends T> aVar) {
        A1();
        if (!i()) {
            C4895p.s("createNode() can only be called when inserting");
        }
        int e10 = this.f14051n.e();
        C4874f1 f1Var = this.f14030K;
        C4866d E10 = f1Var.E(f1Var.e0());
        this.f14049l++;
        this.f14036Q.b(aVar, e10, E10);
    }

    public void q(int i10) {
        if (i10 < 0) {
            int i11 = -i10;
            C4874f1 f1Var = this.f14030K;
            while (true) {
                int e02 = f1Var.e0();
                if (e02 > i11) {
                    v0(f1Var.t0(e02));
                } else {
                    return;
                }
            }
        } else {
            if (i()) {
                C4874f1 f1Var2 = this.f14030K;
                while (i()) {
                    v0(f1Var2.t0(f1Var2.e0()));
                }
            }
            C4862b1 b1Var = this.f14028I;
            while (true) {
                int u10 = b1Var.u();
                if (u10 > i10) {
                    v0(b1Var.J(u10));
                } else {
                    return;
                }
            }
        }
    }

    public final void q1() {
        this.f14020A = 100;
        this.f14063z = true;
    }

    public C17168i r() {
        return this.f14040c.i();
    }

    public final void r0() {
        this.f14025F.a();
        this.f14057t.clear();
        this.f14043f.a();
        this.f14060w = null;
    }

    public C4912y s() {
        return p0();
    }

    public final void s0() {
        E1 e12 = E1.f13744a;
        Object a10 = e12.a("Compose:Composer.dispose");
        try {
            this.f14040c.s(this);
            r0();
            m().clear();
            this.f14027H = true;
            C16807N n10 = C16807N.f139792a;
            e12.b(a10);
        } catch (Throwable th2) {
            E1.f13744a.b(a10);
            throw th2;
        }
    }

    public final boolean s1(L0 l02, Object obj) {
        C4866d i10 = l02.i();
        if (i10 == null) {
            return false;
        }
        int d10 = i10.d(this.f14028I.y());
        if (!this.f14026G || d10 < this.f14028I.k()) {
            return false;
        }
        C4895p.G(this.f14057t, d10, l02, obj);
        return true;
    }

    public void t() {
        A1();
        if (i()) {
            C4895p.s("useNode() called while inserting");
        }
        Object I02 = I0(this.f14028I);
        this.f14034O.w(I02);
        if (this.f14063z && (I02 instanceof C4885k)) {
            this.f14034O.c0(I02);
        }
    }

    public final void t1(Object obj) {
        if (obj instanceof T0) {
            if (i()) {
                this.f14034O.O((T0) obj);
            }
            this.f14042e.add(obj);
            obj = new U0((T0) obj, e1());
        }
        y1(obj);
    }

    public void u(Object obj) {
        t1(obj);
    }

    public void v() {
        w0();
        w0();
        this.f14061x = C4895p.o(this.f14062y.i());
        this.f14032M = null;
    }

    public <V, T> void w(V v10, p<? super T, ? super V, C16807N> pVar) {
        if (i()) {
            this.f14036Q.f(v10, pVar);
        } else {
            this.f14034O.a0(v10, pVar);
        }
    }

    public void x() {
        v0(true);
    }

    public final void x0() {
        if (!(!this.f14026G && this.f14020A == 100)) {
            C0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f14020A = -1;
        this.f14063z = false;
    }

    public void y() {
        w0();
        L0 G02 = G0();
        if (G02 != null && G02.q()) {
            G02.B(true);
        }
    }

    public final void y1(Object obj) {
        if (i()) {
            this.f14030K.p1(obj);
        } else if (this.f14028I.r()) {
            int q10 = this.f14028I.q() - 1;
            if (this.f14034O.q()) {
                V0.b bVar = this.f14034O;
                C4862b1 b1Var = this.f14028I;
                bVar.Y(obj, b1Var.a(b1Var.u()), q10);
                return;
            }
            this.f14034O.b0(obj, q10);
        } else {
            V0.b bVar2 = this.f14034O;
            C4862b1 b1Var2 = this.f14028I;
            bVar2.a(b1Var2.a(b1Var2.u()), obj);
        }
    }

    public void z() {
        this.f14054q = true;
        this.f14023D = true;
        this.f14041d.q();
        this.f14029J.q();
        this.f14030K.y1();
    }
}
