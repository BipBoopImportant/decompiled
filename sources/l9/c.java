package L9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    private static void A(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    private static void B(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void C(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return z(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        A(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z10) {
        B(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            B(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle != null) {
            int z11 = z(parcel, i10);
            parcel.writeBundle(bundle);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void f(Parcel parcel, int i10, byte b10) {
        B(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void g(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr != null) {
            int z11 = z(parcel, i10);
            parcel.writeByteArray(bArr);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void h(Parcel parcel, int i10, byte[][] bArr, boolean z10) {
        if (bArr != null) {
            int z11 = z(parcel, i10);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void i(Parcel parcel, int i10, double d10) {
        B(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void j(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            B(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void k(Parcel parcel, int i10, float f10) {
        B(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void l(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            B(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void m(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder != null) {
            int z11 = z(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void n(Parcel parcel, int i10, int i11) {
        B(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void o(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr != null) {
            int z11 = z(parcel, i10);
            parcel.writeIntArray(iArr);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void p(Parcel parcel, int i10, List<Integer> list, boolean z10) {
        if (list != null) {
            int z11 = z(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(list.get(i11).intValue());
            }
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void q(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            B(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void r(Parcel parcel, int i10, long j10) {
        B(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void s(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            B(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void t(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable != null) {
            int z11 = z(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void u(Parcel parcel, int i10, String str, boolean z10) {
        if (str != null) {
            int z11 = z(parcel, i10);
            parcel.writeString(str);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void v(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr != null) {
            int z11 = z(parcel, i10);
            parcel.writeStringArray(strArr);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static void w(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list != null) {
            int z11 = z(parcel, i10);
            parcel.writeStringList(list);
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr != null) {
            int z11 = z(parcel, i10);
            parcel.writeInt(r7);
            for (T t10 : tArr) {
                if (t10 == null) {
                    parcel.writeInt(0);
                } else {
                    C(parcel, t10, i11);
                }
            }
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void y(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list != null) {
            int z11 = z(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C(parcel, parcelable, 0);
                }
            }
            A(parcel, z11);
        } else if (z10) {
            B(parcel, i10, 0);
        }
    }

    private static int z(Parcel parcel, int i10) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
}
