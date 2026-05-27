import java.util.*;

public class Codec {

    // Encode list of strings into one string
    public String encode(List<String> strs) {

        // If list empty
        if(strs.size() == 0) {
            return Character.toString((char)258);
        }

        // Special separator
        String separate = Character.toString((char)257);

        StringBuilder sb = new StringBuilder();

        // Add all strings with separator
        for(String s : strs) {

            sb.append(s);

            sb.append(separate);
        }

        // Remove last separator
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    // Decode single string into list
    public List<String> decode(String s) {

        // Empty list case
        if(s.equals(Character.toString((char)258))) {

            return new ArrayList<>();
        }

        // Same separator
        String separate = Character.toString((char)257);

        // Split string and return list
        return Arrays.asList(s.split(separate, -1));
    }

    public static void main(String[] args) {

        Codec obj = new Codec();

        List<String> strs = Arrays.asList("abc", "cat", "dog");

        // Encode
        String encoded = obj.encode(strs);

        System.out.println("Encoded: " + encoded);

        // Decode
        List<String> decoded = obj.decode(encoded);

        System.out.println("Decoded: " + decoded);
    }
}
