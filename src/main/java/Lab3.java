        import java.io.IOException;
        import java.net.URL;
        import java.util.Scanner;
public class Lab3 {
 /**
         * Retrieve contents from a URL and return them as a string.
         *
         * @param url url to retrieve contents from
         * @return the contents from the url as a string, or an empty string on error
         */
        public static String urlToString(final String url) {
            Scanner urlScanner;
            try {
                urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
            } catch (IOException e) {
                return "";
            }
            String contents = urlScanner.useDelimiter("\\A").next();
            urlScanner.close();
            return contents;
        }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt").length());
//System.out.println(urlToString("https://www.bls.gov/tus/charts/chart9.txt").length());
//System.out.println(urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt").length());

int count = 0;
String str = urlToString("http://erdani.com/tdpl/hamlet.txt");
String word = "prince";
int name = word.length();

for (int i = 0; i <= str.length() - name; i++) {
    if (word.equalsIgnoreCase(str.substring(i, i + name))) {
        count++;
        i += name;
    }
}
System.out.println(count);
    }

}
