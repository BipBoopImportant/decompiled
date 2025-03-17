package com.optimizely.ab.config.parser;

import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;

final class JacksonHelpers {
    private JacksonHelpers() {
    }

    static <T> List<T> arrayNodeToList(JsonNode jsonNode, Class<T> cls, ObjectCodec objectCodec) {
        if (jsonNode == null || jsonNode.isNull() || !jsonNode.isArray()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jsonNode.size());
        for (int i10 = 0; i10 < jsonNode.size(); i10++) {
            JsonNode jsonNode2 = jsonNode.get(i10);
            if (!jsonNode2.isNull()) {
                arrayList.add(objectCodec.treeToValue(jsonNode2, cls));
            }
        }
        return arrayList;
    }
}
