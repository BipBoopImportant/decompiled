package O4;

import YH.C16870n;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import jI.C17416c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0001\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroid/database/Cursor;", "c", "a", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", "name", "", "(Landroid/database/Cursor;Ljava/lang/String;)I", "d", "cursor", "b", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final Cursor a(Cursor cursor) {
        C17542s.j(cursor, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = cursor.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor.getString(i10);
                    } else if (type == 4) {
                        objArr[i10] = cursor.getBlob(i10);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            C17416c.a(cursor, (Throwable) null);
            return matrixCursor;
        } catch (Throwable th2) {
            C17416c.a(cursor, th);
            throw th2;
        }
    }

    private static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor cursor, String str) {
        C17542s.j(cursor, "c");
        C17542s.j(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static final int d(Cursor cursor, String str) {
        String str2;
        C17542s.j(cursor, "c");
        C17542s.j(str, "name");
        int c10 = c(cursor, str);
        if (c10 >= 0) {
            return c10;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C17542s.i(columnNames, "c.columnNames");
            str2 = C16870n.C0(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
