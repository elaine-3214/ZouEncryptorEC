import java.util.Arrays;

public class Encryptor {
    private final String alphaCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String alphaLow = "abcdefghijklmnopqrstuvwxyz";
    public String superEncryptMessage(String mess) {
        //off set 1
        String shift = "";
        String temp = "";
        for (int i = 0; i < mess.length(); i++) {
            if (mess.substring(i, i + 1) != "-"){
                int idx = alphaCap.indexOf(mess.substring(i, i + 1));
                temp = alphaCap;
                if (idx == -1) {
                    idx = alphaLow.indexOf(mess.substring(i, i + 1));
                    temp = alphaLow;
                }
                shift += temp.substring(idx + 1, idx + 2);
            } else {
                shift += " ";
            }
        }
        return shift;
//        String[][] encrypt = new String[3][5];
    }
}
