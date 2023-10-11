package med.vol.api.paciente;

public record DadosListagemPaciente(String nome, String email, String cpf, Long id) {

    public DadosListagemPaciente (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getId());
    }

}
