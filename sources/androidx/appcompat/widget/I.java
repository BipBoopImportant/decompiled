package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;

public interface I extends SpinnerAdapter {
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
