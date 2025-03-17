package YH;

import GJ.C15765h;
import GJ.C15768k;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010$\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010!\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017¢\u0006\u0004\b0\u00101\u001a\u001f\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b2\u0010\u001b\u001a'\u00103\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b3\u0010'\u001a\u0019\u00104\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b4\u0010-\u001a!\u00105\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b5\u0010\u001b\u001a\u001f\u00106\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b6\u0010\u001b\u001a\u0011\u00107\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b7\u00108\u001a!\u00109\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b9\u0010\u001b\u001a-\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\b<\u0010=\u001a+\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\b\b\u0000\u0010\u0000*\u00020>*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b?\u0010@\u001a?\u0010D\u001a\u00028\u0000\"\u0010\b\u0000\u0010B*\n\u0012\u0006\b\u0000\u0012\u00028\u00010A\"\b\b\u0001\u0010\u0000*\u00020>*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010C\u001a\u00028\u0000¢\u0006\u0004\bD\u0010E\u001a-\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010:\u001a\u00020\u000f¢\u0006\u0004\bF\u0010=\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0;*\u00020\u000e¢\u0006\u0004\bG\u0010H\u001a\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001e0;*\u00020\u001d¢\u0006\u0004\bI\u0010J\u001aC\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010M\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Kj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`L¢\u0006\u0004\bN\u0010O\u001aA\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010M\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Kj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`L¢\u0006\u0004\bP\u0010Q\u001a9\u0010R\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010B*\n\u0012\u0006\b\u0000\u0012\u00028\u00000A*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010C\u001a\u00028\u0001¢\u0006\u0004\bR\u0010E\u001a%\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bS\u0010@\u001a\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00070;*\u00020\u0006¢\u0006\u0004\bT\u0010U\u001a\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0;*\u00020\n¢\u0006\u0004\bV\u0010W\u001a\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000f0;*\u00020\u000e¢\u0006\u0004\bX\u0010H\u001a\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00130;*\u00020\u0012¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001e0;*\u00020\u001d¢\u0006\u0004\b[\u0010J\u001a\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020]0;*\u00020\\¢\u0006\u0004\b^\u0010_\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030;*\u00020`¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00170;*\u00020\u0016¢\u0006\u0004\bc\u0010d\u001a%\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000e\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bf\u0010@\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070e*\u00020\u0006¢\u0006\u0004\bg\u0010U\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000b0e*\u00020\n¢\u0006\u0004\bh\u0010W\u001a\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000f0e*\u00020\u000e¢\u0006\u0004\bi\u0010H\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130e*\u00020\u0012¢\u0006\u0004\bj\u0010Z\u001a\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u001e0e*\u00020\u001d¢\u0006\u0004\bk\u0010J\u001a\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020]0e*\u00020\\¢\u0006\u0004\bl\u0010_\u001a\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00030e*\u00020`¢\u0006\u0004\bm\u0010b\u001a\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170e*\u00020\u0016¢\u0006\u0004\bn\u0010d\u001a%\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000o\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bp\u0010q\u001a+\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000s0r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bt\u0010u\u001a\u0013\u0010v\u001a\u00020\u000f*\u00020\u000eH\u0007¢\u0006\u0004\bv\u0010w\u001a\u0013\u0010x\u001a\u00020\u001e*\u00020\u001dH\u0007¢\u0006\u0004\bx\u0010y\u001a\u0015\u0010z\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0004\bz\u0010{\u001a\u0013\u0010|\u001a\u00020\u000f*\u00020\u000eH\u0007¢\u0006\u0004\b|\u0010w\u001a\u0015\u0010}\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0004\b}\u0010{\u001aN\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010;\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010~*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0004¢\u0006\u0006\b\u0001\u0010\u0001\u001aL\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010;\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010~*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010rH\u0004¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0001\u0010\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u0001*\b0\u0001j\u0003`\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0001\u001a\u00030\u00012\u0019\b\u0002\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0001\u0010\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u0001*\b0\u0001j\u0003`\u0001*\u00020\u00062\u0007\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0001\u001a\u00030\u00012\u0019\b\u0002\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001ay\u0010\u0001\u001a\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0001\u001a\u00030\u00012\u0019\b\u0002\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001ak\u0010\u0001\u001a\u00030\u0001*\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0001\u001a\u00030\u00012\u0019\b\u0002\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00028\u00000r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0000\u0010u\u001a)\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0014\u0010\u0001\u001a\u00020]*\u00020\u0012¢\u0006\u0006\b\u0001\u0010\u0001\u001a\u0013\u0010\u0001\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0005\b\u0001\u0010w\"'\u0010£\u0001\u001a\u00030 \u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0019\u0010£\u0001\u001a\u00030 \u0001*\u00020\u000e8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001\"&\u0010¨\u0001\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0017\u0010¨\u0001\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010w\"\u0018\u0010¨\u0001\u001a\u00020\u000f*\u00020\u00128F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001\"\u0018\u0010¨\u0001\u001a\u00020\u000f*\u00020\u001d8F¢\u0006\b\u001a\u0006\b¬\u0001\u0010­\u0001¨\u0006®\u0001"}, d2 = {"T", "", "element", "", "a0", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "W", "([BB)Z", "", "", "b0", "([SS)Z", "", "", "Y", "([II)Z", "", "", "Z", "([JJ)Z", "", "", "X", "([CC)Z", "f0", "([Ljava/lang/Object;)Ljava/lang/Object;", "h0", "", "", "g0", "([F)Ljava/lang/Float;", "index", "p0", "([Ljava/lang/Object;I)Ljava/lang/Object;", "o0", "([II)Ljava/lang/Integer;", "u0", "([Ljava/lang/Object;Ljava/lang/Object;)I", "q0", "([BB)I", "v0", "([SS)I", "s0", "([II)I", "t0", "([JJ)I", "r0", "([CC)I", "D0", "F0", "E0", "G0", "N0", "M0", "([C)C", "O0", "n", "", "c0", "([Ljava/lang/Object;I)Ljava/util/List;", "", "d0", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "e0", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "U0", "Q0", "([I)Ljava/util/List;", "P0", "([F)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "R0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "S0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "V0", "c1", "W0", "([B)Ljava/util/List;", "d1", "([S)Ljava/util/List;", "a1", "b1", "([J)Ljava/util/List;", "Z0", "", "", "Y0", "([D)Ljava/util/List;", "", "e1", "([Z)Ljava/util/List;", "X0", "([C)Ljava/util/List;", "", "l1", "f1", "m1", "j1", "k1", "i1", "h1", "n1", "g1", "", "o1", "([Ljava/lang/Object;)Ljava/util/Set;", "", "LYH/Q;", "p1", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "J0", "([I)I", "I0", "([F)F", "H0", "([I)Ljava/lang/Integer;", "L0", "K0", "R", "other", "LXH/v;", "s1", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "r1", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "x0", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/Appendable;", "w0", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/Appendable;", "", "A0", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "z0", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "LGJ/h;", "U", "([Ljava/lang/Object;)LGJ/h;", "V", "([J)D", "T0", "LtI/j;", "j0", "([Ljava/lang/Object;)LtI/j;", "indices", "i0", "([I)LtI/j;", "n0", "([Ljava/lang/Object;)I", "lastIndex", "l0", "m0", "([J)I", "k0", "([F)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: YH.s  reason: case insensitive filesystem */
class C16874s extends C16873q {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"YH/s$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.s$a */
    public static final class a implements Iterable<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f140471a;

        public a(Object[] objArr) {
            this.f140471a = objArr;
        }

        public Iterator<T> iterator() {
            return C17527c.a(this.f140471a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"YH/s$b", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.s$b */
    public static final class b implements C15765h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f140472a;

        public b(Object[] objArr) {
            this.f140472a = objArr;
        }

        public Iterator<T> iterator() {
            return C17527c.a(this.f140472a);
        }
    }

    public static final <T> String A0(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(tArr, "<this>");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        return ((StringBuilder) x0(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String B0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return z0(bArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static /* synthetic */ String C0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return A0(objArr, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static <T> T D0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[C16870n.n0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int E0(int[] iArr, int i10) {
        C17542s.j(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static <T> int F0(T[] tArr, T t10) {
        C17542s.j(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (C17542s.e(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static <T> T G0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static Integer H0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int l02 = C16870n.l0(iArr);
        int i11 = 1;
        if (1 <= l02) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == l02) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static float I0(float[] fArr) {
        C17542s.j(fArr, "<this>");
        if (fArr.length != 0) {
            float f10 = fArr[0];
            int k02 = k0(fArr);
            int i10 = 1;
            if (1 <= k02) {
                while (true) {
                    f10 = Math.max(f10, fArr[i10]);
                    if (i10 == k02) {
                        break;
                    }
                    i10++;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    public static int J0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int l02 = C16870n.l0(iArr);
            int i11 = 1;
            if (1 <= l02) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == l02) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    public static Integer K0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int l02 = C16870n.l0(iArr);
        int i11 = 1;
        if (1 <= l02) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == l02) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static int L0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int l02 = C16870n.l0(iArr);
            int i11 = 1;
            if (1 <= l02) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == l02) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    public static char M0(char[] cArr) {
        C17542s.j(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T N0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return tArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T O0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static List<Float> P0(float[] fArr) {
        C17542s.j(fArr, "<this>");
        Float[] P10 = C16870n.P(fArr);
        C16870n.K((Comparable[]) P10);
        return C16870n.f(P10);
    }

    public static List<Integer> Q0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        Integer[] Q10 = C16870n.Q(iArr);
        C16870n.K((Comparable[]) Q10);
        return C16870n.f(Q10);
    }

    public static final <T> T[] R0(T[] tArr, Comparator<? super T> comparator) {
        C17542s.j(tArr, "<this>");
        C17542s.j(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C17542s.i(copyOf, "copyOf(...)");
        C16873q.L(copyOf, comparator);
        return copyOf;
    }

    public static <T> List<T> S0(T[] tArr, Comparator<? super T> comparator) {
        C17542s.j(tArr, "<this>");
        C17542s.j(comparator, "comparator");
        return C16870n.f(R0(tArr, comparator));
    }

    public static <T> Iterable<T> T(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return tArr.length == 0 ? C16877v.n() : new a(tArr);
    }

    public static int T0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static <T> C15765h<T> U(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return tArr.length == 0 ? C15768k.j() : new b(tArr);
    }

    public static final <T> List<T> U0(T[] tArr, int i10) {
        C17542s.j(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C16877v.n();
        } else {
            int length = tArr.length;
            if (i10 >= length) {
                return C16870n.c1(tArr);
            }
            if (i10 == 1) {
                return C16877v.e(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = length - i10; i11 < length; i11++) {
                arrayList.add(tArr[i11]);
            }
            return arrayList;
        }
    }

    public static double V(long[] jArr) {
        C17542s.j(jArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d10 += (double) j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static final <T, C extends Collection<? super T>> C V0(T[] tArr, C c10) {
        C17542s.j(tArr, "<this>");
        C17542s.j(c10, "destination");
        for (T add : tArr) {
            c10.add(add);
        }
        return c10;
    }

    public static boolean W(byte[] bArr, byte b10) {
        C17542s.j(bArr, "<this>");
        return q0(bArr, b10) >= 0;
    }

    public static List<Byte> W0(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? f1(bArr) : C16877v.e(Byte.valueOf(bArr[0])) : C16877v.n();
    }

    public static boolean X(char[] cArr, char c10) {
        C17542s.j(cArr, "<this>");
        return r0(cArr, c10) >= 0;
    }

    public static List<Character> X0(char[] cArr) {
        C17542s.j(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? g1(cArr) : C16877v.e(Character.valueOf(cArr[0])) : C16877v.n();
    }

    public static boolean Y(int[] iArr, int i10) {
        C17542s.j(iArr, "<this>");
        return C16870n.s0(iArr, i10) >= 0;
    }

    public static List<Double> Y0(double[] dArr) {
        C17542s.j(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? h1(dArr) : C16877v.e(Double.valueOf(dArr[0])) : C16877v.n();
    }

    public static boolean Z(long[] jArr, long j10) {
        C17542s.j(jArr, "<this>");
        return t0(jArr, j10) >= 0;
    }

    public static List<Float> Z0(float[] fArr) {
        C17542s.j(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? i1(fArr) : C16877v.e(Float.valueOf(fArr[0])) : C16877v.n();
    }

    public static <T> boolean a0(T[] tArr, T t10) {
        C17542s.j(tArr, "<this>");
        return C16870n.u0(tArr, t10) >= 0;
    }

    public static List<Integer> a1(int[] iArr) {
        C17542s.j(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? C16870n.j1(iArr) : C16877v.e(Integer.valueOf(iArr[0])) : C16877v.n();
    }

    public static boolean b0(short[] sArr, short s10) {
        C17542s.j(sArr, "<this>");
        return v0(sArr, s10) >= 0;
    }

    public static List<Long> b1(long[] jArr) {
        C17542s.j(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? k1(jArr) : C16877v.e(Long.valueOf(jArr[0])) : C16877v.n();
    }

    public static <T> List<T> c0(T[] tArr, int i10) {
        C17542s.j(tArr, "<this>");
        if (i10 >= 0) {
            return U0(tArr, C17978n.e(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> c1(T[] tArr) {
        C17542s.j(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? C16870n.l1(tArr) : C16877v.e(tArr[0]) : C16877v.n();
    }

    public static <T> List<T> d0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return (List) e0(tArr, new ArrayList());
    }

    public static List<Short> d1(short[] sArr) {
        C17542s.j(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? m1(sArr) : C16877v.e(Short.valueOf(sArr[0])) : C16877v.n();
    }

    public static final <C extends Collection<? super T>, T> C e0(T[] tArr, C c10) {
        C17542s.j(tArr, "<this>");
        C17542s.j(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static List<Boolean> e1(boolean[] zArr) {
        C17542s.j(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? n1(zArr) : C16877v.e(Boolean.valueOf(zArr[0])) : C16877v.n();
    }

    public static <T> T f0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List<Byte> f1(byte[] bArr) {
        C17542s.j(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Float g0(float[] fArr) {
        C17542s.j(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final List<Character> g1(char[] cArr) {
        C17542s.j(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char valueOf : cArr) {
            arrayList.add(Character.valueOf(valueOf));
        }
        return arrayList;
    }

    public static <T> T h0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final List<Double> h1(double[] dArr) {
        C17542s.j(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double valueOf : dArr) {
            arrayList.add(Double.valueOf(valueOf));
        }
        return arrayList;
    }

    public static C17974j i0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        return new C17974j(0, C16870n.l0(iArr));
    }

    public static final List<Float> i1(float[] fArr) {
        C17542s.j(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    public static <T> C17974j j0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return new C17974j(0, C16870n.n0(tArr));
    }

    public static List<Integer> j1(int[] iArr) {
        C17542s.j(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final int k0(float[] fArr) {
        C17542s.j(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final List<Long> k1(long[] jArr) {
        C17542s.j(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static int l0(int[] iArr) {
        C17542s.j(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> List<T> l1(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return new ArrayList(C16879x.i(tArr));
    }

    public static int m0(long[] jArr) {
        C17542s.j(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final List<Short> m1(short[] sArr) {
        C17542s.j(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short valueOf : sArr) {
            arrayList.add(Short.valueOf(valueOf));
        }
        return arrayList;
    }

    public static <T> int n0(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final List<Boolean> n1(boolean[] zArr) {
        C17542s.j(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean valueOf : zArr) {
            arrayList.add(Boolean.valueOf(valueOf));
        }
        return arrayList;
    }

    public static Integer o0(int[] iArr, int i10) {
        C17542s.j(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static <T> Set<T> o1(T[] tArr) {
        C17542s.j(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) V0(tArr, new LinkedHashSet(X.e(tArr.length))) : g0.c(tArr[0]) : g0.d();
    }

    public static <T> T p0(T[] tArr, int i10) {
        C17542s.j(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static <T> Iterable<Q<T>> p1(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return new S(new r(tArr));
    }

    public static final int q0(byte[] bArr, byte b10) {
        C17542s.j(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static final Iterator q1(Object[] objArr) {
        return C17527c.a(objArr);
    }

    public static final int r0(char[] cArr, char c10) {
        C17542s.j(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T, R> List<v<T, R>> r1(T[] tArr, Iterable<? extends R> iterable) {
        C17542s.j(tArr, "<this>");
        C17542s.j(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C16877v.y(iterable, 10), length));
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(C16796C.a(tArr[i10], next));
            i10++;
        }
        return arrayList;
    }

    public static int s0(int[] iArr, int i10) {
        C17542s.j(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static <T, R> List<v<T, R>> s1(T[] tArr, R[] rArr) {
        C17542s.j(tArr, "<this>");
        C17542s.j(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(C16796C.a(tArr[i10], rArr[i10]));
        }
        return arrayList;
    }

    public static final int t0(long[] jArr, long j10) {
        C17542s.j(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int u0(T[] tArr, T t10) {
        C17542s.j(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (C17542s.e(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int v0(short[] sArr, short s10) {
        C17542s.j(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <A extends Appendable> A w0(byte[] bArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super Byte, ? extends CharSequence> lVar) {
        C17542s.j(bArr, "<this>");
        C17542s.j(a10, "buffer");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                a10.append((CharSequence) lVar.invoke(Byte.valueOf(b10)));
            } else {
                a10.append(String.valueOf(b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T, A extends Appendable> A x0(T[] tArr, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(tArr, "<this>");
        C17542s.j(a10, "buffer");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C15854t.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable y0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return x0(objArr, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static final String z0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super Byte, ? extends CharSequence> lVar) {
        C17542s.j(bArr, "<this>");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        return ((StringBuilder) w0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }
}
