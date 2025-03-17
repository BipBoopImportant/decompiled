package YH;

import GJ.C15765h;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import com.optimizely.ab.config.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import rI.C17853c;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000ö\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\n\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0013\u0010\u000f\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0014\u0010\u0012\u001a'\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0017\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u000f\u001a\u001d\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001c\u0010\u0012\u001a\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001d\u0010\u000f\u001a\u001f\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u001e\u0010\u0012\u001a'\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001a)\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010#\u001a\u001d\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b%\u0010\u000f\u001a\u001d\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b&\u0010\u0012\u001a\u001f\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b'\u0010\u000f\u001a\u001f\u0010(\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b(\u0010\u0012\u001a+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+\u001a+\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-\u001a=\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\nH\bø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a)\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0000*\u000201*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b2\u00103\u001a=\u00107\u001a\u00028\u0000\"\u0010\b\u0000\u00105*\n\u0012\u0006\b\u0000\u0012\u00028\u000104\"\b\b\u0001\u0010\u0000*\u000201*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u00106\u001a\u00028\u0000¢\u0006\u0004\b7\u00108\u001a+\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<\u001a+\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b=\u0010+\u001a+\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b>\u0010-\u001a#\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b?\u00103\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000@*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bA\u00103\u001a?\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010D\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Bj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`C¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010H\u001a\u00020G*\b\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0004\bH\u0010I\u001a\u0017\u0010L\u001a\u00020K*\b\u0012\u0004\u0012\u00020J0\u001f¢\u0006\u0004\bL\u0010M\u001a\u0017\u0010P\u001a\u00020O*\b\u0012\u0004\u0012\u00020N0\u001f¢\u0006\u0004\bP\u0010Q\u001a\u0017\u0010T\u001a\u00020S*\b\u0012\u0004\u0012\u00020R0\u001f¢\u0006\u0004\bT\u0010U\u001a\u0017\u0010W\u001a\u00020V*\b\u0012\u0004\u0012\u00020\u00060\u001f¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\u00020Z*\b\u0012\u0004\u0012\u00020Y0\u001f¢\u0006\u0004\b[\u0010\\\u001a7\u0010]\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u00028\u000004*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00106\u001a\u00028\u0001¢\u0006\u0004\b]\u00108\u001a-\u0010`\u001a\u0012\u0012\u0004\u0012\u00028\u00000^j\b\u0012\u0004\u0012\u00028\u0000`_\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b`\u0010a\u001a#\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bb\u00103\u001a#\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bd\u00103\u001a#\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\be\u0010f\u001a#\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bh\u0010i\u001aC\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010j*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\bø\u0001\u0000¢\u0006\u0004\bl\u00100\u001a)\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000m0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bn\u0010o\u001a#\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bp\u00103\u001a4\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004¢\u0006\u0004\br\u0010s\u001a4\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004¢\u0006\u0004\bt\u0010s\u001a#\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bv\u0010i\u001a4\u0010w\u001a\b\u0012\u0004\u0012\u00028\u00000g\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0004¢\u0006\u0004\bw\u0010s\u001a7\u0010x\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\nH\bø\u0001\u0000¢\u0006\u0004\bx\u0010y\u001a\u001d\u0010z\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bz\u0010{\u001a)\u0010|\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000@*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b|\u0010}\u001a\u001b\u0010~\u001a\u0004\u0018\u00010R*\b\u0012\u0004\u0012\u00020R0\u0001H\u0007¢\u0006\u0004\b~\u0010\u001a-\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000@*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0005\b\u0001\u0010}\u001a\u001d\u0010\u0001\u001a\u0004\u0018\u00010R*\b\u0012\u0004\u0012\u00020R0\u0001H\u0007¢\u0006\u0005\b\u0001\u0010\u001a-\u0010\u0001\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000@*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0005\b\u0001\u0010}\u001a6\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0001\u0010+\u001a1\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a8\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a1\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a1\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a8\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001a8\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001f2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001\u001aM\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0001\u001a\u00020\u00062\t\b\u0002\u0010\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0006\b\u0001\u0010\u0001\u001aJ\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010j*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0004¢\u0006\u0006\b\u0001\u0010\u0001\u001a4\u0010\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00010\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0005\b\u0001\u00103\u001a\u0001\u0010¡\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u0001*\b0\u0001j\u0003`\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u00062\n\b\u0002\u0010 \u0001\u001a\u00030\u00012\u0017\b\u0002\u0010k\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0001\u0018\u00010\n¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001au\u0010¤\u0001\u001a\u00030£\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010\u0001\u001a\u00030\u00012\t\b\u0002\u0010\u0001\u001a\u00020\u00062\n\b\u0002\u0010 \u0001\u001a\u00030\u00012\u0017\b\u0002\u0010k\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0001\u0018\u00010\n¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a'\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¦\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a\u001c\u0010©\u0001\u001a\u00020N*\b\u0012\u0004\u0012\u00020Y0\u0001H\u0007¢\u0006\u0006\b©\u0001\u0010ª\u0001\u001a\u001c\u0010«\u0001\u001a\u00020N*\b\u0012\u0004\u0012\u00020R0\u0001H\u0007¢\u0006\u0006\b«\u0001\u0010ª\u0001\u001a\u001c\u0010¬\u0001\u001a\u00020R*\b\u0012\u0004\u0012\u00020R0\u0001H\u0007¢\u0006\u0006\b¬\u0001\u0010­\u0001\u001a\u001c\u0010®\u0001\u001a\u00020N*\b\u0012\u0004\u0012\u00020N0\u0001H\u0007¢\u0006\u0006\b®\u0001\u0010ª\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006¯\u0001"}, d2 = {"T", "", "element", "", "l0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "", "index", "p0", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "r0", "(Ljava/lang/Iterable;ILnI/l;)Ljava/lang/Object;", "v0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "w0", "(Ljava/util/List;)Ljava/lang/Object;", "x0", "y0", "z0", "(Ljava/util/List;I)Ljava/lang/Object;", "A0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "B0", "(Ljava/util/List;Ljava/lang/Object;)I", "H0", "I0", "J0", "K0", "", "LrI/c;", "random", "X0", "(Ljava/util/Collection;LrI/c;)Ljava/lang/Object;", "Y0", "a1", "b1", "c1", "d1", "n", "n0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "o0", "(Ljava/util/List;I)Ljava/util/List;", "predicate", "s0", "(Ljava/lang/Iterable;LnI/l;)Ljava/util/List;", "", "t0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "u0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "LtI/j;", "indices", "e1", "(Ljava/util/List;LtI/j;)Ljava/util/List;", "k1", "l1", "Z0", "", "f1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "g1", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "m1", "(Ljava/util/Collection;)[Z", "", "", "n1", "(Ljava/util/Collection;)[B", "", "", "p1", "(Ljava/util/Collection;)[D", "", "", "q1", "(Ljava/util/Collection;)[F", "", "s1", "(Ljava/util/Collection;)[I", "", "", "u1", "(Ljava/util/Collection;)[J", "o1", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "r1", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "t1", "", "v1", "w1", "(Ljava/util/Collection;)Ljava/util/List;", "", "y1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "L0", "LYH/Q;", "B1", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "m0", "other", "C0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "h1", "", "x1", "z1", "f0", "(Ljava/lang/Iterable;LnI/l;)Z", "g0", "(Ljava/lang/Iterable;)Z", "O0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "N0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "M0", "Q0", "P0", "size", "k0", "S0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "R0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "U0", "W0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "T0", "V0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "step", "partialWindows", "A1", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "LXH/v;", "D1", "E1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "D0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/Appendable;", "", "F0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LnI/l;)Ljava/lang/String;", "LGJ/h;", "h0", "(Ljava/lang/Iterable;)LGJ/h;", "j0", "(Ljava/lang/Iterable;)D", "i0", "j1", "(Ljava/lang/Iterable;)F", "i1", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.H  reason: case insensitive filesystem */
class C16851H extends C16848E {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"YH/H$a", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.H$a */
    public static final class a implements C15765h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f140416a;

