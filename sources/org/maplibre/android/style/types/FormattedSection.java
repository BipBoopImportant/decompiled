package org.maplibre.android.style.types;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.HashMap;
import org.maplibre.android.utils.b;

@Keep
public class FormattedSection {
    private Number fontScale;
    private String[] fontStack;
    private String text;
    private String textColor;

    public FormattedSection(String str) {
        this(str, (Number) null, (String[]) null, (String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) obj;
        String str = this.text;
        if (str == null ? formattedSection.text != null : !str.equals(formattedSection.text)) {
            return false;
        }
        Number number = this.fontScale;
        if (number == null ? formattedSection.fontScale != null : !number.equals(formattedSection.fontScale)) {
            return false;
        }
        if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
            return false;
        }
        String str2 = this.textColor;
        String str3 = formattedSection.textColor;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Number number = this.fontScale;
        int hashCode2 = (((hashCode + (number != null ? number.hashCode() : 0)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str2 = this.textColor;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    /* access modifiers changed from: package-private */
    public Object[] toArray() {
        HashMap hashMap = new HashMap();
        hashMap.put("font-scale", this.fontScale);
        hashMap.put("text-font", this.fontStack);
        hashMap.put("text-color", this.textColor);
        return new Object[]{this.text, hashMap};
    }

    public String toString() {
        return "FormattedSection{text='" + this.text + '\'' + ", fontScale=" + this.fontScale + ", fontStack=" + Arrays.toString(this.fontStack) + ", textColor='" + this.textColor + '\'' + '}';
    }

    public FormattedSection(String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public void setTextColor(int i10) {
        this.textColor = b.a(i10);
    }

    /* access modifiers changed from: package-private */
    public void setTextColor(Object obj) {
        setTextColor((String) obj);
    }

    @Deprecated
    public FormattedSection(String str, Number number, String[] strArr) {
        this(str, number, strArr, (String) null);
    }

    @Deprecated
    public FormattedSection(String str, Number number) {
        this(str, number, (String[]) null, (String) null);
    }

    @Deprecated
    public FormattedSection(String str, String[] strArr) {
        this(str, (Number) null, strArr, (String) null);
    }
}
