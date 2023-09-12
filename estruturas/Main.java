public class Main {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        // Adicionando elementos ao mapa
        mapa.put("um", 1);
        mapa.put("dois", 2);
        mapa.put("três", 3);

        // Obtendo valores do mapa
        System.out.println("Valor de 'um': " + mapa.get("um"));
        System.out.println("Valor de 'dois': " + mapa.get("dois"));
        System.out.println("Valor de 'três': " + mapa.get("três"));
        System.out.println("Valor de 'quatro': " + mapa.get("quatro")); // Deverá imprimir 'null'

        // Verificando se o mapa contém uma chave
        System.out.println("Contém chave 'um'? " + mapa.containsKey("um"));
        System.out.println("Contém chave 'cinco'? " + mapa.containsKey("cinco"));

        // Tamanho do mapa
        System.out.println("Tamanho do mapa: " + mapa.size());

        // Removendo um elemento do mapa
        mapa.remove("dois");
        System.out.println("Tamanho do mapa após remover 'dois': " + mapa.size());
    }
}
