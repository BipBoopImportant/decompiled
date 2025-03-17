package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new p(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i10) {
        if (dialog instanceof p) {
            p pVar = (p) dialog;
            if (!(i10 == 1 || i10 == 2)) {
                if (i10 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            pVar.i(1);
            return;
        }
        super.setupDialog(dialog, i10);
    }
}
