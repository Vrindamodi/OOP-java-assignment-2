import java.util.Scanner;

class DomainExtractor {

    public String extractDomain(String url) {
        String domain = url;

        if (domain.startsWith("https://")) {
            domain = domain.substring(8);
        } else if (domain.startsWith("http://")) {
            domain = domain.substring(7);
        }

        int slashIndex = domain.indexOf("/");
        if (slashIndex != -1) {
            domain = domain.substring(0, slashIndex);
        }

        if (domain.startsWith("www.")) {
            domain = domain.substring(4);
        }

        String[] parts = domain.split("\\.");
        if (parts.length > 2) {
            domain = parts[parts.length - 2] + "." + parts[parts.length - 1];
        }

        return domain;
    }
}

class Q10Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = sc.nextLine();
        DomainExtractor extractor = new DomainExtractor();
        String domain = extractor.extractDomain(url);
        System.out.println("Domain: " + domain);
        sc.close();
    }
}