        public a(Iterable iterable) {
            this.f140416a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f140416a.iterator();
        }
    }

    public static <T> int A0(Iterable<? extends T> iterable, T t10) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (Object next : iterable) {
            if (i10 < 0) {
                C16877v.x();
            }
            if (C17542s.e(t10, next)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> List<List<T>> A1(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        C17542s.j(iterable, "<this>");
        k0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b10 = k0.b(iterable.iterator(), i10, i11, z10, false);
            while (b10.hasNext()) {
                arrayList.add(b10.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int i13 = C17978n.i(i10, size - i12);
            if (i13 < i10 && !z10) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList3.add(list.get(i14 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T> int B0(List<? extends T> list, T t10) {
        C17542s.j(list, "<this>");
        return list.indexOf(t10);
    }

    public static <T> Iterable<Q<T>> B1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return new S(new C16849F(iterable));
    }

    public static <T> Set<T> C0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "other");
        Set<T> x12 = C16877v.x1(iterable);
        C16846C.R(x12, iterable2);
        return x12;
    }

    /* access modifiers changed from: private */
    public static final Iterator C1(Iterable iterable) {
        return iterable.iterator();
    }

    public static final <T, A extends Appendable> A D0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(a10, "buffer");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (Object next : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C15854t.a(a10, next, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static <T, R> List<v<T, R>> D1(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C16877v.y(iterable, 10), C16877v.y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C16796C.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ Appendable E0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
        String str = (i11 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i11 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return D0(iterable, appendable, str, charSequence6, charSequence5, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : lVar);
    }

    public static <T> List<v<T, T>> E1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C16877v.n();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(C16796C.a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> String F0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l<? super T, ? extends CharSequence> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(charSequence, "separator");
        C17542s.j(charSequence2, "prefix");
        C17542s.j(charSequence3, "postfix");
        C17542s.j(charSequence4, "truncated");
        return ((StringBuilder) D0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String G0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, C17642l lVar, int i11, Object obj) {
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
        return F0(iterable, charSequence, charSequence6, charSequence5, i12, charSequence7, lVar);
    }

    public static <T> T H0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            return C16877v.I0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T I0(List<? extends T> list) {
        C17542s.j(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C16877v.p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T J0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T K0(List<? extends T> list) {
        C17542s.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> L0(Iterable<? extends T> iterable, C17642l<? super T, ? extends R> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "transform");
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T M0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static Float N0(Iterable<Float> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static <T extends Comparable<? super T>> T O0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t10 = (Comparable) it.next();
            while (it.hasNext()) {
                T t11 = (Comparable) it.next();
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    public static <T extends Comparable<? super T>> T P0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (Comparable) it.next();
        while (it.hasNext()) {
            T t11 = (Comparable) it.next();
            if (t10.compareTo(t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static Float Q0(Iterable<Float> iterable) {
        C17542s.j(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static <T> List<T> R0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "elements");
        Collection<? extends T> G10 = C16846C.G(iterable2);
        if (G10.isEmpty()) {
            return C16877v.t1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!G10.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> List<T> S0(Iterable<? extends T> iterable, T t10) {
        C17542s.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        boolean z10 = false;
        for (Object next : iterable) {
            boolean z11 = true;
            if (!z10 && C17542s.e(next, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static <T> List<T> T0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "elements");
        if (iterable instanceof Collection) {
            return C16877v.V0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C16877v.E(arrayList, iterable);
        C16877v.E(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> U0(Iterable<? extends T> iterable, T t10) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return C16877v.W0((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        C16877v.E(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> V0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C17542s.j(collection, "<this>");
        C17542s.j(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C16877v.E(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> W0(Collection<? extends T> collection, T t10) {
        C17542s.j(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T X0(Collection<? extends T> collection, C17853c cVar) {
        C17542s.j(collection, "<this>");
        C17542s.j(cVar, Group.RANDOM_POLICY);
        if (!collection.isEmpty()) {
            return p0(collection, cVar.e(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T Y0(Collection<? extends T> collection, C17853c cVar) {
        C17542s.j(collection, "<this>");
        C17542s.j(cVar, Group.RANDOM_POLICY);
        if (collection.isEmpty()) {
            return null;
        }
        return p0(collection, cVar.e(collection.size()));
    }

    public static <T> List<T> Z0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C16877v.t1(iterable);
        }
        List<T> v12 = C16877v.v1(iterable);
        C16877v.c0(v12);
        return v12;
    }

    public static <T> T a1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            return C16877v.b1((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T b1(List<? extends T> list) {
        C17542s.j(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static <T> T c1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T d1(List<? extends T> list) {
        C17542s.j(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> e1(List<? extends T> list, C17974j jVar) {
        C17542s.j(list, "<this>");
        C17542s.j(jVar, "indices");
        return jVar.isEmpty() ? C16877v.n() : C16877v.t1(list.subList(jVar.i().intValue(), jVar.m().intValue() + 1));
    }

    public static <T> boolean f0(Iterable<? extends T> iterable, C17642l<? super T, Boolean> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<? super T>> List<T> f1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C16877v.t1(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C16870n.K((Comparable[]) array);
            return C16870n.f(array);
        }
        List<T> v12 = C16877v.v1(iterable);
        C16877v.B(v12);
        return v12;
    }

    public static <T> boolean g0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> List<T> g1(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C17542s.j(iterable, "<this>");
        C17542s.j(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C16877v.t1(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C16873q.L(array, comparator);
            return C16870n.f(array);
        }
        List<T> v12 = C16877v.v1(iterable);
        C16877v.C(v12, comparator);
        return v12;
    }

    public static <T> C15765h<T> h0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> Set<T> h1(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "other");
        Set<T> x12 = C16877v.x1(iterable);
        C16846C.K(x12, iterable2);
        return x12;
    }

    public static double i0(Iterable<Float> iterable) {
        C17542s.j(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Float floatValue : iterable) {
            d10 += (double) floatValue.floatValue();
            i10++;
            if (i10 < 0) {
                C16877v.w();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static double i1(Iterable<Double> iterable) {
        C17542s.j(iterable, "<this>");
        double d10 = 0.0d;
        for (Double doubleValue : iterable) {
            d10 += doubleValue.doubleValue();
        }
        return d10;
    }

    public static double j0(Iterable<Long> iterable) {
        C17542s.j(iterable, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (Long longValue : iterable) {
            d10 += (double) longValue.longValue();
            i10++;
            if (i10 < 0) {
                C16877v.w();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    public static float j1(Iterable<Float> iterable) {
        C17542s.j(iterable, "<this>");
        float f10 = 0.0f;
        for (Float floatValue : iterable) {
            f10 += floatValue.floatValue();
        }
        return f10;
    }

    public static <T> List<List<T>> k0(Iterable<? extends T> iterable, int i10) {
        C17542s.j(iterable, "<this>");
        return A1(iterable, i10, i10, true);
    }

    public static <T> List<T> k1(Iterable<? extends T> iterable, int i10) {
        C17542s.j(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C16877v.n();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return C16877v.t1(iterable);
                }
                if (i10 == 1) {
                    return C16877v.e(C16877v.v0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (Object add : iterable) {
                arrayList.add(add);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return C16879x.u(arrayList);
        }
    }

    public static <T> boolean l0(Iterable<? extends T> iterable, T t10) {
        C17542s.j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : C16877v.A0(iterable, t10) >= 0;
    }

    public static <T> List<T> l1(List<? extends T> list, int i10) {
        C17542s.j(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C16877v.n();
        } else {
            int size = list.size();
            if (i10 >= size) {
                return C16877v.t1(list);
            }
            if (i10 == 1) {
                return C16877v.e(C16877v.I0(list));
            }
            ArrayList arrayList = new ArrayList(i10);
            if (list instanceof RandomAccess) {
                for (int i11 = size - i10; i11 < size; i11++) {
                    arrayList.add(list.get(i11));
                }
            } else {
                Iterator listIterator = list.listIterator(size - i10);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    public static <T> List<T> m0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return C16877v.t1(C16877v.x1(iterable));
    }

    public static boolean[] m1(Collection<Boolean> collection) {
        C17542s.j(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i10 = 0;
        for (Boolean booleanValue : collection) {
            zArr[i10] = booleanValue.booleanValue();
            i10++;
        }
        return zArr;
    }

    public static <T> List<T> n0(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        C17542s.j(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return C16877v.t1(iterable);
        } else {
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i10;
                if (size <= 0) {
                    return C16877v.n();
                }
                if (size == 1) {
                    return C16877v.e(C16877v.H0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i10 < size2) {
                            arrayList.add(list.get(i10));
                            i10++;
                        }
                    } else {
                        Iterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i11 = 0;
            for (Object next : iterable) {
                if (i11 >= i10) {
                    arrayList.add(next);
                } else {
                    i11++;
                }
            }
            return C16879x.u(arrayList);
        }
    }

    public static byte[] n1(Collection<Byte> collection) {
        C17542s.j(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte byteValue : collection) {
            bArr[i10] = byteValue.byteValue();
            i10++;
        }
        return bArr;
    }

    public static <T> List<T> o0(List<? extends T> list, int i10) {
        C17542s.j(list, "<this>");
        if (i10 >= 0) {
            return C16877v.k1(list, C17978n.e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T, C extends Collection<? super T>> C o1(Iterable<? extends T> iterable, C c10) {
        C17542s.j(iterable, "<this>");
        C17542s.j(c10, "destination");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    public static final <T> T p0(Iterable<? extends T> iterable, int i10) {
        C17542s.j(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i10) : r0(iterable, i10, new C16850G(i10));
    }

    public static double[] p1(Collection<Double> collection) {
        C17542s.j(collection, "<this>");
        double[] dArr = new double[collection.size()];
        int i10 = 0;
        for (Double doubleValue : collection) {
            dArr[i10] = doubleValue.doubleValue();
            i10++;
        }
        return dArr;
    }

    /* access modifiers changed from: private */
    public static final Object q0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    public static float[] q1(Collection<Float> collection) {
        C17542s.j(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i10 = 0;
        for (Float floatValue : collection) {
            fArr[i10] = floatValue.floatValue();
            i10++;
        }
        return fArr;
    }

    public static final <T> T r0(Iterable<? extends T> iterable, int i10, C17642l<? super Integer, ? extends T> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? lVar.invoke(Integer.valueOf(i10)) : list.get(i10);
        } else if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        } else {
            int i11 = 0;
            for (T next : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return next;
                }
                i11 = i12;
            }
            return lVar.invoke(Integer.valueOf(i10));
        }
    }

    public static <T> HashSet<T> r1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return (HashSet) C16877v.o1(iterable, new HashSet(X.e(C16877v.y(iterable, 12))));
    }

    public static <T> List<T> s0(Iterable<? extends T> iterable, C17642l<? super T, Boolean> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static int[] s1(Collection<Integer> collection) {
        C17542s.j(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer intValue : collection) {
            iArr[i10] = intValue.intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> t0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return (List) u0(iterable, new ArrayList());
    }

    public static <T> List<T> t1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C16879x.u(C16877v.v1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C16877v.n();
        }
        if (size != 1) {
            return C16877v.w1(collection);
        }
        return C16877v.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <C extends Collection<? super T>, T> C u0(Iterable<? extends T> iterable, C c10) {
        C17542s.j(iterable, "<this>");
        C17542s.j(c10, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static long[] u1(Collection<Long> collection) {
        C17542s.j(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Long longValue : collection) {
            jArr[i10] = longValue.longValue();
            i10++;
        }
        return jArr;
    }

    public static <T> T v0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            return C16877v.w0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> List<T> v1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return iterable instanceof Collection ? C16877v.w1((Collection) iterable) : (List) C16877v.o1(iterable, new ArrayList());
    }

    public static <T> T w0(List<? extends T> list) {
        C17542s.j(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> List<T> w1(Collection<? extends T> collection) {
        C17542s.j(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> T x0(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> Set<T> x1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) C16877v.o1(iterable, new LinkedHashSet());
    }

    public static <T> T y0(List<? extends T> list) {
        C17542s.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> Set<T> y1(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i0.g((Set) C16877v.o1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g0.d();
        }
        if (size != 1) {
            return (Set) C16877v.o1(iterable, new LinkedHashSet(X.e(collection.size())));
        }
        return g0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> T z0(List<? extends T> list, int i10) {
        C17542s.j(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static <T> Set<T> z1(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C17542s.j(iterable, "<this>");
        C17542s.j(iterable2, "other");
        Set<T> x12 = C16877v.x1(iterable);
        C16877v.E(x12, iterable2);
        return x12;
    }
}
