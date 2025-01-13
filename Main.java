public class Main {
    public static void main(String[] args) {
        // Map’as DnsProvider -> DnsServer
        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer("1.1.1.1", "1.0.0.1"));

        // Map’as String -> String
        Mapas<String, String> stringMapas = new Mapas<>();
        stringMapas.ideti("Vardas", "Jonas");
        stringMapas.ideti("Miestas", "Vilnius");

        // Testavimas
        System.out.println("DnsServer pagal GOOGLE: " + dnsMapas.gauti(DnsProvider.GOOGLE));
        System.out.println("Miestas pagal raktą 'Miestas': " + stringMapas.gauti("Miestas"));
    }
}
