public class TesteReferencia {

    public static void main(String[] args) {

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        Gerente gerente = new Gerente();
        EditorVideo editorVideo = new EditorVideo();

        gerente.setNome("Leandro");
        gerente.setSalario(5000.0);

        editorVideo.setSalario(2500);

        controleBonificacao.registra(gerente);
        controleBonificacao.registra(editorVideo);

        System.out.println(controleBonificacao.getSoma());

    }
}
