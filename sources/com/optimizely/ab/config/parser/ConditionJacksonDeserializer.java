package com.optimizely.ab.config.parser;

import FE.C12874f;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.optimizely.ab.config.audience.AndCondition;
import com.optimizely.ab.config.audience.AudienceIdCondition;
import com.optimizely.ab.config.audience.Condition;
import com.optimizely.ab.config.audience.EmptyCondition;
import com.optimizely.ab.config.audience.NotCondition;
import com.optimizely.ab.config.audience.NullCondition;
import com.optimizely.ab.config.audience.OrCondition;
import com.optimizely.ab.config.audience.UserAttribute;
import java.util.ArrayList;

public class ConditionJacksonDeserializer extends JsonDeserializer<Condition> {
    private ObjectMapper objectMapper;

    public ConditionJacksonDeserializer() {
        this(new ObjectMapper());
    }

    private static String operand(JsonNode jsonNode) {
        if (jsonNode == null || !jsonNode.isTextual()) {
            return null;
        }
        String asText = jsonNode.asText();
        asText.hashCode();
        char c10 = 65535;
        switch (asText.hashCode()) {
            case 3555:
                if (asText.equals("or")) {
                    c10 = 0;
                    break;
                }
                break;
            case 96727:
                if (asText.equals("and")) {
                    c10 = 1;
                    break;
                }
                break;
            case 109267:
                if (asText.equals("not")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return asText;
            default:
                return null;
        }
    }

    protected static <T> Condition parseCondition(Class<T> cls, ObjectMapper objectMapper2, JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            return parseConditions(cls, objectMapper2, jsonNode);
        }
        if (jsonNode.isTextual()) {
            Class<AudienceIdCondition> cls2 = AudienceIdCondition.class;
            if (cls == cls2) {
                return (Condition) objectMapper2.treeToValue(jsonNode, cls2);
            }
            throw new C12874f(String.format("Expected AudienceIdCondition got %s", new Object[]{cls.getCanonicalName()}));
        } else if (!jsonNode.isObject()) {
            return null;
        } else {
            Class<UserAttribute> cls3 = UserAttribute.class;
            if (cls == cls3) {
                return (Condition) objectMapper2.treeToValue(jsonNode, cls3);
            }
            throw new C12874f(String.format("Expected UserAttributes got %s", new Object[]{cls.getCanonicalName()}));
        }
    }

    protected static <T> Condition parseConditions(Class<T> cls, ObjectMapper objectMapper2, JsonNode jsonNode) {
        int i10;
        if (jsonNode.isArray() && jsonNode.size() == 0) {
            return new EmptyCondition();
        }
        ArrayList arrayList = new ArrayList();
        String operand = operand(jsonNode.get(0));
        if (operand == null) {
            operand = "or";
            i10 = 0;
        } else {
            i10 = 1;
        }
        while (i10 < jsonNode.size()) {
            arrayList.add(parseCondition(cls, objectMapper2, jsonNode.get(i10)));
            i10++;
        }
        if (operand.equals("and")) {
            return new AndCondition(arrayList);
        }
        if (!operand.equals("not")) {
            return new OrCondition(arrayList);
        }
        return new NotCondition(arrayList.isEmpty() ? new NullCondition() : (Condition) arrayList.get(0));
    }

    ConditionJacksonDeserializer(ObjectMapper objectMapper2) {
        this.objectMapper = objectMapper2;
    }

    public Condition deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return parseCondition(AudienceIdCondition.class, this.objectMapper, jsonParser.getCodec().readTree(jsonParser));
    }
}
