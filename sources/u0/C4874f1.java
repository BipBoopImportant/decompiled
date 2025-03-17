package U0;

import U0.C4889m;
import YH.C16870n;
import YH.C16877v;
import j0.E;
import j0.F;
import j0.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bU\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 ý\u00012\u00020\u0001:\u0002±\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0019J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010&J!\u00107\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010*JG\u0010A\u001a\u00020\f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2&\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010K\u001a\u00020\t*\u00020J2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010GJ\u001b\u0010O\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010LJ\u001b\u0010P\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010LJ#\u0010Q\u001a\u00020\u000f*\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010LJ\u001b\u0010T\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010LJ/\u0010W\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010GJ\u0015\u0010_\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b_\u0010\u0014J\u0015\u0010`\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b`\u0010GJ\u0015\u0010a\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\ba\u0010GJ\u0017\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bd\u0010GJ\u0017\u0010e\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\be\u0010cJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bf\u0010\u0014J\u0015\u0010g\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bg\u0010\u0014J\u001d\u0010h\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bh\u00102J\u0017\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bi\u0010cJ\u0017\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bl\u0010GJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\f¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0017J\u0019\u0010q\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bq\u0010\bJ\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010sJ\u0015\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\t¢\u0006\u0004\bu\u0010\u0019J\u0017\u0010v\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u000f¢\u0006\u0004\bx\u0010\u0017J\u0017\u0010y\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\by\u0010wJ\u001f\u0010z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010sJ\u0017\u0010{\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b{\u0010wJ!\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b|\u0010}J\u001d\u0010~\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b~\u0010]J*\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0010\u0001J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\"\u0010\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0001\u0010GJ\u001a\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0001\u0010GJ\u001a\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0001\u0010GJ\u0018\u0010\u0001\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010\u0019J\u000f\u0010\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0001\u0010\u0017J\u000f\u0010\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0001\u0010\u0017J\u000f\u0010\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0001\u0010\u0017J\u000f\u0010\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0001\u0010\u0017J\"\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0001\u00108J!\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0001\u00108J,\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010!J\u0017\u0010\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010\u0019J\u0018\u0010\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010!J\u0010\u0010\u0001\u001a\u00020\f¢\u0006\u0006\b\u0001\u0010\u0001J\u0018\u0010\u0001\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010\u0019J1\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010Y\u001a\u00020>2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J2\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t2\t\b\u0002\u0010£\u0001\u001a\u00020\f¢\u0006\u0006\b¤\u0001\u0010¥\u0001J0\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0007\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010¨\u0001\u001a\u00020>2\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\bª\u0001\u0010\u0019J\u0018\u0010«\u0001\u001a\u00020\t2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010®\u0001\u001a\u00030­\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010°\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b°\u0001\u0010©\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020J8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R+\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020>0¼\u0001j\t\u0012\u0004\u0012\u00020>`½\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R8\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010É\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u0001R\u0019\u0010Ë\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010\u0001R\u0019\u0010Í\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0001R\u0019\u0010Ï\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0001R\u0019\u0010Ó\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010\u0001R\u0019\u0010Õ\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u0001R\u0019\u0010×\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u0001R\u0019\u0010Ù\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010ß\u0001\u001a\u00030Ú\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Ü\u0001R\u0018\u0010á\u0001\u001a\u00030Ú\u00018\u0002X\u0004¢\u0006\b\n\u0006\bà\u0001\u0010Ü\u0001R+\u0010ä\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010â\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Æ\u0001R)\u0010è\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u000e¢\u0006\u000f\n\u0006\bæ\u0001\u0010\u0001\u001a\u0005\bç\u0001\u0010!R)\u0010ë\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010\u0001\u001a\u0005\bê\u0001\u0010!R(\u0010\"\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u000e¢\u0006\u000f\n\u0006\bì\u0001\u0010\u0001\u001a\u0005\bí\u0001\u0010!R*\u0010ð\u0001\u001a\u00020\f2\u0007\u0010å\u0001\u001a\u00020\f8\u0006@BX\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bï\u0001\u0010\u0001R\u001b\u0010ó\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0015\u0010V\u001a\u00020\t8BX\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010!R\u0013\u0010ö\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010!R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u0001R\u0014\u0010ù\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bø\u0001\u0010\u0001R\u0014\u0010û\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bú\u0001\u0010\u0001R\u0015\u0010,\u001a\u00020\t8@X\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010!¨\u0006þ\u0001"}, d2 = {"LU0/f1;", "", "LU0/c1;", "table", "<init>", "(LU0/c1;)V", "value", "L0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "key", "objectKey", "", "isNode", "aux", "LXH/N;", "l1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "N", "(I)Z", "M", "M0", "()V", "s1", "(I)V", "LU0/F0;", "set", "t1", "(ILU0/F0;)V", "J", "T0", "S0", "()I", "parent", "endGroup", "firstChild", "X", "(III)V", "index", "z0", "B0", "(II)V", "K", "size", "q0", "r0", "start", "len", "P0", "(II)Z", "LU0/V;", "h1", "(I)LU0/V;", "Q0", "x1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "q1", "gapStart", "Ljava/util/HashMap;", "LU0/d;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "N0", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "w0", "j0", "(I)I", "dataIndex", "R", "", "I0", "([II)I", "P", "address", "Q", "c1", "u1", "([III)V", "G0", "H", "gapLen", "capacity", "S", "(IIII)I", "anchor", "O", "(III)I", "K0", "(II)I", "J0", "t0", "F0", "k0", "l0", "(I)Ljava/lang/Object;", "m0", "i0", "p0", "n0", "o0", "D0", "E0", "(LU0/d;)Ljava/lang/Object;", "H0", "normalClose", "L", "(Z)V", "R0", "p1", "G", "(LU0/d;Ljava/lang/Object;)V", "count", "n1", "r1", "(Ljava/lang/Object;)V", "y1", "w1", "v1", "W0", "V0", "(ILjava/lang/Object;)Ljava/lang/Object;", "d1", "U0", "(IILjava/lang/Object;)Ljava/lang/Object;", "X0", "()Ljava/lang/Object;", "b1", "(LU0/d;I)Ljava/lang/Object;", "groupIndex", "a1", "(II)Ljava/lang/Object;", "g1", "f1", "e1", "amount", "D", "Z0", "I", "U", "j1", "dataKey", "k1", "m1", "i1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "T", "V", "W", "(LU0/d;)V", "Y0", "O0", "()Z", "offset", "y0", "writer", "", "C0", "(LU0/d;ILU0/f1;)Ljava/util/List;", "removeSourceGroup", "x0", "(LU0/c1;IZ)Ljava/util/List;", "A0", "(ILU0/c1;I)Ljava/util/List;", "E", "(I)LU0/d;", "u0", "F", "(LU0/d;)I", "", "toString", "()Ljava/lang/String;", "o1", "a", "LU0/c1;", "h0", "()LU0/c1;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "Ljava/util/HashMap;", "Lj0/E;", "Lj0/F;", "f", "Lj0/E;", "calledByMap", "g", "groupGapStart", "h", "groupGapLen", "i", "currentSlot", "j", "currentSlotEnd", "k", "slotsGapStart", "l", "slotsGapLen", "m", "slotsGapOwner", "n", "insertCount", "o", "nodeCount", "LU0/W;", "p", "LU0/W;", "startStack", "q", "endStack", "r", "nodeCountStack", "Lj0/L;", "s", "deferredSlotWrites", "<set-?>", "t", "c0", "currentGroup", "u", "d0", "currentGroupEnd", "v", "e0", "w", "Z", "closed", "x", "LU0/F0;", "pendingRecalculateMarks", "Y", "g0", "slotsSize", "s0", "b0", "collectingSourceInformation", "a0", "collectingCalledInformation", "f0", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.f1  reason: case insensitive filesystem */
public final class C4874f1 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f13954y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f13955z = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C4865c1 f13956a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int[] f13957b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Object[] f13958c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<C4866d> f13959d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public HashMap<C4866d, V> f13960e;

    /* renamed from: f  reason: collision with root package name */
    private E<F> f13961f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f13962g;

    /* renamed from: h  reason: collision with root package name */
    private int f13963h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f13964i;

    /* renamed from: j  reason: collision with root package name */
    private int f13965j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f13966k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f13967l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f13968m;

    /* renamed from: n  reason: collision with root package name */
    private int f13969n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f13970o;

    /* renamed from: p  reason: collision with root package name */
    private final W f13971p = new W();

    /* renamed from: q  reason: collision with root package name */
    private final W f13972q = new W();

    /* renamed from: r  reason: collision with root package name */
    private final W f13973r = new W();

    /* renamed from: s  reason: collision with root package name */
    private E<L<Object>> f13974s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public int f13975t;

    /* renamed from: u  reason: collision with root package name */
    private int f13976u;

    /* renamed from: v  reason: collision with root package name */
    private int f13977v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f13978w;

    /* renamed from: x  reason: collision with root package name */
    private F0 f13979x;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LU0/f1$a;", "", "<init>", "()V", "LU0/f1;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "LU0/d;", "b", "(LU0/f1;ILU0/f1;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.f1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final List<C4866d> b(C4874f1 f1Var, int i10, C4874f1 f1Var2, boolean z10, boolean z11, boolean z12) {
            int i11;
            ArrayList arrayList;
            int i12;
            C4874f1 f1Var3 = f1Var;
            int i13 = i10;
            C4874f1 f1Var4 = f1Var2;
            int m02 = f1Var.m0(i10);
            int i14 = i13 + m02;
            int b10 = f1Var.P(i10);
            int b11 = f1Var3.P(i14);
            int i15 = b11 - b10;
            boolean a10 = f1Var.M(i10);
            f1Var4.q0(m02);
            f1Var4.r0(i15, f1Var2.c0());
            if (f1Var.f13962g < i14) {
                f1Var3.z0(i14);
            }
            if (f1Var.f13966k < b11) {
                f1Var3.B0(b11, i14);
            }
            int[] i16 = f1Var2.f13957b;
            int c02 = f1Var2.c0();
            C16870n.l(f1Var.f13957b, i16, c02 * 5, i13 * 5, i14 * 5);
            Object[] k10 = f1Var2.f13958c;
            int g10 = f1Var2.f13964i;
            C16870n.n(f1Var.f13958c, k10, g10, b10, b11);
            int e02 = f1Var2.e0();
            C4871e1.b0(i16, c02, e02);
            int i17 = c02 - i13;
            int i18 = c02 + m02;
            int c10 = g10 - f1Var4.Q(i16, c02);
            int m10 = f1Var2.f13968m;
            boolean z13 = a10;
            int l10 = f1Var2.f13967l;
            int length = k10.length;
            int i19 = g10;
            int i20 = m10;
            int i21 = b10;
            int i22 = c02;
            while (true) {
                i11 = 0;
                if (i22 >= i18) {
                    break;
                }
                if (i22 != c02) {
                    i12 = i18;
                    C4871e1.b0(i16, i22, C4871e1.T(i16, i22) + i17);
                } else {
                    i12 = i18;
                }
                int c11 = f1Var4.Q(i16, i22) + c10;
                if (i20 >= i22) {
                    i11 = f1Var2.f13966k;
                }
                int i23 = c10;
                C4871e1.X(i16, i22, f1Var4.S(c11, i11, l10, length));
                if (i22 == i20) {
                    i20++;
                }
                i22++;
                c10 = i23;
                i18 = i12;
            }
            int i24 = i18;
            f1Var4.f13968m = i20;
            int o10 = C4871e1.P(f1Var.f13959d, i13, f1Var.f0());
            int o11 = C4871e1.P(f1Var.f13959d, i14, f1Var.f0());
            if (o10 < o11) {
                ArrayList f10 = f1Var.f13959d;
                ArrayList arrayList2 = new ArrayList(o11 - o10);
                for (int i25 = o10; i25 < o11; i25++) {
                    C4866d dVar = (C4866d) f10.get(i25);
                    dVar.c(dVar.a() + i17);
                    arrayList2.add(dVar);
                }
                f1Var2.f13959d.addAll(C4871e1.P(f1Var2.f13959d, f1Var2.c0(), f1Var2.f0()), arrayList2);
                f10.subList(o10, o11).clear();
                arrayList = arrayList2;
            } else {
                arrayList = C16877v.n();
            }
            if (!arrayList.isEmpty()) {
                HashMap o12 = f1Var.f13960e;
                HashMap o13 = f1Var2.f13960e;
                if (!(o12 == null || o13 == null)) {
                    int size = arrayList.size();
                    for (int i26 = 0; i26 < size; i26++) {
                        C4866d dVar2 = arrayList.get(i26);
                        V v10 = (V) o12.get(dVar2);
                        if (v10 != null) {
                            o12.remove(dVar2);
                            o13.put(dVar2, v10);
                        }
                    }
                }
            }
            int e03 = f1Var2.e0();
            V B10 = f1Var4.h1(e02);
            int i27 = 1;
            if (B10 != null) {
                int i28 = e03 + 1;
                int c03 = f1Var2.c0();
                int i29 = -1;
                while (i28 < c03) {
                    i29 = i28;
                    i28 = C4871e1.I(f1Var2.f13957b, i28) + i28;
                }
                B10.b(f1Var4, i29, c03);
            }
            int H02 = f1Var.H0(i10);
            if (z12) {
                if (z10) {
                    if (H02 >= 0) {
                        i11 = 1;
                    }
                    if (i11 != 0) {
                        f1Var.j1();
                        f1Var3.D(H02 - f1Var.c0());
                        f1Var.j1();
                    }
                    f1Var3.D(i13 - f1Var.c0());
                    boolean O02 = f1Var.O0();
                    if (i11 != 0) {
                        f1Var.Z0();
                        f1Var.T();
                        f1Var.Z0();
                        f1Var.T();
                    }
                    i11 = O02;
                } else {
                    i11 = f1Var3.P0(i13, m02);
                    f1Var3.Q0(i21, i15, i13 - 1);
                }
            }
            if (i11 != 0) {
                C4895p.s("Unexpectedly removed anchors");
            }
            int j10 = f1Var2.f13970o;
            if (!C4871e1.N(i16, c02)) {
                i27 = C4871e1.Q(i16, c02);
            }
            f1Var4.f13970o = j10 + i27;
            if (z11) {
                f1Var4.f13975t = i24;
                f1Var4.f13964i = i19 + i15;
            }
            if (z13) {
                f1Var4.s1(e02);
            }
            return arrayList;
        }

        static /* synthetic */ List c(a aVar, C4874f1 f1Var, int i10, C4874f1 f1Var2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return aVar.b(f1Var, i10, f1Var2, z10, z11, z12);
        }

        private a() {
        }
    }

    public C4874f1(C4865c1 c1Var) {
        this.f13956a = c1Var;
        this.f13957b = c1Var.A();
        this.f13958c = c1Var.C();
        this.f13959d = c1Var.t();
        this.f13960e = c1Var.E();
        this.f13961f = c1Var.x();
        this.f13962g = c1Var.B();
        this.f13963h = (this.f13957b.length / 5) - c1Var.B();
        this.f13966k = c1Var.D();
        this.f13967l = this.f13958c.length - c1Var.D();
        this.f13968m = c1Var.B();
        this.f13976u = c1Var.B();
        this.f13977v = -1;
    }

    /* access modifiers changed from: private */
    public final void B0(int i10, int i11) {
        int i12 = this.f13967l;
        int i13 = this.f13966k;
        int i14 = this.f13968m;
        if (i13 != i10) {
            Object[] objArr = this.f13958c;
            if (i10 < i13) {
                C16870n.n(objArr, objArr, i10 + i12, i10, i13);
            } else {
                C16870n.n(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int min = Math.min(i11 + 1, f0());
        if (i14 != min) {
            int length = this.f13958c.length - i12;
            if (min < i14) {
                int j02 = j0(min);
                int j03 = j0(i14);
                int i15 = this.f13962g;
                while (j02 < j03) {
                    int e10 = C4871e1.F(this.f13957b, j02);
                    if (!(e10 >= 0)) {
                        C4895p.s("Unexpected anchor value, expected a positive anchor");
                    }
                    C4871e1.X(this.f13957b, j02, -((length - e10) + 1));
                    j02++;
                    if (j02 == i15) {
                        j02 += this.f13963h;
                    }
                }
            } else {
                int j04 = j0(i14);
                int j05 = j0(min);
                while (j04 < j05) {
                    int e11 = C4871e1.F(this.f13957b, j04);
                    if (!(e11 < 0)) {
                        C4895p.s("Unexpected anchor value, expected a negative anchor");
                    }
                    C4871e1.X(this.f13957b, j04, e11 + length + 1);
                    j04++;
                    if (j04 == this.f13962g) {
                        j04 += this.f13963h;
                    }
                }
            }
            this.f13968m = min;
        }
        this.f13966k = i10;
    }

    private final int G0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int H(int[] iArr, int i10) {
        return Q(iArr, i10) + C4871e1.E(C4871e1.H(iArr, i10) >> 29);
    }

    private final int I0(int[] iArr, int i10) {
        return J0(C4871e1.T(iArr, j0(i10)));
    }

    private final boolean J(int i10) {
        int i11 = i10 + 1;
        int m02 = i10 + m0(i10);
        while (i11 < m02) {
            if (C4871e1.C(this.f13957b, j0(i11))) {
                return true;
            }
            i11 += m0(i11);
        }
        return false;
    }

    private final int J0(int i10) {
        return i10 > -2 ? i10 : f0() + i10 + 2;
    }

    private final void K() {
        int i10 = this.f13966k;
        C16870n.x(this.f13958c, null, i10, this.f13967l + i10);
    }

    private final int K0(int i10, int i11) {
        return i10 < i11 ? i10 : -((f0() - i10) + 2);
    }

    private final Object L0(Object obj) {
        Object X02 = X0();
        W0(obj);
        return X02;
    }

    /* access modifiers changed from: private */
    public final boolean M(int i10) {
        return i10 >= 0 && C4871e1.C(this.f13957b, j0(i10));
    }

    private final void M0() {
        F0 f02 = this.f13979x;
        if (f02 != null) {
            while (f02.b()) {
                t1(f02.d(), f02);
            }
        }
    }

    private final boolean N(int i10) {
        return i10 >= 0 && C4871e1.D(this.f13957b, j0(i10));
    }

    private final boolean N0(int i10, int i11, HashMap<C4866d, V> hashMap) {
        int i12 = i11 + i10;
        int o10 = C4871e1.P(this.f13959d, i12, Y() - this.f13963h);
        if (o10 >= this.f13959d.size()) {
            o10--;
        }
        int i13 = o10 + 1;
        boolean z10 = false;
        int i14 = 0;
        while (o10 >= 0) {
            C4866d dVar = this.f13959d.get(o10);
            int F10 = F(dVar);
            if (F10 < i10) {
                break;
            }
            if (F10 < i12) {
                dVar.c(Integer.MIN_VALUE);
                if (hashMap != null) {
                    V remove = hashMap.remove(dVar);
                }
                if (i14 == 0) {
                    i14 = o10 + 1;
                }
                i13 = o10;
            }
            o10--;
        }
        if (i13 < i14) {
            z10 = true;
        }
        if (z10) {
            this.f13959d.subList(i13, i14).clear();
        }
        return z10;
    }

    private final int O(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* access modifiers changed from: private */
    public final int P(int i10) {
        return Q(this.f13957b, j0(i10));
    }

    /* access modifiers changed from: private */
    public final boolean P0(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList<C4866d> arrayList = this.f13959d;
            z0(i10);
            if (!arrayList.isEmpty()) {
                z10 = N0(i10, i11, this.f13960e);
            }
            this.f13962g = i10;
            this.f13963h += i11;
            int i12 = this.f13968m;
            if (i12 > i10) {
                this.f13968m = Math.max(i10, i12 - i11);
            }
            int i13 = this.f13976u;
            if (i13 >= this.f13962g) {
                this.f13976u = i13 - i11;
            }
            int i14 = this.f13977v;
            if (N(i14)) {
                s1(i14);
            }
        }
        return z10;
    }

    /* access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        return i10 >= Y() ? this.f13958c.length - this.f13967l : O(C4871e1.F(iArr, i10), this.f13967l, this.f13958c.length);
    }

    /* access modifiers changed from: private */
    public final void Q0(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f13967l;
            int i14 = i10 + i11;
            B0(i14, i12);
            this.f13966k = i10;
            this.f13967l = i13 + i11;
            C16870n.x(this.f13958c, null, i10, i14);
            int i15 = this.f13965j;
            if (i15 >= i10) {
                this.f13965j = i15 - i11;
            }
        }
    }

    /* access modifiers changed from: private */
    public final int R(int i10) {
        return i10 < this.f13966k ? i10 : i10 + this.f13967l;
    }

    /* access modifiers changed from: private */
    public final int S(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final int S0() {
        int Y10 = (Y() - this.f13963h) - this.f13972q.i();
        this.f13976u = Y10;
        return Y10;
    }

    private final void T0() {
        this.f13972q.j((Y() - this.f13963h) - this.f13976u);
    }

    private final void X(int i10, int i11, int i12) {
        int K02 = K0(i10, this.f13962g);
        while (i12 < i11) {
            C4871e1.b0(this.f13957b, j0(i12), K02);
            int h10 = C4871e1.I(this.f13957b, j0(i12)) + i12;
            X(i12, h10, i12 + 1);
            i12 = h10;
        }
    }

    private final int Y() {
        return this.f13957b.length / 5;
    }

    /* access modifiers changed from: private */
    public final int c1(int[] iArr, int i10) {
        return i10 >= Y() ? this.f13958c.length - this.f13967l : O(C4871e1.V(iArr, i10), this.f13967l, this.f13958c.length);
    }

    /* access modifiers changed from: private */
    public final V h1(int i10) {
        C4866d o12;
        HashMap<C4866d, V> hashMap = this.f13960e;
        if (hashMap == null || (o12 = o1(i10)) == null) {
            return null;
        }
        return hashMap.get(o12);
    }

    /* access modifiers changed from: private */
    public final int j0(int i10) {
        return i10 < this.f13962g ? i10 : i10 + this.f13963h;
    }

    private final void l1(int i10, Object obj, boolean z10, Object obj2) {
        int i11;
        V h12;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i12 = this.f13977v;
        boolean z11 = this.f13969n > 0;
        this.f13973r.j(this.f13970o);
        if (z11) {
            int i13 = this.f13975t;
            int Q10 = Q(this.f13957b, j0(i13));
            q0(1);
            this.f13964i = Q10;
            this.f13965j = Q10;
            int j02 = j0(i13);
            C4889m.a aVar = C4889m.f14007a;
            boolean z12 = obj3 != aVar.a();
            boolean z13 = !z10 && obj4 != aVar.a();
            int S10 = S(Q10, this.f13966k, this.f13967l, this.f13958c.length);
            C4871e1.M(this.f13957b, j02, i10, z10, z12, z13, this.f13977v, (S10 < 0 || this.f13968m >= i13) ? S10 : -(((this.f13958c.length - this.f13967l) - S10) + 1));
            int i14 = (z10 ? 1 : 0) + (z12 ? 1 : 0) + (z13 ? 1 : 0);
            if (i14 > 0) {
                r0(i14, i13);
                Object[] objArr = this.f13958c;
                int i15 = this.f13964i;
                if (z10) {
                    objArr[i15] = obj4;
                    i15++;
                }
                if (z12) {
                    objArr[i15] = obj3;
                    i15++;
                }
                if (z13) {
                    objArr[i15] = obj4;
                    i15++;
                }
                this.f13964i = i15;
            }
            this.f13970o = 0;
            i11 = i13 + 1;
            this.f13977v = i13;
            this.f13975t = i11;
            if (i12 >= 0 && (h12 = h1(i12)) != null) {
                h12.i(this, i13);
            }
        } else {
            this.f13971p.j(i12);
            T0();
            int i16 = this.f13975t;
            int j03 = j0(i16);
            if (!C17542s.e(obj4, C4889m.f14007a.a())) {
                if (z10) {
                    w1(obj4);
                } else {
                    r1(obj4);
                }
            }
            this.f13964i = c1(this.f13957b, j03);
            this.f13965j = Q(this.f13957b, j0(this.f13975t + 1));
            this.f13970o = C4871e1.Q(this.f13957b, j03);
            this.f13977v = i16;
            this.f13975t = i16 + 1;
            i11 = i16 + C4871e1.I(this.f13957b, j03);
        }
        this.f13976u = i11;
    }

    /* access modifiers changed from: private */
    public final void q0(int i10) {
        if (i10 > 0) {
            int i11 = this.f13975t;
            z0(i11);
            int i12 = this.f13962g;
            int i13 = this.f13963h;
            int[] iArr = this.f13957b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            int i15 = 0;
            if (i13 < i10) {
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[(max * 5)];
                int i16 = max - i14;
                C16870n.l(iArr, iArr2, 0, 0, i12 * 5);
                C16870n.l(iArr, iArr2, (i12 + i16) * 5, (i13 + i12) * 5, length * 5);
                this.f13957b = iArr2;
                i13 = i16;
            }
            int i17 = this.f13976u;
            if (i17 >= i12) {
                this.f13976u = i17 + i10;
            }
            int i18 = i12 + i10;
            this.f13962g = i18;
            this.f13963h = i13 - i10;
            int P10 = i14 > 0 ? P(i11 + i10) : 0;
            if (this.f13968m >= i12) {
                i15 = this.f13966k;
            }
            int S10 = S(P10, i15, this.f13967l, this.f13958c.length);
            for (int i19 = i12; i19 < i18; i19++) {
                C4871e1.X(this.f13957b, i19, S10);
            }
            int i20 = this.f13968m;
            if (i20 >= i12) {
                this.f13968m = i20 + i10;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r5 = r3.f13959d.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r0 = r3.f13959d.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void q1(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f13963h
            int r1 = r3.Y()
            int r1 = r1 - r0
            if (r4 >= r5) goto L_0x002e
            java.util.ArrayList<U0.d> r0 = r3.f13959d
            int r4 = U0.C4871e1.P(r0, r4, r1)
        L_0x000f:
            java.util.ArrayList<U0.d> r0 = r3.f13959d
            int r0 = r0.size()
            if (r4 >= r0) goto L_0x0053
            java.util.ArrayList<U0.d> r0 = r3.f13959d
            java.lang.Object r0 = r0.get(r4)
            U0.d r0 = (U0.C4866d) r0
            int r2 = r0.a()
            if (r2 >= 0) goto L_0x0053
            int r2 = r2 + r1
            if (r2 >= r5) goto L_0x0053
            r0.c(r2)
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002e:
            java.util.ArrayList<U0.d> r4 = r3.f13959d
            int r4 = U0.C4871e1.P(r4, r5, r1)
        L_0x0034:
            java.util.ArrayList<U0.d> r5 = r3.f13959d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0053
            java.util.ArrayList<U0.d> r5 = r3.f13959d
            java.lang.Object r5 = r5.get(r4)
            U0.d r5 = (U0.C4866d) r5
            int r0 = r5.a()
            if (r0 < 0) goto L_0x0053
            int r0 = r1 - r0
            int r0 = -r0
            r5.c(r0)
            int r4 = r4 + 1
            goto L_0x0034
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4874f1.q1(int, int):void");
    }

    /* access modifiers changed from: private */
    public final void r0(int i10, int i11) {
        if (i10 > 0) {
            B0(this.f13964i, i11);
            int i12 = this.f13966k;
            int i13 = this.f13967l;
            if (i13 < i10) {
                Object[] objArr = this.f13958c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                C16870n.n(objArr, objArr2, 0, 0, i12);
                C16870n.n(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f13958c = objArr2;
                i13 = i16;
            }
            int i17 = this.f13965j;
            if (i17 >= i12) {
                this.f13965j = i17 + i10;
            }
            this.f13966k = i12 + i10;
            this.f13967l = i13 - i10;
        }
    }

    /* access modifiers changed from: private */
    public final void s1(int i10) {
        if (i10 >= 0) {
            F0 f02 = this.f13979x;
            if (f02 == null) {
                f02 = new F0((List) null, 1, (DefaultConstructorMarker) null);
                this.f13979x = f02;
            }
            f02.a(i10);
        }
    }

    private final void t1(int i10, F0 f02) {
        int j02 = j0(i10);
        boolean J10 = J(i10);
        if (C4871e1.D(this.f13957b, j02) != J10) {
            C4871e1.W(this.f13957b, j02, J10);
            int H02 = H0(i10);
            if (H02 >= 0) {
                f02.a(H02);
            }
        }
    }

    private final void u1(int[] iArr, int i10, int i11) {
        C4871e1.X(iArr, i10, S(i11, this.f13966k, this.f13967l, this.f13958c.length));
    }

    public static /* synthetic */ void v0(C4874f1 f1Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = f1Var.f13977v;
        }
        f1Var.u0(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        r3 = r5.f13959d.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void w0(int r6, int r7, int r8) {
        /*
            r5 = this;
            int r8 = r8 + r6
            int r0 = r5.f0()
            java.util.ArrayList<U0.d> r1 = r5.f13959d
            int r1 = U0.C4871e1.P(r1, r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 < 0) goto L_0x0033
        L_0x0012:
            java.util.ArrayList<U0.d> r3 = r5.f13959d
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0033
            java.util.ArrayList<U0.d> r3 = r5.f13959d
            java.lang.Object r3 = r3.get(r1)
            U0.d r3 = (U0.C4866d) r3
            int r4 = r5.F(r3)
            if (r4 < r6) goto L_0x0033
            if (r4 >= r8) goto L_0x0033
            r2.add(r3)
            java.util.ArrayList<U0.d> r3 = r5.f13959d
            r3.remove(r1)
            goto L_0x0012
        L_0x0033:
            int r7 = r7 - r6
            int r6 = r2.size()
            r8 = 0
        L_0x0039:
            if (r8 >= r6) goto L_0x0062
            java.lang.Object r1 = r2.get(r8)
            U0.d r1 = (U0.C4866d) r1
            int r3 = r5.F(r1)
            int r3 = r3 + r7
            int r4 = r5.f13962g
            if (r3 < r4) goto L_0x0051
            int r4 = r0 - r3
            int r4 = -r4
            r1.c(r4)
            goto L_0x0054
        L_0x0051:
            r1.c(r3)
        L_0x0054:
            java.util.ArrayList<U0.d> r4 = r5.f13959d
            int r3 = U0.C4871e1.P(r4, r3, r0)
            java.util.ArrayList<U0.d> r4 = r5.f13959d
            r4.add(r3, r1)
            int r8 = r8 + 1
            goto L_0x0039
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.C4874f1.w0(int, int, int):void");
    }

    private final void x1(int i10, Object obj) {
        int j02 = j0(i10);
        int[] iArr = this.f13957b;
        if (!(j02 < iArr.length && C4871e1.N(iArr, j02))) {
            C4895p.s("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f13958c[R(G0(this.f13957b, j02))] = obj;
    }

    /* access modifiers changed from: private */
    public final void z0(int i10) {
        int i11;
        int i12 = this.f13963h;
        int i13 = this.f13962g;
        if (i13 != i10) {
            if (!this.f13959d.isEmpty()) {
                q1(i13, i10);
            }
            if (i12 > 0) {
                int[] iArr = this.f13957b;
                int i14 = i10 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i10 < i13) {
                    C16870n.l(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    C16870n.l(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int Y10 = Y();
            C4895p.Q(i11 < Y10);
            while (i11 < Y10) {
                int s10 = C4871e1.T(this.f13957b, i11);
                int K02 = K0(J0(s10), i10);
                if (K02 != s10) {
                    C4871e1.b0(this.f13957b, i11, K02);
                }
                i11++;
                if (i11 == i10) {
                    i11 += i12;
                }
            }
        }
        this.f13962g = i10;
    }

    /* JADX INFO: finally extract failed */
    public final List<C4866d> A0(int i10, C4865c1 c1Var, int i11) {
        C4895p.Q(this.f13969n <= 0 && m0(this.f13975t + i10) == 1);
        int i12 = this.f13975t;
        int i13 = this.f13964i;
        int i14 = this.f13965j;
        D(i10);
        j1();
        I();
        C4874f1 J10 = c1Var.J();
        try {
            List<C4866d> c10 = a.c(f13954y, J10, i11, this, false, true, false, 32, (Object) null);
            J10.L(true);
            U();
            T();
            this.f13975t = i12;
            this.f13964i = i13;
            this.f13965j = i14;
            return c10;
        } catch (Throwable th2) {
            J10.L(false);
            throw th2;
        }
    }

    public final List<C4866d> C0(C4866d dVar, int i10, C4874f1 f1Var) {
        boolean z10 = true;
        C4895p.Q(f1Var.f13969n > 0);
        C4895p.Q(this.f13969n == 0);
        C4895p.Q(dVar.b());
        int F10 = F(dVar) + i10;
        int i11 = this.f13975t;
        C4895p.Q(i11 <= F10 && F10 < this.f13976u);
        int H02 = H0(F10);
        int m02 = m0(F10);
        int F02 = t0(F10) ? 1 : F0(F10);
        List<C4866d> c10 = a.c(f13954y, this, F10, f1Var, false, false, false, 32, (Object) null);
        s1(H02);
        boolean z11 = F02 > 0;
        while (H02 >= i11) {
            int j02 = j0(H02);
            int[] iArr = this.f13957b;
            C4871e1.Y(iArr, j02, C4871e1.I(iArr, j02) - m02);
            if (z11) {
                if (C4871e1.N(this.f13957b, j02)) {
                    z11 = false;
                } else {
                    int[] iArr2 = this.f13957b;
                    C4871e1.a0(iArr2, j02, C4871e1.Q(iArr2, j02) - F02);
                }
            }
            H02 = H0(H02);
        }
        if (z11) {
            if (this.f13970o < F02) {
                z10 = false;
            }
            C4895p.Q(z10);
            this.f13970o -= F02;
        }
        return c10;
    }

    public final void D(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            C4895p.s("Cannot seek backwards");
        }
        if (!(this.f13969n <= 0)) {
            C0.b("Cannot call seek() while inserting");
        }
        if (i10 != 0) {
            int i11 = this.f13975t + i10;
            if (i11 >= this.f13977v && i11 <= this.f13976u) {
                z10 = true;
            }
            if (!z10) {
                C4895p.s("Cannot seek outside the current group (" + this.f13977v + '-' + this.f13976u + ')');
            }
            this.f13975t = i11;
            int Q10 = Q(this.f13957b, j0(i11));
            this.f13964i = Q10;
            this.f13965j = Q10;
        }
    }

    public final Object D0(int i10) {
        int j02 = j0(i10);
        if (C4871e1.N(this.f13957b, j02)) {
            return this.f13958c[R(G0(this.f13957b, j02))];
        }
        return null;
    }

    public final C4866d E(int i10) {
        ArrayList<C4866d> arrayList = this.f13959d;
        int t10 = C4871e1.U(arrayList, i10, f0());
        if (t10 >= 0) {
            return arrayList.get(t10);
        }
        if (i10 > this.f13962g) {
            i10 = -(f0() - i10);
        }
        C4866d dVar = new C4866d(i10);
        arrayList.add(-(t10 + 1), dVar);
        return dVar;
    }

    public final Object E0(C4866d dVar) {
        return D0(dVar.e(this));
    }

    public final int F(C4866d dVar) {
        int a10 = dVar.a();
        return a10 < 0 ? a10 + f0() : a10;
    }

    public final int F0(int i10) {
        return C4871e1.Q(this.f13957b, j0(i10));
    }

    public final void G(C4866d dVar, Object obj) {
        if (!(this.f13969n == 0)) {
            C4895p.s("Can only append a slot if not current inserting");
        }
        int i10 = this.f13964i;
        int i11 = this.f13965j;
        int F10 = F(dVar);
        int Q10 = Q(this.f13957b, j0(F10 + 1));
        this.f13964i = Q10;
        this.f13965j = Q10;
        r0(1, F10);
        if (i10 >= Q10) {
            i10++;
            i11++;
        }
        this.f13958c[Q10] = obj;
        this.f13964i = i10;
        this.f13965j = i11;
    }

    public final int H0(int i10) {
        return I0(this.f13957b, i10);
    }

    public final void I() {
        int i10 = this.f13969n;
        this.f13969n = i10 + 1;
        if (i10 == 0) {
            T0();
        }
    }

    public final void L(boolean z10) {
        this.f13978w = true;
        if (z10 && this.f13971p.d()) {
            z0(f0());
            B0(this.f13958c.length - this.f13967l, this.f13962g);
            K();
            M0();
        }
        this.f13956a.m(this, this.f13957b, this.f13962g, this.f13958c, this.f13966k, this.f13959d, this.f13960e, this.f13961f);
    }

    public final boolean O0() {
        C4866d o12;
        if (!(this.f13969n == 0)) {
            C4895p.s("Cannot remove group while inserting");
        }
        int i10 = this.f13975t;
        int i11 = this.f13964i;
        int Q10 = Q(this.f13957b, j0(i10));
        int Y02 = Y0();
        V h12 = h1(this.f13977v);
        if (!(h12 == null || (o12 = o1(i10)) == null)) {
            h12.g(o12);
        }
        F0 f02 = this.f13979x;
        if (f02 != null) {
            while (f02.b() && f02.c() >= i10) {
                f02.d();
            }
        }
        boolean P02 = P0(i10, this.f13975t - i10);
        Q0(Q10, this.f13964i - Q10, i10 - 1);
        this.f13975t = i10;
        this.f13964i = i11;
        this.f13970o -= Y02;
        return P02;
    }

    public final void R0() {
        if (!(this.f13969n == 0)) {
            C4895p.s("Cannot reset when inserting");
        }
        M0();
        this.f13975t = 0;
        this.f13976u = Y() - this.f13963h;
        this.f13964i = 0;
        this.f13965j = 0;
        this.f13970o = 0;
    }

    public final int T() {
        L c10;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = this.f13969n > 0;
        int i11 = this.f13975t;
        int i12 = this.f13976u;
        int i13 = this.f13977v;
        int j02 = j0(i13);
        int i14 = this.f13970o;
        int i15 = i11 - i13;
        boolean m10 = C4871e1.N(this.f13957b, j02);
        if (z11) {
            E<L<Object>> e10 = this.f13974s;
            if (!(e10 == null || (c10 = e10.c(i13)) == null)) {
                Object[] objArr = c10.f24557a;
                int i16 = c10.f24558b;
                for (int i17 = 0; i17 < i16; i17++) {
                    L0(objArr[i17]);
                }
                L q10 = e10.q(i13);
            }
            C4871e1.Y(this.f13957b, j02, i15);
            C4871e1.a0(this.f13957b, j02, i14);
            this.f13970o = this.f13973r.i() + (m10 ? 1 : i14);
            int I02 = I0(this.f13957b, i13);
            this.f13977v = I02;
            int f02 = I02 < 0 ? f0() : j0(I02 + 1);
            if (f02 >= 0) {
                i10 = Q(this.f13957b, f02);
            }
            this.f13964i = i10;
            this.f13965j = i10;
        } else {
            if (i11 != i12) {
                z10 = false;
            }
            if (!z10) {
                C4895p.s("Expected to be at the end of a group");
            }
            int h10 = C4871e1.I(this.f13957b, j02);
            int p10 = C4871e1.Q(this.f13957b, j02);
            C4871e1.Y(this.f13957b, j02, i15);
            C4871e1.a0(this.f13957b, j02, i14);
            int i18 = this.f13971p.i();
            S0();
            this.f13977v = i18;
            int I03 = I0(this.f13957b, i13);
            int i19 = this.f13973r.i();
            this.f13970o = i19;
            if (I03 == i18) {
                if (!m10) {
                    i10 = i14 - p10;
                }
                this.f13970o = i19 + i10;
            } else {
                int i20 = i15 - h10;
                int i21 = m10 ? 0 : i14 - p10;
                if (!(i20 == 0 && i21 == 0)) {
                    while (I03 != 0 && I03 != i18 && (i21 != 0 || i20 != 0)) {
                        int j03 = j0(I03);
                        if (i20 != 0) {
                            C4871e1.Y(this.f13957b, j03, C4871e1.I(this.f13957b, j03) + i20);
                        }
                        if (i21 != 0) {
                            int[] iArr = this.f13957b;
                            C4871e1.a0(iArr, j03, C4871e1.Q(iArr, j03) + i21);
                        }
                        if (C4871e1.N(this.f13957b, j03)) {
                            i21 = 0;
                        }
                        I03 = I0(this.f13957b, I03);
                    }
                }
                this.f13970o += i21;
            }
        }
        return i14;
    }

    public final void U() {
        boolean z10 = false;
        if (!(this.f13969n > 0)) {
            C0.b("Unbalanced begin/end insert");
        }
        int i10 = this.f13969n - 1;
        this.f13969n = i10;
        if (i10 == 0) {
            if (this.f13973r.b() == this.f13971p.b()) {
                z10 = true;
            }
            if (!z10) {
                C4895p.s("startGroup/endGroup mismatch while inserting");
            }
            S0();
        }
    }

    public final Object U0(int i10, int i11, Object obj) {
        int R10 = R(d1(i10, i11));
        Object[] objArr = this.f13958c;
        Object obj2 = objArr[R10];
        objArr[R10] = obj;
        return obj2;
    }

    public final void V(int i10) {
        boolean z10 = false;
        if (!(this.f13969n <= 0)) {
            C4895p.s("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f13977v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f13976u) {
                z10 = true;
            }
            if (!z10) {
                C4895p.s("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f13975t;
            int i13 = this.f13964i;
            int i14 = this.f13965j;
            this.f13975t = i10;
            j1();
            this.f13975t = i12;
            this.f13964i = i13;
            this.f13965j = i14;
        }
    }

    public final Object V0(int i10, Object obj) {
        return U0(this.f13975t, i10, obj);
    }

    public final void W(C4866d dVar) {
        V(dVar.e(this));
    }

    public final void W0(Object obj) {
        if (!(this.f13964i <= this.f13965j)) {
            C4895p.s("Writing to an invalid slot");
        }
        this.f13958c[R(this.f13964i - 1)] = obj;
    }

    public final Object X0() {
        if (this.f13969n > 0) {
            r0(1, this.f13977v);
        }
        Object[] objArr = this.f13958c;
        int i10 = this.f13964i;
        this.f13964i = i10 + 1;
        return objArr[R(i10)];
    }

    public final int Y0() {
        int j02 = j0(this.f13975t);
        int h10 = this.f13975t + C4871e1.I(this.f13957b, j02);
        this.f13975t = h10;
        this.f13964i = Q(this.f13957b, j0(h10));
        if (C4871e1.N(this.f13957b, j02)) {
            return 1;
        }
        return C4871e1.Q(this.f13957b, j02);
    }

    public final boolean Z() {
        return this.f13978w;
    }

    public final void Z0() {
        int i10 = this.f13976u;
        this.f13975t = i10;
        this.f13964i = Q(this.f13957b, j0(i10));
    }

    public final boolean a0() {
        return this.f13961f != null;
    }

    public final Object a1(int i10, int i11) {
        int c12 = c1(this.f13957b, j0(i10));
        int Q10 = Q(this.f13957b, j0(i10 + 1));
        int i12 = i11 + c12;
        if (c12 > i12 || i12 >= Q10) {
            return C4889m.f14007a.a();
        }
        return this.f13958c[R(i12)];
    }

    public final boolean b0() {
        return this.f13960e != null;
    }

    public final Object b1(C4866d dVar, int i10) {
        return a1(F(dVar), i10);
    }

    public final int c0() {
        return this.f13975t;
    }

    public final int d0() {
        return this.f13976u;
    }

    public final int d1(int i10, int i11) {
        int c12 = c1(this.f13957b, j0(i10));
        int i12 = c12 + i11;
        if (!(i12 >= c12 && i12 < Q(this.f13957b, j0(i10 + 1)))) {
            C4895p.s("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int e0() {
        return this.f13977v;
    }

    public final int e1(int i10) {
        return Q(this.f13957b, j0(i10 + m0(i10)));
    }

    public final int f0() {
        return Y() - this.f13963h;
    }

    public final int f1(int i10) {
        return Q(this.f13957b, j0(i10 + 1));
    }

    public final int g0() {
        return this.f13958c.length - this.f13967l;
    }

    public final int g1(int i10) {
        return c1(this.f13957b, j0(i10));
    }

    public final C4865c1 h0() {
        return this.f13956a;
    }

    public final Object i0(int i10) {
        int j02 = j0(i10);
        return C4871e1.J(this.f13957b, j02) ? this.f13958c[H(this.f13957b, j02)] : C4889m.f14007a.a();
    }

    public final void i1(int i10, Object obj, Object obj2) {
        l1(i10, obj, false, obj2);
    }

    public final void j1() {
        if (!(this.f13969n == 0)) {
            C4895p.s("Key must be supplied when inserting");
        }
        C4889m.a aVar = C4889m.f14007a;
        l1(0, aVar.a(), false, aVar.a());
    }

    public final int k0(int i10) {
        return C4871e1.O(this.f13957b, j0(i10));
    }

    public final void k1(int i10, Object obj) {
        l1(i10, obj, false, C4889m.f14007a.a());
    }

    public final Object l0(int i10) {
        int j02 = j0(i10);
        if (C4871e1.L(this.f13957b, j02)) {
            return this.f13958c[C4871e1.S(this.f13957b, j02)];
        }
        return null;
    }

    public final int m0(int i10) {
        return C4871e1.I(this.f13957b, j0(i10));
    }

    public final void m1(int i10, Object obj) {
        l1(i10, obj, true, C4889m.f14007a.a());
    }

    public final boolean n0(int i10) {
        return o0(i10, this.f13975t);
    }

    public final void n1(int i10) {
        boolean z10 = false;
        C4895p.Q(i10 > 0);
        int i11 = this.f13977v;
        int c12 = c1(this.f13957b, j0(i11));
        int Q10 = Q(this.f13957b, j0(i11 + 1)) - i10;
        if (Q10 >= c12) {
            z10 = true;
        }
        C4895p.Q(z10);
        Q0(Q10, i10, i11);
        int i12 = this.f13964i;
        if (i12 >= c12) {
            this.f13964i = i12 - i10;
        }
    }

    public final boolean o0(int i10, int i11) {
        int i12;
        int m02;
        if (i11 == this.f13977v) {
            i12 = this.f13976u;
        } else {
            if (i11 > this.f13971p.h(0)) {
                m02 = m0(i11);
            } else {
                int c10 = this.f13971p.c(i11);
                if (c10 < 0) {
                    m02 = m0(i11);
                } else {
                    i12 = (Y() - this.f13963h) - this.f13972q.f(c10);
                }
            }
            i12 = m02 + i11;
        }
        return i10 > i11 && i10 < i12;
    }

    public final C4866d o1(int i10) {
        if (i10 < 0 || i10 >= f0()) {
            return null;
        }
        return C4871e1.G(this.f13959d, i10, f0());
    }

    public final boolean p0(int i10) {
        int i11 = this.f13977v;
        return (i10 > i11 && i10 < this.f13976u) || (i11 == 0 && i10 == 0);
    }

    public final Object p1(Object obj) {
        if (this.f13969n <= 0 || this.f13964i == this.f13966k) {
            return L0(obj);
        }
        E<L<Object>> e10 = this.f13974s;
        if (e10 == null) {
            e10 = new E<>(0, 1, (DefaultConstructorMarker) null);
        }
        this.f13974s = e10;
        int i10 = this.f13977v;
        L<Object> c10 = e10.c(i10);
        if (c10 == null) {
            c10 = new L<>(0, 1, (DefaultConstructorMarker) null);
            e10.t(i10, c10);
        }
        c10.g(obj);
        return C4889m.f14007a.a();
    }

    public final void r1(Object obj) {
        int j02 = j0(this.f13975t);
        if (!C4871e1.J(this.f13957b, j02)) {
            C4895p.s("Updating the data of a group that was not created with a data slot");
        }
        this.f13958c[R(H(this.f13957b, j02))] = obj;
    }

    public final boolean s0() {
        int i10 = this.f13975t;
        return i10 < this.f13976u && C4871e1.N(this.f13957b, j0(i10));
    }

    public final boolean t0(int i10) {
        return C4871e1.N(this.f13957b, j0(i10));
    }

    public String toString() {
        return "SlotWriter(current = " + this.f13975t + " end=" + this.f13976u + " size = " + f0() + " gap=" + this.f13962g + '-' + (this.f13962g + this.f13963h) + ')';
    }

    public final void u0(int i10) {
        int j02 = j0(i10);
        if (!C4871e1.K(this.f13957b, j02)) {
            C4871e1.Z(this.f13957b, j02, true);
            if (!C4871e1.D(this.f13957b, j02)) {
                s1(H0(i10));
            }
        }
    }

    public final void v1(C4866d dVar, Object obj) {
        x1(dVar.e(this), obj);
    }

    public final void w1(Object obj) {
        x1(this.f13975t, obj);
    }

    public final List<C4866d> x0(C4865c1 c1Var, int i10, boolean z10) {
        boolean z11 = false;
        z11 = true;
        C4895p.Q(this.f13969n > 0 ? z11 : z11);
        if (i10 == 0 && this.f13975t == 0 && this.f13956a.B() == 0 && C4871e1.I(c1Var.A(), i10) == c1Var.B()) {
            int[] iArr = this.f13957b;
            Object[] objArr = this.f13958c;
            ArrayList<C4866d> arrayList = this.f13959d;
            HashMap<C4866d, V> hashMap = this.f13960e;
            E<F> e10 = this.f13961f;
            int[] A10 = c1Var.A();
            int B10 = c1Var.B();
            Object[] C10 = c1Var.C();
            int D10 = c1Var.D();
            HashMap<C4866d, V> E10 = c1Var.E();
            E<F> x10 = c1Var.x();
            this.f13957b = A10;
            this.f13958c = C10;
            this.f13959d = c1Var.t();
            this.f13962g = B10;
            this.f13963h = (A10.length / 5) - B10;
            this.f13966k = D10;
            this.f13967l = C10.length - D10;
            this.f13968m = B10;
            this.f13960e = E10;
            this.f13961f = x10;
            c1Var.L(iArr, 0, objArr, 0, arrayList, hashMap, e10);
            return this.f13959d;
        }
        C4874f1 J10 = c1Var.J();
        try {
            return f13954y.b(J10, i10, this, true, true, z10);
        } finally {
            J10.L(z11);
        }
    }

    public final void y0(int i10) {
        if (!(this.f13969n == 0)) {
            C4895p.s("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            C4895p.s("Parameter offset is out of bounds");
        }
        if (i10 != 0) {
            int i11 = this.f13975t;
            int i12 = this.f13977v;
            int i13 = this.f13976u;
            int i14 = i11;
            for (int i15 = i10; i15 > 0; i15--) {
                i14 += C4871e1.I(this.f13957b, j0(i14));
                if (!(i14 <= i13)) {
                    C4895p.s("Parameter offset is out of bounds");
                }
            }
            int h10 = C4871e1.I(this.f13957b, j0(i14));
            int Q10 = Q(this.f13957b, j0(this.f13975t));
            int Q11 = Q(this.f13957b, j0(i14));
            int i16 = i14 + h10;
            int Q12 = Q(this.f13957b, j0(i16));
            int i17 = Q12 - Q11;
            r0(i17, Math.max(this.f13975t - 1, 0));
            q0(h10);
            int[] iArr = this.f13957b;
            int j02 = j0(i16) * 5;
            C16870n.l(iArr, iArr, j0(i11) * 5, j02, (h10 * 5) + j02);
            if (i17 > 0) {
                Object[] objArr = this.f13958c;
                C16870n.n(objArr, objArr, Q10, R(Q11 + i17), R(Q12 + i17));
            }
            int i18 = Q11 + i17;
            int i19 = i18 - Q10;
            int i20 = this.f13966k;
            int i21 = this.f13967l;
            int length = this.f13958c.length;
            int i22 = this.f13968m;
            int i23 = i11 + h10;
            int i24 = i11;
            while (i24 < i23) {
                int j03 = j0(i24);
                int i25 = i20;
                int i26 = i19;
                u1(iArr, j03, S(Q(iArr, j03) - i19, i22 < j03 ? 0 : i25, i21, length));
                i24++;
                i20 = i25;
                i19 = i26;
            }
            w0(i16, i11, h10);
            if (P0(i16, h10)) {
                C4895p.s("Unexpectedly removed anchors");
            }
            X(i12, this.f13976u, i11);
            if (i17 > 0) {
                Q0(i18, i17, i16 - 1);
            }
        }
    }

    public final void y1() {
        this.f13960e = this.f13956a.E();
        this.f13961f = this.f13956a.x();
    }
}
