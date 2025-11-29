package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistry {
    private static final Map<String, EmailTemplate> templates = new HashMap<>();

    static {
        templates.put("welcome", new WelcomeEmail());
        // Add more like "discount", "feature-update" etc
    }

    public static EmailTemplate getTemplate(String type){
        return templates.get(type).clone();
    }
}
