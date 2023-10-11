package med.vol.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.vol.api.endereco.DadosEndereco;
import med.vol.api.endereco.Endereco;

public record DadosAtualizarPacientes(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
