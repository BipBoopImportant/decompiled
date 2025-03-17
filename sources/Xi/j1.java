package xI;

import CI.C15496c;
import DI.C15538I;
import DI.C15554a;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import DI.C15573t;
import DI.C15574u;
import DI.d0;
import DI.i0;
import EI.C15642a;
import EI.C15644c;
import EI.C15649h;
import HJ.C15854t;
import II.C15893b;
import II.C15896e;
import II.C15897f;
import II.C15902k;
import II.C15903l;
import JI.C15965f;
import JI.C15966g;
import JI.q;
import JI.u;
import VI.C16692x;
import VI.C16694z;
import XH.C16796C;
import XH.t;
import XH.v;
import XI.i;
import XI.n;
import XI.s;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import ZI.C17004a;
import ZI.c;
import ZI.g;
import ZI.h;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import eJ.C17206q;
import gJ.C17280k;
import iJ.C17367a;
import iJ.C17368b;
import iJ.C17373g;
import iJ.C17377k;
import iJ.C17378l;
import iJ.C17386t;
import iJ.C17388v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17539o;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.S;
import mI.C17603a;
import nI.p;
import qJ.C17798K;
import qJ.C17810X;
import qJ.C17826n;
import qJ.C17828p;
import sJ.C17942s;
import uI.C18068q;
import uI.C18072u;
import uJ.C18096U;
import yI.C18722f;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001ai\u0010I\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bI\u0010J\"\u001a\u0010O\u001a\u00020K8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010L\u001a\u0004\bM\u0010N\"\u0018\u0010T\u001a\u00020Q*\u00020P8@X\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S\"\u0018\u0010V\u001a\u00020Q*\u00020P8@X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010S\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u00020<8@X\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0002\u0007\n\u0005\b20\u0001¨\u0006["}, d2 = {"LDI/e;", "Ljava/lang/Class;", "q", "(LDI/e;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "LcJ/b;", "kotlinClassId", "", "arrayDimensions", "m", "(Ljava/lang/ClassLoader;LcJ/b;I)Ljava/lang/Class;", "", "packageName", "className", "n", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "LDI/u;", "LuI/u;", "r", "(LDI/u;)LuI/u;", "LEI/a;", "", "", "e", "(LEI/a;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "LEI/c;", "p", "(LEI/c;)Ljava/lang/annotation/Annotation;", "LiJ/g;", "", "s", "(LiJ/g;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "LiJ/b;", "a", "(LiJ/b;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "LxI/i0;", "c", "(Ljava/lang/Object;)LxI/i0;", "LxI/K0;", "d", "(Ljava/lang/Object;)LxI/K0;", "LxI/A;", "b", "(Ljava/lang/Object;)LxI/A;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(LnI/a;)Ljava/lang/Object;", "LeJ/q;", "M", "LDI/a;", "D", "moduleAnchor", "proto", "LZI/c;", "nameResolver", "LZI/g;", "typeTable", "LZI/a;", "metadataVersion", "Lkotlin/Function2;", "LqJ/K;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;LnI/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "LcJ/c;", "LcJ/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "LuI/q;", "", "l", "(LuI/q;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "LDI/d0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private static final C17066c f152429a = new C17066c("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f152430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                AI.m[] r0 = AI.C15432m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AI.m r1 = AI.C15432m.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                AI.m r1 = AI.C15432m.CHAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                AI.m r1 = AI.C15432m.BYTE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                AI.m r1 = AI.C15432m.SHORT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                AI.m r1 = AI.C15432m.INT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                AI.m r1 = AI.C15432m.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                AI.m r1 = AI.C15432m.LONG     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                AI.m r1 = AI.C15432m.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f152430a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xI.j1.a.<clinit>():void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], char[], byte[], short[]], vars: [r7v10 ?, r7v1 ?, r7v11 ?, r7v12 ?, r7v13 ?, r7v14 ?, r7v15 ?, r7v16 ?, r7v17 ?, r7v18 ?, r7v19 ?, r7v20 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    private static final java.lang.Object a(iJ.C17368b r6, java.lang.ClassLoader r7) {
        /*
            boolean r0 = r6 instanceof iJ.C17361A
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r6
            iJ.A r0 = (iJ.C17361A) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x0241
            uJ.U r0 = r0.e()
            if (r0 != 0) goto L_0x0014
            goto L_0x0241
        L_0x0014:
            java.lang.Object r2 = r6.b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r2.next()
            iJ.g r4 = (iJ.C17373g) r4
            java.lang.Object r4 = s(r4, r7)
            r3.add(r4)
            goto L_0x0029
        L_0x003d:
            AI.m r2 = AI.C15429j.O(r0)
            if (r2 != 0) goto L_0x0045
            r2 = -1
            goto L_0x004d
        L_0x0045:
            int[] r4 = xI.j1.a.f152430a
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x004d:
            r4 = 0
            switch(r2) {
                case -1: goto L_0x0167;
                case 0: goto L_0x0051;
                case 1: goto L_0x0145;
                case 2: goto L_0x0123;
                case 3: goto L_0x0101;
                case 4: goto L_0x00df;
                case 5: goto L_0x00bd;
                case 6: goto L_0x009b;
                case 7: goto L_0x0079;
                case 8: goto L_0x0057;
                default: goto L_0x0051;
            }
        L_0x0051:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0057:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            double[] r7 = new double[r6]
        L_0x0063:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0079:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            long[] r7 = new long[r6]
        L_0x0085:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0085
        L_0x009b:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float[] r7 = new float[r6]
        L_0x00a7:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00bd:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int[] r7 = new int[r6]
        L_0x00c9:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00c9
        L_0x00df:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            short[] r7 = new short[r6]
        L_0x00eb:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0101:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            byte[] r7 = new byte[r6]
        L_0x010d:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0123:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            char[] r7 = new char[r6]
        L_0x012f:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x012f
        L_0x0145:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            boolean[] r7 = new boolean[r6]
        L_0x0151:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0151
        L_0x0167:
            boolean r2 = AI.C15429j.d0(r0)
            if (r2 == 0) goto L_0x0226
            java.util.List r0 = r0.L0()
            java.lang.Object r0 = YH.C16877v.b1(r0)
            uJ.E0 r0 = (uJ.E0) r0
            uJ.U r0 = r0.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            uJ.y0 r2 = r0.N0()
            DI.h r2 = r2.e()
            boolean r5 = r2 instanceof DI.C15558e
            if (r5 == 0) goto L_0x018f
            DI.e r2 = (DI.C15558e) r2
            goto L_0x0190
        L_0x018f:
            r2 = r1
        L_0x0190:
            if (r2 == 0) goto L_0x020b
            boolean r0 = AI.C15429j.w0(r0)
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x01a4:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01b4:
            boolean r0 = AI.C15429j.m0(r2)
            if (r0 == 0) goto L_0x01d6
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Class[] r7 = new java.lang.Class[r6]
        L_0x01c6:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01c6
        L_0x01d6:
            cJ.b r0 = kJ.C17506e.n(r2)
            if (r0 == 0) goto L_0x020a
            r2 = 4
            java.lang.Class r7 = o(r7, r0, r4, r2, r1)
            if (r7 != 0) goto L_0x01e4
            goto L_0x020a
        L_0x01e4:
            java.lang.Object r6 = r6.b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>"
            kotlin.jvm.internal.C17542s.h(r6, r7)
            r7 = r6
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r3.size()
        L_0x01fe:
            if (r4 >= r6) goto L_0x0209
            java.lang.Object r0 = r3.get(r4)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01fe
        L_0x0209:
            return r7
        L_0x020a:
            return r1
        L_0x020b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Not a class type: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0226:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not an array type: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L_0x0241:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.j1.a(iJ.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final C18599A<?> b(Object obj) {
        C18599A<?> a10 = obj instanceof C18599A ? (C18599A) obj : null;
        if (a10 != null) {
            return a10;
        }
        C18639i0 c10 = c(obj);
        return c10 != null ? c10 : d(obj);
    }

    public static final C18639i0 c(Object obj) {
        C18639i0 i0Var = obj instanceof C18639i0 ? (C18639i0) obj : null;
        if (i0Var != null) {
            return i0Var;
        }
        C17539o oVar = obj instanceof C17539o ? (C17539o) obj : null;
        Object compute = oVar != null ? oVar.compute() : null;
        if (compute instanceof C18639i0) {
            return (C18639i0) compute;
        }
        return null;
    }

    public static final K0<?> d(Object obj) {
        K0<?> k02 = obj instanceof K0 ? (K0) obj : null;
        if (k02 != null) {
            return k02;
        }
        J j10 = obj instanceof J ? (J) obj : null;
        Object compute = j10 != null ? j10.compute() : null;
        if (compute instanceof K0) {
            return (K0) compute;
        }
        return null;
    }

    public static final List<Annotation> e(C15642a aVar) {
        Annotation annotation;
        C17542s.j(aVar, "<this>");
        C15649h<C15644c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (C15644c cVar : annotations) {
            i0 i10 = cVar.i();
            if (i10 instanceof C15893b) {
                annotation = ((C15893b) i10).d();
            } else if (i10 instanceof C15903l.a) {
                u d10 = ((C15903l.a) i10).c();
                C15966g gVar = d10 instanceof C15966g ? (C15966g) d10 : null;
                annotation = gVar != null ? gVar.R() : null;
            } else {
                annotation = p(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return t(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        C17542s.j(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        C17542s.j(type, "type");
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (C17542s.e(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (C17542s.e(cls, Character.TYPE)) {
                    return 0;
                }
                if (C17542s.e(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (C17542s.e(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (C17542s.e(cls, Integer.TYPE)) {
                    return 0;
                }
                if (C17542s.e(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (C17542s.e(cls, Long.TYPE)) {
                    return 0L;
                }
                if (C17542s.e(cls, Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (C17542s.e(cls, Void.TYPE)) {
                    throw new IllegalStateException("Parameter with void type is illegal");
                }
                throw new UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    public static final <M extends C17206q, D extends C15554a> D h(Class<?> cls, M m10, c cVar, g gVar, C17004a aVar, p<? super C17798K, ? super M, ? extends D> pVar) {
        List<s> h02;
        M m11 = m10;
        p<? super C17798K, ? super M, ? extends D> pVar2 = pVar;
        Class<?> cls2 = cls;
        C17542s.j(cls, "moduleAnchor");
        C17542s.j(m10, "proto");
        C17542s.j(cVar, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17542s.j(aVar, "metadataVersion");
        C17542s.j(pVar2, "createDescriptor");
        C15902k a10 = Z0.a(cls);
        if (m11 instanceof i) {
            h02 = ((i) m11).g0();
        } else if (m11 instanceof n) {
            h02 = ((n) m11).h0();
        } else {
            throw new IllegalStateException(("Unsupported message: " + m10).toString());
        }
        List<s> list = h02;
        C17826n a11 = a10.a();
        C15538I b10 = a10.b();
        h b11 = h.f140844b.b();
        C17542s.g(list);
        return (C15554a) pVar2.invoke(new C17798K(new C17828p(a11, cVar, b10, gVar, b11, aVar, (C17942s) null, (C17810X) null, list)), m10);
    }

    public static final d0 i(C15554a aVar) {
        C17542s.j(aVar, "<this>");
        if (aVar.L() == null) {
            return null;
        }
        C15566m b10 = aVar.b();
        C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((C15558e) b10).J0();
    }

    public static final C17066c j() {
        return f152429a;
    }

    public static final boolean k(C18068q qVar) {
        C18096U F10;
        C17542s.j(qVar, "<this>");
        U0 u02 = qVar instanceof U0 ? (U0) qVar : null;
        return (u02 == null || (F10 = u02.F()) == null || !C17280k.i(F10)) ? false : true;
    }

    public static final boolean l(C18068q qVar) {
        C18096U F10;
        C17542s.j(qVar, "<this>");
        U0 u02 = qVar instanceof U0 ? (U0) qVar : null;
        return (u02 == null || (F10 = u02.F()) == null || !C17280k.c(F10)) ? false : true;
    }

    private static final Class<?> m(ClassLoader classLoader, C17065b bVar, int i10) {
        C17065b n10 = C15496c.f133492a.n(bVar.a().i());
        if (n10 != null) {
            bVar = n10;
        }
        return n(classLoader, bVar.f().a(), bVar.g().a(), i10);
    }

    private static final Class<?> n(ClassLoader classLoader, String str, String str2, int i10) {
        if (C17542s.e(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(C15854t.P(str2, '.', '$', false, 4, (Object) null));
        if (i10 > 0) {
            sb2.append(";");
        }
        return C15896e.a(classLoader, sb2.toString());
    }

    static /* synthetic */ Class o(ClassLoader classLoader, C17065b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    private static final Annotation p(C15644c cVar) {
        C15558e l10 = C17506e.l(cVar);
        Class<?> q10 = l10 != null ? q(l10) : null;
        if (q10 == null) {
            q10 = null;
        }
        if (q10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.a().entrySet()) {
            C17069f fVar = (C17069f) entry.getKey();
            ClassLoader classLoader = q10.getClassLoader();
            C17542s.i(classLoader, "getClassLoader(...)");
            Object s10 = s((C17373g) entry.getValue(), classLoader);
            v a10 = s10 != null ? C16796C.a(fVar.b(), s10) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return (Annotation) C18722f.h(q10, X.v(arrayList), (List) null, 4, (Object) null);
    }

    public static final Class<?> q(C15558e eVar) {
        C17542s.j(eVar, "<this>");
        i0 i10 = eVar.i();
        C17542s.i(i10, "getSource(...)");
        if (i10 instanceof C16694z) {
            C16692x d10 = ((C16694z) i10).d();
            C17542s.h(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C15897f) d10).e();
        } else if (i10 instanceof C15903l.a) {
            u d11 = ((C15903l.a) i10).c();
            C17542s.h(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((q) d11).s();
        } else {
            C17065b n10 = C17506e.n(eVar);
            if (n10 == null) {
                return null;
            }
            return m(C15965f.j(eVar.getClass()), n10, 0);
        }
    }

    public static final C18072u r(C15574u uVar) {
        C17542s.j(uVar, "<this>");
        if (C17542s.e(uVar, C15573t.f133853e)) {
            return C18072u.PUBLIC;
        }
        if (C17542s.e(uVar, C15573t.f133851c)) {
            return C18072u.PROTECTED;
        }
        if (C17542s.e(uVar, C15573t.f133852d)) {
            return C18072u.INTERNAL;
        }
        if (C17542s.e(uVar, C15573t.f133849a) || C17542s.e(uVar, C15573t.f133850b)) {
            return C18072u.PRIVATE;
        }
        return null;
    }

    private static final Object s(C17373g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof C17367a) {
            return p((C15644c) ((C17367a) gVar).b());
        }
        if (gVar instanceof C17368b) {
            return a((C17368b) gVar, classLoader);
        }
        if (gVar instanceof C17377k) {
            v vVar = (v) ((C17377k) gVar).b();
            C17069f fVar = (C17069f) vVar.b();
            Class o10 = o(classLoader, (C17065b) vVar.a(), 0, 4, (Object) null);
            if (o10 != null) {
                return i1.a(o10, fVar.b());
            }
        } else if (gVar instanceof C17386t) {
            C17386t.b bVar = (C17386t.b) ((C17386t) gVar).b();
            if (bVar instanceof C17386t.b.C3505b) {
                C17386t.b.C3505b bVar2 = (C17386t.b.C3505b) bVar;
                return m(classLoader, bVar2.b(), bVar2.a());
            } else if (bVar instanceof C17386t.b.a) {
                C15561h e10 = ((C17386t.b.a) bVar).a().N0().e();
                C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
                if (eVar != null) {
                    return q(eVar);
                }
            } else {
                throw new t();
            }
        } else if (!(gVar instanceof C17378l) && !(gVar instanceof C17388v)) {
            return gVar.b();
        }
        return null;
    }

    private static final List<Annotation> t(List<? extends Annotation> list) {
        List list2;
        Iterable<Annotation> iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C17542s.e(C17603a.b(C17603a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                    list = new ArrayList<>();
                    for (Annotation annotation : iterable) {
                        Class b10 = C17603a.b(C17603a.a(annotation));
                        if (!C17542s.e(b10.getSimpleName(), "Container") || b10.getAnnotation(S.class) == null) {
                            list2 = C16877v.e(annotation);
                        } else {
                            Object invoke = b10.getDeclaredMethod("value", (Class[]) null).invoke(annotation, (Object[]) null);
                            C17542s.h(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            list2 = C16870n.f((Annotation[]) invoke);
                        }
                        C16877v.E(list, list2);
                    }
                }
            }
        }
        return list;
    }
}
