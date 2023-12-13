public class LicenseKeyFormat {
    public static void main(String[] args) {
        System.out.println(LicenseKeyFormat.format("5F3Z-2e-9-w", 4L));
        System.out.println(LicenseKeyFormat.format("2-5g-3-J", 2L));

        System.out.println(LicenseKeyFormat.format("5F3Z-2e-9-w", 3L));
        System.out.println(LicenseKeyFormat.format("5F3Z-2e-9-w", 5L));
        System.out.println(LicenseKeyFormat.format("2-5g-3-J", 3L));
        System.out.println(LicenseKeyFormat.format("2-5g-3-J", 4L));
    }

    private static String format(String s, Long k) {
        String sFormat = s.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder().append(sFormat).reverse();
        StringBuilder result = new StringBuilder();

        int index = 0;

        for (int i = 0; i < sb.length(); i++) {
            if(index < k) {
                result.append(sb.charAt(i));
                index++;
            }
            else {
                result.append("-").append(sb.charAt(i));
                index = 1;
            }
        }

        return result.reverse().toString().toUpperCase();
    }
}