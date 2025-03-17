package org.maplibre.android.utils;

import androidx.annotation.Keep;
import java.text.Normalizer;

@Keep
class StringUtils {
    StringUtils() {
    }

    @Keep
    static String unaccent(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("(\\p{InCombiningDiacriticalMarks}|\\p{InCombiningDiacriticalMarksForSymbols}|\\p{InCombiningDiacriticalMarksSupplement})+", "");
    }
}
