package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    private static void booleanArrayAppend(StringBuilder sb2, boolean[] zArr) {
        sb2.append('[');
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(zArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void byteArrayAppend(StringBuilder sb2, byte[] bArr) {
        sb2.append('[');
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(bArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void charArrayAppend(StringBuilder sb2, char[] cArr) {
        sb2.append('[');
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(cArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void deeplyAppendParameter(StringBuilder sb2, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb2.append("null");
        } else if (!obj.getClass().isArray()) {
            safeObjectAppend(sb2, obj);
        } else if (obj instanceof boolean[]) {
            booleanArrayAppend(sb2, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            byteArrayAppend(sb2, (byte[]) obj);
        } else if (obj instanceof char[]) {
            charArrayAppend(sb2, (char[]) obj);
        } else if (obj instanceof short[]) {
            shortArrayAppend(sb2, (short[]) obj);
        } else if (obj instanceof int[]) {
            intArrayAppend(sb2, (int[]) obj);
        } else if (obj instanceof long[]) {
            longArrayAppend(sb2, (long[]) obj);
        } else if (obj instanceof float[]) {
            floatArrayAppend(sb2, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb2, (double[]) obj);
        } else {
            objectArrayAppend(sb2, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb2, double[] dArr) {
        sb2.append('[');
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(dArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void floatArrayAppend(StringBuilder sb2, float[] fArr) {
        sb2.append('[');
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(fArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th2 = objArr[objArr.length - 1];
            if (th2 instanceof Throwable) {
                return th2;
            }
        }
        return null;
    }

    private static void intArrayAppend(StringBuilder sb2, int[] iArr) {
        sb2.append('[');
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(iArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    static final boolean isDoubleEscaped(String str, int i10) {
        return i10 >= 2 && str.charAt(i10 - 2) == '\\';
    }

    static final boolean isEscapedDelimeter(String str, int i10) {
        return i10 != 0 && str.charAt(i10 - 1) == '\\';
    }

    private static void longArrayAppend(StringBuilder sb2, long[] jArr) {
        sb2.append('[');
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(jArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void objectArrayAppend(StringBuilder sb2, Object[] objArr, Map<Object[], Object> map) {
        sb2.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, (Object) null);
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                deeplyAppendParameter(sb2, objArr[i10], map);
                if (i10 != length - 1) {
                    sb2.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb2.append("...");
        }
        sb2.append(']');
    }

    private static void safeObjectAppend(StringBuilder sb2, Object obj) {
        try {
            sb2.append(obj.toString());
        } catch (Throwable th2) {
            Util.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th2);
            sb2.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb2, short[] sArr) {
        sb2.append('[');
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(sArr[i10]);
            if (i10 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        return objArr2;
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th2) {
        int i10;
        if (str == null) {
            return new FormattingTuple((String) null, objArr, th2);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 50);
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            int indexOf = str.indexOf(DELIM_STR, i12);
            if (indexOf != -1) {
                if (!isEscapedDelimeter(str, indexOf)) {
                    sb2.append(str, i12, indexOf);
                    deeplyAppendParameter(sb2, objArr[i11], new HashMap());
                    i10 = indexOf + 2;
                } else if (!isDoubleEscaped(str, indexOf)) {
                    i11--;
                    sb2.append(str, i12, indexOf - 1);
                    sb2.append(DELIM_START);
                    i10 = indexOf + 1;
                } else {
                    sb2.append(str, i12, indexOf - 1);
                    deeplyAppendParameter(sb2, objArr[i11], new HashMap());
                    i10 = indexOf + 2;
                }
                i12 = i10;
                i11++;
            } else if (i12 == 0) {
                return new FormattingTuple(str, objArr, th2);
            } else {
                sb2.append(str, i12, str.length());
                return new FormattingTuple(sb2.toString(), objArr, th2);
            }
        }
        sb2.append(str, i12, str.length());
        return new FormattingTuple(sb2.toString(), objArr, th2);
    }
}
