package androidx.work;

import YH.C16870n;
import YH.C16877v;
import jI.C17416c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 '2\u00020\u0001:\u0002\"'B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\n\"\u0004\b\u0000\u0010\u00162\u0006\u0010\t\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001f\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/work/f;", "", "other", "<init>", "(Landroidx/work/f;)V", "", "", "values", "(Ljava/util/Map;)V", "key", "", "defaultValue", "c", "(Ljava/lang/String;Z)Z", "", "d", "(Ljava/lang/String;I)I", "", "f", "(Ljava/lang/String;J)J", "g", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Ljava/lang/Class;", "klass", "h", "(Ljava/lang/String;Ljava/lang/Class;)Z", "i", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "keyValueMap", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.f  reason: case insensitive filesystem */
public final class C7037f {

    /* renamed from: b  reason: collision with root package name */
    public static final b f45196b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C7037f f45197c = new a().a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f45198a;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00002\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\bJ\r\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Landroidx/work/f$a;", "", "<init>", "()V", "", "key", "value", "f", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/f$a;", "", "e", "(Ljava/lang/String;Z)Landroidx/work/f$a;", "", "g", "(Ljava/lang/String;I)Landroidx/work/f$a;", "", "h", "(Ljava/lang/String;J)Landroidx/work/f$a;", "i", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/f$a;", "Landroidx/work/f;", "data", "c", "(Landroidx/work/f;)Landroidx/work/f$a;", "", "values", "d", "(Ljava/util/Map;)Landroidx/work/f$a;", "b", "a", "()Landroidx/work/f;", "", "Ljava/util/Map;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Object> f45199a = new LinkedHashMap();

        private final a f(String str, Object obj) {
            this.f45199a.put(str, obj);
            return this;
        }

        public final C7037f a() {
            C7037f fVar = new C7037f((Map<String, ?>) this.f45199a);
            C7037f.f45196b.e(fVar);
            return fVar;
        }

