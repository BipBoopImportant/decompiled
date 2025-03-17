package LJ;

import KJ.C15990f;
import PJ.C16207a;
import PJ.C16210d;
import PJ.f;
import YH.C16864h;
import YH.C16870n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0001\u0010\u001bJ!\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 JA\u0010%\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u0010&JA\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010+\u001a\u00020\n2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070,H\u0002¢\u0006\u0004\b.\u0010/JG\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b2\u00103JO\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0014\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060,H\u0002¢\u0006\u0004\b5\u00106J1\u00108\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109JI\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J]\u0010C\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bC\u0010DJW\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010E\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bF\u0010GJm\u0010J\u001a\u00020$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u00107\u001a\u00020\n2\u000e\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010I\u001a\u00020\n2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010A\u001a\u00020\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ;\u0010N\u001a\u0004\u0018\u00010\u00072\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bN\u0010OJ?\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u00020$2\u0010\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00100\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010TJA\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010P\u001a\u00020:H\u0002¢\u0006\u0004\bU\u0010RJ#\u0010X\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150VH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001bJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00107\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020:H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020:2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020:H\u0002¢\u0006\u0004\bk\u0010=J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bo\u0010\u000fJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010r\u001a\u00020$2\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010vJ%\u0010t\u001a\u00020\u00152\u0006\u00107\u001a\u00020\n2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\bt\u0010wJ\u0018\u0010x\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00028\u00002\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010{\u001a\u00020\u00152\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016¢\u0006\u0004\b{\u0010uJ!\u0010|\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V¢\u0006\u0004\b|\u0010YJ \u0010}\u001a\u00028\u00002\u0006\u00107\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J \u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00107\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0001\u0010nR&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010U\u001a\u0005\b\u0001\u0010\u000f\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bz\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001RD\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010 \"\u0006\b\u0001\u0010\u0001R?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u000e¢\u0006\u0016\n\u0005\bi\u0010\u0001\u001a\u0005\b\u0001\u0010 \"\u0006\b\u0001\u0010\u0001R'\u0010\u0010\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\n8\u0016@RX\u000e¢\u0006\u000e\n\u0005\b\u0001\u0010U\u001a\u0005\b\u0001\u0010\u000f¨\u0006\u0001"}, d2 = {"LLJ/f;", "E", "LYH/h;", "LKJ/f$a;", "LKJ/f;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(LKJ/f;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "X", "()I", "size", "g0", "(I)I", "d0", "buffer", "", "B", "([Ljava/lang/Object;)Z", "D", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "G", "(Ljava/lang/Object;)[Ljava/lang/Object;", "F", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "LXH/N;", "M", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "O", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "k", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "L", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "K", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "A", "([Ljava/lang/Object;ILjava/lang/Object;)V", "LLJ/d;", "elementCarry", "x", "([Ljava/lang/Object;IILjava/lang/Object;LLJ/d;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "t", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "b0", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "c0", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "i", "(I)[Ljava/lang/Object;", "V", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "U", "([Ljava/lang/Object;IILLJ/d;)[Ljava/lang/Object;", "J", "([Ljava/lang/Object;II)V", "I", "Lkotlin/Function1;", "predicate", "R", "(LnI/l;)Z", "W", "H", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "S", "(LnI/l;ILLJ/d;)I", "bufferSize", "Q", "(LnI/l;[Ljava/lang/Object;ILLJ/d;)I", "toBufferSize", "", "recyclableBuffers", "P", "(LnI/l;[Ljava/lang/Object;IILLJ/d;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "Y", "", "C", "(I)Ljava/util/ListIterator;", "m", "g", "()LKJ/f;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "b", "removeAll", "T", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "a", "q", "setRootShift$kotlinx_collections_immutable", "(I)V", "LKJ/f;", "builtVector", "LPJ/f;", "c", "LPJ/f;", "ownership", "value", "d", "[Ljava/lang/Object;", "p", "Z", "([Ljava/lang/Object;)V", "s", "a0", "<set-?>", "f", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: LJ.f  reason: case insensitive filesystem */
public final class C16022f<E> extends C16864h<E> implements C15990f.a<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f136098a;

    /* renamed from: b  reason: collision with root package name */
    private C15990f<? extends E> f136099b;

    /* renamed from: c  reason: collision with root package name */
    private f f136100c = new f();

    /* renamed from: d  reason: collision with root package name */
    private Object[] f136101d;

    /* renamed from: e  reason: collision with root package name */
    private Object[] f136102e;

    /* renamed from: f  reason: collision with root package name */
    private int f136103f;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: LJ.f$a */
    static final class a extends C17544u implements C17642l<E, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Collection<E> f136104c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Collection<? extends E> collection) {
            super(1);
            this.f136104c = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f136104c.contains(e10));
        }
    }

    public C16022f(C15990f<? extends E> fVar, Object[] objArr, Object[] objArr2, int i10) {
        C17542s.j(fVar, "vector");
        C17542s.j(objArr2, "vectorTail");
        this.f136098a = i10;
        this.f136099b = fVar;
        this.f136101d = objArr;
        this.f136102e = objArr2;
        this.f136103f = fVar.size();
    }

    private final void A(Object[] objArr, int i10, E e10) {
        int d02 = d0();
        Object[] D10 = D(this.f136102e);
        if (d02 < 32) {
            C16870n.n(this.f136102e, D10, i10 + 1, i10, d02);
            D10[i10] = e10;
            Z(objArr);
            a0(D10);
            this.f136103f = size() + 1;
            return;
        }
        Object[] objArr2 = this.f136102e;
        Object obj = objArr2[31];
        C16870n.n(objArr2, D10, i10 + 1, i10, 31);
        D10[i10] = e10;
        M(objArr, D10, G(obj));
    }

    private final boolean B(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f136100c;
    }

    private final ListIterator<Object[]> C(int i10) {
        if (this.f136101d != null) {
            int X10 = X() >> 5;
            C16210d.b(i10, X10);
            int i11 = this.f136098a;
            if (i11 == 0) {
                Object[] objArr = this.f136101d;
                C17542s.g(objArr);
                return new C16025i(objArr, i10);
            }
            Object[] objArr2 = this.f136101d;
            C17542s.g(objArr2);
            return new C16027k(objArr2, i10, X10, i11 / 5);
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Object[] D(Object[] objArr) {
        if (objArr == null) {
            return F();
        }
        if (B(objArr)) {
            return objArr;
        }
        return C16870n.r(objArr, F(), 0, 0, C17978n.i(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] E(Object[] objArr, int i10) {
        return B(objArr) ? C16870n.n(objArr, objArr, i10, 0, 32 - i10) : C16870n.n(objArr, F(), i10, 0, 32 - i10);
    }

    private final Object[] F() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f136100c;
        return objArr;
    }

    private final Object[] G(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f136100c;
        return objArr;
    }

    private final Object[] H(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i11 == 0) {
            return objArr;
        } else {
            int a10 = C16028l.a(i10, i11);
            Object[] objArr2 = objArr[a10];
            C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object H10 = H(objArr2, i10, i11 - 5);
            if (a10 < 31) {
                int i12 = a10 + 1;
                if (objArr[i12] != null) {
                    if (B(objArr)) {
                        C16870n.x(objArr, null, i12, 32);
                    }
                    objArr = C16870n.n(objArr, F(), 0, 0, i12);
                }
            }
            if (H10 == objArr[a10]) {
                return objArr;
            }
            Object[] D10 = D(objArr);
            D10[a10] = H10;
            return D10;
        }
    }

    private final Object[] I(Object[] objArr, int i10, int i11, C16020d dVar) {
        Object[] objArr2;
        int a10 = C16028l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a10];
            C17542s.h(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = I(objArr3, i10 - 5, i11, dVar);
        }
        if (objArr2 == null && a10 == 0) {
            return null;
        }
        Object[] D10 = D(objArr);
        D10[a10] = objArr2;
        return D10;
    }

    private final void J(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            Z((Object[]) null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            a0(objArr);
            this.f136103f = i10;
            this.f136098a = i11;
            return;
        }
        C16020d dVar = new C16020d((Object) null);
        C17542s.g(objArr);
        Object[] I10 = I(objArr, i11, i10, dVar);
        C17542s.g(I10);
        Object a10 = dVar.a();
        C17542s.h(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        a0((Object[]) a10);
        this.f136103f = i10;
        if (I10[1] == null) {
            Z((Object[]) I10[0]);
            this.f136098a = i11 - 5;
            return;
        }
        Z(I10);
        this.f136098a = i11;
    }

    private final Object[] K(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        } else if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i11 == 0) {
            return it.next();
        } else {
            Object[] D10 = D(objArr);
            int a10 = C16028l.a(i10, i11);
            int i12 = i11 - 5;
            D10[a10] = K((Object[]) D10[a10], i10, i12, it);
            while (true) {
                a10++;
                if (a10 >= 32 || !it.hasNext()) {
                    return D10;
                }
                D10[a10] = K((Object[]) D10[a10], 0, i12, it);
            }
            return D10;
        }
    }

    private final Object[] L(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator a10 = C17527c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f136098a;
        Object[] K10 = i11 < (1 << i12) ? K(objArr, i10, i12, a10) : D(objArr);
        while (a10.hasNext()) {
            this.f136098a += 5;
            K10 = G(K10);
            int i13 = this.f136098a;
            K(K10, 1 << i13, i13, a10);
        }
        return K10;
    }

    private final void M(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f136098a;
        if (size > (1 << i10)) {
            Z(O(G(objArr), objArr2, this.f136098a + 5));
            a0(objArr3);
            this.f136098a += 5;
            this.f136103f = size() + 1;
        } else if (objArr == null) {
            Z(objArr2);
            a0(objArr3);
            this.f136103f = size() + 1;
        } else {
            Z(O(objArr, objArr2, i10));
            a0(objArr3);
            this.f136103f = size() + 1;
        }
    }

    private final Object[] O(Object[] objArr, Object[] objArr2, int i10) {
        int a10 = C16028l.a(size() - 1, i10);
        Object[] D10 = D(objArr);
        if (i10 == 5) {
            D10[a10] = objArr2;
        } else {
            D10[a10] = O((Object[]) D10[a10], objArr2, i10 - 5);
        }
        return D10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int P(nI.C17642l<? super E, java.lang.Boolean> r7, java.lang.Object[] r8, int r9, int r10, LJ.C16020d r11, java.util.List<java.lang.Object[]> r12, java.util.List<java.lang.Object[]> r13) {
        /*
            r6 = this;
            boolean r0 = r6.B(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.a()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0017:
            if (r2 >= r9) goto L_0x0050
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004d
            r5 = 32
            if (r10 != r5) goto L_0x0048
            r10 = r12
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0042
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L_0x0040:
            r3 = r10
            goto L_0x0047
        L_0x0042:
            java.lang.Object[] r10 = r6.F()
            goto L_0x0040
        L_0x0047:
            r10 = r1
        L_0x0048:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0050:
            r11.b(r3)
            java.lang.Object r7 = r11.a()
            if (r0 == r7) goto L_0x005c
            r13.add(r0)
        L_0x005c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: LJ.C16022f.P(nI.l, java.lang.Object[], int, int, LJ.d, java.util.List, java.util.List):int");
    }

    private final int Q(C17642l<? super E, Boolean> lVar, Object[] objArr, int i10, C16020d dVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArr2 = D(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr2);
        return i11;
    }

    private final boolean R(C17642l<? super E, Boolean> lVar) {
        Object[] objArr;
        C17642l<? super E, Boolean> lVar2 = lVar;
        int d02 = d0();
        C16020d dVar = new C16020d((Object) null);
        if (this.f136101d == null) {
            return S(lVar2, d02, dVar) != d02;
        }
        ListIterator<Object[]> C10 = C(0);
        int i10 = 32;
        while (i10 == 32 && C10.hasNext()) {
            i10 = Q(lVar2, C10.next(), 32, dVar);
        }
        if (i10 == 32) {
            C16207a.a(!C10.hasNext());
            int S10 = S(lVar2, d02, dVar);
            if (S10 == 0) {
                J(this.f136101d, size(), this.f136098a);
            }
            return S10 != d02;
        }
        int previousIndex = C10.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = i10;
        while (C10.hasNext()) {
            i11 = P(lVar, C10.next(), 32, i11, dVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i12 = previousIndex;
        int P10 = P(lVar, this.f136102e, d02, i11, dVar, arrayList2, arrayList);
        Object a10 = dVar.a();
        C17542s.h(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        C16870n.x(objArr2, null, P10, 32);
        if (arrayList.isEmpty()) {
            objArr = this.f136101d;
            C17542s.g(objArr);
        } else {
            objArr = K(this.f136101d, i12, this.f136098a, arrayList.iterator());
        }
        int size = i12 + (arrayList.size() << 5);
        Z(W(objArr, size));
        a0(objArr2);
        this.f136103f = size + P10;
        return true;
    }

    private final int S(C17642l<? super E, Boolean> lVar, int i10, C16020d dVar) {
        int Q10 = Q(lVar, this.f136102e, i10, dVar);
        if (Q10 == i10) {
            C16207a.a(dVar.a() == this.f136102e);
            return i10;
        }
        Object a10 = dVar.a();
        C17542s.h(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        C16870n.x(objArr, null, Q10, i10);
        a0(objArr);
        this.f136103f = size() - (i10 - Q10);
        return Q10;
    }

    private final Object[] U(Object[] objArr, int i10, int i11, C16020d dVar) {
        int a10 = C16028l.a(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            Object obj = objArr[a10];
            Object[] n10 = C16870n.n(objArr, D(objArr), a10, a10 + 1, 32);
            n10[31] = dVar.a();
            dVar.b(obj);
            return n10;
        }
        if (objArr[31] == null) {
            i12 = C16028l.a(X() - 1, i10);
        }
        Object[] D10 = D(objArr);
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj2 = D10[i12];
                C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                D10[i12] = U((Object[]) obj2, i13, 0, dVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj3 = D10[a10];
        C17542s.h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        D10[a10] = U((Object[]) obj3, i13, i11, dVar);
        return D10;
    }

    private final Object V(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        C16207a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f136102e[0];
            J(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f136102e;
        Object obj2 = objArr2[i12];
        Object[] n10 = C16870n.n(objArr2, D(objArr2), i12, i12 + 1, size);
        n10[size - 1] = null;
        Z(objArr);
        a0(n10);
        this.f136103f = (i10 + size) - 1;
        this.f136098a = i11;
        return obj2;
    }

    private final Object[] W(Object[] objArr, int i10) {
        if ((i10 & 31) != 0) {
            throw new IllegalStateException("Check failed.");
        } else if (i10 == 0) {
            this.f136098a = 0;
            return null;
        } else {
            int i11 = i10 - 1;
            while (true) {
                int i12 = this.f136098a;
                if ((i11 >> i12) != 0) {
                    return H(objArr, i11, i12);
                }
                this.f136098a = i12 - 5;
                Object[] objArr2 = objArr[0];
                C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    private final int X() {
        if (size() <= 32) {
            return 0;
        }
        return C16028l.d(size());
    }

    private final Object[] Y(Object[] objArr, int i10, int i11, E e10, C16020d dVar) {
        int a10 = C16028l.a(i11, i10);
        Object[] D10 = D(objArr);
        if (i10 == 0) {
            if (D10 != objArr) {
                this.modCount++;
            }
            dVar.b(D10[a10]);
            D10[a10] = e10;
            return D10;
        }
        Object obj = D10[a10];
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        D10[a10] = Y((Object[]) obj, i10 - 5, i11, e10, dVar);
        return D10;
    }

    private final void Z(Object[] objArr) {
        if (objArr != this.f136101d) {
            this.f136099b = null;
            this.f136101d = objArr;
        }
    }

    private final void a0(Object[] objArr) {
        if (objArr != this.f136102e) {
            this.f136099b = null;
            this.f136102e = objArr;
        }
    }

    private final Object[] b0(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f136101d != null) {
            ListIterator<Object[]> C10 = C(X() >> 5);
            while (C10.previousIndex() != i10) {
                Object[] previous = C10.previous();
                C16870n.n(previous, objArr2, 0, 32 - i11, 32);
                objArr2 = E(previous, i11);
                i12--;
                objArr[i12] = objArr2;
            }
            return C10.previous();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void c0(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArr4;
        if (i12 >= 1) {
            Object[] D10 = D(objArr);
            objArr2[0] = D10;
            int i13 = i10 & 31;
            int size = ((i10 + collection.size()) - 1) & 31;
            int i14 = (i11 - i13) + size;
            if (i14 < 32) {
                C16870n.n(D10, objArr3, size + 1, i13, i11);
            } else {
                int i15 = i14 - 31;
                if (i12 == 1) {
                    objArr4 = D10;
                } else {
                    objArr4 = F();
                    i12--;
                    objArr2[i12] = objArr4;
                }
                int i16 = i11 - i15;
                C16870n.n(D10, objArr3, 0, i16, i11);
                C16870n.n(D10, objArr4, size + 1, i13, i16);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it = collection.iterator();
            k(D10, i13, it);
            for (int i17 = 1; i17 < i12; i17++) {
                objArr2[i17] = k(F(), 0, it);
            }
            k(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final int d0() {
        return g0(size());
    }

    private final int g0(int i10) {
        return i10 <= 32 ? i10 : i10 - C16028l.d(i10);
    }

    private final Object[] i(int i10) {
        if (X() <= i10) {
            return this.f136102e;
        }
        Object[] objArr = this.f136101d;
        C17542s.g(objArr);
        for (int i11 = this.f136098a; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[C16028l.a(i10, i11)];
            C17542s.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] k(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final void t(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f136101d != null) {
            int i13 = i10 >> 5;
            Object[] b02 = b0(i13, i11, objArr, i12, objArr2);
            int X10 = i12 - (((X() >> 5) - 1) - i13);
            if (X10 < i12) {
                objArr2 = objArr[X10];
                C17542s.g(objArr2);
            }
            c0(collection, i10, b02, 32, objArr, X10, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final Object[] x(Object[] objArr, int i10, int i11, Object obj, C16020d dVar) {
        Object obj2;
        int a10 = C16028l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            Object[] n10 = C16870n.n(objArr, D(objArr), a10 + 1, a10, 31);
            n10[a10] = obj;
            return n10;
        }
        Object[] D10 = D(objArr);
        int i12 = i10 - 5;
        Object obj3 = D10[a10];
        C17542s.h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        D10[a10] = x((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            a10++;
            if (a10 >= 32 || (obj2 = D10[a10]) == null) {
                return D10;
            }
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            D10[a10] = x((Object[]) obj2, i12, 0, dVar.a(), dVar);
        }
        return D10;
    }

    public final boolean T(C17642l<? super E, Boolean> lVar) {
        C17542s.j(lVar, "predicate");
        boolean R10 = R(lVar);
        if (R10) {
            this.modCount++;
        }
        return R10;
    }

    public int a() {
        return this.f136103f;
    }

    public boolean add(E e10) {
        this.modCount++;
        int d02 = d0();
        if (d02 < 32) {
            Object[] D10 = D(this.f136102e);
            D10[d02] = e10;
            a0(D10);
            this.f136103f = size() + 1;
        } else {
            M(this.f136101d, this.f136102e, G(e10));
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int d02 = d0();
        Iterator<? extends E> it = collection.iterator();
        if (32 - d02 >= collection.size()) {
            a0(k(D(this.f136102e), d02, it));
            this.f136103f = size() + collection.size();
        } else {
            int size = ((collection.size() + d02) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = k(D(this.f136102e), d02, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = k(F(), 0, it);
            }
            Z(L(this.f136101d, X(), objArr));
            a0(k(F(), 0, it));
            this.f136103f = size() + collection.size();
        }
        return true;
    }

    public E b(int i10) {
        C16210d.a(i10, size());
        this.modCount++;
        int X10 = X();
        if (i10 >= X10) {
            return V(this.f136101d, X10, this.f136098a, i10 - X10);
        }
        C16020d dVar = new C16020d(this.f136102e[0]);
        Object[] objArr = this.f136101d;
        C17542s.g(objArr);
        V(U(objArr, this.f136098a, i10, dVar), X10, this.f136098a, 0);
        return dVar.a();
    }

    public C15990f<E> g() {
        C15990f<? extends E> fVar = this.f136099b;
        if (fVar == null) {
            Object[] objArr = this.f136101d;
            Object[] objArr2 = this.f136102e;
            this.f136100c = new f();
            if (objArr != null) {
                fVar = new C16021e<>(objArr, objArr2, size(), this.f136098a);
            } else if (objArr2.length == 0) {
                fVar = C16028l.b();
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, size());
                C17542s.i(copyOf, "copyOf(...)");
                fVar = new C16026j<>(copyOf);
            }
            this.f136099b = fVar;
        }
        return fVar;
    }

    public E get(int i10) {
        C16210d.a(i10, size());
        return i(i10)[i10 & 31];
    }

    public Iterator<E> iterator() {
        return listIterator();
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final int m() {
        return this.modCount;
    }

    public final Object[] p() {
        return this.f136101d;
    }

    public final int q() {
        return this.f136098a;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        return T(new a(collection));
    }

    public final Object[] s() {
        return this.f136102e;
    }

    public E set(int i10, E e10) {
        C16210d.a(i10, size());
        if (X() <= i10) {
            E[] D10 = D(this.f136102e);
            if (D10 != this.f136102e) {
                this.modCount++;
            }
            int i11 = i10 & 31;
            E e11 = D10[i11];
            D10[i11] = e10;
            a0(D10);
            return e11;
        }
        C16020d dVar = new C16020d((Object) null);
        Object[] objArr = this.f136101d;
        C17542s.g(objArr);
        Z(Y(objArr, this.f136098a, i10, e10, dVar));
        return dVar.a();
    }

    public ListIterator<E> listIterator(int i10) {
        C16210d.b(i10, size());
        return new C16024h(this, i10);
    }

    public void add(int i10, E e10) {
        C16210d.b(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        this.modCount++;
        int X10 = X();
        if (i10 >= X10) {
            A(this.f136101d, i10 - X10, e10);
            return;
        }
        C16020d dVar = new C16020d((Object) null);
        Object[] objArr = this.f136101d;
        C17542s.g(objArr);
        A(x(objArr, this.f136098a, i10, e10, dVar), 0, dVar.a());
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] objArr;
        C17542s.j(collection, "elements");
        C16210d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            if (i10 >= X()) {
                z10 = true;
            }
            C16207a.a(z10);
            int i12 = i10 & 31;
            Object[] objArr2 = this.f136102e;
            Object[] n10 = C16870n.n(objArr2, D(objArr2), (((i10 + collection.size()) - 1) & 31) + 1, i12, d0());
            k(n10, i12, collection.iterator());
            a0(n10);
            this.f136103f = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int d02 = d0();
        int g02 = g0(size() + collection.size());
        if (i10 >= X()) {
            objArr = F();
            c0(collection, i10, this.f136102e, d02, objArr3, size, objArr);
        } else if (g02 > d02) {
            int i13 = g02 - d02;
            objArr = E(this.f136102e, i13);
            t(collection, i10, i13, objArr3, size, objArr);
        } else {
            int i14 = d02 - g02;
            objArr = C16870n.n(this.f136102e, F(), 0, i14, d02);
            int i15 = 32 - i14;
            Object[] E10 = E(this.f136102e, i15);
            int i16 = size - 1;
            objArr3[i16] = E10;
            t(collection, i10, i15, objArr3, i16, E10);
        }
        Z(L(this.f136101d, i11, objArr3));
        a0(objArr);
        this.f136103f = size() + collection.size();
        return true;
    }
}
