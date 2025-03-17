package z2;

import I2.C4599b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* renamed from: z2.b  reason: case insensitive filesystem */
public interface C6276b extends MenuItem {
    C4599b a();

    C6276b b(C4599b bVar);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i10);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c10, int i10);

    C6276b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c10, int i10);

    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    void setShowAsAction(int i10);

    MenuItem setShowAsActionFlags(int i10);

    C6276b setTooltipText(CharSequence charSequence);
}
