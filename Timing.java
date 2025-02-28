public class Timing {
    static final private String command = "shutdown -s -f -t ";

    public static String shutTime(char what, int s, int m, int h){
        if(s < 0 || m < 0 || h < 0)
            return null;
        what =  Character.toLowerCase(what);
        switch (what) {
            case 's':
                return (String) (command + s);
            case 'm':
                return (String) (command + (s + (m*60)));
            case 'h':
                return (String) (command + (s + (m*60) + (h * 3600)));
            default:
                return null;
        }
    }
}