        public final a b(String str, Object obj) {
            C17542s.j(str, "key");
            Map<String, Object> map = this.f45199a;
            if (obj == null) {
                obj = null;
            } else {
                C18055d b10 = P.b(obj.getClass());
                boolean z10 = true;
                if (!(C17542s.e(b10, P.b(Boolean.TYPE)) ? true : C17542s.e(b10, P.b(Byte.TYPE)) ? true : C17542s.e(b10, P.b(Integer.TYPE)) ? true : C17542s.e(b10, P.b(Long.TYPE)) ? true : C17542s.e(b10, P.b(Float.TYPE)) ? true : C17542s.e(b10, P.b(Double.TYPE)) ? true : C17542s.e(b10, P.b(String.class)) ? true : C17542s.e(b10, P.b(Boolean[].class)) ? true : C17542s.e(b10, P.b(Byte[].class)) ? true : C17542s.e(b10, P.b(Integer[].class)) ? true : C17542s.e(b10, P.b(Long[].class)) ? true : C17542s.e(b10, P.b(Float[].class)) ? true : C17542s.e(b10, P.b(Double[].class)))) {
                    z10 = C17542s.e(b10, P.b(String[].class));
                }
                if (!z10) {
                    if (C17542s.e(b10, P.b(boolean[].class))) {
                        obj = C7038g.h((boolean[]) obj);
                    } else if (C17542s.e(b10, P.b(byte[].class))) {
                        obj = C7038g.i((byte[]) obj);
                    } else if (C17542s.e(b10, P.b(int[].class))) {
                        obj = C7038g.l((int[]) obj);
                    } else if (C17542s.e(b10, P.b(long[].class))) {
                        obj = C7038g.m((long[]) obj);
                    } else if (C17542s.e(b10, P.b(float[].class))) {
                        obj = C7038g.k((float[]) obj);
                    } else if (C17542s.e(b10, P.b(double[].class))) {
                        obj = C7038g.j((double[]) obj);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + b10);
                    }
                }
            }
            map.put(str, obj);
            return this;
        }

        public final a c(C7037f fVar) {
            C17542s.j(fVar, "data");
            d(fVar.f45198a);
            return this;
        }

        public final a d(Map<String, ? extends Object> map) {
            C17542s.j(map, "values");
            for (Map.Entry next : map.entrySet()) {
                b((String) next.getKey(), next.getValue());
            }
            return this;
        }

        public final a e(String str, boolean z10) {
            C17542s.j(str, "key");
            return f(str, Boolean.valueOf(z10));
        }

        public final a g(String str, int i10) {
            C17542s.j(str, "key");
            return f(str, Integer.valueOf(i10));
        }

        public final a h(String str, long j10) {
            C17542s.j(str, "key");
            return f(str, Long.valueOf(j10));
        }

        public final a i(String str, String str2) {
            C17542s.j(str, "key");
            return f(str, str2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u0014\u0010 \u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00188\u0002XT¢\u0006\u0006\n\u0004\b(\u0010\u001a¨\u0006)"}, d2 = {"Landroidx/work/f$b;", "", "<init>", "()V", "Landroidx/work/f;", "data", "", "e", "(Landroidx/work/f;)[B", "bytes", "a", "([B)Landroidx/work/f;", "EMPTY", "Landroidx/work/f;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b10 = (byte) -21267;
            boolean z10 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b10) {
                z10 = true;
            }
            byteArrayInputStream.reset();
            return z10;
        }

        private static final void c(DataInputStream dataInputStream) {
            short readShort = dataInputStream.readShort();
            if (readShort == -21521) {
                short readShort2 = dataInputStream.readShort();
                if (readShort2 != 1) {
                    throw new IllegalStateException(("Unsupported version number: " + readShort2).toString());
                }
                return;
            }
            throw new IllegalStateException(("Magic number doesn't match: " + readShort).toString());
        }

        private static final Object d(DataInputStream dataInputStream, byte b10) {
            if (b10 == 0) {
                return null;
            }
            if (b10 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b10 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b10 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b10 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b10 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b10 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b10 == 7) {
                return dataInputStream.readUTF();
            }
            int i10 = 0;
            if (b10 == 8) {
                int readInt = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[readInt];
                while (i10 < readInt) {
                    boolArr[i10] = Boolean.valueOf(dataInputStream.readBoolean());
                    i10++;
                }
                return boolArr;
            } else if (b10 == 9) {
                int readInt2 = dataInputStream.readInt();
                Byte[] bArr = new Byte[readInt2];
                while (i10 < readInt2) {
                    bArr[i10] = Byte.valueOf(dataInputStream.readByte());
                    i10++;
                }
                return bArr;
            } else if (b10 == 10) {
                int readInt3 = dataInputStream.readInt();
                Integer[] numArr = new Integer[readInt3];
                while (i10 < readInt3) {
                    numArr[i10] = Integer.valueOf(dataInputStream.readInt());
                    i10++;
                }
                return numArr;
            } else if (b10 == 11) {
                int readInt4 = dataInputStream.readInt();
                Long[] lArr = new Long[readInt4];
                while (i10 < readInt4) {
                    lArr[i10] = Long.valueOf(dataInputStream.readLong());
                    i10++;
                }
                return lArr;
            } else if (b10 == 12) {
                int readInt5 = dataInputStream.readInt();
                Float[] fArr = new Float[readInt5];
                while (i10 < readInt5) {
                    fArr[i10] = Float.valueOf(dataInputStream.readFloat());
                    i10++;
                }
                return fArr;
            } else if (b10 == 13) {
                int readInt6 = dataInputStream.readInt();
                Double[] dArr = new Double[readInt6];
                while (i10 < readInt6) {
                    dArr[i10] = Double.valueOf(dataInputStream.readDouble());
                    i10++;
                }
                return dArr;
            } else if (b10 == 14) {
                int readInt7 = dataInputStream.readInt();
                String[] strArr = new String[readInt7];
                while (i10 < readInt7) {
                    String readUTF = dataInputStream.readUTF();
                    if (C17542s.e(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                        readUTF = null;
                    }
                    strArr[i10] = readUTF;
                    i10++;
                }
                return strArr;
            } else {
                throw new IllegalStateException("Unsupported type " + b10);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Float} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Float} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.Byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.lang.Byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r12v0 */
        /* JADX WARNING: type inference failed for: r12v25 */
        /* JADX WARNING: type inference failed for: r12v26 */
        /* JADX WARNING: type inference failed for: r12v27 */
        /* JADX WARNING: type inference failed for: r12v28 */
        /* JADX WARNING: type inference failed for: r12v29 */
        /* JADX WARNING: type inference failed for: r12v30 */
        /* JADX WARNING: type inference failed for: r12v31 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final void f(java.io.DataOutputStream r14, java.lang.Object[] r15) {
            /*
                java.lang.Class r0 = r15.getClass()
                uI.d r0 = kotlin.jvm.internal.P.b(r0)
                java.lang.Class<java.lang.Boolean[]> r1 = java.lang.Boolean[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                r2 = 14
                r3 = 13
                r4 = 12
                r5 = 11
                r6 = 10
                r7 = 9
                r8 = 8
                if (r1 == 0) goto L_0x0024
                r0 = r8
                goto L_0x0077
            L_0x0024:
                java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x0032
                r0 = r7
                goto L_0x0077
            L_0x0032:
                java.lang.Class<java.lang.Integer[]> r1 = java.lang.Integer[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x0040
                r0 = r6
                goto L_0x0077
            L_0x0040:
                java.lang.Class<java.lang.Long[]> r1 = java.lang.Long[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x004e
                r0 = r5
                goto L_0x0077
            L_0x004e:
                java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x005c
                r0 = r4
                goto L_0x0077
            L_0x005c:
                java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r1 == 0) goto L_0x006a
                r0 = r3
                goto L_0x0077
            L_0x006a:
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                uI.d r1 = kotlin.jvm.internal.P.b(r1)
                boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
                if (r0 == 0) goto L_0x011d
                r0 = r2
            L_0x0077:
                r14.writeByte(r0)
                int r1 = r15.length
                r14.writeInt(r1)
                int r1 = r15.length
                r9 = 0
                r10 = r9
            L_0x0081:
                if (r10 >= r1) goto L_0x011c
                r11 = r15[r10]
                r12 = 0
                if (r0 != r8) goto L_0x009c
                boolean r13 = r11 instanceof java.lang.Boolean
                if (r13 == 0) goto L_0x008f
                r12 = r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
            L_0x008f:
                if (r12 == 0) goto L_0x0096
                boolean r11 = r12.booleanValue()
                goto L_0x0097
            L_0x0096:
                r11 = r9
            L_0x0097:
                r14.writeBoolean(r11)
                goto L_0x0118
            L_0x009c:
                if (r0 != r7) goto L_0x00b2
                boolean r13 = r11 instanceof java.lang.Byte
                if (r13 == 0) goto L_0x00a5
                r12 = r11
                java.lang.Byte r12 = (java.lang.Byte) r12
            L_0x00a5:
                if (r12 == 0) goto L_0x00ac
                byte r11 = r12.byteValue()
                goto L_0x00ad
            L_0x00ac:
                r11 = r9
            L_0x00ad:
                r14.writeByte(r11)
                goto L_0x0118
            L_0x00b2:
                if (r0 != r6) goto L_0x00c7
                boolean r13 = r11 instanceof java.lang.Integer
                if (r13 == 0) goto L_0x00bb
                r12 = r11
                java.lang.Integer r12 = (java.lang.Integer) r12
            L_0x00bb:
                if (r12 == 0) goto L_0x00c2
                int r11 = r12.intValue()
                goto L_0x00c3
            L_0x00c2:
                r11 = r9
            L_0x00c3:
                r14.writeInt(r11)
                goto L_0x0118
            L_0x00c7:
                if (r0 != r5) goto L_0x00dd
                boolean r13 = r11 instanceof java.lang.Long
                if (r13 == 0) goto L_0x00d0
                r12 = r11
                java.lang.Long r12 = (java.lang.Long) r12
            L_0x00d0:
                if (r12 == 0) goto L_0x00d7
                long r11 = r12.longValue()
                goto L_0x00d9
            L_0x00d7:
                r11 = 0
            L_0x00d9:
                r14.writeLong(r11)
                goto L_0x0118
            L_0x00dd:
                if (r0 != r4) goto L_0x00f2
                boolean r13 = r11 instanceof java.lang.Float
                if (r13 == 0) goto L_0x00e6
                r12 = r11
                java.lang.Float r12 = (java.lang.Float) r12
            L_0x00e6:
                if (r12 == 0) goto L_0x00ed
                float r11 = r12.floatValue()
                goto L_0x00ee
            L_0x00ed:
                r11 = 0
            L_0x00ee:
                r14.writeFloat(r11)
                goto L_0x0118
            L_0x00f2:
                if (r0 != r3) goto L_0x0108
                boolean r13 = r11 instanceof java.lang.Double
                if (r13 == 0) goto L_0x00fb
                r12 = r11
                java.lang.Double r12 = (java.lang.Double) r12
            L_0x00fb:
                if (r12 == 0) goto L_0x0102
                double r11 = r12.doubleValue()
                goto L_0x0104
            L_0x0102:
                r11 = 0
            L_0x0104:
                r14.writeDouble(r11)
                goto L_0x0118
            L_0x0108:
                if (r0 != r2) goto L_0x0118
                boolean r13 = r11 instanceof java.lang.String
                if (r13 == 0) goto L_0x0111
                r12 = r11
                java.lang.String r12 = (java.lang.String) r12
            L_0x0111:
                if (r12 != 0) goto L_0x0115
                java.lang.String r12 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"
            L_0x0115:
                r14.writeUTF(r12)
            L_0x0118:
                int r10 = r10 + 1
                goto L_0x0081
            L_0x011c:
                return
            L_0x011d:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unsupported value type "
                r0.append(r1)
                java.lang.Class r15 = r15.getClass()
                uI.d r15 = kotlin.jvm.internal.P.b(r15)
                java.lang.String r15 = r15.u()
                r0.append(r15)
                java.lang.String r15 = r0.toString()
                r14.<init>(r15)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.C7037f.b.f(java.io.DataOutputStream, java.lang.Object[]):void");
        }

        private static final void g(DataOutputStream dataOutputStream, String str, Object obj) {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else if (obj instanceof Object[]) {
                f(dataOutputStream, (Object[]) obj);
            } else {
                throw new IllegalArgumentException("Unsupported value type " + P.b(obj.getClass()).f());
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void h(DataOutputStream dataOutputStream) {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            jI.C17416c.a(r9, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            jI.C17416c.a(r9, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0082, code lost:
            throw r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.work.C7037f a(byte[] r9) {
            /*
                r8 = this;
                java.lang.String r0 = "Error in Data#fromByteArray: "
                java.lang.String r1 = "bytes"
                kotlin.jvm.internal.C17542s.j(r9, r1)
                int r1 = r9.length
                r2 = 10240(0x2800, float:1.4349E-41)
                if (r1 > r2) goto L_0x00a0
                int r1 = r9.length
                if (r1 != 0) goto L_0x0012
                androidx.work.f r9 = androidx.work.C7037f.f45197c
                return r9
            L_0x0012:
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                r2.<init>(r9)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                boolean r9 = b(r2)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                r3 = 0
                r4 = 0
                if (r9 == 0) goto L_0x0052
                java.io.ObjectInputStream r9 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                r9.<init>(r2)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                int r2 = r9.readInt()     // Catch:{ all -> 0x0042 }
            L_0x002d:
                if (r3 >= r2) goto L_0x0044
                java.lang.String r5 = r9.readUTF()     // Catch:{ all -> 0x0042 }
                java.lang.String r6 = "readUTF()"
                kotlin.jvm.internal.C17542s.i(r5, r6)     // Catch:{ all -> 0x0042 }
                java.lang.Object r6 = r9.readObject()     // Catch:{ all -> 0x0042 }
                r1.put(r5, r6)     // Catch:{ all -> 0x0042 }
                int r3 = r3 + 1
                goto L_0x002d
            L_0x0042:
                r2 = move-exception
                goto L_0x004c
            L_0x0044:
                jI.C17416c.a(r9, r4)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                goto L_0x009a
            L_0x0048:
                r9 = move-exception
                goto L_0x0083
            L_0x004a:
                r9 = move-exception
                goto L_0x008f
            L_0x004c:
                throw r2     // Catch:{ all -> 0x004d }
            L_0x004d:
                r3 = move-exception
                jI.C17416c.a(r9, r2)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                throw r3     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
            L_0x0052:
                java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                r9.<init>(r2)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                c(r9)     // Catch:{ all -> 0x0077 }
                int r2 = r9.readInt()     // Catch:{ all -> 0x0077 }
            L_0x005e:
                if (r3 >= r2) goto L_0x0079
                byte r5 = r9.readByte()     // Catch:{ all -> 0x0077 }
                java.lang.Object r5 = d(r9, r5)     // Catch:{ all -> 0x0077 }
                java.lang.String r6 = r9.readUTF()     // Catch:{ all -> 0x0077 }
                java.lang.String r7 = "key"
                kotlin.jvm.internal.C17542s.i(r6, r7)     // Catch:{ all -> 0x0077 }
                r1.put(r6, r5)     // Catch:{ all -> 0x0077 }
                int r3 = r3 + 1
                goto L_0x005e
            L_0x0077:
                r2 = move-exception
                goto L_0x007d
            L_0x0079:
                jI.C17416c.a(r9, r4)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                goto L_0x009a
            L_0x007d:
                throw r2     // Catch:{ all -> 0x007e }
            L_0x007e:
                r3 = move-exception
                jI.C17416c.a(r9, r2)     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
                throw r3     // Catch:{ IOException -> 0x004a, ClassNotFoundException -> 0x0048 }
            L_0x0083:
                java.lang.String r2 = androidx.work.C7038g.f45201a
                androidx.work.y r3 = androidx.work.C7055y.e()
                r3.d(r2, r0, r9)
                goto L_0x009a
            L_0x008f:
                java.lang.String r2 = androidx.work.C7038g.f45201a
                androidx.work.y r3 = androidx.work.C7055y.e()
                r3.d(r2, r0, r9)
            L_0x009a:
                androidx.work.f r9 = new androidx.work.f
                r9.<init>((java.util.Map<java.lang.String, ?>) r1)
                return r9
            L_0x00a0:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.C7037f.b.a(byte[]):androidx.work.f");
        }

        public final byte[] e(C7037f fVar) {
            C17542s.j(fVar, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(fVar.i());
                    for (Map.Entry entry : fVar.f45198a.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() <= 10240) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C17416c.a(dataOutputStream, (Throwable) null);
                        C17542s.i(byteArray, "{\n                ByteAr…          }\n            }");
                        return byteArray;
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (Throwable th2) {
                    C17416c.a(dataOutputStream, th);
                    throw th2;
                }
            } catch (IOException e10) {
                C7055y.e().d(C7038g.f45201a, "Error in Data#toByteArray: ", e10);
                return new byte[0];
            }
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.work.f$c */
    static final class c extends C17544u implements C17642l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f45200c = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
            C17542s.j(entry, "<name for destructuring parameter 0>");
            Object value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(entry.getKey());
            sb2.append(" : ");
            if (value instanceof Object[]) {
                value = Arrays.toString((Object[]) value);
                C17542s.i(value, "toString(this)");
            }
            sb2.append(value);
            return sb2.toString();
        }
    }

    public C7037f(C7037f fVar) {
        C17542s.j(fVar, "other");
        this.f45198a = new HashMap(fVar.f45198a);
    }

    public static final C7037f b(byte[] bArr) {
        return f45196b.a(bArr);
    }

    public static final byte[] j(C7037f fVar) {
        return f45196b.e(fVar);
    }

    public final boolean c(String str, boolean z10) {
        C17542s.j(str, "key");
        Object valueOf = Boolean.valueOf(z10);
        Object obj = this.f45198a.get(str);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final int d(String str, int i10) {
        C17542s.j(str, "key");
        Object valueOf = Integer.valueOf(i10);
        Object obj = this.f45198a.get(str);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final Map<String, Object> e() {
        Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(this.f45198a);
        C17542s.i(unmodifiableMap, "unmodifiableMap(values)");
        return unmodifiableMap;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C17542s.e(C7037f.class, obj.getClass())) {
                C7037f fVar = (C7037f) obj;
                Set<String> keySet = this.f45198a.keySet();
                if (!C17542s.e(keySet, fVar.f45198a.keySet())) {
                    return false;
                }
                for (String next : keySet) {
                    Object obj2 = this.f45198a.get(next);
                    Object obj3 = fVar.f45198a.get(next);
                    if (obj2 != null && obj3 != null) {
                        if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                z10 = C16870n.d(objArr, (Object[]) obj3);
                                continue;
                            }
                        }
                        z10 = C17542s.e(obj2, obj3);
                        continue;
                    } else if (obj2 == obj3) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final long f(String str, long j10) {
        C17542s.j(str, "key");
        Object valueOf = Long.valueOf(j10);
        Object obj = this.f45198a.get(str);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final String g(String str) {
        C17542s.j(str, "key");
        Object obj = this.f45198a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final <T> boolean h(String str, Class<T> cls) {
        C17542s.j(str, "key");
        C17542s.j(cls, "klass");
        Object obj = this.f45198a.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry next : this.f45198a.entrySet()) {
            Object value = next.getValue();
            i10 += value instanceof Object[] ? Objects.hashCode(next.getKey()) ^ C16870n.b((Object[]) value) : next.hashCode();
        }
        return i10 * 31;
    }

    public final int i() {
        return this.f45198a.size();
    }

    public String toString() {
        String str = "Data {" + C16877v.G0(this.f45198a.entrySet(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f45200c, 31, (Object) null) + "}";
        C17542s.i(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public C7037f(Map<String, ?> map) {
        C17542s.j(map, "values");
        this.f45198a = new HashMap(map);
    }
}
