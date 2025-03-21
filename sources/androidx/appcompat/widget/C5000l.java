package androidx.appcompat.widget;

import I2.C4600b0;
import I2.C4603d;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.l  reason: case insensitive filesystem */
final class C5000l {

    /* renamed from: androidx.appcompat.widget.l$a */
    private static final class a {
        /* JADX INFO: finally extract failed */
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C4600b0.e0(textView, new C4603d.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th2) {
                textView.endBatchEdit();
                throw th2;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C4600b0.e0(view, new C4603d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static boolean a(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C4600b0.C(view) != null) {
            Activity c10 = c(view);
            if (c10 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? a.a(dragEvent, (TextView) view, c10) : a.b(dragEvent, view, c10);
                }
            }
        }
        return false;
    }

    static boolean b(TextView textView, int i10) {
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C4600b0.C(textView) == null || (i10 != 16908322 && i10 != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C4603d.a aVar = new C4603d.a(primaryClip, 1);
            if (i10 != 16908322) {
                i11 = 1;
            }
            C4600b0.e0(textView, aVar.c(i11).a());
        }
        return true;
    }

    static Activity c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
