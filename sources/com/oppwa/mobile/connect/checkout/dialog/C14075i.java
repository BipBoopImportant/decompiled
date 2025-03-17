package com.oppwa.mobile.connect.checkout.dialog;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.i  reason: case insensitive filesystem */
class C14075i implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Integer> f121253a = new HashSet(Arrays.asList(new Integer[]{16908322, 16908319}));

    C14075i() {
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        for (int size = menu.size() - 1; size >= 0; size--) {
            MenuItem item = menu.getItem(size);
            if (!f121253a.contains(Integer.valueOf(item.getItemId()))) {
                menu.removeItem(item.getItemId());
            }
        }
        return true;
    }
}
