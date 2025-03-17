package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;

public class j extends f {
    public j(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        l lVar = new l(w(), this, hVar);
        hVar.x(lVar);
        return lVar;
    }
}
