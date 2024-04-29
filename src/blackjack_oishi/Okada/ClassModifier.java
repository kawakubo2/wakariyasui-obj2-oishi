package blackjack_oishi.Okada;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassModifier {
    static final String CLASS = "class=\"";
    public String modifyClass(String line, String[] classes) {
        int classOpenIndex = line.indexOf(CLASS) + CLASS.length();
        int classCloseIndex = line.indexOf("\"", classOpenIndex + 1);
        String classStr = line.substring(classOpenIndex, classCloseIndex);
        Set<String> classSet = new LinkedHashSet<>();
        classSet.addAll(Arrays.asList(classStr.split(" ")));
        for (String clazz: classes) {
            classSet.add(clazz);
        }
        String classNewStr = String.join(" ", classSet);
        String preString = line.substring(0, classOpenIndex);
        String postString = line.substring(classCloseIndex);
        return preString + classNewStr + postString;
    }
    
}
