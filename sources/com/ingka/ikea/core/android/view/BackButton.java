package com.ingka.ikea.core.android.view;

import Oo.b;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/core/android/view/BackButton;", "", "resId", "", "contentDescriptionId", "<init>", "(Ljava/lang/String;III)V", "getResId", "()I", "getContentDescriptionId", "CLOSE", "BACK", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public enum BackButton {
    CLOSE(C18146a.f148097J2, b.f84665i),
    BACK(C18146a.f148719y, b.f84632f);
    
    private final int contentDescriptionId;
    private final int resId;

    static {
        BackButton[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private BackButton(int i10, int i11) {
        this.resId = i10;
        this.contentDescriptionId = i11;
    }

    public static C17220a<BackButton> getEntries() {
        return $ENTRIES;
    }

    public final int getContentDescriptionId() {
        return this.contentDescriptionId;
    }

    public final int getResId() {
        return this.resId;
    }
}
