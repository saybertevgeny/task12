package ru.lanit.dto.desirializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import ru.lanit.dto.CarModel;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModelDeserialize extends JsonDeserializer {

    @Override
    public CarModel deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        String data = jsonParser.getText().trim();
        Matcher matcher = Pattern.compile("^([A-z0-9_]+)-([A-z0-9_]+)$").matcher(data);

        if(!matcher.find()){
            context.handleUnexpectedToken(this.getClass(),jsonParser);
            return null;
        }

        String model = matcher.group(1);
        String vendor = matcher.group(2);
        return new CarModel(model,vendor);
    }
}
