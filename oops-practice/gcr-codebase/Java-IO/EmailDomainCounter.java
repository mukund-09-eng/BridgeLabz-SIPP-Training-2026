import java.io.*;
import java.util.HashMap;

public class EmailDomainCounter {

    public static void main(String[] args) {

        HashMap<String, Integer> domainCount =
                new HashMap<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("emails.txt"));

            String email;

            while ((email = br.readLine()) != null) {

                String domain =
                        email.substring(
                                email.indexOf("@") + 1);

                domainCount.put(
                        domain,
                        domainCount.getOrDefault(
                                domain, 0) + 1);
            }

            br.close();

            System.out.println("Domain Usage:");

            for (String domain :
                    domainCount.keySet()) {

                System.out.println(
                        domain + " = "
                                + domainCount.get(domain));
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
