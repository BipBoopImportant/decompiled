package YH;

import XH.C16798E;
import XH.C16800G;
import XH.C16802I;
import XH.C16805L;
import aI.C17027a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "other", "", "d", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: YH.p  reason: case insensitive filesystem */
class C16872p extends C16871o {
    public static <T> boolean d(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            T t10 = tArr[i10];
            T t11 = tArr2[i10];
            if (t10 != t11) {
                if (t10 == null || t11 == null) {
                    return false;
                }
                if (!(t10 instanceof Object[]) || !(t11 instanceof Object[])) {
                    if (!(t10 instanceof byte[]) || !(t11 instanceof byte[])) {
                        if (!(t10 instanceof short[]) || !(t11 instanceof short[])) {
                            if (!(t10 instanceof int[]) || !(t11 instanceof int[])) {
                                if (!(t10 instanceof long[]) || !(t11 instanceof long[])) {
                                    if (!(t10 instanceof float[]) || !(t11 instanceof float[])) {
                                        if (!(t10 instanceof double[]) || !(t11 instanceof double[])) {
                                            if (!(t10 instanceof char[]) || !(t11 instanceof char[])) {
                                                if (!(t10 instanceof boolean[]) || !(t11 instanceof boolean[])) {
                                                    if (!(t10 instanceof C16798E) || !(t11 instanceof C16798E)) {
                                                        if (!(t10 instanceof C16805L) || !(t11 instanceof C16805L)) {
                                                            if (!(t10 instanceof C16800G) || !(t11 instanceof C16800G)) {
                                                                if (!(t10 instanceof C16802I) || !(t11 instanceof C16802I)) {
                                                                    if (!C17542s.e(t10, t11)) {
                                                                        return false;
                                                                    }
                                                                } else if (!C17027a.d(((C16802I) t10).F(), ((C16802I) t11).F())) {
                                                                    return false;
                                                                }
                                                            } else if (!C17027a.b(((C16800G) t10).F(), ((C16800G) t11).F())) {
                                                                return false;
                                                            }
                                                        } else if (!C17027a.a(((C16805L) t10).F(), ((C16805L) t11).F())) {
                                                            return false;
                                                        }
                                                    } else if (!C17027a.c(((C16798E) t10).F(), ((C16798E) t11).F())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t10, (boolean[]) t11)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t10, (char[]) t11)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t10, (double[]) t11)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t10, (float[]) t11)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t10, (long[]) t11)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t10, (int[]) t11)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t10, (short[]) t11)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t10, (byte[]) t11)) {
                        return false;
                    }
                } else if (!C16870n.d((Object[]) t10, (Object[]) t11)) {
                    return false;
                }
            }
        }
        return true;
    }
}
