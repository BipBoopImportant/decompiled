package V9;

import T9.b;
import android.os.IInterface;

public interface f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i10);

    int getIntFlagValue(String str, int i10, int i11);

    long getLongFlagValue(String str, long j10, int i10);

    String getStringFlagValue(String str, String str2, int i10);

    void init(b bVar);
}
