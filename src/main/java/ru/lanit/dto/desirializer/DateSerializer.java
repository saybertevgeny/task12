package ru.lanit.dto.desirializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateSerializer extends JsonDeserializer {

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
//        deserializationContext.handleWeirdStringValue(jsonParser,)
//        String timestampAsString = jsonParser.getText();
//        if (StringUtils.isEmpty(timestampAsString)) {
//            return null;
//        }
//        Matcher matcher = Pattern.compile("/Date\\(([0-9]+)\\)/").matcher(timestampAsString);
//        if (!matcher.find()) {
//            return null;
//        }
//        String millisecondAsString = matcher.group(1);
//        if (StringUtils.isEmpty(millisecondAsString)) {
//            return null;
//        }
        return LocalDate.now();

    }
}
